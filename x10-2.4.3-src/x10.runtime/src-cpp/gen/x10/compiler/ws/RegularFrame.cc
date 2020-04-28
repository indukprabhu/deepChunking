/*************************************************/
/* START of RegularFrame */
#include <x10/compiler/ws/RegularFrame.h>


//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"


//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
void x10::compiler::ws::RegularFrame::_constructor(x10_int id__51, ::x10::compiler::ws::RegularFrame* o) {
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    ::x10::compiler::ws::Frame* this__78029 = this;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    ::x10::compiler::ws::Frame* up__78030 = ::x10aux::nullCheck(::x10aux::nullCheck(o)->FMGL(up))->realloc();
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    ::x10aux::nullCheck(this__78029)->FMGL(up) = up__78030;
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    ::x10::compiler::ws::RegularFrame* this__78028 = this;
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    this->FMGL(ff) = ::x10aux::nullCheck(::x10aux::nullCheck(o)->FMGL(ff))->FMGL(redirect);
}


//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
void x10::compiler::ws::RegularFrame::push(::x10::compiler::ws::Worker* worker) {
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    ::x10aux::nullCheck(worker)->FMGL(deque)->x10::lang::Deque::push(reinterpret_cast< ::x10::lang::Any*>(this));
}

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
void x10::compiler::ws::RegularFrame::continueLater(::x10::compiler::ws::Worker* worker) {
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    ::x10aux::nullCheck(worker)->x10::compiler::ws::Worker::migrate();
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    ::x10::compiler::ws::RegularFrame* k = this;
    {
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        k = reinterpret_cast< ::x10::compiler::ws::RegularFrame*>(::x10aux::nullCheck(k)->remap());
    }
    
    //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Any* k__78031 = reinterpret_cast< ::x10::lang::Any*>(k);
    
    //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck(::x10::lang::Runtime::FMGL(pool__get)()->FMGL(wsBlockedContinuations))->x10::lang::Deque::push(
      k__78031);
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::compiler::Abort::FMGL(ABORT__get)()));
}

//#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
void x10::compiler::ws::RegularFrame::continueNow(::x10::compiler::ws::Worker* worker) {
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    ::x10aux::nullCheck(worker)->x10::compiler::ws::Worker::migrate();
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    ::x10::compiler::ws::RegularFrame* k = this;
    {
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        k = reinterpret_cast< ::x10::compiler::ws::RegularFrame*>(::x10aux::nullCheck(k)->remap());
    }
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    ::x10aux::nullCheck(::x10aux::nullCheck(worker)->FMGL(fifo))->x10::lang::Deque::push(
      reinterpret_cast< ::x10::lang::Any*>(k));
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::compiler::Abort::FMGL(ABORT__get)()));
}

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
::x10::compiler::ws::RegularFrame* x10::compiler::ws::RegularFrame::x10__compiler__ws__RegularFrame____this__x10__compiler__ws__RegularFrame(
  ) {
    return this;
    
}
void x10::compiler::ws::RegularFrame::__fieldInitializers_x10_compiler_ws_RegularFrame(
  ) {
 
}
void x10::compiler::ws::RegularFrame::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::compiler::ws::Frame::_serialize_body(buf);
    buf.write(this->FMGL(ff));
    
}

void x10::compiler::ws::RegularFrame::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::ws::Frame::_deserialize_body(buf);
    FMGL(ff) = buf.read< ::x10::compiler::ws::FinishFrame*>();
}

::x10aux::RuntimeType x10::compiler::ws::RegularFrame::rtt;
void x10::compiler::ws::RegularFrame::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::compiler::ws::Frame>()};
    rtt.initStageTwo("x10.compiler.ws.RegularFrame",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of RegularFrame */
/*************************************************/
