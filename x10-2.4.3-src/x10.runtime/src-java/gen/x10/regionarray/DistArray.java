package x10.regionarray;


@x10.runtime.impl.java.X10Generated
final public class DistArray<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.lang.Iterable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<DistArray> $RTT = 
        x10.rtt.NamedType.<DistArray> make("x10.regionarray.DistArray",
                                           DistArray.class,
                                           1,
                                           new x10.rtt.Type[] {
                                               x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.lang.Point.$RTT, x10.rtt.UnresolvedType.PARAM(0)),
                                               x10.rtt.ParameterizedType.make(x10.lang.Iterable.$RTT, x10.lang.Point.$RTT)
                                           });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.DistArray<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.localHandle = $deserializer.readObject();
        $_obj.dist = $deserializer.readObject();
        
        /* fields with @TransientInitExpr annotations */
        $_obj.raw = $_obj.getRawFromLocalHandle();
        
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.DistArray $_obj = new x10.regionarray.DistArray((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.localHandle);
        $serializer.write(this.dist);
        
    }
    
    // constructor just for allocation
    public DistArray(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.regionarray.DistArray.$initParams(this, $T);
        
    }
    
    // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1){}:U
    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
        return $apply$G((x10.lang.Point)a1);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final DistArray $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __1$1x10$lang$Point$3x10$regionarray$DistArray$$T$2 {}
    // synthetic type for parameter mangling
    public static final class __1x10$regionarray$DistArray$$T {}
    // synthetic type for parameter mangling
    public static final class __0$1x10$regionarray$DistArray$$T$2 {}
    // synthetic type for parameter mangling
    public static final class __1$1x10$regionarray$DistArray$LocalState$1x10$regionarray$DistArray$$T$2$2 {}
    
    // properties
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    public x10.regionarray.Dist dist;
    

    
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public x10.regionarray.Region region() {
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125758 = ((x10.regionarray.Dist)(dist));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Region t$125759 = ((x10.regionarray.Region)(t$125758.region));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return t$125759;
    }
    
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public long rank$O() {
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist this$125698 = ((x10.regionarray.Dist)(dist));
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Region t$125760 = ((x10.regionarray.Region)(this$125698.region));
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final long t$125761 = t$125760.rank;
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return t$125761;
    }
    
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    @x10.runtime.impl.java.X10Generated
    public static class LocalState<$T> extends x10.core.Ref implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<LocalState> $RTT = 
            x10.rtt.NamedType.<LocalState> make("x10.regionarray.DistArray.LocalState",
                                                LocalState.class,
                                                1);
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.DistArray.LocalState<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.dist = $deserializer.readObject();
            $_obj.data = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.DistArray.LocalState $_obj = new x10.regionarray.DistArray.LocalState((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.dist);
            $serializer.write(this.data);
            
        }
        
        // constructor just for allocation
        public LocalState(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.regionarray.DistArray.LocalState.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final LocalState $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __1$1x10$regionarray$DistArray$LocalState$$T$2 {}
        
        // properties
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        public x10.regionarray.Dist dist;
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        public x10.core.Rail<$T> data;
        
    
        
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        // creation method for java code (1-phase java constructor)
        public LocalState(final x10.rtt.Type $T, final x10.regionarray.Dist d, final x10.core.Rail<$T> c, __1$1x10$regionarray$DistArray$LocalState$$T$2 $dummy) {
            this((java.lang.System[]) null, $T);
            x10$regionarray$DistArray$LocalState$$init$S(d, c, (x10.regionarray.DistArray.LocalState.__1$1x10$regionarray$DistArray$LocalState$$T$2) null);
        }
        
        // constructor for non-virtual call
        final public x10.regionarray.DistArray.LocalState<$T> x10$regionarray$DistArray$LocalState$$init$S(final x10.regionarray.Dist d, final x10.core.Rail<$T> c, __1$1x10$regionarray$DistArray$LocalState$$T$2 $dummy) {
             {
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                this.dist = d;
                this.data = ((x10.core.Rail)(c));
                
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.DistArray.LocalState this$125974 = this;
                
                //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.Region unused = ((x10.regionarray.Region)(d.$apply(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
            }
            return this;
        }
        
        
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final public x10.regionarray.DistArray.LocalState x10$regionarray$DistArray$LocalState$$this$x10$regionarray$DistArray$LocalState() {
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            return x10.regionarray.DistArray.LocalState.this;
        }
        
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final public void __fieldInitializers_x10_regionarray_DistArray_LocalState() {
            
        }
    }
    
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    /** The place-local state for the DistArray */
    public x10.lang.PlaceLocalHandle<x10.regionarray.DistArray.LocalState<$T>> localHandle;
    
    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    /** 
     * The place-local backing storage for elements of the DistArray.
     */
    public transient x10.core.Rail<$T> raw;
    
    
    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    public x10.core.Rail getRawFromLocalHandle() {
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.lang.PlaceLocalHandle t$125762 = ((x10.lang.PlaceLocalHandle)(localHandle));
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray.LocalState ls = ((x10.lang.PlaceLocalHandle<x10.regionarray.DistArray.LocalState<$T>>)t$125762).$apply$G();
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final boolean t$125763 = ((ls) != (null));
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        x10.core.Rail t$125764 =  null;
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        if (t$125763) {
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            t$125764 = ((x10.core.Rail)(((x10.regionarray.DistArray.LocalState<$T>)ls).data));
        } else {
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            t$125764 = ((x10.core.Rail)(new x10.core.Rail<$T>($T)));
        }
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.core.Rail t$125765 = ((x10.core.Rail)(t$125764));
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return t$125765;
    }
    
    
    //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public x10.core.Rail raw() {
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.core.Rail t$125766 = ((x10.core.Rail)(raw));
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return t$125766;
    }
    
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    public x10.regionarray.Array getLocalPortion() {
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125767 = ((x10.regionarray.Dist)(dist));
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Region regionForHere = ((x10.regionarray.Region)(t$125767.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final boolean t$125768 = regionForHere.rect;
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final boolean t$125772 = !(t$125768);
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        if (t$125772) {
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final java.lang.String t$125769 = x10.rtt.Types.typeName(((java.lang.Object)(this)));
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final java.lang.String t$125770 = ((t$125769) + (".getLocalPortion(): local portion is not rectangular!"));
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final java.lang.UnsupportedOperationException t$125771 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException(t$125770)));
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            throw t$125771;
        }
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Array alloc$125653 = ((x10.regionarray.Array)(new x10.regionarray.Array<$T>((java.lang.System[]) null, $T)));
        
        //#line 231 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region reg$125702 = ((x10.regionarray.Region)(regionForHere));
        
        //#line 231 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail backingStore$125703 = ((x10.core.Rail)(raw));
        
        //#line 233 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region t$125975 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                            reg$125702)));
        
        //#line 233 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$T>)alloc$125653).region = ((x10.regionarray.Region)(t$125975));
        
        //#line 233 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$125976 = reg$125702.rank;
        
        //#line 233 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$T>)alloc$125653).rank = t$125976;
        
        //#line 233 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$125977 = reg$125702.rect;
        
        //#line 233 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$T>)alloc$125653).rect = t$125977;
        
        //#line 233 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$125978 = reg$125702.zeroBased;
        
        //#line 233 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$T>)alloc$125653).zeroBased = t$125978;
        
        //#line 233 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$125979 = reg$125702.rail;
        
        //#line 233 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$T>)alloc$125653).rail = t$125979;
        
        //#line 233 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$125980 = reg$125702.size$O();
        
        //#line 233 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$T>)alloc$125653).size = t$125980;
        {
            
        }
        
        //#line 235 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array.LayoutHelper crh$125981 = new x10.regionarray.Array.LayoutHelper((java.lang.System[]) null);
        
        //#line 235 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        crh$125981.x10$regionarray$Array$LayoutHelper$$init$S(((x10.regionarray.Region)(reg$125702)));
        
        //#line 236 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$125982 = crh$125981.min0;
        
        //#line 236 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$T>)alloc$125653).layout_min0 = t$125982;
        
        //#line 237 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$125983 = crh$125981.stride1;
        
        //#line 237 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$T>)alloc$125653).layout_stride1 = t$125983;
        
        //#line 238 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$125984 = crh$125981.min1;
        
        //#line 238 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$T>)alloc$125653).layout_min1 = t$125984;
        
        //#line 239 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$125985 = ((x10.core.Rail)(crh$125981.layout));
        
        //#line 239 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$T>)alloc$125653).layout = ((x10.core.Rail)(t$125985));
        
        //#line 240 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long n$125986 = crh$125981.size;
        
        //#line 241 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$125987 = ((x10.core.Rail<$T>)backingStore$125703).size;
        
        //#line 241 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$125988 = ((n$125986) > (((long)(t$125987))));
        
        //#line 241 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (t$125988) {
            
            //#line 242 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$125989 = true;
            
            //#line 242 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$125989) {
                
                //#line 242 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final java.lang.IllegalArgumentException t$125990 = ((java.lang.IllegalArgumentException)(new java.lang.IllegalArgumentException("backingStore too small")));
                
                //#line 242 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                throw t$125990;
            }
        }
        
        //#line 244 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$125991 = ((x10.core.Rail)(((x10.core.Rail<$T>)
                                                          backingStore$125703)));
        
        //#line 244 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$T>)alloc$125653).raw = ((x10.core.Rail)(t$125991));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return alloc$125653;
    }
    
    
    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    public static <$T>x10.regionarray.DistArray make(final x10.rtt.Type $T, final x10.regionarray.Dist dist) {
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray alloc$125654 = ((x10.regionarray.DistArray)(new x10.regionarray.DistArray<$T>((java.lang.System[]) null, $T)));
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        alloc$125654.x10$regionarray$DistArray$$init$S(((x10.regionarray.Dist)(dist)));
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return alloc$125654;
    }
    
    
    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    // creation method for java code (1-phase java constructor)
    public DistArray(final x10.rtt.Type $T, final x10.regionarray.Dist dist) {
        this((java.lang.System[]) null, $T);
        x10$regionarray$DistArray$$init$S(dist);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.DistArray<$T> x10$regionarray$DistArray$$init$S(final x10.regionarray.Dist dist) {
         {
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            this.dist = dist;
            
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.DistArray this$125992 = this;
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.PlaceGroup t$125789 = dist.places();
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.fun.Fun_0_0 t$125790 = ((x10.core.fun.Fun_0_0)(new x10.regionarray.DistArray.$Closure$199<$T>($T, dist)));
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.PlaceLocalHandle t$125791 = x10.lang.PlaceLocalHandle.<x10.regionarray.DistArray.LocalState<$T>> makeFlat__1$1x10$lang$PlaceLocalHandle$$T$2(x10.rtt.ParameterizedType.make(x10.regionarray.DistArray.LocalState.$RTT, $T), ((x10.lang.PlaceGroup)(t$125789)), ((x10.core.fun.Fun_0_0)(t$125790)));
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ((x10.regionarray.DistArray<$T>)this).localHandle = ((x10.lang.PlaceLocalHandle)(t$125791));
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.Rail t$125792 = ((x10.core.Rail)(((x10.core.Rail<$T>)
                                                              this.getRawFromLocalHandle())));
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ((x10.regionarray.DistArray<$T>)this).raw = ((x10.core.Rail)(t$125792));
        }
        return this;
    }
    
    
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    public static <$T>x10.regionarray.DistArray make__1$1x10$lang$Point$3x10$regionarray$DistArray$$T$2(final x10.rtt.Type $T, final x10.regionarray.Dist dist, final x10.core.fun.Fun_0_1<x10.lang.Point,$T> init) {
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray alloc$125656 = ((x10.regionarray.DistArray)(new x10.regionarray.DistArray<$T>((java.lang.System[]) null, $T)));
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        alloc$125656.x10$regionarray$DistArray$$init$S(((x10.regionarray.Dist)(dist)), ((x10.core.fun.Fun_0_1)(init)), (x10.regionarray.DistArray.__1$1x10$lang$Point$3x10$regionarray$DistArray$$T$2) null);
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return alloc$125656;
    }
    
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    // creation method for java code (1-phase java constructor)
    public DistArray(final x10.rtt.Type $T, final x10.regionarray.Dist dist, final x10.core.fun.Fun_0_1<x10.lang.Point,$T> init, __1$1x10$lang$Point$3x10$regionarray$DistArray$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$regionarray$DistArray$$init$S(dist, init, (x10.regionarray.DistArray.__1$1x10$lang$Point$3x10$regionarray$DistArray$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.DistArray<$T> x10$regionarray$DistArray$$init$S(final x10.regionarray.Dist dist, final x10.core.fun.Fun_0_1<x10.lang.Point,$T> init, __1$1x10$lang$Point$3x10$regionarray$DistArray$$T$2 $dummy) {
         {
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            this.dist = dist;
            
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.DistArray this$125998 = this;
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.PlaceGroup t$125799 = dist.places();
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.fun.Fun_0_0 t$125800 = ((x10.core.fun.Fun_0_0)(new x10.regionarray.DistArray.$Closure$200<$T>($T, dist, init, (x10.regionarray.DistArray.$Closure$200.__1$1x10$lang$Point$3x10$regionarray$DistArray$$Closure$200$$T$2) null)));
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.PlaceLocalHandle t$125801 = x10.lang.PlaceLocalHandle.<x10.regionarray.DistArray.LocalState<$T>> make__1$1x10$lang$PlaceLocalHandle$$T$2(x10.rtt.ParameterizedType.make(x10.regionarray.DistArray.LocalState.$RTT, $T), ((x10.lang.PlaceGroup)(t$125799)), ((x10.core.fun.Fun_0_0)(t$125800)));
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ((x10.regionarray.DistArray<$T>)this).localHandle = ((x10.lang.PlaceLocalHandle)(t$125801));
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.Rail t$125802 = ((x10.core.Rail)(((x10.core.Rail<$T>)
                                                              this.getRawFromLocalHandle())));
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ((x10.regionarray.DistArray<$T>)this).raw = ((x10.core.Rail)(t$125802));
        }
        return this;
    }
    
    
    
    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    public static <$T>x10.regionarray.DistArray make__1x10$regionarray$DistArray$$T(final x10.rtt.Type $T, final x10.regionarray.Dist dist, final $T init) {
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray alloc$125658 = ((x10.regionarray.DistArray)(new x10.regionarray.DistArray<$T>((java.lang.System[]) null, $T)));
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        alloc$125658.x10$regionarray$DistArray$$init$S(((x10.regionarray.Dist)(dist)), (($T)(init)), (x10.regionarray.DistArray.__1x10$regionarray$DistArray$$T) null);
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return alloc$125658;
    }
    
    
    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    // creation method for java code (1-phase java constructor)
    public DistArray(final x10.rtt.Type $T, final x10.regionarray.Dist dist, final $T init, __1x10$regionarray$DistArray$$T $dummy) {
        this((java.lang.System[]) null, $T);
        x10$regionarray$DistArray$$init$S(dist, init, (x10.regionarray.DistArray.__1x10$regionarray$DistArray$$T) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.DistArray<$T> x10$regionarray$DistArray$$init$S(final x10.regionarray.Dist dist, final $T init, __1x10$regionarray$DistArray$$T $dummy) {
         {
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            this.dist = dist;
            
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.DistArray this$126003 = this;
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.PlaceGroup t$125808 = dist.places();
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.fun.Fun_0_0 t$125809 = ((x10.core.fun.Fun_0_0)(new x10.regionarray.DistArray.$Closure$201<$T>($T, dist, init, (x10.regionarray.DistArray.$Closure$201.__1x10$regionarray$DistArray$$Closure$201$$T) null)));
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.PlaceLocalHandle t$125810 = x10.lang.PlaceLocalHandle.<x10.regionarray.DistArray.LocalState<$T>> makeFlat__1$1x10$lang$PlaceLocalHandle$$T$2(x10.rtt.ParameterizedType.make(x10.regionarray.DistArray.LocalState.$RTT, $T), ((x10.lang.PlaceGroup)(t$125808)), ((x10.core.fun.Fun_0_0)(t$125809)));
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ((x10.regionarray.DistArray<$T>)this).localHandle = ((x10.lang.PlaceLocalHandle)(t$125810));
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.Rail t$125811 = ((x10.core.Rail)(((x10.core.Rail<$T>)
                                                              this.getRawFromLocalHandle())));
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ((x10.regionarray.DistArray<$T>)this).raw = ((x10.core.Rail)(t$125811));
        }
        return this;
    }
    
    
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    // creation method for java code (1-phase java constructor)
    public DistArray(final x10.rtt.Type $T, final x10.regionarray.DistArray<$T> a, final x10.regionarray.Dist d, __0$1x10$regionarray$DistArray$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$regionarray$DistArray$$init$S(a, d, (x10.regionarray.DistArray.__0$1x10$regionarray$DistArray$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.DistArray<$T> x10$regionarray$DistArray$$init$S(final x10.regionarray.DistArray<$T> a, final x10.regionarray.Dist d, __0$1x10$regionarray$DistArray$$T$2 $dummy) {
         {
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            this.dist = d;
            
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.DistArray this$126007 = this;
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.PlaceGroup t$125815 = d.places();
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.fun.Fun_0_0 t$125816 = ((x10.core.fun.Fun_0_0)(new x10.regionarray.DistArray.$Closure$202<$T>($T, a, d, (x10.regionarray.DistArray.$Closure$202.__0$1x10$regionarray$DistArray$$Closure$202$$T$2) null)));
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.PlaceLocalHandle t$125817 = x10.lang.PlaceLocalHandle.<x10.regionarray.DistArray.LocalState<$T>> makeFlat__1$1x10$lang$PlaceLocalHandle$$T$2(x10.rtt.ParameterizedType.make(x10.regionarray.DistArray.LocalState.$RTT, $T), ((x10.lang.PlaceGroup)(t$125815)), ((x10.core.fun.Fun_0_0)(t$125816)));
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ((x10.regionarray.DistArray<$T>)this).localHandle = ((x10.lang.PlaceLocalHandle)(t$125817));
            
            //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.Rail t$125818 = ((x10.core.Rail)(((x10.core.Rail<$T>)
                                                              this.getRawFromLocalHandle())));
            
            //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ((x10.regionarray.DistArray<$T>)this).raw = ((x10.core.Rail)(t$125818));
        }
        return this;
    }
    
    
    
    //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    // creation method for java code (1-phase java constructor)
    public DistArray(final x10.rtt.Type $T, final x10.regionarray.Dist d, final x10.lang.PlaceLocalHandle<x10.regionarray.DistArray.LocalState<$T>> pls, __1$1x10$regionarray$DistArray$LocalState$1x10$regionarray$DistArray$$T$2$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$regionarray$DistArray$$init$S(d, pls, (x10.regionarray.DistArray.__1$1x10$regionarray$DistArray$LocalState$1x10$regionarray$DistArray$$T$2$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.DistArray<$T> x10$regionarray$DistArray$$init$S(final x10.regionarray.Dist d, final x10.lang.PlaceLocalHandle<x10.regionarray.DistArray.LocalState<$T>> pls, __1$1x10$regionarray$DistArray$LocalState$1x10$regionarray$DistArray$$T$2$2 $dummy) {
         {
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            this.dist = d;
            
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.DistArray this$126008 = this;
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ((x10.regionarray.DistArray<$T>)this).localHandle = ((x10.lang.PlaceLocalHandle)(pls));
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.Rail t$125819 = ((x10.core.Rail)(((x10.core.Rail<$T>)
                                                              this.getRawFromLocalHandle())));
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ((x10.regionarray.DistArray<$T>)this).raw = ((x10.core.Rail)(t$125819));
        }
        return this;
    }
    
    
    
    //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public $T $apply$G(final x10.lang.Point pt) {
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125820 = ((x10.regionarray.Dist)(dist));
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final long offset = t$125820.offset$O(((x10.lang.Point)(pt)));
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.core.Rail t$125821 = ((x10.core.Rail)(raw));
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final $T t$125822 = (($T)(((x10.core.Rail<$T>)t$125821).$apply$G((long)(offset))));
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return t$125822;
    }
    
    
    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public $T $apply$G(final long i0) {
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125825 = ((x10.regionarray.Dist)(dist));
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final long offset = t$125825.offset$O((long)(i0));
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.core.Rail t$125826 = ((x10.core.Rail)(raw));
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final $T t$125827 = (($T)(((x10.core.Rail<$T>)t$125826).$apply$G((long)(offset))));
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return t$125827;
    }
    
    
    //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public $T $apply$G(final long i0, final long i1) {
        
        //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125830 = ((x10.regionarray.Dist)(dist));
        
        //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final long offset = t$125830.offset$O((long)(i0), (long)(i1));
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.core.Rail t$125831 = ((x10.core.Rail)(raw));
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final $T t$125832 = (($T)(((x10.core.Rail<$T>)t$125831).$apply$G((long)(offset))));
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return t$125832;
    }
    
    
    //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public $T $apply$G(final long i0, final long i1, final long i2) {
        
        //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125835 = ((x10.regionarray.Dist)(dist));
        
        //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final long offset = t$125835.offset$O((long)(i0), (long)(i1), (long)(i2));
        
        //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.core.Rail t$125836 = ((x10.core.Rail)(raw));
        
        //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final $T t$125837 = (($T)(((x10.core.Rail<$T>)t$125836).$apply$G((long)(offset))));
        
        //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return t$125837;
    }
    
    
    //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public $T $apply$G(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125840 = ((x10.regionarray.Dist)(dist));
        
        //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final long offset = t$125840.offset$O((long)(i0), (long)(i1), (long)(i2), (long)(i3));
        
        //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.core.Rail t$125841 = ((x10.core.Rail)(raw));
        
        //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final $T t$125842 = (($T)(((x10.core.Rail<$T>)t$125841).$apply$G((long)(offset))));
        
        //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return t$125842;
    }
    
    
    //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public $T $set__1x10$regionarray$DistArray$$T$G(final x10.lang.Point pt, final $T v) {
        
        //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125843 = ((x10.regionarray.Dist)(dist));
        
        //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final long offset = t$125843.offset$O(((x10.lang.Point)(pt)));
        
        //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.core.Rail t$125844 = ((x10.core.Rail)(raw));
        
        //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ((x10.core.Rail<$T>)t$125844).$set__1x10$lang$Rail$$T$G((long)(offset), (($T)(v)));
        
        //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return v;
    }
    
    
    //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public $T $set__1x10$regionarray$DistArray$$T$G(final long i0, final $T v) {
        
        //#line 347 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125847 = ((x10.regionarray.Dist)(dist));
        
        //#line 347 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final long offset = t$125847.offset$O((long)(i0));
        
        //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.core.Rail t$125848 = ((x10.core.Rail)(raw));
        
        //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ((x10.core.Rail<$T>)t$125848).$set__1x10$lang$Rail$$T$G((long)(offset), (($T)(v)));
        
        //#line 349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return v;
    }
    
    
    //#line 367 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public $T $set__2x10$regionarray$DistArray$$T$G(final long i0, final long i1, final $T v) {
        
        //#line 368 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125851 = ((x10.regionarray.Dist)(dist));
        
        //#line 368 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final long offset = t$125851.offset$O((long)(i0), (long)(i1));
        
        //#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.core.Rail t$125852 = ((x10.core.Rail)(raw));
        
        //#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ((x10.core.Rail<$T>)t$125852).$set__1x10$lang$Rail$$T$G((long)(offset), (($T)(v)));
        
        //#line 370 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return v;
    }
    
    
    //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public $T $set__3x10$regionarray$DistArray$$T$G(final long i0, final long i1, final long i2, final $T v) {
        
        //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125855 = ((x10.regionarray.Dist)(dist));
        
        //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final long offset = t$125855.offset$O((long)(i0), (long)(i1), (long)(i2));
        
        //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.core.Rail t$125856 = ((x10.core.Rail)(raw));
        
        //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ((x10.core.Rail<$T>)t$125856).$set__1x10$lang$Rail$$T$G((long)(offset), (($T)(v)));
        
        //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return v;
    }
    
    
    //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public $T $set__4x10$regionarray$DistArray$$T$G(final long i0, final long i1, final long i2, final long i3, final $T v) {
        
        //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125859 = ((x10.regionarray.Dist)(dist));
        
        //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final long offset = t$125859.offset$O((long)(i0), (long)(i1), (long)(i2), (long)(i3));
        
        //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.core.Rail t$125860 = ((x10.core.Rail)(raw));
        
        //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ((x10.core.Rail<$T>)t$125860).$set__1x10$lang$Rail$$T$G((long)(offset), (($T)(v)));
        
        //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return v;
    }
    
    
    //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    public x10.regionarray.DistArray restriction(final x10.regionarray.Dist d) {
        
        //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray alloc$125661 = ((x10.regionarray.DistArray)(new x10.regionarray.DistArray<$T>((java.lang.System[]) null, $T)));
        
        //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        alloc$125661.x10$regionarray$DistArray$$init$S(((x10.regionarray.DistArray)(this)), ((x10.regionarray.Dist)(d)), (x10.regionarray.DistArray.__0$1x10$regionarray$DistArray$$T$2) null);
        
        //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray t$125861 = ((x10.regionarray.DistArray)(((x10.regionarray.DistArray<$T>)
                                                                                  alloc$125661)));
        
        //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return t$125861;
    }
    
    
    //#line 447 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    public x10.regionarray.DistArray restriction(final x10.regionarray.Region r) {
        
        //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray this$125742 = ((x10.regionarray.DistArray)(this));
        
        //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125862 = ((x10.regionarray.Dist)(dist));
        
        //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125863 = ((x10.regionarray.Dist)(t$125862.restriction(((x10.regionarray.Region)(r)))));
        
        //#line 435 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist d$125740 = ((x10.regionarray.Dist)(((x10.regionarray.Dist)
                                                                        t$125863)));
        
        //#line 436 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray alloc$125741 = ((x10.regionarray.DistArray)(new x10.regionarray.DistArray<$T>((java.lang.System[]) null, $T)));
        
        //#line 436 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        alloc$125741.x10$regionarray$DistArray$$init$S(((x10.regionarray.DistArray)(this$125742)), ((x10.regionarray.Dist)(d$125740)), (x10.regionarray.DistArray.__0$1x10$regionarray$DistArray$$T$2) null);
        
        //#line 436 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray t$125864 = ((x10.regionarray.DistArray)(((x10.regionarray.DistArray<$T>)
                                                                                  alloc$125741)));
        
        //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return t$125864;
    }
    
    
    //#line 459 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    public x10.regionarray.DistArray restriction(final x10.lang.Place p) {
        
        //#line 460 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray this$125745 = ((x10.regionarray.DistArray)(this));
        
        //#line 460 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125865 = ((x10.regionarray.Dist)(dist));
        
        //#line 460 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125866 = ((x10.regionarray.Dist)(t$125865.restriction(((x10.lang.Place)(p)))));
        
        //#line 435 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist d$125743 = ((x10.regionarray.Dist)(((x10.regionarray.Dist)
                                                                        t$125866)));
        
        //#line 436 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray alloc$125744 = ((x10.regionarray.DistArray)(new x10.regionarray.DistArray<$T>((java.lang.System[]) null, $T)));
        
        //#line 436 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        alloc$125744.x10$regionarray$DistArray$$init$S(((x10.regionarray.DistArray)(this$125745)), ((x10.regionarray.Dist)(d$125743)), (x10.regionarray.DistArray.__0$1x10$regionarray$DistArray$$T$2) null);
        
        //#line 436 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray t$125867 = ((x10.regionarray.DistArray)(((x10.regionarray.DistArray<$T>)
                                                                                  alloc$125744)));
        
        //#line 460 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return t$125867;
    }
    
    
    //#line 471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    public x10.regionarray.DistArray $bar(final x10.regionarray.Region r) {
        
        //#line 471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray t$125868 = ((x10.regionarray.DistArray)(((x10.regionarray.DistArray<$T>)
                                                                                  this.restriction(((x10.regionarray.Region)(r))))));
        
        //#line 471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return t$125868;
    }
    
    
    //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    public x10.regionarray.DistArray $bar(final x10.lang.Place p) {
        
        //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray t$125869 = ((x10.regionarray.DistArray)(((x10.regionarray.DistArray<$T>)
                                                                                  this.restriction(((x10.lang.Place)(p))))));
        
        //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return t$125869;
    }
    
    
    //#line 493 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    public void fill__0x10$regionarray$DistArray$$T(final $T v) {
        {
            
            //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.FinishState x10$__var17 = x10.lang.Runtime.startFinish();
            
            //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            try {{
                {
                    
                    //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.regionarray.Dist t$125871 = ((x10.regionarray.Dist)(dist));
                    
                    //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.lang.PlaceGroup t$125872 = t$125871.places();
                    
                    //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.lang.Iterator where$125673 = t$125872.iterator();
                    
                    //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        final boolean t$125878 = ((x10.lang.Iterator<x10.lang.Place>)where$125673).hasNext$O();
                        
                        //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        if (!(t$125878)) {
                            
                            //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                            break;
                        }
                        
                        //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        final x10.lang.Place where$126014 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)where$125673).next$G()));
                        
                        //#line 495 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        x10.lang.Runtime.runAsync(((x10.lang.Place)(where$126014)), ((x10.core.fun.VoidFun_0_0)(new x10.regionarray.DistArray.$Closure$203<$T>($T, ((x10.regionarray.DistArray)(this)), dist, v, (x10.regionarray.DistArray.$Closure$203.__0$1x10$regionarray$DistArray$$Closure$203$$T$2__2x10$regionarray$DistArray$$Closure$203$$T) null))), ((x10.lang.Runtime.Profile)(null)));
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                
                //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var17)));
             }}
            }
        }
    
    
    //#line 514 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public <$U>x10.regionarray.DistArray map__0$1x10$regionarray$DistArray$$T$3x10$regionarray$DistArray$$U$2(final x10.rtt.Type $U, final x10.core.fun.Fun_0_1 op) {
        
        //#line 515 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125879 = ((x10.regionarray.Dist)(dist));
        
        //#line 515 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.lang.PlaceGroup t$125890 = t$125879.places();
        
        //#line 515 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.core.fun.Fun_0_0 t$125891 = ((x10.core.fun.Fun_0_0)(new x10.regionarray.DistArray.$Closure$204<$T, $U>($T, $U, ((x10.regionarray.DistArray)(this)), this.dist, op, (x10.regionarray.DistArray.$Closure$204.__0$1x10$regionarray$DistArray$$Closure$204$$T$2__2$1x10$regionarray$DistArray$$Closure$204$$T$3x10$regionarray$DistArray$$Closure$204$$U$2) null)));
        
        //#line 515 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.lang.PlaceLocalHandle plh = x10.lang.PlaceLocalHandle.<x10.regionarray.DistArray.LocalState<$U>> make__1$1x10$lang$PlaceLocalHandle$$T$2(x10.rtt.ParameterizedType.make(x10.regionarray.DistArray.LocalState.$RTT, $U), ((x10.lang.PlaceGroup)(t$125890)), ((x10.core.fun.Fun_0_0)(t$125891)));
        
        //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray alloc$125663 = ((x10.regionarray.DistArray)(new x10.regionarray.DistArray<$U>((java.lang.System[]) null, $U)));
        
        //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$126026 = ((x10.regionarray.Dist)(dist));
        
        //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        alloc$125663.x10$regionarray$DistArray$$init$S(((x10.regionarray.Dist)(t$126026)), ((x10.lang.PlaceLocalHandle<x10.regionarray.DistArray.LocalState<$U>>)(plh)), (x10.regionarray.DistArray.__1$1x10$regionarray$DistArray$LocalState$1x10$regionarray$DistArray$$T$2$2) null);
        
        //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return alloc$125663;
    }
    
    
    //#line 538 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public <$U>x10.regionarray.DistArray map__0$1x10$regionarray$DistArray$$U$2__1$1x10$regionarray$DistArray$$T$3x10$regionarray$DistArray$$U$2(final x10.rtt.Type $U, final x10.regionarray.DistArray dst, final x10.core.fun.Fun_0_1 op) {
        {
            
            //#line 539 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 539 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.FinishState x10$__var18 = x10.lang.Runtime.startFinish();
            
            //#line 539 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            try {{
                {
                    
                    //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.regionarray.Dist t$125894 = ((x10.regionarray.Dist)(dist));
                    
                    //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.lang.PlaceGroup t$125895 = t$125894.places();
                    
                    //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.lang.Iterator where$125679 = t$125895.iterator();
                    
                    //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        final boolean t$125902 = ((x10.lang.Iterator<x10.lang.Place>)where$125679).hasNext$O();
                        
                        //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        if (!(t$125902)) {
                            
                            //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                            break;
                        }
                        
                        //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        final x10.lang.Place where$126034 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)where$125679).next$G()));
                        
                        //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        x10.lang.Runtime.runAsync(((x10.lang.Place)(where$126034)), ((x10.core.fun.VoidFun_0_0)(new x10.regionarray.DistArray.$Closure$205<$T, $U>($T, $U, ((x10.regionarray.DistArray)(this)), dist, dst, op, (x10.regionarray.DistArray.$Closure$205.__0$1x10$regionarray$DistArray$$Closure$205$$T$2__2$1x10$regionarray$DistArray$$Closure$205$$U$2__3$1x10$regionarray$DistArray$$Closure$205$$T$3x10$regionarray$DistArray$$Closure$205$$U$2) null))), ((x10.lang.Runtime.Profile)(null)));
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 539 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                
                //#line 539 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 539 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var18)));
             }}
            }
        
        //#line 552 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return dst;
        }
    
    
    //#line 567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public <$U>x10.regionarray.DistArray map__0$1x10$regionarray$DistArray$$U$2__2$1x10$regionarray$DistArray$$T$3x10$regionarray$DistArray$$U$2(final x10.rtt.Type $U, final x10.regionarray.DistArray dst, final x10.regionarray.Region filter, final x10.core.fun.Fun_0_1 op) {
        {
            
            //#line 568 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 568 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.FinishState x10$__var19 = x10.lang.Runtime.startFinish();
            
            //#line 568 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            try {{
                {
                    
                    //#line 569 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.regionarray.Dist t$125904 = ((x10.regionarray.Dist)(dist));
                    
                    //#line 569 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.lang.PlaceGroup t$125905 = t$125904.places();
                    
                    //#line 569 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.lang.Iterator where$125683 = t$125905.iterator();
                    
                    //#line 569 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 569 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        final boolean t$125912 = ((x10.lang.Iterator<x10.lang.Place>)where$125683).hasNext$O();
                        
                        //#line 569 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        if (!(t$125912)) {
                            
                            //#line 569 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                            break;
                        }
                        
                        //#line 569 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        final x10.lang.Place where$126047 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)where$125683).next$G()));
                        
                        //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        x10.lang.Runtime.runAsync(((x10.lang.Place)(where$126047)), ((x10.core.fun.VoidFun_0_0)(new x10.regionarray.DistArray.$Closure$206<$T, $U>($T, $U, ((x10.regionarray.DistArray)(this)), dist, filter, dst, op, (x10.regionarray.DistArray.$Closure$206.__0$1x10$regionarray$DistArray$$Closure$206$$T$2__3$1x10$regionarray$DistArray$$Closure$206$$U$2__4$1x10$regionarray$DistArray$$Closure$206$$T$3x10$regionarray$DistArray$$Closure$206$$U$2) null))), ((x10.lang.Runtime.Profile)(null)));
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 568 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                
                //#line 568 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 568 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var19)));
             }}
            }
        
        //#line 582 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return dst;
        }
    
    
    //#line 595 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public <$S, $U>x10.regionarray.DistArray map__0$1x10$regionarray$DistArray$$U$2__1$1x10$regionarray$DistArray$$T$3x10$regionarray$DistArray$$U$3x10$regionarray$DistArray$$S$2(final x10.rtt.Type $S, final x10.rtt.Type $U, final x10.regionarray.DistArray src, final x10.core.fun.Fun_0_2 op) {
        
        //#line 596 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125913 = ((x10.regionarray.Dist)(dist));
        
        //#line 596 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.lang.PlaceGroup t$125925 = t$125913.places();
        
        //#line 596 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.core.fun.Fun_0_0 t$125926 = ((x10.core.fun.Fun_0_0)(new x10.regionarray.DistArray.$Closure$207<$T, $S, $U>($T, $S, $U, ((x10.regionarray.DistArray)(this)), src, this.dist, op, (x10.regionarray.DistArray.$Closure$207.$_737e846f) null)));
        
        //#line 596 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.lang.PlaceLocalHandle plh = x10.lang.PlaceLocalHandle.<x10.regionarray.DistArray.LocalState<$S>> make__1$1x10$lang$PlaceLocalHandle$$T$2(x10.rtt.ParameterizedType.make(x10.regionarray.DistArray.LocalState.$RTT, $S), ((x10.lang.PlaceGroup)(t$125925)), ((x10.core.fun.Fun_0_0)(t$125926)));
        
        //#line 607 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray alloc$125665 = ((x10.regionarray.DistArray)(new x10.regionarray.DistArray<$S>((java.lang.System[]) null, $S)));
        
        //#line 607 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$126063 = ((x10.regionarray.Dist)(dist));
        
        //#line 607 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        alloc$125665.x10$regionarray$DistArray$$init$S(((x10.regionarray.Dist)(t$126063)), ((x10.lang.PlaceLocalHandle<x10.regionarray.DistArray.LocalState<$S>>)(plh)), (x10.regionarray.DistArray.__1$1x10$regionarray$DistArray$LocalState$1x10$regionarray$DistArray$$T$2$2) null);
        
        //#line 607 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return alloc$125665;
    }
    
    
    //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public <$S, $U>x10.regionarray.DistArray map__0$1x10$regionarray$DistArray$$S$2__1$1x10$regionarray$DistArray$$U$2__2$1x10$regionarray$DistArray$$T$3x10$regionarray$DistArray$$U$3x10$regionarray$DistArray$$S$2(final x10.rtt.Type $S, final x10.rtt.Type $U, final x10.regionarray.DistArray dst, final x10.regionarray.DistArray src, final x10.core.fun.Fun_0_2 op) {
        {
            
            //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.FinishState x10$__var20 = x10.lang.Runtime.startFinish();
            
            //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            try {{
                {
                    
                    //#line 623 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.regionarray.Dist t$125929 = ((x10.regionarray.Dist)(dist));
                    
                    //#line 623 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.lang.PlaceGroup t$125930 = t$125929.places();
                    
                    //#line 623 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.lang.Iterator where$125689 = t$125930.iterator();
                    
                    //#line 623 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 623 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        final boolean t$125938 = ((x10.lang.Iterator<x10.lang.Place>)where$125689).hasNext$O();
                        
                        //#line 623 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        if (!(t$125938)) {
                            
                            //#line 623 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                            break;
                        }
                        
                        //#line 623 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        final x10.lang.Place where$126072 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)where$125689).next$G()));
                        
                        //#line 624 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        x10.lang.Runtime.runAsync(((x10.lang.Place)(where$126072)), ((x10.core.fun.VoidFun_0_0)(new x10.regionarray.DistArray.$Closure$208<$T, $S, $U>($T, $S, $U, ((x10.regionarray.DistArray)(this)), dist, src, dst, op, (x10.regionarray.DistArray.$Closure$208.$_27f33fc1) null))), ((x10.lang.Runtime.Profile)(null)));
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                
                //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var20)));
             }}
            }
        
        //#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return dst;
        }
    
    
    //#line 651 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public <$S, $U>x10.regionarray.DistArray map__0$1x10$regionarray$DistArray$$S$2__1$1x10$regionarray$DistArray$$U$2__3$1x10$regionarray$DistArray$$T$3x10$regionarray$DistArray$$U$3x10$regionarray$DistArray$$S$2(final x10.rtt.Type $S, final x10.rtt.Type $U, final x10.regionarray.DistArray dst, final x10.regionarray.DistArray src, final x10.regionarray.Region filter, final x10.core.fun.Fun_0_2 op) {
        {
            
            //#line 652 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 652 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.FinishState x10$__var21 = x10.lang.Runtime.startFinish();
            
            //#line 652 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            try {{
                {
                    
                    //#line 653 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.regionarray.Dist t$125940 = ((x10.regionarray.Dist)(dist));
                    
                    //#line 653 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.lang.PlaceGroup t$125941 = t$125940.places();
                    
                    //#line 653 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.lang.Iterator where$125693 = t$125941.iterator();
                    
                    //#line 653 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 653 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        final boolean t$125949 = ((x10.lang.Iterator<x10.lang.Place>)where$125693).hasNext$O();
                        
                        //#line 653 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        if (!(t$125949)) {
                            
                            //#line 653 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                            break;
                        }
                        
                        //#line 653 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        final x10.lang.Place where$126087 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)where$125693).next$G()));
                        
                        //#line 654 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        x10.lang.Runtime.runAsync(((x10.lang.Place)(where$126087)), ((x10.core.fun.VoidFun_0_0)(new x10.regionarray.DistArray.$Closure$209<$T, $S, $U>($T, $S, $U, ((x10.regionarray.DistArray)(this)), dist, filter, src, dst, op, (x10.regionarray.DistArray.$Closure$209.$_36d7d2fa) null))), ((x10.lang.Runtime.Profile)(null)));
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 652 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                
                //#line 652 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 652 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var21)));
             }}
            }
        
        //#line 667 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return dst;
        }
    
    
    //#line 682 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public $T reduce__0$1x10$regionarray$DistArray$$T$3x10$regionarray$DistArray$$T$3x10$regionarray$DistArray$$T$2__1x10$regionarray$DistArray$$T$G(final x10.core.fun.Fun_0_2 op, final $T unit) {
        
        //#line 682 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final $T t$125950 = (($T)(this.<$T> reduce__0$1x10$regionarray$DistArray$$U$3x10$regionarray$DistArray$$T$3x10$regionarray$DistArray$$U$2__1$1x10$regionarray$DistArray$$U$3x10$regionarray$DistArray$$U$3x10$regionarray$DistArray$$U$2__2x10$regionarray$DistArray$$U$G($T, ((x10.core.fun.Fun_0_2)(op)), ((x10.core.fun.Fun_0_2)(op)), (($T)(unit)))));
        
        //#line 682 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return t$125950;
    }
    
    
    //#line 696 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public <$U>$U reduce__0$1x10$regionarray$DistArray$$U$3x10$regionarray$DistArray$$T$3x10$regionarray$DistArray$$U$2__1$1x10$regionarray$DistArray$$U$3x10$regionarray$DistArray$$U$3x10$regionarray$DistArray$$U$2__2x10$regionarray$DistArray$$U$G(final x10.rtt.Type $U, final x10.core.fun.Fun_0_2 lop, final x10.core.fun.Fun_0_2 gop, final $U unit) {
        
        //#line 697 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray.Anonymous$27635 reducer = ((x10.regionarray.DistArray.Anonymous$27635)(new x10.regionarray.DistArray.Anonymous$27635<$U, $T>((java.lang.System[]) null, $U, $T)));
        
        //#line 44 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray out$125752 = ((x10.regionarray.DistArray)(this));
        
        //#line 696 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final $U unit$125753 = (($U)(unit));
        
        //#line 696 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.core.fun.Fun_0_2 gop$125754 = ((x10.core.fun.Fun_0_2)(gop));
        
        //#line 44 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ((x10.regionarray.DistArray.Anonymous$27635<$U, $T>)reducer).out$ = out$125752;
        
        //#line 696 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ((x10.regionarray.DistArray.Anonymous$27635<$U, $T>)reducer).unit = (($U)(unit$125753));
        
        //#line 696 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ((x10.regionarray.DistArray.Anonymous$27635<$U, $T>)reducer).gop = gop$125754;
        
        //#line 702 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final $U result;
        {
            
            //#line 702 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.FinishState x10$__var22 = ((x10.lang.FinishState)(x10.lang.Runtime.<$U> startCollectingFinish__0$1x10$lang$Runtime$$T$2($U, ((x10.lang.Reducible)(reducer)))));
            
            //#line 702 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            try {{
                {
                    
                    //#line 703 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.regionarray.Dist t$125952 = ((x10.regionarray.Dist)(dist));
                    
                    //#line 703 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.lang.PlaceGroup t$125953 = t$125952.places();
                    
                    //#line 703 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.lang.Iterator where$125697 = t$125953.iterator();
                    
                    //#line 703 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 703 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        final boolean t$125963 = ((x10.lang.Iterator<x10.lang.Place>)where$125697).hasNext$O();
                        
                        //#line 703 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        if (!(t$125963)) {
                            
                            //#line 703 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                            break;
                        }
                        
                        //#line 703 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        final x10.lang.Place where$126103 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)where$125697).next$G()));
                        
                        //#line 704 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        x10.lang.Runtime.runAsync(((x10.lang.Place)(where$126103)), ((x10.core.fun.VoidFun_0_0)(new x10.regionarray.DistArray.$Closure$210<$T, $U>($T, $U, ((x10.regionarray.DistArray)(this)), dist, unit, lop, (x10.regionarray.DistArray.$Closure$210.__0$1x10$regionarray$DistArray$$Closure$210$$T$2__2x10$regionarray$DistArray$$Closure$210$$U__3$1x10$regionarray$DistArray$$Closure$210$$U$3x10$regionarray$DistArray$$Closure$210$$T$3x10$regionarray$DistArray$$Closure$210$$U$2) null))), ((x10.lang.Runtime.Profile)(null)));
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 702 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                
                //#line 702 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 702 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                 result = (($U)(x10.lang.Runtime.<$U> stopCollectingFinish$G($U, ((x10.lang.FinishState)(x10$__var22)))));
             }}
            }
        
        //#line 716 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return result;
        }
    
    
    //#line 720 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    public java.lang.String toString() {
        
        //#line 721 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125964 = ((x10.regionarray.Dist)(dist));
        
        //#line 721 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final java.lang.String t$125965 = (("DistArray(") + (t$125964));
        
        //#line 721 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final java.lang.String t$125966 = ((t$125965) + (")"));
        
        //#line 721 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return t$125966;
    }
    
    
    //#line 730 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    public x10.lang.Iterator iterator() {
        
        //#line 730 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.DistArray this$125757 = ((x10.regionarray.DistArray)(this));
        
        //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Dist t$125967 = ((x10.regionarray.Dist)(((x10.regionarray.DistArray<$T>)this$125757).dist));
        
        //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.regionarray.Region t$125968 = ((x10.regionarray.Region)(t$125967.region));
        
        //#line 730 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.lang.Iterator t$125969 = t$125968.iterator();
        
        //#line 730 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        final x10.lang.Iterator t$125970 = ((x10.lang.Iterator<x10.lang.Point>)
                                             t$125969);
        
        //#line 730 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return t$125970;
    }
    
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public x10.regionarray.DistArray x10$regionarray$DistArray$$this$x10$regionarray$DistArray() {
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        return x10.regionarray.DistArray.this;
    }
    
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    final public void __fieldInitializers_x10_regionarray_DistArray() {
        
    }
    
    
    //#line 697 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class Anonymous$27635<$U, $T> extends x10.core.Ref implements x10.lang.Reducible, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<Anonymous$27635> $RTT = 
            x10.rtt.NamedType.<Anonymous$27635> make("x10.regionarray.DistArray.Anonymous$27635",
                                                     Anonymous$27635.class,
                                                     2,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.lang.Reducible.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $U; if (i == 1) return $T; return null; }
        
        public static <$U, $T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.DistArray.Anonymous$27635<$U, $T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.unit = $deserializer.readObject();
            $_obj.gop = $deserializer.readObject();
            $_obj.out$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.DistArray.Anonymous$27635 $_obj = new x10.regionarray.DistArray.Anonymous$27635((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$U);
            $serializer.write(this.$T);
            $serializer.write(this.unit);
            $serializer.write(this.gop);
            $serializer.write(this.out$);
            
        }
        
        // constructor just for allocation
        public Anonymous$27635(final java.lang.System[] $dummy, final x10.rtt.Type $U, final x10.rtt.Type $T) {
            x10.regionarray.DistArray.Anonymous$27635.$initParams(this, $U, $T);
            
        }
        
        // dispatcher for method abstract public x10.lang.Reducible[T].operator()(a:T, b:T){}:T
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return $apply__0x10$regionarray$DistArray$Anonymous$27635$$U__1x10$regionarray$DistArray$Anonymous$27635$$U$G(($U)a1, ($U)a2);
            
        }
        
        private x10.rtt.Type $U;
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final Anonymous$27635 $this, final x10.rtt.Type $U, final x10.rtt.Type $T) {
            $this.$U = $U;
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling for __0$1x10$regionarray$DistArray$Anonymous$27635$$T$2__1x10$regionarray$DistArray$Anonymous$27635$$U__2$1x10$regionarray$DistArray$Anonymous$27635$$U$3x10$regionarray$DistArray$Anonymous$27635$$U$3x10$regionarray$DistArray$Anonymous$27635$$U$2
        public static final class $_9b049006 {}
        
    
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        public x10.regionarray.DistArray<$T> out$;
        
        //#line 696 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        public $U unit;
        
        //#line 696 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        public x10.core.fun.Fun_0_2<$U,$U,$U> gop;
        
        
        //#line 698 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        public $U zero$G() {
            
            //#line 698 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final $U t$125971 = (($U)(x10.regionarray.DistArray.Anonymous$27635.this.unit));
            
            //#line 698 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            return t$125971;
        }
        
        
        //#line 699 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        public $U $apply__0x10$regionarray$DistArray$Anonymous$27635$$U__1x10$regionarray$DistArray$Anonymous$27635$$U$G(final $U a, final $U b) {
            
            //#line 699 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.fun.Fun_0_2 t$125972 = x10.regionarray.DistArray.Anonymous$27635.this.gop;
            
            //#line 699 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final $U t$125973 = (($U)((($U)
                                        ((x10.core.fun.Fun_0_2<$U,$U,$U>)t$125972).$apply(a, $U, b, $U))));
            
            //#line 699 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            return t$125973;
        }
        
        
        //#line 697 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        // creation method for java code (1-phase java constructor)
        public Anonymous$27635(final x10.rtt.Type $U, final x10.rtt.Type $T, final x10.regionarray.DistArray<$T> out$, final $U unit, final x10.core.fun.Fun_0_2<$U,$U,$U> gop, $_9b049006 $dummy) {
            this((java.lang.System[]) null, $U, $T);
            x10$regionarray$DistArray$Anonymous$27635$$init$S(out$, unit, gop, (x10.regionarray.DistArray.Anonymous$27635.$_9b049006) null);
        }
        
        // constructor for non-virtual call
        final public x10.regionarray.DistArray.Anonymous$27635<$U, $T> x10$regionarray$DistArray$Anonymous$27635$$init$S(final x10.regionarray.DistArray<$T> out$, final $U unit, final x10.core.fun.Fun_0_2<$U,$U,$U> gop, $_9b049006 $dummy) {
             {
                
                //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                ((x10.regionarray.DistArray.Anonymous$27635<$U, $T>)this).out$ = out$;
                
                //#line 696 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                ((x10.regionarray.DistArray.Anonymous$27635<$U, $T>)this).unit = (($U)(unit));
                
                //#line 696 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                ((x10.regionarray.DistArray.Anonymous$27635<$U, $T>)this).gop = gop;
            }
            return this;
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$199<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$199> $RTT = 
            x10.rtt.StaticFunType.<$Closure$199> make($Closure$199.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.regionarray.DistArray.LocalState.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.DistArray.$Closure$199<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.dist = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.DistArray.$Closure$199 $_obj = new x10.regionarray.DistArray.$Closure$199((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.dist);
            
        }
        
        // constructor just for allocation
        public $Closure$199(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.regionarray.DistArray.$Closure$199.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.regionarray.DistArray.LocalState $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$199 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        public x10.regionarray.DistArray.LocalState $apply() {
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final long t$125788 = this.dist.maxOffset$O();
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final long size = ((t$125788) + (((long)(1L))));
            
            //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.Rail localRaw = ((x10.core.Rail)(new x10.core.Rail<$T>($T, ((long)(size)))));
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.DistArray.LocalState alloc$125655 = ((x10.regionarray.DistArray.LocalState)(new x10.regionarray.DistArray.LocalState<$T>((java.lang.System[]) null, $T)));
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            alloc$125655.x10$regionarray$DistArray$LocalState$$init$S(this.dist, ((x10.core.Rail)(localRaw)), (x10.regionarray.DistArray.LocalState.__1$1x10$regionarray$DistArray$LocalState$$T$2) null);
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            return alloc$125655;
        }
        
        public x10.regionarray.Dist dist;
        
        public $Closure$199(final x10.rtt.Type $T, final x10.regionarray.Dist dist) {
            x10.regionarray.DistArray.$Closure$199.$initParams(this, $T);
             {
                ((x10.regionarray.DistArray.$Closure$199<$T>)this).dist = ((x10.regionarray.Dist)(dist));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$200<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$200> $RTT = 
            x10.rtt.StaticFunType.<$Closure$200> make($Closure$200.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.regionarray.DistArray.LocalState.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.DistArray.$Closure$200<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.dist = $deserializer.readObject();
            $_obj.init = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.DistArray.$Closure$200 $_obj = new x10.regionarray.DistArray.$Closure$200((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.dist);
            $serializer.write(this.init);
            
        }
        
        // constructor just for allocation
        public $Closure$200(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.regionarray.DistArray.$Closure$200.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.regionarray.DistArray.LocalState $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$200 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __1$1x10$lang$Point$3x10$regionarray$DistArray$$Closure$200$$T$2 {}
        
    
        
        public x10.regionarray.DistArray.LocalState $apply() {
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final long t$125793 = this.dist.maxOffset$O();
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final long t$125794 = ((t$125793) + (((long)(1L))));
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.Rail localRaw = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(t$125794)), false)));
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.Region reg = ((x10.regionarray.Region)(this.dist.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.Iterator pt$125996 = reg.iterator();
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            for (;
                 true;
                 ) {
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final boolean t$125997 = ((x10.lang.Iterator<x10.lang.Point>)pt$125996).hasNext$O();
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                if (!(t$125997)) {
                    
                    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    break;
                }
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.lang.Point pt$125993 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)pt$125996).next$G()));
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final long t$125994 = this.dist.offset$O(((x10.lang.Point)(pt$125993)));
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final $T t$125995 = (($T)((($T)
                                            ((x10.core.fun.Fun_0_1<x10.lang.Point,$T>)this.init).$apply(pt$125993, x10.lang.Point.$RTT))));
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                ((x10.core.Rail<$T>)localRaw).$set__1x10$lang$Rail$$T$G((long)(t$125994), (($T)(t$125995)));
            }
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.DistArray.LocalState alloc$125657 = ((x10.regionarray.DistArray.LocalState)(new x10.regionarray.DistArray.LocalState<$T>((java.lang.System[]) null, $T)));
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            alloc$125657.x10$regionarray$DistArray$LocalState$$init$S(this.dist, ((x10.core.Rail)(localRaw)), (x10.regionarray.DistArray.LocalState.__1$1x10$regionarray$DistArray$LocalState$$T$2) null);
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            return alloc$125657;
        }
        
        public x10.regionarray.Dist dist;
        public x10.core.fun.Fun_0_1<x10.lang.Point,$T> init;
        
        public $Closure$200(final x10.rtt.Type $T, final x10.regionarray.Dist dist, final x10.core.fun.Fun_0_1<x10.lang.Point,$T> init, __1$1x10$lang$Point$3x10$regionarray$DistArray$$Closure$200$$T$2 $dummy) {
            x10.regionarray.DistArray.$Closure$200.$initParams(this, $T);
             {
                ((x10.regionarray.DistArray.$Closure$200<$T>)this).dist = ((x10.regionarray.Dist)(dist));
                ((x10.regionarray.DistArray.$Closure$200<$T>)this).init = ((x10.core.fun.Fun_0_1)(init));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$201<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$201> $RTT = 
            x10.rtt.StaticFunType.<$Closure$201> make($Closure$201.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.regionarray.DistArray.LocalState.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.DistArray.$Closure$201<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.dist = $deserializer.readObject();
            $_obj.init = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.DistArray.$Closure$201 $_obj = new x10.regionarray.DistArray.$Closure$201((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.dist);
            $serializer.write(this.init);
            
        }
        
        // constructor just for allocation
        public $Closure$201(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.regionarray.DistArray.$Closure$201.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.regionarray.DistArray.LocalState $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$201 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __1x10$regionarray$DistArray$$Closure$201$$T {}
        
    
        
        public x10.regionarray.DistArray.LocalState $apply() {
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final long t$125803 = this.dist.maxOffset$O();
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final long t$125804 = ((t$125803) + (((long)(1L))));
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.Rail localRaw = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(t$125804)), false)));
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.Region reg = ((x10.regionarray.Region)(this.dist.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.Iterator pt$126001 = reg.iterator();
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            for (;
                 true;
                 ) {
                
                //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final boolean t$126002 = ((x10.lang.Iterator<x10.lang.Point>)pt$126001).hasNext$O();
                
                //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                if (!(t$126002)) {
                    
                    //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    break;
                }
                
                //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.lang.Point pt$125999 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)pt$126001).next$G()));
                
                //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final long t$126000 = this.dist.offset$O(((x10.lang.Point)(pt$125999)));
                
                //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                ((x10.core.Rail<$T>)localRaw).$set__1x10$lang$Rail$$T$G((long)(t$126000), (($T)(this.init)));
            }
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.DistArray.LocalState alloc$125659 = ((x10.regionarray.DistArray.LocalState)(new x10.regionarray.DistArray.LocalState<$T>((java.lang.System[]) null, $T)));
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            alloc$125659.x10$regionarray$DistArray$LocalState$$init$S(this.dist, ((x10.core.Rail)(localRaw)), (x10.regionarray.DistArray.LocalState.__1$1x10$regionarray$DistArray$LocalState$$T$2) null);
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            return alloc$125659;
        }
        
        public x10.regionarray.Dist dist;
        public $T init;
        
        public $Closure$201(final x10.rtt.Type $T, final x10.regionarray.Dist dist, final $T init, __1x10$regionarray$DistArray$$Closure$201$$T $dummy) {
            x10.regionarray.DistArray.$Closure$201.$initParams(this, $T);
             {
                ((x10.regionarray.DistArray.$Closure$201<$T>)this).dist = ((x10.regionarray.Dist)(dist));
                ((x10.regionarray.DistArray.$Closure$201<$T>)this).init = (($T)(init));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$202<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$202> $RTT = 
            x10.rtt.StaticFunType.<$Closure$202> make($Closure$202.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.regionarray.DistArray.LocalState.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.DistArray.$Closure$202<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.a = $deserializer.readObject();
            $_obj.d = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.DistArray.$Closure$202 $_obj = new x10.regionarray.DistArray.$Closure$202((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.a);
            $serializer.write(this.d);
            
        }
        
        // constructor just for allocation
        public $Closure$202(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.regionarray.DistArray.$Closure$202.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.regionarray.DistArray.LocalState $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$202 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$regionarray$DistArray$$Closure$202$$T$2 {}
        
    
        
        public x10.regionarray.DistArray.LocalState $apply() {
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.DistArray.LocalState alloc$125660 = ((x10.regionarray.DistArray.LocalState)(new x10.regionarray.DistArray.LocalState<$T>((java.lang.System[]) null, $T)));
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.PlaceLocalHandle t$126004 = ((x10.lang.PlaceLocalHandle)(((x10.regionarray.DistArray<$T>)this.a).localHandle));
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.DistArray.LocalState t$126005 = ((x10.lang.PlaceLocalHandle<x10.regionarray.DistArray.LocalState<$T>>)t$126004).$apply$G();
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.Rail t$126006 = ((x10.core.Rail)(((x10.regionarray.DistArray.LocalState<$T>)t$126005).data));
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            alloc$125660.x10$regionarray$DistArray$LocalState$$init$S(this.d, t$126006, (x10.regionarray.DistArray.LocalState.__1$1x10$regionarray$DistArray$LocalState$$T$2) null);
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            return alloc$125660;
        }
        
        public x10.regionarray.DistArray<$T> a;
        public x10.regionarray.Dist d;
        
        public $Closure$202(final x10.rtt.Type $T, final x10.regionarray.DistArray<$T> a, final x10.regionarray.Dist d, __0$1x10$regionarray$DistArray$$Closure$202$$T$2 $dummy) {
            x10.regionarray.DistArray.$Closure$202.$initParams(this, $T);
             {
                ((x10.regionarray.DistArray.$Closure$202<$T>)this).a = ((x10.regionarray.DistArray)(a));
                ((x10.regionarray.DistArray.$Closure$202<$T>)this).d = ((x10.regionarray.Dist)(d));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$203<$T> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$203> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$203> make($Closure$203.class,
                                                          1,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.DistArray.$Closure$203<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.dist = $deserializer.readObject();
            $_obj.v = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.DistArray.$Closure$203 $_obj = new x10.regionarray.DistArray.$Closure$203((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.out$$);
            $serializer.write(this.dist);
            $serializer.write(this.v);
            
        }
        
        // constructor just for allocation
        public $Closure$203(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.regionarray.DistArray.$Closure$203.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$203 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$regionarray$DistArray$$Closure$203$$T$2__2x10$regionarray$DistArray$$Closure$203$$T {}
        
    
        
        public void $apply() {
            
            //#line 495 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            try {{
                
                //#line 496 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.Dist t$126015 = ((x10.regionarray.Dist)(this.dist));
                
                //#line 496 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.Region reg$126016 = ((x10.regionarray.Region)(t$126015.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
                
                //#line 497 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.core.Rail rail$126017 = ((x10.core.Rail)(((x10.regionarray.DistArray<$T>)this.out$$).raw));
                
                //#line 498 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.lang.Iterator pt$126012 = reg$126016.iterator();
                
                //#line 498 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 498 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final boolean t$126013 = ((x10.lang.Iterator<x10.lang.Point>)pt$126012).hasNext$O();
                    
                    //#line 498 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    if (!(t$126013)) {
                        
                        //#line 498 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        break;
                    }
                    
                    //#line 498 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.lang.Point pt$126009 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)pt$126012).next$G()));
                    
                    //#line 499 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.regionarray.Dist t$126010 = ((x10.regionarray.Dist)(this.dist));
                    
                    //#line 499 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final long t$126011 = t$126010.offset$O(((x10.lang.Point)(pt$126009)));
                    
                    //#line 499 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    ((x10.core.Rail<$T>)rail$126017).$set__1x10$lang$Rail$$T$G((long)(t$126011), (($T)(this.v)));
                }
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 495 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 495 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.regionarray.DistArray<$T> out$$;
        public x10.regionarray.Dist dist;
        public $T v;
        
        public $Closure$203(final x10.rtt.Type $T, final x10.regionarray.DistArray<$T> out$$, final x10.regionarray.Dist dist, final $T v, __0$1x10$regionarray$DistArray$$Closure$203$$T$2__2x10$regionarray$DistArray$$Closure$203$$T $dummy) {
            x10.regionarray.DistArray.$Closure$203.$initParams(this, $T);
             {
                ((x10.regionarray.DistArray.$Closure$203<$T>)this).out$$ = out$$;
                ((x10.regionarray.DistArray.$Closure$203<$T>)this).dist = ((x10.regionarray.Dist)(dist));
                ((x10.regionarray.DistArray.$Closure$203<$T>)this).v = (($T)(v));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$204<$T, $U> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$204> $RTT = 
            x10.rtt.StaticFunType.<$Closure$204> make($Closure$204.class,
                                                      2,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.regionarray.DistArray.LocalState.$RTT, x10.rtt.UnresolvedType.PARAM(1)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $U; return null; }
        
        public static <$T, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.DistArray.$Closure$204<$T, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.dist = $deserializer.readObject();
            $_obj.op = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.DistArray.$Closure$204 $_obj = new x10.regionarray.DistArray.$Closure$204((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.$U);
            $serializer.write(this.out$$);
            $serializer.write(this.dist);
            $serializer.write(this.op);
            
        }
        
        // constructor just for allocation
        public $Closure$204(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            x10.regionarray.DistArray.$Closure$204.$initParams(this, $T, $U);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.regionarray.DistArray.LocalState $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$204 $this, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            $this.$T = $T;
            $this.$U = $U;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$regionarray$DistArray$$Closure$204$$T$2__2$1x10$regionarray$DistArray$$Closure$204$$T$3x10$regionarray$DistArray$$Closure$204$$U$2 {}
        
    
        
        public x10.regionarray.DistArray.LocalState $apply() {
            
            //#line 516 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.DistArray this$125746 = ((x10.regionarray.DistArray)(this.out$$));
            
            //#line 516 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.Rail srcRail = ((x10.core.Rail)(((x10.regionarray.DistArray<$T>)this$125746).raw));
            
            //#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.Dist t$125880 = ((x10.regionarray.Dist)(this.dist));
            
            //#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final long t$125881 = t$125880.maxOffset$O();
            
            //#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final long t$125882 = ((t$125881) + (((long)(1L))));
            
            //#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.Rail newRail = ((x10.core.Rail)(x10.core.Rail.<$U>makeUnsafe($U, ((long)(t$125882)), false)));
            
            //#line 518 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.Dist t$125883 = ((x10.regionarray.Dist)(this.dist));
            
            //#line 518 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.Region reg = ((x10.regionarray.Region)(t$125883.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
            
            //#line 519 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.Iterator pt$126023 = reg.iterator();
            
            //#line 519 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            for (;
                 true;
                 ) {
                
                //#line 519 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final boolean t$126024 = ((x10.lang.Iterator<x10.lang.Point>)pt$126023).hasNext$O();
                
                //#line 519 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                if (!(t$126024)) {
                    
                    //#line 519 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    break;
                }
                
                //#line 519 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.lang.Point pt$126018 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)pt$126023).next$G()));
                
                //#line 520 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.Dist t$126019 = ((x10.regionarray.Dist)(this.dist));
                
                //#line 520 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final long offset$126020 = t$126019.offset$O(((x10.lang.Point)(pt$126018)));
                
                //#line 521 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final $T t$126021 = (($T)(((x10.core.Rail<$T>)srcRail).$apply$G((long)(offset$126020))));
                
                //#line 521 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final $U t$126022 = (($U)((($U)
                                            ((x10.core.fun.Fun_0_1<$T,$U>)this.op).$apply(t$126021, $T))));
                
                //#line 521 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                ((x10.core.Rail<$U>)newRail).$set__1x10$lang$Rail$$T$G((long)(offset$126020), (($U)(t$126022)));
            }
            
            //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.DistArray.LocalState alloc$125662 = ((x10.regionarray.DistArray.LocalState)(new x10.regionarray.DistArray.LocalState<$U>((java.lang.System[]) null, $U)));
            
            //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.Dist t$126025 = ((x10.regionarray.Dist)(this.dist));
            
            //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            alloc$125662.x10$regionarray$DistArray$LocalState$$init$S(((x10.regionarray.Dist)(t$126025)), ((x10.core.Rail)(newRail)), (x10.regionarray.DistArray.LocalState.__1$1x10$regionarray$DistArray$LocalState$$T$2) null);
            
            //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            return alloc$125662;
        }
        
        public x10.regionarray.DistArray<$T> out$$;
        public x10.regionarray.Dist dist;
        public x10.core.fun.Fun_0_1<$T,$U> op;
        
        public $Closure$204(final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.regionarray.DistArray<$T> out$$, final x10.regionarray.Dist dist, final x10.core.fun.Fun_0_1<$T,$U> op, __0$1x10$regionarray$DistArray$$Closure$204$$T$2__2$1x10$regionarray$DistArray$$Closure$204$$T$3x10$regionarray$DistArray$$Closure$204$$U$2 $dummy) {
            x10.regionarray.DistArray.$Closure$204.$initParams(this, $T, $U);
             {
                ((x10.regionarray.DistArray.$Closure$204<$T, $U>)this).out$$ = out$$;
                ((x10.regionarray.DistArray.$Closure$204<$T, $U>)this).dist = ((x10.regionarray.Dist)(dist));
                ((x10.regionarray.DistArray.$Closure$204<$T, $U>)this).op = ((x10.core.fun.Fun_0_1)(op));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$205<$T, $U> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$205> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$205> make($Closure$205.class,
                                                          2,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $U; return null; }
        
        public static <$T, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.DistArray.$Closure$205<$T, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.dist = $deserializer.readObject();
            $_obj.dst = $deserializer.readObject();
            $_obj.op = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.DistArray.$Closure$205 $_obj = new x10.regionarray.DistArray.$Closure$205((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.$U);
            $serializer.write(this.out$$);
            $serializer.write(this.dist);
            $serializer.write(this.dst);
            $serializer.write(this.op);
            
        }
        
        // constructor just for allocation
        public $Closure$205(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            x10.regionarray.DistArray.$Closure$205.$initParams(this, $T, $U);
            
        }
        
        private x10.rtt.Type $T;
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$205 $this, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            $this.$T = $T;
            $this.$U = $U;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$regionarray$DistArray$$Closure$205$$T$2__2$1x10$regionarray$DistArray$$Closure$205$$U$2__3$1x10$regionarray$DistArray$$Closure$205$$T$3x10$regionarray$DistArray$$Closure$205$$U$2 {}
        
    
        
        public void $apply() {
            
            //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            try {{
                
                //#line 542 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.Dist t$126035 = ((x10.regionarray.Dist)(this.dist));
                
                //#line 542 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.Region reg$126036 = ((x10.regionarray.Region)(t$126035.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
                
                //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.DistArray this$126037 = ((x10.regionarray.DistArray)(this.out$$));
                
                //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.core.Rail srcRail$126038 = ((x10.core.Rail)(((x10.regionarray.DistArray<$T>)this$126037).raw));
                
                //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.core.Rail dstRail$126039 = ((x10.core.Rail)(((x10.regionarray.DistArray<$U>)this.dst).raw));
                
                //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.lang.Iterator pt$126032 = reg$126036.iterator();
                
                //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final boolean t$126033 = ((x10.lang.Iterator<x10.lang.Point>)pt$126032).hasNext$O();
                    
                    //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    if (!(t$126033)) {
                        
                        //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        break;
                    }
                    
                    //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.lang.Point pt$126027 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)pt$126032).next$G()));
                    
                    //#line 546 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.regionarray.Dist t$126028 = ((x10.regionarray.Dist)(this.dist));
                    
                    //#line 546 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final long offset$126029 = t$126028.offset$O(((x10.lang.Point)(pt$126027)));
                    
                    //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final $T t$126030 = (($T)(((x10.core.Rail<$T>)srcRail$126038).$apply$G((long)(offset$126029))));
                    
                    //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final $U t$126031 = (($U)((($U)
                                                ((x10.core.fun.Fun_0_1<$T,$U>)this.op).$apply(t$126030, $T))));
                    
                    //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    ((x10.core.Rail<$U>)dstRail$126039).$set__1x10$lang$Rail$$T$G((long)(offset$126029), (($U)(t$126031)));
                }
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.regionarray.DistArray<$T> out$$;
        public x10.regionarray.Dist dist;
        public x10.regionarray.DistArray<$U> dst;
        public x10.core.fun.Fun_0_1<$T,$U> op;
        
        public $Closure$205(final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.regionarray.DistArray<$T> out$$, final x10.regionarray.Dist dist, final x10.regionarray.DistArray<$U> dst, final x10.core.fun.Fun_0_1<$T,$U> op, __0$1x10$regionarray$DistArray$$Closure$205$$T$2__2$1x10$regionarray$DistArray$$Closure$205$$U$2__3$1x10$regionarray$DistArray$$Closure$205$$T$3x10$regionarray$DistArray$$Closure$205$$U$2 $dummy) {
            x10.regionarray.DistArray.$Closure$205.$initParams(this, $T, $U);
             {
                ((x10.regionarray.DistArray.$Closure$205<$T, $U>)this).out$$ = out$$;
                ((x10.regionarray.DistArray.$Closure$205<$T, $U>)this).dist = ((x10.regionarray.Dist)(dist));
                ((x10.regionarray.DistArray.$Closure$205<$T, $U>)this).dst = ((x10.regionarray.DistArray)(dst));
                ((x10.regionarray.DistArray.$Closure$205<$T, $U>)this).op = ((x10.core.fun.Fun_0_1)(op));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$206<$T, $U> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$206> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$206> make($Closure$206.class,
                                                          2,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $U; return null; }
        
        public static <$T, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.DistArray.$Closure$206<$T, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.dist = $deserializer.readObject();
            $_obj.filter = $deserializer.readObject();
            $_obj.dst = $deserializer.readObject();
            $_obj.op = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.DistArray.$Closure$206 $_obj = new x10.regionarray.DistArray.$Closure$206((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.$U);
            $serializer.write(this.out$$);
            $serializer.write(this.dist);
            $serializer.write(this.filter);
            $serializer.write(this.dst);
            $serializer.write(this.op);
            
        }
        
        // constructor just for allocation
        public $Closure$206(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            x10.regionarray.DistArray.$Closure$206.$initParams(this, $T, $U);
            
        }
        
        private x10.rtt.Type $T;
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$206 $this, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            $this.$T = $T;
            $this.$U = $U;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$regionarray$DistArray$$Closure$206$$T$2__3$1x10$regionarray$DistArray$$Closure$206$$U$2__4$1x10$regionarray$DistArray$$Closure$206$$T$3x10$regionarray$DistArray$$Closure$206$$U$2 {}
        
    
        
        public void $apply() {
            
            //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            try {{
                
                //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.Dist t$126048 = ((x10.regionarray.Dist)(this.dist));
                
                //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.Region reg$126049 = ((x10.regionarray.Region)(t$126048.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
                
                //#line 572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.Region freg$126050 = ((x10.regionarray.Region)(reg$126049.$and(((x10.regionarray.Region)(this.filter)))));
                
                //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.DistArray this$126051 = ((x10.regionarray.DistArray)(this.out$$));
                
                //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.core.Rail srcRail$126052 = ((x10.core.Rail)(((x10.regionarray.DistArray<$T>)this$126051).raw));
                
                //#line 574 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.core.Rail dstRail$126053 = ((x10.core.Rail)(((x10.regionarray.DistArray<$U>)this.dst).raw));
                
                //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.lang.Iterator pt$126045 = freg$126050.iterator();
                
                //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final boolean t$126046 = ((x10.lang.Iterator<x10.lang.Point>)pt$126045).hasNext$O();
                    
                    //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    if (!(t$126046)) {
                        
                        //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        break;
                    }
                    
                    //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.lang.Point pt$126040 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)pt$126045).next$G()));
                    
                    //#line 576 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.regionarray.Dist t$126041 = ((x10.regionarray.Dist)(this.dist));
                    
                    //#line 576 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final long offset$126042 = t$126041.offset$O(((x10.lang.Point)(pt$126040)));
                    
                    //#line 577 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final $T t$126043 = (($T)(((x10.core.Rail<$T>)srcRail$126052).$apply$G((long)(offset$126042))));
                    
                    //#line 577 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final $U t$126044 = (($U)((($U)
                                                ((x10.core.fun.Fun_0_1<$T,$U>)this.op).$apply(t$126043, $T))));
                    
                    //#line 577 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    ((x10.core.Rail<$U>)dstRail$126053).$set__1x10$lang$Rail$$T$G((long)(offset$126042), (($U)(t$126044)));
                }
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.regionarray.DistArray<$T> out$$;
        public x10.regionarray.Dist dist;
        public x10.regionarray.Region filter;
        public x10.regionarray.DistArray<$U> dst;
        public x10.core.fun.Fun_0_1<$T,$U> op;
        
        public $Closure$206(final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.regionarray.DistArray<$T> out$$, final x10.regionarray.Dist dist, final x10.regionarray.Region filter, final x10.regionarray.DistArray<$U> dst, final x10.core.fun.Fun_0_1<$T,$U> op, __0$1x10$regionarray$DistArray$$Closure$206$$T$2__3$1x10$regionarray$DistArray$$Closure$206$$U$2__4$1x10$regionarray$DistArray$$Closure$206$$T$3x10$regionarray$DistArray$$Closure$206$$U$2 $dummy) {
            x10.regionarray.DistArray.$Closure$206.$initParams(this, $T, $U);
             {
                ((x10.regionarray.DistArray.$Closure$206<$T, $U>)this).out$$ = out$$;
                ((x10.regionarray.DistArray.$Closure$206<$T, $U>)this).dist = ((x10.regionarray.Dist)(dist));
                ((x10.regionarray.DistArray.$Closure$206<$T, $U>)this).filter = ((x10.regionarray.Region)(filter));
                ((x10.regionarray.DistArray.$Closure$206<$T, $U>)this).dst = ((x10.regionarray.DistArray)(dst));
                ((x10.regionarray.DistArray.$Closure$206<$T, $U>)this).op = ((x10.core.fun.Fun_0_1)(op));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$207<$T, $S, $U> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$207> $RTT = 
            x10.rtt.StaticFunType.<$Closure$207> make($Closure$207.class,
                                                      3,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.regionarray.DistArray.LocalState.$RTT, x10.rtt.UnresolvedType.PARAM(1)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $S; if (i == 2) return $U; return null; }
        
        public static <$T, $S, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.DistArray.$Closure$207<$T, $S, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$S = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.src = $deserializer.readObject();
            $_obj.dist = $deserializer.readObject();
            $_obj.op = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.DistArray.$Closure$207 $_obj = new x10.regionarray.DistArray.$Closure$207((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.$S);
            $serializer.write(this.$U);
            $serializer.write(this.out$$);
            $serializer.write(this.src);
            $serializer.write(this.dist);
            $serializer.write(this.op);
            
        }
        
        // constructor just for allocation
        public $Closure$207(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $S, final x10.rtt.Type $U) {
            x10.regionarray.DistArray.$Closure$207.$initParams(this, $T, $S, $U);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.regionarray.DistArray.LocalState $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        private x10.rtt.Type $S;
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$207 $this, final x10.rtt.Type $T, final x10.rtt.Type $S, final x10.rtt.Type $U) {
            $this.$T = $T;
            $this.$S = $S;
            $this.$U = $U;
            
        }
        // synthetic type for parameter mangling for __0$1x10$regionarray$DistArray$$Closure$207$$T$2__1$1x10$regionarray$DistArray$$Closure$207$$U$2__3$1x10$regionarray$DistArray$$Closure$207$$T$3x10$regionarray$DistArray$$Closure$207$$U$3x10$regionarray$DistArray$$Closure$207$$S$2
        public static final class $_737e846f {}
        
    
        
        public x10.regionarray.DistArray.LocalState $apply() {
            
            //#line 597 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.DistArray this$125749 = ((x10.regionarray.DistArray)(this.out$$));
            
            //#line 597 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.Rail src1Rail = ((x10.core.Rail)(((x10.regionarray.DistArray<$T>)this$125749).raw));
            
            //#line 598 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.Rail src2Rail = ((x10.core.Rail)(((x10.regionarray.DistArray<$U>)this.src).raw));
            
            //#line 599 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.Dist t$125914 = ((x10.regionarray.Dist)(this.dist));
            
            //#line 599 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final long t$125915 = t$125914.maxOffset$O();
            
            //#line 599 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final long t$125916 = ((t$125915) + (((long)(1L))));
            
            //#line 599 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.core.Rail newRail = ((x10.core.Rail)(x10.core.Rail.<$S>makeUnsafe($S, ((long)(t$125916)), false)));
            
            //#line 600 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.Dist t$125917 = ((x10.regionarray.Dist)(this.dist));
            
            //#line 600 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.Region reg = ((x10.regionarray.Region)(t$125917.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
            
            //#line 601 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.lang.Iterator pt$126060 = reg.iterator();
            
            //#line 601 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            for (;
                 true;
                 ) {
                
                //#line 601 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final boolean t$126061 = ((x10.lang.Iterator<x10.lang.Point>)pt$126060).hasNext$O();
                
                //#line 601 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                if (!(t$126061)) {
                    
                    //#line 601 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    break;
                }
                
                //#line 601 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.lang.Point pt$126054 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)pt$126060).next$G()));
                
                //#line 602 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.Dist t$126055 = ((x10.regionarray.Dist)(this.dist));
                
                //#line 602 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final long offset$126056 = t$126055.offset$O(((x10.lang.Point)(pt$126054)));
                
                //#line 603 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final $T t$126057 = (($T)(((x10.core.Rail<$T>)src1Rail).$apply$G((long)(offset$126056))));
                
                //#line 603 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final $U t$126058 = (($U)(((x10.core.Rail<$U>)src2Rail).$apply$G((long)(offset$126056))));
                
                //#line 603 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final $S t$126059 = (($S)((($S)
                                            ((x10.core.fun.Fun_0_2<$T,$U,$S>)this.op).$apply(t$126057, $T, t$126058, $U))));
                
                //#line 603 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                ((x10.core.Rail<$S>)newRail).$set__1x10$lang$Rail$$T$G((long)(offset$126056), (($S)(t$126059)));
            }
            
            //#line 605 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.DistArray.LocalState alloc$125664 = ((x10.regionarray.DistArray.LocalState)(new x10.regionarray.DistArray.LocalState<$S>((java.lang.System[]) null, $S)));
            
            //#line 605 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            final x10.regionarray.Dist t$126062 = ((x10.regionarray.Dist)(this.dist));
            
            //#line 605 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            alloc$125664.x10$regionarray$DistArray$LocalState$$init$S(((x10.regionarray.Dist)(t$126062)), ((x10.core.Rail)(newRail)), (x10.regionarray.DistArray.LocalState.__1$1x10$regionarray$DistArray$LocalState$$T$2) null);
            
            //#line 605 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            return alloc$125664;
        }
        
        public x10.regionarray.DistArray<$T> out$$;
        public x10.regionarray.DistArray<$U> src;
        public x10.regionarray.Dist dist;
        public x10.core.fun.Fun_0_2<$T,$U,$S> op;
        
        public $Closure$207(final x10.rtt.Type $T, final x10.rtt.Type $S, final x10.rtt.Type $U, final x10.regionarray.DistArray<$T> out$$, final x10.regionarray.DistArray<$U> src, final x10.regionarray.Dist dist, final x10.core.fun.Fun_0_2<$T,$U,$S> op, $_737e846f $dummy) {
            x10.regionarray.DistArray.$Closure$207.$initParams(this, $T, $S, $U);
             {
                ((x10.regionarray.DistArray.$Closure$207<$T, $S, $U>)this).out$$ = out$$;
                ((x10.regionarray.DistArray.$Closure$207<$T, $S, $U>)this).src = ((x10.regionarray.DistArray)(src));
                ((x10.regionarray.DistArray.$Closure$207<$T, $S, $U>)this).dist = ((x10.regionarray.Dist)(dist));
                ((x10.regionarray.DistArray.$Closure$207<$T, $S, $U>)this).op = ((x10.core.fun.Fun_0_2)(op));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$208<$T, $S, $U> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$208> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$208> make($Closure$208.class,
                                                          3,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $S; if (i == 2) return $U; return null; }
        
        public static <$T, $S, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.DistArray.$Closure$208<$T, $S, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$S = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.dist = $deserializer.readObject();
            $_obj.src = $deserializer.readObject();
            $_obj.dst = $deserializer.readObject();
            $_obj.op = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.DistArray.$Closure$208 $_obj = new x10.regionarray.DistArray.$Closure$208((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.$S);
            $serializer.write(this.$U);
            $serializer.write(this.out$$);
            $serializer.write(this.dist);
            $serializer.write(this.src);
            $serializer.write(this.dst);
            $serializer.write(this.op);
            
        }
        
        // constructor just for allocation
        public $Closure$208(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $S, final x10.rtt.Type $U) {
            x10.regionarray.DistArray.$Closure$208.$initParams(this, $T, $S, $U);
            
        }
        
        private x10.rtt.Type $T;
        private x10.rtt.Type $S;
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$208 $this, final x10.rtt.Type $T, final x10.rtt.Type $S, final x10.rtt.Type $U) {
            $this.$T = $T;
            $this.$S = $S;
            $this.$U = $U;
            
        }
        // synthetic type for parameter mangling for __0$1x10$regionarray$DistArray$$Closure$208$$T$2__2$1x10$regionarray$DistArray$$Closure$208$$U$2__3$1x10$regionarray$DistArray$$Closure$208$$S$2__4$1x10$regionarray$DistArray$$Closure$208$$T$3x10$regionarray$DistArray$$Closure$208$$U$3x10$regionarray$DistArray$$Closure$208$$S$2
        public static final class $_27f33fc1 {}
        
    
        
        public void $apply() {
            
            //#line 624 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            try {{
                
                //#line 625 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.Dist t$126073 = ((x10.regionarray.Dist)(this.dist));
                
                //#line 625 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.Region reg$126074 = ((x10.regionarray.Region)(t$126073.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
                
                //#line 626 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.DistArray this$126075 = ((x10.regionarray.DistArray)(this.out$$));
                
                //#line 626 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.core.Rail src1Rail$126076 = ((x10.core.Rail)(((x10.regionarray.DistArray<$T>)this$126075).raw));
                
                //#line 627 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.core.Rail src2Rail$126077 = ((x10.core.Rail)(((x10.regionarray.DistArray<$U>)this.src).raw));
                
                //#line 628 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.core.Rail dstRail$126078 = ((x10.core.Rail)(((x10.regionarray.DistArray<$S>)this.dst).raw));
                
                //#line 629 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.lang.Iterator pt$126070 = reg$126074.iterator();
                
                //#line 629 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 629 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final boolean t$126071 = ((x10.lang.Iterator<x10.lang.Point>)pt$126070).hasNext$O();
                    
                    //#line 629 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    if (!(t$126071)) {
                        
                        //#line 629 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        break;
                    }
                    
                    //#line 629 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.lang.Point pt$126064 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)pt$126070).next$G()));
                    
                    //#line 630 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.regionarray.Dist t$126065 = ((x10.regionarray.Dist)(this.dist));
                    
                    //#line 630 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final long offset$126066 = t$126065.offset$O(((x10.lang.Point)(pt$126064)));
                    
                    //#line 631 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final $T t$126067 = (($T)(((x10.core.Rail<$T>)src1Rail$126076).$apply$G((long)(offset$126066))));
                    
                    //#line 631 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final $U t$126068 = (($U)(((x10.core.Rail<$U>)src2Rail$126077).$apply$G((long)(offset$126066))));
                    
                    //#line 631 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final $S t$126069 = (($S)((($S)
                                                ((x10.core.fun.Fun_0_2<$T,$U,$S>)this.op).$apply(t$126067, $T, t$126068, $U))));
                    
                    //#line 631 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    ((x10.core.Rail<$S>)dstRail$126078).$set__1x10$lang$Rail$$T$G((long)(offset$126066), (($S)(t$126069)));
                }
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 624 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 624 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.regionarray.DistArray<$T> out$$;
        public x10.regionarray.Dist dist;
        public x10.regionarray.DistArray<$U> src;
        public x10.regionarray.DistArray<$S> dst;
        public x10.core.fun.Fun_0_2<$T,$U,$S> op;
        
        public $Closure$208(final x10.rtt.Type $T, final x10.rtt.Type $S, final x10.rtt.Type $U, final x10.regionarray.DistArray<$T> out$$, final x10.regionarray.Dist dist, final x10.regionarray.DistArray<$U> src, final x10.regionarray.DistArray<$S> dst, final x10.core.fun.Fun_0_2<$T,$U,$S> op, $_27f33fc1 $dummy) {
            x10.regionarray.DistArray.$Closure$208.$initParams(this, $T, $S, $U);
             {
                ((x10.regionarray.DistArray.$Closure$208<$T, $S, $U>)this).out$$ = out$$;
                ((x10.regionarray.DistArray.$Closure$208<$T, $S, $U>)this).dist = ((x10.regionarray.Dist)(dist));
                ((x10.regionarray.DistArray.$Closure$208<$T, $S, $U>)this).src = ((x10.regionarray.DistArray)(src));
                ((x10.regionarray.DistArray.$Closure$208<$T, $S, $U>)this).dst = ((x10.regionarray.DistArray)(dst));
                ((x10.regionarray.DistArray.$Closure$208<$T, $S, $U>)this).op = ((x10.core.fun.Fun_0_2)(op));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$209<$T, $S, $U> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$209> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$209> make($Closure$209.class,
                                                          3,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $S; if (i == 2) return $U; return null; }
        
        public static <$T, $S, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.DistArray.$Closure$209<$T, $S, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$S = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.dist = $deserializer.readObject();
            $_obj.filter = $deserializer.readObject();
            $_obj.src = $deserializer.readObject();
            $_obj.dst = $deserializer.readObject();
            $_obj.op = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.DistArray.$Closure$209 $_obj = new x10.regionarray.DistArray.$Closure$209((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.$S);
            $serializer.write(this.$U);
            $serializer.write(this.out$$);
            $serializer.write(this.dist);
            $serializer.write(this.filter);
            $serializer.write(this.src);
            $serializer.write(this.dst);
            $serializer.write(this.op);
            
        }
        
        // constructor just for allocation
        public $Closure$209(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $S, final x10.rtt.Type $U) {
            x10.regionarray.DistArray.$Closure$209.$initParams(this, $T, $S, $U);
            
        }
        
        private x10.rtt.Type $T;
        private x10.rtt.Type $S;
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$209 $this, final x10.rtt.Type $T, final x10.rtt.Type $S, final x10.rtt.Type $U) {
            $this.$T = $T;
            $this.$S = $S;
            $this.$U = $U;
            
        }
        // synthetic type for parameter mangling for __0$1x10$regionarray$DistArray$$Closure$209$$T$2__3$1x10$regionarray$DistArray$$Closure$209$$U$2__4$1x10$regionarray$DistArray$$Closure$209$$S$2__5$1x10$regionarray$DistArray$$Closure$209$$T$3x10$regionarray$DistArray$$Closure$209$$U$3x10$regionarray$DistArray$$Closure$209$$S$2
        public static final class $_36d7d2fa {}
        
    
        
        public void $apply() {
            
            //#line 654 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            try {{
                
                //#line 655 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.Dist t$126088 = ((x10.regionarray.Dist)(this.dist));
                
                //#line 655 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.Region reg$126089 = ((x10.regionarray.Region)(t$126088.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
                
                //#line 656 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.Region freg$126090 = ((x10.regionarray.Region)(reg$126089.$and(((x10.regionarray.Region)(this.filter)))));
                
                //#line 657 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.DistArray this$126091 = ((x10.regionarray.DistArray)(this.out$$));
                
                //#line 657 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.core.Rail src1Rail$126092 = ((x10.core.Rail)(((x10.regionarray.DistArray<$T>)this$126091).raw));
                
                //#line 658 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.core.Rail src2Rail$126093 = ((x10.core.Rail)(((x10.regionarray.DistArray<$U>)this.src).raw));
                
                //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.core.Rail dstRail$126094 = ((x10.core.Rail)(((x10.regionarray.DistArray<$S>)this.dst).raw));
                
                //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.lang.Iterator pt$126085 = freg$126090.iterator();
                
                //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final boolean t$126086 = ((x10.lang.Iterator<x10.lang.Point>)pt$126085).hasNext$O();
                    
                    //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    if (!(t$126086)) {
                        
                        //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        break;
                    }
                    
                    //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.lang.Point pt$126079 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)pt$126085).next$G()));
                    
                    //#line 661 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.regionarray.Dist t$126080 = ((x10.regionarray.Dist)(this.dist));
                    
                    //#line 661 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final long offset$126081 = t$126080.offset$O(((x10.lang.Point)(pt$126079)));
                    
                    //#line 662 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final $T t$126082 = (($T)(((x10.core.Rail<$T>)src1Rail$126092).$apply$G((long)(offset$126081))));
                    
                    //#line 662 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final $U t$126083 = (($U)(((x10.core.Rail<$U>)src2Rail$126093).$apply$G((long)(offset$126081))));
                    
                    //#line 662 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final $S t$126084 = (($S)((($S)
                                                ((x10.core.fun.Fun_0_2<$T,$U,$S>)this.op).$apply(t$126082, $T, t$126083, $U))));
                    
                    //#line 662 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    ((x10.core.Rail<$S>)dstRail$126094).$set__1x10$lang$Rail$$T$G((long)(offset$126081), (($S)(t$126084)));
                }
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 654 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 654 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.regionarray.DistArray<$T> out$$;
        public x10.regionarray.Dist dist;
        public x10.regionarray.Region filter;
        public x10.regionarray.DistArray<$U> src;
        public x10.regionarray.DistArray<$S> dst;
        public x10.core.fun.Fun_0_2<$T,$U,$S> op;
        
        public $Closure$209(final x10.rtt.Type $T, final x10.rtt.Type $S, final x10.rtt.Type $U, final x10.regionarray.DistArray<$T> out$$, final x10.regionarray.Dist dist, final x10.regionarray.Region filter, final x10.regionarray.DistArray<$U> src, final x10.regionarray.DistArray<$S> dst, final x10.core.fun.Fun_0_2<$T,$U,$S> op, $_36d7d2fa $dummy) {
            x10.regionarray.DistArray.$Closure$209.$initParams(this, $T, $S, $U);
             {
                ((x10.regionarray.DistArray.$Closure$209<$T, $S, $U>)this).out$$ = out$$;
                ((x10.regionarray.DistArray.$Closure$209<$T, $S, $U>)this).dist = ((x10.regionarray.Dist)(dist));
                ((x10.regionarray.DistArray.$Closure$209<$T, $S, $U>)this).filter = ((x10.regionarray.Region)(filter));
                ((x10.regionarray.DistArray.$Closure$209<$T, $S, $U>)this).src = ((x10.regionarray.DistArray)(src));
                ((x10.regionarray.DistArray.$Closure$209<$T, $S, $U>)this).dst = ((x10.regionarray.DistArray)(dst));
                ((x10.regionarray.DistArray.$Closure$209<$T, $S, $U>)this).op = ((x10.core.fun.Fun_0_2)(op));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$210<$T, $U> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$210> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$210> make($Closure$210.class,
                                                          2,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $U; return null; }
        
        public static <$T, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.DistArray.$Closure$210<$T, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.dist = $deserializer.readObject();
            $_obj.unit = $deserializer.readObject();
            $_obj.lop = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.DistArray.$Closure$210 $_obj = new x10.regionarray.DistArray.$Closure$210((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.$U);
            $serializer.write(this.out$$);
            $serializer.write(this.dist);
            $serializer.write(this.unit);
            $serializer.write(this.lop);
            
        }
        
        // constructor just for allocation
        public $Closure$210(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            x10.regionarray.DistArray.$Closure$210.$initParams(this, $T, $U);
            
        }
        
        private x10.rtt.Type $T;
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$210 $this, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            $this.$T = $T;
            $this.$U = $U;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$regionarray$DistArray$$Closure$210$$T$2__2x10$regionarray$DistArray$$Closure$210$$U__3$1x10$regionarray$DistArray$$Closure$210$$U$3x10$regionarray$DistArray$$Closure$210$$T$3x10$regionarray$DistArray$$Closure$210$$U$2 {}
        
    
        
        public void $apply() {
            
            //#line 704 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            try {{
                
                //#line 705 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.Dist t$126104 = ((x10.regionarray.Dist)(this.dist));
                
                //#line 705 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.Region reg$126105 = ((x10.regionarray.Region)(t$126104.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
                
                //#line 706 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                $U localRes$126106 = (($U)(this.unit));
                
                //#line 707 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.regionarray.DistArray this$126107 = ((x10.regionarray.DistArray)(this.out$$));
                
                //#line 707 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.core.Rail rail$126108 = ((x10.core.Rail)(((x10.regionarray.DistArray<$T>)this$126107).raw));
                
                //#line 708 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final x10.lang.Iterator pt$126101 = reg$126105.iterator();
                
                //#line 708 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 708 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final boolean t$126102 = ((x10.lang.Iterator<x10.lang.Point>)pt$126101).hasNext$O();
                    
                    //#line 708 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    if (!(t$126102)) {
                        
                        //#line 708 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        break;
                    }
                    
                    //#line 708 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.lang.Point pt$126095 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)pt$126101).next$G()));
                    
                    //#line 709 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final $U t$126096 = (($U)(localRes$126106));
                    
                    //#line 709 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final x10.regionarray.Dist t$126097 = ((x10.regionarray.Dist)(this.dist));
                    
                    //#line 709 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final long t$126098 = t$126097.offset$O(((x10.lang.Point)(pt$126095)));
                    
                    //#line 709 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final $T t$126099 = (($T)(((x10.core.Rail<$T>)rail$126108).$apply$G((long)(t$126098))));
                    
                    //#line 709 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    final $U t$126100 = (($U)((($U)
                                                ((x10.core.fun.Fun_0_2<$U,$T,$U>)this.lop).$apply(t$126096, $U, t$126099, $T))));
                    
                    //#line 709 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    localRes$126106 = (($U)(t$126100));
                }
                
                //#line 711 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                final $U t$126109 = (($U)(localRes$126106));
                
                //#line 711 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                x10.lang.Runtime.<$U> makeOffer__0x10$lang$Runtime$$T($U, (($U)(t$126109)));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 704 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 704 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.regionarray.DistArray<$T> out$$;
        public x10.regionarray.Dist dist;
        public $U unit;
        public x10.core.fun.Fun_0_2<$U,$T,$U> lop;
        
        public $Closure$210(final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.regionarray.DistArray<$T> out$$, final x10.regionarray.Dist dist, final $U unit, final x10.core.fun.Fun_0_2<$U,$T,$U> lop, __0$1x10$regionarray$DistArray$$Closure$210$$T$2__2x10$regionarray$DistArray$$Closure$210$$U__3$1x10$regionarray$DistArray$$Closure$210$$U$3x10$regionarray$DistArray$$Closure$210$$T$3x10$regionarray$DistArray$$Closure$210$$U$2 $dummy) {
            x10.regionarray.DistArray.$Closure$210.$initParams(this, $T, $U);
             {
                ((x10.regionarray.DistArray.$Closure$210<$T, $U>)this).out$$ = out$$;
                ((x10.regionarray.DistArray.$Closure$210<$T, $U>)this).dist = ((x10.regionarray.Dist)(dist));
                ((x10.regionarray.DistArray.$Closure$210<$T, $U>)this).unit = (($U)(unit));
                ((x10.regionarray.DistArray.$Closure$210<$T, $U>)this).lop = ((x10.core.fun.Fun_0_2)(lop));
            }
        }
        
    }
    
    }
    
    
    
    
    
    