#ifndef __X10_UTIL_GROWABLERAIL_H
#define __X10_UTIL_GROWABLERAIL_H

#include <x10rt.h>


#define X10_IO_CUSTOMSERIALIZATION_H_NODEPS
#include <x10/io/CustomSerialization.h>
#undef X10_IO_CUSTOMSERIALIZATION_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace io { 
class Deserializer;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace io { 
class Serializer;
} } 
namespace x10 { namespace compiler { 
class Inline;
} } 
namespace x10 { namespace lang { 
class ArrayIndexOutOfBoundsException;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace compiler { 
class NoInline;
} } 
namespace x10 { namespace compiler { 
class NoReturn;
} } 
namespace x10 { namespace lang { 
class UnsupportedOperationException;
} } 
namespace x10 { namespace util { 
class StringBuilder;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace util { 

template<class TPMGL(T)> class GrowableRail;
template <> class GrowableRail<void>;
template<class TPMGL(T)> class GrowableRail : public ::x10::lang::X10Class
  {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[3];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::io::CustomSerialization::itable< ::x10::util::GrowableRail<TPMGL(T)> > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::util::GrowableRail<TPMGL(T)> > _itable_1;
    
    ::x10::lang::Rail< TPMGL(T) >* FMGL(data);
    
    virtual ::x10::lang::Rail< TPMGL(T) >* rail();
    x10_long FMGL(size);
    
    void _constructor();
    
    static ::x10::util::GrowableRail<TPMGL(T)>* _make();
    
    void _constructor(x10_long cap);
    
    static ::x10::util::GrowableRail<TPMGL(T)>* _make(x10_long cap);
    
    void _constructor(::x10::io::Deserializer* ds);
    
    static ::x10::util::GrowableRail<TPMGL(T)>* _make(::x10::io::Deserializer* ds);
    
    virtual void serialize(::x10::io::Serializer* s);
    virtual void add(TPMGL(T) v);
    virtual void addAll(::x10::util::GrowableRail<TPMGL(T)>* x);
    virtual void insert(x10_long p, ::x10::lang::Rail< TPMGL(T) >* items);
    virtual TPMGL(T) __apply(x10_long idx);
    virtual void __set(x10_long idx, TPMGL(T) v);
    virtual x10_boolean contains(TPMGL(T) v);
    virtual x10_boolean isEmpty();
    virtual x10_long size();
    virtual x10_long capacity();
    virtual TPMGL(T) removeLast();
    virtual void clear();
    virtual ::x10::lang::Rail< TPMGL(T) >* moveSectionToRail(x10_long i, x10_long j);
    virtual ::x10::lang::Rail< TPMGL(T) >* toRail();
    virtual void grow(x10_long newCapacity);
    virtual void shrink(x10_long newCapacity);
    virtual ::x10::lang::String* toString();
    virtual ::x10::util::GrowableRail<TPMGL(T)>* x10__util__GrowableRail____this__x10__util__GrowableRail(
      );
    virtual void __fieldInitializers_x10_util_GrowableRail();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::util::GrowableRail<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::util::GrowableRail<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::util::GrowableRail<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::CustomSerialization>()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.util.GrowableRail";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 1, parents, 1, params, variances);
}

template <> class GrowableRail<void> : public ::x10::lang::X10Class
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    static void raiseIndexOutOfBounds(x10_long idx, x10_long size) X10_PRAGMA_NORETURN ;
    
    static void illegalGap(x10_long idx, x10_long size) X10_PRAGMA_NORETURN ;
    
    
};

} } 
#endif // X10_UTIL_GROWABLERAIL_H

namespace x10 { namespace util { 
template<class TPMGL(T)> class GrowableRail;
} } 

#ifndef X10_UTIL_GROWABLERAIL_H_NODEPS
#define X10_UTIL_GROWABLERAIL_H_NODEPS
#include <x10/io/CustomSerialization.h>
#include <x10/lang/Long.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Unsafe.h>
#include <x10/io/Deserializer.h>
#include <x10/lang/Any.h>
#include <x10/io/Serializer.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Inline.h>
#include <x10/lang/ArrayIndexOutOfBoundsException.h>
#include <x10/lang/String.h>
#include <x10/compiler/NoInline.h>
#include <x10/compiler/NoReturn.h>
#include <x10/lang/UnsupportedOperationException.h>
#include <x10/util/StringBuilder.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_UTIL_GROWABLERAIL_H_GENERICS
#define X10_UTIL_GROWABLERAIL_H_GENERICS
#endif // X10_UTIL_GROWABLERAIL_H_GENERICS
#ifndef X10_UTIL_GROWABLERAIL_H_IMPLEMENTATION
#define X10_UTIL_GROWABLERAIL_H_IMPLEMENTATION
#include <x10/util/GrowableRail.h>

template<class TPMGL(T)> ::x10::io::CustomSerialization::itable< ::x10::util::GrowableRail<TPMGL(T)> >  x10::util::GrowableRail<TPMGL(T)>::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::GrowableRail<TPMGL(T)>::serialize, &x10::util::GrowableRail<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10::lang::Any::itable< ::x10::util::GrowableRail<TPMGL(T)> >  x10::util::GrowableRail<TPMGL(T)>::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::GrowableRail<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10::util::GrowableRail<TPMGL(T)>::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::CustomSerialization>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::util::GrowableRail<TPMGL(T)>")};

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> ::x10::lang::Rail< TPMGL(T) >* x10::util::GrowableRail<TPMGL(T)>::rail(
  ) {
    return this->FMGL(data);
    
}

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
/**
    * Elements 0..size-1 have valid entries of type T.
    * Elements size..data.size-1 may not be valid values of type T.  
    * It is an invariant of this class, that such elements
    * will never be accessed.
    */

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> void x10::util::GrowableRail<TPMGL(T)>::_constructor(
                           ) {
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    (this)->::x10::util::GrowableRail<TPMGL(T)>::_constructor(((x10_long)0ll));
    
}
template<class TPMGL(T)> ::x10::util::GrowableRail<TPMGL(T)>* x10::util::GrowableRail<TPMGL(T)>::_make(
                           ) {
    ::x10::util::GrowableRail<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::util::GrowableRail<TPMGL(T)> >()) ::x10::util::GrowableRail<TPMGL(T)>();
    this_->_constructor();
    return this_;
}



//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> void x10::util::GrowableRail<TPMGL(T)>::_constructor(
                           x10_long cap) {
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10::util::GrowableRail<TPMGL(T)>* this__117560 = this;
    ::x10aux::nullCheck(this__117560)->FMGL(data) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< TPMGL(T) >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    ::x10aux::nullCheck(this__117560)->FMGL(size) = ((x10_long)0ll);
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    this->FMGL(data) = ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe(cap, true);
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    this->FMGL(size) = ((x10_long)0ll);
}
template<class TPMGL(T)> ::x10::util::GrowableRail<TPMGL(T)>* x10::util::GrowableRail<TPMGL(T)>::_make(
                           x10_long cap) {
    ::x10::util::GrowableRail<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::util::GrowableRail<TPMGL(T)> >()) ::x10::util::GrowableRail<TPMGL(T)>();
    this_->_constructor(cap);
    return this_;
}



//#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> void x10::util::GrowableRail<TPMGL(T)>::_constructor(
                           ::x10::io::Deserializer* ds) {
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10::util::GrowableRail<TPMGL(T)>* this__117561 = this;
    ::x10aux::nullCheck(this__117561)->FMGL(data) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< TPMGL(T) >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    ::x10aux::nullCheck(this__117561)->FMGL(size) = ((x10_long)0ll);
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10::lang::Rail< TPMGL(T) >* src = ::x10aux::class_cast< ::x10::lang::Rail< TPMGL(T) >*>(::x10aux::nullCheck(ds)->x10::io::Deserializer::readAny());
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    this->FMGL(data) = ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe((x10_long)(::x10aux::nullCheck(src)->FMGL(size)), false);
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
      src, ((x10_long)0ll), this->FMGL(data), ((x10_long)0ll),
      (x10_long)(::x10aux::nullCheck(src)->FMGL(size)));
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    this->FMGL(size) = (x10_long)(::x10aux::nullCheck(src)->FMGL(size));
}
template<class TPMGL(T)> ::x10::util::GrowableRail<TPMGL(T)>* x10::util::GrowableRail<TPMGL(T)>::_make(
                           ::x10::io::Deserializer* ds) {
    ::x10::util::GrowableRail<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::util::GrowableRail<TPMGL(T)> >()) ::x10::util::GrowableRail<TPMGL(T)>();
    this_->_constructor(ds);
    return this_;
}



//#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> void x10::util::GrowableRail<TPMGL(T)>::serialize(
  ::x10::io::Serializer* s) {
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10::lang::Rail< TPMGL(T) >* tmp = ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe(this->FMGL(size), false);
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
      this->FMGL(data), ((x10_long)0ll), tmp, ((x10_long)0ll),
      this->FMGL(size));
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10aux::nullCheck(s)->x10::io::Serializer::writeAny(
      reinterpret_cast< ::x10::lang::Any*>(tmp));
}

//#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> void x10::util::GrowableRail<TPMGL(T)>::add(
  TPMGL(T) v) {
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    if (((((this->FMGL(size)) + (((x10_long)1ll)))) > ((__extension__ ({
            ::x10::util::GrowableRail<TPMGL(T)>* this__117542 =
              this;
            (x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(this__117542)->FMGL(data))->FMGL(size));
        }))
        ))) {
        this->x10::util::template GrowableRail<TPMGL(T)>::grow(
          ((this->FMGL(size)) + (((x10_long)1ll))));
    }
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10aux::nullCheck(this->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__set(
      ((this->FMGL(size) = ((this->FMGL(size)) + (((x10_long)1ll)))) - (((x10_long)1ll))),
      v);
}

//#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> void x10::util::GrowableRail<TPMGL(T)>::addAll(
  ::x10::util::GrowableRail<TPMGL(T)>* x) {
    
    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    if (((((this->FMGL(size)) + (::x10aux::nullCheck(x)->FMGL(size)))) > ((__extension__ ({
            ::x10::util::GrowableRail<TPMGL(T)>* this__117543 =
              this;
            (x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(this__117543)->FMGL(data))->FMGL(size));
        }))
        ))) {
        this->x10::util::template GrowableRail<TPMGL(T)>::grow(
          ((this->FMGL(size)) + (::x10aux::nullCheck(x)->FMGL(size))));
    }
    
    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    x10_long i__76595max__117564 = ((::x10aux::nullCheck(x)->FMGL(size)) - (((x10_long)1ll)));
    {
        x10_long i__117565;
        for (i__117565 = ((x10_long)0ll); ((i__117565) <= (i__76595max__117564));
             i__117565 = ((i__117565) + (((x10_long)1ll))))
        {
            x10_long i__117566 = i__117565;
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ::x10aux::nullCheck(this->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__set(
              ((this->FMGL(size) = ((this->FMGL(size)) + (((x10_long)1ll)))) - (((x10_long)1ll))),
              (__extension__ ({
                  
                  //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                  x10_long idx__117562 = i__117566;
                  TPMGL(T) ret__117563;
                  
                  //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                  ret__117563 = ::x10aux::nullCheck(::x10aux::nullCheck(x)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                                  idx__117562);
                  ret__117563;
              }))
              );
        }
    }
    
}

//#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> void x10::util::GrowableRail<TPMGL(T)>::insert(
  x10_long p, ::x10::lang::Rail< TPMGL(T) >* items) {
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    x10_long addLen = (x10_long)(::x10aux::nullCheck(items)->FMGL(size));
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    x10_long newLen = ((this->FMGL(size)) + (addLen));
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    x10_long movLen = ((this->FMGL(size)) - (p));
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    if (((newLen) > ((__extension__ ({
            ::x10::util::GrowableRail<TPMGL(T)>* this__117547 =
              this;
            (x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(this__117547)->FMGL(data))->FMGL(size));
        }))
        ))) {
        this->x10::util::template GrowableRail<TPMGL(T)>::grow(
          newLen);
    }
    
    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    if (((movLen) > (((x10_long)0ll)))) {
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
          this->FMGL(data), p, this->FMGL(data), ((p) + (addLen)),
          movLen);
    }
    
    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
      items, ((x10_long)0ll), this->FMGL(data), p, (x10_long)(::x10aux::nullCheck(items)->FMGL(size)));
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    this->FMGL(size) = newLen;
}

//#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> TPMGL(T) x10::util::GrowableRail<TPMGL(T)>::__apply(
  x10_long idx) {
    
    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    return ::x10aux::nullCheck(this->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
             idx);
    
}

//#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> void x10::util::GrowableRail<TPMGL(T)>::__set(
  x10_long idx, TPMGL(T) v) {
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    if ((::x10aux::struct_equals(idx, this->FMGL(size))))
    {
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        this->x10::util::template GrowableRail<TPMGL(T)>::add(
          v);
    } else {
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ::x10aux::nullCheck(this->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__set(
          idx, v);
    }
    
}

//#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> x10_boolean x10::util::GrowableRail<TPMGL(T)>::contains(
  TPMGL(T) v) {
    
    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    if ((::x10aux::struct_equals(v, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10_long i__76613max__117567 = (((__extension__ ({
            ::x10::util::GrowableRail<TPMGL(T)>* this__117568 =
              this;
            ::x10aux::nullCheck(this__117568)->FMGL(size);
        }))
        ) - (((x10_long)1ll)));
        {
            x10_long i__117569;
            for (i__117569 = ((x10_long)0ll); ((i__117569) <= (i__76613max__117567));
                 i__117569 = ((i__117569) + (((x10_long)1ll))))
            {
                x10_long i__117570 = i__117569;
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                if ((::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                                               i__117570),
                                             reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
                {
                    return true;
                    
                }
                
            }
        }
        
    } else {
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10_long i__76631max__117571 = (((__extension__ ({
            ::x10::util::GrowableRail<TPMGL(T)>* this__117572 =
              this;
            ::x10aux::nullCheck(this__117572)->FMGL(size);
        }))
        ) - (((x10_long)1ll)));
        {
            x10_long i__117573;
            for (i__117573 = ((x10_long)0ll); ((i__117573) <= (i__76631max__117571));
                 i__117573 = ((i__117573) + (((x10_long)1ll))))
            {
                x10_long i__117574 = i__117573;
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                if (::x10aux::equals(v,::x10aux::nullCheck(this->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                                         i__117574))) {
                    return true;
                    
                }
                
            }
        }
        
    }
    
    //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    return false;
    
}

//#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> x10_boolean x10::util::GrowableRail<TPMGL(T)>::isEmpty(
  ) {
    return (::x10aux::struct_equals(this->FMGL(size), ((x10_long)0ll)));
    
}

//#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> x10_long x10::util::GrowableRail<TPMGL(T)>::size(
  ) {
    return this->FMGL(size);
    
}

//#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> x10_long x10::util::GrowableRail<TPMGL(T)>::capacity(
  ) {
    return (x10_long)(::x10aux::nullCheck(this->FMGL(data))->FMGL(size));
    
}

//#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> TPMGL(T) x10::util::GrowableRail<TPMGL(T)>::removeLast(
  ) {
    
    //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    TPMGL(T) res = (__extension__ ({
        ::x10::util::GrowableRail<TPMGL(T)>* this__117551 =
          this;
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10_long idx__117550 = ((this->FMGL(size)) - (((x10_long)1ll)));
        TPMGL(T) ret__117552;
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ret__117552 = ::x10aux::nullCheck(::x10aux::nullCheck(this__117551)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                        idx__117550);
        ret__117552;
    }))
    ;
    
    //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    (this->FMGL(data))->clear(((this->FMGL(size)) - (((x10_long)1ll))), ((x10_long)1ll));
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    this->FMGL(size) = ((this->FMGL(size)) - (((x10_long)1ll)));
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    this->x10::util::template GrowableRail<TPMGL(T)>::shrink(
      ((this->FMGL(size)) + (((x10_long)1ll))));
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    return res;
    
}

//#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> void x10::util::GrowableRail<TPMGL(T)>::clear(
  ) {
    
    //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    (this->FMGL(data))->clear();
    
    //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    this->FMGL(size) = ((x10_long)0ll);
}

//#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> ::x10::lang::Rail< TPMGL(T) >* x10::util::GrowableRail<TPMGL(T)>::moveSectionToRail(
  x10_long i, x10_long j) {
    
    //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    x10_long len = ((((j) - (i))) + (((x10_long)1ll)));
    
    //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    if (((len) < (((x10_long)1ll)))) {
        return ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe(((x10_long)0ll), false);
        
    }
    
    //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10::lang::Rail< TPMGL(T) >* tmp = ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe(len, false);
    
    //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
      this->FMGL(data), i, tmp, ((x10_long)0ll), len);
    
    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
      this->FMGL(data), ((j) + (((x10_long)1ll))), this->FMGL(data),
      i, ((((this->FMGL(size)) - (j))) - (((x10_long)1ll))));
    
    //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    (this->FMGL(data))->clear(((this->FMGL(size)) - (len)), len);
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    this->FMGL(size) = ((this->FMGL(size)) - (len));
    
    //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    this->x10::util::template GrowableRail<TPMGL(T)>::shrink(
      ((this->FMGL(size)) + (((x10_long)1ll))));
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    return tmp;
    
}

//#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> ::x10::lang::Rail< TPMGL(T) >* x10::util::GrowableRail<TPMGL(T)>::toRail(
  ) {
    
    //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10::lang::Rail< TPMGL(T) >* ans = ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe(this->FMGL(size), false);
    
    //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
      this->FMGL(data), ((x10_long)0ll), ans, ((x10_long)0ll),
      this->FMGL(size));
    
    //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    return ans;
    
}

//#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> void x10::util::GrowableRail<TPMGL(T)>::grow(
  x10_long newCapacity) {
    
    //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    x10_long oldCapacity = (__extension__ ({
        ::x10::util::GrowableRail<TPMGL(T)>* this__117554 =
          this;
        (x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(this__117554)->FMGL(data))->FMGL(size));
    }))
    ;
    
    //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    if (((newCapacity) < (((oldCapacity) * (((x10_long)2ll))))))
    {
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        newCapacity = ((oldCapacity) * (((x10_long)2ll)));
    }
    
    //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    if (((newCapacity) < (((x10_long)8ll)))) {
        
        //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        newCapacity = ((x10_long)8ll);
    }
    
    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10::lang::Rail< TPMGL(T) >* tmp = ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe(newCapacity, false);
    
    //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
      this->FMGL(data), ((x10_long)0ll), tmp, ((x10_long)0ll),
      this->FMGL(size));
    
    //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    (tmp)->clear(this->FMGL(size), ((newCapacity) - (this->FMGL(size))));
    
    //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10aux::dealloc(this->FMGL(data));
    
    //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    this->FMGL(data) = tmp;
}

//#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> void x10::util::GrowableRail<TPMGL(T)>::shrink(
  x10_long newCapacity) {
    
    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    if ((((newCapacity) > ((((__extension__ ({
            ::x10::util::GrowableRail<TPMGL(T)>* this__117555 =
              this;
            (x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(this__117555)->FMGL(data))->FMGL(size));
        }))
        ) / ::x10aux::zeroCheck(((x10_long)4ll))))) || ((newCapacity) < (((x10_long)8ll)))))
    {
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        return;
    }
    
    //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    newCapacity = (__extension__ ({
        
        //#line 374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        x10_long a__117556 = newCapacity;
        x10_long b__117557 = this->FMGL(size);
        ((a__117556) < (b__117557)) ? (b__117557) : (a__117556);
    }))
    ;
    
    //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    newCapacity = (__extension__ ({
        
        //#line 374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        x10_long a__117558 = newCapacity;
        ((a__117558) < (((x10_long)8ll))) ? (((x10_long)8ll))
          : (a__117558);
    }))
    ;
    
    //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10::lang::Rail< TPMGL(T) >* tmp = ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe(newCapacity, false);
    
    //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
      this->FMGL(data), ((x10_long)0ll), tmp, ((x10_long)0ll),
      this->FMGL(size));
    
    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    (tmp)->clear(this->FMGL(size), ((newCapacity) - (this->FMGL(size))));
    
    //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10aux::dealloc(this->FMGL(data));
    
    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    this->FMGL(data) = tmp;
}

//#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"

//#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"

//#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> ::x10::lang::String* x10::util::GrowableRail<TPMGL(T)>::toString(
  ) {
    
    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10::util::StringBuilder* sb =  (new (::x10aux::alloc_z< ::x10::util::StringBuilder>()) ::x10::util::StringBuilder());
    (sb)->::x10::util::StringBuilder::_constructor();
    
    //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    sb->add((__extension__ ({ static ::x10::lang::String* strLit__128705 = ::x10aux::makeStringLit("["); strLit__128705; })));
    
    //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    x10_long sz = ((this->FMGL(size)) > (((x10_long)10ll)))
      ? (((x10_long)10ll)) : (this->FMGL(size));
    
    //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    {
        x10_long i;
        for (i = ((x10_long)0ll); ((i) < (sz)); i = ((i) + (((x10_long)1ll))))
        {
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            if (((i) > (((x10_long)0ll)))) {
                
                //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                sb->add((__extension__ ({ static ::x10::lang::String* strLit__128707 = ::x10aux::makeStringLit(","); strLit__128707; })));
            }
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            sb->add(::x10aux::to_string(::x10aux::nullCheck(this->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                                          i)));
        }
    }
    
    //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    if (((sz) < (this->FMGL(size)))) {
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        sb->add(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__128711 = ::x10aux::makeStringLit("...(omitted "); strLit__128711; })), ((this->FMGL(size)) - (sz))), (__extension__ ({ static ::x10::lang::String* strLit__128712 = ::x10aux::makeStringLit(" elements)"); strLit__128712; }))));
    }
    
    //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    sb->add((__extension__ ({ static ::x10::lang::String* strLit__128714 = ::x10aux::makeStringLit("]"); strLit__128714; })));
    
    //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    return sb->toString();
    
}

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
template<class TPMGL(T)> ::x10::util::GrowableRail<TPMGL(T)>*
  x10::util::GrowableRail<TPMGL(T)>::x10__util__GrowableRail____this__x10__util__GrowableRail(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::util::GrowableRail<TPMGL(T)>::__fieldInitializers_x10_util_GrowableRail(
  ) {
    this->FMGL(data) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< TPMGL(T) >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(size) = ((x10_long)0ll);
}
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10::util::GrowableRail<TPMGL(T)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::GrowableRail<TPMGL(T)>::_deserializer);

template<class TPMGL(T)> void x10::util::GrowableRail<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    /* NOTE: Implements x10.io.CustomSerialization */
    ::x10::io::Serializer* x10_buf = ::x10::io::Serializer::_make(&buf);
    this->serialize(x10_buf);
    buf.write(::x10aux::deserialization_buffer::CUSTOM_SERIALIZATION_END);
    
}

template<class TPMGL(T)> ::x10::lang::Reference* ::x10::util::GrowableRail<TPMGL(T)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::GrowableRail<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::util::GrowableRail<TPMGL(T)> >()) ::x10::util::GrowableRail<TPMGL(T)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(T)> void x10::util::GrowableRail<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    /* NOTE: Implements x10.io.CustomSerialization */
    ::x10::io::Deserializer* x10_buf = ::x10::io::Deserializer::_make(&buf);
    _constructor(x10_buf);
    ::x10aux::serialization_id_t tmp = buf.read< ::x10aux::serialization_id_t>();
    if (tmp != ::x10aux::deserialization_buffer::CUSTOM_SERIALIZATION_END) { ::x10aux::raiseSerializationProtocolError(); }
    
}

#endif // X10_UTIL_GROWABLERAIL_H_IMPLEMENTATION
#endif // __X10_UTIL_GROWABLERAIL_H_NODEPS
