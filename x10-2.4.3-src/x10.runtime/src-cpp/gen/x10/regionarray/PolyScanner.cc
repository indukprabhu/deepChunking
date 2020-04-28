/*************************************************/
/* START of PolyScanner */
#include <x10/regionarray/PolyScanner.h>

#include <x10/lang/Boolean.h>
#include <x10/lang/Long.h>
#include <x10/regionarray/PolyMat.h>
#include <x10/regionarray/Array.h>
#include <x10/regionarray/VarMat.h>
#include <x10/regionarray/PolyRow.h>
#include <x10/regionarray/RectRegion1D.h>
#include <x10/regionarray/Region.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Int.h>
#include <x10/lang/Iterator.h>
#include <x10/regionarray/Mat.h>
#include <x10/regionarray/ValRow.h>
#include <x10/lang/String.h>
#include <x10/regionarray/UnboundedRegionException.h>
#include <x10/regionarray/VarRow.h>
#include <x10/lang/Point.h>
#include <x10/regionarray/PolyScanner__Anonymous__10018.h>
#include <x10/io/Printer.h>
#include <x10/lang/Any.h>
#include <x10/regionarray/Row.h>
#include <x10/compiler/Synthetic.h>

//#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
::x10::regionarray::PolyScanner* x10::regionarray::PolyScanner::make(::x10::regionarray::PolyMat* pm) {
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::regionarray::PolyScanner* x =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyScanner>()) ::x10::regionarray::PolyScanner());
    (x)->::x10::regionarray::PolyScanner::_constructor(pm);
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    x->x10::regionarray::PolyScanner::init();
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    return x;
    
}

//#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
void x10::regionarray::PolyScanner::_constructor(::x10::regionarray::PolyMat* pm) {
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    FMGL(rank) = ::x10aux::nullCheck(pm)->FMGL(rank);
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::regionarray::PolyScanner* this__116345 = this;
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::regionarray::PolyMat* pm0 = ::x10aux::nullCheck(pm)->simplifyAll();
    
    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->FMGL(C) = pm;
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    x10_long r = ::x10aux::nullCheck(pm0)->FMGL(rank);
    
    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* n =  (new (::x10aux::alloc_z< ::x10::regionarray::Array< ::x10::regionarray::VarMat*> >()) ::x10::regionarray::Array< ::x10::regionarray::VarMat*>());
    
    //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long size__116354 = r;
    
    //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::RectRegion1D* myReg__116346 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (myReg__116346)->::x10::regionarray::RectRegion1D::_constructor(((size__116354) - (((x10_long)1ll))));
    
    //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    n->FMGL(region) = reinterpret_cast< ::x10::regionarray::Region*>(myReg__116346);
    n->FMGL(rank) = ((x10_long)1ll);
    n->FMGL(rect) = true;
    n->FMGL(zeroBased) = true;
    n->FMGL(rail) = true;
    n->FMGL(size) = size__116354;
    
    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    n->FMGL(layout_min0) = n->FMGL(layout_stride1) = n->FMGL(layout_min1) =
      ((x10_long)0ll);
    
    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    n->FMGL(layout) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    n->FMGL(raw) = ::x10::lang::Rail< ::x10::regionarray::VarMat* >::_make(size__116354);
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->FMGL(myMin) = n;
    
    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* x =  (new (::x10aux::alloc_z< ::x10::regionarray::Array< ::x10::regionarray::VarMat*> >()) ::x10::regionarray::Array< ::x10::regionarray::VarMat*>());
    
    //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long size__116355 = r;
    
    //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::RectRegion1D* myReg__116347 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (myReg__116347)->::x10::regionarray::RectRegion1D::_constructor(((size__116355) - (((x10_long)1ll))));
    
    //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x->FMGL(region) = reinterpret_cast< ::x10::regionarray::Region*>(myReg__116347);
    x->FMGL(rank) = ((x10_long)1ll);
    x->FMGL(rect) = true;
    x->FMGL(zeroBased) = true;
    x->FMGL(rail) = true;
    x->FMGL(size) = size__116355;
    
    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x->FMGL(layout_min0) = x->FMGL(layout_stride1) = x->FMGL(layout_min1) =
      ((x10_long)0ll);
    
    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x->FMGL(layout) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x->FMGL(raw) = ::x10::lang::Rail< ::x10::regionarray::VarMat* >::_make(size__116355);
    
    //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->FMGL(myMax) = x;
    
    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* nSum =  (new (::x10aux::alloc_z< ::x10::regionarray::Array< ::x10::regionarray::VarMat*> >()) ::x10::regionarray::Array< ::x10::regionarray::VarMat*>());
    
    //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long size__116356 = r;
    
    //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::RectRegion1D* myReg__116348 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (myReg__116348)->::x10::regionarray::RectRegion1D::_constructor(((size__116356) - (((x10_long)1ll))));
    
    //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    nSum->FMGL(region) = reinterpret_cast< ::x10::regionarray::Region*>(myReg__116348);
    nSum->FMGL(rank) = ((x10_long)1ll);
    nSum->FMGL(rect) = true;
    nSum->FMGL(zeroBased) = true;
    nSum->FMGL(rail) = true;
    nSum->FMGL(size) = size__116356;
    
    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    nSum->FMGL(layout_min0) = nSum->FMGL(layout_stride1) = nSum->FMGL(layout_min1) =
      ((x10_long)0ll);
    
    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    nSum->FMGL(layout) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    nSum->FMGL(raw) = ::x10::lang::Rail< ::x10::regionarray::VarMat* >::_make(size__116356);
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->FMGL(minSum) = nSum;
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* xSum =
       (new (::x10aux::alloc_z< ::x10::regionarray::Array< ::x10::regionarray::VarMat*> >()) ::x10::regionarray::Array< ::x10::regionarray::VarMat*>());
    
    //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long size__116357 = r;
    
    //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::RectRegion1D* myReg__116349 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (myReg__116349)->::x10::regionarray::RectRegion1D::_constructor(
      ((size__116357) - (((x10_long)1ll))));
    
    //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    xSum->FMGL(region) = reinterpret_cast< ::x10::regionarray::Region*>(myReg__116349);
    xSum->FMGL(rank) = ((x10_long)1ll);
    xSum->FMGL(rect) = true;
    xSum->FMGL(zeroBased) = true;
    xSum->FMGL(rail) = true;
    xSum->FMGL(size) = size__116357;
    
    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    xSum->FMGL(layout_min0) = xSum->FMGL(layout_stride1) = xSum->FMGL(layout_min1) =
      ((x10_long)0ll);
    
    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    xSum->FMGL(layout) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    xSum->FMGL(raw) = ::x10::lang::Rail< ::x10::regionarray::VarMat* >::_make(size__116357);
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->FMGL(maxSum) = xSum;
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::regionarray::Array< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>*>* n2 =
       (new (::x10aux::alloc_z< ::x10::regionarray::Array< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>*> >()) ::x10::regionarray::Array< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>*>());
    
    //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long size__116358 = r;
    
    //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::RectRegion1D* myReg__116350 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (myReg__116350)->::x10::regionarray::RectRegion1D::_constructor(
      ((size__116358) - (((x10_long)1ll))));
    
    //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    n2->FMGL(region) = reinterpret_cast< ::x10::regionarray::Region*>(myReg__116350);
    n2->FMGL(rank) = ((x10_long)1ll);
    n2->FMGL(rect) = true;
    n2->FMGL(zeroBased) = true;
    n2->FMGL(rail) = true;
    n2->FMGL(size) = size__116358;
    
    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    n2->FMGL(layout_min0) = n2->FMGL(layout_stride1) = n2->FMGL(layout_min1) =
      ((x10_long)0ll);
    
    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    n2->FMGL(layout) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    n2->FMGL(raw) = ::x10::lang::Rail< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>* >::_make(size__116358);
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->FMGL(min2) = n2;
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::regionarray::Array< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>*>* x2 =
       (new (::x10aux::alloc_z< ::x10::regionarray::Array< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>*> >()) ::x10::regionarray::Array< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>*>());
    
    //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long size__116359 = r;
    
    //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::RectRegion1D* myReg__116351 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (myReg__116351)->::x10::regionarray::RectRegion1D::_constructor(
      ((size__116359) - (((x10_long)1ll))));
    
    //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x2->FMGL(region) = reinterpret_cast< ::x10::regionarray::Region*>(myReg__116351);
    x2->FMGL(rank) = ((x10_long)1ll);
    x2->FMGL(rect) = true;
    x2->FMGL(zeroBased) = true;
    x2->FMGL(rail) = true;
    x2->FMGL(size) = size__116359;
    
    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x2->FMGL(layout_min0) = x2->FMGL(layout_stride1) = x2->FMGL(layout_min1) =
      ((x10_long)0ll);
    
    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x2->FMGL(layout) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x2->FMGL(raw) = ::x10::lang::Rail< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>* >::_make(size__116359);
    
    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->FMGL(max2) = x2;
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->FMGL(parFlags) = (__extension__ ({
        ::x10::regionarray::Array<x10_boolean>* alloc__116070 =
           (new (::x10aux::alloc_z< ::x10::regionarray::Array<x10_boolean> >()) ::x10::regionarray::Array<x10_boolean>());
        
        //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10_long size__116353 = r;
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ::x10::regionarray::RectRegion1D* myReg__116352 =
           (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
        (myReg__116352)->::x10::regionarray::RectRegion1D::_constructor(
          ((size__116353) - (((x10_long)1ll))));
        
        //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        alloc__116070->FMGL(region) = reinterpret_cast< ::x10::regionarray::Region*>(myReg__116352);
        alloc__116070->FMGL(rank) = ((x10_long)1ll);
        alloc__116070->FMGL(rect) = true;
        alloc__116070->FMGL(zeroBased) = true;
        alloc__116070->FMGL(rail) = true;
        alloc__116070->FMGL(size) = size__116353;
        
        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        alloc__116070->FMGL(layout_min0) = alloc__116070->FMGL(layout_stride1) =
          alloc__116070->FMGL(layout_min1) = ((x10_long)0ll);
        
        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        alloc__116070->FMGL(layout) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        alloc__116070->FMGL(raw) = ::x10::lang::Rail< x10_boolean >::_make(size__116353);
        alloc__116070;
    }))
    ;
}
::x10::regionarray::PolyScanner* x10::regionarray::PolyScanner::_make(
  ::x10::regionarray::PolyMat* pm) {
    ::x10::regionarray::PolyScanner* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PolyScanner>()) ::x10::regionarray::PolyScanner();
    this_->_constructor(pm);
    return this_;
}



//#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
void x10::regionarray::PolyScanner::init() {
    
    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::regionarray::PolyMat* pm = this->FMGL(C);
    
    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->x10::regionarray::PolyScanner::init(pm, ((((x10_int) (this->FMGL(rank)))) - (((x10_int)1))));
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    {
        x10_int k;
        for (k = ((((x10_int) (this->FMGL(rank)))) - (((x10_int)2)));
             ((k) >= (((x10_int)0))); k = ((k) - (((x10_int)1))))
        {
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            pm = ::x10aux::nullCheck(pm)->eliminate(((k) + (((x10_int)1))),
                                                    true);
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this->x10::regionarray::PolyScanner::init(pm,
                                                      k);
        }
    }
    
}

//#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
void x10::regionarray::PolyScanner::init(::x10::regionarray::PolyMat* pm,
                                         x10_int axis) {
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    x10_int imin = ((x10_int)0);
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    x10_int imax = ((x10_int)0);
    
    //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    {
        ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>* r__116080;
        for (r__116080 = ::x10aux::nullCheck(pm)->iterator();
             ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::hasNext(::x10aux::nullCheck(r__116080));
             ) {
            ::x10::regionarray::PolyRow* r = ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::next(::x10aux::nullCheck(r__116080));
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (((::x10aux::nullCheck(r)->__apply(axis)) < (((x10_int)0))))
            {
                imin = ((imin) + (((x10_int)1)));
            }
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (((::x10aux::nullCheck(r)->__apply(axis)) > (((x10_int)0))))
            {
                imax = ((imax) + (((x10_int)1)));
            }
            
        }
    }
    
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    if (((::x10aux::struct_equals(imin, ((x10_int)0))) ||
        (::x10aux::struct_equals(imax, ((x10_int)0))))) {
        
        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        ::x10::lang::String* m = (::x10aux::struct_equals(imin,
                                                          ((x10_int)0)))
          ? ((__extension__ ({ static ::x10::lang::String* strLit__126995 = ::x10aux::makeStringLit("minimum"); strLit__126995; })))
          : ((__extension__ ({ static ::x10::lang::String* strLit__126996 = ::x10aux::makeStringLit("maximum"); strLit__126996; })));
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        ::x10::lang::String* msg = ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126997 = ::x10aux::makeStringLit("axis "); strLit__126997; })), axis), (__extension__ ({ static ::x10::lang::String* strLit__126998 = ::x10aux::makeStringLit(" has no "); strLit__126998; }))), m);
        
        //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        ::x10aux::throwException(::x10aux::nullCheck(::x10::regionarray::UnboundedRegionException::_make(msg)));
    }
    
    //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116378 =
      this->FMGL(myMin);
    
    //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long i__116379 = ((x10_long)(axis));
    ::x10::regionarray::VarMat* v__116380 = (__extension__ ({
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        ::x10::regionarray::VarMat* alloc__116381 =  (new (::x10aux::alloc_z< ::x10::regionarray::VarMat>()) ::x10::regionarray::VarMat());
        (alloc__116381)->::x10::regionarray::VarMat::_constructor(
          imin, ((axis) + (((x10_int)1))));
        alloc__116381;
    }))
    ;
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::VarMat* ret__116382;
    
    //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10aux::nullCheck(this__116378)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__set(
      i__116379, v__116380);
    
    //#line 554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ret__116382 = v__116380;
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ret__116382;
    
    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116383 =
      this->FMGL(myMax);
    
    //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long i__116384 = ((x10_long)(axis));
    ::x10::regionarray::VarMat* v__116385 = (__extension__ ({
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        ::x10::regionarray::VarMat* alloc__116386 =  (new (::x10aux::alloc_z< ::x10::regionarray::VarMat>()) ::x10::regionarray::VarMat());
        (alloc__116386)->::x10::regionarray::VarMat::_constructor(
          imax, ((axis) + (((x10_int)1))));
        alloc__116386;
    }))
    ;
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::VarMat* ret__116387;
    
    //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10aux::nullCheck(this__116383)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__set(
      i__116384, v__116385);
    
    //#line 554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ret__116387 = v__116385;
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ret__116387;
    
    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116388 =
      this->FMGL(minSum);
    
    //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long i__116389 = ((x10_long)(axis));
    ::x10::regionarray::VarMat* v__116390 = (__extension__ ({
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        ::x10::regionarray::VarMat* alloc__116391 =  (new (::x10aux::alloc_z< ::x10::regionarray::VarMat>()) ::x10::regionarray::VarMat());
        (alloc__116391)->::x10::regionarray::VarMat::_constructor(
          imin, ((axis) + (((x10_int)1))));
        alloc__116391;
    }))
    ;
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::VarMat* ret__116392;
    
    //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10aux::nullCheck(this__116388)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__set(
      i__116389, v__116390);
    
    //#line 554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ret__116392 = v__116390;
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ret__116392;
    
    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116393 =
      this->FMGL(maxSum);
    
    //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long i__116394 = ((x10_long)(axis));
    ::x10::regionarray::VarMat* v__116395 = (__extension__ ({
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        ::x10::regionarray::VarMat* alloc__116396 =  (new (::x10aux::alloc_z< ::x10::regionarray::VarMat>()) ::x10::regionarray::VarMat());
        (alloc__116396)->::x10::regionarray::VarMat::_constructor(
          imax, ((axis) + (((x10_int)1))));
        alloc__116396;
    }))
    ;
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::VarMat* ret__116397;
    
    //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10aux::nullCheck(this__116393)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__set(
      i__116394, v__116395);
    
    //#line 554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ret__116397 = v__116395;
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ret__116397;
    
    //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::regionarray::Array< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>*>* this__116398 =
      this->FMGL(min2);
    
    //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long i__116399 = ((x10_long)(axis));
    ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>* v__116400 =
      (__extension__ ({
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>* alloc__116401 =
           (new (::x10aux::alloc_z< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*> >()) ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>());
        
        //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10_long size__116361 = ((x10_long)(imin));
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ::x10::regionarray::RectRegion1D* myReg__116360 =
           (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
        (myReg__116360)->::x10::regionarray::RectRegion1D::_constructor(
          ((size__116361) - (((x10_long)1ll))));
        
        //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        alloc__116401->FMGL(region) = reinterpret_cast< ::x10::regionarray::Region*>(myReg__116360);
        alloc__116401->FMGL(rank) = ((x10_long)1ll);
        alloc__116401->FMGL(rect) = true;
        alloc__116401->FMGL(zeroBased) = true;
        alloc__116401->FMGL(rail) = true;
        alloc__116401->FMGL(size) = size__116361;
        
        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        alloc__116401->FMGL(layout_min0) = alloc__116401->FMGL(layout_stride1) =
          alloc__116401->FMGL(layout_min1) = ((x10_long)0ll);
        
        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        alloc__116401->FMGL(layout) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        alloc__116401->FMGL(raw) = ::x10::lang::Rail< ::x10::regionarray::PolyRow* >::_make(size__116361);
        alloc__116401;
    }))
    ;
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>* ret__116402;
    
    //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10aux::nullCheck(this__116398)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>* >::__set(
      i__116399, v__116400);
    
    //#line 554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ret__116402 = v__116400;
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ret__116402;
    
    //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::regionarray::Array< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>*>* this__116403 =
      this->FMGL(max2);
    
    //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long i__116404 = ((x10_long)(axis));
    ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>* v__116405 =
      (__extension__ ({
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>* alloc__116406 =
           (new (::x10aux::alloc_z< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*> >()) ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>());
        
        //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10_long size__116363 = ((x10_long)(imax));
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ::x10::regionarray::RectRegion1D* myReg__116362 =
           (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
        (myReg__116362)->::x10::regionarray::RectRegion1D::_constructor(
          ((size__116363) - (((x10_long)1ll))));
        
        //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        alloc__116406->FMGL(region) = reinterpret_cast< ::x10::regionarray::Region*>(myReg__116362);
        alloc__116406->FMGL(rank) = ((x10_long)1ll);
        alloc__116406->FMGL(rect) = true;
        alloc__116406->FMGL(zeroBased) = true;
        alloc__116406->FMGL(rail) = true;
        alloc__116406->FMGL(size) = size__116363;
        
        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        alloc__116406->FMGL(layout_min0) = alloc__116406->FMGL(layout_stride1) =
          alloc__116406->FMGL(layout_min1) = ((x10_long)0ll);
        
        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        alloc__116406->FMGL(layout) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        alloc__116406->FMGL(raw) = ::x10::lang::Rail< ::x10::regionarray::PolyRow* >::_make(size__116363);
        alloc__116406;
    }))
    ;
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>* ret__116407;
    
    //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10aux::nullCheck(this__116403)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>* >::__set(
      i__116404, v__116405);
    
    //#line 554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ret__116407 = v__116405;
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ret__116407;
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    imin = ((x10_int)0);
    imax = ((x10_int)0);
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    {
        ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>* r__116082;
        for (r__116082 = ::x10aux::nullCheck(pm)->iterator();
             ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::hasNext(::x10aux::nullCheck(r__116082));
             ) {
            ::x10::regionarray::PolyRow* r = ::x10::lang::Iterator< ::x10::regionarray::PolyRow*>::next(::x10aux::nullCheck(r__116082));
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (((::x10aux::nullCheck(r)->__apply(axis)) < (((x10_int)0))))
            {
                
                //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                {
                    x10_int i;
                    for (i = ((x10_int)0); ((i) <= (axis));
                         i = ((i) + (((x10_int)1)))) {
                        
                        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                        ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116215 =
                                                  this->FMGL(myMin);
                                                
                                                //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                x10_long i__116214 =
                                                  ((x10_long)(axis));
                                                
                                                //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                ::x10::regionarray::VarMat* ret__116216;
                                                
                                                //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                ret__116216 =
                                                  ::x10aux::nullCheck(this__116215)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                    i__116214);
                                                ret__116216;
                                            }))
                                            )->x10::regionarray::VarMat::__apply(
                                              imin))->x10::regionarray::VarRow::__set(
                          i, ::x10aux::nullCheck(r)->__apply(
                               i));
                    }
                }
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                        ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116219 =
                                          this->FMGL(minSum);
                                        
                                        //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                        x10_long i__116218 =
                                          ((x10_long)(axis));
                                        
                                        //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                        ::x10::regionarray::VarMat* ret__116220;
                                        
                                        //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                        ret__116220 = ::x10aux::nullCheck(this__116219)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                        i__116218);
                                        ret__116220;
                                    }))
                                    )->x10::regionarray::VarMat::__apply(
                                      imin))->x10::regionarray::VarRow::__set(
                  ((x10_int)0), ::x10aux::nullCheck(r)->__apply(
                                  ((x10_int) (this->FMGL(rank)))));
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>* this__116364 =
                  (__extension__ ({
                    ::x10::regionarray::Array< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>*>* this__116365 =
                      this->FMGL(min2);
                    
                    //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    x10_long i__116366 = ((x10_long)(axis));
                    
                    //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>* ret__116367;
                    
                    //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ret__116367 = ::x10aux::nullCheck(this__116365)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>* >::__apply(
                                    i__116366);
                    ret__116367;
                }))
                ;
                
                //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10_long i__116368 = ((x10_long)(imin));
                ::x10::regionarray::PolyRow* v__116369 = r;
                
                //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ::x10::regionarray::PolyRow* ret__116370;
                
                //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ::x10aux::nullCheck(this__116364)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::PolyRow* >::__set(
                  i__116368, v__116369);
                
                //#line 554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret__116370 = v__116369;
                
                //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret__116370;
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                imin = ((imin) + (((x10_int)1)));
            }
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (((::x10aux::nullCheck(r)->__apply(axis)) > (((x10_int)0))))
            {
                
                //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                {
                    x10_int i;
                    for (i = ((x10_int)0); ((i) <= (axis));
                         i = ((i) + (((x10_int)1)))) {
                        
                        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                        ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116232 =
                                                  this->FMGL(myMax);
                                                
                                                //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                x10_long i__116231 =
                                                  ((x10_long)(axis));
                                                
                                                //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                ::x10::regionarray::VarMat* ret__116233;
                                                
                                                //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                ret__116233 =
                                                  ::x10aux::nullCheck(this__116232)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                    i__116231);
                                                ret__116233;
                                            }))
                                            )->x10::regionarray::VarMat::__apply(
                                              imax))->x10::regionarray::VarRow::__set(
                          i, ::x10aux::nullCheck(r)->__apply(
                               i));
                    }
                }
                
                //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                        ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116236 =
                                          this->FMGL(maxSum);
                                        
                                        //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                        x10_long i__116235 =
                                          ((x10_long)(axis));
                                        
                                        //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                        ::x10::regionarray::VarMat* ret__116237;
                                        
                                        //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                        ret__116237 = ::x10aux::nullCheck(this__116236)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                        i__116235);
                                        ret__116237;
                                    }))
                                    )->x10::regionarray::VarMat::__apply(
                                      imax))->x10::regionarray::VarRow::__set(
                  ((x10_int)0), ::x10aux::nullCheck(r)->__apply(
                                  ((x10_int) (this->FMGL(rank)))));
                
                //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>* this__116371 =
                  (__extension__ ({
                    ::x10::regionarray::Array< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>*>* this__116372 =
                      this->FMGL(max2);
                    
                    //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    x10_long i__116373 = ((x10_long)(axis));
                    
                    //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>* ret__116374;
                    
                    //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ret__116374 = ::x10aux::nullCheck(this__116372)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>* >::__apply(
                                    i__116373);
                    ret__116374;
                }))
                ;
                
                //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10_long i__116375 = ((x10_long)(imax));
                ::x10::regionarray::PolyRow* v__116376 = r;
                
                //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ::x10::regionarray::PolyRow* ret__116377;
                
                //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ::x10aux::nullCheck(this__116371)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::PolyRow* >::__set(
                  i__116375, v__116376);
                
                //#line 554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret__116377 = v__116376;
                
                //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret__116377;
                
                //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                imax = ((imax) + (((x10_int)1)));
            }
            
        }
    }
    
}

//#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
void x10::regionarray::PolyScanner::__set(x10_int v, x10_int axis) {
    this->x10::regionarray::PolyScanner::set(axis, v);
}

//#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
void x10::regionarray::PolyScanner::set(x10_int axis, x10_int v) {
    
    //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    {
        x10_int k;
        for (k = ((axis) + (((x10_int)1))); ((((x10_long)(k))) < (this->FMGL(rank)));
             k = ((k) + (((x10_int)1)))) {
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            {
                x10_int l;
                for (l = ((x10_int)0); ((l) < (::x10aux::nullCheck((__extension__ ({
                                                   ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116249 =
                                                     this->FMGL(minSum);
                                                   
                                                   //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                   x10_long i__116248 =
                                                     ((x10_long)(k));
                                                   
                                                   //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                   ::x10::regionarray::VarMat* ret__116250;
                                                   
                                                   //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                   ret__116250 =
                                                     ::x10aux::nullCheck(this__116249)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                       i__116248);
                                                   ret__116250;
                                               }))
                                               )->FMGL(rows)));
                     l = ((l) + (((x10_int)1)))) {
                    
                    //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                            ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116253 =
                                              this->FMGL(minSum);
                                            
                                            //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                            x10_long i__116252 =
                                              ((x10_long)(k));
                                            
                                            //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                            ::x10::regionarray::VarMat* ret__116254;
                                            
                                            //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                            ret__116254 =
                                              ::x10aux::nullCheck(this__116253)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                i__116252);
                                            ret__116254;
                                        }))
                                        )->x10::regionarray::VarMat::__apply(
                                          l))->x10::regionarray::VarRow::__set(
                      ((axis) + (((x10_int)1))), ((((::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                                             ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116257 =
                                                                               this->FMGL(myMin);
                                                                             
                                                                             //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                             x10_long i__116256 =
                                                                               ((x10_long)(k));
                                                                             
                                                                             //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                             ::x10::regionarray::VarMat* ret__116258;
                                                                             
                                                                             //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                             ret__116258 =
                                                                               ::x10aux::nullCheck(this__116257)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                                                 i__116256);
                                                                             ret__116258;
                                                                         }))
                                                                         )->x10::regionarray::VarMat::__apply(
                                                                           l))->x10::regionarray::VarRow::__apply(
                                                       axis)) * (v))) + (::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                                                                 ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116261 =
                                                                                                   this->FMGL(minSum);
                                                                                                 
                                                                                                 //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                                                 x10_long i__116260 =
                                                                                                   ((x10_long)(k));
                                                                                                 
                                                                                                 //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                                                 ::x10::regionarray::VarMat* ret__116262;
                                                                                                 
                                                                                                 //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                                                 ret__116262 =
                                                                                                   ::x10aux::nullCheck(this__116261)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                                                                     i__116260);
                                                                                                 ret__116262;
                                                                                             }))
                                                                                             )->x10::regionarray::VarMat::__apply(
                                                                                               l))->x10::regionarray::VarRow::__apply(
                                                                           axis))));
                }
            }
            
        }
    }
    
    //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    {
        x10_int k;
        for (k = ((axis) + (((x10_int)1))); ((((x10_long)(k))) < (this->FMGL(rank)));
             k = ((k) + (((x10_int)1)))) {
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            {
                x10_int l;
                for (l = ((x10_int)0); ((l) < (::x10aux::nullCheck((__extension__ ({
                                                   ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116265 =
                                                     this->FMGL(maxSum);
                                                   
                                                   //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                   x10_long i__116264 =
                                                     ((x10_long)(k));
                                                   
                                                   //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                   ::x10::regionarray::VarMat* ret__116266;
                                                   
                                                   //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                   ret__116266 =
                                                     ::x10aux::nullCheck(this__116265)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                       i__116264);
                                                   ret__116266;
                                               }))
                                               )->FMGL(rows)));
                     l = ((l) + (((x10_int)1)))) {
                    
                    //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                            ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116269 =
                                              this->FMGL(maxSum);
                                            
                                            //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                            x10_long i__116268 =
                                              ((x10_long)(k));
                                            
                                            //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                            ::x10::regionarray::VarMat* ret__116270;
                                            
                                            //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                            ret__116270 =
                                              ::x10aux::nullCheck(this__116269)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                i__116268);
                                            ret__116270;
                                        }))
                                        )->x10::regionarray::VarMat::__apply(
                                          l))->x10::regionarray::VarRow::__set(
                      ((axis) + (((x10_int)1))), ((((::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                                             ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116273 =
                                                                               this->FMGL(myMax);
                                                                             
                                                                             //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                             x10_long i__116272 =
                                                                               ((x10_long)(k));
                                                                             
                                                                             //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                             ::x10::regionarray::VarMat* ret__116274;
                                                                             
                                                                             //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                             ret__116274 =
                                                                               ::x10aux::nullCheck(this__116273)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                                                 i__116272);
                                                                             ret__116274;
                                                                         }))
                                                                         )->x10::regionarray::VarMat::__apply(
                                                                           l))->x10::regionarray::VarRow::__apply(
                                                       axis)) * (v))) + (::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                                                                 ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116277 =
                                                                                                   this->FMGL(maxSum);
                                                                                                 
                                                                                                 //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                                                 x10_long i__116276 =
                                                                                                   ((x10_long)(k));
                                                                                                 
                                                                                                 //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                                                 ::x10::regionarray::VarMat* ret__116278;
                                                                                                 
                                                                                                 //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                                                 ret__116278 =
                                                                                                   ::x10aux::nullCheck(this__116277)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                                                                     i__116276);
                                                                                                 ret__116278;
                                                                                             }))
                                                                                             )->x10::regionarray::VarMat::__apply(
                                                                                               l))->x10::regionarray::VarRow::__apply(
                                                                           axis))));
                }
            }
            
        }
    }
    
}

//#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
x10_int x10::regionarray::PolyScanner::min(x10_int axis) {
    
    //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    x10_int result = ((x10_int)0x80000000);
    
    //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    {
        x10_int k;
        for (k = ((x10_int)0); ((k) < (::x10aux::nullCheck((__extension__ ({
                                           ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116281 =
                                             this->FMGL(myMin);
                                           
                                           //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                           x10_long i__116280 =
                                             ((x10_long)(axis));
                                           
                                           //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                           ::x10::regionarray::VarMat* ret__116282;
                                           
                                           //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                           ret__116282 = ::x10aux::nullCheck(this__116281)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                           i__116280);
                                           ret__116282;
                                       }))
                                       )->FMGL(rows))); k =
                                                          ((k) + (((x10_int)1))))
        {
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            x10_int a = ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116285 =
                                                  this->FMGL(myMin);
                                                
                                                //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                x10_long i__116284 =
                                                  ((x10_long)(axis));
                                                
                                                //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                ::x10::regionarray::VarMat* ret__116286;
                                                
                                                //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                ret__116286 =
                                                  ::x10aux::nullCheck(this__116285)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                    i__116284);
                                                ret__116286;
                                            }))
                                            )->x10::regionarray::VarMat::__apply(
                                              k))->x10::regionarray::VarRow::__apply(
                          axis);
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            x10_int b = ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116289 =
                                                  this->FMGL(minSum);
                                                
                                                //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                x10_long i__116288 =
                                                  ((x10_long)(axis));
                                                
                                                //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                ::x10::regionarray::VarMat* ret__116290;
                                                
                                                //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                ret__116290 =
                                                  ::x10aux::nullCheck(this__116289)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                    i__116288);
                                                ret__116290;
                                            }))
                                            )->x10::regionarray::VarMat::__apply(
                                              k))->x10::regionarray::VarRow::__apply(
                          axis);
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            x10_int m = ((b) > (((x10_int)0))) ? ((((((((-(b))) + (a))) + (((x10_int)1)))) / ::x10aux::zeroCheck(a)))
              : ((((-(b))) / ::x10aux::zeroCheck(a)));
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (((m) > (result))) {
                result = m;
            }
            
        }
    }
    
    //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    return result;
    
}

//#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
x10_int x10::regionarray::PolyScanner::max(x10_int axis) {
    
    //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    x10_int result = ((x10_int)0x7fffffff);
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    {
        x10_int k;
        for (k = ((x10_int)0); ((k) < (::x10aux::nullCheck((__extension__ ({
                                           ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116293 =
                                             this->FMGL(myMax);
                                           
                                           //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                           x10_long i__116292 =
                                             ((x10_long)(axis));
                                           
                                           //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                           ::x10::regionarray::VarMat* ret__116294;
                                           
                                           //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                           ret__116294 = ::x10aux::nullCheck(this__116293)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                           i__116292);
                                           ret__116294;
                                       }))
                                       )->FMGL(rows))); k =
                                                          ((k) + (((x10_int)1))))
        {
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            x10_int a = ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116297 =
                                                  this->FMGL(myMax);
                                                
                                                //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                x10_long i__116296 =
                                                  ((x10_long)(axis));
                                                
                                                //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                ::x10::regionarray::VarMat* ret__116298;
                                                
                                                //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                ret__116298 =
                                                  ::x10aux::nullCheck(this__116297)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                    i__116296);
                                                ret__116298;
                                            }))
                                            )->x10::regionarray::VarMat::__apply(
                                              k))->x10::regionarray::VarRow::__apply(
                          axis);
            
            //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            x10_int b = ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116301 =
                                                  this->FMGL(maxSum);
                                                
                                                //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                x10_long i__116300 =
                                                  ((x10_long)(axis));
                                                
                                                //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                ::x10::regionarray::VarMat* ret__116302;
                                                
                                                //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                ret__116302 =
                                                  ::x10aux::nullCheck(this__116301)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                    i__116300);
                                                ret__116302;
                                            }))
                                            )->x10::regionarray::VarMat::__apply(
                                              k))->x10::regionarray::VarRow::__apply(
                          axis);
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            x10_int m = ((b) > (((x10_int)0))) ? ((((((((-(b))) - (a))) + (((x10_int)1)))) / ::x10aux::zeroCheck(a)))
              : ((((-(b))) / ::x10aux::zeroCheck(a)));
            
            //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (((m) < (result))) {
                result = m;
            }
            
        }
    }
    
    //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    return result;
    
}

//#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
::x10::lang::Iterator< ::x10::lang::Point*>* x10::regionarray::PolyScanner::iterator(
  ) {
    ::x10::regionarray::PolyScanner__Anonymous__10018* alloc__116414 =
       (new (::x10aux::alloc_z< ::x10::regionarray::PolyScanner__Anonymous__10018>()) ::x10::regionarray::PolyScanner__Anonymous__10018());
    (alloc__116414)->::x10::regionarray::PolyScanner__Anonymous__10018::_constructor(
      this);
    return reinterpret_cast< ::x10::lang::Iterator< ::x10::lang::Point*>*>(alloc__116414);
    
}

//#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
void x10::regionarray::PolyScanner::printInfo(::x10::io::Printer* ps) {
    
    //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10aux::nullCheck(ps)->x10::io::Printer::println(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__127087 = ::x10aux::makeStringLit("PolyScanner"); strLit__127087; }))));
    
    //#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10aux::nullCheck(this->FMGL(C))->printInfo(ps, (__extension__ ({ static ::x10::lang::String* strLit__127088 = ::x10aux::makeStringLit("  C"); strLit__127088; })));
}

//#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
void x10::regionarray::PolyScanner::printInfo2(::x10::io::Printer* ps) {
    
    //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    {
        x10_int k;
        for (k = ((x10_int)0); ((((x10_long)(k))) < (::x10aux::nullCheck(this->FMGL(myMin))->FMGL(size)));
             k = ((k) + (((x10_int)1)))) {
            
            //#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            ::x10aux::nullCheck(ps)->x10::io::Printer::println(
              reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127089 = ::x10aux::makeStringLit("axis "); strLit__127089; })), k)));
            
            //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            ::x10aux::nullCheck(ps)->x10::io::Printer::println(
              reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__127090 = ::x10aux::makeStringLit("  min"); strLit__127090; }))));
            
            //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            {
                x10_int l;
                for (l = ((x10_int)0); ((l) < (::x10aux::nullCheck((__extension__ ({
                                                   ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116305 =
                                                     this->FMGL(myMin);
                                                   
                                                   //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                   x10_long i__116304 =
                                                     ((x10_long)(k));
                                                   
                                                   //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                   ::x10::regionarray::VarMat* ret__116306;
                                                   
                                                   //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                   ret__116306 =
                                                     ::x10aux::nullCheck(this__116305)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                       i__116304);
                                                   ret__116306;
                                               }))
                                               )->FMGL(rows)));
                     l = ((l) + (((x10_int)1)))) {
                    
                    //#line 314 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    ::x10aux::nullCheck(ps)->print((__extension__ ({ static ::x10::lang::String* strLit__127092 = ::x10aux::makeStringLit("  "); strLit__127092; })));
                    
                    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    {
                        x10_int m;
                        for (m = ((x10_int)0); ((m) < (::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                                               ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116309 =
                                                                                 this->FMGL(myMin);
                                                                               
                                                                               //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                               x10_long i__116308 =
                                                                                 ((x10_long)(k));
                                                                               
                                                                               //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                               ::x10::regionarray::VarMat* ret__116310;
                                                                               
                                                                               //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                               ret__116310 =
                                                                                 ::x10aux::nullCheck(this__116309)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                                                   i__116308);
                                                                               ret__116310;
                                                                           }))
                                                                           )->x10::regionarray::VarMat::__apply(
                                                                             l))->FMGL(cols)));
                             m = ((m) + (((x10_int)1)))) {
                            
                            //#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                            ::x10aux::nullCheck(ps)->print(
                              ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127095 = ::x10aux::makeStringLit(" "); strLit__127095; })), ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                                                                                                                                                                    ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116313 =
                                                                                                                                                                                                      this->FMGL(myMin);
                                                                                                                                                                                                    
                                                                                                                                                                                                    //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                                                                                                                                                    x10_long i__116312 =
                                                                                                                                                                                                      ((x10_long)(k));
                                                                                                                                                                                                    
                                                                                                                                                                                                    //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                                                                                                                                                    ::x10::regionarray::VarMat* ret__116314;
                                                                                                                                                                                                    
                                                                                                                                                                                                    //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                                                                                                                                                    ret__116314 =
                                                                                                                                                                                                      ::x10aux::nullCheck(this__116313)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                                                                                                                                                                        i__116312);
                                                                                                                                                                                                    ret__116314;
                                                                                                                                                                                                }))
                                                                                                                                                                                                )->x10::regionarray::VarMat::__apply(
                                                                                                                                                                                                  l))->x10::regionarray::VarRow::__apply(
                                                                                                                                                                              m)));
                        }
                    }
                    
                    //#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    ::x10aux::nullCheck(ps)->print((__extension__ ({ static ::x10::lang::String* strLit__127101 = ::x10aux::makeStringLit("  sum"); strLit__127101; })));
                    
                    //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    {
                        x10_int m;
                        for (m = ((x10_int)0); ((m) < (::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                                               ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116317 =
                                                                                 this->FMGL(minSum);
                                                                               
                                                                               //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                               x10_long i__116316 =
                                                                                 ((x10_long)(k));
                                                                               
                                                                               //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                               ::x10::regionarray::VarMat* ret__116318;
                                                                               
                                                                               //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                               ret__116318 =
                                                                                 ::x10aux::nullCheck(this__116317)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                                                   i__116316);
                                                                               ret__116318;
                                                                           }))
                                                                           )->x10::regionarray::VarMat::__apply(
                                                                             l))->FMGL(cols)));
                             m = ((m) + (((x10_int)1)))) {
                            
                            //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                            ::x10aux::nullCheck(ps)->print(
                              ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127104 = ::x10aux::makeStringLit(" "); strLit__127104; })), ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                                                                                                                                                                    ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116321 =
                                                                                                                                                                                                      this->FMGL(minSum);
                                                                                                                                                                                                    
                                                                                                                                                                                                    //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                                                                                                                                                    x10_long i__116320 =
                                                                                                                                                                                                      ((x10_long)(k));
                                                                                                                                                                                                    
                                                                                                                                                                                                    //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                                                                                                                                                    ::x10::regionarray::VarMat* ret__116322;
                                                                                                                                                                                                    
                                                                                                                                                                                                    //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                                                                                                                                                    ret__116322 =
                                                                                                                                                                                                      ::x10aux::nullCheck(this__116321)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                                                                                                                                                                        i__116320);
                                                                                                                                                                                                    ret__116322;
                                                                                                                                                                                                }))
                                                                                                                                                                                                )->x10::regionarray::VarMat::__apply(
                                                                                                                                                                                                  l))->x10::regionarray::VarRow::__apply(
                                                                                                                                                                              m)));
                        }
                    }
                    
                    //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    ::x10aux::nullCheck(ps)->print((__extension__ ({ static ::x10::lang::String* strLit__127110 = ::x10aux::makeStringLit("\n"); strLit__127110; })));
                }
            }
            
            //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            ::x10aux::nullCheck(ps)->printf((__extension__ ({ static ::x10::lang::String* strLit__127111 = ::x10aux::makeStringLit("  max\n"); strLit__127111; })));
            
            //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            {
                x10_int l;
                for (l = ((x10_int)0); ((l) < (::x10aux::nullCheck((__extension__ ({
                                                   ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116325 =
                                                     this->FMGL(myMax);
                                                   
                                                   //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                   x10_long i__116324 =
                                                     ((x10_long)(k));
                                                   
                                                   //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                   ::x10::regionarray::VarMat* ret__116326;
                                                   
                                                   //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                   ret__116326 =
                                                     ::x10aux::nullCheck(this__116325)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                       i__116324);
                                                   ret__116326;
                                               }))
                                               )->FMGL(rows)));
                     l = ((l) + (((x10_int)1)))) {
                    
                    //#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    ::x10aux::nullCheck(ps)->print((__extension__ ({ static ::x10::lang::String* strLit__127113 = ::x10aux::makeStringLit("  "); strLit__127113; })));
                    
                    //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    {
                        x10_int m;
                        for (m = ((x10_int)0); ((m) < (::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                                               ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116329 =
                                                                                 this->FMGL(myMax);
                                                                               
                                                                               //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                               x10_long i__116328 =
                                                                                 ((x10_long)(k));
                                                                               
                                                                               //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                               ::x10::regionarray::VarMat* ret__116330;
                                                                               
                                                                               //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                               ret__116330 =
                                                                                 ::x10aux::nullCheck(this__116329)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                                                   i__116328);
                                                                               ret__116330;
                                                                           }))
                                                                           )->x10::regionarray::VarMat::__apply(
                                                                             l))->FMGL(cols)));
                             m = ((m) + (((x10_int)1)))) {
                            
                            //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                            ::x10aux::nullCheck(ps)->print(
                              ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127116 = ::x10aux::makeStringLit(" "); strLit__127116; })), ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                                                                                                                                                                    ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116333 =
                                                                                                                                                                                                      this->FMGL(myMax);
                                                                                                                                                                                                    
                                                                                                                                                                                                    //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                                                                                                                                                    x10_long i__116332 =
                                                                                                                                                                                                      ((x10_long)(k));
                                                                                                                                                                                                    
                                                                                                                                                                                                    //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                                                                                                                                                    ::x10::regionarray::VarMat* ret__116334;
                                                                                                                                                                                                    
                                                                                                                                                                                                    //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                                                                                                                                                    ret__116334 =
                                                                                                                                                                                                      ::x10aux::nullCheck(this__116333)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                                                                                                                                                                        i__116332);
                                                                                                                                                                                                    ret__116334;
                                                                                                                                                                                                }))
                                                                                                                                                                                                )->x10::regionarray::VarMat::__apply(
                                                                                                                                                                                                  l))->x10::regionarray::VarRow::__apply(
                                                                                                                                                                              m)));
                        }
                    }
                    
                    //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    ::x10aux::nullCheck(ps)->print((__extension__ ({ static ::x10::lang::String* strLit__127122 = ::x10aux::makeStringLit("  sum"); strLit__127122; })));
                    
                    //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    {
                        x10_int m;
                        for (m = ((x10_int)0); ((m) < (::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                                               ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116337 =
                                                                                 this->FMGL(maxSum);
                                                                               
                                                                               //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                               x10_long i__116336 =
                                                                                 ((x10_long)(k));
                                                                               
                                                                               //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                               ::x10::regionarray::VarMat* ret__116338;
                                                                               
                                                                               //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                               ret__116338 =
                                                                                 ::x10aux::nullCheck(this__116337)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                                                   i__116336);
                                                                               ret__116338;
                                                                           }))
                                                                           )->x10::regionarray::VarMat::__apply(
                                                                             l))->FMGL(cols)));
                             m = ((m) + (((x10_int)1)))) {
                            
                            //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                            ::x10aux::nullCheck(ps)->print(
                              ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127125 = ::x10aux::makeStringLit(" "); strLit__127125; })), ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                                                                                                                                                                    ::x10::regionarray::Array< ::x10::regionarray::VarMat*>* this__116341 =
                                                                                                                                                                                                      this->FMGL(maxSum);
                                                                                                                                                                                                    
                                                                                                                                                                                                    //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                                                                                                                                                    x10_long i__116340 =
                                                                                                                                                                                                      ((x10_long)(k));
                                                                                                                                                                                                    
                                                                                                                                                                                                    //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                                                                                                                                                    ::x10::regionarray::VarMat* ret__116342;
                                                                                                                                                                                                    
                                                                                                                                                                                                    //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                                                                                                                                                                    ret__116342 =
                                                                                                                                                                                                      ::x10aux::nullCheck(this__116341)->FMGL(raw)->x10::lang::Rail< ::x10::regionarray::VarMat* >::__apply(
                                                                                                                                                                                                        i__116340);
                                                                                                                                                                                                    ret__116342;
                                                                                                                                                                                                }))
                                                                                                                                                                                                )->x10::regionarray::VarMat::__apply(
                                                                                                                                                                                                  l))->x10::regionarray::VarRow::__apply(
                                                                                                                                                                              m)));
                        }
                    }
                    
                    //#line 330 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    ::x10aux::nullCheck(ps)->println();
                }
            }
            
        }
    }
    
}

//#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
::x10::regionarray::PolyScanner* x10::regionarray::PolyScanner::x10__regionarray__PolyScanner____this__x10__regionarray__PolyScanner(
  ) {
    return this;
    
}
void x10::regionarray::PolyScanner::__fieldInitializers_x10_regionarray_PolyScanner(
  ) {
 
}
const ::x10aux::serialization_id_t x10::regionarray::PolyScanner::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::PolyScanner::_deserializer);

void x10::regionarray::PolyScanner::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(C));
    buf.write(this->FMGL(myMin));
    buf.write(this->FMGL(myMax));
    buf.write(this->FMGL(minSum));
    buf.write(this->FMGL(maxSum));
    buf.write(this->FMGL(parFlags));
    buf.write(this->FMGL(min2));
    buf.write(this->FMGL(max2));
    buf.write(this->FMGL(rank));
    
}

::x10::lang::Reference* ::x10::regionarray::PolyScanner::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::PolyScanner* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PolyScanner>()) ::x10::regionarray::PolyScanner();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::PolyScanner::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(C) = buf.read< ::x10::regionarray::PolyMat*>();
    FMGL(myMin) = buf.read< ::x10::regionarray::Array< ::x10::regionarray::VarMat*>*>();
    FMGL(myMax) = buf.read< ::x10::regionarray::Array< ::x10::regionarray::VarMat*>*>();
    FMGL(minSum) = buf.read< ::x10::regionarray::Array< ::x10::regionarray::VarMat*>*>();
    FMGL(maxSum) = buf.read< ::x10::regionarray::Array< ::x10::regionarray::VarMat*>*>();
    FMGL(parFlags) = buf.read< ::x10::regionarray::Array<x10_boolean>*>();
    FMGL(min2) = buf.read< ::x10::regionarray::Array< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>*>*>();
    FMGL(max2) = buf.read< ::x10::regionarray::Array< ::x10::regionarray::Array< ::x10::regionarray::PolyRow*>*>*>();
    FMGL(rank) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::regionarray::PolyScanner::rtt;
void x10::regionarray::PolyScanner::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.regionarray.PolyScanner",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of PolyScanner */
/*************************************************/
/*************************************************/
/* START of PolyScanner$RailIt */
#include <x10/regionarray/PolyScanner__RailIt.h>

#include <x10/lang/Iterator.h>
#include <x10/lang/Long.h>
#include <x10/lang/Int.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Rail.h>
#include <x10/regionarray/PolyScanner.h>
#include <x10/compiler/Synthetic.h>
::x10::lang::Iterator< ::x10::lang::Rail< x10_int >*>::itable< ::x10::regionarray::PolyScanner__RailIt >  x10::regionarray::PolyScanner__RailIt::_itable_0(&::x10::lang::X10Class::equals, &x10::regionarray::PolyScanner__RailIt::hasNext, &::x10::lang::X10Class::hashCode, &x10::regionarray::PolyScanner__RailIt::next, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::PolyScanner__RailIt >  x10::regionarray::PolyScanner__RailIt::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::PolyScanner__RailIt::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterator< ::x10::lang::Rail< x10_int >*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::PolyScanner__RailIt")};

//#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
void x10::regionarray::PolyScanner__RailIt::_constructor(::x10::regionarray::PolyScanner* out__) {
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->FMGL(out__) = out__;
    
    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    
    //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->x10::regionarray::PolyScanner__RailIt::__fieldInitializers_x10_regionarray_PolyScanner_RailIt();
    
    //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->FMGL(myMin)->x10::lang::Rail< x10_int >::__set(((x10_long)(((x10_int)0))),
                                                         ::x10aux::nullCheck(this->FMGL(s))->x10::regionarray::PolyScanner::min(
                                                           ((x10_int)0)));
    
    //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->FMGL(myMax)->x10::lang::Rail< x10_int >::__set(
      ((x10_long)(((x10_int)0))), ::x10aux::nullCheck(this->FMGL(s))->x10::regionarray::PolyScanner::max(
                                    ((x10_int)0)));
    
    //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->FMGL(x)->x10::lang::Rail< x10_int >::__set(((x10_long)(((x10_int)0))),
                                                     ::x10aux::nullCheck(this->FMGL(s))->x10::regionarray::PolyScanner::min(
                                                       ((x10_int)0)));
    
    //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    {
        for (this->FMGL(k) = ((x10_int)1); ((((x10_long)(this->FMGL(k)))) < (this->FMGL(rank)));
             this->FMGL(k) = ((this->FMGL(k)) + (((x10_int)1))))
        {
            
            //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            ::x10aux::nullCheck(this->FMGL(s))->x10::regionarray::PolyScanner::set(
              ((this->FMGL(k)) - (((x10_int)1))), this->FMGL(x)->x10::lang::Rail< x10_int >::__apply(
                                                    ((x10_long)(((this->FMGL(k)) - (((x10_int)1)))))));
            
            //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            x10_int m = ::x10aux::nullCheck(this->FMGL(s))->x10::regionarray::PolyScanner::min(
                          this->FMGL(k));
            
            //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this->FMGL(x)->x10::lang::Rail< x10_int >::__set(
              ((x10_long)(this->FMGL(k))), m);
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this->FMGL(myMin)->x10::lang::Rail< x10_int >::__set(
              ((x10_long)(this->FMGL(k))), m);
            
            //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this->FMGL(myMax)->x10::lang::Rail< x10_int >::__set(
              ((x10_long)(this->FMGL(k))), ::x10aux::nullCheck(this->FMGL(s))->x10::regionarray::PolyScanner::max(
                                             this->FMGL(k)));
        }
    }
    
    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::lang::Rail< x10_int >* a__116408 = this->FMGL(x);
    x10_long i__116409 = ((this->FMGL(rank)) - (((x10_long)1ll)));
    x10_int r__116410 = ((a__116408->x10::lang::Rail< x10_int >::__apply(
                            i__116409)) - (((x10_int)1)));
    a__116408->x10::lang::Rail< x10_int >::__set(i__116409,
                                                 r__116410);
    
    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->x10::regionarray::PolyScanner__RailIt::checkHasNext();
}
::x10::regionarray::PolyScanner__RailIt* x10::regionarray::PolyScanner__RailIt::_make(
  ::x10::regionarray::PolyScanner* out__) {
    ::x10::regionarray::PolyScanner__RailIt* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PolyScanner__RailIt>()) ::x10::regionarray::PolyScanner__RailIt();
    this_->_constructor(out__);
    return this_;
}



//#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
x10_boolean x10::regionarray::PolyScanner__RailIt::hasNext(
  ) {
    return this->FMGL(doesHaveNext);
    
}

//#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
void x10::regionarray::PolyScanner__RailIt::checkHasNext(
  ) {
    
    //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->FMGL(k) = ((((x10_int) (this->FMGL(rank)))) - (((x10_int)1)));
    
    //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    while (((this->FMGL(x)->x10::lang::Rail< x10_int >::__apply(
               ((x10_long)(this->FMGL(k))))) >= (this->FMGL(myMax)->x10::lang::Rail< x10_int >::__apply(
                                                   ((x10_long)(this->FMGL(k)))))))
    {
        
        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        if (((((x10_long)(this->FMGL(k) = ((this->FMGL(k)) - (((x10_int)1)))))) < (((x10_long)0ll))))
        {
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this->FMGL(doesHaveNext) = false;
            
            //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            return;
        }
        
    }
    
    //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->FMGL(doesHaveNext) = true;
}

//#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
::x10::lang::Rail< x10_int >* x10::regionarray::PolyScanner__RailIt::next(
  ) {
    
    //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::lang::Rail< x10_int >* a__116411 = this->FMGL(x);
    x10_long i__116412 = ((x10_long)(this->FMGL(k)));
    x10_int r__116413 = ((a__116411->x10::lang::Rail< x10_int >::__apply(
                            i__116412)) + (((x10_int)1)));
    a__116411->x10::lang::Rail< x10_int >::__set(i__116412,
                                                 r__116413);
    
    //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    {
        for (this->FMGL(k) = ((this->FMGL(k)) + (((x10_int)1)));
             ((((x10_long)(this->FMGL(k)))) < (this->FMGL(rank)));
             this->FMGL(k) = ((this->FMGL(k)) + (((x10_int)1))))
        {
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            ::x10aux::nullCheck(this->FMGL(s))->x10::regionarray::PolyScanner::set(
              ((this->FMGL(k)) - (((x10_int)1))), this->FMGL(x)->x10::lang::Rail< x10_int >::__apply(
                                                    ((x10_long)(((this->FMGL(k)) - (((x10_int)1)))))));
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            x10_int m = ::x10aux::nullCheck(this->FMGL(s))->x10::regionarray::PolyScanner::min(
                          this->FMGL(k));
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this->FMGL(x)->x10::lang::Rail< x10_int >::__set(
              ((x10_long)(this->FMGL(k))), m);
            
            //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this->FMGL(myMin)->x10::lang::Rail< x10_int >::__set(
              ((x10_long)(this->FMGL(k))), m);
            
            //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this->FMGL(myMax)->x10::lang::Rail< x10_int >::__set(
              ((x10_long)(this->FMGL(k))), ::x10aux::nullCheck(this->FMGL(s))->x10::regionarray::PolyScanner::max(
                                             this->FMGL(k)));
        }
    }
    
    //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->x10::regionarray::PolyScanner__RailIt::checkHasNext();
    
    //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    return this->FMGL(x);
    
}

//#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
void x10::regionarray::PolyScanner__RailIt::remove() {
 
}

//#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
::x10::regionarray::PolyScanner__RailIt* x10::regionarray::PolyScanner__RailIt::x10__regionarray__PolyScanner__RailIt____this__x10__regionarray__PolyScanner__RailIt(
  ) {
    return this;
    
}
::x10::regionarray::PolyScanner* x10::regionarray::PolyScanner__RailIt::x10__regionarray__PolyScanner__RailIt____this__x10__regionarray__PolyScanner(
  ) {
    return this->FMGL(out__);
    
}
void x10::regionarray::PolyScanner__RailIt::__fieldInitializers_x10_regionarray_PolyScanner_RailIt(
  ) {
    this->FMGL(rank) = ::x10aux::nullCheck(this->FMGL(out__))->FMGL(rank);
    this->FMGL(s) = this->FMGL(out__);
    this->FMGL(x) = ::x10::lang::Rail< x10_int >::_make(this->FMGL(rank));
    this->FMGL(myMin) = ::x10::lang::Rail< x10_int >::_make(this->FMGL(rank));
    this->FMGL(myMax) = ::x10::lang::Rail< x10_int >::_make(this->FMGL(rank));
    this->FMGL(k) = ((x10_int)0);
    this->FMGL(doesHaveNext) = false;
}
const ::x10aux::serialization_id_t x10::regionarray::PolyScanner__RailIt::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::PolyScanner__RailIt::_deserializer);

void x10::regionarray::PolyScanner__RailIt::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(rank));
    buf.write(this->FMGL(s));
    buf.write(this->FMGL(x));
    buf.write(this->FMGL(myMin));
    buf.write(this->FMGL(myMax));
    buf.write(this->FMGL(k));
    buf.write(this->FMGL(doesHaveNext));
    buf.write(this->FMGL(out__));
    
}

::x10::lang::Reference* ::x10::regionarray::PolyScanner__RailIt::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::PolyScanner__RailIt* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PolyScanner__RailIt>()) ::x10::regionarray::PolyScanner__RailIt();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::PolyScanner__RailIt::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(rank) = buf.read<x10_long>();
    FMGL(s) = buf.read< ::x10::regionarray::PolyScanner*>();
    FMGL(x) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(myMin) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(myMax) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(k) = buf.read<x10_int>();
    FMGL(doesHaveNext) = buf.read<x10_boolean>();
    FMGL(out__) = buf.read< ::x10::regionarray::PolyScanner*>();
}

::x10aux::RuntimeType x10::regionarray::PolyScanner__RailIt::rtt;
void x10::regionarray::PolyScanner__RailIt::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Iterator< ::x10::lang::Rail< x10_int >*> >()};
    rtt.initStageTwo("x10.regionarray.PolyScanner.RailIt",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of PolyScanner$RailIt */
/*************************************************/
/*************************************************/
/* START of PolyScanner$Anonymous$10018 */
#include <x10/regionarray/PolyScanner__Anonymous__10018.h>

#include <x10/lang/Iterator.h>
#include <x10/lang/Point.h>
#include <x10/regionarray/PolyScanner.h>
#include <x10/regionarray/PolyScanner__RailIt.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Int.h>
#include <x10/lang/Long.h>
#include <x10/lang/Fun_0_1.h>
#ifndef X10_REGIONARRAY_POLYSCANNER__ANONYMOUS__10018__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_POLYSCANNER__ANONYMOUS__10018__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_PolyScanner__Anonymous__10018__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_PolyScanner__Anonymous__10018__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((x10_long)(::x10aux::nullCheck(t)->x10::lang::Rail< x10_int >::__apply(
                             ((x10_long)(((x10_int) (i)))))));
        
    }
    
    // captured environment
    ::x10::lang::Rail< x10_int >* t;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->t);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_PolyScanner__Anonymous__10018__closure__1* storage = ::x10aux::alloc_z<x10_regionarray_PolyScanner__Anonymous__10018__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::Rail< x10_int >* that_t = buf.read< ::x10::lang::Rail< x10_int >*>();
        x10_regionarray_PolyScanner__Anonymous__10018__closure__1* this_ = new (storage) x10_regionarray_PolyScanner__Anonymous__10018__closure__1(that_t);
        return this_;
    }
    
    x10_regionarray_PolyScanner__Anonymous__10018__closure__1(::x10::lang::Rail< x10_int >* t) : t(t) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10:294";
    }

};

#endif // X10_REGIONARRAY_POLYSCANNER__ANONYMOUS__10018__CLOSURE__1_CLOSURE
::x10::lang::Iterator< ::x10::lang::Point*>::itable< ::x10::regionarray::PolyScanner__Anonymous__10018 >  x10::regionarray::PolyScanner__Anonymous__10018::_itable_0(&::x10::lang::X10Class::equals, &x10::regionarray::PolyScanner__Anonymous__10018::hasNext, &::x10::lang::X10Class::hashCode, &x10::regionarray::PolyScanner__Anonymous__10018::next, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::PolyScanner__Anonymous__10018 >  x10::regionarray::PolyScanner__Anonymous__10018::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::PolyScanner__Anonymous__10018::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterator< ::x10::lang::Point*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::PolyScanner__Anonymous__10018")};

//#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"

//#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
x10_boolean x10::regionarray::PolyScanner__Anonymous__10018::hasNext() {
    ::x10::regionarray::PolyScanner__RailIt* this__116415 = this->FMGL(it);
    return this__116415->FMGL(doesHaveNext);
    
}

//#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
::x10::lang::Point* x10::regionarray::PolyScanner__Anonymous__10018::next(
  ) {
    
    //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    ::x10::lang::Rail< x10_int >* t = this->FMGL(it)->x10::regionarray::PolyScanner__RailIt::next();
    
    //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    return ::x10::lang::Point::make(::x10::lang::Rail< x10_long >::_make((x10_long)(::x10aux::nullCheck(t)->FMGL(size)),
                                                                         reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_PolyScanner__Anonymous__10018__closure__1)))x10_regionarray_PolyScanner__Anonymous__10018__closure__1(t)))));
    
}

//#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
void x10::regionarray::PolyScanner__Anonymous__10018::_constructor(
  ::x10::regionarray::PolyScanner* out__) {
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->FMGL(out__) = out__;
    
    //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    this->FMGL(it) = (__extension__ ({
        ::x10::regionarray::PolyScanner__RailIt* alloc__116078 = 
        (new (::x10aux::alloc_z< ::x10::regionarray::PolyScanner__RailIt>()) ::x10::regionarray::PolyScanner__RailIt());
        (alloc__116078)->::x10::regionarray::PolyScanner__RailIt::_constructor(
          this->FMGL(out__));
        alloc__116078;
    }))
    ;
}
::x10::regionarray::PolyScanner__Anonymous__10018* x10::regionarray::PolyScanner__Anonymous__10018::_make(
  ::x10::regionarray::PolyScanner* out__) {
    ::x10::regionarray::PolyScanner__Anonymous__10018* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PolyScanner__Anonymous__10018>()) ::x10::regionarray::PolyScanner__Anonymous__10018();
    this_->_constructor(out__);
    return this_;
}


const ::x10aux::serialization_id_t x10::regionarray::PolyScanner__Anonymous__10018::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::PolyScanner__Anonymous__10018::_deserializer);

void x10::regionarray::PolyScanner__Anonymous__10018::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(it));
    buf.write(this->FMGL(out__));
    
}

::x10::lang::Reference* ::x10::regionarray::PolyScanner__Anonymous__10018::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::PolyScanner__Anonymous__10018* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PolyScanner__Anonymous__10018>()) ::x10::regionarray::PolyScanner__Anonymous__10018();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::PolyScanner__Anonymous__10018::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(it) = buf.read< ::x10::regionarray::PolyScanner__RailIt*>();
    FMGL(out__) = buf.read< ::x10::regionarray::PolyScanner*>();
}

::x10aux::RuntimeType x10::regionarray::PolyScanner__Anonymous__10018::rtt;
void x10::regionarray::PolyScanner__Anonymous__10018::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Iterator< ::x10::lang::Point*> >()};
    rtt.initStageTwo("x10.regionarray.PolyScanner.Anonymous.10018",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_PolyScanner__Anonymous__10018__closure__1>x10_regionarray_PolyScanner__Anonymous__10018__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_PolyScanner__Anonymous__10018__closure__1::__apply, &x10_regionarray_PolyScanner__Anonymous__10018__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_PolyScanner__Anonymous__10018__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_PolyScanner__Anonymous__10018__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_PolyScanner__Anonymous__10018__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_PolyScanner__Anonymous__10018__closure__1::_deserialize);

/* END of PolyScanner$Anonymous$10018 */
/*************************************************/
