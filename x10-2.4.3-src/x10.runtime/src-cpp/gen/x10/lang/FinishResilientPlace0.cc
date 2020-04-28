/*************************************************/
/* START of FinishResilientPlace0 */
#include <x10/lang/FinishResilientPlace0.h>

#ifndef X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__1_CLOSURE
#define X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
class x10_lang_FinishResilientPlace0__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_0<x10_long>::itable<x10_lang_FinishResilientPlace0__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply() {
        {
            ::x10::lang::CheckedThrowable* throwable__97108 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        
                        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        x10_long id = (__extension__ ({
                            ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* this__96937 =
                              ::x10::lang::FinishResilientPlace0::FMGL(states__get)();
                            ::x10aux::nullCheck(this__96937)->FMGL(size);
                        }))
                        ;
                        
                        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ::x10::lang::FinishResilientPlace0__State* state =
                           (new (::x10aux::alloc_z< ::x10::lang::FinishResilientPlace0__State>()) ::x10::lang::FinishResilientPlace0__State());
                        
                        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        x10_long parentId__97036 = parentId;
                        ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > gLatch__97037 =
                          gLatch;
                        
                        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        state->x10::lang::FinishResilientPlace0__State::__fieldInitializers_x10_lang_FinishResilientPlace0_State();
                        
                        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        state->FMGL(parentId) = parentId__97036;
                        state->FMGL(gLatch) = gLatch__97037;
                        
                        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ::x10aux::nullCheck(::x10::lang::FinishResilientPlace0::FMGL(states__get)())->x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>::add(
                          state);
                        
                        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        state->FMGL(live)->x10::lang::Rail< x10_int >::__set(
                          ::x10::lang::Place::place((gLatch)->location)->FMGL(id),
                          ((x10_int)1));
                        
                        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        if ((!::x10aux::struct_equals(parentId,
                                                      ((x10_long)-1ll))))
                        {
                            ::x10aux::nullCheck((__extension__ ({
                                ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* this__96942 =
                                  ::x10::lang::FinishResilientPlace0::FMGL(states__get)();
                                
                                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                x10_long idx__96941 = parentId;
                                ::x10::lang::FinishResilientPlace0__State* ret__96943;
                                
                                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                ret__96943 = ::x10aux::nullCheck(::x10aux::nullCheck(this__96942)->FMGL(data))->x10::lang::Rail< ::x10::lang::FinishResilientPlace0__State* >::__apply(
                                               idx__96941);
                                ret__96943;
                            }))
                            )->FMGL(children)->x10::util::GrowableRail<x10_long>::add(
                              id);
                        }
                        {
                            
                            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            x10_long t__97107 = id;
                            {
                                
                                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                                ::x10::lang::Runtime::exitAtomic();
                            }
                            return t__97107;
                            
                        }
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc828) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__97109 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc828);
                    {
                        throwable__97108 = formal__97109;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__97108)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__97108))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__97108));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__97108)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__97108)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__97108));
                }
                
            }
            
        }
    }
    
    // captured environment
    x10_long parentId;
    ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > gLatch;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->parentId);
        buf.write(this->gLatch);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilientPlace0__closure__1* storage = ::x10aux::alloc_z<x10_lang_FinishResilientPlace0__closure__1>();
        buf.record_reference(storage);
        x10_long that_parentId = buf.read<x10_long>();
        ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > that_gLatch = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > >();
        x10_lang_FinishResilientPlace0__closure__1* this_ = new (storage) x10_lang_FinishResilientPlace0__closure__1(that_parentId, that_gLatch);
        return this_;
    }
    
    x10_lang_FinishResilientPlace0__closure__1(x10_long parentId, ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > gLatch) : parentId(parentId), gLatch(gLatch) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10:65-72";
    }

};

#endif // X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__1_CLOSURE
#ifndef X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__2_CLOSURE
#define X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishResilientPlace0__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilientPlace0__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        {
            ::x10::lang::CheckedThrowable* throwable__97114 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        
                        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ::x10::lang::FinishResilientPlace0__State* state =
                          (__extension__ ({
                            ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* this__96947 =
                              ::x10::lang::FinishResilientPlace0::FMGL(states__get)();
                            
                            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            x10_long idx__96946 = saved_this->FMGL(id);
                            ::x10::lang::FinishResilientPlace0__State* ret__96948;
                            
                            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            ret__96948 = ::x10aux::nullCheck(::x10aux::nullCheck(this__96947)->FMGL(data))->x10::lang::Rail< ::x10::lang::FinishResilientPlace0__State* >::__apply(
                                           idx__96946);
                            ret__96948;
                        }))
                        ;
                        
                        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        if (!(::x10aux::nullCheck(state)->isAdopted()))
                        {
                            
                            //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            ::x10::lang::Rail< x10_int >* a__97042 =
                              ::x10aux::nullCheck(state)->FMGL(transit);
                            x10_long i__97043 = ((((srcId) * (((x10_long)::x10aux::num_hosts)))) + (dstId));
                            x10_int r__97044 = ((a__97042->x10::lang::Rail< x10_int >::__apply(
                                                   i__97043)) + (((x10_int)1)));
                            a__97042->x10::lang::Rail< x10_int >::__set(
                              i__97043, r__97044);
                        } else {
                            
                            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            x10_long adopterId = ::x10::lang::FinishResilientPlace0::getCurrentAdopterId(
                                                   saved_this->FMGL(id));
                            
                            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            ::x10::lang::FinishResilientPlace0__State* adopterState =
                              (__extension__ ({
                                ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* this__96951 =
                                  ::x10::lang::FinishResilientPlace0::FMGL(states__get)();
                                
                                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                x10_long idx__96950 = adopterId;
                                ::x10::lang::FinishResilientPlace0__State* ret__96952;
                                
                                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                ret__96952 = ::x10aux::nullCheck(::x10aux::nullCheck(this__96951)->FMGL(data))->x10::lang::Rail< ::x10::lang::FinishResilientPlace0__State* >::__apply(
                                               idx__96950);
                                ret__96952;
                            }))
                            ;
                            
                            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            ::x10::lang::Rail< x10_int >* a__97045 =
                              ::x10aux::nullCheck(adopterState)->FMGL(transitAdopted);
                            x10_long i__97046 = ((((srcId) * (((x10_long)::x10aux::num_hosts)))) + (dstId));
                            x10_int r__97047 = ((a__97045->x10::lang::Rail< x10_int >::__apply(
                                                   i__97046)) + (((x10_int)1)));
                            a__97045->x10::lang::Rail< x10_int >::__set(
                              i__97046, r__97047);
                        }
                        
                        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)3ll))))
                        {
                            ::x10aux::nullCheck(state)->dump(
                              reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124233 = ::x10aux::makeStringLit("DUMP id="); strLit__124233; })), saved_this->FMGL(id))));
                        }
                        
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc832) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__97115 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc832);
                    {
                        throwable__97114 = formal__97115;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__97114)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__97114))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__97114));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__97114)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__97114)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__97114));
                }
                
            }
            
        }
    }
    
    // captured environment
    ::x10::lang::FinishResilientPlace0* saved_this;
    x10_long srcId;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->srcId);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilientPlace0__closure__2* storage = ::x10aux::alloc_z<x10_lang_FinishResilientPlace0__closure__2>();
        buf.record_reference(storage);
        ::x10::lang::FinishResilientPlace0* that_saved_this = buf.read< ::x10::lang::FinishResilientPlace0*>();
        x10_long that_srcId = buf.read<x10_long>();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_FinishResilientPlace0__closure__2* this_ = new (storage) x10_lang_FinishResilientPlace0__closure__2(that_saved_this, that_srcId, that_dstId);
        return this_;
    }
    
    x10_lang_FinishResilientPlace0__closure__2(::x10::lang::FinishResilientPlace0* saved_this, x10_long srcId, x10_long dstId) : saved_this(saved_this), srcId(srcId), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10:93-103";
    }

};

#endif // X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__2_CLOSURE
#ifndef X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__3_CLOSURE
#define X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishResilientPlace0__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilientPlace0__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        {
            ::x10::lang::CheckedThrowable* throwable__97117 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        
                        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ::x10::lang::FinishResilientPlace0__State* state =
                          (__extension__ ({
                            ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* this__96955 =
                              ::x10::lang::FinishResilientPlace0::FMGL(states__get)();
                            
                            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            x10_long idx__96954 = saved_this->FMGL(id);
                            ::x10::lang::FinishResilientPlace0__State* ret__96956;
                            
                            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            ret__96956 = ::x10aux::nullCheck(::x10aux::nullCheck(this__96955)->FMGL(data))->x10::lang::Rail< ::x10::lang::FinishResilientPlace0__State* >::__apply(
                                           idx__96954);
                            ret__96956;
                        }))
                        ;
                        
                        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        if (!(::x10aux::nullCheck(state)->isAdopted()))
                        {
                            
                            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            ::x10::lang::Rail< x10_int >* a__97048 =
                              ::x10aux::nullCheck(state)->FMGL(live);
                            x10_long i__97049 = dstId;
                            x10_int r__97050 = ((a__97048->x10::lang::Rail< x10_int >::__apply(
                                                   i__97049)) + (((x10_int)1)));
                            a__97048->x10::lang::Rail< x10_int >::__set(
                              i__97049, r__97050);
                            
                            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            ::x10::lang::Rail< x10_int >* a__97051 =
                              ::x10aux::nullCheck(state)->FMGL(transit);
                            x10_long i__97052 = ((((srcId) * (((x10_long)::x10aux::num_hosts)))) + (dstId));
                            x10_int r__97053 = ((a__97051->x10::lang::Rail< x10_int >::__apply(
                                                   i__97052)) - (((x10_int)1)));
                            a__97051->x10::lang::Rail< x10_int >::__set(
                              i__97052, r__97053);
                        } else {
                            
                            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            x10_long adopterId = ::x10::lang::FinishResilientPlace0::getCurrentAdopterId(
                                                   saved_this->FMGL(id));
                            
                            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            ::x10::lang::FinishResilientPlace0__State* adopterState =
                              (__extension__ ({
                                ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* this__96959 =
                                  ::x10::lang::FinishResilientPlace0::FMGL(states__get)();
                                
                                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                x10_long idx__96958 = adopterId;
                                ::x10::lang::FinishResilientPlace0__State* ret__96960;
                                
                                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                ret__96960 = ::x10aux::nullCheck(::x10aux::nullCheck(this__96959)->FMGL(data))->x10::lang::Rail< ::x10::lang::FinishResilientPlace0__State* >::__apply(
                                               idx__96958);
                                ret__96960;
                            }))
                            ;
                            
                            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            ::x10::lang::Rail< x10_int >* a__97054 =
                              ::x10aux::nullCheck(adopterState)->FMGL(liveAdopted);
                            x10_long i__97055 = dstId;
                            x10_int r__97056 = ((a__97054->x10::lang::Rail< x10_int >::__apply(
                                                   i__97055)) + (((x10_int)1)));
                            a__97054->x10::lang::Rail< x10_int >::__set(
                              i__97055, r__97056);
                            
                            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            ::x10::lang::Rail< x10_int >* a__97057 =
                              ::x10aux::nullCheck(adopterState)->FMGL(transitAdopted);
                            x10_long i__97058 = ((((srcId) * (((x10_long)::x10aux::num_hosts)))) + (dstId));
                            x10_int r__97059 = ((a__97057->x10::lang::Rail< x10_int >::__apply(
                                                   i__97058)) - (((x10_int)1)));
                            a__97057->x10::lang::Rail< x10_int >::__set(
                              i__97058, r__97059);
                        }
                        
                        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)3ll))))
                        {
                            ::x10aux::nullCheck(state)->dump(
                              reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124249 = ::x10aux::makeStringLit("DUMP id="); strLit__124249; })), saved_this->FMGL(id))));
                        }
                        
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc834) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__97118 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc834);
                    {
                        throwable__97117 = formal__97118;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__97117)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__97117))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__97117));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__97117)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__97117)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__97117));
                }
                
            }
            
        }
    }
    
    // captured environment
    ::x10::lang::FinishResilientPlace0* saved_this;
    x10_long dstId;
    x10_long srcId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->dstId);
        buf.write(this->srcId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilientPlace0__closure__3* storage = ::x10aux::alloc_z<x10_lang_FinishResilientPlace0__closure__3>();
        buf.record_reference(storage);
        ::x10::lang::FinishResilientPlace0* that_saved_this = buf.read< ::x10::lang::FinishResilientPlace0*>();
        x10_long that_dstId = buf.read<x10_long>();
        x10_long that_srcId = buf.read<x10_long>();
        x10_lang_FinishResilientPlace0__closure__3* this_ = new (storage) x10_lang_FinishResilientPlace0__closure__3(that_saved_this, that_dstId, that_srcId);
        return this_;
    }
    
    x10_lang_FinishResilientPlace0__closure__3(::x10::lang::FinishResilientPlace0* saved_this, x10_long dstId, x10_long srcId) : saved_this(saved_this), dstId(dstId), srcId(srcId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10:113-125";
    }

};

#endif // X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__3_CLOSURE
#ifndef X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__4_CLOSURE
#define X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishResilientPlace0__closure__4 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilientPlace0__closure__4> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        {
            ::x10::lang::CheckedThrowable* throwable__97120 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        
                        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ::x10::lang::FinishResilientPlace0__State* state =
                          (__extension__ ({
                            ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* this__96963 =
                              ::x10::lang::FinishResilientPlace0::FMGL(states__get)();
                            
                            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            x10_long idx__96962 = saved_this->FMGL(id);
                            ::x10::lang::FinishResilientPlace0__State* ret__96964;
                            
                            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            ret__96964 = ::x10aux::nullCheck(::x10aux::nullCheck(this__96963)->FMGL(data))->x10::lang::Rail< ::x10::lang::FinishResilientPlace0__State* >::__apply(
                                           idx__96962);
                            ret__96964;
                        }))
                        ;
                        
                        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        if (!(::x10aux::nullCheck(state)->isAdopted()))
                        {
                            
                            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            ::x10::lang::Rail< x10_int >* a__97060 =
                              ::x10aux::nullCheck(state)->FMGL(live);
                            x10_long i__97061 = dstId;
                            x10_int r__97062 = ((a__97060->x10::lang::Rail< x10_int >::__apply(
                                                   i__97061)) - (((x10_int)1)));
                            a__97060->x10::lang::Rail< x10_int >::__set(
                              i__97061, r__97062);
                        } else {
                            
                            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            x10_long adopterId = ::x10::lang::FinishResilientPlace0::getCurrentAdopterId(
                                                   saved_this->FMGL(id));
                            
                            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            ::x10::lang::FinishResilientPlace0__State* adopterState =
                              (__extension__ ({
                                ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* this__96967 =
                                  ::x10::lang::FinishResilientPlace0::FMGL(states__get)();
                                
                                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                x10_long idx__96966 = adopterId;
                                ::x10::lang::FinishResilientPlace0__State* ret__96968;
                                
                                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                ret__96968 = ::x10aux::nullCheck(::x10aux::nullCheck(this__96967)->FMGL(data))->x10::lang::Rail< ::x10::lang::FinishResilientPlace0__State* >::__apply(
                                               idx__96966);
                                ret__96968;
                            }))
                            ;
                            
                            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            ::x10::lang::Rail< x10_int >* a__97063 =
                              ::x10aux::nullCheck(adopterState)->FMGL(liveAdopted);
                            x10_long i__97064 = dstId;
                            x10_int r__97065 = ((a__97063->x10::lang::Rail< x10_int >::__apply(
                                                   i__97064)) - (((x10_int)1)));
                            a__97063->x10::lang::Rail< x10_int >::__set(
                              i__97064, r__97065);
                        }
                        
                        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        if (::x10::lang::FinishResilientPlace0::quiescent(
                              saved_this->FMGL(id))) {
                            ::x10::lang::FinishResilientPlace0::releaseLatch(
                              saved_this->FMGL(id));
                        }
                        
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc836) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__97121 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc836);
                    {
                        throwable__97120 = formal__97121;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__97120)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__97120))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__97120));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__97120)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__97120)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__97120));
                }
                
            }
            
        }
    }
    
    // captured environment
    ::x10::lang::FinishResilientPlace0* saved_this;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilientPlace0__closure__4* storage = ::x10aux::alloc_z<x10_lang_FinishResilientPlace0__closure__4>();
        buf.record_reference(storage);
        ::x10::lang::FinishResilientPlace0* that_saved_this = buf.read< ::x10::lang::FinishResilientPlace0*>();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_FinishResilientPlace0__closure__4* this_ = new (storage) x10_lang_FinishResilientPlace0__closure__4(that_saved_this, that_dstId);
        return this_;
    }
    
    x10_lang_FinishResilientPlace0__closure__4(::x10::lang::FinishResilientPlace0* saved_this, x10_long dstId) : saved_this(saved_this), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10:132-142";
    }

};

#endif // X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__4_CLOSURE
#ifndef X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__5_CLOSURE
#define X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishResilientPlace0__closure__5 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilientPlace0__closure__5> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        {
            ::x10::lang::CheckedThrowable* throwable__97123 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        
                        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ::x10::lang::FinishResilientPlace0__State* state =
                          (__extension__ ({
                            ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* this__96971 =
                              ::x10::lang::FinishResilientPlace0::FMGL(states__get)();
                            
                            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            x10_long idx__96970 = saved_this->FMGL(id);
                            ::x10::lang::FinishResilientPlace0__State* ret__96972;
                            
                            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            ret__96972 = ::x10aux::nullCheck(::x10aux::nullCheck(this__96971)->FMGL(data))->x10::lang::Rail< ::x10::lang::FinishResilientPlace0__State* >::__apply(
                                           idx__96970);
                            ret__96972;
                        }))
                        ;
                        
                        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ::x10aux::nullCheck(state)->FMGL(excs)->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
                          t);
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc838) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__97124 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc838);
                    {
                        throwable__97123 = formal__97124;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__97123)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__97123))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__97123));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__97123)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__97123)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__97123));
                }
                
            }
            
        }
    }
    
    // captured environment
    ::x10::lang::FinishResilientPlace0* saved_this;
    ::x10::lang::Exception* t;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->t);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilientPlace0__closure__5* storage = ::x10aux::alloc_z<x10_lang_FinishResilientPlace0__closure__5>();
        buf.record_reference(storage);
        ::x10::lang::FinishResilientPlace0* that_saved_this = buf.read< ::x10::lang::FinishResilientPlace0*>();
        ::x10::lang::Exception* that_t = buf.read< ::x10::lang::Exception*>();
        x10_lang_FinishResilientPlace0__closure__5* this_ = new (storage) x10_lang_FinishResilientPlace0__closure__5(that_saved_this, that_t);
        return this_;
    }
    
    x10_lang_FinishResilientPlace0__closure__5(::x10::lang::FinishResilientPlace0* saved_this, ::x10::lang::Exception* t) : saved_this(saved_this), t(t) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10:147-150";
    }

};

#endif // X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__5_CLOSURE
#ifndef X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__6_CLOSURE
#define X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__6_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
class x10_lang_FinishResilientPlace0__closure__6 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > >::itable<x10_lang_FinishResilientPlace0__closure__6> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > __apply() {
        {
            ::x10::lang::CheckedThrowable* throwable__97127 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        
                        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ::x10::lang::FinishResilientPlace0__State* state =
                          (__extension__ ({
                            ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* this__96979 =
                              ::x10::lang::FinishResilientPlace0::FMGL(states__get)();
                            
                            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            x10_long idx__96978 = saved_this->FMGL(id);
                            ::x10::lang::FinishResilientPlace0__State* ret__96980;
                            
                            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            ret__96980 = ::x10aux::nullCheck(::x10aux::nullCheck(this__96979)->FMGL(data))->x10::lang::Rail< ::x10::lang::FinishResilientPlace0__State* >::__apply(
                                           idx__96978);
                            ret__96980;
                        }))
                        ;
                        {
                            
                            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > t__97126 =
                              ::x10aux::nullCheck(state)->FMGL(gLatch);
                            {
                                
                                //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                                ::x10::lang::Runtime::exitAtomic();
                            }
                            return t__97126;
                            
                        }
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc840) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__97128 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc840);
                    {
                        throwable__97127 = formal__97128;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__97127)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__97127))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__97127));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__97127)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__97127)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__97127));
                }
                
            }
            
        }
    }
    
    // captured environment
    ::x10::lang::FinishResilientPlace0* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilientPlace0__closure__6* storage = ::x10aux::alloc_z<x10_lang_FinishResilientPlace0__closure__6>();
        buf.record_reference(storage);
        ::x10::lang::FinishResilientPlace0* that_saved_this = buf.read< ::x10::lang::FinishResilientPlace0*>();
        x10_lang_FinishResilientPlace0__closure__6* this_ = new (storage) x10_lang_FinishResilientPlace0__closure__6(that_saved_this);
        return this_;
    }
    
    x10_lang_FinishResilientPlace0__closure__6(::x10::lang::FinishResilientPlace0* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10:159-162";
    }

};

#endif // X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__6_CLOSURE
#ifndef X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__7_CLOSURE
#define X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__7_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
class x10_lang_FinishResilientPlace0__closure__7 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_0< ::x10::lang::MultipleExceptions*>::itable<x10_lang_FinishResilientPlace0__closure__7> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::MultipleExceptions* __apply() {
        {
            ::x10::lang::CheckedThrowable* throwable__97132 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        
                        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ::x10::lang::FinishResilientPlace0__State* state =
                          (__extension__ ({
                            ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* this__96987 =
                              ::x10::lang::FinishResilientPlace0::FMGL(states__get)();
                            
                            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            x10_long idx__96986 = saved_this->FMGL(id);
                            ::x10::lang::FinishResilientPlace0__State* ret__96988;
                            
                            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            ret__96988 = ::x10aux::nullCheck(::x10aux::nullCheck(this__96987)->FMGL(data))->x10::lang::Rail< ::x10::lang::FinishResilientPlace0__State* >::__apply(
                                           idx__96986);
                            ret__96988;
                        }))
                        ;
                        
                        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        if (!(::x10aux::nullCheck(state)->isAdopted()))
                        {
                            
                            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* this__97066 =
                              ::x10::lang::FinishResilientPlace0::FMGL(states__get)();
                            
                            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            x10_long idx__97067 = saved_this->FMGL(id);
                            ::x10::lang::FinishResilientPlace0__State* v__97068 =
                              ::x10aux::class_cast_unchecked< ::x10::lang::FinishResilientPlace0__State*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                            
                            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            if ((::x10aux::struct_equals(idx__97067,
                                                         ::x10aux::nullCheck(this__97066)->FMGL(size))))
                            {
                                
                                //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                ::x10aux::nullCheck(this__97066)->x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>::add(
                                  reinterpret_cast< ::x10::lang::FinishResilientPlace0__State*>(X10_NULL));
                            } else {
                                
                                //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                ::x10aux::nullCheck(::x10aux::nullCheck(this__97066)->FMGL(data))->x10::lang::Rail< ::x10::lang::FinishResilientPlace0__State* >::__set(
                                  idx__97067, reinterpret_cast< ::x10::lang::FinishResilientPlace0__State*>(X10_NULL));
                            }
                            {
                                
                                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                                ::x10::lang::MultipleExceptions* t__97130 =
                                  ::x10::lang::MultipleExceptions::make(
                                    ::x10aux::nullCheck(state)->FMGL(excs));
                                {
                                    
                                    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                                    ::x10::lang::Runtime::exitAtomic();
                                }
                                return t__97130;
                                
                            }
                        } else {
                            {
                                
                                //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                                ::x10::lang::MultipleExceptions* t__97131 =
                                  ::x10aux::class_cast_unchecked< ::x10::lang::MultipleExceptions*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                                {
                                    
                                    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                                    ::x10::lang::Runtime::exitAtomic();
                                }
                                return t__97131;
                                
                            }
                        }
                        
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc841) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__97133 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc841);
                    {
                        throwable__97132 = formal__97133;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__97132)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__97132))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__97132));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__97132)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__97132)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__97132));
                }
                
            }
            
        }
    }
    
    // captured environment
    ::x10::lang::FinishResilientPlace0* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilientPlace0__closure__7* storage = ::x10aux::alloc_z<x10_lang_FinishResilientPlace0__closure__7>();
        buf.record_reference(storage);
        ::x10::lang::FinishResilientPlace0* that_saved_this = buf.read< ::x10::lang::FinishResilientPlace0*>();
        x10_lang_FinishResilientPlace0__closure__7* this_ = new (storage) x10_lang_FinishResilientPlace0__closure__7(that_saved_this);
        return this_;
    }
    
    x10_lang_FinishResilientPlace0__closure__7(::x10::lang::FinishResilientPlace0* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::MultipleExceptions*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::MultipleExceptions*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10:173-182";
    }

};

#endif // X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__7_CLOSURE
#ifndef X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__8_CLOSURE
#define X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__8_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishResilientPlace0__closure__8 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilientPlace0__closure__8> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)2ll))))
        {
            ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124278 = ::x10aux::makeStringLit("calling latch.release for id="); strLit__124278; })), id));
        }
        
        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::util::concurrent::SimpleLatch* >(gLatch))->release();
    }
    
    // captured environment
    x10_long id;
    ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > gLatch;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->id);
        buf.write(this->gLatch);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilientPlace0__closure__8* storage = ::x10aux::alloc_z<x10_lang_FinishResilientPlace0__closure__8>();
        buf.record_reference(storage);
        x10_long that_id = buf.read<x10_long>();
        ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > that_gLatch = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > >();
        x10_lang_FinishResilientPlace0__closure__8* this_ = new (storage) x10_lang_FinishResilientPlace0__closure__8(that_id, that_gLatch);
        return this_;
    }
    
    x10_lang_FinishResilientPlace0__closure__8(x10_long id, ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > gLatch) : id(id), gLatch(gLatch) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10:207-210";
    }

};

#endif // X10_LANG_FINISHRESILIENTPLACE0__CLOSURE__8_CLOSURE

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
x10_long x10::lang::FinishResilientPlace0::FMGL(verbose);
void x10::lang::FinishResilientPlace0::FMGL(verbose__do_init)() {
    FMGL(verbose__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::FinishResilientPlace0.verbose");
    x10_long __var823__ = ::x10::lang::FinishResilient::FMGL(verbose__get)();
    FMGL(verbose) = __var823__;
    FMGL(verbose__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::FinishResilientPlace0::FMGL(verbose__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(verbose__status), &FMGL(verbose__do_init), &FMGL(verbose__exception), "x10::lang::FinishResilientPlace0.verbose");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::FinishResilientPlace0::FMGL(verbose__status);
::x10::lang::CheckedThrowable* x10::lang::FinishResilientPlace0::FMGL(verbose__exception);

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
::x10::lang::Place x10::lang::FinishResilientPlace0::FMGL(place0);
void x10::lang::FinishResilientPlace0::FMGL(place0__do_init)() {
    FMGL(place0__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::FinishResilientPlace0.place0");
    ::x10::lang::Place __var824__ = ::x10::lang::Place::FMGL(FIRST_PLACE__get)();
    FMGL(place0) = __var824__;
    FMGL(place0__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::FinishResilientPlace0::FMGL(place0__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(place0__status), &FMGL(place0__do_init), &FMGL(place0__exception), "x10::lang::FinishResilientPlace0.place0");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::FinishResilientPlace0::FMGL(place0__status);
::x10::lang::CheckedThrowable* x10::lang::FinishResilientPlace0::FMGL(place0__exception);

//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* x10::lang::FinishResilientPlace0::FMGL(states);
void x10::lang::FinishResilientPlace0::FMGL(states__do_init)() {
    FMGL(states__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::FinishResilientPlace0.states");
    ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* __var825__ = (::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here)->FMGL(id),
                                                                                                                  ((x10_long)0ll)))
      ? (::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>::_make())
      : ((::x10aux::class_cast_unchecked< ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))));
    FMGL(states) = __var825__;
    FMGL(states__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::FinishResilientPlace0::FMGL(states__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(states__status), &FMGL(states__do_init), &FMGL(states__exception), "x10::lang::FinishResilientPlace0.states");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::FinishResilientPlace0::FMGL(states__status);
::x10::lang::CheckedThrowable* x10::lang::FinishResilientPlace0::FMGL(states__exception);

//#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
::x10::lang::String* x10::lang::FinishResilientPlace0::toString(
  ) {
    return ::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124217 = ::x10aux::makeStringLit("FinishResilientPlace0(id="); strLit__124217; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124218 = ::x10aux::makeStringLit(")"); strLit__124218; })));
    
}

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
void x10::lang::FinishResilientPlace0::_constructor(x10_long id) {
    (this)->::x10::lang::FinishResilient::_constructor();
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::FinishResilientPlace0* this__97035 = this;
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    this->FMGL(id) = id;
}
::x10::lang::FinishResilientPlace0* x10::lang::FinishResilientPlace0::_make(
  x10_long id) {
    ::x10::lang::FinishResilientPlace0* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishResilientPlace0>()) ::x10::lang::FinishResilientPlace0();
    this_->_constructor(id);
    return this_;
}



//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
::x10::lang::FinishResilient* x10::lang::FinishResilientPlace0::make(
  ::x10::lang::FinishState* parent, ::x10::util::concurrent::SimpleLatch* latch) {
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124219 = ::x10aux::makeStringLit(">>>> make called, parent="); strLit__124219; })), parent), (__extension__ ({ static ::x10::lang::String* strLit__124220 = ::x10aux::makeStringLit(" latch="); strLit__124220; }))), latch));
    }
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    x10_long parentId = ::x10aux::instanceof< ::x10::lang::FinishResilientPlace0*>(parent)
      ? (::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::FinishResilientPlace0*>(parent)))->FMGL(id))
      : (((x10_long)-1ll));
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > gLatch =
      ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* >(latch);
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::Cell<x10_long>* idCell =  (new (::x10aux::alloc_z< ::x10::lang::Cell<x10_long> >()) ::x10::lang::Cell<x10_long>());
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    idCell->FMGL(value) = ((x10_long)-1ll);
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::FinishResilient::lowLevelFetch< x10_long >(
      ::x10::lang::FinishResilientPlace0::FMGL(place0__get)(),
      idCell, reinterpret_cast< ::x10::lang::Fun_0_0<x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0<x10_long> >(sizeof(x10_lang_FinishResilientPlace0__closure__1)))x10_lang_FinishResilientPlace0__closure__1(parentId, gLatch))));
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    x10_long id = idCell->FMGL(value);
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::FinishResilientPlace0* fs =  (new (::x10aux::alloc_z< ::x10::lang::FinishResilientPlace0>()) ::x10::lang::FinishResilientPlace0());
    (fs)->::x10::lang::FinishResilientPlace0::_constructor(
      id);
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124222 = ::x10aux::makeStringLit("<<<< make returning fs="); strLit__124222; })), fs));
    }
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    return fs;
    
}

//#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
void x10::lang::FinishResilientPlace0::notifyPlaceDeath() {
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124223 = ::x10aux::makeStringLit(">>>> notifyPlaceDeath called"); strLit__124223; })));
    }
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if ((!::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here),
                                  ::x10::lang::FinishResilientPlace0::FMGL(place0__get)())))
    {
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)2ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124224 = ::x10aux::makeStringLit("not place0, returning"); strLit__124224; })));
        }
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        return;
    }
    {
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        ::x10::lang::CheckedThrowable* throwable__97111 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                ::x10::lang::Runtime::enterAtomic();
                {
                    
                    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    x10_long i__95534max__97038 = (((__extension__ ({
                        ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* this__97039 =
                          ::x10::lang::FinishResilientPlace0::FMGL(states__get)();
                        ::x10aux::nullCheck(this__97039)->FMGL(size);
                    }))
                    ) - (((x10_long)1ll)));
                    {
                        x10_long i__97040;
                        for (i__97040 = ((x10_long)0ll); ((i__97040) <= (i__95534max__97038));
                             i__97040 = ((i__97040) + (((x10_long)1ll))))
                        {
                            x10_long id__97041 = i__97040;
                            
                            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            if (::x10::lang::FinishResilientPlace0::quiescent(
                                  id__97041)) {
                                ::x10::lang::FinishResilientPlace0::releaseLatch(
                                  id__97041);
                            }
                            
                        }
                    }
                    
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc830) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__97112 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc830);
                {
                    throwable__97111 = formal__97112;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__97111)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__97111))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__97111));
            }
            
        }
        if (true) {
            ::x10::lang::Runtime::exitAtomic();
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__97111)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__97111)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__97111));
            }
            
        }
        
    }
    
    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124225 = ::x10aux::makeStringLit("<<<< notifyPlaceDeath returning"); strLit__124225; })));
    }
    
}

//#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
void x10::lang::FinishResilientPlace0::notifySubActivitySpawn(
  ::x10::lang::Place place) {
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    x10_long srcId = ::x10::lang::Place::_make(::x10aux::here)->FMGL(id);
    x10_long dstId = place->FMGL(id);
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124226 = ::x10aux::makeStringLit(">>>> notifySubActivitySpawn(id="); strLit__124226; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124227 = ::x10aux::makeStringLit(") called, srcId="); strLit__124227; }))), srcId), (__extension__ ({ static ::x10::lang::String* strLit__124228 = ::x10aux::makeStringLit(" dstId="); strLit__124228; }))), dstId));
    }
    
    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::FinishResilient::lowLevelAt(::x10::lang::FinishResilientPlace0::FMGL(place0__get)(),
                                             reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishResilientPlace0__closure__2)))x10_lang_FinishResilientPlace0__closure__2(this, srcId, dstId))));
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124234 = ::x10aux::makeStringLit("<<<< notifySubActivitySpawn(id="); strLit__124234; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124235 = ::x10aux::makeStringLit(") returning"); strLit__124235; }))));
    }
    
}

//#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
x10_boolean x10::lang::FinishResilientPlace0::notifyActivityCreation(
  ::x10::lang::Place srcPlace) {
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    x10_long srcId = srcPlace->FMGL(id);
    x10_long dstId = ::x10::lang::Place::_make(::x10aux::here)->FMGL(id);
    
    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124237 = ::x10aux::makeStringLit(">>>> notifyActivityCreation(id="); strLit__124237; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124238 = ::x10aux::makeStringLit(") called, srcId="); strLit__124238; }))), srcId), (__extension__ ({ static ::x10::lang::String* strLit__124239 = ::x10aux::makeStringLit(" dstId="); strLit__124239; }))), dstId));
    }
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (x10rt_is_place_dead((x10_int)srcPlace->FMGL(id)))
    {
        
        //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)1ll))))
        {
            ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124240 = ::x10aux::makeStringLit("<<<< notifyActivityCreation(id="); strLit__124240; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124241 = ::x10aux::makeStringLit(") returning false"); strLit__124241; }))));
        }
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        return false;
        
    }
    
    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::FinishResilient::lowLevelAt(::x10::lang::FinishResilientPlace0::FMGL(place0__get)(),
                                             reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishResilientPlace0__closure__3)))x10_lang_FinishResilientPlace0__closure__3(this, dstId, srcId))));
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124250 = ::x10aux::makeStringLit("<<<< notifyActivityCreation(id="); strLit__124250; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124251 = ::x10aux::makeStringLit(") returning true"); strLit__124251; }))));
    }
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    return true;
    
}

//#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
void x10::lang::FinishResilientPlace0::notifyActivityTermination(
  ) {
    
    //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    x10_long dstId = ::x10::lang::Place::_make(::x10aux::here)->FMGL(id);
    
    //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124253 = ::x10aux::makeStringLit(">>>> notifyActivityTermination(id="); strLit__124253; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124254 = ::x10aux::makeStringLit(") called, dstId="); strLit__124254; }))), dstId));
    }
    
    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::FinishResilient::lowLevelAt(::x10::lang::FinishResilientPlace0::FMGL(place0__get)(),
                                             reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishResilientPlace0__closure__4)))x10_lang_FinishResilientPlace0__closure__4(this, dstId))));
    
    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124259 = ::x10aux::makeStringLit("<<<< notifyActivityTermination(id="); strLit__124259; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124260 = ::x10aux::makeStringLit(") returning"); strLit__124260; }))));
    }
    
}

//#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
void x10::lang::FinishResilientPlace0::pushException(::x10::lang::Exception* t) {
    
    //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124261 = ::x10aux::makeStringLit(">>>> pushException(id="); strLit__124261; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124262 = ::x10aux::makeStringLit(") called, t="); strLit__124262; }))), t));
    }
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::FinishResilient::lowLevelAt(::x10::lang::FinishResilientPlace0::FMGL(place0__get)(),
                                             reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishResilientPlace0__closure__5)))x10_lang_FinishResilientPlace0__closure__5(this, t))));
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124264 = ::x10aux::makeStringLit("<<<< pushException(id="); strLit__124264; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124265 = ::x10aux::makeStringLit(") returning"); strLit__124265; }))));
    }
    
}

//#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
void x10::lang::FinishResilientPlace0::waitForFinish() {
    
    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124266 = ::x10aux::makeStringLit(">>>> waitForFinish(id="); strLit__124266; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124267 = ::x10aux::makeStringLit(") called"); strLit__124267; }))));
    }
    
    //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    this->notifyActivityTermination();
    
    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::Cell< ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > >* gLatchCell =
       (new (::x10aux::alloc_z< ::x10::lang::Cell< ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > > >()) ::x10::lang::Cell< ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > >());
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > x__97069 =
      ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* >(::x10aux::class_cast_unchecked< ::x10::util::concurrent::SimpleLatch*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    gLatchCell->FMGL(value) = x__97069;
    
    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::FinishResilient::lowLevelFetch< ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > >(
      ::x10::lang::FinishResilientPlace0::FMGL(place0__get)(),
      gLatchCell, reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > >*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > > >(sizeof(x10_lang_FinishResilientPlace0__closure__6)))x10_lang_FinishResilientPlace0__closure__6(this))));
    
    //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > gLatch =
      gLatchCell->FMGL(value);
    
    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert((::x10aux::struct_equals(::x10::lang::Place::place((gLatch)->location),
                                                       ::x10::lang::Place::_make(::x10aux::here))));
    #endif//NO_ASSERTIONS
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)2ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124269 = ::x10aux::makeStringLit("calling latch.await for id="); strLit__124269; })), this->FMGL(id)));
    }
    
    //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::util::concurrent::SimpleLatch* >(gLatch))->await();
    
    //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)2ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124270 = ::x10aux::makeStringLit("returned from latch.await for id="); strLit__124270; })), this->FMGL(id)));
    }
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::Cell< ::x10::lang::MultipleExceptions*>* excCell =
       (new (::x10aux::alloc_z< ::x10::lang::Cell< ::x10::lang::MultipleExceptions*> >()) ::x10::lang::Cell< ::x10::lang::MultipleExceptions*>());
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    ::x10::lang::MultipleExceptions* x__97070 = ::x10aux::class_cast_unchecked< ::x10::lang::MultipleExceptions*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    excCell->FMGL(value) = (reinterpret_cast< ::x10::lang::MultipleExceptions*>(reinterpret_cast< ::x10::lang::MultipleExceptions*>(X10_NULL)));
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::FinishResilient::lowLevelFetch< ::x10::lang::MultipleExceptions* >(
      ::x10::lang::FinishResilientPlace0::FMGL(place0__get)(),
      excCell, reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::MultipleExceptions*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::MultipleExceptions*> >(sizeof(x10_lang_FinishResilientPlace0__closure__7)))x10_lang_FinishResilientPlace0__closure__7(this))));
    
    //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::MultipleExceptions* e = excCell->FMGL(value);
    
    //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124272 = ::x10aux::makeStringLit("<<<< waitForFinish(id="); strLit__124272; })), this->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124273 = ::x10aux::makeStringLit(") returning, exc="); strLit__124273; }))), e));
    }
    
    //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if ((!::x10aux::struct_equals(e, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        ::x10aux::throwException(::x10aux::nullCheck(e));
    }
    
}

//#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
x10_long x10::lang::FinishResilientPlace0::getCurrentAdopterId(
  x10_long id) {
    
    //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert((::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here),
                                                       ::x10::lang::FinishResilientPlace0::FMGL(place0__get)())));
    #endif//NO_ASSERTIONS
    
    //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    x10_long currentId = id;
    
    //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    while (true) {
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        #ifndef NO_ASSERTIONS
        if (::x10aux::x10__assertions_enabled)
            ::x10aux::x10__assert((!::x10aux::struct_equals(currentId,
                                                            ((x10_long)-1ll))));
        #endif//NO_ASSERTIONS
        
        //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        ::x10::lang::FinishResilientPlace0__State* state =
          (__extension__ ({
            ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* this__96996 =
              ::x10::lang::FinishResilientPlace0::FMGL(states__get)();
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10_long idx__96995 = currentId;
            ::x10::lang::FinishResilientPlace0__State* ret__96997;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret__96997 = ::x10aux::nullCheck(::x10aux::nullCheck(this__96996)->FMGL(data))->x10::lang::Rail< ::x10::lang::FinishResilientPlace0__State* >::__apply(
                           idx__96995);
            ret__96997;
        }))
        ;
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (!(::x10aux::nullCheck(state)->isAdopted())) {
            break;
        }
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        currentId = ::x10aux::nullCheck(state)->FMGL(adopterId);
    }
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    return currentId;
    
}

//#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
void x10::lang::FinishResilientPlace0::releaseLatch(x10_long id) {
    
    //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert((::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here),
                                                       ::x10::lang::FinishResilientPlace0::FMGL(place0__get)())));
    #endif//NO_ASSERTIONS
    
    //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)2ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124275 = ::x10aux::makeStringLit("releaseLatch(id="); strLit__124275; })), id), (__extension__ ({ static ::x10::lang::String* strLit__124276 = ::x10aux::makeStringLit(") called"); strLit__124276; }))));
    }
    
    //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::FinishResilientPlace0__State* state = (__extension__ ({
        ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* this__97000 =
          ::x10::lang::FinishResilientPlace0::FMGL(states__get)();
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10_long idx__96999 = id;
        ::x10::lang::FinishResilientPlace0__State* ret__97001;
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ret__97001 = ::x10aux::nullCheck(::x10aux::nullCheck(this__97000)->FMGL(data))->x10::lang::Rail< ::x10::lang::FinishResilientPlace0__State* >::__apply(
                       idx__96999);
        ret__97001;
    }))
    ;
    
    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > gLatch =
      ::x10aux::nullCheck(state)->FMGL(gLatch);
    
    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::FinishResilient::lowLevelSend(::x10::lang::Place::place((gLatch)->location),
                                               reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishResilientPlace0__closure__8)))x10_lang_FinishResilientPlace0__closure__8(id, gLatch))));
    
    //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)2ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124279 = ::x10aux::makeStringLit("releaseLatch(id="); strLit__124279; })), id), (__extension__ ({ static ::x10::lang::String* strLit__124280 = ::x10aux::makeStringLit(") returning"); strLit__124280; }))));
    }
    
}

//#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
x10_boolean x10::lang::FinishResilientPlace0::quiescent(x10_long id) {
    
    //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert((::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here),
                                                       ::x10::lang::FinishResilientPlace0::FMGL(place0__get)())));
    #endif//NO_ASSERTIONS
    
    //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)2ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124281 = ::x10aux::makeStringLit("quiescent(id="); strLit__124281; })), id), (__extension__ ({ static ::x10::lang::String* strLit__124282 = ::x10aux::makeStringLit(") called"); strLit__124282; }))));
    }
    
    //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::FinishResilientPlace0__State* state = (__extension__ ({
        ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* this__97004 =
          ::x10::lang::FinishResilientPlace0::FMGL(states__get)();
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10_long idx__97003 = id;
        ::x10::lang::FinishResilientPlace0__State* ret__97005;
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ret__97005 = ::x10aux::nullCheck(::x10aux::nullCheck(this__97004)->FMGL(data))->x10::lang::Rail< ::x10::lang::FinishResilientPlace0__State* >::__apply(
                       idx__97003);
        ret__97005;
    }))
    ;
    
    //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if ((::x10aux::struct_equals(state, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        return false;
        
    }
    
    //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    x10_long nd = ((x10_long)x10rt_ndead());
    
    //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if ((!::x10aux::struct_equals(nd, ::x10aux::nullCheck(state)->FMGL(numDead))))
    {
        
        //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        ::x10aux::nullCheck(state)->FMGL(numDead) = nd;
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        ::x10::util::GrowableRail<x10_long>* children = ::x10aux::nullCheck(state)->FMGL(children);
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        {
            x10_long chIndex;
            for (chIndex = ((x10_long)0ll); ((chIndex) < (children->FMGL(size)));
                 chIndex = ((chIndex) + (((x10_long)1ll))))
            {
                
                //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                x10_long childId = (__extension__ ({
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    x10_long idx__97007 = chIndex;
                    x10_long ret__97008;
                    
                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    ret__97008 = ::x10aux::nullCheck(children->FMGL(data))->x10::lang::Rail< x10_long >::__apply(
                                   idx__97007);
                    ret__97008;
                }))
                ;
                
                //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                ::x10::lang::FinishResilientPlace0__State* childState =
                  (__extension__ ({
                    ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>* this__97011 =
                      ::x10::lang::FinishResilientPlace0::FMGL(states__get)();
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    x10_long idx__97010 = childId;
                    ::x10::lang::FinishResilientPlace0__State* ret__97012;
                    
                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    ret__97012 = ::x10aux::nullCheck(::x10aux::nullCheck(this__97011)->FMGL(data))->x10::lang::Rail< ::x10::lang::FinishResilientPlace0__State* >::__apply(
                                   idx__97010);
                    ret__97012;
                }))
                ;
                
                //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                if ((::x10aux::struct_equals(childState, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
                {
                    continue;
                }
                
                //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                if (!((__extension__ ({
                        ::x10::lang::Place this__97014 = ::x10::lang::Place::place((::x10aux::nullCheck(childState)->FMGL(gLatch))->location);
                        x10rt_is_place_dead((x10_int)this__97014->FMGL(id));
                    }))
                    )) {
                    continue;
                }
                
                //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                x10_long lastChildId = children->x10::util::GrowableRail<x10_long>::removeLast();
                
                //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                if (((chIndex) < (children->FMGL(size))))
                {
                    
                    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    x10_long idx__97071 = chIndex;
                    x10_long v__97072 = lastChildId;
                    
                    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    if ((::x10aux::struct_equals(idx__97071,
                                                 children->FMGL(size))))
                    {
                        
                        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        children->x10::util::GrowableRail<x10_long>::add(
                          v__97072);
                    } else {
                        
                        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        ::x10aux::nullCheck(children->FMGL(data))->x10::lang::Rail< x10_long >::__set(
                          idx__97071, v__97072);
                    }
                    
                }
                
                //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                chIndex = ((chIndex) - (((x10_long)1ll)));
                
                //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)3ll))))
                {
                    ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124286 = ::x10aux::makeStringLit("adopting childId="); strLit__124286; })), childId));
                }
                
                //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                #ifndef NO_ASSERTIONS
                if (::x10aux::x10__assertions_enabled)
                    ::x10aux::x10__assert(!(::x10aux::nullCheck(childState)->isAdopted()));
                #endif//NO_ASSERTIONS
                
                //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                ::x10aux::nullCheck(childState)->FMGL(adopterId) =
                  id;
                
                //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                ::x10aux::nullCheck(state)->FMGL(children)->x10::util::GrowableRail<x10_long>::addAll(
                  ::x10aux::nullCheck(childState)->FMGL(children));
                
                //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                x10_long i__95570max__97083 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
                {
                    x10_long i__97084;
                    for (i__97084 = ((x10_long)0ll); ((i__97084) <= (i__95570max__97083));
                         i__97084 = ((i__97084) + (((x10_long)1ll))))
                    {
                        x10_long i__97085 = i__97084;
                        
                        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ::x10::lang::Rail< x10_int >* a__97077 =
                          ::x10aux::nullCheck(state)->FMGL(liveAdopted);
                        x10_long i__97078 = i__97085;
                        x10_int r__97079 = ((a__97077->x10::lang::Rail< x10_int >::__apply(
                                               i__97078)) + (((::x10aux::nullCheck(childState)->FMGL(live)->x10::lang::Rail< x10_int >::__apply(
                                                                 i__97085)) + (::x10aux::nullCheck(childState)->FMGL(liveAdopted)->x10::lang::Rail< x10_int >::__apply(
                                                                                 i__97085)))));
                        a__97077->x10::lang::Rail< x10_int >::__set(
                          i__97078, r__97079);
                        
                        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        x10_long i__95552max__97080 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
                        {
                            x10_long i__97081;
                            for (i__97081 = ((x10_long)0ll);
                                 ((i__97081) <= (i__95552max__97080));
                                 i__97081 = ((i__97081) + (((x10_long)1ll))))
                            {
                                x10_long j__97082 = i__97081;
                                
                                //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                                x10_long idx__97076 = ((((i__97085) * (((x10_long)::x10aux::num_hosts)))) + (j__97082));
                                
                                //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                                ::x10::lang::Rail< x10_int >* a__97073 =
                                  ::x10aux::nullCheck(state)->FMGL(transitAdopted);
                                x10_long i__97074 = idx__97076;
                                x10_int r__97075 = ((a__97073->x10::lang::Rail< x10_int >::__apply(
                                                       i__97074)) + (((::x10aux::nullCheck(childState)->FMGL(transit)->x10::lang::Rail< x10_int >::__apply(
                                                                         idx__97076)) + (::x10aux::nullCheck(childState)->FMGL(transitAdopted)->x10::lang::Rail< x10_int >::__apply(
                                                                                           idx__97076)))));
                                a__97073->x10::lang::Rail< x10_int >::__set(
                                  i__97074, r__97075);
                            }
                        }
                        
                    }
                }
                
            }
        }
        
    }
    
    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    x10_long i__95642max__97101 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
    {
        x10_long i__97102;
        for (i__97102 = ((x10_long)0ll); ((i__97102) <= (i__95642max__97101));
             i__97102 = ((i__97102) + (((x10_long)1ll))))
        {
            x10_long i__97103 = i__97102;
            
            //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            if (x10rt_is_place_dead((x10_int)i__97103)) {
                
                //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                x10_long i__95588max__97091 = ((x10_long)(::x10aux::nullCheck(state)->FMGL(live)->x10::lang::Rail< x10_int >::__apply(
                                                            i__97103)));
                {
                    x10_long i__97092;
                    for (i__97092 = ((x10_long)1ll); ((i__97092) <= (i__95588max__97091));
                         i__97092 = ((i__97092) + (((x10_long)1ll))))
                    {
                        x10_long unused__97093 = i__97092;
                        
                        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)3ll))))
                        {
                            ::x10::lang::FinishResilient::debug(
                              ::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124294 = ::x10aux::makeStringLit("adding DPE for live("); strLit__124294; })), i__97103), (__extension__ ({ static ::x10::lang::String* strLit__124295 = ::x10aux::makeStringLit(")"); strLit__124295; }))));
                        }
                        
                        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ::x10::lang::FinishResilientPlace0::addDeadPlaceException(
                          state, i__97103);
                    }
                }
                
                //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                ::x10aux::nullCheck(state)->FMGL(live)->x10::lang::Rail< x10_int >::__set(
                  i__97103, ((x10_int)0));
                ::x10aux::nullCheck(state)->FMGL(liveAdopted)->x10::lang::Rail< x10_int >::__set(
                  i__97103, ((x10_int)0));
                
                //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                x10_long i__95624max__97094 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
                {
                    x10_long i__97095;
                    for (i__97095 = ((x10_long)0ll); ((i__97095) <= (i__95624max__97094));
                         i__97095 = ((i__97095) + (((x10_long)1ll))))
                    {
                        x10_long j__97096 = i__97095;
                        
                        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        x10_long idx__97089 = ((((i__97103) * (((x10_long)::x10aux::num_hosts)))) + (j__97096));
                        
                        //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ::x10aux::nullCheck(state)->FMGL(transit)->x10::lang::Rail< x10_int >::__set(
                          idx__97089, ((x10_int)0));
                        ::x10aux::nullCheck(state)->FMGL(transitAdopted)->x10::lang::Rail< x10_int >::__set(
                          idx__97089, ((x10_int)0));
                        
                        //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        x10_long idx__97090 = ((((j__97096) * (((x10_long)::x10aux::num_hosts)))) + (i__97103));
                        
                        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        x10_long i__95606max__97086 = ((x10_long)(::x10aux::nullCheck(state)->FMGL(transit)->x10::lang::Rail< x10_int >::__apply(
                                                                    idx__97090)));
                        {
                            x10_long i__97087;
                            for (i__97087 = ((x10_long)1ll);
                                 ((i__97087) <= (i__95606max__97086));
                                 i__97087 = ((i__97087) + (((x10_long)1ll))))
                            {
                                x10_long unused__97088 = i__97087;
                                
                                //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                                if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)3ll))))
                                {
                                    ::x10::lang::FinishResilient::debug(
                                      ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124297 = ::x10aux::makeStringLit("adding DPE for transit("); strLit__124297; })), j__97096), (__extension__ ({ static ::x10::lang::String* strLit__124298 = ::x10aux::makeStringLit(","); strLit__124298; }))), i__97103), (__extension__ ({ static ::x10::lang::String* strLit__124299 = ::x10aux::makeStringLit(")"); strLit__124299; }))));
                                }
                                
                                //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                                ::x10::lang::FinishResilientPlace0::addDeadPlaceException(
                                  state, i__97103);
                            }
                        }
                        
                        //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ::x10aux::nullCheck(state)->FMGL(transit)->x10::lang::Rail< x10_int >::__set(
                          idx__97090, ((x10_int)0));
                        ::x10aux::nullCheck(state)->FMGL(transitAdopted)->x10::lang::Rail< x10_int >::__set(
                          idx__97090, ((x10_int)0));
                    }
                }
                
            }
            
        }
    }
    
    //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)3ll))))
    {
        ::x10aux::nullCheck(state)->dump(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124300 = ::x10aux::makeStringLit("DUMP id="); strLit__124300; })), id)));
    }
    
    //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    x10_boolean quiet = true;
    
    //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    x10_long i__95678max__97104 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
    {
        x10_long i__97105;
        for (i__97105 = ((x10_long)0ll); ((i__97105) <= (i__95678max__97104));
             i__97105 = ((i__97105) + (((x10_long)1ll))))
        {
            x10_long i__97106 = i__97105;
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            if (((((x10_long)(::x10aux::nullCheck(state)->FMGL(live)->x10::lang::Rail< x10_int >::__apply(
                                i__97106)))) > (((x10_long)0ll))))
            {
                quiet = false;
                break;
            }
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            if (((((x10_long)(::x10aux::nullCheck(state)->FMGL(liveAdopted)->x10::lang::Rail< x10_int >::__apply(
                                i__97106)))) > (((x10_long)0ll))))
            {
                quiet = false;
                break;
            }
            
            //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10_long i__95660max__97098 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
            {
                x10_long i__97099;
                for (i__97099 = ((x10_long)0ll); ((i__97099) <= (i__95660max__97098));
                     i__97099 = ((i__97099) + (((x10_long)1ll))))
                {
                    x10_long j__97100 = i__97099;
                    
                    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    x10_long idx__97097 = ((((i__97106) * (((x10_long)::x10aux::num_hosts)))) + (j__97100));
                    
                    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (((((x10_long)(::x10aux::nullCheck(state)->FMGL(transit)->x10::lang::Rail< x10_int >::__apply(
                                        idx__97097)))) > (((x10_long)0ll))))
                    {
                        quiet = false;
                        break;
                    }
                    
                    //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (((((x10_long)(::x10aux::nullCheck(state)->FMGL(transitAdopted)->x10::lang::Rail< x10_int >::__apply(
                                        idx__97097)))) > (((x10_long)0ll))))
                    {
                        quiet = false;
                        break;
                    }
                    
                }
            }
            
            //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            if (!(quiet)) {
                break;
            }
            
        }
    }
    
    //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    if (((::x10::lang::FinishResilientPlace0::FMGL(verbose__get)()) >= (((x10_long)2ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124305 = ::x10aux::makeStringLit("quiescent(id="); strLit__124305; })), id), (__extension__ ({ static ::x10::lang::String* strLit__124306 = ::x10aux::makeStringLit(") returning "); strLit__124306; }))), quiet));
    }
    
    //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    return quiet;
    
}

//#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
void x10::lang::FinishResilientPlace0::addDeadPlaceException(
  ::x10::lang::FinishResilientPlace0__State* state, x10_long placeId) {
    
    //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::DeadPlaceException* e = ::x10::lang::DeadPlaceException::_make((__extension__ ({
                                                                                    ::x10::lang::Place alloc__95432 =
                                                                                      
                                                                                    ::x10::lang::Place::_alloc();
                                                                                    (alloc__95432)->::x10::lang::Place::_constructor(
                                                                                      placeId);
                                                                                    alloc__95432;
                                                                                }))
                                                                                );
    
    //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    e->fillInStackTrace();
    
    //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10aux::nullCheck(state)->FMGL(excs)->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
      reinterpret_cast< ::x10::lang::Exception*>(e));
}

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
::x10::lang::FinishResilientPlace0* x10::lang::FinishResilientPlace0::x10__lang__FinishResilientPlace0____this__x10__lang__FinishResilientPlace0(
  ) {
    return this;
    
}
void x10::lang::FinishResilientPlace0::__fieldInitializers_x10_lang_FinishResilientPlace0(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::FinishResilientPlace0::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishResilientPlace0::_deserializer);

void x10::lang::FinishResilientPlace0::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::FinishResilient::_serialize_body(buf);
    buf.write(this->FMGL(id));
    
}

::x10::lang::Reference* ::x10::lang::FinishResilientPlace0::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishResilientPlace0* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishResilientPlace0>()) ::x10::lang::FinishResilientPlace0();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishResilientPlace0::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishResilient::_deserialize_body(buf);
    FMGL(id) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::lang::FinishResilientPlace0::rtt;
void x10::lang::FinishResilientPlace0::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::FinishResilient>()};
    rtt.initStageTwo("x10.lang.FinishResilientPlace0",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_0<x10_long>::itable<x10_lang_FinishResilientPlace0__closure__1>x10_lang_FinishResilientPlace0__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilientPlace0__closure__1::__apply, &x10_lang_FinishResilientPlace0__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishResilientPlace0__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_long> >, &x10_lang_FinishResilientPlace0__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishResilientPlace0__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilientPlace0__closure__1::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilientPlace0__closure__2>x10_lang_FinishResilientPlace0__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilientPlace0__closure__2::__apply, &x10_lang_FinishResilientPlace0__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishResilientPlace0__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishResilientPlace0__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishResilientPlace0__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilientPlace0__closure__2::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilientPlace0__closure__3>x10_lang_FinishResilientPlace0__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilientPlace0__closure__3::__apply, &x10_lang_FinishResilientPlace0__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishResilientPlace0__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishResilientPlace0__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishResilientPlace0__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilientPlace0__closure__3::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilientPlace0__closure__4>x10_lang_FinishResilientPlace0__closure__4::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilientPlace0__closure__4::__apply, &x10_lang_FinishResilientPlace0__closure__4::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishResilientPlace0__closure__4::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishResilientPlace0__closure__4::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishResilientPlace0__closure__4::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilientPlace0__closure__4::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilientPlace0__closure__5>x10_lang_FinishResilientPlace0__closure__5::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilientPlace0__closure__5::__apply, &x10_lang_FinishResilientPlace0__closure__5::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishResilientPlace0__closure__5::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishResilientPlace0__closure__5::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishResilientPlace0__closure__5::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilientPlace0__closure__5::_deserialize);

::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > >::itable<x10_lang_FinishResilientPlace0__closure__6>x10_lang_FinishResilientPlace0__closure__6::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilientPlace0__closure__6::__apply, &x10_lang_FinishResilientPlace0__closure__6::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishResilientPlace0__closure__6::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > > >, &x10_lang_FinishResilientPlace0__closure__6::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishResilientPlace0__closure__6::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilientPlace0__closure__6::_deserialize);

::x10::lang::Fun_0_0< ::x10::lang::MultipleExceptions*>::itable<x10_lang_FinishResilientPlace0__closure__7>x10_lang_FinishResilientPlace0__closure__7::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilientPlace0__closure__7::__apply, &x10_lang_FinishResilientPlace0__closure__7::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishResilientPlace0__closure__7::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::MultipleExceptions*> >, &x10_lang_FinishResilientPlace0__closure__7::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishResilientPlace0__closure__7::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilientPlace0__closure__7::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilientPlace0__closure__8>x10_lang_FinishResilientPlace0__closure__8::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilientPlace0__closure__8::__apply, &x10_lang_FinishResilientPlace0__closure__8::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishResilientPlace0__closure__8::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishResilientPlace0__closure__8::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishResilientPlace0__closure__8::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilientPlace0__closure__8::_deserialize);

/* END of FinishResilientPlace0 */
/*************************************************/
/*************************************************/
/* START of FinishResilientPlace0$State */
#include <x10/lang/FinishResilientPlace0__State.h>

#include <x10/lang/Int.h>
#include <x10/lang/Long.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/Rail.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/Exception.h>
#include <x10/lang/Boolean.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/Any.h>
#include <x10/util/StringBuilder.h>
#include <x10/lang/String.h>
#include <x10/lang/FinishResilient.h>
#include <x10/compiler/Synthetic.h>
#include <x10/lang/Place.h>

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
x10_boolean x10::lang::FinishResilientPlace0__State::isAdopted() {
    return (!::x10aux::struct_equals(this->FMGL(adopterId), ((x10_long)-1ll)));
    
}

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
void x10::lang::FinishResilientPlace0__State::_constructor(x10_long parentId,
                                                           ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > gLatch) {
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    this->x10::lang::FinishResilientPlace0__State::__fieldInitializers_x10_lang_FinishResilientPlace0_State();
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    this->FMGL(parentId) = parentId;
    this->FMGL(gLatch) = gLatch;
}
::x10::lang::FinishResilientPlace0__State* x10::lang::FinishResilientPlace0__State::_make(
  x10_long parentId, ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > gLatch)
{
    ::x10::lang::FinishResilientPlace0__State* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishResilientPlace0__State>()) ::x10::lang::FinishResilientPlace0__State();
    this_->_constructor(parentId, gLatch);
    return this_;
}



//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
void x10::lang::FinishResilientPlace0__State::dump(::x10::lang::Any* msg) {
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::util::StringBuilder* s =  (new (::x10aux::alloc_z< ::x10::util::StringBuilder>()) ::x10::util::StringBuilder());
    (s)->::x10::util::StringBuilder::_constructor();
    reinterpret_cast< ::x10::util::StringBuilder*>(s->add(
                                                     msg));
    s->add(((x10_char)'\n'));
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    s->add((__extension__ ({ static ::x10::lang::String* strLit__124310 = ::x10aux::makeStringLit("           live:"); strLit__124310; })));
    ::x10::lang::Rail< x10_int >* rail__97019 = this->FMGL(live);
    x10_long size__97020 = (x10_long)(::x10aux::nullCheck(rail__97019)->FMGL(size));
    {
        x10_long idx__97021;
        for (idx__97021 = ((x10_long)0ll); ((idx__97021) < (size__97020));
             idx__97021 = ((idx__97021) + (((x10_long)1ll))))
        {
            x10_int v__97022 = rail__97019->x10::lang::Rail< x10_int >::__apply(
                                 idx__97021);
            s->add(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124313 = ::x10aux::makeStringLit(" "); strLit__124313; })), v__97022));
        }
    }
    s->add(((x10_char)'\n'));
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    s->add((__extension__ ({ static ::x10::lang::String* strLit__124316 = ::x10aux::makeStringLit("    liveAdopted:"); strLit__124316; })));
    ::x10::lang::Rail< x10_int >* rail__97023 = this->FMGL(liveAdopted);
    x10_long size__97024 = (x10_long)(::x10aux::nullCheck(rail__97023)->FMGL(size));
    {
        x10_long idx__97025;
        for (idx__97025 = ((x10_long)0ll); ((idx__97025) < (size__97024));
             idx__97025 = ((idx__97025) + (((x10_long)1ll))))
        {
            x10_int v__97026 = rail__97023->x10::lang::Rail< x10_int >::__apply(
                                 idx__97025);
            s->add(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124319 = ::x10aux::makeStringLit(" "); strLit__124319; })), v__97026));
        }
    }
    s->add(((x10_char)'\n'));
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    s->add((__extension__ ({ static ::x10::lang::String* strLit__124322 = ::x10aux::makeStringLit("        transit:"); strLit__124322; })));
    ::x10::lang::Rail< x10_int >* rail__97027 = this->FMGL(transit);
    x10_long size__97028 = (x10_long)(::x10aux::nullCheck(rail__97027)->FMGL(size));
    {
        x10_long idx__97029;
        for (idx__97029 = ((x10_long)0ll); ((idx__97029) < (size__97028));
             idx__97029 = ((idx__97029) + (((x10_long)1ll))))
        {
            x10_int v__97030 = rail__97027->x10::lang::Rail< x10_int >::__apply(
                                 idx__97029);
            s->add(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124325 = ::x10aux::makeStringLit(" "); strLit__124325; })), v__97030));
        }
    }
    s->add(((x10_char)'\n'));
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    s->add((__extension__ ({ static ::x10::lang::String* strLit__124328 = ::x10aux::makeStringLit(" transitAdopted:"); strLit__124328; })));
    ::x10::lang::Rail< x10_int >* rail__97031 = this->FMGL(transitAdopted);
    x10_long size__97032 = (x10_long)(::x10aux::nullCheck(rail__97031)->FMGL(size));
    {
        x10_long idx__97033;
        for (idx__97033 = ((x10_long)0ll); ((idx__97033) < (size__97032));
             idx__97033 = ((idx__97033) + (((x10_long)1ll))))
        {
            x10_int v__97034 = rail__97031->x10::lang::Rail< x10_int >::__apply(
                                 idx__97033);
            s->add(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124331 = ::x10aux::makeStringLit(" "); strLit__124331; })), v__97034));
        }
    }
    s->add(((x10_char)'\n'));
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    s->add(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124334 = ::x10aux::makeStringLit("  children.size: "); strLit__124334; })), (__extension__ ({
               ::x10::util::GrowableRail<x10_long>* this__95695 =
                 this->FMGL(children);
               this__95695->FMGL(size);
           }))
           ));
    s->add(((x10_char)'\n'));
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    s->add(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124337 = ::x10aux::makeStringLit("      adopterId: "); strLit__124337; })), this->FMGL(adopterId)));
    s->add(((x10_char)'\n'));
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    s->add(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124340 = ::x10aux::makeStringLit("       parentId: "); strLit__124340; })), this->FMGL(parentId)));
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    ::x10::lang::FinishResilient::debug(s->toString());
}

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
::x10::lang::FinishResilientPlace0__State* x10::lang::FinishResilientPlace0__State::x10__lang__FinishResilientPlace0__State____this__x10__lang__FinishResilientPlace0__State(
  ) {
    return this;
    
}
void x10::lang::FinishResilientPlace0__State::__fieldInitializers_x10_lang_FinishResilientPlace0_State(
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
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        ::x10::util::GrowableRail< ::x10::lang::Exception*>* alloc__95430 =
           (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Exception*> >()) ::x10::util::GrowableRail< ::x10::lang::Exception*>());
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (alloc__95430)->::x10::util::GrowableRail< ::x10::lang::Exception*>::_constructor(
          ((x10_long)0ll));
        alloc__95430;
    }))
    ;
    this->FMGL(children) = (__extension__ ({
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        ::x10::util::GrowableRail<x10_long>* alloc__95431 =
           (new (::x10aux::alloc_z< ::x10::util::GrowableRail<x10_long> >()) ::x10::util::GrowableRail<x10_long>());
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (alloc__95431)->::x10::util::GrowableRail<x10_long>::_constructor(
          ((x10_long)0ll));
        alloc__95431;
    }))
    ;
    this->FMGL(adopterId) = ((x10_long)-1ll);
    this->FMGL(numDead) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t x10::lang::FinishResilientPlace0__State::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishResilientPlace0__State::_deserializer);

void x10::lang::FinishResilientPlace0__State::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(transit));
    buf.write(this->FMGL(transitAdopted));
    buf.write(this->FMGL(live));
    buf.write(this->FMGL(liveAdopted));
    buf.write(this->FMGL(excs));
    buf.write(this->FMGL(children));
    buf.write(this->FMGL(adopterId));
    buf.write(this->FMGL(numDead));
    buf.write(this->FMGL(parentId));
    buf.write(this->FMGL(gLatch));
    
}

::x10::lang::Reference* ::x10::lang::FinishResilientPlace0__State::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishResilientPlace0__State* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishResilientPlace0__State>()) ::x10::lang::FinishResilientPlace0__State();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishResilientPlace0__State::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(transit) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(transitAdopted) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(live) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(liveAdopted) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(excs) = buf.read< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>();
    FMGL(children) = buf.read< ::x10::util::GrowableRail<x10_long>*>();
    FMGL(adopterId) = buf.read<x10_long>();
    FMGL(numDead) = buf.read<x10_long>();
    FMGL(parentId) = buf.read<x10_long>();
    FMGL(gLatch) = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > >();
}

::x10aux::RuntimeType x10::lang::FinishResilientPlace0__State::rtt;
void x10::lang::FinishResilientPlace0__State::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.FinishResilientPlace0.State",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of FinishResilientPlace0$State */
/*************************************************/
