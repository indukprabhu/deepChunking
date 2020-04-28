/*************************************************/
/* START of LogFactory */
#include <x10/util/logging/LogFactory.h>


//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"
::x10::util::logging::LogFactory* x10::util::logging::LogFactory::getFactory(
  ) {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"
    return ::x10::util::logging::ConsoleLogFactory::getFactory();
    
}

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"
void x10::util::logging::LogFactory::releaseAll() {
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"
    ::x10::util::logging::ConsoleLogFactory::releaseAll();
}

//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"

//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"

//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"

//#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"
::x10::util::logging::Log* x10::util::logging::LogFactory::getLog(::x10::lang::String* name) {
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"
    return ::x10aux::nullCheck(::x10::util::logging::LogFactory::getFactory())->getInstance(
             name);
    
}

//#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"

//#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"
::x10::lang::String* x10::util::logging::LogFactory::objectId(::x10::lang::Any* o) {
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"
    if ((::x10aux::struct_equals(o, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"
        return (__extension__ ({ static ::x10::lang::String* strLit__129655 = ::x10aux::makeStringLit("null"); strLit__129655; }));
        
    }
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"
    return ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10aux::type_name(o), (__extension__ ({ static ::x10::lang::String* strLit__129656 = ::x10aux::makeStringLit("@"); strLit__129656; }))), ::x10aux::identity_hash_code(reinterpret_cast<x10::lang::Reference*>(o)));
    
}

//#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"
::x10::util::logging::LogFactory* x10::util::logging::LogFactory::x10__util__logging__LogFactory____this__x10__util__logging__LogFactory(
  ) {
    return this;
    
}

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"
void x10::util::logging::LogFactory::_constructor() {
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"
    this->x10::util::logging::LogFactory::__fieldInitializers_x10_util_logging_LogFactory();
}


//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/LogFactory.x10"
void x10::util::logging::LogFactory::__fieldInitializers_x10_util_logging_LogFactory(
  ) {
 
}
void x10::util::logging::LogFactory::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

void x10::util::logging::LogFactory::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::util::logging::LogFactory::rtt;
void x10::util::logging::LogFactory::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.util.logging.LogFactory",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of LogFactory */
/*************************************************/
