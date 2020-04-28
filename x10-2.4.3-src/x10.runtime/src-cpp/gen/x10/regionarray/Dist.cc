/*************************************************/
/* START of Dist */
#include <x10/regionarray/Dist.h>


//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
x10_long x10::regionarray::Dist::rank() {
    return ::x10aux::nullCheck(this->FMGL(region))->FMGL(rank);
    
}

//#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::regionarray::Dist* x10::regionarray::Dist::makeUnique() {
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    return ::x10aux::class_cast< ::x10::regionarray::Dist*>(::x10::regionarray::Dist::FMGL(UNIQUE__get)());
    
}

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::regionarray::UniqueDist* x10::regionarray::Dist::FMGL(UNIQUE);
void x10::regionarray::Dist::FMGL(UNIQUE__do_init)() {
    FMGL(UNIQUE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::regionarray::Dist.UNIQUE");
    ::x10::regionarray::UniqueDist* __var1964__ = ::x10::regionarray::UniqueDist::_make();
    FMGL(UNIQUE) = __var1964__;
    FMGL(UNIQUE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::regionarray::Dist::FMGL(UNIQUE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(UNIQUE__status), &FMGL(UNIQUE__do_init), &FMGL(UNIQUE__exception), "x10::regionarray::Dist.UNIQUE");
    
}
volatile ::x10aux::StaticInitController::status x10::regionarray::Dist::FMGL(UNIQUE__status);
::x10::lang::CheckedThrowable* x10::regionarray::Dist::FMGL(UNIQUE__exception);

//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::regionarray::Dist* x10::regionarray::Dist::makeConstant(::x10::regionarray::Region* r) {
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::regionarray::ConstantDist* alloc__112412 =  (new (::x10aux::alloc_z< ::x10::regionarray::ConstantDist>()) ::x10::regionarray::ConstantDist());
    (alloc__112412)->::x10::regionarray::ConstantDist::_constructor(r, ::x10::lang::Place::_make(::x10aux::here));
    return alloc__112412;
    
}

//#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::regionarray::Dist* x10::regionarray::Dist::make(::x10::regionarray::Region* r) {
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::regionarray::Region* r__112413 = r;
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    return reinterpret_cast< ::x10::regionarray::Dist*>((__extension__ ({
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        ::x10::regionarray::ConstantDist* alloc__112414 =  (new (::x10aux::alloc_z< ::x10::regionarray::ConstantDist>()) ::x10::regionarray::ConstantDist());
        (alloc__112414)->::x10::regionarray::ConstantDist::_constructor(r__112413,
                                                                        ::x10::lang::Place::_make(::x10aux::here));
        alloc__112414;
    }))
    );
    
}

//#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::regionarray::Dist* x10::regionarray::Dist::makeCyclic(::x10::regionarray::Region* r,
                                                             x10_long axis) {
    return ::x10::regionarray::Dist::makeBlockCyclic(r, axis,
                                                     ((x10_long)1ll));
    
}

//#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::regionarray::Dist* x10::regionarray::Dist::makeCyclic(
  ::x10::regionarray::Region* r) {
    return ::x10::regionarray::Dist::makeBlockCyclic(r, ((x10_long)0ll),
                                                     ((x10_long)1ll));
    
}

//#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::regionarray::Dist* x10::regionarray::Dist::makeBlock(
  ::x10::regionarray::Region* r, x10_long axis) {
    
    //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::regionarray::Region* r__112415 = r;
    x10_long axis__112416 = axis;
    ::x10::lang::PlaceGroup* pg__112417 = reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)());
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    return reinterpret_cast< ::x10::regionarray::Dist*>((__extension__ ({
        
        //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        ::x10::regionarray::BlockDist* alloc__112418 =  (new (::x10aux::alloc_z< ::x10::regionarray::BlockDist>()) ::x10::regionarray::BlockDist());
        (alloc__112418)->::x10::regionarray::BlockDist::_constructor(
          r__112415, axis__112416, pg__112417);
        alloc__112418;
    }))
    );
    
}

//#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::regionarray::Dist* x10::regionarray::Dist::makeBlockBlock(
  ::x10::regionarray::Region* r, x10_long axis0, x10_long axis1) {
    
    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::regionarray::BlockBlockDist* alloc__112419 =  (new (::x10aux::alloc_z< ::x10::regionarray::BlockBlockDist>()) ::x10::regionarray::BlockBlockDist());
    (alloc__112419)->::x10::regionarray::BlockBlockDist::_constructor(
      r, axis0, axis1, reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)()));
    return alloc__112419;
    
}

//#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::regionarray::Dist* x10::regionarray::Dist::makeBlock(
  ::x10::regionarray::Region* r) {
    
    //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::regionarray::Region* r__112420 = r;
    ::x10::lang::PlaceGroup* pg__112421 = reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)());
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    return reinterpret_cast< ::x10::regionarray::Dist*>((__extension__ ({
        
        //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        ::x10::regionarray::BlockDist* alloc__112422 =  (new (::x10aux::alloc_z< ::x10::regionarray::BlockDist>()) ::x10::regionarray::BlockDist());
        (alloc__112422)->::x10::regionarray::BlockDist::_constructor(
          r__112420, ((x10_long)0ll), pg__112421);
        alloc__112422;
    }))
    );
    
}

//#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::regionarray::Dist* x10::regionarray::Dist::makeBlockCyclic(
  ::x10::regionarray::Region* r, x10_long axis, x10_long blockSize) {
    
    //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::regionarray::Dist* x10::regionarray::Dist::makeUnique(
  ::x10::lang::PlaceGroup* pg) {
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    if (::x10aux::nullCheck(pg)->equals(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)())))
    {
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return ::x10aux::class_cast< ::x10::regionarray::Dist*>(::x10::regionarray::Dist::FMGL(UNIQUE__get)());
        
    } else {
        
        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return ::x10aux::class_cast< ::x10::regionarray::Dist*>((__extension__ ({
            ::x10::regionarray::UniqueDist* alloc__109429 =
               (new (::x10aux::alloc_z< ::x10::regionarray::UniqueDist>()) ::x10::regionarray::UniqueDist());
            (alloc__109429)->::x10::regionarray::UniqueDist::_constructor(
              pg);
            alloc__109429;
        }))
        );
        
    }
    
}

//#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::regionarray::Dist* x10::regionarray::Dist::makeConstant(
  ::x10::regionarray::Region* r, ::x10::lang::Place p) {
    
    //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::regionarray::ConstantDist* alloc__112423 =  (new (::x10aux::alloc_z< ::x10::regionarray::ConstantDist>()) ::x10::regionarray::ConstantDist());
    (alloc__112423)->::x10::regionarray::ConstantDist::_constructor(
      r, p);
    return alloc__112423;
    
}

//#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::regionarray::Dist* x10::regionarray::Dist::makeCyclic(
  ::x10::regionarray::Region* r, x10_long axis, ::x10::lang::PlaceGroup* pg) {
    
    //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::regionarray::Dist* x10::regionarray::Dist::makeBlock(
  ::x10::regionarray::Region* r, x10_long axis, ::x10::lang::PlaceGroup* pg) {
    
    //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::regionarray::BlockDist* alloc__112424 =  (new (::x10aux::alloc_z< ::x10::regionarray::BlockDist>()) ::x10::regionarray::BlockDist());
    (alloc__112424)->::x10::regionarray::BlockDist::_constructor(
      r, axis, pg);
    return alloc__112424;
    
}

//#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"

//#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"

//#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"

//#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"

//#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::regionarray::Region* x10::regionarray::Dist::__apply(
  ::x10::lang::Place p) {
    return this->get(p);
    
}

//#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"

//#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::lang::Place x10::regionarray::Dist::__apply(x10_long i0) {
    return this->__apply((__extension__ ({
                             
                             //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                             x10_long i__112373 = i0;
                             (__extension__ ({
                                 ::x10::lang::Point* alloc__112374 =
                                    (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                                 (alloc__112374)->::x10::lang::Point::_constructor(
                                   i__112373);
                                 alloc__112374;
                             }))
                             ;
                         }))
                         );
    
}

//#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::lang::Place x10::regionarray::Dist::__apply(x10_long i0,
                                                   x10_long i1) {
    return this->__apply((__extension__ ({
                             
                             //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                             x10_long i__112376 = i0;
                             x10_long i__112377 = i1;
                             (__extension__ ({
                                 ::x10::lang::Point* alloc__112378 =
                                    (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                                 (alloc__112378)->::x10::lang::Point::_constructor(
                                   i__112376, i__112377);
                                 alloc__112378;
                             }))
                             ;
                         }))
                         );
    
}

//#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::lang::Place x10::regionarray::Dist::__apply(x10_long i0,
                                                   x10_long i1,
                                                   x10_long i2) {
    return this->__apply((__extension__ ({
                             
                             //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                             x10_long i__112380 = i0;
                             x10_long i__112381 = i1;
                             x10_long i__112382 = i2;
                             (__extension__ ({
                                 ::x10::lang::Point* alloc__112383 =
                                    (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                                 (alloc__112383)->::x10::lang::Point::_constructor(
                                   i__112380, i__112381, i__112382);
                                 alloc__112383;
                             }))
                             ;
                         }))
                         );
    
}

//#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::lang::Place x10::regionarray::Dist::__apply(x10_long i0,
                                                   x10_long i1,
                                                   x10_long i2,
                                                   x10_long i3) {
    return this->__apply((__extension__ ({
                             
                             //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                             x10_long i__112385 = i0;
                             x10_long i__112386 = i1;
                             x10_long i__112387 = i2;
                             x10_long i__112388 = i3;
                             (__extension__ ({
                                 ::x10::lang::Point* alloc__112389 =
                                    (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                                 (alloc__112389)->::x10::lang::Point::_constructor(
                                   i__112385, i__112386, i__112387,
                                   i__112388);
                                 alloc__112389;
                             }))
                             ;
                         }))
                         );
    
}

//#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"

//#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
x10_long x10::regionarray::Dist::offset(x10_long i0) {
    return this->offset((__extension__ ({
                            
                            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                            x10_long i__112391 = i0;
                            (__extension__ ({
                                ::x10::lang::Point* alloc__112392 =
                                   (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                                (alloc__112392)->::x10::lang::Point::_constructor(
                                  i__112391);
                                alloc__112392;
                            }))
                            ;
                        }))
                        );
    
}

//#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
x10_long x10::regionarray::Dist::offset(x10_long i0, x10_long i1) {
    return this->offset((__extension__ ({
                            
                            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                            x10_long i__112394 = i0;
                            x10_long i__112395 = i1;
                            (__extension__ ({
                                ::x10::lang::Point* alloc__112396 =
                                   (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                                (alloc__112396)->::x10::lang::Point::_constructor(
                                  i__112394, i__112395);
                                alloc__112396;
                            }))
                            ;
                        }))
                        );
    
}

//#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
x10_long x10::regionarray::Dist::offset(x10_long i0, x10_long i1,
                                        x10_long i2) {
    return this->offset((__extension__ ({
                            
                            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                            x10_long i__112398 = i0;
                            x10_long i__112399 = i1;
                            x10_long i__112400 = i2;
                            (__extension__ ({
                                ::x10::lang::Point* alloc__112401 =
                                   (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                                (alloc__112401)->::x10::lang::Point::_constructor(
                                  i__112398, i__112399, i__112400);
                                alloc__112401;
                            }))
                            ;
                        }))
                        );
    
}

//#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
x10_long x10::regionarray::Dist::offset(x10_long i0, x10_long i1,
                                        x10_long i2, x10_long i3) {
    return this->offset((__extension__ ({
                            
                            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                            x10_long i__112403 = i0;
                            x10_long i__112404 = i1;
                            x10_long i__112405 = i2;
                            x10_long i__112406 = i3;
                            (__extension__ ({
                                ::x10::lang::Point* alloc__112407 =
                                   (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                                (alloc__112407)->::x10::lang::Point::_constructor(
                                  i__112403, i__112404, i__112405,
                                  i__112406);
                                alloc__112407;
                            }))
                            ;
                        }))
                        );
    
}

//#line 411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"

//#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::lang::Iterator< ::x10::lang::Point*>* x10::regionarray::Dist::iterator(
  ) {
    return ::x10aux::nullCheck(this->FMGL(region))->iterator();
    
}

//#line 465 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"

//#line 480 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
x10_boolean x10::regionarray::Dist::isSubdistribution(::x10::regionarray::Dist* that) {
    
    //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    {
        ::x10::lang::Iterator< ::x10::lang::Place>* p__109433;
        for (p__109433 = (reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)()))->iterator();
             ::x10::lang::Iterator< ::x10::lang::Place>::hasNext(::x10aux::nullCheck(p__109433));
             ) {
            ::x10::lang::Place p = ::x10::lang::Iterator< ::x10::lang::Place>::next(::x10aux::nullCheck(p__109433));
            
            //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            if (!(::x10aux::nullCheck(::x10aux::nullCheck(that)->get(
                                        p))->contains(this->get(
                                                        p))))
            {
                
                //#line 483 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                return false;
                
            }
            
        }
    }
    
    //#line 484 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    return true;
    
}

//#line 539 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
x10_boolean x10::regionarray::Dist::equals(::x10::lang::Any* thatObj) {
    
    //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    if ((::x10aux::struct_equals(this, thatObj))) {
        return true;
        
    }
    
    //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    if (!(::x10aux::instanceof< ::x10::regionarray::Dist*>(thatObj)))
    {
        return false;
        
    }
    
    //#line 542 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::regionarray::Dist* that = ::x10aux::class_cast< ::x10::regionarray::Dist*>(thatObj);
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    if ((!::x10aux::struct_equals((__extension__ ({
                                      ::x10::regionarray::Dist* this__112408 =
                                        this;
                                      ::x10aux::nullCheck(::x10aux::nullCheck(this__112408)->FMGL(region))->FMGL(rank);
                                  }))
                                  , ::x10aux::nullCheck(::x10aux::nullCheck(that)->FMGL(region))->FMGL(rank))))
    {
        return false;
        
    }
    
    //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    if (!(::x10aux::nullCheck(this->FMGL(region))->equals(
            reinterpret_cast< ::x10::lang::Any*>(::x10aux::nullCheck(that)->FMGL(region)))))
    {
        return false;
        
    }
    
    //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::lang::PlaceGroup* pg = this->places();
    
    //#line 546 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    {
        ::x10::lang::Iterator< ::x10::lang::Place>* p__109435;
        for (p__109435 = ::x10aux::nullCheck(pg)->iterator();
             ::x10::lang::Iterator< ::x10::lang::Place>::hasNext(::x10aux::nullCheck(p__109435));
             ) {
            ::x10::lang::Place p = ::x10::lang::Iterator< ::x10::lang::Place>::next(::x10aux::nullCheck(p__109435));
            
            //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            if (!(::x10aux::nullCheck(this->get(p))->equals(
                    reinterpret_cast< ::x10::lang::Any*>(::x10aux::nullCheck(that)->get(
                                                           p)))))
            {
                return false;
                
            }
            
        }
    }
    
    //#line 549 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    return true;
    
}

//#line 563 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"

//#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
x10_boolean x10::regionarray::Dist::contains(::x10::lang::Point* p) {
    return ::x10aux::nullCheck(this->FMGL(region))->contains(
             p);
    
}

//#line 579 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
x10_boolean x10::regionarray::Dist::containsLocally(::x10::lang::Point* p) {
    return (this->contains(p) && ::x10aux::nullCheck(this->__apply(
                                                       ::x10::lang::Place::_make(::x10aux::here)))->contains(
                                   p));
    
}

//#line 591 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::regionarray::Dist* x10::regionarray::Dist::__bar(::x10::regionarray::Region* r) {
    
    //#line 592 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    return this->restriction(r);
    
}

//#line 600 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::regionarray::Dist* x10::regionarray::Dist::__bar(::x10::lang::Place p) {
    return this->restriction(p);
    
}

//#line 638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::lang::String* x10::regionarray::Dist::toString() {
    
    //#line 639 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::lang::String* s = (__extension__ ({ static ::x10::lang::String* strLit__126552 = ::x10aux::makeStringLit("Dist("); strLit__126552; }));
    
    //#line 640 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    x10_boolean first = true;
    
    //#line 641 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    {
        ::x10::lang::Iterator< ::x10::lang::Place>* p__109437;
        for (p__109437 = ::x10aux::nullCheck(this->places())->iterator();
             ::x10::lang::Iterator< ::x10::lang::Place>::hasNext(::x10aux::nullCheck(p__109437));
             ) {
            ::x10::lang::Place p = ::x10::lang::Iterator< ::x10::lang::Place>::next(::x10aux::nullCheck(p__109437));
            
            //#line 642 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            if (!(first)) {
                s = ::x10::lang::String::__plus(s, (__extension__ ({ static ::x10::lang::String* strLit__126553 = ::x10aux::makeStringLit(","); strLit__126553; })));
            }
            
            //#line 643 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            s = ::x10::lang::String::__plus(s, ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126554 = ::x10aux::makeStringLit(""); strLit__126554; })), this->get(
                                                                                                                                                                                                                                                      p)), (__extension__ ({ static ::x10::lang::String* strLit__126555 = ::x10aux::makeStringLit("->"); strLit__126555; }))), p->FMGL(id)));
            
            //#line 644 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            first = false;
        }
    }
    
    //#line 646 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    s = ::x10::lang::String::__plus(s, (__extension__ ({ static ::x10::lang::String* strLit__126556 = ::x10aux::makeStringLit(")"); strLit__126556; })));
    
    //#line 647 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    return s;
    
}

//#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
void x10::regionarray::Dist::_constructor(::x10::regionarray::Region* region) {
    
    //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    FMGL(region) = region;
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::regionarray::Dist* this__112425 = this;
    
}


//#line 663 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
void x10::regionarray::Dist::raiseBoundsError(x10_long i0) {
    
    //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126557 = ::x10aux::makeStringLit("point ("); strLit__126557; })), i0), (__extension__ ({ static ::x10::lang::String* strLit__126558 = ::x10aux::makeStringLit(") not contained in distribution"); strLit__126558; }))))));
}

//#line 666 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
void x10::regionarray::Dist::raiseBoundsError(x10_long i0,
                                              x10_long i1) {
    
    //#line 667 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126559 = ::x10aux::makeStringLit("point ("); strLit__126559; })), i0), (__extension__ ({ static ::x10::lang::String* strLit__126560 = ::x10aux::makeStringLit(", "); strLit__126560; }))), i1), (__extension__ ({ static ::x10::lang::String* strLit__126561 = ::x10aux::makeStringLit(") not contained in distribution"); strLit__126561; }))))));
}

//#line 669 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
void x10::regionarray::Dist::raiseBoundsError(x10_long i0,
                                              x10_long i1,
                                              x10_long i2) {
    
    //#line 670 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126562 = ::x10aux::makeStringLit("point ("); strLit__126562; })), i0), (__extension__ ({ static ::x10::lang::String* strLit__126563 = ::x10aux::makeStringLit(", "); strLit__126563; }))), i1), (__extension__ ({ static ::x10::lang::String* strLit__126564 = ::x10aux::makeStringLit(", "); strLit__126564; }))), i2), (__extension__ ({ static ::x10::lang::String* strLit__126565 = ::x10aux::makeStringLit(") not contained in distribution"); strLit__126565; }))))));
}

//#line 672 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
void x10::regionarray::Dist::raiseBoundsError(x10_long i0,
                                              x10_long i1,
                                              x10_long i2,
                                              x10_long i3) {
    
    //#line 673 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126566 = ::x10aux::makeStringLit("point ("); strLit__126566; })), i0), (__extension__ ({ static ::x10::lang::String* strLit__126567 = ::x10aux::makeStringLit(", "); strLit__126567; }))), i1), (__extension__ ({ static ::x10::lang::String* strLit__126568 = ::x10aux::makeStringLit(", "); strLit__126568; }))), i2), (__extension__ ({ static ::x10::lang::String* strLit__126569 = ::x10aux::makeStringLit(", "); strLit__126569; }))), i3), (__extension__ ({ static ::x10::lang::String* strLit__126570 = ::x10aux::makeStringLit(") not contained in distribution"); strLit__126570; }))))));
}

//#line 675 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
void x10::regionarray::Dist::raiseBoundsError(::x10::lang::Point* pt) {
    
    //#line 676 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126571 = ::x10aux::makeStringLit("point "); strLit__126571; })), pt), (__extension__ ({ static ::x10::lang::String* strLit__126572 = ::x10aux::makeStringLit(" not contained in distribution"); strLit__126572; }))))));
}

//#line 679 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
void x10::regionarray::Dist::raisePlaceError(x10_long i0) {
    
    //#line 680 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::BadPlaceException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126573 = ::x10aux::makeStringLit("point ("); strLit__126573; })), i0), (__extension__ ({ static ::x10::lang::String* strLit__126574 = ::x10aux::makeStringLit(") not defined at "); strLit__126574; }))), ::x10::lang::Place::_make(::x10aux::here)))));
}

//#line 682 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
void x10::regionarray::Dist::raisePlaceError(x10_long i0,
                                             x10_long i1) {
    
    //#line 683 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::BadPlaceException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126575 = ::x10aux::makeStringLit("point ("); strLit__126575; })), i0), (__extension__ ({ static ::x10::lang::String* strLit__126576 = ::x10aux::makeStringLit(", "); strLit__126576; }))), i1), (__extension__ ({ static ::x10::lang::String* strLit__126577 = ::x10aux::makeStringLit(") not defined at "); strLit__126577; }))), ::x10::lang::Place::_make(::x10aux::here)))));
}

//#line 685 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
void x10::regionarray::Dist::raisePlaceError(x10_long i0,
                                             x10_long i1,
                                             x10_long i2) {
    
    //#line 686 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::BadPlaceException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126578 = ::x10aux::makeStringLit("point ("); strLit__126578; })), i0), (__extension__ ({ static ::x10::lang::String* strLit__126579 = ::x10aux::makeStringLit(", "); strLit__126579; }))), i1), (__extension__ ({ static ::x10::lang::String* strLit__126580 = ::x10aux::makeStringLit(", "); strLit__126580; }))), i2), (__extension__ ({ static ::x10::lang::String* strLit__126581 = ::x10aux::makeStringLit(") not defined at "); strLit__126581; }))), ::x10::lang::Place::_make(::x10aux::here)))));
}

//#line 688 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
void x10::regionarray::Dist::raisePlaceError(x10_long i0,
                                             x10_long i1,
                                             x10_long i2,
                                             x10_long i3) {
    
    //#line 689 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::BadPlaceException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126582 = ::x10aux::makeStringLit("point ("); strLit__126582; })), i0), (__extension__ ({ static ::x10::lang::String* strLit__126583 = ::x10aux::makeStringLit(", "); strLit__126583; }))), i1), (__extension__ ({ static ::x10::lang::String* strLit__126584 = ::x10aux::makeStringLit(", "); strLit__126584; }))), i2), (__extension__ ({ static ::x10::lang::String* strLit__126585 = ::x10aux::makeStringLit(", "); strLit__126585; }))), i3), (__extension__ ({ static ::x10::lang::String* strLit__126586 = ::x10aux::makeStringLit(") not defined at "); strLit__126586; }))), ::x10::lang::Place::_make(::x10aux::here)))));
}

//#line 691 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
void x10::regionarray::Dist::raisePlaceError(::x10::lang::Point* pt) {
    
    //#line 692 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::BadPlaceException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126587 = ::x10aux::makeStringLit("point "); strLit__126587; })), pt), (__extension__ ({ static ::x10::lang::String* strLit__126588 = ::x10aux::makeStringLit(" not defined at "); strLit__126588; }))), ::x10::lang::Place::_make(::x10aux::here)))));
}

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
::x10::regionarray::Dist* x10::regionarray::Dist::x10__regionarray__Dist____this__x10__regionarray__Dist(
  ) {
    return this;
    
}
void x10::regionarray::Dist::__fieldInitializers_x10_regionarray_Dist(
  ) {
 
}
void x10::regionarray::Dist::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(region));
    
}

void x10::regionarray::Dist::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(region) = buf.read< ::x10::regionarray::Region*>();
}

::x10aux::RuntimeType x10::regionarray::Dist::rtt;
void x10::regionarray::Dist::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::Point*, ::x10::lang::Place> >(), ::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >()};
    rtt.initStageTwo("x10.regionarray.Dist",::x10aux::RuntimeType::class_kind, 2, parents, 0, NULL, NULL);
}

/* END of Dist */
/*************************************************/
