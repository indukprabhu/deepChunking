/*************************************************/
/* START of StringUtil */
#include <x10/util/StringUtil.h>


//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
x10_int x10::util::StringUtil::radix(::x10::lang::String* v) {
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    if ((::x10aux::struct_equals((v)->charAt(((x10_int)0)), ((x10_char)'-'))))
    {
        v = ::x10aux::nullCheck(v)->x10::lang::String::substring(((x10_int)1));
    }
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    if ((((::x10aux::nullCheck(v)->x10::lang::String::length()) < (((x10_int)2))) ||
        (!::x10aux::struct_equals((v)->charAt(((x10_int)0)), ((x10_char)'0')))))
    {
        return ((x10_int)10);
        
    } else 
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    if (((::x10aux::struct_equals((v)->charAt(((x10_int)1)), ((x10_char)'x'))) ||
        (::x10aux::struct_equals((v)->charAt(((x10_int)1)),
                                 ((x10_char)'X'))))) {
        return ((x10_int)16);
        
    } else {
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        return ((x10_int)8);
        
    }
    
}

//#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
::x10::lang::String* x10::util::StringUtil::stripRadix(::x10::lang::String* v) {
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    if ((::x10aux::struct_equals((v)->charAt(((x10_int)0)),
                                 ((x10_char)'-')))) {
        v = ::x10aux::nullCheck(v)->x10::lang::String::substring(
              ((x10_int)1));
    }
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    switch (::x10::util::StringUtil::radix(v)) {
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        case ((x10_int)10): ;
        {
            return v;
            
        }
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        case ((x10_int)16): ;
        {
            return ::x10aux::nullCheck(v)->x10::lang::String::substring(
                     ((x10_int)2));
            
        }
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        case ((x10_int)8): ;
        {
            return ::x10aux::nullCheck(v)->x10::lang::String::substring(
                     ((x10_int)1));
            
        }
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        default: ;
        {
            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalArgumentException::_make(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__130470 = ::x10aux::makeStringLit("Unexpected radix, "); strLit__130470; })), ::x10::util::StringUtil::radix(
                                                                                                                                                                                                                                                                       v)))));
        }
    }
}

//#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
::x10::util::Pair< ::x10::lang::String*, ::x10::lang::String*>
  x10::util::StringUtil::stripNumericType(::x10::lang::String* s) {
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    x10_int sLength = ::x10aux::nullCheck(s)->x10::lang::String::length();
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    x10_int n = ((sLength) - (((x10_int)1)));
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    ::x10::lang::String* typeLit;
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    ::x10::lang::String* sUpper = ::x10aux::nullCheck(s)->x10::lang::String::toUpperCase();
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    x10_int xIndex = ::x10aux::nullCheck(sUpper)->x10::lang::String::indexOf(
                       (__extension__ ({ static ::x10::lang::String* strLit__130471 = ::x10aux::makeStringLit("X"); strLit__130471; })));
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    x10_int dotIndex = ::x10aux::nullCheck(sUpper)->x10::lang::String::indexOf(
                         (__extension__ ({ static ::x10::lang::String* strLit__130472 = ::x10aux::makeStringLit("."); strLit__130472; })));
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    if (((xIndex) < (((x10_int)0)))) {
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        x10_int lastN = ((dotIndex) > (((x10_int)0))) ? (dotIndex)
          : (((x10_int)0));
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        while ((((n) > (lastN)) && !(::x10::lang::CharNatives::isDigit((sUpper)->charAt(n)))))
        {
            n = ((n) - (((x10_int)1)));
        }
        
    } else {
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        while ((((n) > (((x10_int)0))) && !(::x10::util::StringUtil::isHexDigit(
                                              (sUpper)->charAt(n)))))
        {
            n = ((n) - (((x10_int)1)));
        }
        
    }
    
    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    if (((n) < (((sLength) - (((x10_int)1)))))) {
        typeLit = ::x10aux::nullCheck(sUpper)->x10::lang::String::substring(
                    ((n) + (((x10_int)1))));
    } else 
    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    if (((xIndex) > (((x10_int)0)))) {
        typeLit = (__extension__ ({ static ::x10::lang::String* strLit__130473 = ::x10aux::makeStringLit("I"); strLit__130473; }));
    } else 
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    if (((dotIndex) >= (((x10_int)0)))) {
        typeLit = (__extension__ ({ static ::x10::lang::String* strLit__130474 = ::x10aux::makeStringLit("D"); strLit__130474; }));
    } else 
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    if (((::x10aux::nullCheck(sUpper)->x10::lang::String::indexOf(
            (__extension__ ({ static ::x10::lang::String* strLit__130475 = ::x10aux::makeStringLit("E"); strLit__130475; })))) > (((x10_int)0))))
    {
        typeLit = (__extension__ ({ static ::x10::lang::String* strLit__130476 = ::x10aux::makeStringLit("D"); strLit__130476; }));
    } else {
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        typeLit = (__extension__ ({ static ::x10::lang::String* strLit__130477 = ::x10aux::makeStringLit("I"); strLit__130477; }));
    }
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    ::x10::util::Pair< ::x10::lang::String*, ::x10::lang::String*> alloc__122173 =
       ::x10::util::Pair< ::x10::lang::String*, ::x10::lang::String*>::_alloc();
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    ::x10::lang::String* first__122171 = ::x10aux::nullCheck(sUpper)->x10::lang::String::substring(
                                           ((x10_int)0), ((n) + (((x10_int)1))));
    ::x10::lang::String* second__122172 = typeLit;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    alloc__122173->FMGL(first) = first__122171;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    alloc__122173->FMGL(second) = second__122172;
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    return alloc__122173;
    
}

//#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
x10_boolean x10::util::StringUtil::isHexDigit(x10_char c) {
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    x10_int ordC = ((x10_int) (c).v);
    
    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    return ((((((x10_long)(ordC))) >= (((x10_long)48ll))) &&
    ((((x10_long)(ordC))) <= (((x10_long)57ll)))) || (((((x10_long)(ordC))) >= (((x10_long)65ll))) &&
    ((((x10_long)(ordC))) <= (((x10_long)70ll)))));
    
}

//#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
x10_byte x10::util::StringUtil::parseByte(::x10::lang::String* s) {
    return ((x10_byte) (((::x10aux::struct_equals((s)->charAt(((x10_int)0)),
                                                  ((x10_char)'-')))
      ? (((x10_byte)-1)) : (((x10_byte)1))) * (::x10::lang::ByteNatives::parseByte(::x10::util::StringUtil::stripRadix(
                                                                                     s), ::x10::util::StringUtil::radix(
                                                                                           s)))));
    
}

//#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
x10_short x10::util::StringUtil::parseShort(::x10::lang::String* s) {
    return ((x10_short) (((::x10aux::struct_equals((s)->charAt(((x10_int)0)),
                                                   ((x10_char)'-')))
      ? (((x10_short)-1)) : (((x10_short)1))) * (::x10::lang::ShortNatives::parseShort(::x10::util::StringUtil::stripRadix(
                                                                                         s), ::x10::util::StringUtil::radix(
                                                                                               s)))));
    
}

//#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
x10_int x10::util::StringUtil::parseInt(::x10::lang::String* s) {
    return (((::x10aux::struct_equals((s)->charAt(((x10_int)0)),
                                      ((x10_char)'-'))) ? (((x10_int)-1))
      : (((x10_int)1))) * (::x10::lang::IntNatives::parseInt(::x10::util::StringUtil::stripRadix(
                                                               s), ::x10::util::StringUtil::radix(
                                                                     s))));
    
}

//#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
x10_long x10::util::StringUtil::parseLong(::x10::lang::String* s) {
    return (((::x10aux::struct_equals((s)->charAt(((x10_int)0)),
                                      ((x10_char)'-'))) ? (((x10_long)-1ll))
      : (((x10_long)1ll))) * (::x10::lang::LongNatives::parseLong(::x10::util::StringUtil::stripRadix(
                                                                    s), ::x10::util::StringUtil::radix(
                                                                          s))));
    
}

//#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
x10_ubyte x10::util::StringUtil::parseUByte(::x10::lang::String* s) {
    return (::x10::lang::UByteNatives::parseUByte(::x10::util::StringUtil::stripRadix(
                                                    s), ::x10::util::StringUtil::radix(
                                                          s)));
    
}

//#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
x10_ushort x10::util::StringUtil::parseUShort(::x10::lang::String* s) {
    return ::x10::lang::UShortNatives::parseUShort(::x10::util::StringUtil::stripRadix(
                                                     s), ::x10::util::StringUtil::radix(
                                                           s));
    
}

//#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
x10_uint x10::util::StringUtil::parseUInt(::x10::lang::String* s) {
    return (::x10::lang::UIntNatives::parseUInt(::x10::util::StringUtil::stripRadix(
                                                  s), ::x10::util::StringUtil::radix(
                                                        s)));
    
}

//#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
x10_ulong x10::util::StringUtil::parseULong(::x10::lang::String* s) {
    return ::x10::lang::ULongNatives::parseULong(::x10::util::StringUtil::stripRadix(
                                                   s), ::x10::util::StringUtil::radix(
                                                         s));
    
}

//#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"

//#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"

//#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"

//#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"

//#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
::x10::lang::Rail< ::x10::lang::String* >* x10::util::StringUtil::FMGL(TRUE_STRINGS);
void x10::util::StringUtil::FMGL(TRUE_STRINGS__do_init)() {
    FMGL(TRUE_STRINGS__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::StringUtil.TRUE_STRINGS");
    ::x10::lang::Rail< ::x10::lang::String* >* __var2965__ = (__extension__ ({
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        ::x10::lang::Rail< ::x10::lang::String* >* t__130425 =
          ::x10::lang::Rail< ::x10::lang::String* >::_makeUnsafe(((x10_long)12ll), false);
        t__130425->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)0ll), (__extension__ ({ static ::x10::lang::String* strLit__130503 = ::x10aux::makeStringLit("1"); strLit__130503; })));
        t__130425->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)1ll), (__extension__ ({ static ::x10::lang::String* strLit__130504 = ::x10aux::makeStringLit("yea"); strLit__130504; })));
        t__130425->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)2ll), (__extension__ ({ static ::x10::lang::String* strLit__130505 = ::x10aux::makeStringLit("yes"); strLit__130505; })));
        t__130425->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)3ll), (__extension__ ({ static ::x10::lang::String* strLit__130506 = ::x10aux::makeStringLit("si"); strLit__130506; })));
        t__130425->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)4ll), (__extension__ ({ static ::x10::lang::String* strLit__130507 = ::x10aux::makeStringLit("sim"); strLit__130507; })));
        t__130425->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)5ll), (__extension__ ({ static ::x10::lang::String* strLit__130508 = ::x10aux::makeStringLit("oui"); strLit__130508; })));
        t__130425->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)6ll), (__extension__ ({ static ::x10::lang::String* strLit__130509 = ::x10aux::makeStringLit("ja"); strLit__130509; })));
        t__130425->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)7ll), (__extension__ ({ static ::x10::lang::String* strLit__130510 = ::x10aux::makeStringLit("ok"); strLit__130510; })));
        t__130425->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)8ll), (__extension__ ({ static ::x10::lang::String* strLit__130511 = ::x10aux::makeStringLit("okay"); strLit__130511; })));
        t__130425->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)9ll), (__extension__ ({ static ::x10::lang::String* strLit__130512 = ::x10aux::makeStringLit("true"); strLit__130512; })));
        t__130425->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)10ll), (__extension__ ({ static ::x10::lang::String* strLit__130513 = ::x10aux::makeStringLit("t"); strLit__130513; })));
        t__130425->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)11ll), (__extension__ ({ static ::x10::lang::String* strLit__130514 = ::x10aux::makeStringLit("on"); strLit__130514; })));
        t__130425;
    }))
    ;
    FMGL(TRUE_STRINGS) = __var2965__;
    FMGL(TRUE_STRINGS__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::StringUtil::FMGL(TRUE_STRINGS__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(TRUE_STRINGS__status), &FMGL(TRUE_STRINGS__do_init), &FMGL(TRUE_STRINGS__exception), "x10::util::StringUtil.TRUE_STRINGS");
    
}
volatile ::x10aux::StaticInitController::status x10::util::StringUtil::FMGL(TRUE_STRINGS__status);
::x10::lang::CheckedThrowable* x10::util::StringUtil::FMGL(TRUE_STRINGS__exception);

//#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
/** the set of strings that are to be interpreted as meaning "yes" or "true" */
::x10::util::HashSet< ::x10::lang::String*>* x10::util::StringUtil::FMGL(trueStrings);
void x10::util::StringUtil::FMGL(trueStrings__do_init)() {
    FMGL(trueStrings__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::StringUtil.trueStrings");
    ::x10::util::HashSet< ::x10::lang::String*>* __var2966__ = ::x10::util::StringUtil::makeSet< ::x10::lang::String* >(
                                                                 ::x10::util::StringUtil::FMGL(TRUE_STRINGS__get)());
    FMGL(trueStrings) = __var2966__;
    FMGL(trueStrings__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::StringUtil::FMGL(trueStrings__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(trueStrings__status), &FMGL(trueStrings__do_init), &FMGL(trueStrings__exception), "x10::util::StringUtil.trueStrings");
    
}
volatile ::x10aux::StaticInitController::status x10::util::StringUtil::FMGL(trueStrings__status);
::x10::lang::CheckedThrowable* x10::util::StringUtil::FMGL(trueStrings__exception);

//#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
::x10::lang::Rail< ::x10::lang::String* >* x10::util::StringUtil::FMGL(FALSE_STRINGS);
void x10::util::StringUtil::FMGL(FALSE_STRINGS__do_init)() {
    FMGL(FALSE_STRINGS__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::StringUtil.FALSE_STRINGS");
    ::x10::lang::Rail< ::x10::lang::String* >* __var2967__ = (__extension__ ({
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        ::x10::lang::Rail< ::x10::lang::String* >* t__130451 =
          ::x10::lang::Rail< ::x10::lang::String* >::_makeUnsafe(((x10_long)9ll), false);
        t__130451->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)0ll), (__extension__ ({ static ::x10::lang::String* strLit__130515 = ::x10aux::makeStringLit("0"); strLit__130515; })));
        t__130451->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)1ll), (__extension__ ({ static ::x10::lang::String* strLit__130516 = ::x10aux::makeStringLit("no"); strLit__130516; })));
        t__130451->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)2ll), (__extension__ ({ static ::x10::lang::String* strLit__130517 = ::x10aux::makeStringLit("non"); strLit__130517; })));
        t__130451->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)3ll), (__extension__ ({ static ::x10::lang::String* strLit__130518 = ::x10aux::makeStringLit("nao"); strLit__130518; })));
        t__130451->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)4ll), (__extension__ ({ static ::x10::lang::String* strLit__130519 = ::x10aux::makeStringLit("nay"); strLit__130519; })));
        t__130451->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)5ll), (__extension__ ({ static ::x10::lang::String* strLit__130520 = ::x10aux::makeStringLit("nein"); strLit__130520; })));
        t__130451->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)6ll), (__extension__ ({ static ::x10::lang::String* strLit__130521 = ::x10aux::makeStringLit("false"); strLit__130521; })));
        t__130451->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)7ll), (__extension__ ({ static ::x10::lang::String* strLit__130522 = ::x10aux::makeStringLit("f"); strLit__130522; })));
        t__130451->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)8ll), (__extension__ ({ static ::x10::lang::String* strLit__130523 = ::x10aux::makeStringLit("off"); strLit__130523; })));
        t__130451;
    }))
    ;
    FMGL(FALSE_STRINGS) = __var2967__;
    FMGL(FALSE_STRINGS__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::StringUtil::FMGL(FALSE_STRINGS__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(FALSE_STRINGS__status), &FMGL(FALSE_STRINGS__do_init), &FMGL(FALSE_STRINGS__exception), "x10::util::StringUtil.FALSE_STRINGS");
    
}
volatile ::x10aux::StaticInitController::status x10::util::StringUtil::FMGL(FALSE_STRINGS__status);
::x10::lang::CheckedThrowable* x10::util::StringUtil::FMGL(FALSE_STRINGS__exception);

//#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
/** the set of strings that are to be interpreted as meaning "no" or "false" */
::x10::util::HashSet< ::x10::lang::String*>* x10::util::StringUtil::FMGL(falseStrings);
void x10::util::StringUtil::FMGL(falseStrings__do_init)() {
    FMGL(falseStrings__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::StringUtil.falseStrings");
    ::x10::util::HashSet< ::x10::lang::String*>* __var2968__ = ::x10::util::StringUtil::makeSet< ::x10::lang::String* >(
                                                                 ::x10::util::StringUtil::FMGL(FALSE_STRINGS__get)());
    FMGL(falseStrings) = __var2968__;
    FMGL(falseStrings__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::StringUtil::FMGL(falseStrings__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(falseStrings__status), &FMGL(falseStrings__do_init), &FMGL(falseStrings__exception), "x10::util::StringUtil.falseStrings");
    
}
volatile ::x10aux::StaticInitController::status x10::util::StringUtil::FMGL(falseStrings__status);
::x10::lang::CheckedThrowable* x10::util::StringUtil::FMGL(falseStrings__exception);

//#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
::x10::util::HashMap< ::x10::lang::String*, x10_int>* x10::util::StringUtil::makeBooleanMap(
  ) {
    
    //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    ::x10::util::HashMap< ::x10::lang::String*, x10_int>* map =
       (new (::x10aux::alloc_z< ::x10::util::HashMap< ::x10::lang::String*, x10_int> >()) ::x10::util::HashMap< ::x10::lang::String*, x10_int>());
    (map)->::x10::util::HashMap< ::x10::lang::String*, x10_int>::_constructor();
    
    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    {
        ::x10::lang::Iterator< ::x10::lang::String*>* s__121727;
        for (s__121727 = ::x10::util::StringUtil::FMGL(trueStrings__get)()->iterator();
             ::x10::lang::Iterator< ::x10::lang::String*>::hasNext(::x10aux::nullCheck(s__121727));
             ) {
            ::x10::lang::String* s = ::x10::lang::Iterator< ::x10::lang::String*>::next(::x10aux::nullCheck(s__121727));
            map->put(s, ((x10_int)1));
        }
    }
    
    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    {
        ::x10::lang::Iterator< ::x10::lang::String*>* s__121729;
        for (s__121729 = ::x10::util::StringUtil::FMGL(falseStrings__get)()->iterator();
             ::x10::lang::Iterator< ::x10::lang::String*>::hasNext(::x10aux::nullCheck(s__121729));
             ) {
            ::x10::lang::String* s = ::x10::lang::Iterator< ::x10::lang::String*>::next(::x10aux::nullCheck(s__121729));
            map->put(s, ((x10_int)0));
        }
    }
    
    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    return map;
    
}

//#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
/** maps the true strings to true and the false strings to false */
::x10::util::HashMap< ::x10::lang::String*, x10_int>* x10::util::StringUtil::FMGL(booleans);
void x10::util::StringUtil::FMGL(booleans__do_init)() {
    FMGL(booleans__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::StringUtil.booleans");
    ::x10::util::HashMap< ::x10::lang::String*, x10_int>* __var2970__ = ::x10::util::StringUtil::makeBooleanMap();
    FMGL(booleans) = __var2970__;
    FMGL(booleans__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::StringUtil::FMGL(booleans__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(booleans__status), &FMGL(booleans__do_init), &FMGL(booleans__exception), "x10::util::StringUtil.booleans");
    
}
volatile ::x10aux::StaticInitController::status x10::util::StringUtil::FMGL(booleans__status);
::x10::lang::CheckedThrowable* x10::util::StringUtil::FMGL(booleans__exception);

//#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
x10_boolean x10::util::StringUtil::checkBoolean(::x10::lang::String* v) {
    
    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    ::x10::lang::String* vlow = ::x10aux::nullCheck(v)->x10::lang::String::toLowerCase();
    
    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    x10_int fromMap = ::x10::util::StringUtil::FMGL(booleans__get)()->getOrElse(
                        vlow, ((x10_int)-1));
    
    //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    if ((::x10aux::struct_equals(fromMap, ((x10_int)1))))
    {
        return true;
        
    } else 
    //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    if ((::x10aux::struct_equals(fromMap, ((x10_int)0))))
    {
        return false;
        
    } else {
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalArgumentException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__130530 = ::x10aux::makeStringLit("Expected boolean string literal, got \""); strLit__130530; })), v), (__extension__ ({ static ::x10::lang::String* strLit__130531 = ::x10aux::makeStringLit("\""); strLit__130531; }))))));
    }
    
}

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
::x10::util::StringUtil* x10::util::StringUtil::x10__util__StringUtil____this__x10__util__StringUtil(
  ) {
    return this;
    
}
void x10::util::StringUtil::_constructor() {
    ::x10::util::StringUtil* this__122182 = this;
    
}
::x10::util::StringUtil* x10::util::StringUtil::_make() {
    ::x10::util::StringUtil* this_ = new (::x10aux::alloc_z< ::x10::util::StringUtil>()) ::x10::util::StringUtil();
    this_->_constructor();
    return this_;
}


void x10::util::StringUtil::__fieldInitializers_x10_util_StringUtil(
  ) {
 
}
const ::x10aux::serialization_id_t x10::util::StringUtil::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::StringUtil::_deserializer);

void x10::util::StringUtil::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::util::StringUtil::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::StringUtil* this_ = new (::x10aux::alloc_z< ::x10::util::StringUtil>()) ::x10::util::StringUtil();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::StringUtil::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::util::StringUtil::rtt;
void x10::util::StringUtil::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.util.StringUtil",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of StringUtil */
/*************************************************/
