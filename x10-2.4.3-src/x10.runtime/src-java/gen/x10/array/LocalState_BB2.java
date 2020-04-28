package x10.array;

@x10.runtime.impl.java.X10Generated
public class LocalState_BB2<$S> extends x10.array.LocalState<$S> implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<LocalState_BB2> $RTT = 
        x10.rtt.NamedType.<LocalState_BB2> make("x10.array.LocalState_BB2",
                                                LocalState_BB2.class,
                                                1,
                                                new x10.rtt.Type[] {
                                                    x10.rtt.ParameterizedType.make(x10.array.LocalState.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                                });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $S; return null; }
    
    public static <$S> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.LocalState_BB2<$S> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.LocalState.$_deserialize_body($_obj, $deserializer);
        $_obj.$S = (x10.rtt.Type) $deserializer.readObject();
        $_obj.globalIndices = $deserializer.readObject();
        $_obj.localIndices = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.LocalState_BB2 $_obj = new x10.array.LocalState_BB2((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.$S);
        $serializer.write(this.globalIndices);
        $serializer.write(this.localIndices);
        
    }
    
    // constructor just for allocation
    public LocalState_BB2(final java.lang.System[] $dummy, final x10.rtt.Type $S) {
        super($dummy, $S);
        x10.array.LocalState_BB2.$initParams(this, $S);
        
    }
    
    private x10.rtt.Type $S;
    
    // initializer of type parameters
    public static void $initParams(final LocalState_BB2 $this, final x10.rtt.Type $S) {
        $this.$S = $S;
        
    }
    // synthetic type for parameter mangling
    public static final class __1$1x10$array$LocalState_BB2$$S$2 {}
    

    
    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    public x10.array.DenseIterationSpace_2 globalIndices;
    
    //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    public x10.array.DenseIterationSpace_2 localIndices;
    
    
    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    // creation method for java code (1-phase java constructor)
    public LocalState_BB2(final x10.rtt.Type $S, final x10.lang.PlaceGroup pg, final x10.core.Rail<$S> data, final long size, final x10.array.DenseIterationSpace_2 gs, final x10.array.DenseIterationSpace_2 ls, __1$1x10$array$LocalState_BB2$$S$2 $dummy) {
        this((java.lang.System[]) null, $S);
        x10$array$LocalState_BB2$$init$S(pg, data, size, gs, ls, (x10.array.LocalState_BB2.__1$1x10$array$LocalState_BB2$$S$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.LocalState_BB2<$S> x10$array$LocalState_BB2$$init$S(final x10.lang.PlaceGroup pg, final x10.core.Rail<$S> data, final long size, final x10.array.DenseIterationSpace_2 gs, final x10.array.DenseIterationSpace_2 ls, __1$1x10$array$LocalState_BB2$$S$2 $dummy) {
         {
            
            //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.array.LocalState this$76722 = ((x10.array.LocalState)(this));
            
            //#line 291 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.lang.PlaceGroup pg$76719 = ((x10.lang.PlaceGroup)(pg));
            
            //#line 291 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.core.Rail rail$76720 = ((x10.core.Rail)(data));
            
            //#line 291 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final long size$76721 = size;
            
            //#line 292 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ((x10.array.LocalState<$S>)this$76722).pg = ((x10.lang.PlaceGroup)(pg$76719));
            
            //#line 292 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ((x10.array.LocalState<$S>)this$76722).rail = ((x10.core.Rail)(rail$76720));
            
            //#line 292 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ((x10.array.LocalState<$S>)this$76722).size = size$76721;
            {
                
            }
            
            //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            
            
            //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.array.LocalState_BB2 this$76889 = this;
            
            //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            ((x10.array.LocalState_BB2<$S>)this).globalIndices = ((x10.array.DenseIterationSpace_2)(gs));
            
            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            ((x10.array.LocalState_BB2<$S>)this).localIndices = ((x10.array.DenseIterationSpace_2)(ls));
        }
        return this;
    }
    
    
    
    //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    public static <$S>x10.array.LocalState_BB2 make__3$1x10$lang$Long$3x10$lang$Long$3x10$array$LocalState_BB2$$S$2(final x10.rtt.Type $S, final x10.lang.PlaceGroup pg, final long m, final long n, final x10.core.fun.Fun_0_2<x10.core.Long,x10.core.Long,$S> init) {
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.array.DenseIterationSpace_2 globalSpace = ((x10.array.DenseIterationSpace_2)(new x10.array.DenseIterationSpace_2((java.lang.System[]) null)));
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76911 = ((m) - (((long)(1L))));
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76912 = ((n) - (((long)(1L))));
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        globalSpace.x10$array$DenseIterationSpace_2$$init$S(((long)(0L)), ((long)(0L)), t$76911, t$76912);
        
        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76832 = pg.numPlaces$O();
        
        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76833 = pg.indexOf$O(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))));
        
        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.array.DenseIterationSpace_2 localSpace = ((x10.array.DenseIterationSpace_2)(x10.array.BlockingUtils.partitionBlockBlock(((x10.array.IterationSpace)(globalSpace)), (long)(t$76832), (long)(t$76833))));
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.core.Rail data;
        
        //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final boolean t$76852 = localSpace.isEmpty$O();
        
        //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        if (t$76852) {
            
            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.core.Rail t$76834 = ((x10.core.Rail)(new x10.core.Rail<$S>($S)));
            
            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            data = ((x10.core.Rail)(t$76834));
        } else {
            
            //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long low1 = localSpace.min$O((long)(0L));
            
            //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long hi1 = localSpace.max$O((long)(0L));
            
            //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long low2 = localSpace.min$O((long)(1L));
            
            //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long hi2 = localSpace.max$O((long)(1L));
            
            //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long t$76835 = ((hi1) - (((long)(low1))));
            
            //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long localSize1 = ((t$76835) + (((long)(1L))));
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long t$76836 = ((hi2) - (((long)(low2))));
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long localSize2 = ((t$76836) + (((long)(1L))));
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long dataSize = ((localSize1) * (((long)(localSize2))));
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.core.Rail t$76837 = ((x10.core.Rail)(x10.core.Rail.<$S>makeUnsafe($S, ((long)(dataSize)), false)));
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            data = ((x10.core.Rail)(t$76837));
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long i$76657min$76909 = low1;
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long i$76657max$76910 = hi1;
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            long i$76906 = i$76657min$76909;
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            for (;
                 true;
                 ) {
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                final long t$76907 = i$76906;
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                final boolean t$76908 = ((t$76907) <= (((long)(i$76657max$76910))));
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                if (!(t$76908)) {
                    
                    //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                    break;
                }
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                final long i$76903 = i$76906;
                
                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                final long i$76639min$76901 = low2;
                
                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                final long i$76639max$76902 = hi2;
                
                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                long i$76898 = i$76639min$76901;
                
                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                    final long t$76899 = i$76898;
                    
                    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                    final boolean t$76900 = ((t$76899) <= (((long)(i$76639max$76902))));
                    
                    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                    if (!(t$76900)) {
                        
                        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                        break;
                    }
                    
                    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                    final long j$76895 = i$76898;
                    
                    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                    final long t$76890 = ((j$76895) - (((long)(low2))));
                    
                    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                    final long t$76891 = ((i$76903) - (((long)(low1))));
                    
                    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                    final long t$76892 = ((t$76891) * (((long)(localSize2))));
                    
                    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                    final long offset$76893 = ((t$76890) + (((long)(t$76892))));
                    
                    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                    final $S t$76894 = (($S)((($S)
                                               ((x10.core.fun.Fun_0_2<x10.core.Long,x10.core.Long,$S>)init).$apply(x10.core.Long.$box(i$76903), x10.rtt.Types.LONG, x10.core.Long.$box(j$76895), x10.rtt.Types.LONG))));
                    
                    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                    ((x10.core.Rail<$S>)data).$set__1x10$lang$Rail$$T$G((long)(offset$76893), (($S)(t$76894)));
                    
                    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                    final long t$76896 = i$76898;
                    
                    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                    final long t$76897 = ((t$76896) + (((long)(1L))));
                    
                    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                    i$76898 = t$76897;
                }
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                final long t$76904 = i$76906;
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                final long t$76905 = ((t$76904) + (((long)(1L))));
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                i$76906 = t$76905;
            }
        }
        
        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.array.LocalState_BB2 alloc$76637 = ((x10.array.LocalState_BB2)(new x10.array.LocalState_BB2<$S>((java.lang.System[]) null, $S)));
        
        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76913 = ((m) * (((long)(n))));
        
        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        alloc$76637.x10$array$LocalState_BB2$$init$S(((x10.lang.PlaceGroup)(pg)), ((x10.core.Rail)(data)), t$76913, ((x10.array.DenseIterationSpace_2)(globalSpace)), ((x10.array.DenseIterationSpace_2)(localSpace)), (x10.array.LocalState_BB2.__1$1x10$array$LocalState_BB2$$S$2) null);
        
        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return alloc$76637;
    }
    
    
    //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public x10.array.LocalState_BB2 x10$array$LocalState_BB2$$this$x10$array$LocalState_BB2() {
        
        //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return x10.array.LocalState_BB2.this;
    }
    
    
    //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public void __fieldInitializers_x10_array_LocalState_BB2() {
        
    }
}

