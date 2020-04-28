package x10.lang;


@x10.runtime.impl.java.X10Generated
final public class Math extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Math> $RTT = 
        x10.rtt.NamedType.<Math> make("x10.lang.Math",
                                      Math.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Math $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.Math $_obj = new x10.lang.Math((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Math(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    final public static double E = 2.718281828459045;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    final public static double PI = 3.141592653589793;
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static int abs$O(final int a) {
        try {
            return java.lang.Math.abs(a);
        }
        catch (java.lang.Throwable exc$146356) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146356);
        }
        
    }
    
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static long abs$O(final long a) {
        try {
            return java.lang.Math.abs(a);
        }
        catch (java.lang.Throwable exc$146357) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146357);
        }
        
    }
    
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static float abs$O(final float a) {
        try {
            return java.lang.Math.abs(a);
        }
        catch (java.lang.Throwable exc$146358) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146358);
        }
        
    }
    
    
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double abs$O(final double a) {
        try {
            return java.lang.Math.abs(a);
        }
        catch (java.lang.Throwable exc$146359) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146359);
        }
        
    }
    
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double ceil$O(final double a) {
        try {
            return java.lang.Math.ceil(a);
        }
        catch (java.lang.Throwable exc$146360) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146360);
        }
        
    }
    
    
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double floor$O(final double a) {
        try {
            return java.lang.Math.floor(a);
        }
        catch (java.lang.Throwable exc$146361) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146361);
        }
        
    }
    
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double round$O(final double a) {
        try {
            return java.lang.Math.round(a);
        }
        catch (java.lang.Throwable exc$146362) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146362);
        }
        
    }
    
    
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static int getExponent$O(final float a) {
        try {
            return java.lang.Math.getExponent(a);
        }
        catch (java.lang.Throwable exc$146363) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146363);
        }
        
    }
    
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static int getExponent$O(final double a) {
        try {
            return java.lang.Math.getExponent(a);
        }
        catch (java.lang.Throwable exc$146364) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146364);
        }
        
    }
    
    
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static float powf$O(final float a, final float b) {
        try {
            return (float)java.lang.Math.pow(a, b);
        }
        catch (java.lang.Throwable exc$146365) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146365);
        }
        
    }
    
    
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double pow$O(final double a, final double b) {
        try {
            return java.lang.Math.pow(a, b);
        }
        catch (java.lang.Throwable exc$146366) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146366);
        }
        
    }
    
    
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static x10.lang.Complex pow(final x10.lang.Complex a, final x10.lang.Complex b) {
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final x10.lang.Complex t$110367 = x10.lang.Math.log(((x10.lang.Complex)(a)));
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final x10.lang.Complex t$110368 = t$110367.$times(((x10.lang.Complex)(b)));
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final x10.lang.Complex t$110369 = x10.lang.Math.exp(((x10.lang.Complex)(t$110368)));
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return t$110369;
    }
    
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double exp$O(final double a) {
        try {
            return java.lang.Math.exp(a);
        }
        catch (java.lang.Throwable exc$146367) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146367);
        }
        
    }
    
    
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static float expf$O(final float a) {
        try {
            return (float)java.lang.Math.exp(a);
        }
        catch (java.lang.Throwable exc$146368) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146368);
        }
        
    }
    
    
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static x10.lang.Complex exp(final x10.lang.Complex a) {
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110371 = a.isNaN$O();
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110371) {
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110370 = ((x10.lang.Complex)(x10.lang.Complex.get$NaN()));
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return t$110370;
        }
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110372 = a.re;
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double expRe = java.lang.Math.exp(((double)(t$110372)));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110373 = a.im;
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110374 = java.lang.Math.cos(((double)(t$110373)));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110377 = ((expRe) * (((double)(t$110374))));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110375 = a.im;
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110376 = java.lang.Math.sin(((double)(t$110375)));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110378 = ((expRe) * (((double)(t$110376))));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final x10.lang.Complex t$110379 = new x10.lang.Complex(t$110377, t$110378);
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return t$110379;
    }
    
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double expm1$O(final double a) {
        try {
            return java.lang.Math.expm1(a);
        }
        catch (java.lang.Throwable exc$146369) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146369);
        }
        
    }
    
    
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double cos$O(final double a) {
        try {
            return java.lang.Math.cos(a);
        }
        catch (java.lang.Throwable exc$146370) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146370);
        }
        
    }
    
    
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static x10.lang.Complex cos(final x10.lang.Complex z) {
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110380 = z.im;
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110396 = ((double) t$110380) == ((double) 0.0);
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110396) {
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110381 = z.re;
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110382 = java.lang.Math.cos(((double)(t$110381)));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110383 = new x10.lang.Complex(t$110382, ((double)(0.0)));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return t$110383;
        } else {
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110384 = z.re;
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110386 = java.lang.Math.cos(((double)(t$110384)));
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110385 = z.im;
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110387 = java.lang.Math.cosh(((double)(t$110385)));
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110393 = ((t$110386) * (((double)(t$110387))));
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110388 = z.re;
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110391 = java.lang.Math.sin(((double)(t$110388)));
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110389 = z.im;
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110390 = (-(t$110389));
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110392 = java.lang.Math.sinh(((double)(t$110390)));
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110394 = ((t$110391) * (((double)(t$110392))));
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110395 = new x10.lang.Complex(t$110393, t$110394);
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return t$110395;
        }
    }
    
    
    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double sin$O(final double a) {
        try {
            return java.lang.Math.sin(a);
        }
        catch (java.lang.Throwable exc$146371) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146371);
        }
        
    }
    
    
    
    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static x10.lang.Complex sin(final x10.lang.Complex z) {
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110397 = z.im;
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110412 = ((double) t$110397) == ((double) 0.0);
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110412) {
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110398 = z.re;
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110399 = java.lang.Math.sin(((double)(t$110398)));
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110400 = new x10.lang.Complex(t$110399, ((double)(0.0)));
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return t$110400;
        } else {
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110401 = z.re;
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110403 = java.lang.Math.sin(((double)(t$110401)));
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110402 = z.im;
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110404 = java.lang.Math.cosh(((double)(t$110402)));
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110409 = ((t$110403) * (((double)(t$110404))));
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110405 = z.re;
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110407 = java.lang.Math.cos(((double)(t$110405)));
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110406 = z.im;
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110408 = java.lang.Math.sinh(((double)(t$110406)));
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110410 = ((t$110407) * (((double)(t$110408))));
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110411 = new x10.lang.Complex(t$110409, t$110410);
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return t$110411;
        }
    }
    
    
    //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double tan$O(final double a) {
        try {
            return java.lang.Math.tan(a);
        }
        catch (java.lang.Throwable exc$146372) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146372);
        }
        
    }
    
    
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static x10.lang.Complex tan(final x10.lang.Complex z) {
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110413 = z.im;
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110425 = ((double) t$110413) == ((double) 0.0);
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110425) {
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110414 = z.re;
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110415 = java.lang.Math.tan(((double)(t$110414)));
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110416 = new x10.lang.Complex(t$110415, ((double)(0.0)));
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return t$110416;
        } else {
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110417 = ((x10.lang.Complex)(x10.lang.Complex.get$I()));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110418 = x10.lang.Complex.$times((double)(2.0), ((x10.lang.Complex)(t$110417)));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110419 = t$110418.$times(((x10.lang.Complex)(z)));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex e2IZ = x10.lang.Math.exp(((x10.lang.Complex)(t$110419)));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110422 = e2IZ.$minus((double)(1.0));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110420 = ((x10.lang.Complex)(x10.lang.Complex.get$I()));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110421 = e2IZ.$plus((double)(1.0));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110423 = t$110420.$times(((x10.lang.Complex)(t$110421)));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110424 = t$110422.$over(((x10.lang.Complex)(t$110423)));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return t$110424;
        }
    }
    
    
    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double acos$O(final double a) {
        try {
            return java.lang.Math.acos(a);
        }
        catch (java.lang.Throwable exc$146373) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146373);
        }
        
    }
    
    
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static x10.lang.Complex acos(final x10.lang.Complex z) {
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110426 = z.im;
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        boolean t$110429 = ((double) t$110426) == ((double) 0.0);
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110429) {
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110427 = z.re;
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110428 = java.lang.Math.abs(((double)(t$110427)));
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            t$110429 = ((t$110428) <= (((double)(1.0))));
        }
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110444 = t$110429;
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110444) {
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110430 = z.re;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110431 = java.lang.Math.acos(((double)(t$110430)));
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110432 = new x10.lang.Complex(t$110431, ((double)(0.0)));
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return t$110432;
        } else {
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110441 = ((3.141592653589793) / (((double)(2.0))));
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110439 = ((x10.lang.Complex)(x10.lang.Complex.get$I()));
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110433 = ((x10.lang.Complex)(x10.lang.Complex.get$I()));
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110436 = t$110433.$times(((x10.lang.Complex)(z)));
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110434 = z.$times(((x10.lang.Complex)(z)));
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110435 = x10.lang.Complex.$minus((double)(1.0), ((x10.lang.Complex)(t$110434)));
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110437 = x10.lang.Math.sqrt(((x10.lang.Complex)(t$110435)));
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110438 = t$110436.$plus(((x10.lang.Complex)(t$110437)));
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110440 = x10.lang.Math.log(((x10.lang.Complex)(t$110438)));
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110442 = t$110439.$times(((x10.lang.Complex)(t$110440)));
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110443 = x10.lang.Complex.$plus((double)(t$110441), ((x10.lang.Complex)(t$110442)));
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return t$110443;
        }
    }
    
    
    //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double asin$O(final double a) {
        try {
            return java.lang.Math.asin(a);
        }
        catch (java.lang.Throwable exc$146374) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146374);
        }
        
    }
    
    
    
    //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static x10.lang.Complex asin(final x10.lang.Complex z) {
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110445 = z.im;
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        boolean t$110448 = ((double) t$110445) == ((double) 0.0);
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110448) {
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110446 = z.re;
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110447 = java.lang.Math.abs(((double)(t$110446)));
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            t$110448 = ((t$110447) <= (((double)(1.0))));
        }
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110462 = t$110448;
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110462) {
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110449 = z.re;
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110450 = java.lang.Math.asin(((double)(t$110449)));
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110451 = new x10.lang.Complex(t$110450, ((double)(0.0)));
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return t$110451;
        } else {
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110452 = ((x10.lang.Complex)(x10.lang.Complex.get$I()));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110459 = t$110452.$minus();
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110453 = ((x10.lang.Complex)(x10.lang.Complex.get$I()));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110456 = t$110453.$times(((x10.lang.Complex)(z)));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110454 = z.$times(((x10.lang.Complex)(z)));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110455 = x10.lang.Complex.$minus((double)(1.0), ((x10.lang.Complex)(t$110454)));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110457 = x10.lang.Math.sqrt(((x10.lang.Complex)(t$110455)));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110458 = t$110456.$plus(((x10.lang.Complex)(t$110457)));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110460 = x10.lang.Math.log(((x10.lang.Complex)(t$110458)));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110461 = t$110459.$times(((x10.lang.Complex)(t$110460)));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return t$110461;
        }
    }
    
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double atan$O(final double a) {
        try {
            return java.lang.Math.atan(a);
        }
        catch (java.lang.Throwable exc$146375) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146375);
        }
        
    }
    
    
    
    //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static x10.lang.Complex atan(final x10.lang.Complex z) {
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110463 = z.im;
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110488 = ((double) t$110463) == ((double) 0.0);
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110488) {
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110464 = z.re;
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110465 = java.lang.Math.atan(((double)(t$110464)));
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110466 = new x10.lang.Complex(t$110465, ((double)(0.0)));
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return t$110466;
        } else {
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110467 = ((x10.lang.Complex)(x10.lang.Complex.get$I()));
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final boolean t$110487 = x10.rtt.Equality.equalsequals((z),(t$110467));
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            if (t$110487) {
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110468 = java.lang.Double.POSITIVE_INFINITY;
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final x10.lang.Complex t$110469 = new x10.lang.Complex(((double)(0.0)), ((double)(t$110468)));
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                return t$110469;
            } else {
                
                //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final x10.lang.Complex t$110470 = ((x10.lang.Complex)(x10.lang.Complex.get$I()));
                
                //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final x10.lang.Complex t$110471 = t$110470.$minus();
                
                //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final boolean t$110486 = x10.rtt.Equality.equalsequals((z),(t$110471));
                
                //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                if (t$110486) {
                    
                    //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final double t$110472 = java.lang.Double.NEGATIVE_INFINITY;
                    
                    //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final x10.lang.Complex t$110473 = new x10.lang.Complex(((double)(0.0)), ((double)(t$110472)));
                    
                    //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    return t$110473;
                } else {
                    
                    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final x10.lang.Complex t$110474 = ((x10.lang.Complex)(x10.lang.Complex.get$I()));
                    
                    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final x10.lang.Complex t$110483 = t$110474.$over((double)(2.0));
                    
                    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final x10.lang.Complex t$110475 = ((x10.lang.Complex)(x10.lang.Complex.get$I()));
                    
                    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final x10.lang.Complex t$110476 = t$110475.$times(((x10.lang.Complex)(z)));
                    
                    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final x10.lang.Complex t$110477 = x10.lang.Complex.$minus((double)(1.0), ((x10.lang.Complex)(t$110476)));
                    
                    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final x10.lang.Complex t$110481 = x10.lang.Math.log(((x10.lang.Complex)(t$110477)));
                    
                    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final x10.lang.Complex t$110478 = ((x10.lang.Complex)(x10.lang.Complex.get$I()));
                    
                    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final x10.lang.Complex t$110479 = t$110478.$times(((x10.lang.Complex)(z)));
                    
                    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final x10.lang.Complex t$110480 = x10.lang.Complex.$plus((double)(1.0), ((x10.lang.Complex)(t$110479)));
                    
                    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final x10.lang.Complex t$110482 = x10.lang.Math.log(((x10.lang.Complex)(t$110480)));
                    
                    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final x10.lang.Complex t$110484 = t$110481.$minus(((x10.lang.Complex)(t$110482)));
                    
                    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final x10.lang.Complex t$110485 = t$110483.$times(((x10.lang.Complex)(t$110484)));
                    
                    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    return t$110485;
                }
            }
        }
    }
    
    
    //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double atan2$O(final double a, final double b) {
        try {
            return java.lang.Math.atan2(a,b);
        }
        catch (java.lang.Throwable exc$146376) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146376);
        }
        
    }
    
    
    
    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double cosh$O(final double a) {
        try {
            return java.lang.Math.cosh(a);
        }
        catch (java.lang.Throwable exc$146377) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146377);
        }
        
    }
    
    
    
    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static x10.lang.Complex cosh(final x10.lang.Complex z) {
        
        //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110506 = z.isNaN$O();
        
        //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110506) {
            
            //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110489 = ((x10.lang.Complex)(x10.lang.Complex.get$NaN()));
            
            //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return t$110489;
        } else {
            
            //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110490 = z.im;
            
            //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final boolean t$110505 = ((double) t$110490) == ((double) 0.0);
            
            //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            if (t$110505) {
                
                //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110491 = z.re;
                
                //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110492 = java.lang.Math.cosh(((double)(t$110491)));
                
                //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final x10.lang.Complex t$110493 = new x10.lang.Complex(t$110492, ((double)(0.0)));
                
                //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                return t$110493;
            } else {
                
                //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110494 = z.re;
                
                //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110496 = java.lang.Math.cosh(((double)(t$110494)));
                
                //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110495 = z.im;
                
                //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110497 = java.lang.Math.cos(((double)(t$110495)));
                
                //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110502 = ((t$110496) * (((double)(t$110497))));
                
                //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110498 = z.re;
                
                //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110500 = java.lang.Math.sinh(((double)(t$110498)));
                
                //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110499 = z.im;
                
                //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110501 = java.lang.Math.sin(((double)(t$110499)));
                
                //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110503 = ((t$110500) * (((double)(t$110501))));
                
                //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final x10.lang.Complex t$110504 = new x10.lang.Complex(t$110502, t$110503);
                
                //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                return t$110504;
            }
        }
    }
    
    
    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double sinh$O(final double a) {
        try {
            return java.lang.Math.sinh(a);
        }
        catch (java.lang.Throwable exc$146378) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146378);
        }
        
    }
    
    
    
    //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static x10.lang.Complex sinh(final x10.lang.Complex z) {
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110524 = z.isNaN$O();
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110524) {
            
            //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110507 = ((x10.lang.Complex)(x10.lang.Complex.get$NaN()));
            
            //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return t$110507;
        } else {
            
            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final double t$110508 = z.im;
            
            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final boolean t$110523 = ((double) t$110508) == ((double) 0.0);
            
            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            if (t$110523) {
                
                //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110509 = z.re;
                
                //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110510 = java.lang.Math.sinh(((double)(t$110509)));
                
                //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final x10.lang.Complex t$110511 = new x10.lang.Complex(t$110510, ((double)(0.0)));
                
                //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                return t$110511;
            } else {
                
                //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110512 = z.re;
                
                //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110514 = java.lang.Math.sinh(((double)(t$110512)));
                
                //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110513 = z.im;
                
                //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110515 = java.lang.Math.cos(((double)(t$110513)));
                
                //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110520 = ((t$110514) * (((double)(t$110515))));
                
                //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110516 = z.re;
                
                //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110518 = java.lang.Math.cosh(((double)(t$110516)));
                
                //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110517 = z.im;
                
                //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110519 = java.lang.Math.sin(((double)(t$110517)));
                
                //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110521 = ((t$110518) * (((double)(t$110519))));
                
                //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final x10.lang.Complex t$110522 = new x10.lang.Complex(t$110520, t$110521);
                
                //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                return t$110522;
            }
        }
    }
    
    
    //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double tanh$O(final double a) {
        try {
            return java.lang.Math.tanh(a);
        }
        catch (java.lang.Throwable exc$146379) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146379);
        }
        
    }
    
    
    
    //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static x10.lang.Complex tanh(final x10.lang.Complex z) {
        
        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110526 = z.isNaN$O();
        
        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110526) {
            
            //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110525 = ((x10.lang.Complex)(x10.lang.Complex.get$NaN()));
            
            //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return t$110525;
        }
        
        //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110527 = z.re;
        
        //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110528 = ((2.0) * (((double)(t$110527))));
        
        //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110531 = java.lang.Math.cosh(((double)(t$110528)));
        
        //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110529 = z.im;
        
        //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110530 = ((2.0) * (((double)(t$110529))));
        
        //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110532 = java.lang.Math.cos(((double)(t$110530)));
        
        //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double d = ((t$110531) + (((double)(t$110532))));
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110533 = z.re;
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110534 = ((2.0) * (((double)(t$110533))));
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110535 = java.lang.Math.sinh(((double)(t$110534)));
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110539 = ((t$110535) / (((double)(d))));
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110536 = z.im;
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110537 = ((2.0) * (((double)(t$110536))));
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110538 = java.lang.Math.sin(((double)(t$110537)));
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110540 = ((t$110538) / (((double)(d))));
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final x10.lang.Complex t$110541 = new x10.lang.Complex(t$110539, t$110540);
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return t$110541;
    }
    
    
    //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double sqrt$O(final double a) {
        try {
            return java.lang.Math.sqrt(a);
        }
        catch (java.lang.Throwable exc$146380) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146380);
        }
        
    }
    
    
    
    //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static x10.lang.Complex sqrt(final x10.lang.Complex z) {
        
        //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110564 = z.isNaN$O();
        
        //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110564) {
            
            //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110542 = ((x10.lang.Complex)(x10.lang.Complex.get$NaN()));
            
            //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return t$110542;
        } else {
            
            //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110543 = ((x10.lang.Complex)(x10.lang.Complex.get$ZERO()));
            
            //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final boolean t$110563 = x10.rtt.Equality.equalsequals((z),(t$110543));
            
            //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            if (t$110563) {
                
                //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final x10.lang.Complex t$110544 = ((x10.lang.Complex)(x10.lang.Complex.get$ZERO()));
                
                //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                return t$110544;
            } else {
                
                //#line 303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110545 = z.re;
                
                //#line 303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110546 = java.lang.Math.abs(((double)(t$110545)));
                
                //#line 303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110547 = z.abs$O();
                
                //#line 303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110548 = ((t$110546) + (((double)(t$110547))));
                
                //#line 303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110549 = ((t$110548) / (((double)(2.0))));
                
                //#line 303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t = java.lang.Math.sqrt(((double)(t$110549)));
                
                //#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final double t$110550 = z.re;
                
                //#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                final boolean t$110562 = ((t$110550) >= (((double)(0.0))));
                
                //#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                if (t$110562) {
                    
                    //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final double t$110551 = z.im;
                    
                    //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final double t$110552 = ((2.0) * (((double)(t))));
                    
                    //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final double t$110553 = ((t$110551) / (((double)(t$110552))));
                    
                    //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final x10.lang.Complex t$110554 = new x10.lang.Complex(((double)(t)), t$110553);
                    
                    //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    return t$110554;
                } else {
                    
                    //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final double t$110555 = z.im;
                    
                    //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final double t$110556 = java.lang.Math.abs(((double)(t$110555)));
                    
                    //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final double t$110557 = ((2.0) * (((double)(t))));
                    
                    //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final double t$110559 = ((t$110556) / (((double)(t$110557))));
                    
                    //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final double t$110558 = z.im;
                    
                    //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final double t$110560 = java.lang.Math.copySign(((double)(t)),((double)(t$110558)));
                    
                    //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    final x10.lang.Complex t$110561 = new x10.lang.Complex(t$110559, t$110560);
                    
                    //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                    return t$110561;
                }
            }
        }
    }
    
    
    //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static float sqrtf$O(final float a) {
        try {
            return (float)java.lang.Math.sqrt(a);
        }
        catch (java.lang.Throwable exc$146381) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146381);
        }
        
    }
    
    
    
    //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double cbrt$O(final double a) {
        try {
            return java.lang.Math.cbrt(a);
        }
        catch (java.lang.Throwable exc$146382) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146382);
        }
        
    }
    
    
    
    //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double erf$O(final double a) {
        try {
            return org.apache.commons.math3.special.Erf.erf(a);
        }
        catch (java.lang.Throwable exc$146383) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146383);
        }
        
    }
    
    
    
    //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double erfc$O(final double a) {
        try {
            return org.apache.commons.math3.special.Erf.erfc(a);
        }
        catch (java.lang.Throwable exc$146384) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146384);
        }
        
    }
    
    
    
    //#line 330 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double hypot$O(final double a, final double b) {
        try {
            return java.lang.Math.hypot(a,b);
        }
        catch (java.lang.Throwable exc$146385) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146385);
        }
        
    }
    
    
    
    //#line 334 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double log$O(final double a) {
        try {
            return java.lang.Math.log(a);
        }
        catch (java.lang.Throwable exc$146386) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146386);
        }
        
    }
    
    
    
    //#line 340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static float logf$O(final float a) {
        try {
            return (float)java.lang.Math.log(a);
        }
        catch (java.lang.Throwable exc$146387) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146387);
        }
        
    }
    
    
    
    //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static x10.lang.Complex log(final x10.lang.Complex a) {
        
        //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110566 = a.isNaN$O();
        
        //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110566) {
            
            //#line 354 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Complex t$110565 = ((x10.lang.Complex)(x10.lang.Complex.get$NaN()));
            
            //#line 354 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return t$110565;
        }
        
        //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110567 = a.abs$O();
        
        //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110570 = java.lang.Math.log(((double)(t$110567)));
        
        //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110568 = a.im;
        
        //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110569 = a.re;
        
        //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final double t$110571 = java.lang.Math.atan2(((double)(t$110568)),((double)(t$110569)));
        
        //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final x10.lang.Complex t$110572 = new x10.lang.Complex(t$110570, t$110571);
        
        //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return t$110572;
    }
    
    
    //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double log10$O(final double a) {
        try {
            return java.lang.Math.log10(a);
        }
        catch (java.lang.Throwable exc$146388) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146388);
        }
        
    }
    
    
    
    //#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double log1p$O(final double a) {
        try {
            return java.lang.Math.log1p(a);
        }
        catch (java.lang.Throwable exc$146389) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146389);
        }
        
    }
    
    
    
    //#line 367 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static int max$O(final int a, final int b) {
        try {
            return java.lang.Math.max(a,b);
        }
        catch (java.lang.Throwable exc$146390) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146390);
        }
        
    }
    
    
    
    //#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static int min$O(final int a, final int b) {
        try {
            return java.lang.Math.min(a,b);
        }
        catch (java.lang.Throwable exc$146391) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146391);
        }
        
    }
    
    
    
    //#line 371 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static int max__0$u__1$u$O(final int a, final int b) {
        
        //#line 371 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110579 = x10.runtime.impl.java.UIntUtils.lt(a, ((int)(b)));
        
        //#line 371 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        int t$110580 =  0;
        
        //#line 371 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110579) {
            
            //#line 371 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            t$110580 = b;
        } else {
            
            //#line 371 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            t$110580 = a;
        }
        
        //#line 371 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final int t$110581 = t$110580;
        
        //#line 371 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return t$110581;
    }
    
    
    //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static int min__0$u__1$u$O(final int a, final int b) {
        
        //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110582 = x10.runtime.impl.java.UIntUtils.lt(a, ((int)(b)));
        
        //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        int t$110583 =  0;
        
        //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110582) {
            
            //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            t$110583 = a;
        } else {
            
            //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            t$110583 = b;
        }
        
        //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final int t$110584 = t$110583;
        
        //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return t$110584;
    }
    
    
    //#line 373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static long max$O(final long a, final long b) {
        try {
            return java.lang.Math.max(a,b);
        }
        catch (java.lang.Throwable exc$146392) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146392);
        }
        
    }
    
    
    
    //#line 375 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static long min$O(final long a, final long b) {
        try {
            return java.lang.Math.min(a,b);
        }
        catch (java.lang.Throwable exc$146393) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146393);
        }
        
    }
    
    
    
    //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static long max__0$u__1$u$O(final long a, final long b) {
        
        //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110591 = x10.runtime.impl.java.ULongUtils.lt(a, ((long)(b)));
        
        //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        long t$110592 =  0;
        
        //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110591) {
            
            //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            t$110592 = b;
        } else {
            
            //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            t$110592 = a;
        }
        
        //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final long t$110593 = t$110592;
        
        //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return t$110593;
    }
    
    
    //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static long min__0$u__1$u$O(final long a, final long b) {
        
        //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110594 = x10.runtime.impl.java.ULongUtils.lt(a, ((long)(b)));
        
        //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        long t$110595 =  0;
        
        //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110594) {
            
            //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            t$110595 = a;
        } else {
            
            //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            t$110595 = b;
        }
        
        //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final long t$110596 = t$110595;
        
        //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return t$110596;
    }
    
    
    //#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static float max$O(final float a, final float b) {
        try {
            return java.lang.Math.max(a,b);
        }
        catch (java.lang.Throwable exc$146394) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146394);
        }
        
    }
    
    
    
    //#line 381 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static float min$O(final float a, final float b) {
        try {
            return java.lang.Math.min(a,b);
        }
        catch (java.lang.Throwable exc$146395) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146395);
        }
        
    }
    
    
    
    //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double max$O(final double a, final double b) {
        try {
            return java.lang.Math.max(a,b);
        }
        catch (java.lang.Throwable exc$146396) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146396);
        }
        
    }
    
    
    
    //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double min$O(final double a, final double b) {
        try {
            return java.lang.Math.min(a,b);
        }
        catch (java.lang.Throwable exc$146397) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146397);
        }
        
    }
    
    
    
    //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static int signum$O(final int a) {
        
        //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110611 = ((int) a) == ((int) 0);
        
        //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        int t$110612 =  0;
        
        //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110611) {
            
            //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            t$110612 = 0;
        } else {
            
            //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final boolean t$110609 = ((a) > (((int)(0))));
            
            //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            int t$110610 =  0;
            
            //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            if (t$110609) {
                
                //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                t$110610 = 1;
            } else {
                
                //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                t$110610 = -1;
            }
            
            //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            t$110612 = t$110610;
        }
        
        //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final int t$110613 = t$110612;
        
        //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return t$110613;
    }
    
    
    //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static long signum$O(final long a) {
        
        //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110616 = ((long) a) == ((long) 0L);
        
        //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        long t$110617 =  0;
        
        //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110616) {
            
            //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            t$110617 = 0L;
        } else {
            
            //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final boolean t$110614 = ((a) > (((long)(0L))));
            
            //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            long t$110615 =  0;
            
            //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            if (t$110614) {
                
                //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                t$110615 = 1L;
            } else {
                
                //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                t$110615 = -1L;
            }
            
            //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            t$110617 = t$110615;
        }
        
        //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final long t$110618 = t$110617;
        
        //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return t$110618;
    }
    
    
    //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static float signum$O(final float a) {
        try {
            return java.lang.Math.signum(a);
        }
        catch (java.lang.Throwable exc$146398) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146398);
        }
        
    }
    
    
    
    //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double signum$O(final double a) {
        try {
            return java.lang.Math.signum(a);
        }
        catch (java.lang.Throwable exc$146399) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146399);
        }
        
    }
    
    
    
    //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static double copySign$O(final double a, final double b) {
        try {
            return java.lang.Math.copySign(a,b);
        }
        catch (java.lang.Throwable exc$146400) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146400);
        }
        
    }
    
    
    
    //#line 402 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static int nextPowerOf2$O(final int p) {
        
        //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110629 = ((int) p) == ((int) 0);
        
        //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110629) {
            
            //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return 0;
        }
        
        //#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        int pow2 = 1;
        
        //#line 405 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        while (true) {
            
            //#line 405 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final int t$110630 = pow2;
            
            //#line 405 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final boolean t$110634 = ((t$110630) < (((int)(p))));
            
            //#line 405 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            if (!(t$110634)) {
                
                //#line 405 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                break;
            }
            
            //#line 406 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final int t$110668 = pow2;
            
            //#line 406 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final long t$110669 = ((long)(((int)(1))));
            
            //#line 406 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final int t$110670 = ((t$110668) << (int)(((long)(t$110669))));
            
            //#line 406 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            pow2 = t$110670;
        }
        
        //#line 407 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final int t$110635 = pow2;
        
        //#line 407 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return t$110635;
    }
    
    
    //#line 410 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static long nextPowerOf2$O(final long p) {
        
        //#line 411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110636 = ((long) p) == ((long) 0L);
        
        //#line 411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        if (t$110636) {
            
            //#line 411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            return 0L;
        }
        
        //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        long pow2 = 1L;
        
        //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        while (true) {
            
            //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final long t$110637 = pow2;
            
            //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final boolean t$110641 = ((t$110637) < (((long)(p))));
            
            //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            if (!(t$110641)) {
                
                //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                break;
            }
            
            //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final long t$110671 = pow2;
            
            //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final long t$110672 = ((long)(((int)(1))));
            
            //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final long t$110673 = ((t$110671) << (int)(((long)(t$110672))));
            
            //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            pow2 = t$110673;
        }
        
        //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final long t$110642 = pow2;
        
        //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return t$110642;
    }
    
    
    //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static boolean powerOf2$O(final int p) {
        
        //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final int t$110643 = (-(p));
        
        //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final int t$110644 = ((p) & (((int)(t$110643))));
        
        //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110645 = ((int) t$110644) == ((int) p);
        
        //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return t$110645;
    }
    
    
    //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static boolean powerOf2$O(final long p) {
        
        //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final long t$110646 = (-(p));
        
        //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final long t$110647 = ((p) & (((long)(t$110646))));
        
        //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final boolean t$110648 = ((long) t$110647) == ((long) p);
        
        //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return t$110648;
    }
    
    
    //#line 421 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static int log2$O(int p) {
        
        //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        assert x10.lang.Math.powerOf2$O((int)(p));
        
        //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        int i = 0;
        
        //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        while (true) {
            
            //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final int t$110649 = p;
            
            //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final boolean t$110654 = ((t$110649) > (((int)(1))));
            
            //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            if (!(t$110654)) {
                
                //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                break;
            }
            
            //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final int t$110674 = p;
            
            //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final int t$110675 = ((t$110674) / (((int)(2))));
            
            //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            p = t$110675;
            
            //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final int t$110676 = i;
            
            //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final int t$110677 = ((t$110676) + (((int)(1))));
            
            //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            i = t$110677;
        }
        
        //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final int t$110655 = i;
        
        //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return t$110655;
    }
    
    
    //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static long log2$O(long p) {
        
        //#line 429 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        assert x10.lang.Math.powerOf2$O((long)(p));
        
        //#line 430 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        long i = 0L;
        
        //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        while (true) {
            
            //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final long t$110656 = p;
            
            //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final boolean t$110661 = ((t$110656) > (((long)(1L))));
            
            //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            if (!(t$110661)) {
                
                //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                break;
            }
            
            //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final long t$110678 = p;
            
            //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final long t$110679 = ((t$110678) / (((long)(2L))));
            
            //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            p = t$110679;
            
            //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final long t$110680 = i;
            
            //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final long t$110681 = ((t$110680) + (((long)(1L))));
            
            //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            i = t$110681;
        }
        
        //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final long t$110662 = i;
        
        //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return t$110662;
    }
    
    
    //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static int pow2$O(final int i) {
        
        //#line 437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final long t$110663 = ((long)(((int)(i))));
        
        //#line 437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final int t$110664 = ((1) << (int)(((long)(t$110663))));
        
        //#line 437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return t$110664;
    }
    
    
    //#line 441 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    public static long pow2$O(final long i) {
        
        //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final int t$110665 = ((int)(long)(((long)(i))));
        
        //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final long t$110666 = ((long)(((int)(t$110665))));
        
        //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        final long t$110667 = ((1L) << (int)(((long)(t$110666))));
        
        //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return t$110667;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    final public x10.lang.Math x10$lang$Math$$this$x10$lang$Math() {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        return x10.lang.Math.this;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    // creation method for java code (1-phase java constructor)
    public Math() {
        this((java.lang.System[]) null);
        x10$lang$Math$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.lang.Math x10$lang$Math$$init$S() {
         {
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            final x10.lang.Math this$110352 = this;
        }
        return this;
    }
    
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
    final public void __fieldInitializers_x10_lang_Math() {
        
    }
    
    public static double get$E() {
        return x10.lang.Math.E;
    }
    
    public static double get$PI() {
        return x10.lang.Math.PI;
    }
}

