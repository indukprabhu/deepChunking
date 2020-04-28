/*************************************************/
/* START of PolyRow */
#include <x10/regionarray/PolyRow.h>

#include <x10/regionarray/ValRow.h>
#include <x10/lang/Long.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Int.h>
#include <x10/lang/Point.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Boolean.h>
#include <x10/regionarray/Row.h>
#include <x10/io/Printer.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_POLYROW__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_POLYROW__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_PolyRow__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_int, x10_int>::itable<x10_regionarray_PolyRow__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(x10_int i) {
        return ((((x10_long)(i))) < (::x10aux::nullCheck(p)->FMGL(rank)))
          ? (((x10_int) (::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                           ((x10_long)(i)))))) : (k);
        
    }
    
    // captured environment
    ::x10::lang::Point* p;
    x10_int k;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->p);
        buf.write(this->k);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_PolyRow__closure__1* storage = ::x10aux::alloc_z<x10_regionarray_PolyRow__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::Point* that_p = buf.read< ::x10::lang::Point*>();
        x10_int that_k = buf.read<x10_int>();
        x10_regionarray_PolyRow__closure__1* this_ = new (storage) x10_regionarray_PolyRow__closure__1(that_p, that_k);
        return this_;
    }
    
    x10_regionarray_PolyRow__closure__1(::x10::lang::Point* p, x10_int k) : p(p), k(k) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10:37";
    }

};

#endif // X10_REGIONARRAY_POLYROW__CLOSURE__1_CLOSURE
#ifndef X10_REGIONARRAY_POLYROW__CLOSURE__2_CLOSURE
#define X10_REGIONARRAY_POLYROW__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_PolyRow__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_int>::itable<x10_regionarray_PolyRow__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(x10_long i) {
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        return ((((x10_long)(((x10_int) (i))))) < (saved_this->FMGL(rank)))
          ? ((-(saved_this->__apply(((x10_int) (i)))))) : ((((-(saved_this->__apply(
                                                                  ((x10_int) (saved_this->FMGL(rank))))))) + (((x10_int)1))));
        
    }
    
    // captured environment
    ::x10::regionarray::PolyRow* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_PolyRow__closure__2* storage = ::x10aux::alloc_z<x10_regionarray_PolyRow__closure__2>();
        buf.record_reference(storage);
        ::x10::regionarray::PolyRow* that_saved_this = buf.read< ::x10::regionarray::PolyRow*>();
        x10_regionarray_PolyRow__closure__2* this_ = new (storage) x10_regionarray_PolyRow__closure__2(that_saved_this);
        return this_;
    }
    
    x10_regionarray_PolyRow__closure__2(::x10::regionarray::PolyRow* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10:116";
    }

};

#endif // X10_REGIONARRAY_POLYROW__CLOSURE__2_CLOSURE

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
::x10::lang::Fun_0_1<x10_int, x10_int>::itable< ::x10::regionarray::PolyRow >  x10::regionarray::PolyRow::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::ValRow::__apply, &::x10::regionarray::Row::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::PolyRow >  x10::regionarray::PolyRow::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Row::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::PolyRow::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, x10_int> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::PolyRow")};

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
void x10::regionarray::PolyRow::_constructor(::x10::lang::Rail< x10_int >* as_) {
    (this)->::x10::regionarray::PolyRow::_constructor(as_, (((x10_long)(::x10aux::nullCheck(as_)->FMGL(size))) - (((x10_long)1ll))));
    
}
::x10::regionarray::PolyRow* x10::regionarray::PolyRow::_make(::x10::lang::Rail< x10_int >* as_)
{
    ::x10::regionarray::PolyRow* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PolyRow>()) ::x10::regionarray::PolyRow();
    this_->_constructor(as_);
    return this_;
}



//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
void x10::regionarray::PolyRow::_constructor(::x10::lang::Rail< x10_int >* as_,
                                             x10_long n) {
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    (this)->::x10::regionarray::ValRow::_constructor(as_);
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    FMGL(rank) = n;
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    ::x10::regionarray::PolyRow* this__116129 = this;
    
}
::x10::regionarray::PolyRow* x10::regionarray::PolyRow::_make(::x10::lang::Rail< x10_int >* as_,
                                                              x10_long n)
{
    ::x10::regionarray::PolyRow* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PolyRow>()) ::x10::regionarray::PolyRow();
    this_->_constructor(as_, n);
    return this_;
}



//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
void x10::regionarray::PolyRow::_constructor(::x10::lang::Point* p,
                                             x10_int k) {
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    (this)->::x10::regionarray::ValRow::_constructor(((x10_int) (((::x10aux::nullCheck(p)->FMGL(rank)) + (((x10_long)1ll))))),
                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_int, x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_int, x10_int> >(sizeof(x10_regionarray_PolyRow__closure__1)))x10_regionarray_PolyRow__closure__1(p, k))));
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    FMGL(rank) = ::x10aux::nullCheck(p)->FMGL(rank);
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    ::x10::regionarray::PolyRow* this__116130 = this;
    
}
::x10::regionarray::PolyRow* x10::regionarray::PolyRow::_make(
  ::x10::lang::Point* p, x10_int k) {
    ::x10::regionarray::PolyRow* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PolyRow>()) ::x10::regionarray::PolyRow();
    this_->_constructor(p, k);
    return this_;
}



//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
void x10::regionarray::PolyRow::_constructor(x10_int cols,
                                             ::x10::lang::Fun_0_1<x10_int, x10_int>* init) {
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    (this)->::x10::regionarray::ValRow::_constructor(cols,
                                                     init);
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    x10_int cols1 = ((cols) - (((x10_int)1)));
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    FMGL(rank) = ((x10_long)(cols1));
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    ::x10::regionarray::PolyRow* this__116131 = this;
    
}
::x10::regionarray::PolyRow* x10::regionarray::PolyRow::_make(
  x10_int cols, ::x10::lang::Fun_0_1<x10_int, x10_int>* init)
{
    ::x10::regionarray::PolyRow* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PolyRow>()) ::x10::regionarray::PolyRow();
    this_->_constructor(cols, init);
    return this_;
}



//#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
x10_int x10::regionarray::PolyRow::compare(::x10::regionarray::Row* a,
                                           ::x10::regionarray::Row* b) {
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    {
        x10_int i;
        for (i = ((x10_int)0); ((i) < (::x10aux::nullCheck(a)->FMGL(cols)));
             i = ((i) + (((x10_int)1)))) {
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if (((::x10aux::nullCheck(a)->__apply(i)) < (::x10aux::nullCheck(b)->__apply(
                                                           i))))
            {
                
                //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                return ((x10_int)-1);
                
            } else 
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if (((::x10aux::nullCheck(a)->__apply(i)) > (::x10aux::nullCheck(b)->__apply(
                                                           i))))
            {
                
                //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                return ((x10_int)1);
                
            }
            
        }
    }
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    return ((x10_int)0);
    
}

//#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
x10_boolean x10::regionarray::PolyRow::isParallel(::x10::regionarray::PolyRow* that) {
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    {
        x10_int i;
        for (i = ((x10_int)0); ((i) < (((this->FMGL(cols)) - (((x10_int)1)))));
             i = ((i) + (((x10_int)1)))) {
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if ((!::x10aux::struct_equals(this->__apply(i),
                                          ::x10aux::nullCheck(that)->__apply(
                                            i)))) {
                
                //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                return false;
                
            }
            
        }
    }
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    return true;
    
}

//#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
x10_boolean x10::regionarray::PolyRow::isRect() {
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    x10_boolean nz = false;
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    {
        x10_int i;
        for (i = ((x10_int)0); ((i) < (((this->FMGL(cols)) - (((x10_int)1)))));
             i = ((i) + (((x10_int)1)))) {
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if ((!::x10aux::struct_equals(this->__apply(i),
                                          ((x10_int)0))))
            {
                
                //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                if (nz) {
                    return false;
                    
                }
                
                //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                nz = true;
            }
            
        }
    }
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    return true;
    
}

//#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
x10_boolean x10::regionarray::PolyRow::contains(::x10::lang::Point* p) {
    
    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    x10_int sum = this->__apply(((x10_int) (this->FMGL(rank))));
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    {
        x10_int i;
        for (i = ((x10_int)0); ((((x10_long)(i))) < (this->FMGL(rank)));
             i = ((i) + (((x10_int)1)))) {
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            sum = (::x10aux::class_cast_unchecked<x10_int>(((((x10_long)(sum))) + (((((x10_long)(this->__apply(
                                                                                                   i)))) * (::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                                                                                                              ((x10_long)(i)))))))));
        }
    }
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    return ((sum) <= (((x10_int)0)));
    
}

//#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
::x10::regionarray::PolyRow* x10::regionarray::PolyRow::complement(
  ) {
    
    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    ::x10::lang::Rail< x10_int >* as_ = ::x10::lang::Rail< x10_int >::_make(((this->FMGL(rank)) + (((x10_long)(((x10_int)1))))),
                                                                            reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_int> >(sizeof(x10_regionarray_PolyRow__closure__2)))x10_regionarray_PolyRow__closure__2(this))));
    
    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    ::x10::regionarray::PolyRow* alloc__116133 =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyRow>()) ::x10::regionarray::PolyRow());
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    ::x10::lang::Rail< x10_int >* as___116132 = as_;
    (alloc__116133)->::x10::regionarray::PolyRow::_constructor(
      as___116132, (((x10_long)(::x10aux::nullCheck(as___116132)->FMGL(size))) - (((x10_long)1ll))));
    
    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    return alloc__116133;
    
}

//#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
void x10::regionarray::PolyRow::printEqn(::x10::io::Printer* ps,
                                         ::x10::lang::String* spc,
                                         x10_int row) {
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    x10_int sgn = ((x10_int)0);
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    x10_boolean first = true;
    
    //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    {
        x10_int i;
        for (i = ((x10_int)0); ((((x10_long)(i))) < (((((x10_long)(this->FMGL(cols)))) - (((x10_long)1ll)))));
             i = ((i) + (((x10_int)1)))) {
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if ((::x10aux::struct_equals(sgn, ((x10_int)0))))
            {
                
                //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                if (((this->__apply(i)) < (((x10_int)0))))
                {
                    
                    //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    sgn = ((x10_int)-1);
                } else 
                //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                if (((this->__apply(i)) > (((x10_int)0))))
                {
                    
                    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    sgn = ((x10_int)1);
                }
                
            }
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            x10_int c = ((sgn) * (this->__apply(i)));
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if ((::x10aux::struct_equals(c, ((x10_int)1))))
            {
                
                //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                if (first) {
                    
                    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    ::x10aux::nullCheck(ps)->print(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126973 = ::x10aux::makeStringLit("x"); strLit__126973; })), i));
                } else {
                    
                    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    ::x10aux::nullCheck(ps)->print(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126974 = ::x10aux::makeStringLit("+x"); strLit__126974; })), i));
                }
                
            } else 
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if ((::x10aux::struct_equals(c, ((x10_int)-1))))
            {
                
                //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                ::x10aux::nullCheck(ps)->print(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126975 = ::x10aux::makeStringLit("-x"); strLit__126975; })), i));
            } else 
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if ((!::x10aux::struct_equals(c, ((x10_int)0))))
            {
                
                //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                ::x10aux::nullCheck(ps)->print(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((((((x10_long)(c))) >= (((x10_long)0ll))) &&
                                               !(first)) ? ((__extension__ ({ static ::x10::lang::String* strLit__126976 = ::x10aux::makeStringLit("+"); strLit__126976; })))
                                                 : ((__extension__ ({ static ::x10::lang::String* strLit__126977 = ::x10aux::makeStringLit(""); strLit__126977; }))), c), (__extension__ ({ static ::x10::lang::String* strLit__126978 = ::x10aux::makeStringLit("*x"); strLit__126978; }))), i), (__extension__ ({ static ::x10::lang::String* strLit__126979 = ::x10aux::makeStringLit(" "); strLit__126979; }))));
            }
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if ((!::x10aux::struct_equals(c, ((x10_int)0))))
            {
                
                //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                first = false;
            }
            
        }
    }
    
    //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    if (first) {
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        ::x10aux::nullCheck(ps)->print((__extension__ ({ static ::x10::lang::String* strLit__126980 = ::x10aux::makeStringLit("0"); strLit__126980; })));
    }
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    if (((sgn) > (((x10_int)0)))) {
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        ::x10aux::nullCheck(ps)->print(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(spc, (__extension__ ({ static ::x10::lang::String* strLit__126981 = ::x10aux::makeStringLit("<="); strLit__126981; }))), spc), (-(this->__apply(
                                                                                                                                                                                                                                                               ((this->FMGL(cols)) - (((x10_int)1))))))));
    } else {
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        ::x10aux::nullCheck(ps)->print(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(spc, (__extension__ ({ static ::x10::lang::String* strLit__126985 = ::x10aux::makeStringLit(">="); strLit__126985; }))), spc), this->__apply(
                                                                                                                                                                                                                                                            ((this->FMGL(cols)) - (((x10_int)1))))));
    }
    
}

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
::x10::regionarray::PolyRow* x10::regionarray::PolyRow::x10__regionarray__PolyRow____this__x10__regionarray__PolyRow(
  ) {
    return this;
    
}
void x10::regionarray::PolyRow::__fieldInitializers_x10_regionarray_PolyRow(
  ) {
 
}
const ::x10aux::serialization_id_t x10::regionarray::PolyRow::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::PolyRow::_deserializer);

void x10::regionarray::PolyRow::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::regionarray::ValRow::_serialize_body(buf);
    buf.write(this->FMGL(rank));
    
}

::x10::lang::Reference* ::x10::regionarray::PolyRow::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::PolyRow* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PolyRow>()) ::x10::regionarray::PolyRow();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::PolyRow::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::ValRow::_deserialize_body(buf);
    FMGL(rank) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::regionarray::PolyRow::rtt;
void x10::regionarray::PolyRow::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::regionarray::ValRow>()};
    rtt.initStageTwo("x10.regionarray.PolyRow",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_int, x10_int>::itable<x10_regionarray_PolyRow__closure__1>x10_regionarray_PolyRow__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_PolyRow__closure__1::__apply, &x10_regionarray_PolyRow__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_PolyRow__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, x10_int> >, &x10_regionarray_PolyRow__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_PolyRow__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_PolyRow__closure__1::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_int>::itable<x10_regionarray_PolyRow__closure__2>x10_regionarray_PolyRow__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_PolyRow__closure__2::__apply, &x10_regionarray_PolyRow__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_PolyRow__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >, &x10_regionarray_PolyRow__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_PolyRow__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_PolyRow__closure__2::_deserialize);

/* END of PolyRow */
/*************************************************/
