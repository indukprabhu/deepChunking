package x10.glb;

@x10.runtime.impl.java.X10Generated
public class GLBParameters extends x10.core.Struct implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<GLBParameters> $RTT = 
        x10.rtt.NamedStructType.<GLBParameters> make("x10.glb.GLBParameters",
                                                     GLBParameters.class,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.Types.STRUCT
                                                     });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.GLBParameters $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.n = $deserializer.readInt();
        $_obj.w = $deserializer.readInt();
        $_obj.l = $deserializer.readInt();
        $_obj.z = $deserializer.readInt();
        $_obj.m = $deserializer.readInt();
        $_obj.v = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.glb.GLBParameters $_obj = new x10.glb.GLBParameters((java.lang.System[]) null);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.n);
        $serializer.write(this.w);
        $serializer.write(this.l);
        $serializer.write(this.z);
        $serializer.write(this.m);
        $serializer.write(this.v);
        
    }
    
    // zero value constructor
    public GLBParameters(final java.lang.System $dummy) { this.n = 0; this.w = 0; this.l = 0; this.z = 0; this.m = 0; this.v = 0; }
    
    // constructor just for allocation
    public GLBParameters(final java.lang.System[] $dummy) {
        
    }
    
    
    // properties
    
    //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    public int n;
    
    //#line 7 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    public int w;
    
    //#line 8 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    public int l;
    
    //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    public int z;
    
    //#line 10 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    public int m;
    
    //#line 11 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    public int v;
    

    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    final public static int computeZ$O(final long p, final int l) {
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        int z0 = 1;
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        int zz = l;
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        while (true) {
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88461 = zz;
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final long t$88462 = ((long)(((int)(t$88461))));
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final boolean t$88467 = ((t$88462) < (((long)(p))));
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            if (!(t$88467)) {
                
                //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
                break;
            }
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88578 = z0;
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88579 = ((t$88578) + (((int)(1))));
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            z0 = t$88579;
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88580 = zz;
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88581 = ((t$88580) * (((int)(l))));
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            zz = t$88581;
        }
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88468 = z0;
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        return t$88468;
    }
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    private static x10.glb.GLBParameters Default;
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    /**
     * Show computation result.
     */
    final public static int SHOW_RESULT_FLAG = 1;
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    /**
     * Show work initialization, computation, result collection 
     */
    final public static int SHOW_TIMING_FLAG = 2;
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    /**
     * Show logs produced by each task frame, i.e., each
     * task frame's computation time, yield time etc
     */
    final public static int SHOW_TASKFRAME_LOG_FLAG = 4;
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    /**
     * Show GLB statistics 
     */
    final public static int SHOW_GLB_FLAG = 8;
    
    
    //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    final public java.lang.String typeName() {
        try {
            return x10.rtt.Types.typeName(this);
        }
        catch (java.lang.Throwable exc$146309) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146309);
        }
        
    }
    
    
    
    //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    final public java.lang.String toString() {
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final java.lang.String t$88469 = "struct x10.glb.GLBParameters: n=";
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88470 = this.n;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final java.lang.String t$88471 = ((t$88469) + ((x10.core.Int.$box(t$88470))));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final java.lang.String t$88472 = ((t$88471) + (" w="));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88473 = this.w;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final java.lang.String t$88474 = ((t$88472) + ((x10.core.Int.$box(t$88473))));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final java.lang.String t$88475 = ((t$88474) + (" l="));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88476 = this.l;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final java.lang.String t$88477 = ((t$88475) + ((x10.core.Int.$box(t$88476))));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final java.lang.String t$88478 = ((t$88477) + (" z="));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88479 = this.z;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final java.lang.String t$88480 = ((t$88478) + ((x10.core.Int.$box(t$88479))));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final java.lang.String t$88481 = ((t$88480) + (" m="));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88482 = this.m;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final java.lang.String t$88483 = ((t$88481) + ((x10.core.Int.$box(t$88482))));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final java.lang.String t$88484 = ((t$88483) + (" v="));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88485 = this.v;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final java.lang.String t$88486 = ((t$88484) + ((x10.core.Int.$box(t$88485))));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        return t$88486;
    }
    
    
    //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    final public int hashCode() {
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        int result = 1;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88487 = result;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88489 = ((8191) * (((int)(t$88487))));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88488 = this.n;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88490 = x10.rtt.Types.hashCode(t$88488);
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88491 = ((t$88489) + (((int)(t$88490))));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        result = t$88491;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88492 = result;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88494 = ((8191) * (((int)(t$88492))));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88493 = this.w;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88495 = x10.rtt.Types.hashCode(t$88493);
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88496 = ((t$88494) + (((int)(t$88495))));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        result = t$88496;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88497 = result;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88499 = ((8191) * (((int)(t$88497))));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88498 = this.l;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88500 = x10.rtt.Types.hashCode(t$88498);
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88501 = ((t$88499) + (((int)(t$88500))));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        result = t$88501;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88502 = result;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88504 = ((8191) * (((int)(t$88502))));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88503 = this.z;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88505 = x10.rtt.Types.hashCode(t$88503);
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88506 = ((t$88504) + (((int)(t$88505))));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        result = t$88506;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88507 = result;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88509 = ((8191) * (((int)(t$88507))));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88508 = this.m;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88510 = x10.rtt.Types.hashCode(t$88508);
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88511 = ((t$88509) + (((int)(t$88510))));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        result = t$88511;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88512 = result;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88514 = ((8191) * (((int)(t$88512))));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88513 = this.v;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88515 = x10.rtt.Types.hashCode(t$88513);
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88516 = ((t$88514) + (((int)(t$88515))));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        result = t$88516;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88517 = result;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        return t$88517;
    }
    
    
    //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    final public boolean equals(java.lang.Object other) {
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final java.lang.Object t$88518 = ((java.lang.Object)(other));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final boolean t$88519 = x10.glb.GLBParameters.$RTT.isInstance(t$88518);
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final boolean t$88520 = !(t$88519);
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        if (t$88520) {
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            return false;
        }
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final java.lang.Object t$88521 = ((java.lang.Object)(other));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final x10.glb.GLBParameters t$88522 = ((x10.glb.GLBParameters)x10.rtt.Types.asStruct(x10.glb.GLBParameters.$RTT,t$88521));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final boolean t$88523 = this.equals$O(((x10.glb.GLBParameters)(t$88522)));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        return t$88523;
    }
    
    
    //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    final public boolean equals$O(x10.glb.GLBParameters other) {
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88525 = this.n;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final x10.glb.GLBParameters t$88524 = ((x10.glb.GLBParameters)(other));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88526 = t$88524.n;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        boolean t$88530 = ((int) t$88525) == ((int) t$88526);
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        if (t$88530) {
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88528 = this.w;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final x10.glb.GLBParameters t$88527 = ((x10.glb.GLBParameters)(other));
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88529 = t$88527.w;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            t$88530 = ((int) t$88528) == ((int) t$88529);
        }
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        boolean t$88534 = t$88530;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        if (t$88534) {
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88532 = this.l;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final x10.glb.GLBParameters t$88531 = ((x10.glb.GLBParameters)(other));
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88533 = t$88531.l;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            t$88534 = ((int) t$88532) == ((int) t$88533);
        }
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        boolean t$88538 = t$88534;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        if (t$88538) {
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88536 = this.z;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final x10.glb.GLBParameters t$88535 = ((x10.glb.GLBParameters)(other));
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88537 = t$88535.z;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            t$88538 = ((int) t$88536) == ((int) t$88537);
        }
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        boolean t$88542 = t$88538;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        if (t$88542) {
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88540 = this.m;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final x10.glb.GLBParameters t$88539 = ((x10.glb.GLBParameters)(other));
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88541 = t$88539.m;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            t$88542 = ((int) t$88540) == ((int) t$88541);
        }
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        boolean t$88546 = t$88542;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        if (t$88546) {
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88544 = this.v;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final x10.glb.GLBParameters t$88543 = ((x10.glb.GLBParameters)(other));
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88545 = t$88543.v;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            t$88546 = ((int) t$88544) == ((int) t$88545);
        }
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final boolean t$88547 = t$88546;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        return t$88547;
    }
    
    
    //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    final public boolean _struct_equals$O(java.lang.Object other) {
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final java.lang.Object t$88548 = ((java.lang.Object)(other));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final boolean t$88549 = x10.glb.GLBParameters.$RTT.isInstance(t$88548);
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final boolean t$88550 = !(t$88549);
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        if (t$88550) {
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            return false;
        }
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final java.lang.Object t$88551 = ((java.lang.Object)(other));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final x10.glb.GLBParameters t$88552 = ((x10.glb.GLBParameters)x10.rtt.Types.asStruct(x10.glb.GLBParameters.$RTT,t$88551));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final boolean t$88553 = this._struct_equals$O(((x10.glb.GLBParameters)(t$88552)));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        return t$88553;
    }
    
    
    //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    final public boolean _struct_equals$O(x10.glb.GLBParameters other) {
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88555 = this.n;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final x10.glb.GLBParameters t$88554 = ((x10.glb.GLBParameters)(other));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final int t$88556 = t$88554.n;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        boolean t$88560 = ((int) t$88555) == ((int) t$88556);
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        if (t$88560) {
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88558 = this.w;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final x10.glb.GLBParameters t$88557 = ((x10.glb.GLBParameters)(other));
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88559 = t$88557.w;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            t$88560 = ((int) t$88558) == ((int) t$88559);
        }
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        boolean t$88564 = t$88560;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        if (t$88564) {
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88562 = this.l;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final x10.glb.GLBParameters t$88561 = ((x10.glb.GLBParameters)(other));
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88563 = t$88561.l;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            t$88564 = ((int) t$88562) == ((int) t$88563);
        }
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        boolean t$88568 = t$88564;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        if (t$88568) {
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88566 = this.z;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final x10.glb.GLBParameters t$88565 = ((x10.glb.GLBParameters)(other));
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88567 = t$88565.z;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            t$88568 = ((int) t$88566) == ((int) t$88567);
        }
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        boolean t$88572 = t$88568;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        if (t$88572) {
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88570 = this.m;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final x10.glb.GLBParameters t$88569 = ((x10.glb.GLBParameters)(other));
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88571 = t$88569.m;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            t$88572 = ((int) t$88570) == ((int) t$88571);
        }
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        boolean t$88576 = t$88572;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        if (t$88576) {
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88574 = this.v;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final x10.glb.GLBParameters t$88573 = ((x10.glb.GLBParameters)(other));
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final int t$88575 = t$88573.v;
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            t$88576 = ((int) t$88574) == ((int) t$88575);
        }
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        final boolean t$88577 = t$88576;
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        return t$88577;
    }
    
    
    //#line 5 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    final public x10.glb.GLBParameters x10$glb$GLBParameters$$this$x10$glb$GLBParameters() {
        
        //#line 5 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
        return x10.glb.GLBParameters.this;
    }
    
    
    //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    // creation method for java code (1-phase java constructor)
    public GLBParameters(final int n, final int w, final int l, final int z, final int m, final int v) {
        this((java.lang.System[]) null);
        x10$glb$GLBParameters$$init$S(n, w, l, z, m, v);
    }
    
    // constructor for non-virtual call
    final public x10.glb.GLBParameters x10$glb$GLBParameters$$init$S(final int n, final int w, final int l, final int z, final int m, final int v) {
         {
            
            //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            this.n = n;
            this.w = w;
            this.l = l;
            this.z = z;
            this.m = m;
            this.v = v;
            
            
            //#line 5 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
            final x10.glb.GLBParameters this$88458 = this;
        }
        return this;
    }
    
    
    
    //#line 5 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBParameters.x10"
    final public void __fieldInitializers_x10_glb_GLBParameters() {
        
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$Default = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$Default;
    
    public static x10.glb.GLBParameters get$Default() {
        if (((int) x10.glb.GLBParameters.initStatus$Default.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.glb.GLBParameters.Default;
        }
        if (((int) x10.glb.GLBParameters.initStatus$Default.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.glb.GLBParameters.exception$Default;
        }
        if (x10.glb.GLBParameters.initStatus$Default.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.glb.GLBParameters.Default = ((x10.glb.GLBParameters)(new x10.glb.GLBParameters((java.lang.System[]) null).x10$glb$GLBParameters$$init$S(((int)(100)), ((int)(4)), ((int)(4)), x10.glb.GLBParameters.computeZ$O((long)(x10.lang.Place.get$MAX_PLACES()), (int)(4)), ((int)(1024)), ((int)(15)))));
            }}catch (java.lang.Throwable exc$88582) {
                x10.glb.GLBParameters.exception$Default = new x10.lang.ExceptionInInitializer(exc$88582);
                x10.glb.GLBParameters.initStatus$Default.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.glb.GLBParameters.exception$Default;
            }
            x10.glb.GLBParameters.initStatus$Default.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.glb.GLBParameters.initStatus$Default.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.glb.GLBParameters.initStatus$Default.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.glb.GLBParameters.initStatus$Default.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.glb.GLBParameters.exception$Default;
                }
            }
        }
        return x10.glb.GLBParameters.Default;
    }
    
    public static int get$SHOW_RESULT_FLAG() {
        return x10.glb.GLBParameters.SHOW_RESULT_FLAG;
    }
    
    public static int get$SHOW_TIMING_FLAG() {
        return x10.glb.GLBParameters.SHOW_TIMING_FLAG;
    }
    
    public static int get$SHOW_TASKFRAME_LOG_FLAG() {
        return x10.glb.GLBParameters.SHOW_TASKFRAME_LOG_FLAG;
    }
    
    public static int get$SHOW_GLB_FLAG() {
        return x10.glb.GLBParameters.SHOW_GLB_FLAG;
    }
}

