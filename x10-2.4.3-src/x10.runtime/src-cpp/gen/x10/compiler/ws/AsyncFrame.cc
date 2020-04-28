/*************************************************/
/* START of AsyncFrame */
#include <x10/compiler/ws/AsyncFrame.h>


//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"


//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
void x10::compiler::ws::AsyncFrame::_constructor(x10_int id__48, ::x10::compiler::ws::AsyncFrame* o) {
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
    ::x10::compiler::ws::Frame* this__76823 = this;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    ::x10::compiler::ws::Frame* up__76824 = reinterpret_cast< ::x10::compiler::ws::Frame*>(::x10aux::nullCheck(reinterpret_cast< ::x10::compiler::ws::FinishFrame* >(::x10aux::nullCheck(o)->FMGL(up)))->FMGL(redirect));
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    ::x10aux::nullCheck(this__76823)->FMGL(up) = up__76824;
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
    ::x10::compiler::ws::AsyncFrame* this__76822 = this;
    
}


//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
::x10::compiler::ws::FinishFrame* x10::compiler::ws::AsyncFrame::ff() {
    return reinterpret_cast< ::x10::compiler::ws::FinishFrame* >(this->FMGL(up));
    
}

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
void x10::compiler::ws::AsyncFrame::poll(::x10::compiler::ws::Worker* worker) {
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
    if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                 ::x10aux::nullCheck(worker)->FMGL(deque)->x10::lang::Deque::poll())))
    {
        this->x10::compiler::ws::AsyncFrame::pollSlow(worker);
    }
    
}

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
void x10::compiler::ws::AsyncFrame::pollSlow(::x10::compiler::ws::Worker* worker) {
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
    ::x10::util::concurrent::Lock* lock = ::x10aux::nullCheck(worker)->FMGL(lock);
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
    lock->lock();
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
    lock->unlock();
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
    ::x10::compiler::ws::FinishFrame* ff = (__extension__ ({
        ::x10::compiler::ws::AsyncFrame* this__76038 = this;
        reinterpret_cast< ::x10::compiler::ws::FinishFrame* >(::x10aux::nullCheck(this__76038)->FMGL(up));
    }))
    ;
    {
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        ::x10::compiler::ws::FinishFrame* ff_redirect = ::x10aux::nullCheck(ff)->FMGL(redirect);
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        if ((!::x10aux::struct_equals(ff, ff_redirect))) {
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
            this->move(ff_redirect);
            
            //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            ::x10::compiler::ws::FinishFrame* ff__76827 =
              ff;
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            ::x10::util::GrowableRail< ::x10::lang::Exception*>* s__76826 =
              ::x10aux::nullCheck(ff__76827)->FMGL(exceptions);
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                          s__76826))) {
                
                //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->lock();
                
                //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                             ::x10aux::nullCheck(ff_redirect)->FMGL(exceptions))))
                {
                    ::x10aux::nullCheck(ff_redirect)->FMGL(exceptions) =
                      (__extension__ ({
                        ::x10::util::GrowableRail< ::x10::lang::Exception*>* alloc__76825 =
                           (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Exception*> >()) ::x10::util::GrowableRail< ::x10::lang::Exception*>());
                        
                        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        (alloc__76825)->::x10::util::GrowableRail< ::x10::lang::Exception*>::_constructor(
                          ((x10_long)0ll));
                        alloc__76825;
                    }))
                    ;
                }
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                while (!((::x10aux::struct_equals(::x10aux::nullCheck(s__76826)->FMGL(size),
                                                  ((x10_long)0ll)))))
                {
                    ::x10aux::nullCheck(::x10aux::nullCheck(ff_redirect)->FMGL(exceptions))->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
                      ::x10aux::nullCheck(s__76826)->x10::util::GrowableRail< ::x10::lang::Exception*>::removeLast());
                }
                
                //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->unlock();
            }
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
            ff = ff_redirect;
        }
        
    }
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
    ::x10aux::nullCheck(worker)->x10::compiler::ws::Worker::unroll(
      reinterpret_cast< ::x10::compiler::ws::Frame*>(ff));
}

//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
void x10::compiler::ws::AsyncFrame::caught(::x10::lang::Exception* t) {
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
    ::x10aux::nullCheck((__extension__ ({
        ::x10::compiler::ws::AsyncFrame* this__76818 = this;
        reinterpret_cast< ::x10::compiler::ws::FinishFrame* >(::x10aux::nullCheck(this__76818)->FMGL(up));
    }))
    )->x10::compiler::ws::FinishFrame::caught(t);
}

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
::x10::compiler::ws::AsyncFrame* x10::compiler::ws::AsyncFrame::x10__compiler__ws__AsyncFrame____this__x10__compiler__ws__AsyncFrame(
  ) {
    return this;
    
}
void x10::compiler::ws::AsyncFrame::__fieldInitializers_x10_compiler_ws_AsyncFrame(
  ) {
 
}
void x10::compiler::ws::AsyncFrame::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::compiler::ws::Frame::_serialize_body(buf);
    
}

void x10::compiler::ws::AsyncFrame::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::ws::Frame::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::compiler::ws::AsyncFrame::rtt;
void x10::compiler::ws::AsyncFrame::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::compiler::ws::Frame>()};
    rtt.initStageTwo("x10.compiler.ws.AsyncFrame",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of AsyncFrame */
/*************************************************/
