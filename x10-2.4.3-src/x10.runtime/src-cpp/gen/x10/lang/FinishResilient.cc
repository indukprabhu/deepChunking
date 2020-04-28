/*************************************************/
/* START of FinishResilient */
#include <x10/lang/FinishResilient.h>

#ifndef X10_LANG_FINISHRESILIENT__CLOSURE__3_CLOSURE
#define X10_LANG_FINISHRESILIENT__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishResilient__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilient__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > gref =
          cpGref;
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* cell =
          (gref)->__apply();
        cell->x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>::set(
          clockPhases);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > cpGref;
    ::x10::lang::Activity__ClockPhases* clockPhases;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->cpGref);
        buf.write(this->clockPhases);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilient__closure__3* storage = ::x10aux::alloc_z<x10_lang_FinishResilient__closure__3>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > that_cpGref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > >();
        ::x10::lang::Activity__ClockPhases* that_clockPhases = buf.read< ::x10::lang::Activity__ClockPhases*>();
        x10_lang_FinishResilient__closure__3* this_ = new (storage) x10_lang_FinishResilient__closure__3(that_cpGref, that_clockPhases);
        return this_;
    }
    
    x10_lang_FinishResilient__closure__3(::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > cpGref, ::x10::lang::Activity__ClockPhases* clockPhases) : cpGref(cpGref), clockPhases(clockPhases) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10:181-184";
    }

};

#endif // X10_LANG_FINISHRESILIENT__CLOSURE__3_CLOSURE
#ifndef X10_LANG_FINISHRESILIENT__CLOSURE__2_CLOSURE
#define X10_LANG_FINISHRESILIENT__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishResilient__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilient__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10::lang::Activity* remoteActivity = ::x10::lang::Runtime::activity();
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10aux::nullCheck(remoteActivity)->FMGL(clockPhases) = clockPhases;
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (::x10aux::nullCheck(tmp_finish)->notifyActivityCreation(home))
        {
            
            //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            try {
                
                //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                try {
                    
                    //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(body));
                }
                catch (::x10::lang::CheckedThrowable* __exc886) {
                    if (::x10aux::instanceof< ::x10::lang::Runtime__AtCheckedWrapper*>(__exc886)) {
                        ::x10::lang::Runtime__AtCheckedWrapper* e = static_cast< ::x10::lang::Runtime__AtCheckedWrapper*>(__exc886);
                        {
                            
                            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                            ::x10aux::throwException(::x10aux::nullCheck(::x10aux::nullCheck(e)->x10::lang::Runtime__AtCheckedWrapper::getCheckedCause()));
                        }
                    } else
                    throw;
                }
            }
            catch (::x10::lang::CheckedThrowable* __exc887) {
                if (true) {
                    ::x10::lang::CheckedThrowable* t = static_cast< ::x10::lang::CheckedThrowable*>(__exc887);
                    {
                        
                        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                        ::x10::lang::Exception* e = ::x10::lang::Exception::ensureException(
                                                      t);
                        
                        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                        ::x10aux::nullCheck(tmp_finish)->pushException(
                          e);
                    }
                } else
                throw;
            }
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ::x10::lang::VoidFun_0_0* cl1 = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishResilient__closure__3)))x10_lang_FinishResilient__closure__3(cpGref, clockPhases)));
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ::x10::lang::Runtime::x10rtSendMessage(::x10::lang::Place::place((cpGref)->location)->FMGL(id),
                                                   cl1, ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ::x10aux::dealloc(cl1);
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ::x10aux::nullCheck(tmp_finish)->notifyActivityTermination();
        }
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10aux::nullCheck(remoteActivity)->FMGL(clockPhases) =
          (::x10aux::class_cast_unchecked< ::x10::lang::Activity__ClockPhases*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
    
    // captured environment
    ::x10::lang::Activity__ClockPhases* clockPhases;
    ::x10::lang::FinishState* tmp_finish;
    ::x10::lang::Place home;
    ::x10::lang::VoidFun_0_0* body;
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > cpGref;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->clockPhases);
        buf.write(this->tmp_finish);
        buf.write(this->home);
        buf.write(this->body);
        buf.write(this->cpGref);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilient__closure__2* storage = ::x10aux::alloc_z<x10_lang_FinishResilient__closure__2>();
        buf.record_reference(storage);
        ::x10::lang::Activity__ClockPhases* that_clockPhases = buf.read< ::x10::lang::Activity__ClockPhases*>();
        ::x10::lang::FinishState* that_tmp_finish = buf.read< ::x10::lang::FinishState*>();
        ::x10::lang::Place that_home = buf.read< ::x10::lang::Place>();
        ::x10::lang::VoidFun_0_0* that_body = buf.read< ::x10::lang::VoidFun_0_0*>();
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > that_cpGref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > >();
        x10_lang_FinishResilient__closure__2* this_ = new (storage) x10_lang_FinishResilient__closure__2(that_clockPhases, that_tmp_finish, that_home, that_body, that_cpGref);
        return this_;
    }
    
    x10_lang_FinishResilient__closure__2(::x10::lang::Activity__ClockPhases* clockPhases, ::x10::lang::FinishState* tmp_finish, ::x10::lang::Place home, ::x10::lang::VoidFun_0_0* body, ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > cpGref) : clockPhases(clockPhases), tmp_finish(tmp_finish), home(home), body(body), cpGref(cpGref) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10:165-191";
    }

};

#endif // X10_LANG_FINISHRESILIENT__CLOSURE__2_CLOSURE
#ifndef X10_LANG_FINISHRESILIENT__CLOSURE__1_CLOSURE
#define X10_LANG_FINISHRESILIENT__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishResilient__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilient__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10::lang::Runtime::execute((__extension__ ({
                                          ::x10::lang::Activity* alloc__96925 =
                                             (new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity());
                                          (alloc__96925)->::x10::lang::Activity::_constructor(
                                            reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishResilient__closure__2)))x10_lang_FinishResilient__closure__2(clockPhases, tmp_finish, home, body, cpGref))),
                                            home, reinterpret_cast< ::x10::lang::FinishState*>(real_finish),
                                            false, false);
                                          alloc__96925;
                                      }))
                                      );
    }
    
    // captured environment
    ::x10::lang::Activity__ClockPhases* clockPhases;
    ::x10::lang::FinishState* tmp_finish;
    ::x10::lang::Place home;
    ::x10::lang::VoidFun_0_0* body;
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > cpGref;
    ::x10::lang::FinishResilient* real_finish;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->clockPhases);
        buf.write(this->tmp_finish);
        buf.write(this->home);
        buf.write(this->body);
        buf.write(this->cpGref);
        buf.write(this->real_finish);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilient__closure__1* storage = ::x10aux::alloc_z<x10_lang_FinishResilient__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::Activity__ClockPhases* that_clockPhases = buf.read< ::x10::lang::Activity__ClockPhases*>();
        ::x10::lang::FinishState* that_tmp_finish = buf.read< ::x10::lang::FinishState*>();
        ::x10::lang::Place that_home = buf.read< ::x10::lang::Place>();
        ::x10::lang::VoidFun_0_0* that_body = buf.read< ::x10::lang::VoidFun_0_0*>();
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > that_cpGref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > >();
        ::x10::lang::FinishResilient* that_real_finish = buf.read< ::x10::lang::FinishResilient*>();
        x10_lang_FinishResilient__closure__1* this_ = new (storage) x10_lang_FinishResilient__closure__1(that_clockPhases, that_tmp_finish, that_home, that_body, that_cpGref, that_real_finish);
        return this_;
    }
    
    x10_lang_FinishResilient__closure__1(::x10::lang::Activity__ClockPhases* clockPhases, ::x10::lang::FinishState* tmp_finish, ::x10::lang::Place home, ::x10::lang::VoidFun_0_0* body, ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > cpGref, ::x10::lang::FinishResilient* real_finish) : clockPhases(clockPhases), tmp_finish(tmp_finish), home(home), body(body), cpGref(cpGref), real_finish(real_finish) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10:164-194";
    }

};

#endif // X10_LANG_FINISHRESILIENT__CLOSURE__1_CLOSURE
#ifndef X10_LANG_FINISHRESILIENT__CLOSURE__5_CLOSURE
#define X10_LANG_FINISHRESILIENT__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishResilient__closure__5 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilient__closure__5> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10::lang::Cell< ::x10::lang::Any*>* this__101688 = (me2)->__apply();
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            ::x10::lang::Any* x__101689 = r;
            this__101688->FMGL(value) = x__101689;
        }
        catch (::x10::lang::CheckedThrowable* __exc890) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc890);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > me2;
    ::x10::lang::Any* r;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->me2);
        buf.write(this->r);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilient__closure__5* storage = ::x10aux::alloc_z<x10_lang_FinishResilient__closure__5>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > that_me2 = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > >();
        ::x10::lang::Any* that_r = buf.read< ::x10::lang::Any*>();
        x10_lang_FinishResilient__closure__5* this_ = new (storage) x10_lang_FinishResilient__closure__5(that_me2, that_r);
        return this_;
    }
    
    x10_lang_FinishResilient__closure__5(::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > me2, ::x10::lang::Any* r) : me2(me2), r(r) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10:228";
    }

};

#endif // X10_LANG_FINISHRESILIENT__CLOSURE__5_CLOSURE
#ifndef X10_LANG_FINISHRESILIENT__CLOSURE__4_CLOSURE
#define X10_LANG_FINISHRESILIENT__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishResilient__closure__4 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilient__closure__4> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ::x10::lang::Any* r = ::x10::lang::Fun_0_0< ::x10::lang::Any*>::__apply(::x10aux::nullCheck(body));
            {
                
                //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                ::x10::lang::Runtime::runAt(::x10::lang::Place::place(((x10_long)((me2)->location))),
                                            reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishResilient__closure__5)))x10_lang_FinishResilient__closure__5(me2, r))),
                                            ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            }
        }
        catch (::x10::lang::CheckedThrowable* __exc891) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc891);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Fun_0_0< ::x10::lang::Any*>* body;
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > me2;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->body);
        buf.write(this->me2);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilient__closure__4* storage = ::x10aux::alloc_z<x10_lang_FinishResilient__closure__4>();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_0< ::x10::lang::Any*>* that_body = buf.read< ::x10::lang::Fun_0_0< ::x10::lang::Any*>*>();
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > that_me2 = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > >();
        x10_lang_FinishResilient__closure__4* this_ = new (storage) x10_lang_FinishResilient__closure__4(that_body, that_me2);
        return this_;
    }
    
    x10_lang_FinishResilient__closure__4(::x10::lang::Fun_0_0< ::x10::lang::Any*>* body, ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > me2) : body(body), me2(me2) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10:226-229";
    }

};

#endif // X10_LANG_FINISHRESILIENT__CLOSURE__4_CLOSURE
#ifndef X10_LANG_FINISHRESILIENT__CLOSURE__6_CLOSURE
#define X10_LANG_FINISHRESILIENT__CLOSURE__6_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishResilient__closure__6 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilient__closure__6> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124505 = ::x10aux::makeStringLit("----lowLevelSend(remote) calling cl()"); strLit__124505; })));
        }
        
        //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(cl));
        
        //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124506 = ::x10aux::makeStringLit("----lowLevelSend(remote) returned from cl()"); strLit__124506; })));
        }
        
    }
    
    // captured environment
    ::x10::lang::VoidFun_0_0* cl;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->cl);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilient__closure__6* storage = ::x10aux::alloc_z<x10_lang_FinishResilient__closure__6>();
        buf.record_reference(storage);
        ::x10::lang::VoidFun_0_0* that_cl = buf.read< ::x10::lang::VoidFun_0_0*>();
        x10_lang_FinishResilient__closure__6* this_ = new (storage) x10_lang_FinishResilient__closure__6(that_cl);
        return this_;
    }
    
    x10_lang_FinishResilient__closure__6(::x10::lang::VoidFun_0_0* cl) : cl(cl) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10:259-263";
    }

};

#endif // X10_LANG_FINISHRESILIENT__CLOSURE__6_CLOSURE
#ifndef X10_LANG_FINISHRESILIENT__CLOSURE__8_CLOSURE
#define X10_LANG_FINISHRESILIENT__CLOSURE__8_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishResilient__closure__8 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilient__closure__8> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124517 = ::x10aux::makeStringLit("----lowLevelAt(home) setting done-flag"); strLit__124517; })));
        }
        
        //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::util::concurrent::AtomicBoolean* >(done)->x10::util::concurrent::AtomicBoolean::getAndSet(
          true);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->done);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilient__closure__8* storage = ::x10aux::alloc_z<x10_lang_FinishResilient__closure__8>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > that_done = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > >();
        x10_lang_FinishResilient__closure__8* this_ = new (storage) x10_lang_FinishResilient__closure__8(that_done);
        return this_;
    }
    
    x10_lang_FinishResilient__closure__8(::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done) : done(done) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10:288-291";
    }

};

#endif // X10_LANG_FINISHRESILIENT__CLOSURE__8_CLOSURE
#ifndef X10_LANG_FINISHRESILIENT__CLOSURE__9_CLOSURE
#define X10_LANG_FINISHRESILIENT__CLOSURE__9_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishResilient__closure__9 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilient__closure__9> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124519 = ::x10aux::makeStringLit("----lowLevelAt(home) setting exc and done-flag"); strLit__124519; })));
        }
        
        //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::Cell< ::x10::lang::Exception*>* >(exc)->x10::lang::Cell< ::x10::lang::Exception*>::__apply(
          t__101698);
        
        //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::util::concurrent::AtomicBoolean* >(done)->x10::util::concurrent::AtomicBoolean::getAndSet(
          true);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > exc;
    ::x10::lang::Exception* t__101698;
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->exc);
        buf.write(this->t__101698);
        buf.write(this->done);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilient__closure__9* storage = ::x10aux::alloc_z<x10_lang_FinishResilient__closure__9>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > that_exc = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > >();
        ::x10::lang::Exception* that_t__101698 = buf.read< ::x10::lang::Exception*>();
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > that_done = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > >();
        x10_lang_FinishResilient__closure__9* this_ = new (storage) x10_lang_FinishResilient__closure__9(that_exc, that_t__101698, that_done);
        return this_;
    }
    
    x10_lang_FinishResilient__closure__9(::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > exc, ::x10::lang::Exception* t__101698, ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done) : exc(exc), t__101698(t__101698), done(done) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10:294-299";
    }

};

#endif // X10_LANG_FINISHRESILIENT__CLOSURE__9_CLOSURE
#ifndef X10_LANG_FINISHRESILIENT__CLOSURE__7_CLOSURE
#define X10_LANG_FINISHRESILIENT__CLOSURE__7_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishResilient__closure__7 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilient__closure__7> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        try {
            
            //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
            {
                ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124515 = ::x10aux::makeStringLit("----lowLevelAt(remote) calling cl()"); strLit__124515; })));
            }
            
            //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(cl));
            
            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
            {
                ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124516 = ::x10aux::makeStringLit("----lowLevelAt(remote) returned from cl()"); strLit__124516; })));
            }
            
            //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ::x10::lang::Runtime::x10rtSendMessage(::x10::lang::Place::place((done)->location)->FMGL(id),
                                                   reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishResilient__closure__8)))x10_lang_FinishResilient__closure__8(done))),
                                                   ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        }
        catch (::x10::lang::CheckedThrowable* __exc894) {
            if (::x10aux::instanceof< ::x10::lang::Exception*>(__exc894)) {
                ::x10::lang::Exception* t__101698 = static_cast< ::x10::lang::Exception*>(__exc894);
                {
                    
                    //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
                    {
                        ::x10::lang::FinishResilient::debug(
                          ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124518 = ::x10aux::makeStringLit("----lowLevelAt(remote) caught exception="); strLit__124518; })), t__101698));
                    }
                    
                    //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    ::x10::lang::Runtime::x10rtSendMessage(
                      ::x10::lang::Place::place((done)->location)->FMGL(id),
                      reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishResilient__closure__9)))x10_lang_FinishResilient__closure__9(exc, t__101698, done))),
                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                }
            } else
            throw;
        }
        
        //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124520 = ::x10aux::makeStringLit("----lowLevelAt(remote) finished"); strLit__124520; })));
        }
        
    }
    
    // captured environment
    ::x10::lang::VoidFun_0_0* cl;
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done;
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > exc;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->cl);
        buf.write(this->done);
        buf.write(this->exc);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilient__closure__7* storage = ::x10aux::alloc_z<x10_lang_FinishResilient__closure__7>();
        buf.record_reference(storage);
        ::x10::lang::VoidFun_0_0* that_cl = buf.read< ::x10::lang::VoidFun_0_0*>();
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > that_done = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > >();
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > that_exc = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > >();
        x10_lang_FinishResilient__closure__7* this_ = new (storage) x10_lang_FinishResilient__closure__7(that_cl, that_done, that_exc);
        return this_;
    }
    
    x10_lang_FinishResilient__closure__7(::x10::lang::VoidFun_0_0* cl, ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done, ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > exc) : cl(cl), done(done), exc(exc) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10:282-302";
    }

};

#endif // X10_LANG_FINISHRESILIENT__CLOSURE__7_CLOSURE

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
x10_long x10::lang::FinishResilient::FMGL(verbose);
void x10::lang::FinishResilient::FMGL(verbose__do_init)() {
    FMGL(verbose__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::FinishResilient.verbose");
    x10_long __var875__ = ::x10::lang::FinishResilient::getEnvLong((__extension__ ({ static ::x10::lang::String* strLit__124458 = ::x10aux::makeStringLit("X10_RESILIENT_VERBOSE"); strLit__124458; })));
    FMGL(verbose) = __var875__;
    FMGL(verbose__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::FinishResilient::FMGL(verbose__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(verbose__status), &FMGL(verbose__do_init), &FMGL(verbose__exception), "x10::lang::FinishResilient.verbose");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::FinishResilient::FMGL(verbose__status);
::x10::lang::CheckedThrowable* x10::lang::FinishResilient::FMGL(verbose__exception);

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
x10_long x10::lang::FinishResilient::getEnvLong(::x10::lang::String* name) {
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::String* env = (__extension__ ({
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        ::x10::lang::String* name__99249 = name;
        ::x10aux::nullCheck(::x10::lang::Runtime::FMGL(env__get)())->getOrElse(
          name__99249, ::x10aux::class_cast_unchecked< ::x10::lang::String*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }))
    ;
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    x10_long v = (!::x10aux::struct_equals(env, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
      ? (::x10::lang::LongNatives::parseLong(env)) : (((x10_long)0ll));
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if ((((v) > (((x10_long)0ll))) && (::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here)->FMGL(id),
                                                               ((x10_long)0ll)))))
    {
        ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
          reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(name, (__extension__ ({ static ::x10::lang::String* strLit__124461 = ::x10aux::makeStringLit("="); strLit__124461; }))), v)));
    }
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    return v;
    
}

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
void x10::lang::FinishResilient::debug(::x10::lang::String* msg) {
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    x10_long nsec = ::x10::lang::RuntimeNatives::nanoTime();
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::String* output = ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124462 = ::x10aux::makeStringLit("[nsec="); strLit__124462; })), nsec), (__extension__ ({ static ::x10::lang::String* strLit__124463 = ::x10aux::makeStringLit(" place="); strLit__124463; }))), ::x10::lang::Place::_make(::x10aux::here)->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124464 = ::x10aux::makeStringLit(" "); strLit__124464; }))), ::x10::lang::Runtime::activity()), (__extension__ ({ static ::x10::lang::String* strLit__124465 = ::x10aux::makeStringLit("] "); strLit__124465; }))), msg);
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>(output));
    ::x10::io::Console::FMGL(OUT__get)()->flush();
}

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
void x10::lang::FinishResilient::dumpStack(::x10::lang::String* msg) {
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    try {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make(msg)));
    }
    catch (::x10::lang::CheckedThrowable* __exc879) {
        if (::x10aux::instanceof< ::x10::lang::Exception*>(__exc879)) {
            ::x10::lang::Exception* e = static_cast< ::x10::lang::Exception*>(__exc879);
            {
                ::x10aux::nullCheck(e)->printStackTrace();
            }
        } else
        throw;
    }
}

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
::x10::lang::FinishState* x10::lang::FinishResilient::getCurrentFS(
  ) {
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::Activity* a = ::x10::lang::Runtime::activity();
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    return (!::x10aux::struct_equals(a, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
      ? (::x10aux::nullCheck(a)->finishState()) : ((::x10aux::class_cast_unchecked< ::x10::lang::FinishState*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))));
    
}

//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
::x10::lang::FinishState* x10::lang::FinishResilient::make(
  ::x10::lang::FinishState* parent, ::x10::util::concurrent::SimpleLatch* latch) {
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124466 = ::x10aux::makeStringLit("FinishResilient.make called, parent="); strLit__124466; })), parent), (__extension__ ({ static ::x10::lang::String* strLit__124467 = ::x10aux::makeStringLit(" latch="); strLit__124467; }))), latch));
    }
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::FinishState* fs;
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    switch (::x10::lang::Runtime::FMGL(RESILIENT_MODE__get)())
    {
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        case ((x10_int)9): ;
        {
            {
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                ::x10::lang::FinishState* p = (!::x10aux::struct_equals(parent,
                                                                        reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
                  ? (parent) : (::x10::lang::FinishResilient::getCurrentFS());
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                ::x10::util::concurrent::SimpleLatch* l =
                  (!::x10aux::struct_equals(latch, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
                  ? (latch) : (::x10::util::concurrent::SimpleLatch::_make());
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                fs = ::x10::lang::FinishResilientSample::make(
                       p, l);
                
                //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                break;
            }
        }
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        case ((x10_int)11): ;
        {
            {
                
                //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                ::x10::lang::FinishState* p = (!::x10aux::struct_equals(parent,
                                                                        reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
                  ? (parent) : (::x10::lang::FinishResilient::getCurrentFS());
                
                //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                ::x10::util::concurrent::SimpleLatch* l =
                  (!::x10aux::struct_equals(latch, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
                  ? (latch) : (::x10::util::concurrent::SimpleLatch::_make());
                
                //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                fs = ::x10::lang::FinishResilientPlace0::make(
                       p, l);
                
                //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                break;
            }
        }
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        case ((x10_int)1): ;
        {
            
            //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            fs = (__extension__ ({
                ::x10::lang::FinishState__FinishResilientPlaceZero* alloc__96922 =
                   (new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientPlaceZero>()) ::x10::lang::FinishState__FinishResilientPlaceZero());
                (alloc__96922)->::x10::lang::FinishState__FinishResilientPlaceZero::_constructor(
                  latch);
                alloc__96922;
            }))
            ;
            
            //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            break;
        }
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        case ((x10_int)2): ;
        {
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            fs = (__extension__ ({
                ::x10::lang::FinishState__FinishResilientDistributed* alloc__96923 =
                   (new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientDistributed>()) ::x10::lang::FinishState__FinishResilientDistributed());
                (alloc__96923)->::x10::lang::FinishState__FinishResilientDistributed::_constructor(
                  (::x10aux::struct_equals(latch, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
                    ? (::x10::util::concurrent::SimpleLatch::_make())
                    : (latch));
                alloc__96923;
            }))
            ;
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            break;
        }
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        case ((x10_int)3): ;
        {
            
            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            fs = (__extension__ ({
                ::x10::lang::FinishState__FinishResilientZooKeeper* alloc__96924 =
                   (new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientZooKeeper>()) ::x10::lang::FinishState__FinishResilientZooKeeper());
                (alloc__96924)->::x10::lang::FinishState__FinishResilientZooKeeper::_constructor(
                  latch);
                alloc__96924;
            }))
            ;
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            break;
        }
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        default: ;
        {
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124468 = ::x10aux::makeStringLit("Unsupported RESILIENT_MODE "); strLit__124468; })), ::x10::lang::Runtime::FMGL(RESILIENT_MODE__get)()))));
        }
    }
    
    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124469 = ::x10aux::makeStringLit("FinishResilient.make returning, fs="); strLit__124469; })), fs));
    }
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    return fs;
    
}

//#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
void x10::lang::FinishResilient::notifyPlaceDeath() {
    
    //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124470 = ::x10aux::makeStringLit("FinishResilient.notifyPlaceDeath called"); strLit__124470; })));
    }
    
    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    switch (::x10::lang::Runtime::FMGL(RESILIENT_MODE__get)())
    {
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        case ((x10_int)9): ;
        {
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ::x10::lang::FinishResilientSample::notifyPlaceDeath();
            
            //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            break;
        }
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        case ((x10_int)11): ;
        {
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ::x10::lang::FinishResilientPlace0::notifyPlaceDeath();
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            break;
        }
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        case ((x10_int)1): ;
        {
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if ((::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here)->FMGL(id),
                                         ((x10_long)0ll))))
            {
                {
                    
                    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    ::x10::lang::CheckedThrowable* throwable__101717 =
                      ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                    try {
                        {
                            ::x10::lang::Runtime::enterAtomic();
                            {
                             
                            }
                        }
                        ::x10::compiler::Finalization::plausibleThrow();
                    }
                    catch (::x10::lang::CheckedThrowable* __exc883) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* formal__101718 =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc883);
                            {
                                throwable__101717 = formal__101718;
                            }
                        } else
                        throw;
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__101717)))
                    {
                        if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__101717))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__101717));
                        }
                        
                    }
                    if (true) {
                        ::x10::lang::Runtime::exitAtomic();
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__101717)))
                    {
                        if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__101717)))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__101717));
                        }
                        
                    }
                    
                }
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                ::x10::lang::ResilientStorePlaceZero::notifyPlaceDeath(
                  ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::FinishState__FinishResilientPlaceZero*>(::x10::lang::Runtime::FMGL(rootFinish__get)())))->FMGL(id));
            }
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            break;
        }
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        case ((x10_int)2): ;
        {
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ::x10::lang::FinishState__FinishResilientDistributedMaster::notifyAllPlaceDeath();
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            break;
        }
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        case ((x10_int)3): ;
        {
            
            //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            break;
        }
        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        default: ;
        {
            
            //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124471 = ::x10aux::makeStringLit("Unsupported RESILIENT_MODE "); strLit__124471; })), ::x10::lang::Runtime::FMGL(RESILIENT_MODE__get)()))));
        }
    }
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124472 = ::x10aux::makeStringLit("FinishResilient.notifyPlaceDeath returning"); strLit__124472; })));
    }
    
}

//#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
::x10::util::concurrent::SimpleLatch* x10::lang::FinishResilient::simpleLatch(
  ) {
    
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make((__extension__ ({ static ::x10::lang::String* strLit__124473 = ::x10aux::makeStringLit("Obsolete function"); strLit__124473; })))));
}

//#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
void x10::lang::FinishResilient::runAt(::x10::lang::Place place,
                                       ::x10::lang::VoidFun_0_0* body,
                                       ::x10::lang::Runtime__Profile* prof) {
    
    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124474 = ::x10aux::makeStringLit("FinishResilient.runAt called, place.id="); strLit__124474; })), place->FMGL(id)));
    }
    
    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::Runtime::ensureNotInAtomic();
    
    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if ((::x10aux::struct_equals(place->FMGL(id), ((x10_long)::x10aux::here))))
    {
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10::lang::Runtime::runAtNonResilient(place, body,
                                                prof);
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)1ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124475 = ::x10aux::makeStringLit("FinishResilient.runAt returning (locally executed)"); strLit__124475; })));
        }
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        return;
    }
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::FinishResilient* real_finish = this;
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::FinishState* tmp_finish = ::x10::lang::FinishResilient::make(
                                             reinterpret_cast< ::x10::lang::FinishState*>(this),
                                             ::x10aux::class_cast_unchecked< ::x10::util::concurrent::SimpleLatch*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::Place home = ::x10::lang::Place::_make(::x10aux::here);
    
    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10aux::nullCheck(tmp_finish)->notifySubActivitySpawn(
      place);
    
    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::Activity* myActivity = ::x10::lang::Runtime::activity();
    
    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::Activity__ClockPhases* clockPhases = ::x10aux::nullCheck(myActivity)->FMGL(clockPhases);
    
    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* cpCell =
       (new (::x10aux::alloc_z< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*> >()) ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>());
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    ::x10::lang::Activity__ClockPhases* x__101684 = clockPhases;
    cpCell->FMGL(value) = x__101684;
    
    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > cpGref =
      ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* >(cpCell);
    
    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::VoidFun_0_0* cl = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishResilient__closure__1)))x10_lang_FinishResilient__closure__1(clockPhases, tmp_finish, home, body, cpGref, real_finish)));
    
    //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)2ll))))
    {
        ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124476 = ::x10aux::makeStringLit("FinishResilient.runAt sending closure"); strLit__124476; })));
    }
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_long id__101685 = place->FMGL(id);
    ::x10::lang::VoidFun_0_0* msgBody__101686 = cl;
    ::x10::lang::Runtime__Profile* prof__101687 = prof;
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::run_closure_at((x10_int)id__101685, msgBody__101686, prof__101687, ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    try {
        
        //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)2ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124477 = ::x10aux::makeStringLit("FinishResilient.runAt calling tmp_finish.waitForFinish"); strLit__124477; })));
        }
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10aux::nullCheck(tmp_finish)->waitForFinish();
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)2ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124478 = ::x10aux::makeStringLit("FinishResilient.runAt returned from tmp_finish.waitForFinish"); strLit__124478; })));
        }
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10aux::nullCheck(myActivity)->FMGL(clockPhases) =
          cpCell->FMGL(value);
    }
    catch (::x10::lang::CheckedThrowable* __exc888) {
        if (::x10aux::instanceof< ::x10::lang::MultipleExceptions*>(__exc888)) {
            ::x10::lang::MultipleExceptions* e = static_cast< ::x10::lang::MultipleExceptions*>(__exc888);
            {
                
                //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                #ifndef NO_ASSERTIONS
                if (::x10aux::x10__assertions_enabled)
                    ::x10aux::x10__assert((::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(e)->FMGL(exceptions))->FMGL(size)),
                                                                   ((x10_long)1ll))),
                        ::x10aux::nullCheck(e)->x10::lang::MultipleExceptions::exceptions());
                #endif//NO_ASSERTIONS
                
                //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                ::x10::lang::Exception* e2 = ::x10aux::nullCheck(::x10aux::nullCheck(e)->FMGL(exceptions))->x10::lang::Rail< ::x10::lang::Exception* >::__apply(
                                               ((x10_long)0ll));
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)1ll))))
                {
                    ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124480 = ::x10aux::makeStringLit("FinishResilient.runAt received exception="); strLit__124480; })), e2));
                }
                
                //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                if (::x10aux::instanceof< ::x10::lang::WrappedThrowable*>(e2))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(reinterpret_cast< ::x10::lang::CheckedThrowable*>(::x10aux::nullCheck(e2)->x10::lang::Exception::getCause())));
                } else {
                    
                    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    ::x10aux::throwException(::x10aux::nullCheck(e2));
                }
                
            }
        } else
        throw;
    }
    
    //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124481 = ::x10aux::makeStringLit("FinishResilient.runAt returning (remotely executed)"); strLit__124481; })));
    }
    
}

//#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
::x10::lang::Any* x10::lang::FinishResilient::evalAt(::x10::lang::Place place,
                                                     ::x10::lang::Fun_0_0< ::x10::lang::Any*>* body,
                                                     ::x10::lang::Runtime__Profile* prof) {
    
    //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124485 = ::x10aux::makeStringLit("FinishResilient.evalAt called, place.id="); strLit__124485; })), place->FMGL(id)));
    }
    
    //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::Runtime::ensureNotInAtomic();
    
    //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if ((::x10aux::struct_equals(place->FMGL(id), ((x10_long)::x10aux::here))))
    {
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10::lang::Any* result = ::x10::lang::Runtime::evalAtNonResilient(
                                     place, body, prof);
        
        //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)1ll))))
        {
            ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124486 = ::x10aux::makeStringLit("FinishResilient.evalAt returning result="); strLit__124486; })), result), (__extension__ ({ static ::x10::lang::String* strLit__124487 = ::x10aux::makeStringLit(" (locally executed)"); strLit__124487; }))));
        }
        
        //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        return result;
        
    }
    
    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::Empty* dummy_data =  (new (::x10aux::alloc_z< ::x10::lang::Empty>()) ::x10::lang::Empty());
    
    //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::Cell< ::x10::lang::Any*> _StackAllocate_me;
      ;
    ::x10::lang::Cell< ::x10::lang::Any*>* me(&_StackAllocate_me);
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    ::x10::lang::Any* x__101691 = reinterpret_cast< ::x10::lang::Any*>(dummy_data);
    me->FMGL(value) = x__101691;
    
    //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > me2 =
      ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* >(me);
    {
        
        //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10::lang::Runtime::runAt(place, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishResilient__closure__4)))x10_lang_FinishResilient__closure__4(body, me2))),
                                    prof);
    }
    
    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if ((::x10aux::struct_equals(me->FMGL(value), dummy_data)))
    {
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)1ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124491 = ::x10aux::makeStringLit("FinishResilient.evalAt returns no result, target place may be dead"); strLit__124491; })));
        }
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (x10rt_is_place_dead((x10_int)place->FMGL(id)))
        {
            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::DeadPlaceException::_make(place)));
        } else {
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            ::x10::lang::Any* x__101690 = ::x10aux::class_cast_unchecked< ::x10::lang::Any*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            me->FMGL(value) = (reinterpret_cast< ::x10::lang::Any*>(reinterpret_cast< ::x10::lang::Any*>(X10_NULL)));
        }
        
    }
    
    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::Any* result = me->FMGL(value);
    
    //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124492 = ::x10aux::makeStringLit("FinishResilient.evalAt returning result="); strLit__124492; })), result), (__extension__ ({ static ::x10::lang::String* strLit__124493 = ::x10aux::makeStringLit(" (remotely executed)"); strLit__124493; }))));
    }
    
    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    return result;
    
}

//#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
x10_boolean x10::lang::FinishResilient::lowLevelSend(::x10::lang::Place dst,
                                                     ::x10::lang::VoidFun_0_0* cl) {
    
    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124497 = ::x10aux::makeStringLit("----lowLevelSend called, dst.id="); strLit__124497; })), dst->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124498 = ::x10aux::makeStringLit(" ("); strLit__124498; }))), ::x10::lang::Place::_make(::x10aux::here)->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124499 = ::x10aux::makeStringLit("->"); strLit__124499; }))), dst->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124500 = ::x10aux::makeStringLit(")"); strLit__124500; }))));
    }
    
    //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if ((::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here),
                                 dst))) {
        
        //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124501 = ::x10aux::makeStringLit("----lowLevelSend locally calling cl()"); strLit__124501; })));
        }
        
        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(cl));
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124502 = ::x10aux::makeStringLit("----lowLevelSend locally executed, returning true"); strLit__124502; })));
        }
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        return true;
        
    }
    
    //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
    {
        ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124503 = ::x10aux::makeStringLit("----lowLevelSend remote execution"); strLit__124503; })));
    }
    
    //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (x10rt_is_place_dead((x10_int)dst->FMGL(id))) {
        
        //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124504 = ::x10aux::makeStringLit("----lowLevelSend returning false"); strLit__124504; })));
        }
        
        //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        return false;
        
    }
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_long id__101692 = dst->FMGL(id);
    ::x10::lang::VoidFun_0_0* msgBody__101693 = reinterpret_cast< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishResilient__closure__6)))x10_lang_FinishResilient__closure__6(cl))));
    ::x10::lang::Runtime__Profile* prof__101694 = ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::run_closure_at((x10_int)id__101692, msgBody__101693, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
    {
        ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124507 = ::x10aux::makeStringLit("----lowLevelSend returning true"); strLit__124507; })));
    }
    
    //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    return true;
    
}

//#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
x10_boolean x10::lang::FinishResilient::lowLevelAt(::x10::lang::Place dst,
                                                   ::x10::lang::VoidFun_0_0* cl) {
    
    //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124508 = ::x10aux::makeStringLit("----lowLevelAt called, dst.id="); strLit__124508; })), dst->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124509 = ::x10aux::makeStringLit(" ("); strLit__124509; }))), ::x10::lang::Place::_make(::x10aux::here)->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124510 = ::x10aux::makeStringLit("->"); strLit__124510; }))), dst->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124511 = ::x10aux::makeStringLit(")"); strLit__124511; }))));
    }
    
    //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if ((::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here),
                                 dst))) {
        
        //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124512 = ::x10aux::makeStringLit("----lowLevelAt locally calling cl()"); strLit__124512; })));
        }
        
        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(cl));
        
        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124513 = ::x10aux::makeStringLit("----lowLevelAt locally executed, returning true"); strLit__124513; })));
        }
        
        //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        return true;
        
    }
    
    //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > exc =
      ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* >((__extension__ ({
        ::x10::lang::Cell< ::x10::lang::Exception*>* alloc__96926 =
           (new (::x10aux::alloc_z< ::x10::lang::Cell< ::x10::lang::Exception*> >()) ::x10::lang::Cell< ::x10::lang::Exception*>());
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ::x10::lang::Exception* x__101695 = ::x10aux::class_cast_unchecked< ::x10::lang::Exception*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        alloc__96926->FMGL(value) = (reinterpret_cast< ::x10::lang::Exception*>(reinterpret_cast< ::x10::lang::Exception*>(X10_NULL)));
        alloc__96926;
    }))
    );
    
    //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done =
      ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* >(::x10::util::concurrent::AtomicBoolean::_make());
    
    //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
    {
        ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124514 = ::x10aux::makeStringLit("----lowLevelAt remote execution"); strLit__124514; })));
    }
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_long id__101696 = dst->FMGL(id);
    ::x10::lang::VoidFun_0_0* msgBody__101697 = reinterpret_cast< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishResilient__closure__7)))x10_lang_FinishResilient__closure__7(cl, done, exc))));
    ::x10::lang::Runtime__Profile* prof__101699 = ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::run_closure_at((x10_int)id__101696, msgBody__101697, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
    {
        ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124521 = ::x10aux::makeStringLit("----lowLevelAt waiting for done-flag"); strLit__124521; })));
    }
    
    //#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (!((done)->__apply()->x10::util::concurrent::AtomicBoolean::get()))
    {
        
        //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
        {
            
            //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10::lang::Runtime::FMGL(pool__get)()->increase();
        }
        
        //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        do {
            
            //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)9ll))))
            {
                ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124522 = ::x10aux::makeStringLit("----lowLevelAt calling x10rtProbe"); strLit__124522; })));
            }
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ::x10aux::event_probe();
            
            //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)9ll))))
            {
                ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124523 = ::x10aux::makeStringLit("----lowLevelAt returned from x10rtProbe"); strLit__124523; })));
            }
            
            //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (x10rt_is_place_dead((x10_int)dst->FMGL(id)))
            {
                
                //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
                {
                    
                    //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
                      ((x10_int)1));
                }
                
                //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
                {
                    ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124524 = ::x10aux::makeStringLit("----lowLevelAt returning false"); strLit__124524; })));
                }
                
                //#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                return false;
                
            }
            
        } while (!((done)->__apply()->x10::util::concurrent::AtomicBoolean::get()));
        
        //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
        {
            
            //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
              ((x10_int)1));
        }
        
    }
    
    //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
    {
        ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124525 = ::x10aux::makeStringLit("----lowLevelAt returned from waiting loop"); strLit__124525; })));
    }
    
    //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::Exception* t = (__extension__ ({
        ::x10::lang::Cell< ::x10::lang::Exception*>* this__101655 =
          (exc)->__apply();
        this__101655->FMGL(value);
    }))
    ;
    
    //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if ((!::x10aux::struct_equals(t, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
        {
            ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124526 = ::x10aux::makeStringLit("----lowLevelAt throwing exception "); strLit__124526; })), t));
        }
        
        //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10aux::throwException(::x10aux::nullCheck(t));
    }
    
    //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
    {
        ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124527 = ::x10aux::makeStringLit("----lowLevelAt returning true"); strLit__124527; })));
    }
    
    //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    return true;
    
}

//#line 332 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
::x10::lang::FinishResilient* x10::lang::FinishResilient::x10__lang__FinishResilient____this__x10__lang__FinishResilient(
  ) {
    return this;
    
}
void x10::lang::FinishResilient::_constructor() {
    ::x10::lang::FinishState* this__101708 = this;
    ::x10::lang::FinishResilient* this__101707 = this;
    
}

void x10::lang::FinishResilient::__fieldInitializers_x10_lang_FinishResilient(
  ) {
 
}
void x10::lang::FinishResilient::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::FinishState::_serialize_body(buf);
    
}

void x10::lang::FinishResilient::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::FinishResilient::rtt;
void x10::lang::FinishResilient::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::FinishState>()};
    rtt.initStageTwo("x10.lang.FinishResilient",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilient__closure__3>x10_lang_FinishResilient__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilient__closure__3::__apply, &x10_lang_FinishResilient__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishResilient__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishResilient__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilient__closure__3::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__3::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishResilient__closure__3::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilient__closure__2>x10_lang_FinishResilient__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilient__closure__2::__apply, &x10_lang_FinishResilient__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishResilient__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishResilient__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilient__closure__2::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilient__closure__1>x10_lang_FinishResilient__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilient__closure__1::__apply, &x10_lang_FinishResilient__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishResilient__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishResilient__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilient__closure__1::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__1::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishResilient__closure__1::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilient__closure__5>x10_lang_FinishResilient__closure__5::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilient__closure__5::__apply, &x10_lang_FinishResilient__closure__5::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishResilient__closure__5::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishResilient__closure__5::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__5::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilient__closure__5::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilient__closure__4>x10_lang_FinishResilient__closure__4::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilient__closure__4::__apply, &x10_lang_FinishResilient__closure__4::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishResilient__closure__4::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishResilient__closure__4::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__4::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilient__closure__4::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilient__closure__6>x10_lang_FinishResilient__closure__6::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilient__closure__6::__apply, &x10_lang_FinishResilient__closure__6::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishResilient__closure__6::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishResilient__closure__6::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__6::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilient__closure__6::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__6::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishResilient__closure__6::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilient__closure__8>x10_lang_FinishResilient__closure__8::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilient__closure__8::__apply, &x10_lang_FinishResilient__closure__8::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishResilient__closure__8::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishResilient__closure__8::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__8::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilient__closure__8::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__8::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishResilient__closure__8::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilient__closure__9>x10_lang_FinishResilient__closure__9::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilient__closure__9::__apply, &x10_lang_FinishResilient__closure__9::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishResilient__closure__9::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishResilient__closure__9::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__9::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilient__closure__9::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__9::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishResilient__closure__9::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishResilient__closure__7>x10_lang_FinishResilient__closure__7::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilient__closure__7::__apply, &x10_lang_FinishResilient__closure__7::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishResilient__closure__7::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishResilient__closure__7::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__7::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilient__closure__7::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__7::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishResilient__closure__7::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

/* END of FinishResilient */
/*************************************************/
