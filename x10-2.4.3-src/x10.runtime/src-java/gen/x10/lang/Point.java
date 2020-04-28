package x10.lang;


@x10.runtime.impl.java.X10Generated
final public class Point extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.util.Ordered, java.lang.Comparable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Point> $RTT = 
        x10.rtt.NamedType.<Point> make("x10.lang.Point",
                                       Point.class,
                                       new x10.rtt.Type[] {
                                           x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG),
                                           x10.rtt.ParameterizedType.make(x10.util.Ordered.$RTT, x10.rtt.UnresolvedType.THIS),
                                           x10.rtt.ParameterizedType.make(x10.rtt.Types.COMPARABLE, x10.rtt.UnresolvedType.THIS)
                                       });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Point $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.c0 = $deserializer.readLong();
        $_obj.c1 = $deserializer.readLong();
        $_obj.c2 = $deserializer.readLong();
        $_obj.c3 = $deserializer.readLong();
        $_obj.cs = $deserializer.readObject();
        $_obj.rank = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.Point $_obj = new x10.lang.Point((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.c0);
        $serializer.write(this.c1);
        $serializer.write(this.c2);
        $serializer.write(this.c3);
        $serializer.write(this.cs);
        $serializer.write(this.rank);
        
    }
    
    // constructor just for allocation
    public Point(final java.lang.System[] $dummy) {
        
    }
    
    // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1){}:U
    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
        return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
        
    }
    
    // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1){}:U
    public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
        return $apply$O(x10.core.Long.$unbox(a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Ordered[T].operator<(that:T){}:x10.lang.Boolean
    public java.lang.Object $lt(final java.lang.Object a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box($lt$O((x10.lang.Point)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Ordered[T].operator<(that:T){}:x10.lang.Boolean
    public boolean $lt$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
        return $lt$O((x10.lang.Point)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.Ordered[T].operator>(that:T){}:x10.lang.Boolean
    public java.lang.Object $gt(final java.lang.Object a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box($gt$O((x10.lang.Point)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Ordered[T].operator>(that:T){}:x10.lang.Boolean
    public boolean $gt$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
        return $gt$O((x10.lang.Point)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.Ordered[T].operator<=(that:T){}:x10.lang.Boolean
    public java.lang.Object $le(final java.lang.Object a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box($le$O((x10.lang.Point)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Ordered[T].operator<=(that:T){}:x10.lang.Boolean
    public boolean $le$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
        return $le$O((x10.lang.Point)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.Ordered[T].operator>=(that:T){}:x10.lang.Boolean
    public java.lang.Object $ge(final java.lang.Object a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box($ge$O((x10.lang.Point)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Ordered[T].operator>=(that:T){}:x10.lang.Boolean
    public boolean $ge$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
        return $ge$O((x10.lang.Point)a1);
        
    }
    
    // synthetic type for parameter mangling
    public static final class __0$1x10$lang$Long$2 {}
    
    // properties
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public long rank;
    

    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public long c0;
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public long c1;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public long c2;
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public long c3;
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public x10.core.Rail<x10.core.Long> cs;
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    // creation method for java code (1-phase java constructor)
    public Point(final x10.core.Rail<x10.core.Long> coords, __0$1x10$lang$Long$2 $dummy) {
        this((java.lang.System[]) null);
        x10$lang$Point$$init$S(coords, (x10.lang.Point.__0$1x10$lang$Long$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.lang.Point x10$lang$Point$$init$S(final x10.core.Rail<x10.core.Long> coords, __0$1x10$lang$Long$2 $dummy) {
         {
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111460 = ((x10.core.Rail<x10.core.Long>)coords).size;
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.rank = t$111460;
            
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final x10.lang.Point this$111461 = this;
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111147 = ((long[])coords.value)[(int)0L];
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.c0 = t$111147;
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111148 = rank;
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111149 = ((t$111148) > (((long)(1L))));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            long t$111150 =  0;
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (t$111149) {
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                t$111150 = ((long[])coords.value)[(int)1L];
            } else {
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                t$111150 = 0L;
            }
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111151 = t$111150;
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.c1 = t$111151;
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111152 = rank;
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111153 = ((t$111152) > (((long)(2L))));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            long t$111154 =  0;
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (t$111153) {
                
                //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                t$111154 = ((long[])coords.value)[(int)2L];
            } else {
                
                //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                t$111154 = 0L;
            }
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111155 = t$111154;
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.c2 = t$111155;
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111156 = rank;
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111157 = ((t$111156) > (((long)(3L))));
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            long t$111158 =  0;
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (t$111157) {
                
                //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                t$111158 = ((long[])coords.value)[(int)3L];
            } else {
                
                //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                t$111158 = 0L;
            }
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111159 = t$111158;
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.c3 = t$111159;
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111160 = rank;
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111161 = ((t$111160) > (((long)(4L))));
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            x10.core.Rail t$111162 =  null;
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (t$111161) {
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                t$111162 = ((x10.core.Rail)(coords));
            } else {
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                t$111162 = null;
            }
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final x10.core.Rail t$111163 = ((x10.core.Rail)(t$111162));
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.cs = ((x10.core.Rail)(t$111163));
        }
        return this;
    }
    
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    // creation method for java code (1-phase java constructor)
    public Point(final long i0) {
        this((java.lang.System[]) null);
        x10$lang$Point$$init$S(i0);
    }
    
    // constructor for non-virtual call
    final public x10.lang.Point x10$lang$Point$$init$S(final long i0) {
         {
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.rank = 1L;
            
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final x10.lang.Point this$111462 = this;
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.c0 = i0;
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111164 = this.c3 = 0L;
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111165 = this.c2 = t$111164;
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.c1 = t$111165;
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.cs = null;
        }
        return this;
    }
    
    
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    // creation method for java code (1-phase java constructor)
    public Point(final long i0, final long i1) {
        this((java.lang.System[]) null);
        x10$lang$Point$$init$S(i0, i1);
    }
    
    // constructor for non-virtual call
    final public x10.lang.Point x10$lang$Point$$init$S(final long i0, final long i1) {
         {
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.rank = 2L;
            
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final x10.lang.Point this$111463 = this;
            
            //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.c0 = i0;
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.c1 = i1;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111166 = this.c3 = 0L;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.c2 = t$111166;
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.cs = null;
        }
        return this;
    }
    
    
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    // creation method for java code (1-phase java constructor)
    public Point(final long i0, final long i1, final long i2) {
        this((java.lang.System[]) null);
        x10$lang$Point$$init$S(i0, i1, i2);
    }
    
    // constructor for non-virtual call
    final public x10.lang.Point x10$lang$Point$$init$S(final long i0, final long i1, final long i2) {
         {
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.rank = 3L;
            
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final x10.lang.Point this$111464 = this;
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.c0 = i0;
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.c1 = i1;
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.c2 = i2;
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.c3 = 0L;
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.cs = null;
        }
        return this;
    }
    
    
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    // creation method for java code (1-phase java constructor)
    public Point(final long i0, final long i1, final long i2, final long i3) {
        this((java.lang.System[]) null);
        x10$lang$Point$$init$S(i0, i1, i2, i3);
    }
    
    // constructor for non-virtual call
    final public x10.lang.Point x10$lang$Point$$init$S(final long i0, final long i1, final long i2, final long i3) {
         {
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.rank = 4L;
            
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final x10.lang.Point this$111465 = this;
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.c0 = i0;
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.c1 = i1;
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.c2 = i2;
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.c3 = i3;
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            this.cs = null;
        }
        return this;
    }
    
    
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public long $apply$O(final long i) {
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        boolean t$111168 = ((i) < (((long)(0L))));
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        if (!(t$111168)) {
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111167 = rank;
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            t$111168 = ((i) >= (((long)(t$111167))));
        }
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final boolean t$111173 = t$111168;
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        if (t$111173) {
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final java.lang.String t$111169 = (("index ") + ((x10.core.Long.$box(i))));
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final java.lang.String t$111170 = ((t$111169) + (" not contained in "));
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final java.lang.String t$111171 = ((t$111170) + (this));
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final java.lang.ArrayIndexOutOfBoundsException t$111172 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$111171)));
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            throw t$111172;
        }
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final boolean t$111175 = ((long) i) == ((long) 0L);
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        if (t$111175) {
            
            //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111174 = c0;
            
            //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111174;
        }
        
        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final boolean t$111177 = ((long) i) == ((long) 1L);
        
        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        if (t$111177) {
            
            //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111176 = c1;
            
            //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111176;
        }
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final boolean t$111179 = ((long) i) == ((long) 2L);
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        if (t$111179) {
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111178 = c2;
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111178;
        }
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final boolean t$111181 = ((long) i) == ((long) 3L);
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        if (t$111181) {
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111180 = c3;
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111180;
        }
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.core.Rail t$111182 = ((x10.core.Rail)(cs));
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111183 = ((long[])t$111182.value)[(int)i];
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111183;
    }
    
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public x10.core.fun.Fun_0_1 coords() {
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.core.fun.Fun_0_1 t$111185 = ((x10.core.fun.Fun_0_1)(new x10.lang.Point.$Closure$149(this)));
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111185;
    }
    
    
    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public static x10.lang.Point make__0$1x10$lang$Int$2(final x10.core.Rail<x10.core.Int> r) {
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111186 = ((x10.core.Rail<x10.core.Int>)r).size;
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final boolean t$111222 = ((long) t$111186) == ((long) 1L);
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        if (t$111222) {
            
            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final x10.lang.Point alloc$71511 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
            
            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final int t$111466 = ((int[])r.value)[(int)0L];
            
            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111467 = ((long)(((int)(t$111466))));
            
            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            alloc$71511.x10$lang$Point$$init$S(t$111467);
            
            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final x10.lang.Point t$111189 = ((x10.lang.Point)(((x10.lang.Point)
                                                                alloc$71511)));
            
            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111189;
        } else {
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111190 = ((x10.core.Rail<x10.core.Int>)r).size;
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111221 = ((long) t$111190) == ((long) 2L);
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (t$111221) {
                
                //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final x10.lang.Point alloc$71512 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
                
                //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final int t$111468 = ((int[])r.value)[(int)0L];
                
                //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final long t$111469 = ((long)(((int)(t$111468))));
                
                //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final int t$111470 = ((int[])r.value)[(int)1L];
                
                //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final long t$111471 = ((long)(((int)(t$111470))));
                
                //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                alloc$71512.x10$lang$Point$$init$S(t$111469, t$111471);
                
                //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final x10.lang.Point t$111195 = ((x10.lang.Point)(((x10.lang.Point)
                                                                    alloc$71512)));
                
                //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                return t$111195;
            } else {
                
                //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final long t$111196 = ((x10.core.Rail<x10.core.Int>)r).size;
                
                //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final boolean t$111220 = ((long) t$111196) == ((long) 3L);
                
                //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                if (t$111220) {
                    
                    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final x10.lang.Point alloc$71513 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
                    
                    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final int t$111472 = ((int[])r.value)[(int)0L];
                    
                    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final long t$111473 = ((long)(((int)(t$111472))));
                    
                    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final int t$111474 = ((int[])r.value)[(int)1L];
                    
                    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final long t$111475 = ((long)(((int)(t$111474))));
                    
                    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final int t$111476 = ((int[])r.value)[(int)2L];
                    
                    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final long t$111477 = ((long)(((int)(t$111476))));
                    
                    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    alloc$71513.x10$lang$Point$$init$S(t$111473, t$111475, t$111477);
                    
                    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final x10.lang.Point t$111203 = ((x10.lang.Point)(((x10.lang.Point)
                                                                        alloc$71513)));
                    
                    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    return t$111203;
                } else {
                    
                    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final long t$111204 = ((x10.core.Rail<x10.core.Int>)r).size;
                    
                    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final boolean t$111219 = ((long) t$111204) == ((long) 4L);
                    
                    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    if (t$111219) {
                        
                        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final x10.lang.Point alloc$71514 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
                        
                        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final int t$111478 = ((int[])r.value)[(int)0L];
                        
                        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final long t$111479 = ((long)(((int)(t$111478))));
                        
                        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final int t$111480 = ((int[])r.value)[(int)1L];
                        
                        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final long t$111481 = ((long)(((int)(t$111480))));
                        
                        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final int t$111482 = ((int[])r.value)[(int)2L];
                        
                        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final long t$111483 = ((long)(((int)(t$111482))));
                        
                        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final int t$111484 = ((int[])r.value)[(int)3L];
                        
                        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final long t$111485 = ((long)(((int)(t$111484))));
                        
                        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        alloc$71514.x10$lang$Point$$init$S(t$111479, t$111481, t$111483, t$111485);
                        
                        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final x10.lang.Point t$111213 = ((x10.lang.Point)(((x10.lang.Point)
                                                                            alloc$71514)));
                        
                        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        return t$111213;
                    } else {
                        
                        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final x10.lang.Point alloc$71515 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
                        
                        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final long t$111486 = ((x10.core.Rail<x10.core.Int>)r).size;
                        
                        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final x10.core.fun.Fun_0_1 t$111487 = ((x10.core.fun.Fun_0_1)(new x10.lang.Point.$Closure$150(r, (x10.lang.Point.$Closure$150.__0$1x10$lang$Int$2) null)));
                        
                        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final x10.core.Rail t$111491 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$111486)), ((x10.core.fun.Fun_0_1)(t$111487)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                        
                        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        alloc$71515.x10$lang$Point$$init$S(((x10.core.Rail)(t$111491)), (x10.lang.Point.__0$1x10$lang$Long$2) null);
                        
                        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        return alloc$71515;
                    }
                }
            }
        }
    }
    
    
    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public static x10.lang.Point make__0$1x10$lang$Long$2(final x10.core.Rail<x10.core.Long> r) {
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111223 = ((x10.core.Rail<x10.core.Long>)r).size;
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final boolean t$111246 = ((long) t$111223) == ((long) 1L);
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        if (t$111246) {
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final x10.lang.Point alloc$71516 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111492 = ((long[])r.value)[(int)0L];
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            alloc$71516.x10$lang$Point$$init$S(t$111492);
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final x10.lang.Point t$111225 = ((x10.lang.Point)(((x10.lang.Point)
                                                                alloc$71516)));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111225;
        } else {
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111226 = ((x10.core.Rail<x10.core.Long>)r).size;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111245 = ((long) t$111226) == ((long) 2L);
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (t$111245) {
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final x10.lang.Point alloc$71517 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final long t$111493 = ((long[])r.value)[(int)0L];
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final long t$111494 = ((long[])r.value)[(int)1L];
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                alloc$71517.x10$lang$Point$$init$S(t$111493, t$111494);
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final x10.lang.Point t$111229 = ((x10.lang.Point)(((x10.lang.Point)
                                                                    alloc$71517)));
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                return t$111229;
            } else {
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final long t$111230 = ((x10.core.Rail<x10.core.Long>)r).size;
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final boolean t$111244 = ((long) t$111230) == ((long) 3L);
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                if (t$111244) {
                    
                    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final x10.lang.Point alloc$71518 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
                    
                    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final long t$111495 = ((long[])r.value)[(int)0L];
                    
                    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final long t$111496 = ((long[])r.value)[(int)1L];
                    
                    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final long t$111497 = ((long[])r.value)[(int)2L];
                    
                    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    alloc$71518.x10$lang$Point$$init$S(t$111495, t$111496, t$111497);
                    
                    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final x10.lang.Point t$111234 = ((x10.lang.Point)(((x10.lang.Point)
                                                                        alloc$71518)));
                    
                    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    return t$111234;
                } else {
                    
                    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final long t$111235 = ((x10.core.Rail<x10.core.Long>)r).size;
                    
                    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final boolean t$111243 = ((long) t$111235) == ((long) 4L);
                    
                    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    if (t$111243) {
                        
                        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final x10.lang.Point alloc$71519 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
                        
                        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final long t$111498 = ((long[])r.value)[(int)0L];
                        
                        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final long t$111499 = ((long[])r.value)[(int)1L];
                        
                        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final long t$111500 = ((long[])r.value)[(int)2L];
                        
                        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final long t$111501 = ((long[])r.value)[(int)3L];
                        
                        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        alloc$71519.x10$lang$Point$$init$S(t$111498, t$111499, t$111500, t$111501);
                        
                        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final x10.lang.Point t$111240 = ((x10.lang.Point)(((x10.lang.Point)
                                                                            alloc$71519)));
                        
                        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        return t$111240;
                    } else {
                        
                        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final x10.lang.Point alloc$71520 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
                        
                        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final long t$111502 = ((x10.core.Rail<x10.core.Long>)r).size;
                        
                        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final x10.core.Rail t$111503 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$111502)), ((x10.core.fun.Fun_0_1)(r)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                        
                        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        alloc$71520.x10$lang$Point$$init$S(((x10.core.Rail)(t$111503)), (x10.lang.Point.__0$1x10$lang$Long$2) null);
                        
                        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        return alloc$71520;
                    }
                }
            }
        }
    }
    
    
    //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public static x10.lang.Point make__1$1x10$lang$Long$3x10$lang$Long$2(final long rank, final x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> init) {
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final boolean t$111268 = ((long) rank) == ((long) 1L);
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        if (t$111268) {
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final x10.lang.Point alloc$71521 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111504 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)init).$apply(x10.core.Long.$box(0L), x10.rtt.Types.LONG));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            alloc$71521.x10$lang$Point$$init$S(t$111504);
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final x10.lang.Point t$111248 = ((x10.lang.Point)(((x10.lang.Point)
                                                                alloc$71521)));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111248;
        } else {
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111267 = ((long) rank) == ((long) 2L);
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (t$111267) {
                
                //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final x10.lang.Point alloc$71522 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
                
                //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final long t$111505 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)init).$apply(x10.core.Long.$box(0L), x10.rtt.Types.LONG));
                
                //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final long t$111506 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)init).$apply(x10.core.Long.$box(1L), x10.rtt.Types.LONG));
                
                //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                alloc$71522.x10$lang$Point$$init$S(t$111505, t$111506);
                
                //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final x10.lang.Point t$111251 = ((x10.lang.Point)(((x10.lang.Point)
                                                                    alloc$71522)));
                
                //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                return t$111251;
            } else {
                
                //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                final boolean t$111266 = ((long) rank) == ((long) 3L);
                
                //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                if (t$111266) {
                    
                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final x10.lang.Point alloc$71523 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
                    
                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final long t$111507 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)init).$apply(x10.core.Long.$box(0L), x10.rtt.Types.LONG));
                    
                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final long t$111508 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)init).$apply(x10.core.Long.$box(1L), x10.rtt.Types.LONG));
                    
                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final long t$111509 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)init).$apply(x10.core.Long.$box(2L), x10.rtt.Types.LONG));
                    
                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    alloc$71523.x10$lang$Point$$init$S(t$111507, t$111508, t$111509);
                    
                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final x10.lang.Point t$111255 = ((x10.lang.Point)(((x10.lang.Point)
                                                                        alloc$71523)));
                    
                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    return t$111255;
                } else {
                    
                    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    final boolean t$111265 = ((long) rank) == ((long) 4L);
                    
                    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                    if (t$111265) {
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final x10.lang.Point alloc$71524 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final long t$111510 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)init).$apply(x10.core.Long.$box(0L), x10.rtt.Types.LONG));
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final long t$111511 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)init).$apply(x10.core.Long.$box(1L), x10.rtt.Types.LONG));
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final long t$111512 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)init).$apply(x10.core.Long.$box(2L), x10.rtt.Types.LONG));
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final long t$111513 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)init).$apply(x10.core.Long.$box(3L), x10.rtt.Types.LONG));
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        alloc$71524.x10$lang$Point$$init$S(t$111510, t$111511, t$111512, t$111513);
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final x10.lang.Point t$111260 = ((x10.lang.Point)(((x10.lang.Point)
                                                                            alloc$71524)));
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        return t$111260;
                    } else {
                        
                        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final x10.lang.Point alloc$71525 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
                        
                        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final x10.core.fun.Fun_0_1 t$111514 = ((x10.core.fun.Fun_0_1)(new x10.lang.Point.$Closure$151(init, (x10.lang.Point.$Closure$151.__0$1x10$lang$Long$3x10$lang$Long$2) null)));
                        
                        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final x10.core.Rail t$111517 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(rank)), ((x10.core.fun.Fun_0_1)(t$111514)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                        
                        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        alloc$71525.x10$lang$Point$$init$S(((x10.core.Rail)(t$111517)), (x10.lang.Point.__0$1x10$lang$Long$2) null);
                        
                        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        final x10.lang.Point t$111264 = ((x10.lang.Point)(((x10.lang.Point)
                                                                            alloc$71525)));
                        
                        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                        return t$111264;
                    }
                }
            }
        }
    }
    
    
    //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public static x10.lang.Point make(final int i0) {
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$71526 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111518 = ((long)(((int)(i0))));
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$71526.x10$lang$Point$$init$S(t$111518);
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return alloc$71526;
    }
    
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public static x10.lang.Point make(final int i0, final int i1) {
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$71527 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111519 = ((long)(((int)(i0))));
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111520 = ((long)(((int)(i1))));
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$71527.x10$lang$Point$$init$S(t$111519, t$111520);
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return alloc$71527;
    }
    
    
    //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public static x10.lang.Point make(final int i0, final int i1, final int i2) {
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$71528 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111521 = ((long)(((int)(i0))));
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111522 = ((long)(((int)(i1))));
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111523 = ((long)(((int)(i2))));
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$71528.x10$lang$Point$$init$S(t$111521, t$111522, t$111523);
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return alloc$71528;
    }
    
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public static x10.lang.Point make(final int i0, final int i1, final int i2, final int i3) {
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$71529 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111524 = ((long)(((int)(i0))));
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111525 = ((long)(((int)(i1))));
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111526 = ((long)(((int)(i2))));
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111527 = ((long)(((int)(i3))));
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$71529.x10$lang$Point$$init$S(t$111524, t$111525, t$111526, t$111527);
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return alloc$71529;
    }
    
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public static x10.lang.Point make(final long i0) {
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$71530 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$71530.x10$lang$Point$$init$S(((long)(i0)));
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return alloc$71530;
    }
    
    
    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public static x10.lang.Point make(final long i0, final long i1) {
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$71531 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$71531.x10$lang$Point$$init$S(((long)(i0)), ((long)(i1)));
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return alloc$71531;
    }
    
    
    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public static x10.lang.Point make(final long i0, final long i1, final long i2) {
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$71532 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$71532.x10$lang$Point$$init$S(((long)(i0)), ((long)(i1)), ((long)(i2)));
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return alloc$71532;
    }
    
    
    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public static x10.lang.Point make(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$71533 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$71533.x10$lang$Point$$init$S(((long)(i0)), ((long)(i1)), ((long)(i2)), ((long)(i3)));
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return alloc$71533;
    }
    
    
    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public static x10.lang.Point $implicit_convert__0$1x10$lang$Long$2(final x10.core.Rail<x10.core.Long> r) {
        
        //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point t$111279 = ((x10.lang.Point)(x10.lang.Point.make__0$1x10$lang$Long$2(((x10.core.Rail)(r)))));
        
        //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111279;
    }
    
    
    //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public static x10.lang.Point $implicit_convert__0$1x10$lang$Int$2(final x10.core.Rail<x10.core.Int> r) {
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point t$111280 = ((x10.lang.Point)(x10.lang.Point.make__0$1x10$lang$Int$2(((x10.core.Rail)(r)))));
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111280;
    }
    
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public x10.lang.Point $plus() {
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return this;
    }
    
    
    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public x10.lang.Point $minus() {
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111283 = rank;
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.core.fun.Fun_0_1 t$111284 = ((x10.core.fun.Fun_0_1)(new x10.lang.Point.$Closure$152(this)));
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point t$111285 = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(t$111283), ((x10.core.fun.Fun_0_1)(t$111284)))));
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111285;
    }
    
    
    //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public x10.lang.Point $plus(final x10.lang.Point that) {
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111289 = rank;
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.core.fun.Fun_0_1 t$111290 = ((x10.core.fun.Fun_0_1)(new x10.lang.Point.$Closure$153(this, that)));
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point t$111291 = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(t$111289), ((x10.core.fun.Fun_0_1)(t$111290)))));
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111291;
    }
    
    
    //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public x10.lang.Point $minus(final x10.lang.Point that) {
        
        //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111295 = rank;
        
        //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.core.fun.Fun_0_1 t$111296 = ((x10.core.fun.Fun_0_1)(new x10.lang.Point.$Closure$154(this, that)));
        
        //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point t$111297 = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(t$111295), ((x10.core.fun.Fun_0_1)(t$111296)))));
        
        //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111297;
    }
    
    
    //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public x10.lang.Point $times(final x10.lang.Point that) {
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111301 = rank;
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.core.fun.Fun_0_1 t$111302 = ((x10.core.fun.Fun_0_1)(new x10.lang.Point.$Closure$155(this, that)));
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point t$111303 = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(t$111301), ((x10.core.fun.Fun_0_1)(t$111302)))));
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111303;
    }
    
    
    //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public x10.lang.Point $over(final x10.lang.Point that) {
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111307 = rank;
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.core.fun.Fun_0_1 t$111308 = ((x10.core.fun.Fun_0_1)(new x10.lang.Point.$Closure$156(this, that)));
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point t$111309 = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(t$111307), ((x10.core.fun.Fun_0_1)(t$111308)))));
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111309;
    }
    
    
    //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public x10.lang.Point $plus(final long c) {
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111312 = rank;
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.core.fun.Fun_0_1 t$111313 = ((x10.core.fun.Fun_0_1)(new x10.lang.Point.$Closure$157(this, c)));
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point t$111314 = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(t$111312), ((x10.core.fun.Fun_0_1)(t$111313)))));
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111314;
    }
    
    
    //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public x10.lang.Point $minus(final long c) {
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111317 = rank;
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.core.fun.Fun_0_1 t$111318 = ((x10.core.fun.Fun_0_1)(new x10.lang.Point.$Closure$158(this, c)));
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point t$111319 = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(t$111317), ((x10.core.fun.Fun_0_1)(t$111318)))));
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111319;
    }
    
    
    //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public x10.lang.Point $times(final long c) {
        
        //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111322 = rank;
        
        //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.core.fun.Fun_0_1 t$111323 = ((x10.core.fun.Fun_0_1)(new x10.lang.Point.$Closure$159(this, c)));
        
        //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point t$111324 = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(t$111322), ((x10.core.fun.Fun_0_1)(t$111323)))));
        
        //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111324;
    }
    
    
    //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public x10.lang.Point $over(final long c) {
        
        //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111327 = rank;
        
        //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.core.fun.Fun_0_1 t$111328 = ((x10.core.fun.Fun_0_1)(new x10.lang.Point.$Closure$160(this, c)));
        
        //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point t$111329 = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(t$111327), ((x10.core.fun.Fun_0_1)(t$111328)))));
        
        //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111329;
    }
    
    
    //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public x10.lang.Point $inv_plus(final long c) {
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111332 = rank;
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.core.fun.Fun_0_1 t$111333 = ((x10.core.fun.Fun_0_1)(new x10.lang.Point.$Closure$161(this, c)));
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point t$111334 = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(t$111332), ((x10.core.fun.Fun_0_1)(t$111333)))));
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111334;
    }
    
    
    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public x10.lang.Point $inv_minus(final long c) {
        
        //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111337 = rank;
        
        //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.core.fun.Fun_0_1 t$111338 = ((x10.core.fun.Fun_0_1)(new x10.lang.Point.$Closure$162(this, c)));
        
        //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point t$111339 = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(t$111337), ((x10.core.fun.Fun_0_1)(t$111338)))));
        
        //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111339;
    }
    
    
    //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public x10.lang.Point $inv_times(final long c) {
        
        //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111342 = rank;
        
        //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.core.fun.Fun_0_1 t$111343 = ((x10.core.fun.Fun_0_1)(new x10.lang.Point.$Closure$163(this, c)));
        
        //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point t$111344 = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(t$111342), ((x10.core.fun.Fun_0_1)(t$111343)))));
        
        //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111344;
    }
    
    
    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public x10.lang.Point $inv_over(final long c) {
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111347 = rank;
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.core.fun.Fun_0_1 t$111348 = ((x10.core.fun.Fun_0_1)(new x10.lang.Point.$Closure$164(this, c)));
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point t$111349 = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(t$111347), ((x10.core.fun.Fun_0_1)(t$111348)))));
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111349;
    }
    
    
    //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public int compareTo(final java.lang.Object that) {
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final boolean t$111352 = this.equals(((java.lang.Object)(that)));
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        int t$111353 =  0;
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        if (t$111352) {
            
            //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            t$111353 = 0;
        } else {
            
            //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111350 = this.$lt$O(((x10.lang.Point)(that)));
            
            //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            int t$111351 =  0;
            
            //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (t$111350) {
                
                //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                t$111351 = -1;
            } else {
                
                //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                t$111351 = 1;
            }
            
            //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            t$111353 = t$111351;
        }
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final int t$111354 = t$111353;
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111354;
    }
    
    
    //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public int hashCode() {
        
        //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        long hc = this.$apply$O((long)(0L));
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111538 = rank;
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$71535max$111539 = ((t$111538) - (((long)(1L))));
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        long i$111535 = 1L;
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        for (;
             true;
             ) {
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111536 = i$111535;
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111537 = ((t$111536) <= (((long)(i$71535max$111539))));
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (!(t$111537)) {
                
                //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                break;
            }
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long i$111532 = i$111535;
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111528 = hc;
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111529 = ((t$111528) * (((long)(17L))));
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111530 = this.$apply$O((long)(i$111532));
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111531 = ((t$111529) ^ (((long)(t$111530))));
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            hc = t$111531;
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111533 = i$111535;
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111534 = ((t$111533) + (((long)(1L))));
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            i$111535 = t$111534;
        }
        
        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111365 = hc;
        
        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final int t$111366 = ((int)(long)(((long)(t$111365))));
        
        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111366;
    }
    
    
    //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public boolean equals(final java.lang.Object other) {
        
        //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final boolean t$111367 = x10.lang.Point.$RTT.isInstance(other);
        
        //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final boolean t$111368 = !(t$111367);
        
        //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        if (t$111368) {
            
            //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return false;
        }
        
        //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point otherPoint = ((x10.lang.Point)(x10.rtt.Types.<x10.lang.Point> cast(other,x10.lang.Point.$RTT)));
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111369 = rank;
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111370 = otherPoint.rank;
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final boolean t$111371 = ((long) t$111369) != ((long) t$111370);
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        if (t$111371) {
            
            //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return false;
        }
        
        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111550 = rank;
        
        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$71553max$111551 = ((t$111550) - (((long)(1L))));
        
        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        long i$111547 = 0L;
        
        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        for (;
             true;
             ) {
            
            //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111548 = i$111547;
            
            //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111549 = ((t$111548) <= (((long)(i$71553max$111551))));
            
            //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (!(t$111549)) {
                
                //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                break;
            }
            
            //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long i$111544 = i$111547;
            
            //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111540 = this.$apply$O((long)(i$111544));
            
            //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111541 = otherPoint.$apply$O((long)(i$111544));
            
            //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111542 = ((long) t$111540) == ((long) t$111541);
            
            //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111543 = !(t$111542);
            
            //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (t$111543) {
                
                //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                return false;
            }
            
            //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111545 = i$111547;
            
            //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111546 = ((t$111545) + (((long)(1L))));
            
            //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            i$111547 = t$111546;
        }
        
        //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return true;
    }
    
    
    //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public boolean $lt$O(final x10.lang.Point that) {
        
        //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111562 = rank;
        
        //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$71571max$111563 = ((t$111562) - (((long)(2L))));
        
        //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        long i$111559 = 0L;
        
        //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        for (;
             true;
             ) {
            
            //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111560 = i$111559;
            
            //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111561 = ((t$111560) <= (((long)(i$71571max$111563))));
            
            //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (!(t$111561)) {
                
                //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                break;
            }
            
            //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long i$111556 = i$111559;
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long a$111552 = this.$apply$O((long)(i$111556));
            
            //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long b$111553 = that.$apply$O((long)(i$111556));
            
            //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111554 = ((a$111552) > (((long)(b$111553))));
            
            //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (t$111554) {
                
                //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                return false;
            }
            
            //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111555 = ((a$111552) < (((long)(b$111553))));
            
            //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (t$111555) {
                
                //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                return true;
            }
            
            //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111557 = i$111559;
            
            //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111558 = ((t$111557) + (((long)(1L))));
            
            //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            i$111559 = t$111558;
        }
        
        //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111390 = rank;
        
        //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111391 = ((t$111390) - (((long)(1L))));
        
        //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111394 = this.$apply$O((long)(t$111391));
        
        //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111392 = rank;
        
        //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111393 = ((t$111392) - (((long)(1L))));
        
        //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111395 = that.$apply$O((long)(t$111393));
        
        //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final boolean t$111396 = ((t$111394) < (((long)(t$111395))));
        
        //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111396;
    }
    
    
    //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public boolean $gt$O(final x10.lang.Point that) {
        
        //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111574 = rank;
        
        //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$71589max$111575 = ((t$111574) - (((long)(2L))));
        
        //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        long i$111571 = 0L;
        
        //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        for (;
             true;
             ) {
            
            //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111572 = i$111571;
            
            //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111573 = ((t$111572) <= (((long)(i$71589max$111575))));
            
            //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (!(t$111573)) {
                
                //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                break;
            }
            
            //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long i$111568 = i$111571;
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long a$111564 = this.$apply$O((long)(i$111568));
            
            //#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long b$111565 = that.$apply$O((long)(i$111568));
            
            //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111566 = ((a$111564) < (((long)(b$111565))));
            
            //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (t$111566) {
                
                //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                return false;
            }
            
            //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111567 = ((a$111564) > (((long)(b$111565))));
            
            //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (t$111567) {
                
                //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                return true;
            }
            
            //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111569 = i$111571;
            
            //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111570 = ((t$111569) + (((long)(1L))));
            
            //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            i$111571 = t$111570;
        }
        
        //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111405 = rank;
        
        //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111406 = ((t$111405) - (((long)(1L))));
        
        //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111409 = this.$apply$O((long)(t$111406));
        
        //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111407 = rank;
        
        //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111408 = ((t$111407) - (((long)(1L))));
        
        //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111410 = that.$apply$O((long)(t$111408));
        
        //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final boolean t$111411 = ((t$111409) > (((long)(t$111410))));
        
        //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111411;
    }
    
    
    //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public boolean $le$O(final x10.lang.Point that) {
        
        //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111586 = rank;
        
        //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$71607max$111587 = ((t$111586) - (((long)(2L))));
        
        //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        long i$111583 = 0L;
        
        //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        for (;
             true;
             ) {
            
            //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111584 = i$111583;
            
            //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111585 = ((t$111584) <= (((long)(i$71607max$111587))));
            
            //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (!(t$111585)) {
                
                //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                break;
            }
            
            //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long i$111580 = i$111583;
            
            //#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long a$111576 = this.$apply$O((long)(i$111580));
            
            //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long b$111577 = that.$apply$O((long)(i$111580));
            
            //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111578 = ((a$111576) > (((long)(b$111577))));
            
            //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (t$111578) {
                
                //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                return false;
            }
            
            //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111579 = ((a$111576) < (((long)(b$111577))));
            
            //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (t$111579) {
                
                //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                return true;
            }
            
            //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111581 = i$111583;
            
            //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111582 = ((t$111581) + (((long)(1L))));
            
            //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            i$111583 = t$111582;
        }
        
        //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111420 = rank;
        
        //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111421 = ((t$111420) - (((long)(1L))));
        
        //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111424 = this.$apply$O((long)(t$111421));
        
        //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111422 = rank;
        
        //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111423 = ((t$111422) - (((long)(1L))));
        
        //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111425 = that.$apply$O((long)(t$111423));
        
        //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final boolean t$111426 = ((t$111424) <= (((long)(t$111425))));
        
        //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111426;
    }
    
    
    //#line 336 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public boolean $ge$O(final x10.lang.Point that) {
        
        //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111598 = rank;
        
        //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$71625max$111599 = ((t$111598) - (((long)(2L))));
        
        //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        long i$111595 = 0L;
        
        //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        for (;
             true;
             ) {
            
            //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111596 = i$111595;
            
            //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111597 = ((t$111596) <= (((long)(i$71625max$111599))));
            
            //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (!(t$111597)) {
                
                //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                break;
            }
            
            //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long i$111592 = i$111595;
            
            //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long a$111588 = this.$apply$O((long)(i$111592));
            
            //#line 339 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long b$111589 = that.$apply$O((long)(i$111592));
            
            //#line 340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111590 = ((a$111588) < (((long)(b$111589))));
            
            //#line 340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (t$111590) {
                
                //#line 340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                return false;
            }
            
            //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111591 = ((a$111588) > (((long)(b$111589))));
            
            //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (t$111591) {
                
                //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                return true;
            }
            
            //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111593 = i$111595;
            
            //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111594 = ((t$111593) + (((long)(1L))));
            
            //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            i$111595 = t$111594;
        }
        
        //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111435 = rank;
        
        //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111436 = ((t$111435) - (((long)(1L))));
        
        //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111439 = this.$apply$O((long)(t$111436));
        
        //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111437 = rank;
        
        //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111438 = ((t$111437) - (((long)(1L))));
        
        //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111440 = that.$apply$O((long)(t$111438));
        
        //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final boolean t$111441 = ((t$111439) >= (((long)(t$111440))));
        
        //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111441;
    }
    
    
    //#line 349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    public java.lang.String toString() {
        
        //#line 350 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        java.lang.String s = "[";
        
        //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111442 = rank;
        
        //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final boolean t$111446 = ((t$111442) > (((long)(0L))));
        
        //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        if (t$111446) {
            
            //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final java.lang.String t$111443 = ((java.lang.String)(s));
            
            //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111444 = this.$apply$O((long)(0L));
            
            //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final java.lang.String t$111445 = ((t$111443) + ((x10.core.Long.$box(t$111444))));
            
            //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            s = ((java.lang.String)(t$111445));
        }
        
        //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long t$111610 = rank;
        
        //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$71643max$111611 = ((t$111610) - (((long)(1L))));
        
        //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        long i$111607 = 1L;
        
        //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        for (;
             true;
             ) {
            
            //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111608 = i$111607;
            
            //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final boolean t$111609 = ((t$111608) <= (((long)(i$71643max$111611))));
            
            //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (!(t$111609)) {
                
                //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                break;
            }
            
            //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long i$111604 = i$111607;
            
            //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final java.lang.String t$111600 = ((java.lang.String)(s));
            
            //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111601 = this.$apply$O((long)(i$111604));
            
            //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final java.lang.String t$111602 = ((",") + ((x10.core.Long.$box(t$111601))));
            
            //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final java.lang.String t$111603 = ((t$111600) + (t$111602));
            
            //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            s = ((java.lang.String)(t$111603));
            
            //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111605 = i$111607;
            
            //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111606 = ((t$111605) + (((long)(1L))));
            
            //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            i$111607 = t$111606;
        }
        
        //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final java.lang.String t$111457 = ((java.lang.String)(s));
        
        //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final java.lang.String t$111458 = ((t$111457) + ("]"));
        
        //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        s = ((java.lang.String)(t$111458));
        
        //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final java.lang.String t$111459 = ((java.lang.String)(s));
        
        //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return t$111459;
    }
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    final public x10.lang.Point x10$lang$Point$$this$x10$lang$Point() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return x10.lang.Point.this;
    }
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    final public void __fieldInitializers_x10_lang_Point() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$149 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$149> $RTT = 
            x10.rtt.StaticFunType.<$Closure$149> make($Closure$149.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Point.$Closure$149 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Point.$Closure$149 $_obj = new x10.lang.Point.$Closure$149((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            
        }
        
        // constructor just for allocation
        public $Closure$149(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111184 = this.out$$.$apply$O((long)(i));
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111184;
        }
        
        public x10.lang.Point out$$;
        
        public $Closure$149(final x10.lang.Point out$$) {
             {
                this.out$$ = out$$;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$150 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$150> $RTT = 
            x10.rtt.StaticFunType.<$Closure$150> make($Closure$150.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Point.$Closure$150 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.r = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Point.$Closure$150 $_obj = new x10.lang.Point.$Closure$150((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.r);
            
        }
        
        // constructor just for allocation
        public $Closure$150(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Int$2 {}
        
    
        
        public long $apply$O(final long i$111488) {
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final int t$111489 = ((int[])this.r.value)[(int)i$111488];
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111490 = ((long)(((int)(t$111489))));
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111490;
        }
        
        public x10.core.Rail<x10.core.Int> r;
        
        public $Closure$150(final x10.core.Rail<x10.core.Int> r, __0$1x10$lang$Int$2 $dummy) {
             {
                this.r = ((x10.core.Rail)(r));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$151 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$151> $RTT = 
            x10.rtt.StaticFunType.<$Closure$151> make($Closure$151.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Point.$Closure$151 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.init = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Point.$Closure$151 $_obj = new x10.lang.Point.$Closure$151((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.init);
            
        }
        
        // constructor just for allocation
        public $Closure$151(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Long$3x10$lang$Long$2 {}
        
    
        
        public long $apply$O(final long l$111515) {
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111516 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)this.init).$apply(x10.core.Long.$box(l$111515), x10.rtt.Types.LONG));
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111516;
        }
        
        public x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> init;
        
        public $Closure$151(final x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> init, __0$1x10$lang$Long$3x10$lang$Long$2 $dummy) {
             {
                this.init = ((x10.core.fun.Fun_0_1)(init));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$152 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$152> $RTT = 
            x10.rtt.StaticFunType.<$Closure$152> make($Closure$152.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Point.$Closure$152 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Point.$Closure$152 $_obj = new x10.lang.Point.$Closure$152((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            
        }
        
        // constructor just for allocation
        public $Closure$152(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111281 = this.out$$.$apply$O((long)(i));
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111282 = (-(t$111281));
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111282;
        }
        
        public x10.lang.Point out$$;
        
        public $Closure$152(final x10.lang.Point out$$) {
             {
                this.out$$ = out$$;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$153 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$153> $RTT = 
            x10.rtt.StaticFunType.<$Closure$153> make($Closure$153.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Point.$Closure$153 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.that = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Point.$Closure$153 $_obj = new x10.lang.Point.$Closure$153((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.that);
            
        }
        
        // constructor just for allocation
        public $Closure$153(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111286 = this.out$$.$apply$O((long)(i));
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111287 = this.that.$apply$O((long)(i));
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111288 = ((t$111286) + (((long)(t$111287))));
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111288;
        }
        
        public x10.lang.Point out$$;
        public x10.lang.Point that;
        
        public $Closure$153(final x10.lang.Point out$$, final x10.lang.Point that) {
             {
                this.out$$ = out$$;
                this.that = ((x10.lang.Point)(that));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$154 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$154> $RTT = 
            x10.rtt.StaticFunType.<$Closure$154> make($Closure$154.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Point.$Closure$154 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.that = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Point.$Closure$154 $_obj = new x10.lang.Point.$Closure$154((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.that);
            
        }
        
        // constructor just for allocation
        public $Closure$154(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111292 = this.out$$.$apply$O((long)(i));
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111293 = this.that.$apply$O((long)(i));
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111294 = ((t$111292) - (((long)(t$111293))));
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111294;
        }
        
        public x10.lang.Point out$$;
        public x10.lang.Point that;
        
        public $Closure$154(final x10.lang.Point out$$, final x10.lang.Point that) {
             {
                this.out$$ = out$$;
                this.that = ((x10.lang.Point)(that));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$155 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$155> $RTT = 
            x10.rtt.StaticFunType.<$Closure$155> make($Closure$155.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Point.$Closure$155 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.that = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Point.$Closure$155 $_obj = new x10.lang.Point.$Closure$155((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.that);
            
        }
        
        // constructor just for allocation
        public $Closure$155(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111298 = this.out$$.$apply$O((long)(i));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111299 = this.that.$apply$O((long)(i));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111300 = ((t$111298) * (((long)(t$111299))));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111300;
        }
        
        public x10.lang.Point out$$;
        public x10.lang.Point that;
        
        public $Closure$155(final x10.lang.Point out$$, final x10.lang.Point that) {
             {
                this.out$$ = out$$;
                this.that = ((x10.lang.Point)(that));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$156 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$156> $RTT = 
            x10.rtt.StaticFunType.<$Closure$156> make($Closure$156.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Point.$Closure$156 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.that = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Point.$Closure$156 $_obj = new x10.lang.Point.$Closure$156((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.that);
            
        }
        
        // constructor just for allocation
        public $Closure$156(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111304 = this.out$$.$apply$O((long)(i));
            
            //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111305 = this.that.$apply$O((long)(i));
            
            //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111306 = ((t$111304) / (((long)(t$111305))));
            
            //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111306;
        }
        
        public x10.lang.Point out$$;
        public x10.lang.Point that;
        
        public $Closure$156(final x10.lang.Point out$$, final x10.lang.Point that) {
             {
                this.out$$ = out$$;
                this.that = ((x10.lang.Point)(that));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$157 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$157> $RTT = 
            x10.rtt.StaticFunType.<$Closure$157> make($Closure$157.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Point.$Closure$157 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.c = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Point.$Closure$157 $_obj = new x10.lang.Point.$Closure$157((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.c);
            
        }
        
        // constructor just for allocation
        public $Closure$157(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111310 = this.out$$.$apply$O((long)(i));
            
            //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111311 = ((t$111310) + (((long)(this.c))));
            
            //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111311;
        }
        
        public x10.lang.Point out$$;
        public long c;
        
        public $Closure$157(final x10.lang.Point out$$, final long c) {
             {
                this.out$$ = out$$;
                this.c = c;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$158 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$158> $RTT = 
            x10.rtt.StaticFunType.<$Closure$158> make($Closure$158.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Point.$Closure$158 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.c = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Point.$Closure$158 $_obj = new x10.lang.Point.$Closure$158((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.c);
            
        }
        
        // constructor just for allocation
        public $Closure$158(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111315 = this.out$$.$apply$O((long)(i));
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111316 = ((t$111315) - (((long)(this.c))));
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111316;
        }
        
        public x10.lang.Point out$$;
        public long c;
        
        public $Closure$158(final x10.lang.Point out$$, final long c) {
             {
                this.out$$ = out$$;
                this.c = c;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$159 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$159> $RTT = 
            x10.rtt.StaticFunType.<$Closure$159> make($Closure$159.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Point.$Closure$159 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.c = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Point.$Closure$159 $_obj = new x10.lang.Point.$Closure$159((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.c);
            
        }
        
        // constructor just for allocation
        public $Closure$159(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111320 = this.out$$.$apply$O((long)(i));
            
            //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111321 = ((t$111320) * (((long)(this.c))));
            
            //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111321;
        }
        
        public x10.lang.Point out$$;
        public long c;
        
        public $Closure$159(final x10.lang.Point out$$, final long c) {
             {
                this.out$$ = out$$;
                this.c = c;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$160 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$160> $RTT = 
            x10.rtt.StaticFunType.<$Closure$160> make($Closure$160.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Point.$Closure$160 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.c = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Point.$Closure$160 $_obj = new x10.lang.Point.$Closure$160((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.c);
            
        }
        
        // constructor just for allocation
        public $Closure$160(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111325 = this.out$$.$apply$O((long)(i));
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111326 = ((t$111325) / (((long)(this.c))));
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111326;
        }
        
        public x10.lang.Point out$$;
        public long c;
        
        public $Closure$160(final x10.lang.Point out$$, final long c) {
             {
                this.out$$ = out$$;
                this.c = c;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$161 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$161> $RTT = 
            x10.rtt.StaticFunType.<$Closure$161> make($Closure$161.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Point.$Closure$161 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.c = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Point.$Closure$161 $_obj = new x10.lang.Point.$Closure$161((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.c);
            
        }
        
        // constructor just for allocation
        public $Closure$161(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111330 = this.out$$.$apply$O((long)(i));
            
            //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111331 = ((this.c) + (((long)(t$111330))));
            
            //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111331;
        }
        
        public x10.lang.Point out$$;
        public long c;
        
        public $Closure$161(final x10.lang.Point out$$, final long c) {
             {
                this.out$$ = out$$;
                this.c = c;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$162 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$162> $RTT = 
            x10.rtt.StaticFunType.<$Closure$162> make($Closure$162.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Point.$Closure$162 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.c = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Point.$Closure$162 $_obj = new x10.lang.Point.$Closure$162((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.c);
            
        }
        
        // constructor just for allocation
        public $Closure$162(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111335 = this.out$$.$apply$O((long)(i));
            
            //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111336 = ((this.c) - (((long)(t$111335))));
            
            //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111336;
        }
        
        public x10.lang.Point out$$;
        public long c;
        
        public $Closure$162(final x10.lang.Point out$$, final long c) {
             {
                this.out$$ = out$$;
                this.c = c;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$163 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$163> $RTT = 
            x10.rtt.StaticFunType.<$Closure$163> make($Closure$163.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Point.$Closure$163 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.c = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Point.$Closure$163 $_obj = new x10.lang.Point.$Closure$163((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.c);
            
        }
        
        // constructor just for allocation
        public $Closure$163(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111340 = this.out$$.$apply$O((long)(i));
            
            //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111341 = ((this.c) * (((long)(t$111340))));
            
            //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111341;
        }
        
        public x10.lang.Point out$$;
        public long c;
        
        public $Closure$163(final x10.lang.Point out$$, final long c) {
             {
                this.out$$ = out$$;
                this.c = c;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$164 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$164> $RTT = 
            x10.rtt.StaticFunType.<$Closure$164> make($Closure$164.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Point.$Closure$164 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.c = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Point.$Closure$164 $_obj = new x10.lang.Point.$Closure$164((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.c);
            
        }
        
        // constructor just for allocation
        public $Closure$164(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111345 = this.out$$.$apply$O((long)(i));
            
            //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long t$111346 = ((this.c) / (((long)(t$111345))));
            
            //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            return t$111346;
        }
        
        public x10.lang.Point out$$;
        public long c;
        
        public $Closure$164(final x10.lang.Point out$$, final long c) {
             {
                this.out$$ = out$$;
                this.c = c;
            }
        }
        
    }
    
}


