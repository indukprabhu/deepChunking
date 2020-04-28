/*************************************************/
/* START of RectRegion */
#include <x10/regionarray/RectRegion.h>

#include <x10/regionarray/Region.h>
#include <x10/lang/Long.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/IllegalArgumentException.h>
#include <x10/compiler/Inline.h>
#include <x10/regionarray/UnboundedRegionException.h>
#include <x10/lang/Point.h>
#include <x10/lang/ArrayIndexOutOfBoundsException.h>
#include <x10/lang/String.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/regionarray/RectRegion1D.h>
#include <x10/lang/Int.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/ULong.h>
#include <x10/regionarray/FullRegion.h>
#include <x10/regionarray/EmptyRegion.h>
#include <x10/lang/Iterator.h>
#include <x10/regionarray/RectRegion__RRIterator.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return saved_this->x10::regionarray::RectRegion::min(i);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__1* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__1>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_saved_this = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__1* this_ = new (storage) x10_regionarray_RectRegion__closure__1(that_saved_this);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__1(::x10::regionarray::RectRegion* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:223";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__1_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__2_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return saved_this->x10::regionarray::RectRegion::max(i);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__2* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__2>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_saved_this = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__2* this_ = new (storage) x10_regionarray_RectRegion__closure__2(that_saved_this);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__2(::x10::regionarray::RectRegion* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:224";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__2_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__3_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i__116503) {
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::nullCheck(this__116504)->x10::regionarray::RectRegion::min(
                 i__116503);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* this__116504;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->this__116504);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__3* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__3>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_this__116504 = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__3* this_ = new (storage) x10_regionarray_RectRegion__closure__3(that_this__116504);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__3(::x10::regionarray::RectRegion* this__116504) : this__116504(this__116504) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:223";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__3_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__4_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__4 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__4> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i__116505) {
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::nullCheck(this__116506)->x10::regionarray::RectRegion::max(
                 i__116505);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* this__116506;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->this__116506);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__4* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__4>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_this__116506 = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__4* this_ = new (storage) x10_regionarray_RectRegion__closure__4(that_this__116506);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__4(::x10::regionarray::RectRegion* this__116506) : this__116506(this__116506) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:224";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__4_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__5_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__5 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__5> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return saved_this->x10::regionarray::RectRegion::min(i);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__5* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__5>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_saved_this = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__5* this_ = new (storage) x10_regionarray_RectRegion__closure__5(that_saved_this);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__5(::x10::regionarray::RectRegion* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:310";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__5_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__6_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__6_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__6 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__6> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        
        //#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return saved_this->x10::regionarray::RectRegion::max(i);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__6* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__6>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_saved_this = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__6* this_ = new (storage) x10_regionarray_RectRegion__closure__6(that_saved_this);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__6(::x10::regionarray::RectRegion* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:311";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__6_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__7_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__7_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__7 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__7> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i__116509) {
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::nullCheck(this__116510)->x10::regionarray::RectRegion::min(
                 i__116509);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* this__116510;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->this__116510);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__7* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__7>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_this__116510 = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__7* this_ = new (storage) x10_regionarray_RectRegion__closure__7(that_this__116510);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__7(::x10::regionarray::RectRegion* this__116510) : this__116510(this__116510) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:223";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__7_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__8_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__8_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__8 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__8> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i__116511) {
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::nullCheck(this__116512)->x10::regionarray::RectRegion::max(
                 i__116511);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* this__116512;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->this__116512);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__8* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__8>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_this__116512 = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__8* this_ = new (storage) x10_regionarray_RectRegion__closure__8(that_this__116512);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__8(::x10::regionarray::RectRegion* this__116512) : this__116512(this__116512) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:224";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__8_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__9_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__9_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__9 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__9> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        
        //#line 374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        x10_long a__116590 = saved_this->x10::regionarray::RectRegion::min(
                               i);
        x10_long b__116591 = ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(thatMin), 
          i);
        
        //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ((a__116590) < (b__116591)) ? (b__116591) : (a__116590);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* saved_this;
    ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMin;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->thatMin);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__9* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__9>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_saved_this = buf.read< ::x10::regionarray::RectRegion*>();
        ::x10::lang::Fun_0_1<x10_long, x10_long>* that_thatMin = buf.read< ::x10::lang::Fun_0_1<x10_long, x10_long>*>();
        x10_regionarray_RectRegion__closure__9* this_ = new (storage) x10_regionarray_RectRegion__closure__9(that_saved_this, that_thatMin);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__9(::x10::regionarray::RectRegion* saved_this, ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMin) : saved_this(saved_this), thatMin(thatMin) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:325";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__9_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__10_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__10_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__10 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__10> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        
        //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        x10_long a__116592 = saved_this->x10::regionarray::RectRegion::max(
                               i);
        x10_long b__116593 = ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(thatMax), 
          i);
        
        //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ((a__116592) < (b__116593)) ? (a__116592) : (b__116593);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* saved_this;
    ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMax;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->thatMax);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__10* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__10>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_saved_this = buf.read< ::x10::regionarray::RectRegion*>();
        ::x10::lang::Fun_0_1<x10_long, x10_long>* that_thatMax = buf.read< ::x10::lang::Fun_0_1<x10_long, x10_long>*>();
        x10_regionarray_RectRegion__closure__10* this_ = new (storage) x10_regionarray_RectRegion__closure__10(that_saved_this, that_thatMax);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__10(::x10::regionarray::RectRegion* saved_this, ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMax) : saved_this(saved_this), thatMax(thatMax) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:326";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__10_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__11_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__11_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__11 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__11> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i__116527) {
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::nullCheck(this__116528)->x10::regionarray::RectRegion::min(
                 i__116527);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* this__116528;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->this__116528);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__11* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__11>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_this__116528 = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__11* this_ = new (storage) x10_regionarray_RectRegion__closure__11(that_this__116528);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__11(::x10::regionarray::RectRegion* this__116528) : this__116528(this__116528) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:223";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__11_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__12_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__12_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__12 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__12> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i__116529) {
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::nullCheck(this__116530)->x10::regionarray::RectRegion::max(
                 i__116529);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* this__116530;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->this__116530);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__12* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__12>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_this__116530 = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__12* this_ = new (storage) x10_regionarray_RectRegion__closure__12(that_this__116530);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__12(::x10::regionarray::RectRegion* this__116530) : this__116530(this__116530) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:224";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__12_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__13_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__13_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__13 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__13> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((i) < (saved_this->FMGL(rank))) ? (saved_this->x10::regionarray::RectRegion::min(
                                                     i)) : (::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(thatMin), 
                                                              ((i) - (saved_this->FMGL(rank)))));
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* saved_this;
    ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMin;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->thatMin);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__13* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__13>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_saved_this = buf.read< ::x10::regionarray::RectRegion*>();
        ::x10::lang::Fun_0_1<x10_long, x10_long>* that_thatMin = buf.read< ::x10::lang::Fun_0_1<x10_long, x10_long>*>();
        x10_regionarray_RectRegion__closure__13* this_ = new (storage) x10_regionarray_RectRegion__closure__13(that_saved_this, that_thatMin);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__13(::x10::regionarray::RectRegion* saved_this, ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMin) : saved_this(saved_this), thatMin(thatMin) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:351";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__13_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__14_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__14_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__14 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__14> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((i) < (saved_this->FMGL(rank))) ? (saved_this->x10::regionarray::RectRegion::max(
                                                     i)) : (::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(thatMax), 
                                                              ((i) - (saved_this->FMGL(rank)))));
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* saved_this;
    ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMax;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->thatMax);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__14* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__14>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_saved_this = buf.read< ::x10::regionarray::RectRegion*>();
        ::x10::lang::Fun_0_1<x10_long, x10_long>* that_thatMax = buf.read< ::x10::lang::Fun_0_1<x10_long, x10_long>*>();
        x10_regionarray_RectRegion__closure__14* this_ = new (storage) x10_regionarray_RectRegion__closure__14(that_saved_this, that_thatMax);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__14(::x10::regionarray::RectRegion* saved_this, ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMax) : saved_this(saved_this), thatMax(thatMax) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:352";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__14_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__15_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__15_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__15 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__15> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((i) < (saved_this->FMGL(rank))) ? (saved_this->x10::regionarray::RectRegion::min(
                                                     i)) : (thatMin);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* saved_this;
    x10_long thatMin;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->thatMin);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__15* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__15>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_saved_this = buf.read< ::x10::regionarray::RectRegion*>();
        x10_long that_thatMin = buf.read<x10_long>();
        x10_regionarray_RectRegion__closure__15* this_ = new (storage) x10_regionarray_RectRegion__closure__15(that_saved_this, that_thatMin);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__15(::x10::regionarray::RectRegion* saved_this, x10_long thatMin) : saved_this(saved_this), thatMin(thatMin) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:358";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__15_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__16_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__16_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__16 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__16> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((i) < (saved_this->FMGL(rank))) ? (saved_this->x10::regionarray::RectRegion::max(
                                                     i)) : (thatMax);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* saved_this;
    x10_long thatMax;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->thatMax);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__16* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__16>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_saved_this = buf.read< ::x10::regionarray::RectRegion*>();
        x10_long that_thatMax = buf.read<x10_long>();
        x10_regionarray_RectRegion__closure__16* this_ = new (storage) x10_regionarray_RectRegion__closure__16(that_saved_this, that_thatMax);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__16(::x10::regionarray::RectRegion* saved_this, x10_long thatMax) : saved_this(saved_this), thatMax(thatMax) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:359";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__16_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__17_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__17_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__17 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__17> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((i) < (saved_this->FMGL(rank))) ? (saved_this->x10::regionarray::RectRegion::min(
                                                     i)) : ((x10_long)0x8000000000000000LL);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__17* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__17>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_saved_this = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__17* this_ = new (storage) x10_regionarray_RectRegion__closure__17(that_saved_this);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__17(::x10::regionarray::RectRegion* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:363";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__17_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__18_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__18_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__18 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__18> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((i) < (saved_this->FMGL(rank))) ? (saved_this->x10::regionarray::RectRegion::max(
                                                     i)) : ((x10_long)0x7fffffffffffffffLL);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__18* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__18>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_saved_this = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__18* this_ = new (storage) x10_regionarray_RectRegion__closure__18(that_saved_this);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__18(::x10::regionarray::RectRegion* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:364";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__18_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__19_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__19_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__19 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__19> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((saved_this->x10::regionarray::RectRegion::min(i)) + (::x10aux::nullCheck(v)->x10::lang::Point::__apply(
                                                                        i)));
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* saved_this;
    ::x10::lang::Point* v;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->v);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__19* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__19>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_saved_this = buf.read< ::x10::regionarray::RectRegion*>();
        ::x10::lang::Point* that_v = buf.read< ::x10::lang::Point*>();
        x10_regionarray_RectRegion__closure__19* this_ = new (storage) x10_regionarray_RectRegion__closure__19(that_saved_this, that_v);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__19(::x10::regionarray::RectRegion* saved_this, ::x10::lang::Point* v) : saved_this(saved_this), v(v) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:372";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__19_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__20_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__20_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__20 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__20> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((saved_this->x10::regionarray::RectRegion::max(i)) + (::x10aux::nullCheck(v)->x10::lang::Point::__apply(
                                                                        i)));
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* saved_this;
    ::x10::lang::Point* v;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->v);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__20* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__20>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_saved_this = buf.read< ::x10::regionarray::RectRegion*>();
        ::x10::lang::Point* that_v = buf.read< ::x10::lang::Point*>();
        x10_regionarray_RectRegion__closure__20* this_ = new (storage) x10_regionarray_RectRegion__closure__20(that_saved_this, that_v);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__20(::x10::regionarray::RectRegion* saved_this, ::x10::lang::Point* v) : saved_this(saved_this), v(v) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:373";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__20_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__21_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__21_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__21 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__21> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((i) < (axis)) ? (saved_this->x10::regionarray::RectRegion::min(
                                   i)) : (saved_this->x10::regionarray::RectRegion::min(
                                            ((i) + (((x10_long)1ll)))));
        
    }
    
    // captured environment
    x10_long axis;
    ::x10::regionarray::RectRegion* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->axis);
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__21* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__21>();
        buf.record_reference(storage);
        x10_long that_axis = buf.read<x10_long>();
        ::x10::regionarray::RectRegion* that_saved_this = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__21* this_ = new (storage) x10_regionarray_RectRegion__closure__21(that_axis, that_saved_this);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__21(x10_long axis, ::x10::regionarray::RectRegion* saved_this) : axis(axis), saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:383";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__21_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__22_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__22_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__22 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__22> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((i) < (axis)) ? (saved_this->x10::regionarray::RectRegion::max(
                                   i)) : (saved_this->x10::regionarray::RectRegion::max(
                                            ((i) + (((x10_long)1ll)))));
        
    }
    
    // captured environment
    x10_long axis;
    ::x10::regionarray::RectRegion* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->axis);
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__22* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__22>();
        buf.record_reference(storage);
        x10_long that_axis = buf.read<x10_long>();
        ::x10::regionarray::RectRegion* that_saved_this = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__22* this_ = new (storage) x10_regionarray_RectRegion__closure__22(that_axis, that_saved_this);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__22(x10_long axis, ::x10::regionarray::RectRegion* saved_this) : axis(axis), saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:384";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__22_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__23_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__23_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__23 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__23> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i__116548) {
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::nullCheck(this__116549)->x10::regionarray::RectRegion::min(
                 i__116548);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* this__116549;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->this__116549);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__23* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__23>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_this__116549 = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__23* this_ = new (storage) x10_regionarray_RectRegion__closure__23(that_this__116549);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__23(::x10::regionarray::RectRegion* this__116549) : this__116549(this__116549) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:223";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__23_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__24_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__24_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__24 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__24> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i__116550) {
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::nullCheck(this__116551)->x10::regionarray::RectRegion::max(
                 i__116550);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* this__116551;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->this__116551);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__24* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__24>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_this__116551 = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__24* this_ = new (storage) x10_regionarray_RectRegion__closure__24(that_this__116551);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__24(::x10::regionarray::RectRegion* this__116551) : this__116551(this__116551) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:224";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__24_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__25_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__25_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__25 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__25> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i__116552) {
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::nullCheck(this__116553)->x10::regionarray::RectRegion::min(
                 i__116552);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* this__116553;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->this__116553);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__25* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__25>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_this__116553 = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__25* this_ = new (storage) x10_regionarray_RectRegion__closure__25(that_this__116553);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__25(::x10::regionarray::RectRegion* this__116553) : this__116553(this__116553) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:223";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__25_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__26_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__26_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__26 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__26> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i__116554) {
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::nullCheck(this__116555)->x10::regionarray::RectRegion::max(
                 i__116554);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* this__116555;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->this__116555);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__26* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__26>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_this__116555 = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__26* this_ = new (storage) x10_regionarray_RectRegion__closure__26(that_this__116555);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__26(::x10::regionarray::RectRegion* this__116555) : this__116555(this__116555) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:224";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__26_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__27_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__27_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__27 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__27> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i__116556) {
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::nullCheck(this__116557)->x10::regionarray::RectRegion::min(
                 i__116556);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* this__116557;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->this__116557);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__27* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__27>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_this__116557 = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__27* this_ = new (storage) x10_regionarray_RectRegion__closure__27(that_this__116557);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__27(::x10::regionarray::RectRegion* this__116557) : this__116557(this__116557) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:223";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__27_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__CLOSURE__28_CLOSURE
#define X10_REGIONARRAY_RECTREGION__CLOSURE__28_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__closure__28 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__28> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i__116558) {
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::nullCheck(this__116559)->x10::regionarray::RectRegion::max(
                 i__116558);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* this__116559;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->this__116559);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__closure__28* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__closure__28>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_this__116559 = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__closure__28* this_ = new (storage) x10_regionarray_RectRegion__closure__28(that_this__116559);
        return this_;
    }
    
    x10_regionarray_RectRegion__closure__28(::x10::regionarray::RectRegion* this__116559) : this__116559(this__116559) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:224";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__CLOSURE__28_CLOSURE
::x10::lang::Iterable< ::x10::lang::Point*>::itable< ::x10::regionarray::RectRegion >  x10::regionarray::RectRegion::_itable_0(&x10::regionarray::RectRegion::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::RectRegion::iterator, &x10::regionarray::RectRegion::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::RectRegion >  x10::regionarray::RectRegion::_itable_1(&x10::regionarray::RectRegion::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::RectRegion::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::RectRegion::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::RectRegion")};

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"

//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_boolean x10::regionarray::RectRegion::allZeros(::x10::lang::Rail< x10_long >* a) {
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::lang::Rail< x10_long >* rail__116560 = a;
    x10_long i__111025max__116561 = (x10_long)(::x10aux::nullCheck(rail__116560)->FMGL(size));
    {
        x10_long i__116562;
        for (i__116562 = ((x10_long)0ll); ((i__116562) < (i__111025max__116561));
             i__116562 = ((i__116562) + (((x10_long)1ll)))) {
            x10_long i__116563 = i__116562;
            if ((!::x10aux::struct_equals(::x10aux::nullCheck(a)->x10::lang::Rail< x10_long >::__apply(
                                            i__116563), ((x10_long)0ll))))
            {
                return false;
                
            }
            
        }
    }
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    return true;
    
}

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
void x10::regionarray::RectRegion::_constructor(::x10::lang::Rail< x10_long >* minArg,
                                                ::x10::lang::Rail< x10_long >* maxArg) {
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::regionarray::Region* this__116567 = this;
    
    //#line 556 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_long r__116568 = (x10_long)(::x10aux::nullCheck(minArg)->FMGL(size));
    x10_boolean z__116569 = ::x10::regionarray::RectRegion::allZeros(
                              minArg);
    
    //#line 557 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_boolean isRail__116564 = (((::x10aux::struct_equals(r__116568,
                                                            ((x10_long)1ll))) &&
    true) && z__116569);
    
    //#line 558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    ::x10aux::nullCheck(this__116567)->FMGL(rank) = r__116568;
    ::x10aux::nullCheck(this__116567)->FMGL(rect) = true;
    ::x10aux::nullCheck(this__116567)->FMGL(zeroBased) = z__116569;
    ::x10aux::nullCheck(this__116567)->FMGL(rail) = isRail__116564;
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::regionarray::RectRegion* this__116565 = this;
    ::x10aux::nullCheck(this__116565)->FMGL(polyRep) = (::x10aux::class_cast_unchecked< ::x10::regionarray::Region*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((!::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(minArg)->FMGL(size)),
                                  (x10_long)(::x10aux::nullCheck(maxArg)->FMGL(size)))))
    {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalArgumentException::_make((__extension__ ({ static ::x10::lang::String* strLit__127254 = ::x10aux::makeStringLit("size of min and max args are not equal"); strLit__127254; })))));
    }
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    x10_long s = ((x10_long)1ll);
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::lang::Rail< x10_long >* rail__116570 = minArg;
    x10_long i__111044max__116571 = (x10_long)(::x10aux::nullCheck(rail__116570)->FMGL(size));
    {
        x10_long i__116572;
        for (i__116572 = ((x10_long)0ll); ((i__116572) < (i__111044max__116571));
             i__116572 = ((i__116572) + (((x10_long)1ll))))
        {
            x10_long i__116573 = i__116572;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            x10_long rs__116566 = ((((::x10aux::nullCheck(maxArg)->x10::lang::Rail< x10_long >::__apply(
                                        i__116573)) - (::x10aux::nullCheck(minArg)->x10::lang::Rail< x10_long >::__apply(
                                                         i__116573)))) + (((x10_long)1ll)));
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (((rs__116566) < (((x10_long)0ll)))) {
                rs__116566 = ((x10_long)0ll);
            }
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (((::x10aux::struct_equals(::x10aux::nullCheck(maxArg)->x10::lang::Rail< x10_long >::__apply(
                                            i__116573), (x10_long)0x7fffffffffffffffLL)) &&
                (::x10aux::struct_equals(::x10aux::nullCheck(minArg)->x10::lang::Rail< x10_long >::__apply(
                                           i__116573), (x10_long)0x8000000000000000LL))))
            {
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                s = ((x10_long)-1ll);
                
                //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                break;
            }
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            s = ((s) * (rs__116566));
        }
    }
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    this->FMGL(size) = s;
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((((x10_long)(::x10aux::nullCheck(minArg)->FMGL(size))) > (((x10_long)0ll))))
    {
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this->FMGL(min0) = ::x10aux::nullCheck(minArg)->x10::lang::Rail< x10_long >::__apply(
                             ((x10_long)0ll));
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this->FMGL(max0) = ::x10aux::nullCheck(maxArg)->x10::lang::Rail< x10_long >::__apply(
                             ((x10_long)0ll));
    } else {
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this->FMGL(min0) = this->FMGL(max0) = ((x10_long)0ll);
    }
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((((x10_long)(::x10aux::nullCheck(minArg)->FMGL(size))) > (((x10_long)1ll))))
    {
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this->FMGL(min1) = ::x10aux::nullCheck(minArg)->x10::lang::Rail< x10_long >::__apply(
                             ((x10_long)1ll));
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this->FMGL(max1) = ::x10aux::nullCheck(maxArg)->x10::lang::Rail< x10_long >::__apply(
                             ((x10_long)1ll));
    } else {
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this->FMGL(min1) = this->FMGL(max1) = ((x10_long)0ll);
    }
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((((x10_long)(::x10aux::nullCheck(minArg)->FMGL(size))) > (((x10_long)2ll))))
    {
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this->FMGL(min2) = ::x10aux::nullCheck(minArg)->x10::lang::Rail< x10_long >::__apply(
                             ((x10_long)2ll));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this->FMGL(max2) = ::x10aux::nullCheck(maxArg)->x10::lang::Rail< x10_long >::__apply(
                             ((x10_long)2ll));
    } else {
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this->FMGL(min2) = this->FMGL(max2) = ((x10_long)0ll);
    }
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((((x10_long)(::x10aux::nullCheck(minArg)->FMGL(size))) > (((x10_long)3ll))))
    {
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this->FMGL(min3) = ::x10aux::nullCheck(minArg)->x10::lang::Rail< x10_long >::__apply(
                             ((x10_long)3ll));
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this->FMGL(max3) = ::x10aux::nullCheck(maxArg)->x10::lang::Rail< x10_long >::__apply(
                             ((x10_long)3ll));
    } else {
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this->FMGL(min3) = this->FMGL(max3) = ((x10_long)0ll);
    }
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((((x10_long)(::x10aux::nullCheck(minArg)->FMGL(size))) > (((x10_long)4ll))))
    {
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this->FMGL(mins) = minArg;
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this->FMGL(maxs) = maxArg;
    } else {
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this->FMGL(mins) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this->FMGL(maxs) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
    
}
::x10::regionarray::RectRegion* x10::regionarray::RectRegion::_make(
  ::x10::lang::Rail< x10_long >* minArg, ::x10::lang::Rail< x10_long >* maxArg)
{
    ::x10::regionarray::RectRegion* this_ = new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion();
    this_->_constructor(minArg, maxArg);
    return this_;
}



//#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
void x10::regionarray::RectRegion::_constructor(x10_long min,
                                                x10_long max) {
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::regionarray::Region* this__116576 = this;
    
    //#line 556 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_boolean z__116577 = (::x10aux::struct_equals(min,
                                                     ((x10_long)0ll)));
    
    //#line 557 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_boolean isRail__116574 = (true && z__116577);
    
    //#line 558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    ::x10aux::nullCheck(this__116576)->FMGL(rank) = ((x10_long)1ll);
    ::x10aux::nullCheck(this__116576)->FMGL(rect) = true;
    ::x10aux::nullCheck(this__116576)->FMGL(zeroBased) = z__116577;
    ::x10aux::nullCheck(this__116576)->FMGL(rail) = isRail__116574;
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::regionarray::RectRegion* this__116575 = this;
    ::x10aux::nullCheck(this__116575)->FMGL(polyRep) = (::x10aux::class_cast_unchecked< ::x10::regionarray::Region*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    this->FMGL(size) = ((::x10aux::struct_equals(min, (x10_long)0x8000000000000000LL)) &&
    (::x10aux::struct_equals(max, (x10_long)0x7fffffffffffffffLL)))
      ? (((x10_long)-1ll)) : (((((max) - (min))) + (((x10_long)1ll))));
    
    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    this->FMGL(min0) = min;
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    this->FMGL(max0) = max;
    
    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    this->FMGL(min1) = this->FMGL(min2) = this->FMGL(min3) =
      ((x10_long)0ll);
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    this->FMGL(max1) = this->FMGL(max2) = this->FMGL(max3) =
      ((x10_long)0ll);
    
    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    this->FMGL(mins) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    this->FMGL(maxs) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
::x10::regionarray::RectRegion* x10::regionarray::RectRegion::_make(
  x10_long min, x10_long max) {
    ::x10::regionarray::RectRegion* this_ = new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion();
    this_->_constructor(min, max);
    return this_;
}



//#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_long x10::regionarray::RectRegion::size() {
    
    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (((this->FMGL(size)) < (((x10_long)0ll)))) {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::regionarray::UnboundedRegionException::_make((__extension__ ({ static ::x10::lang::String* strLit__127267 = ::x10aux::makeStringLit("size exceeds capacity of long"); strLit__127267; })))));
    }
    
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    return this->FMGL(size);
    
}

//#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_boolean x10::regionarray::RectRegion::isConvex() {
    return true;
    
}

//#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_boolean x10::regionarray::RectRegion::isEmpty() {
    return (::x10aux::struct_equals(this->FMGL(size), ((x10_long)0ll)));
    
}

//#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_long x10::regionarray::RectRegion::indexOf(::x10::lang::Point* pt) {
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (!(this->x10::regionarray::RectRegion::contains(pt)))
    {
        return ((x10_long)-1ll);
        
    }
    
    //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    x10_long offset = ((::x10aux::nullCheck(pt)->x10::lang::Point::__apply(
                          ((x10_long)(((x10_int)0))))) - (this->x10::regionarray::RectRegion::min(
                                                            ((x10_long)(((x10_int)0))))));
    
    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    x10_long i__111063max__116582 = ((this->FMGL(rank)) - (((x10_long)1ll)));
    {
        x10_long i__116583;
        for (i__116583 = ((x10_long)1ll); ((i__116583) <= (i__111063max__116582));
             i__116583 = ((i__116583) + (((x10_long)1ll))))
        {
            x10_long i__116584 = i__116583;
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            x10_long min_i__116578 = this->x10::regionarray::RectRegion::min(
                                       i__116584);
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            x10_long max_i__116579 = this->x10::regionarray::RectRegion::max(
                                       i__116584);
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            x10_long pt_i__116580 = ::x10aux::nullCheck(pt)->x10::lang::Point::__apply(
                                      i__116584);
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            x10_long delta_i__116581 = ((((max_i__116579) - (min_i__116578))) + (((x10_long)1ll)));
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            offset = ((((((offset) * (delta_i__116581))) + (pt_i__116580))) - (min_i__116578));
        }
    }
    
    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    return offset;
    
}

//#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_long x10::regionarray::RectRegion::indexOf(x10_long i0) {
    
    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (this->FMGL(zeroBased)) {
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (((!::x10aux::struct_equals(this->FMGL(rank), ((x10_long)1ll))) ||
            !((__extension__ ({
                ::x10::regionarray::RectRegion* this__116500 =
                  this;
                
                //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                x10_long i__116499 = i0;
                (((i__116499) >= (::x10aux::nullCheck(this__116500)->FMGL(min0))) &&
                ((i__116499) <= (::x10aux::nullCheck(this__116500)->FMGL(max0))));
            }))
            ))) {
            return ((x10_long)-1ll);
            
        }
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return i0;
        
    } else {
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (((!::x10aux::struct_equals(this->FMGL(rank), ((x10_long)1ll))) ||
            !((__extension__ ({
                ::x10::regionarray::RectRegion* this__116502 =
                  this;
                
                //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                x10_long i__116501 = i0;
                (((i__116501) >= (::x10aux::nullCheck(this__116502)->FMGL(min0))) &&
                ((i__116501) <= (::x10aux::nullCheck(this__116502)->FMGL(max0))));
            }))
            ))) {
            return ((x10_long)-1ll);
            
        }
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ((i0) - (this->FMGL(min0)));
        
    }
    
}

//#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_long x10::regionarray::RectRegion::indexOf(x10_long i0,
                                               x10_long i1) {
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (this->FMGL(zeroBased)) {
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (((!::x10aux::struct_equals(this->FMGL(rank), ((x10_long)2ll))) ||
            !(this->x10::regionarray::RectRegion::containsInternal(
                i0, i1)))) {
            return ((x10_long)-1ll);
            
        }
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        x10_long offset = i0;
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        offset = ((((offset) * (((this->FMGL(max1)) + (((x10_long)1ll)))))) + (i1));
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return offset;
        
    } else {
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (((!::x10aux::struct_equals(this->FMGL(rank), ((x10_long)2ll))) ||
            !(this->x10::regionarray::RectRegion::containsInternal(
                i0, i1)))) {
            return ((x10_long)-1ll);
            
        }
        
        //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        x10_long offset = ((i0) - (this->FMGL(min0)));
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        offset = ((((((offset) * (((((this->FMGL(max1)) - (this->FMGL(min1)))) + (((x10_long)1ll)))))) + (i1))) - (this->FMGL(min1)));
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return offset;
        
    }
    
}

//#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_long x10::regionarray::RectRegion::indexOf(x10_long i0,
                                               x10_long i1,
                                               x10_long i2) {
    
    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (this->FMGL(zeroBased)) {
        
        //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (((!::x10aux::struct_equals(this->FMGL(rank), ((x10_long)3ll))) ||
            !(this->x10::regionarray::RectRegion::containsInternal(
                i0, i1, i2)))) {
            return ((x10_long)-1ll);
            
        }
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        x10_long offset = i0;
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        offset = ((((offset) * (((this->FMGL(max1)) + (((x10_long)1ll)))))) + (i1));
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        offset = ((((offset) * (((this->FMGL(max2)) + (((x10_long)1ll)))))) + (i2));
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return offset;
        
    } else {
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (((!::x10aux::struct_equals(this->FMGL(rank), ((x10_long)3ll))) ||
            !(this->x10::regionarray::RectRegion::containsInternal(
                i0, i1, i2)))) {
            return ((x10_long)-1ll);
            
        }
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        x10_long offset = ((i0) - (this->FMGL(min0)));
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        offset = ((((((offset) * (((((this->FMGL(max1)) - (this->FMGL(min1)))) + (((x10_long)1ll)))))) + (i1))) - (this->FMGL(min1)));
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        offset = ((((((offset) * (((((this->FMGL(max2)) - (this->FMGL(min2)))) + (((x10_long)1ll)))))) + (i2))) - (this->FMGL(min2)));
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return offset;
        
    }
    
}

//#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_long x10::regionarray::RectRegion::indexOf(x10_long i0,
                                               x10_long i1,
                                               x10_long i2,
                                               x10_long i3) {
    
    //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (this->FMGL(zeroBased)) {
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (((!::x10aux::struct_equals(this->FMGL(rank), ((x10_long)4ll))) ||
            !(this->x10::regionarray::RectRegion::containsInternal(
                i0, i1, i2, i3)))) {
            return ((x10_long)-1ll);
            
        }
        
        //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        x10_long offset = i0;
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        offset = ((((offset) * (((this->FMGL(max1)) + (((x10_long)1ll)))))) + (i1));
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        offset = ((((offset) * (((this->FMGL(max2)) + (((x10_long)1ll)))))) + (i2));
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        offset = ((((offset) * (((this->FMGL(max3)) + (((x10_long)1ll)))))) + (i3));
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return offset;
        
    } else {
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (((!::x10aux::struct_equals(this->FMGL(rank), ((x10_long)4ll))) ||
            !(this->x10::regionarray::RectRegion::containsInternal(
                i0, i1, i2, i3)))) {
            return ((x10_long)-1ll);
            
        }
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        x10_long offset = ((i0) - (this->FMGL(min0)));
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        offset = ((((((offset) * (((((this->FMGL(max1)) - (this->FMGL(min1)))) + (((x10_long)1ll)))))) + (i1))) - (this->FMGL(min1)));
        
        //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        offset = ((((((offset) * (((((this->FMGL(max2)) - (this->FMGL(min2)))) + (((x10_long)1ll)))))) + (i2))) - (this->FMGL(min2)));
        
        //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        offset = ((((((offset) * (((((this->FMGL(max3)) - (this->FMGL(min3)))) + (((x10_long)1ll)))))) + (i3))) - (this->FMGL(min3)));
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return offset;
        
    }
    
}

//#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_long x10::regionarray::RectRegion::min(x10_long i) {
    
    //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)0ll)))) {
        return this->FMGL(min0);
        
    }
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)1ll)))) {
        return this->FMGL(min1);
        
    }
    
    //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)2ll)))) {
        return this->FMGL(min2);
        
    }
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)3ll)))) {
        return this->FMGL(min3);
        
    }
    
    //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((((i) < (((x10_long)0ll))) || ((i) >= (this->FMGL(rank)))))
    {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127332 = ::x10aux::makeStringLit("min: "); strLit__127332; })), i), (__extension__ ({ static ::x10::lang::String* strLit__127333 = ::x10aux::makeStringLit(" is not a valid rank for "); strLit__127333; }))), this))));
    }
    
    //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    return ::x10aux::nullCheck(this->FMGL(mins))->x10::lang::Rail< x10_long >::__apply(
             i);
    
}

//#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_long x10::regionarray::RectRegion::max(x10_long i) {
    
    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)0ll)))) {
        return this->FMGL(max0);
        
    }
    
    //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)1ll)))) {
        return this->FMGL(max1);
        
    }
    
    //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)2ll)))) {
        return this->FMGL(max2);
        
    }
    
    //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)3ll)))) {
        return this->FMGL(max3);
        
    }
    
    //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((((i) < (((x10_long)0ll))) || ((i) >= (this->FMGL(rank)))))
    {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127341 = ::x10aux::makeStringLit("max: "); strLit__127341; })), i), (__extension__ ({ static ::x10::lang::String* strLit__127342 = ::x10aux::makeStringLit(" is not a valid rank for "); strLit__127342; }))), this))));
    }
    
    //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    return ::x10aux::nullCheck(this->FMGL(maxs))->x10::lang::Rail< x10_long >::__apply(
             i);
    
}

//#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
::x10::regionarray::Region* x10::regionarray::RectRegion::computeBoundingBox(
  ) {
    return this;
    
}

//#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
::x10::lang::Fun_0_1<x10_long, x10_long>* x10::regionarray::RectRegion::min(
  ) {
    return reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__1)))x10_regionarray_RectRegion__closure__1(this)));
    
}

//#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
::x10::lang::Fun_0_1<x10_long, x10_long>* x10::regionarray::RectRegion::max(
  ) {
    return reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__2)))x10_regionarray_RectRegion__closure__2(this)));
    
}

//#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_boolean x10::regionarray::RectRegion::contains(::x10::regionarray::Region* that) {
    
    //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (::x10aux::instanceof< ::x10::regionarray::RectRegion*>(that))
    {
        
        //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMin =
          (__extension__ ({
            ::x10::regionarray::RectRegion* this__116504 =
              ::x10aux::class_cast< ::x10::regionarray::RectRegion*>(that);
            reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__3)))x10_regionarray_RectRegion__closure__3(this__116504)));
        }))
        ;
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMax =
          (__extension__ ({
            ::x10::regionarray::RectRegion* this__116506 =
              ::x10aux::class_cast< ::x10::regionarray::RectRegion*>(that);
            reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__4)))x10_regionarray_RectRegion__closure__4(this__116506)));
        }))
        ;
        
        //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        x10_long i__111081max__116585 = ((this->FMGL(rank)) - (((x10_long)1ll)));
        {
            x10_long i__116586;
            for (i__116586 = ((x10_long)0ll); ((i__116586) <= (i__111081max__116585));
                 i__116586 = ((i__116586) + (((x10_long)1ll))))
            {
                x10_long i__116587 = i__116586;
                
                //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                if (((this->x10::regionarray::RectRegion::min(
                        i__116587)) > (::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(thatMin), 
                      i__116587)))) {
                    return false;
                    
                }
                
                //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                if (((this->x10::regionarray::RectRegion::max(
                        i__116587)) < (::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(thatMax), 
                      i__116587)))) {
                    return false;
                    
                }
                
            }
        }
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return true;
        
    } else 
    //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (::x10aux::instanceof< ::x10::regionarray::RectRegion1D*>(that))
    {
        
        //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return (((this->x10::regionarray::RectRegion::min(
                    ((x10_long)0ll))) <= (::x10aux::nullCheck(that)->min(
                                            ((x10_long)0ll)))) &&
        ((this->x10::regionarray::RectRegion::max(((x10_long)0ll))) >= (::x10aux::nullCheck(that)->max(
                                                                          ((x10_long)0ll)))));
        
    } else {
        
        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return this->x10::regionarray::RectRegion::contains(
                 ::x10aux::nullCheck(that)->computeBoundingBox());
        
    }
    
}

//#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_boolean x10::regionarray::RectRegion::contains(::x10::lang::Point* p) {
    
    //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((!::x10aux::struct_equals(::x10aux::nullCheck(p)->FMGL(rank),
                                  this->FMGL(rank)))) {
        return false;
        
    }
    
    //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    switch (((x10_int) (((::x10aux::nullCheck(p)->FMGL(rank)) - (((x10_long)1ll))))))
    {
        
        //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        default: ;
        {
            {
                
                //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                x10_long i__111099min__111100 = ((::x10aux::nullCheck(p)->FMGL(rank)) - (((x10_long)1ll)));
                {
                    x10_long i__111099;
                    for (i__111099 = i__111099min__111100;
                         ((i__111099) <= (((x10_long)4ll)));
                         i__111099 = ((i__111099) + (((x10_long)1ll))))
                    {
                        x10_long r = i__111099;
                        
                        //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        if ((((::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                                 r)) < (::x10aux::nullCheck(this->FMGL(mins))->x10::lang::Rail< x10_long >::__apply(
                                          r))) || ((::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                                                      r)) > (::x10aux::nullCheck(this->FMGL(maxs))->x10::lang::Rail< x10_long >::__apply(
                                                               r)))))
                        {
                            return false;
                            
                        }
                        
                    }
                }
                
            }
        }
        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        case ((x10_int)3): ;
        {
            {
                x10_long tmp = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                                 ((x10_long)3ll));
                if ((((tmp) < (this->FMGL(min3))) || ((tmp) > (this->FMGL(max3)))))
                {
                    return false;
                    
                }
                
            }
        }
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        case ((x10_int)2): ;
        {
            {
                x10_long tmp = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                                 ((x10_long)2ll));
                if ((((tmp) < (this->FMGL(min2))) || ((tmp) > (this->FMGL(max2)))))
                {
                    return false;
                    
                }
                
            }
        }
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        case ((x10_int)1): ;
        {
            {
                x10_long tmp = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                                 ((x10_long)1ll));
                if ((((tmp) < (this->FMGL(min1))) || ((tmp) > (this->FMGL(max1)))))
                {
                    return false;
                    
                }
                
            }
        }
        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        case ((x10_int)0): ;
        {
            {
                x10_long tmp = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                                 ((x10_long)0ll));
                if ((((tmp) < (this->FMGL(min0))) || ((tmp) > (this->FMGL(max0)))))
                {
                    return false;
                    
                }
                
            }
        }
    }
    
    //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    return true;
    
}

//#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_boolean x10::regionarray::RectRegion::contains(x10_long i0) {
    ::x10::regionarray::RectRegion* this__116588 = this;
    
    //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    x10_long i__116589 = i0;
    
    //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    return (((i__116589) >= (::x10aux::nullCheck(this__116588)->FMGL(min0))) &&
    ((i__116589) <= (::x10aux::nullCheck(this__116588)->FMGL(max0))));
    
}

//#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_boolean x10::regionarray::RectRegion::contains(x10_long i0,
                                                   x10_long i1) {
    return this->x10::regionarray::RectRegion::containsInternal(
             i0, i1);
    
}

//#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_boolean x10::regionarray::RectRegion::contains(x10_long i0,
                                                   x10_long i1,
                                                   x10_long i2) {
    return this->x10::regionarray::RectRegion::containsInternal(
             i0, i1, i2);
    
}

//#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_boolean x10::regionarray::RectRegion::contains(x10_long i0,
                                                   x10_long i1,
                                                   x10_long i2,
                                                   x10_long i3) {
    return this->x10::regionarray::RectRegion::containsInternal(
             i0, i1, i2, i3);
    
}

//#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_boolean x10::regionarray::RectRegion::containsInternal(
  x10_long i0) {
    
    //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    return (((i0) >= (this->FMGL(min0))) && ((i0) <= (this->FMGL(max0))));
    
}

//#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_boolean x10::regionarray::RectRegion::containsInternal(
  x10_long i0, x10_long i1) {
    
    //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((true && this->FMGL(zeroBased))) {
        
        //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return (((((x10_ulong) (i0))) <= (((x10_ulong) (this->FMGL(max0))))) &&
        ((((x10_ulong) (i1))) <= (((x10_ulong) (this->FMGL(max1))))));
        
    } else {
        
        //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return (((((i0) >= (this->FMGL(min0))) && ((i0) <= (this->FMGL(max0)))) &&
        ((i1) >= (this->FMGL(min1)))) && ((i1) <= (this->FMGL(max1))));
        
    }
    
}

//#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_boolean x10::regionarray::RectRegion::containsInternal(
  x10_long i0, x10_long i1, x10_long i2) {
    
    //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((true && this->FMGL(zeroBased))) {
        
        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ((((((x10_ulong) (i0))) <= (((x10_ulong) (this->FMGL(max0))))) &&
        ((((x10_ulong) (i1))) <= (((x10_ulong) (this->FMGL(max1)))))) &&
        ((((x10_ulong) (i2))) <= (((x10_ulong) (this->FMGL(max2))))));
        
    } else {
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return (((((((i0) >= (this->FMGL(min0))) && ((i0) <= (this->FMGL(max0)))) &&
        ((i1) >= (this->FMGL(min1)))) && ((i1) <= (this->FMGL(max1)))) &&
        ((i2) >= (this->FMGL(min2)))) && ((i2) <= (this->FMGL(max2))));
        
    }
    
}

//#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_boolean x10::regionarray::RectRegion::containsInternal(
  x10_long i0, x10_long i1, x10_long i2, x10_long i3) {
    
    //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((true && this->FMGL(zeroBased))) {
        
        //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return (((((((x10_ulong) (i0))) <= (((x10_ulong) (this->FMGL(max0))))) &&
        ((((x10_ulong) (i1))) <= (((x10_ulong) (this->FMGL(max1)))))) &&
        ((((x10_ulong) (i2))) <= (((x10_ulong) (this->FMGL(max2)))))) &&
        ((((x10_ulong) (i3))) <= (((x10_ulong) (this->FMGL(max3))))));
        
    } else {
        
        //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return (((((((((i0) >= (this->FMGL(min0))) && ((i0) <= (this->FMGL(max0)))) &&
        ((i1) >= (this->FMGL(min1)))) && ((i1) <= (this->FMGL(max1)))) &&
        ((i2) >= (this->FMGL(min2)))) && ((i2) <= (this->FMGL(max2)))) &&
        ((i3) >= (this->FMGL(min3)))) && ((i3) <= (this->FMGL(max3))));
        
    }
    
}

//#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
::x10::regionarray::Region* x10::regionarray::RectRegion::toPolyRegion(
  ) {
    
    //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((::x10aux::struct_equals(this->FMGL(polyRep), reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this->FMGL(polyRep) = ::x10::regionarray::Region::makeRectangularPoly(
                                ::x10::lang::Rail< x10_long >::_make(this->FMGL(rank),
                                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__5)))x10_regionarray_RectRegion__closure__5(this)))),
                                ::x10::lang::Rail< x10_long >::_make(this->FMGL(rank),
                                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__6)))x10_regionarray_RectRegion__closure__6(this)))));
    }
    
    //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    return this->FMGL(polyRep);
    
}

//#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
::x10::regionarray::Region* x10::regionarray::RectRegion::intersection(
  ::x10::regionarray::Region* that) {
    
    //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (::x10aux::nullCheck(that)->isEmpty()) {
        
        //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return that;
        
    } else 
    //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (::x10aux::instanceof< ::x10::regionarray::FullRegion*>(that))
    {
        
        //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return this;
        
    } else 
    //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (::x10aux::instanceof< ::x10::regionarray::RectRegion*>(that))
    {
        
        //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMin =
          (__extension__ ({
            ::x10::regionarray::RectRegion* this__116510 =
              ::x10aux::class_cast< ::x10::regionarray::RectRegion*>(that);
            reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__7)))x10_regionarray_RectRegion__closure__7(this__116510)));
        }))
        ;
        
        //#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMax =
          (__extension__ ({
            ::x10::regionarray::RectRegion* this__116512 =
              ::x10aux::class_cast< ::x10::regionarray::RectRegion*>(that);
            reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__8)))x10_regionarray_RectRegion__closure__8(this__116512)));
        }))
        ;
        
        //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::lang::Rail< x10_long >* newMin = ::x10::lang::Rail< x10_long >::_make(this->FMGL(rank),
                                                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__9)))x10_regionarray_RectRegion__closure__9(this, thatMin))));
        
        //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::lang::Rail< x10_long >* newMax = ::x10::lang::Rail< x10_long >::_make(this->FMGL(rank),
                                                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__10)))x10_regionarray_RectRegion__closure__10(this, thatMax))));
        
        //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        x10_long i__111117max__116596 = (((x10_long)(::x10aux::nullCheck(newMin)->FMGL(size))) - (((x10_long)1ll)));
        {
            x10_long i__116597;
            for (i__116597 = ((x10_long)0ll); ((i__116597) <= (i__111117max__116596));
                 i__116597 = ((i__116597) + (((x10_long)1ll))))
            {
                x10_long i__116598 = i__116597;
                
                //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                if (((newMax->x10::lang::Rail< x10_long >::__apply(
                        i__116598)) < (newMin->x10::lang::Rail< x10_long >::__apply(
                                         i__116598)))) {
                    
                    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                    x10_long rank__116594 = this->FMGL(rank);
                    
                    //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    return reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
                        
                        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                        ::x10::regionarray::EmptyRegion* alloc__116595 =
                           (new (::x10aux::alloc_z< ::x10::regionarray::EmptyRegion>()) ::x10::regionarray::EmptyRegion());
                        (alloc__116595)->::x10::regionarray::EmptyRegion::_constructor(
                          rank__116594);
                        alloc__116595;
                    }))
                    );
                    
                }
                
            }
        }
        
        //#line 330 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
            ::x10::regionarray::RectRegion* alloc__111015 =
               (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
            (alloc__111015)->::x10::regionarray::RectRegion::_constructor(
              newMin, newMax);
            alloc__111015;
        }))
        );
        
    } else 
    //#line 331 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (::x10aux::instanceof< ::x10::regionarray::RectRegion1D*>(that))
    {
        
        //#line 332 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        x10_long newMin = (__extension__ ({
            
            //#line 374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            x10_long a__116519 = this->x10::regionarray::RectRegion::min(
                                   ((x10_long)0ll));
            x10_long b__116520 = ::x10aux::nullCheck(that)->min(
                                   ((x10_long)0ll));
            ((a__116519) < (b__116520)) ? (b__116520) : (a__116519);
        }))
        ;
        
        //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        x10_long newMax = (__extension__ ({
            
            //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            x10_long a__116521 = this->x10::regionarray::RectRegion::max(
                                   ((x10_long)0ll));
            x10_long b__116522 = ::x10aux::nullCheck(that)->max(
                                   ((x10_long)0ll));
            ((a__116521) < (b__116522)) ? (a__116521) : (b__116522);
        }))
        ;
        
        //#line 334 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (((newMax) < (newMin))) {
            return (__extension__ ({
                reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
                    
                    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                    ::x10::regionarray::EmptyRegion* alloc__116524 =
                       (new (::x10aux::alloc_z< ::x10::regionarray::EmptyRegion>()) ::x10::regionarray::EmptyRegion());
                    (alloc__116524)->::x10::regionarray::EmptyRegion::_constructor(
                      ((x10_long)1ll));
                    alloc__116524;
                }))
                );
            }))
            ;
            
        }
        
        //#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::class_cast< ::x10::regionarray::Region*>((__extension__ ({
            ::x10::regionarray::RectRegion1D* alloc__111016 =
               (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
            (alloc__111016)->::x10::regionarray::RectRegion1D::_constructor(
              newMin, newMax);
            alloc__111016;
        }))
        );
        
    } else {
        
        //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::nullCheck((this->x10::regionarray::RectRegion::toPolyRegion()))->intersection(
                 that);
        
    }
    
}

//#line 344 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
::x10::regionarray::Region* x10::regionarray::RectRegion::product(
  ::x10::regionarray::Region* that) {
    
    //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (::x10aux::nullCheck(that)->isEmpty()) {
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        x10_long rank__116599 = ((this->FMGL(rank)) + (::x10aux::nullCheck(that)->FMGL(rank)));
        
        //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            ::x10::regionarray::EmptyRegion* alloc__116600 =
               (new (::x10aux::alloc_z< ::x10::regionarray::EmptyRegion>()) ::x10::regionarray::EmptyRegion());
            (alloc__116600)->::x10::regionarray::EmptyRegion::_constructor(
              rank__116599);
            alloc__116600;
        }))
        );
        
    } else 
    //#line 347 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (::x10aux::instanceof< ::x10::regionarray::RectRegion*>(that))
    {
        
        //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMin =
          (__extension__ ({
            ::x10::regionarray::RectRegion* this__116528 =
              ::x10aux::class_cast< ::x10::regionarray::RectRegion*>(that);
            reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__11)))x10_regionarray_RectRegion__closure__11(this__116528)));
        }))
        ;
        
        //#line 349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMax =
          (__extension__ ({
            ::x10::regionarray::RectRegion* this__116530 =
              ::x10aux::class_cast< ::x10::regionarray::RectRegion*>(that);
            reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__12)))x10_regionarray_RectRegion__closure__12(this__116530)));
        }))
        ;
        
        //#line 350 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        x10_long k = ((this->FMGL(rank)) + (::x10aux::nullCheck(that)->FMGL(rank)));
        
        //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::lang::Rail< x10_long >* newMin = ::x10::lang::Rail< x10_long >::_make(k,
                                                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__13)))x10_regionarray_RectRegion__closure__13(this, thatMin))));
        
        //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::lang::Rail< x10_long >* newMax = ::x10::lang::Rail< x10_long >::_make(k,
                                                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__14)))x10_regionarray_RectRegion__closure__14(this, thatMax))));
        
        //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::regionarray::RectRegion* alloc__116601 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
        (alloc__116601)->::x10::regionarray::RectRegion::_constructor(
          newMin, newMax);
        return alloc__116601;
        
    } else 
    //#line 354 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (::x10aux::instanceof< ::x10::regionarray::RectRegion1D*>(that))
    {
        
        //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        x10_long thatMin = ::x10aux::nullCheck(that)->min(
                             ((x10_long)0ll));
        
        //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        x10_long thatMax = ::x10aux::nullCheck(that)->max(
                             ((x10_long)0ll));
        
        //#line 357 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        x10_long k = ((this->FMGL(rank)) + (((x10_long)1ll)));
        
        //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::lang::Rail< x10_long >* newMin = ::x10::lang::Rail< x10_long >::_make(k,
                                                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__15)))x10_regionarray_RectRegion__closure__15(this, thatMin))));
        
        //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::lang::Rail< x10_long >* newMax = ::x10::lang::Rail< x10_long >::_make(k,
                                                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__16)))x10_regionarray_RectRegion__closure__16(this, thatMax))));
        
        //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::regionarray::RectRegion* alloc__116602 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
        (alloc__116602)->::x10::regionarray::RectRegion::_constructor(
          newMin, newMax);
        return alloc__116602;
        
    } else 
    //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (::x10aux::instanceof< ::x10::regionarray::FullRegion*>(that))
    {
        
        //#line 362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        x10_long k = ((this->FMGL(rank)) + (::x10aux::nullCheck(that)->FMGL(rank)));
        
        //#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::lang::Rail< x10_long >* newMin = ::x10::lang::Rail< x10_long >::_make(k,
                                                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__17)))x10_regionarray_RectRegion__closure__17(this))));
        
        //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::lang::Rail< x10_long >* newMax = ::x10::lang::Rail< x10_long >::_make(k,
                                                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__18)))x10_regionarray_RectRegion__closure__18(this))));
        
        //#line 365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::regionarray::RectRegion* alloc__116603 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
        (alloc__116603)->::x10::regionarray::RectRegion::_constructor(
          newMin, newMax);
        return alloc__116603;
        
    } else {
        
        //#line 367 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::nullCheck((this->x10::regionarray::RectRegion::toPolyRegion()))->product(
                 that);
        
    }
    
}

//#line 371 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
::x10::regionarray::Region* x10::regionarray::RectRegion::translate(
  ::x10::lang::Point* v) {
    
    //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::lang::Rail< x10_long >* newMin = ::x10::lang::Rail< x10_long >::_make(this->FMGL(rank),
                                                                                 reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__19)))x10_regionarray_RectRegion__closure__19(this, v))));
    
    //#line 373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::lang::Rail< x10_long >* newMax = ::x10::lang::Rail< x10_long >::_make(this->FMGL(rank),
                                                                                 reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__20)))x10_regionarray_RectRegion__closure__20(this, v))));
    
    //#line 374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    return reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
        ::x10::regionarray::RectRegion* alloc__111020 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
        (alloc__111020)->::x10::regionarray::RectRegion::_constructor(
          newMin, newMax);
        alloc__111020;
    }))
    );
    
}

//#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
::x10::regionarray::Region* x10::regionarray::RectRegion::projection(
  x10_long axis) {
    
    //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::regionarray::RectRegion* alloc__116608 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    x10_long min__116606 = this->x10::regionarray::RectRegion::min(
                             axis);
    x10_long max__116607 = this->x10::regionarray::RectRegion::max(
                             axis);
    
    //#line 556 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_boolean z__116605 = (::x10aux::struct_equals(min__116606,
                                                     ((x10_long)0ll)));
    
    //#line 557 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_boolean isRail__116604 = (true && z__116605);
    
    //#line 558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    alloc__116608->FMGL(rank) = ((x10_long)1ll);
    alloc__116608->FMGL(rect) = true;
    alloc__116608->FMGL(zeroBased) = z__116605;
    alloc__116608->FMGL(rail) = isRail__116604;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    alloc__116608->FMGL(polyRep) = (::x10aux::class_cast_unchecked< ::x10::regionarray::Region*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    alloc__116608->FMGL(size) = ((::x10aux::struct_equals(min__116606,
                                                          (x10_long)0x8000000000000000LL)) &&
    (::x10aux::struct_equals(max__116607, (x10_long)0x7fffffffffffffffLL)))
      ? (((x10_long)-1ll)) : (((((max__116607) - (min__116606))) + (((x10_long)1ll))));
    
    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    alloc__116608->FMGL(min0) = min__116606;
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    alloc__116608->FMGL(max0) = max__116607;
    
    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    alloc__116608->FMGL(min1) = alloc__116608->FMGL(min2) =
      alloc__116608->FMGL(min3) = ((x10_long)0ll);
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    alloc__116608->FMGL(max1) = alloc__116608->FMGL(max2) =
      alloc__116608->FMGL(max3) = ((x10_long)0ll);
    
    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    alloc__116608->FMGL(mins) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    alloc__116608->FMGL(maxs) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    return alloc__116608;
    
}

//#line 381 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
::x10::regionarray::Region* x10::regionarray::RectRegion::eliminate(
  x10_long axis) {
    
    //#line 382 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    x10_long k = ((this->FMGL(rank)) - (((x10_long)1ll)));
    
    //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::lang::Rail< x10_long >* newMin = ::x10::lang::Rail< x10_long >::_make(k,
                                                                                 reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__21)))x10_regionarray_RectRegion__closure__21(axis, this))));
    
    //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::lang::Rail< x10_long >* newMax = ::x10::lang::Rail< x10_long >::_make(k,
                                                                                 reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__22)))x10_regionarray_RectRegion__closure__22(axis, this))));
    
    //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::regionarray::RectRegion* alloc__116609 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
    (alloc__116609)->::x10::regionarray::RectRegion::_constructor(
      newMin, newMax);
    return alloc__116609;
    
}

//#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
::x10::lang::Iterator< ::x10::lang::Point*>* x10::regionarray::RectRegion::iterator(
  ) {
    
    //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::regionarray::RectRegion__RRIterator* alloc__116620 =
       (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion__RRIterator>()) ::x10::regionarray::RectRegion__RRIterator());
    (alloc__116620)->::x10::regionarray::RectRegion__RRIterator::_constructor(
      this);
    return reinterpret_cast< ::x10::lang::Iterator< ::x10::lang::Point*>*>(alloc__116620);
    
}

//#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_boolean x10::regionarray::RectRegion::equals(::x10::lang::Any* thatObj) {
    
    //#line 437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((::x10aux::struct_equals(this, thatObj))) {
        return true;
        
    }
    
    //#line 438 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (!(::x10aux::instanceof< ::x10::regionarray::Region*>(thatObj)))
    {
        return false;
        
    }
    
    //#line 439 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::regionarray::Region* that = ::x10aux::class_cast< ::x10::regionarray::Region*>(thatObj);
    
    //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (!(::x10aux::instanceof< ::x10::regionarray::RectRegion*>(that)))
    {
        
        //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10::regionarray::Region::equals(reinterpret_cast< ::x10::lang::Any*>(that));
        
    }
    
    //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((!::x10aux::struct_equals(this->FMGL(rank), ::x10aux::nullCheck(that)->FMGL(rank))))
    {
        
        //#line 447 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return false;
        
    }
    
    //#line 450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::lang::Fun_0_1<x10_long, x10_long>* thisMin = (__extension__ ({
        ::x10::regionarray::RectRegion* this__116549 = this;
        reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__23)))x10_regionarray_RectRegion__closure__23(this__116549)));
    }))
    ;
    
    //#line 451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::lang::Fun_0_1<x10_long, x10_long>* thisMax = (__extension__ ({
        ::x10::regionarray::RectRegion* this__116551 = this;
        reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__24)))x10_regionarray_RectRegion__closure__24(this__116551)));
    }))
    ;
    
    //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMin = (__extension__ ({
        ::x10::regionarray::RectRegion* this__116553 = ::x10aux::class_cast< ::x10::regionarray::RectRegion*>(that);
        reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__25)))x10_regionarray_RectRegion__closure__25(this__116553)));
    }))
    ;
    
    //#line 453 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMax = (__extension__ ({
        ::x10::regionarray::RectRegion* this__116555 = ::x10aux::class_cast< ::x10::regionarray::RectRegion*>(that);
        reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__26)))x10_regionarray_RectRegion__closure__26(this__116555)));
    }))
    ;
    
    //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    x10_long i__111135max__116621 = ((this->FMGL(rank)) - (((x10_long)1ll)));
    {
        x10_long i__116622;
        for (i__116622 = ((x10_long)0ll); ((i__116622) <= (i__111135max__116621));
             i__116622 = ((i__116622) + (((x10_long)1ll))))
        {
            x10_long i__116623 = i__116622;
            
            //#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (((!::x10aux::struct_equals(::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(thisMin), 
                                             i__116623), ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(thatMin), 
                                             i__116623))) ||
                (!::x10aux::struct_equals(::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(thisMax), 
                                            i__116623), ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(thatMax), 
                                            i__116623)))))
            {
                
                //#line 458 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                return false;
                
            }
            
        }
    }
    
    //#line 460 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    return true;
    
}

//#line 463 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
::x10::lang::String* x10::regionarray::RectRegion::toString(
  ) {
    
    //#line 464 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::lang::Fun_0_1<x10_long, x10_long>* thisMin = (__extension__ ({
        ::x10::regionarray::RectRegion* this__116557 = this;
        reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__27)))x10_regionarray_RectRegion__closure__27(this__116557)));
    }))
    ;
    
    //#line 465 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::lang::Fun_0_1<x10_long, x10_long>* thisMax = (__extension__ ({
        ::x10::regionarray::RectRegion* this__116559 = this;
        reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__closure__28)))x10_regionarray_RectRegion__closure__28(this__116559)));
    }))
    ;
    
    //#line 466 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::lang::String* s = (__extension__ ({ static ::x10::lang::String* strLit__127482 = ::x10aux::makeStringLit("["); strLit__127482; }));
    
    //#line 467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    x10_long i__111153max__116624 = ((this->FMGL(rank)) - (((x10_long)1ll)));
    {
        x10_long i__116625;
        for (i__116625 = ((x10_long)0ll); ((i__116625) <= (i__111153max__116624));
             i__116625 = ((i__116625) + (((x10_long)1ll))))
        {
            x10_long i__116626 = i__116625;
            
            //#line 468 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (((i__116626) > (((x10_long)0ll)))) {
                s = ::x10::lang::String::__plus(s, (__extension__ ({ static ::x10::lang::String* strLit__127483 = ::x10aux::makeStringLit(","); strLit__127483; })));
            }
            
            //#line 469 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            s = ::x10::lang::String::__plus(s, ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127484 = ::x10aux::makeStringLit(""); strLit__127484; })), ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(thisMin), 
              i__116626)), (__extension__ ({ static ::x10::lang::String* strLit__127486 = ::x10aux::makeStringLit(".."); strLit__127486; }))), ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(thisMax), 
              i__116626)));
        }
    }
    
    //#line 471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    s = ::x10::lang::String::__plus(s, (__extension__ ({ static ::x10::lang::String* strLit__127488 = ::x10aux::makeStringLit("]"); strLit__127488; })));
    
    //#line 472 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    return s;
    
}

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
::x10::regionarray::RectRegion* x10::regionarray::RectRegion::x10__regionarray__RectRegion____this__x10__regionarray__RectRegion(
  ) {
    return this;
    
}
void x10::regionarray::RectRegion::__fieldInitializers_x10_regionarray_RectRegion(
  ) {
    this->FMGL(polyRep) = (::x10aux::class_cast_unchecked< ::x10::regionarray::Region*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
const ::x10aux::serialization_id_t x10::regionarray::RectRegion::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::RectRegion::_deserializer);

void x10::regionarray::RectRegion::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::regionarray::Region::_serialize_body(buf);
    buf.write(this->FMGL(size));
    buf.write(this->FMGL(mins));
    buf.write(this->FMGL(maxs));
    buf.write(this->FMGL(min0));
    buf.write(this->FMGL(min1));
    buf.write(this->FMGL(min2));
    buf.write(this->FMGL(min3));
    buf.write(this->FMGL(max0));
    buf.write(this->FMGL(max1));
    buf.write(this->FMGL(max2));
    buf.write(this->FMGL(max3));
    
}

::x10::lang::Reference* ::x10::regionarray::RectRegion::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::RectRegion* this_ = new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::RectRegion::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::Region::_deserialize_body(buf);
    FMGL(size) = buf.read<x10_long>();
    FMGL(mins) = buf.read< ::x10::lang::Rail< x10_long >*>();
    FMGL(maxs) = buf.read< ::x10::lang::Rail< x10_long >*>();
    FMGL(min0) = buf.read<x10_long>();
    FMGL(min1) = buf.read<x10_long>();
    FMGL(min2) = buf.read<x10_long>();
    FMGL(min3) = buf.read<x10_long>();
    FMGL(max0) = buf.read<x10_long>();
    FMGL(max1) = buf.read<x10_long>();
    FMGL(max2) = buf.read<x10_long>();
    FMGL(max3) = buf.read<x10_long>();
    
}

::x10aux::RuntimeType x10::regionarray::RectRegion::rtt;
void x10::regionarray::RectRegion::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::regionarray::Region>()};
    rtt.initStageTwo("x10.regionarray.RectRegion",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__1>x10_regionarray_RectRegion__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__1::__apply, &x10_regionarray_RectRegion__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__1::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__2>x10_regionarray_RectRegion__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__2::__apply, &x10_regionarray_RectRegion__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__2::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__3>x10_regionarray_RectRegion__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__3::__apply, &x10_regionarray_RectRegion__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__3::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__4>x10_regionarray_RectRegion__closure__4::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__4::__apply, &x10_regionarray_RectRegion__closure__4::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__4::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__4::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__4::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__4::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__5>x10_regionarray_RectRegion__closure__5::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__5::__apply, &x10_regionarray_RectRegion__closure__5::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__5::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__5::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__5::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__5::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__6>x10_regionarray_RectRegion__closure__6::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__6::__apply, &x10_regionarray_RectRegion__closure__6::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__6::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__6::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__6::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__6::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__7>x10_regionarray_RectRegion__closure__7::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__7::__apply, &x10_regionarray_RectRegion__closure__7::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__7::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__7::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__7::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__7::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__8>x10_regionarray_RectRegion__closure__8::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__8::__apply, &x10_regionarray_RectRegion__closure__8::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__8::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__8::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__8::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__8::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__9>x10_regionarray_RectRegion__closure__9::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__9::__apply, &x10_regionarray_RectRegion__closure__9::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__9::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__9::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__9::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__9::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__10>x10_regionarray_RectRegion__closure__10::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__10::__apply, &x10_regionarray_RectRegion__closure__10::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__10::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__10::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__10::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__10::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__11>x10_regionarray_RectRegion__closure__11::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__11::__apply, &x10_regionarray_RectRegion__closure__11::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__11::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__11::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__11::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__11::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__12>x10_regionarray_RectRegion__closure__12::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__12::__apply, &x10_regionarray_RectRegion__closure__12::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__12::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__12::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__12::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__12::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__13>x10_regionarray_RectRegion__closure__13::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__13::__apply, &x10_regionarray_RectRegion__closure__13::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__13::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__13::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__13::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__13::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__14>x10_regionarray_RectRegion__closure__14::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__14::__apply, &x10_regionarray_RectRegion__closure__14::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__14::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__14::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__14::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__14::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__15>x10_regionarray_RectRegion__closure__15::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__15::__apply, &x10_regionarray_RectRegion__closure__15::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__15::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__15::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__15::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__15::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__16>x10_regionarray_RectRegion__closure__16::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__16::__apply, &x10_regionarray_RectRegion__closure__16::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__16::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__16::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__16::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__16::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__17>x10_regionarray_RectRegion__closure__17::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__17::__apply, &x10_regionarray_RectRegion__closure__17::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__17::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__17::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__17::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__17::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__18>x10_regionarray_RectRegion__closure__18::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__18::__apply, &x10_regionarray_RectRegion__closure__18::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__18::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__18::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__18::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__18::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__19>x10_regionarray_RectRegion__closure__19::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__19::__apply, &x10_regionarray_RectRegion__closure__19::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__19::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__19::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__19::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__19::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__20>x10_regionarray_RectRegion__closure__20::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__20::__apply, &x10_regionarray_RectRegion__closure__20::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__20::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__20::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__20::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__20::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__21>x10_regionarray_RectRegion__closure__21::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__21::__apply, &x10_regionarray_RectRegion__closure__21::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__21::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__21::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__21::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__21::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__22>x10_regionarray_RectRegion__closure__22::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__22::__apply, &x10_regionarray_RectRegion__closure__22::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__22::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__22::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__22::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__22::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__23>x10_regionarray_RectRegion__closure__23::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__23::__apply, &x10_regionarray_RectRegion__closure__23::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__23::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__23::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__23::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__23::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__24>x10_regionarray_RectRegion__closure__24::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__24::__apply, &x10_regionarray_RectRegion__closure__24::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__24::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__24::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__24::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__24::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__25>x10_regionarray_RectRegion__closure__25::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__25::__apply, &x10_regionarray_RectRegion__closure__25::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__25::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__25::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__25::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__25::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__26>x10_regionarray_RectRegion__closure__26::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__26::__apply, &x10_regionarray_RectRegion__closure__26::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__26::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__26::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__26::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__26::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__27>x10_regionarray_RectRegion__closure__27::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__27::__apply, &x10_regionarray_RectRegion__closure__27::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__27::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__27::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__27::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__27::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__closure__28>x10_regionarray_RectRegion__closure__28::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__closure__28::__apply, &x10_regionarray_RectRegion__closure__28::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__closure__28::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__closure__28::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__closure__28::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__closure__28::_deserialize);

/* END of RectRegion */
/*************************************************/
/*************************************************/
/* START of RectRegion$RRIterator */
#include <x10/regionarray/RectRegion__RRIterator.h>

#include <x10/lang/Iterator.h>
#include <x10/lang/Point.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Rail.h>
#include <x10/regionarray/RectRegion.h>
#include <x10/regionarray/Region.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_RECTREGION__RRITERATOR__CLOSURE__29_CLOSURE
#define X10_REGIONARRAY_RECTREGION__RRITERATOR__CLOSURE__29_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__RRIterator__closure__29 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__RRIterator__closure__29> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i__116546) {
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::nullCheck(rr)->x10::regionarray::RectRegion::min(
                 i__116546);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* rr;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->rr);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__RRIterator__closure__29* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__RRIterator__closure__29>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_rr = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__RRIterator__closure__29* this_ = new (storage) x10_regionarray_RectRegion__RRIterator__closure__29(that_rr);
        return this_;
    }
    
    x10_regionarray_RectRegion__RRIterator__closure__29(::x10::regionarray::RectRegion* rr) : rr(rr) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:223";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__RRITERATOR__CLOSURE__29_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__RRITERATOR__CLOSURE__30_CLOSURE
#define X10_REGIONARRAY_RECTREGION__RRITERATOR__CLOSURE__30_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__RRIterator__closure__30 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__RRIterator__closure__30> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i__116547) {
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::nullCheck(rr)->x10::regionarray::RectRegion::max(
                 i__116547);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* rr;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->rr);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__RRIterator__closure__30* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__RRIterator__closure__30>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_rr = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_RectRegion__RRIterator__closure__30* this_ = new (storage) x10_regionarray_RectRegion__RRIterator__closure__30(that_rr);
        return this_;
    }
    
    x10_regionarray_RectRegion__RRIterator__closure__30(::x10::regionarray::RectRegion* rr) : rr(rr) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:224";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__RRITERATOR__CLOSURE__30_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION__RRITERATOR__CLOSURE__31_CLOSURE
#define X10_REGIONARRAY_RECTREGION__RRITERATOR__CLOSURE__31_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion__RRIterator__closure__31 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__RRIterator__closure__31> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long l) {
        return ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(t), 
          l);
        
    }
    
    // captured environment
    ::x10::lang::Fun_0_1<x10_long, x10_long>* t;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->t);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion__RRIterator__closure__31* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion__RRIterator__closure__31>();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_1<x10_long, x10_long>* that_t = buf.read< ::x10::lang::Fun_0_1<x10_long, x10_long>*>();
        x10_regionarray_RectRegion__RRIterator__closure__31* this_ = new (storage) x10_regionarray_RectRegion__RRIterator__closure__31(that_t);
        return this_;
    }
    
    x10_regionarray_RectRegion__RRIterator__closure__31(::x10::lang::Fun_0_1<x10_long, x10_long>* t) : t(t) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:401";
    }

};

#endif // X10_REGIONARRAY_RECTREGION__RRITERATOR__CLOSURE__31_CLOSURE

//#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
::x10::lang::Iterator< ::x10::lang::Point*>::itable< ::x10::regionarray::RectRegion__RRIterator >  x10::regionarray::RectRegion__RRIterator::_itable_0(&::x10::lang::X10Class::equals, &x10::regionarray::RectRegion__RRIterator::hasNext, &::x10::lang::X10Class::hashCode, &x10::regionarray::RectRegion__RRIterator::next, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::RectRegion__RRIterator >  x10::regionarray::RectRegion__RRIterator::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::RectRegion__RRIterator::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterator< ::x10::lang::Point*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::RectRegion__RRIterator")};

//#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"

//#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"

//#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"

//#line 393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"

//#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
void x10::regionarray::RectRegion__RRIterator::_constructor(::x10::regionarray::RectRegion* rr) {
    
    //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    FMGL(myRank) = ::x10aux::nullCheck(rr)->FMGL(rank);
    
    //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::regionarray::RectRegion__RRIterator* this__116610 = this;
    ::x10aux::nullCheck(this__116610)->FMGL(done) = false;
    
    //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::lang::Fun_0_1<x10_long, x10_long>* t = reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__RRIterator__closure__29)))x10_regionarray_RectRegion__RRIterator__closure__29(rr)));
    
    //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    this->FMGL(min) = t;
    
    //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    this->FMGL(max) = reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__RRIterator__closure__30)))x10_regionarray_RectRegion__RRIterator__closure__30(rr)));
    
    //#line 400 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    this->FMGL(done) = (::x10aux::struct_equals(::x10aux::nullCheck(rr)->FMGL(size),
                                                ((x10_long)0ll)));
    
    //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    this->FMGL(cur) = ::x10::lang::Rail< x10_long >::_make(this->FMGL(myRank),
                                                           reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion__RRIterator__closure__31)))x10_regionarray_RectRegion__RRIterator__closure__31(t))));
}
::x10::regionarray::RectRegion__RRIterator* x10::regionarray::RectRegion__RRIterator::_make(
  ::x10::regionarray::RectRegion* rr) {
    ::x10::regionarray::RectRegion__RRIterator* this_ = new (::x10aux::alloc_z< ::x10::regionarray::RectRegion__RRIterator>()) ::x10::regionarray::RectRegion__RRIterator();
    this_->_constructor(rr);
    return this_;
}



//#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
x10_boolean x10::regionarray::RectRegion__RRIterator::hasNext(
  ) {
    return !(this->FMGL(done));
    
}

//#line 406 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
::x10::lang::Point* x10::regionarray::RectRegion__RRIterator::next(
  ) {
    
    //#line 407 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    ::x10::lang::Point* ans = ::x10::lang::Point::make(this->FMGL(cur));
    
    //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if (((::x10aux::nullCheck(this->FMGL(cur))->x10::lang::Rail< x10_long >::__apply(
            ((this->FMGL(myRank)) - (((x10_long)1ll))))) < (::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(this->FMGL(max)), 
          ((this->FMGL(myRank)) - (((x10_long)1ll))))))) {
        
        //#line 409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::lang::Rail< x10_long >* a__116611 = this->FMGL(cur);
        x10_long i__116612 = ((this->FMGL(myRank)) - (((x10_long)1ll)));
        x10_long r__116613 = ((::x10aux::nullCheck(a__116611)->x10::lang::Rail< x10_long >::__apply(
                                 i__116612)) + (((x10_long)1ll)));
        ::x10aux::nullCheck(a__116611)->x10::lang::Rail< x10_long >::__set(
          i__116612, r__116613);
    } else 
    //#line 411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    if ((::x10aux::struct_equals(this->FMGL(myRank), ((x10_long)1ll))))
    {
        
        //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this->FMGL(done) = true;
    } else {
        
        //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10aux::nullCheck(this->FMGL(cur))->x10::lang::Rail< x10_long >::__set(
          ((this->FMGL(myRank)) - (((x10_long)1ll))), ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(this->FMGL(min)), 
            ((this->FMGL(myRank)) - (((x10_long)1ll)))));
        
        //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        ::x10::lang::Rail< x10_long >* a__116617 = this->FMGL(cur);
        x10_long i__116618 = ((this->FMGL(myRank)) - (((x10_long)2ll)));
        x10_long r__116619 = ((::x10aux::nullCheck(a__116617)->x10::lang::Rail< x10_long >::__apply(
                                 i__116618)) + (((x10_long)1ll)));
        ::x10aux::nullCheck(a__116617)->x10::lang::Rail< x10_long >::__set(
          i__116618, r__116619);
        
        //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        x10_long carryRank = ((this->FMGL(myRank)) - (((x10_long)2ll)));
        
        //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        while ((((carryRank) > (((x10_long)0ll))) && ((::x10aux::nullCheck(this->FMGL(cur))->x10::lang::Rail< x10_long >::__apply(
                                                         carryRank)) > (::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(this->FMGL(max)), 
                 carryRank))))) {
            
            //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            ::x10aux::nullCheck(this->FMGL(cur))->x10::lang::Rail< x10_long >::__set(
              carryRank, ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(this->FMGL(min)), 
                carryRank));
            
            //#line 420 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            ::x10::lang::Rail< x10_long >* a__116614 = this->FMGL(cur);
            x10_long i__116615 = ((carryRank) - (((x10_long)(((x10_int)1)))));
            x10_long r__116616 = ((::x10aux::nullCheck(a__116614)->x10::lang::Rail< x10_long >::__apply(
                                     i__116615)) + (((x10_long)1ll)));
            ::x10aux::nullCheck(a__116614)->x10::lang::Rail< x10_long >::__set(
              i__116615, r__116616);
            
            //#line 421 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            carryRank = ((carryRank) - (((x10_long)1ll)));
        }
        
        //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (((::x10aux::struct_equals(carryRank, ((x10_long)0ll))) &&
            ((::x10aux::nullCheck(this->FMGL(cur))->x10::lang::Rail< x10_long >::__apply(
                ((x10_long)0ll))) > (::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(this->FMGL(max)), 
              ((x10_long)0ll)))))) {
            
            //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            this->FMGL(done) = true;
        }
        
    }
    
    //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    return ans;
    
}

//#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
::x10::regionarray::RectRegion__RRIterator* x10::regionarray::RectRegion__RRIterator::x10__regionarray__RectRegion__RRIterator____this__x10__regionarray__RectRegion__RRIterator(
  ) {
    return this;
    
}
void x10::regionarray::RectRegion__RRIterator::__fieldInitializers_x10_regionarray_RectRegion_RRIterator(
  ) {
    this->FMGL(done) = false;
}
const ::x10aux::serialization_id_t x10::regionarray::RectRegion__RRIterator::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::RectRegion__RRIterator::_deserializer);

void x10::regionarray::RectRegion__RRIterator::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(min));
    buf.write(this->FMGL(max));
    buf.write(this->FMGL(done));
    buf.write(this->FMGL(cur));
    buf.write(this->FMGL(myRank));
    
}

::x10::lang::Reference* ::x10::regionarray::RectRegion__RRIterator::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::RectRegion__RRIterator* this_ = new (::x10aux::alloc_z< ::x10::regionarray::RectRegion__RRIterator>()) ::x10::regionarray::RectRegion__RRIterator();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::RectRegion__RRIterator::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(min) = buf.read< ::x10::lang::Fun_0_1<x10_long, x10_long>*>();
    FMGL(max) = buf.read< ::x10::lang::Fun_0_1<x10_long, x10_long>*>();
    FMGL(done) = buf.read<x10_boolean>();
    FMGL(cur) = buf.read< ::x10::lang::Rail< x10_long >*>();
    FMGL(myRank) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::regionarray::RectRegion__RRIterator::rtt;
void x10::regionarray::RectRegion__RRIterator::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Iterator< ::x10::lang::Point*> >()};
    rtt.initStageTwo("x10.regionarray.RectRegion.RRIterator",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__RRIterator__closure__29>x10_regionarray_RectRegion__RRIterator__closure__29::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__RRIterator__closure__29::__apply, &x10_regionarray_RectRegion__RRIterator__closure__29::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__RRIterator__closure__29::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__RRIterator__closure__29::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__RRIterator__closure__29::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__RRIterator__closure__29::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__RRIterator__closure__30>x10_regionarray_RectRegion__RRIterator__closure__30::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__RRIterator__closure__30::__apply, &x10_regionarray_RectRegion__RRIterator__closure__30::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__RRIterator__closure__30::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__RRIterator__closure__30::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__RRIterator__closure__30::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__RRIterator__closure__30::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion__RRIterator__closure__31>x10_regionarray_RectRegion__RRIterator__closure__31::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion__RRIterator__closure__31::__apply, &x10_regionarray_RectRegion__RRIterator__closure__31::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion__RRIterator__closure__31::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion__RRIterator__closure__31::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion__RRIterator__closure__31::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion__RRIterator__closure__31::_deserialize);

/* END of RectRegion$RRIterator */
/*************************************************/
