/*************************************************/
/* START of Option */
#include <x10/util/Option.h>

namespace x10 { namespace util { 
class Option_ibox0 : public ::x10::lang::IBox< ::x10::util::Option> {
public:
    static ::x10::lang::Any::itable< Option_ibox0 > itable;
    x10_boolean equals(::x10::lang::Any* arg0) {
        return this->value->equals(arg0);
    }
    x10_int hashCode() {
        return this->value->hashCode();
    }
    ::x10::lang::String* toString() {
        return this->value->toString();
    }
    ::x10::lang::String* typeName() {
        return this->value->typeName();
    }
    
};
::x10::lang::Any::itable< Option_ibox0 >  Option_ibox0::itable(&Option_ibox0::equals, &Option_ibox0::hashCode, &Option_ibox0::toString, &Option_ibox0::typeName);
} } 
::x10::lang::Any::itable< ::x10::util::Option >  x10::util::Option::_itable_0(&x10::util::Option::equals, &x10::util::Option::hashCode, &x10::util::Option::toString, &x10::util::Option::typeName);
::x10aux::itable_entry x10::util::Option::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::util::Option::_itable_0), ::x10aux::itable_entry(NULL, (void*)"::x10::util::Option")};
::x10aux::itable_entry x10::util::Option::_iboxitables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::util::Option_ibox0::itable), ::x10aux::itable_entry(NULL, (void*)"::x10::util::Option")};

//#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
/** a string of the form "-key" that is the short name for the option */

//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
/** a string of the form "--key" that is the long name for the option */

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
/** what you want to appear in help messages */

//#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
/** 
     * the minimum number of arguments following the option that it consumes,
     * the default being 0.
     */

//#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
/** 
     * if true, any number greater than the minimum may be consumed, but the
     * default is false.
     */

//#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
/**
     * if true, this option has values and must be specified in the command line.
     * Of course, flags are NEVER required.  The default is false--that is, 
     * unless you say otherwise, an option is, as the name suggests, optional.
     */

//#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
/**
     * if true, this option was added "on the fly" to the list of valid options,
     * rather than having been specified as part of the OptionsParser's initial
     * construction.  This is useful if you just want to ignore unknown option
     * keys, but still keep a record of what you've seen.
     */

//#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
void x10::util::Option::_constructor(::x10::lang::String* s, ::x10::lang::String* l,
                                     ::x10::lang::String* d) {
    
    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    ((*this))->::x10::util::Option::_constructor(s, l, d, ((x10_int)0),
                                                 false, false, false);
    
}
::x10::util::Option x10::util::Option::_make(::x10::lang::String* s,
                                             ::x10::lang::String* l,
                                             ::x10::lang::String* d)
{
    ::x10::util::Option this_; 
    this_->_constructor(s, l, d);
    return this_;
}



//#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
void x10::util::Option::_constructor(::x10::lang::String* s, ::x10::lang::String* l,
                                     ::x10::lang::String* d,
                                     x10_int followers) {
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    ((*this))->::x10::util::Option::_constructor(s, l, d,
                                                 followers,
                                                 false, false,
                                                 false);
    
}
::x10::util::Option x10::util::Option::_make(::x10::lang::String* s,
                                             ::x10::lang::String* l,
                                             ::x10::lang::String* d,
                                             x10_int followers)
{
    ::x10::util::Option this_; 
    this_->_constructor(s, l, d, followers);
    return this_;
}



//#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
void x10::util::Option::_constructor(::x10::lang::String* s,
                                     ::x10::lang::String* l,
                                     ::x10::lang::String* d,
                                     x10_int followers, x10_boolean mayBeMore) {
    
    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    ((*this))->::x10::util::Option::_constructor(s, l, d,
                                                 followers,
                                                 mayBeMore,
                                                 false, false);
    
}
::x10::util::Option x10::util::Option::_make(::x10::lang::String* s,
                                             ::x10::lang::String* l,
                                             ::x10::lang::String* d,
                                             x10_int followers,
                                             x10_boolean mayBeMore)
{
    ::x10::util::Option this_; 
    this_->_constructor(s, l, d, followers, mayBeMore);
    return this_;
}



//#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
void x10::util::Option::_constructor(::x10::lang::String* s,
                                     ::x10::lang::String* l,
                                     ::x10::lang::String* d,
                                     x10_int followers, x10_boolean mayBeMore,
                                     x10_boolean mustSee) {
    
    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    ((*this))->::x10::util::Option::_constructor(s, l, d,
                                                 followers,
                                                 mayBeMore,
                                                 mustSee,
                                                 false);
    
}
::x10::util::Option x10::util::Option::_make(::x10::lang::String* s,
                                             ::x10::lang::String* l,
                                             ::x10::lang::String* d,
                                             x10_int followers,
                                             x10_boolean mayBeMore,
                                             x10_boolean mustSee)
{
    ::x10::util::Option this_; 
    this_->_constructor(s, l, d, followers, mayBeMore, mustSee);
    return this_;
}



//#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
void x10::util::Option::_constructor(::x10::lang::String* s,
                                     ::x10::lang::String* l,
                                     ::x10::lang::String* d,
                                     x10_int followers, x10_boolean mayBeMore,
                                     x10_boolean mustSee,
                                     x10_boolean otf) {
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    ::x10::util::Option this__121800 = (*this);
    
    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    (*this)->FMGL(shortForm) = (::x10aux::struct_equals(::x10aux::nullCheck(s)->x10::lang::String::length(),
                                                        ((x10_int)0)))
      ? (s) : ((::x10aux::struct_equals((s)->charAt(((x10_int)0)),
                                        ((x10_char)'-')))
                 ? (s) : (::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129897 = ::x10aux::makeStringLit("-"); strLit__129897; })), s)));
    
    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    (*this)->FMGL(longForm) = (::x10aux::struct_equals(::x10aux::nullCheck(l)->x10::lang::String::length(),
                                                       ((x10_int)0)))
      ? (l) : (::x10aux::nullCheck(l)->x10::lang::String::startsWith(
                 (__extension__ ({ static ::x10::lang::String* strLit__129898 = ::x10aux::makeStringLit("--"); strLit__129898; })))
                 ? (l) : (::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129899 = ::x10aux::makeStringLit("--"); strLit__129899; })), l)));
    
    //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    (*this)->FMGL(description) = d;
    
    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    (*this)->FMGL(minFollow) = followers;
    
    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    (*this)->FMGL(arbFollow) = mayBeMore;
    
    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    (*this)->FMGL(required) = mustSee;
    
    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    (*this)->FMGL(onTheFly) = otf;
}
::x10::util::Option x10::util::Option::_make(::x10::lang::String* s,
                                             ::x10::lang::String* l,
                                             ::x10::lang::String* d,
                                             x10_int followers,
                                             x10_boolean mayBeMore,
                                             x10_boolean mustSee,
                                             x10_boolean otf)
{
    ::x10::util::Option this_; 
    this_->_constructor(s, l, d, followers, mayBeMore, mustSee,
    otf);
    return this_;
}



//#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"

//#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"

//#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
::x10::lang::String* x10::util::Option::otherForm(::x10::lang::String* key) {
    
    //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    return ::x10aux::equals(key,(*this)->FMGL(shortForm))
      ? ((*this)->FMGL(longForm)) : (::x10aux::equals(key,(*this)->FMGL(longForm))
                                       ? ((*this)->FMGL(shortForm))
                                       : ((::x10aux::class_cast_unchecked< ::x10::lang::String*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))));
    
}

//#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
::x10::lang::String* x10::util::Option::toString() {
    return ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129900 = ::x10aux::makeStringLit("{\n   short: \""); strLit__129900; })), (*this)->FMGL(shortForm)), (__extension__ ({ static ::x10::lang::String* strLit__129901 = ::x10aux::makeStringLit("\",\n   long: \""); strLit__129901; }))), (*this)->FMGL(longForm)), (__extension__ ({ static ::x10::lang::String* strLit__129902 = ::x10aux::makeStringLit("\",\n   minFollow: "); strLit__129902; }))), (*this)->FMGL(minFollow)), (__extension__ ({ static ::x10::lang::String* strLit__129903 = ::x10aux::makeStringLit(",\n   arbFollow: "); strLit__129903; }))), (*this)->FMGL(arbFollow)), (__extension__ ({ static ::x10::lang::String* strLit__129904 = ::x10aux::makeStringLit(",\n   required: "); strLit__129904; }))), (*this)->FMGL(required)), (__extension__ ({ static ::x10::lang::String* strLit__129905 = ::x10aux::makeStringLit(",\n   description: \""); strLit__129905; }))), (*this)->FMGL(description)), (__extension__ ({ static ::x10::lang::String* strLit__129906 = ::x10aux::makeStringLit("\"\n}"); strLit__129906; })));
    
}

//#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
::x10::lang::String* x10::util::Option::usage() {
    
    //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    ::x10::lang::String* keys = (*this)->FMGL(shortForm);
    
    //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    if (((((x10_long)(::x10aux::nullCheck((*this)->FMGL(longForm))->x10::lang::String::length()))) > (((x10_long)0ll))))
    {
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (((((x10_long)(::x10aux::nullCheck((*this)->FMGL(shortForm))->x10::lang::String::length()))) > (((x10_long)0ll))))
        {
            keys = ::x10::lang::String::__plus(keys, ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129907 = ::x10aux::makeStringLit(" or "); strLit__129907; })), (*this)->FMGL(longForm)));
        } else {
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            keys = (*this)->FMGL(longForm);
        }
        
    }
    
    //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    ::x10::lang::String* values = (__extension__ ({ static ::x10::lang::String* strLit__129908 = ::x10aux::makeStringLit(": "); strLit__129908; }));
    
    //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    if ((*this)->FMGL(arbFollow)) {
        
        //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        values = ::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129909 = ::x10aux::makeStringLit(" ("); strLit__129909; })), (*this)->FMGL(minFollow)), (__extension__ ({ static ::x10::lang::String* strLit__129910 = ::x10aux::makeStringLit(" or more values): "); strLit__129910; })));
    } else 
    //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    if ((::x10aux::struct_equals((*this)->FMGL(minFollow),
                                 ((x10_int)1)))) {
        values = ::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129911 = ::x10aux::makeStringLit(" ("); strLit__129911; })), (*this)->FMGL(minFollow)), (__extension__ ({ static ::x10::lang::String* strLit__129912 = ::x10aux::makeStringLit(" value): "); strLit__129912; })));
    } else 
    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    if ((((*this)->FMGL(minFollow)) > (((x10_int)1)))) {
        values = ::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129913 = ::x10aux::makeStringLit(" ("); strLit__129913; })), (*this)->FMGL(minFollow)), (__extension__ ({ static ::x10::lang::String* strLit__129914 = ::x10aux::makeStringLit(" values): "); strLit__129914; })));
    }
    
    //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    ::x10::lang::String* req = (*this)->FMGL(required) ? ((__extension__ ({ static ::x10::lang::String* strLit__129915 = ::x10aux::makeStringLit(" (required)"); strLit__129915; })))
      : ((__extension__ ({ static ::x10::lang::String* strLit__129916 = ::x10aux::makeStringLit(""); strLit__129916; })));
    
    //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    return ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(keys, values), (*this)->FMGL(description)), req);
    
}

//#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
/**
     * This is the value that the OptionsParser uses for the option that
     * says the caller just wants to see the correct usage for the command.
     */
::x10::util::Option x10::util::Option::FMGL(HELP);
void x10::util::Option::FMGL(HELP__do_init)() {
    FMGL(HELP__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Option.HELP");
    ::x10::util::Option __var2849__ = ::x10::util::Option::_make((__extension__ ({ static ::x10::lang::String* strLit__129917 = ::x10aux::makeStringLit("?"); strLit__129917; })),
                                                                 (__extension__ ({ static ::x10::lang::String* strLit__129918 = ::x10aux::makeStringLit("help"); strLit__129918; })),
                                                                 (__extension__ ({ static ::x10::lang::String* strLit__129919 = ::x10aux::makeStringLit("displays this message and exits"); strLit__129919; })));
    FMGL(HELP) = __var2849__;
    FMGL(HELP__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Option::FMGL(HELP__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(HELP__status), &FMGL(HELP__do_init), &FMGL(HELP__exception), "x10::util::Option.HELP");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Option::FMGL(HELP__status);
::x10::lang::CheckedThrowable* x10::util::Option::FMGL(HELP__exception);

//#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
/**
     * This is a value you can use if you need an Option that is definitely
     * illegal
     */
::x10::util::Option x10::util::Option::FMGL(BAD);
void x10::util::Option::FMGL(BAD__do_init)() {
    FMGL(BAD__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Option.BAD");
    ::x10::util::Option __var2850__ = ::x10::util::Option::_make((__extension__ ({ static ::x10::lang::String* strLit__129920 = ::x10aux::makeStringLit(""); strLit__129920; })),
                                                                 (__extension__ ({ static ::x10::lang::String* strLit__129921 = ::x10aux::makeStringLit(""); strLit__129921; })),
                                                                 (__extension__ ({ static ::x10::lang::String* strLit__129922 = ::x10aux::makeStringLit(""); strLit__129922; })),
                                                                 ((x10_int)0),
                                                                 true,
                                                                 true);
    FMGL(BAD) = __var2850__;
    FMGL(BAD__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Option::FMGL(BAD__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(BAD__status), &FMGL(BAD__do_init), &FMGL(BAD__exception), "x10::util::Option.BAD");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Option::FMGL(BAD__status);
::x10::lang::CheckedThrowable* x10::util::Option::FMGL(BAD__exception);

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
::x10::lang::String* x10::util::Option::typeName(){
    return ::x10aux::type_name((*this));
}
x10_int x10::util::Option::hashCode() {
    x10_int result = ((x10_int)1);
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(shortForm))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(longForm))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(description))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(minFollow))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(arbFollow))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(required))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(onTheFly))));
    return result;
    
}
x10_boolean x10::util::Option::equals(::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::util::Option>(other)))
    {
        return false;
        
    }
    return (*this)->x10::util::Option::equals(::x10aux::class_cast< ::x10::util::Option>(other));
    
}
x10_boolean x10::util::Option::_struct_equals(::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::util::Option>(other)))
    {
        return false;
        
    }
    return (*this)->x10::util::Option::_struct_equals(::x10aux::class_cast< ::x10::util::Option>(other));
    
}
void ::x10::util::Option::_serialize(::x10::util::Option this_, ::x10aux::serialization_buffer& buf) {
    buf.write(this_->FMGL(shortForm));
    buf.write(this_->FMGL(longForm));
    buf.write(this_->FMGL(description));
    buf.write(this_->FMGL(minFollow));
    buf.write(this_->FMGL(arbFollow));
    buf.write(this_->FMGL(required));
    buf.write(this_->FMGL(onTheFly));
    
}

void ::x10::util::Option::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(shortForm) = buf.read< ::x10::lang::String*>();
    FMGL(longForm) = buf.read< ::x10::lang::String*>();
    FMGL(description) = buf.read< ::x10::lang::String*>();
    FMGL(minFollow) = buf.read<x10_int>();
    FMGL(arbFollow) = buf.read<x10_boolean>();
    FMGL(required) = buf.read<x10_boolean>();
    FMGL(onTheFly) = buf.read<x10_boolean>();
    
}


::x10aux::RuntimeType x10::util::Option::rtt;
void x10::util::Option::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Any>()};
    rtt.initStageTwo("x10.util.Option",::x10aux::RuntimeType::struct_kind, 1, parents, 0, NULL, NULL);
}

/* END of Option */
/*************************************************/
