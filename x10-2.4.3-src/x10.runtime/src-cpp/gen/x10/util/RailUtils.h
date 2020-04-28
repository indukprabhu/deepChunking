#ifndef __X10_UTIL_RAILUTILS_H
#define __X10_UTIL_RAILUTILS_H

#include <x10rt.h>


namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(Z1), class TPMGL(Z2), class TPMGL(U)> class Fun_0_2;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Comparable;
} } 
namespace x10 { namespace compiler { 
class Inline;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(Z1), class TPMGL(U)> class Fun_0_1;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace util { 

class RailUtils : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    template<class TPMGL(T)> static void sort(::x10::lang::Rail< TPMGL(T) >* a,
                                              ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>* cmp);
    template<class TPMGL(T)> static void sort(::x10::lang::Rail< TPMGL(T) >* a);
    template<class TPMGL(T)> static void qsort(::x10::lang::Rail< TPMGL(T) >* a,
                                               x10_long lo, x10_long hi, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>* cmp);
    template<class TPMGL(T)> static void exch(::x10::lang::Rail< TPMGL(T) >* a,
                                              x10_long i, x10_long j);
    template<class TPMGL(T)> static x10_long binarySearch(::x10::lang::Rail< TPMGL(T) >* a,
                                                          TPMGL(T) key,
                                                          ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>* cmp);
    template<class TPMGL(T)> static x10_long binarySearch(::x10::lang::Rail< TPMGL(T) >* a,
                                                          TPMGL(T) key);
    template<class TPMGL(T)> static x10_long binarySearch(
      ::x10::lang::Rail< TPMGL(T) >* a, TPMGL(T) key, x10_long min,
      x10_long max, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>* cmp);
    template<class TPMGL(T)> static x10_long binarySearch(
      ::x10::lang::Rail< TPMGL(T) >* a, TPMGL(T) key, x10_long min,
      x10_long max);
    template<class TPMGL(T), class TPMGL(U)> static TPMGL(U)
      reduce(::x10::lang::Rail< TPMGL(T) >* src, ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* op,
             TPMGL(U) unit);
    template<class TPMGL(T), class TPMGL(U)> static ::x10::lang::Rail< TPMGL(U) >*
      map(::x10::lang::Rail< TPMGL(T) >* src, ::x10::lang::Rail< TPMGL(U) >* dst,
          ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op);
    template<class TPMGL(S), class TPMGL(T), class TPMGL(U)>
    static ::x10::lang::Rail< TPMGL(U) >* map(::x10::lang::Rail< TPMGL(S) >* src1,
                                              ::x10::lang::Rail< TPMGL(T) >* src2,
                                              ::x10::lang::Rail< TPMGL(U) >* dst,
                                              ::x10::lang::Fun_0_2<TPMGL(S), TPMGL(T), TPMGL(U)>* op);
    virtual ::x10::util::RailUtils* x10__util__RailUtils____this__x10__util__RailUtils(
      );
    void _constructor();
    
    static ::x10::util::RailUtils* _make();
    
    virtual void __fieldInitializers_x10_util_RailUtils();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } 
#endif // X10_UTIL_RAILUTILS_H

namespace x10 { namespace util { 
class RailUtils;
} } 

#ifndef X10_UTIL_RAILUTILS_H_NODEPS
#define X10_UTIL_RAILUTILS_H_NODEPS
#include <x10/lang/Rail.h>
#include <x10/lang/Fun_0_2.h>
#include <x10/lang/Int.h>
#include <x10/lang/Long.h>
#include <x10/lang/Comparable.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Inline.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_UTIL_RAILUTILS__CLOSURE__1_CLOSURE
#define X10_UTIL_RAILUTILS__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_2.h>
template<class TPMGL(T)> class x10_util_RailUtils__closure__1 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>::template itable <x10_util_RailUtils__closure__1<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(TPMGL(T) x__121825, TPMGL(T) y__121826) {
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        return ::x10::lang::Comparable< TPMGL(T) >::compareTo(x__121825, y__121826);
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_RailUtils__closure__1<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_RailUtils__closure__1<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_util_RailUtils__closure__1<TPMGL(T) >* this_ = new (storage) x10_util_RailUtils__closure__1<TPMGL(T) >();
        return this_;
    }
    
    x10_util_RailUtils__closure__1() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10:33";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>::template itable <x10_util_RailUtils__closure__1<TPMGL(T) > >x10_util_RailUtils__closure__1<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_RailUtils__closure__1<TPMGL(T) >::__apply, &x10_util_RailUtils__closure__1<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_RailUtils__closure__1<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >, &x10_util_RailUtils__closure__1<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_RailUtils__closure__1<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_RailUtils__closure__1<TPMGL(T) >::_deserialize);

#endif // X10_UTIL_RAILUTILS__CLOSURE__1_CLOSURE
#ifndef X10_UTIL_RAILUTILS__CLOSURE__2_CLOSURE
#define X10_UTIL_RAILUTILS__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_2.h>
template<class TPMGL(T)> class x10_util_RailUtils__closure__2 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>::template itable <x10_util_RailUtils__closure__2<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(TPMGL(T) x, TPMGL(T) y) {
        return ::x10::lang::Comparable< TPMGL(T) >::compareTo(x, y);
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_RailUtils__closure__2<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_RailUtils__closure__2<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_util_RailUtils__closure__2<TPMGL(T) >* this_ = new (storage) x10_util_RailUtils__closure__2<TPMGL(T) >();
        return this_;
    }
    
    x10_util_RailUtils__closure__2() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10:79";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>::template itable <x10_util_RailUtils__closure__2<TPMGL(T) > >x10_util_RailUtils__closure__2<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_RailUtils__closure__2<TPMGL(T) >::__apply, &x10_util_RailUtils__closure__2<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_RailUtils__closure__2<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >, &x10_util_RailUtils__closure__2<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_RailUtils__closure__2<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_RailUtils__closure__2<TPMGL(T) >::_deserialize);

#endif // X10_UTIL_RAILUTILS__CLOSURE__2_CLOSURE
#ifndef X10_UTIL_RAILUTILS__CLOSURE__3_CLOSURE
#define X10_UTIL_RAILUTILS__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_2.h>
template<class TPMGL(T)> class x10_util_RailUtils__closure__3 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>::template itable <x10_util_RailUtils__closure__3<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(TPMGL(T) x, TPMGL(T) y) {
        return ::x10::lang::Comparable< TPMGL(T) >::compareTo(x, y);
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_RailUtils__closure__3<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_RailUtils__closure__3<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_util_RailUtils__closure__3<TPMGL(T) >* this_ = new (storage) x10_util_RailUtils__closure__3<TPMGL(T) >();
        return this_;
    }
    
    x10_util_RailUtils__closure__3() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10:113";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>::template itable <x10_util_RailUtils__closure__3<TPMGL(T) > >x10_util_RailUtils__closure__3<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_RailUtils__closure__3<TPMGL(T) >::__apply, &x10_util_RailUtils__closure__3<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_RailUtils__closure__3<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >, &x10_util_RailUtils__closure__3<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_RailUtils__closure__3<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_RailUtils__closure__3<TPMGL(T) >::_deserialize);

#endif // X10_UTIL_RAILUTILS__CLOSURE__3_CLOSURE
#ifndef X10_UTIL_RAILUTILS_H_GENERICS
#define X10_UTIL_RAILUTILS_H_GENERICS
#ifndef X10_UTIL_RAILUTILS_H_sort_2874
#define X10_UTIL_RAILUTILS_H_sort_2874
template<class TPMGL(T)> void x10::util::RailUtils::sort(::x10::lang::Rail< TPMGL(T) >* a,
                                                         ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>* cmp) {
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10::util::RailUtils::template qsort< TPMGL(T) >(a, ((x10_long)0ll),
                                                       (((x10_long)(::x10aux::nullCheck(a)->FMGL(size))) - (((x10_long)1ll))),
                                                       cmp);
}
#endif // X10_UTIL_RAILUTILS_H_sort_2874
#ifndef X10_UTIL_RAILUTILS_H_sort_2875
#define X10_UTIL_RAILUTILS_H_sort_2875
template<class TPMGL(T)> void x10::util::RailUtils::sort(
  ::x10::lang::Rail< TPMGL(T) >* a) {
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10::lang::Rail< TPMGL(T) >* a__121827 = a;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10::util::RailUtils::template qsort< TPMGL(T) >(a__121827,
                                                       ((x10_long)0ll),
                                                       (((x10_long)(::x10aux::nullCheck(a__121827)->FMGL(size))) - (((x10_long)1ll))),
                                                       reinterpret_cast< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >(sizeof(x10_util_RailUtils__closure__1<TPMGL(T)>)))x10_util_RailUtils__closure__1<TPMGL(T)>())));
}
#endif // X10_UTIL_RAILUTILS_H_sort_2875
#ifndef X10_UTIL_RAILUTILS_H_qsort_2876
#define X10_UTIL_RAILUTILS_H_qsort_2876
template<class TPMGL(T)> void x10::util::RailUtils::qsort(
  ::x10::lang::Rail< TPMGL(T) >* a, x10_long lo, x10_long hi,
  ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>* cmp) {
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    if (((hi) <= (lo))) {
        return;
    }
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    x10_long l = ((lo) - (((x10_long)1ll)));
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    x10_long h = hi;
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    while (true) {
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        while (((((x10_long)(::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>::__apply(::x10aux::nullCheck(cmp), 
                 ::x10aux::nullCheck(a)->x10::lang::template Rail< TPMGL(T) >::__apply(
                   l = ((l) + (((x10_long)1ll)))), ::x10aux::nullCheck(a)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                                     hi))))) < (((x10_long)0ll))))
        {
            ;
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        while ((((((x10_long)(::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>::__apply(::x10aux::nullCheck(cmp), 
                 ::x10aux::nullCheck(a)->x10::lang::template Rail< TPMGL(T) >::__apply(
                   hi), ::x10aux::nullCheck(a)->x10::lang::template Rail< TPMGL(T) >::__apply(
                          h = ((h) - (((x10_long)1ll)))))))) < (((x10_long)0ll))) &&
               ((h) > (lo)))) {
            ;
        }
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        if (((l) >= (h))) {
            break;
        }
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ::x10::util::RailUtils::template exch< TPMGL(T) >(
          a, l, h);
    }
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10::util::RailUtils::template exch< TPMGL(T) >(a, l,
                                                      hi);
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10::util::RailUtils::template qsort< TPMGL(T) >(a,
                                                       lo,
                                                       ((l) - (((x10_long)1ll))),
                                                       cmp);
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10::util::RailUtils::template qsort< TPMGL(T) >(a,
                                                       ((l) + (((x10_long)1ll))),
                                                       hi,
                                                       cmp);
}
#endif // X10_UTIL_RAILUTILS_H_qsort_2876
#ifndef X10_UTIL_RAILUTILS_H_exch_2877
#define X10_UTIL_RAILUTILS_H_exch_2877
template<class TPMGL(T)> void x10::util::RailUtils::exch(
  ::x10::lang::Rail< TPMGL(T) >* a, x10_long i, x10_long j) {
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    TPMGL(T) temp = ::x10aux::nullCheck(a)->x10::lang::template Rail< TPMGL(T) >::__apply(
                      i);
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10aux::nullCheck(a)->x10::lang::template Rail< TPMGL(T) >::__set(
      i, ::x10aux::nullCheck(a)->x10::lang::template Rail< TPMGL(T) >::__apply(
           j));
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10aux::nullCheck(a)->x10::lang::template Rail< TPMGL(T) >::__set(
      j, temp);
}
#endif // X10_UTIL_RAILUTILS_H_exch_2877
#ifndef X10_UTIL_RAILUTILS_H_binarySearch_2878
#define X10_UTIL_RAILUTILS_H_binarySearch_2878
template<class TPMGL(T)> x10_long x10::util::RailUtils::binarySearch(
  ::x10::lang::Rail< TPMGL(T) >* a, TPMGL(T) key, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>* cmp) {
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    return ::x10::util::RailUtils::template binarySearch< TPMGL(T) >(
             a, key, ((x10_long)0ll), (x10_long)(::x10aux::nullCheck(a)->FMGL(size)),
             cmp);
    
}
#endif // X10_UTIL_RAILUTILS_H_binarySearch_2878
#ifndef X10_UTIL_RAILUTILS_H_binarySearch_2879
#define X10_UTIL_RAILUTILS_H_binarySearch_2879
template<class TPMGL(T)> x10_long x10::util::RailUtils::binarySearch(
  ::x10::lang::Rail< TPMGL(T) >* a, TPMGL(T) key) {
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    return ::x10::util::RailUtils::template binarySearch< TPMGL(T) >(
             a, key, ((x10_long)0ll), (x10_long)(::x10aux::nullCheck(a)->FMGL(size)),
             reinterpret_cast< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >(sizeof(x10_util_RailUtils__closure__2<TPMGL(T)>)))x10_util_RailUtils__closure__2<TPMGL(T)>())));
    
}
#endif // X10_UTIL_RAILUTILS_H_binarySearch_2879
#ifndef X10_UTIL_RAILUTILS_H_binarySearch_2880
#define X10_UTIL_RAILUTILS_H_binarySearch_2880
template<class TPMGL(T)> x10_long x10::util::RailUtils::binarySearch(
  ::x10::lang::Rail< TPMGL(T) >* a, TPMGL(T) key, x10_long min,
  x10_long max, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>* cmp) {
    
    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    x10_long low = min;
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    x10_long high = ((max) - (((x10_long)1ll)));
    
    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    while (((low) <= (high))) {
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        x10_long mid = ((((low) + (high))) / ::x10aux::zeroCheck(((x10_long)2ll)));
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        x10_int compare = ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>::__apply(::x10aux::nullCheck(cmp), 
          ::x10aux::nullCheck(a)->x10::lang::template Rail< TPMGL(T) >::__apply(
            mid), key);
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        if (((((x10_long)(compare))) < (((x10_long)0ll))))
        {
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            low = ((mid) + (((x10_long)1ll)));
        } else 
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        if (((((x10_long)(compare))) > (((x10_long)0ll))))
        {
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            high = ((mid) - (((x10_long)1ll)));
        } else {
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            return mid;
            
        }
        
    }
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    return (-(((low) + (((x10_long)1ll)))));
    
}
#endif // X10_UTIL_RAILUTILS_H_binarySearch_2880
#ifndef X10_UTIL_RAILUTILS_H_binarySearch_2881
#define X10_UTIL_RAILUTILS_H_binarySearch_2881
template<class TPMGL(T)> x10_long x10::util::RailUtils::binarySearch(
  ::x10::lang::Rail< TPMGL(T) >* a, TPMGL(T) key, x10_long min,
  x10_long max) {
    
    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    return ::x10::util::RailUtils::template binarySearch< TPMGL(T) >(
             a, key, ((x10_long)0ll), (x10_long)(::x10aux::nullCheck(a)->FMGL(size)),
             reinterpret_cast< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >(sizeof(x10_util_RailUtils__closure__3<TPMGL(T)>)))x10_util_RailUtils__closure__3<TPMGL(T)>())));
    
}
#endif // X10_UTIL_RAILUTILS_H_binarySearch_2881
#ifndef X10_UTIL_RAILUTILS_H_reduce_2882
#define X10_UTIL_RAILUTILS_H_reduce_2882
template<class TPMGL(T), class TPMGL(U)> TPMGL(U) x10::util::RailUtils::reduce(
  ::x10::lang::Rail< TPMGL(T) >* src, ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* op,
  TPMGL(U) unit) {
    
    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    TPMGL(U) accum = unit;
    
    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10::lang::Rail< TPMGL(T) >* rail__121828 = src;
    x10_long i__72784max__121829 = (x10_long)(::x10aux::nullCheck(rail__121828)->FMGL(size));
    {
        x10_long i__121830;
        for (i__121830 = ((x10_long)0ll); ((i__121830) < (i__72784max__121829));
             i__121830 = ((i__121830) + (((x10_long)1ll))))
        {
            x10_long i__121831 = i__121830;
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            accum = ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(op), 
              accum, ::x10aux::nullCheck(src)->x10::lang::template Rail< TPMGL(T) >::__apply(
                       i__121831));
        }
    }
    
    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    return accum;
    
}
#endif // X10_UTIL_RAILUTILS_H_reduce_2882
#ifndef X10_UTIL_RAILUTILS_H_map_2883
#define X10_UTIL_RAILUTILS_H_map_2883
template<class TPMGL(T), class TPMGL(U)> ::x10::lang::Rail< TPMGL(U) >*
  x10::util::RailUtils::map(::x10::lang::Rail< TPMGL(T) >* src,
                            ::x10::lang::Rail< TPMGL(U) >* dst,
                            ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op) {
    
    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10::lang::Rail< TPMGL(T) >* rail__121832 = src;
    x10_long i__72803max__121833 = (x10_long)(::x10aux::nullCheck(rail__121832)->FMGL(size));
    {
        x10_long i__121834;
        for (i__121834 = ((x10_long)0ll); ((i__121834) < (i__72803max__121833));
             i__121834 = ((i__121834) + (((x10_long)1ll))))
        {
            x10_long i__121835 = i__121834;
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            ::x10aux::nullCheck(dst)->x10::lang::template Rail< TPMGL(U) >::__set(
              i__121835, ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(op), 
                ::x10aux::nullCheck(src)->x10::lang::template Rail< TPMGL(T) >::__apply(
                  i__121835)));
        }
    }
    
    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    return dst;
    
}
#endif // X10_UTIL_RAILUTILS_H_map_2883
#ifndef X10_UTIL_RAILUTILS_H_map_2884
#define X10_UTIL_RAILUTILS_H_map_2884
template<class TPMGL(S), class TPMGL(T), class TPMGL(U)> ::x10::lang::Rail< TPMGL(U) >*
  x10::util::RailUtils::map(::x10::lang::Rail< TPMGL(S) >* src1,
                            ::x10::lang::Rail< TPMGL(T) >* src2,
                            ::x10::lang::Rail< TPMGL(U) >* dst,
                            ::x10::lang::Fun_0_2<TPMGL(S), TPMGL(T), TPMGL(U)>* op) {
    
    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10::lang::Rail< TPMGL(S) >* rail__121836 = src1;
    x10_long i__72822max__121837 = (x10_long)(::x10aux::nullCheck(rail__121836)->FMGL(size));
    {
        x10_long i__121838;
        for (i__121838 = ((x10_long)0ll); ((i__121838) < (i__72822max__121837));
             i__121838 = ((i__121838) + (((x10_long)1ll))))
        {
            x10_long i__121839 = i__121838;
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            ::x10aux::nullCheck(dst)->x10::lang::template Rail< TPMGL(U) >::__set(
              i__121839, ::x10::lang::Fun_0_2<TPMGL(S), TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(op), 
                ::x10aux::nullCheck(src1)->x10::lang::template Rail< TPMGL(S) >::__apply(
                  i__121839), ::x10aux::nullCheck(src2)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                i__121839)));
        }
    }
    
    //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    return dst;
    
}
#endif // X10_UTIL_RAILUTILS_H_map_2884
#endif // X10_UTIL_RAILUTILS_H_GENERICS
#endif // __X10_UTIL_RAILUTILS_H_NODEPS
