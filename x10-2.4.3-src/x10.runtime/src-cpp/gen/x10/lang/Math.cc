/*************************************************/
/* START of Math */
#include <x10/lang/Math.h>

#include <x10/lang/Double.h>
#include <x10/lang/Int.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Native.h>
#include <x10/lang/Long.h>
#include <x10/lang/Float.h>
#include <x10/lang/Complex.h>
#include <x10/lang/UInt.h>
#include <x10/lang/ULong.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeCPPInclude.h>

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_double x10::lang::Math::FMGL(E);
void x10::lang::Math::FMGL(E__do_init)() {
    FMGL(E__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Math.E");
    x10_double __var1221__ = 2.718281828459045;
    FMGL(E) = __var1221__;
    FMGL(E__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Math::FMGL(E__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(E__status), &FMGL(E__do_init), &FMGL(E__exception), "x10::lang::Math.E");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Math::FMGL(E__status);
::x10::lang::CheckedThrowable* x10::lang::Math::FMGL(E__exception);

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_double x10::lang::Math::FMGL(PI);
void x10::lang::Math::FMGL(PI__do_init)() {
    FMGL(PI__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Math.PI");
    x10_double __var1222__ = 3.141592653589793;
    FMGL(PI) = __var1222__;
    FMGL(PI__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Math::FMGL(PI__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(PI__status), &FMGL(PI__do_init), &FMGL(PI__exception), "x10::lang::Math.PI");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Math::FMGL(PI__status);
::x10::lang::CheckedThrowable* x10::lang::Math::FMGL(PI__exception);

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_int x10::lang::Math::abs(x10_int a){
    return ((x10_int)::labs(a));
}

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_long x10::lang::Math::abs(x10_long a){
    return ((x10_long)::llabs(a));
}

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_float x10::lang::Math::abs(x10_float a){
    return ::fabsf(a);
}

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_double x10::lang::Math::abs(x10_double a){
    return ::fabs(a);
}

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_complex x10::lang::Math::pow(x10_complex a, x10_complex b){
    return ::x10::lang::MathNatives::pow(a, b);
}

//#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_complex x10::lang::Math::exp(x10_complex a){
    return ::x10::lang::MathNatives::exp(a);
}

//#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_complex x10::lang::Math::cos(x10_complex z){
    return ::x10::lang::MathNatives::cos(z);
}

//#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_complex x10::lang::Math::sin(x10_complex z){
    return ::x10::lang::MathNatives::sin(z);
}

//#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_complex x10::lang::Math::tan(x10_complex z){
    return ::x10::lang::MathNatives::tan(z);
}

//#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_complex x10::lang::Math::acos(x10_complex z) {
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    if (((::x10aux::struct_equals((z).imag(), 0.0)) && ((::fabs((z).real())) <= (1.0))))
    {
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return x10_complex(::x10::lang::MathNatives::acos((z).real()),0.0);
        
    } else {
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return ::x10::lang::ComplexNatives::_plus(((3.141592653589793) / (2.0)), ::x10::lang::ComplexNatives::_times(x10_complex(0.0,1.0), ::x10::lang::MathNatives::log(::x10::lang::ComplexNatives::_plus(::x10::lang::ComplexNatives::_times(x10_complex(0.0,1.0), z), ::x10::lang::Math::sqrt(
                                                                                                                                                                                                                                                                            ::x10::lang::ComplexNatives::_minus(1.0, ::x10::lang::ComplexNatives::_times(z, z)))))));
        
    }
    
}

//#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_complex x10::lang::Math::asin(x10_complex z) {
    
    //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    if (((::x10aux::struct_equals((z).imag(), 0.0)) && ((::fabs((z).real())) <= (1.0))))
    {
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return x10_complex(::x10::lang::MathNatives::asin((z).real()),0.0);
        
    } else {
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return ::x10::lang::ComplexNatives::_times(-(x10_complex(0.0,1.0)), ::x10::lang::MathNatives::log(::x10::lang::ComplexNatives::_plus(::x10::lang::ComplexNatives::_times(x10_complex(0.0,1.0), z), ::x10::lang::Math::sqrt(
                                                                                                                                                                                                             ::x10::lang::ComplexNatives::_minus(1.0, ::x10::lang::ComplexNatives::_times(z, z))))));
        
    }
    
}

//#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_complex x10::lang::Math::atan(x10_complex z) {
    
    //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    if ((::x10aux::struct_equals((z).imag(), 0.0))) {
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return x10_complex(::x10::lang::MathNatives::atan((z).real()),0.0);
        
    } else 
    //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    if ((::x10aux::struct_equals(z, x10_complex(0.0,1.0))))
    {
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return x10_complex(0.0,::x10::lang::DoubleNatives::fromLongBits(0x7ff0000000000000LL));
        
    } else 
    //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    if ((::x10aux::struct_equals(z, -(x10_complex(0.0,1.0)))))
    {
        
        //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return x10_complex(0.0,::x10::lang::DoubleNatives::fromLongBits(0xfff0000000000000LL));
        
    } else {
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return ::x10::lang::ComplexNatives::_times(::x10::lang::ComplexNatives::_divide(x10_complex(0.0,1.0), 2.0), ::x10::lang::ComplexNatives::_minus(::x10::lang::MathNatives::log(::x10::lang::ComplexNatives::_minus(1.0, ::x10::lang::ComplexNatives::_times(x10_complex(0.0,1.0), z))), ::x10::lang::MathNatives::log(::x10::lang::ComplexNatives::_plus(1.0, ::x10::lang::ComplexNatives::_times(x10_complex(0.0,1.0), z)))));
        
    }
    
}

//#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_complex x10::lang::Math::cosh(x10_complex z){
    return ::x10::lang::MathNatives::cosh(z);
}

//#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_complex x10::lang::Math::sinh(x10_complex z){
    return ::x10::lang::MathNatives::sinh(z);
}

//#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_complex x10::lang::Math::tanh(x10_complex z){
    return ::x10::lang::MathNatives::tanh(z);
}

//#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_complex x10::lang::Math::sqrt(x10_complex z) {
    
    //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    if (::x10::lang::ComplexNatives::isNaN(z)) {
        
        //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return x10_complex(::x10::lang::DoubleNatives::fromLongBits(0x7ff8000000000000LL),x10::lang::DoubleNatives::fromLongBits(0x7ff8000000000000LL));
        
    } else 
    //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    if ((::x10aux::struct_equals(z, x10_complex(0.0,0.0))))
    {
        
        //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return x10_complex(0.0,0.0);
        
    } else {
        
        //#line 303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        x10_double t = ::x10::lang::MathNatives::sqrt(((((::fabs((z).real())) + (std::abs(z)))) / (2.0)));
        
        //#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if ((((z).real()) >= (0.0))) {
            
            //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return x10_complex(t,(((z).imag()) / (((2.0) * (t)))));
            
        } else {
            
            //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return x10_complex(((::fabs((z).imag())) / (((2.0) * (t)))),::x10::lang::MathNatives::copysign(t,(z).imag()));
            
        }
        
    }
    
}

//#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 330 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 334 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_complex x10::lang::Math::log(x10_complex a){
    return ::x10::lang::MathNatives::log(a);
}

//#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 367 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_int x10::lang::Math::max(x10_int a, x10_int b) {
    
    //#line 368 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    return ((a) < (b)) ? (b) : (a);
    
}

//#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_int x10::lang::Math::min(x10_int a, x10_int b) {
    
    //#line 370 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    return ((a) < (b)) ? (a) : (b);
    
}

//#line 371 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_uint x10::lang::Math::max(x10_uint a, x10_uint b) {
    return ((a) < (b)) ? (b) : (a);
    
}

//#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_uint x10::lang::Math::min(x10_uint a, x10_uint b) {
    return ((a) < (b)) ? (a) : (b);
    
}

//#line 373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_long x10::lang::Math::max(x10_long a, x10_long b) {
    
    //#line 374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    return ((a) < (b)) ? (b) : (a);
    
}

//#line 375 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_long x10::lang::Math::min(x10_long a, x10_long b) {
    
    //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    return ((a) < (b)) ? (a) : (b);
    
}

//#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_ulong x10::lang::Math::max(x10_ulong a, x10_ulong b) {
    return ((a) < (b)) ? (b) : (a);
    
}

//#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_ulong x10::lang::Math::min(x10_ulong a, x10_ulong b) {
    return ((a) < (b)) ? (a) : (b);
    
}

//#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_float x10::lang::Math::max(x10_float a, x10_float b) {
    
    //#line 380 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    return ((a) < (b)) ? (b) : (a);
    
}

//#line 381 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_float x10::lang::Math::min(x10_float a, x10_float b) {
    
    //#line 382 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    return ((a) < (b)) ? (a) : (b);
    
}

//#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_double x10::lang::Math::max(x10_double a, x10_double b) {
    
    //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    return ((a) < (b)) ? (b) : (a);
    
}

//#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_double x10::lang::Math::min(x10_double a, x10_double b) {
    
    //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    return ((a) < (b)) ? (a) : (b);
    
}

//#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_int x10::lang::Math::signum(x10_int a) {
    return (::x10aux::struct_equals(a, ((x10_int)0))) ? (((x10_int)0))
      : (((a) > (((x10_int)0))) ? (((x10_int)1)) : (((x10_int)-1)));
    
}

//#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_long x10::lang::Math::signum(x10_long a) {
    return (::x10aux::struct_equals(a, ((x10_long)0ll))) ? (((x10_long)0ll))
      : (((a) > (((x10_long)0ll))) ? (((x10_long)1ll)) : (((x10_long)-1ll)));
    
}

//#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_float x10::lang::Math::signum(x10_float a) {
    
    //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    return (::x10aux::struct_equals(a, 0.0f)) ? (0.0f) : (((a) > (0.0f))
                                                            ? (1.0f)
                                                            : (-1.0f));
    
}

//#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_double x10::lang::Math::signum(x10_double a) {
    
    //#line 393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    return (::x10aux::struct_equals(a, 0.0)) ? (0.0) : (((a) > (0.0))
                                                          ? (1.0)
                                                          : (-1.0));
    
}

//#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"

//#line 402 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_int x10::lang::Math::nextPowerOf2(x10_int p) {
    
    //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    if ((::x10aux::struct_equals(p, ((x10_int)0)))) {
        return ((x10_int)0);
        
    }
    
    //#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    x10_int pow2 = ((x10_int)1);
    
    //#line 405 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    while (((pow2) < (p))) {
        
        //#line 406 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        pow2 = ((pow2) << (0x1f & (x10_int)(((x10_long)(((x10_int)1))))));
    }
    
    //#line 407 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    return pow2;
    
}

//#line 410 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_long x10::lang::Math::nextPowerOf2(x10_long p) {
    
    //#line 411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    if ((::x10aux::struct_equals(p, ((x10_long)0ll)))) {
        return ((x10_long)0ll);
        
    }
    
    //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    x10_long pow2 = ((x10_long)1ll);
    
    //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    while (((pow2) < (p))) {
        
        //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        pow2 = ((pow2) << (0x3f & (x10_int)(((x10_long)(((x10_int)1))))));
    }
    
    //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    return pow2;
    
}

//#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_boolean x10::lang::Math::powerOf2(x10_int p) {
    return (::x10aux::struct_equals(((p) & ((-(p)))), p));
    
}

//#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_boolean x10::lang::Math::powerOf2(x10_long p) {
    return (::x10aux::struct_equals(((p) & ((-(p)))), p));
    
}

//#line 421 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_int x10::lang::Math::_kwd__log2(x10_int p) {
    
    //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert(::x10::lang::Math::powerOf2(
                                p));
    #endif//NO_ASSERTIONS
    
    //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    x10_int i = ((x10_int)0);
    
    //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    while (((p) > (((x10_int)1)))) {
        p = ((p) / ::x10aux::zeroCheck(((x10_int)2)));
        i = ((i) + (((x10_int)1)));
    }
    
    //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    return i;
    
}

//#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_long x10::lang::Math::_kwd__log2(x10_long p) {
    
    //#line 429 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert(::x10::lang::Math::powerOf2(
                                p));
    #endif//NO_ASSERTIONS
    
    //#line 430 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    x10_long i = ((x10_long)0ll);
    
    //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    while (((p) > (((x10_long)1ll)))) {
        p = ((p) / ::x10aux::zeroCheck(((x10_long)2ll)));
        i = ((i) + (((x10_long)1ll)));
    }
    
    //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    return i;
    
}

//#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_int x10::lang::Math::pow2(x10_int i) {
    
    //#line 437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    return ((((x10_int)1)) << (0x1f & (x10_int)(((x10_long)(i)))));
    
}

//#line 441 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
x10_long x10::lang::Math::pow2(x10_long i) {
    
    //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    return ((((x10_long)1ll)) << (0x3f & (x10_int)(((x10_long)(((x10_int) (i)))))));
    
}

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
::x10::lang::Math* x10::lang::Math::x10__lang__Math____this__x10__lang__Math(
  ) {
    return this;
    
}

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
void x10::lang::Math::_constructor() {
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    ::x10::lang::Math* this__103114 = this;
    
}
::x10::lang::Math* x10::lang::Math::_make() {
    ::x10::lang::Math* this_ = new (::x10aux::alloc_z< ::x10::lang::Math>()) ::x10::lang::Math();
    this_->_constructor();
    return this_;
}



//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
void x10::lang::Math::__fieldInitializers_x10_lang_Math() {
 
}
const ::x10aux::serialization_id_t x10::lang::Math::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Math::_deserializer);

void x10::lang::Math::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::lang::Math::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Math* this_ = new (::x10aux::alloc_z< ::x10::lang::Math>()) ::x10::lang::Math();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::Math::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::lang::Math::rtt;
void x10::lang::Math::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.Math",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of Math */
/*************************************************/
