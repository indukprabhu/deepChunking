package x10.lang;


@x10.runtime.impl.java.X10Generated
public class System extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<System> $RTT = 
        x10.rtt.NamedType.<System> make("x10.lang.System",
                                        System.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.System $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.System $_obj = new x10.lang.System((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public System(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    // creation method for java code (1-phase java constructor)
    public System() {
        this((java.lang.System[]) null);
        x10$lang$System$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.lang.System x10$lang$System$$init$S() {
         {
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
            
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
            final x10.lang.System this$114622 = this;
        }
        return this;
    }
    
    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    public static long currentTimeMillis$O() {
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final long t$114633 = java.lang.System.currentTimeMillis();
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        return t$114633;
    }
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    public static long nanoTime$O() {
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final long t$114634 = java.lang.System.nanoTime();
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        return t$114634;
    }
    
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    public static void killHere() {
        try {
            java.lang.System.exit(1);
        }
        catch (java.lang.Throwable exc$146431) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146431);
        }
        
    }
    
    
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    public static void setExitCode(final int exitCode) {
        try {
            x10.runtime.impl.java.Runtime.setExitCode(exitCode);
        }
        catch (java.lang.Throwable exc$146432) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146432);
        }
        
    }
    
    
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    public static long heapSize$O() {
        try {
            return java.lang.Runtime.getRuntime().totalMemory();
        }
        catch (java.lang.Throwable exc$146433) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146433);
        }
        
    }
    
    
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    public static void gc() {
        try {
            java.lang.System.gc();
        }
        catch (java.lang.Throwable exc$146434) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146434);
        }
        
    }
    
    
    
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    public static x10.util.Map getenv() {
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final x10.util.HashMap t$114636 = ((x10.util.HashMap)(x10.lang.Runtime.get$env()));
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        return t$114636;
    }
    
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    public static java.lang.String getenv(final java.lang.String name) {
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final x10.util.HashMap t$114637 = ((x10.util.HashMap)(x10.lang.Runtime.get$env()));
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final java.lang.String t$114638 = ((x10.util.HashMap<java.lang.String, java.lang.String>)t$114637).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(name)), ((java.lang.String)(null)));
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        return t$114638;
    }
    
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    public static void setProperty(final java.lang.String p, final java.lang.String v) {
        try {
            java.lang.System.setProperty(p,v);
        }
        catch (java.lang.Throwable exc$146435) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146435);
        }
        
    }
    
    
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    public static <$T>java.lang.String typeName(final x10.rtt.Type $T) {
        try {
            return $T.typeName();
        }
        catch (java.lang.Throwable exc$146436) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146436);
        }
        
    }
    
    
    
    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    public static java.lang.String identityTypeName(final java.lang.Object o) {
        try {
            return x10.rtt.Types.typeName(o);
        }
        catch (java.lang.Throwable exc$146437) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146437);
        }
        
    }
    
    
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    public static int identityHashCode$O(final java.lang.Object o) {
        try {
            return java.lang.System.identityHashCode(o);
        }
        catch (java.lang.Throwable exc$146438) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146438);
        }
        
    }
    
    
    
    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    public static java.lang.String identityToString(final java.lang.Object o) {
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final java.lang.String t$114639 = x10.rtt.Types.typeName(o);
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final java.lang.String t$114641 = ((t$114639) + ("@"));
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final int t$114640 = java.lang.System.identityHashCode(o);
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final java.lang.String t$114642 = java.lang.Integer.toString(t$114640, 16);
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final java.lang.String t$114643 = ((t$114641) + (t$114642));
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        return t$114643;
    }
    
    
    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    public static boolean identityEquals$O(final java.lang.Object o1, final java.lang.Object o2) {
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final boolean t$114644 = x10.rtt.Equality.equalsequals((o1),(o2));
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        return t$114644;
    }
    
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    public static boolean sleep$O(final long millis) {
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        try {{
            
            //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$114654 = x10.lang.Runtime.get$STATIC_THREADS();
            
            //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$114655 = !(t$114654);
            
            //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$114655) {
                
                //#line 1540 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Pool t$114656 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                
                //#line 1540 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$114656.increase();
            }
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
            x10.core.Thread.sleep((long)(millis));
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$114657 = x10.lang.Runtime.get$STATIC_THREADS();
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$114658 = !(t$114657);
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$114658) {
                
                //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Pool t$114659 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                
                //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$114659.decrease((int)(1));
            }
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
            return true;
        }}catch (final x10.lang.InterruptedException e) {
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$114660 = x10.lang.Runtime.get$STATIC_THREADS();
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$114661 = !(t$114660);
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$114661) {
                
                //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Pool t$114662 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                
                //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$114662.decrease((int)(1));
            }
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
            return false;
        }
    }
    
    
    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    public static boolean threadSleep$O(final long millis) {
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        try {{
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
            x10.core.Thread.sleep((long)(millis));
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
            return true;
        }}catch (final x10.lang.InterruptedException e) {
            
            //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
            return false;
        }
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    final public x10.lang.System x10$lang$System$$this$x10$lang$System() {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        return x10.lang.System.this;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
    final public void __fieldInitializers_x10_lang_System() {
        
    }
}

