package x10.lang;


@x10.runtime.impl.java.X10Generated
public class Complex extends x10.core.Struct implements x10.lang.Arithmetic, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Complex> $RTT = 
        x10.rtt.NamedStructType.<Complex> make("x10.lang.Complex",
                                               Complex.class,
                                               new x10.rtt.Type[] {
                                                   x10.rtt.ParameterizedType.make(x10.lang.Arithmetic.$RTT, x10.rtt.UnresolvedType.THIS),
                                                   x10.rtt.Types.STRUCT
                                               });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Complex $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.re = $deserializer.readDouble();
        $_obj.im = $deserializer.readDouble();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.Complex $_obj = new x10.lang.Complex((java.lang.System[]) null);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.re);
        $serializer.write(this.im);
        
    }
    
    // zero value constructor
    public Complex(final java.lang.System $dummy) { this.re = 0.0; this.im = 0.0; }
    
    // constructor just for allocation
    public Complex(final java.lang.System[] $dummy) {
        
    }
    
    // dispatcher for method abstract public x10.lang.Arithmetic[T].operator+(that:T){}:T
    public java.lang.Object $plus(final java.lang.Object a1, final x10.rtt.Type t1) {
        return $plus((x10.lang.Complex)a1);
        
    }
    
    // dispatcher for method abstract public x10.lang.Arithmetic[T].operator-(that:T){}:T
    public java.lang.Object $minus(final java.lang.Object a1, final x10.rtt.Type t1) {
        return $minus((x10.lang.Complex)a1);
        
    }
    
    // dispatcher for method abstract public x10.lang.Arithmetic[T].operator*(that:T){}:T
    public java.lang.Object $times(final java.lang.Object a1, final x10.rtt.Type t1) {
        return $times((x10.lang.Complex)a1);
        
    }
    
    // dispatcher for method abstract public x10.lang.Arithmetic[T].operator/(that:T){}:T
    public java.lang.Object $over(final java.lang.Object a1, final x10.rtt.Type t1) {
        return $over((x10.lang.Complex)a1);
        
    }
    
    // bridge for method abstract public x10.lang.Arithmetic[T].operator+(){}:T
    final public x10.lang.Complex $plus$G() {
        return $plus();
    }
    
    // bridge for method abstract public x10.lang.Arithmetic[T].operator-(){}:T
    final public x10.lang.Complex $minus$G() {
        return $minus();
    }
    
    

    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    /** The real component of this complex number. */
    public double re;
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    /** The imaginary component of this complex number. */
    public double im;
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    private static x10.lang.Complex ZERO;
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    private static x10.lang.Complex ONE;
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    private static x10.lang.Complex I;
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    private static x10.lang.Complex INF;
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    private static x10.lang.Complex NaN;
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    public Complex(final double real, final double imaginary) {
         {
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            this.__fieldInitializers_x10_lang_Complex();
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            this.re = real;
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            this.im = imaginary;
        }
    }
    
    
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public x10.lang.Complex $plus(final x10.lang.Complex that) {
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97410 = re;
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97411 = that.re;
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97414 = ((t$97410) + (((double)(t$97411))));
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97412 = im;
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97413 = that.im;
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97415 = ((t$97412) + (((double)(t$97413))));
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final x10.lang.Complex t$97416 = new x10.lang.Complex(t$97414, t$97415);
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97416;
    }
    
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public static x10.lang.Complex $plus(final double x, final x10.lang.Complex y) {
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final x10.lang.Complex t$97417 = y.$plus((double)(x));
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97417;
    }
    
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public x10.lang.Complex $plus(final double that) {
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97418 = re;
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97419 = ((t$97418) + (((double)(that))));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97420 = im;
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final x10.lang.Complex t$97421 = new x10.lang.Complex(t$97419, ((double)(t$97420)));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97421;
    }
    
    
    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public x10.lang.Complex $minus(final x10.lang.Complex that) {
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97422 = re;
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97423 = that.re;
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97426 = ((t$97422) - (((double)(t$97423))));
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97424 = im;
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97425 = that.im;
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97427 = ((t$97424) - (((double)(t$97425))));
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final x10.lang.Complex t$97428 = new x10.lang.Complex(t$97426, t$97427);
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97428;
    }
    
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public static x10.lang.Complex $minus(final double x, final x10.lang.Complex y) {
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97429 = y.re;
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97431 = ((x) - (((double)(t$97429))));
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97430 = y.im;
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97432 = (-(t$97430));
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final x10.lang.Complex t$97433 = new x10.lang.Complex(t$97431, t$97432);
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97433;
    }
    
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public x10.lang.Complex $minus(final double that) {
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97434 = re;
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97435 = ((t$97434) - (((double)(that))));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97436 = im;
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final x10.lang.Complex t$97437 = new x10.lang.Complex(t$97435, ((double)(t$97436)));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97437;
    }
    
    
    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public x10.lang.Complex $times(final x10.lang.Complex that) {
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97438 = re;
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97439 = that.re;
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97442 = ((t$97438) * (((double)(t$97439))));
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97440 = im;
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97441 = that.im;
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97443 = ((t$97440) * (((double)(t$97441))));
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97450 = ((t$97442) - (((double)(t$97443))));
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97444 = re;
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97445 = that.im;
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97448 = ((t$97444) * (((double)(t$97445))));
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97446 = im;
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97447 = that.re;
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97449 = ((t$97446) * (((double)(t$97447))));
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97451 = ((t$97448) + (((double)(t$97449))));
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final x10.lang.Complex t$97452 = new x10.lang.Complex(t$97450, t$97451);
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97452;
    }
    
    
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public static x10.lang.Complex $times(final double x, final x10.lang.Complex y) {
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final x10.lang.Complex t$97453 = y.$times((double)(x));
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97453;
    }
    
    
    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public x10.lang.Complex $times(final double that) {
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97454 = re;
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97456 = ((t$97454) * (((double)(that))));
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97455 = im;
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97457 = ((t$97455) * (((double)(that))));
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final x10.lang.Complex t$97458 = new x10.lang.Complex(t$97456, t$97457);
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97458;
    }
    
    
    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public x10.lang.Complex $over(final x10.lang.Complex that) {
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        boolean t$97459 = this.isNaN$O();
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        if (!(t$97459)) {
            
            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            t$97459 = that.isNaN$O();
        }
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97461 = t$97459;
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        if (t$97461) {
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final x10.lang.Complex t$97460 = ((x10.lang.Complex)(x10.lang.Complex.get$NaN()));
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            return t$97460;
        }
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double c = that.re;
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double d = that.im;
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        boolean t$97462 = ((double) c) == ((double) 0.0);
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        if (t$97462) {
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            t$97462 = ((double) d) == ((double) 0.0);
        }
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97469 = t$97462;
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        if (t$97469) {
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97463 = re;
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            boolean t$97465 = ((double) t$97463) == ((double) 0.0);
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            if (t$97465) {
                
                //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final double t$97464 = im;
                
                //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                t$97465 = ((double) t$97464) == ((double) 0.0);
            }
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final boolean t$97468 = t$97465;
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            if (t$97468) {
                
                //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final x10.lang.Complex t$97466 = ((x10.lang.Complex)(x10.lang.Complex.get$NaN()));
                
                //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                return t$97466;
            } else {
                
                //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final x10.lang.Complex t$97467 = ((x10.lang.Complex)(x10.lang.Complex.get$INF()));
                
                //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                return t$97467;
            }
        }
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        boolean t$97471 = that.isInfinite$O();
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        if (t$97471) {
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final boolean t$97470 = this.isInfinite$O();
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            t$97471 = !(t$97470);
        }
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97473 = t$97471;
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        if (t$97473) {
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final x10.lang.Complex t$97472 = ((x10.lang.Complex)(x10.lang.Complex.get$ZERO()));
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            return t$97472;
        }
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97474 = java.lang.Math.abs(((double)(d)));
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97475 = java.lang.Math.abs(((double)(c)));
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97513 = ((t$97474) <= (((double)(t$97475))));
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        if (t$97513) {
            
            //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final boolean t$97482 = ((double) c) == ((double) 0.0);
            
            //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            if (t$97482) {
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final double t$97476 = im;
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final double t$97479 = ((t$97476) / (((double)(d))));
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final double t$97477 = re;
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final double t$97478 = (-(t$97477));
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final double t$97480 = ((t$97478) / (((double)(c))));
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final x10.lang.Complex t$97481 = new x10.lang.Complex(t$97479, t$97480);
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                return t$97481;
            }
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double r = ((d) / (((double)(c))));
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97483 = ((d) * (((double)(r))));
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double denominator = ((c) + (((double)(t$97483))));
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97485 = re;
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97484 = im;
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97486 = ((t$97484) * (((double)(r))));
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97487 = ((t$97485) + (((double)(t$97486))));
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97492 = ((t$97487) / (((double)(denominator))));
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97489 = im;
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97488 = re;
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97490 = ((t$97488) * (((double)(r))));
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97491 = ((t$97489) - (((double)(t$97490))));
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97493 = ((t$97491) / (((double)(denominator))));
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final x10.lang.Complex t$97494 = new x10.lang.Complex(t$97492, t$97493);
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            return t$97494;
        } else {
            
            //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final boolean t$97500 = ((double) d) == ((double) 0.0);
            
            //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            if (t$97500) {
                
                //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final double t$97495 = re;
                
                //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final double t$97497 = ((t$97495) / (((double)(c))));
                
                //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final double t$97496 = im;
                
                //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final double t$97498 = ((t$97496) / (((double)(c))));
                
                //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final x10.lang.Complex t$97499 = new x10.lang.Complex(t$97497, t$97498);
                
                //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                return t$97499;
            }
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double r = ((c) / (((double)(d))));
            
            //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97501 = ((c) * (((double)(r))));
            
            //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double denominator = ((t$97501) + (((double)(d))));
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97502 = re;
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97503 = ((t$97502) * (((double)(r))));
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97504 = im;
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97505 = ((t$97503) + (((double)(t$97504))));
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97510 = ((t$97505) / (((double)(denominator))));
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97506 = im;
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97507 = ((t$97506) * (((double)(r))));
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97508 = re;
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97509 = ((t$97507) - (((double)(t$97508))));
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97511 = ((t$97509) / (((double)(denominator))));
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final x10.lang.Complex t$97512 = new x10.lang.Complex(t$97510, t$97511);
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            return t$97512;
        }
    }
    
    
    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public static x10.lang.Complex $over(final double x, final x10.lang.Complex y) {
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final x10.lang.Complex t$97514 = new x10.lang.Complex(((double)(x)), ((double)(0.0)));
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final x10.lang.Complex t$97515 = t$97514.$over(((x10.lang.Complex)(y)));
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97515;
    }
    
    
    //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public x10.lang.Complex $over(final double that) {
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97516 = re;
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97518 = ((t$97516) / (((double)(that))));
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97517 = im;
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97519 = ((t$97517) / (((double)(that))));
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final x10.lang.Complex t$97520 = new x10.lang.Complex(t$97518, t$97519);
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97520;
    }
    
    
    //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public x10.lang.Complex conjugate() {
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97522 = re;
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97521 = im;
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97523 = (-(t$97521));
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final x10.lang.Complex t$97524 = new x10.lang.Complex(((double)(t$97522)), t$97523);
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97524;
    }
    
    
    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public x10.lang.Complex $plus() {
        
        //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return this;
    }
    
    
    //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public x10.lang.Complex $minus() {
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97529 = this.isNaN$O();
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        x10.lang.Complex t$97530 =  null;
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        if (t$97529) {
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            t$97530 = x10.lang.Complex.get$NaN();
        } else {
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97525 = re;
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97527 = (-(t$97525));
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97526 = im;
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97528 = (-(t$97526));
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            t$97530 = new x10.lang.Complex(t$97527, t$97528);
        }
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final x10.lang.Complex t$97531 = t$97530;
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97531;
    }
    
    
    //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public double abs$O() {
        
        //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97533 = this.isNaN$O();
        
        //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        if (t$97533) {
            
            //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97532 = java.lang.Double.NaN;
            
            //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            return t$97532;
        }
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97535 = this.isInfinite$O();
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        if (t$97535) {
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97534 = java.lang.Double.POSITIVE_INFINITY;
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            return t$97534;
        }
        
        //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97536 = im;
        
        //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97546 = ((double) t$97536) == ((double) 0.0);
        
        //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        if (t$97546) {
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97537 = re;
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97538 = java.lang.Math.abs(((double)(t$97537)));
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            return t$97538;
        } else {
            
            //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97539 = re;
            
            //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final boolean t$97545 = ((double) t$97539) == ((double) 0.0);
            
            //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            if (t$97545) {
                
                //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final double t$97540 = im;
                
                //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final double t$97541 = java.lang.Math.abs(((double)(t$97540)));
                
                //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                return t$97541;
            } else {
                
                //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final double t$97542 = re;
                
                //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final double t$97543 = im;
                
                //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final double t$97544 = java.lang.Math.hypot(((double)(t$97542)),((double)(t$97543)));
                
                //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                return t$97544;
            }
        }
    }
    
    
    //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public boolean isNaN$O() {
        
        //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97547 = re;
        
        //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        boolean t$97549 = java.lang.Double.isNaN(t$97547);
        
        //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        if (!(t$97549)) {
            
            //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97548 = im;
            
            //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            t$97549 = java.lang.Double.isNaN(t$97548);
        }
        
        //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97550 = t$97549;
        
        //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97550;
    }
    
    
    //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public boolean isInfinite$O() {
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97551 = this.isNaN$O();
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        boolean t$97555 = !(t$97551);
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        if (t$97555) {
            
            //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97552 = re;
            
            //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            boolean t$97554 = java.lang.Double.isInfinite(t$97552);
            
            //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            if (!(t$97554)) {
                
                //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                final double t$97553 = im;
                
                //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
                t$97554 = java.lang.Double.isInfinite(t$97553);
            }
            
            //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            t$97555 = t$97554;
        }
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97556 = t$97555;
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97556;
    }
    
    
    //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public java.lang.String toString() {
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97557 = re;
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final java.lang.String t$97558 = (("") + ((x10.core.Double.$box(t$97557))));
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final java.lang.String t$97559 = ((t$97558) + (" + "));
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97560 = im;
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final java.lang.String t$97561 = ((t$97559) + ((x10.core.Double.$box(t$97560))));
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final java.lang.String t$97562 = ((t$97561) + ("i"));
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97562;
    }
    
    
    //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public int hashCode() {
        
        //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97563 = re;
        
        //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final int t$97565 = x10.rtt.Types.hashCode(t$97563);
        
        //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97564 = im;
        
        //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final int t$97566 = x10.rtt.Types.hashCode(t$97564);
        
        //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final int t$97567 = ((t$97565) * (((int)(t$97566))));
        
        //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97567;
    }
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public java.lang.String typeName() {
        try {
            return x10.rtt.Types.typeName(this);
        }
        catch (java.lang.Throwable exc$146350) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146350);
        }
        
    }
    
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public boolean equals(java.lang.Object other) {
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final java.lang.Object t$97568 = ((java.lang.Object)(other));
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97569 = x10.lang.Complex.$RTT.isInstance(t$97568);
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97570 = !(t$97569);
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        if (t$97570) {
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            return false;
        }
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final java.lang.Object t$97571 = ((java.lang.Object)(other));
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final x10.lang.Complex t$97572 = ((x10.lang.Complex)x10.rtt.Types.asStruct(x10.lang.Complex.$RTT,t$97571));
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97573 = this.equals$O(((x10.lang.Complex)(t$97572)));
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97573;
    }
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public boolean equals$O(x10.lang.Complex other) {
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97575 = this.re;
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final x10.lang.Complex t$97574 = ((x10.lang.Complex)(other));
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97576 = t$97574.re;
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        boolean t$97580 = ((double) t$97575) == ((double) t$97576);
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        if (t$97580) {
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97578 = this.im;
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final x10.lang.Complex t$97577 = ((x10.lang.Complex)(other));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97579 = t$97577.im;
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            t$97580 = ((double) t$97578) == ((double) t$97579);
        }
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97581 = t$97580;
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97581;
    }
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public boolean _struct_equals$O(java.lang.Object other) {
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final java.lang.Object t$97582 = ((java.lang.Object)(other));
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97583 = x10.lang.Complex.$RTT.isInstance(t$97582);
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97584 = !(t$97583);
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        if (t$97584) {
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            return false;
        }
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final java.lang.Object t$97585 = ((java.lang.Object)(other));
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final x10.lang.Complex t$97586 = ((x10.lang.Complex)x10.rtt.Types.asStruct(x10.lang.Complex.$RTT,t$97585));
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97587 = this._struct_equals$O(((x10.lang.Complex)(t$97586)));
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97587;
    }
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public boolean _struct_equals$O(x10.lang.Complex other) {
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97589 = this.re;
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final x10.lang.Complex t$97588 = ((x10.lang.Complex)(other));
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final double t$97590 = t$97588.re;
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        boolean t$97594 = ((double) t$97589) == ((double) t$97590);
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        if (t$97594) {
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97592 = this.im;
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final x10.lang.Complex t$97591 = ((x10.lang.Complex)(other));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            final double t$97593 = t$97591.im;
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
            t$97594 = ((double) t$97592) == ((double) t$97593);
        }
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        final boolean t$97595 = t$97594;
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return t$97595;
    }
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public x10.lang.Complex x10$lang$Complex$$this$x10$lang$Complex() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
        return x10.lang.Complex.this;
    }
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Complex.x10"
    final public void __fieldInitializers_x10_lang_Complex() {
        
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$NaN = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$NaN;
    final private static x10.core.concurrent.AtomicInteger initStatus$INF = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$INF;
    final private static x10.core.concurrent.AtomicInteger initStatus$I = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$I;
    final private static x10.core.concurrent.AtomicInteger initStatus$ONE = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$ONE;
    final private static x10.core.concurrent.AtomicInteger initStatus$ZERO = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$ZERO;
    
    public static x10.lang.Complex get$ZERO() {
        if (((int) x10.lang.Complex.initStatus$ZERO.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Complex.ZERO;
        }
        if (((int) x10.lang.Complex.initStatus$ZERO.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Complex.exception$ZERO;
        }
        if (x10.lang.Complex.initStatus$ZERO.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Complex.ZERO = new x10.lang.Complex(((double)(0.0)), ((double)(0.0)));
            }}catch (java.lang.Throwable exc$97596) {
                x10.lang.Complex.exception$ZERO = new x10.lang.ExceptionInInitializer(exc$97596);
                x10.lang.Complex.initStatus$ZERO.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Complex.exception$ZERO;
            }
            x10.lang.Complex.initStatus$ZERO.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Complex.initStatus$ZERO.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Complex.initStatus$ZERO.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Complex.initStatus$ZERO.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Complex.exception$ZERO;
                }
            }
        }
        return x10.lang.Complex.ZERO;
    }
    
    public static x10.lang.Complex get$ONE() {
        if (((int) x10.lang.Complex.initStatus$ONE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Complex.ONE;
        }
        if (((int) x10.lang.Complex.initStatus$ONE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Complex.exception$ONE;
        }
        if (x10.lang.Complex.initStatus$ONE.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Complex.ONE = new x10.lang.Complex(((double)(1.0)), ((double)(0.0)));
            }}catch (java.lang.Throwable exc$97597) {
                x10.lang.Complex.exception$ONE = new x10.lang.ExceptionInInitializer(exc$97597);
                x10.lang.Complex.initStatus$ONE.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Complex.exception$ONE;
            }
            x10.lang.Complex.initStatus$ONE.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Complex.initStatus$ONE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Complex.initStatus$ONE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Complex.initStatus$ONE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Complex.exception$ONE;
                }
            }
        }
        return x10.lang.Complex.ONE;
    }
    
    public static x10.lang.Complex get$I() {
        if (((int) x10.lang.Complex.initStatus$I.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Complex.I;
        }
        if (((int) x10.lang.Complex.initStatus$I.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Complex.exception$I;
        }
        if (x10.lang.Complex.initStatus$I.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Complex.I = new x10.lang.Complex(((double)(0.0)), ((double)(1.0)));
            }}catch (java.lang.Throwable exc$97598) {
                x10.lang.Complex.exception$I = new x10.lang.ExceptionInInitializer(exc$97598);
                x10.lang.Complex.initStatus$I.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Complex.exception$I;
            }
            x10.lang.Complex.initStatus$I.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Complex.initStatus$I.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Complex.initStatus$I.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Complex.initStatus$I.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Complex.exception$I;
                }
            }
        }
        return x10.lang.Complex.I;
    }
    
    public static x10.lang.Complex get$INF() {
        if (((int) x10.lang.Complex.initStatus$INF.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Complex.INF;
        }
        if (((int) x10.lang.Complex.initStatus$INF.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Complex.exception$INF;
        }
        if (x10.lang.Complex.initStatus$INF.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Complex.INF = new x10.lang.Complex(((double)(java.lang.Double.POSITIVE_INFINITY)), ((double)(java.lang.Double.POSITIVE_INFINITY)));
            }}catch (java.lang.Throwable exc$97599) {
                x10.lang.Complex.exception$INF = new x10.lang.ExceptionInInitializer(exc$97599);
                x10.lang.Complex.initStatus$INF.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Complex.exception$INF;
            }
            x10.lang.Complex.initStatus$INF.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Complex.initStatus$INF.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Complex.initStatus$INF.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Complex.initStatus$INF.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Complex.exception$INF;
                }
            }
        }
        return x10.lang.Complex.INF;
    }
    
    public static x10.lang.Complex get$NaN() {
        if (((int) x10.lang.Complex.initStatus$NaN.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Complex.NaN;
        }
        if (((int) x10.lang.Complex.initStatus$NaN.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Complex.exception$NaN;
        }
        if (x10.lang.Complex.initStatus$NaN.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Complex.NaN = new x10.lang.Complex(((double)(java.lang.Double.NaN)), ((double)(java.lang.Double.NaN)));
            }}catch (java.lang.Throwable exc$97600) {
                x10.lang.Complex.exception$NaN = new x10.lang.ExceptionInInitializer(exc$97600);
                x10.lang.Complex.initStatus$NaN.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Complex.exception$NaN;
            }
            x10.lang.Complex.initStatus$NaN.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Complex.initStatus$NaN.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Complex.initStatus$NaN.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Complex.initStatus$NaN.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Complex.exception$NaN;
                }
            }
        }
        return x10.lang.Complex.NaN;
    }
}

