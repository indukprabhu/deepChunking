/*************************************************/
/* START of KAlternate */
#include <KAlternate.h>

#include <x10/lang/Double.h>
#include <x10/lang/Rail.h>
#include <HistProfile.h>
#include <x10/lang/Long.h>
#include <x10/io/Printer.h>
#include <x10/io/Console.h>
#include <x10/lang/Any.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/CheckedThrowable.h>
#include <WriteToHistoryFile.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/System.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>

//#line 10 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"

//#line 11 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"

//#line 12 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"

//#line 13 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"

//#line 14 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
void KAlternate::_constructor(x10_long size) {
    
    //#line 9 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->KAlternate::__fieldInitializers_KAlternate();
    
    //#line 15 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->FMGL(A) = ::x10::lang::Rail< x10_double >::_make(size);
    
    //#line 16 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->FMGL(B) = ::x10::lang::Rail< x10_double >::_make(size);
    
    //#line 17 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->FMGL(C) = ::x10::lang::Rail< x10_double >::_make(size);
    
    //#line 19 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__5521 = ::x10aux::makeStringLit("inside const KA done"); strLit__5521; }))));
}
::KAlternate* KAlternate::_make(x10_long size) {
    ::KAlternate* this_ = new (::x10aux::alloc_z< ::KAlternate>()) ::KAlternate();
    this_->_constructor(size);
    return this_;
}



//#line 21 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
void KAlternate::matgen(x10_long size) {
    
    //#line 22 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    {
        x10_long j;
        for (j = ((x10_long)0ll); ((j) < (size)); j = ((j) + (((x10_long)1ll))))
        {
            
            //#line 23 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10aux::nullCheck(this->FMGL(B))->x10::lang::Rail< x10_double >::__set(
              j, 2.0);
            
            //#line 24 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10aux::nullCheck(this->FMGL(C))->x10::lang::Rail< x10_double >::__set(
              j, 4.0);
        }
    }
    
}

//#line 27 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
void KAlternate::calc(x10_long size, x10_long k1, x10_long k2,
                      x10_long scale) {
    {
        
        //#line 28 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var0 = ::x10::lang::Runtime::startFinish();
        {
            ::x10::lang::CheckedThrowable* throwable__5219 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        ::WriteToHistoryFile* newFileWriter__5205 =
                          ::WriteToHistoryFile::_make();
                        ::x10::lang::Rail< x10_long >* startTime__5206 =
                          ::x10::lang::Rail< x10_long >::_make(((x10_long)1000ll),
                                                               ((x10_long)0ll));
                        ::x10::lang::Rail< x10_long >* endTime__5207 =
                          ::x10::lang::Rail< x10_long >::_make(((x10_long)1000ll),
                                                               ((x10_long)0ll));
                        ::x10::lang::Rail< x10_long >* estTime__5208 =
                          ::x10::lang::Rail< x10_long >::_make(((x10_long)1000ll),
                                                               ((x10_long)0ll));
                        
                        //#line 29 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                        {
                            x10_long pp__5209;
                            for (pp__5209 = ((x10_long)0ll);
                                 ((pp__5209) < (size)); pp__5209 =
                                                          ((pp__5209) + (((x10_long)1ll))))
                            {
                                ::x10aux::nullCheck(newFileWriter__5205)->writeToFile(
                                  (__extension__ ({ static ::x10::lang::String* strLit__5522 = ::x10aux::makeStringLit("0"); strLit__5522; })),
                                  ::x10aux::class_cast_unchecked<x10_double>(((x10_long)1ll)),
                                  true, true, pp__5209, ((x10_long)1ll));
                                
                                //#line 30 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                x10_long i__5210 = pp__5209;
                                
                                //#line 32 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                if (((((i__5210) % ::x10aux::zeroCheck(((k1) + (k2))))) < (k1)))
                                {
                                    
                                    //#line 33 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                    ::x10aux::nullCheck(this->FMGL(A))->x10::lang::Rail< x10_double >::__set(
                                      i__5210, this->floatOperations(
                                                 ::x10aux::nullCheck(this->FMGL(B))->x10::lang::Rail< x10_double >::__apply(
                                                   i__5210),
                                                 ::x10aux::nullCheck(this->FMGL(C))->x10::lang::Rail< x10_double >::__apply(
                                                   i__5210),
                                                 size));
                                    
                                    //#line 34 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                    ::x10::lang::Rail< x10_double >* a__5199 =
                                      this->FMGL(A);
                                    x10_long i__5200 = i__5210;
                                    x10_double r__5201 = ((::x10aux::nullCheck(a__5199)->x10::lang::Rail< x10_double >::__apply(
                                                             i__5200)) + (this->floatOperations(
                                                                            ::x10aux::nullCheck(this->FMGL(B))->x10::lang::Rail< x10_double >::__apply(
                                                                              i__5210),
                                                                            ::x10aux::nullCheck(this->FMGL(C))->x10::lang::Rail< x10_double >::__apply(
                                                                              i__5210),
                                                                            size)));
                                    ::x10aux::nullCheck(a__5199)->x10::lang::Rail< x10_double >::__set(
                                      i__5200, r__5201);
                                } else {
                                    
                                    //#line 38 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                    ::x10aux::nullCheck(this->FMGL(A))->x10::lang::Rail< x10_double >::__set(
                                      i__5210, this->floatOperations(
                                                 ::x10aux::nullCheck(this->FMGL(B))->x10::lang::Rail< x10_double >::__apply(
                                                   i__5210),
                                                 ::x10aux::nullCheck(this->FMGL(C))->x10::lang::Rail< x10_double >::__apply(
                                                   i__5210),
                                                 ((((((size) * (scale))) * (((i__5210) + (((x10_long)1ll)))))) / ::x10aux::zeroCheck(((x10_long)25ll)))));
                                    
                                    //#line 39 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                    ::x10::lang::Rail< x10_double >* a__5202 =
                                      this->FMGL(A);
                                    x10_long i__5203 = i__5210;
                                    x10_double r__5204 = ((::x10aux::nullCheck(a__5202)->x10::lang::Rail< x10_double >::__apply(
                                                             i__5203)) + (this->floatOperations(
                                                                            ::x10aux::nullCheck(this->FMGL(B))->x10::lang::Rail< x10_double >::__apply(
                                                                              i__5210),
                                                                            ::x10aux::nullCheck(this->FMGL(C))->x10::lang::Rail< x10_double >::__apply(
                                                                              i__5210),
                                                                            ((((((size) * (scale))) * (((i__5210) + (((x10_long)1ll)))))) / ::x10aux::zeroCheck(((x10_long)25ll))))));
                                    ::x10aux::nullCheck(a__5202)->x10::lang::Rail< x10_double >::__set(
                                      i__5203, r__5204);
                                }
                                
                            }
                        }
                        ::x10aux::nullCheck(newFileWriter__5205)->writeToFile(
                          (__extension__ ({ static ::x10::lang::String* strLit__5533 = ::x10aux::makeStringLit("0"); strLit__5533; })),
                          ::x10aux::class_cast_unchecked<x10_double>(((x10_long)1ll)),
                          true, false, ((x10_long)1ll), ((x10_long)1ll));
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc2) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc2);
                        {
                            ::x10::lang::Runtime::pushException(
                              __lowerer__var__0__);
                            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                        }
                    } else
                    throw;
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc3) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__5220 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc3);
                    {
                        throwable__5219 = formal__5220;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__5219)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__5219))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__5219));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var0);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__5219)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__5219)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__5219));
                }
                
            }
            
        }
    }
}

//#line 46 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
x10_double KAlternate::floatOperations(x10_double b, x10_double c,
                                       x10_long n) {
    ::WriteToHistoryFile* newFileWriter = ::WriteToHistoryFile::_make();
    ::x10::lang::Rail< x10_long >* startTime = ::x10::lang::Rail< x10_long >::_make(((x10_long)1000ll),
                                                                                    ((x10_long)0ll));
    ::x10::lang::Rail< x10_long >* endTime = ::x10::lang::Rail< x10_long >::_make(((x10_long)1000ll),
                                                                                  ((x10_long)0ll));
    ::x10::lang::Rail< x10_long >* estTime = ::x10::lang::Rail< x10_long >::_make(((x10_long)1000ll),
                                                                                  ((x10_long)0ll));
    ::x10aux::nullCheck(startTime)->x10::lang::Rail< x10_long >::__set(
      ((x10_long)1ll), ::x10::lang::System::nanoTime());
    
    //#line 48 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_double result = ((x10_double) (((x10_long)0ll)));
    ::x10aux::nullCheck(endTime)->x10::lang::Rail< x10_long >::__set(
      ((x10_long)1ll), ::x10::lang::System::nanoTime());
    ::x10aux::nullCheck(estTime)->x10::lang::Rail< x10_long >::__set(
      ((x10_long)1ll), ((::x10aux::nullCheck(endTime)->x10::lang::Rail< x10_long >::__apply(
                           ((x10_long)1ll))) - (::x10aux::nullCheck(startTime)->x10::lang::Rail< x10_long >::__apply(
                                                  ((x10_long)1ll)))));
    ::x10aux::nullCheck(newFileWriter)->writeToFile((__extension__ ({ static ::x10::lang::String* strLit__5536 = ::x10aux::makeStringLit("1"); strLit__5536; })),
                                                    ::x10aux::class_cast_unchecked<x10_double>(::x10aux::nullCheck(estTime)->x10::lang::Rail< x10_long >::__apply(
                                                                                                 ((x10_long)1ll))),
                                                    false,
                                                    false,
                                                    ((x10_long)1ll),
                                                    ((x10_long)1ll));
    
    //#line 49 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    {
        x10_long j;
        for (j = ((x10_long)0ll); ((j) < (n)); j = ((j) + (((x10_long)1ll))))
        {
            ::x10aux::nullCheck(startTime)->x10::lang::Rail< x10_long >::__set(
              ((x10_long)0ll), ::x10::lang::System::nanoTime());
            
            //#line 50 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            result = ((((((result) + (((b) + (c))))) + (((((x10_double) (j))) * (b))))) + (((((x10_double) (j))) * (c))));
            ::x10aux::nullCheck(endTime)->x10::lang::Rail< x10_long >::__set(
              ((x10_long)0ll), ::x10::lang::System::nanoTime());
            ::x10aux::nullCheck(estTime)->x10::lang::Rail< x10_long >::__set(
              ((x10_long)0ll), ((::x10aux::nullCheck(endTime)->x10::lang::Rail< x10_long >::__apply(
                                   ((x10_long)0ll))) - (::x10aux::nullCheck(startTime)->x10::lang::Rail< x10_long >::__apply(
                                                          ((x10_long)0ll)))));
            ::x10aux::nullCheck(newFileWriter)->writeToFile(
              (__extension__ ({ static ::x10::lang::String* strLit__5540 = ::x10aux::makeStringLit("0"); strLit__5540; })),
              ::x10aux::class_cast_unchecked<x10_double>(::x10aux::nullCheck(estTime)->x10::lang::Rail< x10_long >::__apply(
                                                           ((x10_long)0ll))),
              false, false, ((x10_long)1ll), ((x10_long)1ll));
        }
    }
    ::x10aux::nullCheck(newFileWriter)->writeToFile((__extension__ ({ static ::x10::lang::String* strLit__5542 = ::x10aux::makeStringLit("0"); strLit__5542; })),
                                                    ::x10aux::class_cast_unchecked<x10_double>(((x10_long)1ll)),
                                                    true,
                                                    false,
                                                    ((x10_long)1ll),
                                                    ((x10_long)1ll));
    ::x10aux::nullCheck(newFileWriter)->writeToFile((__extension__ ({ static ::x10::lang::String* strLit__5543 = ::x10aux::makeStringLit("0"); strLit__5543; })),
                                                    ::x10aux::class_cast_unchecked<x10_double>(((x10_long)1ll)),
                                                    true,
                                                    false,
                                                    ((x10_long)1ll),
                                                    ((x10_long)1ll));
}

//#line 54 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
void KAlternate::main(::x10::lang::Rail< ::x10::lang::String* >* args) {
    
    //#line 55 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long n = ((x10_long)2500ll);
    
    //#line 56 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long scale = ((x10_long)100000ll);
    
    //#line 57 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long k1 = ((x10_long)1ll);
    
    //#line 58 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long k2 = ((x10_long)1ll);
    
    //#line 59 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    {
        x10_long i;
        for (i = ((x10_long)0ll); ((i) < ((x10_long)(::x10aux::nullCheck(args)->FMGL(size))));
             i = ((i) + (((x10_long)1ll)))) {
            
            //#line 60 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            if (::x10aux::equals(::x10aux::nullCheck(args)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                   i),(__extension__ ({ static ::x10::lang::String* strLit__5545 = ::x10aux::makeStringLit("-n"); strLit__5545; }))))
            {
                
                //#line 61 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                n = ::x10::lang::LongNatives::parseLong(::x10aux::nullCheck(args)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                                          ((i) + (((x10_long)1ll)))));
                
                //#line 62 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                i = ((i) + (((x10_long)1ll)));
            } else 
            //#line 64 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            if (::x10aux::equals(::x10aux::nullCheck(args)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                   i),(__extension__ ({ static ::x10::lang::String* strLit__5548 = ::x10aux::makeStringLit("-k1"); strLit__5548; }))))
            {
                
                //#line 65 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                k1 = ::x10::lang::LongNatives::parseLong(::x10aux::nullCheck(args)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                                           ((i) + (((x10_long)1ll)))));
                
                //#line 66 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                i = ((i) + (((x10_long)1ll)));
            } else 
            //#line 68 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            if (::x10aux::equals(::x10aux::nullCheck(args)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                   i),(__extension__ ({ static ::x10::lang::String* strLit__5551 = ::x10aux::makeStringLit("-k2"); strLit__5551; }))))
            {
                
                //#line 69 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                k2 = ::x10::lang::LongNatives::parseLong(::x10aux::nullCheck(args)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                                           ((i) + (((x10_long)1ll)))));
                
                //#line 70 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                i = ((i) + (((x10_long)1ll)));
            } else 
            //#line 72 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            if (::x10aux::equals(::x10aux::nullCheck(args)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                   i),(__extension__ ({ static ::x10::lang::String* strLit__5554 = ::x10aux::makeStringLit("-sc"); strLit__5554; }))))
            {
                
                //#line 73 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                scale = ::x10::lang::LongNatives::parseLong(::x10aux::nullCheck(args)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                                              ((i) + (((x10_long)1ll)))));
                
                //#line 74 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                i = ((i) + (((x10_long)1ll)));
            } else {
                
                //#line 77 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
                  reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__5556 = ::x10aux::makeStringLit(" setting defalut n as 2500, k1=1, k2-1 "); strLit__5556; }))));
            }
            
        }
    }
    
    //#line 80 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__5557 = ::x10aux::makeStringLit(" n "); strLit__5557; })), n), (__extension__ ({ static ::x10::lang::String* strLit__5558 = ::x10aux::makeStringLit(" k1 "); strLit__5558; }))), k1), (__extension__ ({ static ::x10::lang::String* strLit__5559 = ::x10aux::makeStringLit(" k2 "); strLit__5559; }))), k2), (__extension__ ({ static ::x10::lang::String* strLit__5560 = ::x10aux::makeStringLit(" sc "); strLit__5560; }))), scale)));
    
    //#line 81 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__5561 = ::x10aux::makeStringLit("creating KAlyernate "); strLit__5561; }))));
    
    //#line 82 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    ::KAlternate* arr = ::KAlternate::_make(n);
    
    //#line 83 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__5562 = ::x10aux::makeStringLit(" done creating KAlyernate "); strLit__5562; }))));
    
    //#line 84 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    arr->matgen(n);
    
    //#line 85 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long startTime = ::x10::lang::System::nanoTime();
    
    //#line 86 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    arr->calc(n, k1, k2, scale);
    
    //#line 87 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long endTime = ::x10::lang::System::nanoTime();
    
    //#line 88 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long totalTime = ((endTime) - (startTime));
    
    //#line 89 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__5563 = ::x10aux::makeStringLit("Start Time: "); strLit__5563; })), startTime), (__extension__ ({ static ::x10::lang::String* strLit__5564 = ::x10aux::makeStringLit(" Finish Time: "); strLit__5564; }))), endTime), (__extension__ ({ static ::x10::lang::String* strLit__5565 = ::x10aux::makeStringLit(" Estimated Time: "); strLit__5565; }))), ((totalTime) / ::x10aux::zeroCheck(((x10_long)1000000ll)))), (__extension__ ({ static ::x10::lang::String* strLit__5566 = ::x10aux::makeStringLit(" ms"); strLit__5566; })))));
    
    //#line 90 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_double sum = 0.0;
    
    //#line 107 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__5567 = ::x10aux::makeStringLit("Output verified"); strLit__5567; }))));
}

//#line 9 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
::KAlternate* KAlternate::KAlternate____this__KAlternate(
  ) {
    return this;
    
}
void KAlternate::__fieldInitializers_KAlternate() {
    this->FMGL(A) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_double >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(B) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_double >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(C) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_double >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(histObj) = (::x10aux::class_cast_unchecked< ::HistProfile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
const ::x10aux::serialization_id_t KAlternate::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::KAlternate::_deserializer);

void KAlternate::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(A));
    buf.write(this->FMGL(B));
    buf.write(this->FMGL(C));
    buf.write(this->FMGL(histObj));
    
}

::x10::lang::Reference* ::KAlternate::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::KAlternate* this_ = new (::x10aux::alloc_z< ::KAlternate>()) ::KAlternate();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void KAlternate::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(A) = buf.read< ::x10::lang::Rail< x10_double >*>();
    FMGL(B) = buf.read< ::x10::lang::Rail< x10_double >*>();
    FMGL(C) = buf.read< ::x10::lang::Rail< x10_double >*>();
    FMGL(histObj) = buf.read< ::HistProfile*>();
}

::x10aux::RuntimeType KAlternate::rtt;
void KAlternate::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("KAlternate",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of KAlternate */
/*************************************************/
/*************************************************/
/* START of chunk */
#include <chunk.h>

#include <x10/lang/Long.h>
#include <x10/compiler/Synthetic.h>

//#line 111 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"

//#line 112 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"

//#line 113 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"

//#line 114 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
void chunk::_constructor() {
    
    //#line 110 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->chunk::__fieldInitializers_chunk();
    
    //#line 115 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->FMGL(myChunkStart) = ((x10_long)-1ll);
    
    //#line 116 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->FMGL(myChunkEnd) = ((x10_long)-2ll);
}
::chunk* chunk::_make() {
    ::chunk* this_ = new (::x10aux::alloc_z< ::chunk>()) ::chunk();
    this_->_constructor();
    return this_;
}



//#line 110 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
::chunk* chunk::chunk____this__chunk() {
    return this;
    
}
void chunk::__fieldInitializers_chunk() {
    this->FMGL(myChunkStart) = ((x10_long)0ll);
    this->FMGL(myChunkEnd) = ((x10_long)0ll);
    this->FMGL(myCost) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t chunk::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::chunk::_deserializer);

void chunk::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(myChunkStart));
    buf.write(this->FMGL(myChunkEnd));
    buf.write(this->FMGL(myCost));
    
}

::x10::lang::Reference* ::chunk::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::chunk* this_ = new (::x10aux::alloc_z< ::chunk>()) ::chunk();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void chunk::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(myChunkStart) = buf.read<x10_long>();
    FMGL(myChunkEnd) = buf.read<x10_long>();
    FMGL(myCost) = buf.read<x10_long>();
}

::x10aux::RuntimeType chunk::rtt;
void chunk::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("chunk",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of chunk */
/*************************************************/
/*************************************************/
/* START of WorkDivider */
#include <WorkDivider.h>

#include <x10/lang/Long.h>
#include <x10/lang/Rail.h>
#include <chunk.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Double.h>
#include <x10/lang/Runtime.h>
#include <x10/compiler/Synthetic.h>

//#line 120 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
::chunk* WorkDivider::divideWork(x10_long nproc, x10_long t_proc, x10_long n,
                                 x10_long blockSize, ::x10::lang::Rail< x10_long >* costArray,
                                 ::x10::lang::Rail< x10_long >* partialCostArr) {
    
    //#line 121 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    ::chunk* myChunk = ::chunk::_make();
    
    //#line 122 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long totCost = ((x10_long)0ll);
    
    //#line 123 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    {
        x10_long i;
        for (i = ((x10_long)0ll); ((i) < (nproc)); i = ((i) + (((x10_long)1ll))))
        {
            
            //#line 124 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            totCost = ((totCost) + (::x10aux::nullCheck(partialCostArr)->x10::lang::Rail< x10_long >::__apply(
                                      i)));
        }
    }
    
    //#line 126 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long avgcost = ((totCost) / ::x10aux::zeroCheck(nproc));
    
    //#line 127 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long costIt = ((x10_long)0ll);
    
    //#line 128 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_double delta = ::x10::lang::Runtime::FMGL(CHUNK_DELTA__get)();
    
    //#line 130 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long deltaCost = ::x10::lang::DoubleNatives::toLong(((delta) * (((x10_double) (avgcost)))));
    
    //#line 131 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long avgtproc = ((avgcost) * (t_proc));
    
    //#line 133 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long ignoreCostLow = ((avgtproc) - (deltaCost));
    
    //#line 134 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long ignoreCostHigh = ((avgtproc) + (deltaCost));
    
    //#line 135 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long maxCostLow = ((((avgtproc) + (avgcost))) - (deltaCost));
    
    //#line 136 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long maxCostHigh = ((((avgtproc) + (avgcost))) + (deltaCost));
    
    //#line 137 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long blockNum;
    
    //#line 139 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    if ((::x10aux::struct_equals(t_proc, ((x10_long)0ll))))
    {
        
        //#line 141 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        ::x10aux::nullCheck(myChunk)->FMGL(myChunkStart) =
          ((x10_long)0ll);
        
        //#line 142 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        ignoreCostLow = ((x10_long)0ll);
    }
    
    //#line 144 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    {
        for (blockNum = ((x10_long)0ll); ((blockNum) < (nproc));
             blockNum = ((blockNum) + (((x10_long)1ll))))
        {
            
            //#line 145 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            x10_long pcost = ::x10aux::nullCheck(partialCostArr)->x10::lang::Rail< x10_long >::__apply(
                               blockNum);
            
            //#line 146 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            costIt = ((costIt) + (pcost));
            
            //#line 147 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            if (((costIt) > (ignoreCostLow))) {
                
                //#line 148 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                costIt = ((costIt) - (pcost));
                
                //#line 149 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                break;
            }
            
        }
    }
    
    //#line 152 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long costItEnd = costIt;
    
    //#line 153 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long itnumber;
    
    //#line 156 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    {
        for (itnumber = ((blockNum) * (blockSize)); ((itnumber) < (n));
             itnumber = ((itnumber) + (((x10_long)1ll))))
        {
            
            //#line 158 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            if (((((costIt) + (::x10aux::nullCheck(costArray)->x10::lang::Rail< x10_long >::__apply(
                                 itnumber)))) >= (ignoreCostLow)))
            {
                break;
            }
            
            //#line 159 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            costIt = ((costIt) + (::x10aux::nullCheck(costArray)->x10::lang::Rail< x10_long >::__apply(
                                    itnumber)));
        }
    }
    
    //#line 161 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long itnumberS = itnumber;
    
    //#line 162 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    if ((!::x10aux::struct_equals(t_proc, ((x10_long)0ll))))
    {
        
        //#line 164 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        if (((costIt) < (((ignoreCostLow) - (avgcost)))))
        {
            
            //#line 165 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10aux::nullCheck(myChunk)->FMGL(myChunkStart) =
              ((itnumberS) + (((x10_long)1ll)));
        } else 
        //#line 169 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        if (((((costIt) + (::x10aux::nullCheck(costArray)->x10::lang::Rail< x10_long >::__apply(
                             itnumberS)))) >= (maxCostLow)))
        {
            
            //#line 170 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10aux::nullCheck(myChunk)->FMGL(myChunkStart) =
              itnumberS;
        } else {
            
            //#line 175 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10aux::nullCheck(myChunk)->FMGL(myChunkStart) =
              ((itnumberS) + (((x10_long)1ll)));
        }
        
    } else {
        
        //#line 179 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        ::x10aux::nullCheck(myChunk)->FMGL(myChunkStart) =
          ((x10_long)0ll);
    }
    
    //#line 183 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    {
        for (; ((blockNum) < (nproc)); blockNum = ((blockNum) + (((x10_long)1ll))))
        {
            
            //#line 184 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            x10_long pcost = ::x10aux::nullCheck(partialCostArr)->x10::lang::Rail< x10_long >::__apply(
                               blockNum);
            
            //#line 185 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            costItEnd = ((costItEnd) + (pcost));
            
            //#line 186 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            if (((costItEnd) > (maxCostLow))) {
                
                //#line 187 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                costItEnd = ((costItEnd) - (pcost));
                
                //#line 188 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                break;
            }
            
        }
    }
    
    //#line 191 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    costIt = costItEnd;
    
    //#line 192 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    {
        for (itnumber = ((blockNum) * (blockSize)); ((itnumber) < (n));
             itnumber = ((itnumber) + (((x10_long)1ll))))
        {
            
            //#line 194 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            if (((((costIt) + (::x10aux::nullCheck(costArray)->x10::lang::Rail< x10_long >::__apply(
                                 itnumber)))) >= (maxCostLow)))
            {
                break;
            }
            
            //#line 195 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            costIt = ((costIt) + (::x10aux::nullCheck(costArray)->x10::lang::Rail< x10_long >::__apply(
                                    itnumber)));
        }
    }
    
    //#line 197 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long itnumberE = itnumber;
    
    //#line 199 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    if ((!::x10aux::struct_equals(t_proc, ((nproc) - (((x10_long)1ll))))))
    {
        
        //#line 200 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        if (((costIt) < (ignoreCostLow))) {
            
            //#line 202 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10aux::nullCheck(myChunk)->FMGL(myChunkEnd) =
              itnumberE;
        } else 
        //#line 206 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        if (((((costIt) + (::x10aux::nullCheck(costArray)->x10::lang::Rail< x10_long >::__apply(
                             itnumberE)))) >= (((maxCostLow) + (avgcost)))))
        {
            
            //#line 207 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10aux::nullCheck(myChunk)->FMGL(myChunkEnd) =
              ((itnumberE) - (((x10_long)1ll)));
        } else {
            
            //#line 212 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10aux::nullCheck(myChunk)->FMGL(myChunkEnd) =
              itnumberE;
        }
        
    } else {
        
        //#line 218 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        ::x10aux::nullCheck(myChunk)->FMGL(myChunkEnd) = ((n) - (((x10_long)1ll)));
    }
    
    //#line 221 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    return myChunk;
    
}

//#line 119 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
::WorkDivider* WorkDivider::WorkDivider____this__WorkDivider(
  ) {
    return this;
    
}
void WorkDivider::_constructor() {
    this->WorkDivider::__fieldInitializers_WorkDivider();
}
::WorkDivider* WorkDivider::_make() {
    ::WorkDivider* this_ = new (::x10aux::alloc_z< ::WorkDivider>()) ::WorkDivider();
    this_->_constructor();
    return this_;
}


void WorkDivider::__fieldInitializers_WorkDivider() {
 
}
const ::x10aux::serialization_id_t WorkDivider::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::WorkDivider::_deserializer);

void WorkDivider::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::WorkDivider::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::WorkDivider* this_ = new (::x10aux::alloc_z< ::WorkDivider>()) ::WorkDivider();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void WorkDivider::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType WorkDivider::rtt;
void WorkDivider::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("WorkDivider",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of WorkDivider */
/*************************************************/
/*************************************************/
/* START of WriteToHistoryFile */
#include <WriteToHistoryFile.h>

#include <x10/util/ArrayList.h>
#include <x10/lang/String.h>
#include <x10/lang/Double.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Long.h>
#include <x10/io/Printer.h>
#include <x10/io/Console.h>
#include <x10/lang/Any.h>
#include <x10/io/File.h>
#include <x10/io/FileWriter.h>
#include <x10/lang/Int.h>
#include <x10/lang/Char.h>
#include <x10/io/Writer.h>
#include <x10/io/OutputStreamWriter.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/Synthetic.h>

//#line 225 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"

//#line 226 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
void WriteToHistoryFile::_constructor() {
    
    //#line 224 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->WriteToHistoryFile::__fieldInitializers_WriteToHistoryFile();
    
    //#line 227 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->FMGL(timerDone) = ::x10::util::ArrayList< ::x10::lang::String*>::_make();
}
::WriteToHistoryFile* WriteToHistoryFile::_make() {
    ::WriteToHistoryFile* this_ = new (::x10aux::alloc_z< ::WriteToHistoryFile>()) ::WriteToHistoryFile();
    this_->_constructor();
    return this_;
}



//#line 229 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
void WriteToHistoryFile::writeToFile(::x10::lang::String* timer, x10_double time,
                                     x10_boolean flush, x10_boolean itPresent,
                                     x10_long itIndex, x10_long forIndex) {
    
    //#line 231 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    if (!(flush)) {
        
        //#line 232 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
          reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__5577 = ::x10aux::makeStringLit(" inside writeto file it not present "); strLit__5577; })), time)));
        
        //#line 233 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        ::x10::lang::String* toWrite = ::x10::lang::String::__plus(::x10::lang::String::__plus(timer, (__extension__ ({ static ::x10::lang::String* strLit__5578 = ::x10aux::makeStringLit(" "); strLit__5578; }))), time);
        
        //#line 234 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        ::x10aux::nullCheck(this->FMGL(timerDone))->add(toWrite);
    } else {
        
        //#line 237 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        try {
            
            //#line 238 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            if (itPresent) {
                ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
                  reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__5583 = ::x10aux::makeStringLit(" inside writeto file for "); strLit__5583; })), forIndex), (__extension__ ({ static ::x10::lang::String* strLit__5584 = ::x10aux::makeStringLit(" "); strLit__5584; }))), itIndex)));
            }
            
            //#line 239 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
              reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__5585 = ::x10aux::makeStringLit(" done array size "); strLit__5585; })), ::x10aux::nullCheck(this->FMGL(timerDone))->size())));
            
            //#line 240 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10::lang::String* str;
            
            //#line 241 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10::io::File* fl = ::x10::io::File::_make((__extension__ ({ static ::x10::lang::String* strLit__5586 = ::x10aux::makeStringLit("/home/induk/workspace/testprgms/src/classFiles/profileResults.txt"); strLit__5586; })));
            
            //#line 242 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            if ((::x10aux::nullCheck(fl)->isFile() && ::x10aux::nullCheck(fl)->canRead()))
            {
                
                //#line 244 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                ::x10::io::FileWriter* fw = ::x10::io::FileWriter::_make(fl,
                                                                         true);
                
                //#line 245 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                if (itPresent) {
                    
                    //#line 246 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                    str = ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__5587 = ::x10aux::makeStringLit("Loop"); strLit__5587; })), forIndex), (__extension__ ({ static ::x10::lang::String* strLit__5588 = ::x10aux::makeStringLit(" IterationEnd "); strLit__5588; }))), itIndex);
                    
                    //#line 247 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                    ::x10aux::nullCheck(this->FMGL(timerDone))->add(
                      str);
                    
                    //#line 248 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                    ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
                      reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__5593 = ::x10aux::makeStringLit(" timer updated "); strLit__5593; })), ::x10aux::nullCheck(this->FMGL(timerDone))->size())));
                }
                
                //#line 250 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                {
                    x10_long i;
                    for (i = ((x10_long)0ll); ((i) < (::x10aux::nullCheck(this->FMGL(timerDone))->size()));
                         i = ((i) + (((x10_long)1ll)))) {
                        
                        //#line 251 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                        str = ::x10aux::nullCheck(this->FMGL(timerDone))->get(
                                i);
                        
                        //#line 252 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                        {
                            x10_long j;
                            for (j = ((x10_long)0ll); ((j) < (((x10_long)(::x10aux::nullCheck(str)->x10::lang::String::length()))));
                                 j = ((j) + (((x10_long)1ll))))
                            {
                                
                                //#line 253 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                x10_int jInt = ((x10_int) (j));
                                
                                //#line 254 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                x10_char ch = ::x10aux::nullCheck(str)->x10::lang::String::charAt(
                                                jInt);
                                
                                //#line 255 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                ::x10aux::nullCheck(fw)->writeChar(
                                  ch);
                            }
                        }
                        
                        //#line 257 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                        ::x10aux::nullCheck(fw)->writeChar(
                          ((x10_char)'\n'));
                    }
                }
                
                //#line 259 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                ::x10aux::nullCheck(this->FMGL(timerDone))->clear();
                
                //#line 260 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                ::x10aux::nullCheck(fw)->close();
            } else {
                
                //#line 263 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
                  reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__5595 = ::x10aux::makeStringLit("file not found"); strLit__5595; }))));
            }
            
        }
        catch (::x10::lang::CheckedThrowable* __exc14) {
            if (::x10aux::instanceof< ::x10::lang::Exception*>(__exc14)) {
                ::x10::lang::Exception* ex = static_cast< ::x10::lang::Exception*>(__exc14);
                {
                 
                }
            } else
            throw;
        }
    }
    
}

//#line 224 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
::WriteToHistoryFile* WriteToHistoryFile::WriteToHistoryFile____this__WriteToHistoryFile(
  ) {
    return this;
    
}
void WriteToHistoryFile::__fieldInitializers_WriteToHistoryFile(
  ) {
    this->FMGL(timerDone) = (::x10aux::class_cast_unchecked< ::x10::util::ArrayList< ::x10::lang::String*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
const ::x10aux::serialization_id_t WriteToHistoryFile::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::WriteToHistoryFile::_deserializer);

void WriteToHistoryFile::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(timerDone));
    
}

::x10::lang::Reference* ::WriteToHistoryFile::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::WriteToHistoryFile* this_ = new (::x10aux::alloc_z< ::WriteToHistoryFile>()) ::WriteToHistoryFile();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void WriteToHistoryFile::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(timerDone) = buf.read< ::x10::util::ArrayList< ::x10::lang::String*>*>();
}

::x10aux::RuntimeType WriteToHistoryFile::rtt;
void WriteToHistoryFile::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("WriteToHistoryFile",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of WriteToHistoryFile */
/*************************************************/
/*************************************************/
/* START of WriteToFile */
#include <WriteToFile.h>

#include <x10/util/ArrayList.h>
#include <x10/lang/String.h>
#include <x10/lang/Double.h>
#include <x10/lang/Boolean.h>
#include <x10/io/File.h>
#include <x10/io/FileWriter.h>
#include <x10/lang/Long.h>
#include <x10/lang/Int.h>
#include <x10/lang/Char.h>
#include <x10/io/Writer.h>
#include <x10/io/OutputStreamWriter.h>
#include <x10/io/Printer.h>
#include <x10/io/Console.h>
#include <x10/lang/Any.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/Synthetic.h>

//#line 273 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"

//#line 274 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
void WriteToFile::_constructor() {
    
    //#line 272 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->WriteToFile::__fieldInitializers_WriteToFile();
    
    //#line 275 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->FMGL(timerDone) = ::x10::util::ArrayList< ::x10::lang::String*>::_make();
}
::WriteToFile* WriteToFile::_make() {
    ::WriteToFile* this_ = new (::x10aux::alloc_z< ::WriteToFile>()) ::WriteToFile();
    this_->_constructor();
    return this_;
}



//#line 277 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
void WriteToFile::writeToFile(::x10::lang::String* timer, x10_double time,
                              x10_boolean flush) {
    
    //#line 278 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    if (!(flush)) {
        
        //#line 280 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        ::x10::lang::String* toWrite = ::x10::lang::String::__plus(::x10::lang::String::__plus(timer, (__extension__ ({ static ::x10::lang::String* strLit__5596 = ::x10aux::makeStringLit(" "); strLit__5596; }))), time);
        
        //#line 281 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        ::x10aux::nullCheck(this->FMGL(timerDone))->add(toWrite);
    } else {
        
        //#line 284 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        try {
            
            //#line 287 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10::lang::String* str;
            
            //#line 288 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10::io::File* fl = ::x10::io::File::_make((__extension__ ({ static ::x10::lang::String* strLit__5601 = ::x10aux::makeStringLit("/home/induk/workspace/testprgms/src/classFiles/profileResults.txt"); strLit__5601; })));
            
            //#line 289 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            if ((::x10aux::nullCheck(fl)->isFile() && ::x10aux::nullCheck(fl)->canRead()))
            {
                
                //#line 291 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                ::x10::io::FileWriter* fw = ::x10::io::FileWriter::_make(fl,
                                                                         true);
                
                //#line 292 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                {
                    x10_long i;
                    for (i = ((x10_long)0ll); ((i) < (::x10aux::nullCheck(this->FMGL(timerDone))->size()));
                         i = ((i) + (((x10_long)1ll)))) {
                        
                        //#line 293 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                        str = ::x10aux::nullCheck(this->FMGL(timerDone))->get(
                                i);
                        
                        //#line 295 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                        {
                            x10_long j;
                            for (j = ((x10_long)0ll); ((j) < (((x10_long)(::x10aux::nullCheck(str)->x10::lang::String::length()))));
                                 j = ((j) + (((x10_long)1ll))))
                            {
                                
                                //#line 296 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                x10_int jInt = ((x10_int) (j));
                                
                                //#line 297 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                x10_char ch = ::x10aux::nullCheck(str)->x10::lang::String::charAt(
                                                jInt);
                                
                                //#line 298 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                ::x10aux::nullCheck(fw)->writeChar(
                                  ch);
                            }
                        }
                        
                        //#line 300 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                        ::x10aux::nullCheck(fw)->writeChar(
                          ((x10_char)'\n'));
                    }
                }
                
                //#line 302 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                ::x10aux::nullCheck(fw)->close();
            } else {
                
                //#line 305 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
                  reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__5603 = ::x10aux::makeStringLit("file not found"); strLit__5603; }))));
            }
            
        }
        catch (::x10::lang::CheckedThrowable* __exc18) {
            if (::x10aux::instanceof< ::x10::lang::Exception*>(__exc18)) {
                ::x10::lang::Exception* ex = static_cast< ::x10::lang::Exception*>(__exc18);
                {
                 
                }
            } else
            throw;
        }
    }
    
}

//#line 272 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
::WriteToFile* WriteToFile::WriteToFile____this__WriteToFile(
  ) {
    return this;
    
}
void WriteToFile::__fieldInitializers_WriteToFile() {
    this->FMGL(timerDone) = (::x10aux::class_cast_unchecked< ::x10::util::ArrayList< ::x10::lang::String*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
const ::x10aux::serialization_id_t WriteToFile::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::WriteToFile::_deserializer);

void WriteToFile::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(timerDone));
    
}

::x10::lang::Reference* ::WriteToFile::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::WriteToFile* this_ = new (::x10aux::alloc_z< ::WriteToFile>()) ::WriteToFile();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void WriteToFile::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(timerDone) = buf.read< ::x10::util::ArrayList< ::x10::lang::String*>*>();
}

::x10aux::RuntimeType WriteToFile::rtt;
void WriteToFile::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("WriteToFile",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of WriteToFile */
/*************************************************/
/*************************************************/
/* START of GuidSched */
#include <GuidSched.h>

#include <x10/lang/Long.h>
#include <chunk.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/compiler/Synthetic.h>

//#line 316 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"

//#line 317 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
void GuidSched::_constructor() {
    
    //#line 315 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->GuidSched::__fieldInitializers_GuidSched();
    
    //#line 318 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->FMGL(curPos) = ((x10_long)-1ll);
}
::GuidSched* GuidSched::_make() {
    ::GuidSched* this_ = new (::x10aux::alloc_z< ::GuidSched>()) ::GuidSched();
    this_->_constructor();
    return this_;
}



//#line 320 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
::chunk* GuidSched::scheduleGuided(x10_long nproc, x10_long t_proc, x10_long n) {
    
    //#line 321 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    ::chunk* myChunk = ::chunk::_make();
    
    //#line 322 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long cSize1 = ((x10_long)10ll);
    
    //#line 323 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long cSize2 = ((x10_long)10ll);
    {
        
        //#line 324 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        ::x10::lang::CheckedThrowable* throwable__5222 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                ::x10::lang::Runtime::enterAtomic();
                {
                    
                    //#line 325 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                    x10_long remain = ((n) - (((this->FMGL(curPos)) + (((x10_long)1ll)))));
                    
                    //#line 326 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                    if (((remain) > (((x10_long)0ll)))) {
                        
                        //#line 328 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                        if (((remain) > (cSize2))) {
                            
                            //#line 330 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            x10_long iters = ((((((remain) + (nproc))) - (((x10_long)1ll)))) / ::x10aux::zeroCheck(nproc));
                            
                            //#line 331 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            ::x10aux::nullCheck(myChunk)->FMGL(myChunkStart) =
                              ((this->FMGL(curPos)) + (((x10_long)1ll)));
                            
                            //#line 332 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            ::x10aux::nullCheck(myChunk)->FMGL(myChunkEnd) =
                              ((this->FMGL(curPos)) + (iters));
                            
                            //#line 333 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            this->FMGL(curPos) = ((this->FMGL(curPos)) + (iters));
                            
                            //#line 334 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            remain = ((n) - (((this->FMGL(curPos)) + (((x10_long)1ll)))));
                        } else {
                            
                            //#line 338 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            ::x10aux::nullCheck(myChunk)->FMGL(myChunkStart) =
                              ((this->FMGL(curPos)) + (((x10_long)1ll)));
                            
                            //#line 339 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            ::x10aux::nullCheck(myChunk)->FMGL(myChunkEnd) =
                              ((this->FMGL(curPos)) + (remain));
                            
                            //#line 340 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            this->FMGL(curPos) = ((this->FMGL(curPos)) + (remain));
                            
                            //#line 341 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            remain = ((x10_long)0ll);
                        }
                        
                    }
                    
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc22) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__5223 = static_cast< ::x10::lang::CheckedThrowable*>(__exc22);
                {
                    throwable__5222 = formal__5223;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__5222))) {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__5222))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__5222));
            }
            
        }
        if (true) {
            ::x10::lang::Runtime::exitAtomic();
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__5222))) {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__5222)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__5222));
            }
            
        }
        
    }
    
    //#line 345 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    return myChunk;
    
}

//#line 315 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
::GuidSched* GuidSched::GuidSched____this__GuidSched() {
    return this;
    
}
void GuidSched::__fieldInitializers_GuidSched() {
    this->FMGL(curPos) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t GuidSched::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::GuidSched::_deserializer);

void GuidSched::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(curPos));
    
}

::x10::lang::Reference* ::GuidSched::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::GuidSched* this_ = new (::x10aux::alloc_z< ::GuidSched>()) ::GuidSched();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void GuidSched::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(curPos) = buf.read<x10_long>();
}

::x10aux::RuntimeType GuidSched::rtt;
void GuidSched::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("GuidSched",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of GuidSched */
/*************************************************/
/*************************************************/
/* START of HistorySched */
#include <HistorySched.h>

#include <x10/lang/Long.h>
#include <x10/lang/Rail.h>
#include <chunk.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Double.h>
#include <x10/lang/Math.h>
#include <x10/lang/Int.h>
#include <x10/io/Printer.h>
#include <x10/io/Console.h>
#include <x10/lang/Any.h>
#include <x10/lang/String.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/compiler/Synthetic.h>

//#line 349 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"

//#line 350 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"

//#line 352 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"

//#line 353 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
void HistorySched::_constructor() {
    
    //#line 348 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->HistorySched::__fieldInitializers_HistorySched();
    
    //#line 354 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->FMGL(curPos) = ((x10_long)-1ll);
    
    //#line 355 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->FMGL(remain) = ((x10_long)0ll);
    
    //#line 356 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->FMGL(Wmin) = ((x10_long)100ll);
}
::HistorySched* HistorySched::_make() {
    ::HistorySched* this_ = new (::x10aux::alloc_z< ::HistorySched>()) ::HistorySched();
    this_->_constructor();
    return this_;
}



//#line 358 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
::chunk* HistorySched::scheduleHistory(x10_long nproc, x10_long t_proc, x10_long n,
                                       ::x10::lang::Rail< x10_long >* costArray) {
    
    //#line 359 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    ::chunk* myChunk = ::chunk::_make();
    
    //#line 360 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long WL = ::x10aux::nullCheck(costArray)->x10::lang::Rail< x10_long >::__apply(
                    n);
    {
        
        //#line 361 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        ::x10::lang::CheckedThrowable* throwable__5225 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                ::x10::lang::Runtime::enterAtomic();
                {
                    
                    //#line 362 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                    x10_long costTillNow = ((x10_long)0ll);
                    
                    //#line 363 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                    x10_long remain = ((n) - (((this->FMGL(curPos)) + (((x10_long)1ll)))));
                    
                    //#line 364 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                    if (((remain) > (((x10_long)0ll)))) {
                        
                        //#line 366 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                        x10_double csize = ::x10::lang::Math::max(
                                             ((x10_double) (this->FMGL(Wmin))),
                                             ((((x10_double) (WL))) / (((1.5) * (((x10_double) (::x10::lang::Runtime::FMGL(NTHREADS__get)())))))));
                        
                        //#line 368 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                        ::x10aux::nullCheck(myChunk)->FMGL(myChunkStart) =
                          ((this->FMGL(curPos)) + (((x10_long)1ll)));
                        
                        //#line 369 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                        x10_long curCostTillNow = ((x10_long)0ll);
                        
                        //#line 370 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                        x10_long i;
                        
                        //#line 371 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                        {
                            for (i = ((this->FMGL(curPos)) + (((x10_long)1ll)));
                                 ((i) < (n)); i = ((i) + (((x10_long)1ll))))
                            {
                                
                                //#line 373 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                curCostTillNow = ((::x10aux::nullCheck(costArray)->x10::lang::Rail< x10_long >::__apply(
                                                     i)) + (costTillNow));
                                
                                //#line 374 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                if (((((x10_double) (curCostTillNow))) <= (csize)))
                                {
                                    
                                    //#line 375 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                    costTillNow = curCostTillNow;
                                } else {
                                    
                                    //#line 378 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                    if (((((csize) - (((x10_double) (costTillNow))))) < (((((x10_double) (curCostTillNow))) - (csize)))))
                                    {
                                        
                                        //#line 380 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                        ::x10aux::nullCheck(myChunk)->FMGL(myChunkEnd) =
                                          ((i) - (((x10_long)1ll)));
                                        
                                        //#line 381 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                        this->FMGL(curPos) =
                                          ((i) - (((x10_long)1ll)));
                                    } else {
                                        
                                        //#line 383 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                        ::x10aux::nullCheck(myChunk)->FMGL(myChunkEnd) =
                                          i;
                                        
                                        //#line 384 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                        this->FMGL(curPos) =
                                          i;
                                    }
                                    
                                    //#line 386 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                                    break;
                                }
                                
                            }
                        }
                        
                        //#line 389 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                        if ((((((x10_double) (curCostTillNow))) <= (csize)) &&
                            (::x10aux::struct_equals(i, n))))
                        {
                            
                            //#line 390 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            ::x10aux::nullCheck(myChunk)->FMGL(myChunkEnd) =
                              ((n) - (((x10_long)1ll)));
                            
                            //#line 391 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            this->FMGL(curPos) = ((n) - (((x10_long)1ll)));
                        }
                        
                        //#line 394 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                        ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
                          reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(t_proc, (__extension__ ({ static ::x10::lang::String* strLit__5621 = ::x10aux::makeStringLit(" "); strLit__5621; }))), WL), (__extension__ ({ static ::x10::lang::String* strLit__5622 = ::x10aux::makeStringLit(" "); strLit__5622; }))), csize), (__extension__ ({ static ::x10::lang::String* strLit__5623 = ::x10aux::makeStringLit(" mychunk  "); strLit__5623; }))), ::x10aux::nullCheck(myChunk)->FMGL(myChunkStart)), (__extension__ ({ static ::x10::lang::String* strLit__5624 = ::x10aux::makeStringLit(" "); strLit__5624; }))), ::x10aux::nullCheck(myChunk)->FMGL(myChunkEnd)), (__extension__ ({ static ::x10::lang::String* strLit__5625 = ::x10aux::makeStringLit(" SunTillNow "); strLit__5625; }))), costTillNow), (__extension__ ({ static ::x10::lang::String* strLit__5626 = ::x10aux::makeStringLit(" curPos "); strLit__5626; }))), this->FMGL(curPos)), (__extension__ ({ static ::x10::lang::String* strLit__5627 = ::x10aux::makeStringLit(" curCostTillNow"); strLit__5627; }))), curCostTillNow)));
                    }
                    
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc26) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__5226 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc26);
                {
                    throwable__5225 = formal__5226;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__5225))) {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__5225))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__5225));
            }
            
        }
        if (true) {
            ::x10::lang::Runtime::exitAtomic();
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__5225))) {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__5225)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__5225));
            }
            
        }
        
    }
    
    //#line 397 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__5628 = ::x10aux::makeStringLit("returning"); strLit__5628; })), t_proc)));
    
    //#line 398 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    return myChunk;
    
}

//#line 348 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
::HistorySched* HistorySched::HistorySched____this__HistorySched(
  ) {
    return this;
    
}
void HistorySched::__fieldInitializers_HistorySched() {
    this->FMGL(curPos) = ((x10_long)0ll);
    this->FMGL(remain) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t HistorySched::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::HistorySched::_deserializer);

void HistorySched::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(curPos));
    buf.write(this->FMGL(remain));
    buf.write(this->FMGL(Wmin));
    
}

::x10::lang::Reference* ::HistorySched::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::HistorySched* this_ = new (::x10aux::alloc_z< ::HistorySched>()) ::HistorySched();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void HistorySched::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(curPos) = buf.read<x10_long>();
    FMGL(remain) = buf.read<x10_long>();
    FMGL(Wmin) = buf.read<x10_long>();
}

::x10aux::RuntimeType HistorySched::rtt;
void HistorySched::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("HistorySched",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of HistorySched */
/*************************************************/
/*************************************************/
/* START of HistProfile */
#include <HistProfile.h>

#include <x10/lang/Long.h>
#include <x10/regionarray/Array.h>
#include <x10/io/Printer.h>
#include <x10/io/Console.h>
#include <x10/lang/Any.h>
#include <x10/lang/String.h>
#include <x10/io/File.h>
#include <x10/lang/Boolean.h>
#include <x10/io/FileReader.h>
#include <x10/regionarray/Region.h>
#include <x10/lang/LongRange.h>
#include <x10/lang/Rail.h>
#include <x10/lang/FailedDynamicCheckException.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/Synthetic.h>

//#line 402 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"

//#line 403 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
void HistProfile::_constructor() {
    
    //#line 401 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->HistProfile::__fieldInitializers_HistProfile();
    
    //#line 404 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    try {
        
        //#line 405 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__5629 = ::x10aux::makeStringLit(" inside read file"); strLit__5629; }))));
        
        //#line 407 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        ::x10::lang::String* str;
        
        //#line 408 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        ::x10::io::File* fl = ::x10::io::File::_make((__extension__ ({ static ::x10::lang::String* strLit__5630 = ::x10aux::makeStringLit("/home/induk/workspace/testprgms/src/classFiles/profileResultsHist.txt"); strLit__5630; })));
        
        //#line 409 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        if ((::x10aux::nullCheck(fl)->isFile() && ::x10aux::nullCheck(fl)->canRead()))
        {
            
            //#line 411 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10::io::FileReader* fr = ::x10::io::FileReader::_make(fl);
            
            //#line 412 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10::lang::String* s = ::x10aux::nullCheck(fr)->readLine();
            
            //#line 413 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            x10_long nloops = ::x10::lang::LongNatives::parseLong(s);
            
            //#line 414 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            s = ::x10aux::nullCheck(fr)->readLine();
            
            //#line 415 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            x10_long nit = ::x10::lang::LongNatives::parseLong(s);
            
            //#line 416 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
              reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__5631 = ::x10aux::makeStringLit(" n"); strLit__5631; })), nit)));
            
            //#line 417 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            this->FMGL(costHistArray) = ::x10::regionarray::Array<x10_long>::_make(::x10::regionarray::Region::make(
                                                                                     ::x10::lang::LongRange::_make(((x10_long)0ll), nloops),
                                                                                     ::x10::lang::LongRange::_make(((x10_long)0ll), nit)));
            
            //#line 418 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
              reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__5632 = ::x10aux::makeStringLit("here"); strLit__5632; }))));
            
            //#line 419 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            x10_long j = ((x10_long)0ll);
            
            //#line 420 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10::lang::Rail< ::x10::lang::String* >* costEachRow =
              ::x10::lang::Rail< ::x10::lang::String* >::_make(((nit) + (((x10_long)1ll))));
            
            //#line 421 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            while ((!::x10aux::struct_equals((s = ::x10aux::nullCheck(fr)->readLine()),
                                             reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
            {
                
                //#line 422 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                costEachRow = ::x10::lang::StringHelper::split((__extension__ ({ static ::x10::lang::String* strLit__5633 = ::x10aux::makeStringLit(","); strLit__5633; })), s);
                
                //#line 423 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
                  reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__5634 = ::x10aux::makeStringLit("i  "); strLit__5634; })), s)));
                
                //#line 424 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                {
                    x10_long i;
                    for (i = ((x10_long)0ll); ((i) < (nit));
                         i = ((i) + (((x10_long)1ll)))) {
                        
                        //#line 425 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                        ::x10::regionarray::Array<x10_long>* t__5211 =
                          this->FMGL(costHistArray);
                        x10_long i__5212 = j;
                        x10_long i__5213 = i;
                        x10_long v__5214 = ::x10::lang::LongNatives::parseLong(::x10aux::nullCheck(costEachRow)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                                                                 i));
                        if (!((::x10aux::struct_equals(::x10aux::nullCheck(t__5211)->FMGL(rank),
                                                       ((x10_long)2ll)))))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::FailedDynamicCheckException::_make((__extension__ ({ static ::x10::lang::String* strLit__5636 = ::x10aux::makeStringLit("!(t$4850.rank == 2L)"); strLit__5636; })))));
                        }
                        ::x10aux::nullCheck(t__5211)->x10::regionarray::Array<x10_long>::__set(
                          i__5212, i__5213, v__5214);
                        
                        //#line 426 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                        ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
                          reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__5637 = ::x10aux::makeStringLit("i  "); strLit__5637; })), ::x10::lang::LongNatives::parseLong(::x10aux::nullCheck(costEachRow)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                                                                                                                                                                                                                                 i)))));
                    }
                }
                
                //#line 428 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                j = ((j) + (((x10_long)1ll)));
            }
            
        } else {
            
            //#line 431 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
              reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__5639 = ::x10aux::makeStringLit("file not found"); strLit__5639; }))));
        }
        
    }
    catch (::x10::lang::CheckedThrowable* __exc29) {
        if (::x10aux::instanceof< ::x10::lang::Exception*>(__exc29)) {
            ::x10::lang::Exception* ex = static_cast< ::x10::lang::Exception*>(__exc29);
            {
             
            }
        } else
        throw;
    }
    
    //#line 435 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__5640 = ::x10aux::makeStringLit("done reading file"); strLit__5640; }))));
    
    //#line 436 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    {
        x10_long i;
        for (i = ((x10_long)0ll); ((i) < (((x10_long)100ll)));
             i = ((i) + (((x10_long)1ll)))) {
            
            //#line 437 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
            ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
              reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__5641 = ::x10aux::makeStringLit(" "); strLit__5641; })), (__extension__ ({
                  ::x10::regionarray::Array<x10_long>* t__4884 =
                    this->FMGL(costHistArray);
                  x10_long i0__4885 = ((x10_long)0ll);
                  x10_long i1__4886 = i;
                  if (!((::x10aux::struct_equals(::x10aux::nullCheck(t__4884)->FMGL(rank),
                                                 ((x10_long)2ll)))))
                  {
                      ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::FailedDynamicCheckException::_make((__extension__ ({ static ::x10::lang::String* strLit__5642 = ::x10aux::makeStringLit("!(t$4884.rank == 2L)"); strLit__5642; })))));
                  }
                  ::x10aux::nullCheck(t__4884)->x10::regionarray::Array<x10_long>::__apply(
                    i0__4885, i1__4886);
              }))
              )));
        }
    }
    
}
::HistProfile* HistProfile::_make() {
    ::HistProfile* this_ = new (::x10aux::alloc_z< ::HistProfile>()) ::HistProfile();
    this_->_constructor();
    return this_;
}



//#line 441 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
::x10::lang::Rail< x10_long >* HistProfile::populateArray(
  x10_long forId, x10_long n, ::x10::lang::Rail< x10_long >* costArray) {
    
    //#line 442 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long totalWl = ((x10_long)0ll);
    
    //#line 443 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__5643 = ::x10aux::makeStringLit("to array populated "); strLit__5643; })), n), (__extension__ ({ static ::x10::lang::String* strLit__5644 = ::x10aux::makeStringLit(" "); strLit__5644; }))), forId)));
    
    //#line 444 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    costArray = ::x10::lang::Rail< x10_long >::_make(((n) + (((x10_long)1ll))));
    
    //#line 445 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    try {
        
        //#line 446 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        {
            x10_long i;
            for (i = ((x10_long)0ll); ((i) < (n)); i = ((i) + (((x10_long)1ll))))
            {
                
                //#line 447 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                ::x10aux::nullCheck(costArray)->x10::lang::Rail< x10_long >::__set(
                  i, (__extension__ ({
                      ::x10::regionarray::Array<x10_long>* t__4974 =
                        this->FMGL(costHistArray);
                      x10_long i0__4975 = ((forId) - (((x10_long)1ll)));
                      x10_long i1__4976 = i;
                      if (!((::x10aux::struct_equals(::x10aux::nullCheck(t__4974)->FMGL(rank),
                                                     ((x10_long)2ll)))))
                      {
                          ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::FailedDynamicCheckException::_make((__extension__ ({ static ::x10::lang::String* strLit__5645 = ::x10aux::makeStringLit("!(t$4974.rank == 2L)"); strLit__5645; })))));
                      }
                      ::x10aux::nullCheck(t__4974)->x10::regionarray::Array<x10_long>::__apply(
                        i0__4975, i1__4976);
                  }))
                  );
                
                //#line 448 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                totalWl = ((totalWl) + (::x10aux::nullCheck(costArray)->x10::lang::Rail< x10_long >::__apply(
                                          i)));
            }
        }
        
    }
    catch (::x10::lang::CheckedThrowable* __exc31) {
        if (::x10aux::instanceof< ::x10::lang::Exception*>(__exc31)) {
            ::x10::lang::Exception* ex = static_cast< ::x10::lang::Exception*>(__exc31);
            {
             
            }
        } else
        throw;
    }
    
    //#line 451 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    ::x10aux::nullCheck(costArray)->x10::lang::Rail< x10_long >::__set(
      n, totalWl);
    
    //#line 452 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__5647 = ::x10aux::makeStringLit("array populated"); strLit__5647; }))));
    
    //#line 453 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    return costArray;
    
}

//#line 401 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
::HistProfile* HistProfile::HistProfile____this__HistProfile(
  ) {
    return this;
    
}
void HistProfile::__fieldInitializers_HistProfile() {
    this->FMGL(costHistArray) = (::x10aux::class_cast_unchecked< ::x10::regionarray::Array<x10_long>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
const ::x10aux::serialization_id_t HistProfile::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::HistProfile::_deserializer);

void HistProfile::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(costHistArray));
    
}

::x10::lang::Reference* ::HistProfile::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::HistProfile* this_ = new (::x10aux::alloc_z< ::HistProfile>()) ::HistProfile();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void HistProfile::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(costHistArray) = buf.read< ::x10::regionarray::Array<x10_long>*>();
}

::x10aux::RuntimeType HistProfile::rtt;
void HistProfile::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("HistProfile",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of HistProfile */
/*************************************************/
/*************************************************/
/* START of DynSched */
#include <DynSched.h>

#include <x10/lang/Long.h>
#include <chunk.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/compiler/Synthetic.h>

//#line 457 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"

//#line 458 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
void DynSched::_constructor() {
    
    //#line 456 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->DynSched::__fieldInitializers_DynSched();
    
    //#line 459 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    this->FMGL(curPos) = ((x10_long)-1ll);
}
::DynSched* DynSched::_make() {
    ::DynSched* this_ = new (::x10aux::alloc_z< ::DynSched>()) ::DynSched();
    this_->_constructor();
    return this_;
}



//#line 461 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
::chunk* DynSched::scheduleDynamic(x10_long nproc, x10_long t_proc, x10_long n) {
    
    //#line 462 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    ::chunk* myChunk = ::chunk::_make();
    
    //#line 463 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long cSize1 = ((x10_long)1ll);
    
    //#line 464 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    x10_long cSize2 = ((x10_long)1ll);
    {
        
        //#line 465 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
        ::x10::lang::CheckedThrowable* throwable__5228 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                ::x10::lang::Runtime::enterAtomic();
                {
                    
                    //#line 466 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                    x10_long remain = ((n) - (((this->FMGL(curPos)) + (((x10_long)1ll)))));
                    
                    //#line 467 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                    if (((remain) > (((x10_long)0ll)))) {
                        
                        //#line 469 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                        if (((remain) > (cSize2))) {
                            
                            //#line 471 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            x10_long iters = cSize2;
                            
                            //#line 472 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            ::x10aux::nullCheck(myChunk)->FMGL(myChunkStart) =
                              ((this->FMGL(curPos)) + (((x10_long)1ll)));
                            
                            //#line 473 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            ::x10aux::nullCheck(myChunk)->FMGL(myChunkEnd) =
                              ((this->FMGL(curPos)) + (iters));
                            
                            //#line 474 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            this->FMGL(curPos) = ((this->FMGL(curPos)) + (iters));
                            
                            //#line 475 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            remain = ((n) - (((this->FMGL(curPos)) + (((x10_long)1ll)))));
                        } else {
                            
                            //#line 479 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            ::x10aux::nullCheck(myChunk)->FMGL(myChunkStart) =
                              ((this->FMGL(curPos)) + (((x10_long)1ll)));
                            
                            //#line 480 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            ::x10aux::nullCheck(myChunk)->FMGL(myChunkEnd) =
                              ((this->FMGL(curPos)) + (remain));
                            
                            //#line 481 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            this->FMGL(curPos) = ((this->FMGL(curPos)) + (remain));
                            
                            //#line 482 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
                            remain = ((x10_long)0ll);
                        }
                        
                    }
                    
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc35) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__5229 = static_cast< ::x10::lang::CheckedThrowable*>(__exc35);
                {
                    throwable__5228 = formal__5229;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__5228))) {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__5228))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__5228));
            }
            
        }
        if (true) {
            ::x10::lang::Runtime::exitAtomic();
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__5228))) {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__5228)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__5228));
            }
            
        }
        
    }
    
    //#line 487 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
    return myChunk;
    
}

//#line 456 "/home/induk/workspace/testprgms/src/unchunked/KAlternate.x10"
::DynSched* DynSched::DynSched____this__DynSched() {
    return this;
    
}
void DynSched::__fieldInitializers_DynSched() {
    this->FMGL(curPos) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t DynSched::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::DynSched::_deserializer);

void DynSched::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(curPos));
    
}

::x10::lang::Reference* ::DynSched::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::DynSched* this_ = new (::x10aux::alloc_z< ::DynSched>()) ::DynSched();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void DynSched::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(curPos) = buf.read<x10_long>();
}

::x10aux::RuntimeType DynSched::rtt;
void DynSched::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("DynSched",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of DynSched */
/*************************************************/
