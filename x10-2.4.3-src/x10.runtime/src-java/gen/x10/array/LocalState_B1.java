package x10.array;

@x10.runtime.impl.java.X10Generated
public class LocalState_B1<$S> extends x10.array.LocalState<$S> implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<LocalState_B1> $RTT = 
        x10.rtt.NamedType.<LocalState_B1> make("x10.array.LocalState_B1",
                                               LocalState_B1.class,
                                               1,
                                               new x10.rtt.Type[] {
                                                   x10.rtt.ParameterizedType.make(x10.array.LocalState.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                               });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $S; return null; }
    
    public static <$S> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.LocalState_B1<$S> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.LocalState.$_deserialize_body($_obj, $deserializer);
        $_obj.$S = (x10.rtt.Type) $deserializer.readObject();
        $_obj.globalIndices = $deserializer.readObject();
        $_obj.localIndices = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.LocalState_B1 $_obj = new x10.array.LocalState_B1((java.lang.System[]) null, (x10.rtt.Type) null);
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
    public LocalState_B1(final java.lang.System[] $dummy, final x10.rtt.Type $S) {
        super($dummy, $S);
        x10.array.LocalState_B1.$initParams(this, $S);
        
    }
    
    private x10.rtt.Type $S;
    
    // initializer of type parameters
    public static void $initParams(final LocalState_B1 $this, final x10.rtt.Type $S) {
        $this.$S = $S;
        
    }
    // synthetic type for parameter mangling
    public static final class __1$1x10$array$LocalState_B1$$S$2 {}
    

    
    //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    public x10.array.DenseIterationSpace_1 globalIndices;
    
    //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    public x10.array.DenseIterationSpace_1 localIndices;
    
    
    //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    // creation method for java code (1-phase java constructor)
    public LocalState_B1(final x10.rtt.Type $S, final x10.lang.PlaceGroup pg, final x10.core.Rail<$S> data, final long size, final x10.array.DenseIterationSpace_1 gs, final x10.array.DenseIterationSpace_1 ls, __1$1x10$array$LocalState_B1$$S$2 $dummy) {
        this((java.lang.System[]) null, $S);
        x10$array$LocalState_B1$$init$S(pg, data, size, gs, ls, (x10.array.LocalState_B1.__1$1x10$array$LocalState_B1$$S$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.LocalState_B1<$S> x10$array$LocalState_B1$$init$S(final x10.lang.PlaceGroup pg, final x10.core.Rail<$S> data, final long size, final x10.array.DenseIterationSpace_1 gs, final x10.array.DenseIterationSpace_1 ls, __1$1x10$array$LocalState_B1$$S$2 $dummy) {
         {
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.array.LocalState this$77084 = ((x10.array.LocalState)(this));
            
            //#line 291 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.lang.PlaceGroup pg$77081 = ((x10.lang.PlaceGroup)(pg));
            
            //#line 291 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.core.Rail rail$77082 = ((x10.core.Rail)(data));
            
            //#line 291 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final long size$77083 = size;
            
            //#line 292 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ((x10.array.LocalState<$S>)this$77084).pg = ((x10.lang.PlaceGroup)(pg$77081));
            
            //#line 292 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ((x10.array.LocalState<$S>)this$77084).rail = ((x10.core.Rail)(rail$77082));
            
            //#line 292 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ((x10.array.LocalState<$S>)this$77084).size = size$77083;
            {
                
            }
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.array.LocalState_B1 this$77167 = this;
            
            //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            ((x10.array.LocalState_B1<$S>)this).globalIndices = ((x10.array.DenseIterationSpace_1)(gs));
            
            //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            ((x10.array.LocalState_B1<$S>)this).localIndices = ((x10.array.DenseIterationSpace_1)(ls));
        }
        return this;
    }
    
    
    
    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    public static <$S>x10.array.LocalState_B1 make__2$1x10$lang$Long$3x10$array$LocalState_B1$$S$2(final x10.rtt.Type $S, final x10.lang.PlaceGroup pg, final long n, final x10.core.fun.Fun_0_1<x10.core.Long,$S> init) {
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final x10.array.DenseIterationSpace_1 globalSpace = ((x10.array.DenseIterationSpace_1)(new x10.array.DenseIterationSpace_1((java.lang.System[]) null)));
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final long t$77178 = ((n) - (((long)(1L))));
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        globalSpace.x10$array$DenseIterationSpace_1$$init$S(((long)(0L)), t$77178);
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final long t$77136 = pg.numPlaces$O();
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final long t$77137 = pg.indexOf$O(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))));
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final x10.array.DenseIterationSpace_1 localSpace = ((x10.array.DenseIterationSpace_1)(x10.array.BlockingUtils.partitionBlock(((x10.array.IterationSpace)(globalSpace)), (long)(t$77136), (long)(t$77137))));
        
        //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final x10.core.Rail data;
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        final long t$77138 = localSpace.max;
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        final long t$77139 = localSpace.min;
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        final boolean t$77149 = ((t$77138) < (((long)(t$77139))));
        
        //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        if (t$77149) {
            
            //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.core.Rail t$77140 = ((x10.core.Rail)(new x10.core.Rail<$S>($S)));
            
            //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            data = ((x10.core.Rail)(t$77140));
        } else {
            
            //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final long low = localSpace.min$O((long)(0L));
            
            //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final long hi = localSpace.max$O((long)(0L));
            
            //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final long t$77141 = ((hi) - (((long)(low))));
            
            //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final long dataSize = ((t$77141) + (((long)(1L))));
            
            //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.core.Rail t$77142 = ((x10.core.Rail)(x10.core.Rail.<$S>makeUnsafe($S, ((long)(dataSize)), false)));
            
            //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            data = ((x10.core.Rail)(t$77142));
            
            //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final long i$77032min$77176 = low;
            
            //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final long i$77032max$77177 = hi;
            
            //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            long i$77173 = i$77032min$77176;
            
            //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            for (;
                 true;
                 ) {
                
                //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
                final long t$77174 = i$77173;
                
                //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
                final boolean t$77175 = ((t$77174) <= (((long)(i$77032max$77177))));
                
                //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
                if (!(t$77175)) {
                    
                    //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
                    break;
                }
                
                //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
                final long i$77170 = i$77173;
                
                //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
                final long offset$77168 = ((i$77170) - (((long)(low))));
                
                //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
                final $S t$77169 = (($S)((($S)
                                           ((x10.core.fun.Fun_0_1<x10.core.Long,$S>)init).$apply(x10.core.Long.$box(i$77170), x10.rtt.Types.LONG))));
                
                //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
                ((x10.core.Rail<$S>)data).$set__1x10$lang$Rail$$T$G((long)(offset$77168), (($S)(t$77169)));
                
                //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
                final long t$77171 = i$77173;
                
                //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
                final long t$77172 = ((t$77171) + (((long)(1L))));
                
                //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
                i$77173 = t$77172;
            }
        }
        
        //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final x10.array.LocalState_B1 alloc$77030 = ((x10.array.LocalState_B1)(new x10.array.LocalState_B1<$S>((java.lang.System[]) null, $S)));
        
        //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        alloc$77030.x10$array$LocalState_B1$$init$S(((x10.lang.PlaceGroup)(pg)), ((x10.core.Rail)(data)), ((long)(n)), ((x10.array.DenseIterationSpace_1)(globalSpace)), ((x10.array.DenseIterationSpace_1)(localSpace)), (x10.array.LocalState_B1.__1$1x10$array$LocalState_B1$$S$2) null);
        
        //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        return alloc$77030;
    }
    
    
    //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    final public x10.array.LocalState_B1 x10$array$LocalState_B1$$this$x10$array$LocalState_B1() {
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        return x10.array.LocalState_B1.this;
    }
    
    
    //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    final public void __fieldInitializers_x10_array_LocalState_B1() {
        
    }
}

