/*************************************************/
/* START of GLBParameters */
#include <x10/glb/GLBParameters.h>


//#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"

//#line 7 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"

//#line 8 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"

//#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"

//#line 10 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"

//#line 11 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
namespace x10 { namespace glb { 
class GLBParameters_ibox0 : public ::x10::lang::IBox< ::x10::glb::GLBParameters> {
public:
    static ::x10::lang::Any::itable< GLBParameters_ibox0 > itable;
    x10_boolean equals(::x10::lang::Any* arg0) {
        return this->value->equals(arg0);
    }
    x10_int hashCode() {
        return this->value->hashCode();
    }
    ::x10::lang::String* toString() {
        return this->value->toString();
    }
    ::x10::lang::String* typeName() {
        return this->value->typeName();
    }
    
};
::x10::lang::Any::itable< GLBParameters_ibox0 >  GLBParameters_ibox0::itable(&GLBParameters_ibox0::equals, &GLBParameters_ibox0::hashCode, &GLBParameters_ibox0::toString, &GLBParameters_ibox0::typeName);
} } 
::x10::lang::Any::itable< ::x10::glb::GLBParameters >  x10::glb::GLBParameters::_itable_0(&x10::glb::GLBParameters::equals, &x10::glb::GLBParameters::hashCode, &x10::glb::GLBParameters::toString, &x10::glb::GLBParameters::typeName);
::x10aux::itable_entry x10::glb::GLBParameters::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::glb::GLBParameters::_itable_0), ::x10aux::itable_entry(NULL, (void*)"::x10::glb::GLBParameters")};
::x10aux::itable_entry x10::glb::GLBParameters::_iboxitables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::glb::GLBParameters_ibox0::itable), ::x10aux::itable_entry(NULL, (void*)"::x10::glb::GLBParameters")};

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
x10_int x10::glb::GLBParameters::computeZ(x10_long p, x10_int l) {
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    x10_int z0 = ((x10_int)1);
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    x10_int zz = l;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    while (((((x10_long)(zz))) < (p))) {
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        z0 = ((z0) + (((x10_int)1)));
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        zz = ((zz) * (l));
    }
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    return z0;
    
}

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
/**
     * Returns a default glb parameter
     */
::x10::glb::GLBParameters x10::glb::GLBParameters::FMGL(Default);
void x10::glb::GLBParameters::FMGL(Default__do_init)() {
    FMGL(Default__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::glb::GLBParameters.Default");
    ::x10::glb::GLBParameters __var304__ = ::x10::glb::GLBParameters::_make(((x10_int)100),
                                                                            ((x10_int)4),
                                                                            ((x10_int)4),
                                                                            ::x10::glb::GLBParameters::computeZ(
                                                                              ((x10_long)::x10aux::num_hosts),
                                                                              ((x10_int)4)),
                                                                            ((x10_int)1024),
                                                                            ((x10_int)15));
    FMGL(Default) = __var304__;
    FMGL(Default__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::glb::GLBParameters::FMGL(Default__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(Default__status), &FMGL(Default__do_init), &FMGL(Default__exception), "x10::glb::GLBParameters.Default");
    
}
volatile ::x10aux::StaticInitController::status x10::glb::GLBParameters::FMGL(Default__status);
::x10::lang::CheckedThrowable* x10::glb::GLBParameters::FMGL(Default__exception);

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
/**
     * Show computation result.
     */
x10_int x10::glb::GLBParameters::FMGL(SHOW_RESULT_FLAG);
void x10::glb::GLBParameters::FMGL(SHOW_RESULT_FLAG__do_init)() {
    FMGL(SHOW_RESULT_FLAG__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::glb::GLBParameters.SHOW_RESULT_FLAG");
    x10_int __var305__ = ((x10_int)1);
    FMGL(SHOW_RESULT_FLAG) = __var305__;
    FMGL(SHOW_RESULT_FLAG__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::glb::GLBParameters::FMGL(SHOW_RESULT_FLAG__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(SHOW_RESULT_FLAG__status), &FMGL(SHOW_RESULT_FLAG__do_init), &FMGL(SHOW_RESULT_FLAG__exception), "x10::glb::GLBParameters.SHOW_RESULT_FLAG");
    
}
volatile ::x10aux::StaticInitController::status x10::glb::GLBParameters::FMGL(SHOW_RESULT_FLAG__status);
::x10::lang::CheckedThrowable* x10::glb::GLBParameters::FMGL(SHOW_RESULT_FLAG__exception);

//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
/**
     * Show work initialization, computation, result collection 
     */
x10_int x10::glb::GLBParameters::FMGL(SHOW_TIMING_FLAG);
void x10::glb::GLBParameters::FMGL(SHOW_TIMING_FLAG__do_init)() {
    FMGL(SHOW_TIMING_FLAG__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::glb::GLBParameters.SHOW_TIMING_FLAG");
    x10_int __var306__ = ((x10_int)2);
    FMGL(SHOW_TIMING_FLAG) = __var306__;
    FMGL(SHOW_TIMING_FLAG__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::glb::GLBParameters::FMGL(SHOW_TIMING_FLAG__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(SHOW_TIMING_FLAG__status), &FMGL(SHOW_TIMING_FLAG__do_init), &FMGL(SHOW_TIMING_FLAG__exception), "x10::glb::GLBParameters.SHOW_TIMING_FLAG");
    
}
volatile ::x10aux::StaticInitController::status x10::glb::GLBParameters::FMGL(SHOW_TIMING_FLAG__status);
::x10::lang::CheckedThrowable* x10::glb::GLBParameters::FMGL(SHOW_TIMING_FLAG__exception);

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
/**
     * Show logs produced by each task frame, i.e., each
     * task frame's computation time, yield time etc
     */
x10_int x10::glb::GLBParameters::FMGL(SHOW_TASKFRAME_LOG_FLAG);
void x10::glb::GLBParameters::FMGL(SHOW_TASKFRAME_LOG_FLAG__do_init)() {
    FMGL(SHOW_TASKFRAME_LOG_FLAG__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::glb::GLBParameters.SHOW_TASKFRAME_LOG_FLAG");
    x10_int __var307__ = ((x10_int)4);
    FMGL(SHOW_TASKFRAME_LOG_FLAG) = __var307__;
    FMGL(SHOW_TASKFRAME_LOG_FLAG__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::glb::GLBParameters::FMGL(SHOW_TASKFRAME_LOG_FLAG__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(SHOW_TASKFRAME_LOG_FLAG__status), &FMGL(SHOW_TASKFRAME_LOG_FLAG__do_init), &FMGL(SHOW_TASKFRAME_LOG_FLAG__exception), "x10::glb::GLBParameters.SHOW_TASKFRAME_LOG_FLAG");
    
}
volatile ::x10aux::StaticInitController::status x10::glb::GLBParameters::FMGL(SHOW_TASKFRAME_LOG_FLAG__status);
::x10::lang::CheckedThrowable* x10::glb::GLBParameters::FMGL(SHOW_TASKFRAME_LOG_FLAG__exception);

//#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
/**
     * Show GLB statistics 
     */
x10_int x10::glb::GLBParameters::FMGL(SHOW_GLB_FLAG);
void x10::glb::GLBParameters::FMGL(SHOW_GLB_FLAG__do_init)() {
    FMGL(SHOW_GLB_FLAG__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::glb::GLBParameters.SHOW_GLB_FLAG");
    x10_int __var308__ = ((x10_int)8);
    FMGL(SHOW_GLB_FLAG) = __var308__;
    FMGL(SHOW_GLB_FLAG__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::glb::GLBParameters::FMGL(SHOW_GLB_FLAG__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(SHOW_GLB_FLAG__status), &FMGL(SHOW_GLB_FLAG__do_init), &FMGL(SHOW_GLB_FLAG__exception), "x10::glb::GLBParameters.SHOW_GLB_FLAG");
    
}
volatile ::x10aux::StaticInitController::status x10::glb::GLBParameters::FMGL(SHOW_GLB_FLAG__status);
::x10::lang::CheckedThrowable* x10::glb::GLBParameters::FMGL(SHOW_GLB_FLAG__exception);

//#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
::x10::lang::String* x10::glb::GLBParameters::typeName(){
    return ::x10aux::type_name((*this));
}
::x10::lang::String* x10::glb::GLBParameters::toString() {
    return ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123552 = ::x10aux::makeStringLit("struct x10.glb.GLBParameters:"); strLit__123552; })), (__extension__ ({ static ::x10::lang::String* strLit__123553 = ::x10aux::makeStringLit(" n="); strLit__123553; }))), (*this)->FMGL(n)), (__extension__ ({ static ::x10::lang::String* strLit__123554 = ::x10aux::makeStringLit(" w="); strLit__123554; }))), (*this)->FMGL(w)), (__extension__ ({ static ::x10::lang::String* strLit__123555 = ::x10aux::makeStringLit(" l="); strLit__123555; }))), (*this)->FMGL(l)), (__extension__ ({ static ::x10::lang::String* strLit__123556 = ::x10aux::makeStringLit(" z="); strLit__123556; }))), (*this)->FMGL(z)), (__extension__ ({ static ::x10::lang::String* strLit__123557 = ::x10aux::makeStringLit(" m="); strLit__123557; }))), (*this)->FMGL(m)), (__extension__ ({ static ::x10::lang::String* strLit__123558 = ::x10aux::makeStringLit(" v="); strLit__123558; }))), (*this)->FMGL(v));
    
}
x10_int x10::glb::GLBParameters::hashCode() {
    x10_int result = ((x10_int)1);
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(n))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(w))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(l))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(z))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(m))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(v))));
    return result;
    
}
x10_boolean x10::glb::GLBParameters::equals(::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::glb::GLBParameters>(other)))
    {
        return false;
        
    }
    return (*this)->x10::glb::GLBParameters::equals(::x10aux::class_cast< ::x10::glb::GLBParameters>(other));
    
}
x10_boolean x10::glb::GLBParameters::_struct_equals(::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::glb::GLBParameters>(other)))
    {
        return false;
        
    }
    return (*this)->x10::glb::GLBParameters::_struct_equals(
             ::x10aux::class_cast< ::x10::glb::GLBParameters>(other));
    
}

//#line 5 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"

//#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"


//#line 5 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
void ::x10::glb::GLBParameters::_serialize(::x10::glb::GLBParameters this_, ::x10aux::serialization_buffer& buf) {
    buf.write(this_->FMGL(n));
    buf.write(this_->FMGL(w));
    buf.write(this_->FMGL(l));
    buf.write(this_->FMGL(z));
    buf.write(this_->FMGL(m));
    buf.write(this_->FMGL(v));
    
}

void ::x10::glb::GLBParameters::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(n) = buf.read<x10_int>();
    FMGL(w) = buf.read<x10_int>();
    FMGL(l) = buf.read<x10_int>();
    FMGL(z) = buf.read<x10_int>();
    FMGL(m) = buf.read<x10_int>();
    FMGL(v) = buf.read<x10_int>();
}


::x10aux::RuntimeType x10::glb::GLBParameters::rtt;
void x10::glb::GLBParameters::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Any>()};
    rtt.initStageTwo("x10.glb.GLBParameters",::x10aux::RuntimeType::struct_kind, 1, parents, 0, NULL, NULL);
    rtt.containsPtrs = false;
}

/* END of GLBParameters */
/*************************************************/
