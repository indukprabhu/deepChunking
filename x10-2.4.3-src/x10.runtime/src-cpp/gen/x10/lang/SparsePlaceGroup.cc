/*************************************************/
/* START of SparsePlaceGroup */
#include <x10/lang/SparsePlaceGroup.h>

#include <x10/lang/PlaceGroup.h>
#include <x10/lang/Place.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/IllegalArgumentException.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Iterator.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_SPARSEPLACEGROUP__CLOSURE__1_CLOSURE
#define X10_LANG_SPARSEPLACEGROUP__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_SparsePlaceGroup__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, ::x10::lang::Place>::itable<x10_lang_SparsePlaceGroup__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::Place __apply(x10_long i) {
        return ::x10aux::nullCheck(pg)->__apply(i);
        
    }
    
    // captured environment
    ::x10::lang::PlaceGroup* pg;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->pg);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_SparsePlaceGroup__closure__1* storage = ::x10aux::alloc_z<x10_lang_SparsePlaceGroup__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::PlaceGroup* that_pg = buf.read< ::x10::lang::PlaceGroup*>();
        x10_lang_SparsePlaceGroup__closure__1* this_ = new (storage) x10_lang_SparsePlaceGroup__closure__1(that_pg);
        return this_;
    }
    
    x10_lang_SparsePlaceGroup__closure__1(::x10::lang::PlaceGroup* pg) : pg(pg) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::Place> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::Place> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10:56";
    }

};

#endif // X10_LANG_SPARSEPLACEGROUP__CLOSURE__1_CLOSURE
::x10::lang::Iterable< ::x10::lang::Place>::itable< ::x10::lang::SparsePlaceGroup >  x10::lang::SparsePlaceGroup::_itable_0(&::x10::lang::PlaceGroup::equals, &::x10::lang::X10Class::hashCode, &x10::lang::SparsePlaceGroup::iterator, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::SparsePlaceGroup >  x10::lang::SparsePlaceGroup::_itable_1(&::x10::lang::PlaceGroup::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::SparsePlaceGroup::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Place> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::SparsePlaceGroup")};

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
/**
   * The set of places.
   * The array is in sorted order by Place.id.
   * Only places that are in the group are in the array.
   */

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
void x10::lang::SparsePlaceGroup::_constructor(::x10::lang::Rail< ::x10::lang::Place >* ps) {
    ::x10::lang::PlaceGroup* this__104619 = this;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    ::x10::lang::SparsePlaceGroup* this__104618 = this;
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    this->FMGL(places) = ::x10::lang::Rail< ::x10::lang::Place >::_make(ps);
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    x10_long i__104536max__104620 = (((x10_long)(::x10aux::nullCheck(this->FMGL(places))->FMGL(size))) - (((x10_long)1ll)));
    {
        x10_long i__104621;
        for (i__104621 = ((x10_long)1ll); ((i__104621) <= (i__104536max__104620));
             i__104621 = ((i__104621) + (((x10_long)1ll)))) {
            x10_long i__104622 = i__104621;
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            if (((::x10aux::nullCheck(this->FMGL(places))->x10::lang::Rail< ::x10::lang::Place >::__apply(
                    i__104622)->FMGL(id)) <= (::x10aux::nullCheck(this->FMGL(places))->x10::lang::Rail< ::x10::lang::Place >::__apply(
                                                ((i__104622) - (((x10_long)1ll))))->FMGL(id))))
            {
                
                //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalArgumentException::_make((__extension__ ({ static ::x10::lang::String* strLit__125743 = ::x10aux::makeStringLit("Argument rail was not sorted"); strLit__125743; })))));
            }
            
        }
    }
    
}
::x10::lang::SparsePlaceGroup* x10::lang::SparsePlaceGroup::_make(
  ::x10::lang::Rail< ::x10::lang::Place >* ps) {
    ::x10::lang::SparsePlaceGroup* this_ = new (::x10aux::alloc_z< ::x10::lang::SparsePlaceGroup>()) ::x10::lang::SparsePlaceGroup();
    this_->_constructor(ps);
    return this_;
}



//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
void x10::lang::SparsePlaceGroup::_constructor(::x10::lang::PlaceGroup* pg) {
    ::x10::lang::PlaceGroup* this__104624 = this;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    ::x10::lang::SparsePlaceGroup* this__104623 = this;
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    this->FMGL(places) = ::x10::lang::Rail< ::x10::lang::Place >::_make(::x10aux::nullCheck(pg)->numPlaces(),
                                                                        reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::Place>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::Place> >(sizeof(x10_lang_SparsePlaceGroup__closure__1)))x10_lang_SparsePlaceGroup__closure__1(pg))));
}
::x10::lang::SparsePlaceGroup* x10::lang::SparsePlaceGroup::_make(
  ::x10::lang::PlaceGroup* pg) {
    ::x10::lang::SparsePlaceGroup* this_ = new (::x10aux::alloc_z< ::x10::lang::SparsePlaceGroup>()) ::x10::lang::SparsePlaceGroup();
    this_->_constructor(pg);
    return this_;
}



//#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
void x10::lang::SparsePlaceGroup::_constructor(::x10::lang::Place p) {
    ::x10::lang::PlaceGroup* this__104626 = this;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    ::x10::lang::SparsePlaceGroup* this__104625 = this;
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    this->FMGL(places) = ::x10::lang::Rail< ::x10::lang::Place >::_make(((x10_long)1ll),
                                                                        p);
}
::x10::lang::SparsePlaceGroup* x10::lang::SparsePlaceGroup::_make(
  ::x10::lang::Place p) {
    ::x10::lang::SparsePlaceGroup* this_ = new (::x10aux::alloc_z< ::x10::lang::SparsePlaceGroup>()) ::x10::lang::SparsePlaceGroup();
    this_->_constructor(p);
    return this_;
}



//#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
::x10::lang::Place x10::lang::SparsePlaceGroup::__apply(x10_long i) {
    return ::x10aux::nullCheck(this->FMGL(places))->x10::lang::Rail< ::x10::lang::Place >::__apply(
             i);
    
}

//#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
::x10::lang::Iterator< ::x10::lang::Place>* x10::lang::SparsePlaceGroup::iterator(
  ) {
    return ::x10aux::nullCheck(this->FMGL(places))->x10::lang::Rail< ::x10::lang::Place >::iterator();
    
}

//#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
x10_long x10::lang::SparsePlaceGroup::numPlaces() {
    return (x10_long)(::x10aux::nullCheck(this->FMGL(places))->FMGL(size));
    
}

//#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
x10_boolean x10::lang::SparsePlaceGroup::contains(x10_long id) {
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    ::x10::lang::Rail< ::x10::lang::Place >* rail__104627 =
      this->FMGL(places);
    x10_long size__104628 = (x10_long)(::x10aux::nullCheck(rail__104627)->FMGL(size));
    {
        x10_long idx__104629;
        for (idx__104629 = ((x10_long)0ll); ((idx__104629) < (size__104628));
             idx__104629 = ((idx__104629) + (((x10_long)1ll))))
        {
            ::x10::lang::Place p__104630 = ::x10aux::nullCheck(rail__104627)->x10::lang::Rail< ::x10::lang::Place >::__apply(
                                             idx__104629);
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            if ((::x10aux::struct_equals(p__104630->FMGL(id),
                                         id))) {
                return true;
                
            }
            
        }
    }
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    return false;
    
}

//#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
x10_long x10::lang::SparsePlaceGroup::indexOf(x10_long id) {
    
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    ::x10::lang::Rail< ::x10::lang::Place >* rail__104631 =
      this->FMGL(places);
    x10_long i__104579max__104632 = (x10_long)(::x10aux::nullCheck(rail__104631)->FMGL(size));
    {
        x10_long i__104633;
        for (i__104633 = ((x10_long)0ll); ((i__104633) < (i__104579max__104632));
             i__104633 = ((i__104633) + (((x10_long)1ll))))
        {
            x10_long i__104634 = i__104633;
            
            //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            if ((::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(places))->x10::lang::Rail< ::x10::lang::Place >::__apply(
                                           i__104634)->FMGL(id),
                                         id))) {
                return i__104634;
                
            }
            
        }
    }
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    return ((x10_long)-1ll);
    
}

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
::x10::lang::SparsePlaceGroup* x10::lang::SparsePlaceGroup::x10__lang__SparsePlaceGroup____this__x10__lang__SparsePlaceGroup(
  ) {
    return this;
    
}
void x10::lang::SparsePlaceGroup::__fieldInitializers_x10_lang_SparsePlaceGroup(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::SparsePlaceGroup::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::SparsePlaceGroup::_deserializer);

void x10::lang::SparsePlaceGroup::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::PlaceGroup::_serialize_body(buf);
    buf.write(this->FMGL(places));
    
}

::x10::lang::Reference* ::x10::lang::SparsePlaceGroup::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::SparsePlaceGroup* this_ = new (::x10aux::alloc_z< ::x10::lang::SparsePlaceGroup>()) ::x10::lang::SparsePlaceGroup();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::SparsePlaceGroup::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::PlaceGroup::_deserialize_body(buf);
    FMGL(places) = buf.read< ::x10::lang::Rail< ::x10::lang::Place >*>();
}

::x10aux::RuntimeType x10::lang::SparsePlaceGroup::rtt;
void x10::lang::SparsePlaceGroup::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::PlaceGroup>()};
    rtt.initStageTwo("x10.lang.SparsePlaceGroup",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_long, ::x10::lang::Place>::itable<x10_lang_SparsePlaceGroup__closure__1>x10_lang_SparsePlaceGroup__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_SparsePlaceGroup__closure__1::__apply, &x10_lang_SparsePlaceGroup__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_SparsePlaceGroup__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::Place> >, &x10_lang_SparsePlaceGroup__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_SparsePlaceGroup__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_SparsePlaceGroup__closure__1::_deserialize);

/* END of SparsePlaceGroup */
/*************************************************/
