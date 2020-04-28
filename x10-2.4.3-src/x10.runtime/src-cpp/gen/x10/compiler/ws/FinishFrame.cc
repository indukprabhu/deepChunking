/*************************************************/
/* START of FinishFrame */
#include <x10/compiler/ws/FinishFrame.h>


//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"


//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
void x10::compiler::ws::FinishFrame::_constructor(x10_int id__49, ::x10::compiler::ws::FinishFrame* o) {
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    ::x10::compiler::ws::Frame* this__77989 = this;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    ::x10::compiler::ws::Frame* up__77990 = ::x10aux::nullCheck(::x10aux::nullCheck(o)->FMGL(up))->realloc();
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    ::x10aux::nullCheck(this__77989)->FMGL(up) = up__77990;
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    ::x10::compiler::ws::FinishFrame* this__77988 = this;
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    this->FMGL(asyncs) = ((x10_int)1);
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    this->FMGL(exceptions) = (::x10aux::class_cast_unchecked< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}


//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"

//#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
::x10::compiler::ws::Frame* x10::compiler::ws::FinishFrame::realloc() {
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  this->FMGL(redirect)))) {
        return reinterpret_cast< ::x10::compiler::ws::Frame*>(this->FMGL(redirect));
        
    }
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    ::x10::compiler::ws::FinishFrame* tmp = reinterpret_cast< ::x10::compiler::ws::FinishFrame*>(this->remap());
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    ::x10aux::nullCheck(tmp)->FMGL(redirect) = tmp;
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  this->FMGL(exceptions))))
    {
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        ::x10aux::nullCheck(tmp)->FMGL(exceptions) = (__extension__ ({
            ::x10::util::GrowableRail< ::x10::lang::Exception*>* alloc__76046 =
               (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Exception*> >()) ::x10::util::GrowableRail< ::x10::lang::Exception*>());
            (alloc__76046)->::x10::util::GrowableRail< ::x10::lang::Exception*>::_constructor(
              (__extension__ ({
                  ::x10::util::GrowableRail< ::x10::lang::Exception*>* this__77033 =
                    this->FMGL(exceptions);
                  ::x10aux::nullCheck(this__77033)->FMGL(size);
              }))
              );
            alloc__76046;
        }))
        ;
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->lock();
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        while (!((__extension__ ({
                   ::x10::util::GrowableRail< ::x10::lang::Exception*>* this__77034 =
                     this->FMGL(exceptions);
                   (::x10aux::struct_equals(::x10aux::nullCheck(this__77034)->FMGL(size),
                                            ((x10_long)0ll)));
               }))
               )) {
            ::x10aux::nullCheck(::x10aux::nullCheck(tmp)->FMGL(exceptions))->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
              ::x10aux::nullCheck(this->FMGL(exceptions))->x10::util::GrowableRail< ::x10::lang::Exception*>::removeLast());
        }
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        this->FMGL(exceptions) = (::x10aux::class_cast_unchecked< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->unlock();
    }
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    this->FMGL(redirect) = tmp;
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    return reinterpret_cast< ::x10::compiler::ws::Frame*>(tmp);
    
}

//#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
void x10::compiler::ws::FinishFrame::wrapBack(::x10::compiler::ws::Worker* worker,
                                              ::x10::compiler::ws::Frame* frame) {
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  ::x10aux::nullCheck(worker)->FMGL(throwable))))
    {
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        this->x10::compiler::ws::FinishFrame::caught(::x10aux::nullCheck(worker)->FMGL(throwable));
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        ::x10aux::nullCheck(worker)->FMGL(throwable) = (::x10aux::class_cast_unchecked< ::x10::lang::Exception*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
    
}

//#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
void x10::compiler::ws::FinishFrame::wrapResume(::x10::compiler::ws::Worker* worker) {
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    x10_int n;
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->lock();
    n = this->FMGL(asyncs) = ((this->FMGL(asyncs)) - (((x10_int)1)));
    ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->unlock();
    
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    if ((!::x10aux::struct_equals(((x10_int)0), n))) {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::compiler::Abort::FMGL(ABORT__get)()));
    }
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    ::x10aux::nullCheck(worker)->FMGL(throwable) = ::x10::lang::MultipleExceptions::make(
                                                     this->FMGL(exceptions));
}

//#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
void x10::compiler::ws::FinishFrame::append(::x10::util::GrowableRail< ::x10::lang::Exception*>* s) {
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  s))) {
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->lock();
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                     this->FMGL(exceptions))))
        {
            this->FMGL(exceptions) = (__extension__ ({
                ::x10::util::GrowableRail< ::x10::lang::Exception*>* alloc__76047 =
                   (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Exception*> >()) ::x10::util::GrowableRail< ::x10::lang::Exception*>());
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                (alloc__76047)->::x10::util::GrowableRail< ::x10::lang::Exception*>::_constructor(
                  ((x10_long)0ll));
                alloc__76047;
            }))
            ;
        }
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        while (!((::x10aux::struct_equals(::x10aux::nullCheck(s)->FMGL(size),
                                          ((x10_long)0ll)))))
        {
            ::x10aux::nullCheck(this->FMGL(exceptions))->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
              ::x10aux::nullCheck(s)->x10::util::GrowableRail< ::x10::lang::Exception*>::removeLast());
        }
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->unlock();
    }
    
}

//#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
void x10::compiler::ws::FinishFrame::append(::x10::compiler::ws::FinishFrame* ff) {
    
    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    ::x10::compiler::ws::FinishFrame* this__77992 = this;
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    ::x10::util::GrowableRail< ::x10::lang::Exception*>* s__77993 =
      ::x10aux::nullCheck(ff)->FMGL(exceptions);
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  s__77993))) {
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->lock();
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                     ::x10aux::nullCheck(this__77992)->FMGL(exceptions))))
        {
            ::x10aux::nullCheck(this__77992)->FMGL(exceptions) =
              (__extension__ ({
                ::x10::util::GrowableRail< ::x10::lang::Exception*>* alloc__77991 =
                   (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Exception*> >()) ::x10::util::GrowableRail< ::x10::lang::Exception*>());
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                (alloc__77991)->::x10::util::GrowableRail< ::x10::lang::Exception*>::_constructor(
                  ((x10_long)0ll));
                alloc__77991;
            }))
            ;
        }
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        while (!((::x10aux::struct_equals(::x10aux::nullCheck(s__77993)->FMGL(size),
                                          ((x10_long)0ll)))))
        {
            ::x10aux::nullCheck(::x10aux::nullCheck(this__77992)->FMGL(exceptions))->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
              ::x10aux::nullCheck(s__77993)->x10::util::GrowableRail< ::x10::lang::Exception*>::removeLast());
        }
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->unlock();
    }
    
}

//#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
void x10::compiler::ws::FinishFrame::caught(::x10::lang::Exception* t) {
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    if ((::x10aux::struct_equals(t, ::x10::compiler::Abort::FMGL(ABORT__get)())))
    {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::compiler::Abort::FMGL(ABORT__get)()));
    }
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->lock();
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                 this->FMGL(exceptions))))
    {
        this->FMGL(exceptions) = (__extension__ ({
            ::x10::util::GrowableRail< ::x10::lang::Exception*>* alloc__76048 =
               (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Exception*> >()) ::x10::util::GrowableRail< ::x10::lang::Exception*>());
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            (alloc__76048)->::x10::util::GrowableRail< ::x10::lang::Exception*>::_constructor(
              ((x10_long)0ll));
            alloc__76048;
        }))
        ;
    }
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    ::x10aux::nullCheck(this->FMGL(exceptions))->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
      t);
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->unlock();
}

//#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
void x10::compiler::ws::FinishFrame::rethrow() {
    
    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  this->FMGL(exceptions))))
    {
        this->x10::compiler::ws::FinishFrame::rethrowSlow();
    }
    
}

//#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
void x10::compiler::ws::FinishFrame::rethrowSlow() {
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::MultipleExceptions::_make(this->FMGL(exceptions))));
}

//#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
void x10::compiler::ws::FinishFrame::check() {
    
    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  this->FMGL(exceptions))))
    {
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        while (!((__extension__ ({
                   ::x10::util::GrowableRail< ::x10::lang::Exception*>* this__77068 =
                     this->FMGL(exceptions);
                   (::x10aux::struct_equals(::x10aux::nullCheck(this__77068)->FMGL(size),
                                            ((x10_long)0ll)));
               }))
               )) {
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            ::x10::lang::Runtime::pushException(reinterpret_cast< ::x10::lang::CheckedThrowable*>(::x10aux::nullCheck(this->FMGL(exceptions))->x10::util::GrowableRail< ::x10::lang::Exception*>::removeLast()));
        }
        
    }
    
}

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
::x10::compiler::ws::FinishFrame* x10::compiler::ws::FinishFrame::x10__compiler__ws__FinishFrame____this__x10__compiler__ws__FinishFrame(
  ) {
    return this;
    
}
void x10::compiler::ws::FinishFrame::__fieldInitializers_x10_compiler_ws_FinishFrame(
  ) {
 
}
void x10::compiler::ws::FinishFrame::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::compiler::ws::Frame::_serialize_body(buf);
    buf.write(this->FMGL(asyncs));
    buf.write(this->FMGL(redirect));
    
}

void x10::compiler::ws::FinishFrame::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::ws::Frame::_deserialize_body(buf);
    FMGL(asyncs) = buf.read<x10_int>();
    FMGL(redirect) = buf.read< ::x10::compiler::ws::FinishFrame*>();
}

::x10aux::RuntimeType x10::compiler::ws::FinishFrame::rtt;
void x10::compiler::ws::FinishFrame::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::compiler::ws::Frame>()};
    rtt.initStageTwo("x10.compiler.ws.FinishFrame",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of FinishFrame */
/*************************************************/
