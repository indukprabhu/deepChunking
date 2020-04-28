package x10.array;

@x10.runtime.impl.java.X10Generated
public class BlockingUtils extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<BlockingUtils> $RTT = 
        x10.rtt.NamedType.<BlockingUtils> make("x10.array.BlockingUtils",
                                               BlockingUtils.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.BlockingUtils $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.BlockingUtils $_obj = new x10.array.BlockingUtils((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public BlockingUtils(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    public static x10.array.DenseIterationSpace_1 partitionBlock(final x10.array.IterationSpace is, final long n, final long i) {
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$74979 = is.min$O((long)(0L));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$74980 = is.max$O((long)(0L));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final x10.array.DenseIterationSpace_1 t$74981 = ((x10.array.DenseIterationSpace_1)(x10.array.BlockingUtils.partitionBlock((long)(t$74979), (long)(t$74980), (long)(n), (long)(i))));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        return t$74981;
    }
    
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    public static x10.array.DenseIterationSpace_1 partitionBlock(final long min, final long max, final long n, final long i) {
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$74982 = ((max) - (((long)(min))));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long numElems = ((t$74982) + (((long)(1L))));
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$74984 = ((numElems) < (((long)(1L))));
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$74984) {
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final x10.array.DenseIterationSpace_1 t$74983 = ((x10.array.DenseIterationSpace_1)(x10.array.DenseIterationSpace_1.get$EMPTY()));
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            return t$74983;
        }
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long blockSize = ((numElems) / (((long)(n))));
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$74985 = ((n) * (((long)(blockSize))));
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long leftOver = ((numElems) - (((long)(t$74985))));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$74986 = ((blockSize) * (((long)(i))));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$74989 = ((min) + (((long)(t$74986))));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$74987 = ((i) < (((long)(leftOver))));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        long t$74988 =  0;
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$74987) {
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$74988 = i;
        } else {
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$74988 = leftOver;
        }
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$74990 = t$74988;
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long low = ((t$74989) + (((long)(t$74990))));
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$74993 = ((low) + (((long)(blockSize))));
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$74991 = ((i) < (((long)(leftOver))));
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        long t$74992 =  0;
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$74991) {
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$74992 = 0L;
        } else {
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$74992 = -1L;
        }
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$74994 = t$74992;
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long hi = ((t$74993) + (((long)(t$74994))));
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final x10.array.DenseIterationSpace_1 alloc$74264 = ((x10.array.DenseIterationSpace_1)(new x10.array.DenseIterationSpace_1((java.lang.System[]) null)));
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        alloc$74264.x10$array$DenseIterationSpace_1$$init$S(((long)(low)), ((long)(hi)));
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        return alloc$74264;
    }
    
    
    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    public static long mapIndexToBlockPartition$O(final x10.array.IterationSpace is, final long n, final long i) {
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long min = is.min$O((long)(0L));
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long max = is.max$O((long)(0L));
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$74995 = is.min$O((long)(0L));
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$74996 = is.max$O((long)(0L));
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$74997 = x10.array.BlockingUtils.mapIndexToBlockPartition$O((long)(t$74995), (long)(t$74996), (long)(n), (long)(i));
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        return t$74997;
    }
    
    
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    public static long mapIndexToBlockPartition$O(final long min, final long max, final long n, final long i) {
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        boolean t$74998 = ((i) < (((long)(min))));
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (!(t$74998)) {
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$74998 = ((i) > (((long)(max))));
        }
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$74999 = t$74998;
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$74999) {
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            return -1L;
        }
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75000 = ((max) - (((long)(min))));
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long numElems = ((t$75000) + (((long)(1L))));
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long blockSize = ((numElems) / (((long)(n))));
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75001 = ((n) * (((long)(blockSize))));
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long leftOver = ((numElems) - (((long)(t$75001))));
        
        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long normalizedIndex = ((i) - (((long)(min))));
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75002 = ((blockSize) + (((long)(1L))));
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long nominalIndex = ((normalizedIndex) / (((long)(t$75002))));
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$75006 = ((nominalIndex) < (((long)(leftOver))));
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$75006) {
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            return nominalIndex;
        } else {
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long indexFromTop = ((max) - (((long)(i))));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75003 = ((n) - (((long)(1L))));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75004 = ((indexFromTop) / (((long)(blockSize))));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75005 = ((t$75003) - (((long)(t$75004))));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            return t$75005;
        }
    }
    
    
    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    public static x10.array.DenseIterationSpace_2 partitionBlockBlock(final x10.array.IterationSpace is, final long n, final long i) {
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long min0 = is.min$O((long)(0L));
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long max0 = is.max$O((long)(0L));
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long min1 = is.min$O((long)(1L));
        
        //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long max1 = is.max$O((long)(1L));
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75007 = ((max0) - (((long)(min0))));
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long size0 = ((t$75007) + (((long)(1L))));
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75008 = ((max1) - (((long)(min1))));
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long size1 = ((t$75008) + (((long)(1L))));
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        boolean t$75009 = ((size0) < (((long)(1L))));
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (!(t$75009)) {
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75009 = ((size1) < (((long)(1L))));
        }
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$75011 = t$75009;
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$75011) {
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final x10.array.DenseIterationSpace_2 t$75010 = ((x10.array.DenseIterationSpace_2)(x10.array.DenseIterationSpace_2.get$EMPTY()));
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            return t$75010;
        }
        
        //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$75014 = ((long) size0) == ((long) 1L);
        
        //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$75014) {
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final x10.array.DenseIterationSpace_1 is1 = ((x10.array.DenseIterationSpace_1)(x10.array.BlockingUtils.partitionBlock((long)(min1), (long)(max1), (long)(n), (long)(i))));
            
            //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final x10.array.DenseIterationSpace_2 alloc$74265 = ((x10.array.DenseIterationSpace_2)(new x10.array.DenseIterationSpace_2((java.lang.System[]) null)));
            
            //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75122 = is1.min$O((long)(0L));
            
            //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75123 = is1.max$O((long)(0L));
            
            //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            alloc$74265.x10$array$DenseIterationSpace_2$$init$S(((long)(min0)), t$75122, ((long)(max0)), t$75123);
            
            //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            return alloc$74265;
        }
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$75017 = ((long) size1) == ((long) 1L);
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$75017) {
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final x10.array.DenseIterationSpace_1 is0 = ((x10.array.DenseIterationSpace_1)(x10.array.BlockingUtils.partitionBlock((long)(min0), (long)(max0), (long)(n), (long)(i))));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final x10.array.DenseIterationSpace_2 alloc$74266 = ((x10.array.DenseIterationSpace_2)(new x10.array.DenseIterationSpace_2((java.lang.System[]) null)));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75124 = is0.min$O((long)(0L));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75125 = is0.max$O((long)(0L));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            alloc$74266.x10$array$DenseIterationSpace_2$$init$S(t$75124, ((long)(min1)), t$75125, ((long)(max1)));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            return alloc$74266;
        }
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75018 = ((size0) % (((long)(2L))));
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$75019 = ((long) t$75018) == ((long) 0L);
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        long t$75020 =  0;
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$75019) {
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75020 = size0;
        } else {
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75020 = ((size0) - (((long)(1L))));
        }
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long size0Even = t$75020;
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75021 = ((size0Even) * (((long)(size1))));
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long P = java.lang.Math.min(((long)(n)),((long)(t$75021)));
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$75023 = ((i) >= (((long)(P))));
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$75023) {
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final x10.array.DenseIterationSpace_2 t$75022 = ((x10.array.DenseIterationSpace_2)(x10.array.DenseIterationSpace_2.get$EMPTY()));
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            return t$75022;
        }
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75024 = ((double)(long)(((long)(P))));
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75025 = java.lang.Math.log(((double)(t$75024)));
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75026 = java.lang.Math.log(((double)(2.0)));
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75027 = ((t$75025) / (((double)(t$75026))));
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75028 = ((t$75027) / (((double)(2.0))));
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75029 = java.lang.Math.ceil(((double)(t$75028)));
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75030 = ((long)(double)(((double)(t$75029))));
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75031 = x10.lang.Math.pow2$O((long)(t$75030));
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long divisions0 = java.lang.Math.min(((long)(size0Even)),((long)(t$75031)));
        
        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75032 = ((double)(long)(((long)(P))));
        
        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75033 = ((double)(long)(((long)(divisions0))));
        
        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75034 = ((t$75032) / (((double)(t$75033))));
        
        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75035 = java.lang.Math.ceil(((double)(t$75034)));
        
        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75036 = ((long)(double)(((double)(t$75035))));
        
        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long divisions1 = java.lang.Math.min(((long)(size1)),((long)(t$75036)));
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75037 = ((divisions0) * (((long)(divisions1))));
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long leftOver = ((t$75037) - (((long)(P))));
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75038 = ((divisions0) % (((long)(2L))));
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$75041 = ((long) t$75038) == ((long) 0L);
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        long t$75042 =  0;
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$75041) {
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75042 = 0L;
        } else {
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75039 = ((i) * (((long)(2L))));
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75040 = ((divisions0) + (((long)(1L))));
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75042 = ((t$75039) / (((long)(t$75040))));
        }
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long leftOverOddOffset = t$75042;
        
        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$75046 = ((i) < (((long)(leftOver))));
        
        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        long t$75047 =  0;
        
        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$75046) {
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75043 = ((i) * (((long)(2L))));
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75044 = ((t$75043) - (((long)(leftOverOddOffset))));
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75047 = ((t$75044) % (((long)(divisions0))));
        } else {
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75045 = ((i) + (((long)(leftOver))));
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75047 = ((t$75045) % (((long)(divisions0))));
        }
        
        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long blockIndex0 = t$75047;
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$75050 = ((i) < (((long)(leftOver))));
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        long t$75051 =  0;
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$75050) {
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75048 = ((i) * (((long)(2L))));
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75051 = ((t$75048) / (((long)(divisions0))));
        } else {
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75049 = ((i) + (((long)(leftOver))));
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75051 = ((t$75049) / (((long)(divisions0))));
        }
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long blockIndex1 = t$75051;
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75052 = ((blockIndex0) * (((long)(size0))));
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75053 = ((double)(long)(((long)(t$75052))));
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75054 = ((double)(long)(((long)(divisions0))));
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75055 = ((t$75053) / (((double)(t$75054))));
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75056 = java.lang.Math.ceil(((double)(t$75055)));
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75057 = ((long)(double)(((double)(t$75056))));
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long low0 = ((min0) + (((long)(t$75057))));
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$75058 = ((i) < (((long)(leftOver))));
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        long t$75059 =  0;
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$75058) {
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75059 = 2L;
        } else {
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75059 = 1L;
        }
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75060 = t$75059;
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long blockHi0 = ((blockIndex0) + (((long)(t$75060))));
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75061 = ((blockHi0) * (((long)(size0))));
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75062 = ((double)(long)(((long)(t$75061))));
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75063 = ((double)(long)(((long)(divisions0))));
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75064 = ((t$75062) / (((double)(t$75063))));
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75065 = java.lang.Math.ceil(((double)(t$75064)));
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75066 = ((long)(double)(((double)(t$75065))));
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75067 = ((min0) + (((long)(t$75066))));
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long hi0 = ((t$75067) - (((long)(1L))));
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75068 = ((blockIndex1) * (((long)(size1))));
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75069 = ((double)(long)(((long)(t$75068))));
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75070 = ((double)(long)(((long)(divisions1))));
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75071 = ((t$75069) / (((double)(t$75070))));
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75072 = java.lang.Math.ceil(((double)(t$75071)));
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75073 = ((long)(double)(((double)(t$75072))));
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long low1 = ((min1) + (((long)(t$75073))));
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75074 = ((blockIndex1) + (((long)(1L))));
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75075 = ((t$75074) * (((long)(size1))));
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75076 = ((double)(long)(((long)(t$75075))));
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75077 = ((double)(long)(((long)(divisions1))));
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75078 = ((t$75076) / (((double)(t$75077))));
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75079 = java.lang.Math.ceil(((double)(t$75078)));
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75080 = ((long)(double)(((double)(t$75079))));
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75081 = ((min1) + (((long)(t$75080))));
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long hi1 = ((t$75081) - (((long)(1L))));
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final x10.array.DenseIterationSpace_2 alloc$74267 = ((x10.array.DenseIterationSpace_2)(new x10.array.DenseIterationSpace_2((java.lang.System[]) null)));
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        alloc$74267.x10$array$DenseIterationSpace_2$$init$S(((long)(low0)), ((long)(low1)), ((long)(hi0)), ((long)(hi1)));
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        return alloc$74267;
    }
    
    
    //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    public static long mapIndexToBlockBlockPartition$O(final x10.array.IterationSpace is, final long n, final long i, final long j) {
        
        //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long min0 = is.min$O((long)(0L));
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long max0 = is.max$O((long)(0L));
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long min1 = is.min$O((long)(1L));
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long max1 = is.max$O((long)(1L));
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        boolean t$75082 = ((i) < (((long)(min0))));
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (!(t$75082)) {
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75082 = ((i) > (((long)(max0))));
        }
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        boolean t$75083 = t$75082;
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (!(t$75083)) {
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75083 = ((j) < (((long)(min1))));
        }
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        boolean t$75084 = t$75083;
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (!(t$75084)) {
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75084 = ((j) > (((long)(max1))));
        }
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$75085 = t$75084;
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$75085) {
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            return -1L;
        }
        
        //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75086 = ((max0) - (((long)(min0))));
        
        //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long size0 = ((t$75086) + (((long)(1L))));
        
        //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75087 = ((max1) - (((long)(min1))));
        
        //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long size1 = ((t$75087) + (((long)(1L))));
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$75089 = ((long) size0) == ((long) 1L);
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$75089) {
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75088 = x10.array.BlockingUtils.mapIndexToBlockPartition$O((long)(min1), (long)(max1), (long)(n), (long)(j));
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            return t$75088;
        }
        
        //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$75091 = ((long) size1) == ((long) 1L);
        
        //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$75091) {
            
            //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75090 = x10.array.BlockingUtils.mapIndexToBlockPartition$O((long)(min0), (long)(max0), (long)(n), (long)(i));
            
            //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            return t$75090;
        }
        
        //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75092 = ((size0) % (((long)(2L))));
        
        //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$75093 = ((long) t$75092) == ((long) 0L);
        
        //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        long t$75094 =  0;
        
        //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$75093) {
            
            //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75094 = size0;
        } else {
            
            //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75094 = ((size0) - (((long)(1L))));
        }
        
        //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long size0Even = t$75094;
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75095 = ((size0Even) * (((long)(size1))));
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long P = java.lang.Math.min(((long)(n)),((long)(t$75095)));
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75096 = ((double)(long)(((long)(P))));
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75097 = java.lang.Math.log(((double)(t$75096)));
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75098 = java.lang.Math.log(((double)(2.0)));
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75099 = ((t$75097) / (((double)(t$75098))));
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75100 = ((t$75099) / (((double)(2.0))));
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75101 = java.lang.Math.ceil(((double)(t$75100)));
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75102 = ((long)(double)(((double)(t$75101))));
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75103 = x10.lang.Math.pow2$O((long)(t$75102));
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long divisions0 = java.lang.Math.min(((long)(size0Even)),((long)(t$75103)));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75104 = ((double)(long)(((long)(P))));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75105 = ((double)(long)(((long)(divisions0))));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75106 = ((t$75104) / (((double)(t$75105))));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final double t$75107 = java.lang.Math.ceil(((double)(t$75106)));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75108 = ((long)(double)(((double)(t$75107))));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long divisions1 = java.lang.Math.min(((long)(size1)),((long)(t$75108)));
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long numBlocks = ((divisions0) * (((long)(divisions1))));
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long leftOver = ((numBlocks) - (((long)(P))));
        
        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$75111 = ((long) divisions0) == ((long) 1L);
        
        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        long t$75112 =  0;
        
        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$75111) {
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75112 = 0L;
        } else {
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75109 = ((i) - (((long)(min0))));
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75110 = ((t$75109) * (((long)(divisions0))));
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75112 = ((t$75110) / (((long)(size0))));
        }
        
        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long blockIndex0 = t$75112;
        
        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$75115 = ((long) divisions1) == ((long) 1L);
        
        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        long t$75116 =  0;
        
        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$75115) {
            
            //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75116 = 0L;
        } else {
            
            //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75113 = ((j) - (((long)(min1))));
            
            //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75114 = ((t$75113) * (((long)(divisions1))));
            
            //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            t$75116 = ((t$75114) / (((long)(size1))));
        }
        
        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long blockIndex1 = t$75116;
        
        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75117 = ((blockIndex1) * (((long)(divisions0))));
        
        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long blockIndex = ((t$75117) + (((long)(blockIndex0))));
        
        //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final long t$75118 = ((leftOver) * (((long)(2L))));
        
        //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        final boolean t$75121 = ((blockIndex) <= (((long)(t$75118))));
        
        //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        if (t$75121) {
            
            //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75119 = ((blockIndex) / (((long)(2L))));
            
            //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            return t$75119;
        } else {
            
            //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final long t$75120 = ((blockIndex) - (((long)(leftOver))));
            
            //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            return t$75120;
        }
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    final public x10.array.BlockingUtils x10$array$BlockingUtils$$this$x10$array$BlockingUtils() {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
        return x10.array.BlockingUtils.this;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    // creation method for java code (1-phase java constructor)
    public BlockingUtils() {
        this((java.lang.System[]) null);
        x10$array$BlockingUtils$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.array.BlockingUtils x10$array$BlockingUtils$$init$S() {
         {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
            final x10.array.BlockingUtils this$74976 = this;
        }
        return this;
    }
    
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/BlockingUtils.x10"
    final public void __fieldInitializers_x10_array_BlockingUtils() {
        
    }
}

