/*************************************************/
/* START of Activity */
#include <x10/lang/Activity.h>


//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
x10_boolean x10::lang::Activity::FMGL(DEALLOC_BODY);
void x10::lang::Activity::FMGL(DEALLOC_BODY__do_init)() {
    FMGL(DEALLOC_BODY__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Activity.DEALLOC_BODY");
    x10_boolean __var701__ = ::x10::lang::Activity::canDealloc();
    FMGL(DEALLOC_BODY) = __var701__;
    FMGL(DEALLOC_BODY__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Activity::FMGL(DEALLOC_BODY__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(DEALLOC_BODY__status), &FMGL(DEALLOC_BODY__do_init), &FMGL(DEALLOC_BODY__exception), "x10::lang::Activity.DEALLOC_BODY");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Activity::FMGL(DEALLOC_BODY__status);
::x10::lang::CheckedThrowable* x10::lang::Activity::FMGL(DEALLOC_BODY__exception);

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
x10_boolean x10::lang::Activity::canDealloc() {
    return true;
    
}

//#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
/**
     * the finish state governing the execution of this activity (may be remote)
     */

//#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
/**
     * The user-specified code for this activity.
     */

//#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
/**
     * The mapping from registered clocks to phases for this activity.
     * Lazily created.
     */

//#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
/** Set to true unless this activity represents the body of an 'at' statement.
     */

//#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
/** Set to true unless this activity was spawned by a place that then immediately died
     */

//#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
/**
     * Depth of enclosong atomic blocks
     */

//#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
void x10::lang::Activity::_constructor(::x10::lang::VoidFun_0_0* body, ::x10::lang::Place srcPlace,
                                       ::x10::lang::FinishState* finishState) {
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    ::x10::lang::Activity* this__92939 = this;
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    ::x10::lang::VoidFun_0_0* body__92940 = body;
    ::x10::lang::Place srcPlace__92941 = srcPlace;
    ::x10::lang::FinishState* finishState__92942 = finishState;
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    (this__92939)->::x10::lang::Activity::_constructor(body__92940,
                                                       srcPlace__92941,
                                                       finishState__92942,
                                                       true, true);
    
}
::x10::lang::Activity* x10::lang::Activity::_make(::x10::lang::VoidFun_0_0* body,
                                                  ::x10::lang::Place srcPlace,
                                                  ::x10::lang::FinishState* finishState)
{
    ::x10::lang::Activity* this_ = new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity();
    this_->_constructor(body, srcPlace, finishState);
    return this_;
}



//#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
void x10::lang::Activity::_constructor(::x10::lang::VoidFun_0_0* body,
                                       ::x10::lang::Place srcPlace,
                                       ::x10::lang::FinishState* finishState,
                                       x10_boolean nac) {
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    (this)->::x10::lang::Activity::_constructor(body, srcPlace,
                                                finishState,
                                                nac, true);
    
}
::x10::lang::Activity* x10::lang::Activity::_make(::x10::lang::VoidFun_0_0* body,
                                                  ::x10::lang::Place srcPlace,
                                                  ::x10::lang::FinishState* finishState,
                                                  x10_boolean nac)
{
    ::x10::lang::Activity* this_ = new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity();
    this_->_constructor(body, srcPlace, finishState, nac);
    return this_;
}



//#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
void x10::lang::Activity::_constructor(::x10::lang::VoidFun_0_0* body,
                                       ::x10::lang::Place srcPlace,
                                       ::x10::lang::FinishState* finishState,
                                       x10_boolean nac, x10_boolean nt) {
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    ::x10::lang::Activity* this__92943 = this;
    ::x10aux::nullCheck(this__92943)->FMGL(finishState) =
      (::x10aux::class_cast_unchecked< ::x10::lang::FinishState*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    ::x10aux::nullCheck(this__92943)->FMGL(clockPhases) =
      (::x10aux::class_cast_unchecked< ::x10::lang::Activity__ClockPhases*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    ::x10aux::nullCheck(this__92943)->FMGL(atomicDepth) =
      ((x10_int)0);
    
    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    this->FMGL(finishState) = finishState;
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    this->FMGL(shouldNotifyTermination) = nt;
    
    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    if (nac) {
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        this->FMGL(confirmed) = ::x10aux::nullCheck(finishState)->notifyActivityCreation(
                                  srcPlace);
    } else {
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        this->FMGL(confirmed) = true;
    }
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    this->FMGL(body) = body;
}
::x10::lang::Activity* x10::lang::Activity::_make(::x10::lang::VoidFun_0_0* body,
                                                  ::x10::lang::Place srcPlace,
                                                  ::x10::lang::FinishState* finishState,
                                                  x10_boolean nac,
                                                  x10_boolean nt)
{
    ::x10::lang::Activity* this_ = new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity();
    this_->_constructor(body, srcPlace, finishState, nac,
    nt);
    return this_;
}



//#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
void x10::lang::Activity::_constructor(::x10::lang::VoidFun_0_0* body,
                                       ::x10::lang::Place srcPlace,
                                       ::x10::lang::FinishState* finishState,
                                       ::x10::lang::Activity__ClockPhases* clockPhases) {
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    ::x10::lang::Activity* this__92947 = this;
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    ::x10::lang::VoidFun_0_0* body__92948 = body;
    ::x10::lang::Place srcPlace__92949 = srcPlace;
    ::x10::lang::FinishState* finishState__92950 = finishState;
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    ::x10::lang::VoidFun_0_0* body__92944 = body__92948;
    ::x10::lang::Place srcPlace__92945 = srcPlace__92949;
    ::x10::lang::FinishState* finishState__92946 = finishState__92950;
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    (this__92947)->::x10::lang::Activity::_constructor(body__92944,
                                                       srcPlace__92945,
                                                       finishState__92946,
                                                       true,
                                                       true);
    
    //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    this->FMGL(clockPhases) = clockPhases;
}
::x10::lang::Activity* x10::lang::Activity::_make(::x10::lang::VoidFun_0_0* body,
                                                  ::x10::lang::Place srcPlace,
                                                  ::x10::lang::FinishState* finishState,
                                                  ::x10::lang::Activity__ClockPhases* clockPhases)
{
    ::x10::lang::Activity* this_ = new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity();
    this_->_constructor(body, srcPlace, finishState, clockPhases);
    return this_;
}



//#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
::x10::lang::Activity__ClockPhases* x10::lang::Activity::clockPhases(
  ) {
    
    //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                 this->FMGL(clockPhases))))
    {
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        this->FMGL(clockPhases) = (__extension__ ({
            ::x10::lang::Activity__ClockPhases* alloc__88073 =
               (new (::x10aux::alloc_z< ::x10::lang::Activity__ClockPhases>()) ::x10::lang::Activity__ClockPhases());
            (alloc__88073)->::x10::lang::Activity__ClockPhases::_constructor();
            alloc__88073;
        }))
        ;
    }
    
    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    return this->FMGL(clockPhases);
    
}

//#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
::x10::lang::FinishState* x10::lang::Activity::finishState(
  ) {
    return this->FMGL(finishState);
    
}

//#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
::x10::lang::FinishState* x10::lang::Activity::swapFinish(
  ::x10::lang::FinishState* f) {
    
    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    ::x10::lang::FinishState* old = this->FMGL(finishState);
    
    //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    this->FMGL(finishState) = f;
    
    //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    return old;
    
}

//#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
void x10::lang::Activity::pushAtomic() {
    
    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    this->FMGL(atomicDepth) = ((this->FMGL(atomicDepth)) + (((x10_int)1)));
}

//#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
void x10::lang::Activity::popAtomic() {
    
    //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    this->FMGL(atomicDepth) = ((this->FMGL(atomicDepth)) - (((x10_int)1)));
}

//#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
void x10::lang::Activity::ensureNotInAtomic() {
    
    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    if (((((x10_long)(this->FMGL(atomicDepth)))) > (((x10_long)0ll))))
    {
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalOperationException::_make()));
    }
    
}

//#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
void x10::lang::Activity::run() {
    
    //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    if (this->FMGL(confirmed)) {
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        try {
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(this->FMGL(body)));
        }
        catch (::x10::lang::CheckedThrowable* __exc710) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc710)) {
                ::x10::lang::Error* t = static_cast< ::x10::lang::Error*>(__exc710);
                {
                    
                    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    ::x10aux::nullCheck(this->FMGL(finishState))->pushException(
                      reinterpret_cast< ::x10::lang::Exception*>(::x10::lang::WrappedThrowable::_make(reinterpret_cast< ::x10::lang::CheckedThrowable*>(t))));
                }
            } else
            if (::x10aux::instanceof< ::x10::lang::Exception*>(__exc710)) {
                ::x10::lang::Exception* t = static_cast< ::x10::lang::Exception*>(__exc710);
                {
                    
                    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    ::x10aux::nullCheck(this->FMGL(finishState))->pushException(
                      t);
                }
            } else
            throw;
        }
        
        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                      this->FMGL(clockPhases))))
        {
            ::x10aux::nullCheck(this->FMGL(clockPhases))->drop();
        }
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        if (this->FMGL(shouldNotifyTermination)) {
            ::x10aux::nullCheck(this->FMGL(finishState))->notifyActivityTermination();
        }
        
    }
    
    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    if (::x10::lang::Activity::FMGL(DEALLOC_BODY__get)())
    {
        ::x10aux::dealloc(this->FMGL(body));
    }
    
}

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
::x10::lang::Activity* x10::lang::Activity::x10__lang__Activity____this__x10__lang__Activity(
  ) {
    return this;
    
}
void x10::lang::Activity::__fieldInitializers_x10_lang_Activity(
  ) {
    this->FMGL(finishState) = (::x10aux::class_cast_unchecked< ::x10::lang::FinishState*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(clockPhases) = (::x10aux::class_cast_unchecked< ::x10::lang::Activity__ClockPhases*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(atomicDepth) = ((x10_int)0);
}
const ::x10aux::serialization_id_t x10::lang::Activity::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Activity::_deserializer);

void x10::lang::Activity::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(finishState));
    buf.write(this->FMGL(body));
    buf.write(this->FMGL(clockPhases));
    buf.write(this->FMGL(shouldNotifyTermination));
    buf.write(this->FMGL(confirmed));
    buf.write(this->FMGL(atomicDepth));
    
}

::x10::lang::Reference* ::x10::lang::Activity::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Activity* this_ = new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::Activity::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(finishState) = buf.read< ::x10::lang::FinishState*>();
    FMGL(body) = buf.read< ::x10::lang::VoidFun_0_0*>();
    FMGL(clockPhases) = buf.read< ::x10::lang::Activity__ClockPhases*>();
    FMGL(shouldNotifyTermination) = buf.read<x10_boolean>();
    FMGL(confirmed) = buf.read<x10_boolean>();
    FMGL(atomicDepth) = buf.read<x10_int>();
}

::x10aux::RuntimeType x10::lang::Activity::rtt;
void x10::lang::Activity::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.Activity",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of Activity */
/*************************************************/
/*************************************************/
/* START of Activity$ClockPhases */
#include <x10/lang/Activity__ClockPhases.h>

#include <x10/util/HashMap.h>
#include <x10/lang/Clock.h>
#include <x10/lang/Int.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/util/Box.h>
#include <x10/lang/Iterator.h>
#include <x10/util/Map__Entry.h>
#include <x10/lang/Iterable.h>
#include <x10/util/Set.h>
#include <x10/io/Serializer.h>
#include <x10/io/Deserializer.h>
#include <x10/compiler/Synthetic.h>
::x10::util::Map< ::x10::lang::Clock*, x10_int>::itable< ::x10::lang::Activity__ClockPhases >  x10::lang::Activity__ClockPhases::_itable_0(&::x10::util::HashMap< ::x10::lang::Clock*, x10_int>::clear, &::x10::util::HashMap< ::x10::lang::Clock*, x10_int>::containsKey, &::x10::util::HashMap< ::x10::lang::Clock*, x10_int>::entries, &::x10::lang::X10Class::equals, &::x10::util::HashMap< ::x10::lang::Clock*, x10_int>::get, &::x10::util::HashMap< ::x10::lang::Clock*, x10_int>::getOrElse, &::x10::util::HashMap< ::x10::lang::Clock*, x10_int>::getOrThrow, &::x10::lang::X10Class::hashCode, &::x10::util::HashMap< ::x10::lang::Clock*, x10_int>::keySet, &::x10::util::HashMap< ::x10::lang::Clock*, x10_int>::put, &::x10::util::HashMap< ::x10::lang::Clock*, x10_int>::remove, &::x10::util::HashMap< ::x10::lang::Clock*, x10_int>::size, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::Activity__ClockPhases >  x10::lang::Activity__ClockPhases::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::io::CustomSerialization::itable< ::x10::lang::Activity__ClockPhases >  x10::lang::Activity__ClockPhases::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::lang::Activity__ClockPhases::serialize, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::Activity__ClockPhases::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::util::Map< ::x10::lang::Clock*, x10_int> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::CustomSerialization>, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::Activity__ClockPhases")};

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
::x10::lang::Activity__ClockPhases* x10::lang::Activity__ClockPhases::make(
  ::x10::lang::Rail< ::x10::lang::Clock* >* clocks) {
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    ::x10::lang::Activity__ClockPhases* clockPhases =  (new (::x10aux::alloc_z< ::x10::lang::Activity__ClockPhases>()) ::x10::lang::Activity__ClockPhases());
    (clockPhases)->::x10::lang::Activity__ClockPhases::_constructor();
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    {
        x10_long i;
        for (i = ((x10_long)0ll); ((i) < ((x10_long)(::x10aux::nullCheck(clocks)->FMGL(size))));
             i = ((i) + (((x10_long)1ll)))) {
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            clockPhases->put(::x10aux::nullCheck(clocks)->x10::lang::Rail< ::x10::lang::Clock* >::__apply(
                               i), ::x10aux::nullCheck(::x10aux::nullCheck(clocks)->x10::lang::Rail< ::x10::lang::Clock* >::__apply(
                                                         i))->x10::lang::Clock::_kwd__register());
        }
    }
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    return clockPhases;
    
}

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
void x10::lang::Activity__ClockPhases::advanceAll() {
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    {
        ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>*>* entry__88075;
        for (entry__88075 = ::x10::util::Set< ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>*>::iterator(::x10aux::nullCheck(this->entries()));
             ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>*>::hasNext(::x10aux::nullCheck(entry__88075));
             ) {
            ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>* entry =
              ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>*>::next(::x10aux::nullCheck(entry__88075));
            ::x10aux::nullCheck(::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>::getKey(::x10aux::nullCheck(entry)))->x10::lang::Clock::resumeUnsafe();
        }
    }
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    {
        ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>*>* entry__88077;
        for (entry__88077 = ::x10::util::Set< ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>*>::iterator(::x10aux::nullCheck(this->entries()));
             ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>*>::hasNext(::x10aux::nullCheck(entry__88077));
             ) {
            ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>* entry =
              ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>*>::next(::x10aux::nullCheck(entry__88077));
            ::x10aux::nullCheck(::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>::getKey(::x10aux::nullCheck(entry)))->x10::lang::Clock::advanceUnsafe();
        }
    }
    
}

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
void x10::lang::Activity__ClockPhases::resumeAll() {
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    {
        ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>*>* entry__88079;
        for (entry__88079 = ::x10::util::Set< ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>*>::iterator(::x10aux::nullCheck(this->entries()));
             ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>*>::hasNext(::x10aux::nullCheck(entry__88079));
             ) {
            ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>* entry =
              ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>*>::next(::x10aux::nullCheck(entry__88079));
            ::x10aux::nullCheck(::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>::getKey(::x10aux::nullCheck(entry)))->x10::lang::Clock::resumeUnsafe();
        }
    }
    
}

//#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
void x10::lang::Activity__ClockPhases::drop() {
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    {
        ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>*>* entry__88081;
        for (entry__88081 = ::x10::util::Set< ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>*>::iterator(::x10aux::nullCheck(this->entries()));
             ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>*>::hasNext(::x10aux::nullCheck(entry__88081));
             ) {
            ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>* entry =
              ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>*>::next(::x10aux::nullCheck(entry__88081));
            ::x10aux::nullCheck(::x10::util::Map__Entry< ::x10::lang::Clock*, x10_int>::getKey(::x10aux::nullCheck(entry)))->x10::lang::Clock::dropInternal();
        }
    }
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    this->clear();
}

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
void x10::lang::Activity__ClockPhases::serialize(::x10::io::Serializer* s) {
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    ::x10::util::HashMap< ::x10::lang::Clock*, x10_int>::serialize(
      s);
}

//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
void x10::lang::Activity__ClockPhases::_constructor() {
    (this)->::x10::util::HashMap< ::x10::lang::Clock*, x10_int>::_constructor();
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    ::x10::lang::Activity__ClockPhases* this__92937 = this;
    
}
::x10::lang::Activity__ClockPhases* x10::lang::Activity__ClockPhases::_make(
  ) {
    ::x10::lang::Activity__ClockPhases* this_ = new (::x10aux::alloc_z< ::x10::lang::Activity__ClockPhases>()) ::x10::lang::Activity__ClockPhases();
    this_->_constructor();
    return this_;
}



//#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
void x10::lang::Activity__ClockPhases::_constructor(::x10::io::Deserializer* ds) {
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    (this)->::x10::util::HashMap< ::x10::lang::Clock*, x10_int>::_constructor(
      ds);
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    ::x10::lang::Activity__ClockPhases* this__92938 = this;
    
}
::x10::lang::Activity__ClockPhases* x10::lang::Activity__ClockPhases::_make(
  ::x10::io::Deserializer* ds) {
    ::x10::lang::Activity__ClockPhases* this_ = new (::x10aux::alloc_z< ::x10::lang::Activity__ClockPhases>()) ::x10::lang::Activity__ClockPhases();
    this_->_constructor(ds);
    return this_;
}



//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
::x10::lang::Activity__ClockPhases* x10::lang::Activity__ClockPhases::x10__lang__Activity__ClockPhases____this__x10__lang__Activity__ClockPhases(
  ) {
    return this;
    
}
void x10::lang::Activity__ClockPhases::__fieldInitializers_x10_lang_Activity_ClockPhases(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::Activity__ClockPhases::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Activity__ClockPhases::_deserializer);

void x10::lang::Activity__ClockPhases::_serialize_body(::x10aux::serialization_buffer& buf) {
    /* NOTE: Implements x10.io.CustomSerialization */
    ::x10::io::Serializer* x10_buf = ::x10::io::Serializer::_make(&buf);
    this->serialize(x10_buf);
    buf.write(::x10aux::deserialization_buffer::CUSTOM_SERIALIZATION_END);
    
}

::x10::lang::Reference* ::x10::lang::Activity__ClockPhases::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Activity__ClockPhases* this_ = new (::x10aux::alloc_z< ::x10::lang::Activity__ClockPhases>()) ::x10::lang::Activity__ClockPhases();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::Activity__ClockPhases::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    /* NOTE: Implements x10.io.CustomSerialization */
    ::x10::io::Deserializer* x10_buf = ::x10::io::Deserializer::_make(&buf);
    _constructor(x10_buf);
    ::x10aux::serialization_id_t tmp = buf.read< ::x10aux::serialization_id_t>();
    if (tmp != ::x10aux::deserialization_buffer::CUSTOM_SERIALIZATION_END) { ::x10aux::raiseSerializationProtocolError(); }
    
}

::x10aux::RuntimeType x10::lang::Activity__ClockPhases::rtt;
void x10::lang::Activity__ClockPhases::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::util::HashMap< ::x10::lang::Clock*, x10_int> >()};
    rtt.initStageTwo("x10.lang.Activity.ClockPhases",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Activity$ClockPhases */
/*************************************************/
