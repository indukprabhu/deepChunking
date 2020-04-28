/*************************************************/
/* START of MainFrame */
#include <x10/compiler/ws/MainFrame.h>


//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/MainFrame.x10"


//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/MainFrame.x10"
void x10::compiler::ws::MainFrame::_constructor(x10_int id__50, ::x10::compiler::ws::MainFrame* o) {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/MainFrame.x10"
    (this)->::x10::compiler::ws::RegularFrame::_constructor(((x10_int)-1),
                                                            reinterpret_cast< ::x10::compiler::ws::RegularFrame*>(o));
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/MainFrame.x10"
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/MainFrame.x10"
    ::x10::compiler::ws::MainFrame* this__78005 = this;
    
}


//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/MainFrame.x10"

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/MainFrame.x10"
::x10::compiler::ws::MainFrame* x10::compiler::ws::MainFrame::x10__compiler__ws__MainFrame____this__x10__compiler__ws__MainFrame(
  ) {
    return this;
    
}
void x10::compiler::ws::MainFrame::__fieldInitializers_x10_compiler_ws_MainFrame(
  ) {
 
}
void x10::compiler::ws::MainFrame::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::compiler::ws::RegularFrame::_serialize_body(buf);
    
}

void x10::compiler::ws::MainFrame::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::ws::RegularFrame::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::compiler::ws::MainFrame::rtt;
void x10::compiler::ws::MainFrame::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::compiler::ws::RegularFrame>()};
    rtt.initStageTwo("x10.compiler.ws.MainFrame",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of MainFrame */
/*************************************************/
