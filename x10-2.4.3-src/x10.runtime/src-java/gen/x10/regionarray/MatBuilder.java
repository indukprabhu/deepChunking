package x10.regionarray;


@x10.runtime.impl.java.X10Generated
public class MatBuilder extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<MatBuilder> $RTT = 
        x10.rtt.NamedType.<MatBuilder> make("x10.regionarray.MatBuilder",
                                            MatBuilder.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.MatBuilder $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.mat = $deserializer.readObject();
        $_obj.cols = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.MatBuilder $_obj = new x10.regionarray.MatBuilder((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.mat);
        $serializer.write(this.cols);
        
    }
    
    // constructor just for allocation
    public MatBuilder(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    public x10.util.ArrayList<x10.regionarray.Row> mat;
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    public int cols;
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    // creation method for java code (1-phase java constructor)
    public MatBuilder(final int cols) {
        this((java.lang.System[]) null);
        x10$regionarray$MatBuilder$$init$S(cols);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.MatBuilder x10$regionarray$MatBuilder$$init$S(final int cols) {
         {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final x10.regionarray.MatBuilder this$126712 = this;
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            this.cols = cols;
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final x10.util.ArrayList alloc$126645 = ((x10.util.ArrayList)(new x10.util.ArrayList<x10.regionarray.Row>((java.lang.System[]) null, x10.regionarray.Row.$RTT)));
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            alloc$126645.x10$util$ArrayList$$init$S();
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            this.mat = ((x10.util.ArrayList)(alloc$126645));
        }
        return this;
    }
    
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    // creation method for java code (1-phase java constructor)
    public MatBuilder(final int rows, final int cols) {
        this((java.lang.System[]) null);
        x10$regionarray$MatBuilder$$init$S(rows, cols);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.MatBuilder x10$regionarray$MatBuilder$$init$S(final int rows, final int cols) {
         {
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final x10.regionarray.MatBuilder this$126713 = this;
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            this.cols = cols;
            
            //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final x10.util.ArrayList m = ((x10.util.ArrayList)(new x10.util.ArrayList<x10.regionarray.Row>((java.lang.System[]) null, x10.regionarray.Row.$RTT)));
            
            //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final long t$126714 = ((long)(((int)(rows))));
            
            //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            m.x10$util$ArrayList$$init$S(t$126714);
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            this.mat = ((x10.util.ArrayList)(m));
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            x10.regionarray.MatBuilder.need__1$1x10$regionarray$Row$2((int)(rows), ((x10.util.ArrayList)(m)), (int)(cols));
        }
        return this;
    }
    
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    public void add(final x10.regionarray.Row row) {
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        final x10.util.ArrayList t$126655 = ((x10.util.ArrayList)(mat));
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        ((x10.util.ArrayList<x10.regionarray.Row>)t$126655).add__0x10$util$ArrayList$$T$O(((x10.regionarray.Row)(row)));
    }
    
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    public void add__0$1x10$lang$Int$3x10$lang$Int$2(final x10.core.fun.Fun_0_1 a) {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        final x10.util.ArrayList t$126657 = ((x10.util.ArrayList)(mat));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        final x10.regionarray.VarRow alloc$126646 = ((x10.regionarray.VarRow)(new x10.regionarray.VarRow((java.lang.System[]) null)));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        final int t$126715 = cols;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        alloc$126646.x10$regionarray$VarRow$$init$S(((int)(t$126715)), ((x10.core.fun.Fun_0_1)(a)), (x10.regionarray.VarRow.__1$1x10$lang$Int$3x10$lang$Int$2) null);
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        ((x10.util.ArrayList<x10.regionarray.Row>)t$126657).add__0x10$util$ArrayList$$T$O(((x10.regionarray.Row)(alloc$126646)));
    }
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    public int $apply$O(final int i, final int j) {
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        final x10.util.ArrayList t$126658 = ((x10.util.ArrayList)(mat));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        final long t$126659 = ((long)(((int)(i))));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        final x10.regionarray.Row t$126660 = ((x10.util.ArrayList<x10.regionarray.Row>)t$126658).$apply$G((long)(t$126659));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        final int t$126661 = t$126660.$apply$O((int)(j));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        return t$126661;
    }
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    public void $set(final int i, final int j, final int v) {
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        final int t$126662 = ((i) + (((int)(1))));
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        this.need((int)(t$126662));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        final x10.util.ArrayList t$126663 = ((x10.util.ArrayList)(mat));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        final long t$126664 = ((long)(((int)(i))));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        final x10.regionarray.Row t$126665 = ((x10.util.ArrayList<x10.regionarray.Row>)t$126663).$apply$G((long)(t$126664));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        t$126665.$set$O((int)(j), (int)(v));
    }
    
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    public void setDiagonal__3$1x10$lang$Int$3x10$lang$Int$2(final int i, final int j, final int n, final x10.core.fun.Fun_0_1 v) {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        final int t$126666 = ((i) + (((int)(n))));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        this.need((int)(t$126666));
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        int k$126727 = 0;
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        for (;
             true;
             ) {
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126728 = k$126727;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final boolean t$126729 = ((t$126728) < (((int)(n))));
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            if (!(t$126729)) {
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
                break;
            }
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final x10.util.ArrayList t$126716 = ((x10.util.ArrayList)(mat));
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126717 = k$126727;
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126718 = ((i) + (((int)(t$126717))));
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final long t$126719 = ((long)(((int)(t$126718))));
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final x10.regionarray.Row t$126720 = ((x10.util.ArrayList<x10.regionarray.Row>)t$126716).$apply$G((long)(t$126719));
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126721 = k$126727;
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126722 = ((j) + (((int)(t$126721))));
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126723 = k$126727;
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126724 = x10.core.Int.$unbox(((x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int>)v).$apply(x10.core.Int.$box(t$126723), x10.rtt.Types.INT));
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            t$126720.$set$O((int)(t$126722), (int)(t$126724));
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126725 = k$126727;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126726 = ((t$126725) + (((int)(1))));
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            k$126727 = t$126726;
        }
    }
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    public void setColumn__3$1x10$lang$Int$3x10$lang$Int$2(final int i, final int j, final int n, final x10.core.fun.Fun_0_1 v) {
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        final int t$126681 = ((i) + (((int)(n))));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        this.need((int)(t$126681));
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        int k$126739 = 0;
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        for (;
             true;
             ) {
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126740 = k$126739;
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final boolean t$126741 = ((t$126740) < (((int)(n))));
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            if (!(t$126741)) {
                
                //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
                break;
            }
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final x10.util.ArrayList t$126730 = ((x10.util.ArrayList)(mat));
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126731 = k$126739;
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126732 = ((i) + (((int)(t$126731))));
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final long t$126733 = ((long)(((int)(t$126732))));
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final x10.regionarray.Row t$126734 = ((x10.util.ArrayList<x10.regionarray.Row>)t$126730).$apply$G((long)(t$126733));
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126735 = k$126739;
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126736 = x10.core.Int.$unbox(((x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int>)v).$apply(x10.core.Int.$box(t$126735), x10.rtt.Types.INT));
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            t$126734.$set$O((int)(j), (int)(t$126736));
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126737 = k$126739;
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126738 = ((t$126737) + (((int)(1))));
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            k$126739 = t$126738;
        }
    }
    
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    public void setRow__3$1x10$lang$Int$3x10$lang$Int$2(final int i, final int j, final int n, final x10.core.fun.Fun_0_1 v) {
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        final int t$126694 = ((i) + (((int)(1))));
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        this.need((int)(t$126694));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        int k$126751 = 0;
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        for (;
             true;
             ) {
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126752 = k$126751;
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final boolean t$126753 = ((t$126752) < (((int)(n))));
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            if (!(t$126753)) {
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
                break;
            }
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final x10.util.ArrayList t$126742 = ((x10.util.ArrayList)(mat));
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final long t$126743 = ((long)(((int)(i))));
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final x10.regionarray.Row t$126744 = ((x10.util.ArrayList<x10.regionarray.Row>)t$126742).$apply$G((long)(t$126743));
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126745 = k$126751;
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126746 = ((j) + (((int)(t$126745))));
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126747 = k$126751;
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126748 = x10.core.Int.$unbox(((x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int>)v).$apply(x10.core.Int.$box(t$126747), x10.rtt.Types.INT));
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            t$126744.$set$O((int)(t$126746), (int)(t$126748));
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126749 = k$126751;
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final int t$126750 = ((t$126749) + (((int)(1))));
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            k$126751 = t$126750;
        }
    }
    
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    private void need(final int n) {
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        final x10.util.ArrayList t$126707 = ((x10.util.ArrayList)(this.mat));
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        final int t$126708 = this.cols;
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        x10.regionarray.MatBuilder.need__1$1x10$regionarray$Row$2((int)(n), ((x10.util.ArrayList)(t$126707)), (int)(t$126708));
    }
    
    public static void need$P(final int n, final x10.regionarray.MatBuilder MatBuilder) {
        MatBuilder.need((int)(n));
    }
    
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    private static void need__1$1x10$regionarray$Row$2(final int n, final x10.util.ArrayList<x10.regionarray.Row> mat, final int cols) {
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        while (true) {
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final long t$126709 = ((x10.util.ArrayList<x10.regionarray.Row>)mat).size$O();
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final long t$126710 = ((long)(((int)(n))));
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final boolean t$126711 = ((t$126709) < (((long)(t$126710))));
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            if (!(t$126711)) {
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
                break;
            }
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            final x10.regionarray.VarRow alloc$126754 = ((x10.regionarray.VarRow)(new x10.regionarray.VarRow((java.lang.System[]) null)));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            alloc$126754.x10$regionarray$VarRow$$init$S(((int)(cols)));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            ((x10.util.ArrayList<x10.regionarray.Row>)mat).add__0x10$util$ArrayList$$T$O(((x10.regionarray.Row)(alloc$126754)));
        }
    }
    
    public static void need$P__1$1x10$regionarray$Row$2(final int n, final x10.util.ArrayList<x10.regionarray.Row> mat, final int cols) {
        x10.regionarray.MatBuilder.need__1$1x10$regionarray$Row$2((int)(n), ((x10.util.ArrayList)(mat)), (int)(cols));
    }
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    final public x10.regionarray.MatBuilder x10$regionarray$MatBuilder$$this$x10$regionarray$MatBuilder() {
        
        //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        return x10.regionarray.MatBuilder.this;
    }
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    final public void __fieldInitializers_x10_regionarray_MatBuilder() {
        
    }
}

