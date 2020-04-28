/*************************************************/
/* START of FinishResilientSample */
#include <x10/lang/FinishResilientSample.h>

#ifndef X10_LANG_FINISHRESILIENTSAMPLE__CLOSURE__1_CLOSURE
#define X10_LANG_FINISHRESILIENTSAMPLE__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishResilientSample__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilientSample__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::FinishResilientSample* fs = ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::FinishResilientSample* >(saved_this->FMGL(id));
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)2ll))))
        {
            ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124357 = ::x10aux::makeStringLit("calling latch.release for id="); strLit__124357; })), saved_this->FMGL(id)));
        }
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10aux::nullCheck(::x10aux::nullCheck(fs)->FMGL(latch))->release();
    }
    
    // captured environment
    ::x10::lang::FinishResilientSample* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilientSample__closure__1* storage = ::x10aux::alloc_z<x10_lang_FinishResilientSample__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::FinishResilientSample* that_saved_this = buf.read< ::x10::lang::FinishResilientSample*>();
        x10_lang_FinishResilientSample__closure__1* this_ = new (storage) x10_lang_FinishResilientSample__closure__1(that_saved_this);
        return this_;
    }
    
    x10_lang_FinishResilientSample__closure__1(::x10::lang::FinishResilientSample* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10:116-120";
    }

};

#endif // X10_LANG_FINISHRESILIENTSAMPLE__CLOSURE__1_CLOSURE
::x10::lang::Runtime__Mortal::itable< ::x10::lang::FinishResilientSample >  x10::lang::FinishResilientSample::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::lang::FinishResilientSample::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::FinishResilientSample >  x10::lang::FinishResilientSample::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::lang::FinishResilientSample::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::FinishResilientSample::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Runtime__Mortal>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::FinishResilientSample")};

//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
x10_long x10::lang::FinishResilientSample::FMGL(verbose);
void x10::lang::FinishResilientSample::FMGL(verbose__do_init)() {
    FMGL(verbose__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::FinishResilientSample.verbose");
    x10_long __var852__ = ::x10::lang::FinishResilient::FMGL(verbose__get)();
    FMGL(verbose) = __var852__;
    FMGL(verbose__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::FinishResilientSample::FMGL(verbose__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(verbose__status), &FMGL(verbose__do_init), &FMGL(verbose__exception), "x10::lang::FinishResilientSample.verbose");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::FinishResilientSample::FMGL(verbose__status);
::x10::lang::CheckedThrowable* x10::lang::FinishResilientSample::FMGL(verbose__exception);
 /* private static type FinishID = x10.lang.GlobalRef[x10.lang.FinishResilientSample]; */ 

//#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
::x10::lang::ResilientStore< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* >, ::x10::lang::FinishResilientSample__State*>*
  x10::lang::FinishResilientSample::FMGL(RS);
void x10::lang::FinishResilientSample::FMGL(RS__do_init)() {
    FMGL(RS__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::FinishResilientSample.RS");
    ::x10::lang::ResilientStore< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* >, ::x10::lang::FinishResilientSample__State*>* __var853__ = ::x10::lang::ResilientStore<void, void>::make< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* >,
                                                                                                                                                          ::x10::lang::FinishResilientSample__State* >(
                                                                                                                                                            reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124343 = ::x10aux::makeStringLit("FinishResilientSample"); strLit__124343; }))));
    FMGL(RS) = __var853__;
    FMGL(RS__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::FinishResilientSample::FMGL(RS__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(RS__status), &FMGL(RS__do_init), &FMGL(RS__exception), "x10::lang::FinishResilientSample.RS");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::FinishResilientSample::FMGL(RS__status);
::x10::lang::CheckedThrowable* x10::lang::FinishResilientSample::FMGL(RS__exception);

//#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
::x10::util::HashSet< ::x10::lang::FinishResilientSample*>*
  x10::lang::FinishResilientSample::FMGL(ALL);
void x10::lang::FinishResilientSample::FMGL(ALL__do_init)() {
    FMGL(ALL__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::FinishResilientSample.ALL");
    ::x10::util::HashSet< ::x10::lang::FinishResilientSample*>* __var854__ = ::x10::util::HashSet< ::x10::lang::FinishResilientSample*>::_make();
    FMGL(ALL) = __var854__;
    FMGL(ALL__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::FinishResilientSample::FMGL(ALL__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(ALL__status), &FMGL(ALL__do_init), &FMGL(ALL__exception), "x10::lang::FinishResilientSample.ALL");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::FinishResilientSample::FMGL(ALL__status);
::x10::lang::CheckedThrowable* x10::lang::FinishResilientSample::FMGL(ALL__exception);

//#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"

//#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"

//#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
::x10::lang::String* x10::lang::FinishResilientSample::toString(
  ) {
    return ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::System::identityToString(
                                                                                                 reinterpret_cast< ::x10::lang::Any*>(this)), (__extension__ ({ static ::x10::lang::String* strLit__124344 = ::x10aux::makeStringLit("(id="); strLit__124344; }))), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124345 = ::x10aux::makeStringLit(")"); strLit__124345; })));
    
}

//#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
void x10::lang::FinishResilientSample::_constructor(::x10::lang::FinishState* parent,
                                                    ::x10::util::concurrent::SimpleLatch* latch) {
    (this)->::x10::lang::FinishResilient::_constructor();
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10::lang::FinishResilientSample* this__99182 = this;
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    this->FMGL(latch) = latch;
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    this->FMGL(id) = ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* >(this);
}
::x10::lang::FinishResilientSample* x10::lang::FinishResilientSample::_make(
  ::x10::lang::FinishState* parent, ::x10::util::concurrent::SimpleLatch* latch)
{
    ::x10::lang::FinishResilientSample* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishResilientSample>()) ::x10::lang::FinishResilientSample();
    this_->_constructor(parent, latch);
    return this_;
}



//#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
::x10::lang::FinishResilientSample* x10::lang::FinishResilientSample::make(
  ::x10::lang::FinishState* parent, ::x10::util::concurrent::SimpleLatch* latch) {
    
    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124346 = ::x10aux::makeStringLit(">>>> make called, parent="); strLit__124346; })), parent), (__extension__ ({ static ::x10::lang::String* strLit__124347 = ::x10aux::makeStringLit(" latch="); strLit__124347; }))), latch));
    }
    
    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10::lang::FinishResilientSample* fs =  (new (::x10aux::alloc_z< ::x10::lang::FinishResilientSample>()) ::x10::lang::FinishResilientSample());
    (fs)->::x10::lang::FinishResilientSample::_constructor(
      parent, latch);
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > id =
      fs->FMGL(id);
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10::lang::FinishResilientSample__State* state =  (new (::x10aux::alloc_z< ::x10::lang::FinishResilientSample__State>()) ::x10::lang::FinishResilientSample__State());
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    state->x10::lang::FinishResilientSample__State::__fieldInitializers_x10_lang_FinishResilientSample_State();
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    state->FMGL(live)->x10::lang::Rail< x10_int >::__set(
      ::x10::lang::Place::_make(::x10aux::here)->FMGL(id),
      ((x10_int)1));
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->lock();
    
    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->create(
      id, state);
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (::x10aux::instanceof< ::x10::lang::FinishResilientSample*>(parent))
    {
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > parentId =
          ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::FinishResilientSample*>(parent)))->FMGL(id);
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::FinishResilientSample__State* parentState =
          ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->getOrElse(
            parentId, ::x10aux::class_cast_unchecked< ::x10::lang::FinishResilientSample__State*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10aux::nullCheck(parentState)->FMGL(children)->x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > >::add(
          id);
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->put(
          parentId, parentState);
    }
    {
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::CheckedThrowable* throwable__99243 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                ::x10::lang::Runtime::enterAtomic();
                {
                    ::x10::lang::FinishResilientSample::FMGL(ALL__get)()->add(
                      fs);
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc857) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__99244 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc857);
                {
                    throwable__99243 = formal__99244;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__99243)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__99243))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__99243));
            }
            
        }
        if (true) {
            ::x10::lang::Runtime::exitAtomic();
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__99243)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__99243)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__99243));
            }
            
        }
        
    }
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->unlock();
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124352 = ::x10aux::makeStringLit("<<<< make returning fs="); strLit__124352; })), fs));
    }
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    return fs;
    
}

//#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
void x10::lang::FinishResilientSample::notifyPlaceDeath() {
    
    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124353 = ::x10aux::makeStringLit(">>>> notifyPlaceDeath called"); strLit__124353; })));
    }
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    {
        ::x10::lang::Iterator< ::x10::lang::FinishResilientSample*>* fs__98963;
        for (fs__98963 = ::x10::lang::FinishResilientSample::FMGL(ALL__get)()->iterator();
             ::x10::lang::Iterator< ::x10::lang::FinishResilientSample*>::hasNext(::x10aux::nullCheck(fs__98963));
             ) {
            ::x10::lang::FinishResilientSample* fs = ::x10::lang::Iterator< ::x10::lang::FinishResilientSample*>::next(::x10aux::nullCheck(fs__98963));
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->lock();
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            if (::x10aux::nullCheck(fs)->quiescent()) {
                ::x10aux::nullCheck(fs)->releaseLatch();
            }
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->unlock();
        }
    }
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124354 = ::x10aux::makeStringLit("<<<< notifyPlaceDeath returning"); strLit__124354; })));
    }
    
}

//#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
void x10::lang::FinishResilientSample::releaseLatch() {
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)2ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124355 = ::x10aux::makeStringLit("releaseLatch(id="); strLit__124355; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124356 = ::x10aux::makeStringLit(") called"); strLit__124356; }))));
    }
    
    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10::lang::FinishResilient::lowLevelSend(::x10::lang::Place::place((this->FMGL(id))->location),
                                               reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishResilientSample__closure__1)))x10_lang_FinishResilientSample__closure__1(this))));
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)2ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124358 = ::x10aux::makeStringLit("releaseLatch(id="); strLit__124358; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124359 = ::x10aux::makeStringLit(") returning"); strLit__124359; }))));
    }
    
}

//#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* >
  x10::lang::FinishResilientSample::getCurrentAdopterId() {
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > currentId =
      this->FMGL(id);
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    while (true) {
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::FinishResilientSample__State* state =
          ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->getOrElse(
            currentId, ::x10aux::class_cast_unchecked< ::x10::lang::FinishResilientSample__State*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (!(::x10aux::nullCheck(state)->isAdopted())) {
            break;
        }
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        currentId = ::x10aux::nullCheck(state)->FMGL(adopterId);
    }
    
    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    return currentId;
    
}

//#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
void x10::lang::FinishResilientSample::notifySubActivitySpawn(
  ::x10::lang::Place place) {
    
    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    x10_long srcId = ::x10::lang::Place::_make(::x10aux::here)->FMGL(id);
    x10_long dstId = place->FMGL(id);
    
    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124360 = ::x10aux::makeStringLit(">>>> notifySubActivitySpawn(id="); strLit__124360; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124361 = ::x10aux::makeStringLit(") called, srcId="); strLit__124361; }))), srcId), (__extension__ ({ static ::x10::lang::String* strLit__124362 = ::x10aux::makeStringLit(" dstId="); strLit__124362; }))), dstId));
    }
    
    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->lock();
    
    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10::lang::FinishResilientSample__State* state = ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->getOrElse(
                                                         this->FMGL(id),
                                                         ::x10aux::class_cast_unchecked< ::x10::lang::FinishResilientSample__State*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (!(::x10aux::nullCheck(state)->isAdopted())) {
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::Rail< x10_int >* a__99183 = ::x10aux::nullCheck(state)->FMGL(transit);
        x10_long i__99184 = ((((srcId) * (((x10_long)::x10aux::num_hosts)))) + (dstId));
        x10_int r__99185 = ((a__99183->x10::lang::Rail< x10_int >::__apply(
                               i__99184)) + (((x10_int)1)));
        a__99183->x10::lang::Rail< x10_int >::__set(i__99184,
                                                    r__99185);
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->put(
          this->FMGL(id), state);
    } else {
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > adopterId =
          this->getCurrentAdopterId();
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::FinishResilientSample__State* adopterState =
          ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->getOrElse(
            adopterId, ::x10aux::class_cast_unchecked< ::x10::lang::FinishResilientSample__State*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::Rail< x10_int >* a__99186 = ::x10aux::nullCheck(adopterState)->FMGL(transitAdopted);
        x10_long i__99187 = ((((srcId) * (((x10_long)::x10aux::num_hosts)))) + (dstId));
        x10_int r__99188 = ((a__99186->x10::lang::Rail< x10_int >::__apply(
                               i__99187)) + (((x10_int)1)));
        a__99186->x10::lang::Rail< x10_int >::__set(i__99187,
                                                    r__99188);
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->put(
          adopterId, adopterState);
    }
    
    //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)3ll))))
    {
        ::x10aux::nullCheck(state)->dump(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124365 = ::x10aux::makeStringLit("DUMP id="); strLit__124365; })), this->FMGL(id))));
    }
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->unlock();
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124366 = ::x10aux::makeStringLit("<<<< notifySubActivitySpawn(id="); strLit__124366; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124367 = ::x10aux::makeStringLit(") returning"); strLit__124367; }))));
    }
    
}

//#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
x10_boolean x10::lang::FinishResilientSample::notifyActivityCreation(
  ::x10::lang::Place srcPlace) {
    
    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    x10_long srcId = srcPlace->FMGL(id);
    x10_long dstId = ::x10::lang::Place::_make(::x10aux::here)->FMGL(id);
    
    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124369 = ::x10aux::makeStringLit(">>>> notifyActivityCreation(id="); strLit__124369; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124370 = ::x10aux::makeStringLit(") called, srcId="); strLit__124370; }))), srcId), (__extension__ ({ static ::x10::lang::String* strLit__124371 = ::x10aux::makeStringLit(" dstId="); strLit__124371; }))), dstId));
    }
    
    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (x10rt_is_place_dead((x10_int)srcPlace->FMGL(id)))
    {
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)1ll))))
        {
            ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124372 = ::x10aux::makeStringLit("<<<< notifyActivityCreation(id="); strLit__124372; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124373 = ::x10aux::makeStringLit(") returning false"); strLit__124373; }))));
        }
        
        //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        return false;
        
    }
    
    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->lock();
    
    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10::lang::FinishResilientSample__State* state = ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->getOrElse(
                                                         this->FMGL(id),
                                                         ::x10aux::class_cast_unchecked< ::x10::lang::FinishResilientSample__State*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (!(::x10aux::nullCheck(state)->isAdopted())) {
        
        //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::Rail< x10_int >* a__99189 = ::x10aux::nullCheck(state)->FMGL(live);
        x10_long i__99190 = dstId;
        x10_int r__99191 = ((a__99189->x10::lang::Rail< x10_int >::__apply(
                               i__99190)) + (((x10_int)1)));
        a__99189->x10::lang::Rail< x10_int >::__set(i__99190,
                                                    r__99191);
        
        //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::Rail< x10_int >* a__99192 = ::x10aux::nullCheck(state)->FMGL(transit);
        x10_long i__99193 = ((((srcId) * (((x10_long)::x10aux::num_hosts)))) + (dstId));
        x10_int r__99194 = ((a__99192->x10::lang::Rail< x10_int >::__apply(
                               i__99193)) - (((x10_int)1)));
        a__99192->x10::lang::Rail< x10_int >::__set(i__99193,
                                                    r__99194);
        
        //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->put(
          this->FMGL(id), state);
    } else {
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > adopterId =
          this->getCurrentAdopterId();
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::FinishResilientSample__State* adopterState =
          ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->getOrElse(
            adopterId, ::x10aux::class_cast_unchecked< ::x10::lang::FinishResilientSample__State*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::Rail< x10_int >* a__99195 = ::x10aux::nullCheck(adopterState)->FMGL(liveAdopted);
        x10_long i__99196 = dstId;
        x10_int r__99197 = ((a__99195->x10::lang::Rail< x10_int >::__apply(
                               i__99196)) + (((x10_int)1)));
        a__99195->x10::lang::Rail< x10_int >::__set(i__99196,
                                                    r__99197);
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::Rail< x10_int >* a__99198 = ::x10aux::nullCheck(adopterState)->FMGL(transitAdopted);
        x10_long i__99199 = ((((srcId) * (((x10_long)::x10aux::num_hosts)))) + (dstId));
        x10_int r__99200 = ((a__99198->x10::lang::Rail< x10_int >::__apply(
                               i__99199)) - (((x10_int)1)));
        a__99198->x10::lang::Rail< x10_int >::__set(i__99199,
                                                    r__99200);
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->put(
          adopterId, adopterState);
    }
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)3ll))))
    {
        ::x10aux::nullCheck(state)->dump(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124379 = ::x10aux::makeStringLit("DUMP id="); strLit__124379; })), this->FMGL(id))));
    }
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->unlock();
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124380 = ::x10aux::makeStringLit("<<<< notifyActivityCreation(id="); strLit__124380; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124381 = ::x10aux::makeStringLit(") returning true"); strLit__124381; }))));
    }
    
    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    return true;
    
}

//#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
void x10::lang::FinishResilientSample::notifyActivityTermination(
  ) {
    
    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    x10_long dstId = ::x10::lang::Place::_make(::x10aux::here)->FMGL(id);
    
    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124383 = ::x10aux::makeStringLit(">>>> notifyActivityTermination(id="); strLit__124383; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124384 = ::x10aux::makeStringLit(") called, dstId="); strLit__124384; }))), dstId));
    }
    
    //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->lock();
    
    //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10::lang::FinishResilientSample__State* state = ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->getOrElse(
                                                         this->FMGL(id),
                                                         ::x10aux::class_cast_unchecked< ::x10::lang::FinishResilientSample__State*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (!(::x10aux::nullCheck(state)->isAdopted())) {
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::Rail< x10_int >* a__99201 = ::x10aux::nullCheck(state)->FMGL(live);
        x10_long i__99202 = dstId;
        x10_int r__99203 = ((a__99201->x10::lang::Rail< x10_int >::__apply(
                               i__99202)) - (((x10_int)1)));
        a__99201->x10::lang::Rail< x10_int >::__set(i__99202,
                                                    r__99203);
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->put(
          this->FMGL(id), state);
    } else {
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > adopterId =
          this->getCurrentAdopterId();
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::FinishResilientSample__State* adopterState =
          ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->getOrElse(
            adopterId, ::x10aux::class_cast_unchecked< ::x10::lang::FinishResilientSample__State*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::Rail< x10_int >* a__99204 = ::x10aux::nullCheck(adopterState)->FMGL(liveAdopted);
        x10_long i__99205 = dstId;
        x10_int r__99206 = ((a__99204->x10::lang::Rail< x10_int >::__apply(
                               i__99205)) - (((x10_int)1)));
        a__99204->x10::lang::Rail< x10_int >::__set(i__99205,
                                                    r__99206);
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->put(
          adopterId, adopterState);
    }
    
    //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (this->quiescent()) {
        this->releaseLatch();
    }
    
    //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->unlock();
    
    //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124387 = ::x10aux::makeStringLit("<<<< notifyActivityTermination(id="); strLit__124387; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124388 = ::x10aux::makeStringLit(") returning"); strLit__124388; }))));
    }
    
}

//#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
void x10::lang::FinishResilientSample::pushException(::x10::lang::Exception* t) {
    
    //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124389 = ::x10aux::makeStringLit(">>>> pushException(id="); strLit__124389; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124390 = ::x10aux::makeStringLit(") called, t="); strLit__124390; }))), t));
    }
    
    //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->lock();
    
    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10::lang::FinishResilientSample__State* state = ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->getOrElse(
                                                         this->FMGL(id),
                                                         ::x10aux::class_cast_unchecked< ::x10::lang::FinishResilientSample__State*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10aux::nullCheck(state)->FMGL(excs)->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
      t);
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->put(
      this->FMGL(id), state);
    
    //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->unlock();
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124391 = ::x10aux::makeStringLit("<<<< pushException(id="); strLit__124391; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124392 = ::x10aux::makeStringLit(") returning"); strLit__124392; }))));
    }
    
}

//#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
void x10::lang::FinishResilientSample::waitForFinish() {
    
    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert((::x10aux::struct_equals(::x10::lang::Place::place((this->FMGL(id))->location),
                                                       ::x10::lang::Place::_make(::x10aux::here))));
    #endif//NO_ASSERTIONS
    
    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124393 = ::x10aux::makeStringLit(">>>> waitForFinish(id="); strLit__124393; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124394 = ::x10aux::makeStringLit(") called"); strLit__124394; }))));
    }
    
    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    this->notifyActivityTermination();
    
    //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)2ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124395 = ::x10aux::makeStringLit("calling latch.await for id="); strLit__124395; })), this->FMGL(id)));
    }
    
    //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->await();
    
    //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)2ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124396 = ::x10aux::makeStringLit("returned from latch.await for id="); strLit__124396; })), this->FMGL(id)));
    }
    
    //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10::lang::MultipleExceptions* e = ::x10aux::class_cast_unchecked< ::x10::lang::MultipleExceptions*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    
    //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->lock();
    
    //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10::lang::FinishResilientSample__State* state = ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->getOrElse(
                                                         this->FMGL(id),
                                                         ::x10aux::class_cast_unchecked< ::x10::lang::FinishResilientSample__State*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (!(::x10aux::nullCheck(state)->isAdopted())) {
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        e = ::x10::lang::MultipleExceptions::make(::x10aux::nullCheck(state)->FMGL(excs));
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->remove(
          this->FMGL(id));
    } else {
     
    }
    {
        
        //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::lang::CheckedThrowable* throwable__99246 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                ::x10::lang::Runtime::enterAtomic();
                {
                    ::x10::lang::FinishResilientSample::FMGL(ALL__get)()->remove(
                      this);
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc866) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__99247 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc866);
                {
                    throwable__99246 = formal__99247;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__99246)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__99246))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__99246));
            }
            
        }
        if (true) {
            ::x10::lang::Runtime::exitAtomic();
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__99246)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__99246)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__99246));
            }
            
        }
        
    }
    
    //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->unlock();
    
    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124401 = ::x10aux::makeStringLit("<<<< waitForFinish(id="); strLit__124401; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124402 = ::x10aux::makeStringLit(") returning, exc="); strLit__124402; }))), e));
    }
    
    //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if ((!::x10aux::struct_equals(e, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        ::x10aux::throwException(::x10aux::nullCheck(e));
    }
    
}

//#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
x10_boolean x10::lang::FinishResilientSample::quiescent() {
    
    //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)2ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124403 = ::x10aux::makeStringLit("quiescent(id="); strLit__124403; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124404 = ::x10aux::makeStringLit(") called"); strLit__124404; }))));
    }
    
    //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10::lang::FinishResilientSample__State* state = ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->getOrElse(
                                                         this->FMGL(id),
                                                         ::x10aux::class_cast_unchecked< ::x10::lang::FinishResilientSample__State*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    x10_long nd = ((x10_long)x10rt_ndead());
    
    //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if ((!::x10aux::struct_equals(nd, ::x10aux::nullCheck(state)->FMGL(numDead))))
    {
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10aux::nullCheck(state)->FMGL(numDead) = nd;
        
        //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > >* children =
          ::x10aux::nullCheck(state)->FMGL(children);
        
        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        {
            x10_long chIndex;
            for (chIndex = ((x10_long)0ll); ((chIndex) < (children->FMGL(size)));
                 chIndex = ((chIndex) + (((x10_long)1ll))))
            {
                
                //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > childId =
                  (__extension__ ({
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    x10_long idx__99158 = chIndex;
                    ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > ret__99159;
                    
                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    ret__99159 = ::x10aux::nullCheck(children->FMGL(data))->x10::lang::Rail< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > >::__apply(
                                   idx__99158);
                    ret__99159;
                }))
                ;
                
                //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                if (!((__extension__ ({
                        ::x10::lang::Place this__99161 = ::x10::lang::Place::place((childId)->location);
                        x10rt_is_place_dead((x10_int)this__99161->FMGL(id));
                    }))
                    )) {
                    continue;
                }
                
                //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > lastChildId =
                  children->x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > >::removeLast();
                
                //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                if (((chIndex) < (children->FMGL(size))))
                {
                    
                    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    x10_long idx__99207 = chIndex;
                    ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > v__99208 =
                      lastChildId;
                    
                    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    if ((::x10aux::struct_equals(idx__99207,
                                                 children->FMGL(size))))
                    {
                        
                        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        children->x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > >::add(
                          v__99208);
                    } else {
                        
                        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        ::x10aux::nullCheck(children->FMGL(data))->x10::lang::Rail< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > >::__set(
                          idx__99207, v__99208);
                    }
                    
                }
                
                //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                chIndex = ((chIndex) - (((x10_long)1ll)));
                
                //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)3ll))))
                {
                    ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124406 = ::x10aux::makeStringLit("adopting childId="); strLit__124406; })), childId));
                }
                
                //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                ::x10::lang::FinishResilientSample__State* childState =
                  ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->getOrElse(
                    childId, ::x10aux::class_cast_unchecked< ::x10::lang::FinishResilientSample__State*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                
                //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                #ifndef NO_ASSERTIONS
                if (::x10aux::x10__assertions_enabled)
                    ::x10aux::x10__assert(!(::x10aux::nullCheck(childState)->isAdopted()));
                #endif//NO_ASSERTIONS
                
                //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                ::x10aux::nullCheck(childState)->FMGL(adopterId) =
                  this->FMGL(id);
                
                //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->put(
                  childId, childState);
                
                //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                ::x10aux::nullCheck(state)->FMGL(children)->x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > >::addAll(
                  ::x10aux::nullCheck(childState)->FMGL(children));
                
                //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                x10_long i__98983max__99219 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
                {
                    x10_long i__99220;
                    for (i__99220 = ((x10_long)0ll); ((i__99220) <= (i__98983max__99219));
                         i__99220 = ((i__99220) + (((x10_long)1ll))))
                    {
                        x10_long i__99221 = i__99220;
                        
                        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        ::x10::lang::Rail< x10_int >* a__99213 =
                          ::x10aux::nullCheck(state)->FMGL(liveAdopted);
                        x10_long i__99214 = i__99221;
                        x10_int r__99215 = ((a__99213->x10::lang::Rail< x10_int >::__apply(
                                               i__99214)) + (((::x10aux::nullCheck(childState)->FMGL(live)->x10::lang::Rail< x10_int >::__apply(
                                                                 i__99221)) + (::x10aux::nullCheck(childState)->FMGL(liveAdopted)->x10::lang::Rail< x10_int >::__apply(
                                                                                 i__99221)))));
                        a__99213->x10::lang::Rail< x10_int >::__set(
                          i__99214, r__99215);
                        
                        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        x10_long i__98965max__99216 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
                        {
                            x10_long i__99217;
                            for (i__99217 = ((x10_long)0ll);
                                 ((i__99217) <= (i__98965max__99216));
                                 i__99217 = ((i__99217) + (((x10_long)1ll))))
                            {
                                x10_long j__99218 = i__99217;
                                
                                //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                                x10_long idx__99212 = ((((i__99221) * (((x10_long)::x10aux::num_hosts)))) + (j__99218));
                                
                                //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                                ::x10::lang::Rail< x10_int >* a__99209 =
                                  ::x10aux::nullCheck(state)->FMGL(transitAdopted);
                                x10_long i__99210 = idx__99212;
                                x10_int r__99211 = ((a__99209->x10::lang::Rail< x10_int >::__apply(
                                                       i__99210)) + (((::x10aux::nullCheck(childState)->FMGL(transit)->x10::lang::Rail< x10_int >::__apply(
                                                                         idx__99212)) + (::x10aux::nullCheck(childState)->FMGL(transitAdopted)->x10::lang::Rail< x10_int >::__apply(
                                                                                           idx__99212)))));
                                a__99209->x10::lang::Rail< x10_int >::__set(
                                  i__99210, r__99211);
                            }
                        }
                        
                    }
                }
                
            }
        }
        
    }
    
    //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    x10_long i__99055max__99237 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
    {
        x10_long i__99238;
        for (i__99238 = ((x10_long)0ll); ((i__99238) <= (i__99055max__99237));
             i__99238 = ((i__99238) + (((x10_long)1ll))))
        {
            x10_long i__99239 = i__99238;
            
            //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            if (x10rt_is_place_dead((x10_int)i__99239)) {
                
                //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                x10_long i__99001max__99227 = ((x10_long)(::x10aux::nullCheck(state)->FMGL(live)->x10::lang::Rail< x10_int >::__apply(
                                                            i__99239)));
                {
                    x10_long i__99228;
                    for (i__99228 = ((x10_long)1ll); ((i__99228) <= (i__99001max__99227));
                         i__99228 = ((i__99228) + (((x10_long)1ll))))
                    {
                        x10_long unused__99229 = i__99228;
                        
                        //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)3ll))))
                        {
                            ::x10::lang::FinishResilient::debug(
                              ::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124414 = ::x10aux::makeStringLit("adding DPE for live("); strLit__124414; })), i__99239), (__extension__ ({ static ::x10::lang::String* strLit__124415 = ::x10aux::makeStringLit(")"); strLit__124415; }))));
                        }
                        
                        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        this->addDeadPlaceException(state,
                                                    i__99239);
                    }
                }
                
                //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                ::x10aux::nullCheck(state)->FMGL(live)->x10::lang::Rail< x10_int >::__set(
                  i__99239, ((x10_int)0));
                ::x10aux::nullCheck(state)->FMGL(liveAdopted)->x10::lang::Rail< x10_int >::__set(
                  i__99239, ((x10_int)0));
                
                //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                x10_long i__99037max__99230 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
                {
                    x10_long i__99231;
                    for (i__99231 = ((x10_long)0ll); ((i__99231) <= (i__99037max__99230));
                         i__99231 = ((i__99231) + (((x10_long)1ll))))
                    {
                        x10_long j__99232 = i__99231;
                        
                        //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        x10_long idx__99225 = ((((i__99239) * (((x10_long)::x10aux::num_hosts)))) + (j__99232));
                        
                        //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        ::x10aux::nullCheck(state)->FMGL(transit)->x10::lang::Rail< x10_int >::__set(
                          idx__99225, ((x10_int)0));
                        ::x10aux::nullCheck(state)->FMGL(transitAdopted)->x10::lang::Rail< x10_int >::__set(
                          idx__99225, ((x10_int)0));
                        
                        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        x10_long idx__99226 = ((((j__99232) * (((x10_long)::x10aux::num_hosts)))) + (i__99239));
                        
                        //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        x10_long i__99019max__99222 = ((x10_long)(::x10aux::nullCheck(state)->FMGL(transit)->x10::lang::Rail< x10_int >::__apply(
                                                                    idx__99226)));
                        {
                            x10_long i__99223;
                            for (i__99223 = ((x10_long)1ll);
                                 ((i__99223) <= (i__99019max__99222));
                                 i__99223 = ((i__99223) + (((x10_long)1ll))))
                            {
                                x10_long unused__99224 = i__99223;
                                
                                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                                if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)3ll))))
                                {
                                    ::x10::lang::FinishResilient::debug(
                                      ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124417 = ::x10aux::makeStringLit("adding DPE for transit("); strLit__124417; })), j__99232), (__extension__ ({ static ::x10::lang::String* strLit__124418 = ::x10aux::makeStringLit(","); strLit__124418; }))), i__99239), (__extension__ ({ static ::x10::lang::String* strLit__124419 = ::x10aux::makeStringLit(")"); strLit__124419; }))));
                                }
                                
                                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                                this->addDeadPlaceException(
                                  state, i__99239);
                            }
                        }
                        
                        //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        ::x10aux::nullCheck(state)->FMGL(transit)->x10::lang::Rail< x10_int >::__set(
                          idx__99226, ((x10_int)0));
                        ::x10aux::nullCheck(state)->FMGL(transitAdopted)->x10::lang::Rail< x10_int >::__set(
                          idx__99226, ((x10_int)0));
                    }
                }
                
            }
            
        }
    }
    
    //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10aux::nullCheck(::x10::lang::FinishResilientSample::FMGL(RS__get)())->put(
      this->FMGL(id), state);
    
    //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)3ll))))
    {
        ::x10aux::nullCheck(state)->dump(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124420 = ::x10aux::makeStringLit("DUMP id="); strLit__124420; })), this->FMGL(id))));
    }
    
    //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    x10_boolean quiet = true;
    
    //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    x10_long i__99091max__99240 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
    {
        x10_long i__99241;
        for (i__99241 = ((x10_long)0ll); ((i__99241) <= (i__99091max__99240));
             i__99241 = ((i__99241) + (((x10_long)1ll))))
        {
            x10_long i__99242 = i__99241;
            
            //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            if (((((x10_long)(::x10aux::nullCheck(state)->FMGL(live)->x10::lang::Rail< x10_int >::__apply(
                                i__99242)))) > (((x10_long)0ll))))
            {
                quiet = false;
                break;
            }
            
            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            if (((((x10_long)(::x10aux::nullCheck(state)->FMGL(liveAdopted)->x10::lang::Rail< x10_int >::__apply(
                                i__99242)))) > (((x10_long)0ll))))
            {
                quiet = false;
                break;
            }
            
            //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10_long i__99073max__99234 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
            {
                x10_long i__99235;
                for (i__99235 = ((x10_long)0ll); ((i__99235) <= (i__99073max__99234));
                     i__99235 = ((i__99235) + (((x10_long)1ll))))
                {
                    x10_long j__99236 = i__99235;
                    
                    //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    x10_long idx__99233 = ((((i__99242) * (((x10_long)::x10aux::num_hosts)))) + (j__99236));
                    
                    //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    if (((((x10_long)(::x10aux::nullCheck(state)->FMGL(transit)->x10::lang::Rail< x10_int >::__apply(
                                        idx__99233)))) > (((x10_long)0ll))))
                    {
                        quiet = false;
                        break;
                    }
                    
                    //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    if (((((x10_long)(::x10aux::nullCheck(state)->FMGL(transitAdopted)->x10::lang::Rail< x10_int >::__apply(
                                        idx__99233)))) > (((x10_long)0ll))))
                    {
                        quiet = false;
                        break;
                    }
                    
                }
            }
            
            //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            if (!(quiet)) {
                break;
            }
            
        }
    }
    
    //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    if (((::x10::lang::FinishResilientSample::FMGL(verbose__get)()) >= (((x10_long)2ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124425 = ::x10aux::makeStringLit("quiescent(id="); strLit__124425; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124426 = ::x10aux::makeStringLit(") returning "); strLit__124426; }))), quiet));
    }
    
    //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    return quiet;
    
}

//#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
void x10::lang::FinishResilientSample::addDeadPlaceException(
  ::x10::lang::FinishResilientSample__State* state, x10_long placeId) {
    
    //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10::lang::DeadPlaceException* e = ::x10::lang::DeadPlaceException::_make((__extension__ ({
                                                                                    ::x10::lang::Place alloc__98861 =
                                                                                      
                                                                                    ::x10::lang::Place::_alloc();
                                                                                    (alloc__98861)->::x10::lang::Place::_constructor(
                                                                                      placeId);
                                                                                    alloc__98861;
                                                                                }))
                                                                                );
    
    //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    e->fillInStackTrace();
    
    //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10aux::nullCheck(state)->FMGL(excs)->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
      reinterpret_cast< ::x10::lang::Exception*>(e));
}

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
::x10::lang::FinishResilientSample* x10::lang::FinishResilientSample::x10__lang__FinishResilientSample____this__x10__lang__FinishResilientSample(
  ) {
    return this;
    
}
void x10::lang::FinishResilientSample::__fieldInitializers_x10_lang_FinishResilientSample(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::FinishResilientSample::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishResilientSample::_deserializer);

void x10::lang::FinishResilientSample::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::FinishResilient::_serialize_body(buf);
    buf.write(this->FMGL(id));
    
}

::x10::lang::Reference* ::x10::lang::FinishResilientSample::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishResilientSample* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishResilientSample>()) ::x10::lang::FinishResilientSample();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishResilientSample::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishResilient::_deserialize_body(buf);
    FMGL(id) = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > >();
    
}

::x10aux::RuntimeType x10::lang::FinishResilientSample::rtt;
void x10::lang::FinishResilientSample::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::FinishResilient>(), ::x10aux::getRTT< ::x10::lang::Runtime__Mortal>()};
    rtt.initStageTwo("x10.lang.FinishResilientSample",::x10aux::RuntimeType::class_kind, 2, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilientSample__closure__1>x10_lang_FinishResilientSample__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilientSample__closure__1::__apply, &x10_lang_FinishResilientSample__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishResilientSample__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishResilientSample__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishResilientSample__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilientSample__closure__1::_deserialize);

/* END of FinishResilientSample */
/*************************************************/
/*************************************************/
/* START of FinishResilientSample$State */
#include <x10/lang/FinishResilientSample__State.h>

#include <x10/lang/Int.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/Long.h>
#include <x10/lang/Rail.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/Exception.h>
#include <x10/lang/FinishResilientSample.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Any.h>
#include <x10/util/StringBuilder.h>
#include <x10/lang/String.h>
#include <x10/lang/FinishResilient.h>
#include <x10/compiler/Synthetic.h>
#include <x10/lang/Place.h>

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"

//#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"

//#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"

//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"

//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"

//#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
x10_boolean x10::lang::FinishResilientSample__State::isAdopted() {
    return !((this->FMGL(adopterId))->isNull());
    
}

//#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"

//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
void x10::lang::FinishResilientSample__State::dump(::x10::lang::Any* msg) {
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10::util::StringBuilder* s =  (new (::x10aux::alloc_z< ::x10::util::StringBuilder>()) ::x10::util::StringBuilder());
    (s)->::x10::util::StringBuilder::_constructor();
    reinterpret_cast< ::x10::util::StringBuilder*>(s->add(msg));
    s->add(((x10_char)'\n'));
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    s->add((__extension__ ({ static ::x10::lang::String* strLit__124430 = ::x10aux::makeStringLit("           live:"); strLit__124430; })));
    ::x10::lang::Rail< x10_int >* rail__99166 = this->FMGL(live);
    x10_long size__99167 = (x10_long)(::x10aux::nullCheck(rail__99166)->FMGL(size));
    {
        x10_long idx__99168;
        for (idx__99168 = ((x10_long)0ll); ((idx__99168) < (size__99167));
             idx__99168 = ((idx__99168) + (((x10_long)1ll)))) {
            x10_int v__99169 = rail__99166->x10::lang::Rail< x10_int >::__apply(
                                 idx__99168);
            s->add(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124433 = ::x10aux::makeStringLit(" "); strLit__124433; })), v__99169));
        }
    }
    s->add(((x10_char)'\n'));
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    s->add((__extension__ ({ static ::x10::lang::String* strLit__124436 = ::x10aux::makeStringLit("    liveAdopted:"); strLit__124436; })));
    ::x10::lang::Rail< x10_int >* rail__99170 = this->FMGL(liveAdopted);
    x10_long size__99171 = (x10_long)(::x10aux::nullCheck(rail__99170)->FMGL(size));
    {
        x10_long idx__99172;
        for (idx__99172 = ((x10_long)0ll); ((idx__99172) < (size__99171));
             idx__99172 = ((idx__99172) + (((x10_long)1ll)))) {
            x10_int v__99173 = rail__99170->x10::lang::Rail< x10_int >::__apply(
                                 idx__99172);
            s->add(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124439 = ::x10aux::makeStringLit(" "); strLit__124439; })), v__99173));
        }
    }
    s->add(((x10_char)'\n'));
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    s->add((__extension__ ({ static ::x10::lang::String* strLit__124442 = ::x10aux::makeStringLit("        transit:"); strLit__124442; })));
    ::x10::lang::Rail< x10_int >* rail__99174 = this->FMGL(transit);
    x10_long size__99175 = (x10_long)(::x10aux::nullCheck(rail__99174)->FMGL(size));
    {
        x10_long idx__99176;
        for (idx__99176 = ((x10_long)0ll); ((idx__99176) < (size__99175));
             idx__99176 = ((idx__99176) + (((x10_long)1ll)))) {
            x10_int v__99177 = rail__99174->x10::lang::Rail< x10_int >::__apply(
                                 idx__99176);
            s->add(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124445 = ::x10aux::makeStringLit(" "); strLit__124445; })), v__99177));
        }
    }
    s->add(((x10_char)'\n'));
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    s->add((__extension__ ({ static ::x10::lang::String* strLit__124448 = ::x10aux::makeStringLit(" transitAdopted:"); strLit__124448; })));
    ::x10::lang::Rail< x10_int >* rail__99178 = this->FMGL(transitAdopted);
    x10_long size__99179 = (x10_long)(::x10aux::nullCheck(rail__99178)->FMGL(size));
    {
        x10_long idx__99180;
        for (idx__99180 = ((x10_long)0ll); ((idx__99180) < (size__99179));
             idx__99180 = ((idx__99180) + (((x10_long)1ll)))) {
            x10_int v__99181 = rail__99178->x10::lang::Rail< x10_int >::__apply(
                                 idx__99180);
            s->add(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124451 = ::x10aux::makeStringLit(" "); strLit__124451; })), v__99181));
        }
    }
    s->add(((x10_char)'\n'));
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    s->add(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124454 = ::x10aux::makeStringLit("  children.size: "); strLit__124454; })), (__extension__ ({
               ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > >* this__99108 =
                 this->FMGL(children);
               this__99108->FMGL(size);
           }))
           ));
    s->add(((x10_char)'\n'));
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    s->add(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124457 = ::x10aux::makeStringLit("      adopterId: "); strLit__124457; })), this->FMGL(adopterId)));
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    ::x10::lang::FinishResilient::debug(s->toString());
}

//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
::x10::lang::FinishResilientSample__State* x10::lang::FinishResilientSample__State::x10__lang__FinishResilientSample__State____this__x10__lang__FinishResilientSample__State(
  ) {
    return this;
    
}
void x10::lang::FinishResilientSample__State::_constructor(
  ) {
    this->x10::lang::FinishResilientSample__State::__fieldInitializers_x10_lang_FinishResilientSample_State();
}
::x10::lang::FinishResilientSample__State* x10::lang::FinishResilientSample__State::_make(
  ) {
    ::x10::lang::FinishResilientSample__State* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishResilientSample__State>()) ::x10::lang::FinishResilientSample__State();
    this_->_constructor();
    return this_;
}


void x10::lang::FinishResilientSample__State::__fieldInitializers_x10_lang_FinishResilientSample_State(
  ) {
    this->FMGL(transit) = ::x10::lang::Rail< x10_int >::_make(((((x10_long)::x10aux::num_hosts)) * (((x10_long)::x10aux::num_hosts))),
                                                              ((x10_int)0));
    this->FMGL(transitAdopted) = ::x10::lang::Rail< x10_int >::_make(((((x10_long)::x10aux::num_hosts)) * (((x10_long)::x10aux::num_hosts))),
                                                                     ((x10_int)0));
    this->FMGL(live) = ::x10::lang::Rail< x10_int >::_make(((x10_long)::x10aux::num_hosts),
                                                           ((x10_int)0));
    this->FMGL(liveAdopted) = ::x10::lang::Rail< x10_int >::_make(((x10_long)::x10aux::num_hosts),
                                                                  ((x10_int)0));
    this->FMGL(excs) = (__extension__ ({
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::util::GrowableRail< ::x10::lang::Exception*>* alloc__98859 =
           (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Exception*> >()) ::x10::util::GrowableRail< ::x10::lang::Exception*>());
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (alloc__98859)->::x10::util::GrowableRail< ::x10::lang::Exception*>::_constructor(
          ((x10_long)0ll));
        alloc__98859;
    }))
    ;
    this->FMGL(children) = (__extension__ ({
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > >* alloc__98860 =
           (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > > >()) ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > >());
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (alloc__98860)->::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > >::_constructor(
          ((x10_long)0ll));
        alloc__98860;
    }))
    ;
    this->FMGL(adopterId) = ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* >(::x10aux::class_cast_unchecked< ::x10::lang::FinishResilientSample*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(numDead) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t x10::lang::FinishResilientSample__State::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishResilientSample__State::_deserializer);

void x10::lang::FinishResilientSample__State::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(transit));
    buf.write(this->FMGL(transitAdopted));
    buf.write(this->FMGL(live));
    buf.write(this->FMGL(liveAdopted));
    buf.write(this->FMGL(excs));
    buf.write(this->FMGL(children));
    buf.write(this->FMGL(adopterId));
    buf.write(this->FMGL(numDead));
    
}

::x10::lang::Reference* ::x10::lang::FinishResilientSample__State::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishResilientSample__State* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishResilientSample__State>()) ::x10::lang::FinishResilientSample__State();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishResilientSample__State::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(transit) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(transitAdopted) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(live) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(liveAdopted) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(excs) = buf.read< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>();
    FMGL(children) = buf.read< ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > >*>();
    FMGL(adopterId) = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* > >();
    FMGL(numDead) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::lang::FinishResilientSample__State::rtt;
void x10::lang::FinishResilientSample__State::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.FinishResilientSample.State",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of FinishResilientSample$State */
/*************************************************/
