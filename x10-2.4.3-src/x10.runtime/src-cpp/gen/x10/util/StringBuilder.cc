/*************************************************/
/* START of StringBuilder */
#include <x10/util/StringBuilder.h>

#include <x10/util/Builder.h>
#include <x10/lang/Char.h>
#include <x10/lang/Any.h>
#include <x10/lang/String.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/Int.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Byte.h>
#include <x10/lang/Short.h>
#include <x10/lang/Long.h>
#include <x10/lang/Float.h>
#include <x10/lang/Double.h>
#include <x10/lang/Rail.h>
#include <x10/compiler/Synthetic.h>
::x10::util::Builder< ::x10::lang::Any*, ::x10::lang::String*>::itable< ::x10::util::StringBuilder >  x10::util::StringBuilder::_itable_0(&x10::util::StringBuilder::add, &::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::StringBuilder::result, &x10::util::StringBuilder::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::util::StringBuilder >  x10::util::StringBuilder::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::StringBuilder::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::util::StringBuilder::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::util::Builder< ::x10::lang::Any*, ::x10::lang::String*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::util::StringBuilder")};

//#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
void x10::util::StringBuilder::_constructor() {
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    ::x10::util::StringBuilder* this__122158 = this;
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    this->FMGL(buf) = (__extension__ ({
        ::x10::util::GrowableRail<x10_char>* alloc__71688 =  (new (::x10aux::alloc_z< ::x10::util::GrowableRail<x10_char> >()) ::x10::util::GrowableRail<x10_char>());
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (alloc__71688)->::x10::util::GrowableRail<x10_char>::_constructor(
          ((x10_long)0ll));
        alloc__71688;
    }))
    ;
}
::x10::util::StringBuilder* x10::util::StringBuilder::_make() {
    ::x10::util::StringBuilder* this_ = new (::x10aux::alloc_z< ::x10::util::StringBuilder>()) ::x10::util::StringBuilder();
    this_->_constructor();
    return this_;
}



//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::lang::String* x10::util::StringBuilder::toString() {
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    return this->result();
    
}

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::Builder< ::x10::lang::Any*, ::x10::lang::String*>* x10::util::StringBuilder::add(
  ::x10::lang::Any* o) {
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    if ((::x10aux::struct_equals(o, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return reinterpret_cast< ::x10::util::Builder< ::x10::lang::Any*, ::x10::lang::String*>*>(this->addString(
                                                                                                    (__extension__ ({ static ::x10::lang::String* strLit__130401 = ::x10aux::makeStringLit("null"); strLit__130401; }))));
        
    } else {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return reinterpret_cast< ::x10::util::Builder< ::x10::lang::Any*, ::x10::lang::String*>*>(this->addString(
                                                                                                    ::x10aux::to_string(o)));
        
    }
    
}

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::insert(
  x10_int p, ::x10::lang::Any* o) {
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    if ((::x10aux::struct_equals(o, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return this->insertString(p, (__extension__ ({ static ::x10::lang::String* strLit__130403 = ::x10aux::makeStringLit("null"); strLit__130403; })));
        
    } else {
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return this->insertString(p, ::x10aux::to_string(o));
        
    }
    
}

//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::add(
  x10_char x) {
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    ::x10aux::nullCheck(this->FMGL(buf))->x10::util::GrowableRail<x10_char>::add(
      x);
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    return this;
    
}

//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::add(
  x10_boolean x) {
    return this->addString(::x10aux::to_string(x));
    
}

//#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::add(
  x10_byte x) {
    return this->addString(::x10aux::to_string(x));
    
}

//#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::add(
  x10_short x) {
    return this->addString(::x10aux::to_string(x));
    
}

//#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::add(
  x10_int x) {
    return this->addString(::x10aux::to_string(x));
    
}

//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::add(
  x10_long x) {
    return this->addString(::x10aux::to_string(x));
    
}

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::add(
  x10_float x) {
    return this->addString(::x10aux::to_string(x));
    
}

//#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::add(
  x10_double x) {
    return this->addString(::x10aux::to_string(x));
    
}

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::add(
  ::x10::lang::String* x) {
    return (::x10aux::struct_equals(x, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
      ? (this->addString((__extension__ ({ static ::x10::lang::String* strLit__130422 = ::x10aux::makeStringLit("null"); strLit__130422; }))))
      : (this->addString(x));
    
}

//#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::insert(
  x10_int p, x10_boolean x) {
    return this->insertString(p, ::x10aux::to_string(x));
    
}

//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::insert(
  x10_int p, x10_byte x) {
    return this->insertString(p, ::x10aux::to_string(x));
    
}

//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::insert(
  x10_int p, x10_char x) {
    return this->insertString(p, ::x10aux::to_string(x));
    
}

//#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::insert(
  x10_int p, x10_short x) {
    return this->insertString(p, ::x10aux::to_string(x));
    
}

//#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::insert(
  x10_int p, x10_int x) {
    return this->insertString(p, ::x10aux::to_string(x));
    
}

//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::insert(
  x10_int p, x10_long x) {
    return this->insertString(p, ::x10aux::to_string(x));
    
}

//#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::insert(
  x10_int p, x10_float x) {
    return this->insertString(p, ::x10aux::to_string(x));
    
}

//#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::insert(
  x10_int p, x10_double x) {
    return this->insertString(p, ::x10aux::to_string(x));
    
}

//#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::insert(
  x10_int p, ::x10::lang::String* x) {
    return (::x10aux::struct_equals(x, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
      ? (this->insertString(p, (__extension__ ({ static ::x10::lang::String* strLit__130423 = ::x10aux::makeStringLit("null"); strLit__130423; }))))
      : (this->insertString(p, x));
    
}

//#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::addString(
  ::x10::lang::String* s) {
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    {
        x10_int i;
        for (i = ((x10_int)0); ((i) < (::x10aux::nullCheck(s)->x10::lang::String::length()));
             i = ((i) + (((x10_int)1)))) {
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            x10_char ch = (s)->charAt(i);
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            ::x10aux::nullCheck(this->FMGL(buf))->x10::util::GrowableRail<x10_char>::add(
              ch);
        }
    }
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    return this;
    
}

//#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::insertString(
  x10_int pos, ::x10::lang::String* s) {
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    x10_int loc = pos;
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    if ((::x10aux::struct_equals(::x10aux::nullCheck(s)->x10::lang::String::length(),
                                 ((x10_int)0)))) {
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return this;
        
    }
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    if (((((x10_long)(loc))) > ((__extension__ ({
            ::x10::util::GrowableRail<x10_char>* this__122151 =
              this->FMGL(buf);
            ::x10aux::nullCheck(this__122151)->FMGL(size);
        }))
        ))) {
        
        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return this->addString(s);
        
    }
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    if (((loc) < (((x10_int)0)))) {
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        loc = ((x10_int)0);
    }
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    {
        x10_int i;
        for (i = ((x10_int)0); ((i) < (::x10aux::nullCheck(s)->x10::lang::String::length()));
             i = ((i) + (((x10_int)1)))) {
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            x10_char ch = (s)->charAt(i);
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            ::x10::util::GrowableRail<x10_char>* this__122159 =
              this->FMGL(buf);
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10_long idx__122160 = ((x10_long)(((loc) + (i))));
            x10_char v__122161 = ch;
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            if ((::x10aux::struct_equals(idx__122160, ::x10aux::nullCheck(this__122159)->FMGL(size))))
            {
                
                //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ::x10aux::nullCheck(this__122159)->x10::util::GrowableRail<x10_char>::add(
                  v__122161);
            } else {
                
                //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ::x10aux::nullCheck(::x10aux::nullCheck(this__122159)->FMGL(data))->x10::lang::Rail< x10_char >::__set(
                  idx__122160, v__122161);
            }
            
        }
    }
    
    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    return this;
    
}

//#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
x10_long x10::util::StringBuilder::length() {
    
    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    ::x10::util::GrowableRail<x10_char>* this__122162 = this->FMGL(buf);
    return ::x10aux::nullCheck(this__122162)->FMGL(size);
    
}

//#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::lang::String* x10::util::StringBuilder::result() {
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    ::x10::lang::Rail< x10_char >* rail = ::x10aux::nullCheck(this->FMGL(buf))->x10::util::GrowableRail<x10_char>::toRail();
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    return ::x10::lang::String::_make(rail, ((x10_long)(((x10_int)0))),
                                      (x10_long)(::x10aux::nullCheck(rail)->FMGL(size)));
    
}

//#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
::x10::util::StringBuilder* x10::util::StringBuilder::x10__util__StringBuilder____this__x10__util__StringBuilder(
  ) {
    return this;
    
}
void x10::util::StringBuilder::__fieldInitializers_x10_util_StringBuilder(
  ) {
 
}
const ::x10aux::serialization_id_t x10::util::StringBuilder::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::StringBuilder::_deserializer);

void x10::util::StringBuilder::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(buf));
    
}

::x10::lang::Reference* ::x10::util::StringBuilder::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::StringBuilder* this_ = new (::x10aux::alloc_z< ::x10::util::StringBuilder>()) ::x10::util::StringBuilder();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::StringBuilder::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(buf) = buf.read< ::x10::util::GrowableRail<x10_char>*>();
}

::x10aux::RuntimeType x10::util::StringBuilder::rtt;
void x10::util::StringBuilder::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::util::Builder< ::x10::lang::Any*, ::x10::lang::String*> >()};
    rtt.initStageTwo("x10.util.StringBuilder",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of StringBuilder */
/*************************************************/
