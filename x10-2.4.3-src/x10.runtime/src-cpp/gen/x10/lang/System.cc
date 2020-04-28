/*************************************************/
/* START of System */
#include <x10/lang/System.h>


//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
void x10::lang::System::_constructor() {
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    ::x10::lang::System* this__104651 = this;
    
}
::x10::lang::System* x10::lang::System::_make() {
    ::x10::lang::System* this_ = new (::x10aux::alloc_z< ::x10::lang::System>()) ::x10::lang::System();
    this_->_constructor();
    return this_;
}



//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
x10_long x10::lang::System::currentTimeMillis() {
    return ::x10::lang::RuntimeNatives::currentTimeMillis();
    
}

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
x10_long x10::lang::System::nanoTime() {
    return ::x10::lang::RuntimeNatives::nanoTime();
    
}

//#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"

//#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
void x10::lang::System::setExitCode(x10_int exitCode){
    (::x10aux::exitCode = (exitCode));
}

//#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"

//#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"

//#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
::x10::util::Map< ::x10::lang::String*, ::x10::lang::String*>* x10::lang::System::getenv(
  ) {
    return reinterpret_cast< ::x10::util::Map< ::x10::lang::String*, ::x10::lang::String*>*>(::x10::lang::Runtime::FMGL(env__get)());
    
}

//#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
::x10::lang::String* x10::lang::System::getenv(::x10::lang::String* name) {
    return ::x10aux::nullCheck(::x10::lang::Runtime::FMGL(env__get)())->getOrElse(
             name, ::x10aux::class_cast_unchecked< ::x10::lang::String*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
}

//#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"

//#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"

//#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"

//#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"

//#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
::x10::lang::String* x10::lang::System::identityToString(
  ::x10::lang::Any* o) {
    return ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10aux::type_name(o), (__extension__ ({ static ::x10::lang::String* strLit__125758 = ::x10aux::makeStringLit("@"); strLit__125758; }))), ::x10::lang::IntNatives::toString(::x10aux::identity_hash_code(reinterpret_cast<x10::lang::Reference*>(o)), 16));
    
}

//#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
x10_boolean x10::lang::System::identityEquals(::x10::lang::Any* o1,
                                              ::x10::lang::Any* o2) {
    return (::x10aux::struct_equals(o1, o2));
    
}

//#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
x10_boolean x10::lang::System::sleep(x10_long millis) {
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    try {
        
        //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
        {
            
            //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10::lang::Runtime::FMGL(pool__get)()->increase();
        }
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        ::x10::lang::Thread::sleep(millis);
        
        //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
        {
            
            //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
              ((x10_int)1));
        }
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        return true;
        
    }
    catch (::x10::lang::CheckedThrowable* __exc1769) {
        if (::x10aux::instanceof< ::x10::lang::InterruptedException*>(__exc1769)) {
            ::x10::lang::InterruptedException* e = static_cast< ::x10::lang::InterruptedException*>(__exc1769);
            {
                
                //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
                {
                    
                    //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
                      ((x10_int)1));
                }
                
                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                return false;
                
            }
        } else
        throw;
    }
}

//#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
x10_boolean x10::lang::System::threadSleep(x10_long millis) {
    
    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    try {
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        ::x10::lang::Thread::sleep(millis);
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        return true;
        
    }
    catch (::x10::lang::CheckedThrowable* __exc1771) {
        if (::x10aux::instanceof< ::x10::lang::InterruptedException*>(__exc1771)) {
            ::x10::lang::InterruptedException* e = static_cast< ::x10::lang::InterruptedException*>(__exc1771);
            {
                
                //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                return false;
                
            }
        } else
        throw;
    }
}

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
::x10::lang::System* x10::lang::System::x10__lang__System____this__x10__lang__System(
  ) {
    return this;
    
}
void x10::lang::System::__fieldInitializers_x10_lang_System(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::System::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::System::_deserializer);

void x10::lang::System::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::lang::System::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::System* this_ = new (::x10aux::alloc_z< ::x10::lang::System>()) ::x10::lang::System();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::System::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::lang::System::rtt;
void x10::lang::System::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.System",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of System */
/*************************************************/
