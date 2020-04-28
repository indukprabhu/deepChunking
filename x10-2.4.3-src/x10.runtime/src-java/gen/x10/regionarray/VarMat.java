package x10.regionarray;

@x10.runtime.impl.java.X10Generated
final public class VarMat extends x10.regionarray.Mat<x10.regionarray.VarRow> implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<VarMat> $RTT = 
        x10.rtt.NamedType.<VarMat> make("x10.regionarray.VarMat",
                                        VarMat.class,
                                        new x10.rtt.Type[] {
                                            x10.rtt.ParameterizedType.make(x10.regionarray.Mat.$RTT, x10.regionarray.VarRow.$RTT)
                                        });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.VarMat $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.Mat.$_deserialize_body($_obj, $deserializer);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.VarMat $_obj = new x10.regionarray.VarMat((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        
    }
    
    // constructor just for allocation
    public VarMat(final java.lang.System[] $dummy) {
        super($dummy, x10.regionarray.VarRow.$RTT);
        
    }
    
    // bridge for method public x10.regionarray.Mat[T].operator()(i:x10.lang.Int){}:T
    public x10.regionarray.VarRow $apply(int a1){
        return super.$apply$G((a1));
    }
    
    // synthetic type for parameter mangling
    public static final class __1$1x10$regionarray$VarRow$2 {}
    // synthetic type for parameter mangling
    public static final class __2$1x10$lang$Int$3x10$regionarray$VarRow$2 {}
    // synthetic type for parameter mangling
    public static final class __2$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2 {}
    

    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
    // creation method for java code (1-phase java constructor)
    public VarMat(final int cols, final x10.core.Rail<x10.regionarray.VarRow> mat, __1$1x10$regionarray$VarRow$2 $dummy) {
        this((java.lang.System[]) null);
        x10$regionarray$VarMat$$init$S(cols, mat, (x10.regionarray.VarMat.__1$1x10$regionarray$VarRow$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.VarMat x10$regionarray$VarMat$$init$S(final int cols, final x10.core.Rail<x10.regionarray.VarRow> mat, __1$1x10$regionarray$VarRow$2 $dummy) {
         {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            final x10.regionarray.Mat this$135216 = ((x10.regionarray.Mat)(this));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            final long t$135233 = ((x10.core.Rail<x10.regionarray.VarRow>)mat).size;
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            final int rows$135213 = ((int)(long)(((long)(t$135233))));
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            final int cols$135214 = cols;
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            final x10.core.Rail mat$135215 = ((x10.core.Rail)(mat));
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            ((x10.regionarray.Mat<x10.regionarray.VarRow>)this$135216).rows = rows$135213;
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            ((x10.regionarray.Mat<x10.regionarray.VarRow>)this$135216).cols = cols$135214;
            {
                
            }
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            ((x10.regionarray.Mat<x10.regionarray.VarRow>)this$135216).mat = ((x10.core.Rail)(mat$135215));
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            final x10.regionarray.VarMat this$135242 = this;
        }
        return this;
    }
    
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
    // creation method for java code (1-phase java constructor)
    public VarMat(final int rows, final int cols, final x10.core.fun.Fun_0_1<x10.core.Int,x10.regionarray.VarRow> init, __2$1x10$lang$Int$3x10$regionarray$VarRow$2 $dummy) {
        this((java.lang.System[]) null);
        x10$regionarray$VarMat$$init$S(rows, cols, init, (x10.regionarray.VarMat.__2$1x10$lang$Int$3x10$regionarray$VarRow$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.VarMat x10$regionarray$VarMat$$init$S(final int rows, final int cols, final x10.core.fun.Fun_0_1<x10.core.Int,x10.regionarray.VarRow> init, __2$1x10$lang$Int$3x10$regionarray$VarRow$2 $dummy) {
         {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            final x10.regionarray.Mat this$135226 = ((x10.regionarray.Mat)(this));
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            final int rows$135223 = rows;
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            final int cols$135224 = cols;
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            final long t$135236 = ((long)(((int)(rows))));
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            final x10.core.fun.Fun_0_1 t$135237 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.VarMat.$Closure$275(init, (x10.regionarray.VarMat.$Closure$275.__0$1x10$lang$Int$3x10$regionarray$VarRow$2) null)));
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            final x10.core.Rail mat$135225 = ((x10.core.Rail)(new x10.core.Rail<x10.regionarray.VarRow>(x10.regionarray.VarRow.$RTT, t$135236, ((x10.core.fun.Fun_0_1)(t$135237)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            ((x10.regionarray.Mat<x10.regionarray.VarRow>)this$135226).rows = rows$135223;
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            ((x10.regionarray.Mat<x10.regionarray.VarRow>)this$135226).cols = cols$135224;
            {
                
            }
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            ((x10.regionarray.Mat<x10.regionarray.VarRow>)this$135226).mat = ((x10.core.Rail)(mat$135225));
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            final x10.regionarray.VarMat this$135243 = this;
        }
        return this;
    }
    
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
    // creation method for java code (1-phase java constructor)
    public VarMat(final int rows, final int cols, final x10.core.fun.Fun_0_2<x10.core.Int,x10.core.Int,x10.core.Int> init, __2$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2 $dummy) {
        this((java.lang.System[]) null);
        x10$regionarray$VarMat$$init$S(rows, cols, init, (x10.regionarray.VarMat.__2$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.VarMat x10$regionarray$VarMat$$init$S(final int rows, final int cols, final x10.core.fun.Fun_0_2<x10.core.Int,x10.core.Int,x10.core.Int> init, __2$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2 $dummy) {
         {
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            final x10.core.fun.Fun_0_1 t$135240 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.VarMat.$Closure$277(init, cols, (x10.regionarray.VarMat.$Closure$277.__0$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2) null)));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            /*this.*/x10$regionarray$VarMat$$init$S(((int)(rows)), ((int)(cols)), ((x10.core.fun.Fun_0_1)(t$135240)), (x10.regionarray.VarMat.__2$1x10$lang$Int$3x10$regionarray$VarRow$2) null);
        }
        return this;
    }
    
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
    // creation method for java code (1-phase java constructor)
    public VarMat(final int rows, final int cols) {
        this((java.lang.System[]) null);
        x10$regionarray$VarMat$$init$S(rows, cols);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.VarMat x10$regionarray$VarMat$$init$S(final int rows, final int cols) {
         {
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            final x10.core.fun.Fun_0_1 t$135241 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.VarMat.$Closure$278(cols)));
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            /*this.*/x10$regionarray$VarMat$$init$S(((int)(rows)), ((int)(cols)), ((x10.core.fun.Fun_0_1)(t$135241)), (x10.regionarray.VarMat.__2$1x10$lang$Int$3x10$regionarray$VarRow$2) null);
        }
        return this;
    }
    
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
    final public x10.regionarray.VarMat x10$regionarray$VarMat$$this$x10$regionarray$VarMat() {
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
        return x10.regionarray.VarMat.this;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
    final public void __fieldInitializers_x10_regionarray_VarMat() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$275 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$275> $RTT = 
            x10.rtt.StaticFunType.<$Closure$275> make($Closure$275.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.regionarray.VarRow.$RTT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.VarMat.$Closure$275 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.init = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.VarMat.$Closure$275 $_obj = new x10.regionarray.VarMat.$Closure$275((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.init);
            
        }
        
        // constructor just for allocation
        public $Closure$275(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Long.$unbox(a1));
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Int$3x10$regionarray$VarRow$2 {}
        
    
        
        public x10.regionarray.VarRow $apply(final long i) {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            final int t$135234 = ((int)(long)(((long)(i))));
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            final x10.regionarray.VarRow t$135235 = ((x10.regionarray.VarRow)
                                                      ((x10.core.fun.Fun_0_1<x10.core.Int,x10.regionarray.VarRow>)this.init).$apply(x10.core.Int.$box(t$135234), x10.rtt.Types.INT));
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            return t$135235;
        }
        
        public x10.core.fun.Fun_0_1<x10.core.Int,x10.regionarray.VarRow> init;
        
        public $Closure$275(final x10.core.fun.Fun_0_1<x10.core.Int,x10.regionarray.VarRow> init, __0$1x10$lang$Int$3x10$regionarray$VarRow$2 $dummy) {
             {
                this.init = ((x10.core.fun.Fun_0_1)(init));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$276 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$276> $RTT = 
            x10.rtt.StaticFunType.<$Closure$276> make($Closure$276.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.VarMat.$Closure$276 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.init = $deserializer.readObject();
            $_obj.i = $deserializer.readInt();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.VarMat.$Closure$276 $_obj = new x10.regionarray.VarMat.$Closure$276((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.init);
            $serializer.write(this.i);
            
        }
        
        // constructor just for allocation
        public $Closure$276(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public int $apply$I(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Int.$unbox(a1));
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2 {}
        
    
        
        public int $apply$O(final int j$135245) {
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            final int t$135246 = x10.core.Int.$unbox(((x10.core.fun.Fun_0_2<x10.core.Int,x10.core.Int,x10.core.Int>)this.init).$apply(x10.core.Int.$box(this.i), x10.rtt.Types.INT, x10.core.Int.$box(j$135245), x10.rtt.Types.INT));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            return t$135246;
        }
        
        public x10.core.fun.Fun_0_2<x10.core.Int,x10.core.Int,x10.core.Int> init;
        public int i;
        
        public $Closure$276(final x10.core.fun.Fun_0_2<x10.core.Int,x10.core.Int,x10.core.Int> init, final int i, __0$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2 $dummy) {
             {
                this.init = ((x10.core.fun.Fun_0_2)(init));
                this.i = i;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$277 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$277> $RTT = 
            x10.rtt.StaticFunType.<$Closure$277> make($Closure$277.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.regionarray.VarRow.$RTT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.VarMat.$Closure$277 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.init = $deserializer.readObject();
            $_obj.cols = $deserializer.readInt();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.VarMat.$Closure$277 $_obj = new x10.regionarray.VarMat.$Closure$277((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.init);
            $serializer.write(this.cols);
            
        }
        
        // constructor just for allocation
        public $Closure$277(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Int.$unbox(a1));
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2 {}
        
    
        
        public x10.regionarray.VarRow $apply(final int i) {
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            final x10.regionarray.VarRow alloc$132014 = ((x10.regionarray.VarRow)(new x10.regionarray.VarRow((java.lang.System[]) null)));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            final x10.core.fun.Fun_0_1 t$135244 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.VarMat.$Closure$276(((x10.core.fun.Fun_0_2)(this.init)), i, (x10.regionarray.VarMat.$Closure$276.__0$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2) null)));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            alloc$132014.x10$regionarray$VarRow$$init$S(this.cols, ((x10.core.fun.Fun_0_1)(t$135244)), (x10.regionarray.VarRow.__1$1x10$lang$Int$3x10$lang$Int$2) null);
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            return alloc$132014;
        }
        
        public x10.core.fun.Fun_0_2<x10.core.Int,x10.core.Int,x10.core.Int> init;
        public int cols;
        
        public $Closure$277(final x10.core.fun.Fun_0_2<x10.core.Int,x10.core.Int,x10.core.Int> init, final int cols, __0$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2 $dummy) {
             {
                this.init = ((x10.core.fun.Fun_0_2)(init));
                this.cols = cols;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$278 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$278> $RTT = 
            x10.rtt.StaticFunType.<$Closure$278> make($Closure$278.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.regionarray.VarRow.$RTT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.VarMat.$Closure$278 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.cols = $deserializer.readInt();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.VarMat.$Closure$278 $_obj = new x10.regionarray.VarMat.$Closure$278((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.cols);
            
        }
        
        // constructor just for allocation
        public $Closure$278(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Int.$unbox(a1));
            
        }
        
        
    
        
        public x10.regionarray.VarRow $apply(final int id$157) {
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            final x10.regionarray.VarRow alloc$132015 = ((x10.regionarray.VarRow)(new x10.regionarray.VarRow((java.lang.System[]) null)));
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            alloc$132015.x10$regionarray$VarRow$$init$S(this.cols);
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarMat.x10"
            return alloc$132015;
        }
        
        public int cols;
        
        public $Closure$278(final int cols) {
             {
                this.cols = cols;
            }
        }
        
    }
    
}

