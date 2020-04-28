/*************************************************/
/* START of MultipleExceptions */
#include <x10/lang/MultipleExceptions.h>

#include <x10/lang/Exception.h>
#include <x10/lang/Rail.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/compiler/Synthetic.h>

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
::x10::lang::Rail< ::x10::lang::Exception* >* x10::lang::MultipleExceptions::exceptions(
  ) {
    return this->FMGL(exceptions);
    
}

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
void x10::lang::MultipleExceptions::_constructor(::x10::util::GrowableRail< ::x10::lang::Exception*>* es) {
    (this)->::x10::lang::Exception::_constructor();
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    FMGL(exceptions) = ::x10aux::nullCheck(es)->x10::util::GrowableRail< ::x10::lang::Exception*>::toRail();
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    ::x10::lang::MultipleExceptions* this__103124 = this;
    
}
::x10::lang::MultipleExceptions* x10::lang::MultipleExceptions::_make(
  ::x10::util::GrowableRail< ::x10::lang::Exception*>* es) {
    ::x10::lang::MultipleExceptions* this_ = new (::x10aux::alloc_z< ::x10::lang::MultipleExceptions>()) ::x10::lang::MultipleExceptions();
    this_->_constructor(es);
    return this_;
}



//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
void x10::lang::MultipleExceptions::_constructor() {
    (this)->::x10::lang::Exception::_constructor();
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    FMGL(exceptions) = ::x10aux::class_cast_unchecked< ::x10::lang::Rail< ::x10::lang::Exception* >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    ::x10::lang::MultipleExceptions* this__103125 = this;
    
}
::x10::lang::MultipleExceptions* x10::lang::MultipleExceptions::_make(
  ) {
    ::x10::lang::MultipleExceptions* this_ = new (::x10aux::alloc_z< ::x10::lang::MultipleExceptions>()) ::x10::lang::MultipleExceptions();
    this_->_constructor();
    return this_;
}



//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
void x10::lang::MultipleExceptions::_constructor(::x10::lang::Exception* t) {
    (this)->::x10::lang::Exception::_constructor();
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    FMGL(exceptions) = ::x10::lang::Rail< ::x10::lang::Exception* >::_make(((x10_long)1ll),
                                                                           t);
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    ::x10::lang::MultipleExceptions* this__103126 = this;
    
}
::x10::lang::MultipleExceptions* x10::lang::MultipleExceptions::_make(
  ::x10::lang::Exception* t) {
    ::x10::lang::MultipleExceptions* this_ = new (::x10aux::alloc_z< ::x10::lang::MultipleExceptions>()) ::x10::lang::MultipleExceptions();
    this_->_constructor(t);
    return this_;
}



//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
void x10::lang::MultipleExceptions::printStackTrace() {
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    ::x10::lang::Rail< ::x10::lang::Exception* >* rail__103127 =
      this->FMGL(exceptions);
    x10_long size__103128 = (x10_long)(::x10aux::nullCheck(rail__103127)->FMGL(size));
    {
        x10_long idx__103129;
        for (idx__103129 = ((x10_long)0ll); ((idx__103129) < (size__103128));
             idx__103129 = ((idx__103129) + (((x10_long)1ll))))
        {
            ::x10::lang::Exception* t__103130 = ::x10aux::nullCheck(rail__103127)->x10::lang::Rail< ::x10::lang::Exception* >::__apply(
                                                  idx__103129);
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
            ::x10aux::nullCheck(t__103130)->printStackTrace();
        }
    }
    
}

//#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
::x10::lang::MultipleExceptions* x10::lang::MultipleExceptions::make(
  ::x10::util::GrowableRail< ::x10::lang::Exception*>* es) {
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    if (((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  es)) || (::x10aux::struct_equals(::x10aux::nullCheck(es)->FMGL(size),
                                                                   ((x10_long)0ll)))))
    {
        return ::x10aux::class_cast_unchecked< ::x10::lang::MultipleExceptions*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
    }
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    return ::x10::lang::MultipleExceptions::_make(es);
    
}

//#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
::x10::lang::MultipleExceptions* x10::lang::MultipleExceptions::make(
  ::x10::lang::Exception* t) {
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                 t))) {
        return ::x10aux::class_cast_unchecked< ::x10::lang::MultipleExceptions*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
    }
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    return ::x10::lang::MultipleExceptions::_make(t);
    
}

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
::x10::lang::MultipleExceptions* x10::lang::MultipleExceptions::x10__lang__MultipleExceptions____this__x10__lang__MultipleExceptions(
  ) {
    return this;
    
}
void x10::lang::MultipleExceptions::__fieldInitializers_x10_lang_MultipleExceptions(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::MultipleExceptions::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::MultipleExceptions::_deserializer);

void x10::lang::MultipleExceptions::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    buf.write(this->FMGL(exceptions));
    
}

::x10::lang::Reference* ::x10::lang::MultipleExceptions::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::MultipleExceptions* this_ = new (::x10aux::alloc_z< ::x10::lang::MultipleExceptions>()) ::x10::lang::MultipleExceptions();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::MultipleExceptions::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    FMGL(exceptions) = buf.read< ::x10::lang::Rail< ::x10::lang::Exception* >*>();
}

::x10aux::RuntimeType x10::lang::MultipleExceptions::rtt;
void x10::lang::MultipleExceptions::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.lang.MultipleExceptions",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of MultipleExceptions */
/*************************************************/
