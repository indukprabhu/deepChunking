/*************************************************/
/* START of Team */
#include <x10/util/Team.h>

#ifndef X10_UTIL_TEAM__CLOSURE__1_CLOSURE
#define X10_UTIL_TEAM__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_util_Team__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_util_Team__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        if ((((__extension__ ({
                ::x10::util::GrowableRail<x10_int>* this__122211 = ::x10::util::Team::FMGL(roles__get)();
                (x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(this__122211)->FMGL(data))->FMGL(size));
            }))
            ) <= (teamidcopy))) {
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10aux::nullCheck(::x10::util::Team::FMGL(roles__get)())->x10::util::GrowableRail<x10_int>::grow(
              ((teamidcopy) + (((x10_long)1ll))));
        }
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        while ((((__extension__ ({
                   ::x10::util::GrowableRail<x10_int>* this__122212 =
                     ::x10::util::Team::FMGL(roles__get)();
                   ::x10aux::nullCheck(this__122212)->FMGL(size);
               }))
               ) < (teamidcopy))) {
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10aux::nullCheck(::x10::util::Team::FMGL(roles__get)())->x10::util::GrowableRail<x10_int>::add(
              ((x10_int)-1));
        }
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::util::GrowableRail<x10_int>* this__122684 =
          ::x10::util::Team::FMGL(roles__get)();
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10_long idx__122685 = teamidcopy;
        x10_int v__122686 = ((x10_int) (::x10aux::nullCheck(places)->indexOf(
                                          ::x10::lang::Place::_make(::x10aux::here))));
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if ((::x10aux::struct_equals(idx__122685, ::x10aux::nullCheck(this__122684)->FMGL(size))))
        {
            
            //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ::x10aux::nullCheck(this__122684)->x10::util::GrowableRail<x10_int>::add(
              v__122686);
        } else {
            
            //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ::x10aux::nullCheck(::x10aux::nullCheck(this__122684)->FMGL(data))->x10::lang::Rail< x10_int >::__set(
              idx__122685, v__122686);
        }
        
    }
    
    // captured environment
    x10_long teamidcopy;
    ::x10::lang::PlaceGroup* places;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->teamidcopy);
        buf.write(this->places);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_Team__closure__1* storage = ::x10aux::alloc_z<x10_util_Team__closure__1>();
        buf.record_reference(storage);
        x10_long that_teamidcopy = buf.read<x10_long>();
        ::x10::lang::PlaceGroup* that_places = buf.read< ::x10::lang::PlaceGroup*>();
        x10_util_Team__closure__1* this_ = new (storage) x10_util_Team__closure__1(that_teamidcopy, that_places);
        return this_;
    }
    
    x10_util_Team__closure__1(x10_long teamidcopy, ::x10::lang::PlaceGroup* places) : teamidcopy(teamidcopy), places(places) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10:103-109";
    }

};

#endif // X10_UTIL_TEAM__CLOSURE__1_CLOSURE
#ifndef X10_UTIL_TEAM__CLOSURE__2_CLOSURE
#define X10_UTIL_TEAM__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_util_Team__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_util_Team__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        if ((((__extension__ ({
                ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122219 =
                  ::x10::util::Team::FMGL(state__get)();
                (x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(this__122219)->FMGL(data))->FMGL(size));
            }))
            ) <= (((x10_long)(teamidcopy))))) {
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10aux::nullCheck(::x10::util::Team::FMGL(state__get)())->x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>::grow(
              ((((x10_long)(teamidcopy))) + (((x10_long)1ll))));
        }
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        while ((((__extension__ ({
                   ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122220 =
                     ::x10::util::Team::FMGL(state__get)();
                   ::x10aux::nullCheck(this__122220)->FMGL(size);
               }))
               ) < (((x10_long)(teamidcopy))))) {
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10aux::nullCheck(::x10::util::Team::FMGL(state__get)())->x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>::add(
              ::x10aux::class_cast_unchecked< ::x10::util::Team__LocalTeamState*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        }
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122690 =
          ::x10::util::Team::FMGL(state__get)();
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10_long idx__122691 = ((x10_long)(teamidcopy));
        ::x10::util::Team__LocalTeamState* v__122692 = (__extension__ ({
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::util::Team__LocalTeamState* alloc__122693 =
               (new (::x10aux::alloc_z< ::x10::util::Team__LocalTeamState>()) ::x10::util::Team__LocalTeamState());
            
            //#line 615 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::PlaceGroup* places__122687 = places;
            x10_int teamid__122688 = teamidcopy;
            x10_long myIndex__122689 = ::x10aux::nullCheck(places)->indexOf(
                                         ::x10::lang::Place::_make(::x10aux::here));
            alloc__122693->FMGL(places) = places__122687;
            alloc__122693->FMGL(teamid) = teamid__122688;
            alloc__122693->FMGL(myIndex) = myIndex__122689;
            alloc__122693->x10::util::Team__LocalTeamState::__fieldInitializers_x10_util_Team_LocalTeamState();
            alloc__122693;
        }))
        ;
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if ((::x10aux::struct_equals(idx__122691, ::x10aux::nullCheck(this__122690)->FMGL(size))))
        {
            
            //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ::x10aux::nullCheck(this__122690)->x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>::add(
              v__122692);
        } else {
            
            //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ::x10aux::nullCheck(::x10aux::nullCheck(this__122690)->FMGL(data))->x10::lang::Rail< ::x10::util::Team__LocalTeamState* >::__set(
              idx__122691, v__122692);
        }
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10aux::nullCheck((__extension__ ({
            ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122231 =
              ::x10::util::Team::FMGL(state__get)();
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10_long idx__122230 = ((x10_long)(teamidcopy));
            ::x10::util::Team__LocalTeamState* ret__122232;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret__122232 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122231)->FMGL(data))->x10::lang::Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                            idx__122230);
            ret__122232;
        }))
        )->init();
    }
    
    // captured environment
    x10_int teamidcopy;
    ::x10::lang::PlaceGroup* places;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->teamidcopy);
        buf.write(this->places);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_Team__closure__2* storage = ::x10aux::alloc_z<x10_util_Team__closure__2>();
        buf.record_reference(storage);
        x10_int that_teamidcopy = buf.read<x10_int>();
        ::x10::lang::PlaceGroup* that_places = buf.read< ::x10::lang::PlaceGroup*>();
        x10_util_Team__closure__2* this_ = new (storage) x10_util_Team__closure__2(that_teamidcopy, that_places);
        return this_;
    }
    
    x10_util_Team__closure__2(x10_int teamidcopy, ::x10::lang::PlaceGroup* places) : teamidcopy(teamidcopy), places(places) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10:116-123";
    }

};

#endif // X10_UTIL_TEAM__CLOSURE__2_CLOSURE
namespace x10 { namespace util { 
class Team_ibox0 : public ::x10::lang::IBox< ::x10::util::Team> {
public:
    static ::x10::lang::Any::itable< Team_ibox0 > itable;
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
::x10::lang::Any::itable< Team_ibox0 >  Team_ibox0::itable(&Team_ibox0::equals, &Team_ibox0::hashCode, &Team_ibox0::toString, &Team_ibox0::typeName);
} } 
::x10::lang::Any::itable< ::x10::util::Team >  x10::util::Team::_itable_0(&x10::util::Team::equals, &x10::util::Team::hashCode, &x10::util::Team::toString, &x10::util::Team::typeName);
::x10aux::itable_entry x10::util::Team::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::util::Team::_itable_0), ::x10aux::itable_entry(NULL, (void*)"::x10::util::Team")};
::x10aux::itable_entry x10::util::Team::_iboxitables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::util::Team_ibox0::itable), ::x10aux::itable_entry(NULL, (void*)"::x10::util::Team")};

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_boolean x10::util::Team::FMGL(DEBUG);
void x10::util::Team::FMGL(DEBUG__do_init)() {
    FMGL(DEBUG__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team.DEBUG");
    x10_boolean __var2974__ = false;
    FMGL(DEBUG) = __var2974__;
    FMGL(DEBUG__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team::FMGL(DEBUG__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(DEBUG__status), &FMGL(DEBUG__do_init), &FMGL(DEBUG__exception), "x10::util::Team.DEBUG");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team::FMGL(DEBUG__status);
::x10::lang::CheckedThrowable* x10::util::Team::FMGL(DEBUG__exception);

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_boolean x10::util::Team::FMGL(DEBUGINTERNALS);
void x10::util::Team::FMGL(DEBUGINTERNALS__do_init)() {
    FMGL(DEBUGINTERNALS__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team.DEBUGINTERNALS");
    x10_boolean __var2975__ = false;
    FMGL(DEBUGINTERNALS) = __var2975__;
    FMGL(DEBUGINTERNALS__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team::FMGL(DEBUGINTERNALS__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(DEBUGINTERNALS__status), &FMGL(DEBUGINTERNALS__do_init), &FMGL(DEBUGINTERNALS__exception), "x10::util::Team.DEBUGINTERNALS");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team::FMGL(DEBUGINTERNALS__status);
::x10::lang::CheckedThrowable* x10::util::Team::FMGL(DEBUGINTERNALS__exception);

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
/** A team that has one member at each place. */
::x10::util::Team x10::util::Team::FMGL(WORLD);
void x10::util::Team::FMGL(WORLD__do_init)() {
    FMGL(WORLD__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team.WORLD");
    ::x10::util::Team __var2976__ = ::x10::util::Team::_make(((x10_int)0),
                                                             reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)()),
                                                             ::x10::lang::Place::_make(::x10aux::here)->x10::lang::Place::id());
    FMGL(WORLD) = __var2976__;
    FMGL(WORLD__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team::FMGL(WORLD__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(WORLD__status), &FMGL(WORLD__do_init), &FMGL(WORLD__exception), "x10::util::Team.WORLD");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team::FMGL(WORLD__status);
::x10::lang::CheckedThrowable* x10::util::Team::FMGL(WORLD__exception);

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
::x10::util::GrowableRail<x10_int>* x10::util::Team::FMGL(roles);
void x10::util::Team::FMGL(roles__do_init)() {
    FMGL(roles__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team.roles");
    ::x10::util::GrowableRail<x10_int>* __var2977__ = ::x10::util::GrowableRail<x10_int>::_make();
    FMGL(roles) = __var2977__;
    FMGL(roles__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team::FMGL(roles__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(roles__status), &FMGL(roles__do_init), &FMGL(roles__exception), "x10::util::Team.roles");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team::FMGL(roles__status);
::x10::lang::CheckedThrowable* x10::util::Team::FMGL(roles__exception);

//#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* x10::util::Team::FMGL(state);
void x10::util::Team::FMGL(state__do_init)() {
    FMGL(state__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team.state");
    ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* __var2978__ = ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>::_make();
    FMGL(state) = __var2978__;
    FMGL(state__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team::FMGL(state__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(state__status), &FMGL(state__do_init), &FMGL(state__exception), "x10::util::Team.state");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team::FMGL(state__status);
::x10::lang::CheckedThrowable* x10::util::Team::FMGL(state__exception);

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team::FMGL(X10RT_COLL_NOCOLLECTIVES);
void x10::util::Team::FMGL(X10RT_COLL_NOCOLLECTIVES__do_init)() {
    FMGL(X10RT_COLL_NOCOLLECTIVES__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team.X10RT_COLL_NOCOLLECTIVES");
    x10_int __var2979__ = ((x10_int)0);
    FMGL(X10RT_COLL_NOCOLLECTIVES) = __var2979__;
    FMGL(X10RT_COLL_NOCOLLECTIVES__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team::FMGL(X10RT_COLL_NOCOLLECTIVES__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(X10RT_COLL_NOCOLLECTIVES__status), &FMGL(X10RT_COLL_NOCOLLECTIVES__do_init), &FMGL(X10RT_COLL_NOCOLLECTIVES__exception), "x10::util::Team.X10RT_COLL_NOCOLLECTIVES");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team::FMGL(X10RT_COLL_NOCOLLECTIVES__status);
::x10::lang::CheckedThrowable* x10::util::Team::FMGL(X10RT_COLL_NOCOLLECTIVES__exception);

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team::FMGL(X10RT_COLL_BARRIERONLY);
void x10::util::Team::FMGL(X10RT_COLL_BARRIERONLY__do_init)() {
    FMGL(X10RT_COLL_BARRIERONLY__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team.X10RT_COLL_BARRIERONLY");
    x10_int __var2980__ = ((x10_int)1);
    FMGL(X10RT_COLL_BARRIERONLY) = __var2980__;
    FMGL(X10RT_COLL_BARRIERONLY__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team::FMGL(X10RT_COLL_BARRIERONLY__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(X10RT_COLL_BARRIERONLY__status), &FMGL(X10RT_COLL_BARRIERONLY__do_init), &FMGL(X10RT_COLL_BARRIERONLY__exception), "x10::util::Team.X10RT_COLL_BARRIERONLY");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team::FMGL(X10RT_COLL_BARRIERONLY__status);
::x10::lang::CheckedThrowable* x10::util::Team::FMGL(X10RT_COLL_BARRIERONLY__exception);

//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team::FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES);
void x10::util::Team::FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES__do_init)() {
    FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team.X10RT_COLL_ALLBLOCKINGCOLLECTIVES");
    x10_int __var2981__ = ((x10_int)2);
    FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES) = __var2981__;
    FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team::FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES__status), &FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES__do_init), &FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES__exception), "x10::util::Team.X10RT_COLL_ALLBLOCKINGCOLLECTIVES");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team::FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES__status);
::x10::lang::CheckedThrowable* x10::util::Team::FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES__exception);

//#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team::FMGL(X10RT_COLL_NONBLOCKINGBARRIER);
void x10::util::Team::FMGL(X10RT_COLL_NONBLOCKINGBARRIER__do_init)() {
    FMGL(X10RT_COLL_NONBLOCKINGBARRIER__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team.X10RT_COLL_NONBLOCKINGBARRIER");
    x10_int __var2982__ = ((x10_int)3);
    FMGL(X10RT_COLL_NONBLOCKINGBARRIER) = __var2982__;
    FMGL(X10RT_COLL_NONBLOCKINGBARRIER__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team::FMGL(X10RT_COLL_NONBLOCKINGBARRIER__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(X10RT_COLL_NONBLOCKINGBARRIER__status), &FMGL(X10RT_COLL_NONBLOCKINGBARRIER__do_init), &FMGL(X10RT_COLL_NONBLOCKINGBARRIER__exception), "x10::util::Team.X10RT_COLL_NONBLOCKINGBARRIER");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team::FMGL(X10RT_COLL_NONBLOCKINGBARRIER__status);
::x10::lang::CheckedThrowable* x10::util::Team::FMGL(X10RT_COLL_NONBLOCKINGBARRIER__exception);

//#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team::FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES);
void x10::util::Team::FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES__do_init)() {
    FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team.X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES");
    x10_int __var2983__ = ((x10_int)4);
    FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES) = __var2983__;
    FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team::FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES__status), &FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES__do_init), &FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES__exception), "x10::util::Team.X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team::FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES__status);
::x10::lang::CheckedThrowable* x10::util::Team::FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES__exception);

//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
void x10::util::Team::_constructor(x10_int id, ::x10::lang::PlaceGroup* places,
                                   x10_long role) {
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    ::x10::util::Team this__122673 = (*this);
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    (*this)->FMGL(id) = id;
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    (*this)->FMGL(collectiveSupportLevel) = ::x10::util::Team::nativeCollectiveSupport();
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((((*this)->FMGL(collectiveSupportLevel)) > (((x10_int)0))))
    {
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        if ((((__extension__ ({
                ::x10::util::GrowableRail<x10_int>* this__122189 =
                  ::x10::util::Team::FMGL(roles__get)();
                (x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(this__122189)->FMGL(data))->FMGL(size));
            }))
            ) <= (((x10_long)(id))))) {
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10aux::nullCheck(::x10::util::Team::FMGL(roles__get)())->x10::util::GrowableRail<x10_int>::grow(
              ((((x10_long)(id))) + (((x10_long)1ll))));
        }
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        while ((((__extension__ ({
                   ::x10::util::GrowableRail<x10_int>* this__122190 =
                     ::x10::util::Team::FMGL(roles__get)();
                   ::x10aux::nullCheck(this__122190)->FMGL(size);
               }))
               ) < (((x10_long)(id))))) {
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10aux::nullCheck(::x10::util::Team::FMGL(roles__get)())->x10::util::GrowableRail<x10_int>::add(
              ((x10_int)-1));
        }
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::util::GrowableRail<x10_int>* this__122674 =
          ::x10::util::Team::FMGL(roles__get)();
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10_long idx__122675 = ((x10_long)(id));
        x10_int v__122676 = ((x10_int) (role));
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if ((::x10aux::struct_equals(idx__122675, ::x10aux::nullCheck(this__122674)->FMGL(size))))
        {
            
            //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ::x10aux::nullCheck(this__122674)->x10::util::GrowableRail<x10_int>::add(
              v__122676);
        } else {
            
            //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ::x10aux::nullCheck(::x10aux::nullCheck(this__122674)->FMGL(data))->x10::lang::Rail< x10_int >::__set(
              idx__122675, v__122676);
        }
        
    }
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((((*this)->FMGL(collectiveSupportLevel)) < (((x10_int)4))))
    {
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        if ((((__extension__ ({
                ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122196 =
                  ::x10::util::Team::FMGL(state__get)();
                (x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(this__122196)->FMGL(data))->FMGL(size));
            }))
            ) <= (((x10_long)(id))))) {
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10aux::nullCheck(::x10::util::Team::FMGL(state__get)())->x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>::grow(
              ((((x10_long)(id))) + (((x10_long)1ll))));
        }
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        while ((((__extension__ ({
                   ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122197 =
                     ::x10::util::Team::FMGL(state__get)();
                   ::x10aux::nullCheck(this__122197)->FMGL(size);
               }))
               ) < (((x10_long)(id))))) {
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10aux::nullCheck(::x10::util::Team::FMGL(state__get)())->x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>::add(
              ::x10aux::class_cast_unchecked< ::x10::util::Team__LocalTeamState*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        }
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::util::Team__LocalTeamState* teamState =  (new (::x10aux::alloc_z< ::x10::util::Team__LocalTeamState>()) ::x10::util::Team__LocalTeamState());
        
        //#line 615 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::lang::PlaceGroup* places__122680 = places;
        x10_int teamid__122681 = id;
        x10_long myIndex__122682 = ::x10aux::nullCheck(places)->indexOf(
                                     ::x10::lang::Place::_make(::x10aux::here));
        teamState->FMGL(places) = places__122680;
        teamState->FMGL(teamid) = teamid__122681;
        teamState->FMGL(myIndex) = myIndex__122682;
        teamState->x10::util::Team__LocalTeamState::__fieldInitializers_x10_util_Team_LocalTeamState();
        {
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::CheckedThrowable* throwable__122862 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122677 =
                          ::x10::util::Team::FMGL(state__get)();
                        
                        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        x10_long idx__122678 = ((x10_long)(id));
                        ::x10::util::Team__LocalTeamState* v__122679 =
                          teamState;
                        
                        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        if ((::x10aux::struct_equals(idx__122678,
                                                     ::x10aux::nullCheck(this__122677)->FMGL(size))))
                        {
                            
                            //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            ::x10aux::nullCheck(this__122677)->x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>::add(
                              v__122679);
                        } else {
                            
                            //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            ::x10aux::nullCheck(::x10aux::nullCheck(this__122677)->FMGL(data))->x10::lang::Rail< ::x10::util::Team__LocalTeamState* >::__set(
                              idx__122678, v__122679);
                        }
                        
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc2985) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__122863 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc2985);
                    {
                        throwable__122862 = formal__122863;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__122862)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122862))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__122862));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__122862)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122862)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__122862));
                }
                
            }
            
        }
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        teamState->init();
    }
    
}
::x10::util::Team x10::util::Team::_make(x10_int id, ::x10::lang::PlaceGroup* places,
                                         x10_long role) {
    ::x10::util::Team this_; 
    this_->_constructor(id, places, role);
    return this_;
}



//#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
void x10::util::Team::_constructor(::x10::lang::PlaceGroup* places) {
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    ::x10::util::Team this__122683 = (*this);
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    (*this)->FMGL(collectiveSupportLevel) = ::x10::util::Team::nativeCollectiveSupport();
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((((*this)->FMGL(collectiveSupportLevel)) > (((x10_int)0))))
    {
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::lang::Rail< x10_int >* result = ::x10::lang::Rail< x10_int >::_make(((x10_long)1ll));
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        x10_long count = ::x10aux::nullCheck(places)->numPlaces();
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::lang::Rail< x10_int >* placeRail = ::x10::lang::Rail< x10_int >::_make(count);
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        {
            x10_long i;
            for (i = ((x10_long)0ll); ((i) < (count)); i =
                                                         ((i) + (((x10_long)1ll))))
            {
                
                //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                placeRail->x10::lang::Rail< x10_int >::__set(
                  i, ((x10_int) ((__extension__ ({
                      ::x10::lang::Place this__122210 = ::x10aux::nullCheck(places)->__apply(
                                                          i);
                      this__122210->FMGL(id);
                  }))
                  )));
            }
        }
        {
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var25 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122865 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::nativeMake(
                              placeRail, ((x10_int) (count)),
                              result);
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc2986) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc2986);
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
                catch (::x10::lang::CheckedThrowable* __exc2987) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122866 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc2987);
                        {
                            throwable__122865 = formal__122866;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122865)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122865))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122865));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var25);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122865)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122865)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122865));
                    }
                    
                }
                
            }
        }
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        (*this)->FMGL(id) = result->x10::lang::Rail< x10_int >::__apply(
                              ((x10_long)0ll));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        x10_long teamidcopy = ((x10_long)((*this)->FMGL(id)));
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::lang::PlaceGroup::FMGL(WORLD__get)()->broadcastFlat(
          reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_util_Team__closure__1)))x10_util_Team__closure__1(teamidcopy, places))));
    } else {
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        (*this)->FMGL(id) = ((x10_int) ((__extension__ ({
            ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122218 =
              ::x10::util::Team::FMGL(state__get)();
            ::x10aux::nullCheck(this__122218)->FMGL(size);
        }))
        ));
    }
    
    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((((*this)->FMGL(collectiveSupportLevel)) < (((x10_int)4))))
    {
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        x10_int teamidcopy = (*this)->FMGL(id);
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::lang::PlaceGroup::FMGL(WORLD__get)()->broadcastFlat(
          reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_util_Team__closure__2)))x10_util_Team__closure__2(teamidcopy, places))));
    }
    
}
::x10::util::Team x10::util::Team::_make(::x10::lang::PlaceGroup* places)
{
    ::x10::util::Team this_; 
    this_->_constructor(places);
    return this_;
}



//#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
void x10::util::Team::nativeMake(::x10::lang::Rail< x10_int >* places,
                                 x10_int count, ::x10::lang::Rail< x10_int >* result) {
    x10rt_team_new(count, (x10rt_place*)places->raw, ::x10aux::coll_handler2, ::x10aux::coll_enter2(result->raw));
}

//#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_long x10::util::Team::size() {
    
    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((((*this)->FMGL(collectiveSupportLevel)) >= (((x10_int)4))))
    {
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        return ((x10_long)(::x10::util::Team::nativeSize(
                             (*this)->FMGL(id))));
        
    } else {
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::lang::PlaceGroup* this__122694 = ::x10aux::nullCheck((__extension__ ({
                                                    ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122695 =
                                                      ::x10::util::Team::FMGL(state__get)();
                                                    
                                                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                    x10_long idx__122696 =
                                                      ((x10_long)((*this)->FMGL(id)));
                                                    ::x10::util::Team__LocalTeamState* ret__122697;
                                                    
                                                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                    ret__122697 =
                                                      ::x10aux::nullCheck(::x10aux::nullCheck(this__122695)->FMGL(data))->x10::lang::Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                        idx__122696);
                                                    ret__122697;
                                                }))
                                                )->FMGL(places);
        return ::x10aux::nullCheck(this__122694)->numPlaces();
        
    }
    
}

//#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
void x10::util::Team::barrier() {
    
    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((((*this)->FMGL(collectiveSupportLevel)) >= (((x10_int)3))))
    {
        {
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var26 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122868 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::nativeBarrier(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122239 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122239->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122241 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122240 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122242;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122242 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122241)->FMGL(data))->x10::lang::Rail< x10_int >::__apply(
                                                  idx__122240);
                                              ret__122242;
                                          }))
                                          ));
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc2993) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc2993);
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
                catch (::x10::lang::CheckedThrowable* __exc2994) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122869 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc2994);
                        {
                            throwable__122868 = formal__122869;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122868)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122868))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122868));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var26);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122868)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122868)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122868));
                    }
                    
                }
                
            }
        }
    } else {
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10aux::nullCheck((__extension__ ({
            ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122245 =
              ::x10::util::Team::FMGL(state__get)();
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10_long idx__122244 = ((x10_long)((*this)->FMGL(id)));
            ::x10::util::Team__LocalTeamState* ret__122246;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret__122246 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122245)->FMGL(data))->x10::lang::Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                            idx__122244);
            ret__122246;
        }))
        )->collective_impl< x10_int >(((x10_int)0), ::x10::lang::Place::FMGL(FIRST_PLACE__get)(),
                                      ::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_int >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)),
                                      ((x10_long)0ll), ::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_int >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)),
                                      ((x10_long)0ll), ((x10_long)0ll),
                                      ((x10_int)0));
    }
    
}

//#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
void x10::util::Team::nativeBarrier() {
    {
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var27 = ::x10::lang::Runtime::startFinish();
        {
            ::x10::lang::CheckedThrowable* throwable__122871 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        ::x10::util::Team::nativeBarrier(
                          (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                      ((x10_int)0)))
                            ? (((x10_int) ((__extension__ ({
                                   ::x10::lang::Place this__122248 =
                                     ::x10::lang::Place::_make(::x10aux::here);
                                   this__122248->FMGL(id);
                               }))
                               ))) : ((__extension__ ({
                                          ::x10::util::GrowableRail<x10_int>* this__122250 =
                                            ::x10::util::Team::FMGL(roles__get)();
                                          
                                          //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                          x10_long idx__122249 =
                                            ((x10_long)((*this)->FMGL(id)));
                                          x10_int ret__122251;
                                          
                                          //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                          ret__122251 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122250)->FMGL(data))->x10::lang::Rail< x10_int >::__apply(
                                                          idx__122249);
                                          ret__122251;
                                      }))
                                      ));
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc2996) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc2996);
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
            catch (::x10::lang::CheckedThrowable* __exc2997) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__122872 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc2997);
                    {
                        throwable__122871 = formal__122872;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__122871)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122871))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__122871));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var27);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__122871)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122871)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__122871));
                }
                
            }
            
        }
    }
}

//#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
/** Indicates the operation to perform when reducing. */
x10_int x10::util::Team::FMGL(ADD);
void x10::util::Team::FMGL(ADD__do_init)() {
    FMGL(ADD__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team.ADD");
    x10_int __var3017__ = ((x10_int)0);
    FMGL(ADD) = __var3017__;
    FMGL(ADD__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team::FMGL(ADD__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(ADD__status), &FMGL(ADD__do_init), &FMGL(ADD__exception), "x10::util::Team.ADD");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team::FMGL(ADD__status);
::x10::lang::CheckedThrowable* x10::util::Team::FMGL(ADD__exception);

//#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
/** Indicates the operation to perform when reducing. */
x10_int x10::util::Team::FMGL(MUL);
void x10::util::Team::FMGL(MUL__do_init)() {
    FMGL(MUL__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team.MUL");
    x10_int __var3018__ = ((x10_int)1);
    FMGL(MUL) = __var3018__;
    FMGL(MUL__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team::FMGL(MUL__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(MUL__status), &FMGL(MUL__do_init), &FMGL(MUL__exception), "x10::util::Team.MUL");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team::FMGL(MUL__status);
::x10::lang::CheckedThrowable* x10::util::Team::FMGL(MUL__exception);

//#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
/** Indicates the operation to perform when reducing. */
x10_int x10::util::Team::FMGL(AND);
void x10::util::Team::FMGL(AND__do_init)() {
    FMGL(AND__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team.AND");
    x10_int __var3019__ = ((x10_int)3);
    FMGL(AND) = __var3019__;
    FMGL(AND__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team::FMGL(AND__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(AND__status), &FMGL(AND__do_init), &FMGL(AND__exception), "x10::util::Team.AND");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team::FMGL(AND__status);
::x10::lang::CheckedThrowable* x10::util::Team::FMGL(AND__exception);

//#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
/** Indicates the operation to perform when reducing. */
x10_int x10::util::Team::FMGL(OR);
void x10::util::Team::FMGL(OR__do_init)() {
    FMGL(OR__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team.OR");
    x10_int __var3020__ = ((x10_int)4);
    FMGL(OR) = __var3020__;
    FMGL(OR__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team::FMGL(OR__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(OR__status), &FMGL(OR__do_init), &FMGL(OR__exception), "x10::util::Team.OR");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team::FMGL(OR__status);
::x10::lang::CheckedThrowable* x10::util::Team::FMGL(OR__exception);

//#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
/** Indicates the operation to perform when reducing. */
x10_int x10::util::Team::FMGL(XOR);
void x10::util::Team::FMGL(XOR__do_init)() {
    FMGL(XOR__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team.XOR");
    x10_int __var3021__ = ((x10_int)5);
    FMGL(XOR) = __var3021__;
    FMGL(XOR__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team::FMGL(XOR__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(XOR__status), &FMGL(XOR__do_init), &FMGL(XOR__exception), "x10::util::Team.XOR");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team::FMGL(XOR__status);
::x10::lang::CheckedThrowable* x10::util::Team::FMGL(XOR__exception);

//#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
/** Indicates the operation to perform when reducing. */
x10_int x10::util::Team::FMGL(MAX);
void x10::util::Team::FMGL(MAX__do_init)() {
    FMGL(MAX__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team.MAX");
    x10_int __var3022__ = ((x10_int)6);
    FMGL(MAX) = __var3022__;
    FMGL(MAX__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team::FMGL(MAX__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(MAX__status), &FMGL(MAX__do_init), &FMGL(MAX__exception), "x10::util::Team.MAX");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team::FMGL(MAX__status);
::x10::lang::CheckedThrowable* x10::util::Team::FMGL(MAX__exception);

//#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
/** Indicates the operation to perform when reducing. */
x10_int x10::util::Team::FMGL(MIN);
void x10::util::Team::FMGL(MIN__do_init)() {
    FMGL(MIN__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team.MIN");
    x10_int __var3023__ = ((x10_int)7);
    FMGL(MIN) = __var3023__;
    FMGL(MIN__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team::FMGL(MIN__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(MIN__status), &FMGL(MIN__do_init), &FMGL(MIN__exception), "x10::util::Team.MIN");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team::FMGL(MIN__status);
::x10::lang::CheckedThrowable* x10::util::Team::FMGL(MIN__exception);

//#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 332 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_byte x10::util::Team::reduce(::x10::lang::Place root,
                                 x10_byte src, x10_int op) {
    return (*this)->genericReduce< x10_byte >(root, src, op);
    
}

//#line 334 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_ubyte x10::util::Team::reduce(::x10::lang::Place root,
                                  x10_ubyte src, x10_int op) {
    return (*this)->genericReduce< x10_ubyte >(root, src,
                                               op);
    
}

//#line 336 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_short x10::util::Team::reduce(::x10::lang::Place root,
                                  x10_short src, x10_int op) {
    return (*this)->genericReduce< x10_short >(root, src,
                                               op);
    
}

//#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_ushort x10::util::Team::reduce(::x10::lang::Place root,
                                   x10_ushort src, x10_int op) {
    return (*this)->genericReduce< x10_ushort >(root, src,
                                                op);
    
}

//#line 340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_uint x10::util::Team::reduce(::x10::lang::Place root,
                                 x10_uint src, x10_int op) {
    return (*this)->genericReduce< x10_uint >(root, src, op);
    
}

//#line 342 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team::reduce(::x10::lang::Place root, x10_int src,
                                x10_int op) {
    return (*this)->genericReduce< x10_int >(root, src, op);
    
}

//#line 344 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_long x10::util::Team::reduce(::x10::lang::Place root,
                                 x10_long src, x10_int op) {
    return (*this)->genericReduce< x10_long >(root, src, op);
    
}

//#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_ulong x10::util::Team::reduce(::x10::lang::Place root,
                                  x10_ulong src, x10_int op) {
    return (*this)->genericReduce< x10_ulong >(root, src,
                                               op);
    
}

//#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_float x10::util::Team::reduce(::x10::lang::Place root,
                                  x10_float src, x10_int op) {
    return (*this)->genericReduce< x10_float >(root, src,
                                               op);
    
}

//#line 350 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_double x10::util::Team::reduce(::x10::lang::Place root,
                                   x10_double src, x10_int op) {
    return (*this)->genericReduce< x10_double >(root, src,
                                                op);
    
}

//#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 366 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 410 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 420 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 430 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team::indexOfMax(x10_double v, x10_int idx) {
    
    //#line 458 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >* src =
      ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >::_make(((x10_long)1ll),
                                                               (__extension__ ({
                                                                   ::x10::util::Team__DoubleIdx alloc__86433 =
                                                                     
                                                                   ::x10::util::Team__DoubleIdx::_alloc();
                                                                   
                                                                   //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                                                   x10_double value__122698 =
                                                                     v;
                                                                   x10_int idx__122699 =
                                                                     idx;
                                                                   alloc__86433->FMGL(value) =
                                                                     value__122698;
                                                                   alloc__86433->FMGL(idx) =
                                                                     idx__122699;
                                                                   alloc__86433;
                                                               }))
                                                               );
    
    //#line 459 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >* dst =
      ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >::_make(((x10_long)1ll),
                                                               (__extension__ ({
                                                                   ::x10::util::Team__DoubleIdx alloc__86434 =
                                                                     
                                                                   ::x10::util::Team__DoubleIdx::_alloc();
                                                                   
                                                                   //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                                                   alloc__86434->FMGL(value) =
                                                                     0.0;
                                                                   alloc__86434->FMGL(idx) =
                                                                     ((x10_int)-1);
                                                                   alloc__86434;
                                                               }))
                                                               );
    
    //#line 460 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                 ((x10_int)4)))) {
        {
            
            //#line 461 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var42 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122916 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::nativeIndexOfMax(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122361 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122361->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122363 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122362 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122364;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122364 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122363)->FMGL(data))->x10::lang::Rail< x10_int >::__apply(
                                                  idx__122362);
                                              ret__122364;
                                          }))
                                          ), src, dst);
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3069) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3069);
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
                catch (::x10::lang::CheckedThrowable* __exc3070) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122917 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3070);
                        {
                            throwable__122916 = formal__122917;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122916)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122916))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122916));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var42);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122916)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122916)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122916));
                    }
                    
                }
                
            }
        }
    } else 
    //#line 462 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if (((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                  ((x10_int)2))) || (::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                                                             ((x10_int)3)))))
    {
        
        //#line 463 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        (*this)->x10::util::Team::barrier();
        {
            
            //#line 464 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var43 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122919 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::nativeIndexOfMax(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122366 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122366->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122368 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122367 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122369;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122369 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122368)->FMGL(data))->x10::lang::Rail< x10_int >::__apply(
                                                  idx__122367);
                                              ret__122369;
                                          }))
                                          ), src, dst);
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3071) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3071);
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
                catch (::x10::lang::CheckedThrowable* __exc3072) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122920 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3072);
                        {
                            throwable__122919 = formal__122920;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122919)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122919))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122919));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var43);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122919)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122919)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122919));
                    }
                    
                }
                
            }
        }
    } else {
        
        //#line 467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10aux::nullCheck((__extension__ ({
            ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122372 =
              ::x10::util::Team::FMGL(state__get)();
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10_long idx__122371 = ((x10_long)((*this)->FMGL(id)));
            ::x10::util::Team__LocalTeamState* ret__122373;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret__122373 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122372)->FMGL(data))->x10::lang::Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                            idx__122371);
            ret__122373;
        }))
        )->collective_impl< ::x10::util::Team__DoubleIdx >(
          ((x10_int)7), ::x10::lang::Place::FMGL(FIRST_PLACE__get)(),
          src, ((x10_long)0ll), dst, ((x10_long)0ll), ((x10_long)1ll),
          ((x10_int)0));
    }
    
    //#line 468 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    return dst->x10::lang::Rail< ::x10::util::Team__DoubleIdx >::__apply(
             ((x10_long)0ll))->FMGL(idx);
    
}

//#line 471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
void x10::util::Team::nativeIndexOfMax(x10_int id, x10_int role,
                                       ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >* src,
                                       ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >* dst) {
    x10rt_allreduce(id, role, src->raw, dst->raw, X10RT_RED_OP_MAX, X10RT_RED_TYPE_DBL_S32, 1, ::x10aux::coll_handler, ::x10aux::coll_enter());
}

//#line 484 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team::indexOfMin(x10_double v, x10_int idx) {
    
    //#line 485 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >* src =
      ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >::_make(((x10_long)1ll),
                                                               (__extension__ ({
                                                                   ::x10::util::Team__DoubleIdx alloc__86435 =
                                                                     
                                                                   ::x10::util::Team__DoubleIdx::_alloc();
                                                                   
                                                                   //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                                                   x10_double value__122700 =
                                                                     v;
                                                                   x10_int idx__122701 =
                                                                     idx;
                                                                   alloc__86435->FMGL(value) =
                                                                     value__122700;
                                                                   alloc__86435->FMGL(idx) =
                                                                     idx__122701;
                                                                   alloc__86435;
                                                               }))
                                                               );
    
    //#line 486 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >* dst =
      ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >::_make(((x10_long)1ll),
                                                               (__extension__ ({
                                                                   ::x10::util::Team__DoubleIdx alloc__86436 =
                                                                     
                                                                   ::x10::util::Team__DoubleIdx::_alloc();
                                                                   
                                                                   //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                                                   alloc__86436->FMGL(value) =
                                                                     0.0;
                                                                   alloc__86436->FMGL(idx) =
                                                                     ((x10_int)-1);
                                                                   alloc__86436;
                                                               }))
                                                               );
    
    //#line 487 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                 ((x10_int)4)))) {
        {
            
            //#line 488 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var44 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122922 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::nativeIndexOfMin(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122385 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122385->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122387 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122386 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122388;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122388 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122387)->FMGL(data))->x10::lang::Rail< x10_int >::__apply(
                                                  idx__122386);
                                              ret__122388;
                                          }))
                                          ), src, dst);
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3075) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3075);
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
                catch (::x10::lang::CheckedThrowable* __exc3076) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122923 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3076);
                        {
                            throwable__122922 = formal__122923;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122922)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122922))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122922));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var44);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122922)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122922)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122922));
                    }
                    
                }
                
            }
        }
    } else 
    //#line 489 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if (((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                  ((x10_int)2))) || (::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                                                             ((x10_int)3)))))
    {
        
        //#line 490 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        (*this)->x10::util::Team::barrier();
        {
            
            //#line 491 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var45 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122925 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::nativeIndexOfMin(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122390 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122390->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122392 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122391 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122393;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122393 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122392)->FMGL(data))->x10::lang::Rail< x10_int >::__apply(
                                                  idx__122391);
                                              ret__122393;
                                          }))
                                          ), src, dst);
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3077) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3077);
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
                catch (::x10::lang::CheckedThrowable* __exc3078) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122926 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3078);
                        {
                            throwable__122925 = formal__122926;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122925)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122925))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122925));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var45);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122925)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122925)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122925));
                    }
                    
                }
                
            }
        }
    } else {
        
        //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10aux::nullCheck((__extension__ ({
            ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122396 =
              ::x10::util::Team::FMGL(state__get)();
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10_long idx__122395 = ((x10_long)((*this)->FMGL(id)));
            ::x10::util::Team__LocalTeamState* ret__122397;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret__122397 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122396)->FMGL(data))->x10::lang::Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                            idx__122395);
            ret__122397;
        }))
        )->collective_impl< ::x10::util::Team__DoubleIdx >(
          ((x10_int)6), ::x10::lang::Place::FMGL(FIRST_PLACE__get)(),
          src, ((x10_long)0ll), dst, ((x10_long)0ll), ((x10_long)1ll),
          ((x10_int)0));
    }
    
    //#line 495 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    return dst->x10::lang::Rail< ::x10::util::Team__DoubleIdx >::__apply(
             ((x10_long)0ll))->FMGL(idx);
    
}

//#line 498 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
void x10::util::Team::nativeIndexOfMin(x10_int id, x10_int role,
                                       ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >* src,
                                       ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >* dst) {
    x10rt_allreduce(id, role, src->raw, dst->raw, X10RT_RED_OP_MIN, X10RT_RED_TYPE_DBL_S32, 1, ::x10aux::coll_handler, ::x10aux::coll_enter());
}

//#line 515 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
::x10::util::Team x10::util::Team::split(x10_int color, x10_long new_role) {
    
    //#line 516 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    ::x10::lang::Rail< x10_int >* result = ::x10::lang::Rail< x10_int >::_make(((x10_long)1ll));
    
    //#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                 ((x10_int)4)))) {
        {
            
            //#line 519 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var46 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122928 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::nativeSplit(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122399 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122399->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122401 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122400 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122402;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122402 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122401)->FMGL(data))->x10::lang::Rail< x10_int >::__apply(
                                                  idx__122400);
                                              ret__122402;
                                          }))
                                          ), color, ((x10_int) (new_role)),
                              result);
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3081) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3081);
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
                catch (::x10::lang::CheckedThrowable* __exc3082) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122929 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3082);
                        {
                            throwable__122928 = formal__122929;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122928)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122928))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122928));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var46);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122928)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122928)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122928));
                    }
                    
                }
                
            }
        }
        
        //#line 521 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::util::Team alloc__122702 =  ::x10::util::Team::_alloc();
        (alloc__122702)->::x10::util::Team::_constructor(
          result->x10::lang::Rail< x10_int >::__apply(((x10_long)0ll)),
          ::x10aux::class_cast_unchecked< ::x10::lang::PlaceGroup*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)),
          new_role);
        return alloc__122702;
        
    } else {
        
        //#line 526 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::lang::Rail< x10_int >* myInfo = ::x10::lang::Rail< x10_int >::_make(((x10_long)2ll));
        
        //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10aux::nullCheck(myInfo)->x10::lang::Rail< x10_int >::__set(
          ((x10_long)0ll), color);
        
        //#line 528 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10aux::nullCheck(myInfo)->x10::lang::Rail< x10_int >::__set(
          ((x10_long)1ll), ((x10_int) (new_role)));
        
        //#line 529 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::lang::Rail< x10_int >* allInfo = ::x10::lang::Rail< x10_int >::_make((((*this)->x10::util::Team::size()) * (((x10_long)2ll))));
        
        //#line 530 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        (*this)->alltoall< x10_int >(myInfo, ((x10_long)0ll),
                                     allInfo, ((x10_long)0ll),
                                     ((x10_long)2ll));
        
        //#line 533 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        x10_long myTeamPosition = ((::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                            ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122405 =
                                                              ::x10::util::Team::FMGL(state__get)();
                                                            
                                                            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                            x10_long idx__122404 =
                                                              ((x10_long)((*this)->FMGL(id)));
                                                            ::x10::util::Team__LocalTeamState* ret__122406;
                                                            
                                                            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                            ret__122406 =
                                                              ::x10aux::nullCheck(::x10aux::nullCheck(this__122405)->FMGL(data))->x10::lang::Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                                idx__122404);
                                                            ret__122406;
                                                        }))
                                                        )->FMGL(places))->indexOf(
                                      (__extension__ ({
                                          ::x10::lang::Place this__122408 =
                                            ::x10::lang::Place::_make(::x10aux::here);
                                          this__122408->FMGL(id);
                                      }))
                                      )) * (((x10_long)2ll)));
        
        //#line 534 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10aux::nullCheck(allInfo)->x10::lang::Rail< x10_int >::__set(
          myTeamPosition, color);
        
        //#line 535 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10aux::nullCheck(allInfo)->x10::lang::Rail< x10_int >::__set(
          ((myTeamPosition) + (((x10_long)1ll))), ((x10_int) (new_role)));
        
        //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        x10_int numPlacesInMyTeam = ((x10_int)0);
        
        //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        {
            x10_long i;
            for (i = ((x10_long)0ll); ((i) < ((x10_long)(::x10aux::nullCheck(allInfo)->FMGL(size))));
                 i = ((i) + (((x10_long)2ll)))) {
                
                //#line 542 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                if ((::x10aux::struct_equals(::x10aux::nullCheck(allInfo)->x10::lang::Rail< x10_int >::__apply(
                                               i), color)))
                {
                    
                    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                    numPlacesInMyTeam = ((numPlacesInMyTeam) + (((x10_int)1)));
                }
                
            }
        }
        
        //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::lang::Rail< ::x10::lang::Place >* newTeamPlaceRail =
          ::x10::lang::Rail< ::x10::lang::Place >::_make(((x10_long)(numPlacesInMyTeam)));
        
        //#line 548 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        {
            x10_long i;
            for (i = ((x10_long)0ll); ((i) < ((x10_long)(::x10aux::nullCheck(allInfo)->FMGL(size))));
                 i = ((i) + (((x10_long)2ll)))) {
                
                //#line 549 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                if ((::x10aux::struct_equals(::x10aux::nullCheck(allInfo)->x10::lang::Rail< x10_int >::__apply(
                                               i), color)))
                {
                    
                    //#line 551 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                    ::x10aux::nullCheck(newTeamPlaceRail)->x10::lang::Rail< ::x10::lang::Place >::__set(
                      ((x10_long)(::x10aux::nullCheck(allInfo)->x10::lang::Rail< x10_int >::__apply(
                                    ((i) + (((x10_long)1ll)))))),
                      ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                              ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122410 =
                                                ::x10::util::Team::FMGL(state__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122409 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              ::x10::util::Team__LocalTeamState* ret__122411;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122411 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122410)->FMGL(data))->x10::lang::Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                  idx__122409);
                                              ret__122411;
                                          }))
                                          )->FMGL(places))->__apply(
                        ((i) / ::x10aux::zeroCheck(((x10_long)2ll)))));
                }
                
            }
        }
        
        //#line 553 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::lang::SparsePlaceGroup* newTeamPlaceGroup =
           (new (::x10aux::alloc_z< ::x10::lang::SparsePlaceGroup>()) ::x10::lang::SparsePlaceGroup());
        (newTeamPlaceGroup)->::x10::lang::SparsePlaceGroup::_constructor(
          newTeamPlaceRail);
        
        //#line 556 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        if (((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                      ((x10_int)2))) || (::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                                                                 ((x10_int)3)))))
        {
            
            //#line 558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            (*this)->x10::util::Team::barrier();
            {
                
                //#line 560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                ::x10::lang::Runtime::ensureNotInAtomic();
                ::x10::lang::FinishState* x10____var47 = ::x10::lang::Runtime::startFinish();
                {
                    ::x10::lang::CheckedThrowable* throwable__122931 =
                      ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                    try {
                        try {
                            {
                                ::x10::util::Team::nativeSplit(
                                  (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                              ((x10_int)0)))
                                    ? (((x10_int) ((__extension__ ({
                                           ::x10::lang::Place this__122413 =
                                             ::x10::lang::Place::_make(::x10aux::here);
                                           this__122413->FMGL(id);
                                       }))
                                       ))) : ((__extension__ ({
                                                  ::x10::util::GrowableRail<x10_int>* this__122415 =
                                                    ::x10::util::Team::FMGL(roles__get)();
                                                  
                                                  //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                  x10_long idx__122414 =
                                                    ((x10_long)((*this)->FMGL(id)));
                                                  x10_int ret__122416;
                                                  
                                                  //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                  ret__122416 =
                                                    ::x10aux::nullCheck(::x10aux::nullCheck(this__122415)->FMGL(data))->x10::lang::Rail< x10_int >::__apply(
                                                      idx__122414);
                                                  ret__122416;
                                              }))
                                              ), color, ((x10_int) (new_role)),
                                  result);
                            }
                        }
                        catch (::x10::lang::CheckedThrowable* __exc3083) {
                            if (true) {
                                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3083);
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
                    catch (::x10::lang::CheckedThrowable* __exc3084) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* formal__122932 =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3084);
                            {
                                throwable__122931 = formal__122932;
                            }
                        } else
                        throw;
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__122931)))
                    {
                        if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122931))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__122931));
                        }
                        
                    }
                    if (true) {
                        ::x10::lang::Runtime::stopFinish(
                          x10____var47);
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__122931)))
                    {
                        if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122931)))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__122931));
                        }
                        
                    }
                    
                }
            }
            
            //#line 562 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::util::Team alloc__122703 =  ::x10::util::Team::_alloc();
            (alloc__122703)->::x10::util::Team::_constructor(
              result->x10::lang::Rail< x10_int >::__apply(
                ((x10_long)0ll)), reinterpret_cast< ::x10::lang::PlaceGroup*>(newTeamPlaceGroup),
              new_role);
            return alloc__122703;
            
        } else {
            
            //#line 566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::util::Team alloc__122704 =  ::x10::util::Team::_alloc();
            (alloc__122704)->::x10::util::Team::_constructor(
              ((((x10_int) ((__extension__ ({
                  ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122705 =
                    ::x10::util::Team::FMGL(state__get)();
                  ::x10aux::nullCheck(this__122705)->FMGL(size);
              }))
              ))) + (color)), reinterpret_cast< ::x10::lang::PlaceGroup*>(newTeamPlaceGroup),
              new_role);
            return alloc__122704;
            
        }
        
    }
    
}

//#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
void x10::util::Team::nativeSplit(x10_int id, x10_int role,
                                  x10_int color, x10_int new_role,
                                  ::x10::lang::Rail< x10_int >* result) {
    x10rt_team_split(id, role, color, new_role, ::x10aux::coll_handler2, ::x10aux::coll_enter2(result->raw));
}

//#line 579 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
void x10::util::Team::_kwd__delete() {
    
    //#line 580 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((::x10aux::struct_equals((*this), ::x10::util::Team::FMGL(WORLD__get)())))
    {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalArgumentException::_make((__extension__ ({ static ::x10::lang::String* strLit__130585 = ::x10aux::makeStringLit("Cannot delete Team.WORLD"); strLit__130585; })))));
    }
    
    //#line 581 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                 ((x10_int)4)))) {
        {
            
            //#line 582 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var48 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122934 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::nativeDel(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122419 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122419->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122421 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122420 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122422;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122422 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122421)->FMGL(data))->x10::lang::Rail< x10_int >::__apply(
                                                  idx__122420);
                                              ret__122422;
                                          }))
                                          ));
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3087) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3087);
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
                catch (::x10::lang::CheckedThrowable* __exc3088) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122935 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3088);
                        {
                            throwable__122934 = formal__122935;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122934)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122934))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122934));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var48);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122934)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122934)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122934));
                    }
                    
                }
                
            }
        }
    } else 
    //#line 583 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if (((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                  ((x10_int)2))) || (::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                                                             ((x10_int)3)))))
    {
        
        //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        (*this)->x10::util::Team::barrier();
        {
            
            //#line 585 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var49 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122937 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::nativeDel(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122424 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122424->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122426 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122425 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122427;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122427 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122426)->FMGL(data))->x10::lang::Rail< x10_int >::__apply(
                                                  idx__122425);
                                              ret__122427;
                                          }))
                                          ));
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3089) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3089);
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
                catch (::x10::lang::CheckedThrowable* __exc3090) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122938 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3090);
                        {
                            throwable__122937 = formal__122938;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122937)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122937))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122937));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var49);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122937)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122937)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122937));
                    }
                    
                }
                
            }
        }
    }
    
}

//#line 590 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 595 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
::x10::lang::String* x10::util::Team::toString() {
    return ::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__130588 = ::x10aux::makeStringLit("Team("); strLit__130588; })), (*this)->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__130589 = ::x10aux::makeStringLit(")"); strLit__130589; })));
    
}

//#line 596 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 597 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_boolean x10::util::Team::equals(::x10::lang::Any* that) {
    return (::x10aux::instanceof< ::x10::util::Team>(that) &&
    (::x10aux::struct_equals((::x10aux::class_cast< ::x10::util::Team>(that))->FMGL(id),
                             (*this)->FMGL(id))));
    
}

//#line 598 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
::x10::lang::String* x10::util::Team::typeName(){
    return ::x10aux::type_name((*this));
}
x10_boolean x10::util::Team::_struct_equals(::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::util::Team>(other)))
    {
        return false;
        
    }
    return (*this)->x10::util::Team::_struct_equals(::x10aux::class_cast< ::x10::util::Team>(other));
    
}
void ::x10::util::Team::_serialize(::x10::util::Team this_, ::x10aux::serialization_buffer& buf) {
    buf.write(this_->FMGL(collectiveSupportLevel));
    buf.write(this_->FMGL(id));
    
}

void ::x10::util::Team::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(collectiveSupportLevel) = buf.read<x10_int>();
    FMGL(id) = buf.read<x10_int>();
    
}


::x10aux::RuntimeType x10::util::Team::rtt;
void x10::util::Team::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Any>()};
    rtt.initStageTwo("x10.util.Team",::x10aux::RuntimeType::struct_kind, 1, parents, 0, NULL, NULL);
    rtt.containsPtrs = false;
}

::x10::lang::VoidFun_0_0::itable<x10_util_Team__closure__1>x10_util_Team__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_Team__closure__1::__apply, &x10_util_Team__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_util_Team__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_util_Team__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_util_Team__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_Team__closure__1::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_util_Team__closure__2>x10_util_Team__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_Team__closure__2::__apply, &x10_util_Team__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_util_Team__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_util_Team__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_util_Team__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_Team__closure__2::_deserialize);

/* END of Team */
/*************************************************/
/*************************************************/
/* START of Team$LocalTeamState$TreeStructure */
#include <x10/util/Team__LocalTeamState__TreeStructure.h>

#include <x10/lang/Any.h>
#include <x10/lang/Long.h>
#include <x10/lang/String.h>
#include <x10/compiler/Native.h>
#include <x10/compiler/NonEscaping.h>
#include <x10/compiler/Synthetic.h>
#include <x10/lang/Int.h>
#include <x10/lang/Boolean.h>

//#line 616 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
namespace x10 { namespace util { 
class Team__LocalTeamState__TreeStructure_ibox0 : public ::x10::lang::IBox< ::x10::util::Team__LocalTeamState__TreeStructure> {
public:
    static ::x10::lang::Any::itable< Team__LocalTeamState__TreeStructure_ibox0 > itable;
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
::x10::lang::Any::itable< Team__LocalTeamState__TreeStructure_ibox0 >  Team__LocalTeamState__TreeStructure_ibox0::itable(&Team__LocalTeamState__TreeStructure_ibox0::equals, &Team__LocalTeamState__TreeStructure_ibox0::hashCode, &Team__LocalTeamState__TreeStructure_ibox0::toString, &Team__LocalTeamState__TreeStructure_ibox0::typeName);
} } 
::x10::lang::Any::itable< ::x10::util::Team__LocalTeamState__TreeStructure >  x10::util::Team__LocalTeamState__TreeStructure::_itable_0(&x10::util::Team__LocalTeamState__TreeStructure::equals, &x10::util::Team__LocalTeamState__TreeStructure::hashCode, &x10::util::Team__LocalTeamState__TreeStructure::toString, &x10::util::Team__LocalTeamState__TreeStructure::typeName);
::x10aux::itable_entry x10::util::Team__LocalTeamState__TreeStructure::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::util::Team__LocalTeamState__TreeStructure::_itable_0), ::x10aux::itable_entry(NULL, (void*)"::x10::util::Team__LocalTeamState__TreeStructure")};
::x10aux::itable_entry x10::util::Team__LocalTeamState__TreeStructure::_iboxitables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::util::Team__LocalTeamState__TreeStructure_ibox0::itable), ::x10aux::itable_entry(NULL, (void*)"::x10::util::Team__LocalTeamState__TreeStructure")};
::x10::lang::String* x10::util::Team__LocalTeamState__TreeStructure::typeName(
  ){
    return ::x10aux::type_name((*this));
}
::x10::lang::String* x10::util::Team__LocalTeamState__TreeStructure::toString(
  ) {
    return ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__130601 = ::x10aux::makeStringLit("struct x10.util.Team.LocalTeamState.TreeStructure:"); strLit__130601; })), (__extension__ ({ static ::x10::lang::String* strLit__130602 = ::x10aux::makeStringLit(" parentIndex="); strLit__130602; }))), (*this)->FMGL(parentIndex)), (__extension__ ({ static ::x10::lang::String* strLit__130603 = ::x10aux::makeStringLit(" child1Index="); strLit__130603; }))), (*this)->FMGL(child1Index)), (__extension__ ({ static ::x10::lang::String* strLit__130604 = ::x10aux::makeStringLit(" child2Index="); strLit__130604; }))), (*this)->FMGL(child2Index)), (__extension__ ({ static ::x10::lang::String* strLit__130605 = ::x10aux::makeStringLit(" totalChildren="); strLit__130605; }))), (*this)->FMGL(totalChildren));
    
}
x10_int x10::util::Team__LocalTeamState__TreeStructure::hashCode() {
    x10_int result = ((x10_int)1);
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(parentIndex))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(child1Index))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(child2Index))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(totalChildren))));
    return result;
    
}
x10_boolean x10::util::Team__LocalTeamState__TreeStructure::equals(::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::util::Team__LocalTeamState__TreeStructure>(other)))
    {
        return false;
        
    }
    return (*this)->x10::util::Team__LocalTeamState__TreeStructure::equals(
             ::x10aux::class_cast< ::x10::util::Team__LocalTeamState__TreeStructure>(other));
    
}
x10_boolean x10::util::Team__LocalTeamState__TreeStructure::_struct_equals(
  ::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::util::Team__LocalTeamState__TreeStructure>(other)))
    {
        return false;
        
    }
    return (*this)->x10::util::Team__LocalTeamState__TreeStructure::_struct_equals(
             ::x10aux::class_cast< ::x10::util::Team__LocalTeamState__TreeStructure>(other));
    
}

void ::x10::util::Team__LocalTeamState__TreeStructure::_serialize(::x10::util::Team__LocalTeamState__TreeStructure this_, ::x10aux::serialization_buffer& buf) {
    buf.write(this_->FMGL(parentIndex));
    buf.write(this_->FMGL(child1Index));
    buf.write(this_->FMGL(child2Index));
    buf.write(this_->FMGL(totalChildren));
    
}

void ::x10::util::Team__LocalTeamState__TreeStructure::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(parentIndex) = buf.read<x10_long>();
    FMGL(child1Index) = buf.read<x10_long>();
    FMGL(child2Index) = buf.read<x10_long>();
    FMGL(totalChildren) = buf.read<x10_long>();
}


::x10aux::RuntimeType x10::util::Team__LocalTeamState__TreeStructure::rtt;
void x10::util::Team__LocalTeamState__TreeStructure::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Any>()};
    rtt.initStageTwo("x10.util.Team.LocalTeamState.TreeStructure",::x10aux::RuntimeType::struct_kind, 1, parents, 0, NULL, NULL);
    rtt.containsPtrs = false;
}

/* END of Team$LocalTeamState$TreeStructure */
/*************************************************/
/*************************************************/
/* START of Team$DoubleIdx */
#include <x10/util/Team__DoubleIdx.h>

#include <x10/lang/Any.h>
#include <x10/lang/Double.h>
#include <x10/lang/Int.h>
#include <x10/lang/String.h>
#include <x10/compiler/Native.h>
#include <x10/compiler/NonEscaping.h>
#include <x10/compiler/Synthetic.h>
#include <x10/lang/Boolean.h>

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
namespace x10 { namespace util { 
class Team__DoubleIdx_ibox0 : public ::x10::lang::IBox< ::x10::util::Team__DoubleIdx> {
public:
    static ::x10::lang::Any::itable< Team__DoubleIdx_ibox0 > itable;
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
::x10::lang::Any::itable< Team__DoubleIdx_ibox0 >  Team__DoubleIdx_ibox0::itable(&Team__DoubleIdx_ibox0::equals, &Team__DoubleIdx_ibox0::hashCode, &Team__DoubleIdx_ibox0::toString, &Team__DoubleIdx_ibox0::typeName);
} } 
::x10::lang::Any::itable< ::x10::util::Team__DoubleIdx >  x10::util::Team__DoubleIdx::_itable_0(&x10::util::Team__DoubleIdx::equals, &x10::util::Team__DoubleIdx::hashCode, &x10::util::Team__DoubleIdx::toString, &x10::util::Team__DoubleIdx::typeName);
::x10aux::itable_entry x10::util::Team__DoubleIdx::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::util::Team__DoubleIdx::_itable_0), ::x10aux::itable_entry(NULL, (void*)"::x10::util::Team__DoubleIdx")};
::x10aux::itable_entry x10::util::Team__DoubleIdx::_iboxitables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::util::Team__DoubleIdx_ibox0::itable), ::x10aux::itable_entry(NULL, (void*)"::x10::util::Team__DoubleIdx")};
::x10::lang::String* x10::util::Team__DoubleIdx::typeName(){
    return ::x10aux::type_name((*this));
}
::x10::lang::String* x10::util::Team__DoubleIdx::toString() {
    return ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__130619 = ::x10aux::makeStringLit("struct x10.util.Team.DoubleIdx:"); strLit__130619; })), (__extension__ ({ static ::x10::lang::String* strLit__130620 = ::x10aux::makeStringLit(" value="); strLit__130620; }))), (*this)->FMGL(value)), (__extension__ ({ static ::x10::lang::String* strLit__130621 = ::x10aux::makeStringLit(" idx="); strLit__130621; }))), (*this)->FMGL(idx));
    
}
x10_int x10::util::Team__DoubleIdx::hashCode() {
    x10_int result = ((x10_int)1);
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(value))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(idx))));
    return result;
    
}
x10_boolean x10::util::Team__DoubleIdx::equals(::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::util::Team__DoubleIdx>(other))) {
        return false;
        
    }
    return (*this)->x10::util::Team__DoubleIdx::equals(::x10aux::class_cast< ::x10::util::Team__DoubleIdx>(other));
    
}
x10_boolean x10::util::Team__DoubleIdx::_struct_equals(::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::util::Team__DoubleIdx>(other))) {
        return false;
        
    }
    return (*this)->x10::util::Team__DoubleIdx::_struct_equals(::x10aux::class_cast< ::x10::util::Team__DoubleIdx>(other));
    
}

void ::x10::util::Team__DoubleIdx::_serialize(::x10::util::Team__DoubleIdx this_, ::x10aux::serialization_buffer& buf) {
    buf.write(this_->FMGL(value));
    buf.write(this_->FMGL(idx));
    
}

void ::x10::util::Team__DoubleIdx::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(value) = buf.read<x10_double>();
    FMGL(idx) = buf.read<x10_int>();
}


::x10aux::RuntimeType x10::util::Team__DoubleIdx::rtt;
void x10::util::Team__DoubleIdx::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Any>()};
    rtt.initStageTwo("x10.util.Team.DoubleIdx",::x10aux::RuntimeType::struct_kind, 1, parents, 0, NULL, NULL);
    rtt.containsPtrs = false;
}

/* END of Team$DoubleIdx */
/*************************************************/
/*************************************************/
/* START of Team$LocalTeamState */
#include <x10/util/Team__LocalTeamState.h>

#ifndef X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__3_CLOSURE
#define X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_util_Team__LocalTeamState__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_util_Team__LocalTeamState__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            {
                
                //#line 705 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                ::x10::lang::Runtime::ensureNotInAtomic();
                {
                    ::x10::lang::CheckedThrowable* throwable__122940 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                    try {
                        {
                            ::x10::lang::Runtime::enterAtomic();
                            while (true) {
                                if (((::x10aux::nullCheck(::x10::util::Team::FMGL(state__get)())->x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>::size()) > (((x10_long)(teamidcopy)))))
                                {
                                    {
                                     
                                    }
                                    break;
                                }
                                ::x10::lang::Runtime::awaitAtomic();
                            }
                            
                        }
                        ::x10::compiler::Finalization::plausibleThrow();
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3138) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* formal__122941 =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3138);
                            {
                                throwable__122940 = formal__122941;
                            }
                        } else
                        throw;
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__122940)))
                    {
                        if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122940))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__122940));
                        }
                        
                    }
                    if (true) {
                        ::x10::lang::Runtime::exitAtomic();
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__122940)))
                    {
                        if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122940)))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__122940));
                        }
                        
                    }
                    
                }
            }
        }
        catch (::x10::lang::CheckedThrowable* __exc3139) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc3139)) {
                ::x10::lang::Error* __lowerer__var__0__ =
                  static_cast< ::x10::lang::Error*>(__exc3139);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3139);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    x10_int teamidcopy;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->teamidcopy);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_Team__LocalTeamState__closure__3* storage = ::x10aux::alloc_z<x10_util_Team__LocalTeamState__closure__3>();
        buf.record_reference(storage);
        x10_int that_teamidcopy = buf.read<x10_int>();
        x10_util_Team__LocalTeamState__closure__3* this_ = new (storage) x10_util_Team__LocalTeamState__closure__3(that_teamidcopy);
        return this_;
    }
    
    x10_util_Team__LocalTeamState__closure__3(x10_int teamidcopy) : teamidcopy(teamidcopy) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10:704-706";
    }

};

#endif // X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__3_CLOSURE

//#line 615 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 618 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team__LocalTeamState::FMGL(PHASE_READY);
void x10::util::Team__LocalTeamState::FMGL(PHASE_READY__do_init)() {
    FMGL(PHASE_READY__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team__LocalTeamState.PHASE_READY");
    x10_int __var3119__ = ((x10_int)0);
    FMGL(PHASE_READY) = __var3119__;
    FMGL(PHASE_READY__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team__LocalTeamState::FMGL(PHASE_READY__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(PHASE_READY__status), &FMGL(PHASE_READY__do_init), &FMGL(PHASE_READY__exception), "x10::util::Team__LocalTeamState.PHASE_READY");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team__LocalTeamState::FMGL(PHASE_READY__status);
::x10::lang::CheckedThrowable* x10::util::Team__LocalTeamState::FMGL(PHASE_READY__exception);

//#line 619 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team__LocalTeamState::FMGL(PHASE_INIT);
void x10::util::Team__LocalTeamState::FMGL(PHASE_INIT__do_init)() {
    FMGL(PHASE_INIT__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team__LocalTeamState.PHASE_INIT");
    x10_int __var3120__ = ((x10_int)1);
    FMGL(PHASE_INIT) = __var3120__;
    FMGL(PHASE_INIT__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team__LocalTeamState::FMGL(PHASE_INIT__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(PHASE_INIT__status), &FMGL(PHASE_INIT__do_init), &FMGL(PHASE_INIT__exception), "x10::util::Team__LocalTeamState.PHASE_INIT");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team__LocalTeamState::FMGL(PHASE_INIT__status);
::x10::lang::CheckedThrowable* x10::util::Team__LocalTeamState::FMGL(PHASE_INIT__exception);

//#line 620 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team__LocalTeamState::FMGL(PHASE_GATHER1);
void x10::util::Team__LocalTeamState::FMGL(PHASE_GATHER1__do_init)() {
    FMGL(PHASE_GATHER1__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team__LocalTeamState.PHASE_GATHER1");
    x10_int __var3121__ = ((x10_int)2);
    FMGL(PHASE_GATHER1) = __var3121__;
    FMGL(PHASE_GATHER1__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team__LocalTeamState::FMGL(PHASE_GATHER1__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(PHASE_GATHER1__status), &FMGL(PHASE_GATHER1__do_init), &FMGL(PHASE_GATHER1__exception), "x10::util::Team__LocalTeamState.PHASE_GATHER1");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team__LocalTeamState::FMGL(PHASE_GATHER1__status);
::x10::lang::CheckedThrowable* x10::util::Team__LocalTeamState::FMGL(PHASE_GATHER1__exception);

//#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team__LocalTeamState::FMGL(PHASE_GATHER2);
void x10::util::Team__LocalTeamState::FMGL(PHASE_GATHER2__do_init)() {
    FMGL(PHASE_GATHER2__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team__LocalTeamState.PHASE_GATHER2");
    x10_int __var3122__ = ((x10_int)3);
    FMGL(PHASE_GATHER2) = __var3122__;
    FMGL(PHASE_GATHER2__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team__LocalTeamState::FMGL(PHASE_GATHER2__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(PHASE_GATHER2__status), &FMGL(PHASE_GATHER2__do_init), &FMGL(PHASE_GATHER2__exception), "x10::util::Team__LocalTeamState.PHASE_GATHER2");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team__LocalTeamState::FMGL(PHASE_GATHER2__status);
::x10::lang::CheckedThrowable* x10::util::Team__LocalTeamState::FMGL(PHASE_GATHER2__exception);

//#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team__LocalTeamState::FMGL(PHASE_SCATTER);
void x10::util::Team__LocalTeamState::FMGL(PHASE_SCATTER__do_init)() {
    FMGL(PHASE_SCATTER__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team__LocalTeamState.PHASE_SCATTER");
    x10_int __var3123__ = ((x10_int)4);
    FMGL(PHASE_SCATTER) = __var3123__;
    FMGL(PHASE_SCATTER__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team__LocalTeamState::FMGL(PHASE_SCATTER__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(PHASE_SCATTER__status), &FMGL(PHASE_SCATTER__do_init), &FMGL(PHASE_SCATTER__exception), "x10::util::Team__LocalTeamState.PHASE_SCATTER");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team__LocalTeamState::FMGL(PHASE_SCATTER__status);
::x10::lang::CheckedThrowable* x10::util::Team__LocalTeamState::FMGL(PHASE_SCATTER__exception);

//#line 623 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team__LocalTeamState::FMGL(PHASE_DONE);
void x10::util::Team__LocalTeamState::FMGL(PHASE_DONE__do_init)() {
    FMGL(PHASE_DONE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team__LocalTeamState.PHASE_DONE");
    x10_int __var3124__ = ((x10_int)5);
    FMGL(PHASE_DONE) = __var3124__;
    FMGL(PHASE_DONE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team__LocalTeamState::FMGL(PHASE_DONE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(PHASE_DONE__status), &FMGL(PHASE_DONE__do_init), &FMGL(PHASE_DONE__exception), "x10::util::Team__LocalTeamState.PHASE_DONE");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team__LocalTeamState::FMGL(PHASE_DONE__status);
::x10::lang::CheckedThrowable* x10::util::Team__LocalTeamState::FMGL(PHASE_DONE__exception);

//#line 624 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 625 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 627 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team__LocalTeamState::FMGL(COLL_BARRIER);
void x10::util::Team__LocalTeamState::FMGL(COLL_BARRIER__do_init)() {
    FMGL(COLL_BARRIER__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team__LocalTeamState.COLL_BARRIER");
    x10_int __var3125__ = ((x10_int)0);
    FMGL(COLL_BARRIER) = __var3125__;
    FMGL(COLL_BARRIER__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team__LocalTeamState::FMGL(COLL_BARRIER__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(COLL_BARRIER__status), &FMGL(COLL_BARRIER__do_init), &FMGL(COLL_BARRIER__exception), "x10::util::Team__LocalTeamState.COLL_BARRIER");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team__LocalTeamState::FMGL(COLL_BARRIER__status);
::x10::lang::CheckedThrowable* x10::util::Team__LocalTeamState::FMGL(COLL_BARRIER__exception);

//#line 628 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team__LocalTeamState::FMGL(COLL_BROADCAST);
void x10::util::Team__LocalTeamState::FMGL(COLL_BROADCAST__do_init)() {
    FMGL(COLL_BROADCAST__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team__LocalTeamState.COLL_BROADCAST");
    x10_int __var3126__ = ((x10_int)1);
    FMGL(COLL_BROADCAST) = __var3126__;
    FMGL(COLL_BROADCAST__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team__LocalTeamState::FMGL(COLL_BROADCAST__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(COLL_BROADCAST__status), &FMGL(COLL_BROADCAST__do_init), &FMGL(COLL_BROADCAST__exception), "x10::util::Team__LocalTeamState.COLL_BROADCAST");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team__LocalTeamState::FMGL(COLL_BROADCAST__status);
::x10::lang::CheckedThrowable* x10::util::Team__LocalTeamState::FMGL(COLL_BROADCAST__exception);

//#line 629 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team__LocalTeamState::FMGL(COLL_SCATTER);
void x10::util::Team__LocalTeamState::FMGL(COLL_SCATTER__do_init)() {
    FMGL(COLL_SCATTER__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team__LocalTeamState.COLL_SCATTER");
    x10_int __var3127__ = ((x10_int)2);
    FMGL(COLL_SCATTER) = __var3127__;
    FMGL(COLL_SCATTER__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team__LocalTeamState::FMGL(COLL_SCATTER__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(COLL_SCATTER__status), &FMGL(COLL_SCATTER__do_init), &FMGL(COLL_SCATTER__exception), "x10::util::Team__LocalTeamState.COLL_SCATTER");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team__LocalTeamState::FMGL(COLL_SCATTER__status);
::x10::lang::CheckedThrowable* x10::util::Team__LocalTeamState::FMGL(COLL_SCATTER__exception);

//#line 630 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team__LocalTeamState::FMGL(COLL_ALLTOALL);
void x10::util::Team__LocalTeamState::FMGL(COLL_ALLTOALL__do_init)() {
    FMGL(COLL_ALLTOALL__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team__LocalTeamState.COLL_ALLTOALL");
    x10_int __var3128__ = ((x10_int)3);
    FMGL(COLL_ALLTOALL) = __var3128__;
    FMGL(COLL_ALLTOALL__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team__LocalTeamState::FMGL(COLL_ALLTOALL__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(COLL_ALLTOALL__status), &FMGL(COLL_ALLTOALL__do_init), &FMGL(COLL_ALLTOALL__exception), "x10::util::Team__LocalTeamState.COLL_ALLTOALL");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team__LocalTeamState::FMGL(COLL_ALLTOALL__status);
::x10::lang::CheckedThrowable* x10::util::Team__LocalTeamState::FMGL(COLL_ALLTOALL__exception);

//#line 631 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team__LocalTeamState::FMGL(COLL_REDUCE);
void x10::util::Team__LocalTeamState::FMGL(COLL_REDUCE__do_init)() {
    FMGL(COLL_REDUCE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team__LocalTeamState.COLL_REDUCE");
    x10_int __var3129__ = ((x10_int)4);
    FMGL(COLL_REDUCE) = __var3129__;
    FMGL(COLL_REDUCE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team__LocalTeamState::FMGL(COLL_REDUCE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(COLL_REDUCE__status), &FMGL(COLL_REDUCE__do_init), &FMGL(COLL_REDUCE__exception), "x10::util::Team__LocalTeamState.COLL_REDUCE");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team__LocalTeamState::FMGL(COLL_REDUCE__status);
::x10::lang::CheckedThrowable* x10::util::Team__LocalTeamState::FMGL(COLL_REDUCE__exception);

//#line 632 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team__LocalTeamState::FMGL(COLL_ALLREDUCE);
void x10::util::Team__LocalTeamState::FMGL(COLL_ALLREDUCE__do_init)() {
    FMGL(COLL_ALLREDUCE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team__LocalTeamState.COLL_ALLREDUCE");
    x10_int __var3130__ = ((x10_int)5);
    FMGL(COLL_ALLREDUCE) = __var3130__;
    FMGL(COLL_ALLREDUCE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team__LocalTeamState::FMGL(COLL_ALLREDUCE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(COLL_ALLREDUCE__status), &FMGL(COLL_ALLREDUCE__do_init), &FMGL(COLL_ALLREDUCE__exception), "x10::util::Team__LocalTeamState.COLL_ALLREDUCE");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team__LocalTeamState::FMGL(COLL_ALLREDUCE__status);
::x10::lang::CheckedThrowable* x10::util::Team__LocalTeamState::FMGL(COLL_ALLREDUCE__exception);

//#line 633 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team__LocalTeamState::FMGL(COLL_INDEXOFMIN);
void x10::util::Team__LocalTeamState::FMGL(COLL_INDEXOFMIN__do_init)() {
    FMGL(COLL_INDEXOFMIN__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team__LocalTeamState.COLL_INDEXOFMIN");
    x10_int __var3131__ = ((x10_int)6);
    FMGL(COLL_INDEXOFMIN) = __var3131__;
    FMGL(COLL_INDEXOFMIN__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team__LocalTeamState::FMGL(COLL_INDEXOFMIN__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(COLL_INDEXOFMIN__status), &FMGL(COLL_INDEXOFMIN__do_init), &FMGL(COLL_INDEXOFMIN__exception), "x10::util::Team__LocalTeamState.COLL_INDEXOFMIN");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team__LocalTeamState::FMGL(COLL_INDEXOFMIN__status);
::x10::lang::CheckedThrowable* x10::util::Team__LocalTeamState::FMGL(COLL_INDEXOFMIN__exception);

//#line 634 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
x10_int x10::util::Team__LocalTeamState::FMGL(COLL_INDEXOFMAX);
void x10::util::Team__LocalTeamState::FMGL(COLL_INDEXOFMAX__do_init)() {
    FMGL(COLL_INDEXOFMAX__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Team__LocalTeamState.COLL_INDEXOFMAX");
    x10_int __var3132__ = ((x10_int)7);
    FMGL(COLL_INDEXOFMAX) = __var3132__;
    FMGL(COLL_INDEXOFMAX__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Team__LocalTeamState::FMGL(COLL_INDEXOFMAX__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(COLL_INDEXOFMAX__status), &FMGL(COLL_INDEXOFMAX__do_init), &FMGL(COLL_INDEXOFMAX__exception), "x10::util::Team__LocalTeamState.COLL_INDEXOFMAX");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Team__LocalTeamState::FMGL(COLL_INDEXOFMAX__status);
::x10::lang::CheckedThrowable* x10::util::Team__LocalTeamState::FMGL(COLL_INDEXOFMAX__exception);

//#line 637 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 639 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 640 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 642 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 643 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 645 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
::x10::lang::String* x10::util::Team__LocalTeamState::getCollName(x10_int collType) {
    
    //#line 646 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    switch (collType) {
        
        //#line 647 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        case ((x10_int)0): ;
        {
            return (__extension__ ({ static ::x10::lang::String* strLit__130628 = ::x10aux::makeStringLit("Barrier"); strLit__130628; }));
            
        }
        //#line 648 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        case ((x10_int)1): ;
        {
            return (__extension__ ({ static ::x10::lang::String* strLit__130629 = ::x10aux::makeStringLit("Broadcast"); strLit__130629; }));
            
        }
        //#line 649 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        case ((x10_int)2): ;
        {
            return (__extension__ ({ static ::x10::lang::String* strLit__130630 = ::x10aux::makeStringLit("Scatter"); strLit__130630; }));
            
        }
        //#line 650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        case ((x10_int)3): ;
        {
            return (__extension__ ({ static ::x10::lang::String* strLit__130631 = ::x10aux::makeStringLit("AllToAll"); strLit__130631; }));
            
        }
        //#line 651 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        case ((x10_int)4): ;
        {
            return (__extension__ ({ static ::x10::lang::String* strLit__130632 = ::x10aux::makeStringLit("Reduce"); strLit__130632; }));
            
        }
        //#line 652 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        case ((x10_int)5): ;
        {
            return (__extension__ ({ static ::x10::lang::String* strLit__130633 = ::x10aux::makeStringLit("AllReduce"); strLit__130633; }));
            
        }
        //#line 653 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        case ((x10_int)6): ;
        {
            return (__extension__ ({ static ::x10::lang::String* strLit__130634 = ::x10aux::makeStringLit("IndexOfMin"); strLit__130634; }));
            
        }
        //#line 654 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        case ((x10_int)7): ;
        {
            return (__extension__ ({ static ::x10::lang::String* strLit__130635 = ::x10aux::makeStringLit("IndexOfMax"); strLit__130635; }));
            
        }
        //#line 655 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        default: ;
        {
            return (__extension__ ({ static ::x10::lang::String* strLit__130636 = ::x10aux::makeStringLit("Unknown"); strLit__130636; }));
            
        }
    }
}

//#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
void x10::util::Team__LocalTeamState::lockDst(x10_int teamidcopy, ::x10::util::concurrent::Lock* lock) {
    
    //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if (!(::x10aux::nullCheck(lock)->tryLock())) {
        
        //#line 661 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        if (false) {
            
            //#line 662 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            while (!(::x10aux::nullCheck(lock)->tryLock())) {
                
                //#line 663 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                ::x10::lang::Runtime::probe();
            }
            
        } else {
            
            //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)())) {
                
                //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10::lang::Runtime::FMGL(pool__get)()->increase();
            }
            
            //#line 667 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            while (!(::x10aux::nullCheck(lock)->tryLock())) {
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                x10_boolean ret__122436;
                goto __ret__122437; __ret__122437: {
                {
                    
                    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                    try {
                        
                        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                        ::x10::lang::Thread::sleep(((x10_long)0ll));
                        
                        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                        ret__122436 = true;
                        goto __ret__122437_end_;
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3135) {
                        if (::x10aux::instanceof< ::x10::lang::InterruptedException*>(__exc3135)) {
                            ::x10::lang::InterruptedException* e__122435 =
                              static_cast< ::x10::lang::InterruptedException*>(__exc3135);
                            {
                                
                                //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                                ret__122436 = false;
                                goto __ret__122437_end_;
                            }
                        } else
                        throw;
                    }
                }goto __ret__122437_end_; __ret__122437_end_: ;
                }
                ret__122436;
                }
                
            
            //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)())) {
                
                //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10::lang::Runtime::FMGL(pool__get)()->decrease(((x10_int)1));
            }
            }
            
        }
        
    }
    

//#line 675 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
::x10::util::Team__LocalTeamState__TreeStructure x10::util::Team__LocalTeamState::getLinks(
  x10_long parent, x10_long startIndex, x10_long endIndex) {
    
    //#line 678 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((::x10aux::struct_equals(this->FMGL(myIndex), startIndex)))
    {
        
        //#line 679 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        x10_long children = ((endIndex) - (startIndex));
        
        //#line 680 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::util::Team__LocalTeamState__TreeStructure alloc__122711 =
           ::x10::util::Team__LocalTeamState__TreeStructure::_alloc();
        
        //#line 616 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        x10_long parentIndex__122707 = parent;
        x10_long child1Index__122708 = ((children) < (((x10_long)1ll)))
          ? (((x10_long)-1ll)) : (((startIndex) + (((x10_long)1ll))));
        x10_long child2Index__122709 = ((children) < (((x10_long)2ll)))
          ? (((x10_long)-1ll)) : (((((startIndex) + (((x10_long)1ll)))) + (((((endIndex) - (startIndex))) / ::x10aux::zeroCheck(((x10_long)2ll))))));
        x10_long totalChildren__122710 = children;
        alloc__122711->FMGL(parentIndex) = parentIndex__122707;
        alloc__122711->FMGL(child1Index) = child1Index__122708;
        alloc__122711->FMGL(child2Index) = child2Index__122709;
        alloc__122711->FMGL(totalChildren) = totalChildren__122710;
        
        //#line 680 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        return alloc__122711;
        
    } else 
    //#line 683 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if (((this->FMGL(myIndex)) > (((startIndex) + (((((endIndex) - (startIndex))) / ::x10aux::zeroCheck(((x10_long)2ll))))))))
    {
        
        //#line 684 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        return this->getLinks(startIndex, ((((startIndex) + (((x10_long)1ll)))) + (((((endIndex) - (startIndex))) / ::x10aux::zeroCheck(((x10_long)2ll))))),
                              endIndex);
        
    } else {
        
        //#line 686 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        return this->getLinks(startIndex, ((startIndex) + (((x10_long)1ll))),
                              ((startIndex) + (((((endIndex) - (startIndex))) / ::x10aux::zeroCheck(((x10_long)2ll))))));
        
    }
    
}

//#line 694 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
void x10::util::Team__LocalTeamState::init() {
    
    //#line 696 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    ::x10::util::Team__LocalTeamState__TreeStructure myLinks =
      this->getLinks(((x10_long)-1ll), ((x10_long)0ll), ((::x10aux::nullCheck(this->FMGL(places))->numPlaces()) - (((x10_long)1ll))));
    
    //#line 702 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    x10_int teamidcopy = this->FMGL(teamid);
    
    //#line 703 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((!::x10aux::struct_equals(myLinks->FMGL(parentIndex),
                                  ((x10_long)-1ll)))) {
        {
            
            //#line 704 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var50 = ::x10::lang::Runtime::startFinish(
                                                       ::x10::compiler::Pragma::FMGL(FINISH_ASYNC__get)());
            {
                ::x10::lang::CheckedThrowable* throwable__122943 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::lang::Runtime::runAsync(
                              ::x10aux::nullCheck(this->FMGL(places))->__apply(
                                myLinks->FMGL(parentIndex)),
                              reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_util_Team__LocalTeamState__closure__3)))x10_util_Team__LocalTeamState__closure__3(teamidcopy))),
                              ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3140) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3140);
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
                catch (::x10::lang::CheckedThrowable* __exc3141) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122944 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3141);
                        {
                            throwable__122943 = formal__122944;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122943)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122943))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122943));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var50);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122943)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122943)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122943));
                    }
                    
                }
                
            }
        }
    }
    
    //#line 708 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    this->collective_impl< x10_int >(((x10_int)0), ::x10aux::nullCheck(this->FMGL(places))->__apply(
                                                     ((x10_long)0ll)),
                                     ::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_int >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)),
                                     ((x10_long)0ll), ::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_int >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)),
                                     ((x10_long)0ll), ((x10_long)0ll),
                                     ((x10_int)0));
}

//#line 712 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 737 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"

//#line 615 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
::x10::util::Team__LocalTeamState* x10::util::Team__LocalTeamState::x10__util__Team__LocalTeamState____this__x10__util__Team__LocalTeamState(
  ) {
    return this;
    
}
void x10::util::Team__LocalTeamState::_constructor(::x10::lang::PlaceGroup* places,
                                                   x10_int teamid,
                                                   x10_long myIndex) {
    FMGL(places) = places;
    FMGL(teamid) = teamid;
    FMGL(myIndex) = myIndex;
    this->x10::util::Team__LocalTeamState::__fieldInitializers_x10_util_Team_LocalTeamState();
}
::x10::util::Team__LocalTeamState* x10::util::Team__LocalTeamState::_make(
  ::x10::lang::PlaceGroup* places, x10_int teamid, x10_long myIndex)
{
    ::x10::util::Team__LocalTeamState* this_ = new (::x10aux::alloc_z< ::x10::util::Team__LocalTeamState>()) ::x10::util::Team__LocalTeamState();
    this_->_constructor(places, teamid, myIndex);
    return this_;
}


void x10::util::Team__LocalTeamState::__fieldInitializers_x10_util_Team_LocalTeamState(
  ) {
    this->FMGL(phase) = ::x10::util::concurrent::AtomicInteger::_make(((x10_int)0));
    this->FMGL(dstLock) = ::x10::util::concurrent::Lock::_make();
    this->FMGL(local_src) = (::x10aux::class_cast_unchecked< ::x10::lang::Any*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(local_src_off) = ((x10_long)0ll);
    this->FMGL(local_dst) = (::x10aux::class_cast_unchecked< ::x10::lang::Any*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(local_dst_off) = ((x10_long)0ll);
    this->FMGL(local_count) = ((x10_long)0ll);
    this->FMGL(local_grandchildren) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t x10::util::Team__LocalTeamState::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::Team__LocalTeamState::_deserializer);

void x10::util::Team__LocalTeamState::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(phase));
    buf.write(this->FMGL(dstLock));
    buf.write(this->FMGL(local_src));
    buf.write(this->FMGL(local_src_off));
    buf.write(this->FMGL(local_dst));
    buf.write(this->FMGL(local_dst_off));
    buf.write(this->FMGL(local_count));
    buf.write(this->FMGL(local_grandchildren));
    buf.write(this->FMGL(places));
    buf.write(this->FMGL(teamid));
    buf.write(this->FMGL(myIndex));
    
}

::x10::lang::Reference* ::x10::util::Team__LocalTeamState::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::Team__LocalTeamState* this_ = new (::x10aux::alloc_z< ::x10::util::Team__LocalTeamState>()) ::x10::util::Team__LocalTeamState();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::Team__LocalTeamState::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(phase) = buf.read< ::x10::util::concurrent::AtomicInteger*>();
    FMGL(dstLock) = buf.read< ::x10::util::concurrent::Lock*>();
    FMGL(local_src) = buf.read< ::x10::lang::Any*>();
    FMGL(local_src_off) = buf.read<x10_long>();
    FMGL(local_dst) = buf.read< ::x10::lang::Any*>();
    FMGL(local_dst_off) = buf.read<x10_long>();
    FMGL(local_count) = buf.read<x10_long>();
    FMGL(local_grandchildren) = buf.read<x10_long>();
    FMGL(places) = buf.read< ::x10::lang::PlaceGroup*>();
    FMGL(teamid) = buf.read<x10_int>();
    FMGL(myIndex) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::util::Team__LocalTeamState::rtt;
void x10::util::Team__LocalTeamState::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.util.Team.LocalTeamState",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_util_Team__LocalTeamState__closure__3>x10_util_Team__LocalTeamState__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_Team__LocalTeamState__closure__3::__apply, &x10_util_Team__LocalTeamState__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_util_Team__LocalTeamState__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_util_Team__LocalTeamState__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_Team__LocalTeamState__closure__3::_deserialize);
const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__3::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_util_Team__LocalTeamState__closure__3::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

/* END of Team$LocalTeamState */
/*************************************************/
