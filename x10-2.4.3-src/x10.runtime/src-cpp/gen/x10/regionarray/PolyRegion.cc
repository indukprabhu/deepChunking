/*************************************************/
/* START of PolyRegion */
#include <x10/regionarray/PolyRegion.h>

#include <x10/regionarray/Region.h>
#include <x10/lang/Long.h>
#include <x10/regionarray/PolyMat.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Iterator.h>
#include <x10/lang/Point.h>
#include <x10/lang/UnsupportedOperationException.h>
#include <x10/compiler/Incomplete.h>
#include <x10/regionarray/PolyScanner.h>
#include <x10/regionarray/PolyScanner__Anonymous__10018.h>
#include <x10/regionarray/PolyMatBuilder.h>
#include <x10/regionarray/PolyRow.h>
#include <x10/regionarray/Mat.h>
#include <x10/regionarray/MatBuilder.h>
#include <x10/regionarray/Row.h>
#include <x10/regionarray/RectRegion.h>
#include <x10/regionarray/RectRegion1D.h>
#include <x10/lang/String.h>
#include <x10/lang/Int.h>
#include <x10/lang/Rail.h>
#include <x10/regionarray/ValRow.h>
#include <x10/regionarray/EmptyRegion.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/io/Printer.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_POLYREGION__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_POLYREGION__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_PolyRegion__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_PolyRegion__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(t), 
          ((x10_long)(((x10_int) (i)))));
        
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
        x10_regionarray_PolyRegion__closure__1* storage = ::x10aux::alloc_z<x10_regionarray_PolyRegion__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_1<x10_long, x10_long>* that_t = buf.read< ::x10::lang::Fun_0_1<x10_long, x10_long>*>();
        x10_regionarray_PolyRegion__closure__1* this_ = new (storage) x10_regionarray_PolyRegion__closure__1(that_t);
        return this_;
    }
    
    x10_regionarray_PolyRegion__closure__1(::x10::lang::Fun_0_1<x10_long, x10_long>* t) : t(t) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10:312";
    }

};

#endif // X10_REGIONARRAY_POLYREGION__CLOSURE__1_CLOSURE
#ifndef X10_REGIONARRAY_POLYREGION__CLOSURE__2_CLOSURE
#define X10_REGIONARRAY_POLYREGION__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_PolyRegion__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_PolyRegion__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(t), 
          ((x10_long)(((x10_int) (i)))));
        
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
        x10_regionarray_PolyRegion__closure__2* storage = ::x10aux::alloc_z<x10_regionarray_PolyRegion__closure__2>();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_1<x10_long, x10_long>* that_t = buf.read< ::x10::lang::Fun_0_1<x10_long, x10_long>*>();
        x10_regionarray_PolyRegion__closure__2* this_ = new (storage) x10_regionarray_PolyRegion__closure__2(that_t);
        return this_;
    }
    
    x10_regionarray_PolyRegion__closure__2(::x10::lang::Fun_0_1<x10_long, x10_long>* t) : t(t) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10:317";
    }

};

#endif // X10_REGIONARRAY_POLYREGION__CLOSURE__2_CLOSURE
::x10::lang::Iterable< ::x10::lang::Point*>::itable< ::x10::regionarray::PolyRegion >  x10::regionarray::PolyRegion::_itable_0(&::x10::regionarray::Region::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::PolyRegion::iterator, &x10::regionarray::PolyRegion::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::PolyRegion >  x10::regionarray::PolyRegion::_itable_1(&::x10::regionarray::Region::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::PolyRegion::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::PolyRegion::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::PolyRegion")};

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
x10_boolean x10::regionarray::PolyRegion::isConvex() {
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    return true;
    
}

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
x10_long x10::regionarray::PolyRegion::size() {
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    if (((this->FMGL(size)) < (((x10_long)0ll)))) {
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        x10_long s = ((x10_long)0ll);
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        ::x10::lang::Iterator< ::x10::lang::Point*>* it = this->iterator();
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        {
            ::x10::lang::Iterator< ::x10::lang::Point*>* p__115326;
            for (p__115326 = this->iterator(); ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(p__115326));
                 ) {
                ::x10::lang::Point* p = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(p__115326));
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                s = ((s) + (((x10_long)1ll)));
            }
        }
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        this->FMGL(size) = s;
    }
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    return this->FMGL(size);
    
}

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
x10_long x10::regionarray::PolyRegion::indexOf(::x10::lang::Point* id__143) {
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
::x10::lang::Iterator< ::x10::lang::Point*>* x10::regionarray::PolyRegion::iterator(
  ) {
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyScanner* this__116103 = ::x10::regionarray::PolyScanner::make(
                                                      this->FMGL(mat));
    return reinterpret_cast< ::x10::lang::Iterator< ::x10::lang::Point*>*>((__extension__ ({
        
        //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        ::x10::regionarray::PolyScanner__Anonymous__10018* alloc__116104 =
           (new (::x10aux::alloc_z< ::x10::regionarray::PolyScanner__Anonymous__10018>()) ::x10::regionarray::PolyScanner__Anonymous__10018());
        (alloc__116104)->::x10::regionarray::PolyScanner__Anonymous__10018::_constructor(
          this__116103);
        alloc__116104;
    }))
    );
    
}

//#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
::x10::regionarray::Region* x10::regionarray::PolyRegion::intersection(
  ::x10::regionarray::Region* t) {
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    if (::x10aux::instanceof< ::x10::regionarray::PolyRegion*>(t))
    {
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        ::x10::regionarray::PolyRegion* that = ::x10aux::class_cast< ::x10::regionarray::PolyRegion*>(t);
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        ::x10::regionarray::PolyMatBuilder* pmb =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyMatBuilder>()) ::x10::regionarray::PolyMatBuilder());
        (pmb)->::x10::regionarray::PolyMatBuilder::_constructor(
          this->FMGL(rank));
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        {
            ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>* r__115328;
            for (r__115328 = ::x10aux::nullCheck(this->FMGL(mat))->iterator();
                 ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::hasNext(::x10aux::nullCheck(r__115328));
                 ) {
                ::x10::regionarray::PolyRow* r = ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::next(::x10aux::nullCheck(r__115328));
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                pmb->add(reinterpret_cast< ::x10::regionarray::Row*>(r));
            }
        }
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        {
            ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>* r__115330;
            for (r__115330 = ::x10aux::nullCheck(::x10aux::nullCheck(that)->FMGL(mat))->iterator();
                 ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::hasNext(::x10aux::nullCheck(r__115330));
                 ) {
                ::x10::regionarray::PolyRow* r = ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::next(::x10aux::nullCheck(r__115330));
                
                //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                pmb->add(reinterpret_cast< ::x10::regionarray::Row*>(r));
            }
        }
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        ::x10::regionarray::PolyMat* pm = pmb->toSortedPolyMat(
                                            false);
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return ::x10::regionarray::PolyRegion::make(pm);
        
    } else 
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    if (::x10aux::instanceof< ::x10::regionarray::RectRegion*>(t))
    {
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return this->intersection(::x10aux::nullCheck((::x10aux::class_cast< ::x10::regionarray::RectRegion*>(t)))->x10::regionarray::RectRegion::toPolyRegion());
        
    } else 
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    if (::x10aux::instanceof< ::x10::regionarray::RectRegion1D*>(t))
    {
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return this->intersection(::x10aux::nullCheck((::x10aux::class_cast< ::x10::regionarray::RectRegion1D*>(t)))->x10::regionarray::RectRegion1D::toRectRegion()->x10::regionarray::RectRegion::toPolyRegion());
        
    } else {
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126887 = ::x10aux::makeStringLit("intersection("); strLit__126887; })), t), (__extension__ ({ static ::x10::lang::String* strLit__126888 = ::x10aux::makeStringLit(")"); strLit__126888; }))))));
    }
    
}

//#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
x10_boolean x10::regionarray::PolyRegion::contains(::x10::regionarray::Region* that) {
    
    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    return ::x10aux::nullCheck(this->computeBoundingBox())->contains(
             ::x10aux::nullCheck(that)->computeBoundingBox());
    
}

//#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
::x10::regionarray::Region* x10::regionarray::PolyRegion::projection(
  x10_long axis) {
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyMat* pm = this->FMGL(mat);
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    {
        x10_int k;
        for (k = ((x10_int)0); ((((x10_long)(k))) < (this->FMGL(rank)));
             k = ((k) + (((x10_int)1)))) {
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            if ((!::x10aux::struct_equals(k, ((x10_int) (axis)))))
            {
                
                //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                pm = ::x10aux::nullCheck(pm)->eliminate(k,
                                                        true);
            }
            
        }
    }
    
    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_long min__116105 = ((x10_long)(::x10aux::nullCheck(pm)->rectMin(
                                         ((x10_int) (axis)))));
    x10_long max__116106 = ((x10_long)(::x10aux::nullCheck(pm)->rectMax(
                                         ((x10_int) (axis)))));
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    return reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
        
        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        ::x10::regionarray::RectRegion1D* alloc__116107 =
           (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
        (alloc__116107)->::x10::regionarray::RectRegion1D::_constructor(
          min__116105, max__116106);
        alloc__116107;
    }))
    );
    
}

//#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
::x10::regionarray::Region* x10::regionarray::PolyRegion::eliminate(
  x10_long axis) {
    
    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyMat* pm = ::x10aux::nullCheck(this->FMGL(mat))->eliminate(
                                        ((x10_int) (axis)),
                                        true);
    
    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::Region* result = ::x10::regionarray::PolyRegion::make(
                                           pm);
    
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    return result;
    
}

//#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
::x10::regionarray::Region* x10::regionarray::PolyRegion::product(
  ::x10::regionarray::Region* r) {
    
    //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    if (!(::x10aux::instanceof< ::x10::regionarray::PolyRegion*>(r)))
    {
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126896 = ::x10aux::makeStringLit("product("); strLit__126896; })), r), (__extension__ ({ static ::x10::lang::String* strLit__126897 = ::x10aux::makeStringLit(")"); strLit__126897; }))))));
    }
    
    //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyRegion* that = ::x10aux::class_cast< ::x10::regionarray::PolyRegion*>(r);
    
    //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyMatBuilder* pmb =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyMatBuilder>()) ::x10::regionarray::PolyMatBuilder());
    (pmb)->::x10::regionarray::PolyMatBuilder::_constructor(
      ((this->FMGL(rank)) + (::x10aux::nullCheck(that)->FMGL(rank))));
    
    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyRegion::copy(pmb, this->FMGL(mat),
                                         ((x10_int)0));
    
    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyRegion::copy(pmb, ::x10aux::nullCheck(that)->FMGL(mat),
                                         ((x10_int) (this->FMGL(rank))));
    
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyMat* pm = pmb->toSortedPolyMat(
                                        false);
    
    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    return ::x10::regionarray::PolyRegion::make(pm);
    
}

//#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
void x10::regionarray::PolyRegion::copy(::x10::regionarray::PolyMatBuilder* tt,
                                        ::x10::regionarray::PolyMat* ff,
                                        x10_int offset) {
    
    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    {
        ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>* r__115332;
        for (r__115332 = ::x10aux::nullCheck(ff)->iterator();
             ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::hasNext(::x10aux::nullCheck(r__115332));
             ) {
            ::x10::regionarray::PolyRow* r = ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::next(::x10aux::nullCheck(r__115332));
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            ::x10::regionarray::PolyRow* f = r;
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            ::x10::lang::Rail< x10_int >* t = ::x10::lang::Rail< x10_int >::_make(((::x10aux::nullCheck(tt)->FMGL(rank)) + (((x10_long)1ll))));
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            {
                x10_int i;
                for (i = ((x10_int)0); ((((x10_long)(i))) < (::x10aux::nullCheck(ff)->FMGL(rank)));
                     i = ((i) + (((x10_int)1)))) {
                    
                    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    t->x10::lang::Rail< x10_int >::__set(
                      ((x10_long)(((offset) + (i)))), ::x10aux::nullCheck(f)->__apply(
                                                        i));
                }
            }
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            t->x10::lang::Rail< x10_int >::__set(::x10aux::nullCheck(tt)->FMGL(rank),
                                                 ::x10aux::nullCheck(f)->__apply(
                                                   ((x10_int) (::x10aux::nullCheck(ff)->FMGL(rank)))));
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            ::x10aux::nullCheck(tt)->add(reinterpret_cast< ::x10::regionarray::Row*>((__extension__ ({
                                             ::x10::regionarray::PolyRow* alloc__115321 =
                                                (new (::x10aux::alloc_z< ::x10::regionarray::PolyRow>()) ::x10::regionarray::PolyRow());
                                             
                                             //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                                             ::x10::lang::Rail< x10_int >* as___116108 =
                                               t;
                                             (alloc__115321)->::x10::regionarray::PolyRow::_constructor(
                                               as___116108,
                                               (((x10_long)(::x10aux::nullCheck(as___116108)->FMGL(size))) - (((x10_long)1ll))));
                                             alloc__115321;
                                         }))
                                         ));
        }
    }
    
}

//#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
::x10::regionarray::Region* x10::regionarray::PolyRegion::translate(
  ::x10::lang::Point* v) {
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyMatBuilder* pmb =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyMatBuilder>()) ::x10::regionarray::PolyMatBuilder());
    (pmb)->::x10::regionarray::PolyMatBuilder::_constructor(
      this->FMGL(rank));
    
    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyRegion::translate(pmb, this->FMGL(mat),
                                              v);
    
    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyMat* pm = pmb->toSortedPolyMat(
                                        false);
    
    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    return ::x10::regionarray::PolyRegion::make(pm);
    
}

//#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
void x10::regionarray::PolyRegion::translate(::x10::regionarray::PolyMatBuilder* tt,
                                             ::x10::regionarray::PolyMat* ff,
                                             ::x10::lang::Point* v) {
    
    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    {
        ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>* r__115334;
        for (r__115334 = ::x10aux::nullCheck(ff)->iterator();
             ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::hasNext(::x10aux::nullCheck(r__115334));
             ) {
            ::x10::regionarray::PolyRow* r = ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::next(::x10aux::nullCheck(r__115334));
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            ::x10::regionarray::PolyRow* f = r;
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            ::x10::lang::Rail< x10_int >* t = ::x10::lang::Rail< x10_int >::_make(((::x10aux::nullCheck(ff)->FMGL(rank)) + (((x10_long)1ll))));
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            x10_int s = ((x10_int)0);
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            {
                x10_int i;
                for (i = ((x10_int)0); ((((x10_long)(i))) < (::x10aux::nullCheck(ff)->FMGL(rank)));
                     i = ((i) + (((x10_int)1)))) {
                    
                    //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    t->x10::lang::Rail< x10_int >::__set(
                      ((x10_long)(i)), ::x10aux::nullCheck(f)->__apply(
                                         i));
                    
                    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    s = (::x10aux::class_cast_unchecked<x10_int>(((((x10_long)(s))) + (((((x10_long)(::x10aux::nullCheck(f)->__apply(
                                                                                                       i)))) * (::x10aux::nullCheck(v)->x10::lang::Point::__apply(
                                                                                                                  ((x10_long)(i)))))))));
                }
            }
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            t->x10::lang::Rail< x10_int >::__set(::x10aux::nullCheck(ff)->FMGL(rank),
                                                 ((::x10aux::nullCheck(f)->__apply(
                                                     ((x10_int) (::x10aux::nullCheck(ff)->FMGL(rank))))) - (s)));
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            ::x10aux::nullCheck(tt)->add(reinterpret_cast< ::x10::regionarray::Row*>((__extension__ ({
                                             ::x10::regionarray::PolyRow* alloc__115322 =
                                                (new (::x10aux::alloc_z< ::x10::regionarray::PolyRow>()) ::x10::regionarray::PolyRow());
                                             
                                             //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                                             ::x10::lang::Rail< x10_int >* as___116109 =
                                               t;
                                             (alloc__115322)->::x10::regionarray::PolyRow::_constructor(
                                               as___116109,
                                               (((x10_long)(::x10aux::nullCheck(as___116109)->FMGL(size))) - (((x10_long)1ll))));
                                             alloc__115322;
                                         }))
                                         ));
        }
    }
    
}

//#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
x10_boolean x10::regionarray::PolyRegion::isEmpty() {
    
    //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    x10_boolean tmp = ::x10aux::nullCheck(this->FMGL(mat))->isEmpty();
    
    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    return tmp;
    
}

//#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
::x10::regionarray::Region* x10::regionarray::PolyRegion::computeBoundingBox(
  ) {
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::lang::Rail< x10_long >* min = ::x10::lang::Rail< x10_long >::_make(this->FMGL(rank));
    
    //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::lang::Rail< x10_long >* max = ::x10::lang::Rail< x10_long >::_make(this->FMGL(rank));
    
    //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyMat* pm = this->FMGL(mat);
    
    //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    {
        x10_int axis;
        for (axis = ((x10_int)0); ((((x10_long)(axis))) < (this->FMGL(rank)));
             axis = ((axis) + (((x10_int)1)))) {
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            ::x10::regionarray::PolyMat* x = pm;
            
            //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            {
                x10_int k;
                for (k = ((axis) + (((x10_int)1))); ((((x10_long)(k))) < (this->FMGL(rank)));
                     k = ((k) + (((x10_int)1)))) {
                    
                    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    x = ::x10aux::nullCheck(x)->eliminate(
                          k, true);
                }
            }
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            min->x10::lang::Rail< x10_long >::__set(((x10_long)(axis)),
                                                    ((x10_long)(::x10aux::nullCheck(x)->rectMin(
                                                                  axis))));
            
            //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            max->x10::lang::Rail< x10_long >::__set(((x10_long)(axis)),
                                                    ((x10_long)(::x10aux::nullCheck(x)->rectMax(
                                                                  axis))));
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            pm = ::x10aux::nullCheck(pm)->eliminate(axis,
                                                    true);
        }
    }
    
    //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    return ::x10::regionarray::Region::makeRectangular(min,
                                                       max);
    
}

//#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
x10_boolean x10::regionarray::PolyRegion::contains(::x10::lang::Point* p) {
    
    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    {
        ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>* r__115336;
        for (r__115336 = ::x10aux::nullCheck(this->FMGL(mat))->iterator();
             ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::hasNext(::x10aux::nullCheck(r__115336));
             ) {
            ::x10::regionarray::PolyRow* r = ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::next(::x10aux::nullCheck(r__115336));
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            if (!(::x10aux::nullCheck(r)->contains(p))) {
                
                //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                return false;
                
            }
            
        }
    }
    
    //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    return true;
    
}

//#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
/**
     * lower==1 and lower==1 include the diagonal
     * lower==size and upper==size includes entire size x size square
     *
     * col-colMin >= row-rowMin - (lower-1)
     * col-colMin <= row-rowMin + (upper-1)
     *
     * col-row >= colMin-rowMin - (lower-1)
     * col-row <= colMin-rowMin + (upper-1)
     */
x10_int x10::regionarray::PolyRegion::FMGL(ROW);
void x10::regionarray::PolyRegion::FMGL(ROW__do_init)() {
    FMGL(ROW__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::regionarray::PolyRegion.ROW");
    x10_int __var2133__ = ::x10::regionarray::PolyMatBuilder::X(
                            ((x10_int)0));
    FMGL(ROW) = __var2133__;
    FMGL(ROW__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::regionarray::PolyRegion::FMGL(ROW__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(ROW__status), &FMGL(ROW__do_init), &FMGL(ROW__exception), "x10::regionarray::PolyRegion.ROW");
    
}
volatile ::x10aux::StaticInitController::status x10::regionarray::PolyRegion::FMGL(ROW__status);
::x10::lang::CheckedThrowable* x10::regionarray::PolyRegion::FMGL(ROW__exception);

//#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
x10_int x10::regionarray::PolyRegion::FMGL(COL);
void x10::regionarray::PolyRegion::FMGL(COL__do_init)() {
    FMGL(COL__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::regionarray::PolyRegion.COL");
    x10_int __var2134__ = ::x10::regionarray::PolyMatBuilder::X(
                            ((x10_int)1));
    FMGL(COL) = __var2134__;
    FMGL(COL__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::regionarray::PolyRegion::FMGL(COL__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(COL__status), &FMGL(COL__do_init), &FMGL(COL__exception), "x10::regionarray::PolyRegion.COL");
    
}
volatile ::x10aux::StaticInitController::status x10::regionarray::PolyRegion::FMGL(COL__status);
::x10::lang::CheckedThrowable* x10::regionarray::PolyRegion::FMGL(COL__exception);

//#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
::x10::regionarray::Region* x10::regionarray::PolyRegion::makeBanded(
  x10_int rowMin, x10_int colMin, x10_int rowMax, x10_int colMax,
  x10_int upper, x10_int lower) {
    
    //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyMatBuilder* pmb =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyMatBuilder>()) ::x10::regionarray::PolyMatBuilder());
    (pmb)->::x10::regionarray::PolyMatBuilder::_constructor(
      ((x10_long)2ll));
    
    //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    pmb->add(::x10::regionarray::PolyRegion::FMGL(ROW__get)(),
             ((void)(pmb),::x10::regionarray::PolyMatBuilder::FMGL(GE__get)()),
             rowMin);
    
    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    pmb->add(::x10::regionarray::PolyRegion::FMGL(ROW__get)(),
             ((void)(pmb),::x10::regionarray::PolyMatBuilder::FMGL(LE__get)()),
             rowMax);
    
    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    pmb->add(::x10::regionarray::PolyRegion::FMGL(COL__get)(),
             ((void)(pmb),::x10::regionarray::PolyMatBuilder::FMGL(GE__get)()),
             colMin);
    
    //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    pmb->add(::x10::regionarray::PolyRegion::FMGL(COL__get)(),
             ((void)(pmb),::x10::regionarray::PolyMatBuilder::FMGL(LE__get)()),
             colMax);
    
    //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    pmb->add(((::x10::regionarray::PolyRegion::FMGL(COL__get)()) - (::x10::regionarray::PolyRegion::FMGL(ROW__get)())),
             ((void)(pmb),::x10::regionarray::PolyMatBuilder::FMGL(GE__get)()),
             ((((colMin) - (rowMin))) - (((lower) - (((x10_int)1))))));
    
    //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    pmb->add(((::x10::regionarray::PolyRegion::FMGL(COL__get)()) - (::x10::regionarray::PolyRegion::FMGL(ROW__get)())),
             ((void)(pmb),::x10::regionarray::PolyMatBuilder::FMGL(LE__get)()),
             ((((colMin) - (rowMin))) + (((upper) - (((x10_int)1))))));
    
    //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyMat* pm = pmb->toSortedPolyMat(
                                        false);
    
    //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    return ::x10::regionarray::PolyRegion::make(pm);
    
}

//#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
::x10::regionarray::Region* x10::regionarray::PolyRegion::makeBanded(
  x10_int size, x10_int upper, x10_int lower) {
    
    //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    return ::x10::regionarray::PolyRegion::makeBanded(((x10_int)0),
                                                      ((x10_int)0),
                                                      ((size) - (((x10_int)1))),
                                                      ((size) - (((x10_int)1))),
                                                      upper,
                                                      lower);
    
}

//#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
::x10::regionarray::Region* x10::regionarray::PolyRegion::makeUpperTriangular2(
  x10_int rowMin, x10_int colMin, x10_int size) {
    
    //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyMatBuilder* pmb =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyMatBuilder>()) ::x10::regionarray::PolyMatBuilder());
    (pmb)->::x10::regionarray::PolyMatBuilder::_constructor(
      ((x10_long)(((x10_int)2))));
    
    //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    pmb->add(::x10::regionarray::PolyRegion::FMGL(ROW__get)(),
             ((void)(pmb),::x10::regionarray::PolyMatBuilder::FMGL(GE__get)()),
             rowMin);
    
    //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    pmb->add(::x10::regionarray::PolyRegion::FMGL(COL__get)(),
             ((void)(pmb),::x10::regionarray::PolyMatBuilder::FMGL(LE__get)()),
             ((((colMin) + (size))) - (((x10_int)1))));
    
    //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    pmb->add(((::x10::regionarray::PolyRegion::FMGL(COL__get)()) - (::x10::regionarray::PolyRegion::FMGL(ROW__get)())),
             ((void)(pmb),::x10::regionarray::PolyMatBuilder::FMGL(GE__get)()),
             ((colMin) - (rowMin)));
    
    //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyMat* pm = pmb->toSortedPolyMat(
                                        true);
    
    //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    return ::x10::regionarray::PolyRegion::make(pm);
    
}

//#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
::x10::regionarray::Region* x10::regionarray::PolyRegion::makeLowerTriangular2(
  x10_int rowMin, x10_int colMin, x10_int size) {
    
    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyMatBuilder* pmb =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyMatBuilder>()) ::x10::regionarray::PolyMatBuilder());
    (pmb)->::x10::regionarray::PolyMatBuilder::_constructor(
      ((x10_long)(((x10_int)2))));
    
    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    pmb->add(::x10::regionarray::PolyRegion::FMGL(COL__get)(),
             ((void)(pmb),::x10::regionarray::PolyMatBuilder::FMGL(GE__get)()),
             colMin);
    
    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    pmb->add(::x10::regionarray::PolyRegion::FMGL(ROW__get)(),
             ((void)(pmb),::x10::regionarray::PolyMatBuilder::FMGL(LE__get)()),
             ((((rowMin) + (size))) - (((x10_int)1))));
    
    //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    pmb->add(((::x10::regionarray::PolyRegion::FMGL(ROW__get)()) - (::x10::regionarray::PolyRegion::FMGL(COL__get)())),
             ((void)(pmb),::x10::regionarray::PolyMatBuilder::FMGL(GE__get)()),
             ((rowMin) - (colMin)));
    
    //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyMat* pm = pmb->toSortedPolyMat(
                                        true);
    
    //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    return ::x10::regionarray::PolyRegion::make(pm);
    
}

//#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
::x10::regionarray::Region* x10::regionarray::PolyRegion::make(
  ::x10::regionarray::PolyMat* pm) {
    
    //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    if (::x10aux::nullCheck(pm)->isEmpty()) {
        
        //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        ::x10::regionarray::EmptyRegion* alloc__116110 = 
        (new (::x10aux::alloc_z< ::x10::regionarray::EmptyRegion>()) ::x10::regionarray::EmptyRegion());
        (alloc__116110)->::x10::regionarray::EmptyRegion::_constructor(
          ::x10aux::nullCheck(pm)->FMGL(rank));
        return alloc__116110;
        
    } else {
        
        //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        ::x10::regionarray::PolyRegion* alloc__116111 =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyRegion>()) ::x10::regionarray::PolyRegion());
        (alloc__116111)->::x10::regionarray::PolyRegion::_constructor(
          pm, false);
        return alloc__116111;
        
    }
    
}

//#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
void x10::regionarray::PolyRegion::_constructor(::x10::regionarray::PolyMat* pm,
                                                x10_boolean hack198) {
    
    //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::Region* this__116114 = this;
    
    //#line 556 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_long r__116115 = ::x10aux::nullCheck(pm)->FMGL(rank);
    x10_boolean t__116116 = ::x10aux::nullCheck(pm)->isRect();
    x10_boolean z__116117 = ::x10aux::nullCheck(pm)->isZeroBased();
    
    //#line 557 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_boolean isRail__116112 = (((::x10aux::struct_equals(r__116115,
                                                            ((x10_long)1ll))) &&
    t__116116) && z__116117);
    
    //#line 558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    ::x10aux::nullCheck(this__116114)->FMGL(rank) = r__116115;
    ::x10aux::nullCheck(this__116114)->FMGL(rect) = t__116116;
    ::x10aux::nullCheck(this__116114)->FMGL(zeroBased) = z__116117;
    ::x10aux::nullCheck(this__116114)->FMGL(rail) = isRail__116112;
    
    //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::regionarray::PolyRegion* this__116113 = this;
    ::x10aux::nullCheck(this__116113)->FMGL(size) = ((x10_long)-1ll);
    
    //#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    this->FMGL(mat) = ::x10aux::nullCheck(pm)->simplifyAll();
}
::x10::regionarray::PolyRegion* x10::regionarray::PolyRegion::_make(
  ::x10::regionarray::PolyMat* pm, x10_boolean hack198) {
    ::x10::regionarray::PolyRegion* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PolyRegion>()) ::x10::regionarray::PolyRegion();
    this_->_constructor(pm, hack198);
    return this_;
}



//#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
::x10::lang::Fun_0_1<x10_long, x10_long>* x10::regionarray::PolyRegion::min(
  ) {
    
    //#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::lang::Fun_0_1<x10_long, x10_long>* t = ::x10aux::nullCheck(this->boundingBox())->min();
    
    //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    return reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_PolyRegion__closure__1)))x10_regionarray_PolyRegion__closure__1(t)));
    
}

//#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
::x10::lang::Fun_0_1<x10_long, x10_long>* x10::regionarray::PolyRegion::max(
  ) {
    
    //#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10::lang::Fun_0_1<x10_long, x10_long>* t = ::x10aux::nullCheck(this->boundingBox())->max();
    
    //#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    return reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_PolyRegion__closure__2)))x10_regionarray_PolyRegion__closure__2(t)));
    
}

//#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
void x10::regionarray::PolyRegion::printInfo(::x10::io::Printer* out) {
    
    //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    ::x10aux::nullCheck(this->FMGL(mat))->printInfo(out, this->toString());
}

//#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
::x10::lang::String* x10::regionarray::PolyRegion::toString(
  ) {
    
    //#line 330 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    return ::x10aux::nullCheck(this->FMGL(mat))->toString();
    
}

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
::x10::regionarray::PolyRegion* x10::regionarray::PolyRegion::x10__regionarray__PolyRegion____this__x10__regionarray__PolyRegion(
  ) {
    return this;
    
}
void x10::regionarray::PolyRegion::__fieldInitializers_x10_regionarray_PolyRegion(
  ) {
    this->FMGL(size) = ((x10_long)-1ll);
}
const ::x10aux::serialization_id_t x10::regionarray::PolyRegion::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::PolyRegion::_deserializer);

void x10::regionarray::PolyRegion::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::regionarray::Region::_serialize_body(buf);
    buf.write(this->FMGL(mat));
    buf.write(this->FMGL(size));
    
}

::x10::lang::Reference* ::x10::regionarray::PolyRegion::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::PolyRegion* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PolyRegion>()) ::x10::regionarray::PolyRegion();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::PolyRegion::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::Region::_deserialize_body(buf);
    FMGL(mat) = buf.read< ::x10::regionarray::PolyMat*>();
    FMGL(size) = buf.read<x10_long>();
    
}

::x10aux::RuntimeType x10::regionarray::PolyRegion::rtt;
void x10::regionarray::PolyRegion::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::regionarray::Region>()};
    rtt.initStageTwo("x10.regionarray.PolyRegion",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_PolyRegion__closure__1>x10_regionarray_PolyRegion__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_PolyRegion__closure__1::__apply, &x10_regionarray_PolyRegion__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_PolyRegion__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_PolyRegion__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_PolyRegion__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_PolyRegion__closure__1::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_PolyRegion__closure__2>x10_regionarray_PolyRegion__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_PolyRegion__closure__2::__apply, &x10_regionarray_PolyRegion__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_PolyRegion__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_PolyRegion__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_PolyRegion__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_PolyRegion__closure__2::_deserialize);

/* END of PolyRegion */
/*************************************************/
