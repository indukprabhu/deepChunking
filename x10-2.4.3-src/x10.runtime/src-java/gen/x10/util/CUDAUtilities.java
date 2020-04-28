package x10.util;


@x10.runtime.impl.java.X10Generated
public class CUDAUtilities extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<CUDAUtilities> $RTT = 
        x10.rtt.NamedType.<CUDAUtilities> make("x10.util.CUDAUtilities",
                                               CUDAUtilities.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.CUDAUtilities $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.CUDAUtilities $_obj = new x10.util.CUDAUtilities((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public CUDAUtilities(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    public static int autoBlocks$O() {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        return 8;
    }
    
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    public static int autoThreads$O() {
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        return 1;
    }
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    private static <$T>void initCUDARail__0$1x10$util$CUDAUtilities$$T$2__1$1x10$util$CUDAUtilities$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> local, final x10.lang.GlobalRail<$T> remote, final long numElements) {
        {
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            final x10.lang.FinishState x10$__var23 = x10.lang.Runtime.startFinish();
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            try {{
                {
                    
                    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                    x10.core.Rail.<$T> asyncCopy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(local)), (long)(0L), ((x10.lang.GlobalRail)(remote)), (long)(0L), (long)(numElements));
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                
                //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var23)));
             }}
            }
        }
    
    public static <$T>void initCUDARail$P__0$1x10$util$CUDAUtilities$$T$2__1$1x10$util$CUDAUtilities$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> local, final x10.lang.GlobalRail<$T> remote, final long numElements) {
        x10.util.CUDAUtilities.<$T> initCUDARail__0$1x10$util$CUDAUtilities$$T$2__1$1x10$util$CUDAUtilities$$T$2($T, ((x10.core.Rail)(local)), ((x10.lang.GlobalRail)(remote)), (long)(numElements));
    }
    
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    private static <$T>x10.lang.GlobalRail makeCUDARail__2$1x10$util$CUDAUtilities$$T$2(final x10.rtt.Type $T, final x10.lang.Place gpu, final long numElements, final x10.core.Rail<$T> init) {
        {
            
        }
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        final java.lang.UnsupportedOperationException t$136158 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        throw t$136158;
    }
    
    public static <$T>x10.lang.GlobalRail makeCUDARail$P__2$1x10$util$CUDAUtilities$$T$2(final x10.rtt.Type $T, final x10.lang.Place gpu, final long numElements, final x10.core.Rail<$T> init) {
        return x10.util.CUDAUtilities.<$T> makeCUDARail__2$1x10$util$CUDAUtilities$$T$2($T, ((x10.lang.Place)(gpu)), (long)(numElements), ((x10.core.Rail)(init)));
    }
    
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    public static <$T>x10.lang.GlobalRail makeGlobalRail__2$1x10$util$CUDAUtilities$$T$2(final x10.rtt.Type $T, final x10.lang.Place place, final long numElements, final x10.core.Rail<$T> init) {
        
        //#line 86 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long id$136151 = place.id;
        {
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            final x10.lang.GlobalRail t$136130 = ((x10.lang.GlobalRail)(x10.lang.Runtime.<x10.lang.GlobalRail<$T>> evalAt__1$1x10$lang$Runtime$$T$2$G(x10.rtt.ParameterizedType.make(x10.lang.GlobalRail.$RTT, $T), ((x10.lang.Place)(place)), ((x10.core.fun.Fun_0_0)(new x10.util.CUDAUtilities.$Closure$288<$T>($T, init, numElements, (x10.util.CUDAUtilities.$Closure$288.__0$1x10$util$CUDAUtilities$$Closure$288$$T$2) null))), ((x10.lang.Runtime.Profile)(null)))));
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            final x10.lang.GlobalRail t$136131 = ((x10.lang.GlobalRail)(((x10.lang.GlobalRail)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.lang.GlobalRail.$RTT, $T),t$136130))));
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            return t$136131;
        }
    }
    
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    public static <$T>x10.lang.GlobalRail makeGlobalRail(final x10.rtt.Type $T, final x10.lang.Place place, final long numElements) {
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        final $T t$136161 = (($T)(($T) x10.rtt.Types.zeroValue($T)));
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        final x10.lang.GlobalRail t$136162 = ((x10.lang.GlobalRail)(x10.util.CUDAUtilities.<$T> makeGlobalRail__2x10$util$CUDAUtilities$$T($T, ((x10.lang.Place)(place)), (long)(numElements), (($T)(t$136161)))));
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        return t$136162;
    }
    
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    public static <$T>x10.lang.GlobalRail makeGlobalRail__2x10$util$CUDAUtilities$$T(final x10.rtt.Type $T, final x10.lang.Place place, final long numElements, final $T init) {
        
        //#line 86 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long id$136152 = place.id;
        {
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            final x10.lang.GlobalRail t$136134 = ((x10.lang.GlobalRail)(x10.lang.Runtime.<x10.lang.GlobalRail<$T>> evalAt__1$1x10$lang$Runtime$$T$2$G(x10.rtt.ParameterizedType.make(x10.lang.GlobalRail.$RTT, $T), ((x10.lang.Place)(place)), ((x10.core.fun.Fun_0_0)(new x10.util.CUDAUtilities.$Closure$289<$T>($T, numElements, init, (x10.util.CUDAUtilities.$Closure$289.__1x10$util$CUDAUtilities$$Closure$289$$T) null))), ((x10.lang.Runtime.Profile)(null)))));
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            final x10.lang.GlobalRail t$136135 = ((x10.lang.GlobalRail)(((x10.lang.GlobalRail)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.lang.GlobalRail.$RTT, $T),t$136134))));
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            return t$136135;
        }
    }
    
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    public static <$T>x10.lang.GlobalRail makeGlobalRail__2$1x10$lang$Long$3x10$util$CUDAUtilities$$T$2(final x10.rtt.Type $T, final x10.lang.Place place, final long numElements, final x10.core.fun.Fun_0_1<x10.core.Long,$T> init) {
        
        //#line 86 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long id$136153 = place.id;
        {
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            final x10.lang.GlobalRail t$136142 = ((x10.lang.GlobalRail)(x10.lang.Runtime.<x10.lang.GlobalRail<$T>> evalAt__1$1x10$lang$Runtime$$T$2$G(x10.rtt.ParameterizedType.make(x10.lang.GlobalRail.$RTT, $T), ((x10.lang.Place)(place)), ((x10.core.fun.Fun_0_0)(new x10.util.CUDAUtilities.$Closure$291<$T>($T, init, numElements, (x10.util.CUDAUtilities.$Closure$291.__0$1x10$lang$Long$3x10$util$CUDAUtilities$$Closure$291$$T$2) null))), ((x10.lang.Runtime.Profile)(null)))));
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            final x10.lang.GlobalRail t$136143 = ((x10.lang.GlobalRail)(((x10.lang.GlobalRail)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.lang.GlobalRail.$RTT, $T),t$136142))));
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            return t$136143;
        }
    }
    
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    public static <$T>void deleteGlobalRail__0$1x10$util$CUDAUtilities$$T$2(final x10.rtt.Type $T, final x10.lang.GlobalRail<$T> arr) {
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.core.GlobalRef t$136166 = ((x10.core.GlobalRef)(((x10.lang.GlobalRail<$T>)arr).rail));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        final x10.lang.Place place = ((x10.lang.Place)((t$136166).home));
        
        //#line 86 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long id$136154 = place.id;
        {
            
        }
    }
    
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    public static int mul24$O(final int a, final int b) {
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        final int t$136167 = ((a) * (((int)(b))));
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        return t$136167;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    final public x10.util.CUDAUtilities x10$util$CUDAUtilities$$this$x10$util$CUDAUtilities() {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        return x10.util.CUDAUtilities.this;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    // creation method for java code (1-phase java constructor)
    public CUDAUtilities() {
        this((java.lang.System[]) null);
        x10$util$CUDAUtilities$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.util.CUDAUtilities x10$util$CUDAUtilities$$init$S() {
         {
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            final x10.util.CUDAUtilities this$136155 = this;
        }
        return this;
    }
    
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    final public void __fieldInitializers_x10_util_CUDAUtilities() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$287<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$287> $RTT = 
            x10.rtt.StaticFunType.<$Closure$287> make($Closure$287.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.UnresolvedType.PARAM(0))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.CUDAUtilities.$Closure$287<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.init = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.CUDAUtilities.$Closure$287 $_obj = new x10.util.CUDAUtilities.$Closure$287((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.init);
            
        }
        
        // constructor just for allocation
        public $Closure$287(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.CUDAUtilities.$Closure$287.$initParams(this, $T);
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$G(x10.core.Long.$unbox(a1));
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$287 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$util$CUDAUtilities$$Closure$287$$T$2 {}
        
    
        
        public $T $apply$G(final long p) {
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            final int t$136124 = ((int)(long)(((long)(p))));
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            final long t$136125 = ((long)(((int)(t$136124))));
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            final $T t$136126 = (($T)(((x10.core.Rail<$T>)this.init).$apply$G((long)(t$136125))));
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            return t$136126;
        }
        
        public x10.core.Rail<$T> init;
        
        public $Closure$287(final x10.rtt.Type $T, final x10.core.Rail<$T> init, __0$1x10$util$CUDAUtilities$$Closure$287$$T$2 $dummy) {
            x10.util.CUDAUtilities.$Closure$287.$initParams(this, $T);
             {
                ((x10.util.CUDAUtilities.$Closure$287<$T>)this).init = ((x10.core.Rail)(init));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$288<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$288> $RTT = 
            x10.rtt.StaticFunType.<$Closure$288> make($Closure$288.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.lang.GlobalRail.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.CUDAUtilities.$Closure$288<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.init = $deserializer.readObject();
            $_obj.numElements = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.CUDAUtilities.$Closure$288 $_obj = new x10.util.CUDAUtilities.$Closure$288((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.init);
            $serializer.write(this.numElements);
            
        }
        
        // constructor just for allocation
        public $Closure$288(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.CUDAUtilities.$Closure$288.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.lang.GlobalRail $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$288 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$util$CUDAUtilities$$Closure$288$$T$2 {}
        
    
        
        public x10.lang.GlobalRail $apply() {
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            try {{
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                final x10.core.fun.Fun_0_1 t$136160 = ((x10.core.fun.Fun_0_1)(new x10.util.CUDAUtilities.$Closure$287<$T>($T, ((x10.core.Rail)(this.init)), (x10.util.CUDAUtilities.$Closure$287.__0$1x10$util$CUDAUtilities$$Closure$287$$T$2) null)));
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                final x10.core.Rail t$136128 = ((x10.core.Rail)(new x10.core.Rail<$T>($T, this.numElements, ((x10.core.fun.Fun_0_1)(t$136160)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                final x10.lang.GlobalRail t$136129 = ((x10.lang.GlobalRail)(new x10.lang.GlobalRail<$T>((java.lang.System[]) null, $T)));
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                t$136129.x10$lang$GlobalRail$$init$S(((x10.core.Rail)(t$136128)), (x10.lang.GlobalRail.__0$1x10$lang$GlobalRail$$T$2) null);
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                return t$136129;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                x10.lang.GlobalRail __lowerer__var__1__ = ((x10.lang.GlobalRail)(x10.lang.Runtime.<x10.lang.GlobalRail<$T>> wrapAtChecked$G(x10.rtt.ParameterizedType.make(x10.lang.GlobalRail.$RTT, $T), ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                return __lowerer__var__1__;
            }
        }
        
        public x10.core.Rail<$T> init;
        public long numElements;
        
        public $Closure$288(final x10.rtt.Type $T, final x10.core.Rail<$T> init, final long numElements, __0$1x10$util$CUDAUtilities$$Closure$288$$T$2 $dummy) {
            x10.util.CUDAUtilities.$Closure$288.$initParams(this, $T);
             {
                ((x10.util.CUDAUtilities.$Closure$288<$T>)this).init = ((x10.core.Rail)(init));
                ((x10.util.CUDAUtilities.$Closure$288<$T>)this).numElements = numElements;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$289<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$289> $RTT = 
            x10.rtt.StaticFunType.<$Closure$289> make($Closure$289.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.lang.GlobalRail.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.CUDAUtilities.$Closure$289<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.numElements = $deserializer.readLong();
            $_obj.init = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.CUDAUtilities.$Closure$289 $_obj = new x10.util.CUDAUtilities.$Closure$289((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.numElements);
            $serializer.write(this.init);
            
        }
        
        // constructor just for allocation
        public $Closure$289(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.CUDAUtilities.$Closure$289.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.lang.GlobalRail $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$289 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __1x10$util$CUDAUtilities$$Closure$289$$T {}
        
    
        
        public x10.lang.GlobalRail $apply() {
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            try {{
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                final x10.core.Rail t$136132 = ((x10.core.Rail)(new x10.core.Rail<$T>($T, this.numElements, this.init, (x10.core.Rail.__1x10$lang$Rail$$T) null)));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                final x10.lang.GlobalRail t$136133 = ((x10.lang.GlobalRail)(new x10.lang.GlobalRail<$T>((java.lang.System[]) null, $T)));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                t$136133.x10$lang$GlobalRail$$init$S(((x10.core.Rail)(t$136132)), (x10.lang.GlobalRail.__0$1x10$lang$GlobalRail$$T$2) null);
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                return t$136133;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                x10.lang.GlobalRail __lowerer__var__1__ = ((x10.lang.GlobalRail)(x10.lang.Runtime.<x10.lang.GlobalRail<$T>> wrapAtChecked$G(x10.rtt.ParameterizedType.make(x10.lang.GlobalRail.$RTT, $T), ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                return __lowerer__var__1__;
            }
        }
        
        public long numElements;
        public $T init;
        
        public $Closure$289(final x10.rtt.Type $T, final long numElements, final $T init, __1x10$util$CUDAUtilities$$Closure$289$$T $dummy) {
            x10.util.CUDAUtilities.$Closure$289.$initParams(this, $T);
             {
                ((x10.util.CUDAUtilities.$Closure$289<$T>)this).numElements = numElements;
                ((x10.util.CUDAUtilities.$Closure$289<$T>)this).init = (($T)(init));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$290<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$290> $RTT = 
            x10.rtt.StaticFunType.<$Closure$290> make($Closure$290.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.UnresolvedType.PARAM(0))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.CUDAUtilities.$Closure$290<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.init = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.CUDAUtilities.$Closure$290 $_obj = new x10.util.CUDAUtilities.$Closure$290((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.init);
            
        }
        
        // constructor just for allocation
        public $Closure$290(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.CUDAUtilities.$Closure$290.$initParams(this, $T);
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$G(x10.core.Long.$unbox(a1));
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$290 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Long$3x10$util$CUDAUtilities$$Closure$290$$T$2 {}
        
    
        
        public $T $apply$G(final long p) {
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            final int t$136136 = ((int)(long)(((long)(p))));
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            final long t$136137 = ((long)(((int)(t$136136))));
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            final $T t$136138 = (($T)((($T)
                                        ((x10.core.fun.Fun_0_1<x10.core.Long,$T>)this.init).$apply(x10.core.Long.$box(t$136137), x10.rtt.Types.LONG))));
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            return t$136138;
        }
        
        public x10.core.fun.Fun_0_1<x10.core.Long,$T> init;
        
        public $Closure$290(final x10.rtt.Type $T, final x10.core.fun.Fun_0_1<x10.core.Long,$T> init, __0$1x10$lang$Long$3x10$util$CUDAUtilities$$Closure$290$$T$2 $dummy) {
            x10.util.CUDAUtilities.$Closure$290.$initParams(this, $T);
             {
                ((x10.util.CUDAUtilities.$Closure$290<$T>)this).init = ((x10.core.fun.Fun_0_1)(init));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$291<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$291> $RTT = 
            x10.rtt.StaticFunType.<$Closure$291> make($Closure$291.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.lang.GlobalRail.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.CUDAUtilities.$Closure$291<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.init = $deserializer.readObject();
            $_obj.numElements = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.CUDAUtilities.$Closure$291 $_obj = new x10.util.CUDAUtilities.$Closure$291((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.init);
            $serializer.write(this.numElements);
            
        }
        
        // constructor just for allocation
        public $Closure$291(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.CUDAUtilities.$Closure$291.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.lang.GlobalRail $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$291 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Long$3x10$util$CUDAUtilities$$Closure$291$$T$2 {}
        
    
        
        public x10.lang.GlobalRail $apply() {
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
            try {{
                
                //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                final x10.core.fun.Fun_0_1 t$136165 = ((x10.core.fun.Fun_0_1)(new x10.util.CUDAUtilities.$Closure$290<$T>($T, ((x10.core.fun.Fun_0_1)(this.init)), (x10.util.CUDAUtilities.$Closure$290.__0$1x10$lang$Long$3x10$util$CUDAUtilities$$Closure$290$$T$2) null)));
                
                //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                final x10.core.Rail t$136140 = ((x10.core.Rail)(new x10.core.Rail<$T>($T, this.numElements, ((x10.core.fun.Fun_0_1)(t$136165)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                
                //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                final x10.lang.GlobalRail t$136141 = ((x10.lang.GlobalRail)(new x10.lang.GlobalRail<$T>((java.lang.System[]) null, $T)));
                
                //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                t$136141.x10$lang$GlobalRail$$init$S(((x10.core.Rail)(t$136140)), (x10.lang.GlobalRail.__0$1x10$lang$GlobalRail$$T$2) null);
                
                //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                return t$136141;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                x10.lang.GlobalRail __lowerer__var__1__ = ((x10.lang.GlobalRail)(x10.lang.Runtime.<x10.lang.GlobalRail<$T>> wrapAtChecked$G(x10.rtt.ParameterizedType.make(x10.lang.GlobalRail.$RTT, $T), ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
                return __lowerer__var__1__;
            }
        }
        
        public x10.core.fun.Fun_0_1<x10.core.Long,$T> init;
        public long numElements;
        
        public $Closure$291(final x10.rtt.Type $T, final x10.core.fun.Fun_0_1<x10.core.Long,$T> init, final long numElements, __0$1x10$lang$Long$3x10$util$CUDAUtilities$$Closure$291$$T$2 $dummy) {
            x10.util.CUDAUtilities.$Closure$291.$initParams(this, $T);
             {
                ((x10.util.CUDAUtilities.$Closure$291<$T>)this).init = ((x10.core.fun.Fun_0_1)(init));
                ((x10.util.CUDAUtilities.$Closure$291<$T>)this).numElements = numElements;
            }
        }
        
    }
    
    }
    
    