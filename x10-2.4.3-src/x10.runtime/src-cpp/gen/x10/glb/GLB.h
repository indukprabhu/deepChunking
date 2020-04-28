#ifndef __X10_GLB_GLB_H
#define __X10_GLB_GLB_H

#include <x10rt.h>


#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_PLACELOCALHANDLE_H_NODEPS
#include <x10/lang/PlaceLocalHandle.h>
#undef X10_LANG_PLACELOCALHANDLE_H_NODEPS
#define X10_LANG_PLACELOCALHANDLE_H_NODEPS
#include <x10/lang/PlaceLocalHandle.h>
#undef X10_LANG_PLACELOCALHANDLE_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_GLB_GLBPARAMETERS_H_NODEPS
#include <x10/glb/GLBParameters.h>
#undef X10_GLB_GLBPARAMETERS_H_NODEPS
#define X10_GLB_GLBPARAMETERS_H_NODEPS
#include <x10/glb/GLBParameters.h>
#undef X10_GLB_GLBPARAMETERS_H_NODEPS
namespace x10 { namespace glb { 
template<class TPMGL(Queue), class TPMGL(R)> class TaskQueue;
} } 
namespace x10 { namespace glb { 
template<class TPMGL(Queue), class TPMGL(R)> class Worker;
} } 
namespace x10 { namespace glb { 
template<class TPMGL(R)> class GLBResult;
} } 
namespace x10 { namespace compiler { 
class Inline;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace util { 
class Timer;
} } 
namespace x10 { namespace lang { 
class PlaceGroup;
} } 
namespace x10 { namespace lang { 
class PlaceGroup__SimplePlaceGroup;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace io { 
class Printer;
} } 
namespace x10 { namespace io { 
class Console;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace glb { 
class Logger;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(Z1), class TPMGL(U)> class Fun_0_1;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class GlobalRef;
} } 
namespace x10 { namespace util { 
class Team;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 
class Zero;
} } 
namespace x10 { namespace glb { 

template<class TPMGL(Queue), class TPMGL(R)> class GLB;
template <> class GLB<void, void>;
template<class TPMGL(Queue), class TPMGL(R)> class GLB : public ::x10::lang::X10Class
  {
    public:
    RTT_H_DECLS_CLASS
    
    x10_long FMGL(P);
    
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>
      FMGL(plh);
    
    x10_long FMGL(setupTime);
    
    x10_long FMGL(crunchNumberTime);
    
    x10_long FMGL(collectResultTime);
    
    ::x10::glb::GLBResult<TPMGL(R)>* FMGL(rootGlbR);
    
    ::x10::glb::GLBParameters FMGL(glbParams);
    
    void _constructor(::x10::lang::Fun_0_0<TPMGL(Queue)>* init, ::x10::glb::GLBParameters glbParams,
                      x10_boolean tree);
    
    static ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* _make(
             ::x10::lang::Fun_0_0<TPMGL(Queue)>* init, ::x10::glb::GLBParameters glbParams,
             x10_boolean tree);
    
    virtual TPMGL(Queue) taskQueue();
    virtual ::x10::lang::Rail< TPMGL(R) >* run(::x10::lang::VoidFun_0_0* start);
    virtual ::x10::lang::Rail< TPMGL(R) >* runParallel();
    void end(::x10::lang::Rail< TPMGL(R) >* r);
    void collectLifelineStatus(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st);
    virtual ::x10::lang::Rail< TPMGL(R) >* collectResults(
      );
    void printLog(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st);
    virtual ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* x10__glb__GLB____this__x10__glb__GLB(
      );
    virtual void __fieldInitializers_x10_glb_GLB();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::RuntimeType x10::glb::GLB<TPMGL(Queue), TPMGL(R)>::rtt;
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::GLB<TPMGL(Queue), TPMGL(R)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::glb::GLB<void, void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    const ::x10aux::RuntimeType* params[2] = { ::x10aux::getRTT<TPMGL(Queue)>(), ::x10aux::getRTT<TPMGL(R)>()};
    ::x10aux::RuntimeType::Variance variances[2] = { ::x10aux::RuntimeType::invariant, ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.glb.GLB";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 0, parents, 2, params, variances);
}

template <> class GLB<void, void> : public ::x10::lang::X10Class
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    static x10_long min(x10_long i, x10_long j);
    
    
};

} } 
#endif // X10_GLB_GLB_H

namespace x10 { namespace glb { 
template<class TPMGL(Queue), class TPMGL(R)> class GLB;
} } 

#ifndef X10_GLB_GLB_H_NODEPS
#define X10_GLB_GLB_H_NODEPS
#include <x10/lang/Long.h>
#include <x10/lang/PlaceLocalHandle.h>
#include <x10/glb/GLBParameters.h>
#include <x10/glb/TaskQueue.h>
#include <x10/glb/Worker.h>
#include <x10/glb/GLBResult.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Inline.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/util/Timer.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/lang/PlaceGroup__SimplePlaceGroup.h>
#include <x10/lang/Int.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Rail.h>
#include <x10/io/Printer.h>
#include <x10/io/Console.h>
#include <x10/lang/Any.h>
#include <x10/lang/String.h>
#include <x10/lang/Double.h>
#include <x10/glb/Logger.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Place.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/GlobalRef.h>
#include <x10/util/Team.h>
#include <x10/compiler/Synthetic.h>
#include <x10/lang/Zero.h>
#ifndef X10_GLB_GLB_H_GENERICS
#define X10_GLB_GLB_H_GENERICS
#endif // X10_GLB_GLB_H_GENERICS
#ifndef X10_GLB_GLB_H_IMPLEMENTATION
#define X10_GLB_GLB_H_IMPLEMENTATION
#include <x10/glb/GLB.h>

#ifndef X10_GLB_GLB__CLOSURE__1_CLOSURE
#define X10_GLB_GLB__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_GLB__closure__1 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::template itable <x10_glb_GLB__closure__1<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* __apply() {
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* alloc__86442 =  (new (::x10aux::alloc_z< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)> >()) ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>());
        (alloc__86442)->::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::_constructor(
          init, glbParams->FMGL(n), glbParams->FMGL(w), glbParams->FMGL(l),
          glbParams->FMGL(z), glbParams->FMGL(m), tree);
        return alloc__86442;
        
    }
    
    // captured environment
    ::x10::lang::Fun_0_0<TPMGL(Queue)>* init;
    ::x10::glb::GLBParameters glbParams;
    x10_boolean tree;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->init);
        buf.write(this->glbParams);
        buf.write(this->tree);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_GLB__closure__1<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_GLB__closure__1<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_0<TPMGL(Queue)>* that_init = buf.read< ::x10::lang::Fun_0_0<TPMGL(Queue)>*>();
        ::x10::glb::GLBParameters that_glbParams = buf.read< ::x10::glb::GLBParameters>();
        x10_boolean that_tree = buf.read<x10_boolean>();
        x10_glb_GLB__closure__1<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_GLB__closure__1<TPMGL(Queue),TPMGL(R) >(that_init, that_glbParams, that_tree);
        return this_;
    }
    
    x10_glb_GLB__closure__1(::x10::lang::Fun_0_0<TPMGL(Queue)>* init, ::x10::glb::GLBParameters glbParams, x10_boolean tree) : init(init), glbParams(glbParams), tree(tree) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10:57";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::Fun_0_0< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::template itable <x10_glb_GLB__closure__1<TPMGL(Queue),TPMGL(R) > >x10_glb_GLB__closure__1<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_GLB__closure__1<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_GLB__closure__1<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_GLB__closure__1<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >, &x10_glb_GLB__closure__1<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_GLB__closure__1<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_GLB__closure__1<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_GLB__CLOSURE__1_CLOSURE
#ifndef X10_GLB_GLB__CLOSURE__5_CLOSURE
#define X10_GLB_GLB__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_GLB__closure__5 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::glb::Logger*>::template itable <x10_glb_GLB__closure__5<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::glb::Logger* __apply() {
        try {
            return ::x10aux::nullCheck(::x10aux::nullCheck(st->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(logger))->x10::glb::Logger::get(
                     (!::x10aux::struct_equals(((saved_this->FMGL(glbParams)->FMGL(v)) & (((x10_int)8))),
                                               ((x10_int)0))));
            
        }
        catch (::x10::lang::CheckedThrowable* __exc329) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc329);
                {
                    ::x10::glb::Logger* __lowerer__var__1__ =
                      ::x10::lang::Runtime::template wrapAtChecked< ::x10::glb::Logger* >(
                        __lowerer__var__0__);
                    return __lowerer__var__1__;
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st);
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_GLB__closure__5<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_GLB__closure__5<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* that_saved_this = buf.read< ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>*>();
        x10_glb_GLB__closure__5<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_GLB__closure__5<TPMGL(Queue),TPMGL(R) >(that_st, that_saved_this);
        return this_;
    }
    
    x10_glb_GLB__closure__5(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st, ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* saved_this) : st(st), saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::glb::Logger*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::glb::Logger*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10:133";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::Fun_0_0< ::x10::glb::Logger*>::template itable <x10_glb_GLB__closure__5<TPMGL(Queue),TPMGL(R) > >x10_glb_GLB__closure__5<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_GLB__closure__5<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_GLB__closure__5<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_GLB__closure__5<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::glb::Logger*> >, &x10_glb_GLB__closure__5<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_GLB__closure__5<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_GLB__closure__5<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_GLB__CLOSURE__5_CLOSURE
#ifndef X10_GLB_GLB__CLOSURE__4_CLOSURE
#define X10_GLB_GLB__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_GLB__closure__4 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*>::template itable <x10_glb_GLB__closure__4<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::glb::Logger* __apply(x10_long i) {
        return ::x10::lang::Runtime::template evalAt< ::x10::glb::Logger* >(
                 (__extension__ ({
                     ::x10::lang::Place alloc__80659 =  ::x10::lang::Place::_alloc();
                     (alloc__80659)->::x10::lang::Place::_constructor(((h) + (i)));
                     alloc__80659;
                 }))
                 , reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::glb::Logger*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::glb::Logger*> >(sizeof(x10_glb_GLB__closure__5<TPMGL(Queue),TPMGL(R)>)))x10_glb_GLB__closure__5<TPMGL(Queue),TPMGL(R)>(st, saved_this))),
                 ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
    }
    
    // captured environment
    x10_long h;
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->h);
        buf.write(this->st);
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_GLB__closure__4<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_GLB__closure__4<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        x10_long that_h = buf.read<x10_long>();
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* that_saved_this = buf.read< ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>*>();
        x10_glb_GLB__closure__4<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_GLB__closure__4<TPMGL(Queue),TPMGL(R) >(that_h, that_st, that_saved_this);
        return this_;
    }
    
    x10_glb_GLB__closure__4(x10_long h, ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st, ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* saved_this) : h(h), st(st), saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10:133";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*>::template itable <x10_glb_GLB__closure__4<TPMGL(Queue),TPMGL(R) > >x10_glb_GLB__closure__4<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_GLB__closure__4<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_GLB__closure__4<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_GLB__closure__4<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*> >, &x10_glb_GLB__closure__4<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_GLB__closure__4<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_GLB__closure__4<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_GLB__CLOSURE__4_CLOSURE
#ifndef X10_GLB_GLB__CLOSURE__3_CLOSURE
#define X10_GLB_GLB__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_GLB__closure__3 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::glb::Logger*>::template itable <x10_glb_GLB__closure__3<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::glb::Logger* __apply() {
        try {
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            x10_long h = ((x10_long)::x10aux::here);
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            x10_long n = (__extension__ ({
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                x10_long j__80827 = ((saved_this->FMGL(P)) - (h));
                ((((x10_long)32ll)) < (j__80827)) ? (((x10_long)32ll)) : (j__80827);
            }))
            ;
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            ::x10::lang::Rail< ::x10::glb::Logger* >* logs = ::x10::lang::Rail< ::x10::glb::Logger* >::_make(n,
                                                                                                             reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*> >(sizeof(x10_glb_GLB__closure__4<TPMGL(Queue),TPMGL(R)>)))x10_glb_GLB__closure__4<TPMGL(Queue),TPMGL(R)>(h, st, saved_this))));
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            ::x10::glb::Logger* log =  (new (::x10aux::alloc_z< ::x10::glb::Logger>()) ::x10::glb::Logger());
            (log)->::x10::glb::Logger::_constructor(false);
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            log->x10::glb::Logger::collect(logs);
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            return log;
            
        }
        catch (::x10::lang::CheckedThrowable* __exc330) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc330);
                {
                    ::x10::glb::Logger* __lowerer__var__1__ = ::x10::lang::Runtime::template wrapAtChecked< ::x10::glb::Logger* >(
                                                                __lowerer__var__0__);
                    return __lowerer__var__1__;
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* saved_this;
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->st);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_GLB__closure__3<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_GLB__closure__3<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* that_saved_this = buf.read< ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>*>();
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_GLB__closure__3<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_GLB__closure__3<TPMGL(Queue),TPMGL(R) >(that_saved_this, that_st);
        return this_;
    }
    
    x10_glb_GLB__closure__3(::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* saved_this, ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) : saved_this(saved_this), st(st) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::glb::Logger*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::glb::Logger*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10:130-137";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::Fun_0_0< ::x10::glb::Logger*>::template itable <x10_glb_GLB__closure__3<TPMGL(Queue),TPMGL(R) > >x10_glb_GLB__closure__3<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_GLB__closure__3<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_GLB__closure__3<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_GLB__closure__3<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::glb::Logger*> >, &x10_glb_GLB__closure__3<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_GLB__closure__3<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_GLB__closure__3<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_GLB__CLOSURE__3_CLOSURE
#ifndef X10_GLB_GLB__CLOSURE__2_CLOSURE
#define X10_GLB_GLB__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_GLB__closure__2 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*>::template itable <x10_glb_GLB__closure__2<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::glb::Logger* __apply(x10_long i) {
        return ::x10::lang::Runtime::template evalAt< ::x10::glb::Logger* >(
                 (__extension__ ({
                     ::x10::lang::Place alloc__80658 =  ::x10::lang::Place::_alloc();
                     (alloc__80658)->::x10::lang::Place::_constructor(((i) * (((x10_long)32ll))));
                     alloc__80658;
                 }))
                 , reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::glb::Logger*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::glb::Logger*> >(sizeof(x10_glb_GLB__closure__3<TPMGL(Queue),TPMGL(R)>)))x10_glb_GLB__closure__3<TPMGL(Queue),TPMGL(R)>(saved_this, st))),
                 ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
    }
    
    // captured environment
    ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* saved_this;
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->st);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_GLB__closure__2<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_GLB__closure__2<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* that_saved_this = buf.read< ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>*>();
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_GLB__closure__2<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_GLB__closure__2<TPMGL(Queue),TPMGL(R) >(that_saved_this, that_st);
        return this_;
    }
    
    x10_glb_GLB__closure__2(::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* saved_this, ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) : saved_this(saved_this), st(st) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10:130-137";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*>::template itable <x10_glb_GLB__closure__2<TPMGL(Queue),TPMGL(R) > >x10_glb_GLB__closure__2<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_GLB__closure__2<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_GLB__closure__2<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_GLB__closure__2<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*> >, &x10_glb_GLB__closure__2<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_GLB__closure__2<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_GLB__closure__2<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_GLB__CLOSURE__2_CLOSURE
#ifndef X10_GLB_GLB__CLOSURE__7_CLOSURE
#define X10_GLB_GLB__CLOSURE__7_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_GLB__closure__7 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::glb::Logger*>::template itable <x10_glb_GLB__closure__7<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::glb::Logger* __apply() {
        try {
            return ::x10aux::nullCheck(::x10aux::nullCheck(st->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(logger))->x10::glb::Logger::get(
                     (!::x10aux::struct_equals(((saved_this->FMGL(glbParams)->FMGL(v)) & (((x10_int)8))),
                                               ((x10_int)0))));
            
        }
        catch (::x10::lang::CheckedThrowable* __exc331) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc331);
                {
                    ::x10::glb::Logger* __lowerer__var__1__ =
                      ::x10::lang::Runtime::template wrapAtChecked< ::x10::glb::Logger* >(
                        __lowerer__var__0__);
                    return __lowerer__var__1__;
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st);
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_GLB__closure__7<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_GLB__closure__7<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* that_saved_this = buf.read< ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>*>();
        x10_glb_GLB__closure__7<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_GLB__closure__7<TPMGL(Queue),TPMGL(R) >(that_st, that_saved_this);
        return this_;
    }
    
    x10_glb_GLB__closure__7(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st, ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* saved_this) : st(st), saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::glb::Logger*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::glb::Logger*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10:139";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::Fun_0_0< ::x10::glb::Logger*>::template itable <x10_glb_GLB__closure__7<TPMGL(Queue),TPMGL(R) > >x10_glb_GLB__closure__7<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_GLB__closure__7<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_GLB__closure__7<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_GLB__closure__7<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::glb::Logger*> >, &x10_glb_GLB__closure__7<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_GLB__closure__7<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_GLB__closure__7<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_GLB__CLOSURE__7_CLOSURE
#ifndef X10_GLB_GLB__CLOSURE__6_CLOSURE
#define X10_GLB_GLB__CLOSURE__6_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_GLB__closure__6 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*>::template itable <x10_glb_GLB__closure__6<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::glb::Logger* __apply(x10_long i) {
        return ::x10::lang::Runtime::template evalAt< ::x10::glb::Logger* >(
                 (__extension__ ({
                     ::x10::lang::Place alloc__80660 =  ::x10::lang::Place::_alloc();
                     (alloc__80660)->::x10::lang::Place::_constructor(i);
                     alloc__80660;
                 }))
                 , reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::glb::Logger*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::glb::Logger*> >(sizeof(x10_glb_GLB__closure__7<TPMGL(Queue),TPMGL(R)>)))x10_glb_GLB__closure__7<TPMGL(Queue),TPMGL(R)>(st, saved_this))),
                 ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st);
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_GLB__closure__6<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_GLB__closure__6<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* that_saved_this = buf.read< ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>*>();
        x10_glb_GLB__closure__6<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_GLB__closure__6<TPMGL(Queue),TPMGL(R) >(that_st, that_saved_this);
        return this_;
    }
    
    x10_glb_GLB__closure__6(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st, ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* saved_this) : st(st), saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10:139";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*>::template itable <x10_glb_GLB__closure__6<TPMGL(Queue),TPMGL(R) > >x10_glb_GLB__closure__6<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_GLB__closure__6<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_GLB__closure__6<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_GLB__closure__6<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*> >, &x10_glb_GLB__closure__6<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_GLB__closure__6<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_GLB__closure__6<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_GLB__CLOSURE__6_CLOSURE
#ifndef X10_GLB_GLB__CLOSURE__8_CLOSURE
#define X10_GLB_GLB__CLOSURE__8_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_GLB__closure__8 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_GLB__closure__8<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        if ((::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here),
                                     ::x10::lang::Place::place((resultGlobal)->location))))
        {
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            ::x10::lang::GlobalRef< ::x10::glb::GLBResult<TPMGL(R)>* > tmpresultGlobal =
              resultGlobal;
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            ::x10::util::Team::FMGL(WORLD__get)()->template allreduce< TPMGL(R) >(
              ::x10aux::nullCheck((tmpresultGlobal)->__apply())->submitResult(),
              ((x10_long)0ll), ::x10aux::nullCheck((tmpresultGlobal)->__apply())->submitResult(),
              ((x10_long)0ll), (x10_long)(::x10aux::nullCheck(::x10aux::nullCheck((tmpresultGlobal)->__apply())->submitResult())->FMGL(size)),
              ::x10aux::nullCheck((tmpresultGlobal)->__apply())->getReduceOperator());
        } else {
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            ::x10::glb::GLBResult<TPMGL(R)>* glbR = ::x10::glb::TaskQueue<TPMGL(Queue), TPMGL(R)>::getResult(::x10aux::nullCheck(::x10aux::nullCheck(tmpPlh->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(queue)));
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            ::x10::util::Team::FMGL(WORLD__get)()->template allreduce< TPMGL(R) >(
              ::x10aux::nullCheck(glbR)->submitResult(), ((x10_long)0ll),
              ::x10aux::nullCheck(glbR)->submitResult(), ((x10_long)0ll),
              (x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(glbR)->submitResult())->FMGL(size)),
              ::x10aux::nullCheck(glbR)->getReduceOperator());
        }
        
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::glb::GLBResult<TPMGL(R)>* > resultGlobal;
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> tmpPlh;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->resultGlobal);
        buf.write(this->tmpPlh);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_GLB__closure__8<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_GLB__closure__8<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::glb::GLBResult<TPMGL(R)>* > that_resultGlobal = buf.read< ::x10::lang::GlobalRef< ::x10::glb::GLBResult<TPMGL(R)>* > >();
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_tmpPlh = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_GLB__closure__8<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_GLB__closure__8<TPMGL(Queue),TPMGL(R) >(that_resultGlobal, that_tmpPlh);
        return this_;
    }
    
    x10_glb_GLB__closure__8(::x10::lang::GlobalRef< ::x10::glb::GLBResult<TPMGL(R)>* > resultGlobal, ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> tmpPlh) : resultGlobal(resultGlobal), tmpPlh(tmpPlh) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10:160-179";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_GLB__closure__8<TPMGL(Queue),TPMGL(R) > >x10_glb_GLB__closure__8<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_GLB__closure__8<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_GLB__closure__8<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_GLB__closure__8<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_GLB__closure__8<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_GLB__closure__8<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_GLB__closure__8<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_GLB__CLOSURE__8_CLOSURE
#ifndef X10_GLB_GLB__CLOSURE__9_CLOSURE
#define X10_GLB_GLB__CLOSURE__9_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_GLB__closure__9 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_GLB__closure__9<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            ::x10::glb::TaskQueue<TPMGL(Queue), TPMGL(R)>::printLog(::x10aux::nullCheck(::x10aux::nullCheck(st->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(queue)));
        }
        catch (::x10::lang::CheckedThrowable* __exc334) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc334);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::template wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_GLB__closure__9<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_GLB__closure__9<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_GLB__closure__9<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_GLB__closure__9<TPMGL(Queue),TPMGL(R) >(that_st);
        return this_;
    }
    
    x10_glb_GLB__closure__9(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) : st(st) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10:194-196";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_GLB__closure__9<TPMGL(Queue),TPMGL(R) > >x10_glb_GLB__closure__9<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_GLB__closure__9<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_GLB__closure__9<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_GLB__closure__9<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_GLB__closure__9<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_GLB__closure__9<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_GLB__closure__9<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_GLB__CLOSURE__9_CLOSURE

//#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
/**
	 * Number of places.
	 */

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
/**
	 * Home PlaceLocalHandle of {@link Worker}
	 */

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
/**
	 * Workload initialization time.
	 */

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
/**
	 * Computation time.
	 */

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
/**
	 * Result collection time.
	 */

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
/**
	 * {@link GLBResult at root. Used as a vehicle to collect results.}
	 */

//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"

//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
/**
	 * GLB Parameters. {@link GLBParameters}
	 */

//#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::GLB<TPMGL(Queue), TPMGL(R)>::_constructor(
                                               ::x10::lang::Fun_0_0<TPMGL(Queue)>* init,
                                               ::x10::glb::GLBParameters glbParams,
                                               x10_boolean tree) {
    
    //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    this->x10::glb::template GLB<TPMGL(Queue), TPMGL(R)>::__fieldInitializers_x10_glb_GLB();
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    this->FMGL(glbParams) = glbParams;
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    this->FMGL(setupTime) = ::x10::lang::RuntimeNatives::nanoTime();
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    this->FMGL(plh) = ::x10::lang::PlaceLocalHandle<void>::template makeFlat< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* >(
                        reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)()),
                        reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >(sizeof(x10_glb_GLB__closure__1<TPMGL(Queue),TPMGL(R)>)))x10_glb_GLB__closure__1<TPMGL(Queue),TPMGL(R)>(init, glbParams, tree))));
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    ::x10::glb::Worker<void, void>::template initContexts< TPMGL(Queue),
    TPMGL(R) >(this->FMGL(plh));
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    this->FMGL(setupTime) = ((::x10::lang::RuntimeNatives::nanoTime()) - (this->FMGL(setupTime)));
}
template<class TPMGL(Queue), class TPMGL(R)> ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* x10::glb::GLB<TPMGL(Queue), TPMGL(R)>::_make(
                                               ::x10::lang::Fun_0_0<TPMGL(Queue)>* init,
                                               ::x10::glb::GLBParameters glbParams,
                                               x10_boolean tree)
{
    ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* this_ = new (::x10aux::alloc_z< ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)> >()) ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>();
    this_->_constructor(init, glbParams, tree);
    return this_;
}



//#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
template<class TPMGL(Queue), class TPMGL(R)> TPMGL(Queue)
  x10::glb::GLB<TPMGL(Queue), TPMGL(R)>::taskQueue() {
    return ::x10aux::nullCheck(this->FMGL(plh)->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(queue);
    
}

//#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
template<class TPMGL(Queue), class TPMGL(R)> ::x10::lang::Rail< TPMGL(R) >*
  x10::glb::GLB<TPMGL(Queue), TPMGL(R)>::run(::x10::lang::VoidFun_0_0* start) {
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    this->FMGL(crunchNumberTime) = ::x10::lang::RuntimeNatives::nanoTime();
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    ::x10aux::nullCheck(this->FMGL(plh)->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::main(
      this->FMGL(plh), start);
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    this->FMGL(crunchNumberTime) = ((::x10::lang::RuntimeNatives::nanoTime()) - (this->FMGL(crunchNumberTime)));
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    ::x10::lang::Rail< TPMGL(R) >* r = this->x10::glb::template GLB<TPMGL(Queue), TPMGL(R)>::collectResults();
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    this->x10::glb::template GLB<TPMGL(Queue), TPMGL(R)>::end(
      r);
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    return r;
    
}

//#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
template<class TPMGL(Queue), class TPMGL(R)> ::x10::lang::Rail< TPMGL(R) >*
  x10::glb::GLB<TPMGL(Queue), TPMGL(R)>::runParallel() {
    
    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    this->FMGL(crunchNumberTime) = ::x10::lang::RuntimeNatives::nanoTime();
    
    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    ::x10::glb::Worker<void, void>::template broadcast< TPMGL(Queue),
    TPMGL(R) >(this->FMGL(plh));
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    this->FMGL(crunchNumberTime) = ((::x10::lang::RuntimeNatives::nanoTime()) - (this->FMGL(crunchNumberTime)));
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    ::x10::lang::Rail< TPMGL(R) >* r = this->x10::glb::template GLB<TPMGL(Queue), TPMGL(R)>::collectResults();
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    this->x10::glb::template GLB<TPMGL(Queue), TPMGL(R)>::end(
      r);
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    return r;
    
}

//#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::GLB<TPMGL(Queue), TPMGL(R)>::end(
  ::x10::lang::Rail< TPMGL(R) >* r) {
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    if ((!::x10aux::struct_equals(((this->FMGL(glbParams)->FMGL(v)) & (((x10_int)1))),
                                  ((x10_int)0)))) {
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ::x10aux::nullCheck(this->FMGL(rootGlbR))->display(
          r);
    }
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    if ((!::x10aux::struct_equals(((this->FMGL(glbParams)->FMGL(v)) & (((x10_int)2))),
                                  ((x10_int)0)))) {
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
          reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123565 = ::x10aux::makeStringLit("Setup time(s):"); strLit__123565; })), ((((x10_double) (this->FMGL(setupTime)))) / (1.0E9)))));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
          reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123566 = ::x10aux::makeStringLit("Process time(s):"); strLit__123566; })), ((((x10_double) (this->FMGL(crunchNumberTime)))) / (1.0E9)))));
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
          reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123567 = ::x10aux::makeStringLit("Result reduce time(s):"); strLit__123567; })), ((((x10_double) (this->FMGL(collectResultTime)))) / (1.0E9)))));
    }
    
    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    if ((!::x10aux::struct_equals(((this->FMGL(glbParams)->FMGL(v)) & (((x10_int)4))),
                                  ((x10_int)0)))) {
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        this->x10::glb::template GLB<TPMGL(Queue), TPMGL(R)>::printLog(
          this->FMGL(plh));
    }
    
    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    if ((!::x10aux::struct_equals(((this->FMGL(glbParams)->FMGL(v)) & (((x10_int)8))),
                                  ((x10_int)0)))) {
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        this->x10::glb::template GLB<TPMGL(Queue), TPMGL(R)>::collectLifelineStatus(
          this->FMGL(plh));
    }
    
}

//#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::GLB<TPMGL(Queue), TPMGL(R)>::collectLifelineStatus(
  ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) {
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    ::x10::lang::Rail< ::x10::glb::Logger* >* logs;
    
    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    if (((this->FMGL(P)) >= (((x10_long)1024ll)))) {
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        logs = ::x10::lang::Rail< ::x10::glb::Logger* >::_make(((this->FMGL(P)) / ::x10aux::zeroCheck(((x10_long)32ll))),
                                                               reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*> >(sizeof(x10_glb_GLB__closure__2<TPMGL(Queue),TPMGL(R)>)))x10_glb_GLB__closure__2<TPMGL(Queue),TPMGL(R)>(this, st))));
    } else {
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        logs = ::x10::lang::Rail< ::x10::glb::Logger* >::_make(this->FMGL(P),
                                                               reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, ::x10::glb::Logger*> >(sizeof(x10_glb_GLB__closure__6<TPMGL(Queue),TPMGL(R)>)))x10_glb_GLB__closure__6<TPMGL(Queue),TPMGL(R)>(st, this))));
    }
    
    //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    ::x10::glb::Logger* log =  (new (::x10aux::alloc_z< ::x10::glb::Logger>()) ::x10::glb::Logger());
    (log)->::x10::glb::Logger::_constructor(false);
    
    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    log->x10::glb::Logger::collect(logs);
    
    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    log->x10::glb::Logger::stats();
}

//#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
template<class TPMGL(Queue), class TPMGL(R)> ::x10::lang::Rail< TPMGL(R) >*
  x10::glb::GLB<TPMGL(Queue), TPMGL(R)>::collectResults() {
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    this->FMGL(collectResultTime) = ::x10::lang::RuntimeNatives::nanoTime();
    
    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    this->FMGL(rootGlbR) = ::x10::glb::TaskQueue<TPMGL(Queue), TPMGL(R)>::getResult(::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(plh)->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(queue)));
    
    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    ::x10::lang::GlobalRef< ::x10::glb::GLBResult<TPMGL(R)>* > resultGlobal =
      ::x10::lang::GlobalRef< ::x10::glb::GLBResult<TPMGL(R)>* >(this->FMGL(rootGlbR));
    
    //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    ::x10::lang::Rail< TPMGL(R) >* tmpRail = ::x10aux::nullCheck(this->FMGL(rootGlbR))->submitResult();
    
    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> tmpPlh =
      this->FMGL(plh);
    
    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    ::x10::lang::PlaceGroup::FMGL(WORLD__get)()->broadcastFlat(
      reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_GLB__closure__8<TPMGL(Queue),TPMGL(R)>)))x10_glb_GLB__closure__8<TPMGL(Queue),TPMGL(R)>(resultGlobal, tmpPlh))));
    
    //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    this->FMGL(collectResultTime) = ((::x10::lang::RuntimeNatives::nanoTime()) - (this->FMGL(collectResultTime)));
    
    //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    return tmpRail;
    
}

//#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::GLB<TPMGL(Queue), TPMGL(R)>::printLog(
  ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) {
    
    //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    x10_long P = ((x10_long)::x10aux::num_hosts);
    
    //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    {
        x10_long i;
        for (i = ((x10_long)0ll); ((i) < (P)); i = ((i) + (((x10_long)1ll))))
        {
            {
                
                //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                ::x10::lang::Runtime::runAt((__extension__ ({
                                                ::x10::lang::Place alloc__80661 =
                                                   ::x10::lang::Place::_alloc();
                                                (alloc__80661)->::x10::lang::Place::_constructor(
                                                  i);
                                                alloc__80661;
                                            }))
                                            , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_GLB__closure__9<TPMGL(Queue),TPMGL(R)>)))x10_glb_GLB__closure__9<TPMGL(Queue),TPMGL(R)>(st))),
                                            ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            }
        }
    }
    
}

//#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
template<class TPMGL(Queue), class TPMGL(R)> ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>*
  x10::glb::GLB<TPMGL(Queue), TPMGL(R)>::x10__glb__GLB____this__x10__glb__GLB(
  ) {
    return this;
    
}
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::GLB<TPMGL(Queue), TPMGL(R)>::__fieldInitializers_x10_glb_GLB(
  ) {
    this->FMGL(P) = ((x10_long)::x10aux::num_hosts);
    this->FMGL(setupTime) = ((x10_long)0ll);
    this->FMGL(crunchNumberTime) = ((x10_long)0ll);
    this->FMGL(collectResultTime) = ((x10_long)0ll);
    this->FMGL(rootGlbR) = (::x10aux::class_cast_unchecked< ::x10::glb::GLBResult<TPMGL(R)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(glbParams) = ::x10aux::zeroValue< ::x10::glb::GLBParameters >();
}
template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10::glb::GLB<TPMGL(Queue), TPMGL(R)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>::_deserializer);

template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::GLB<TPMGL(Queue), TPMGL(R)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(P));
    buf.write(this->FMGL(plh));
    buf.write(this->FMGL(setupTime));
    buf.write(this->FMGL(crunchNumberTime));
    buf.write(this->FMGL(collectResultTime));
    buf.write(this->FMGL(rootGlbR));
    buf.write(this->FMGL(glbParams));
    
}

template<class TPMGL(Queue), class TPMGL(R)> ::x10::lang::Reference* ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>* this_ = new (::x10aux::alloc_z< ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)> >()) ::x10::glb::GLB<TPMGL(Queue), TPMGL(R)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::GLB<TPMGL(Queue), TPMGL(R)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(P) = buf.read<x10_long>();
    FMGL(plh) = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
    FMGL(setupTime) = buf.read<x10_long>();
    FMGL(crunchNumberTime) = buf.read<x10_long>();
    FMGL(collectResultTime) = buf.read<x10_long>();
    FMGL(rootGlbR) = buf.read< ::x10::glb::GLBResult<TPMGL(R)>*>();
    FMGL(glbParams) = buf.read< ::x10::glb::GLBParameters>();
}

#endif // X10_GLB_GLB_H_IMPLEMENTATION
#endif // __X10_GLB_GLB_H_NODEPS
