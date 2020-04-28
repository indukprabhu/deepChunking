/*************************************************/
/* START of Row */
#include <x10/regionarray/Row.h>

#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Int.h>
#include <x10/io/Printer.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Any.h>
#include <x10/lang/String.h>
#include <x10/io/StringWriter.h>
#include <x10/io/Writer.h>
#include <x10/compiler/Synthetic.h>

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
void x10::regionarray::Row::_constructor(x10_int cols) {
    FMGL(cols) = cols;
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    ::x10::regionarray::Row* this__116766 = this;
    
}


//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
void x10::regionarray::Row::printInfo(::x10::io::Printer* ps, x10_int row) {
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    ::x10aux::nullCheck(ps)->print((__extension__ ({ static ::x10::lang::String* strLit__127639 = ::x10aux::makeStringLit("["); strLit__127639; })));
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    {
        x10_int i;
        for (i = ((x10_int)0); ((i) < (this->FMGL(cols))); i = ((i) + (((x10_int)1))))
        {
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            ::x10aux::nullCheck(ps)->x10::io::Printer::print(::x10aux::class_cast_unchecked< ::x10::lang::Any*>(this->__apply(
                                                                                                                  i)));
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            if ((::x10aux::struct_equals(i, ((this->FMGL(cols)) - (((x10_int)2))))))
            {
                ::x10aux::nullCheck(ps)->print((__extension__ ({ static ::x10::lang::String* strLit__127641 = ::x10aux::makeStringLit(" |"); strLit__127641; })));
            }
            
        }
    }
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    ::x10aux::nullCheck(ps)->print((__extension__ ({ static ::x10::lang::String* strLit__127642 = ::x10aux::makeStringLit(" ]   "); strLit__127642; })));
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    this->printEqn(ps, (__extension__ ({ static ::x10::lang::String* strLit__127643 = ::x10aux::makeStringLit(" "); strLit__127643; })),
                   row);
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    ::x10aux::nullCheck(ps)->println();
}

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
void x10::regionarray::Row::printEqn(::x10::io::Printer* ps,
                                     ::x10::lang::String* spc,
                                     x10_int row) {
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    x10_boolean first = true;
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    ::x10aux::nullCheck(ps)->print(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127644 = ::x10aux::makeStringLit("y"); strLit__127644; })), row), (__extension__ ({ static ::x10::lang::String* strLit__127645 = ::x10aux::makeStringLit(" = "); strLit__127645; }))));
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    {
        x10_int i;
        for (i = ((x10_int)0); ((i) < (((this->FMGL(cols)) - (((x10_int)1)))));
             i = ((i) + (((x10_int)1)))) {
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            x10_int c = this->__apply(i);
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            if ((::x10aux::struct_equals(c, ((x10_int)1))))
            {
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                if (first) {
                    
                    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                    ::x10aux::nullCheck(ps)->print(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127647 = ::x10aux::makeStringLit("x"); strLit__127647; })), i));
                } else {
                    
                    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                    ::x10aux::nullCheck(ps)->print(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127648 = ::x10aux::makeStringLit("+x"); strLit__127648; })), i));
                }
                
            } else 
            //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            if ((::x10aux::struct_equals(c, ((x10_int)-1))))
            {
                
                //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                ::x10aux::nullCheck(ps)->print(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127649 = ::x10aux::makeStringLit("-x"); strLit__127649; })), i));
            } else 
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            if ((!::x10aux::struct_equals(c, ((x10_int)0))))
            {
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                ::x10aux::nullCheck(ps)->print(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((((c) >= (((x10_int)0))) &&
                                               !(first)) ? ((__extension__ ({ static ::x10::lang::String* strLit__127650 = ::x10aux::makeStringLit("+"); strLit__127650; })))
                                                 : ((__extension__ ({ static ::x10::lang::String* strLit__127651 = ::x10aux::makeStringLit(""); strLit__127651; }))), c), (__extension__ ({ static ::x10::lang::String* strLit__127652 = ::x10aux::makeStringLit("*x"); strLit__127652; }))), i), (__extension__ ({ static ::x10::lang::String* strLit__127653 = ::x10aux::makeStringLit(" "); strLit__127653; }))));
            }
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            if ((!::x10aux::struct_equals(c, ((x10_int)0))))
            {
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                first = false;
            }
            
        }
    }
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    x10_int c = this->__apply(((this->FMGL(cols)) - (((x10_int)1))));
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    if (((!::x10aux::struct_equals(c, ((x10_int)0))) || first))
    {
        ::x10aux::nullCheck(ps)->print(::x10::lang::String::__plus((((c) >= (((x10_int)0))) &&
                                       !(first)) ? ((__extension__ ({ static ::x10::lang::String* strLit__127655 = ::x10aux::makeStringLit("+"); strLit__127655; })))
                                         : ((__extension__ ({ static ::x10::lang::String* strLit__127656 = ::x10aux::makeStringLit(""); strLit__127656; }))), c));
    }
    
}

//#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
::x10::lang::String* x10::regionarray::Row::toString() {
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    ::x10::io::StringWriter* os =  (new (::x10aux::alloc_z< ::x10::io::StringWriter>()) ::x10::io::StringWriter());
    (os)->::x10::io::StringWriter::_constructor();
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    ::x10::io::Printer* ps =  (new (::x10aux::alloc_z< ::x10::io::Printer>()) ::x10::io::Printer());
    (ps)->::x10::io::Printer::_constructor(reinterpret_cast< ::x10::io::Writer*>(os));
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    this->printEqn(ps, (__extension__ ({ static ::x10::lang::String* strLit__127657 = ::x10aux::makeStringLit(""); strLit__127657; })),
                   ((x10_int)0));
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    return os->result();
    
}

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
::x10::regionarray::Row* x10::regionarray::Row::x10__regionarray__Row____this__x10__regionarray__Row(
  ) {
    return this;
    
}
void x10::regionarray::Row::__fieldInitializers_x10_regionarray_Row(
  ) {
 
}
void x10::regionarray::Row::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(cols));
    
}

void x10::regionarray::Row::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(cols) = buf.read<x10_int>();
}

::x10aux::RuntimeType x10::regionarray::Row::rtt;
void x10::regionarray::Row::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, x10_int> >()};
    rtt.initStageTwo("x10.regionarray.Row",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Row */
/*************************************************/
