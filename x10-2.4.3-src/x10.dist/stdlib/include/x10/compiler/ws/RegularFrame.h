#ifndef __X10_COMPILER_WS_REGULARFRAME_H
#define __X10_COMPILER_WS_REGULARFRAME_H

#include <x10rt.h>


#define X10_COMPILER_WS_FRAME_H_NODEPS
#include <x10/compiler/ws/Frame.h>
#undef X10_COMPILER_WS_FRAME_H_NODEPS
namespace x10 { namespace compiler { namespace ws { 
class FinishFrame;
} } } 
namespace x10 { namespace compiler { 
class Header;
} } 
namespace x10 { namespace compiler { 
class Ifdef;
} } 
namespace x10 { namespace compiler { namespace ws { 
class Worker;
} } } 
namespace x10 { namespace lang { 
class Deque;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace compiler { 
class Inline;
} } 
namespace x10 { namespace lang { 
class Runtime__Pool;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace compiler { 
class Abort;
} } 
namespace x10 { namespace compiler { 
class NoInline;
} } 
namespace x10 { namespace compiler { 
class NoReturn;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace compiler { namespace ws { 

class RegularFrame : public ::x10::compiler::ws::Frame   {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::compiler::ws::FinishFrame* FMGL(ff);
    
    void _constructor(::x10::compiler::ws::Frame* up, ::x10::compiler::ws::FinishFrame* ff) {
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        ::x10::compiler::ws::Frame* this__78026 = this;
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
        ::x10::compiler::ws::Frame* up__78027 = up;
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
        ::x10aux::nullCheck(this__78026)->FMGL(up) = up__78027;
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        ::x10::compiler::ws::RegularFrame* this__78025 = this;
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        this->FMGL(ff) = ff;
    }
    void _constructor(x10_int id__51, ::x10::compiler::ws::RegularFrame* o);
    
    virtual ::x10::compiler::ws::Frame* remap() = 0;
    virtual void push(::x10::compiler::ws::Worker* worker);
    virtual void continueLater(::x10::compiler::ws::Worker* worker) X10_PRAGMA_NORETURN ;
    virtual void continueNow(::x10::compiler::ws::Worker* worker) X10_PRAGMA_NORETURN ;
    virtual ::x10::compiler::ws::RegularFrame* x10__compiler__ws__RegularFrame____this__x10__compiler__ws__RegularFrame(
      );
    virtual void __fieldInitializers_x10_compiler_ws_RegularFrame(
      );
    
    // Serialization
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } } 
#endif // X10_COMPILER_WS_REGULARFRAME_H

namespace x10 { namespace compiler { namespace ws { 
class RegularFrame;
} } } 

#ifndef X10_COMPILER_WS_REGULARFRAME_H_NODEPS
#define X10_COMPILER_WS_REGULARFRAME_H_NODEPS
#include <x10/compiler/ws/Frame.h>
#include <x10/compiler/ws/FinishFrame.h>
#include <x10/compiler/Header.h>
#include <x10/lang/Int.h>
#include <x10/compiler/Ifdef.h>
#include <x10/compiler/ws/Worker.h>
#include <x10/lang/Deque.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Inline.h>
#include <x10/lang/Runtime__Pool.h>
#include <x10/lang/Runtime.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/NoInline.h>
#include <x10/compiler/NoReturn.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_COMPILER_WS_REGULARFRAME_H_GENERICS
#define X10_COMPILER_WS_REGULARFRAME_H_GENERICS
#endif // X10_COMPILER_WS_REGULARFRAME_H_GENERICS
#endif // __X10_COMPILER_WS_REGULARFRAME_H_NODEPS