package x10.regionarray;


@x10.runtime.impl.java.X10Generated
final public class RemoteArray<$T> extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<RemoteArray> $RTT = 
        x10.rtt.NamedType.<RemoteArray> make("x10.regionarray.RemoteArray",
                                             RemoteArray.class,
                                             1);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RemoteArray<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.rawData = $deserializer.readObject();
        $_obj.region = $deserializer.readObject();
        $_obj.size = $deserializer.readLong();
        $_obj.array = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.RemoteArray $_obj = new x10.regionarray.RemoteArray((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.rawData);
        $serializer.write(this.region);
        $serializer.write(this.size);
        $serializer.write(this.array);
        
    }
    
    // constructor just for allocation
    public RemoteArray(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.regionarray.RemoteArray.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final RemoteArray $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __0$1x10$regionarray$RemoteArray$$T$2 {}
    
    // properties
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    public x10.regionarray.Region region;
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    public long size;
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    public x10.core.GlobalRef<x10.regionarray.Array<$T>> array;
    

    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    /**
     * Caches a remote reference to the backing storage for the remote array
     * to enable DMA operations to be initiated remotely.  
     */
    public x10.lang.GlobalRail<$T> rawData;
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    final public long rank$O() {
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final x10.regionarray.Region t$134803 = ((x10.regionarray.Region)(region));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final long t$134804 = t$134803.rank;
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        return t$134804;
    }
    
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    final public x10.lang.Place home() {
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final x10.core.GlobalRef t$134805 = ((x10.core.GlobalRef)(array));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final x10.lang.Place t$134806 = ((x10.lang.Place)((t$134805).home));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        return t$134806;
    }
    
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    // creation method for java code (1-phase java constructor)
    public RemoteArray(final x10.rtt.Type $T, final x10.regionarray.Array<$T> a, __0$1x10$regionarray$RemoteArray$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$regionarray$RemoteArray$$init$S(a, (x10.regionarray.RemoteArray.__0$1x10$regionarray$RemoteArray$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.RemoteArray<$T> x10$regionarray$RemoteArray$$init$S(final x10.regionarray.Array<$T> a, __0$1x10$regionarray$RemoteArray$$T$2 $dummy) {
         {
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
            final x10.regionarray.Region t$134922 = ((x10.regionarray.Region)(((x10.regionarray.Array<$T>)a).region));
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
            final long t$134923 = ((x10.regionarray.Array<$T>)a).size;
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
            final x10.core.GlobalRef t$134924 = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.regionarray.Array<$T>>(x10.rtt.ParameterizedType.make(x10.regionarray.Array.$RTT, $T), ((x10.regionarray.Array)(a)), (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
            this.region = t$134922;
            this.size = t$134923;
            this.array = t$134924;
            
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
            final x10.regionarray.RemoteArray this$134925 = this;
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
            final x10.lang.GlobalRail alloc$134762 = ((x10.lang.GlobalRail)(new x10.lang.GlobalRail<$T>((java.lang.System[]) null, $T)));
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$134926 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)a).raw));
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
            alloc$134762.x10$lang$GlobalRail$$init$S(((x10.core.Rail)(t$134926)), (x10.lang.GlobalRail.__0$1x10$lang$GlobalRail$$T$2) null);
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
            ((x10.regionarray.RemoteArray<$T>)this).rawData = ((x10.lang.GlobalRail)(alloc$134762));
        }
        return this;
    }
    
    
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    public $T $apply$G(final int i) {
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final x10.regionarray.Array this$134768 = ((x10.regionarray.Array)(((x10.regionarray.Array<$T>)
                                                                             this.$apply())));
        
        //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$134767 = ((long)(((int)(i))));
        
        //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        $T ret$134769 =  null;
        
        //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        __ret$134770: {
            
            //#line 444 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$134821 = ((x10.regionarray.Array<$T>)this$134768).rail;
            //#line 444 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$134821) {
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$134815 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$134768).raw));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $T t$134816 = (($T)(((x10.core.Rail<$T>)t$134815).$apply$G((long)(i$134767))));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$134769 = (($T)(t$134816));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                break __ret$134770;
            } else {
                
                //#line 451 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$134818 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$134768).raw));
                
                //#line 451 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134817 = ((x10.regionarray.Array<$T>)this$134768).layout_min0;
                
                //#line 451 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134819 = ((i$134767) - (((long)(t$134817))));
                
                //#line 451 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $T t$134820 = (($T)(((x10.core.Rail<$T>)t$134818).$apply$G((long)(t$134819))));
                
                //#line 451 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$134769 = (($T)(t$134820));
                
                //#line 451 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                break __ret$134770;
            }
        }
        
        //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final $T t$134822 = (($T)(ret$134769));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        return t$134822;
    }
    
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    public $T $apply$G(final x10.lang.Point p) {
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final x10.regionarray.Array this$134772 = ((x10.regionarray.Array)(((x10.regionarray.Array<$T>)
                                                                             this.$apply())));
        
        //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.Point pt$134771 = ((x10.lang.Point)(p));
        
        //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        $T ret$134773 =  null;
        
        //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$134963 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$134772).raw));
        
        //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.Point pt$134964 = ((x10.lang.Point)(pt$134771));
        
        //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long ret$134965 =  0;
        
        //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$134949 = ((long)(((int)(0))));
        
        //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$134950 = pt$134964.$apply$O((long)(t$134949));
        
        //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$134951 = ((x10.regionarray.Array<$T>)this$134772).layout_min0;
        
        //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long offset$134952 = ((t$134950) - (((long)(t$134951))));
        
        //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$134953 = pt$134964.rank;
        
        //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$134954 = ((t$134953) > (((long)(1L))));
        
        //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (t$134954) {
            
            //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$134955 = offset$134952;
            
            //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$134956 = ((x10.regionarray.Array<$T>)this$134772).layout_stride1;
            
            //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$134957 = ((t$134955) * (((long)(t$134956))));
            
            //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$134958 = pt$134964.$apply$O((long)(1L));
            
            //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$134959 = ((t$134957) + (((long)(t$134958))));
            
            //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$134960 = ((x10.regionarray.Array<$T>)this$134772).layout_min1;
            
            //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$134961 = ((t$134959) - (((long)(t$134960))));
            
            //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            offset$134952 = t$134961;
            
            //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$134947 = pt$134964.rank;
            
            //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long i$116322max$134948 = ((t$134947) - (((long)(1L))));
            
            //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long i$134944 = 2L;
            
            //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            for (;
                 true;
                 ) {
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134945 = i$134944;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$134946 = ((t$134945) <= (((long)(i$116322max$134948))));
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (!(t$134946)) {
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    break;
                }
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$134941 = i$134944;
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134927 = offset$134952;
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$134928 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$134772).layout));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134929 = ((i$134941) - (((long)(2L))));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134930 = ((2L) * (((long)(t$134929))));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134931 = ((long[])t$134928.value)[(int)t$134930];
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134932 = ((t$134927) * (((long)(t$134931))));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134933 = pt$134964.$apply$O((long)(i$134941));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134934 = ((t$134932) + (((long)(t$134933))));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$134935 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$134772).layout));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134936 = ((i$134941) - (((long)(2L))));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134937 = ((2L) * (((long)(t$134936))));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134938 = ((t$134937) + (((long)(1L))));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134939 = ((long[])t$134935.value)[(int)t$134938];
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134940 = ((t$134934) - (((long)(t$134939))));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset$134952 = t$134940;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134942 = i$134944;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134943 = ((t$134942) + (((long)(1L))));
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                i$134944 = t$134943;
            }
        }
        
        //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$134962 = offset$134952;
        
        //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$134965 = t$134962;
        
        //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$134966 = ret$134965;
        
        //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final $T t$134967 = (($T)(((x10.core.Rail<$T>)t$134963).$apply$G((long)(t$134966))));
        
        //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$134773 = (($T)(t$134967));
        
        //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final $T t$134861 = (($T)(ret$134773));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        return t$134861;
    }
    
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    public $T $set__1x10$regionarray$RemoteArray$$T$G(final int i, final $T v) {
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final x10.regionarray.Array this$134786 = ((x10.regionarray.Array)(((x10.regionarray.Array<$T>)
                                                                             this.$apply())));
        
        //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$134784 = ((long)(((int)(i))));
        
        //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final $T v$134785 = (($T)(v));
        
        //#line 543 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        $T ret$134787 =  null;
        
        //#line 545 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$134968 = ((x10.regionarray.Array<$T>)this$134786).rail;
        
        //#line 545 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (t$134968) {
            
            //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$134969 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$134786).raw));
            
            //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.core.Rail<$T>)t$134969).$set__1x10$lang$Rail$$T$G((long)(i$134784), (($T)(v$134785)));
        } else {
            
            //#line 552 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$134970 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$134786).raw));
            
            //#line 552 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$134971 = ((x10.regionarray.Array<$T>)this$134786).layout_min0;
            
            //#line 552 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$134972 = ((i$134784) - (((long)(t$134971))));
            
            //#line 552 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.core.Rail<$T>)t$134970).$set__1x10$lang$Rail$$T$G((long)(t$134972), (($T)(v$134785)));
        }
        
        //#line 554 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$134787 = (($T)(v$134785));
        
        //#line 543 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final $T t$134871 = (($T)(ret$134787));
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        return t$134871;
    }
    
    
    //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    public $T $set__1x10$regionarray$RemoteArray$$T$G(final x10.lang.Point p, final $T v) {
        
        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final x10.regionarray.Array this$134792 = ((x10.regionarray.Array)(((x10.regionarray.Array<$T>)
                                                                             this.$apply())));
        
        //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.Point p$134790 = ((x10.lang.Point)(p));
        
        //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final $T v$134791 = (($T)(v));
        
        //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        $T ret$134793 =  null;
        
        //#line 640 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$135009 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$134792).raw));
        
        //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.Point pt$135010 = ((x10.lang.Point)(p$134790));
        
        //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long ret$135011 =  0;
        
        //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$134995 = ((long)(((int)(0))));
        
        //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$134996 = pt$135010.$apply$O((long)(t$134995));
        
        //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$134997 = ((x10.regionarray.Array<$T>)this$134792).layout_min0;
        
        //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long offset$134998 = ((t$134996) - (((long)(t$134997))));
        
        //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$134999 = pt$135010.rank;
        
        //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$135000 = ((t$134999) > (((long)(1L))));
        
        //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (t$135000) {
            
            //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$135001 = offset$134998;
            
            //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$135002 = ((x10.regionarray.Array<$T>)this$134792).layout_stride1;
            
            //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$135003 = ((t$135001) * (((long)(t$135002))));
            
            //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$135004 = pt$135010.$apply$O((long)(1L));
            
            //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$135005 = ((t$135003) + (((long)(t$135004))));
            
            //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$135006 = ((x10.regionarray.Array<$T>)this$134792).layout_min1;
            
            //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$135007 = ((t$135005) - (((long)(t$135006))));
            
            //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            offset$134998 = t$135007;
            
            //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$134993 = pt$135010.rank;
            
            //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long i$116322max$134994 = ((t$134993) - (((long)(1L))));
            
            //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long i$134990 = 2L;
            
            //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            for (;
                 true;
                 ) {
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134991 = i$134990;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$134992 = ((t$134991) <= (((long)(i$116322max$134994))));
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (!(t$134992)) {
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    break;
                }
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$134987 = i$134990;
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134973 = offset$134998;
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$134974 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$134792).layout));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134975 = ((i$134987) - (((long)(2L))));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134976 = ((2L) * (((long)(t$134975))));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134977 = ((long[])t$134974.value)[(int)t$134976];
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134978 = ((t$134973) * (((long)(t$134977))));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134979 = pt$135010.$apply$O((long)(i$134987));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134980 = ((t$134978) + (((long)(t$134979))));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$134981 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$134792).layout));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134982 = ((i$134987) - (((long)(2L))));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134983 = ((2L) * (((long)(t$134982))));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134984 = ((t$134983) + (((long)(1L))));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134985 = ((long[])t$134981.value)[(int)t$134984];
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134986 = ((t$134980) - (((long)(t$134985))));
                
                //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset$134998 = t$134986;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134988 = i$134990;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$134989 = ((t$134988) + (((long)(1L))));
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                i$134990 = t$134989;
            }
        }
        
        //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$135008 = offset$134998;
        
        //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$135011 = t$135008;
        
        //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$135012 = ret$135011;
        
        //#line 640 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.core.Rail<$T>)t$135009).$set__1x10$lang$Rail$$T$G((long)(t$135012), (($T)(v$134791)));
        
        //#line 641 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$134793 = (($T)(v$134791));
        
        //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final $T t$134909 = (($T)(ret$134793));
        
        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        return t$134909;
    }
    
    
    //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    public x10.regionarray.Array $apply() {
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final x10.core.GlobalRef t$134912 = ((x10.core.GlobalRef)(this.array));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final x10.regionarray.Array t$134913 = (((x10.core.GlobalRef<x10.regionarray.Array<$T>>)(t$134912))).$apply$G();
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final x10.regionarray.Array t$134914 = ((x10.regionarray.Array)(((x10.regionarray.Array<$T>)
                                                                          t$134913)));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        return t$134914;
    }
    
    
    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    public boolean equals(final java.lang.Object other) {
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final boolean t$134915 = x10.regionarray.RemoteArray.$RTT.isInstance(other, $T);
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final boolean t$134916 = !(t$134915);
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        if (t$134916) {
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
            return false;
        }
        
        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final x10.regionarray.RemoteArray oRA = ((x10.regionarray.RemoteArray)(x10.rtt.Types.<x10.regionarray.RemoteArray<$T>> cast(other,x10.rtt.ParameterizedType.make(x10.regionarray.RemoteArray.$RTT, $T))));
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final x10.core.GlobalRef t$134917 = ((x10.core.GlobalRef)(((x10.regionarray.RemoteArray<$T>)oRA).array));
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final x10.core.GlobalRef t$134918 = ((x10.core.GlobalRef)(array));
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final boolean t$134919 = (((x10.core.GlobalRef<x10.regionarray.Array<$T>>)(t$134917))).equals(t$134918);
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        return t$134919;
    }
    
    
    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    public int hashCode() {
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final x10.core.GlobalRef t$134920 = ((x10.core.GlobalRef)(array));
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        final int t$134921 = (((x10.core.GlobalRef<x10.regionarray.Array<$T>>)(t$134920))).hashCode();
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        return t$134921;
    }
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    final public x10.regionarray.RemoteArray x10$regionarray$RemoteArray$$this$x10$regionarray$RemoteArray() {
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
        return x10.regionarray.RemoteArray.this;
    }
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    final public void __fieldInitializers_x10_regionarray_RemoteArray() {
        
    }
}

