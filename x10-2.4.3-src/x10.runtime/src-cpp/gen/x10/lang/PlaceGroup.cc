/*************************************************/
/* START of PlaceGroup */
#include <x10/lang/PlaceGroup.h>

#ifndef X10_LANG_PLACEGROUP__CLOSURE__1_CLOSURE
#define X10_LANG_PLACEGROUP__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_PlaceGroup__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_PlaceGroup__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            ::x10::io::Deserializer* dser = ::x10::io::Deserializer::_make(message);
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            ::x10::lang::VoidFun_0_0* cls = ::x10aux::class_cast< ::x10::lang::VoidFun_0_0*>(dser->x10::io::Deserializer::readAny());
            
            //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(cls));
        }
        catch (::x10::lang::CheckedThrowable* __exc1290) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1290)) {
                ::x10::lang::Error* __lowerer__var__0__ = static_cast< ::x10::lang::Error*>(__exc1290);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc1290);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Rail< x10_byte >* message;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->message);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceGroup__closure__1* storage = ::x10aux::alloc_z<x10_lang_PlaceGroup__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::Rail< x10_byte >* that_message = buf.read< ::x10::lang::Rail< x10_byte >*>();
        x10_lang_PlaceGroup__closure__1* this_ = new (storage) x10_lang_PlaceGroup__closure__1(that_message);
        return this_;
    }
    
    x10_lang_PlaceGroup__closure__1(::x10::lang::Rail< x10_byte >* message) : message(message) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10:122-126";
    }

};

#endif // X10_LANG_PLACEGROUP__CLOSURE__1_CLOSURE
#ifndef X10_LANG_PLACEGROUP__CLOSURE__2_CLOSURE
#define X10_LANG_PLACEGROUP__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_PlaceGroup__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_PlaceGroup__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            ::x10::io::Deserializer* dser = ::x10::io::Deserializer::_make(message);
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            ::x10::lang::VoidFun_0_0* cls = ::x10aux::class_cast< ::x10::lang::VoidFun_0_0*>(dser->x10::io::Deserializer::readAny());
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(cls));
        }
        catch (::x10::lang::CheckedThrowable* __exc1294) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1294)) {
                ::x10::lang::Error* __lowerer__var__0__ = static_cast< ::x10::lang::Error*>(__exc1294);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc1294);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Rail< x10_byte >* message;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->message);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceGroup__closure__2* storage = ::x10aux::alloc_z<x10_lang_PlaceGroup__closure__2>();
        buf.record_reference(storage);
        ::x10::lang::Rail< x10_byte >* that_message = buf.read< ::x10::lang::Rail< x10_byte >*>();
        x10_lang_PlaceGroup__closure__2* this_ = new (storage) x10_lang_PlaceGroup__closure__2(that_message);
        return this_;
    }
    
    x10_lang_PlaceGroup__closure__2(::x10::lang::Rail< x10_byte >* message) : message(message) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10:143-147";
    }

};

#endif // X10_LANG_PLACEGROUP__CLOSURE__2_CLOSURE

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
/**
   * A PlaceGroup that represents exactly Place.places().
   * All places, in order of increasing Place.id.
   */
::x10::lang::PlaceGroup__SimplePlaceGroup* x10::lang::PlaceGroup::FMGL(WORLD);
void x10::lang::PlaceGroup::FMGL(WORLD__do_init)() {
    FMGL(WORLD__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::PlaceGroup.WORLD");
    ::x10::lang::PlaceGroup__SimplePlaceGroup* __var1280__ = ::x10::lang::PlaceGroup__SimplePlaceGroup::_make(((x10_long)::x10aux::num_hosts));
    FMGL(WORLD) = __var1280__;
    FMGL(WORLD__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::PlaceGroup::FMGL(WORLD__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(WORLD__status), &FMGL(WORLD__do_init), &FMGL(WORLD__exception), "x10::lang::PlaceGroup.WORLD");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::PlaceGroup::FMGL(WORLD__status);
::x10::lang::CheckedThrowable* x10::lang::PlaceGroup::FMGL(WORLD__exception);

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
x10_long x10::lang::PlaceGroup::size() {
    return this->numPlaces();
    
}

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"

//#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
x10_boolean x10::lang::PlaceGroup::contains(::x10::lang::Place place) {
    return this->contains(place->FMGL(id));
    
}

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"

//#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
x10_long x10::lang::PlaceGroup::indexOf(::x10::lang::Place place) {
    return this->indexOf(place->FMGL(id));
    
}

//#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"

//#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"

//#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
x10_boolean x10::lang::PlaceGroup::equals(::x10::lang::Any* thatObj) {
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    if ((::x10aux::struct_equals(this, thatObj))) {
        return true;
        
    }
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    if (!(::x10aux::instanceof< ::x10::lang::PlaceGroup*>(thatObj))) {
        return false;
        
    }
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    ::x10::lang::PlaceGroup* that = ::x10aux::class_cast< ::x10::lang::PlaceGroup*>(thatObj);
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    if ((!::x10aux::struct_equals(this->numPlaces(), ::x10aux::nullCheck(that)->numPlaces())))
    {
        return false;
        
    }
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    {
        x10_long i;
        for (i = ((x10_long)0ll); ((i) < (this->numPlaces())); i =
                                                                 ((i) + (((x10_long)1ll))))
        {
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            if (!((__extension__ ({
                    ::x10::lang::Place this__103132 = this->__apply(
                                                        i);
                    
                    //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
                    ::x10::lang::Place p__103131 = ::x10aux::nullCheck(that)->__apply(
                                                     i);
                    (::x10aux::struct_equals(p__103131->FMGL(id),
                                             this__103132->FMGL(id)));
                }))
                )) {
                return false;
                
            }
            
        }
    }
    
    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    return true;
    
}

//#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
void x10::lang::PlaceGroup::broadcastFlat(::x10::lang::VoidFun_0_0* cl) {
    
    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    ::x10::io::Serializer* ser = ::x10::io::Serializer::_make();
    
    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    ser->x10::io::Serializer::writeAny(reinterpret_cast< ::x10::lang::Any*>(cl));
    
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    ser->x10::io::Serializer::addDeserializeCount((((__extension__ ({
                                                      ::x10::lang::PlaceGroup* this__103133 =
                                                        this;
                                                      ::x10aux::nullCheck(this__103133)->numPlaces();
                                                  }))
                                                  ) - (((x10_long)1ll))));
    
    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    ::x10::lang::Rail< x10_byte >* message = ser->x10::io::Serializer::toRail();
    {
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var4 = ::x10::lang::Runtime::startFinish(
                                                  ::x10::compiler::Pragma::FMGL(FINISH_SPMD__get)());
        {
            ::x10::lang::CheckedThrowable* throwable__103190 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        {
                            ::x10::lang::Iterator< ::x10::lang::Place>* p__75362;
                            for (p__75362 = this->iterator();
                                 ::x10::lang::Iterator< ::x10::lang::Place>::hasNext(::x10aux::nullCheck(p__75362));
                                 ) {
                                ::x10::lang::Place p = ::x10::lang::Iterator< ::x10::lang::Place>::next(::x10aux::nullCheck(p__75362));
                                
                                //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                ::x10::lang::Runtime::runAsync(
                                  p, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_PlaceGroup__closure__1)))x10_lang_PlaceGroup__closure__1(message))),
                                  ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                            }
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc1291) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1291);
                        {
                            ::x10::lang::Runtime::pushException(
                              __lowerer__var__0__);
                            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                        }
                    } else
                    throw;
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1292) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__103191 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1292);
                    {
                        throwable__103190 = formal__103191;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103190)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__103190))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103190));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var4);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103190)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__103190)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103190));
                }
                
            }
            
        }
    }
}

//#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
void x10::lang::PlaceGroup::broadcastFlat(::x10::lang::VoidFun_0_0* cl,
                                          ::x10::lang::Fun_0_1< ::x10::lang::Place, x10_boolean>* ignoreIfDead) {
    
    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    ::x10::io::Serializer* ser = ::x10::io::Serializer::_make();
    
    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    ser->x10::io::Serializer::writeAny(reinterpret_cast< ::x10::lang::Any*>(cl));
    
    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    ser->x10::io::Serializer::addDeserializeCount((((__extension__ ({
                                                      ::x10::lang::PlaceGroup* this__103134 =
                                                        this;
                                                      ::x10aux::nullCheck(this__103134)->numPlaces();
                                                  }))
                                                  ) - (((x10_long)1ll))));
    
    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    ::x10::lang::Rail< x10_byte >* message = ser->x10::io::Serializer::toRail();
    
    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    x10_long numSkipped = ((x10_long)0ll);
    {
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var5 = ::x10::lang::Runtime::startFinish(
                                                  ::x10::compiler::Pragma::FMGL(FINISH_SPMD__get)());
        {
            ::x10::lang::CheckedThrowable* throwable__103193 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        {
                            ::x10::lang::Iterator< ::x10::lang::Place>* p__75364;
                            for (p__75364 = this->iterator();
                                 ::x10::lang::Iterator< ::x10::lang::Place>::hasNext(::x10aux::nullCheck(p__75364));
                                 ) {
                                ::x10::lang::Place p = ::x10::lang::Iterator< ::x10::lang::Place>::next(::x10aux::nullCheck(p__75364));
                                
                                //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                if ((!(x10rt_is_place_dead((x10_int)p->FMGL(id))) ||
                                    !(::x10::lang::Fun_0_1< ::x10::lang::Place, x10_boolean>::__apply(::x10aux::nullCheck(ignoreIfDead), 
                                      p)))) {
                                    
                                    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                    ::x10::lang::Runtime::runAsync(
                                      p, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_PlaceGroup__closure__2)))x10_lang_PlaceGroup__closure__2(message))),
                                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                                } else {
                                    
                                    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                    numSkipped = ((numSkipped) + (((x10_long)1ll)));
                                }
                                
                            }
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc1295) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1295);
                        {
                            ::x10::lang::Runtime::pushException(
                              __lowerer__var__0__);
                            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                        }
                    } else
                    throw;
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1296) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__103194 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1296);
                    {
                        throwable__103193 = formal__103194;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103193)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__103193))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103193));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var5);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103193)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__103193)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103193));
                }
                
            }
            
        }
    }
    
    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    if (((numSkipped) > (((x10_long)0ll)))) {
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        x10_long i__75366max__103152 = numSkipped;
        {
            x10_long i__103153;
            for (i__103153 = ((x10_long)1ll); ((i__103153) <= (i__75366max__103152));
                 i__103153 = ((i__103153) + (((x10_long)1ll))))
            {
                
                //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                ::x10::io::Deserializer* dser__103150 = ::x10::io::Deserializer::_make(message);
                
                //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                ::x10::lang::VoidFun_0_0* cls__103151 = ::x10aux::class_cast< ::x10::lang::VoidFun_0_0*>(dser__103150->x10::io::Deserializer::readAny());
                
            }
        }
        
    }
    
}

//#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
::x10::lang::PlaceGroup__SimplePlaceGroup* x10::lang::PlaceGroup::make(
  x10_long numPlaces) {
    ::x10::lang::PlaceGroup__SimplePlaceGroup* alloc__103160 =
       (new (::x10aux::alloc_z< ::x10::lang::PlaceGroup__SimplePlaceGroup>()) ::x10::lang::PlaceGroup__SimplePlaceGroup());
    (alloc__103160)->::x10::lang::PlaceGroup__SimplePlaceGroup::_constructor(
      numPlaces);
    return alloc__103160;
    
}

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
::x10::lang::PlaceGroup* x10::lang::PlaceGroup::x10__lang__PlaceGroup____this__x10__lang__PlaceGroup(
  ) {
    return this;
    
}
void x10::lang::PlaceGroup::_constructor() {
    ::x10::lang::PlaceGroup* this__103161 = this;
    
}

void x10::lang::PlaceGroup::__fieldInitializers_x10_lang_PlaceGroup(
  ) {
 
}
void x10::lang::PlaceGroup::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

void x10::lang::PlaceGroup::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::lang::PlaceGroup::rtt;
void x10::lang::PlaceGroup::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Place> >()};
    rtt.initStageTwo("x10.lang.PlaceGroup",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_lang_PlaceGroup__closure__1>x10_lang_PlaceGroup__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceGroup__closure__1::__apply, &x10_lang_PlaceGroup__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_PlaceGroup__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_PlaceGroup__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_PlaceGroup__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceGroup__closure__1::_deserialize);
const ::x10aux::serialization_id_t x10_lang_PlaceGroup__closure__1::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_PlaceGroup__closure__1::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

::x10::lang::VoidFun_0_0::itable<x10_lang_PlaceGroup__closure__2>x10_lang_PlaceGroup__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceGroup__closure__2::__apply, &x10_lang_PlaceGroup__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_PlaceGroup__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_PlaceGroup__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_PlaceGroup__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceGroup__closure__2::_deserialize);
const ::x10aux::serialization_id_t x10_lang_PlaceGroup__closure__2::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_PlaceGroup__closure__2::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

/* END of PlaceGroup */
/*************************************************/
/*************************************************/
/* START of PlaceGroup$SimplePlaceGroup$Anonymous$5937 */
#include <x10/lang/PlaceGroup__SimplePlaceGroup__Anonymous__5937.h>

#include <x10/lang/Iterator.h>
#include <x10/lang/Place.h>
#include <x10/lang/Long.h>
#include <x10/lang/PlaceGroup__SimplePlaceGroup.h>
#include <x10/lang/Boolean.h>
::x10::lang::Iterator< ::x10::lang::Place>::itable< ::x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937 >  x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937::_itable_0(&::x10::lang::X10Class::equals, &x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937::hasNext, &::x10::lang::X10Class::hashCode, &x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937::next, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937 >  x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterator< ::x10::lang::Place> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937")};

//#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"

//#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"

//#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
x10_boolean x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937::hasNext(
  ) {
    return ((this->FMGL(i)) < (::x10aux::nullCheck(this->FMGL(out__))->FMGL(numPlaces)));
    
}

//#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
::x10::lang::Place x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937::next(
  ) {
    ::x10::lang::Place alloc__103159 =  ::x10::lang::Place::_alloc();
    (alloc__103159)->::x10::lang::Place::_constructor(((this->FMGL(i) =
                                                        ((this->FMGL(i)) + (((x10_long)1ll)))) - (((x10_long)1ll))));
    return alloc__103159;
    
}

//#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
void x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937::_constructor(
  ::x10::lang::PlaceGroup__SimplePlaceGroup* out__) {
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    this->FMGL(out__) = out__;
}
::x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937* x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937::_make(
  ::x10::lang::PlaceGroup__SimplePlaceGroup* out__) {
    ::x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937* this_ = new (::x10aux::alloc_z< ::x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937>()) ::x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937();
    this_->_constructor(out__);
    return this_;
}


const ::x10aux::serialization_id_t x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937::_deserializer);

void x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(i));
    buf.write(this->FMGL(out__));
    
}

::x10::lang::Reference* ::x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937* this_ = new (::x10aux::alloc_z< ::x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937>()) ::x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(i) = buf.read<x10_long>();
    FMGL(out__) = buf.read< ::x10::lang::PlaceGroup__SimplePlaceGroup*>();
}

::x10aux::RuntimeType x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937::rtt;
void x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Iterator< ::x10::lang::Place> >()};
    rtt.initStageTwo("x10.lang.PlaceGroup.SimplePlaceGroup.Anonymous.5937",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of PlaceGroup$SimplePlaceGroup$Anonymous$5937 */
/*************************************************/
/*************************************************/
/* START of PlaceGroup$SimplePlaceGroup */
#include <x10/lang/PlaceGroup__SimplePlaceGroup.h>

#include <x10/lang/PlaceGroup.h>
#include <x10/lang/Long.h>
#include <x10/lang/Place.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Iterator.h>
#include <x10/lang/PlaceGroup__SimplePlaceGroup__Anonymous__5937.h>
#include <x10/lang/Any.h>
#include <x10/lang/Int.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/io/Serializer.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Byte.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/FinishState.h>
#include <x10/compiler/Pragma.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/io/Deserializer.h>
#include <x10/lang/Error.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/AsyncClosure.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_PLACEGROUP__SIMPLEPLACEGROUP__CLOSURE__4_CLOSURE
#define X10_LANG_PLACEGROUP__SIMPLEPLACEGROUP__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_PlaceGroup__SimplePlaceGroup__closure__4 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_PlaceGroup__SimplePlaceGroup__closure__4> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            ::x10::io::Deserializer* dser = ::x10::io::Deserializer::_make(message);
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            ::x10::lang::VoidFun_0_0* cls = ::x10aux::class_cast< ::x10::lang::VoidFun_0_0*>(dser->x10::io::Deserializer::readAny());
            
            //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(cls));
        }
        catch (::x10::lang::CheckedThrowable* __exc1311) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1311)) {
                ::x10::lang::Error* __lowerer__var__0__ = static_cast< ::x10::lang::Error*>(__exc1311);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc1311);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Rail< x10_byte >* message;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->message);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceGroup__SimplePlaceGroup__closure__4* storage = ::x10aux::alloc_z<x10_lang_PlaceGroup__SimplePlaceGroup__closure__4>();
        buf.record_reference(storage);
        ::x10::lang::Rail< x10_byte >* that_message = buf.read< ::x10::lang::Rail< x10_byte >*>();
        x10_lang_PlaceGroup__SimplePlaceGroup__closure__4* this_ = new (storage) x10_lang_PlaceGroup__SimplePlaceGroup__closure__4(that_message);
        return this_;
    }
    
    x10_lang_PlaceGroup__SimplePlaceGroup__closure__4(::x10::lang::Rail< x10_byte >* message) : message(message) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10:198-202";
    }

};

#endif // X10_LANG_PLACEGROUP__SIMPLEPLACEGROUP__CLOSURE__4_CLOSURE
#ifndef X10_LANG_PLACEGROUP__SIMPLEPLACEGROUP__CLOSURE__3_CLOSURE
#define X10_LANG_PLACEGROUP__SIMPLEPLACEGROUP__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_PlaceGroup__SimplePlaceGroup__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_PlaceGroup__SimplePlaceGroup__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            x10_long max = ((x10_long)::x10aux::here);
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            x10_long min = (__extension__ ({
                
                //#line 374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                x10_long a__103145 = ((max) - (((x10_long)31ll)));
                ((a__103145) < (((x10_long)0ll))) ? (((x10_long)0ll)) : (a__103145);
            }))
            ;
            {
                
                //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                ::x10::lang::Runtime::ensureNotInAtomic();
                ::x10::lang::FinishState* x10____var6 = ::x10::lang::Runtime::startFinish(
                                                          ::x10::compiler::Pragma::FMGL(FINISH_SPMD__get)());
                {
                    ::x10::lang::CheckedThrowable* throwable__103196 =
                      ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                    try {
                        try {
                            {
                                {
                                    x10_long j;
                                    for (j = min; ((j) <= (max));
                                         j = ((j) + (((x10_long)1ll))))
                                    {
                                        
                                        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                        ::x10::lang::Runtime::runAsync(
                                          (__extension__ ({
                                              ::x10::lang::Place alloc__75358 =
                                                 ::x10::lang::Place::_alloc();
                                              (alloc__75358)->::x10::lang::Place::_constructor(
                                                j);
                                              alloc__75358;
                                          }))
                                          , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_PlaceGroup__SimplePlaceGroup__closure__4)))x10_lang_PlaceGroup__SimplePlaceGroup__closure__4(message))),
                                          ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                                    }
                                }
                                
                            }
                        }
                        catch (::x10::lang::CheckedThrowable* __exc1312) {
                            if (true) {
                                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1312);
                                {
                                    ::x10::lang::Runtime::pushException(
                                      __lowerer__var__0__);
                                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                                }
                            } else
                            throw;
                        }
                        ::x10::compiler::Finalization::plausibleThrow();
                    }
                    catch (::x10::lang::CheckedThrowable* __exc1313) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* formal__103197 =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc1313);
                            {
                                throwable__103196 = formal__103197;
                            }
                        } else
                        throw;
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__103196)))
                    {
                        if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__103196))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__103196));
                        }
                        
                    }
                    if (true) {
                        ::x10::lang::Runtime::stopFinish(
                          x10____var6);
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__103196)))
                    {
                        if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__103196)))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__103196));
                        }
                        
                    }
                    
                }
            }
        }
        catch (::x10::lang::CheckedThrowable* __exc1314) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1314)) {
                ::x10::lang::Error* __lowerer__var__0__ =
                  static_cast< ::x10::lang::Error*>(__exc1314);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1314);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Rail< x10_byte >* message;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->message);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceGroup__SimplePlaceGroup__closure__3* storage = ::x10aux::alloc_z<x10_lang_PlaceGroup__SimplePlaceGroup__closure__3>();
        buf.record_reference(storage);
        ::x10::lang::Rail< x10_byte >* that_message = buf.read< ::x10::lang::Rail< x10_byte >*>();
        x10_lang_PlaceGroup__SimplePlaceGroup__closure__3* this_ = new (storage) x10_lang_PlaceGroup__SimplePlaceGroup__closure__3(that_message);
        return this_;
    }
    
    x10_lang_PlaceGroup__SimplePlaceGroup__closure__3(::x10::lang::Rail< x10_byte >* message) : message(message) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10:194-204";
    }

};

#endif // X10_LANG_PLACEGROUP__SIMPLEPLACEGROUP__CLOSURE__3_CLOSURE
::x10::lang::Iterable< ::x10::lang::Place>::itable< ::x10::lang::PlaceGroup__SimplePlaceGroup >  x10::lang::PlaceGroup__SimplePlaceGroup::_itable_0(&x10::lang::PlaceGroup__SimplePlaceGroup::equals, &x10::lang::PlaceGroup__SimplePlaceGroup::hashCode, &x10::lang::PlaceGroup__SimplePlaceGroup::iterator, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::PlaceGroup__SimplePlaceGroup >  x10::lang::PlaceGroup__SimplePlaceGroup::_itable_1(&x10::lang::PlaceGroup__SimplePlaceGroup::equals, &x10::lang::PlaceGroup__SimplePlaceGroup::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::PlaceGroup__SimplePlaceGroup::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Place> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::PlaceGroup__SimplePlaceGroup")};

//#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"

//#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
void x10::lang::PlaceGroup__SimplePlaceGroup::_constructor(x10_long numPlaces) {
    ::x10::lang::PlaceGroup* this__103155 = this;
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    ::x10::lang::PlaceGroup__SimplePlaceGroup* this__103154 = this;
    
    //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    this->FMGL(numPlaces) = numPlaces;
}
::x10::lang::PlaceGroup__SimplePlaceGroup* x10::lang::PlaceGroup__SimplePlaceGroup::_make(
  x10_long numPlaces) {
    ::x10::lang::PlaceGroup__SimplePlaceGroup* this_ = new (::x10aux::alloc_z< ::x10::lang::PlaceGroup__SimplePlaceGroup>()) ::x10::lang::PlaceGroup__SimplePlaceGroup();
    this_->_constructor(numPlaces);
    return this_;
}



//#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
::x10::lang::Place x10::lang::PlaceGroup__SimplePlaceGroup::__apply(
  x10_long i) {
    ::x10::lang::Place alloc__103156 =  ::x10::lang::Place::_alloc();
    (alloc__103156)->::x10::lang::Place::_constructor(i);
    return alloc__103156;
    
}

//#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
x10_long x10::lang::PlaceGroup__SimplePlaceGroup::numPlaces() {
    return this->FMGL(numPlaces);
    
}

//#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
x10_boolean x10::lang::PlaceGroup__SimplePlaceGroup::contains(x10_long id) {
    return (((id) >= (((x10_long)0ll))) && ((id) < (this->FMGL(numPlaces))));
    
}

//#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
x10_long x10::lang::PlaceGroup__SimplePlaceGroup::indexOf(x10_long id) {
    return this->contains(id) ? (id) : (((x10_long)-1ll));
    
}

//#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
::x10::lang::Iterator< ::x10::lang::Place>* x10::lang::PlaceGroup__SimplePlaceGroup::iterator(
  ) {
    ::x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937* alloc__103158 =
       (new (::x10aux::alloc_z< ::x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937>()) ::x10::lang::PlaceGroup__SimplePlaceGroup__Anonymous__5937());
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    ::x10::lang::PlaceGroup__SimplePlaceGroup* out__103157 =
      this;
    alloc__103158->FMGL(out__) = out__103157;
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    return reinterpret_cast< ::x10::lang::Iterator< ::x10::lang::Place>*>(alloc__103158);
    
}

//#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
x10_boolean x10::lang::PlaceGroup__SimplePlaceGroup::equals(
  ::x10::lang::Any* thatObj) {
    
    //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    if (::x10aux::instanceof< ::x10::lang::PlaceGroup__SimplePlaceGroup*>(thatObj))
    {
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        return (::x10aux::struct_equals(this->numPlaces(),
                                        ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::PlaceGroup*>(thatObj)))->numPlaces()));
        
    } else {
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        return ::x10::lang::PlaceGroup::equals(thatObj);
        
    }
    
}

//#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
x10_int x10::lang::PlaceGroup__SimplePlaceGroup::hashCode(
  ) {
    return ::x10aux::hash_code(this->FMGL(numPlaces));
    
}

//#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
void x10::lang::PlaceGroup__SimplePlaceGroup::broadcastFlat(
  ::x10::lang::VoidFun_0_0* cl) {
    
    //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    if (((this->numPlaces()) >= (((x10_long)1024ll)))) {
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        ::x10::io::Serializer* ser = ::x10::io::Serializer::_make();
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        ser->x10::io::Serializer::writeAny(reinterpret_cast< ::x10::lang::Any*>(cl));
        
        //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        ser->x10::io::Serializer::addDeserializeCount((((__extension__ ({
                                                          ::x10::lang::PlaceGroup* this__103144 =
                                                            reinterpret_cast< ::x10::lang::PlaceGroup*>(this);
                                                          ::x10aux::nullCheck(this__103144)->numPlaces();
                                                      }))
                                                      ) - (((x10_long)1ll))));
        
        //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        ::x10::lang::Rail< x10_byte >* message = ser->x10::io::Serializer::toRail();
        {
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var7 = ::x10::lang::Runtime::startFinish(
                                                      ::x10::compiler::Pragma::FMGL(FINISH_SPMD__get)());
            {
                ::x10::lang::CheckedThrowable* throwable__103199 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            {
                                x10_long i;
                                for (i = ((this->numPlaces()) - (((x10_long)1ll)));
                                     ((i) >= (((x10_long)0ll)));
                                     i = ((i) - (((x10_long)32ll))))
                                {
                                    
                                    //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                    ::x10::lang::Runtime::runAsync(
                                      (__extension__ ({
                                          ::x10::lang::Place alloc__75357 =
                                             ::x10::lang::Place::_alloc();
                                          (alloc__75357)->::x10::lang::Place::_constructor(
                                            i);
                                          alloc__75357;
                                      }))
                                      , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_PlaceGroup__SimplePlaceGroup__closure__3)))x10_lang_PlaceGroup__SimplePlaceGroup__closure__3(message))),
                                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                                }
                            }
                            
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc1315) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc1315);
                            {
                                ::x10::lang::Runtime::pushException(
                                  __lowerer__var__0__);
                                ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                            }
                        } else
                        throw;
                    }
                    ::x10::compiler::Finalization::plausibleThrow();
                }
                catch (::x10::lang::CheckedThrowable* __exc1316) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__103200 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1316);
                        {
                            throwable__103199 = formal__103200;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__103199)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__103199))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__103199));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var7);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__103199)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__103199)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__103199));
                    }
                    
                }
                
            }
        }
    } else {
        
        //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        ::x10::lang::PlaceGroup::broadcastFlat(cl);
    }
    
}

//#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
::x10::lang::PlaceGroup__SimplePlaceGroup* x10::lang::PlaceGroup__SimplePlaceGroup::x10__lang__PlaceGroup__SimplePlaceGroup____this__x10__lang__PlaceGroup__SimplePlaceGroup(
  ) {
    return this;
    
}
void x10::lang::PlaceGroup__SimplePlaceGroup::__fieldInitializers_x10_lang_PlaceGroup_SimplePlaceGroup(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::PlaceGroup__SimplePlaceGroup::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::PlaceGroup__SimplePlaceGroup::_deserializer);

void x10::lang::PlaceGroup__SimplePlaceGroup::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::PlaceGroup::_serialize_body(buf);
    buf.write(this->FMGL(numPlaces));
    
}

::x10::lang::Reference* ::x10::lang::PlaceGroup__SimplePlaceGroup::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::PlaceGroup__SimplePlaceGroup* this_ = new (::x10aux::alloc_z< ::x10::lang::PlaceGroup__SimplePlaceGroup>()) ::x10::lang::PlaceGroup__SimplePlaceGroup();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::PlaceGroup__SimplePlaceGroup::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::PlaceGroup::_deserialize_body(buf);
    FMGL(numPlaces) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::lang::PlaceGroup__SimplePlaceGroup::rtt;
void x10::lang::PlaceGroup__SimplePlaceGroup::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::PlaceGroup>()};
    rtt.initStageTwo("x10.lang.PlaceGroup.SimplePlaceGroup",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_lang_PlaceGroup__SimplePlaceGroup__closure__4>x10_lang_PlaceGroup__SimplePlaceGroup__closure__4::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceGroup__SimplePlaceGroup__closure__4::__apply, &x10_lang_PlaceGroup__SimplePlaceGroup__closure__4::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_PlaceGroup__SimplePlaceGroup__closure__4::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_PlaceGroup__SimplePlaceGroup__closure__4::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_PlaceGroup__SimplePlaceGroup__closure__4::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceGroup__SimplePlaceGroup__closure__4::_deserialize);
const ::x10aux::serialization_id_t x10_lang_PlaceGroup__SimplePlaceGroup__closure__4::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_PlaceGroup__SimplePlaceGroup__closure__4::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

::x10::lang::VoidFun_0_0::itable<x10_lang_PlaceGroup__SimplePlaceGroup__closure__3>x10_lang_PlaceGroup__SimplePlaceGroup__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceGroup__SimplePlaceGroup__closure__3::__apply, &x10_lang_PlaceGroup__SimplePlaceGroup__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_PlaceGroup__SimplePlaceGroup__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_PlaceGroup__SimplePlaceGroup__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_PlaceGroup__SimplePlaceGroup__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceGroup__SimplePlaceGroup__closure__3::_deserialize);
const ::x10aux::serialization_id_t x10_lang_PlaceGroup__SimplePlaceGroup__closure__3::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_PlaceGroup__SimplePlaceGroup__closure__3::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

/* END of PlaceGroup$SimplePlaceGroup */
/*************************************************/
