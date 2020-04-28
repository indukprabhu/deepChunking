package x10.glb;


@x10.runtime.impl.java.X10Generated
final public class GLB<$Queue, $R> extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<GLB> $RTT = 
        x10.rtt.NamedType.<GLB> make("x10.glb.GLB",
                                     GLB.class,
                                     2);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
    
    public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.GLB<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
        $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
        $_obj.P = $deserializer.readLong();
        $_obj.plh = $deserializer.readObject();
        $_obj.setupTime = $deserializer.readLong();
        $_obj.crunchNumberTime = $deserializer.readLong();
        $_obj.collectResultTime = $deserializer.readLong();
        $_obj.rootGlbR = $deserializer.readObject();
        $_obj.glbParams = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.glb.GLB $_obj = new x10.glb.GLB((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$Queue);
        $serializer.write(this.$R);
        $serializer.write(this.P);
        $serializer.write(this.plh);
        $serializer.write(this.setupTime);
        $serializer.write(this.crunchNumberTime);
        $serializer.write(this.collectResultTime);
        $serializer.write(this.rootGlbR);
        $serializer.write(this.glbParams);
        
    }
    
    // constructor just for allocation
    public GLB(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
        x10.glb.GLB.$initParams(this, $Queue, $R);
        
    }
    
    private x10.rtt.Type $Queue;
    private x10.rtt.Type $R;
    
    // initializer of type parameters
    public static void $initParams(final GLB $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
        $this.$Queue = $Queue;
        $this.$R = $R;
        
    }
    // synthetic type for parameter mangling
    public static final class __0$1x10$glb$GLB$$Queue$2 {}
    

    
    //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    /**
	 * Number of places.
	 */
    public long P;
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    /**
	 * Home PlaceLocalHandle of {@link Worker}
	 */
    public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> plh;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    /**
	 * Workload initialization time.
	 */
    public long setupTime;
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    /**
	 * Computation time.
	 */
    public long crunchNumberTime;
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    /**
	 * Result collection time.
	 */
    public long collectResultTime;
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    /**
	 * {@link GLBResult at root. Used as a vehicle to collect results.}
	 */
    public x10.glb.GLBResult<$R> rootGlbR;
    
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    public static long min$O(final long i, final long j) {
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final boolean t$87928 = ((i) < (((long)(j))));
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        long t$87929 =  0;
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        if (t$87928) {
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            t$87929 = i;
        } else {
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            t$87929 = j;
        }
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final long t$87930 = t$87929;
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        return t$87930;
    }
    
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    /**
	 * GLB Parameters. {@link GLBParameters}
	 */
    public x10.glb.GLBParameters glbParams;
    
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    // creation method for java code (1-phase java constructor)
    public GLB(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.core.fun.Fun_0_0<$Queue> init, final x10.glb.GLBParameters glbParams, final boolean tree, __0$1x10$glb$GLB$$Queue$2 $dummy) {
        this((java.lang.System[]) null, $Queue, $R);
        x10$glb$GLB$$init$S(init, glbParams, tree, (x10.glb.GLB.__0$1x10$glb$GLB$$Queue$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.glb.GLB<$Queue, $R> x10$glb$GLB$$init$S(final x10.core.fun.Fun_0_0<$Queue> init, final x10.glb.GLBParameters glbParams, final boolean tree, __0$1x10$glb$GLB$$Queue$2 $dummy) {
         {
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            
            
            //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            this.__fieldInitializers_x10_glb_GLB();
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            ((x10.glb.GLB<$Queue, $R>)this).glbParams = ((x10.glb.GLBParameters)(glbParams));
            
            //#line 39 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
            final long t$87931 = java.lang.System.nanoTime();
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            ((x10.glb.GLB<$Queue, $R>)this).setupTime = t$87931;
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.lang.PlaceGroup.SimplePlaceGroup t$87937 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.core.fun.Fun_0_0 t$87938 = ((x10.core.fun.Fun_0_0)(new x10.glb.GLB.$Closure$24<$Queue, $R>($Queue, $R, glbParams, init, tree, (x10.glb.GLB.$Closure$24.__1$1x10$glb$GLB$$Closure$24$$Queue$2) null)));
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.lang.PlaceLocalHandle t$87939 = x10.lang.PlaceLocalHandle.<x10.glb.Worker<$Queue, $R>> makeFlat__1$1x10$lang$PlaceLocalHandle$$T$2(x10.rtt.ParameterizedType.make(x10.glb.Worker.$RTT, $Queue, $R), ((x10.lang.PlaceGroup)(t$87937)), ((x10.core.fun.Fun_0_0)(t$87938)));
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            ((x10.glb.GLB<$Queue, $R>)this).plh = ((x10.lang.PlaceLocalHandle)(t$87939));
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.lang.PlaceLocalHandle t$87940 = ((x10.lang.PlaceLocalHandle)(plh));
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            x10.glb.Worker.<$Queue, $R> initContexts__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2($Queue, $R, ((x10.lang.PlaceLocalHandle)(t$87940)));
            
            //#line 39 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
            final long t$87941 = java.lang.System.nanoTime();
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final long t$87942 = setupTime;
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final long t$87943 = ((t$87941) - (((long)(t$87942))));
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            ((x10.glb.GLB<$Queue, $R>)this).setupTime = t$87943;
        }
        return this;
    }
    
    
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    public $Queue taskQueue$G() {
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.lang.PlaceLocalHandle t$87944 = ((x10.lang.PlaceLocalHandle)(plh));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.glb.Worker t$87945 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)t$87944).$apply$G();
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final $Queue t$87946 = (($Queue)(((x10.glb.Worker<$Queue, $R>)t$87945).queue));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        return t$87946;
    }
    
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    public x10.core.Rail run(final x10.core.fun.VoidFun_0_0 start) {
        
        //#line 39 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final long t$87947 = java.lang.System.nanoTime();
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ((x10.glb.GLB<$Queue, $R>)this).crunchNumberTime = t$87947;
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.lang.PlaceLocalHandle t$87948 = ((x10.lang.PlaceLocalHandle)(plh));
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.glb.Worker t$87949 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)t$87948).$apply$G();
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.lang.PlaceLocalHandle t$87950 = ((x10.lang.PlaceLocalHandle)(plh));
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ((x10.glb.Worker<$Queue, $R>)t$87949).main__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(t$87950)), ((x10.core.fun.VoidFun_0_0)(start)));
        
        //#line 39 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final long t$87951 = java.lang.System.nanoTime();
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final long t$87952 = crunchNumberTime;
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final long t$87953 = ((t$87951) - (((long)(t$87952))));
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ((x10.glb.GLB<$Queue, $R>)this).crunchNumberTime = t$87953;
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.core.Rail r = ((x10.core.Rail<$R>)
                                  this.collectResults());
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        this.end__0$1x10$glb$GLB$$R$2(((x10.core.Rail)(r)));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        return r;
    }
    
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    public x10.core.Rail runParallel() {
        
        //#line 39 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final long t$87954 = java.lang.System.nanoTime();
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ((x10.glb.GLB<$Queue, $R>)this).crunchNumberTime = t$87954;
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.lang.PlaceLocalHandle t$87955 = ((x10.lang.PlaceLocalHandle)(plh));
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        x10.glb.Worker.<$Queue, $R> broadcast__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2($Queue, $R, ((x10.lang.PlaceLocalHandle)(t$87955)));
        
        //#line 39 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final long t$87956 = java.lang.System.nanoTime();
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final long t$87957 = crunchNumberTime;
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final long t$87958 = ((t$87956) - (((long)(t$87957))));
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ((x10.glb.GLB<$Queue, $R>)this).crunchNumberTime = t$87958;
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.core.Rail r = ((x10.core.Rail<$R>)
                                  this.collectResults());
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        this.end__0$1x10$glb$GLB$$R$2(((x10.core.Rail)(r)));
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        return r;
    }
    
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    private void end__0$1x10$glb$GLB$$R$2(final x10.core.Rail r) {
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.glb.GLBParameters t$87959 = ((x10.glb.GLBParameters)(glbParams));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final int t$87960 = t$87959.v;
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final int t$87961 = ((t$87960) & (((int)(1))));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final boolean t$87963 = ((int) t$87961) != ((int) 0);
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        if (t$87963) {
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.glb.GLBResult t$87962 = ((x10.glb.GLBResult)(rootGlbR));
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            ((x10.glb.GLBResult<$R>)t$87962).display__0$1x10$glb$GLBResult$$R$2(((x10.core.Rail)(r)));
        }
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.glb.GLBParameters t$87964 = ((x10.glb.GLBParameters)(glbParams));
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final int t$87965 = t$87964.v;
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final int t$87966 = ((t$87965) & (((int)(2))));
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final boolean t$87982 = ((int) t$87966) != ((int) 0);
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        if (t$87982) {
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.io.Printer t$87970 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final long t$87967 = setupTime;
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final double t$87968 = ((double)(long)(((long)(t$87967))));
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final double t$87969 = ((t$87968) / (((double)(1.0E9))));
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final java.lang.String t$87971 = (("Setup time(s):") + ((x10.core.Double.$box(t$87969))));
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            t$87970.println(((java.lang.Object)(t$87971)));
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.io.Printer t$87975 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final long t$87972 = crunchNumberTime;
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final double t$87973 = ((double)(long)(((long)(t$87972))));
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final double t$87974 = ((t$87973) / (((double)(1.0E9))));
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final java.lang.String t$87976 = (("Process time(s):") + ((x10.core.Double.$box(t$87974))));
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            t$87975.println(((java.lang.Object)(t$87976)));
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.io.Printer t$87980 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final long t$87977 = collectResultTime;
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final double t$87978 = ((double)(long)(((long)(t$87977))));
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final double t$87979 = ((t$87978) / (((double)(1.0E9))));
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final java.lang.String t$87981 = (("Result reduce time(s):") + ((x10.core.Double.$box(t$87979))));
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            t$87980.println(((java.lang.Object)(t$87981)));
        }
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.glb.GLBParameters t$87983 = ((x10.glb.GLBParameters)(glbParams));
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final int t$87984 = t$87983.v;
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final int t$87985 = ((t$87984) & (((int)(4))));
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final boolean t$87987 = ((int) t$87985) != ((int) 0);
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        if (t$87987) {
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.lang.PlaceLocalHandle t$87986 = ((x10.lang.PlaceLocalHandle)(plh));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            this.printLog__0$1x10$glb$Worker$1x10$glb$GLB$$Queue$3x10$glb$GLB$$R$2$2(((x10.lang.PlaceLocalHandle)(t$87986)));
        }
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.glb.GLBParameters t$87988 = ((x10.glb.GLBParameters)(glbParams));
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final int t$87989 = t$87988.v;
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final int t$87990 = ((t$87989) & (((int)(8))));
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final boolean t$87992 = ((int) t$87990) != ((int) 0);
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        if (t$87992) {
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.lang.PlaceLocalHandle t$87991 = ((x10.lang.PlaceLocalHandle)(plh));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            this.collectLifelineStatus__0$1x10$glb$Worker$1x10$glb$GLB$$Queue$3x10$glb$GLB$$R$2$2(((x10.lang.PlaceLocalHandle)(t$87991)));
        }
    }
    
    public static <$Queue, $R>void end$P__0$1x10$glb$GLB$$R$2__1$1x10$glb$GLB$$Queue$3x10$glb$GLB$$R$2(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.core.Rail<$R> r, final x10.glb.GLB<$Queue, $R> GLB) {
        ((x10.glb.GLB<$Queue, $R>)GLB).end__0$1x10$glb$GLB$$R$2(((x10.core.Rail)(r)));
    }
    
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    private void collectLifelineStatus__0$1x10$glb$Worker$1x10$glb$GLB$$Queue$3x10$glb$GLB$$R$2$2(final x10.lang.PlaceLocalHandle st) {
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.core.Rail logs;
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final long t$87993 = P;
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final boolean t$88004 = ((t$87993) >= (((long)(1024L))));
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        if (t$88004) {
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final long t$87994 = P;
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final long t$87998 = ((t$87994) / (((long)(32L))));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.core.fun.Fun_0_1 t$87999 = ((x10.core.fun.Fun_0_1)(new x10.glb.GLB.$Closure$28<$Queue, $R>($Queue, $R, ((x10.glb.GLB<$Queue, $R>)(this)), this.P, st, (x10.glb.GLB.$Closure$28.__0$1x10$glb$GLB$$Closure$28$$Queue$3x10$glb$GLB$$Closure$28$$R$2__2$1x10$glb$Worker$1x10$glb$GLB$$Closure$28$$Queue$3x10$glb$GLB$$Closure$28$$R$2$2) null)));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.core.Rail t$88000 = ((x10.core.Rail)(new x10.core.Rail<x10.glb.Logger>(x10.glb.Logger.$RTT, t$87998, ((x10.core.fun.Fun_0_1)(t$87999)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            logs = ((x10.core.Rail)(t$88000));
        } else {
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final long t$88001 = P;
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.core.fun.Fun_0_1 t$88002 = ((x10.core.fun.Fun_0_1)(new x10.glb.GLB.$Closure$30<$Queue, $R>($Queue, $R, ((x10.glb.GLB<$Queue, $R>)(this)), st, (x10.glb.GLB.$Closure$30.__0$1x10$glb$GLB$$Closure$30$$Queue$3x10$glb$GLB$$Closure$30$$R$2__1$1x10$glb$Worker$1x10$glb$GLB$$Closure$30$$Queue$3x10$glb$GLB$$Closure$30$$R$2$2) null)));
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.core.Rail t$88003 = ((x10.core.Rail)(new x10.core.Rail<x10.glb.Logger>(x10.glb.Logger.$RTT, ((long)(t$88001)), ((x10.core.fun.Fun_0_1)(t$88002)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            logs = ((x10.core.Rail)(t$88003));
        }
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.glb.Logger log = ((x10.glb.Logger)(new x10.glb.Logger((java.lang.System[]) null)));
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        log.x10$glb$Logger$$init$S(((boolean)(false)));
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        log.collect__0$1x10$glb$Logger$2(((x10.core.Rail)(logs)));
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        log.stats();
    }
    
    public static <$Queue, $R>void collectLifelineStatus$P__0$1x10$glb$Worker$1x10$glb$GLB$$Queue$3x10$glb$GLB$$R$2$2__1$1x10$glb$GLB$$Queue$3x10$glb$GLB$$R$2(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, final x10.glb.GLB<$Queue, $R> GLB) {
        ((x10.glb.GLB<$Queue, $R>)GLB).collectLifelineStatus__0$1x10$glb$Worker$1x10$glb$GLB$$Queue$3x10$glb$GLB$$R$2$2(((x10.lang.PlaceLocalHandle)(st)));
    }
    
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    public x10.core.Rail collectResults() {
        
        //#line 39 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final long t$88005 = java.lang.System.nanoTime();
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ((x10.glb.GLB<$Queue, $R>)this).collectResultTime = t$88005;
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.lang.PlaceLocalHandle t$88006 = ((x10.lang.PlaceLocalHandle)(plh));
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.glb.Worker t$88007 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)t$88006).$apply$G();
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final $Queue t$88008 = (($Queue)(((x10.glb.Worker<$Queue, $R>)t$88007).queue));
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.glb.GLBResult t$88009 = ((x10.glb.GLBResult<$R>)
                                            ((x10.glb.TaskQueue<$Queue, $R>)x10.rtt.Types.conversion(x10.rtt.ParameterizedType.make(x10.glb.TaskQueue.$RTT, $Queue, $R),t$88008)).getResult());
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ((x10.glb.GLB<$Queue, $R>)this).rootGlbR = ((x10.glb.GLBResult)(t$88009));
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.glb.GLBResult t$88010 = ((x10.glb.GLBResult)(rootGlbR));
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.core.GlobalRef resultGlobal = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.glb.GLBResult<$R>>(x10.rtt.ParameterizedType.make(x10.glb.GLBResult.$RTT, $R), t$88010, (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.glb.GLBResult t$88011 = ((x10.glb.GLBResult)(rootGlbR));
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.core.Rail tmpRail = ((x10.core.Rail<$R>)
                                        ((x10.glb.GLBResult<$R>)t$88011).submitResult());
        
        //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.lang.PlaceLocalHandle tmpPlh = ((x10.lang.PlaceLocalHandle)(plh));
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.lang.PlaceGroup.SimplePlaceGroup t$88032 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.core.fun.VoidFun_0_0 t$88033 = ((x10.core.fun.VoidFun_0_0)(new x10.glb.GLB.$Closure$31<$Queue, $R>($Queue, $R, resultGlobal, tmpPlh, (x10.glb.GLB.$Closure$31.__0$1x10$glb$GLBResult$1x10$glb$GLB$$Closure$31$$R$2$2__1$1x10$glb$Worker$1x10$glb$GLB$$Closure$31$$Queue$3x10$glb$GLB$$Closure$31$$R$2$2) null)));
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        t$88032.broadcastFlat(((x10.core.fun.VoidFun_0_0)(t$88033)));
        
        //#line 39 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final long t$88034 = java.lang.System.nanoTime();
        
        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final long t$88035 = collectResultTime;
        
        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final long t$88036 = ((t$88034) - (((long)(t$88035))));
        
        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ((x10.glb.GLB<$Queue, $R>)this).collectResultTime = t$88036;
        
        //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        return tmpRail;
    }
    
    
    //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    private void printLog__0$1x10$glb$Worker$1x10$glb$GLB$$Queue$3x10$glb$GLB$$R$2$2(final x10.lang.PlaceLocalHandle st) {
        
        //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final long P = x10.lang.Place.get$MAX_PLACES();
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        long i$88058 = 0L;
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        for (;
             true;
             ) {
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final long t$88059 = i$88058;
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final boolean t$88060 = ((t$88059) < (((long)(P))));
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            if (!(t$88060)) {
                
                //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                break;
            }
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.lang.Place alloc$88053 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final long t$88052 = i$88058;
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            alloc$88053.x10$lang$Place$$init$S(t$88052);
            {
                
                //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                x10.lang.Runtime.runAt(((x10.lang.Place)(alloc$88053)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.GLB.$Closure$32<$Queue, $R>($Queue, $R, st, (x10.glb.GLB.$Closure$32.__0$1x10$glb$Worker$1x10$glb$GLB$$Closure$32$$Queue$3x10$glb$GLB$$Closure$32$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
            }
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final long t$88056 = i$88058;
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final long t$88057 = ((t$88056) + (((long)(1L))));
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            i$88058 = t$88057;
        }
    }
    
    public static <$Queue, $R>void printLog$P__0$1x10$glb$Worker$1x10$glb$GLB$$Queue$3x10$glb$GLB$$R$2$2__1$1x10$glb$GLB$$Queue$3x10$glb$GLB$$R$2(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, final x10.glb.GLB<$Queue, $R> GLB) {
        ((x10.glb.GLB<$Queue, $R>)GLB).printLog__0$1x10$glb$Worker$1x10$glb$GLB$$Queue$3x10$glb$GLB$$R$2$2(((x10.lang.PlaceLocalHandle)(st)));
    }
    
    
    //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    final public x10.glb.GLB x10$glb$GLB$$this$x10$glb$GLB() {
        
        //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        return x10.glb.GLB.this;
    }
    
    
    //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    final public void __fieldInitializers_x10_glb_GLB() {
        
        //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final long t$88045 = x10.lang.Place.get$MAX_PLACES();
        
        //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ((x10.glb.GLB<$Queue, $R>)this).P = t$88045;
        
        //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ((x10.glb.GLB<$Queue, $R>)this).setupTime = 0L;
        
        //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ((x10.glb.GLB<$Queue, $R>)this).crunchNumberTime = 0L;
        
        //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ((x10.glb.GLB<$Queue, $R>)this).collectResultTime = 0L;
        
        //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ((x10.glb.GLB<$Queue, $R>)this).rootGlbR = null;
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        final x10.glb.GLBParameters t$88046 = (x10.glb.GLBParameters) x10.rtt.Types.zeroValue(x10.glb.GLBParameters.$RTT);
        
        //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
        ((x10.glb.GLB<$Queue, $R>)this).glbParams = t$88046;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$24<$Queue, $R> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$24> $RTT = 
            x10.rtt.StaticFunType.<$Closure$24> make($Closure$24.class,
                                                     2,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.glb.Worker.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(1)))
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.GLB.$Closure$24<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.glbParams = $deserializer.readObject();
            $_obj.init = $deserializer.readObject();
            $_obj.tree = $deserializer.readBoolean();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.GLB.$Closure$24 $_obj = new x10.glb.GLB.$Closure$24((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.glbParams);
            $serializer.write(this.init);
            $serializer.write(this.tree);
            
        }
        
        // constructor just for allocation
        public $Closure$24(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.GLB.$Closure$24.$initParams(this, $Queue, $R);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.glb.Worker $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$24 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __1$1x10$glb$GLB$$Closure$24$$Queue$2 {}
        
    
        
        public x10.glb.Worker $apply() {
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.glb.Worker alloc$82139 = ((x10.glb.Worker)(new x10.glb.Worker<$Queue, $R>((java.lang.System[]) null, $Queue, $R)));
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final int t$88047 = this.glbParams.n;
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final int t$88048 = this.glbParams.w;
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final int t$88049 = this.glbParams.l;
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final int t$88050 = this.glbParams.z;
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final int t$88051 = this.glbParams.m;
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            alloc$82139.x10$glb$Worker$$init$S(this.init, ((int)(t$88047)), ((int)(t$88048)), ((int)(t$88049)), ((int)(t$88050)), ((int)(t$88051)), this.tree, (x10.glb.Worker.__0$1x10$glb$Worker$$Queue$2) null);
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            return alloc$82139;
        }
        
        public x10.glb.GLBParameters glbParams;
        public x10.core.fun.Fun_0_0<$Queue> init;
        public boolean tree;
        
        public $Closure$24(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.glb.GLBParameters glbParams, final x10.core.fun.Fun_0_0<$Queue> init, final boolean tree, __1$1x10$glb$GLB$$Closure$24$$Queue$2 $dummy) {
            x10.glb.GLB.$Closure$24.$initParams(this, $Queue, $R);
             {
                ((x10.glb.GLB.$Closure$24<$Queue, $R>)this).glbParams = ((x10.glb.GLBParameters)(glbParams));
                ((x10.glb.GLB.$Closure$24<$Queue, $R>)this).init = ((x10.core.fun.Fun_0_0)(init));
                ((x10.glb.GLB.$Closure$24<$Queue, $R>)this).tree = tree;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$25<$Queue, $R> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$25> $RTT = 
            x10.rtt.StaticFunType.<$Closure$25> make($Closure$25.class,
                                                     2,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.glb.Logger.$RTT)
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.GLB.$Closure$25<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.st = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.GLB.$Closure$25 $_obj = new x10.glb.GLB.$Closure$25((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.out$$);
            $serializer.write(this.st);
            
        }
        
        // constructor just for allocation
        public $Closure$25(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.GLB.$Closure$25.$initParams(this, $Queue, $R);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.glb.Logger $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$25 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$GLB$$Closure$25$$Queue$3x10$glb$GLB$$Closure$25$$R$2__1$1x10$glb$Worker$1x10$glb$GLB$$Closure$25$$Queue$3x10$glb$GLB$$Closure$25$$R$2$2 {}
        
    
        
        public x10.glb.Logger $apply() {
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            try {{
                
                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.glb.Worker t$81951 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st).$apply$G();
                
                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.glb.Logger t$81956 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)t$81951).logger));
                
                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.glb.GLBParameters t$81952 = ((x10.glb.GLBParameters)(((x10.glb.GLB<$Queue, $R>)this.out$$).glbParams));
                
                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final int t$81953 = t$81952.v;
                
                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final int t$81955 = ((t$81953) & (((int)(8))));
                
                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final boolean t$81957 = ((int) t$81955) != ((int) 0);
                
                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.glb.Logger t$81958 = ((x10.glb.Logger)(t$81956.get((boolean)(t$81957))));
                
                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                return t$81958;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                x10.glb.Logger __lowerer__var__1__ = ((x10.glb.Logger)(x10.lang.Runtime.<x10.glb.Logger> wrapAtChecked$G(x10.glb.Logger.$RTT, ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                return __lowerer__var__1__;
            }
        }
        
        public x10.glb.GLB<$Queue, $R> out$$;
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        
        public $Closure$25(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.glb.GLB<$Queue, $R> out$$, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, __0$1x10$glb$GLB$$Closure$25$$Queue$3x10$glb$GLB$$Closure$25$$R$2__1$1x10$glb$Worker$1x10$glb$GLB$$Closure$25$$Queue$3x10$glb$GLB$$Closure$25$$R$2$2 $dummy) {
            x10.glb.GLB.$Closure$25.$initParams(this, $Queue, $R);
             {
                ((x10.glb.GLB.$Closure$25<$Queue, $R>)this).out$$ = out$$;
                ((x10.glb.GLB.$Closure$25<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$26<$Queue, $R> extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$26> $RTT = 
            x10.rtt.StaticFunType.<$Closure$26> make($Closure$26.class,
                                                     2,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.glb.Logger.$RTT)
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.GLB.$Closure$26<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.h = $deserializer.readLong();
            $_obj.st = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.GLB.$Closure$26 $_obj = new x10.glb.GLB.$Closure$26((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.out$$);
            $serializer.write(this.h);
            $serializer.write(this.st);
            
        }
        
        // constructor just for allocation
        public $Closure$26(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.GLB.$Closure$26.$initParams(this, $Queue, $R);
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Long.$unbox(a1));
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$26 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$GLB$$Closure$26$$Queue$3x10$glb$GLB$$Closure$26$$R$2__2$1x10$glb$Worker$1x10$glb$GLB$$Closure$26$$Queue$3x10$glb$GLB$$Closure$26$$R$2$2 {}
        
    
        
        public x10.glb.Logger $apply(final long i) {
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final long t$81950 = ((this.h) + (((long)(i))));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.lang.Place t$81959 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            t$81959.x10$lang$Place$$init$S(t$81950);
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.glb.Logger t$81960 = ((x10.glb.Logger)(x10.lang.Runtime.<x10.glb.Logger> evalAt__1$1x10$lang$Runtime$$T$2$G(x10.glb.Logger.$RTT, ((x10.lang.Place)(t$81959)), ((x10.core.fun.Fun_0_0)(new x10.glb.GLB.$Closure$25<$Queue, $R>($Queue, $R, ((x10.glb.GLB<$Queue, $R>)(this.out$$)), ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)(this.st)), (x10.glb.GLB.$Closure$25.__0$1x10$glb$GLB$$Closure$25$$Queue$3x10$glb$GLB$$Closure$25$$R$2__1$1x10$glb$Worker$1x10$glb$GLB$$Closure$25$$Queue$3x10$glb$GLB$$Closure$25$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)))));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            return t$81960;
        }
        
        public x10.glb.GLB<$Queue, $R> out$$;
        public long h;
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        
        public $Closure$26(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.glb.GLB<$Queue, $R> out$$, final long h, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, __0$1x10$glb$GLB$$Closure$26$$Queue$3x10$glb$GLB$$Closure$26$$R$2__2$1x10$glb$Worker$1x10$glb$GLB$$Closure$26$$Queue$3x10$glb$GLB$$Closure$26$$R$2$2 $dummy) {
            x10.glb.GLB.$Closure$26.$initParams(this, $Queue, $R);
             {
                ((x10.glb.GLB.$Closure$26<$Queue, $R>)this).out$$ = ((x10.glb.GLB)(out$$));
                ((x10.glb.GLB.$Closure$26<$Queue, $R>)this).h = h;
                ((x10.glb.GLB.$Closure$26<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$27<$Queue, $R> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$27> $RTT = 
            x10.rtt.StaticFunType.<$Closure$27> make($Closure$27.class,
                                                     2,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.glb.Logger.$RTT)
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.GLB.$Closure$27<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.P = $deserializer.readLong();
            $_obj.st = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.GLB.$Closure$27 $_obj = new x10.glb.GLB.$Closure$27((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.out$$);
            $serializer.write(this.P);
            $serializer.write(this.st);
            
        }
        
        // constructor just for allocation
        public $Closure$27(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.GLB.$Closure$27.$initParams(this, $Queue, $R);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.glb.Logger $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$27 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$GLB$$Closure$27$$Queue$3x10$glb$GLB$$Closure$27$$R$2__2$1x10$glb$Worker$1x10$glb$GLB$$Closure$27$$Queue$3x10$glb$GLB$$Closure$27$$R$2$2 {}
        
    
        
        public x10.glb.Logger $apply() {
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            try {{
                
                //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final long h = ((long)x10.x10rt.X10RT.here());
                
                //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final long t$81962 = this.P;
                
                //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final long t$81963 = ((t$81962) - (((long)(h))));
                
                //#line 40 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final long j$82306 = t$81963;
                
                //#line 40 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final boolean t$87995 = ((32L) < (((long)(j$82306))));
                
                //#line 40 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                long t$87996 =  0;
                
                //#line 40 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                if (t$87995) {
                    
                    //#line 40 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                    t$87996 = 32L;
                } else {
                    
                    //#line 40 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                    t$87996 = j$82306;
                }
                
                //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final long n = t$87996;
                
                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.core.fun.Fun_0_1 t$87997 = ((x10.core.fun.Fun_0_1)(new x10.glb.GLB.$Closure$26<$Queue, $R>($Queue, $R, ((x10.glb.GLB<$Queue, $R>)(this.out$$)), h, ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)(this.st)), (x10.glb.GLB.$Closure$26.__0$1x10$glb$GLB$$Closure$26$$Queue$3x10$glb$GLB$$Closure$26$$R$2__2$1x10$glb$Worker$1x10$glb$GLB$$Closure$26$$Queue$3x10$glb$GLB$$Closure$26$$R$2$2) null)));
                
                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.core.Rail logs = ((x10.core.Rail)(new x10.core.Rail<x10.glb.Logger>(x10.glb.Logger.$RTT, ((long)(n)), ((x10.core.fun.Fun_0_1)(t$87997)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                
                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.glb.Logger log = ((x10.glb.Logger)(new x10.glb.Logger((java.lang.System[]) null)));
                
                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                log.x10$glb$Logger$$init$S(((boolean)(false)));
                
                //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                log.collect__0$1x10$glb$Logger$2(((x10.core.Rail)(logs)));
                
                //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                return log;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                x10.glb.Logger __lowerer__var__1__ = ((x10.glb.Logger)(x10.lang.Runtime.<x10.glb.Logger> wrapAtChecked$G(x10.glb.Logger.$RTT, ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                return __lowerer__var__1__;
            }
        }
        
        public x10.glb.GLB<$Queue, $R> out$$;
        public long P;
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        
        public $Closure$27(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.glb.GLB<$Queue, $R> out$$, final long P, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, __0$1x10$glb$GLB$$Closure$27$$Queue$3x10$glb$GLB$$Closure$27$$R$2__2$1x10$glb$Worker$1x10$glb$GLB$$Closure$27$$Queue$3x10$glb$GLB$$Closure$27$$R$2$2 $dummy) {
            x10.glb.GLB.$Closure$27.$initParams(this, $Queue, $R);
             {
                ((x10.glb.GLB.$Closure$27<$Queue, $R>)this).out$$ = out$$;
                ((x10.glb.GLB.$Closure$27<$Queue, $R>)this).P = P;
                ((x10.glb.GLB.$Closure$27<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$28<$Queue, $R> extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$28> $RTT = 
            x10.rtt.StaticFunType.<$Closure$28> make($Closure$28.class,
                                                     2,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.glb.Logger.$RTT)
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.GLB.$Closure$28<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.P = $deserializer.readLong();
            $_obj.st = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.GLB.$Closure$28 $_obj = new x10.glb.GLB.$Closure$28((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.out$$);
            $serializer.write(this.P);
            $serializer.write(this.st);
            
        }
        
        // constructor just for allocation
        public $Closure$28(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.GLB.$Closure$28.$initParams(this, $Queue, $R);
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Long.$unbox(a1));
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$28 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$GLB$$Closure$28$$Queue$3x10$glb$GLB$$Closure$28$$R$2__2$1x10$glb$Worker$1x10$glb$GLB$$Closure$28$$Queue$3x10$glb$GLB$$Closure$28$$R$2$2 {}
        
    
        
        public x10.glb.Logger $apply(final long i) {
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final long t$81961 = ((i) * (((long)(32L))));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.lang.Place t$81965 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            t$81965.x10$lang$Place$$init$S(t$81961);
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.glb.Logger t$81966 = ((x10.glb.Logger)(x10.lang.Runtime.<x10.glb.Logger> evalAt__1$1x10$lang$Runtime$$T$2$G(x10.glb.Logger.$RTT, ((x10.lang.Place)(t$81965)), ((x10.core.fun.Fun_0_0)(new x10.glb.GLB.$Closure$27<$Queue, $R>($Queue, $R, ((x10.glb.GLB<$Queue, $R>)(this.out$$)), this.P, ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)(this.st)), (x10.glb.GLB.$Closure$27.__0$1x10$glb$GLB$$Closure$27$$Queue$3x10$glb$GLB$$Closure$27$$R$2__2$1x10$glb$Worker$1x10$glb$GLB$$Closure$27$$Queue$3x10$glb$GLB$$Closure$27$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)))));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            return t$81966;
        }
        
        public x10.glb.GLB<$Queue, $R> out$$;
        public long P;
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        
        public $Closure$28(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.glb.GLB<$Queue, $R> out$$, final long P, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, __0$1x10$glb$GLB$$Closure$28$$Queue$3x10$glb$GLB$$Closure$28$$R$2__2$1x10$glb$Worker$1x10$glb$GLB$$Closure$28$$Queue$3x10$glb$GLB$$Closure$28$$R$2$2 $dummy) {
            x10.glb.GLB.$Closure$28.$initParams(this, $Queue, $R);
             {
                ((x10.glb.GLB.$Closure$28<$Queue, $R>)this).out$$ = ((x10.glb.GLB)(out$$));
                ((x10.glb.GLB.$Closure$28<$Queue, $R>)this).P = P;
                ((x10.glb.GLB.$Closure$28<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$29<$Queue, $R> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$29> $RTT = 
            x10.rtt.StaticFunType.<$Closure$29> make($Closure$29.class,
                                                     2,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.glb.Logger.$RTT)
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.GLB.$Closure$29<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.st = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.GLB.$Closure$29 $_obj = new x10.glb.GLB.$Closure$29((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.out$$);
            $serializer.write(this.st);
            
        }
        
        // constructor just for allocation
        public $Closure$29(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.GLB.$Closure$29.$initParams(this, $Queue, $R);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.glb.Logger $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$29 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$GLB$$Closure$29$$Queue$3x10$glb$GLB$$Closure$29$$R$2__1$1x10$glb$Worker$1x10$glb$GLB$$Closure$29$$Queue$3x10$glb$GLB$$Closure$29$$R$2$2 {}
        
    
        
        public x10.glb.Logger $apply() {
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            try {{
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.glb.Worker t$81967 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st).$apply$G();
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.glb.Logger t$81972 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)t$81967).logger));
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.glb.GLBParameters t$81968 = ((x10.glb.GLBParameters)(((x10.glb.GLB<$Queue, $R>)this.out$$).glbParams));
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final int t$81969 = t$81968.v;
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final int t$81971 = ((t$81969) & (((int)(8))));
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final boolean t$81973 = ((int) t$81971) != ((int) 0);
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.glb.Logger t$81974 = ((x10.glb.Logger)(t$81972.get((boolean)(t$81973))));
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                return t$81974;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                x10.glb.Logger __lowerer__var__1__ = ((x10.glb.Logger)(x10.lang.Runtime.<x10.glb.Logger> wrapAtChecked$G(x10.glb.Logger.$RTT, ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                return __lowerer__var__1__;
            }
        }
        
        public x10.glb.GLB<$Queue, $R> out$$;
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        
        public $Closure$29(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.glb.GLB<$Queue, $R> out$$, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, __0$1x10$glb$GLB$$Closure$29$$Queue$3x10$glb$GLB$$Closure$29$$R$2__1$1x10$glb$Worker$1x10$glb$GLB$$Closure$29$$Queue$3x10$glb$GLB$$Closure$29$$R$2$2 $dummy) {
            x10.glb.GLB.$Closure$29.$initParams(this, $Queue, $R);
             {
                ((x10.glb.GLB.$Closure$29<$Queue, $R>)this).out$$ = out$$;
                ((x10.glb.GLB.$Closure$29<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$30<$Queue, $R> extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$30> $RTT = 
            x10.rtt.StaticFunType.<$Closure$30> make($Closure$30.class,
                                                     2,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.glb.Logger.$RTT)
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.GLB.$Closure$30<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.st = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.GLB.$Closure$30 $_obj = new x10.glb.GLB.$Closure$30((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.out$$);
            $serializer.write(this.st);
            
        }
        
        // constructor just for allocation
        public $Closure$30(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.GLB.$Closure$30.$initParams(this, $Queue, $R);
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Long.$unbox(a1));
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$30 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$GLB$$Closure$30$$Queue$3x10$glb$GLB$$Closure$30$$R$2__1$1x10$glb$Worker$1x10$glb$GLB$$Closure$30$$Queue$3x10$glb$GLB$$Closure$30$$R$2$2 {}
        
    
        
        public x10.glb.Logger $apply(final long i) {
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.lang.Place t$81975 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            t$81975.x10$lang$Place$$init$S(((long)(i)));
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.glb.Logger t$81976 = ((x10.glb.Logger)(x10.lang.Runtime.<x10.glb.Logger> evalAt__1$1x10$lang$Runtime$$T$2$G(x10.glb.Logger.$RTT, ((x10.lang.Place)(t$81975)), ((x10.core.fun.Fun_0_0)(new x10.glb.GLB.$Closure$29<$Queue, $R>($Queue, $R, ((x10.glb.GLB<$Queue, $R>)(this.out$$)), ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)(this.st)), (x10.glb.GLB.$Closure$29.__0$1x10$glb$GLB$$Closure$29$$Queue$3x10$glb$GLB$$Closure$29$$R$2__1$1x10$glb$Worker$1x10$glb$GLB$$Closure$29$$Queue$3x10$glb$GLB$$Closure$29$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)))));
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            return t$81976;
        }
        
        public x10.glb.GLB<$Queue, $R> out$$;
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        
        public $Closure$30(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.glb.GLB<$Queue, $R> out$$, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, __0$1x10$glb$GLB$$Closure$30$$Queue$3x10$glb$GLB$$Closure$30$$R$2__1$1x10$glb$Worker$1x10$glb$GLB$$Closure$30$$Queue$3x10$glb$GLB$$Closure$30$$R$2$2 $dummy) {
            x10.glb.GLB.$Closure$30.$initParams(this, $Queue, $R);
             {
                ((x10.glb.GLB.$Closure$30<$Queue, $R>)this).out$$ = ((x10.glb.GLB)(out$$));
                ((x10.glb.GLB.$Closure$30<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$31<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$31> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$31> make($Closure$31.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.GLB.$Closure$31<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.resultGlobal = $deserializer.readObject();
            $_obj.tmpPlh = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.GLB.$Closure$31 $_obj = new x10.glb.GLB.$Closure$31((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.resultGlobal);
            $serializer.write(this.tmpPlh);
            
        }
        
        // constructor just for allocation
        public $Closure$31(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.GLB.$Closure$31.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$31 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$GLBResult$1x10$glb$GLB$$Closure$31$$R$2$2__1$1x10$glb$Worker$1x10$glb$GLB$$Closure$31$$Queue$3x10$glb$GLB$$Closure$31$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final x10.lang.Place t$88012 = ((x10.lang.Place)((this.resultGlobal).home));
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            final boolean t$88031 = x10.rtt.Equality.equalsequals((x10.lang.Place.place(x10.x10rt.X10RT.here())),(t$88012));
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            if (t$88031) {
                
                //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.core.GlobalRef tmpresultGlobal = ((x10.core.GlobalRef)(((x10.core.GlobalRef)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.rtt.ParameterizedType.make(x10.glb.GLBResult.$RTT, $R)),this.resultGlobal))));
                
                //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.util.Team t$88018 = ((x10.util.Team)(x10.util.Team.get$WORLD()));
                
                //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.glb.GLBResult t$88013 = (((x10.core.GlobalRef<x10.glb.GLBResult<$R>>)(tmpresultGlobal))).$apply$G();
                
                //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.core.Rail t$88019 = ((x10.core.Rail<$R>)
                                                ((x10.glb.GLBResult<$R>)t$88013).submitResult());
                
                //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.glb.GLBResult t$88014 = (((x10.core.GlobalRef<x10.glb.GLBResult<$R>>)(tmpresultGlobal))).$apply$G();
                
                //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.core.Rail t$88020 = ((x10.core.Rail<$R>)
                                                ((x10.glb.GLBResult<$R>)t$88014).submitResult());
                
                //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.glb.GLBResult t$88015 = (((x10.core.GlobalRef<x10.glb.GLBResult<$R>>)(tmpresultGlobal))).$apply$G();
                
                //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.core.Rail t$88016 = ((x10.core.Rail<$R>)
                                                ((x10.glb.GLBResult<$R>)t$88015).submitResult());
                
                //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final long t$88021 = ((x10.core.Rail<$R>)t$88016).size;
                
                //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.glb.GLBResult t$88017 = (((x10.core.GlobalRef<x10.glb.GLBResult<$R>>)(tmpresultGlobal))).$apply$G();
                
                //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final int t$88022 = ((x10.glb.GLBResult<$R>)t$88017).getReduceOperator$O();
                
                //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                ((x10.util.Team)t$88018).<$R> allreduce__0$1x10$util$Team$$T$2__2$1x10$util$Team$$T$2($R, ((x10.core.Rail)(t$88019)), (long)(0L), ((x10.core.Rail)(t$88020)), (long)(0L), (long)(t$88021), (int)(t$88022));
            } else {
                
                //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.glb.Worker t$88023 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.tmpPlh).$apply$G();
                
                //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final $Queue t$88024 = (($Queue)(((x10.glb.Worker<$Queue, $R>)t$88023).queue));
                
                //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.glb.GLBResult glbR = ((x10.glb.GLBResult<$R>)
                                                 ((x10.glb.TaskQueue<$Queue, $R>)x10.rtt.Types.conversion(x10.rtt.ParameterizedType.make(x10.glb.TaskQueue.$RTT, $Queue, $R),t$88024)).getResult());
                
                //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.util.Team t$88026 = ((x10.util.Team)(x10.util.Team.get$WORLD()));
                
                //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.core.Rail t$88027 = ((x10.core.Rail<$R>)
                                                ((x10.glb.GLBResult<$R>)glbR).submitResult());
                
                //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.core.Rail t$88028 = ((x10.core.Rail<$R>)
                                                ((x10.glb.GLBResult<$R>)glbR).submitResult());
                
                //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.core.Rail t$88025 = ((x10.core.Rail<$R>)
                                                ((x10.glb.GLBResult<$R>)glbR).submitResult());
                
                //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final long t$88029 = ((x10.core.Rail<$R>)t$88025).size;
                
                //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final int t$88030 = ((x10.glb.GLBResult<$R>)glbR).getReduceOperator$O();
                
                //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                ((x10.util.Team)t$88026).<$R> allreduce__0$1x10$util$Team$$T$2__2$1x10$util$Team$$T$2($R, ((x10.core.Rail)(t$88027)), (long)(0L), ((x10.core.Rail)(t$88028)), (long)(0L), (long)(t$88029), (int)(t$88030));
            }
        }
        
        public x10.core.GlobalRef<x10.glb.GLBResult<$R>> resultGlobal;
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> tmpPlh;
        
        public $Closure$31(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.core.GlobalRef<x10.glb.GLBResult<$R>> resultGlobal, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> tmpPlh, __0$1x10$glb$GLBResult$1x10$glb$GLB$$Closure$31$$R$2$2__1$1x10$glb$Worker$1x10$glb$GLB$$Closure$31$$Queue$3x10$glb$GLB$$Closure$31$$R$2$2 $dummy) {
            x10.glb.GLB.$Closure$31.$initParams(this, $Queue, $R);
             {
                ((x10.glb.GLB.$Closure$31<$Queue, $R>)this).resultGlobal = ((x10.core.GlobalRef)(resultGlobal));
                ((x10.glb.GLB.$Closure$31<$Queue, $R>)this).tmpPlh = ((x10.lang.PlaceLocalHandle)(tmpPlh));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$32<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$32> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$32> make($Closure$32.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.GLB.$Closure$32<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.GLB.$Closure$32 $_obj = new x10.glb.GLB.$Closure$32((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st);
            
        }
        
        // constructor just for allocation
        public $Closure$32(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.GLB.$Closure$32.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$32 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$GLB$$Closure$32$$Queue$3x10$glb$GLB$$Closure$32$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
            try {{
                
                //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final x10.glb.Worker t$88054 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st).$apply$G();
                
                //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                final $Queue t$88055 = (($Queue)(((x10.glb.Worker<$Queue, $R>)t$88054).queue));
                
                //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                ((x10.glb.TaskQueue<$Queue, $R>)x10.rtt.Types.conversion(x10.rtt.ParameterizedType.make(x10.glb.TaskQueue.$RTT, $Queue, $R),t$88055)).printLog();
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        
        public $Closure$32(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, __0$1x10$glb$Worker$1x10$glb$GLB$$Closure$32$$Queue$3x10$glb$GLB$$Closure$32$$R$2$2 $dummy) {
            x10.glb.GLB.$Closure$32.$initParams(this, $Queue, $R);
             {
                ((x10.glb.GLB.$Closure$32<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
            }
        }
        
    }
    
}

