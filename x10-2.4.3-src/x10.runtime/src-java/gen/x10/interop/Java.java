package x10.interop;


@x10.runtime.impl.java.X10Generated
public class Java extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Java> $RTT = 
        x10.rtt.NamedType.<Java> make("x10.interop.Java",
                                      Java.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.interop.Java $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.interop.Java $_obj = new x10.interop.Java((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Java(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public Java() {
         {
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
            this.__fieldInitializers_x10_interop_Java();
        }
    }
    
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    ;
    
    
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static java.lang.Object newObject() {
        try {
            return new java.lang.Object();
        }
        catch (java.lang.Throwable exc$146310) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146310);
        }
        
    }
    
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static <$T>$T[] newArray(final x10.rtt.Type $T, final int d0) {
        try {
            return ($T[])$T.makeArray(d0);
        }
        catch (java.lang.Throwable exc$146311) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146311);
        }
        
    }
    
    
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static <$T>$T[][] newArray(final x10.rtt.Type $T, final int d0, final int d1) {
        try {
            return ($T[][])$T.makeArray(d0,d1);
        }
        catch (java.lang.Throwable exc$146312) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146312);
        }
        
    }
    
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static <$T>$T[][][] newArray(final x10.rtt.Type $T, final int d0, final int d1, final int d2) {
        try {
            return ($T[][][])$T.makeArray(d0,d1,d2);
        }
        catch (java.lang.Throwable exc$146313) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146313);
        }
        
    }
    
    
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static <$T>$T[][][][] newArray(final x10.rtt.Type $T, final int d0, final int d1, final int d2, final int d3) {
        try {
            return ($T[][][][])$T.makeArray(d0,d1,d2,d3);
        }
        catch (java.lang.Throwable exc$146314) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146314);
        }
        
    }
    
    
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static <$T>java.lang.Class javaClass(final x10.rtt.Type $T) {
        try {
            return $T.getJavaClass();
        }
        catch (java.lang.Throwable exc$146315) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146315);
        }
        
    }
    
    
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static <$T>void setStaticField(final x10.rtt.Type $T, final java.lang.String name, final java.lang.Object value) {
        try {
            do { try { $T.getJavaClass().getDeclaredField(name).set(null,value); } catch (java.lang.Exception e) { java.lang.RuntimeException re = (e instanceof java.lang.RuntimeException) ? ((java.lang.RuntimeException) e) : new x10.lang.WrappedThrowable(e); throw re; } } while (false);
        }
        catch (java.lang.Throwable exc$146316) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146316);
        }
        
    }
    
    
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static <$T>void setStaticField(final x10.rtt.Type $T, final java.lang.String name, final byte value) {
        try {
            do { try { $T.getJavaClass().getDeclaredField(name).setByte(null,value); } catch (java.lang.Exception e) { java.lang.RuntimeException re = (e instanceof java.lang.RuntimeException) ? ((java.lang.RuntimeException) e) : new x10.lang.WrappedThrowable(e); throw re; } } while (false);
        }
        catch (java.lang.Throwable exc$146317) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146317);
        }
        
    }
    
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static <$T>void setStaticField(final x10.rtt.Type $T, final java.lang.String name, final short value) {
        try {
            do { try { $T.getJavaClass().getDeclaredField(name).setShort(null,value); } catch (java.lang.Exception e) { java.lang.RuntimeException re = (e instanceof java.lang.RuntimeException) ? ((java.lang.RuntimeException) e) : new x10.lang.WrappedThrowable(e); throw re; } } while (false);
        }
        catch (java.lang.Throwable exc$146318) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146318);
        }
        
    }
    
    
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static <$T>void setStaticField(final x10.rtt.Type $T, final java.lang.String name, final int value) {
        try {
            do { try { $T.getJavaClass().getDeclaredField(name).setInt(null,value); } catch (java.lang.Exception e) { java.lang.RuntimeException re = (e instanceof java.lang.RuntimeException) ? ((java.lang.RuntimeException) e) : new x10.lang.WrappedThrowable(e); throw re; } } while (false);
        }
        catch (java.lang.Throwable exc$146319) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146319);
        }
        
    }
    
    
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static <$T>void setStaticField(final x10.rtt.Type $T, final java.lang.String name, final long value) {
        try {
            do { try { $T.getJavaClass().getDeclaredField(name).setLong(null,value); } catch (java.lang.Exception e) { java.lang.RuntimeException re = (e instanceof java.lang.RuntimeException) ? ((java.lang.RuntimeException) e) : new x10.lang.WrappedThrowable(e); throw re; } } while (false);
        }
        catch (java.lang.Throwable exc$146320) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146320);
        }
        
    }
    
    
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static <$T>void setStaticField(final x10.rtt.Type $T, final java.lang.String name, final float value) {
        try {
            do { try { $T.getJavaClass().getDeclaredField(name).setFloat(null,value); } catch (java.lang.Exception e) { java.lang.RuntimeException re = (e instanceof java.lang.RuntimeException) ? ((java.lang.RuntimeException) e) : new x10.lang.WrappedThrowable(e); throw re; } } while (false);
        }
        catch (java.lang.Throwable exc$146321) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146321);
        }
        
    }
    
    
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static <$T>void setStaticField(final x10.rtt.Type $T, final java.lang.String name, final double value) {
        try {
            do { try { $T.getJavaClass().getDeclaredField(name).setDouble(null,value); } catch (java.lang.Exception e) { java.lang.RuntimeException re = (e instanceof java.lang.RuntimeException) ? ((java.lang.RuntimeException) e) : new x10.lang.WrappedThrowable(e); throw re; } } while (false);
        }
        catch (java.lang.Throwable exc$146322) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146322);
        }
        
    }
    
    
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static <$T>void setStaticField(final x10.rtt.Type $T, final java.lang.String name, final char value) {
        try {
            do { try { $T.getJavaClass().getDeclaredField(name).setChar(null,value); } catch (java.lang.Exception e) { java.lang.RuntimeException re = (e instanceof java.lang.RuntimeException) ? ((java.lang.RuntimeException) e) : new x10.lang.WrappedThrowable(e); throw re; } } while (false);
        }
        catch (java.lang.Throwable exc$146323) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146323);
        }
        
    }
    
    
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static <$T>void setStaticField(final x10.rtt.Type $T, final java.lang.String name, final boolean value) {
        try {
            do { try { $T.getJavaClass().getDeclaredField(name).setBoolean(null,value); } catch (java.lang.Exception e) { java.lang.RuntimeException re = (e instanceof java.lang.RuntimeException) ? ((java.lang.RuntimeException) e) : new x10.lang.WrappedThrowable(e); throw re; } } while (false);
        }
        catch (java.lang.Throwable exc$146324) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146324);
        }
        
    }
    
    
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static java.lang.Class getClass(final java.lang.Object o) {
        try {
            return o.getClass();
        }
        catch (java.lang.Throwable exc$146325) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146325);
        }
        
    }
    
    
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static void throwException(final java.lang.Throwable e) {
        try {
            do { throw e; } while (false);
        }
        catch (java.lang.Throwable exc$146326) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146326);
        }
        
    }
    
    
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static java.lang.Boolean convert(final boolean b) {
        try {
            return java.lang.Boolean.valueOf(b);
        }
        catch (java.lang.Throwable exc$146327) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146327);
        }
        
    }
    
    
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static boolean convert$O(final java.lang.Boolean b) {
        try {
            return b.booleanValue();
        }
        catch (java.lang.Throwable exc$146328) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146328);
        }
        
    }
    
    
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static java.lang.Byte convert(final byte y) {
        try {
            return java.lang.Byte.valueOf(y);
        }
        catch (java.lang.Throwable exc$146329) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146329);
        }
        
    }
    
    
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static byte convert$O(final java.lang.Byte y) {
        try {
            return y.byteValue();
        }
        catch (java.lang.Throwable exc$146330) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146330);
        }
        
    }
    
    
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static java.lang.Short convert(final short s) {
        try {
            return java.lang.Short.valueOf(s);
        }
        catch (java.lang.Throwable exc$146331) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146331);
        }
        
    }
    
    
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static short convert$O(final java.lang.Short s) {
        try {
            return s.shortValue();
        }
        catch (java.lang.Throwable exc$146332) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146332);
        }
        
    }
    
    
    
    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static java.lang.Integer convert(final int i) {
        try {
            return java.lang.Integer.valueOf(i);
        }
        catch (java.lang.Throwable exc$146333) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146333);
        }
        
    }
    
    
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static int convert$O(final java.lang.Integer i) {
        try {
            return i.intValue();
        }
        catch (java.lang.Throwable exc$146334) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146334);
        }
        
    }
    
    
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static java.lang.Long convert(final long l) {
        try {
            return java.lang.Long.valueOf(l);
        }
        catch (java.lang.Throwable exc$146335) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146335);
        }
        
    }
    
    
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static long convert$O(final java.lang.Long l) {
        try {
            return l.longValue();
        }
        catch (java.lang.Throwable exc$146336) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146336);
        }
        
    }
    
    
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static java.lang.Float convert(final float f) {
        try {
            return java.lang.Float.valueOf(f);
        }
        catch (java.lang.Throwable exc$146337) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146337);
        }
        
    }
    
    
    
    //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static float convert$O(final java.lang.Float f) {
        try {
            return f.floatValue();
        }
        catch (java.lang.Throwable exc$146338) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146338);
        }
        
    }
    
    
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static java.lang.Double convert(final double d) {
        try {
            return java.lang.Double.valueOf(d);
        }
        catch (java.lang.Throwable exc$146339) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146339);
        }
        
    }
    
    
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static double convert$O(final java.lang.Double d) {
        try {
            return d.doubleValue();
        }
        catch (java.lang.Throwable exc$146340) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146340);
        }
        
    }
    
    
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static java.lang.Character convert(final char c) {
        try {
            return java.lang.Character.valueOf(c);
        }
        catch (java.lang.Throwable exc$146341) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146341);
        }
        
    }
    
    
    
    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static char convert$O(final java.lang.Character c) {
        try {
            return c.charValue();
        }
        catch (java.lang.Throwable exc$146342) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146342);
        }
        
    }
    
    
    
    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static <$T>$T[] convert__0$1x10$interop$Java$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> a) {
        try {
            return ($T[])a.getBackingArray();
        }
        catch (java.lang.Throwable exc$146343) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146343);
        }
        
    }
    
    
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static <$T>x10.core.Rail convert__0$1x10$interop$Java$$T$2(final x10.rtt.Type $T, final $T[] a) {
        try {
            return new x10.core.Rail($T, a.length, a);
        }
        catch (java.lang.Throwable exc$146344) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146344);
        }
        
    }
    
    
    
    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static byte[] serialize(final java.lang.Object a) {
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
        final x10.io.Serializer s = ((x10.io.Serializer)(new x10.io.Serializer()));
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
        s.writeAny(((java.lang.Object)(a)));
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
        final x10.core.Rail t$89975 = s.toRail();
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
        final byte[] t$89976 = (byte[])t$89975.getBackingArray();
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
        return t$89976;
    }
    
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    public static java.lang.Object deserialize__0$1x10$lang$Byte$2(final byte[] a) {
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
        final x10.core.Rail t$89977 = new x10.core.Rail(x10.rtt.Types.BYTE, a.length, a);
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
        final x10.io.Deserializer t$89978 = ((x10.io.Deserializer)(new x10.io.Deserializer(t$89977, (x10.io.Deserializer.__0$1x10$lang$Byte$2) null)));
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
        final java.lang.Object t$89979 = t$89978.readAny();
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
        return t$89979;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    final public x10.interop.Java x10$interop$Java$$this$x10$interop$Java() {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
        return x10.interop.Java.this;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/interop/Java.x10"
    final public void __fieldInitializers_x10_interop_Java() {
        
    }
}

