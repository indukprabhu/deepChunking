/*************************************************/
/* START of PolyMat */
#include <x10/regionarray/PolyMat.h>

#include <x10/regionarray/Mat.h>
#include <x10/regionarray/PolyRow.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Long.h>
#include <x10/lang/Int.h>
#include <x10/lang/Fun_0_2.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/regionarray/PolyMatBuilder.h>
#include <x10/lang/Iterator.h>
#include <x10/regionarray/MatBuilder.h>
#include <x10/regionarray/Row.h>
#include <x10/regionarray/ValRow.h>
#include <x10/lang/String.h>
#include <x10/regionarray/UnboundedRegionException.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_POLYMAT__CLOSURE__2_CLOSURE
#define X10_REGIONARRAY_POLYMAT__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_PolyMat__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_int, x10_int>::itable<x10_regionarray_PolyMat__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(x10_int j__114949) {
        return ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>::__apply(::x10aux::nullCheck(init), 
          ((x10_int) (i__114955)), j__114949);
        
    }
    
    // captured environment
    ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>* init;
    x10_long i__114955;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->init);
        buf.write(this->i__114955);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_PolyMat__closure__2* storage = ::x10aux::alloc_z<x10_regionarray_PolyMat__closure__2>();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>* that_init = buf.read< ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>*>();
        x10_long that_i__114955 = buf.read<x10_long>();
        x10_regionarray_PolyMat__closure__2* this_ = new (storage) x10_regionarray_PolyMat__closure__2(that_init, that_i__114955);
        return this_;
    }
    
    x10_regionarray_PolyMat__closure__2(::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>* init, x10_long i__114955) : init(init), i__114955(i__114955) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10:40";
    }

};

#endif // X10_REGIONARRAY_POLYMAT__CLOSURE__2_CLOSURE
#ifndef X10_REGIONARRAY_POLYMAT__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_POLYMAT__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_PolyMat__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::PolyRow*>::itable<x10_regionarray_PolyMat__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::regionarray::PolyRow* __apply(x10_long i__114955) {
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        ::x10::regionarray::PolyRow* alloc__114948 =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyRow>()) ::x10::regionarray::PolyRow());
        (alloc__114948)->::x10::regionarray::PolyRow::_constructor(cols, reinterpret_cast< ::x10::lang::Fun_0_1<x10_int, x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_int, x10_int> >(sizeof(x10_regionarray_PolyMat__closure__2)))x10_regionarray_PolyMat__closure__2(init, i__114955))));
        return alloc__114948;
        
    }
    
    // captured environment
    x10_int cols;
    ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->cols);
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_PolyMat__closure__1* storage = ::x10aux::alloc_z<x10_regionarray_PolyMat__closure__1>();
        buf.record_reference(storage);
        x10_int that_cols = buf.read<x10_int>();
        ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>* that_init = buf.read< ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>*>();
        x10_regionarray_PolyMat__closure__1* this_ = new (storage) x10_regionarray_PolyMat__closure__1(that_cols, that_init);
        return this_;
    }
    
    x10_regionarray_PolyMat__closure__1(x10_int cols, ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>* init) : cols(cols), init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::PolyRow*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::PolyRow*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10:40";
    }

};

#endif // X10_REGIONARRAY_POLYMAT__CLOSURE__1_CLOSURE
#ifndef X10_REGIONARRAY_POLYMAT__CLOSURE__3_CLOSURE
#define X10_REGIONARRAY_POLYMAT__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_PolyMat__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_int>::itable<x10_regionarray_PolyMat__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(x10_long i__114957) {
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        return as_->x10::lang::Rail< x10_int >::__apply(i__114957);
        
    }
    
    // captured environment
    ::x10::lang::Rail< x10_int >* as_;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->as_);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_PolyMat__closure__3* storage = ::x10aux::alloc_z<x10_regionarray_PolyMat__closure__3>();
        buf.record_reference(storage);
        ::x10::lang::Rail< x10_int >* that_as_ = buf.read< ::x10::lang::Rail< x10_int >*>();
        x10_regionarray_PolyMat__closure__3* this_ = new (storage) x10_regionarray_PolyMat__closure__3(that_as_);
        return this_;
    }
    
    x10_regionarray_PolyMat__closure__3(::x10::lang::Rail< x10_int >* as_) : as_(as_) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10:145";
    }

};

#endif // X10_REGIONARRAY_POLYMAT__CLOSURE__3_CLOSURE
#ifndef X10_REGIONARRAY_POLYMAT__CLOSURE__4_CLOSURE
#define X10_REGIONARRAY_POLYMAT__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_PolyMat__closure__4 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_int>::itable<x10_regionarray_PolyMat__closure__4> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(x10_long i) {
        return saved_this->rectMin(((x10_int) (i)));
        
    }
    
    // captured environment
    ::x10::regionarray::PolyMat* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_PolyMat__closure__4* storage = ::x10aux::alloc_z<x10_regionarray_PolyMat__closure__4>();
        buf.record_reference(storage);
        ::x10::regionarray::PolyMat* that_saved_this = buf.read< ::x10::regionarray::PolyMat*>();
        x10_regionarray_PolyMat__closure__4* this_ = new (storage) x10_regionarray_PolyMat__closure__4(that_saved_this);
        return this_;
    }
    
    x10_regionarray_PolyMat__closure__4(::x10::regionarray::PolyMat* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10:198";
    }

};

#endif // X10_REGIONARRAY_POLYMAT__CLOSURE__4_CLOSURE
#ifndef X10_REGIONARRAY_POLYMAT__CLOSURE__5_CLOSURE
#define X10_REGIONARRAY_POLYMAT__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_PolyMat__closure__5 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_int>::itable<x10_regionarray_PolyMat__closure__5> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(x10_long i) {
        return saved_this->rectMax(((x10_int) (i)));
        
    }
    
    // captured environment
    ::x10::regionarray::PolyMat* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_PolyMat__closure__5* storage = ::x10aux::alloc_z<x10_regionarray_PolyMat__closure__5>();
        buf.record_reference(storage);
        ::x10::regionarray::PolyMat* that_saved_this = buf.read< ::x10::regionarray::PolyMat*>();
        x10_regionarray_PolyMat__closure__5* this_ = new (storage) x10_regionarray_PolyMat__closure__5(that_saved_this);
        return this_;
    }
    
    x10_regionarray_PolyMat__closure__5(::x10::regionarray::PolyMat* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10:200";
    }

};

#endif // X10_REGIONARRAY_POLYMAT__CLOSURE__5_CLOSURE

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::PolyRow*>::itable< ::x10::regionarray::PolyMat >  x10::regionarray::PolyMat::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Mat< ::x10::regionarray::PolyRow*>::__apply, &x10::regionarray::PolyMat::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::PolyMat >  x10::regionarray::PolyMat::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::PolyMat::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Iterable< ::x10::regionarray::PolyRow*>::itable< ::x10::regionarray::PolyMat >  x10::regionarray::PolyMat::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Mat< ::x10::regionarray::PolyRow*>::iterator, &x10::regionarray::PolyMat::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::PolyMat::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::PolyRow*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::regionarray::PolyRow*> >, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::PolyMat")};

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
void x10::regionarray::PolyMat::_constructor(x10_int rows, x10_int cols, ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>* init,
                                             x10_boolean isSimplified) {
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    ::x10::regionarray::Mat< ::x10::regionarray::PolyRow*>* this__114951 =
      this;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    x10_int rows__114952 = rows;
    x10_int cols__114953 = cols;
    ::x10::lang::Rail< ::x10::regionarray::PolyRow* >* mat__114954 =
      ::x10::lang::Rail< ::x10::regionarray::PolyRow* >::_make(((x10_long)(rows)),
                                                               reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::PolyRow*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::PolyRow*> >(sizeof(x10_regionarray_PolyMat__closure__1)))x10_regionarray_PolyMat__closure__1(cols, init))));
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    ::x10aux::nullCheck(this__114951)->FMGL(rows) = rows__114952;
    ::x10aux::nullCheck(this__114951)->FMGL(cols) = cols__114953;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    ::x10aux::nullCheck(this__114951)->FMGL(mat) = mat__114954;
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    x10_int cols1 = ((cols) - (((x10_int)1)));
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    FMGL(rank) = ((x10_long)(cols1));
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    ::x10::regionarray::PolyMat* this__114950 = this;
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    this->FMGL(isSimplified) = isSimplified;
}
::x10::regionarray::PolyMat* x10::regionarray::PolyMat::_make(
  x10_int rows, x10_int cols, ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>* init,
  x10_boolean isSimplified) {
    ::x10::regionarray::PolyMat* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PolyMat>()) ::x10::regionarray::PolyMat();
    this_->_constructor(rows, cols, init, isSimplified);
    return this_;
}



//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
::x10::regionarray::PolyMat* x10::regionarray::PolyMat::simplifyParallel(
  ) {
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    if ((::x10aux::struct_equals(this->FMGL(rows), ((x10_int)0))))
    {
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        return this;
        
    }
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    ::x10::regionarray::PolyMatBuilder* pmb =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyMatBuilder>()) ::x10::regionarray::PolyMatBuilder());
    (pmb)->::x10::regionarray::PolyMatBuilder::_constructor(
      this->FMGL(rank));
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    ::x10::regionarray::PolyRow* last = ::x10aux::class_cast_unchecked< ::x10::regionarray::PolyRow*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    {
        ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>* next__114890;
        for (next__114890 = this->iterator(); ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::hasNext(::x10aux::nullCheck(next__114890));
             ) {
            ::x10::regionarray::PolyRow* next = ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::next(::x10aux::nullCheck(next__114890));
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (((!::x10aux::struct_equals(last, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) &&
                !(::x10aux::nullCheck(next)->isParallel(last))))
            {
                
                //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                pmb->add(reinterpret_cast< ::x10::regionarray::Row*>(last));
            }
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            last = next;
        }
    }
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    pmb->add(reinterpret_cast< ::x10::regionarray::Row*>(last));
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    return pmb->toSortedPolyMat(false);
    
}

//#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
::x10::regionarray::PolyMat* x10::regionarray::PolyMat::simplifyAll(
  ) {
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    if (this->FMGL(isSimplified)) {
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        return this;
        
    }
    
    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    ::x10::regionarray::PolyMatBuilder* pmb =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyMatBuilder>()) ::x10::regionarray::PolyMatBuilder());
    (pmb)->::x10::regionarray::PolyMatBuilder::_constructor(
      this->FMGL(rank));
    
    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    ::x10::lang::Rail< x10_boolean >* removed = ::x10::lang::Rail< x10_boolean >::_make(((x10_long)(this->FMGL(rows))),
                                                                                        false);
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    {
        x10_int i;
        for (i = ((x10_int)0); ((i) < (this->FMGL(rows)));
             i = ((i) + (((x10_int)1)))) {
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            ::x10::regionarray::PolyRow* r = this->__apply(
                                               i);
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            ::x10::regionarray::PolyMatBuilder* trial =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyMatBuilder>()) ::x10::regionarray::PolyMatBuilder());
            (trial)->::x10::regionarray::PolyMatBuilder::_constructor(
              this->FMGL(rank));
            
            //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            {
                x10_int j;
                for (j = ((x10_int)0); ((j) < (this->FMGL(rows)));
                     j = ((j) + (((x10_int)1)))) {
                    
                    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    if (!(removed->x10::lang::Rail< x10_boolean >::__apply(
                            ((x10_long)(j))))) {
                        
                        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        trial->add(reinterpret_cast< ::x10::regionarray::Row*>((::x10aux::struct_equals(i,
                                                                                                        j))
                                     ? (::x10aux::nullCheck(r)->complement())
                                     : (this->__apply(j))));
                    }
                    
                }
            }
            
            //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (!(::x10aux::nullCheck(trial->toSortedPolyMat(
                                        false))->isEmpty()))
            {
                
                //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                pmb->add(reinterpret_cast< ::x10::regionarray::Row*>(r));
            } else {
                
                //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                removed->x10::lang::Rail< x10_boolean >::__set(
                  ((x10_long)(i)), true);
            }
            
        }
    }
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    return pmb->toSortedPolyMat(true);
    
}

//#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
::x10::regionarray::PolyMat* x10::regionarray::PolyMat::eliminate(
  x10_int k, x10_boolean simplifyDegenerate) {
    
    //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    ::x10::regionarray::PolyMatBuilder* pmb =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyMatBuilder>()) ::x10::regionarray::PolyMatBuilder());
    (pmb)->::x10::regionarray::PolyMatBuilder::_constructor(
      this->FMGL(rank));
    
    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    {
        ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>* ir__114894;
        for (ir__114894 = this->iterator(); ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::hasNext(::x10aux::nullCheck(ir__114894));
             ) {
            ::x10::regionarray::PolyRow* ir = ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::next(::x10aux::nullCheck(ir__114894));
            
            //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            x10_int ia = ::x10aux::nullCheck(ir)->__apply(
                           k);
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if ((::x10aux::struct_equals(ia, ((x10_int)0))))
            {
                
                //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                pmb->add(reinterpret_cast< ::x10::regionarray::Row*>(ir));
            } else {
                
                //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                {
                    ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>* jr__114892;
                    for (jr__114892 = this->iterator(); ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::hasNext(::x10aux::nullCheck(jr__114892));
                         ) {
                        ::x10::regionarray::PolyRow* jr =
                          ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::next(::x10aux::nullCheck(jr__114892));
                        
                        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        x10_int ja = ::x10aux::nullCheck(jr)->__apply(
                                       k);
                        
                        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        ::x10::lang::Rail< x10_int >* as_ =
                          ::x10::lang::Rail< x10_int >::_make(((this->FMGL(rank)) + (((x10_long)(((x10_int)1))))));
                        
                        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        if ((((ia) > (((x10_int)0))) && ((ja) < (((x10_int)0)))))
                        {
                            
                            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            {
                                x10_int l;
                                for (l = ((x10_int)0); ((((x10_long)(l))) <= (this->FMGL(rank)));
                                     l = ((l) + (((x10_int)1))))
                                {
                                    
                                    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    as_->x10::lang::Rail< x10_int >::__set(
                                      ((x10_long)(l)), ((((ia) * (::x10aux::nullCheck(jr)->__apply(
                                                                    l)))) - (((ja) * (::x10aux::nullCheck(ir)->__apply(
                                                                                        l))))));
                                }
                            }
                            
                        } else 
                        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        if ((((ia) < (((x10_int)0))) && ((ja) > (((x10_int)0)))))
                        {
                            
                            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            {
                                x10_int l;
                                for (l = ((x10_int)0); ((((x10_long)(l))) <= (this->FMGL(rank)));
                                     l = ((l) + (((x10_int)1))))
                                {
                                    
                                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    as_->x10::lang::Rail< x10_int >::__set(
                                      ((x10_long)(l)), ((((ja) * (::x10aux::nullCheck(ir)->__apply(
                                                                    l)))) - (((ia) * (::x10aux::nullCheck(jr)->__apply(
                                                                                        l))))));
                                }
                            }
                            
                        }
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        x10_long lim = simplifyDegenerate
                          ? (this->FMGL(rank)) : (((this->FMGL(rank)) + (((x10_long)(((x10_int)1))))));
                        
                        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        x10_boolean degenerate = true;
                        
                        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        {
                            x10_int l;
                            for (l = ((x10_int)0); ((((x10_long)(l))) < (lim));
                                 l = ((l) + (((x10_int)1))))
                            {
                                
                                //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                if ((!::x10aux::struct_equals(as_->x10::lang::Rail< x10_int >::__apply(
                                                                ((x10_long)(l))),
                                                              ((x10_int)0))))
                                {
                                    
                                    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    degenerate = false;
                                }
                                
                            }
                        }
                        
                        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        if (!(degenerate)) {
                            
                            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            ::x10::regionarray::PolyRow* r =
                               (new (::x10aux::alloc_z< ::x10::regionarray::PolyRow>()) ::x10::regionarray::PolyRow());
                            
                            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                            ::x10::lang::Rail< x10_int >* as___114956 =
                              ::x10::lang::Rail< x10_int >::_make((x10_long)(::x10aux::nullCheck(as_)->FMGL(size)),
                                                                  reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_int> >(sizeof(x10_regionarray_PolyMat__closure__3)))x10_regionarray_PolyMat__closure__3(as_))));
                            (r)->::x10::regionarray::PolyRow::_constructor(
                              as___114956, (((x10_long)(::x10aux::nullCheck(as___114956)->FMGL(size))) - (((x10_long)1ll))));
                            
                            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            pmb->add(reinterpret_cast< ::x10::regionarray::Row*>(r));
                        }
                        
                    }
                }
                
            }
            
        }
    }
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    return ::x10aux::nullCheck(pmb->toSortedPolyMat(false))->simplifyParallel();
    
}

//#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
x10_boolean x10::regionarray::PolyMat::isRect() {
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    {
        ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>* r__114896;
        for (r__114896 = this->iterator(); ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::hasNext(::x10aux::nullCheck(r__114896));
             ) {
            ::x10::regionarray::PolyRow* r = ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::next(::x10aux::nullCheck(r__114896));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (!(::x10aux::nullCheck(r)->isRect())) {
                
                //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                return false;
                
            }
            
        }
    }
    
    //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    return true;
    
}

//#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
x10_int x10::regionarray::PolyMat::rectMin(x10_int axis) {
    
    //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    {
        ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>* r__114898;
        for (r__114898 = this->iterator(); ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::hasNext(::x10aux::nullCheck(r__114898));
             ) {
            ::x10::regionarray::PolyRow* r = ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::next(::x10aux::nullCheck(r__114898));
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            x10_int a = ::x10aux::nullCheck(r)->__apply(axis);
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (((((x10_long)(a))) < (((x10_long)0ll)))) {
                
                //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                return (((-(::x10aux::nullCheck(r)->__apply(
                              ((x10_int) (this->FMGL(rank))))))) / ::x10aux::zeroCheck(a));
                
            }
            
        }
    }
    
    //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    ::x10::lang::String* msg = ::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126852 = ::x10aux::makeStringLit("axis "); strLit__126852; })), axis), (__extension__ ({ static ::x10::lang::String* strLit__126853 = ::x10aux::makeStringLit(" has no minimum"); strLit__126853; })));
    
    //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::regionarray::UnboundedRegionException::_make(msg)));
}

//#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
x10_int x10::regionarray::PolyMat::rectMax(x10_int axis) {
    
    //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    {
        ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>* r__114900;
        for (r__114900 = this->iterator(); ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::hasNext(::x10aux::nullCheck(r__114900));
             ) {
            ::x10::regionarray::PolyRow* r = ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::next(::x10aux::nullCheck(r__114900));
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            x10_int a = ::x10aux::nullCheck(r)->__apply(axis);
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (((((x10_long)(a))) > (((x10_long)0ll)))) {
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                return (((-(::x10aux::nullCheck(r)->__apply(
                              ((x10_int) (this->FMGL(rank))))))) / ::x10aux::zeroCheck(a));
                
            }
            
        }
    }
    
    //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    ::x10::lang::String* msg = ::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126860 = ::x10aux::makeStringLit("axis "); strLit__126860; })), axis), (__extension__ ({ static ::x10::lang::String* strLit__126861 = ::x10aux::makeStringLit(" has no maximum"); strLit__126861; })));
    
    //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::regionarray::UnboundedRegionException::_make(msg)));
}

//#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
::x10::lang::Rail< x10_int >* x10::regionarray::PolyMat::rectMin(
  ) {
    return ::x10::lang::Rail< x10_int >::_make(this->FMGL(rank),
                                               reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_int> >(sizeof(x10_regionarray_PolyMat__closure__4)))x10_regionarray_PolyMat__closure__4(this))));
    
}

//#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
::x10::lang::Rail< x10_int >* x10::regionarray::PolyMat::rectMax(
  ) {
    return ::x10::lang::Rail< x10_int >::_make(this->FMGL(rank),
                                               reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_int> >(sizeof(x10_regionarray_PolyMat__closure__5)))x10_regionarray_PolyMat__closure__5(this))));
    
}

//#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
x10_boolean x10::regionarray::PolyMat::isZeroBased() {
    
    //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    if (!(this->isRect())) {
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        return false;
        
    }
    
    //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    try {
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        {
            x10_int i;
            for (i = ((x10_int)0); ((((x10_long)(i))) < (this->FMGL(rank)));
                 i = ((i) + (((x10_int)1)))) {
                
                //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                if ((!::x10aux::struct_equals(this->rectMin(
                                                i), ((x10_int)0))))
                {
                    
                    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    return false;
                    
                }
                
            }
        }
        
    }
    catch (::x10::lang::CheckedThrowable* __exc2110) {
        if (::x10aux::instanceof< ::x10::regionarray::UnboundedRegionException*>(__exc2110)) {
            ::x10::regionarray::UnboundedRegionException* e =
              static_cast< ::x10::regionarray::UnboundedRegionException*>(__exc2110);
            {
                
                //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                return false;
                
            }
        } else
        throw;
    }
    
    //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    return true;
    
}

//#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
x10_boolean x10::regionarray::PolyMat::isBounded() {
    
    //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    try {
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        {
            x10_int i;
            for (i = ((x10_int)0); ((((x10_long)(i))) < (this->FMGL(rank)));
                 i = ((i) + (((x10_int)1)))) {
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                this->rectMin(i);
                
                //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                this->rectMax(i);
            }
        }
        
    }
    catch (::x10::lang::CheckedThrowable* __exc2112) {
        if (::x10aux::instanceof< ::x10::regionarray::UnboundedRegionException*>(__exc2112)) {
            ::x10::regionarray::UnboundedRegionException* e =
              static_cast< ::x10::regionarray::UnboundedRegionException*>(__exc2112);
            {
                
                //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                return false;
                
            }
        } else
        throw;
    }
    
    //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    return true;
    
}

//#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
x10_boolean x10::regionarray::PolyMat::isEmpty() {
    
    //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    ::x10::regionarray::PolyMat* pm = this;
    
    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    {
        x10_int i;
        for (i = ((x10_int)0); ((((x10_long)(i))) < (this->FMGL(rank)));
             i = ((i) + (((x10_int)1)))) {
            
            //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            pm = ::x10aux::nullCheck(pm)->eliminate(i, false);
        }
    }
    
    //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    {
        ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>* r__114902;
        for (r__114902 = ::x10aux::nullCheck(pm)->iterator();
             ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::hasNext(::x10aux::nullCheck(r__114902));
             ) {
            ::x10::regionarray::PolyRow* r = ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::next(::x10aux::nullCheck(r__114902));
            
            //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (((((x10_long)(::x10aux::nullCheck(r)->__apply(
                                ((x10_int) (this->FMGL(rank))))))) > (((x10_long)0ll))))
            {
                
                //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                return true;
                
            }
            
        }
    }
    
    //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    return false;
    
}

//#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
::x10::regionarray::PolyMat* x10::regionarray::PolyMat::__or(
  ::x10::regionarray::PolyMat* that) {
    
    //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    ::x10::regionarray::PolyMatBuilder* pmb =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyMatBuilder>()) ::x10::regionarray::PolyMatBuilder());
    (pmb)->::x10::regionarray::PolyMatBuilder::_constructor(
      this->FMGL(rank));
    
    //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    {
        ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>* r__114904;
        for (r__114904 = this->iterator(); ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::hasNext(::x10aux::nullCheck(r__114904));
             ) {
            ::x10::regionarray::PolyRow* r = ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::next(::x10aux::nullCheck(r__114904));
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            pmb->add(reinterpret_cast< ::x10::regionarray::Row*>(r));
        }
    }
    
    //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    {
        ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>* r__114906;
        for (r__114906 = ::x10aux::nullCheck(that)->iterator();
             ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::hasNext(::x10aux::nullCheck(r__114906));
             ) {
            ::x10::regionarray::PolyRow* r = ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::next(::x10aux::nullCheck(r__114906));
            
            //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            pmb->add(reinterpret_cast< ::x10::regionarray::Row*>(r));
        }
    }
    
    //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    return pmb->toSortedPolyMat(false);
    
}

//#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
::x10::lang::String* x10::regionarray::PolyMat::toString(
  ) {
    
    //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    ::x10::lang::String* s = (__extension__ ({ static ::x10::lang::String* strLit__126865 = ::x10aux::makeStringLit("("); strLit__126865; }));
    
    //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    x10_boolean first = true;
    
    //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    {
        ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>* r__114908;
        for (r__114908 = this->iterator(); ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::hasNext(::x10aux::nullCheck(r__114908));
             ) {
            ::x10::regionarray::PolyRow* r = ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::next(::x10aux::nullCheck(r__114908));
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (!(first)) {
                s = ::x10::lang::String::__plus(s, (__extension__ ({ static ::x10::lang::String* strLit__126866 = ::x10aux::makeStringLit(" && "); strLit__126866; })));
            }
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            s = ::x10::lang::String::__plus(s, ::x10aux::nullCheck(r)->toString());
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            first = false;
        }
    }
    
    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    s = ::x10::lang::String::__plus(s, (__extension__ ({ static ::x10::lang::String* strLit__126867 = ::x10aux::makeStringLit(")"); strLit__126867; })));
    
    //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    return s;
    
}

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
::x10::regionarray::PolyMat* x10::regionarray::PolyMat::x10__regionarray__PolyMat____this__x10__regionarray__PolyMat(
  ) {
    return this;
    
}
void x10::regionarray::PolyMat::__fieldInitializers_x10_regionarray_PolyMat(
  ) {
 
}
const ::x10aux::serialization_id_t x10::regionarray::PolyMat::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::PolyMat::_deserializer);

void x10::regionarray::PolyMat::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::regionarray::Mat< ::x10::regionarray::PolyRow*>::_serialize_body(buf);
    buf.write(this->FMGL(isSimplified));
    buf.write(this->FMGL(rank));
    
}

::x10::lang::Reference* ::x10::regionarray::PolyMat::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::PolyMat* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PolyMat>()) ::x10::regionarray::PolyMat();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::PolyMat::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::Mat< ::x10::regionarray::PolyRow*>::_deserialize_body(buf);
    FMGL(isSimplified) = buf.read<x10_boolean>();
    FMGL(rank) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::regionarray::PolyMat::rtt;
void x10::regionarray::PolyMat::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::regionarray::Mat< ::x10::regionarray::PolyRow*> >()};
    rtt.initStageTwo("x10.regionarray.PolyMat",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_int, x10_int>::itable<x10_regionarray_PolyMat__closure__2>x10_regionarray_PolyMat__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_PolyMat__closure__2::__apply, &x10_regionarray_PolyMat__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_PolyMat__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, x10_int> >, &x10_regionarray_PolyMat__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_PolyMat__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_PolyMat__closure__2::_deserialize);

::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::PolyRow*>::itable<x10_regionarray_PolyMat__closure__1>x10_regionarray_PolyMat__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_PolyMat__closure__1::__apply, &x10_regionarray_PolyMat__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_PolyMat__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::PolyRow*> >, &x10_regionarray_PolyMat__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_PolyMat__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_PolyMat__closure__1::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_int>::itable<x10_regionarray_PolyMat__closure__3>x10_regionarray_PolyMat__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_PolyMat__closure__3::__apply, &x10_regionarray_PolyMat__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_PolyMat__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >, &x10_regionarray_PolyMat__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_PolyMat__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_PolyMat__closure__3::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_int>::itable<x10_regionarray_PolyMat__closure__4>x10_regionarray_PolyMat__closure__4::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_PolyMat__closure__4::__apply, &x10_regionarray_PolyMat__closure__4::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_PolyMat__closure__4::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >, &x10_regionarray_PolyMat__closure__4::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_PolyMat__closure__4::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_PolyMat__closure__4::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_int>::itable<x10_regionarray_PolyMat__closure__5>x10_regionarray_PolyMat__closure__5::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_PolyMat__closure__5::__apply, &x10_regionarray_PolyMat__closure__5::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_PolyMat__closure__5::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >, &x10_regionarray_PolyMat__closure__5::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_PolyMat__closure__5::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_PolyMat__closure__5::_deserialize);

/* END of PolyMat */
/*************************************************/
