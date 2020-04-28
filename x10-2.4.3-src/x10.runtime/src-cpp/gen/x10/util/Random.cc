/*************************************************/
/* START of Random */
#include <x10/util/Random.h>

#include <x10/lang/Long.h>
#include <x10/lang/Int.h>
#include <x10/lang/Rail.h>
#include <x10/util/Timer.h>
#include <x10/lang/Unsafe.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Byte.h>
#include <x10/lang/Float.h>
#include <x10/lang/Double.h>
#include <x10/compiler/NonEscaping.h>
#include <x10/compiler/Synthetic.h>

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
x10_long x10::util::Random::FMGL(N);
void x10::util::Random::FMGL(N__do_init)() {
    FMGL(N__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Random.N");
    x10_long __var2887__ = ((x10_long)624ll);
    FMGL(N) = __var2887__;
    FMGL(N__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Random::FMGL(N__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(N__status), &FMGL(N__do_init), &FMGL(N__exception), "x10::util::Random.N");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Random::FMGL(N__status);
::x10::lang::CheckedThrowable* x10::util::Random::FMGL(N__exception);

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
x10_long x10::util::Random::FMGL(M);
void x10::util::Random::FMGL(M__do_init)() {
    FMGL(M__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::Random.M");
    x10_long __var2888__ = ((x10_long)397ll);
    FMGL(M) = __var2888__;
    FMGL(M__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::Random::FMGL(M__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(M__status), &FMGL(M__do_init), &FMGL(M__exception), "x10::util::Random.M");
    
}
volatile ::x10aux::StaticInitController::status x10::util::Random::FMGL(M__status);
::x10::lang::CheckedThrowable* x10::util::Random::FMGL(M__exception);

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
void x10::util::Random::_constructor() {
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    (this)->::x10::util::Random::_constructor(::x10::lang::RuntimeNatives::nanoTime());
    
}
::x10::util::Random* x10::util::Random::_make() {
    ::x10::util::Random* this_ = new (::x10aux::alloc_z< ::x10::util::Random>()) ::x10::util::Random();
    this_->_constructor();
    return this_;
}



//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
void x10::util::Random::_constructor(x10_long seed) {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    ::x10::util::Random* this__121844 = this;
    ::x10aux::nullCheck(this__121844)->FMGL(index) = ((x10_long)0ll);
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    this->FMGL(mt) = ::x10::lang::Rail< x10_int >::_makeUnsafe(((x10_long)624ll), false);
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    this->x10::util::Random::init(seed);
}
::x10::util::Random* x10::util::Random::_make(x10_long seed) {
    ::x10::util::Random* this_ = new (::x10aux::alloc_z< ::x10::util::Random>()) ::x10::util::Random();
    this_->_constructor(seed);
    return this_;
}



//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
void x10::util::Random::setSeed(x10_long seed) {
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    this->x10::util::Random::init(seed);
}

//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
x10_int x10::util::Random::nextInt() {
    return this->random();
    
}

//#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
x10_int x10::util::Random::nextInt(x10_int maxPlus1) {
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    if (((maxPlus1) <= (((x10_int)0)))) {
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        return ((x10_int)0);
        
    }
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    x10_int n = maxPlus1;
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    if ((::x10aux::struct_equals(((n) & ((-(n)))), n))) {
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        return ((this->nextInt()) & (((n) - (((x10_int)1)))));
        
    }
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    x10_int mask = ((x10_int)1);
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    while ((!::x10aux::struct_equals(((n) & ((~(mask)))), ((x10_int)0))))
    {
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        mask = ((mask) << (0x1f & (x10_int)(((x10_long)(((x10_int)1))))));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        mask = ((mask) | (((x10_int)1)));
    }
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    x10_int x;
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    do {
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        x = ((this->nextInt()) & (mask));
    } while (((x) >= (n)));
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    return x;
    
}

//#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
void x10::util::Random::nextBytes(::x10::lang::Rail< x10_byte >* buf) {
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    x10_int i = ((x10_int)0);
    
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    while (true) {
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        x10_int x = this->nextInt();
        
        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        {
            x10_int j;
            for (j = ((x10_int)0); ((j) < (((x10_int)4))); j = ((j) + (((x10_int)1))))
            {
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                if (((((x10_long)(i))) >= ((x10_long)(::x10aux::nullCheck(buf)->FMGL(size)))))
                {
                    
                    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                    return;
                }
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                ::x10aux::nullCheck(buf)->x10::lang::Rail< x10_byte >::__set(
                  ((x10_long)(i)), ((x10_byte) (((((x10_long)(x))) & (((x10_long)255ll))))));
                
                //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                i = ((i) + (((x10_int)1)));
                
                //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                x = ((x) >> (0x1f & (x10_int)(((x10_long)(((x10_int)8))))));
            }
        }
        
    }
    
}

//#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
x10_long x10::util::Random::nextLong() {
    return ((((((x10_long)(this->nextInt()))) << (0x3f & (x10_int)(((x10_long)(((x10_int)32))))))) | (((((x10_long)(this->nextInt()))) & (((x10_long)4294967295ll)))));
    
}

//#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
x10_long x10::util::Random::nextLong(x10_long maxPlus1) {
    
    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    if (((maxPlus1) <= (((x10_long)(((x10_int)0)))))) {
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        return ((x10_long)0ll);
        
    }
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    x10_long n = maxPlus1;
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    if ((::x10aux::struct_equals(((n) & ((-(n)))), n))) {
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        return ((this->nextLong()) & (((n) - (((x10_long)1ll)))));
        
    }
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    x10_long mask = ((x10_long)1ll);
    
    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    while ((!::x10aux::struct_equals(((n) & ((~(mask)))),
                                     ((x10_long)0ll)))) {
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        mask = ((mask) << (0x3f & (x10_int)(((x10_long)(((x10_int)1))))));
        
        //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        mask = ((mask) | (((x10_long)1ll)));
    }
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    x10_long x;
    
    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    do {
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        x = ((this->nextLong()) & (mask));
    } while (((x) >= (n)));
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    return x;
    
}

//#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
x10_boolean x10::util::Random::nextBoolean() {
    return ((this->nextInt()) < (((x10_int)0)));
    
}

//#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
x10_float x10::util::Random::nextFloat() {
    return ((((x10_float) (((x10_int) ((x10_uint) (this->nextInt()) >> (0x1f & (x10_int)(((x10_long)(((x10_int)8)))))))))) / (((x10_float) (((((x10_long)1ll)) << (0x3f & (x10_int)(((x10_long)(((x10_int)24))))))))));
    
}

//#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
x10_double x10::util::Random::nextDouble() {
    return ((((x10_double) (((x10_long) ((x10_ulong) (this->nextLong()) >> (0x3f & (x10_int)(((x10_long)(((x10_int)11)))))))))) / (((x10_double) (((((x10_long)1ll)) << (0x3f & (x10_int)(((x10_long)(((x10_int)53))))))))));
    
}

//#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
void x10::util::Random::init(x10_long seed) {
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    this->FMGL(mt)->x10::lang::Rail< x10_int >::__set(((x10_long)0ll),
                                                      (::x10aux::struct_equals(seed,
                                                                               ((x10_long)0ll)))
                                                        ? (((x10_int)4357))
                                                        : (((x10_int) (seed))));
    
    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    {
        x10_long i__121845;
        for (i__121845 = ((x10_long)1ll); ((i__121845) <= (((x10_long)623ll)));
             i__121845 = ((i__121845) + (((x10_long)1ll))))
        {
            x10_long i__121846 = i__121845;
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            this->FMGL(mt)->x10::lang::Rail< x10_int >::__set(
              i__121846, ((((((x10_int)69069)) * (this->FMGL(mt)->x10::lang::Rail< x10_int >::__apply(
                                                    ((i__121846) - (((x10_long)1ll))))))) + (((x10_int)1))));
        }
    }
    
    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    this->FMGL(index) = ((x10_long)0ll);
    
    //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    this->twist();
}

//#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
x10_int x10::util::Random::random() {
    
    //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    if ((::x10aux::struct_equals(this->FMGL(index), ((x10_long)624ll))))
    {
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        this->FMGL(index) = ((x10_long)0ll);
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        this->twist();
    }
    
    //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    x10_int y = this->FMGL(mt)->x10::lang::Rail< x10_int >::__apply(
                  ((this->FMGL(index) = ((this->FMGL(index)) + (((x10_long)1ll)))) - (((x10_long)1ll))));
    
    //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    y = ((y) ^ (((x10_int) ((x10_uint) (y) >> (0x1f & (x10_int)(((x10_long)(((x10_int)11)))))))));
    
    //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    y = ((y) ^ (((((y) << (0x1f & (x10_int)(((x10_long)(((x10_int)7))))))) & (((x10_int)-1658038656)))));
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    y = ((y) ^ (((((y) << (0x1f & (x10_int)(((x10_long)(((x10_int)15))))))) & (((x10_int)-272236544)))));
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    y = ((y) ^ (((x10_int) ((x10_uint) (y) >> (0x1f & (x10_int)(((x10_long)(((x10_int)18)))))))));
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    return y;
    
}

//#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
void x10::util::Random::twist() {
    
    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    x10_long i = ((x10_long)0ll);
    
    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    x10_int s;
    
    //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    {
        for (; ((i) < (((x10_long)227ll))); i = ((i) + (((x10_long)1ll))))
        {
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            s = ((((this->FMGL(mt)->x10::lang::Rail< x10_int >::__apply(
                      i)) & (((x10_int)0x80000000u)))) | (((this->FMGL(mt)->x10::lang::Rail< x10_int >::__apply(
                                                              ((i) + (((x10_long)1ll))))) & (((x10_int)2147483647)))));
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            this->FMGL(mt)->x10::lang::Rail< x10_int >::__set(
              i, ((((this->FMGL(mt)->x10::lang::Rail< x10_int >::__apply(
                       ((i) + (((x10_long)397ll))))) ^ (((x10_int) ((x10_uint) (s) >> (0x1f & (x10_int)(((x10_long)(((x10_int)1)))))))))) ^ (((((s) & (((x10_int)1)))) * (((x10_int)-1727483681))))));
        }
    }
    
    //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    {
        for (; ((i) < (((x10_long)623ll))); i = ((i) + (((x10_long)1ll))))
        {
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            s = ((((this->FMGL(mt)->x10::lang::Rail< x10_int >::__apply(
                      i)) & (((x10_int)0x80000000u)))) | (((this->FMGL(mt)->x10::lang::Rail< x10_int >::__apply(
                                                              ((i) + (((x10_long)1ll))))) & (((x10_int)2147483647)))));
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            this->FMGL(mt)->x10::lang::Rail< x10_int >::__set(
              i, ((((this->FMGL(mt)->x10::lang::Rail< x10_int >::__apply(
                       ((i) - (((x10_long)227ll))))) ^ (((x10_int) ((x10_uint) (s) >> (0x1f & (x10_int)(((x10_long)(((x10_int)1)))))))))) ^ (((((s) & (((x10_int)1)))) * (((x10_int)-1727483681))))));
        }
    }
    
    //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    s = ((((this->FMGL(mt)->x10::lang::Rail< x10_int >::__apply(
              ((x10_long)623ll))) & (((x10_int)0x80000000u)))) | (((this->FMGL(mt)->x10::lang::Rail< x10_int >::__apply(
                                                                      ((x10_long)0ll))) & (((x10_int)2147483647)))));
    
    //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    this->FMGL(mt)->x10::lang::Rail< x10_int >::__set(((x10_long)623ll),
                                                      ((((this->FMGL(mt)->x10::lang::Rail< x10_int >::__apply(
                                                            ((x10_long)396ll))) ^ (((x10_int) ((x10_uint) (s) >> (0x1f & (x10_int)(((x10_long)(((x10_int)1)))))))))) ^ (((((s) & (((x10_int)1)))) * (((x10_int)-1727483681))))));
}

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
::x10::util::Random* x10::util::Random::x10__util__Random____this__x10__util__Random(
  ) {
    return this;
    
}
void x10::util::Random::__fieldInitializers_x10_util_Random(
  ) {
    this->FMGL(index) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t x10::util::Random::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::Random::_deserializer);

void x10::util::Random::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(index));
    buf.write(this->FMGL(mt));
    
}

::x10::lang::Reference* ::x10::util::Random::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::Random* this_ = new (::x10aux::alloc_z< ::x10::util::Random>()) ::x10::util::Random();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::Random::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(index) = buf.read<x10_long>();
    FMGL(mt) = buf.read< ::x10::lang::Rail< x10_int >*>();
}

::x10aux::RuntimeType x10::util::Random::rtt;
void x10::util::Random::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.util.Random",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of Random */
/*************************************************/
