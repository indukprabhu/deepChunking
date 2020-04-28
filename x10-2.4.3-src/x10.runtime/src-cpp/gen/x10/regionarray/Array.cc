/*************************************************/
/* START of Array */
#include <x10/regionarray/Array.h>

::x10aux::RuntimeType x10::regionarray::Array<void>::rtt;
void x10::regionarray::Array<void>::raiseBoundsError(x10_long i0) {
    
    //#line 1162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125978 = ::x10aux::makeStringLit("point ("); strLit__125978; })), i0), (__extension__ ({ static ::x10::lang::String* strLit__125979 = ::x10aux::makeStringLit(") not contained in array"); strLit__125979; }))))));
}
void x10::regionarray::Array<void>::raiseBoundsError(x10_long i0, x10_long i1) {
    
    //#line 1165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125980 = ::x10aux::makeStringLit("point ("); strLit__125980; })), i0), (__extension__ ({ static ::x10::lang::String* strLit__125981 = ::x10aux::makeStringLit(", "); strLit__125981; }))), i1), (__extension__ ({ static ::x10::lang::String* strLit__125982 = ::x10aux::makeStringLit(") not contained in array"); strLit__125982; }))))));
}
void x10::regionarray::Array<void>::raiseBoundsError(x10_long i0, x10_long i1,
                                                     x10_long i2) {
    
    //#line 1168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125983 = ::x10aux::makeStringLit("point ("); strLit__125983; })), i0), (__extension__ ({ static ::x10::lang::String* strLit__125984 = ::x10aux::makeStringLit(", "); strLit__125984; }))), i1), (__extension__ ({ static ::x10::lang::String* strLit__125985 = ::x10aux::makeStringLit(", "); strLit__125985; }))), i2), (__extension__ ({ static ::x10::lang::String* strLit__125986 = ::x10aux::makeStringLit(") not contained in array"); strLit__125986; }))))));
}
void x10::regionarray::Array<void>::raiseBoundsError(x10_long i0, x10_long i1,
                                                     x10_long i2, x10_long i3) {
    
    //#line 1171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125987 = ::x10aux::makeStringLit("point ("); strLit__125987; })), i0), (__extension__ ({ static ::x10::lang::String* strLit__125988 = ::x10aux::makeStringLit(", "); strLit__125988; }))), i1), (__extension__ ({ static ::x10::lang::String* strLit__125989 = ::x10aux::makeStringLit(", "); strLit__125989; }))), i2), (__extension__ ({ static ::x10::lang::String* strLit__125990 = ::x10aux::makeStringLit(", "); strLit__125990; }))), i3), (__extension__ ({ static ::x10::lang::String* strLit__125991 = ::x10aux::makeStringLit(") not contained in array"); strLit__125991; }))))));
}
void x10::regionarray::Array<void>::raiseBoundsError(::x10::lang::Point* pt) {
    
    //#line 1174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125992 = ::x10aux::makeStringLit("point "); strLit__125992; })), pt), (__extension__ ({ static ::x10::lang::String* strLit__125993 = ::x10aux::makeStringLit(" not contained in array"); strLit__125993; }))))));
}

/* END of Array */
/*************************************************/
/*************************************************/
/* START of Array$Anonymous$14235$Anonymous$14292 */
#include <x10/regionarray/Array__Anonymous__14235__Anonymous__14292.h>

::x10aux::RuntimeType x10::regionarray::Array__Anonymous__14235__Anonymous__14292<void>::rtt;

/* END of Array$Anonymous$14235$Anonymous$14292 */
/*************************************************/
/*************************************************/
/* START of Array$Anonymous$14520$Anonymous$14577 */
#include <x10/regionarray/Array__Anonymous__14520__Anonymous__14577.h>

::x10aux::RuntimeType x10::regionarray::Array__Anonymous__14520__Anonymous__14577<void>::rtt;

/* END of Array$Anonymous$14520$Anonymous$14577 */
/*************************************************/
/*************************************************/
/* START of Array$LayoutHelper */
#include <x10/regionarray/Array__LayoutHelper.h>

#include <x10/lang/Any.h>
#include <x10/lang/Long.h>
#include <x10/lang/Rail.h>
#include <x10/regionarray/Region.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/String.h>
#include <x10/compiler/Native.h>
#include <x10/compiler/NonEscaping.h>
#include <x10/compiler/Synthetic.h>
#include <x10/lang/Int.h>
namespace x10 { namespace regionarray { 
class Array__LayoutHelper_ibox0 : public ::x10::lang::IBox< ::x10::regionarray::Array__LayoutHelper> {
public:
    static ::x10::lang::Any::itable< Array__LayoutHelper_ibox0 > itable;
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
::x10::lang::Any::itable< Array__LayoutHelper_ibox0 >  Array__LayoutHelper_ibox0::itable(&Array__LayoutHelper_ibox0::equals, &Array__LayoutHelper_ibox0::hashCode, &Array__LayoutHelper_ibox0::toString, &Array__LayoutHelper_ibox0::typeName);
} } 
::x10::lang::Any::itable< ::x10::regionarray::Array__LayoutHelper >  x10::regionarray::Array__LayoutHelper::_itable_0(&x10::regionarray::Array__LayoutHelper::equals, &x10::regionarray::Array__LayoutHelper::hashCode, &x10::regionarray::Array__LayoutHelper::toString, &x10::regionarray::Array__LayoutHelper::typeName);
::x10aux::itable_entry x10::regionarray::Array__LayoutHelper::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::regionarray::Array__LayoutHelper::_itable_0), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::Array__LayoutHelper")};
::x10aux::itable_entry x10::regionarray::Array__LayoutHelper::_iboxitables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::regionarray::Array__LayoutHelper_ibox0::itable), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::Array__LayoutHelper")};

//#line 1239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
void x10::regionarray::Array__LayoutHelper::_constructor(::x10::regionarray::Region* reg) {
    
    //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array__LayoutHelper this__107617 = (*this);
    
    //#line 1246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    if (::x10aux::nullCheck(reg)->isEmpty()) {
        
        //#line 1247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        (*this)->FMGL(min0) = (*this)->FMGL(stride1) = (*this)->FMGL(min1) =
          ((x10_long)0ll);
        
        //#line 1248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        (*this)->FMGL(size) = ((x10_long)0ll);
        
        //#line 1249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        (*this)->FMGL(layout) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    } else 
    //#line 1251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    if ((::x10aux::struct_equals(::x10aux::nullCheck(reg)->FMGL(rank), ((x10_long)1ll))))
    {
        
        //#line 1252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        (*this)->FMGL(min0) = ::x10aux::nullCheck(reg)->min(((x10_long)(((x10_int)0))));
        
        //#line 1253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        (*this)->FMGL(stride1) = ((x10_long)0ll);
        
        //#line 1254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        (*this)->FMGL(min1) = ((x10_long)0ll);
        
        //#line 1255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        (*this)->FMGL(size) = ((((::x10aux::nullCheck(reg)->max(((x10_long)0ll))) - (::x10aux::nullCheck(reg)->min(
                                                                                       ((x10_long)0ll))))) + (((x10_long)1ll)));
        
        //#line 1256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        (*this)->FMGL(layout) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    } else 
    //#line 1257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    if ((::x10aux::struct_equals(::x10aux::nullCheck(reg)->FMGL(rank),
                                 ((x10_long)2ll)))) {
        
        //#line 1258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        (*this)->FMGL(min0) = ::x10aux::nullCheck(reg)->min(
                                ((x10_long)0ll));
        
        //#line 1259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        (*this)->FMGL(min1) = ::x10aux::nullCheck(reg)->min(
                                ((x10_long)1ll));
        
        //#line 1260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        (*this)->FMGL(stride1) = ((((::x10aux::nullCheck(reg)->max(
                                       ((x10_long)1ll))) - (::x10aux::nullCheck(reg)->min(
                                                              ((x10_long)1ll))))) + (((x10_long)1ll)));
        
        //#line 1261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        (*this)->FMGL(size) = (((*this)->FMGL(stride1)) * (((((::x10aux::nullCheck(reg)->max(
                                                                 ((x10_long)0ll))) - (::x10aux::nullCheck(reg)->min(
                                                                                        ((x10_long)0ll))))) + (((x10_long)1ll)))));
        
        //#line 1262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        (*this)->FMGL(layout) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    } else {
        
        //#line 1264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        (*this)->FMGL(layout) = ::x10::lang::Rail< x10_long >::_make(((((x10_long)2ll)) * (((::x10aux::nullCheck(reg)->FMGL(rank)) - (((x10_long)2ll))))));
        
        //#line 1265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        (*this)->FMGL(min0) = ::x10aux::nullCheck(reg)->min(
                                ((x10_long)0ll));
        
        //#line 1266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        (*this)->FMGL(min1) = ::x10aux::nullCheck(reg)->min(
                                ((x10_long)1ll));
        
        //#line 1267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        (*this)->FMGL(stride1) = ((((::x10aux::nullCheck(reg)->max(
                                       ((x10_long)1ll))) - (::x10aux::nullCheck(reg)->min(
                                                              ((x10_long)1ll))))) + (((x10_long)1ll)));
        
        //#line 1268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10_long sz = (((*this)->FMGL(stride1)) * (((((::x10aux::nullCheck(reg)->max(
                                                         ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(reg)->min(
                                                                                           ((x10_long)(((x10_int)0))))))) + (((x10_long)1ll)))));
        
        //#line 1269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10_long i__106309max__107619 = ((::x10aux::nullCheck(reg)->FMGL(rank)) - (((x10_long)1ll)));
        {
            x10_long i__107620;
            for (i__107620 = ((x10_long)2ll); ((i__107620) <= (i__106309max__107619));
                 i__107620 = ((i__107620) + (((x10_long)1ll))))
            {
                x10_long i__107621 = i__107620;
                
                //#line 1270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10_long stride__107618 = ((((::x10aux::nullCheck(reg)->max(
                                                i__107621)) - (::x10aux::nullCheck(reg)->min(
                                                                 i__107621)))) + (((x10_long)1ll)));
                
                //#line 1271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                sz = ((sz) * (stride__107618));
                
                //#line 1272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ::x10aux::nullCheck((*this)->FMGL(layout))->x10::lang::Rail< x10_long >::__set(
                  ((((x10_long)2ll)) * (((i__107621) - (((x10_long)2ll))))),
                  stride__107618);
                
                //#line 1273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ::x10aux::nullCheck((*this)->FMGL(layout))->x10::lang::Rail< x10_long >::__set(
                  ((((((x10_long)2ll)) * (((i__107621) - (((x10_long)2ll)))))) + (((x10_long)1ll))),
                  ::x10aux::nullCheck(reg)->min(i__107621));
            }
        }
        
        //#line 1275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        (*this)->FMGL(size) = sz;
    }
    
}
::x10::regionarray::Array__LayoutHelper x10::regionarray::Array__LayoutHelper::_make(
  ::x10::regionarray::Region* reg) {
    ::x10::regionarray::Array__LayoutHelper this_; 
    this_->_constructor(reg);
    return this_;
}



//#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
::x10::lang::String* x10::regionarray::Array__LayoutHelper::typeName(
  ){
    return ::x10aux::type_name((*this));
}
::x10::lang::String* x10::regionarray::Array__LayoutHelper::toString(
  ) {
    return ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126012 = ::x10aux::makeStringLit("struct x10.regionarray.Array.LayoutHelper:"); strLit__126012; })), (__extension__ ({ static ::x10::lang::String* strLit__126013 = ::x10aux::makeStringLit(" min0="); strLit__126013; }))), (*this)->FMGL(min0)), (__extension__ ({ static ::x10::lang::String* strLit__126014 = ::x10aux::makeStringLit(" stride1="); strLit__126014; }))), (*this)->FMGL(stride1)), (__extension__ ({ static ::x10::lang::String* strLit__126015 = ::x10aux::makeStringLit(" min1="); strLit__126015; }))), (*this)->FMGL(min1)), (__extension__ ({ static ::x10::lang::String* strLit__126016 = ::x10aux::makeStringLit(" size="); strLit__126016; }))), (*this)->FMGL(size)), (__extension__ ({ static ::x10::lang::String* strLit__126017 = ::x10aux::makeStringLit(" layout="); strLit__126017; }))), (*this)->FMGL(layout));
    
}
x10_int x10::regionarray::Array__LayoutHelper::hashCode() {
    x10_int result = ((x10_int)1);
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(min0))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(stride1))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(min1))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(size))));
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(layout))));
    return result;
    
}
x10_boolean x10::regionarray::Array__LayoutHelper::equals(
  ::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::regionarray::Array__LayoutHelper>(other)))
    {
        return false;
        
    }
    return (*this)->x10::regionarray::Array__LayoutHelper::equals(
             ::x10aux::class_cast< ::x10::regionarray::Array__LayoutHelper>(other));
    
}
x10_boolean x10::regionarray::Array__LayoutHelper::_struct_equals(
  ::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::regionarray::Array__LayoutHelper>(other)))
    {
        return false;
        
    }
    return (*this)->x10::regionarray::Array__LayoutHelper::_struct_equals(
             ::x10aux::class_cast< ::x10::regionarray::Array__LayoutHelper>(other));
    
}
void ::x10::regionarray::Array__LayoutHelper::_serialize(::x10::regionarray::Array__LayoutHelper this_, ::x10aux::serialization_buffer& buf) {
    buf.write(this_->FMGL(min0));
    buf.write(this_->FMGL(stride1));
    buf.write(this_->FMGL(min1));
    buf.write(this_->FMGL(size));
    buf.write(this_->FMGL(layout));
    
}

void ::x10::regionarray::Array__LayoutHelper::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(min0) = buf.read<x10_long>();
    FMGL(stride1) = buf.read<x10_long>();
    FMGL(min1) = buf.read<x10_long>();
    FMGL(size) = buf.read<x10_long>();
    FMGL(layout) = buf.read< ::x10::lang::Rail< x10_long >*>();
}


::x10aux::RuntimeType x10::regionarray::Array__LayoutHelper::rtt;
void x10::regionarray::Array__LayoutHelper::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Any>()};
    rtt.initStageTwo("x10.regionarray.Array.LayoutHelper",::x10aux::RuntimeType::struct_kind, 1, parents, 0, NULL, NULL);
}

/* END of Array$LayoutHelper */
/*************************************************/
/*************************************************/
/* START of Array$Anonymous$14235 */
#include <x10/regionarray/Array__Anonymous__14235.h>

::x10aux::RuntimeType x10::regionarray::Array__Anonymous__14235<void>::rtt;

/* END of Array$Anonymous$14235 */
/*************************************************/
/*************************************************/
/* START of Array$Anonymous$14520 */
#include <x10/regionarray/Array__Anonymous__14520.h>

::x10aux::RuntimeType x10::regionarray::Array__Anonymous__14520<void>::rtt;

/* END of Array$Anonymous$14520 */
/*************************************************/
