/*************************************************/
/* START of Printer */
#include <x10/io/Printer.h>


//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
void x10::io::Printer::_constructor(::x10::io::Writer* w) {
    (this)->::x10::io::FilterWriter::_constructor(w);
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    ::x10::io::Printer* this__87720 = this;
    ::x10aux::nullCheck(this__87720)->FMGL(lock) = ::x10::util::concurrent::Lock::_make();
}
::x10::io::Printer* x10::io::Printer::_make(::x10::io::Writer* w) {
    ::x10::io::Printer* this_ = new (::x10aux::alloc_z< ::x10::io::Printer>()) ::x10::io::Printer();
    this_->_constructor(w);
    return this_;
}



//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
x10_char x10::io::Printer::FMGL(NEWLINE);
void x10::io::Printer::FMGL(NEWLINE__do_init)() {
    FMGL(NEWLINE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::Printer.NEWLINE");
    x10_char __var569__ = ((x10_char)'\n');
    FMGL(NEWLINE) = __var569__;
    FMGL(NEWLINE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::Printer::FMGL(NEWLINE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(NEWLINE__status), &FMGL(NEWLINE__do_init), &FMGL(NEWLINE__exception), "x10::io::Printer.NEWLINE");
    
}
volatile ::x10aux::StaticInitController::status x10::io::Printer::FMGL(NEWLINE__status);
::x10::lang::CheckedThrowable* x10::io::Printer::FMGL(NEWLINE__exception);

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
void x10::io::Printer::println() {
    this->x10::io::Printer::print(::x10aux::class_cast_unchecked< ::x10::lang::Any*>(((x10_char)'\n')));
}

//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
void x10::io::Printer::println(::x10::lang::Any* o) {
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    this->print((::x10aux::struct_equals(o, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
                  ? ((__extension__ ({ static ::x10::lang::String* strLit__124035 = ::x10aux::makeStringLit("null\n"); strLit__124035; })))
                  : (::x10::lang::String::__plus(::x10aux::to_string(o), (__extension__ ({ static ::x10::lang::String* strLit__124036 = ::x10aux::makeStringLit("\n"); strLit__124036; })))));
}

//#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
void x10::io::Printer::println(::x10::lang::CheckedThrowable* e) {
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    this->print((::x10aux::struct_equals(e, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
                  ? ((__extension__ ({ static ::x10::lang::String* strLit__124037 = ::x10aux::makeStringLit("null\n"); strLit__124037; })))
                  : (::x10::lang::String::__plus(::x10aux::nullCheck(e)->x10::lang::CheckedThrowable::toString(), (__extension__ ({ static ::x10::lang::String* strLit__124038 = ::x10aux::makeStringLit("\n"); strLit__124038; })))));
}

//#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
void x10::io::Printer::print(::x10::lang::Any* o) {
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    this->print((::x10aux::struct_equals(o, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
                  ? ((__extension__ ({ static ::x10::lang::String* strLit__124039 = ::x10aux::makeStringLit("null"); strLit__124039; })))
                  : (::x10aux::to_string(o)));
}

//#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
void x10::io::Printer::print(::x10::lang::String* s) {
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    this->FMGL(lock)->lock();
    {
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        ::x10::lang::CheckedThrowable* throwable__87721 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
                if ((::x10aux::struct_equals(s, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
                {
                    
                    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
                    this->write((__extension__ ({ static ::x10::lang::String* strLit__124040 = ::x10aux::makeStringLit("null"); strLit__124040; })));
                } else {
                    
                    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
                    this->write(s);
                }
                
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc575) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__87722 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc575);
                {
                    throwable__87721 = formal__87722;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__87721)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__87721))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__87721));
            }
            
        }
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        if (true) {
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            this->FMGL(lock)->unlock();
        }
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__87721)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__87721)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__87721));
            }
            
        }
        
    }
}

//#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
void x10::io::Printer::print(::x10::lang::CheckedThrowable* e) {
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    this->print((::x10aux::struct_equals(e, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
                  ? ((__extension__ ({ static ::x10::lang::String* strLit__124041 = ::x10aux::makeStringLit("null"); strLit__124041; })))
                  : (::x10aux::nullCheck(e)->x10::lang::CheckedThrowable::toString()));
}

//#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
void x10::io::Printer::printf(::x10::lang::String* fmt) {
    this->printfRail(fmt, ::x10::lang::Rail< ::x10::lang::Any* >::_make(((x10_long)0ll)));
}

//#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
void x10::io::Printer::printf(::x10::lang::String* fmt, ::x10::lang::Any* o1) {
    this->printfRail(fmt, (__extension__ ({
                         ::x10::lang::Rail< ::x10::lang::Any* >* t__123982 =
                           ::x10::lang::Rail< ::x10::lang::Any* >::_makeUnsafe(((x10_long)1ll), false);
                         t__123982->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)0ll), o1);
                         t__123982;
                     }))
                     );
}

//#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
void x10::io::Printer::printf(::x10::lang::String* fmt, ::x10::lang::Any* o1,
                              ::x10::lang::Any* o2) {
    this->printfRail(fmt, (__extension__ ({
                         ::x10::lang::Rail< ::x10::lang::Any* >* t__123986 =
                           ::x10::lang::Rail< ::x10::lang::Any* >::_makeUnsafe(((x10_long)2ll), false);
                         t__123986->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)0ll), o1);
                         t__123986->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)1ll), o2);
                         t__123986;
                     }))
                     );
}

//#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
void x10::io::Printer::printf(::x10::lang::String* fmt, ::x10::lang::Any* o1,
                              ::x10::lang::Any* o2, ::x10::lang::Any* o3) {
    this->printfRail(fmt, (__extension__ ({
                         ::x10::lang::Rail< ::x10::lang::Any* >* t__123992 =
                           ::x10::lang::Rail< ::x10::lang::Any* >::_makeUnsafe(((x10_long)3ll), false);
                         t__123992->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)0ll), o1);
                         t__123992->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)1ll), o2);
                         t__123992->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)2ll), o3);
                         t__123992;
                     }))
                     );
}

//#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
void x10::io::Printer::printf(::x10::lang::String* fmt, ::x10::lang::Any* o1,
                              ::x10::lang::Any* o2, ::x10::lang::Any* o3,
                              ::x10::lang::Any* o4) {
    this->printfRail(fmt, (__extension__ ({
                         ::x10::lang::Rail< ::x10::lang::Any* >* t__124000 =
                           ::x10::lang::Rail< ::x10::lang::Any* >::_makeUnsafe(((x10_long)4ll), false);
                         t__124000->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)0ll), o1);
                         t__124000->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)1ll), o2);
                         t__124000->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)2ll), o3);
                         t__124000->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)3ll), o4);
                         t__124000;
                     }))
                     );
}

//#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
void x10::io::Printer::printf(::x10::lang::String* fmt, ::x10::lang::Any* o1,
                              ::x10::lang::Any* o2, ::x10::lang::Any* o3,
                              ::x10::lang::Any* o4, ::x10::lang::Any* o5) {
    this->printfRail(fmt, (__extension__ ({
                         ::x10::lang::Rail< ::x10::lang::Any* >* t__124010 =
                           ::x10::lang::Rail< ::x10::lang::Any* >::_makeUnsafe(((x10_long)5ll), false);
                         t__124010->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)0ll), o1);
                         t__124010->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)1ll), o2);
                         t__124010->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)2ll), o3);
                         t__124010->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)3ll), o4);
                         t__124010->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)4ll), o5);
                         t__124010;
                     }))
                     );
}

//#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
void x10::io::Printer::printf(::x10::lang::String* fmt, ::x10::lang::Any* o1,
                              ::x10::lang::Any* o2, ::x10::lang::Any* o3,
                              ::x10::lang::Any* o4, ::x10::lang::Any* o5,
                              ::x10::lang::Any* o6) {
    this->printfRail(fmt, (__extension__ ({
                         ::x10::lang::Rail< ::x10::lang::Any* >* t__124022 =
                           ::x10::lang::Rail< ::x10::lang::Any* >::_makeUnsafe(((x10_long)6ll), false);
                         t__124022->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)0ll), o1);
                         t__124022->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)1ll), o2);
                         t__124022->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)2ll), o3);
                         t__124022->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)3ll), o4);
                         t__124022->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)4ll), o5);
                         t__124022->x10::lang::Rail< ::x10::lang::Any* >::__set(
                           ((x10_long)5ll), o6);
                         t__124022;
                     }))
                     );
}

//#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
void x10::io::Printer::printf(::x10::lang::String* fmt, ::x10::lang::Rail< ::x10::lang::Any* >* args) {
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    this->printfRail(fmt, args);
}

//#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
void x10::io::Printer::printfRail(::x10::lang::String* fmt,
                                  ::x10::lang::Rail< ::x10::lang::Any* >* args) {
    
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    this->print(::x10::lang::String::format(fmt,args));
}

//#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
void x10::io::Printer::flush() {
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    try {
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        ::x10::io::FilterWriter::flush();
    }
    catch (::x10::lang::CheckedThrowable* __exc587) {
        if (::x10aux::instanceof< ::x10::io::IOException*>(__exc587)) {
            ::x10::io::IOException* id__66 = static_cast< ::x10::io::IOException*>(__exc587);
            {
             
            }
        } else
        throw;
    }
}

//#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
void x10::io::Printer::close() {
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    try {
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        ::x10::io::FilterWriter::close();
    }
    catch (::x10::lang::CheckedThrowable* __exc589) {
        if (::x10aux::instanceof< ::x10::io::IOException*>(__exc589)) {
            ::x10::io::IOException* id__67 = static_cast< ::x10::io::IOException*>(__exc589);
            {
             
            }
        } else
        throw;
    }
}

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
::x10::io::Printer* x10::io::Printer::x10__io__Printer____this__x10__io__Printer(
  ) {
    return this;
    
}
void x10::io::Printer::__fieldInitializers_x10_io_Printer(
  ) {
    this->FMGL(lock) = ::x10::util::concurrent::Lock::_make();
}
const ::x10aux::serialization_id_t x10::io::Printer::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::Printer::_deserializer);

void x10::io::Printer::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::io::FilterWriter::_serialize_body(buf);
    buf.write(this->FMGL(lock));
    
}

::x10::lang::Reference* ::x10::io::Printer::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Printer* this_ = new (::x10aux::alloc_z< ::x10::io::Printer>()) ::x10::io::Printer();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::Printer::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::io::FilterWriter::_deserialize_body(buf);
    FMGL(lock) = buf.read< ::x10::util::concurrent::Lock*>();
}

::x10aux::RuntimeType x10::io::Printer::rtt;
void x10::io::Printer::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::FilterWriter>()};
    rtt.initStageTwo("x10.io.Printer",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Printer */
/*************************************************/
