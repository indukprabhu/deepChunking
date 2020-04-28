package x10.lang;


@x10.runtime.impl.java.X10Generated
abstract public class FinishResilient extends x10.lang.FinishState implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<FinishResilient> $RTT = 
        x10.rtt.NamedType.<FinishResilient> make("x10.lang.FinishResilient",
                                                 FinishResilient.class,
                                                 new x10.rtt.Type[] {
                                                     x10.lang.FinishState.$RTT
                                                 });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilient $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.FinishState.$_deserialize_body($_obj, $deserializer);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        
    }
    
    // constructor just for allocation
    public FinishResilient(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    private static long verbose = 0L;
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    public static long getEnvLong$O(final java.lang.String name) {
        
        //#line 86 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final java.lang.String name$98955 = ((java.lang.String)(name));
        
        //#line 86 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
        final x10.util.HashMap t$105332 = ((x10.util.HashMap)(x10.lang.Runtime.get$env()));
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final java.lang.String env = ((x10.util.HashMap<java.lang.String, java.lang.String>)t$105332).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(name$98955)), ((java.lang.String)(null)));
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105333 = ((env) != (null));
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        long t$105334 =  0;
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105333) {
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            t$105334 = java.lang.Long.parseLong(env);
        } else {
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            t$105334 = 0L;
        }
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long v = t$105334;
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        boolean t$105336 = ((v) > (((long)(0L))));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105336) {
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105335 = x10.lang.Place.place(x10.x10rt.X10RT.here()).id;
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            t$105336 = ((long) t$105335) == ((long) 0L);
        }
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105340 = t$105336;
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105340) {
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final x10.io.Printer t$105338 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105337 = ((name) + ("="));
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105339 = ((t$105337) + ((x10.core.Long.$box(v))));
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            t$105338.println(((java.lang.Object)(t$105339)));
        }
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        return v;
    }
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    public static void debug(final java.lang.String msg) {
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long nsec = java.lang.System.nanoTime();
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final java.lang.String t$105341 = (("[nsec=") + ((x10.core.Long.$box(nsec))));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final java.lang.String t$105342 = ((t$105341) + (" place="));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105343 = x10.lang.Place.place(x10.x10rt.X10RT.here()).id;
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final java.lang.String t$105344 = ((t$105342) + ((x10.core.Long.$box(t$105343))));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final java.lang.String t$105345 = ((t$105344) + (" "));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.lang.Activity t$105346 = x10.lang.Runtime.activity();
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final java.lang.String t$105347 = ((t$105345) + (t$105346));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final java.lang.String t$105348 = ((t$105347) + ("] "));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final java.lang.String output = ((t$105348) + (msg));
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.io.Printer t$105349 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        t$105349.println(((java.lang.Object)(output)));
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.io.Printer t$105350 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        t$105350.flush();
    }
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    public static void dumpStack(final java.lang.String msg) {
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        try {{
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.RuntimeException t$105351 = ((java.lang.RuntimeException)(new java.lang.RuntimeException(msg)));
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            throw t$105351;
        }}catch (final java.lang.RuntimeException e) {
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            e.printStackTrace();
        }
    }
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    private static x10.lang.FinishState getCurrentFS() {
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.lang.Activity a = x10.lang.Runtime.activity();
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105352 = ((a) != (null));
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        x10.lang.FinishState t$105353 =  null;
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105352) {
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            t$105353 = a.finishState();
        } else {
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            t$105353 = null;
        }
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.lang.FinishState t$105354 = t$105353;
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        return t$105354;
    }
    
    public static x10.lang.FinishState getCurrentFS$P() {
        return x10.lang.FinishResilient.getCurrentFS();
    }
    
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    public static x10.lang.FinishState make(final x10.lang.FinishState parent, final x10.util.concurrent.SimpleLatch latch) {
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105355 = x10.lang.FinishResilient.get$verbose();
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105359 = ((t$105355) >= (((long)(1L))));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105359) {
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105356 = (("FinishResilient.make called, parent=") + (parent));
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105357 = ((t$105356) + (" latch="));
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105358 = ((t$105357) + (latch));
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105358)));
        }
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        x10.lang.FinishState fs =  null;
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final int t$105376 = x10.lang.Runtime.get$RESILIENT_MODE();
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        switch (t$105376) {
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            case 9:
                {
                    
                    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final boolean t$105360 = ((parent) != (null));
                    
                    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    x10.lang.FinishState t$105361 =  null;
                    
                    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    if (t$105360) {
                        
                        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                        t$105361 = parent;
                    } else {
                        
                        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                        t$105361 = x10.lang.FinishResilient.getCurrentFS();
                    }
                    
                    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final x10.lang.FinishState p = t$105361;
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final boolean t$105362 = ((latch) != (null));
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    x10.util.concurrent.SimpleLatch t$105363 =  null;
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    if (t$105362) {
                        
                        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                        t$105363 = latch;
                    } else {
                        
                        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                        t$105363 = new x10.util.concurrent.SimpleLatch();
                    }
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final x10.util.concurrent.SimpleLatch l = t$105363;
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final x10.lang.FinishResilientSample t$105364 = x10.lang.FinishResilientSample.make(((x10.lang.FinishState)(p)), ((x10.util.concurrent.SimpleLatch)(l)));
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    fs = ((x10.lang.FinishState)(t$105364));
                    
                    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    break;
                }
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            case 11:
                {
                    
                    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final boolean t$105365 = ((parent) != (null));
                    
                    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    x10.lang.FinishState t$105366 =  null;
                    
                    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    if (t$105365) {
                        
                        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                        t$105366 = parent;
                    } else {
                        
                        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                        t$105366 = x10.lang.FinishResilient.getCurrentFS();
                    }
                    
                    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final x10.lang.FinishState p = t$105366;
                    
                    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final boolean t$105367 = ((latch) != (null));
                    
                    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    x10.util.concurrent.SimpleLatch t$105368 =  null;
                    
                    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    if (t$105367) {
                        
                        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                        t$105368 = latch;
                    } else {
                        
                        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                        t$105368 = new x10.util.concurrent.SimpleLatch();
                    }
                    
                    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final x10.util.concurrent.SimpleLatch l = t$105368;
                    
                    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final x10.lang.FinishResilient t$105369 = x10.lang.FinishResilientPlace0.make(((x10.lang.FinishState)(p)), ((x10.util.concurrent.SimpleLatch)(l)));
                    
                    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    fs = ((x10.lang.FinishState)(t$105369));
                    
                    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    break;
                }
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            case 1:
                
                //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.lang.FinishState.FinishResilientPlaceZero alloc$98949 = ((x10.lang.FinishState.FinishResilientPlaceZero)(new x10.lang.FinishState.FinishResilientPlaceZero((java.lang.System[]) null)));
                {
                    
                    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    alloc$98949.x10$lang$FinishState$FinishResilientPlaceZero$$init$S(((x10.util.concurrent.SimpleLatch)(latch)));
                }
                
                //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                fs = ((x10.lang.FinishState)(alloc$98949));
                
                //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                break;
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            case 2:
                
                //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.lang.FinishState.FinishResilientDistributed alloc$98950 = ((x10.lang.FinishState.FinishResilientDistributed)(new x10.lang.FinishState.FinishResilientDistributed((java.lang.System[]) null)));
                {
                    
                    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final boolean t$105370 = ((latch) == (null));
                    
                    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    x10.util.concurrent.SimpleLatch t$105371 =  null;
                    
                    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    if (t$105370) {
                        
                        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                        t$105371 = new x10.util.concurrent.SimpleLatch();
                    } else {
                        
                        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                        t$105371 = latch;
                    }
                    
                    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final x10.util.concurrent.SimpleLatch t$105372 = t$105371;
                    
                    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    alloc$98950.x10$lang$FinishState$FinishResilientDistributed$$init$S(t$105372);
                }
                
                //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                fs = ((x10.lang.FinishState)(alloc$98950));
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                break;
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            case 3:
                
                //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.lang.FinishState.FinishResilientZooKeeper alloc$98951 = ((x10.lang.FinishState.FinishResilientZooKeeper)(new x10.lang.FinishState.FinishResilientZooKeeper((java.lang.System[]) null)));
                {
                    
                    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    alloc$98951.x10$lang$FinishState$FinishResilientZooKeeper$$init$S(((x10.util.concurrent.SimpleLatch)(latch)));
                }
                
                //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                fs = ((x10.lang.FinishState)(alloc$98951));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                break;
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            default:
                
                //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final int t$105373 = x10.lang.Runtime.get$RESILIENT_MODE();
                
                //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final java.lang.String t$105374 = (("Unsupported RESILIENT_MODE ") + ((x10.core.Int.$box(t$105373))));
                
                //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final java.lang.UnsupportedOperationException t$105375 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException(t$105374)));
                
                //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                throw t$105375;
        }
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105377 = x10.lang.FinishResilient.get$verbose();
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105380 = ((t$105377) >= (((long)(1L))));
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105380) {
            
            //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final x10.lang.FinishState t$105378 = ((x10.lang.FinishState)(fs));
            
            //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105379 = (("FinishResilient.make returning, fs=") + (t$105378));
            
            //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105379)));
        }
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.lang.FinishState t$105381 = ((x10.lang.FinishState)(fs));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        return t$105381;
    }
    
    
    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    public static void notifyPlaceDeath() {
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105382 = x10.lang.FinishResilient.get$verbose();
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105383 = ((t$105382) >= (((long)(1L))));
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105383) {
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)("FinishResilient.notifyPlaceDeath called")));
        }
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final int t$105392 = x10.lang.Runtime.get$RESILIENT_MODE();
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        switch (t$105392) {
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            case 9:
                
                //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilientSample.notifyPlaceDeath();
                
                //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                break;
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            case 11:
                
                //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilientPlace0.notifyPlaceDeath();
                
                //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                break;
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            case 1:
                
                //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final long t$105384 = x10.lang.Place.place(x10.x10rt.X10RT.here()).id;
                
                //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final boolean t$105388 = ((long) t$105384) == ((long) 0L);
                
                //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                if (t$105388) {
                    
                    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    try {{
                        
                        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                        x10.lang.Runtime.enterAtomic();
                        {
                            
                        }
                    }}finally {{
                          
                          //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                          x10.lang.Runtime.exitAtomic();
                      }}
                    
                    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final x10.lang.FinishState t$105385 = ((x10.lang.FinishState)(x10.lang.Runtime.get$rootFinish()));
                    
                    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final x10.lang.FinishState.FinishResilientPlaceZero t$105386 = ((x10.lang.FinishState.FinishResilientPlaceZero)(x10.rtt.Types.<x10.lang.FinishState.FinishResilientPlaceZero> cast(t$105385,x10.lang.FinishState.FinishResilientPlaceZero.$RTT)));
                    
                    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final long t$105387 = t$105386.id;
                    
                    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    x10.lang.ResilientStorePlaceZero.notifyPlaceDeath((long)(t$105387));
                    }
                
                //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                break;
                
                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                case 2:
                    
                    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    x10.lang.FinishState.FinishResilientDistributedMaster.notifyAllPlaceDeath();
                    
                    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    break;
                
                //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                case 3:
                    
                    //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    break;
                
                //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                default:
                    
                    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final int t$105389 = x10.lang.Runtime.get$RESILIENT_MODE();
                    
                    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final java.lang.String t$105390 = (("Unsupported RESILIENT_MODE ") + ((x10.core.Int.$box(t$105389))));
                    
                    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final java.lang.UnsupportedOperationException t$105391 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException(t$105390)));
                    
                    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    throw t$105391;
            }
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105393 = x10.lang.FinishResilient.get$verbose();
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105394 = ((t$105393) >= (((long)(1L))));
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105394) {
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)("FinishResilient.notifyPlaceDeath returning")));
        }
        }
    
    
    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    public x10.util.concurrent.SimpleLatch simpleLatch() {
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final java.lang.UnsupportedOperationException t$105395 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException("Obsolete function")));
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        throw t$105395;
    }
    
    
    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    public void runAt(final x10.lang.Place place, final x10.core.fun.VoidFun_0_0 body, final x10.lang.Runtime.Profile prof) {
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105396 = x10.lang.FinishResilient.get$verbose();
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105399 = ((t$105396) >= (((long)(1L))));
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105399) {
            
            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105397 = place.id;
            
            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105398 = (("FinishResilient.runAt called, place.id=") + ((x10.core.Long.$box(t$105397))));
            
            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105398)));
        }
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        x10.lang.Runtime.ensureNotInAtomic();
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105400 = place.id;
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105401 = ((long)x10.x10rt.X10RT.here());
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105404 = ((long) t$105400) == ((long) t$105401);
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105404) {
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.Runtime.runAtNonResilient(((x10.lang.Place)(place)), ((x10.core.fun.VoidFun_0_0)(body)), ((x10.lang.Runtime.Profile)(prof)));
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105402 = x10.lang.FinishResilient.get$verbose();
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105403 = ((t$105402) >= (((long)(1L))));
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105403) {
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("FinishResilient.runAt returning (locally executed)")));
            }
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            return;
        }
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.lang.FinishResilient real_finish = ((x10.lang.FinishResilient)(this));
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.lang.FinishState tmp_finish = x10.lang.FinishResilient.make(((x10.lang.FinishState)(this)), ((x10.util.concurrent.SimpleLatch)(null)));
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.lang.Place home = ((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        tmp_finish.notifySubActivitySpawn(((x10.lang.Place)(place)));
        
        //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.lang.Activity myActivity = x10.lang.Runtime.activity();
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.lang.Activity.ClockPhases clockPhases = ((x10.lang.Activity.ClockPhases)(myActivity.clockPhases));
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.lang.Cell cpCell = ((x10.lang.Cell)(new x10.lang.Cell<x10.lang.Activity.ClockPhases>((java.lang.System[]) null, x10.lang.Activity.ClockPhases.$RTT)));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final x10.lang.Activity.ClockPhases x$105258 = ((x10.lang.Activity.ClockPhases)(clockPhases));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ((x10.lang.Cell<x10.lang.Activity.ClockPhases>)cpCell).value = ((x10.lang.Activity.ClockPhases)(x$105258));
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.core.GlobalRef cpGref = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.lang.Cell<x10.lang.Activity.ClockPhases>>(x10.rtt.ParameterizedType.make(x10.lang.Cell.$RTT, x10.lang.Activity.ClockPhases.$RTT), cpCell, (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
        
        //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.core.fun.VoidFun_0_0 cl = ((x10.core.fun.VoidFun_0_0)(new x10.lang.FinishResilient.$Closure_fiish_resilient_run_at(clockPhases, tmp_finish, home, body, cpGref, real_finish, (x10.lang.FinishResilient.$Closure_fiish_resilient_run_at.__4$1x10$lang$Cell$1x10$lang$Activity$ClockPhases$2$2) null)));
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105410 = x10.lang.FinishResilient.get$verbose();
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105411 = ((t$105410) >= (((long)(2L))));
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105411) {
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)("FinishResilient.runAt sending closure")));
        }
        
        //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long id$105262 = place.id;
        
        //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.fun.VoidFun_0_0 msgBody$105263 = ((x10.core.fun.VoidFun_0_0)(cl));
        
        //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Profile prof$105264 = ((x10.lang.Runtime.Profile)(prof));
        
        //#line 77 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(id$105262))), msgBody$105263, prof$105264, null);
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        try {{
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105412 = x10.lang.FinishResilient.get$verbose();
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105413 = ((t$105412) >= (((long)(2L))));
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105413) {
                
                //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("FinishResilient.runAt calling tmp_finish.waitForFinish")));
            }
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            tmp_finish.waitForFinish();
            
            //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105414 = x10.lang.FinishResilient.get$verbose();
            
            //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105415 = ((t$105414) >= (((long)(2L))));
            
            //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105415) {
                
                //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("FinishResilient.runAt returned from tmp_finish.waitForFinish")));
            }
            
            //#line 48 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            final x10.lang.Activity.ClockPhases t$105416 = ((x10.lang.Activity.ClockPhases)(((x10.lang.Cell<x10.lang.Activity.ClockPhases>)cpCell).value));
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            myActivity.clockPhases = ((x10.lang.Activity.ClockPhases)(t$105416));
        }}catch (final x10.lang.MultipleExceptions e) {
            
            //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            assert ((long) ((x10.core.Rail<java.lang.RuntimeException>)e.exceptions).size) == ((long) 1L): e.exceptions();
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final x10.core.Rail t$105417 = ((x10.core.Rail)(e.exceptions));
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.RuntimeException e2 = ((java.lang.RuntimeException[])t$105417.value)[(int)0L];
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105418 = x10.lang.FinishResilient.get$verbose();
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105420 = ((t$105418) >= (((long)(1L))));
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105420) {
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final java.lang.String t$105419 = (("FinishResilient.runAt received exception=") + (e2));
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)(t$105419)));
            }
            
            //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105422 = x10.lang.WrappedThrowable.$RTT.isInstance(e2);
            
            //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105422) {
                
                //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final java.lang.RuntimeException t$105421 = x10.rtt.Types.EXCEPTION.isInstance(e2.getCause()) ? (java.lang.RuntimeException)(e2.getCause()) : new x10.lang.WrappedThrowable(e2.getCause());
                
                //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                java.lang.Thread.currentThread().stop(t$105421);
            } else {
                
                //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                throw e2;
            }
        }
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105423 = x10.lang.FinishResilient.get$verbose();
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105424 = ((t$105423) >= (((long)(1L))));
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105424) {
            
            //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)("FinishResilient.runAt returning (remotely executed)")));
        }
    }
    
    
    //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    public java.lang.Object evalAt__1$1x10$lang$Any$2(final x10.lang.Place place, final x10.core.fun.Fun_0_0 body, final x10.lang.Runtime.Profile prof) {
        
        //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105425 = x10.lang.FinishResilient.get$verbose();
        
        //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105428 = ((t$105425) >= (((long)(1L))));
        
        //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105428) {
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105426 = place.id;
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105427 = (("FinishResilient.evalAt called, place.id=") + ((x10.core.Long.$box(t$105426))));
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105427)));
        }
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        x10.lang.Runtime.ensureNotInAtomic();
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105429 = place.id;
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105430 = ((long)x10.x10rt.X10RT.here());
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105435 = ((long) t$105429) == ((long) t$105430);
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105435) {
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.Object result = x10.lang.Runtime.evalAtNonResilient__1$1x10$lang$Any$2(((x10.lang.Place)(place)), ((x10.core.fun.Fun_0_0)(body)), ((x10.lang.Runtime.Profile)(prof)));
            
            //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105431 = x10.lang.FinishResilient.get$verbose();
            
            //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105434 = ((t$105431) >= (((long)(1L))));
            
            //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105434) {
                
                //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final java.lang.String t$105432 = (("FinishResilient.evalAt returning result=") + (result));
                
                //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final java.lang.String t$105433 = ((t$105432) + (" (locally executed)"));
                
                //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)(t$105433)));
            }
            
            //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            return result;
        }
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.lang.Empty dummy_data = ((x10.lang.Empty)(new x10.lang.Empty((java.lang.System[]) null)));
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.lang.Cell me = ((x10.lang.Cell)(new x10.lang.Cell<java.lang.Object>((java.lang.System[]) null, x10.rtt.Types.ANY)));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final java.lang.Object x$105270 = ((java.lang.Object)(((java.lang.Object)
                                                                dummy_data)));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ((x10.lang.Cell<java.lang.Object>)me).value = ((java.lang.Object)(x$105270));
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.core.GlobalRef me2 = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.lang.Cell<java.lang.Object>>(x10.rtt.ParameterizedType.make(x10.lang.Cell.$RTT, x10.rtt.Types.ANY), me, (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
        {
            
            //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.Runtime.runAt(((x10.lang.Place)(place)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.FinishResilient.$Closure$73(body, me2, (x10.lang.FinishResilient.$Closure$73.__0$1x10$lang$Any$2__1$1x10$lang$Cell$1x10$lang$Any$2$2) null))), ((x10.lang.Runtime.Profile)(prof)));
        }
        
        //#line 48 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final java.lang.Object t$105437 = ((java.lang.Object)(((x10.lang.Cell<java.lang.Object>)me).value));
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105443 = x10.rtt.Equality.equalsequals((t$105437),(dummy_data));
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105443) {
            
            //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105438 = x10.lang.FinishResilient.get$verbose();
            
            //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105439 = ((t$105438) >= (((long)(1L))));
            
            //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105439) {
                
                //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("FinishResilient.evalAt returns no result, target place may be dead")));
            }
            
            //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final long t$105440 = place.id;
            
            //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final boolean t$105442 = x10.x10rt.X10RT.isPlaceDead((int)((long)(t$105440)));
            
            //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105442) {
                
                //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.lang.DeadPlaceException t$105441 = ((x10.lang.DeadPlaceException)(new x10.lang.DeadPlaceException(((x10.lang.Place)(place)))));
                
                //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                throw t$105441;
            } else {
                
                //#line 55 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
                final java.lang.Object x$105278 = ((java.lang.Object)(((java.lang.Object)
                                                                        (null))));
                
                //#line 55 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
                ((x10.lang.Cell<java.lang.Object>)me).value = ((java.lang.Object)(((java.lang.Object)(null))));
            }
        }
        
        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final java.lang.Object result = ((java.lang.Object)(((x10.lang.Cell<java.lang.Object>)me).value));
        
        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105444 = x10.lang.FinishResilient.get$verbose();
        
        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105447 = ((t$105444) >= (((long)(1L))));
        
        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105447) {
            
            //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105445 = (("FinishResilient.evalAt returning result=") + (result));
            
            //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105446 = ((t$105445) + (" (remotely executed)"));
            
            //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105446)));
        }
        
        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        return result;
    }
    
    
    //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    public static boolean lowLevelSend$O(final x10.lang.Place dst, final x10.core.fun.VoidFun_0_0 cl) {
        
        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105448 = x10.lang.FinishResilient.get$verbose();
        
        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105458 = ((t$105448) >= (((long)(4L))));
        
        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105458) {
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105449 = dst.id;
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105450 = (("----lowLevelSend called, dst.id=") + ((x10.core.Long.$box(t$105449))));
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105451 = ((t$105450) + (" ("));
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105452 = x10.lang.Place.place(x10.x10rt.X10RT.here()).id;
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105453 = ((t$105451) + ((x10.core.Long.$box(t$105452))));
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105454 = ((t$105453) + ("->"));
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105455 = dst.id;
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105456 = ((t$105454) + ((x10.core.Long.$box(t$105455))));
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105457 = ((t$105456) + (")"));
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105457)));
        }
        
        //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105463 = x10.rtt.Equality.equalsequals((x10.lang.Place.place(x10.x10rt.X10RT.here())),(dst));
        
        //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105463) {
            
            //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105459 = x10.lang.FinishResilient.get$verbose();
            
            //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105460 = ((t$105459) >= (((long)(4L))));
            
            //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105460) {
                
                //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelSend locally calling cl()")));
            }
            
            //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ((x10.core.fun.VoidFun_0_0)cl).$apply();
            
            //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105461 = x10.lang.FinishResilient.get$verbose();
            
            //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105462 = ((t$105461) >= (((long)(4L))));
            
            //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105462) {
                
                //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelSend locally executed, returning true")));
            }
            
            //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            return true;
        }
        
        //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105464 = x10.lang.FinishResilient.get$verbose();
        
        //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105465 = ((t$105464) >= (((long)(4L))));
        
        //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105465) {
            
            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelSend remote execution")));
        }
        
        //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$105466 = dst.id;
        
        //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final boolean t$105469 = x10.x10rt.X10RT.isPlaceDead((int)((long)(t$105466)));
        
        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105469) {
            
            //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105467 = x10.lang.FinishResilient.get$verbose();
            
            //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105468 = ((t$105467) >= (((long)(4L))));
            
            //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105468) {
                
                //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelSend returning false")));
            }
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            return false;
        }
        
        //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long id$105281 = dst.id;
        
        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.core.fun.VoidFun_0_0 t$105474 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.FinishResilient.$Closure_finish_resilient_low_level_send_out(cl)));
        
        //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.fun.VoidFun_0_0 msgBody$105282 = ((x10.core.fun.VoidFun_0_0)(((x10.core.fun.VoidFun_0_0)
                                                                                      t$105474)));
        
        //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Profile prof$105283 = ((x10.lang.Runtime.Profile)(((x10.lang.Runtime.Profile)
                                                                                   (null))));
        
        //#line 77 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(id$105281))), msgBody$105282, ((x10.lang.Runtime.Profile)(null)), null);
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105475 = x10.lang.FinishResilient.get$verbose();
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105476 = ((t$105475) >= (((long)(4L))));
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105476) {
            
            //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelSend returning true")));
        }
        
        //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        return true;
    }
    
    
    //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    public static boolean lowLevelAt$O(final x10.lang.Place dst, final x10.core.fun.VoidFun_0_0 cl) {
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105477 = x10.lang.FinishResilient.get$verbose();
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105487 = ((t$105477) >= (((long)(4L))));
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105487) {
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105478 = dst.id;
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105479 = (("----lowLevelAt called, dst.id=") + ((x10.core.Long.$box(t$105478))));
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105480 = ((t$105479) + (" ("));
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105481 = x10.lang.Place.place(x10.x10rt.X10RT.here()).id;
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105482 = ((t$105480) + ((x10.core.Long.$box(t$105481))));
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105483 = ((t$105482) + ("->"));
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105484 = dst.id;
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105485 = ((t$105483) + ((x10.core.Long.$box(t$105484))));
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105486 = ((t$105485) + (")"));
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105486)));
        }
        
        //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105492 = x10.rtt.Equality.equalsequals((x10.lang.Place.place(x10.x10rt.X10RT.here())),(dst));
        
        //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105492) {
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105488 = x10.lang.FinishResilient.get$verbose();
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105489 = ((t$105488) >= (((long)(4L))));
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105489) {
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelAt locally calling cl()")));
            }
            
            //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ((x10.core.fun.VoidFun_0_0)cl).$apply();
            
            //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105490 = x10.lang.FinishResilient.get$verbose();
            
            //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105491 = ((t$105490) >= (((long)(4L))));
            
            //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105491) {
                
                //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelAt locally executed, returning true")));
            }
            
            //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            return true;
        }
        
        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.lang.Cell alloc$98953 = ((x10.lang.Cell)(new x10.lang.Cell<java.lang.RuntimeException>((java.lang.System[]) null, x10.rtt.Types.EXCEPTION)));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final java.lang.RuntimeException x$105286 = ((java.lang.RuntimeException)(((java.lang.RuntimeException)
                                                                                    (null))));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ((x10.lang.Cell<java.lang.RuntimeException>)alloc$98953).value = ((java.lang.RuntimeException)(((java.lang.RuntimeException)(null))));
        
        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.core.GlobalRef exc = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>>(x10.rtt.ParameterizedType.make(x10.lang.Cell.$RTT, x10.rtt.Types.EXCEPTION), alloc$98953, (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.core.concurrent.AtomicBoolean t$105493 = ((x10.core.concurrent.AtomicBoolean)(new x10.core.concurrent.AtomicBoolean()));
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.core.GlobalRef done = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>(x10.core.concurrent.AtomicBoolean.$RTT, t$105493, (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
        
        //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105494 = x10.lang.FinishResilient.get$verbose();
        
        //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105495 = ((t$105494) >= (((long)(4L))));
        
        //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105495) {
            
            //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelAt remote execution")));
        }
        
        //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long id$105290 = dst.id;
        
        //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.core.fun.VoidFun_0_0 t$105518 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.FinishResilient.$Closure_finish_resilient_low_level_at_out(cl, done, exc, (x10.lang.FinishResilient.$Closure_finish_resilient_low_level_at_out.__1$1x10$util$concurrent$AtomicBoolean$2__2$1x10$lang$Cell$1x10$lang$Exception$2$2) null)));
        
        //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.fun.VoidFun_0_0 msgBody$105291 = ((x10.core.fun.VoidFun_0_0)(((x10.core.fun.VoidFun_0_0)
                                                                                      t$105518)));
        
        //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Profile prof$105292 = ((x10.lang.Runtime.Profile)(((x10.lang.Runtime.Profile)
                                                                                   (null))));
        
        //#line 77 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(id$105290))), msgBody$105291, ((x10.lang.Runtime.Profile)(null)), null);
        
        //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105519 = x10.lang.FinishResilient.get$verbose();
        
        //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105520 = ((t$105519) >= (((long)(4L))));
        
        //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105520) {
            
            //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelAt waiting for done-flag")));
        }
        
        //#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.core.concurrent.AtomicBoolean t$105521 = ((x10.core.concurrent.AtomicBoolean)((((x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>)(done))).$apply$G()));
        
        //#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105522 = t$105521.get();
        
        //#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105544 = !(t$105522);
        
        //#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105544) {
            
            //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$105638 = x10.lang.Runtime.get$STATIC_THREADS();
            
            //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$105639 = !(t$105638);
            
            //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$105639) {
                
                //#line 1540 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Pool t$105640 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                
                //#line 1540 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$105640.increase();
            }
            
            //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            boolean t$105641 = false;
            
            //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            do  {
                
                //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final long t$105630 = x10.lang.FinishResilient.get$verbose();
                
                //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final boolean t$105631 = ((t$105630) >= (((long)(9L))));
                
                //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                if (t$105631) {
                    
                    //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelAt calling x10rtProbe")));
                }
                
                //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.runtime.impl.java.Runtime.eventProbe();
                
                //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final long t$105632 = x10.lang.FinishResilient.get$verbose();
                
                //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final boolean t$105633 = ((t$105632) >= (((long)(9L))));
                
                //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                if (t$105633) {
                    
                    //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelAt returned from x10rtProbe")));
                }
                
                //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
                final long t$105634 = dst.id;
                
                //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
                final boolean t$105635 = x10.x10rt.X10RT.isPlaceDead((int)((long)(t$105634)));
                
                //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                if (t$105635) {
                    
                    //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final boolean t$105627 = x10.lang.Runtime.get$STATIC_THREADS();
                    
                    //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final boolean t$105628 = !(t$105627);
                    
                    //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (t$105628) {
                        
                        //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Runtime.Pool t$105629 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                        
                        //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        t$105629.decrease((int)(1));
                    }
                    
                    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final long t$105636 = x10.lang.FinishResilient.get$verbose();
                    
                    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final boolean t$105637 = ((t$105636) >= (((long)(4L))));
                    
                    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    if (t$105637) {
                        
                        //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                        x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelAt returning false")));
                    }
                    
                    //#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    return false;
                }
                
                //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.core.concurrent.AtomicBoolean t$105642 = ((x10.core.concurrent.AtomicBoolean)((((x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>)(done))).$apply$G()));
                
                //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final boolean t$105643 = t$105642.get();
                
                //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final boolean t$105644 = !(t$105643);
                
                //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                t$105641 = t$105644;
            }while(t$105641); 
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$105645 = x10.lang.Runtime.get$STATIC_THREADS();
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$105646 = !(t$105645);
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$105646) {
                
                //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Pool t$105647 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                
                //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$105647.decrease((int)(1));
            }
        }
        
        //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105545 = x10.lang.FinishResilient.get$verbose();
        
        //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105546 = ((t$105545) >= (((long)(4L))));
        
        //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105546) {
            
            //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelAt returned from waiting loop")));
        }
        
        //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.lang.Cell this$105303 = ((x10.lang.Cell)((((x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>>)(exc))).$apply$G()));
        
        //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final java.lang.RuntimeException t = ((java.lang.RuntimeException)(((x10.lang.Cell<java.lang.RuntimeException>)this$105303).value));
        
        //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105550 = ((t) != (null));
        
        //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105550) {
            
            //#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105547 = x10.lang.FinishResilient.get$verbose();
            
            //#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105549 = ((t$105547) >= (((long)(4L))));
            
            //#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105549) {
                
                //#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final java.lang.String t$105548 = (("----lowLevelAt throwing exception ") + (t));
                
                //#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)(t$105548)));
            }
            
            //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            throw t;
        }
        
        //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105551 = x10.lang.FinishResilient.get$verbose();
        
        //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105552 = ((t$105551) >= (((long)(4L))));
        
        //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105552) {
            
            //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelAt returning true")));
        }
        
        //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        return true;
    }
    
    
    //#line 332 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    public static <$T>boolean lowLevelFetch__1$1x10$lang$FinishResilient$$T$2__2$1x10$lang$FinishResilient$$T$2$O(final x10.rtt.Type $T, final x10.lang.Place dst, final x10.lang.Cell<$T> result, final x10.core.fun.Fun_0_0<$T> cl) {
        
        //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105553 = x10.lang.FinishResilient.get$verbose();
        
        //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105563 = ((t$105553) >= (((long)(4L))));
        
        //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105563) {
            
            //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105554 = dst.id;
            
            //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105555 = (("----lowLevelFetch called, dst.id=") + ((x10.core.Long.$box(t$105554))));
            
            //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105556 = ((t$105555) + (" ("));
            
            //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105557 = x10.lang.Place.place(x10.x10rt.X10RT.here()).id;
            
            //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105558 = ((t$105556) + ((x10.core.Long.$box(t$105557))));
            
            //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105559 = ((t$105558) + ("->"));
            
            //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105560 = dst.id;
            
            //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105561 = ((t$105559) + ((x10.core.Long.$box(t$105560))));
            
            //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final java.lang.String t$105562 = ((t$105561) + (")"));
            
            //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105562)));
        }
        
        //#line 334 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105568 = x10.rtt.Equality.equalsequals((x10.lang.Place.place(x10.x10rt.X10RT.here())),(dst));
        
        //#line 334 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105568) {
            
            //#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105564 = x10.lang.FinishResilient.get$verbose();
            
            //#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105565 = ((t$105564) >= (((long)(4L))));
            
            //#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105565) {
                
                //#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelFetch locally calling cl()")));
            }
            
            //#line 55 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            final $T x$105304 = (($T)(((x10.core.fun.Fun_0_0<$T>)cl).$apply$G()));
            
            //#line 55 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            ((x10.lang.Cell<$T>)result).value = (($T)(x$105304));
            
            //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105566 = x10.lang.FinishResilient.get$verbose();
            
            //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105567 = ((t$105566) >= (((long)(4L))));
            
            //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105567) {
                
                //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelFetch locally executed, returning true")));
            }
            
            //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            return true;
        }
        
        //#line 342 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.lang.Cell alloc$98954 = ((x10.lang.Cell)(new x10.lang.Cell<java.lang.RuntimeException>((java.lang.System[]) null, x10.rtt.Types.EXCEPTION)));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final java.lang.RuntimeException x$105307 = ((java.lang.RuntimeException)(((java.lang.RuntimeException)
                                                                                    (null))));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ((x10.lang.Cell<java.lang.RuntimeException>)alloc$98954).value = ((java.lang.RuntimeException)(((java.lang.RuntimeException)(null))));
        
        //#line 342 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.core.GlobalRef exc = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>>(x10.rtt.ParameterizedType.make(x10.lang.Cell.$RTT, x10.rtt.Types.EXCEPTION), alloc$98954, (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
        
        //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.core.concurrent.AtomicBoolean t$105569 = ((x10.core.concurrent.AtomicBoolean)(new x10.core.concurrent.AtomicBoolean(((boolean)(false)))));
        
        //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.core.GlobalRef done = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>(x10.core.concurrent.AtomicBoolean.$RTT, t$105569, (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
        
        //#line 344 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.core.GlobalRef gresult = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.lang.Cell<$T>>(x10.rtt.ParameterizedType.make(x10.lang.Cell.$RTT, $T), result, (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
        
        //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105570 = x10.lang.FinishResilient.get$verbose();
        
        //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105571 = ((t$105570) >= (((long)(4L))));
        
        //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105571) {
            
            //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelFetch remote execution")));
        }
        
        //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long id$105311 = dst.id;
        
        //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.core.fun.VoidFun_0_0 t$105592 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_out<$T>($T, cl, done, gresult, exc, (x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_out.$_995cc017) null)));
        
        //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.fun.VoidFun_0_0 msgBody$105312 = ((x10.core.fun.VoidFun_0_0)(((x10.core.fun.VoidFun_0_0)
                                                                                      t$105592)));
        
        //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Profile prof$105313 = ((x10.lang.Runtime.Profile)(((x10.lang.Runtime.Profile)
                                                                                   (null))));
        
        //#line 77 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(id$105311))), msgBody$105312, ((x10.lang.Runtime.Profile)(null)), null);
        
        //#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105593 = x10.lang.FinishResilient.get$verbose();
        
        //#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105594 = ((t$105593) >= (((long)(4L))));
        
        //#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105594) {
            
            //#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelFetch waiting for done-flag")));
        }
        
        //#line 370 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.core.concurrent.AtomicBoolean t$105595 = ((x10.core.concurrent.AtomicBoolean)((((x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>)(done))).$apply$G()));
        
        //#line 370 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105596 = t$105595.get();
        
        //#line 370 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105618 = !(t$105596);
        
        //#line 370 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105618) {
            
            //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$105659 = x10.lang.Runtime.get$STATIC_THREADS();
            
            //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$105660 = !(t$105659);
            
            //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$105660) {
                
                //#line 1540 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Pool t$105661 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                
                //#line 1540 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$105661.increase();
            }
            
            //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            boolean t$105662 = false;
            
            //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            do  {
                
                //#line 373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final long t$105651 = x10.lang.FinishResilient.get$verbose();
                
                //#line 373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final boolean t$105652 = ((t$105651) >= (((long)(9L))));
                
                //#line 373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                if (t$105652) {
                    
                    //#line 373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelFetch calling x10rtProbe")));
                }
                
                //#line 374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.runtime.impl.java.Runtime.eventProbe();
                
                //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final long t$105653 = x10.lang.FinishResilient.get$verbose();
                
                //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final boolean t$105654 = ((t$105653) >= (((long)(9L))));
                
                //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                if (t$105654) {
                    
                    //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelFetch returned from x10rtProbe")));
                }
                
                //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
                final long t$105655 = dst.id;
                
                //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
                final boolean t$105656 = x10.x10rt.X10RT.isPlaceDead((int)((long)(t$105655)));
                
                //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                if (t$105656) {
                    
                    //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final boolean t$105648 = x10.lang.Runtime.get$STATIC_THREADS();
                    
                    //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final boolean t$105649 = !(t$105648);
                    
                    //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (t$105649) {
                        
                        //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Runtime.Pool t$105650 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                        
                        //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        t$105650.decrease((int)(1));
                    }
                    
                    //#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final long t$105657 = x10.lang.FinishResilient.get$verbose();
                    
                    //#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final boolean t$105658 = ((t$105657) >= (((long)(4L))));
                    
                    //#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    if (t$105658) {
                        
                        //#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                        x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelFetch returning false")));
                    }
                    
                    //#line 380 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    return false;
                }
                
                //#line 382 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.core.concurrent.AtomicBoolean t$105663 = ((x10.core.concurrent.AtomicBoolean)((((x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>)(done))).$apply$G()));
                
                //#line 382 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final boolean t$105664 = t$105663.get();
                
                //#line 382 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final boolean t$105665 = !(t$105664);
                
                //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                t$105662 = t$105665;
            }while(t$105662); 
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$105666 = x10.lang.Runtime.get$STATIC_THREADS();
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$105667 = !(t$105666);
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$105667) {
                
                //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Pool t$105668 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                
                //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$105668.decrease((int)(1));
            }
        }
        
        //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105619 = x10.lang.FinishResilient.get$verbose();
        
        //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105620 = ((t$105619) >= (((long)(4L))));
        
        //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105620) {
            
            //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelFetch returned from waiting loop")));
        }
        
        //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final x10.lang.Cell this$105324 = ((x10.lang.Cell)((((x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>>)(exc))).$apply$G()));
        
        //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final java.lang.RuntimeException t = ((java.lang.RuntimeException)(((x10.lang.Cell<java.lang.RuntimeException>)this$105324).value));
        
        //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105624 = ((t) != (null));
        
        //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105624) {
            
            //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105621 = x10.lang.FinishResilient.get$verbose();
            
            //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105623 = ((t$105621) >= (((long)(4L))));
            
            //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105623) {
                
                //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final java.lang.String t$105622 = (("----lowLevelFetch throwing exception ") + (t));
                
                //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)(t$105622)));
            }
            
            //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            throw t;
        }
        
        //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final long t$105625 = x10.lang.FinishResilient.get$verbose();
        
        //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        final boolean t$105626 = ((t$105625) >= (((long)(4L))));
        
        //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (t$105626) {
            
            //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelFetch returning true")));
        }
        
        //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        return true;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    final public x10.lang.FinishResilient x10$lang$FinishResilient$$this$x10$lang$FinishResilient() {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        return x10.lang.FinishResilient.this;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    
    // constructor for non-virtual call
    final public x10.lang.FinishResilient x10$lang$FinishResilient$$init$S() {
         {
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final x10.lang.FinishState this$105325 = this;
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final x10.lang.FinishResilient this$105669 = this;
        }
        return this;
    }
    
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    final public void __fieldInitializers_x10_lang_FinishResilient() {
        
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$verbose = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$verbose;
    
    public static long get$verbose() {
        if (((int) x10.lang.FinishResilient.initStatus$verbose.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.FinishResilient.verbose;
        }
        if (((int) x10.lang.FinishResilient.initStatus$verbose.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.FinishResilient.exception$verbose;
        }
        if (x10.lang.FinishResilient.initStatus$verbose.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.FinishResilient.verbose = x10.lang.FinishResilient.getEnvLong$O(((java.lang.String)("X10_RESILIENT_VERBOSE")));
            }}catch (java.lang.Throwable exc$105678) {
                x10.lang.FinishResilient.exception$verbose = new x10.lang.ExceptionInInitializer(exc$105678);
                x10.lang.FinishResilient.initStatus$verbose.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.FinishResilient.exception$verbose;
            }
            x10.lang.FinishResilient.initStatus$verbose.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.FinishResilient.initStatus$verbose.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.FinishResilient.initStatus$verbose.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.FinishResilient.initStatus$verbose.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.FinishResilient.exception$verbose;
                }
            }
        }
        return x10.lang.FinishResilient.verbose;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure_finish_resilient_run_at_1 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure_finish_resilient_run_at_1> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure_finish_resilient_run_at_1> make($Closure_finish_resilient_run_at_1.class,
                                                                                new x10.rtt.Type[] {
                                                                                    x10.core.fun.VoidFun_0_0.$RTT
                                                                                });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilient.$Closure_finish_resilient_run_at_1 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.cpGref = $deserializer.readObject();
            $_obj.clockPhases = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilient.$Closure_finish_resilient_run_at_1 $_obj = new x10.lang.FinishResilient.$Closure_finish_resilient_run_at_1((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.cpGref);
            $serializer.write(this.clockPhases);
            
        }
        
        // constructor just for allocation
        public $Closure_finish_resilient_run_at_1(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Cell$1x10$lang$Activity$ClockPhases$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final x10.core.GlobalRef gref = ((x10.core.GlobalRef)(((x10.core.GlobalRef)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.rtt.ParameterizedType.make(x10.lang.Cell.$RTT, x10.lang.Activity.ClockPhases.$RTT)),this.cpGref))));
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final x10.lang.Cell cell = ((x10.lang.Cell)((((x10.core.GlobalRef<x10.lang.Cell<x10.lang.Activity.ClockPhases>>)(gref))).$apply$G()));
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ((x10.lang.Cell<x10.lang.Activity.ClockPhases>)cell).set__0x10$lang$Cell$$T$G(((x10.lang.Activity.ClockPhases)(this.clockPhases)));
        }
        
        public x10.core.GlobalRef<x10.lang.Cell<x10.lang.Activity.ClockPhases>> cpGref;
        public x10.lang.Activity.ClockPhases clockPhases;
        
        public $Closure_finish_resilient_run_at_1(final x10.core.GlobalRef<x10.lang.Cell<x10.lang.Activity.ClockPhases>> cpGref, final x10.lang.Activity.ClockPhases clockPhases, __0$1x10$lang$Cell$1x10$lang$Activity$ClockPhases$2$2 $dummy) {
             {
                this.cpGref = ((x10.core.GlobalRef)(cpGref));
                this.clockPhases = ((x10.lang.Activity.ClockPhases)(clockPhases));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$71 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$71> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$71> make($Closure$71.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilient.$Closure$71 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.clockPhases = $deserializer.readObject();
            $_obj.tmp_finish = $deserializer.readObject();
            $_obj.home = $deserializer.readObject();
            $_obj.body = $deserializer.readObject();
            $_obj.cpGref = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilient.$Closure$71 $_obj = new x10.lang.FinishResilient.$Closure$71((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.clockPhases);
            $serializer.write(this.tmp_finish);
            $serializer.write(this.home);
            $serializer.write(this.body);
            $serializer.write(this.cpGref);
            
        }
        
        // constructor just for allocation
        public $Closure$71(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __4$1x10$lang$Cell$1x10$lang$Activity$ClockPhases$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final x10.lang.Activity remoteActivity = x10.lang.Runtime.activity();
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            remoteActivity.clockPhases = ((x10.lang.Activity.ClockPhases)(this.clockPhases));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105408 = this.tmp_finish.notifyActivityCreation$O(((x10.lang.Place)(this.home)));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105408) {
                
                //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                try {{
                    
                    //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    try {{
                        
                        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                        ((x10.core.fun.VoidFun_0_0)this.body).$apply();
                    }}catch (final x10.lang.Runtime.AtCheckedWrapper e) {
                        
                        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                        final java.lang.Throwable t$105405 = e.getCause();
                        
                        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                        throw t$105405;
                    }
                }}catch (final java.lang.Throwable t) {
                    
                    //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final java.lang.RuntimeException e = x10.rtt.Types.EXCEPTION.isInstance(t) ? (java.lang.RuntimeException)(t) : new x10.lang.WrappedThrowable(t);
                    
                    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    this.tmp_finish.pushException(((java.lang.RuntimeException)(e)));
                }
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.core.fun.VoidFun_0_0 cl1 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.FinishResilient.$Closure_finish_resilient_run_at_1(((x10.core.GlobalRef<x10.lang.Cell<x10.lang.Activity.ClockPhases>>)(this.cpGref)), ((x10.lang.Activity.ClockPhases)(this.clockPhases)), (x10.lang.FinishResilient.$Closure_finish_resilient_run_at_1.__0$1x10$lang$Cell$1x10$lang$Activity$ClockPhases$2$2) null)));
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.lang.Place t$105406 = ((x10.lang.Place)((this.cpGref).home));
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final long t$105407 = t$105406.id;
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.Runtime.x10rtSendMessage((long)(t$105407), ((x10.core.fun.VoidFun_0_0)(cl1)), ((x10.lang.Runtime.Profile)(null)));
                
                //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.Unsafe.<x10.core.fun.VoidFun_0_0> dealloc__0x10$lang$Unsafe$$T(x10.core.fun.VoidFun_0_0.$RTT, ((x10.core.fun.VoidFun_0_0)(cl1)));
                
                //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                this.tmp_finish.notifyActivityTermination();
            }
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            remoteActivity.clockPhases = null;
        }
        
        public x10.lang.Activity.ClockPhases clockPhases;
        public x10.lang.FinishState tmp_finish;
        public x10.lang.Place home;
        public x10.core.fun.VoidFun_0_0 body;
        public x10.core.GlobalRef<x10.lang.Cell<x10.lang.Activity.ClockPhases>> cpGref;
        
        public $Closure$71(final x10.lang.Activity.ClockPhases clockPhases, final x10.lang.FinishState tmp_finish, final x10.lang.Place home, final x10.core.fun.VoidFun_0_0 body, final x10.core.GlobalRef<x10.lang.Cell<x10.lang.Activity.ClockPhases>> cpGref, __4$1x10$lang$Cell$1x10$lang$Activity$ClockPhases$2$2 $dummy) {
             {
                this.clockPhases = ((x10.lang.Activity.ClockPhases)(clockPhases));
                this.tmp_finish = ((x10.lang.FinishState)(tmp_finish));
                this.home = ((x10.lang.Place)(home));
                this.body = ((x10.core.fun.VoidFun_0_0)(body));
                this.cpGref = ((x10.core.GlobalRef)(cpGref));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure_fiish_resilient_run_at extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure_fiish_resilient_run_at> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure_fiish_resilient_run_at> make($Closure_fiish_resilient_run_at.class,
                                                                             new x10.rtt.Type[] {
                                                                                 x10.core.fun.VoidFun_0_0.$RTT
                                                                             });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilient.$Closure_fiish_resilient_run_at $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.clockPhases = $deserializer.readObject();
            $_obj.tmp_finish = $deserializer.readObject();
            $_obj.home = $deserializer.readObject();
            $_obj.body = $deserializer.readObject();
            $_obj.cpGref = $deserializer.readObject();
            $_obj.real_finish = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilient.$Closure_fiish_resilient_run_at $_obj = new x10.lang.FinishResilient.$Closure_fiish_resilient_run_at((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.clockPhases);
            $serializer.write(this.tmp_finish);
            $serializer.write(this.home);
            $serializer.write(this.body);
            $serializer.write(this.cpGref);
            $serializer.write(this.real_finish);
            
        }
        
        // constructor just for allocation
        public $Closure_fiish_resilient_run_at(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __4$1x10$lang$Cell$1x10$lang$Activity$ClockPhases$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final x10.lang.Activity alloc$98952 = ((x10.lang.Activity)(new x10.lang.Activity((java.lang.System[]) null)));
            {
                
                //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.core.fun.VoidFun_0_0 t$105409 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.FinishResilient.$Closure$71(((x10.lang.Activity.ClockPhases)(this.clockPhases)), ((x10.lang.FinishState)(this.tmp_finish)), this.home, ((x10.core.fun.VoidFun_0_0)(this.body)), ((x10.core.GlobalRef<x10.lang.Cell<x10.lang.Activity.ClockPhases>>)(this.cpGref)), (x10.lang.FinishResilient.$Closure$71.__4$1x10$lang$Cell$1x10$lang$Activity$ClockPhases$2$2) null)));
                
                //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                alloc$98952.x10$lang$Activity$$init$S(((x10.core.fun.VoidFun_0_0)(t$105409)), ((x10.lang.Place)(this.home)), ((x10.lang.FinishState)(this.real_finish)), ((boolean)(false)), ((boolean)(false)));
            }
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.lang.Runtime.execute(((x10.lang.Activity)(alloc$98952)));
        }
        
        public x10.lang.Activity.ClockPhases clockPhases;
        public x10.lang.FinishState tmp_finish;
        public x10.lang.Place home;
        public x10.core.fun.VoidFun_0_0 body;
        public x10.core.GlobalRef<x10.lang.Cell<x10.lang.Activity.ClockPhases>> cpGref;
        public x10.lang.FinishResilient real_finish;
        
        public $Closure_fiish_resilient_run_at(final x10.lang.Activity.ClockPhases clockPhases, final x10.lang.FinishState tmp_finish, final x10.lang.Place home, final x10.core.fun.VoidFun_0_0 body, final x10.core.GlobalRef<x10.lang.Cell<x10.lang.Activity.ClockPhases>> cpGref, final x10.lang.FinishResilient real_finish, __4$1x10$lang$Cell$1x10$lang$Activity$ClockPhases$2$2 $dummy) {
             {
                this.clockPhases = ((x10.lang.Activity.ClockPhases)(clockPhases));
                this.tmp_finish = ((x10.lang.FinishState)(tmp_finish));
                this.home = ((x10.lang.Place)(home));
                this.body = ((x10.core.fun.VoidFun_0_0)(body));
                this.cpGref = ((x10.core.GlobalRef)(cpGref));
                this.real_finish = ((x10.lang.FinishResilient)(real_finish));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$72 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$72> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$72> make($Closure$72.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilient.$Closure$72 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.me2 = $deserializer.readObject();
            $_obj.r = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilient.$Closure$72 $_obj = new x10.lang.FinishResilient.$Closure$72((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.me2);
            $serializer.write(this.r);
            
        }
        
        // constructor just for allocation
        public $Closure$72(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Cell$1x10$lang$Any$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            try {{
                
                //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.lang.Cell this$105275 = ((x10.lang.Cell)((((x10.core.GlobalRef<x10.lang.Cell<java.lang.Object>>)(this.me2))).$apply$G()));
                
                //#line 55 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
                final java.lang.Object x$105274 = ((java.lang.Object)(this.r));
                
                //#line 55 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
                ((x10.lang.Cell<java.lang.Object>)this$105275).value = ((java.lang.Object)(x$105274));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.core.GlobalRef<x10.lang.Cell<java.lang.Object>> me2;
        public java.lang.Object r;
        
        public $Closure$72(final x10.core.GlobalRef<x10.lang.Cell<java.lang.Object>> me2, final java.lang.Object r, __0$1x10$lang$Cell$1x10$lang$Any$2$2 $dummy) {
             {
                this.me2 = ((x10.core.GlobalRef)(me2));
                this.r = ((java.lang.Object)(r));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$73 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$73> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$73> make($Closure$73.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilient.$Closure$73 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.body = $deserializer.readObject();
            $_obj.me2 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilient.$Closure$73 $_obj = new x10.lang.FinishResilient.$Closure$73((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.body);
            $serializer.write(this.me2);
            
        }
        
        // constructor just for allocation
        public $Closure$73(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Any$2__1$1x10$lang$Cell$1x10$lang$Any$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            try {{
                
                //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final java.lang.Object r = ((x10.core.fun.Fun_0_0<java.lang.Object>)this.body).$apply$G();
                
                //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.lang.Place t$105436 = ((x10.lang.Place)((this.me2).home));
                {
                    
                    //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    x10.lang.Runtime.runAt(((x10.lang.Place)(t$105436)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.FinishResilient.$Closure$72(((x10.core.GlobalRef<x10.lang.Cell<java.lang.Object>>)(this.me2)), r, (x10.lang.FinishResilient.$Closure$72.__0$1x10$lang$Cell$1x10$lang$Any$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.core.fun.Fun_0_0<java.lang.Object> body;
        public x10.core.GlobalRef<x10.lang.Cell<java.lang.Object>> me2;
        
        public $Closure$73(final x10.core.fun.Fun_0_0<java.lang.Object> body, final x10.core.GlobalRef<x10.lang.Cell<java.lang.Object>> me2, __0$1x10$lang$Any$2__1$1x10$lang$Cell$1x10$lang$Any$2$2 $dummy) {
             {
                this.body = ((x10.core.fun.Fun_0_0)(body));
                this.me2 = ((x10.core.GlobalRef)(me2));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure_finish_resilient_low_level_send_out extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure_finish_resilient_low_level_send_out> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure_finish_resilient_low_level_send_out> make($Closure_finish_resilient_low_level_send_out.class,
                                                                                          new x10.rtt.Type[] {
                                                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilient.$Closure_finish_resilient_low_level_send_out $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.cl = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilient.$Closure_finish_resilient_low_level_send_out $_obj = new x10.lang.FinishResilient.$Closure_finish_resilient_low_level_send_out((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.cl);
            
        }
        
        // constructor just for allocation
        public $Closure_finish_resilient_low_level_send_out(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105470 = x10.lang.FinishResilient.get$verbose();
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105471 = ((t$105470) >= (((long)(4L))));
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105471) {
                
                //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelSend(remote) calling cl()")));
            }
            
            //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ((x10.core.fun.VoidFun_0_0)this.cl).$apply();
            
            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105472 = x10.lang.FinishResilient.get$verbose();
            
            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105473 = ((t$105472) >= (((long)(4L))));
            
            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105473) {
                
                //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelSend(remote) returned from cl()")));
            }
        }
        
        public x10.core.fun.VoidFun_0_0 cl;
        
        public $Closure_finish_resilient_low_level_send_out(final x10.core.fun.VoidFun_0_0 cl) {
             {
                this.cl = ((x10.core.fun.VoidFun_0_0)(cl));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure_finish_resilient_low_level_at_back extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure_finish_resilient_low_level_at_back> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure_finish_resilient_low_level_at_back> make($Closure_finish_resilient_low_level_at_back.class,
                                                                                         new x10.rtt.Type[] {
                                                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilient.$Closure_finish_resilient_low_level_at_back $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.done = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilient.$Closure_finish_resilient_low_level_at_back $_obj = new x10.lang.FinishResilient.$Closure_finish_resilient_low_level_at_back((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.done);
            
        }
        
        // constructor just for allocation
        public $Closure_finish_resilient_low_level_at_back(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$util$concurrent$AtomicBoolean$2 {}
        
    
        
        public void $apply() {
            
            //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105501 = x10.lang.FinishResilient.get$verbose();
            
            //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105502 = ((t$105501) >= (((long)(4L))));
            
            //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105502) {
                
                //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelAt(home) setting done-flag")));
            }
            
            //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final x10.core.concurrent.AtomicBoolean t$105503 = ((x10.core.concurrent.AtomicBoolean)(x10.core.GlobalRef.LocalEval.<x10.core.concurrent.AtomicBoolean>getLocalOrCopy(x10.core.concurrent.AtomicBoolean.$RTT,((x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>)(this.done)))));
            
            //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.runtime.impl.java.EvalUtils.eval(t$105503.getAndSet(((boolean)(true))));
        }
        
        public x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean> done;
        
        public $Closure_finish_resilient_low_level_at_back(final x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean> done, __0$1x10$util$concurrent$AtomicBoolean$2 $dummy) {
             {
                this.done = ((x10.core.GlobalRef)(done));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure_finish_resilient_low_level_at_back_exc extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure_finish_resilient_low_level_at_back_exc> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure_finish_resilient_low_level_at_back_exc> make($Closure_finish_resilient_low_level_at_back_exc.class,
                                                                                             new x10.rtt.Type[] {
                                                                                                 x10.core.fun.VoidFun_0_0.$RTT
                                                                                             });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilient.$Closure_finish_resilient_low_level_at_back_exc $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.exc = $deserializer.readObject();
            $_obj.t = $deserializer.readObject();
            $_obj.done = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilient.$Closure_finish_resilient_low_level_at_back_exc $_obj = new x10.lang.FinishResilient.$Closure_finish_resilient_low_level_at_back_exc((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.exc);
            $serializer.write(this.t);
            $serializer.write(this.done);
            
        }
        
        // constructor just for allocation
        public $Closure_finish_resilient_low_level_at_back_exc(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Cell$1x10$lang$Exception$2$2__2$1x10$util$concurrent$AtomicBoolean$2 {}
        
    
        
        public void $apply() {
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105510 = x10.lang.FinishResilient.get$verbose();
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105511 = ((t$105510) >= (((long)(4L))));
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105511) {
                
                //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelAt(home) setting exc and done-flag")));
            }
            
            //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final x10.lang.Cell t$105512 = ((x10.lang.Cell)(x10.core.GlobalRef.LocalEval.<x10.lang.Cell<java.lang.RuntimeException>>getLocalOrCopy(x10.rtt.ParameterizedType.make(x10.lang.Cell.$RTT, x10.rtt.Types.EXCEPTION),((x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>>)(this.exc)))));
            
            //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ((x10.lang.Cell<java.lang.RuntimeException>)t$105512).$apply__0x10$lang$Cell$$T(((java.lang.RuntimeException)(this.t)));
            
            //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final x10.core.concurrent.AtomicBoolean t$105513 = ((x10.core.concurrent.AtomicBoolean)(x10.core.GlobalRef.LocalEval.<x10.core.concurrent.AtomicBoolean>getLocalOrCopy(x10.core.concurrent.AtomicBoolean.$RTT,((x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>)(this.done)))));
            
            //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.runtime.impl.java.EvalUtils.eval(t$105513.getAndSet(((boolean)(true))));
        }
        
        public x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>> exc;
        public java.lang.RuntimeException t;
        public x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean> done;
        
        public $Closure_finish_resilient_low_level_at_back_exc(final x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>> exc, final java.lang.RuntimeException t, final x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean> done, __0$1x10$lang$Cell$1x10$lang$Exception$2$2__2$1x10$util$concurrent$AtomicBoolean$2 $dummy) {
             {
                this.exc = ((x10.core.GlobalRef)(exc));
                this.t = ((java.lang.RuntimeException)(t));
                this.done = ((x10.core.GlobalRef)(done));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure_finish_resilient_low_level_at_out extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure_finish_resilient_low_level_at_out> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure_finish_resilient_low_level_at_out> make($Closure_finish_resilient_low_level_at_out.class,
                                                                                        new x10.rtt.Type[] {
                                                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilient.$Closure_finish_resilient_low_level_at_out $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.cl = $deserializer.readObject();
            $_obj.done = $deserializer.readObject();
            $_obj.exc = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilient.$Closure_finish_resilient_low_level_at_out $_obj = new x10.lang.FinishResilient.$Closure_finish_resilient_low_level_at_out((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.cl);
            $serializer.write(this.done);
            $serializer.write(this.exc);
            
        }
        
        // constructor just for allocation
        public $Closure_finish_resilient_low_level_at_out(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$util$concurrent$AtomicBoolean$2__2$1x10$lang$Cell$1x10$lang$Exception$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            try {{
                
                //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final long t$105496 = x10.lang.FinishResilient.get$verbose();
                
                //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final boolean t$105497 = ((t$105496) >= (((long)(4L))));
                
                //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                if (t$105497) {
                    
                    //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelAt(remote) calling cl()")));
                }
                
                //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                ((x10.core.fun.VoidFun_0_0)this.cl).$apply();
                
                //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final long t$105498 = x10.lang.FinishResilient.get$verbose();
                
                //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final boolean t$105499 = ((t$105498) >= (((long)(4L))));
                
                //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                if (t$105499) {
                    
                    //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelAt(remote) returned from cl()")));
                }
                
                //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.lang.Place t$105500 = ((x10.lang.Place)((this.done).home));
                
                //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final long t$105504 = t$105500.id;
                
                //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.core.fun.VoidFun_0_0 t$105505 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.FinishResilient.$Closure_finish_resilient_low_level_at_back(((x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>)(this.done)), (x10.lang.FinishResilient.$Closure_finish_resilient_low_level_at_back.__0$1x10$util$concurrent$AtomicBoolean$2) null)));
                
                //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.Runtime.x10rtSendMessage((long)(t$105504), ((x10.core.fun.VoidFun_0_0)(t$105505)), ((x10.lang.Runtime.Profile)(null)));
            }}catch (final java.lang.RuntimeException t) {
                
                //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final long t$105506 = x10.lang.FinishResilient.get$verbose();
                
                //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final boolean t$105508 = ((t$105506) >= (((long)(4L))));
                
                //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                if (t$105508) {
                    
                    //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    final java.lang.String t$105507 = (("----lowLevelAt(remote) caught exception=") + (t));
                    
                    //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    x10.lang.FinishResilient.debug(((java.lang.String)(t$105507)));
                }
                
                //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.lang.Place t$105509 = ((x10.lang.Place)((this.done).home));
                
                //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final long t$105514 = t$105509.id;
                
                //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.core.fun.VoidFun_0_0 t$105515 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.FinishResilient.$Closure_finish_resilient_low_level_at_back_exc(((x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>>)(this.exc)), t, ((x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>)(this.done)), (x10.lang.FinishResilient.$Closure_finish_resilient_low_level_at_back_exc.__0$1x10$lang$Cell$1x10$lang$Exception$2$2__2$1x10$util$concurrent$AtomicBoolean$2) null)));
                
                //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.Runtime.x10rtSendMessage((long)(t$105514), ((x10.core.fun.VoidFun_0_0)(t$105515)), ((x10.lang.Runtime.Profile)(null)));
            }
            
            //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105516 = x10.lang.FinishResilient.get$verbose();
            
            //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105517 = ((t$105516) >= (((long)(4L))));
            
            //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105517) {
                
                //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelAt(remote) finished")));
            }
        }
        
        public x10.core.fun.VoidFun_0_0 cl;
        public x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean> done;
        public x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>> exc;
        
        public $Closure_finish_resilient_low_level_at_out(final x10.core.fun.VoidFun_0_0 cl, final x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean> done, final x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>> exc, __1$1x10$util$concurrent$AtomicBoolean$2__2$1x10$lang$Cell$1x10$lang$Exception$2$2 $dummy) {
             {
                this.cl = ((x10.core.fun.VoidFun_0_0)(cl));
                this.done = ((x10.core.GlobalRef)(done));
                this.exc = ((x10.core.GlobalRef)(exc));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure_fiish_resilient_low_level_fetch_back<$T> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure_fiish_resilient_low_level_fetch_back> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure_fiish_resilient_low_level_fetch_back> make($Closure_fiish_resilient_low_level_fetch_back.class,
                                                                                           1,
                                                                                           new x10.rtt.Type[] {
                                                                                               x10.core.fun.VoidFun_0_0.$RTT
                                                                                           });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilient.$Closure_fiish_resilient_low_level_fetch_back<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.gresult = $deserializer.readObject();
            $_obj.r = $deserializer.readObject();
            $_obj.done = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilient.$Closure_fiish_resilient_low_level_fetch_back $_obj = new x10.lang.FinishResilient.$Closure_fiish_resilient_low_level_fetch_back((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.gresult);
            $serializer.write(this.r);
            $serializer.write(this.done);
            
        }
        
        // constructor just for allocation
        public $Closure_fiish_resilient_low_level_fetch_back(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.FinishResilient.$Closure_fiish_resilient_low_level_fetch_back.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure_fiish_resilient_low_level_fetch_back $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling for __0$1x10$lang$Cell$1x10$lang$FinishResilient$$Closure_fiish_resilient_low_level_fetch_back$$T$2$2__1x10$lang$FinishResilient$$Closure_fiish_resilient_low_level_fetch_back$$T__2$1x10$util$concurrent$AtomicBoolean$2
        public static final class $_42300a12 {}
        
    
        
        public void $apply() {
            
            //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105577 = x10.lang.FinishResilient.get$verbose();
            
            //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105578 = ((t$105577) >= (((long)(4L))));
            
            //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105578) {
                
                //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelFetch(home) setting the result and done-flag")));
            }
            
            //#line 354 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final x10.lang.Cell t$105579 = ((x10.lang.Cell)(x10.core.GlobalRef.LocalEval.<x10.lang.Cell<$T>>getLocalOrCopy(x10.rtt.ParameterizedType.make(x10.lang.Cell.$RTT, $T),((x10.core.GlobalRef<x10.lang.Cell<$T>>)(this.gresult)))));
            
            //#line 354 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ((x10.lang.Cell<$T>)t$105579).$apply__0x10$lang$Cell$$T((($T)(this.r)));
            
            //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final x10.core.concurrent.AtomicBoolean t$105580 = ((x10.core.concurrent.AtomicBoolean)(x10.core.GlobalRef.LocalEval.<x10.core.concurrent.AtomicBoolean>getLocalOrCopy(x10.core.concurrent.AtomicBoolean.$RTT,((x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>)(this.done)))));
            
            //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.runtime.impl.java.EvalUtils.eval(t$105580.getAndSet(((boolean)(true))));
        }
        
        public x10.core.GlobalRef<x10.lang.Cell<$T>> gresult;
        public $T r;
        public x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean> done;
        
        public $Closure_fiish_resilient_low_level_fetch_back(final x10.rtt.Type $T, final x10.core.GlobalRef<x10.lang.Cell<$T>> gresult, final $T r, final x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean> done, $_42300a12 $dummy) {
            x10.lang.FinishResilient.$Closure_fiish_resilient_low_level_fetch_back.$initParams(this, $T);
             {
                ((x10.lang.FinishResilient.$Closure_fiish_resilient_low_level_fetch_back<$T>)this).gresult = ((x10.core.GlobalRef)(gresult));
                ((x10.lang.FinishResilient.$Closure_fiish_resilient_low_level_fetch_back<$T>)this).r = (($T)(r));
                ((x10.lang.FinishResilient.$Closure_fiish_resilient_low_level_fetch_back<$T>)this).done = ((x10.core.GlobalRef)(done));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure_finish_resilient_low_level_fetch_back_exc<$T> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure_finish_resilient_low_level_fetch_back_exc> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure_finish_resilient_low_level_fetch_back_exc> make($Closure_finish_resilient_low_level_fetch_back_exc.class,
                                                                                                1,
                                                                                                new x10.rtt.Type[] {
                                                                                                    x10.core.fun.VoidFun_0_0.$RTT
                                                                                                });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_back_exc<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.exc = $deserializer.readObject();
            $_obj.t = $deserializer.readObject();
            $_obj.done = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_back_exc $_obj = new x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_back_exc((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.exc);
            $serializer.write(this.t);
            $serializer.write(this.done);
            
        }
        
        // constructor just for allocation
        public $Closure_finish_resilient_low_level_fetch_back_exc(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_back_exc.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure_finish_resilient_low_level_fetch_back_exc $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Cell$1x10$lang$Exception$2$2__2$1x10$util$concurrent$AtomicBoolean$2 {}
        
    
        
        public void $apply() {
            
            //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105584 = x10.lang.FinishResilient.get$verbose();
            
            //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105585 = ((t$105584) >= (((long)(4L))));
            
            //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105585) {
                
                //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelFetch(home) setting exc and done-flag")));
            }
            
            //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final x10.lang.Cell t$105586 = ((x10.lang.Cell)(x10.core.GlobalRef.LocalEval.<x10.lang.Cell<java.lang.RuntimeException>>getLocalOrCopy(x10.rtt.ParameterizedType.make(x10.lang.Cell.$RTT, x10.rtt.Types.EXCEPTION),((x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>>)(this.exc)))));
            
            //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ((x10.lang.Cell<java.lang.RuntimeException>)t$105586).$apply__0x10$lang$Cell$$T(((java.lang.RuntimeException)(this.t)));
            
            //#line 362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final x10.core.concurrent.AtomicBoolean t$105587 = ((x10.core.concurrent.AtomicBoolean)(x10.core.GlobalRef.LocalEval.<x10.core.concurrent.AtomicBoolean>getLocalOrCopy(x10.core.concurrent.AtomicBoolean.$RTT,((x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>)(this.done)))));
            
            //#line 362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            x10.runtime.impl.java.EvalUtils.eval(t$105587.getAndSet(((boolean)(true))));
        }
        
        public x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>> exc;
        public java.lang.RuntimeException t;
        public x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean> done;
        
        public $Closure_finish_resilient_low_level_fetch_back_exc(final x10.rtt.Type $T, final x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>> exc, final java.lang.RuntimeException t, final x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean> done, __0$1x10$lang$Cell$1x10$lang$Exception$2$2__2$1x10$util$concurrent$AtomicBoolean$2 $dummy) {
            x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_back_exc.$initParams(this, $T);
             {
                ((x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_back_exc<$T>)this).exc = ((x10.core.GlobalRef)(exc));
                ((x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_back_exc<$T>)this).t = ((java.lang.RuntimeException)(t));
                ((x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_back_exc<$T>)this).done = ((x10.core.GlobalRef)(done));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure_finish_resilient_low_level_fetch_out<$T> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure_finish_resilient_low_level_fetch_out> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure_finish_resilient_low_level_fetch_out> make($Closure_finish_resilient_low_level_fetch_out.class,
                                                                                           1,
                                                                                           new x10.rtt.Type[] {
                                                                                               x10.core.fun.VoidFun_0_0.$RTT
                                                                                           });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_out<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.cl = $deserializer.readObject();
            $_obj.done = $deserializer.readObject();
            $_obj.gresult = $deserializer.readObject();
            $_obj.exc = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_out $_obj = new x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_out((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.cl);
            $serializer.write(this.done);
            $serializer.write(this.gresult);
            $serializer.write(this.exc);
            
        }
        
        // constructor just for allocation
        public $Closure_finish_resilient_low_level_fetch_out(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_out.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure_finish_resilient_low_level_fetch_out $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling for __0$1x10$lang$FinishResilient$$Closure_finish_resilient_low_level_fetch_out$$T$2__1$1x10$util$concurrent$AtomicBoolean$2__2$1x10$lang$Cell$1x10$lang$FinishResilient$$Closure_finish_resilient_low_level_fetch_out$$T$2$2__3$1x10$lang$Cell$1x10$lang$Exception$2$2
        public static final class $_995cc017 {}
        
    
        
        public void $apply() {
            
            //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            try {{
                
                //#line 349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final long t$105572 = x10.lang.FinishResilient.get$verbose();
                
                //#line 349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final boolean t$105573 = ((t$105572) >= (((long)(4L))));
                
                //#line 349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                if (t$105573) {
                    
                    //#line 349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelFetch(remote) calling cl()")));
                }
                
                //#line 350 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final $T r = (($T)(((x10.core.fun.Fun_0_0<$T>)this.cl).$apply$G()));
                
                //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final long t$105574 = x10.lang.FinishResilient.get$verbose();
                
                //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final boolean t$105575 = ((t$105574) >= (((long)(4L))));
                
                //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                if (t$105575) {
                    
                    //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelFetch(remote) returned from cl()")));
                }
                
                //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.lang.Place t$105576 = ((x10.lang.Place)((this.done).home));
                
                //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final long t$105581 = t$105576.id;
                
                //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.core.fun.VoidFun_0_0 t$105582 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.FinishResilient.$Closure_fiish_resilient_low_level_fetch_back<$T>($T, ((x10.core.GlobalRef<x10.lang.Cell<$T>>)(this.gresult)), r, ((x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>)(this.done)), (x10.lang.FinishResilient.$Closure_fiish_resilient_low_level_fetch_back.$_42300a12) null)));
                
                //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.Runtime.x10rtSendMessage((long)(t$105581), ((x10.core.fun.VoidFun_0_0)(t$105582)), ((x10.lang.Runtime.Profile)(null)));
            }}catch (final java.lang.RuntimeException t) {
                
                //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.lang.Place t$105583 = ((x10.lang.Place)((this.done).home));
                
                //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final long t$105588 = t$105583.id;
                
                //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                final x10.core.fun.VoidFun_0_0 t$105589 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_back_exc<$T>($T, ((x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>>)(this.exc)), t, ((x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>)(this.done)), (x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_back_exc.__0$1x10$lang$Cell$1x10$lang$Exception$2$2__2$1x10$util$concurrent$AtomicBoolean$2) null)));
                
                //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.Runtime.x10rtSendMessage((long)(t$105588), ((x10.core.fun.VoidFun_0_0)(t$105589)), ((x10.lang.Runtime.Profile)(null)));
            }
            
            //#line 365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final long t$105590 = x10.lang.FinishResilient.get$verbose();
            
            //#line 365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            final boolean t$105591 = ((t$105590) >= (((long)(4L))));
            
            //#line 365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (t$105591) {
                
                //#line 365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("----lowLevelFetch(remote) finished")));
            }
        }
        
        public x10.core.fun.Fun_0_0<$T> cl;
        public x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean> done;
        public x10.core.GlobalRef<x10.lang.Cell<$T>> gresult;
        public x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>> exc;
        
        public $Closure_finish_resilient_low_level_fetch_out(final x10.rtt.Type $T, final x10.core.fun.Fun_0_0<$T> cl, final x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean> done, final x10.core.GlobalRef<x10.lang.Cell<$T>> gresult, final x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>> exc, $_995cc017 $dummy) {
            x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_out.$initParams(this, $T);
             {
                ((x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_out<$T>)this).cl = ((x10.core.fun.Fun_0_0)(cl));
                ((x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_out<$T>)this).done = ((x10.core.GlobalRef)(done));
                ((x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_out<$T>)this).gresult = ((x10.core.GlobalRef)(gresult));
                ((x10.lang.FinishResilient.$Closure_finish_resilient_low_level_fetch_out<$T>)this).exc = ((x10.core.GlobalRef)(exc));
            }
        }
        
    }
    
    }
    
    