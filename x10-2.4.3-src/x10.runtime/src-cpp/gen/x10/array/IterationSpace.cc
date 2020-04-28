/*************************************************/
/* START of IterationSpace */
#include <x10/array/IterationSpace.h>

#include <x10/lang/Iterable.h>
#include <x10/lang/Point.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Iterator.h>
#include <x10/lang/String.h>
#include <x10/util/StringBuilder.h>
#include <x10/lang/Int.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Synthetic.h>

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
void x10::array::IterationSpace::_constructor(x10_long rank, x10_boolean rect) {
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    FMGL(rank) = rank;
    FMGL(rect) = rect;
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    ::x10::array::IterationSpace* this__76005 = this;
    
}


//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
::x10::lang::String* x10::array::IterationSpace::toString() {
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    ::x10::util::StringBuilder* sb =  (new (::x10aux::alloc_z< ::x10::util::StringBuilder>()) ::x10::util::StringBuilder());
    (sb)->::x10::util::StringBuilder::_constructor();
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    ::x10::lang::Iterator< ::x10::lang::Point*>* it = this->iterator();
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    sb->add((__extension__ ({ static ::x10::lang::String* strLit__123513 = ::x10aux::makeStringLit("{"); strLit__123513; })));
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    {
        x10_int c;
        for (c = ((x10_int)0); (((c) < (((x10_int)10))) && ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(it)));
             c = ((c) + (((x10_int)1)))) {
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            reinterpret_cast< ::x10::util::StringBuilder*>(sb->add(
                                                             reinterpret_cast< ::x10::lang::Any*>(::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(it)))));
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            if (::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(it)))
            {
                sb->add((__extension__ ({ static ::x10::lang::String* strLit__123516 = ::x10aux::makeStringLit(", "); strLit__123516; })));
            }
            
        }
    }
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    if (::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(it)))
    {
        sb->add((__extension__ ({ static ::x10::lang::String* strLit__123518 = ::x10aux::makeStringLit("..."); strLit__123518; })));
    }
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    sb->add((__extension__ ({ static ::x10::lang::String* strLit__123520 = ::x10aux::makeStringLit("}"); strLit__123520; })));
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    return sb->toString();
    
}

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
::x10::array::IterationSpace* x10::array::IterationSpace::x10__array__IterationSpace____this__x10__array__IterationSpace(
  ) {
    return this;
    
}
void x10::array::IterationSpace::__fieldInitializers_x10_array_IterationSpace(
  ) {
 
}
void x10::array::IterationSpace::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(rank));
    buf.write(this->FMGL(rect));
    
}

void x10::array::IterationSpace::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(rank) = buf.read<x10_long>();
    FMGL(rect) = buf.read<x10_boolean>();
}

::x10aux::RuntimeType x10::array::IterationSpace::rtt;
void x10::array::IterationSpace::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >()};
    rtt.initStageTwo("x10.array.IterationSpace",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of IterationSpace */
/*************************************************/
