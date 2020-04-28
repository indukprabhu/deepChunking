package x10.regionarray;

@x10.runtime.impl.java.X10Generated
final public class VarRow extends x10.regionarray.Row implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<VarRow> $RTT = 
        x10.rtt.NamedType.<VarRow> make("x10.regionarray.VarRow",
                                        VarRow.class,
                                        new x10.rtt.Type[] {
                                            x10.regionarray.Row.$RTT
                                        });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.VarRow $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.Row.$_deserialize_body($_obj, $deserializer);
        $_obj.row = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.VarRow $_obj = new x10.regionarray.VarRow((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.row);
        
    }
    
    // constructor just for allocation
    public VarRow(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    // synthetic type for parameter mangling
    public static final class __1$1x10$lang$Int$3x10$lang$Int$2 {}
    

    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
    public x10.core.Rail<x10.core.Int> row;
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
    // creation method for java code (1-phase java constructor)
    public VarRow(final int cols, final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> init, __1$1x10$lang$Int$3x10$lang$Int$2 $dummy) {
        this((java.lang.System[]) null);
        x10$regionarray$VarRow$$init$S(cols, init, (x10.regionarray.VarRow.__1$1x10$lang$Int$3x10$lang$Int$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.VarRow x10$regionarray$VarRow$$init$S(final int cols, final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> init, __1$1x10$lang$Int$3x10$lang$Int$2 $dummy) {
         {
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
            final x10.regionarray.Row this$135248 = ((x10.regionarray.Row)(this));
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int cols$135247 = cols;
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            this$135248.cols = cols$135247;
            {
                
            }
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
            final x10.regionarray.VarRow this$135279 = this;
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
            final long t$135267 = ((long)(((int)(cols))));
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
            final x10.core.fun.Fun_0_1 t$135268 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.VarRow.$Closure$279(init, (x10.regionarray.VarRow.$Closure$279.__0$1x10$lang$Int$3x10$lang$Int$2) null)));
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
            final x10.core.Rail t$135269 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, t$135267, ((x10.core.fun.Fun_0_1)(t$135268)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
            this.row = ((x10.core.Rail)(t$135269));
        }
        return this;
    }
    
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
    // creation method for java code (1-phase java constructor)
    public VarRow(final int cols) {
        this((java.lang.System[]) null);
        x10$regionarray$VarRow$$init$S(cols);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.VarRow x10$regionarray$VarRow$$init$S(final int cols) {
         {
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
            final x10.regionarray.Row this$135256 = ((x10.regionarray.Row)(this));
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int cols$135255 = cols;
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            this$135256.cols = cols$135255;
            {
                
            }
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
            final x10.regionarray.VarRow this$135280 = this;
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
            final long t$135270 = ((long)(((int)(cols))));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
            final x10.core.Rail t$135271 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, t$135270)));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
            this.row = ((x10.core.Rail)(t$135271));
        }
        return this;
    }
    
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
    public x10.core.Rail row() {
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
        final x10.core.Rail t$135272 = ((x10.core.Rail)(row));
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
        return t$135272;
    }
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
    public int $apply$O(final int i) {
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
        final x10.regionarray.VarRow this$135263 = ((x10.regionarray.VarRow)(this));
        
        //#line 28 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
        final x10.core.Rail t$135273 = ((x10.core.Rail)(this$135263.row));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
        final long t$135274 = ((long)(((int)(i))));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
        final int t$135275 = ((int[])t$135273.value)[(int)t$135274];
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
        return t$135275;
    }
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
    public int $set$O(final int i, final int v) {
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
        final x10.regionarray.VarRow this$135264 = ((x10.regionarray.VarRow)(this));
        
        //#line 28 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
        final x10.core.Rail t$135276 = ((x10.core.Rail)(this$135264.row));
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
        final long t$135277 = ((long)(((int)(i))));
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
        final int t$135278 = x10.core.Int.$unbox(((int[])t$135276.value)[(int)t$135277] = v);
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
        return t$135278;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
    final public x10.regionarray.VarRow x10$regionarray$VarRow$$this$x10$regionarray$VarRow() {
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
        return x10.regionarray.VarRow.this;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
    final public void __fieldInitializers_x10_regionarray_VarRow() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$279 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$279> $RTT = 
            x10.rtt.StaticFunType.<$Closure$279> make($Closure$279.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.VarRow.$Closure$279 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.init = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.VarRow.$Closure$279 $_obj = new x10.regionarray.VarRow.$Closure$279((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.init);
            
        }
        
        // constructor just for allocation
        public $Closure$279(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Int.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public int $apply$I(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Int$3x10$lang$Int$2 {}
        
    
        
        public int $apply$O(final long i) {
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
            final int t$135265 = ((int)(long)(((long)(i))));
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
            final int t$135266 = x10.core.Int.$unbox(((x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int>)this.init).$apply(x10.core.Int.$box(t$135265), x10.rtt.Types.INT));
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/VarRow.x10"
            return t$135266;
        }
        
        public x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> init;
        
        public $Closure$279(final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> init, __0$1x10$lang$Int$3x10$lang$Int$2 $dummy) {
             {
                this.init = ((x10.core.fun.Fun_0_1)(init));
            }
        }
        
    }
    
}

