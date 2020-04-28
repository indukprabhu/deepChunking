package x10.lang;


@x10.runtime.impl.java.X10Generated
final public class Unsafe extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Unsafe> $RTT = 
        x10.rtt.NamedType.<Unsafe> make("x10.lang.Unsafe",
                                        Unsafe.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Unsafe $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.Unsafe $_obj = new x10.lang.Unsafe((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Unsafe(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
    public static <$T>x10.core.Rail allocRailUninitialized(final x10.rtt.Type $T, final long size) {
        try {
            return x10.core.Rail.<$T>makeUnsafe($T, size, false);
        }
        catch (java.lang.Throwable exc$146439) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146439);
        }
        
    }
    
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
    public static <$T>x10.core.Rail allocRailZeroed(final x10.rtt.Type $T, final long size) {
        try {
            return x10.core.Rail.<$T>makeUnsafe($T, size, true);
        }
        catch (java.lang.Throwable exc$146440) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146440);
        }
        
    }
    
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
    public static <$T>void clearRail__0$1x10$lang$Unsafe$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> x) {
        try {
            (x).clear();
        }
        catch (java.lang.Throwable exc$146441) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146441);
        }
        
    }
    
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
    public static <$T>void clearRail__0$1x10$lang$Unsafe$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> x, final long start, final long numElems) {
        try {
            (x).clear(start, numElems);
        }
        catch (java.lang.Throwable exc$146442) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146442);
        }
        
    }
    
    
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
    public static <$T>$T uncheckedRailApply__0$1x10$lang$Unsafe$$T$2$G(final x10.rtt.Type $T, final x10.core.Rail<$T> r, final long i) {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final $T t$114697 = (($T)(((x10.core.Rail<$T>)r).$apply$G((long)(i))));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        return t$114697;
    }
    
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
    public static <$T>$T uncheckedRailSet__0$1x10$lang$Unsafe$$T$2__2x10$lang$Unsafe$$T$G(final x10.rtt.Type $T, final x10.core.Rail<$T> r, final long i, final $T v) {
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        ((x10.core.Rail<$T>)r).$set__1x10$lang$Rail$$T$G((long)(i), (($T)(v)));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        return v;
    }
    
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
    public static <$T>void dealloc__0x10$lang$Unsafe$$T(final x10.rtt.Type $T, final $T o) {
        
    }
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
    private static <$T>x10.core.Rail getCongruentSibling__0$1x10$lang$Unsafe$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> r, final long dst) {
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final java.lang.UnsupportedOperationException t$114698 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException("Congruent memory not available on Managed X10")));
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        throw t$114698;
    }
    
    public static <$T>x10.core.Rail getCongruentSibling$P__0$1x10$lang$Unsafe$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> r, final long dst) {
        return x10.lang.Unsafe.<$T> getCongruentSibling__0$1x10$lang$Unsafe$$T$2($T, ((x10.core.Rail)(r)), (long)(dst));
    }
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
    private static <$T>x10.core.GlobalRef fabricateGlobalRef__0x10$lang$Unsafe$$T(final x10.rtt.Type $T, final $T t, final x10.lang.Place p) {
        try {
            return null;
        }
        catch (java.lang.Throwable exc$146443) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146443);
        }
        
    }
    
    
    public static <$T>x10.core.GlobalRef fabricateGlobalRef$P__0x10$lang$Unsafe$$T(final x10.rtt.Type $T, final $T t, final x10.lang.Place p) {
        return null;
    }
    
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
    public static <$T>x10.lang.GlobalRail getCongruentSibling__0$1x10$lang$Unsafe$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> r, final x10.lang.Place dst) {
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final long t$114699 = dst.id;
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail remoteRail = ((x10.core.Rail)(x10.lang.Unsafe.<$T> getCongruentSibling__0$1x10$lang$Unsafe$$T$2($T, ((x10.core.Rail)(r)), (long)(t$114699))));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.GlobalRef globalRef = ((x10.core.GlobalRef)(null));
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.lang.GlobalRail globalRail = ((x10.lang.GlobalRail)(new x10.lang.GlobalRail<$T>((java.lang.System[]) null, $T)));
        
        //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final long size$114689 = ((x10.core.Rail<$T>)r).size;
        
        //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.core.GlobalRef raw$114690 = ((x10.core.GlobalRef)(globalRef));
        
        //#line 61 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        ((x10.lang.GlobalRail<$T>)globalRail).size = size$114689;
        
        //#line 61 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        ((x10.lang.GlobalRail<$T>)globalRail).rail = raw$114690;
        {
            
        }
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        return globalRail;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
    final public x10.lang.Unsafe x10$lang$Unsafe$$this$x10$lang$Unsafe() {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        return x10.lang.Unsafe.this;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
    // creation method for java code (1-phase java constructor)
    public Unsafe() {
        this((java.lang.System[]) null);
        x10$lang$Unsafe$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.lang.Unsafe x10$lang$Unsafe$$init$S() {
         {
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
            final x10.lang.Unsafe this$114694 = this;
        }
        return this;
    }
    
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
    final public void __fieldInitializers_x10_lang_Unsafe() {
        
    }
}

