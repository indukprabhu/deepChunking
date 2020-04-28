/*************************************************/
/* START of Place */
#include <x10/lang/Place.h>

#ifndef X10_LANG_PLACE__CLOSURE__2_CLOSURE
#define X10_LANG_PLACE__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_Place__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, ::x10::lang::Place>::itable<x10_lang_Place__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::Place __apply(x10_long i) {
        return ::x10::lang::Place::_make(((x10_long)::x10aux::child((x10_int)p,(x10_int)i)));
        
    }
    
    // captured environment
    x10_long p;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->p);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Place__closure__2* storage = ::x10aux::alloc_z<x10_lang_Place__closure__2>();
        buf.record_reference(storage);
        x10_long that_p = buf.read<x10_long>();
        x10_lang_Place__closure__2* this_ = new (storage) x10_lang_Place__closure__2(that_p);
        return this_;
    }
    
    x10_lang_Place__closure__2(x10_long p) : p(p) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::Place> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::Place> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10:113";
    }

};

#endif // X10_LANG_PLACE__CLOSURE__2_CLOSURE
#ifndef X10_LANG_PLACE__CLOSURE__1_CLOSURE
#define X10_LANG_PLACE__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_Place__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, ::x10::lang::Rail< ::x10::lang::Place >*>::itable<x10_lang_Place__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::Rail< ::x10::lang::Place >* __apply(x10_long p) {
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return ::x10::lang::Rail< ::x10::lang::Place >::_make(((x10_long)::x10aux::num_children((x10_int)p)),
                                                              reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::Place>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::Place> >(sizeof(x10_lang_Place__closure__2)))x10_lang_Place__closure__2(p))));
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Place__closure__1* storage = ::x10aux::alloc_z<x10_lang_Place__closure__1>();
        buf.record_reference(storage);
        x10_lang_Place__closure__1* this_ = new (storage) x10_lang_Place__closure__1();
        return this_;
    }
    
    x10_lang_Place__closure__1() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::Rail< ::x10::lang::Place >*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::Rail< ::x10::lang::Place >*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10:113";
    }

};

#endif // X10_LANG_PLACE__CLOSURE__1_CLOSURE

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
namespace x10 { namespace lang { 
class Place_ibox0 : public ::x10::lang::IBox< ::x10::lang::Place> {
public:
    static ::x10::lang::Any::itable< Place_ibox0 > itable;
    x10_boolean equals(::x10::lang::Any* arg0) {
        return this->value->equals(arg0);
    }
    x10_int hashCode() {
        return this->value->hashCode();
    }
    ::x10::lang::String* toString() {
        return this->value->toString();
    }
    ::x10::lang::String* typeName() {
        return this->value->typeName();
    }
    
};
::x10::lang::Any::itable< Place_ibox0 >  Place_ibox0::itable(&Place_ibox0::equals, &Place_ibox0::hashCode, &Place_ibox0::toString, &Place_ibox0::typeName);
} } 
::x10::lang::Any::itable< ::x10::lang::Place >  x10::lang::Place::_itable_0(&x10::lang::Place::equals, &x10::lang::Place::hashCode, &x10::lang::Place::toString, &x10::lang::Place::typeName);
::x10aux::itable_entry x10::lang::Place::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::lang::Place::_itable_0), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::Place")};
::x10aux::itable_entry x10::lang::Place::_iboxitables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::lang::Place_ibox0::itable), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::Place")};

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
/** The number of places including accelerators.
     * Accelerator places have limitations on the kinds of code they can run.
     */

//#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
/** The number of places not including accelerators. */

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
/** The number of accelerators. */
x10_long x10::lang::Place::FMGL(NUM_ACCELS);
void x10::lang::Place::FMGL(NUM_ACCELS__do_init)() {
    FMGL(NUM_ACCELS__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Place.NUM_ACCELS");
    x10_long __var1358__ = ((((x10_long)::x10aux::num_places)) - (((x10_long)::x10aux::num_hosts)));
    FMGL(NUM_ACCELS) = __var1358__;
    FMGL(NUM_ACCELS__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Place::FMGL(NUM_ACCELS__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(NUM_ACCELS__status), &FMGL(NUM_ACCELS__do_init), &FMGL(NUM_ACCELS__exception), "x10::lang::Place.NUM_ACCELS");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Place::FMGL(NUM_ACCELS__status);
::x10::lang::CheckedThrowable* x10::lang::Place::FMGL(NUM_ACCELS__exception);

//#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
x10_long x10::lang::Place::child(x10_long p, x10_long i){
    return ((x10_long)::x10aux::child((x10_int)p,(x10_int)i));
}

//#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
x10_long x10::lang::Place::childIndex(x10_long id){
    return ((x10_long)::x10aux::child_index((x10_int)id));
}

//#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
::x10::lang::Rail< ::x10::lang::Rail< ::x10::lang::Place >* >* x10::lang::Place::FMGL(children);
void x10::lang::Place::FMGL(children__do_init)() {
    FMGL(children__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Place.children");
    ::x10::lang::Rail< ::x10::lang::Rail< ::x10::lang::Place >* >* __var1367__ = ::x10::lang::Rail< ::x10::lang::Rail< ::x10::lang::Place >* >::_make(((x10_long)::x10aux::num_places),
                                                                                                                                                      reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::Rail< ::x10::lang::Place >*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::Rail< ::x10::lang::Place >*> >(sizeof(x10_lang_Place__closure__1)))x10_lang_Place__closure__1())));
    FMGL(children) = __var1367__;
    FMGL(children__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Place::FMGL(children__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(children__status), &FMGL(children__do_init), &FMGL(children__exception), "x10::lang::Place.children");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Place::FMGL(children__status);
::x10::lang::CheckedThrowable* x10::lang::Place::FMGL(children__exception);

//#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
::x10::lang::PlaceGroup* x10::lang::Place::places() {
    return ::x10::lang::PlaceGroup::FMGL(WORLD__get)();
    
}

//#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
/**
     * The place that runs 'main'.
     */
::x10::lang::Place x10::lang::Place::FMGL(FIRST_PLACE);
void x10::lang::Place::FMGL(FIRST_PLACE__do_init)() {
    FMGL(FIRST_PLACE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Place.FIRST_PLACE");
    ::x10::lang::Place __var1369__ = ::x10::lang::Place::_make(((x10_long)0ll));
    FMGL(FIRST_PLACE) = __var1369__;
    FMGL(FIRST_PLACE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Place::FMGL(FIRST_PLACE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(FIRST_PLACE__status), &FMGL(FIRST_PLACE__do_init), &FMGL(FIRST_PLACE__exception), "x10::lang::Place.FIRST_PLACE");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Place::FMGL(FIRST_PLACE__status);
::x10::lang::CheckedThrowable* x10::lang::Place::FMGL(FIRST_PLACE__exception);

//#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
/**
     * Special place type for non-existent places
     */
::x10::lang::Place x10::lang::Place::FMGL(INVALID_PLACE);
void x10::lang::Place::FMGL(INVALID_PLACE__do_init)() {
    FMGL(INVALID_PLACE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Place.INVALID_PLACE");
    ::x10::lang::Place __var1370__ = ::x10::lang::Place::_make(((x10_long)-1ll));
    FMGL(INVALID_PLACE) = __var1370__;
    FMGL(INVALID_PLACE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Place::FMGL(INVALID_PLACE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(INVALID_PLACE__status), &FMGL(INVALID_PLACE__do_init), &FMGL(INVALID_PLACE__exception), "x10::lang::Place.INVALID_PLACE");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Place::FMGL(INVALID_PLACE__status);
::x10::lang::CheckedThrowable* x10::lang::Place::FMGL(INVALID_PLACE__exception);

//#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"


//#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
::x10::lang::Rail< ::x10::lang::Place >* x10::lang::Place::children(
  ) {
    return ::x10::lang::Place::FMGL(children__get)()->x10::lang::Rail< ::x10::lang::Rail< ::x10::lang::Place >* >::__apply(
             (*this)->FMGL(id));
    
}

//#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
x10_long x10::lang::Place::childIndex() {
    
    //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    if ((__extension__ ({
            ::x10::lang::Place this__103295 = (*this);
            ::x10aux::is_host((x10_int)this__103295->FMGL(id));
        }))
        ) {
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::BadPlaceException::_make()));
    }
    
    //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    return ((x10_long)::x10aux::child_index((x10_int)(*this)->FMGL(id)));
    
}

//#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
::x10::lang::String* x10::lang::Place::toString() {
    return ::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125123 = ::x10aux::makeStringLit("Place("); strLit__125123; })), (*this)->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__125124 = ::x10aux::makeStringLit(")"); strLit__125124; })));
    
}

//#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
x10_boolean x10::lang::Place::equals(::x10::lang::Any* p) {
    return (::x10aux::instanceof< ::x10::lang::Place>(p) &&
    (::x10aux::struct_equals((::x10aux::class_cast< ::x10::lang::Place>(p))->FMGL(id),
                             (*this)->FMGL(id))));
    
}

//#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
::x10::lang::String* x10::lang::Place::typeName(){
    return ::x10aux::type_name((*this));
}
x10_boolean x10::lang::Place::_struct_equals(::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::lang::Place>(other)))
    {
        return false;
        
    }
    ::x10::lang::Place this__103304 = (*this);
    ::x10::lang::Place other__103305 = ::x10aux::class_cast< ::x10::lang::Place>(other);
    return (::x10aux::struct_equals(this__103304->FMGL(id),
                                    other__103305->FMGL(id)));
    
}

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
void ::x10::lang::Place::_serialize(::x10::lang::Place this_, ::x10aux::serialization_buffer& buf) {
    buf.write(this_->FMGL(id));
    
}

void ::x10::lang::Place::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(id) = buf.read<x10_long>();
}


::x10aux::RuntimeType x10::lang::Place::rtt;
void x10::lang::Place::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Any>()};
    rtt.initStageTwo("x10.lang.Place",::x10aux::RuntimeType::struct_kind, 1, parents, 0, NULL, NULL);
    rtt.containsPtrs = false;
}

::x10::lang::Fun_0_1<x10_long, ::x10::lang::Place>::itable<x10_lang_Place__closure__2>x10_lang_Place__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Place__closure__2::__apply, &x10_lang_Place__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Place__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::Place> >, &x10_lang_Place__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Place__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Place__closure__2::_deserialize);

::x10::lang::Fun_0_1<x10_long, ::x10::lang::Rail< ::x10::lang::Place >*>::itable<x10_lang_Place__closure__1>x10_lang_Place__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Place__closure__1::__apply, &x10_lang_Place__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Place__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::Rail< ::x10::lang::Place >*> >, &x10_lang_Place__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Place__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Place__closure__1::_deserialize);

/* END of Place */
/*************************************************/
