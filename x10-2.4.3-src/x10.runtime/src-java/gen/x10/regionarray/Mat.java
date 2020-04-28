package x10.regionarray;


@x10.runtime.impl.java.X10Generated
abstract public class Mat<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.lang.Iterable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Mat> $RTT = 
        x10.rtt.NamedType.<Mat> make("x10.regionarray.Mat",
                                     Mat.class,
                                     1,
                                     new x10.rtt.Type[] {
                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.UnresolvedType.PARAM(0)),
                                         x10.rtt.ParameterizedType.make(x10.lang.Iterable.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                     });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.Mat<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.mat = $deserializer.readObject();
        $_obj.rows = $deserializer.readInt();
        $_obj.cols = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.mat);
        $serializer.write(this.rows);
        $serializer.write(this.cols);
        
    }
    
    // constructor just for allocation
    public Mat(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.regionarray.Mat.$initParams(this, $T);
        
    }
    
    // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1){}:U
    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
        return $apply$G(x10.core.Int.$unbox(a1));
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final Mat $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __2$1x10$regionarray$Mat$$T$2 {}
    
    // properties
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    public int rows;
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    public int cols;
    

    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    public x10.core.Rail<$T> mat;
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    
    // constructor for non-virtual call
    final public x10.regionarray.Mat<$T> x10$regionarray$Mat$$init$S(final int rows, final int cols, final x10.core.Rail<$T> mat, __2$1x10$regionarray$Mat$$T$2 $dummy) {
         {
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            this.rows = rows;
            this.cols = cols;
            
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            final x10.regionarray.Mat this$126532 = this;
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            ((x10.regionarray.Mat<$T>)this).mat = ((x10.core.Rail)(mat));
        }
        return this;
    }
    
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    public $T $apply$G(final int i) {
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
        final x10.core.Rail t$126522 = ((x10.core.Rail)(mat));
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
        final long t$126523 = ((long)(((int)(i))));
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
        final $T t$126524 = (($T)(((x10.core.Rail<$T>)t$126522).$apply$G((long)(t$126523))));
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
        return t$126524;
    }
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    public x10.lang.Iterator iterator() {
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
        final x10.core.Rail t$126525 = ((x10.core.Rail)(mat));
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
        final x10.lang.Iterator t$126526 = ((x10.lang.Iterator<$T>)
                                             ((x10.core.Rail<$T>)t$126525).iterator());
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
        return t$126526;
    }
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    public void printInfo(final x10.io.Printer ps, final java.lang.String label) {
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
        ps.printf(((java.lang.String)("%s\n")), ((java.lang.Object)(label)));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
        int row = 0;
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
        final x10.lang.Iterator r$126538 = ((x10.lang.Iterator<$T>)
                                             this.iterator());
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
        for (;
             true;
             ) {
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            final boolean t$126539 = ((x10.lang.Iterator<$T>)r$126538).hasNext$O();
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            if (!(t$126539)) {
                
                //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
                break;
            }
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            final $T t$126533 = (($T)(((x10.lang.Iterator<$T>)r$126538).next$G()));
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            final x10.regionarray.Row r$126534 = ((x10.regionarray.Row)
                                                   t$126533);
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            ps.printf(((java.lang.String)("    ")));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            final int pre$126535 = row;
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            final int t$126536 = row;
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            final int t$126537 = ((t$126536) + (((int)(1))));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            row = t$126537;
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            r$126534.printInfo(((x10.io.Printer)(ps)), (int)(pre$126535));
        }
    }
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    final public x10.regionarray.Mat x10$regionarray$Mat$$this$x10$regionarray$Mat() {
        
        //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
        return x10.regionarray.Mat.this;
    }
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    final public void __fieldInitializers_x10_regionarray_Mat() {
        
    }
}

