/*************************************************/
/* START of VarRow */
#include <x10/regionarray/VarRow.h>

#include <x10/regionarray/Row.h>
#include <x10/lang/Int.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Long.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_VARROW__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_VARROW__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_VarRow__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_int>::itable<x10_regionarray_VarRow__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(x10_long i) {
        return ::x10::lang::Fun_0_1<x10_int, x10_int>::__apply(::x10aux::nullCheck(init), 
          ((x10_int) (i)));
        
    }
    
    // captured environment
    ::x10::lang::Fun_0_1<x10_int, x10_int>* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_VarRow__closure__1* storage = ::x10aux::alloc_z<x10_regionarray_VarRow__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_1<x10_int, x10_int>* that_init = buf.read< ::x10::lang::Fun_0_1<x10_int, x10_int>*>();
        x10_regionarray_VarRow__closure__1* this_ = new (storage) x10_regionarray_VarRow__closure__1(that_init);
        return this_;
    }
    
    x10_regionarray_VarRow__closure__1(::x10::lang::Fun_0_1<x10_int, x10_int>* init) : init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10:20";
    }

};

#endif // X10_REGIONARRAY_VARROW__CLOSURE__1_CLOSURE
::x10::lang::Fun_0_1<x10_int, x10_int>::itable< ::x10::regionarray::VarRow >  x10::regionarray::VarRow::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::VarRow::__apply, &::x10::regionarray::Row::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::VarRow >  x10::regionarray::VarRow::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Row::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::VarRow::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, x10_int> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::VarRow")};

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
void x10::regionarray::VarRow::_constructor(x10_int cols, ::x10::lang::Fun_0_1<x10_int, x10_int>* init) {
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
    ::x10::regionarray::Row* this__116881 = this;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    x10_int cols__116882 = cols;
    ::x10aux::nullCheck(this__116881)->FMGL(cols) = cols__116882;
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
    ::x10::regionarray::VarRow* this__116880 = this;
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
    this->FMGL(row) = ::x10::lang::Rail< x10_int >::_make(((x10_long)(cols)),
                                                          reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_int> >(sizeof(x10_regionarray_VarRow__closure__1)))x10_regionarray_VarRow__closure__1(init))));
}
::x10::regionarray::VarRow* x10::regionarray::VarRow::_make(x10_int cols,
                                                            ::x10::lang::Fun_0_1<x10_int, x10_int>* init)
{
    ::x10::regionarray::VarRow* this_ = new (::x10aux::alloc_z< ::x10::regionarray::VarRow>()) ::x10::regionarray::VarRow();
    this_->_constructor(cols, init);
    return this_;
}



//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
void x10::regionarray::VarRow::_constructor(x10_int cols) {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
    ::x10::regionarray::Row* this__116884 = this;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    x10_int cols__116885 = cols;
    ::x10aux::nullCheck(this__116884)->FMGL(cols) = cols__116885;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
    ::x10::regionarray::VarRow* this__116883 = this;
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
    this->FMGL(row) = ::x10::lang::Rail< x10_int >::_make(((x10_long)(cols)));
}
::x10::regionarray::VarRow* x10::regionarray::VarRow::_make(x10_int cols)
{
    ::x10::regionarray::VarRow* this_ = new (::x10aux::alloc_z< ::x10::regionarray::VarRow>()) ::x10::regionarray::VarRow();
    this_->_constructor(cols);
    return this_;
}



//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
::x10::lang::Rail< x10_int >* x10::regionarray::VarRow::row() {
    return this->FMGL(row);
    
}

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
x10_int x10::regionarray::VarRow::__apply(x10_int i) {
    return ::x10aux::nullCheck((__extension__ ({
               ::x10::regionarray::VarRow* this__116878 = this;
               ::x10aux::nullCheck(this__116878)->FMGL(row);
           }))
           )->x10::lang::Rail< x10_int >::__apply(((x10_long)(i)));
    
}

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
x10_int x10::regionarray::VarRow::__set(x10_int i, x10_int v) {
    return ::x10aux::nullCheck((__extension__ ({
               ::x10::regionarray::VarRow* this__116879 = this;
               ::x10aux::nullCheck(this__116879)->FMGL(row);
           }))
           )->x10::lang::Rail< x10_int >::__set(((x10_long)(i)), v);
    
}

//#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
::x10::regionarray::VarRow* x10::regionarray::VarRow::x10__regionarray__VarRow____this__x10__regionarray__VarRow(
  ) {
    return this;
    
}
void x10::regionarray::VarRow::__fieldInitializers_x10_regionarray_VarRow(
  ) {
 
}
const ::x10aux::serialization_id_t x10::regionarray::VarRow::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::VarRow::_deserializer);

void x10::regionarray::VarRow::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::regionarray::Row::_serialize_body(buf);
    buf.write(this->FMGL(row));
    
}

::x10::lang::Reference* ::x10::regionarray::VarRow::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::VarRow* this_ = new (::x10aux::alloc_z< ::x10::regionarray::VarRow>()) ::x10::regionarray::VarRow();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::VarRow::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::Row::_deserialize_body(buf);
    FMGL(row) = buf.read< ::x10::lang::Rail< x10_int >*>();
}

::x10aux::RuntimeType x10::regionarray::VarRow::rtt;
void x10::regionarray::VarRow::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::regionarray::Row>()};
    rtt.initStageTwo("x10.regionarray.VarRow",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_long, x10_int>::itable<x10_regionarray_VarRow__closure__1>x10_regionarray_VarRow__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_VarRow__closure__1::__apply, &x10_regionarray_VarRow__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_VarRow__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >, &x10_regionarray_VarRow__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_VarRow__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_VarRow__closure__1::_deserialize);

/* END of VarRow */
/*************************************************/
