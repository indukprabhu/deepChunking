package x10.lang;


@x10.runtime.impl.java.X10Generated
final public class Configuration extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Configuration> $RTT = 
        x10.rtt.NamedType.<Configuration> make("x10.lang.Configuration",
                                               Configuration.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Configuration $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.Configuration $_obj = new x10.lang.Configuration((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Configuration(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    final private static int PLATFORM_MAX_THREADS = java.lang.Integer.MAX_VALUE;
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    final private static boolean DEFAULT_STATIC_THREADS = false;
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    final private static int AVAILABLE_PROCESSORS = 1;
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    public static x10.util.HashMap loadEnv() {
        try {
            return x10.runtime.impl.java.Runtime.loadenv();
        }
        catch (java.lang.Throwable exc$146351) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146351);
        }
        
    }
    
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    public static boolean envOrElse$O(final java.lang.String s, final boolean b) {
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final x10.util.HashMap t$97639 = ((x10.util.HashMap)(x10.lang.Runtime.get$env()));
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final java.lang.String v = ((x10.util.HashMap<java.lang.String, java.lang.String>)t$97639).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(s)), ((java.lang.String)(null)));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final boolean t$97640 = ((v) == (null));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        if (t$97640) {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            return b;
        }
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        boolean t$97641 = (v).equalsIgnoreCase("false");
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        if (!(t$97641)) {
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            t$97641 = (v).equalsIgnoreCase("f");
        }
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        boolean t$97642 = t$97641;
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        if (!(t$97642)) {
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            t$97642 = (v).equals("0");
        }
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final boolean t$97643 = t$97642;
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final boolean t$97644 = !(t$97643);
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        return t$97644;
    }
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    public static boolean strict_finish$O() {
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final boolean t$97645 = x10.lang.Configuration.envOrElse$O(((java.lang.String)("X10_STRICT_FINISH")), (boolean)(false));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        return t$97645;
    }
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    public static boolean static_threads$O() {
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final boolean t$97646 = x10.lang.Configuration.DEFAULT_STATIC_THREADS;
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final boolean t$97647 = x10.lang.Configuration.envOrElse$O(((java.lang.String)("X10_STATIC_THREADS")), (boolean)(t$97646));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        return t$97647;
    }
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    public static boolean warn_on_thread_creation$O() {
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final boolean t$97648 = x10.lang.Configuration.envOrElse$O(((java.lang.String)("X10_WARN_ON_THREAD_CREATION")), (boolean)(false));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        return t$97648;
    }
    
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    public static boolean busy_waiting$O() {
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final boolean t$97649 = x10.lang.Configuration.envOrElse$O(((java.lang.String)("X10_BUSY_WAITING")), (boolean)(false));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        return t$97649;
    }
    
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    public static int nthreads$O() {
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        int v = 0;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        try {{
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            final x10.util.HashMap t$97650 = ((x10.util.HashMap)(x10.lang.Runtime.get$env()));
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            final java.lang.String t$97651 = ((x10.util.HashMap<java.lang.String, java.lang.String>)t$97650).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)("X10_NTHREADS")), ((java.lang.String)("1")));
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            final int t$97652 = java.lang.Integer.parseInt(t$97651);
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            v = t$97652;
        }}catch (final java.lang.NumberFormatException id$69) {
            
        }
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final int t$97653 = v;
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final long t$97654 = ((long)(((int)(t$97653))));
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final boolean t$97656 = ((t$97654) <= (((long)(0L))));
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        if (t$97656) {
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            final int t$97655 = java.lang.Runtime.getRuntime().availableProcessors();
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            v = t$97655;
        }
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final int t$97657 = v;
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final int t$97658 = x10.lang.Configuration.PLATFORM_MAX_THREADS;
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final boolean t$97660 = ((t$97657) > (((int)(t$97658))));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        if (t$97660) {
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            final int t$97659 = x10.lang.Configuration.PLATFORM_MAX_THREADS;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            v = t$97659;
        }
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final int t$97661 = v;
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        return t$97661;
    }
    
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    public static double deltaCustom$O() {
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        double v = 0.01;
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final x10.util.HashMap t$97662 = ((x10.util.HashMap)(x10.lang.Runtime.get$env()));
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final java.lang.String t$97663 = ((x10.util.HashMap<java.lang.String, java.lang.String>)t$97662).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)("CHUNK_DELTA")), ((java.lang.String)("0.1")));
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final double t$97664 = java.lang.Double.parseDouble(t$97663);
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        v = t$97664;
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final double t$97665 = v;
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        return t$97665;
    }
    
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    public static int max_threads$O() {
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        int v = 0;
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        try {{
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            final x10.util.HashMap t$97666 = ((x10.util.HashMap)(x10.lang.Runtime.get$env()));
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            final java.lang.String t$97667 = ((x10.util.HashMap<java.lang.String, java.lang.String>)t$97666).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)("X10_MAX_THREADS")), ((java.lang.String)("0")));
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            final int t$97668 = java.lang.Integer.parseInt(t$97667);
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            v = t$97668;
        }}catch (final java.lang.NumberFormatException id$70) {
            
        }
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final int t$97669 = v;
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final long t$97670 = ((long)(((int)(t$97669))));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final boolean t$97672 = ((t$97670) <= (((long)(0L))));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        if (t$97672) {
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            final int t$97671 = x10.lang.Configuration.nthreads$O();
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            v = t$97671;
        }
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final boolean t$97673 = x10.lang.Configuration.DEFAULT_STATIC_THREADS;
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final boolean t$97674 = x10.lang.Configuration.envOrElse$O(((java.lang.String)("X10_STATIC_THREADS")), (boolean)(t$97673));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        boolean t$97677 = !(t$97674);
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        if (t$97677) {
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            final int t$97675 = v;
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            final long t$97676 = ((long)(((int)(t$97675))));
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            t$97677 = ((t$97676) < (((long)(1000L))));
        }
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final boolean t$97678 = t$97677;
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        if (t$97678) {
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            v = 1000;
        }
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final int t$97679 = v;
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final int t$97680 = x10.lang.Configuration.PLATFORM_MAX_THREADS;
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final boolean t$97682 = ((t$97679) > (((int)(t$97680))));
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        if (t$97682) {
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            final int t$97681 = x10.lang.Configuration.PLATFORM_MAX_THREADS;
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            v = t$97681;
        }
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final int t$97683 = v;
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        return t$97683;
    }
    
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    final public static int RESILIENT_MODE_NONE = 0;
    
    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    final public static int RESILIENT_MODE_PLACE_ZERO = 1;
    
    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    final public static int RESILIENT_MODE_DISTRIBUTED = 2;
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    final public static int RESILIENT_MODE_ZOO_KEEPER = 3;
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    final public static int RESILIENT_MODE_SAMPLE = 9;
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    final public static int RESILIENT_MODE_PLACE0 = 11;
    
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    public static int resilient_mode$O() {
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        int v = 0;
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        try {{
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            final x10.util.HashMap t$97684 = ((x10.util.HashMap)(x10.lang.Runtime.get$env()));
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            final java.lang.String t$97685 = ((x10.util.HashMap<java.lang.String, java.lang.String>)t$97684).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)("X10_RESILIENT_MODE")), ((java.lang.String)("0")));
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            final int t$97686 = java.lang.Integer.parseInt(t$97685);
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            v = t$97686;
        }}catch (final java.lang.NumberFormatException id$71) {
            
        }
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        final int t$97687 = v;
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        return t$97687;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    final public x10.lang.Configuration x10$lang$Configuration$$this$x10$lang$Configuration() {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        return x10.lang.Configuration.this;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    // creation method for java code (1-phase java constructor)
    public Configuration() {
        this((java.lang.System[]) null);
        x10$lang$Configuration$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.lang.Configuration x10$lang$Configuration$$init$S() {
         {
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
            final x10.lang.Configuration this$97636 = this;
        }
        return this;
    }
    
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    final public void __fieldInitializers_x10_lang_Configuration() {
        
    }
    
    public static int get$PLATFORM_MAX_THREADS() {
        return x10.lang.Configuration.PLATFORM_MAX_THREADS;
    }
    
    public static boolean get$DEFAULT_STATIC_THREADS() {
        return x10.lang.Configuration.DEFAULT_STATIC_THREADS;
    }
    
    public static int get$AVAILABLE_PROCESSORS() {
        return java.lang.Runtime.getRuntime().availableProcessors();
    }
    
    public static int get$RESILIENT_MODE_NONE() {
        return x10.lang.Configuration.RESILIENT_MODE_NONE;
    }
    
    public static int get$RESILIENT_MODE_PLACE_ZERO() {
        return x10.lang.Configuration.RESILIENT_MODE_PLACE_ZERO;
    }
    
    public static int get$RESILIENT_MODE_DISTRIBUTED() {
        return x10.lang.Configuration.RESILIENT_MODE_DISTRIBUTED;
    }
    
    public static int get$RESILIENT_MODE_ZOO_KEEPER() {
        return x10.lang.Configuration.RESILIENT_MODE_ZOO_KEEPER;
    }
    
    public static int get$RESILIENT_MODE_SAMPLE() {
        return x10.lang.Configuration.RESILIENT_MODE_SAMPLE;
    }
    
    public static int get$RESILIENT_MODE_PLACE0() {
        return x10.lang.Configuration.RESILIENT_MODE_PLACE0;
    }
}

