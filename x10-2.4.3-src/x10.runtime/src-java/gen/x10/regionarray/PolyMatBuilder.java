package x10.regionarray;


@x10.runtime.impl.java.X10Generated
public class PolyMatBuilder extends x10.regionarray.MatBuilder implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<PolyMatBuilder> $RTT = 
        x10.rtt.NamedType.<PolyMatBuilder> make("x10.regionarray.PolyMatBuilder",
                                                PolyMatBuilder.class,
                                                new x10.rtt.Type[] {
                                                    x10.regionarray.MatBuilder.$RTT
                                                });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyMatBuilder $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.MatBuilder.$_deserialize_body($_obj, $deserializer);
        $_obj.rank = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.PolyMatBuilder $_obj = new x10.regionarray.PolyMatBuilder((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.rank);
        
    }
    
    // constructor just for allocation
    public PolyMatBuilder(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    
    // properties
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    public long rank;
    

    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    // creation method for java code (1-phase java constructor)
    public PolyMatBuilder(final long rank) {
        this((java.lang.System[]) null);
        x10$regionarray$PolyMatBuilder$$init$S(rank);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.PolyMatBuilder x10$regionarray$PolyMatBuilder$$init$S(final long rank) {
         {
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final long t$130110 = ((rank) + (((long)(1L))));
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final int t$130111 = ((int)(long)(((long)(t$130110))));
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            /*super.*/x10$regionarray$MatBuilder$$init$S(t$130111);
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            this.rank = rank;
            
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final x10.regionarray.PolyMatBuilder this$130112 = this;
        }
        return this;
    }
    
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    public x10.regionarray.PolyMat toSortedPolyMat(final boolean isSimplified) {
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final x10.util.ArrayList t$130062 = ((x10.util.ArrayList)(mat));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final x10.core.fun.Fun_0_2 t$130063 = ((x10.core.fun.Fun_0_2)(new x10.regionarray.PolyMatBuilder.$Closure$226()));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        ((x10.util.ArrayList<x10.regionarray.Row>)t$130062).sort__0$1x10$util$ArrayList$$T$3x10$util$ArrayList$$T$3x10$lang$Int$2(((x10.core.fun.Fun_0_2)(t$130063)));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final x10.regionarray.PolyMat result = ((x10.regionarray.PolyMat)(new x10.regionarray.PolyMat((java.lang.System[]) null)));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final x10.util.ArrayList t$130113 = ((x10.util.ArrayList)(mat));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final long t$130114 = ((x10.util.ArrayList<x10.regionarray.Row>)t$130113).size$O();
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final int t$130115 = ((int)(long)(((long)(t$130114))));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final long t$130116 = rank;
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final long t$130117 = ((t$130116) + (((long)(1L))));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final int t$130118 = ((int)(long)(((long)(t$130117))));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final x10.core.fun.Fun_0_2 t$130119 = ((x10.core.fun.Fun_0_2)(new x10.regionarray.PolyMatBuilder.$Closure$227(this, this.mat, (x10.regionarray.PolyMatBuilder.$Closure$227.__1$1x10$regionarray$Row$2) null)));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        result.x10$regionarray$PolyMat$$init$S(t$130115, t$130118, ((x10.core.fun.Fun_0_2)(t$130119)), ((boolean)(isSimplified)), (x10.regionarray.PolyMat.__2$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2) null);
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final x10.regionarray.PolyMat t$130075 = ((x10.regionarray.PolyMat)(((x10.regionarray.PolyMat)
                                                                              result)));
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        return t$130075;
    }
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    /**
     * a simple mechanism of somewhat dubious utility to allow
     * semi-symbolic specification of halfspaces. For example
     * X0-Y1 >= n is specified as add(X(0)-Y(1), GE, n)
     *
     * XXX coefficients must be -1,0,+1; can allow larger coefficients
     * by increasing # bits per coeff
     */
    final private static int ZERO = 178956970;
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    final public static int GE = 0;
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    final public static int LE = 1;
    
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    final public static int X$O(final int axis) {
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final int t$130076 = ((2) * (((int)(axis))));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final long t$130077 = ((long)(((int)(t$130076))));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final int t$130078 = ((1) << (int)(((long)(t$130077))));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        return t$130078;
    }
    
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    public void add(int coeff, final int op, final int k) {
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final int t$130079 = coeff;
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final int t$130080 = ((t$130079) + (((int)(178956970))));
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        coeff = t$130080;
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final x10.regionarray.Array as_ = ((x10.regionarray.Array)(new x10.regionarray.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT)));
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final long t$130081 = rank;
        
        //#line 268 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long size$130043 = ((t$130081) + (((long)(1L))));
        
        //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.RectRegion1D myReg$130146 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
        
        //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$130126 = ((size$130043) - (((long)(1L))));
        
        //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        myReg$130146.x10$regionarray$RectRegion1D$$init$S(t$130126);
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region t$130127 = ((x10.regionarray.Region)
                                                  myReg$130146);
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.core.Int>)as_).region = ((x10.regionarray.Region)(t$130127));
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.core.Int>)as_).rank = 1L;
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.core.Int>)as_).rect = true;
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.core.Int>)as_).zeroBased = true;
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.core.Int>)as_).rail = true;
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.core.Int>)as_).size = size$130043;
        {
            
        }
        
        //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$130147 = ((x10.regionarray.Array<x10.core.Int>)as_).layout_min1 = 0L;
        
        //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$130148 = ((x10.regionarray.Array<x10.core.Int>)as_).layout_stride1 = t$130147;
        
        //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.core.Int>)as_).layout_min0 = t$130148;
        
        //#line 274 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.core.Int>)as_).layout = null;
        
        //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$130149 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, ((long)(size$130043)))));
        
        //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.core.Int>)as_).raw = ((x10.core.Rail)(t$130149));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        int i$130150 = 0;
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        for (;
             true;
             ) {
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final int t$130151 = i$130150;
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final long t$130152 = ((long)(((int)(t$130151))));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final long t$130153 = rank;
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final boolean t$130154 = ((t$130152) < (((long)(t$130153))));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            if (!(t$130154)) {
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
                break;
            }
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final int t$130129 = coeff;
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final int t$130130 = ((t$130129) & (((int)(3))));
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final int a$130131 = ((t$130130) - (((int)(2))));
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final int t$130132 = i$130150;
            
            //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long i$130133 = ((long)(((int)(t$130132))));
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final boolean t$130134 = ((int) op) == ((int) 1);
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            int t$130135 =  0;
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            if (t$130134) {
                
                //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
                t$130135 = a$130131;
            } else {
                
                //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
                t$130135 = (-(a$130131));
            }
            
            //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int v$130136 = t$130135;
            
            //#line 543 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            int ret$130137 =  0;
            
            //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$130128 = ((x10.core.Rail)(((x10.regionarray.Array<x10.core.Int>)as_).raw));
            
            //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((int[])t$130128.value)[(int)i$130133] = v$130136;
            
            //#line 554 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$130137 = v$130136;
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final int t$130138 = coeff;
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final long t$130139 = ((long)(((int)(2))));
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final int t$130140 = ((t$130138) >> (int)(((long)(t$130139))));
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            coeff = t$130140;
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final int t$130141 = i$130150;
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final int t$130142 = ((t$130141) + (((int)(1))));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            i$130150 = t$130142;
        }
        
        //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$130052 = rank;
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final boolean t$130103 = ((int) op) == ((int) 1);
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        int t$130104 =  0;
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        if (t$130103) {
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            t$130104 = (-(k));
        } else {
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            t$130104 = k;
        }
        
        //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final int v$130053 = t$130104;
        
        //#line 543 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        int ret$130054 =  0;
        
        //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$130143 = ((x10.core.Rail)(((x10.regionarray.Array<x10.core.Int>)as_).raw));
        
        //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((int[])t$130143.value)[(int)i$130052] = v$130053;
        
        //#line 554 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$130054 = v$130053;
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        final x10.core.fun.Fun_0_1 t$130109 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.PolyMatBuilder.$Closure$228(as_, (x10.regionarray.PolyMatBuilder.$Closure$228.__0$1x10$lang$Int$2) null)));
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        this.add__0$1x10$lang$Int$3x10$lang$Int$2(((x10.core.fun.Fun_0_1)(t$130109)));
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    final public x10.regionarray.PolyMatBuilder x10$regionarray$PolyMatBuilder$$this$x10$regionarray$PolyMatBuilder() {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        return x10.regionarray.PolyMatBuilder.this;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    final public void __fieldInitializers_x10_regionarray_PolyMatBuilder() {
        
    }
    
    public static int get$ZERO() {
        return x10.regionarray.PolyMatBuilder.ZERO;
    }
    
    public static int get$GE() {
        return x10.regionarray.PolyMatBuilder.GE;
    }
    
    public static int get$LE() {
        return x10.regionarray.PolyMatBuilder.LE;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$226 extends x10.core.Ref implements x10.core.fun.Fun_0_2, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$226> $RTT = 
            x10.rtt.StaticFunType.<$Closure$226> make($Closure$226.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_2.$RTT, x10.regionarray.Row.$RTT, x10.regionarray.Row.$RTT, x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyMatBuilder.$Closure$226 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.PolyMatBuilder.$Closure$226 $_obj = new x10.regionarray.PolyMatBuilder.$Closure$226((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$226(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return x10.core.Int.$box($apply$O((x10.regionarray.Row)a1, (x10.regionarray.Row)a2));
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public int $apply$I(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return $apply$O((x10.regionarray.Row)a1, (x10.regionarray.Row)a2);
            
        }
        
        
    
        
        public int $apply$O(final x10.regionarray.Row x, final x10.regionarray.Row y) {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final int t$130061 = x10.regionarray.PolyRow.compare$O(((x10.regionarray.Row)(x)), ((x10.regionarray.Row)(y)));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            return t$130061;
        }
        
        public $Closure$226() {
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$227 extends x10.core.Ref implements x10.core.fun.Fun_0_2, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$227> $RTT = 
            x10.rtt.StaticFunType.<$Closure$227> make($Closure$227.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_2.$RTT, x10.rtt.Types.INT, x10.rtt.Types.INT, x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyMatBuilder.$Closure$227 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.mat = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.PolyMatBuilder.$Closure$227 $_obj = new x10.regionarray.PolyMatBuilder.$Closure$227((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.mat);
            
        }
        
        // constructor just for allocation
        public $Closure$227(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1), x10.core.Int.$unbox(a2)));
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public int $apply$I(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return $apply$O(x10.core.Int.$unbox(a1), x10.core.Int.$unbox(a2));
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$regionarray$Row$2 {}
        
    
        
        public int $apply$O(final int i$130120, final int j$130121) {
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final x10.util.ArrayList t$130122 = ((x10.util.ArrayList)(this.mat));
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final long t$130123 = ((long)(((int)(i$130120))));
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final x10.regionarray.Row t$130124 = ((x10.util.ArrayList<x10.regionarray.Row>)t$130122).$apply$G((long)(t$130123));
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            final int t$130125 = t$130124.$apply$O((int)(j$130121));
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            return t$130125;
        }
        
        public x10.regionarray.PolyMatBuilder out$$;
        public x10.util.ArrayList<x10.regionarray.Row> mat;
        
        public $Closure$227(final x10.regionarray.PolyMatBuilder out$$, final x10.util.ArrayList<x10.regionarray.Row> mat, __1$1x10$regionarray$Row$2 $dummy) {
             {
                this.out$$ = out$$;
                this.mat = ((x10.util.ArrayList)(mat));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$228 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$228> $RTT = 
            x10.rtt.StaticFunType.<$Closure$228> make($Closure$228.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyMatBuilder.$Closure$228 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.as_ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.PolyMatBuilder.$Closure$228 $_obj = new x10.regionarray.PolyMatBuilder.$Closure$228((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.as_);
            
        }
        
        // constructor just for allocation
        public $Closure$228(final java.lang.System[] $dummy) {
            
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
        public static final class __0$1x10$lang$Int$2 {}
        
    
        
        public int $apply$O(final int i) {
            
            //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long i$130056 = ((long)(((int)(i))));
            
            //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            int ret$130057 =  0;
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$130144 = ((x10.core.Rail)(((x10.regionarray.Array<x10.core.Int>)this.as_).raw));
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$130145 = ((int[])t$130144.value)[(int)i$130056];
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$130057 = t$130145;
            
            //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$130108 = ret$130057;
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            return t$130108;
        }
        
        public x10.regionarray.Array<x10.core.Int> as_;
        
        public $Closure$228(final x10.regionarray.Array<x10.core.Int> as_, __0$1x10$lang$Int$2 $dummy) {
             {
                this.as_ = ((x10.regionarray.Array)(as_));
            }
        }
        
    }
    
}


