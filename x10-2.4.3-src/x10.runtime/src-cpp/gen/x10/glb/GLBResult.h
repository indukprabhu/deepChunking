#ifndef __X10_GLB_GLBRESULT_H
#define __X10_GLB_GLBRESULT_H

#include <x10rt.h>


#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace glb { 

template<class TPMGL(R)> class GLBResult;
template <> class GLBResult<void>;
template<class TPMGL(R)> class GLBResult : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::lang::Rail< TPMGL(R) >* FMGL(result);
    
    x10_int FMGL(op);
    
    virtual x10_int getReduceOperator() = 0;
    virtual ::x10::lang::Rail< TPMGL(R) >* getResult() = 0;
    virtual void display(::x10::lang::Rail< TPMGL(R) >* id__54) = 0;
    virtual ::x10::lang::Rail< TPMGL(R) >* submitResult();
    virtual ::x10::glb::GLBResult<TPMGL(R)>* x10__glb__GLBResult____this__x10__glb__GLBResult(
      );
    void _constructor();
    
    virtual void __fieldInitializers_x10_glb_GLBResult();
    
    // Serialization
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(R)> ::x10aux::RuntimeType x10::glb::GLBResult<TPMGL(R)>::rtt;
template<class TPMGL(R)> void x10::glb::GLBResult<TPMGL(R)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::glb::GLBResult<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(R)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.glb.GLBResult";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 0, parents, 1, params, variances);
}

template <> class GLBResult<void> : public ::x10::lang::X10Class {
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    
};

} } 
#endif // X10_GLB_GLBRESULT_H

namespace x10 { namespace glb { 
template<class TPMGL(R)> class GLBResult;
} } 

#ifndef X10_GLB_GLBRESULT_H_NODEPS
#define X10_GLB_GLBRESULT_H_NODEPS
#include <x10/lang/Int.h>
#include <x10/lang/Rail.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_GLB_GLBRESULT_H_GENERICS
#define X10_GLB_GLBRESULT_H_GENERICS
#endif // X10_GLB_GLBRESULT_H_GENERICS
#ifndef X10_GLB_GLBRESULT_H_IMPLEMENTATION
#define X10_GLB_GLBRESULT_H_IMPLEMENTATION
#include <x10/glb/GLBResult.h>


//#line 8 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
/**
	 * Backing storage of result.
	 */

//#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
/**
	 * Reduction operator. Numbered the same as the operator defined in {@link x10.util.Team}
	 */

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
template<class TPMGL(R)> ::x10::lang::Rail< TPMGL(R) >* x10::glb::GLBResult<TPMGL(R)>::submitResult(
  ) {
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
    if ((::x10aux::struct_equals(this->FMGL(result), reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
        this->FMGL(result) = this->getResult();
    }
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
    return this->FMGL(result);
    
}

//#line 3 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
template<class TPMGL(R)> ::x10::glb::GLBResult<TPMGL(R)>*
  x10::glb::GLBResult<TPMGL(R)>::x10__glb__GLBResult____this__x10__glb__GLBResult(
  ) {
    return this;
    
}
template<class TPMGL(R)> void x10::glb::GLBResult<TPMGL(R)>::_constructor(
                           ) {
    ::x10::glb::GLBResult<TPMGL(R)>* this__80494 = this;
    ::x10aux::nullCheck(this__80494)->FMGL(result) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< TPMGL(R) >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    ::x10aux::nullCheck(this__80494)->FMGL(op) = ((x10_int)-1);
}

template<class TPMGL(R)> void x10::glb::GLBResult<TPMGL(R)>::__fieldInitializers_x10_glb_GLBResult(
  ) {
    this->FMGL(result) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< TPMGL(R) >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(op) = ((x10_int)-1);
}
template<class TPMGL(R)> void x10::glb::GLBResult<TPMGL(R)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(result));
    buf.write(this->FMGL(op));
    
}

template<class TPMGL(R)> void x10::glb::GLBResult<TPMGL(R)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(result) = buf.read< ::x10::lang::Rail< TPMGL(R) >*>();
    FMGL(op) = buf.read<x10_int>();
}

#endif // X10_GLB_GLBRESULT_H_IMPLEMENTATION
#endif // __X10_GLB_GLBRESULT_H_NODEPS
