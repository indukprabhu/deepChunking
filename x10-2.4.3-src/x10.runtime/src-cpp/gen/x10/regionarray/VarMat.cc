/*************************************************/
/* START of VarMat */
#include <x10/regionarray/VarMat.h>

#include <x10/regionarray/Mat.h>
#include <x10/regionarray/VarRow.h>
#include <x10/lang/Int.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Long.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Fun_0_2.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_VARMAT__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_VARMAT__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_VarMat__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::VarRow*>::itable<x10_regionarray_VarMat__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::regionarray::VarRow* __apply(x10_long i__116858) {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
        return ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*>::__apply(::x10aux::nullCheck(init), 
          ((x10_int) (i__116858)));
        
    }
    
    // captured environment
    ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*>* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_VarMat__closure__1* storage = ::x10aux::alloc_z<x10_regionarray_VarMat__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*>* that_init = buf.read< ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*>*>();
        x10_regionarray_VarMat__closure__1* this_ = new (storage) x10_regionarray_VarMat__closure__1(that_init);
        return this_;
    }
    
    x10_regionarray_VarMat__closure__1(::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*>* init) : init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::VarRow*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::VarRow*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10:21";
    }

};

#endif // X10_REGIONARRAY_VARMAT__CLOSURE__1_CLOSURE
#ifndef X10_REGIONARRAY_VARMAT__CLOSURE__3_CLOSURE
#define X10_REGIONARRAY_VARMAT__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_VarMat__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_int, x10_int>::itable<x10_regionarray_VarMat__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(x10_int j__116860) {
        return ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>::__apply(::x10aux::nullCheck(init), 
          i, j__116860);
        
    }
    
    // captured environment
    ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>* init;
    x10_int i;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->init);
        buf.write(this->i);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_VarMat__closure__3* storage = ::x10aux::alloc_z<x10_regionarray_VarMat__closure__3>();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>* that_init = buf.read< ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>*>();
        x10_int that_i = buf.read<x10_int>();
        x10_regionarray_VarMat__closure__3* this_ = new (storage) x10_regionarray_VarMat__closure__3(that_init, that_i);
        return this_;
    }
    
    x10_regionarray_VarMat__closure__3(::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>* init, x10_int i) : init(init), i(i) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10:25";
    }

};

#endif // X10_REGIONARRAY_VARMAT__CLOSURE__3_CLOSURE
#ifndef X10_REGIONARRAY_VARMAT__CLOSURE__2_CLOSURE
#define X10_REGIONARRAY_VARMAT__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_VarMat__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*>::itable<x10_regionarray_VarMat__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::regionarray::VarRow* __apply(x10_int i) {
        ::x10::regionarray::VarRow* alloc__116859 =  (new (::x10aux::alloc_z< ::x10::regionarray::VarRow>()) ::x10::regionarray::VarRow());
        (alloc__116859)->::x10::regionarray::VarRow::_constructor(cols, reinterpret_cast< ::x10::lang::Fun_0_1<x10_int, x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_int, x10_int> >(sizeof(x10_regionarray_VarMat__closure__3)))x10_regionarray_VarMat__closure__3(init, i))));
        return alloc__116859;
        
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
        x10_regionarray_VarMat__closure__2* storage = ::x10aux::alloc_z<x10_regionarray_VarMat__closure__2>();
        buf.record_reference(storage);
        x10_int that_cols = buf.read<x10_int>();
        ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>* that_init = buf.read< ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>*>();
        x10_regionarray_VarMat__closure__2* this_ = new (storage) x10_regionarray_VarMat__closure__2(that_cols, that_init);
        return this_;
    }
    
    x10_regionarray_VarMat__closure__2(x10_int cols, ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>* init) : cols(cols), init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10:25";
    }

};

#endif // X10_REGIONARRAY_VARMAT__CLOSURE__2_CLOSURE
#ifndef X10_REGIONARRAY_VARMAT__CLOSURE__4_CLOSURE
#define X10_REGIONARRAY_VARMAT__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_VarMat__closure__4 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*>::itable<x10_regionarray_VarMat__closure__4> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::regionarray::VarRow* __apply(x10_int id__157) {
        ::x10::regionarray::VarRow* alloc__116861 =  (new (::x10aux::alloc_z< ::x10::regionarray::VarRow>()) ::x10::regionarray::VarRow());
        (alloc__116861)->::x10::regionarray::VarRow::_constructor(cols);
        return alloc__116861;
        
    }
    
    // captured environment
    x10_int cols;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->cols);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_VarMat__closure__4* storage = ::x10aux::alloc_z<x10_regionarray_VarMat__closure__4>();
        buf.record_reference(storage);
        x10_int that_cols = buf.read<x10_int>();
        x10_regionarray_VarMat__closure__4* this_ = new (storage) x10_regionarray_VarMat__closure__4(that_cols);
        return this_;
    }
    
    x10_regionarray_VarMat__closure__4(x10_int cols) : cols(cols) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10:29";
    }

};

#endif // X10_REGIONARRAY_VARMAT__CLOSURE__4_CLOSURE
::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*>::itable< ::x10::regionarray::VarMat >  x10::regionarray::VarMat::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Mat< ::x10::regionarray::VarRow*>::__apply, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::VarMat >  x10::regionarray::VarMat::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Iterable< ::x10::regionarray::VarRow*>::itable< ::x10::regionarray::VarMat >  x10::regionarray::VarMat::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Mat< ::x10::regionarray::VarRow*>::iterator, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::VarMat::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::regionarray::VarRow*> >, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::VarMat")};

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
void x10::regionarray::VarMat::_constructor(x10_int cols, ::x10::lang::Rail< ::x10::regionarray::VarRow* >* mat) {
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
    ::x10::regionarray::Mat< ::x10::regionarray::VarRow*>* this__116849 =
      this;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    x10_int rows__116850 = ((x10_int) ((x10_long)(::x10aux::nullCheck(mat)->FMGL(size))));
    x10_int cols__116851 = cols;
    ::x10::lang::Rail< ::x10::regionarray::VarRow* >* mat__116852 = mat;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    ::x10aux::nullCheck(this__116849)->FMGL(rows) = rows__116850;
    ::x10aux::nullCheck(this__116849)->FMGL(cols) = cols__116851;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    ::x10aux::nullCheck(this__116849)->FMGL(mat) = mat__116852;
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
    ::x10::regionarray::VarMat* this__116848 = this;
    
}
::x10::regionarray::VarMat* x10::regionarray::VarMat::_make(x10_int cols,
                                                            ::x10::lang::Rail< ::x10::regionarray::VarRow* >* mat)
{
    ::x10::regionarray::VarMat* this_ = new (::x10aux::alloc_z< ::x10::regionarray::VarMat>()) ::x10::regionarray::VarMat();
    this_->_constructor(cols, mat);
    return this_;
}



//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
void x10::regionarray::VarMat::_constructor(x10_int rows, x10_int cols,
                                            ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*>* init) {
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
    ::x10::regionarray::Mat< ::x10::regionarray::VarRow*>* this__116854 =
      this;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    x10_int rows__116855 = rows;
    x10_int cols__116856 = cols;
    ::x10::lang::Rail< ::x10::regionarray::VarRow* >* mat__116857 =
      ::x10::lang::Rail< ::x10::regionarray::VarRow* >::_make(((x10_long)(rows)),
                                                              reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::VarRow*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::VarRow*> >(sizeof(x10_regionarray_VarMat__closure__1)))x10_regionarray_VarMat__closure__1(init))));
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    ::x10aux::nullCheck(this__116854)->FMGL(rows) = rows__116855;
    ::x10aux::nullCheck(this__116854)->FMGL(cols) = cols__116856;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    ::x10aux::nullCheck(this__116854)->FMGL(mat) = mat__116857;
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
    ::x10::regionarray::VarMat* this__116853 = this;
    
}
::x10::regionarray::VarMat* x10::regionarray::VarMat::_make(
  x10_int rows, x10_int cols, ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*>* init)
{
    ::x10::regionarray::VarMat* this_ = new (::x10aux::alloc_z< ::x10::regionarray::VarMat>()) ::x10::regionarray::VarMat();
    this_->_constructor(rows, cols, init);
    return this_;
}



//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
void x10::regionarray::VarMat::_constructor(x10_int rows,
                                            x10_int cols,
                                            ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>* init) {
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
    (this)->::x10::regionarray::VarMat::_constructor(rows,
                                                     cols,
                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*> >(sizeof(x10_regionarray_VarMat__closure__2)))x10_regionarray_VarMat__closure__2(cols, init))));
    
}
::x10::regionarray::VarMat* x10::regionarray::VarMat::_make(
  x10_int rows, x10_int cols, ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>* init)
{
    ::x10::regionarray::VarMat* this_ = new (::x10aux::alloc_z< ::x10::regionarray::VarMat>()) ::x10::regionarray::VarMat();
    this_->_constructor(rows, cols, init);
    return this_;
}



//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
void x10::regionarray::VarMat::_constructor(x10_int rows,
                                            x10_int cols) {
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
    (this)->::x10::regionarray::VarMat::_constructor(rows,
                                                     cols,
                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*> >(sizeof(x10_regionarray_VarMat__closure__4)))x10_regionarray_VarMat__closure__4(cols))));
    
}
::x10::regionarray::VarMat* x10::regionarray::VarMat::_make(
  x10_int rows, x10_int cols) {
    ::x10::regionarray::VarMat* this_ = new (::x10aux::alloc_z< ::x10::regionarray::VarMat>()) ::x10::regionarray::VarMat();
    this_->_constructor(rows, cols);
    return this_;
}



//#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
::x10::regionarray::VarMat* x10::regionarray::VarMat::x10__regionarray__VarMat____this__x10__regionarray__VarMat(
  ) {
    return this;
    
}
void x10::regionarray::VarMat::__fieldInitializers_x10_regionarray_VarMat(
  ) {
 
}
const ::x10aux::serialization_id_t x10::regionarray::VarMat::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::VarMat::_deserializer);

void x10::regionarray::VarMat::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::regionarray::Mat< ::x10::regionarray::VarRow*>::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::regionarray::VarMat::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::VarMat* this_ = new (::x10aux::alloc_z< ::x10::regionarray::VarMat>()) ::x10::regionarray::VarMat();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::VarMat::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::Mat< ::x10::regionarray::VarRow*>::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::regionarray::VarMat::rtt;
void x10::regionarray::VarMat::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::regionarray::Mat< ::x10::regionarray::VarRow*> >()};
    rtt.initStageTwo("x10.regionarray.VarMat",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::VarRow*>::itable<x10_regionarray_VarMat__closure__1>x10_regionarray_VarMat__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_VarMat__closure__1::__apply, &x10_regionarray_VarMat__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_VarMat__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::VarRow*> >, &x10_regionarray_VarMat__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_VarMat__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_VarMat__closure__1::_deserialize);

::x10::lang::Fun_0_1<x10_int, x10_int>::itable<x10_regionarray_VarMat__closure__3>x10_regionarray_VarMat__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_VarMat__closure__3::__apply, &x10_regionarray_VarMat__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_VarMat__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, x10_int> >, &x10_regionarray_VarMat__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_VarMat__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_VarMat__closure__3::_deserialize);

::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*>::itable<x10_regionarray_VarMat__closure__2>x10_regionarray_VarMat__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_VarMat__closure__2::__apply, &x10_regionarray_VarMat__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_VarMat__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*> >, &x10_regionarray_VarMat__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_VarMat__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_VarMat__closure__2::_deserialize);

::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*>::itable<x10_regionarray_VarMat__closure__4>x10_regionarray_VarMat__closure__4::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_VarMat__closure__4::__apply, &x10_regionarray_VarMat__closure__4::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_VarMat__closure__4::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, ::x10::regionarray::VarRow*> >, &x10_regionarray_VarMat__closure__4::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_VarMat__closure__4::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_VarMat__closure__4::_deserialize);

/* END of VarMat */
/*************************************************/
