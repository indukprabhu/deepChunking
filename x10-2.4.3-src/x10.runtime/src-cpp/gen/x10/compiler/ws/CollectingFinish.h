#ifndef __X10_COMPILER_WS_COLLECTINGFINISH_H
#define __X10_COMPILER_WS_COLLECTINGFINISH_H

#include <x10rt.h>


#define X10_COMPILER_WS_FINISHFRAME_H_NODEPS
#include <x10/compiler/ws/FinishFrame.h>
#undef X10_COMPILER_WS_FINISHFRAME_H_NODEPS
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Reducible;
} } 
namespace x10 { namespace compiler { 
class Uninitialized;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace compiler { 
class Ifdef;
} } 
namespace x10 { namespace compiler { namespace ws { 
class Frame;
} } } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class GrowableRail;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace util { namespace concurrent { 
class Lock;
} } } 
namespace x10 { namespace util { namespace concurrent { 
class Monitor;
} } } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace compiler { 
class Finalization;
} } 
namespace x10 { namespace compiler { 
class Abort;
} } 
namespace x10 { namespace compiler { 
class CompilerFlags;
} } 
namespace x10 { namespace compiler { namespace ws { 
class Worker;
} } } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace compiler { namespace ws { 

template<class TPMGL(T)> class CollectingFinish;
template <> class CollectingFinish<void>;
template<class TPMGL(T)> class CollectingFinish : public ::x10::compiler::ws::FinishFrame
  {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::lang::Reducible<TPMGL(T)>* FMGL(reducer);
    
    ::x10::lang::Rail< TPMGL(T) >* FMGL(resultRail);
    
    TPMGL(T) FMGL(result);
    
    void _constructor(::x10::compiler::ws::Frame* up, ::x10::lang::Reducible<TPMGL(T)>* rd);
    
    void _constructor(x10_int x, ::x10::compiler::ws::CollectingFinish<TPMGL(T)>* o);
    
    virtual ::x10::compiler::ws::Frame* realloc();
    virtual void accept(TPMGL(T) t, ::x10::compiler::ws::Worker* worker);
    virtual TPMGL(T) fastResult(::x10::compiler::ws::Worker* worker);
    virtual TPMGL(T) result();
    virtual ::x10::compiler::ws::CollectingFinish<TPMGL(T)>* x10__compiler__ws__CollectingFinish____this__x10__compiler__ws__CollectingFinish(
      );
    virtual void __fieldInitializers_x10_compiler_ws_CollectingFinish(
      );
    
    // Serialization
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::compiler::ws::CollectingFinish<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::compiler::ws::CollectingFinish<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::compiler::ws::CollectingFinish<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::compiler::ws::FinishFrame>()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.compiler.ws.CollectingFinish";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 1, parents, 1, params, variances);
}

template <> class CollectingFinish<void> : public ::x10::compiler::ws::FinishFrame
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    
};

} } } 
#endif // X10_COMPILER_WS_COLLECTINGFINISH_H

namespace x10 { namespace compiler { namespace ws { 
template<class TPMGL(T)> class CollectingFinish;
} } } 

#ifndef X10_COMPILER_WS_COLLECTINGFINISH_H_NODEPS
#define X10_COMPILER_WS_COLLECTINGFINISH_H_NODEPS
#include <x10/compiler/ws/FinishFrame.h>
#include <x10/lang/Reducible.h>
#include <x10/compiler/Uninitialized.h>
#include <x10/lang/Rail.h>
#include <x10/compiler/Ifdef.h>
#include <x10/compiler/ws/Frame.h>
#include <x10/lang/Int.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Unsafe.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/Exception.h>
#include <x10/util/concurrent/Lock.h>
#include <x10/util/concurrent/Monitor.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/compiler/ws/Worker.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_COMPILER_WS_COLLECTINGFINISH_H_GENERICS
#define X10_COMPILER_WS_COLLECTINGFINISH_H_GENERICS
#endif // X10_COMPILER_WS_COLLECTINGFINISH_H_GENERICS
#ifndef X10_COMPILER_WS_COLLECTINGFINISH_H_IMPLEMENTATION
#define X10_COMPILER_WS_COLLECTINGFINISH_H_IMPLEMENTATION
#include <x10/compiler/ws/CollectingFinish.h>


//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
template<class TPMGL(T)> void x10::compiler::ws::CollectingFinish<TPMGL(T)>::_constructor(
                           ::x10::compiler::ws::Frame* up, ::x10::lang::Reducible<TPMGL(T)>* rd) {
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    (this)->::x10::compiler::ws::FinishFrame::_constructor(up);
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    ::x10::compiler::ws::CollectingFinish<TPMGL(T)>* this__77012 =
      this;
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    this->FMGL(reducer) = rd;
    {
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
        this->FMGL(result) = ::x10::lang::Reducible<TPMGL(T)>::zero(::x10aux::nullCheck(rd));
    }
}


//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
template<class TPMGL(T)> void x10::compiler::ws::CollectingFinish<TPMGL(T)>::_constructor(
                           x10_int x, ::x10::compiler::ws::CollectingFinish<TPMGL(T)>* o) {
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    (this)->::x10::compiler::ws::FinishFrame::_constructor(
      x, reinterpret_cast< ::x10::compiler::ws::FinishFrame*>(o));
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    ::x10::compiler::ws::CollectingFinish<TPMGL(T)>* this__77013 =
      this;
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    this->FMGL(reducer) = ::x10aux::nullCheck(o)->FMGL(reducer);
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    x10_int size = ::x10::lang::Runtime::FMGL(NTHREADS__get)();
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    this->FMGL(resultRail) = ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe(((x10_long)(size)), false);
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    {
        x10_int i;
        for (i = ((x10_int)0); ((i) < (size)); i = ((i) + (((x10_int)1))))
        {
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            ::x10aux::nullCheck(this->FMGL(resultRail))->x10::lang::template Rail< TPMGL(T) >::__set(
              ((x10_long)(i)), ::x10::lang::Reducible<TPMGL(T)>::zero(::x10aux::nullCheck(this->FMGL(reducer))));
        }
    }
    
}


//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
template<class TPMGL(T)> ::x10::compiler::ws::Frame* x10::compiler::ws::CollectingFinish<TPMGL(T)>::realloc(
  ) {
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  this->FMGL(redirect))))
    {
        return reinterpret_cast< ::x10::compiler::ws::Frame*>(this->FMGL(redirect));
        
    }
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    ::x10::compiler::ws::FinishFrame* tmp = reinterpret_cast< ::x10::compiler::ws::FinishFrame*>(this->remap());
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    ::x10aux::nullCheck(tmp)->FMGL(redirect) = tmp;
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  this->FMGL(exceptions))))
    {
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
        ::x10aux::nullCheck(tmp)->FMGL(exceptions) = (__extension__ ({
            ::x10::util::GrowableRail< ::x10::lang::Exception*>* alloc__76880 =
               (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Exception*> >()) ::x10::util::GrowableRail< ::x10::lang::Exception*>());
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            (alloc__76880)->::x10::util::GrowableRail< ::x10::lang::Exception*>::_constructor(
              ((x10_long)0ll));
            alloc__76880;
        }))
        ;
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
        ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->lock();
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
        while (!((__extension__ ({
                   ::x10::util::GrowableRail< ::x10::lang::Exception*>* this__77011 =
                     this->FMGL(exceptions);
                   (::x10aux::struct_equals(::x10aux::nullCheck(this__77011)->FMGL(size),
                                            ((x10_long)0ll)));
               }))
               )) {
            ::x10aux::nullCheck(::x10aux::nullCheck(tmp)->FMGL(exceptions))->x10::util::template GrowableRail< ::x10::lang::Exception*>::add(
              ::x10aux::nullCheck(this->FMGL(exceptions))->x10::util::template GrowableRail< ::x10::lang::Exception*>::removeLast());
        }
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
        this->FMGL(exceptions) = (::x10aux::class_cast_unchecked< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
        ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->unlock();
    }
    {
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
        ::x10::lang::CheckedThrowable* throwable__77014 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                ::x10::lang::Runtime::enterAtomic();
                {
                    this->FMGL(redirect) = tmp;
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc212) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__77015 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc212);
                {
                    throwable__77014 = formal__77015;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__77014)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__77014))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__77014));
            }
            
        }
        if (true) {
            ::x10::lang::Runtime::exitAtomic();
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__77014)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__77014)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__77014));
            }
            
        }
        
    }
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    ::x10aux::nullCheck(reinterpret_cast< ::x10::compiler::ws::CollectingFinish<TPMGL(T)>* >(tmp))->FMGL(result) =
      this->FMGL(result);
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    return reinterpret_cast< ::x10::compiler::ws::Frame*>(tmp);
    
}

//#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
template<class TPMGL(T)> void x10::compiler::ws::CollectingFinish<TPMGL(T)>::accept(
  TPMGL(T) t, ::x10::compiler::ws::Worker* worker) {
    {
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
        if ((::x10aux::struct_equals(this->FMGL(redirect),
                                     reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
        {
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            this->FMGL(result) = ::x10::lang::Reducible<TPMGL(T)>::__apply(::x10aux::nullCheck(this->FMGL(reducer)), 
                                   this->FMGL(result), t);
        } else {
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            x10_int id = ::x10aux::nullCheck(worker)->FMGL(id);
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            ::x10::lang::Rail< TPMGL(T) >* rr = ::x10aux::nullCheck(reinterpret_cast< ::x10::compiler::ws::CollectingFinish<TPMGL(T)>* >(this->FMGL(redirect)))->FMGL(resultRail);
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            ::x10aux::nullCheck(rr)->x10::lang::template Rail< TPMGL(T) >::__set(
              ((x10_long)(id)), ::x10::lang::Reducible<TPMGL(T)>::__apply(::x10aux::nullCheck(this->FMGL(reducer)), 
                                  ::x10aux::nullCheck(rr)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                    ((x10_long)(id))), t));
        }
        
    }
}

//#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
template<class TPMGL(T)> TPMGL(T) x10::compiler::ws::CollectingFinish<TPMGL(T)>::fastResult(
  ::x10::compiler::ws::Worker* worker) {
    {
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
        return this->FMGL(result);
        
    }
}

//#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
template<class TPMGL(T)> TPMGL(T) x10::compiler::ws::CollectingFinish<TPMGL(T)>::result(
  ) {
    {
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
        x10_int size = ::x10::lang::Runtime::FMGL(NTHREADS__get)();
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
        {
            x10_int i;
            for (i = ((x10_int)0); ((i) < (size)); i = ((i) + (((x10_int)1))))
            {
                
                //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                this->FMGL(result) = ::x10::lang::Reducible<TPMGL(T)>::__apply(::x10aux::nullCheck(this->FMGL(reducer)), 
                                       this->FMGL(result),
                                       ::x10aux::nullCheck(this->FMGL(resultRail))->x10::lang::template Rail< TPMGL(T) >::__apply(
                                         ((x10_long)(i))));
            }
        }
        
        //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
        ::x10aux::dealloc(this->FMGL(resultRail));
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
        return this->FMGL(result);
        
    }
}

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
template<class TPMGL(T)> ::x10::compiler::ws::CollectingFinish<TPMGL(T)>*
  x10::compiler::ws::CollectingFinish<TPMGL(T)>::x10__compiler__ws__CollectingFinish____this__x10__compiler__ws__CollectingFinish(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::compiler::ws::CollectingFinish<TPMGL(T)>::__fieldInitializers_x10_compiler_ws_CollectingFinish(
  ) {
 
}
template<class TPMGL(T)> void x10::compiler::ws::CollectingFinish<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::compiler::ws::FinishFrame::_serialize_body(buf);
    buf.write(this->FMGL(reducer));
    buf.write(this->FMGL(resultRail));
    buf.write(this->FMGL(result));
    
}

template<class TPMGL(T)> void x10::compiler::ws::CollectingFinish<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::ws::FinishFrame::_deserialize_body(buf);
    FMGL(reducer) = buf.read< ::x10::lang::Reducible<TPMGL(T)>*>();
    FMGL(resultRail) = buf.read< ::x10::lang::Rail< TPMGL(T) >*>();
    FMGL(result) = buf.read<TPMGL(T)>();
}

#endif // X10_COMPILER_WS_COLLECTINGFINISH_H_IMPLEMENTATION
#endif // __X10_COMPILER_WS_COLLECTINGFINISH_H_NODEPS
