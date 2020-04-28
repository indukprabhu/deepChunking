/*************************************************/
/* START of BlockingUtils */
#include <x10/array/BlockingUtils.h>

#include <x10/array/IterationSpace.h>
#include <x10/lang/Long.h>
#include <x10/array/DenseIterationSpace_1.h>
#include <x10/lang/Boolean.h>
#include <x10/array/DenseIterationSpace_2.h>
#include <x10/lang/Math.h>
#include <x10/lang/Double.h>
#include <x10/compiler/Synthetic.h>

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
::x10::array::DenseIterationSpace_1* x10::array::BlockingUtils::partitionBlock(
  ::x10::array::IterationSpace* is, x10_long n, x10_long i) {
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    return ::x10::array::BlockingUtils::partitionBlock(::x10aux::nullCheck(is)->min(
                                                         ((x10_long)0ll)),
                                                       ::x10aux::nullCheck(is)->max(
                                                         ((x10_long)0ll)),
                                                       n,
                                                       i);
    
}

//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
::x10::array::DenseIterationSpace_1* x10::array::BlockingUtils::partitionBlock(
  x10_long min, x10_long max, x10_long n, x10_long i) {
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long numElems = ((((max) - (min))) + (((x10_long)1ll)));
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    if (((numElems) < (((x10_long)1ll)))) {
        return ::x10::array::DenseIterationSpace_1::FMGL(EMPTY__get)();
        
    }
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long blockSize = ((numElems) / ::x10aux::zeroCheck(n));
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long leftOver = ((numElems) - (((n) * (blockSize))));
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long low = ((((min) + (((blockSize) * (i))))) + (((i) < (leftOver))
      ? (i) : (leftOver)));
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long hi = ((((low) + (blockSize))) + (((i) < (leftOver))
      ? (((x10_long)0ll)) : (((x10_long)-1ll))));
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    ::x10::array::DenseIterationSpace_1* alloc__74318 =  (new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_1>()) ::x10::array::DenseIterationSpace_1());
    (alloc__74318)->::x10::array::DenseIterationSpace_1::_constructor(
      low, hi);
    return alloc__74318;
    
}

//#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
x10_long x10::array::BlockingUtils::mapIndexToBlockPartition(
  ::x10::array::IterationSpace* is, x10_long n, x10_long i) {
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long min = ::x10aux::nullCheck(is)->min(((x10_long)0ll));
    
    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long max = ::x10aux::nullCheck(is)->max(((x10_long)0ll));
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    return ::x10::array::BlockingUtils::mapIndexToBlockPartition(
             ::x10aux::nullCheck(is)->min(((x10_long)0ll)),
             ::x10aux::nullCheck(is)->max(((x10_long)0ll)),
             n, i);
    
}

//#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
x10_long x10::array::BlockingUtils::mapIndexToBlockPartition(
  x10_long min, x10_long max, x10_long n, x10_long i) {
    
    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    if ((((i) < (min)) || ((i) > (max)))) {
        return ((x10_long)-1ll);
        
    }
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long numElems = ((((max) - (min))) + (((x10_long)1ll)));
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long blockSize = ((numElems) / ::x10aux::zeroCheck(n));
    
    //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long leftOver = ((numElems) - (((n) * (blockSize))));
    
    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long normalizedIndex = ((i) - (min));
    
    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long nominalIndex = ((normalizedIndex) / ::x10aux::zeroCheck(((blockSize) + (((x10_long)1ll)))));
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    if (((nominalIndex) < (leftOver))) {
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        return nominalIndex;
        
    } else {
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        x10_long indexFromTop = ((max) - (i));
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        return ((((n) - (((x10_long)1ll)))) - (((indexFromTop) / ::x10aux::zeroCheck(blockSize))));
        
    }
    
}

//#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
::x10::array::DenseIterationSpace_2* x10::array::BlockingUtils::partitionBlockBlock(
  ::x10::array::IterationSpace* is, x10_long n, x10_long i) {
    
    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long min0 = ::x10aux::nullCheck(is)->min(((x10_long)0ll));
    
    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long max0 = ::x10aux::nullCheck(is)->max(((x10_long)0ll));
    
    //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long min1 = ::x10aux::nullCheck(is)->min(((x10_long)1ll));
    
    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long max1 = ::x10aux::nullCheck(is)->max(((x10_long)1ll));
    
    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long size0 = ((((max0) - (min0))) + (((x10_long)1ll)));
    
    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long size1 = ((((max1) - (min1))) + (((x10_long)1ll)));
    
    //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    if ((((size0) < (((x10_long)1ll))) || ((size1) < (((x10_long)1ll)))))
    {
        return ::x10::array::DenseIterationSpace_2::FMGL(EMPTY__get)();
        
    }
    
    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    if ((::x10aux::struct_equals(size0, ((x10_long)1ll))))
    {
        
        //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        ::x10::array::DenseIterationSpace_1* is1 = ::x10::array::BlockingUtils::partitionBlock(
                                                     min1,
                                                     max1,
                                                     n, i);
        
        //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        ::x10::array::DenseIterationSpace_2* alloc__74319 =
           (new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_2>()) ::x10::array::DenseIterationSpace_2());
        (alloc__74319)->::x10::array::DenseIterationSpace_2::_constructor(
          min0, is1->x10::array::DenseIterationSpace_1::min(
                  ((x10_long)0ll)), max0, is1->x10::array::DenseIterationSpace_1::max(
                                            ((x10_long)0ll)));
        return alloc__74319;
        
    }
    
    //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    if ((::x10aux::struct_equals(size1, ((x10_long)1ll))))
    {
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        ::x10::array::DenseIterationSpace_1* is0 = ::x10::array::BlockingUtils::partitionBlock(
                                                     min0,
                                                     max0,
                                                     n, i);
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        ::x10::array::DenseIterationSpace_2* alloc__74320 =
           (new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_2>()) ::x10::array::DenseIterationSpace_2());
        (alloc__74320)->::x10::array::DenseIterationSpace_2::_constructor(
          is0->x10::array::DenseIterationSpace_1::min(((x10_long)0ll)),
          min1, is0->x10::array::DenseIterationSpace_1::max(
                  ((x10_long)0ll)), max1);
        return alloc__74320;
        
    }
    
    //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long size0Even = (::x10aux::struct_equals(((size0) % ::x10aux::zeroCheck(((x10_long)2ll))),
                                                  ((x10_long)0ll)))
      ? (size0) : (((size0) - (((x10_long)1ll))));
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long P = (__extension__ ({
        
        //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        x10_long a__74303 = n;
        x10_long b__74304 = ((size0Even) * (size1));
        ((a__74303) < (b__74304)) ? (a__74303) : (b__74304);
    }))
    ;
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    if (((i) >= (P))) {
        return ::x10::array::DenseIterationSpace_2::FMGL(EMPTY__get)();
        
    }
    
    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long divisions0 = (__extension__ ({
        
        //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        x10_long a__74305 = size0Even;
        x10_long b__74306 = ::x10::lang::Math::pow2(::x10::lang::DoubleNatives::toLong(::x10::lang::MathNatives::ceil(((((::x10::lang::MathNatives::log(((x10_double) (P)))) / (::x10::lang::MathNatives::log(2.0)))) / (2.0)))));
        ((a__74305) < (b__74306)) ? (a__74305) : (b__74306);
    }))
    ;
    
    //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long divisions1 = (__extension__ ({
        
        //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        x10_long a__74307 = size1;
        x10_long b__74308 = ::x10::lang::DoubleNatives::toLong(::x10::lang::MathNatives::ceil(((((x10_double) (P))) / (((x10_double) (divisions0))))));
        ((a__74307) < (b__74308)) ? (a__74307) : (b__74308);
    }))
    ;
    
    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long leftOver = ((((divisions0) * (divisions1))) - (P));
    
    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long leftOverOddOffset = (::x10aux::struct_equals(((divisions0) % ::x10aux::zeroCheck(((x10_long)2ll))),
                                                          ((x10_long)0ll)))
      ? (((x10_long)0ll)) : (((((i) * (((x10_long)2ll)))) / ::x10aux::zeroCheck(((divisions0) + (((x10_long)1ll))))));
    
    //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long blockIndex0 = ((i) < (leftOver)) ? (((((((i) * (((x10_long)2ll)))) - (leftOverOddOffset))) % ::x10aux::zeroCheck(divisions0)))
      : (((((i) + (leftOver))) % ::x10aux::zeroCheck(divisions0)));
    
    //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long blockIndex1 = ((i) < (leftOver)) ? (((((i) * (((x10_long)2ll)))) / ::x10aux::zeroCheck(divisions0)))
      : (((((i) + (leftOver))) / ::x10aux::zeroCheck(divisions0)));
    
    //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long low0 = ((min0) + (::x10::lang::DoubleNatives::toLong(::x10::lang::MathNatives::ceil(((((x10_double) (((blockIndex0) * (size0))))) / (((x10_double) (divisions0))))))));
    
    //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long blockHi0 = ((blockIndex0) + (((i) < (leftOver))
      ? (((x10_long)2ll)) : (((x10_long)1ll))));
    
    //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long hi0 = ((((min0) + (::x10::lang::DoubleNatives::toLong(::x10::lang::MathNatives::ceil(((((x10_double) (((blockHi0) * (size0))))) / (((x10_double) (divisions0))))))))) - (((x10_long)1ll)));
    
    //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long low1 = ((min1) + (::x10::lang::DoubleNatives::toLong(::x10::lang::MathNatives::ceil(((((x10_double) (((blockIndex1) * (size1))))) / (((x10_double) (divisions1))))))));
    
    //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long hi1 = ((((min1) + (::x10::lang::DoubleNatives::toLong(::x10::lang::MathNatives::ceil(((((x10_double) (((((blockIndex1) + (((x10_long)1ll)))) * (size1))))) / (((x10_double) (divisions1))))))))) - (((x10_long)1ll)));
    
    //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    ::x10::array::DenseIterationSpace_2* alloc__74321 =  (new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_2>()) ::x10::array::DenseIterationSpace_2());
    (alloc__74321)->::x10::array::DenseIterationSpace_2::_constructor(
      low0, low1, hi0, hi1);
    return alloc__74321;
    
}

//#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
x10_long x10::array::BlockingUtils::mapIndexToBlockBlockPartition(
  ::x10::array::IterationSpace* is, x10_long n, x10_long i,
  x10_long j) {
    
    //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long min0 = ::x10aux::nullCheck(is)->min(((x10_long)0ll));
    
    //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long max0 = ::x10aux::nullCheck(is)->max(((x10_long)0ll));
    
    //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long min1 = ::x10aux::nullCheck(is)->min(((x10_long)1ll));
    
    //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long max1 = ::x10aux::nullCheck(is)->max(((x10_long)1ll));
    
    //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    if ((((((i) < (min0)) || ((i) > (max0))) || ((j) < (min1))) ||
        ((j) > (max1)))) {
        return ((x10_long)-1ll);
        
    }
    
    //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long size0 = ((((max0) - (min0))) + (((x10_long)1ll)));
    
    //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long size1 = ((((max1) - (min1))) + (((x10_long)1ll)));
    
    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    if ((::x10aux::struct_equals(size0, ((x10_long)1ll))))
    {
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        return ::x10::array::BlockingUtils::mapIndexToBlockPartition(
                 min1, max1, n, j);
        
    }
    
    //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    if ((::x10aux::struct_equals(size1, ((x10_long)1ll))))
    {
        
        //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        return ::x10::array::BlockingUtils::mapIndexToBlockPartition(
                 min0, max0, n, i);
        
    }
    
    //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long size0Even = (::x10aux::struct_equals(((size0) % ::x10aux::zeroCheck(((x10_long)2ll))),
                                                  ((x10_long)0ll)))
      ? (size0) : (((size0) - (((x10_long)1ll))));
    
    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long P = (__extension__ ({
        
        //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        x10_long a__74309 = n;
        x10_long b__74310 = ((size0Even) * (size1));
        ((a__74309) < (b__74310)) ? (a__74309) : (b__74310);
    }))
    ;
    
    //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long divisions0 = (__extension__ ({
        
        //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        x10_long a__74311 = size0Even;
        x10_long b__74312 = ::x10::lang::Math::pow2(::x10::lang::DoubleNatives::toLong(::x10::lang::MathNatives::ceil(((((::x10::lang::MathNatives::log(((x10_double) (P)))) / (::x10::lang::MathNatives::log(2.0)))) / (2.0)))));
        ((a__74311) < (b__74312)) ? (a__74311) : (b__74312);
    }))
    ;
    
    //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long divisions1 = (__extension__ ({
        
        //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        x10_long a__74313 = size1;
        x10_long b__74314 = ::x10::lang::DoubleNatives::toLong(::x10::lang::MathNatives::ceil(((((x10_double) (P))) / (((x10_double) (divisions0))))));
        ((a__74313) < (b__74314)) ? (a__74313) : (b__74314);
    }))
    ;
    
    //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long numBlocks = ((divisions0) * (divisions1));
    
    //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long leftOver = ((numBlocks) - (P));
    
    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long blockIndex0 = (::x10aux::struct_equals(divisions0,
                                                    ((x10_long)1ll)))
      ? (((x10_long)0ll)) : (((((((i) - (min0))) * (divisions0))) / ::x10aux::zeroCheck(size0)));
    
    //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long blockIndex1 = (::x10aux::struct_equals(divisions1,
                                                    ((x10_long)1ll)))
      ? (((x10_long)0ll)) : (((((((j) - (min1))) * (divisions1))) / ::x10aux::zeroCheck(size1)));
    
    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    x10_long blockIndex = ((((blockIndex1) * (divisions0))) + (blockIndex0));
    
    //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    if (((blockIndex) <= (((leftOver) * (((x10_long)2ll))))))
    {
        
        //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        return ((blockIndex) / ::x10aux::zeroCheck(((x10_long)2ll)));
        
    } else {
        
        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        return ((blockIndex) - (leftOver));
        
    }
    
}

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
::x10::array::BlockingUtils* x10::array::BlockingUtils::x10__array__BlockingUtils____this__x10__array__BlockingUtils(
  ) {
    return this;
    
}
void x10::array::BlockingUtils::_constructor() {
    ::x10::array::BlockingUtils* this__74322 = this;
    
}
::x10::array::BlockingUtils* x10::array::BlockingUtils::_make(
  ) {
    ::x10::array::BlockingUtils* this_ = new (::x10aux::alloc_z< ::x10::array::BlockingUtils>()) ::x10::array::BlockingUtils();
    this_->_constructor();
    return this_;
}


void x10::array::BlockingUtils::__fieldInitializers_x10_array_BlockingUtils(
  ) {
 
}
const ::x10aux::serialization_id_t x10::array::BlockingUtils::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::array::BlockingUtils::_deserializer);

void x10::array::BlockingUtils::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::array::BlockingUtils::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::array::BlockingUtils* this_ = new (::x10aux::alloc_z< ::x10::array::BlockingUtils>()) ::x10::array::BlockingUtils();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::array::BlockingUtils::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::array::BlockingUtils::rtt;
void x10::array::BlockingUtils::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.array.BlockingUtils",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of BlockingUtils */
/*************************************************/
