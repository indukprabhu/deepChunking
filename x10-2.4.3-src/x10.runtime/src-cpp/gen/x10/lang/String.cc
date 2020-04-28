/*************************************************/
/* START of StringHelper */
#include <x10/lang/StringHelper.h>

#include <x10/lang/String.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Long.h>
#include <x10/lang/Int.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/util/GrowableRail.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_STRINGHELPER__CLOSURE__1_CLOSURE
#define X10_LANG_STRINGHELPER__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_StringHelper__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*>::itable<x10_lang_StringHelper__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::String* __apply(x10_long i) {
        return ::x10aux::nullCheck(str)->x10::lang::String::substring(((x10_int) (i)),
                                                                      ((x10_int) (((i) + (((x10_long)1ll))))));
        
    }
    
    // captured environment
    ::x10::lang::String* str;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->str);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_StringHelper__closure__1* storage = ::x10aux::alloc_z<x10_lang_StringHelper__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::String* that_str = buf.read< ::x10::lang::String*>();
        x10_lang_StringHelper__closure__1* this_ = new (storage) x10_lang_StringHelper__closure__1(that_str);
        return this_;
    }
    
    x10_lang_StringHelper__closure__1(::x10::lang::String* str) : str(str) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10:573";
    }

};

#endif // X10_LANG_STRINGHELPER__CLOSURE__1_CLOSURE

//#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
::x10::lang::Rail< ::x10::lang::String* >* x10::lang::StringHelper::split(
  ::x10::lang::String* delim, ::x10::lang::String* str) {
    
    //#line 572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
    if (::x10aux::equals(delim,(__extension__ ({ static ::x10::lang::String* strLit__125755 = ::x10aux::makeStringLit(""); strLit__125755; }))))
    {
        
        //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        return ::x10::lang::Rail< ::x10::lang::String* >::_make(((x10_long)(::x10aux::nullCheck(str)->x10::lang::String::length())),
                                                                reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >(sizeof(x10_lang_StringHelper__closure__1)))x10_lang_StringHelper__closure__1(str))));
        
    }
    
    //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
    ::x10::util::GrowableRail< ::x10::lang::String*>* ans =
       (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::String*> >()) ::x10::util::GrowableRail< ::x10::lang::String*>());
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    (ans)->::x10::util::GrowableRail< ::x10::lang::String*>::_constructor(
      ((x10_long)0ll));
    
    //#line 576 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
    x10_int pos = ((x10_int)0);
    
    //#line 577 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
    x10_int nextMatch = ::x10aux::nullCheck(str)->x10::lang::String::indexOf(
                          delim, pos);
    
    //#line 578 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
    while ((!::x10aux::struct_equals(nextMatch, ((x10_int)-1))))
    {
        
        //#line 579 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        ans->x10::util::GrowableRail< ::x10::lang::String*>::add(
          ::x10aux::nullCheck(str)->x10::lang::String::substring(
            pos, nextMatch));
        
        //#line 580 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        pos = ((nextMatch) + (::x10aux::nullCheck(delim)->x10::lang::String::length()));
        
        //#line 581 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        nextMatch = ::x10aux::nullCheck(str)->x10::lang::String::indexOf(
                      delim, pos);
    }
    
    //#line 583 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
    if (((pos) < (::x10aux::nullCheck(str)->x10::lang::String::length())))
    {
        
        //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        ans->x10::util::GrowableRail< ::x10::lang::String*>::add(
          ::x10aux::nullCheck(str)->x10::lang::String::substring(
            pos, ::x10aux::nullCheck(str)->x10::lang::String::length()));
    }
    
    //#line 586 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
    return ans->x10::util::GrowableRail< ::x10::lang::String*>::toRail();
    
}

//#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
::x10::lang::StringHelper* x10::lang::StringHelper::x10__lang__StringHelper____this__x10__lang__StringHelper(
  ) {
    return this;
    
}
void x10::lang::StringHelper::_constructor() {
    ::x10::lang::StringHelper* this__104639 = this;
    
}
::x10::lang::StringHelper* x10::lang::StringHelper::_make(
  ) {
    ::x10::lang::StringHelper* this_ = new (::x10aux::alloc_z< ::x10::lang::StringHelper>()) ::x10::lang::StringHelper();
    this_->_constructor();
    return this_;
}


void x10::lang::StringHelper::__fieldInitializers_x10_lang_StringHelper(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::StringHelper::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::StringHelper::_deserializer);

void x10::lang::StringHelper::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::lang::StringHelper::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::StringHelper* this_ = new (::x10aux::alloc_z< ::x10::lang::StringHelper>()) ::x10::lang::StringHelper();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::StringHelper::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::lang::StringHelper::rtt;
void x10::lang::StringHelper::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.StringHelper",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*>::itable<x10_lang_StringHelper__closure__1>x10_lang_StringHelper__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_StringHelper__closure__1::__apply, &x10_lang_StringHelper__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_StringHelper__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >, &x10_lang_StringHelper__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_StringHelper__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_StringHelper__closure__1::_deserialize);

/* END of StringHelper */
/*************************************************/
