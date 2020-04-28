package x10.array;


@x10.runtime.impl.java.X10Generated
abstract public class DistArray<$T> extends x10.core.Ref implements x10.lang.Iterable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<DistArray> $RTT = 
        x10.rtt.NamedType.<DistArray> make("x10.array.DistArray",
                                           DistArray.class,
                                           1,
                                           new x10.rtt.Type[] {
                                               x10.rtt.ParameterizedType.make(x10.lang.Iterable.$RTT, x10.lang.Point.$RTT)
                                           });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DistArray<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.localHandle = $deserializer.readObject();
        $_obj.placeGroup = $deserializer.readObject();
        $_obj.size = $deserializer.readLong();
        
        /* fields with @TransientInitExpr annotations */
        $_obj.raw = $_obj.getRailFromLocalHandle();
        
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.localHandle);
        $serializer.write(this.placeGroup);
        $serializer.write(this.size);
        
    }
    
    // constructor just for allocation
    public DistArray(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.array.DistArray.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final DistArray $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __1$1x10$array$LocalState$1x10$array$DistArray$$T$2$2 {}
    
    // properties
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    public long size;
    

    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    abstract public long rank$O();
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    /** 
     * The place-local state for the DistArray 
     */
    public x10.lang.PlaceLocalHandle<x10.array.LocalState<$T>> localHandle;
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    /**
     * The place-local backing storage for elements of the DistArray.
     */
    public transient x10.core.Rail<$T> raw;
    
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    final public x10.core.Rail getRailFromLocalHandle() {
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final x10.lang.PlaceLocalHandle t$76217 = ((x10.lang.PlaceLocalHandle)(localHandle));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final x10.array.LocalState ls = ((x10.lang.PlaceLocalHandle<x10.array.LocalState<$T>>)t$76217).$apply$G();
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final boolean t$76218 = ((ls) != (null));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        x10.core.Rail t$76219 =  null;
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        if (t$76218) {
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            t$76219 = ((x10.core.Rail)(((x10.array.LocalState<$T>)ls).rail));
        } else {
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            t$76219 = ((x10.core.Rail)(new x10.core.Rail<$T>($T)));
        }
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final x10.core.Rail t$76220 = ((x10.core.Rail)(t$76219));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        return t$76220;
    }
    
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    /**
     * The PlaceGroup over which this DistArray is defined.
     */
    public x10.lang.PlaceGroup placeGroup;
    
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    
    // constructor for non-virtual call
    final public x10.array.DistArray<$T> x10$array$DistArray$$init$S(final x10.lang.PlaceGroup pg, final x10.core.fun.Fun_0_0<x10.array.LocalState<$T>> init, final long sz, __1$1x10$array$LocalState$1x10$array$DistArray$$T$2$2 $dummy) {
         {
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            this.size = sz;
            
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.array.DistArray this$76306 = this;
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.lang.PlaceLocalHandle plh = x10.lang.PlaceLocalHandle.<x10.array.LocalState<$T>> makeFlat__1$1x10$lang$PlaceLocalHandle$$T$2(x10.rtt.ParameterizedType.make(x10.array.LocalState.$RTT, $T), ((x10.lang.PlaceGroup)(pg)), ((x10.core.fun.Fun_0_0)(init)));
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.array.LocalState ls = ((x10.lang.PlaceLocalHandle<x10.array.LocalState<$T>>)plh).$apply$G();
            
            //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ((x10.array.DistArray<$T>)this).localHandle = ((x10.lang.PlaceLocalHandle)(plh));
            
            //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ((x10.array.DistArray<$T>)this).placeGroup = ((x10.lang.PlaceGroup)(pg));
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.core.Rail t$76221 = ((x10.core.Rail)(((x10.core.Rail<$T>)
                                                             this.getRailFromLocalHandle())));
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ((x10.array.DistArray<$T>)this).raw = ((x10.core.Rail)(t$76221));
        }
        return this;
    }
    
    
    
    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    final public x10.core.Rail raw() {
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final x10.core.Rail t$76222 = ((x10.core.Rail)(raw));
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        return t$76222;
    }
    
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    final public x10.lang.PlaceGroup placeGroup() {
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final x10.lang.PlaceGroup t$76223 = ((x10.lang.PlaceGroup)(placeGroup));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        return t$76223;
    }
    
    
    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    abstract public x10.array.IterationSpace globalIndices();
    
    
    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    public x10.lang.Iterator iterator() {
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final x10.array.IterationSpace t$76224 = ((x10.array.IterationSpace)(this.globalIndices()));
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final x10.lang.Iterator t$76225 = t$76224.iterator();
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        return t$76225;
    }
    
    
    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    abstract public x10.array.IterationSpace localIndices();
    
    
    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    abstract public x10.lang.Place place(final x10.lang.Point p);
    
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    abstract public $T $apply$G(final x10.lang.Point p);
    
    
    //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    abstract public $T $set__1x10$array$DistArray$$T$G(final x10.lang.Point p, final $T v);
    
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    final public $T reduce__0$1x10$array$DistArray$$T$3x10$array$DistArray$$T$3x10$array$DistArray$$T$2__1x10$array$DistArray$$T$G(final x10.core.fun.Fun_0_2 op, final $T unit) {
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final $T t$76226 = (($T)(this.<$T> reduce__0$1x10$array$DistArray$$U$3x10$array$DistArray$$T$3x10$array$DistArray$$U$2__1$1x10$array$DistArray$$U$3x10$array$DistArray$$U$3x10$array$DistArray$$U$2__2x10$array$DistArray$$U$G($T, ((x10.core.fun.Fun_0_2)(op)), ((x10.core.fun.Fun_0_2)(op)), (($T)(unit)))));
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        return t$76226;
    }
    
    
    //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    final public <$U>$U reduce__0$1x10$array$DistArray$$U$3x10$array$DistArray$$T$3x10$array$DistArray$$U$2__1$1x10$array$DistArray$$U$3x10$array$DistArray$$U$3x10$array$DistArray$$U$2__2x10$array$DistArray$$U$G(final x10.rtt.Type $U, final x10.core.fun.Fun_0_2 lop, final x10.core.fun.Fun_0_2 gop, final $U unit) {
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final x10.array.DistArray.Anonymous$7530 reducer = ((x10.array.DistArray.Anonymous$7530)(new x10.array.DistArray.Anonymous$7530<$U, $T>((java.lang.System[]) null, $U, $T)));
        
        //#line 39 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final x10.array.DistArray out$76011 = ((x10.array.DistArray)(this));
        
        //#line 187 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final $U unit$76012 = (($U)(unit));
        
        //#line 187 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final x10.core.fun.Fun_0_2 gop$76013 = ((x10.core.fun.Fun_0_2)(gop));
        
        //#line 39 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        ((x10.array.DistArray.Anonymous$7530<$U, $T>)reducer).out$ = out$76011;
        
        //#line 187 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        ((x10.array.DistArray.Anonymous$7530<$U, $T>)reducer).unit = (($U)(unit$76012));
        
        //#line 187 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        ((x10.array.DistArray.Anonymous$7530<$U, $T>)reducer).gop = gop$76013;
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final $U result;
        {
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.lang.FinishState x10$__var0 = ((x10.lang.FinishState)(x10.lang.Runtime.<$U> startCollectingFinish__0$1x10$lang$Runtime$$T$2($U, ((x10.lang.Reducible)(reducer)))));
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            try {{
                {
                    
                    //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                    final x10.lang.PlaceGroup t$76228 = ((x10.lang.PlaceGroup)(placeGroup));
                    
                    //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                    final x10.lang.Iterator where$75979 = t$76228.iterator();
                    
                    //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                        final boolean t$76238 = ((x10.lang.Iterator<x10.lang.Place>)where$75979).hasNext$O();
                        
                        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                        if (!(t$76238)) {
                            
                            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                            break;
                        }
                        
                        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                        final x10.lang.Place where$76320 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)where$75979).next$G()));
                        
                        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                        x10.lang.Runtime.runAsync(((x10.lang.Place)(where$76320)), ((x10.core.fun.VoidFun_0_0)(new x10.array.DistArray.$Closure$0<$T, $U>($T, $U, ((x10.array.DistArray<$T>)(this)), lop, unit, (x10.array.DistArray.$Closure$0.__0$1x10$array$DistArray$$Closure$0$$T$2__1$1x10$array$DistArray$$Closure$0$$U$3x10$array$DistArray$$Closure$0$$T$3x10$array$DistArray$$Closure$0$$U$2__2x10$array$DistArray$$Closure$0$$U) null))), ((x10.lang.Runtime.Profile)(null)));
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                
                //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                 result = (($U)(x10.lang.Runtime.<$U> stopCollectingFinish$G($U, ((x10.lang.FinishState)(x10$__var0)))));
             }}
            }
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        return result;
        }
    
    
    //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    final public <$U>x10.array.DistArray map__0$1x10$array$DistArray$$U$2__1$1x10$array$DistArray$$T$3x10$array$DistArray$$U$2(final x10.rtt.Type $U, final x10.array.DistArray dst, final x10.core.fun.Fun_0_1 op) {
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final x10.lang.PlaceGroup t$76246 = ((x10.lang.PlaceGroup)(placeGroup));
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final x10.core.fun.VoidFun_0_0 t$76247 = ((x10.core.fun.VoidFun_0_0)(new x10.array.DistArray.$Closure$1<$T, $U>($T, $U, ((x10.array.DistArray<$T>)(this)), dst, op, (x10.array.DistArray.$Closure$1.__0$1x10$array$DistArray$$Closure$1$$T$2__1$1x10$array$DistArray$$Closure$1$$U$2__2$1x10$array$DistArray$$Closure$1$$T$3x10$array$DistArray$$Closure$1$$U$2) null)));
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        t$76246.broadcastFlat(((x10.core.fun.VoidFun_0_0)(t$76247)));
        
        //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        return dst;
    }
    
    
    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    final public <$S, $U>x10.array.DistArray map__0$1x10$array$DistArray$$S$2__1$1x10$array$DistArray$$U$2__2$1x10$array$DistArray$$T$3x10$array$DistArray$$S$3x10$array$DistArray$$U$2(final x10.rtt.Type $S, final x10.rtt.Type $U, final x10.array.DistArray src2, final x10.array.DistArray dst, final x10.core.fun.Fun_0_2 op) {
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final x10.lang.PlaceGroup t$76267 = ((x10.lang.PlaceGroup)(placeGroup));
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final x10.core.fun.VoidFun_0_0 t$76268 = ((x10.core.fun.VoidFun_0_0)(new x10.array.DistArray.$Closure$2<$T, $S, $U>($T, $S, $U, ((x10.array.DistArray<$T>)(this)), src2, dst, op, (x10.array.DistArray.$Closure$2.$_2bd4dd58) null)));
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        t$76267.broadcastFlat(((x10.core.fun.VoidFun_0_0)(t$76268)));
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        return dst;
    }
    
    
    //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    public static void raiseBoundsError(final long i) {
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76269 = (("(") + ((x10.core.Long.$box(i))));
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76270 = ((t$76269) + (") not contained in array"));
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.ArrayIndexOutOfBoundsException t$76271 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$76270)));
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        throw t$76271;
    }
    
    
    //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    public static void raiseBoundsError(final long i, final long j) {
        
        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76272 = (("(") + ((x10.core.Long.$box(i))));
        
        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76273 = ((t$76272) + (", "));
        
        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76274 = ((t$76273) + ((x10.core.Long.$box(j))));
        
        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76275 = ((t$76274) + (") not contained in array"));
        
        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.ArrayIndexOutOfBoundsException t$76276 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$76275)));
        
        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        throw t$76276;
    }
    
    
    //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    public static void raiseBoundsError(final long i, final long j, final long k) {
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76277 = (("(") + ((x10.core.Long.$box(i))));
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76278 = ((t$76277) + (", "));
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76279 = ((t$76278) + ((x10.core.Long.$box(j))));
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76280 = ((t$76279) + (", "));
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76281 = ((t$76280) + ((x10.core.Long.$box(k))));
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76282 = ((t$76281) + (") not contained in array"));
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.ArrayIndexOutOfBoundsException t$76283 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$76282)));
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        throw t$76283;
    }
    
    
    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    public static void raisePlaceError(final long i) {
        
        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76284 = (("point (") + ((x10.core.Long.$box(i))));
        
        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76285 = ((t$76284) + (") not defined at "));
        
        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76286 = ((t$76285) + (x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final x10.lang.BadPlaceException t$76287 = ((x10.lang.BadPlaceException)(new x10.lang.BadPlaceException(t$76286)));
        
        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        throw t$76287;
    }
    
    
    //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    public static void raisePlaceError(final long i, final long j) {
        
        //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76288 = (("point (") + ((x10.core.Long.$box(i))));
        
        //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76289 = ((t$76288) + (", "));
        
        //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76290 = ((t$76289) + ((x10.core.Long.$box(j))));
        
        //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76291 = ((t$76290) + (") not defined at "));
        
        //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76292 = ((t$76291) + (x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final x10.lang.BadPlaceException t$76293 = ((x10.lang.BadPlaceException)(new x10.lang.BadPlaceException(t$76292)));
        
        //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        throw t$76293;
    }
    
    
    //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    public static void raisePlaceError(final long i, final long j, final long k) {
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76294 = (("point (") + ((x10.core.Long.$box(i))));
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76295 = ((t$76294) + (", "));
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76296 = ((t$76295) + ((x10.core.Long.$box(j))));
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76297 = ((t$76296) + (", "));
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76298 = ((t$76297) + ((x10.core.Long.$box(k))));
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76299 = ((t$76298) + (") not defined at "));
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.String t$76300 = ((t$76299) + (x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final x10.lang.BadPlaceException t$76301 = ((x10.lang.BadPlaceException)(new x10.lang.BadPlaceException(t$76300)));
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        throw t$76301;
    }
    
    
    //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    public static void raiseNegativeArraySizeException() {
        
        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        final java.lang.NegativeArraySizeException t$76302 = ((java.lang.NegativeArraySizeException)(new java.lang.NegativeArraySizeException()));
        
        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        throw t$76302;
    }
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    final public x10.array.DistArray x10$array$DistArray$$this$x10$array$DistArray() {
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        return x10.array.DistArray.this;
    }
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    final public void __fieldInitializers_x10_array_DistArray() {
        
    }
    
    
    //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class Anonymous$7530<$U, $T> extends x10.core.Ref implements x10.lang.Reducible, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<Anonymous$7530> $RTT = 
            x10.rtt.NamedType.<Anonymous$7530> make("x10.array.DistArray.Anonymous$7530",
                                                    Anonymous$7530.class,
                                                    2,
                                                    new x10.rtt.Type[] {
                                                        x10.rtt.ParameterizedType.make(x10.lang.Reducible.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                                    });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $U; if (i == 1) return $T; return null; }
        
        public static <$U, $T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DistArray.Anonymous$7530<$U, $T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.unit = $deserializer.readObject();
            $_obj.gop = $deserializer.readObject();
            $_obj.out$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.array.DistArray.Anonymous$7530 $_obj = new x10.array.DistArray.Anonymous$7530((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
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
        public Anonymous$7530(final java.lang.System[] $dummy, final x10.rtt.Type $U, final x10.rtt.Type $T) {
            x10.array.DistArray.Anonymous$7530.$initParams(this, $U, $T);
            
        }
        
        // dispatcher for method abstract public x10.lang.Reducible[T].operator()(a:T, b:T){}:T
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return $apply__0x10$array$DistArray$Anonymous$7530$$U__1x10$array$DistArray$Anonymous$7530$$U$G(($U)a1, ($U)a2);
            
        }
        
        private x10.rtt.Type $U;
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final Anonymous$7530 $this, final x10.rtt.Type $U, final x10.rtt.Type $T) {
            $this.$U = $U;
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$array$DistArray$Anonymous$7530$$T$2__1x10$array$DistArray$Anonymous$7530$$U__2$1x10$array$DistArray$Anonymous$7530$$U$3x10$array$DistArray$Anonymous$7530$$U$3x10$array$DistArray$Anonymous$7530$$U$2 {}
        
    
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        public x10.array.DistArray<$T> out$;
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        public $U unit;
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        public x10.core.fun.Fun_0_2<$U,$U,$U> gop;
        
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        public $U zero$G() {
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final $U t$76303 = (($U)(x10.array.DistArray.Anonymous$7530.this.unit));
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            return t$76303;
        }
        
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        public $U $apply__0x10$array$DistArray$Anonymous$7530$$U__1x10$array$DistArray$Anonymous$7530$$U$G(final $U a, final $U b) {
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.core.fun.Fun_0_2 t$76304 = x10.array.DistArray.Anonymous$7530.this.gop;
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final $U t$76305 = (($U)((($U)
                                       ((x10.core.fun.Fun_0_2<$U,$U,$U>)t$76304).$apply(a, $U, b, $U))));
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            return t$76305;
        }
        
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        // creation method for java code (1-phase java constructor)
        public Anonymous$7530(final x10.rtt.Type $U, final x10.rtt.Type $T, final x10.array.DistArray<$T> out$, final $U unit, final x10.core.fun.Fun_0_2<$U,$U,$U> gop, __0$1x10$array$DistArray$Anonymous$7530$$T$2__1x10$array$DistArray$Anonymous$7530$$U__2$1x10$array$DistArray$Anonymous$7530$$U$3x10$array$DistArray$Anonymous$7530$$U$3x10$array$DistArray$Anonymous$7530$$U$2 $dummy) {
            this((java.lang.System[]) null, $U, $T);
            x10$array$DistArray$Anonymous$7530$$init$S(out$, unit, gop, (x10.array.DistArray.Anonymous$7530.__0$1x10$array$DistArray$Anonymous$7530$$T$2__1x10$array$DistArray$Anonymous$7530$$U__2$1x10$array$DistArray$Anonymous$7530$$U$3x10$array$DistArray$Anonymous$7530$$U$3x10$array$DistArray$Anonymous$7530$$U$2) null);
        }
        
        // constructor for non-virtual call
        final public x10.array.DistArray.Anonymous$7530<$U, $T> x10$array$DistArray$Anonymous$7530$$init$S(final x10.array.DistArray<$T> out$, final $U unit, final x10.core.fun.Fun_0_2<$U,$U,$U> gop, __0$1x10$array$DistArray$Anonymous$7530$$T$2__1x10$array$DistArray$Anonymous$7530$$U__2$1x10$array$DistArray$Anonymous$7530$$U$3x10$array$DistArray$Anonymous$7530$$U$3x10$array$DistArray$Anonymous$7530$$U$2 $dummy) {
             {
                
                //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                ((x10.array.DistArray.Anonymous$7530<$U, $T>)this).out$ = out$;
                
                //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                ((x10.array.DistArray.Anonymous$7530<$U, $T>)this).unit = (($U)(unit));
                
                //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                ((x10.array.DistArray.Anonymous$7530<$U, $T>)this).gop = gop;
            }
            return this;
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$0<$T, $U> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$0> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$0> make($Closure$0.class,
                                                        2,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $U; return null; }
        
        public static <$T, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DistArray.$Closure$0<$T, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.lop = $deserializer.readObject();
            $_obj.unit = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.array.DistArray.$Closure$0 $_obj = new x10.array.DistArray.$Closure$0((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.$U);
            $serializer.write(this.out$$);
            $serializer.write(this.lop);
            $serializer.write(this.unit);
            
        }
        
        // constructor just for allocation
        public $Closure$0(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            x10.array.DistArray.$Closure$0.$initParams(this, $T, $U);
            
        }
        
        private x10.rtt.Type $T;
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$0 $this, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            $this.$T = $T;
            $this.$U = $U;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$array$DistArray$$Closure$0$$T$2__1$1x10$array$DistArray$$Closure$0$$U$3x10$array$DistArray$$Closure$0$$T$3x10$array$DistArray$$Closure$0$$U$2__2x10$array$DistArray$$Closure$0$$U {}
        
    
        
        public void $apply() {
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            try {{
                
                //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                final x10.array.DistArray this$76321 = ((x10.array.DistArray)(this.out$$));
                
                //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final x10.core.Rail src$76322 = ((x10.core.Rail)(((x10.array.DistArray<$T>)this$76321).raw));
                
                //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final x10.core.fun.Fun_0_2 op$76323 = ((x10.core.fun.Fun_0_2)(this.lop));
                
                //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $U unit$76324 = (($U)(this.unit));
                
                //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                $U ret$76325 =  null;
                
                //#line 132 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                $U accum$76318 = (($U)(unit$76324));
                
                //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final x10.core.Rail rail$76316 = ((x10.core.Rail)(src$76322));
                
                //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long i$70678max$76317 = ((x10.core.Rail<$T>)rail$76316).size;
                
                //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                long i$76313 = 0L;
                
                //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    final long t$76314 = i$76313;
                    
                    //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    final boolean t$76315 = ((t$76314) < (((long)(i$70678max$76317))));
                    
                    //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    if (!(t$76315)) {
                        
                        //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                        break;
                    }
                    
                    //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    final long i$76310 = i$76313;
                    
                    //#line 134 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    final $U t$76307 = (($U)(accum$76318));
                    
                    //#line 134 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    final $T t$76308 = (($T)(((x10.core.Rail<$T>)src$76322).$apply$G((long)(i$76310))));
                    
                    //#line 134 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    final $U t$76309 = (($U)((($U)
                                               ((x10.core.fun.Fun_0_2<$U,$T,$U>)op$76323).$apply(t$76307, $U, t$76308, $T))));
                    
                    //#line 134 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    accum$76318 = (($U)(t$76309));
                    
                    //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    final long t$76311 = i$76313;
                    
                    //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    final long t$76312 = ((t$76311) + (((long)(1L))));
                    
                    //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    i$76313 = t$76312;
                }
                
                //#line 136 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $U t$76319 = (($U)(accum$76318));
                
                //#line 136 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                ret$76325 = (($U)(t$76319));
                
                //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                final $U localRes$76326 = (($U)(ret$76325));
                
                //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                x10.lang.Runtime.<$U> makeOffer__0x10$lang$Runtime$$T($U, (($U)(localRes$76326)));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.array.DistArray<$T> out$$;
        public x10.core.fun.Fun_0_2<$U,$T,$U> lop;
        public $U unit;
        
        public $Closure$0(final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.array.DistArray<$T> out$$, final x10.core.fun.Fun_0_2<$U,$T,$U> lop, final $U unit, __0$1x10$array$DistArray$$Closure$0$$T$2__1$1x10$array$DistArray$$Closure$0$$U$3x10$array$DistArray$$Closure$0$$T$3x10$array$DistArray$$Closure$0$$U$2__2x10$array$DistArray$$Closure$0$$U $dummy) {
            x10.array.DistArray.$Closure$0.$initParams(this, $T, $U);
             {
                ((x10.array.DistArray.$Closure$0<$T, $U>)this).out$$ = out$$;
                ((x10.array.DistArray.$Closure$0<$T, $U>)this).lop = ((x10.core.fun.Fun_0_2)(lop));
                ((x10.array.DistArray.$Closure$0<$T, $U>)this).unit = (($U)(unit));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$1<$T, $U> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$1> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$1> make($Closure$1.class,
                                                        2,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $U; return null; }
        
        public static <$T, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DistArray.$Closure$1<$T, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.dst = $deserializer.readObject();
            $_obj.op = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.array.DistArray.$Closure$1 $_obj = new x10.array.DistArray.$Closure$1((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.$U);
            $serializer.write(this.out$$);
            $serializer.write(this.dst);
            $serializer.write(this.op);
            
        }
        
        // constructor just for allocation
        public $Closure$1(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            x10.array.DistArray.$Closure$1.$initParams(this, $T, $U);
            
        }
        
        private x10.rtt.Type $T;
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$1 $this, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            $this.$T = $T;
            $this.$U = $U;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$array$DistArray$$Closure$1$$T$2__1$1x10$array$DistArray$$Closure$1$$U$2__2$1x10$array$DistArray$$Closure$1$$T$3x10$array$DistArray$$Closure$1$$U$2 {}
        
    
        
        public void $apply() {
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.array.DistArray this$76191 = ((x10.array.DistArray)(this.out$$));
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.core.Rail s = ((x10.core.Rail)(((x10.array.DistArray<$T>)this$76191).raw));
            
            //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.core.Rail d = ((x10.core.Rail)(((x10.array.DistArray<$U>)this.dst).raw));
            
            //#line 150 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.Rail src$76192 = ((x10.core.Rail)(s));
            
            //#line 150 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.Rail dst$76193 = ((x10.core.Rail)(d));
            
            //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.fun.Fun_0_1 op$76194 = ((x10.core.fun.Fun_0_1)(this.op));
            
            //#line 150 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            x10.core.Rail ret$76200 =  null;
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.Rail rail$76335 = ((x10.core.Rail)(src$76192));
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long i$70697max$76336 = ((x10.core.Rail<$T>)rail$76335).size;
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            long i$76332 = 0L;
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            for (;
                 true;
                 ) {
                
                //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$76333 = i$76332;
                
                //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final boolean t$76334 = ((t$76333) < (((long)(i$70697max$76336))));
                
                //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                if (!(t$76334)) {
                    
                    //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    break;
                }
                
                //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long i$76329 = i$76332;
                
                //#line 156 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $T t$76327 = (($T)(((x10.core.Rail<$T>)src$76192).$apply$G((long)(i$76329))));
                
                //#line 156 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $U t$76328 = (($U)((($U)
                                           ((x10.core.fun.Fun_0_1<$T,$U>)op$76194).$apply(t$76327, $T))));
                
                //#line 156 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                ((x10.core.Rail<$U>)dst$76193).$set__1x10$lang$Rail$$T$G((long)(i$76329), (($U)(t$76328)));
                
                //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$76330 = i$76332;
                
                //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$76331 = ((t$76330) + (((long)(1L))));
                
                //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                i$76332 = t$76331;
            }
            
            //#line 158 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            ret$76200 = ((x10.core.Rail)(dst$76193));
        }
        
        public x10.array.DistArray<$T> out$$;
        public x10.array.DistArray<$U> dst;
        public x10.core.fun.Fun_0_1<$T,$U> op;
        
        public $Closure$1(final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.array.DistArray<$T> out$$, final x10.array.DistArray<$U> dst, final x10.core.fun.Fun_0_1<$T,$U> op, __0$1x10$array$DistArray$$Closure$1$$T$2__1$1x10$array$DistArray$$Closure$1$$U$2__2$1x10$array$DistArray$$Closure$1$$T$3x10$array$DistArray$$Closure$1$$U$2 $dummy) {
            x10.array.DistArray.$Closure$1.$initParams(this, $T, $U);
             {
                ((x10.array.DistArray.$Closure$1<$T, $U>)this).out$$ = out$$;
                ((x10.array.DistArray.$Closure$1<$T, $U>)this).dst = dst;
                ((x10.array.DistArray.$Closure$1<$T, $U>)this).op = ((x10.core.fun.Fun_0_1)(op));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$2<$T, $S, $U> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$2> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$2> make($Closure$2.class,
                                                        3,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $S; if (i == 2) return $U; return null; }
        
        public static <$T, $S, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DistArray.$Closure$2<$T, $S, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$S = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.src2 = $deserializer.readObject();
            $_obj.dst = $deserializer.readObject();
            $_obj.op = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.array.DistArray.$Closure$2 $_obj = new x10.array.DistArray.$Closure$2((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.$S);
            $serializer.write(this.$U);
            $serializer.write(this.out$$);
            $serializer.write(this.src2);
            $serializer.write(this.dst);
            $serializer.write(this.op);
            
        }
        
        // constructor just for allocation
        public $Closure$2(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $S, final x10.rtt.Type $U) {
            x10.array.DistArray.$Closure$2.$initParams(this, $T, $S, $U);
            
        }
        
        private x10.rtt.Type $T;
        private x10.rtt.Type $S;
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$2 $this, final x10.rtt.Type $T, final x10.rtt.Type $S, final x10.rtt.Type $U) {
            $this.$T = $T;
            $this.$S = $S;
            $this.$U = $U;
            
        }
        // synthetic type for parameter mangling for __0$1x10$array$DistArray$$Closure$2$$T$2__1$1x10$array$DistArray$$Closure$2$$S$2__2$1x10$array$DistArray$$Closure$2$$U$2__3$1x10$array$DistArray$$Closure$2$$T$3x10$array$DistArray$$Closure$2$$S$3x10$array$DistArray$$Closure$2$$U$2
        public static final class $_2bd4dd58 {}
        
    
        
        public void $apply() {
            
            //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.array.DistArray this$76202 = ((x10.array.DistArray)(this.out$$));
            
            //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.core.Rail s1 = ((x10.core.Rail)(((x10.array.DistArray<$T>)this$76202).raw));
            
            //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.core.Rail s2 = ((x10.core.Rail)(((x10.array.DistArray<$S>)this.src2).raw));
            
            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.core.Rail d = ((x10.core.Rail)(((x10.array.DistArray<$U>)this.dst).raw));
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final long t$76248 = ((x10.core.Rail<$T>)s1).size;
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final long t$76249 = ((x10.core.Rail<$S>)s2).size;
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final boolean t$76258 = ((long) t$76248) != ((long) t$76249);
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            if (t$76258) {
                
                //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                final long t$76250 = ((x10.core.Rail<$T>)s1).size;
                
                //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                final java.lang.String t$76251 = (("Source arrays have different sizes (") + ((x10.core.Long.$box(t$76250))));
                
                //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                final java.lang.String t$76252 = ((t$76251) + (", "));
                
                //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                final long t$76253 = ((x10.core.Rail<$S>)s2).size;
                
                //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                final java.lang.String t$76254 = ((t$76252) + ((x10.core.Long.$box(t$76253))));
                
                //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                final java.lang.String t$76255 = ((t$76254) + (") at "));
                
                //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                final java.lang.String t$76256 = ((t$76255) + (x10.lang.Place.place(x10.x10rt.X10RT.here())));
                
                //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                final java.lang.IllegalArgumentException t$76257 = ((java.lang.IllegalArgumentException)(new java.lang.IllegalArgumentException(t$76256)));
                
                //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                throw t$76257;
            }
            
            //#line 173 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.Rail src$76203 = ((x10.core.Rail)(s1));
            
            //#line 173 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.Rail src$76204 = ((x10.core.Rail)(((x10.core.Rail<$S>)
                                                               s2)));
            
            //#line 173 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.Rail dst$76205 = ((x10.core.Rail)(d));
            
            //#line 173 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.fun.Fun_0_2 op$76206 = ((x10.core.fun.Fun_0_2)(this.op));
            
            //#line 173 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            x10.core.Rail ret$76212 =  null;
            
            //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.Rail rail$76346 = ((x10.core.Rail)(src$76203));
            
            //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long i$70716max$76347 = ((x10.core.Rail<$T>)rail$76346).size;
            
            //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            long i$76343 = 0L;
            
            //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            for (;
                 true;
                 ) {
                
                //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$76344 = i$76343;
                
                //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final boolean t$76345 = ((t$76344) < (((long)(i$70716max$76347))));
                
                //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                if (!(t$76345)) {
                    
                    //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    break;
                }
                
                //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long i$76340 = i$76343;
                
                //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $T t$76337 = (($T)(((x10.core.Rail<$T>)src$76203).$apply$G((long)(i$76340))));
                
                //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $S t$76338 = (($S)(((x10.core.Rail<$S>)src$76204).$apply$G((long)(i$76340))));
                
                //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $U t$76339 = (($U)((($U)
                                           ((x10.core.fun.Fun_0_2<$T,$S,$U>)op$76206).$apply(t$76337, $T, t$76338, $S))));
                
                //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                ((x10.core.Rail<$U>)dst$76205).$set__1x10$lang$Rail$$T$G((long)(i$76340), (($U)(t$76339)));
                
                //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$76341 = i$76343;
                
                //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$76342 = ((t$76341) + (((long)(1L))));
                
                //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                i$76343 = t$76342;
            }
            
            //#line 181 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            ret$76212 = ((x10.core.Rail)(dst$76205));
        }
        
        public x10.array.DistArray<$T> out$$;
        public x10.array.DistArray<$S> src2;
        public x10.array.DistArray<$U> dst;
        public x10.core.fun.Fun_0_2<$T,$S,$U> op;
        
        public $Closure$2(final x10.rtt.Type $T, final x10.rtt.Type $S, final x10.rtt.Type $U, final x10.array.DistArray<$T> out$$, final x10.array.DistArray<$S> src2, final x10.array.DistArray<$U> dst, final x10.core.fun.Fun_0_2<$T,$S,$U> op, $_2bd4dd58 $dummy) {
            x10.array.DistArray.$Closure$2.$initParams(this, $T, $S, $U);
             {
                ((x10.array.DistArray.$Closure$2<$T, $S, $U>)this).out$$ = out$$;
                ((x10.array.DistArray.$Closure$2<$T, $S, $U>)this).src2 = src2;
                ((x10.array.DistArray.$Closure$2<$T, $S, $U>)this).dst = dst;
                ((x10.array.DistArray.$Closure$2<$T, $S, $U>)this).op = ((x10.core.fun.Fun_0_2)(op));
            }
        }
        
    }
    
    }
    
    
    