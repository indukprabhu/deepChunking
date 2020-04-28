/*************************************************/
/* START of ValRow */
#include <x10/regionarray/ValRow.h>

#include <x10/regionarray/Row.h>
#include <x10/lang/Int.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Long.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/IllegalOperationException.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_VALROW__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_VALROW__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_ValRow__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_int>::itable<x10_regionarray_ValRow__closure__1> _itable;
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
        x10_regionarray_ValRow__closure__1* storage = ::x10aux::alloc_z<x10_regionarray_ValRow__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_1<x10_int, x10_int>* that_init = buf.read< ::x10::lang::Fun_0_1<x10_int, x10_int>*>();
        x10_regionarray_ValRow__closure__1* this_ = new (storage) x10_regionarray_ValRow__closure__1(that_init);
        return this_;
    }
    
    x10_regionarray_ValRow__closure__1(::x10::lang::Fun_0_1<x10_int, x10_int>* init) : init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10:25";
    }

};

#endif // X10_REGIONARRAY_VALROW__CLOSURE__1_CLOSURE
::x10::lang::Fun_0_1<x10_int, x10_int>::itable< ::x10::regionarray::ValRow >  x10::regionarray::ValRow::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::ValRow::__apply, &::x10::regionarray::Row::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::ValRow >  x10::regionarray::ValRow::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Row::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::ValRow::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, x10_int> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::ValRow")};

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
void x10::regionarray::ValRow::_constructor(::x10::lang::Rail< x10_int >* row) {
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
    ::x10::regionarray::Row* this__116823 = this;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    x10_int cols__116824 = ((x10_int) ((x10_long)(::x10aux::nullCheck(row)->FMGL(size))));
    ::x10aux::nullCheck(this__116823)->FMGL(cols) = cols__116824;
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
    ::x10::regionarray::ValRow* this__116822 = this;
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
    this->FMGL(row) = row;
}
::x10::regionarray::ValRow* x10::regionarray::ValRow::_make(::x10::lang::Rail< x10_int >* row)
{
    ::x10::regionarray::ValRow* this_ = new (::x10aux::alloc_z< ::x10::regionarray::ValRow>()) ::x10::regionarray::ValRow();
    this_->_constructor(row);
    return this_;
}



//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
void x10::regionarray::ValRow::_constructor(x10_int cols, ::x10::lang::Fun_0_1<x10_int, x10_int>* init) {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
    ::x10::regionarray::Row* this__116826 = this;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    x10_int cols__116827 = cols;
    ::x10aux::nullCheck(this__116826)->FMGL(cols) = cols__116827;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
    ::x10::regionarray::ValRow* this__116825 = this;
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
    this->FMGL(row) = ::x10::lang::Rail< x10_int >::_make(((x10_long)(cols)),
                                                          reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_int> >(sizeof(x10_regionarray_ValRow__closure__1)))x10_regionarray_ValRow__closure__1(init))));
}
::x10::regionarray::ValRow* x10::regionarray::ValRow::_make(x10_int cols,
                                                            ::x10::lang::Fun_0_1<x10_int, x10_int>* init)
{
    ::x10::regionarray::ValRow* this_ = new (::x10aux::alloc_z< ::x10::regionarray::ValRow>()) ::x10::regionarray::ValRow();
    this_->_constructor(cols, init);
    return this_;
}



//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
x10_int x10::regionarray::ValRow::__apply(x10_int i) {
    return ::x10aux::nullCheck(this->FMGL(row))->x10::lang::Rail< x10_int >::__apply(
             ((x10_long)(i)));
    
}

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
x10_int x10::regionarray::ValRow::__set(x10_int i, x10_int v) {
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalOperationException::_make((__extension__ ({ static ::x10::lang::String* strLit__127790 = ::x10aux::makeStringLit("ValRow.set"); strLit__127790; })))));
}

//#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
::x10::regionarray::ValRow* x10::regionarray::ValRow::x10__regionarray__ValRow____this__x10__regionarray__ValRow(
  ) {
    return this;
    
}
void x10::regionarray::ValRow::__fieldInitializers_x10_regionarray_ValRow(
  ) {
 
}
const ::x10aux::serialization_id_t x10::regionarray::ValRow::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::ValRow::_deserializer);

void x10::regionarray::ValRow::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::regionarray::Row::_serialize_body(buf);
    buf.write(this->FMGL(row));
    
}

::x10::lang::Reference* ::x10::regionarray::ValRow::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::ValRow* this_ = new (::x10aux::alloc_z< ::x10::regionarray::ValRow>()) ::x10::regionarray::ValRow();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::ValRow::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::Row::_deserialize_body(buf);
    FMGL(row) = buf.read< ::x10::lang::Rail< x10_int >*>();
}

::x10aux::RuntimeType x10::regionarray::ValRow::rtt;
void x10::regionarray::ValRow::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::regionarray::Row>()};
    rtt.initStageTwo("x10.regionarray.ValRow",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_long, x10_int>::itable<x10_regionarray_ValRow__closure__1>x10_regionarray_ValRow__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_ValRow__closure__1::__apply, &x10_regionarray_ValRow__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_ValRow__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >, &x10_regionarray_ValRow__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_ValRow__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_ValRow__closure__1::_deserialize);

/* END of ValRow */
/*************************************************/
