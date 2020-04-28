package x10.regionarray;

@x10.runtime.impl.java.X10Generated
public class ValRow extends x10.regionarray.Row implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ValRow> $RTT = 
        x10.rtt.NamedType.<ValRow> make("x10.regionarray.ValRow",
                                        ValRow.class,
                                        new x10.rtt.Type[] {
                                            x10.regionarray.Row.$RTT
                                        });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.ValRow $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.Row.$_deserialize_body($_obj, $deserializer);
        $_obj.row = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.ValRow $_obj = new x10.regionarray.ValRow((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.row);
        
    }
    
    // constructor just for allocation
    public ValRow(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    // synthetic type for parameter mangling
    public static final class __0$1x10$lang$Int$2 {}
    // synthetic type for parameter mangling
    public static final class __1$1x10$lang$Int$3x10$lang$Int$2 {}
    

    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
    public x10.core.Rail<x10.core.Int> row;
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
    // creation method for java code (1-phase java constructor)
    public ValRow(final x10.core.Rail<x10.core.Int> row, __0$1x10$lang$Int$2 $dummy) {
        this((java.lang.System[]) null);
        x10$regionarray$ValRow$$init$S(row, (x10.regionarray.ValRow.__0$1x10$lang$Int$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.ValRow x10$regionarray$ValRow$$init$S(final x10.core.Rail<x10.core.Int> row, __0$1x10$lang$Int$2 $dummy) {
         {
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
            final x10.regionarray.Row this$135186 = ((x10.regionarray.Row)(this));
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
            final long t$135201 = ((x10.core.Rail<x10.core.Int>)row).size;
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int cols$135185 = ((int)(long)(((long)(t$135201))));
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            this$135186.cols = cols$135185;
            {
                
            }
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
            final x10.regionarray.ValRow this$135211 = this;
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
            this.row = ((x10.core.Rail)(row));
        }
        return this;
    }
    
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
    // creation method for java code (1-phase java constructor)
    public ValRow(final int cols, final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> init, __1$1x10$lang$Int$3x10$lang$Int$2 $dummy) {
        this((java.lang.System[]) null);
        x10$regionarray$ValRow$$init$S(cols, init, (x10.regionarray.ValRow.__1$1x10$lang$Int$3x10$lang$Int$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.ValRow x10$regionarray$ValRow$$init$S(final int cols, final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> init, __1$1x10$lang$Int$3x10$lang$Int$2 $dummy) {
         {
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
            final x10.regionarray.Row this$135194 = ((x10.regionarray.Row)(this));
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int cols$135193 = cols;
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            this$135194.cols = cols$135193;
            {
                
            }
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
            final x10.regionarray.ValRow this$135212 = this;
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
            final long t$135204 = ((long)(((int)(cols))));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
            final x10.core.fun.Fun_0_1 t$135205 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.ValRow.$Closure$274(init, (x10.regionarray.ValRow.$Closure$274.__0$1x10$lang$Int$3x10$lang$Int$2) null)));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
            final x10.core.Rail t$135206 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, t$135204, ((x10.core.fun.Fun_0_1)(t$135205)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
            this.row = ((x10.core.Rail)(t$135206));
        }
        return this;
    }
    
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
    public int $apply$O(final int i) {
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
        final x10.core.Rail t$135207 = ((x10.core.Rail)(row));
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
        final long t$135208 = ((long)(((int)(i))));
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
        final int t$135209 = ((int[])t$135207.value)[(int)t$135208];
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
        return t$135209;
    }
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
    public int $set$O(final int i, final int v) {
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
        final x10.lang.IllegalOperationException t$135210 = ((x10.lang.IllegalOperationException)(new x10.lang.IllegalOperationException(((java.lang.String)("ValRow.set")))));
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
        throw t$135210;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
    final public x10.regionarray.ValRow x10$regionarray$ValRow$$this$x10$regionarray$ValRow() {
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
        return x10.regionarray.ValRow.this;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
    final public void __fieldInitializers_x10_regionarray_ValRow() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$274 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$274> $RTT = 
            x10.rtt.StaticFunType.<$Closure$274> make($Closure$274.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.ValRow.$Closure$274 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.init = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.ValRow.$Closure$274 $_obj = new x10.regionarray.ValRow.$Closure$274((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.init);
            
        }
        
        // constructor just for allocation
        public $Closure$274(final java.lang.System[] $dummy) {
            
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
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
            final int t$135202 = ((int)(long)(((long)(i))));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
            final int t$135203 = x10.core.Int.$unbox(((x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int>)this.init).$apply(x10.core.Int.$box(t$135202), x10.rtt.Types.INT));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ValRow.x10"
            return t$135203;
        }
        
        public x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> init;
        
        public $Closure$274(final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> init, __0$1x10$lang$Int$3x10$lang$Int$2 $dummy) {
             {
                this.init = ((x10.core.fun.Fun_0_1)(init));
            }
        }
        
    }
    
}

