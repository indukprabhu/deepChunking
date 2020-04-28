/*************************************************/
/* START of ConsoleLogFactory */
#include <x10/util/logging/ConsoleLogFactory.h>


//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
void x10::util::logging::ConsoleLogFactory::_constructor() {
    (this)->::x10::util::logging::LogFactory::_constructor();
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
    this->x10::util::logging::ConsoleLogFactory::__fieldInitializers_x10_util_logging_ConsoleLogFactory();
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
    this->FMGL(attributes) = (reinterpret_cast< ::x10::util::Map< ::x10::lang::String*, ::x10::lang::Any*>*>((__extension__ ({
                                  ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Any*>* alloc__117671 =
                                     (new (::x10aux::alloc_z< ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Any*> >()) ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Any*>());
                                  (alloc__117671)->::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Any*>::_constructor();
                                  alloc__117671;
                              }))
                              ));
}
::x10::util::logging::ConsoleLogFactory* x10::util::logging::ConsoleLogFactory::_make(
  ) {
    ::x10::util::logging::ConsoleLogFactory* this_ = new (::x10aux::alloc_z< ::x10::util::logging::ConsoleLogFactory>()) ::x10::util::logging::ConsoleLogFactory();
    this_->_constructor();
    return this_;
}



//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
void x10::util::logging::ConsoleLogFactory::release() {
 
}

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
::x10::util::logging::Log* x10::util::logging::ConsoleLogFactory::getInstance(
  ::x10::lang::String* name) {
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
    return reinterpret_cast< ::x10::util::logging::Log*>(::x10::util::logging::ConsoleLogger::_make(name));
    
}

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
::x10::lang::Rail< ::x10::lang::String* >* x10::util::logging::ConsoleLogFactory::getAttributeNames(
  ) {
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
    return ::x10::util::logging::ConsoleLogFactory::toRail< ::x10::lang::String* >(
             reinterpret_cast< ::x10::util::Container< ::x10::lang::String*>*>(::x10::util::Map< ::x10::lang::String*, ::x10::lang::Any*>::keySet(::x10aux::nullCheck(this->FMGL(attributes)))));
    
}

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
::x10::lang::Any* x10::util::logging::ConsoleLogFactory::getAttribute(
  ::x10::lang::String* name) {
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
    return ::x10::util::Map< ::x10::lang::String*, ::x10::lang::Any*>::getOrElse(::x10aux::nullCheck(this->FMGL(attributes)), 
             name, ::x10aux::class_cast_unchecked< ::x10::lang::Any*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
}

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
void x10::util::logging::ConsoleLogFactory::setAttribute(
  ::x10::lang::String* name, ::x10::lang::Any* value) {
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
    ::x10::util::Map< ::x10::lang::String*, ::x10::lang::Any*>::put(::x10aux::nullCheck(this->FMGL(attributes)), 
      name, value);
}

//#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
void x10::util::logging::ConsoleLogFactory::removeAttribute(
  ::x10::lang::String* name) {
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
    ::x10::util::Map< ::x10::lang::String*, ::x10::lang::Any*>::remove(::x10aux::nullCheck(this->FMGL(attributes)), 
      name);
}

//#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"

//#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"

//#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
::x10::util::logging::LogFactory* x10::util::logging::ConsoleLogFactory::getFactory(
  ) {
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
    ::x10::util::logging::ConsoleLogFactory::FMGL(factoryLock__get)()->lock();
    {
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
        ::x10::lang::CheckedThrowable* throwable__117675 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                
                //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
                if ((::x10aux::struct_equals(::x10aux::nullCheck(::x10::util::logging::ConsoleLogFactory::FMGL(factory__get)())->x10::lang::Cell< ::x10::util::logging::LogFactory*>::__apply(),
                                             reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
                {
                    
                    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
                    ::x10aux::nullCheck(::x10::util::logging::ConsoleLogFactory::FMGL(factory__get)())->x10::lang::Cell< ::x10::util::logging::LogFactory*>::__set(
                      reinterpret_cast< ::x10::util::logging::LogFactory*>(::x10::util::logging::ConsoleLogFactory::_make()));
                }
                {
                    
                    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
                    ::x10::util::logging::LogFactory* t__117674 =
                      ::x10aux::nullCheck(::x10::util::logging::ConsoleLogFactory::FMGL(factory__get)())->x10::lang::Cell< ::x10::util::logging::LogFactory*>::__apply();
                    {
                        
                        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
                        ::x10::util::logging::ConsoleLogFactory::FMGL(factoryLock__get)()->unlock();
                    }
                    return t__117674;
                    
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc2715) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__117676 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc2715);
                {
                    throwable__117675 = formal__117676;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__117675)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__117675))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__117675));
            }
            
        }
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
        if (true) {
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
            ::x10::util::logging::ConsoleLogFactory::FMGL(factoryLock__get)()->unlock();
        }
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__117675)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__117675)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__117675));
            }
            
        }
        
    }
}

//#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
void x10::util::logging::ConsoleLogFactory::releaseAll() {
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
    ::x10::util::logging::ConsoleLogFactory::FMGL(factoryLock__get)()->lock();
    {
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
        ::x10::lang::CheckedThrowable* throwable__117678 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
                ::x10aux::nullCheck(::x10::util::logging::ConsoleLogFactory::FMGL(factory__get)())->x10::lang::Cell< ::x10::util::logging::LogFactory*>::__set(
                  ::x10aux::class_cast_unchecked< ::x10::util::logging::LogFactory*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc2717) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__117679 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc2717);
                {
                    throwable__117678 = formal__117679;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__117678)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__117678))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__117678));
            }
            
        }
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
        if (true) {
            
            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
            ::x10::util::logging::ConsoleLogFactory::FMGL(factoryLock__get)()->unlock();
        }
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__117678)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__117678)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__117678));
            }
            
        }
        
    }
}

//#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
::x10::lang::Cell< ::x10::util::logging::LogFactory*>* x10::util::logging::ConsoleLogFactory::FMGL(factory);
void x10::util::logging::ConsoleLogFactory::FMGL(factory__do_init)() {
    FMGL(factory__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::logging::ConsoleLogFactory.factory");
    ::x10::lang::Cell< ::x10::util::logging::LogFactory*>* __var2718__ = ::x10::lang::Cell< ::x10::util::logging::LogFactory*>::_make(::x10aux::class_cast_unchecked< ::x10::util::logging::LogFactory*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    FMGL(factory) = __var2718__;
    FMGL(factory__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::logging::ConsoleLogFactory::FMGL(factory__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(factory__status), &FMGL(factory__do_init), &FMGL(factory__exception), "x10::util::logging::ConsoleLogFactory.factory");
    
}
volatile ::x10aux::StaticInitController::status x10::util::logging::ConsoleLogFactory::FMGL(factory__status);
::x10::lang::CheckedThrowable* x10::util::logging::ConsoleLogFactory::FMGL(factory__exception);

//#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
::x10::util::concurrent::Lock* x10::util::logging::ConsoleLogFactory::FMGL(factoryLock);
void x10::util::logging::ConsoleLogFactory::FMGL(factoryLock__do_init)() {
    FMGL(factoryLock__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::logging::ConsoleLogFactory.factoryLock");
    ::x10::util::concurrent::Lock* __var2719__ = ::x10::util::concurrent::Lock::_make();
    FMGL(factoryLock) = __var2719__;
    FMGL(factoryLock__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::logging::ConsoleLogFactory::FMGL(factoryLock__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(factoryLock__status), &FMGL(factoryLock__do_init), &FMGL(factoryLock__exception), "x10::util::logging::ConsoleLogFactory.factoryLock");
    
}
volatile ::x10aux::StaticInitController::status x10::util::logging::ConsoleLogFactory::FMGL(factoryLock__status);
::x10::lang::CheckedThrowable* x10::util::logging::ConsoleLogFactory::FMGL(factoryLock__exception);

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogFactory.x10"
::x10::util::logging::ConsoleLogFactory* x10::util::logging::ConsoleLogFactory::x10__util__logging__ConsoleLogFactory____this__x10__util__logging__ConsoleLogFactory(
  ) {
    return this;
    
}
void x10::util::logging::ConsoleLogFactory::__fieldInitializers_x10_util_logging_ConsoleLogFactory(
  ) {
 
}
const ::x10aux::serialization_id_t x10::util::logging::ConsoleLogFactory::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::logging::ConsoleLogFactory::_deserializer);

void x10::util::logging::ConsoleLogFactory::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::util::logging::LogFactory::_serialize_body(buf);
    buf.write(this->FMGL(attributes));
    
}

::x10::lang::Reference* ::x10::util::logging::ConsoleLogFactory::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::logging::ConsoleLogFactory* this_ = new (::x10aux::alloc_z< ::x10::util::logging::ConsoleLogFactory>()) ::x10::util::logging::ConsoleLogFactory();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::logging::ConsoleLogFactory::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::util::logging::LogFactory::_deserialize_body(buf);
    FMGL(attributes) = buf.read< ::x10::util::Map< ::x10::lang::String*, ::x10::lang::Any*>*>();
    
}

::x10aux::RuntimeType x10::util::logging::ConsoleLogFactory::rtt;
void x10::util::logging::ConsoleLogFactory::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::util::logging::LogFactory>()};
    rtt.initStageTwo("x10.util.logging.ConsoleLogFactory",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of ConsoleLogFactory */
/*************************************************/
