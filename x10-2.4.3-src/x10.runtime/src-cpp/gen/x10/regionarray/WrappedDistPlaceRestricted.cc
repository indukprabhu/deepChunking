/*************************************************/
/* START of WrappedDistPlaceRestricted */
#include <x10/regionarray/WrappedDistPlaceRestricted.h>

#include <x10/regionarray/Dist.h>
#include <x10/lang/Place.h>
#include <x10/regionarray/Region.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/lang/SparsePlaceGroup.h>
#include <x10/lang/Long.h>
#include <x10/lang/Iterable.h>
#include <x10/lang/Rail.h>
#include <x10/regionarray/EmptyRegion.h>
#include <x10/lang/Point.h>
#include <x10/lang/ArrayIndexOutOfBoundsException.h>
#include <x10/lang/String.h>
#include <x10/lang/Runtime.h>
#include <x10/regionarray/WrappedDistRegionRestricted.h>
#include <x10/regionarray/ConstantDist.h>
#include <x10/lang/Any.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Synthetic.h>
::x10::lang::Fun_0_1< ::x10::lang::Point*, ::x10::lang::Place>::itable< ::x10::regionarray::WrappedDistPlaceRestricted >  x10::regionarray::WrappedDistPlaceRestricted::_itable_0(&x10::regionarray::WrappedDistPlaceRestricted::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::WrappedDistPlaceRestricted::__apply, &::x10::regionarray::Dist::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::WrappedDistPlaceRestricted >  x10::regionarray::WrappedDistPlaceRestricted::_itable_1(&x10::regionarray::WrappedDistPlaceRestricted::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Dist::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Iterable< ::x10::lang::Point*>::itable< ::x10::regionarray::WrappedDistPlaceRestricted >  x10::regionarray::WrappedDistPlaceRestricted::_itable_2(&x10::regionarray::WrappedDistPlaceRestricted::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Dist::iterator, &::x10::regionarray::Dist::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::WrappedDistPlaceRestricted::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::Point*, ::x10::lang::Place> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::WrappedDistPlaceRestricted")};

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
void x10::regionarray::WrappedDistPlaceRestricted::_constructor(::x10::regionarray::Dist* d,
                                                                ::x10::lang::Place p) {
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    ::x10::regionarray::Dist* this__116927 = this;
    
    //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::regionarray::Region* region__116928 = ::x10aux::nullCheck(d)->__apply(
                                                   p);
    
    //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::nullCheck(this__116927)->FMGL(region) = region__116928;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    ::x10::regionarray::WrappedDistPlaceRestricted* this__116926 =
      this;
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    this->FMGL(base) = d;
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    this->FMGL(filter) = p;
}
::x10::regionarray::WrappedDistPlaceRestricted* x10::regionarray::WrappedDistPlaceRestricted::_make(
  ::x10::regionarray::Dist* d, ::x10::lang::Place p) {
    ::x10::regionarray::WrappedDistPlaceRestricted* this_ = new (::x10aux::alloc_z< ::x10::regionarray::WrappedDistPlaceRestricted>()) ::x10::regionarray::WrappedDistPlaceRestricted();
    this_->_constructor(d, p);
    return this_;
}



//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
::x10::lang::PlaceGroup* x10::regionarray::WrappedDistPlaceRestricted::places(
  ) {
    ::x10::lang::SparsePlaceGroup* alloc__116929 =  (new (::x10aux::alloc_z< ::x10::lang::SparsePlaceGroup>()) ::x10::lang::SparsePlaceGroup());
    (alloc__116929)->::x10::lang::SparsePlaceGroup::_constructor(
      this->FMGL(filter));
    return alloc__116929;
    
}

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
x10_long x10::regionarray::WrappedDistPlaceRestricted::numPlaces(
  ) {
    return ((x10_long)1ll);
    
}

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
::x10::lang::Iterable< ::x10::regionarray::Region*>* x10::regionarray::WrappedDistPlaceRestricted::regions(
  ) {
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    return reinterpret_cast< ::x10::lang::Iterable< ::x10::regionarray::Region*>*>(::x10::lang::Rail< ::x10::regionarray::Region* >::_make(((x10_long)1ll),
                                                                                                                                           this->FMGL(region)));
    
}

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
::x10::regionarray::Region* x10::regionarray::WrappedDistPlaceRestricted::get(
  ::x10::lang::Place p) {
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    if ((__extension__ ({
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            ::x10::lang::Place p__116894 = this->FMGL(filter);
            (::x10aux::struct_equals(p__116894->FMGL(id),
                                     p->FMGL(id)));
        }))
        ) {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        return this->FMGL(region);
        
    } else {
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        x10_long rank__116930 = (__extension__ ({
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            ::x10::regionarray::Dist* this__116931 = reinterpret_cast< ::x10::regionarray::Dist*>(this);
            ::x10aux::nullCheck(::x10aux::nullCheck(this__116931)->FMGL(region))->FMGL(rank);
        }))
        ;
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        return reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            ::x10::regionarray::EmptyRegion* alloc__116932 =
               (new (::x10aux::alloc_z< ::x10::regionarray::EmptyRegion>()) ::x10::regionarray::EmptyRegion());
            (alloc__116932)->::x10::regionarray::EmptyRegion::_constructor(
              rank__116930);
            alloc__116932;
        }))
        );
        
    }
    
}

//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
::x10::regionarray::Region* x10::regionarray::WrappedDistPlaceRestricted::__apply(
  ::x10::lang::Place p) {
    return this->x10::regionarray::WrappedDistPlaceRestricted::get(
             p);
    
}

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
::x10::lang::Place x10::regionarray::WrappedDistPlaceRestricted::__apply(
  ::x10::lang::Point* pt) {
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    ::x10::lang::Place bp = ::x10aux::nullCheck(this->FMGL(base))->__apply(
                              pt);
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    if ((__extension__ ({
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            ::x10::lang::Place p__116898 = this->FMGL(filter);
            (::x10aux::struct_equals(p__116898->FMGL(id),
                                     bp->FMGL(id)));
        }))
        ) {
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        return bp;
        
    } else {
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127901 = ::x10aux::makeStringLit("point "); strLit__127901; })), pt), (__extension__ ({ static ::x10::lang::String* strLit__127902 = ::x10aux::makeStringLit(" not contained in distribution"); strLit__127902; }))))));
    }
    
}

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
::x10::lang::Place x10::regionarray::WrappedDistPlaceRestricted::__apply(
  x10_long i0) {
    return this->x10::regionarray::WrappedDistPlaceRestricted::__apply(
             (__extension__ ({
                 
                 //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                 x10_long i__116900 = i0;
                 (__extension__ ({
                     ::x10::lang::Point* alloc__116901 = 
                     (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                     (alloc__116901)->::x10::lang::Point::_constructor(
                       i__116900);
                     alloc__116901;
                 }))
                 ;
             }))
             );
    
}

//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
::x10::lang::Place x10::regionarray::WrappedDistPlaceRestricted::__apply(
  x10_long i0, x10_long i1) {
    return this->x10::regionarray::WrappedDistPlaceRestricted::__apply(
             (__extension__ ({
                 
                 //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                 x10_long i__116903 = i0;
                 x10_long i__116904 = i1;
                 (__extension__ ({
                     ::x10::lang::Point* alloc__116905 = 
                     (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                     (alloc__116905)->::x10::lang::Point::_constructor(
                       i__116903, i__116904);
                     alloc__116905;
                 }))
                 ;
             }))
             );
    
}

//#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
::x10::lang::Place x10::regionarray::WrappedDistPlaceRestricted::__apply(
  x10_long i0, x10_long i1, x10_long i2) {
    return this->x10::regionarray::WrappedDistPlaceRestricted::__apply(
             (__extension__ ({
                 
                 //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                 x10_long i__116907 = i0;
                 x10_long i__116908 = i1;
                 x10_long i__116909 = i2;
                 (__extension__ ({
                     ::x10::lang::Point* alloc__116910 = 
                     (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                     (alloc__116910)->::x10::lang::Point::_constructor(
                       i__116907, i__116908, i__116909);
                     alloc__116910;
                 }))
                 ;
             }))
             );
    
}

//#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
::x10::lang::Place x10::regionarray::WrappedDistPlaceRestricted::__apply(
  x10_long i0, x10_long i1, x10_long i2, x10_long i3) {
    return this->x10::regionarray::WrappedDistPlaceRestricted::__apply(
             (__extension__ ({
                 
                 //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                 x10_long i__116912 = i0;
                 x10_long i__116913 = i1;
                 x10_long i__116914 = i2;
                 x10_long i__116915 = i3;
                 (__extension__ ({
                     ::x10::lang::Point* alloc__116916 = 
                     (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                     (alloc__116916)->::x10::lang::Point::_constructor(
                       i__116912, i__116913, i__116914, i__116915);
                     alloc__116916;
                 }))
                 ;
             }))
             );
    
}

//#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
x10_long x10::regionarray::WrappedDistPlaceRestricted::offset(
  ::x10::lang::Point* pt) {
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    if ((::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here),
                                 this->FMGL(filter)))) {
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        return ::x10aux::nullCheck(this->FMGL(base))->offset(
                 pt);
        
    } else {
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127937 = ::x10aux::makeStringLit("point "); strLit__127937; })), pt), (__extension__ ({ static ::x10::lang::String* strLit__127938 = ::x10aux::makeStringLit(" not contained in distribution"); strLit__127938; }))))));
    }
    
}

//#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
x10_long x10::regionarray::WrappedDistPlaceRestricted::maxOffset(
  ) {
    return ::x10aux::nullCheck(this->FMGL(base))->maxOffset();
    
}

//#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
::x10::regionarray::Dist* x10::regionarray::WrappedDistPlaceRestricted::restriction(
  ::x10::regionarray::Region* r) {
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    ::x10::regionarray::WrappedDistRegionRestricted* alloc__116933 =
       (new (::x10aux::alloc_z< ::x10::regionarray::WrappedDistRegionRestricted>()) ::x10::regionarray::WrappedDistRegionRestricted());
    (alloc__116933)->::x10::regionarray::WrappedDistRegionRestricted::_constructor(
      reinterpret_cast< ::x10::regionarray::Dist*>(this),
      r);
    return alloc__116933;
    
}

//#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
::x10::regionarray::Dist* x10::regionarray::WrappedDistPlaceRestricted::restriction(
  ::x10::lang::Place p) {
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    if ((__extension__ ({
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            ::x10::lang::Place p__116917 = ::x10::lang::Place::_make(::x10aux::here);
            (::x10aux::struct_equals(p__116917->FMGL(id),
                                     p->FMGL(id)));
        }))
        ) {
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        return this;
        
    } else {
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        ::x10::regionarray::Region* r__116936 = (__extension__ ({
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            x10_long rank__116937 = (__extension__ ({
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
                ::x10::regionarray::Dist* this__116938 = reinterpret_cast< ::x10::regionarray::Dist*>(this);
                ::x10aux::nullCheck(::x10aux::nullCheck(this__116938)->FMGL(region))->FMGL(rank);
            }))
            ;
            reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
                ::x10::regionarray::EmptyRegion* alloc__116939 =
                   (new (::x10aux::alloc_z< ::x10::regionarray::EmptyRegion>()) ::x10::regionarray::EmptyRegion());
                (alloc__116939)->::x10::regionarray::EmptyRegion::_constructor(
                  rank__116937);
                alloc__116939;
            }))
            );
        }))
        ;
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        ::x10::regionarray::Region* r__116934 = r__116936;
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        return reinterpret_cast< ::x10::regionarray::Dist*>((__extension__ ({
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            ::x10::regionarray::ConstantDist* alloc__116935 =
               (new (::x10aux::alloc_z< ::x10::regionarray::ConstantDist>()) ::x10::regionarray::ConstantDist());
            (alloc__116935)->::x10::regionarray::ConstantDist::_constructor(
              r__116934, ::x10::lang::Place::_make(::x10aux::here));
            alloc__116935;
        }))
        );
        
    }
    
}

//#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
x10_boolean x10::regionarray::WrappedDistPlaceRestricted::equals(
  ::x10::lang::Any* thatObj) {
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    if (!(::x10aux::instanceof< ::x10::regionarray::WrappedDistPlaceRestricted*>(thatObj)))
    {
        return false;
        
    }
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    ::x10::regionarray::WrappedDistPlaceRestricted* that =
      ::x10aux::class_cast< ::x10::regionarray::WrappedDistPlaceRestricted*>(thatObj);
    
    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    return (::x10aux::nullCheck(this->FMGL(base))->equals(
              reinterpret_cast< ::x10::lang::Any*>(::x10aux::nullCheck(that)->FMGL(base))) &&
    (__extension__ ({
        ::x10::lang::Place this__116925 = this->FMGL(filter);
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        ::x10::lang::Place p__116924 = ::x10aux::nullCheck(that)->FMGL(filter);
        (::x10aux::struct_equals(p__116924->FMGL(id), this__116925->FMGL(id)));
    }))
    );
    
}

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
::x10::regionarray::WrappedDistPlaceRestricted* x10::regionarray::WrappedDistPlaceRestricted::x10__regionarray__WrappedDistPlaceRestricted____this__x10__regionarray__WrappedDistPlaceRestricted(
  ) {
    return this;
    
}
void x10::regionarray::WrappedDistPlaceRestricted::__fieldInitializers_x10_regionarray_WrappedDistPlaceRestricted(
  ) {
 
}
const ::x10aux::serialization_id_t x10::regionarray::WrappedDistPlaceRestricted::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::WrappedDistPlaceRestricted::_deserializer);

void x10::regionarray::WrappedDistPlaceRestricted::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::regionarray::Dist::_serialize_body(buf);
    buf.write(this->FMGL(base));
    buf.write(this->FMGL(filter));
    
}

::x10::lang::Reference* ::x10::regionarray::WrappedDistPlaceRestricted::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::WrappedDistPlaceRestricted* this_ = new (::x10aux::alloc_z< ::x10::regionarray::WrappedDistPlaceRestricted>()) ::x10::regionarray::WrappedDistPlaceRestricted();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::WrappedDistPlaceRestricted::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::Dist::_deserialize_body(buf);
    FMGL(base) = buf.read< ::x10::regionarray::Dist*>();
    FMGL(filter) = buf.read< ::x10::lang::Place>();
}

::x10aux::RuntimeType x10::regionarray::WrappedDistPlaceRestricted::rtt;
void x10::regionarray::WrappedDistPlaceRestricted::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::regionarray::Dist>()};
    rtt.initStageTwo("x10.regionarray.WrappedDistPlaceRestricted",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of WrappedDistPlaceRestricted */
/*************************************************/
