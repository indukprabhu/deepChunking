#ifndef __X10_UTIL_WORKERLOCALSTORAGE_H
#define __X10_UTIL_WORKERLOCALSTORAGE_H

#include <x10rt.h>


#define X10_LANG_PLACELOCALHANDLE_H_NODEPS
#include <x10/lang/PlaceLocalHandle.h>
#undef X10_LANG_PLACELOCALHANDLE_H_NODEPS
#define X10_LANG_PLACELOCALHANDLE_H_NODEPS
#include <x10/lang/PlaceLocalHandle.h>
#undef X10_LANG_PLACELOCALHANDLE_H_NODEPS
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace util { 
template<class TPMGL(K), class TPMGL(V)> class HashMap;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class Box;
} } 
namespace x10 { namespace lang { 
class Runtime__Worker;
} } 
namespace x10 { namespace lang { 
class Thread;
} } 
namespace x10 { namespace util { 
class NoSuchElementException;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 
class PlaceGroup;
} } 
namespace x10 { namespace lang { 
class PlaceGroup__SimplePlaceGroup;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace util { 

template<class TPMGL(Key), class TPMGL(Value)> class WorkerLocalStorage;
template <> class WorkerLocalStorage<void, void>;
template<class TPMGL(Key), class TPMGL(Value)> class WorkerLocalStorage : public ::x10::lang::X10Class
  {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::lang::PlaceLocalHandle< ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >*>
      FMGL(store);
    
    virtual ::x10::util::Box<TPMGL(Value)>* get(TPMGL(Key) key);
    virtual TPMGL(Value) getOrElse(TPMGL(Key) key, TPMGL(Value) value);
    virtual TPMGL(Value) getOrThrow(TPMGL(Key) key);
    virtual ::x10::util::Box<TPMGL(Value)>* put(TPMGL(Key) key,
                                                TPMGL(Value) value);
    virtual ::x10::util::Box<TPMGL(Value)>* remove(TPMGL(Key) key);
    virtual ::x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>*
      x10__util__WorkerLocalStorage____this__x10__util__WorkerLocalStorage(
      );
    void _constructor();
    
    static ::x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>* _make(
             );
    
    virtual void __fieldInitializers_x10_util_WorkerLocalStorage(
      );
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(Key), class TPMGL(Value)> ::x10aux::RuntimeType x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>::rtt;
template<class TPMGL(Key), class TPMGL(Value)> void x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::util::WorkerLocalStorage<void, void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    const ::x10aux::RuntimeType* params[2] = { ::x10aux::getRTT<TPMGL(Key)>(), ::x10aux::getRTT<TPMGL(Value)>()};
    ::x10aux::RuntimeType::Variance variances[2] = { ::x10aux::RuntimeType::invariant, ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.util.WorkerLocalStorage";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 0, parents, 2, params, variances);
}

template <> class WorkerLocalStorage<void, void> : public ::x10::lang::X10Class
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    
};

} } 
#endif // X10_UTIL_WORKERLOCALSTORAGE_H

namespace x10 { namespace util { 
template<class TPMGL(Key), class TPMGL(Value)> class WorkerLocalStorage;
} } 

#ifndef X10_UTIL_WORKERLOCALSTORAGE_H_NODEPS
#define X10_UTIL_WORKERLOCALSTORAGE_H_NODEPS
#include <x10/lang/PlaceLocalHandle.h>
#include <x10/lang/Rail.h>
#include <x10/util/HashMap.h>
#include <x10/util/Box.h>
#include <x10/lang/Int.h>
#include <x10/lang/Runtime__Worker.h>
#include <x10/lang/Thread.h>
#include <x10/lang/Long.h>
#include <x10/util/NoSuchElementException.h>
#include <x10/compiler/Synthetic.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/lang/PlaceGroup__SimplePlaceGroup.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/Runtime.h>
#ifndef X10_UTIL_WORKERLOCALSTORAGE_H_GENERICS
#define X10_UTIL_WORKERLOCALSTORAGE_H_GENERICS
#endif // X10_UTIL_WORKERLOCALSTORAGE_H_GENERICS
#ifndef X10_UTIL_WORKERLOCALSTORAGE_H_IMPLEMENTATION
#define X10_UTIL_WORKERLOCALSTORAGE_H_IMPLEMENTATION
#include <x10/util/WorkerLocalStorage.h>

#ifndef X10_UTIL_WORKERLOCALSTORAGE__CLOSURE__1_CLOSURE
#define X10_UTIL_WORKERLOCALSTORAGE__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(Key), class TPMGL(Value)> class x10_util_WorkerLocalStorage__closure__1 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >*>::template itable <x10_util_WorkerLocalStorage__closure__1<TPMGL(Key),TPMGL(Value) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >* __apply() {
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        return ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >::_make(((x10_long)(::x10::lang::Runtime::FMGL(MAX_THREADS__get)())));
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_WorkerLocalStorage__closure__1<TPMGL(Key),TPMGL(Value) >* storage = ::x10aux::alloc_z<x10_util_WorkerLocalStorage__closure__1<TPMGL(Key),TPMGL(Value) > >();
        buf.record_reference(storage);
        x10_util_WorkerLocalStorage__closure__1<TPMGL(Key),TPMGL(Value) >* this_ = new (storage) x10_util_WorkerLocalStorage__closure__1<TPMGL(Key),TPMGL(Value) >();
        return this_;
    }
    
    x10_util_WorkerLocalStorage__closure__1() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10:37";
    }

};

template<class TPMGL(Key), class TPMGL(Value)> typename ::x10::lang::Fun_0_0< ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >*>::template itable <x10_util_WorkerLocalStorage__closure__1<TPMGL(Key),TPMGL(Value) > >x10_util_WorkerLocalStorage__closure__1<TPMGL(Key),TPMGL(Value) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_WorkerLocalStorage__closure__1<TPMGL(Key),TPMGL(Value) >::__apply, &x10_util_WorkerLocalStorage__closure__1<TPMGL(Key),TPMGL(Value) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Key), class TPMGL(Value)> ::x10aux::itable_entry x10_util_WorkerLocalStorage__closure__1<TPMGL(Key),TPMGL(Value) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >*> >, &x10_util_WorkerLocalStorage__closure__1<TPMGL(Key),TPMGL(Value) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Key), class TPMGL(Value)> const ::x10aux::serialization_id_t x10_util_WorkerLocalStorage__closure__1<TPMGL(Key),TPMGL(Value) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_WorkerLocalStorage__closure__1<TPMGL(Key),TPMGL(Value) >::_deserialize);

#endif // X10_UTIL_WORKERLOCALSTORAGE__CLOSURE__1_CLOSURE

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
template<class TPMGL(Key), class TPMGL(Value)> ::x10::util::Box<TPMGL(Value)>*
  x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>::get(TPMGL(Key) key) {
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    x10_int id = ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->FMGL(workerId);
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >* localStore =
      this->FMGL(store)->x10::lang::template PlaceLocalHandle< ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >*>::__apply();
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                 ::x10aux::nullCheck(localStore)->x10::lang::template Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >::__apply(
                                   ((x10_long)(id)))))) {
        return ::x10aux::class_cast_unchecked< ::x10::util::Box<TPMGL(Value)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
    }
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    return ::x10aux::nullCheck(::x10aux::nullCheck(localStore)->x10::lang::template Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >::__apply(
                                 ((x10_long)(id))))->get(
             key);
    
}

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
template<class TPMGL(Key), class TPMGL(Value)> TPMGL(Value)
  x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>::getOrElse(
  TPMGL(Key) key, TPMGL(Value) value) {
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    x10_int id = ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->FMGL(workerId);
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >* localStore =
      this->FMGL(store)->x10::lang::template PlaceLocalHandle< ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >*>::__apply();
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                 ::x10aux::nullCheck(localStore)->x10::lang::template Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >::__apply(
                                   ((x10_long)(id)))))) {
        return value;
        
    }
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    return ::x10aux::nullCheck(::x10aux::nullCheck(localStore)->x10::lang::template Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >::__apply(
                                 ((x10_long)(id))))->getOrElse(
             key, value);
    
}

//#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
template<class TPMGL(Key), class TPMGL(Value)> TPMGL(Value)
  x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>::getOrThrow(
  TPMGL(Key) key) {
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    x10_int id = ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->FMGL(workerId);
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >* localStore =
      this->FMGL(store)->x10::lang::template PlaceLocalHandle< ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >*>::__apply();
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                 ::x10aux::nullCheck(localStore)->x10::lang::template Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >::__apply(
                                   ((x10_long)(id)))))) {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::util::NoSuchElementException::_make((__extension__ ({ static ::x10::lang::String* strLit__130736 = ::x10aux::makeStringLit("Not found"); strLit__130736; })))));
    }
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    return ::x10aux::nullCheck(::x10aux::nullCheck(localStore)->x10::lang::template Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >::__apply(
                                 ((x10_long)(id))))->getOrThrow(
             key);
    
}

//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
template<class TPMGL(Key), class TPMGL(Value)> ::x10::util::Box<TPMGL(Value)>*
  x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>::put(
  TPMGL(Key) key, TPMGL(Value) value) {
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    x10_int id = ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->FMGL(workerId);
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >* localStore =
      this->FMGL(store)->x10::lang::template PlaceLocalHandle< ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >*>::__apply();
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                 ::x10aux::nullCheck(localStore)->x10::lang::template Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >::__apply(
                                   ((x10_long)(id)))))) {
        ::x10aux::nullCheck(localStore)->x10::lang::template Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >::__set(
          ((x10_long)(id)), (__extension__ ({
              ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* alloc__123103 =
                 (new (::x10aux::alloc_z< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)> >()) ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>());
              (alloc__123103)->::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>::_constructor();
              alloc__123103;
          }))
          );
    }
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    return ::x10aux::nullCheck(::x10aux::nullCheck(localStore)->x10::lang::template Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >::__apply(
                                 ((x10_long)(id))))->put(
             key, value);
    
}

//#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
template<class TPMGL(Key), class TPMGL(Value)> ::x10::util::Box<TPMGL(Value)>*
  x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>::remove(
  TPMGL(Key) key) {
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    x10_int id = ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->FMGL(workerId);
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >* localStore =
      this->FMGL(store)->x10::lang::template PlaceLocalHandle< ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >*>::__apply();
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                 ::x10aux::nullCheck(localStore)->x10::lang::template Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >::__apply(
                                   ((x10_long)(id)))))) {
        return ::x10aux::class_cast_unchecked< ::x10::util::Box<TPMGL(Value)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
    }
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    return ::x10aux::nullCheck(::x10aux::nullCheck(localStore)->x10::lang::template Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >::__apply(
                                 ((x10_long)(id))))->remove(
             key);
    
}

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
template<class TPMGL(Key), class TPMGL(Value)> ::x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>*
  x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>::x10__util__WorkerLocalStorage____this__x10__util__WorkerLocalStorage(
  ) {
    return this;
    
}
template<class TPMGL(Key), class TPMGL(Value)> void x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>::_constructor(
                                                 ) {
    this->x10::util::template WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>::__fieldInitializers_x10_util_WorkerLocalStorage();
}
template<class TPMGL(Key), class TPMGL(Value)> ::x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>* x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>::_make(
                                                 ) {
    ::x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>* this_ = new (::x10aux::alloc_z< ::x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)> >()) ::x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>();
    this_->_constructor();
    return this_;
}


template<class TPMGL(Key), class TPMGL(Value)> void x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>::__fieldInitializers_x10_util_WorkerLocalStorage(
  ) {
    this->FMGL(store) = ::x10::lang::PlaceLocalHandle<void>::template make< ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >* >(
                          reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)()),
                          reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >*> >(sizeof(x10_util_WorkerLocalStorage__closure__1<TPMGL(Key),TPMGL(Value)>)))x10_util_WorkerLocalStorage__closure__1<TPMGL(Key),TPMGL(Value)>())));
}
template<class TPMGL(Key), class TPMGL(Value)> const ::x10aux::serialization_id_t x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>::_deserializer);

template<class TPMGL(Key), class TPMGL(Value)> void x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(store));
    
}

template<class TPMGL(Key), class TPMGL(Value)> ::x10::lang::Reference* ::x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>* this_ = new (::x10aux::alloc_z< ::x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)> >()) ::x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(Key), class TPMGL(Value)> void x10::util::WorkerLocalStorage<TPMGL(Key), TPMGL(Value)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(store) = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::lang::Rail< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* >*> >();
}

#endif // X10_UTIL_WORKERLOCALSTORAGE_H_IMPLEMENTATION
#endif // __X10_UTIL_WORKERLOCALSTORAGE_H_NODEPS
