package x10.lang;


@x10.runtime.impl.java.X10Generated
public class Activity extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Activity> $RTT = 
        x10.rtt.NamedType.<Activity> make("x10.lang.Activity",
                                          Activity.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Activity $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.finishState = $deserializer.readObject();
        $_obj.body = $deserializer.readObject();
        $_obj.clockPhases = $deserializer.readObject();
        $_obj.shouldNotifyTermination = $deserializer.readBoolean();
        $_obj.confirmed = $deserializer.readBoolean();
        $_obj.atomicDepth = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.Activity $_obj = new x10.lang.Activity((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.finishState);
        $serializer.write(this.body);
        $serializer.write(this.clockPhases);
        $serializer.write(this.shouldNotifyTermination);
        $serializer.write(this.confirmed);
        $serializer.write(this.atomicDepth);
        
    }
    
    // constructor just for allocation
    public Activity(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    private static boolean DEALLOC_BODY = false;
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    private static boolean canDealloc$O() {
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        return true;
    }
    
    public static boolean canDealloc$P$O() {
        return x10.lang.Activity.canDealloc$O();
    }
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    @x10.runtime.impl.java.X10Generated
    public static class ClockPhases extends x10.util.HashMap<x10.lang.Clock, x10.core.Int> implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<ClockPhases> $RTT = 
            x10.rtt.NamedType.<ClockPhases> make("x10.lang.Activity.ClockPhases",
                                                 ClockPhases.class,
                                                 new x10.rtt.Type[] {
                                                     x10.rtt.ParameterizedType.make(x10.util.HashMap.$RTT, x10.lang.Clock.$RTT, x10.rtt.Types.INT)
                                                 });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        // custom serialization support
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Activity.ClockPhases $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.io.Deserializer $ds = new x10.io.Deserializer($deserializer);
            $_obj.x10$lang$Activity$ClockPhases$$init$S($ds);
            short $marker = $deserializer.readSerializationId();
            if ($marker != x10.serialization.SerializationConstants.CUSTOM_SERIALIZATION_END) { x10.serialization.X10JavaDeserializer.raiseSerializationProtocolError(); }
            return $_obj;
            
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            int $obj_id = $deserializer.record_reference(null); /* Get id eagerly so that ordering in object map is stable (needed for repeated reference mechanism) */
            ClockPhases $_obj = new ClockPhases((java.lang.System[]) null);
            $deserializer.update_reference($obj_id, $_obj); /* Update entry in object map with the actual object before deserializing body */
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
            serialize(new x10.io.Serializer($serializer)); 
            $serializer.writeSerializationId(x10.serialization.SerializationConstants.CUSTOM_SERIALIZATION_END);
            
        }
        
        // constructor just for allocation
        public ClockPhases(final java.lang.System[] $dummy) {
            super($dummy, x10.lang.Clock.$RTT, x10.rtt.Types.INT);
            
        }
        
        // bridge for method public x10.util.HashMap[K, V].getOrElse(k:K, orelse:V){}:V
        public int getOrElse$O(x10.lang.Clock a1, int a2){
            return x10.core.Int.$unbox(super.getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G((a1), x10.core.Int.$box(a2)));
        }
        
        // bridge for method public x10.util.HashMap[K, V].getOrThrow(k:K){}:V
        public int getOrThrow$O(x10.lang.Clock a1){
            return x10.core.Int.$unbox(super.getOrThrow__0x10$util$HashMap$$K$G((a1)));
        }
        
        // bridge for method public x10.util.HashMap[K, V].put(k:K, v:V){}:x10.util.Box[V]
        public x10.util.Box<x10.core.Int> put(x10.lang.Clock a1, int a2){
            return super.put__0x10$util$HashMap$$K__1x10$util$HashMap$$V((a1), x10.core.Int.$box(a2));
        }
        
        // bridge for method final protected x10.util.HashMap[K, V].putInternal(k:K, v:V, mayRehash:x10.lang.Boolean){}:x10.util.Box[V]
        final protected x10.util.Box<x10.core.Int> putInternal(x10.lang.Clock a1, int a2, boolean a3){
            return super.putInternal__0x10$util$HashMap$$K__1x10$util$HashMap$$V((a1), x10.core.Int.$box(a2), (a3));
        }
        
        
    
        
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        public static x10.lang.Activity.ClockPhases make__0$1x10$lang$Clock$2(final x10.core.Rail<x10.lang.Clock> clocks) {
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Activity.ClockPhases clockPhases = ((x10.lang.Activity.ClockPhases)(new x10.lang.Activity.ClockPhases((java.lang.System[]) null)));
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            clockPhases.x10$lang$Activity$ClockPhases$$init$S();
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            long i$96581 = 0L;
            {
                
                //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final x10.lang.Clock[] clocks$value$96609 = ((x10.lang.Clock[])clocks.value);
                
                //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    final long t$96582 = i$96581;
                    
                    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    final long t$96583 = ((x10.core.Rail<x10.lang.Clock>)clocks).size;
                    
                    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    final boolean t$96584 = ((t$96582) < (((long)(t$96583))));
                    
                    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    if (!(t$96584)) {
                        
                        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                        break;
                    }
                    
                    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    final long t$96574 = i$96581;
                    
                    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    final x10.lang.Clock t$96575 = ((x10.lang.Clock)clocks$value$96609[(int)t$96574]);
                    
                    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    final long t$96576 = i$96581;
                    
                    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    final x10.lang.Clock t$96577 = ((x10.lang.Clock)clocks$value$96609[(int)t$96576]);
                    
                    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    final int t$96578 = t$96577.register$O();
                    
                    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    ((x10.util.HashMap<x10.lang.Clock, x10.core.Int>)clockPhases).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((x10.lang.Clock)(t$96575)), x10.core.Int.$box(t$96578));
                    
                    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    final long t$96579 = i$96581;
                    
                    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    final long t$96580 = ((t$96579) + (((long)(1L))));
                    
                    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    i$96581 = t$96580;
                }
            }
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            return clockPhases;
        }
        
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        public void advanceAll() {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.util.Set t$96589 = this.entries();
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Iterator entry$96590 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>>)
                                                    ((x10.lang.Iterable<x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>>)t$96589).iterator());
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            for (;
                 true;
                 ) {
                
                //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final boolean t$96591 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>>)entry$96590).hasNext$O();
                
                //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                if (!(t$96591)) {
                    
                    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    break;
                }
                
                //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final x10.util.Map.Entry entry$96585 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>>)entry$96590).next$G();
                
                //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final x10.lang.Clock t$96586 = ((x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>)entry$96585).getKey$G();
                
                //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                t$96586.resumeUnsafe();
            }
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.util.Set t$96592 = this.entries();
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Iterator entry$96593 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>>)
                                                    ((x10.lang.Iterable<x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>>)t$96592).iterator());
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            for (;
                 true;
                 ) {
                
                //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final boolean t$96594 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>>)entry$96593).hasNext$O();
                
                //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                if (!(t$96594)) {
                    
                    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    break;
                }
                
                //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final x10.util.Map.Entry entry$96587 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>>)entry$96593).next$G();
                
                //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final x10.lang.Clock t$96588 = ((x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>)entry$96587).getKey$G();
                
                //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                t$96588.advanceUnsafe();
            }
        }
        
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        public void resumeAll() {
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.util.Set t$96543 = this.entries();
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Iterator entry$91662 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>>)
                                                    ((x10.lang.Iterable<x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>>)t$96543).iterator());
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            for (;
                 true;
                 ) {
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final boolean t$96545 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>>)entry$91662).hasNext$O();
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                if (!(t$96545)) {
                    
                    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    break;
                }
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final x10.util.Map.Entry entry$96595 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>>)entry$91662).next$G();
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final x10.lang.Clock t$96596 = ((x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>)entry$96595).getKey$G();
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                t$96596.resumeUnsafe();
            }
        }
        
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        public void drop() {
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.util.Set t$96599 = this.entries();
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Iterator entry$96600 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>>)
                                                    ((x10.lang.Iterable<x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>>)t$96599).iterator());
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            for (;
                 true;
                 ) {
                
                //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final boolean t$96601 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>>)entry$96600).hasNext$O();
                
                //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                if (!(t$96601)) {
                    
                    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                    break;
                }
                
                //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final x10.util.Map.Entry entry$96597 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>>)entry$96600).next$G();
                
                //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final x10.lang.Clock t$96598 = ((x10.util.Map.Entry<x10.lang.Clock, x10.core.Int>)entry$96597).getKey$G();
                
                //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                t$96598.dropInternal();
            }
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            this.clear();
        }
        
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        public void serialize(final x10.io.Serializer s) {
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            super.serialize(((x10.io.Serializer)(s)));
        }
        
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        // creation method for java code (1-phase java constructor)
        public ClockPhases() {
            this((java.lang.System[]) null);
            x10$lang$Activity$ClockPhases$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.lang.Activity.ClockPhases x10$lang$Activity$ClockPhases$$init$S() {
             {
                
                //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                /*super.*/x10$util$HashMap$$init$S();
                
                //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                
                
                //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final x10.lang.Activity.ClockPhases this$96602 = this;
            }
            return this;
        }
        
        
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        // creation method for java code (1-phase java constructor)
        public ClockPhases(final x10.io.Deserializer ds) {
            this((java.lang.System[]) null);
            x10$lang$Activity$ClockPhases$$init$S(ds);
        }
        
        // constructor for non-virtual call
        final public x10.lang.Activity.ClockPhases x10$lang$Activity$ClockPhases$$init$S(final x10.io.Deserializer ds) {
            x10$lang$Activity$ClockPhases$$initForReflection(ds);
            
            return this;
        }
        
        public void x10$lang$Activity$ClockPhases$$initForReflection(x10.io.Deserializer ds) {
             {
                
                //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                /*super.*/x10$util$HashMap$$init$S(((x10.io.Deserializer)(ds)));
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                
                
                //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final x10.lang.Activity.ClockPhases this$96603 = this;
            }
        }
        
        
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final public x10.lang.Activity.ClockPhases x10$lang$Activity$ClockPhases$$this$x10$lang$Activity$ClockPhases() {
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            return x10.lang.Activity.ClockPhases.this;
        }
        
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final public void __fieldInitializers_x10_lang_Activity_ClockPhases() {
            
        }
        
        public void x10$util$HashMap$serialize$S(final x10.io.Serializer a0) {
            super.serialize(((x10.io.Serializer)(a0)));
        }
    }
    
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    /**
     * the finish state governing the execution of this activity (may be remote)
     */
    public x10.lang.FinishState finishState;
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    /**
     * The user-specified code for this activity.
     */
    public x10.core.fun.VoidFun_0_0 body;
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    /**
     * The mapping from registered clocks to phases for this activity.
     * Lazily created.
     */
    public x10.lang.Activity.ClockPhases clockPhases;
    
    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    /** Set to true unless this activity represents the body of an 'at' statement.
     */
    public boolean shouldNotifyTermination;
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    /** Set to true unless this activity was spawned by a place that then immediately died
     */
    public boolean confirmed;
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    /**
     * Depth of enclosong atomic blocks
     */
    public int atomicDepth;
    
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    // creation method for java code (1-phase java constructor)
    public Activity(final x10.core.fun.VoidFun_0_0 body, final x10.lang.Place srcPlace, final x10.lang.FinishState finishState) {
        this((java.lang.System[]) null);
        x10$lang$Activity$$init$S(body, srcPlace, finishState);
    }
    
    // constructor for non-virtual call
    final public x10.lang.Activity x10$lang$Activity$$init$S(final x10.core.fun.VoidFun_0_0 body, final x10.lang.Place srcPlace, final x10.lang.FinishState finishState) {
         {
            
            //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Activity this$92261 = this;
            
            //#line 104 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.core.fun.VoidFun_0_0 body$92257 = ((x10.core.fun.VoidFun_0_0)(body));
            
            //#line 104 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Place srcPlace$92258 = ((x10.lang.Place)(srcPlace));
            
            //#line 104 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.FinishState finishState$92259 = ((x10.lang.FinishState)(finishState));
            
            //#line 105 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            this$92261.x10$lang$Activity$$init$S(((x10.core.fun.VoidFun_0_0)(body$92257)), ((x10.lang.Place)(srcPlace$92258)), ((x10.lang.FinishState)(finishState$92259)), ((boolean)(true)), ((boolean)(true)));
        }
        return this;
    }
    
    
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    // creation method for java code (1-phase java constructor)
    public Activity(final x10.core.fun.VoidFun_0_0 body, final x10.lang.Place srcPlace, final x10.lang.FinishState finishState, final boolean nac) {
        this((java.lang.System[]) null);
        x10$lang$Activity$$init$S(body, srcPlace, finishState, nac);
    }
    
    // constructor for non-virtual call
    final public x10.lang.Activity x10$lang$Activity$$init$S(final x10.core.fun.VoidFun_0_0 body, final x10.lang.Place srcPlace, final x10.lang.FinishState finishState, final boolean nac) {
         {
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            /*this.*/x10$lang$Activity$$init$S(((x10.core.fun.VoidFun_0_0)(body)), ((x10.lang.Place)(srcPlace)), ((x10.lang.FinishState)(finishState)), ((boolean)(nac)), ((boolean)(true)));
        }
        return this;
    }
    
    
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    // creation method for java code (1-phase java constructor)
    public Activity(final x10.core.fun.VoidFun_0_0 body, final x10.lang.Place srcPlace, final x10.lang.FinishState finishState, final boolean nac, final boolean nt) {
        this((java.lang.System[]) null);
        x10$lang$Activity$$init$S(body, srcPlace, finishState, nac, nt);
    }
    
    // constructor for non-virtual call
    final public x10.lang.Activity x10$lang$Activity$$init$S(final x10.core.fun.VoidFun_0_0 body, final x10.lang.Place srcPlace, final x10.lang.FinishState finishState, final boolean nac, final boolean nt) {
         {
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Activity this$96604 = this;
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            this$96604.finishState = null;
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            this$96604.clockPhases = null;
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            this$96604.atomicDepth = 0;
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            this.finishState = ((x10.lang.FinishState)(finishState));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            this.shouldNotifyTermination = nt;
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            if (nac) {
                
                //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final boolean t$96550 = finishState.notifyActivityCreation$O(((x10.lang.Place)(srcPlace)));
                
                //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                this.confirmed = t$96550;
            } else {
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                this.confirmed = true;
            }
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            this.body = ((x10.core.fun.VoidFun_0_0)(body));
        }
        return this;
    }
    
    
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    // creation method for java code (1-phase java constructor)
    public Activity(final x10.core.fun.VoidFun_0_0 body, final x10.lang.Place srcPlace, final x10.lang.FinishState finishState, final x10.lang.Activity.ClockPhases clockPhases) {
        this((java.lang.System[]) null);
        x10$lang$Activity$$init$S(body, srcPlace, finishState, clockPhases);
    }
    
    // constructor for non-virtual call
    final public x10.lang.Activity x10$lang$Activity$$init$S(final x10.core.fun.VoidFun_0_0 body, final x10.lang.Place srcPlace, final x10.lang.FinishState finishState, final x10.lang.Activity.ClockPhases clockPhases) {
         {
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Activity this$96513 = this;
            
            //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.core.fun.VoidFun_0_0 body$96510 = ((x10.core.fun.VoidFun_0_0)(body));
            
            //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Place srcPlace$96511 = ((x10.lang.Place)(srcPlace));
            
            //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.FinishState finishState$96512 = ((x10.lang.FinishState)(finishState));
            
            //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.core.fun.VoidFun_0_0 body$96605 = ((x10.core.fun.VoidFun_0_0)(body$96510));
            
            //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Place srcPlace$96606 = ((x10.lang.Place)(srcPlace$96511));
            
            //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.FinishState finishState$96607 = ((x10.lang.FinishState)(finishState$96512));
            
            //#line 105 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            this$96513.x10$lang$Activity$$init$S(((x10.core.fun.VoidFun_0_0)(body$96605)), ((x10.lang.Place)(srcPlace$96606)), ((x10.lang.FinishState)(finishState$96607)), ((boolean)(true)), ((boolean)(true)));
            
            //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            this.clockPhases = ((x10.lang.Activity.ClockPhases)(clockPhases));
        }
        return this;
    }
    
    
    
    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    public x10.lang.Activity.ClockPhases clockPhases() {
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.Activity.ClockPhases t$96551 = ((x10.lang.Activity.ClockPhases)(clockPhases));
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final boolean t$96552 = ((null) == (t$96551));
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        if (t$96552) {
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Activity.ClockPhases alloc$91656 = ((x10.lang.Activity.ClockPhases)(new x10.lang.Activity.ClockPhases((java.lang.System[]) null)));
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            alloc$91656.x10$lang$Activity$ClockPhases$$init$S();
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            this.clockPhases = ((x10.lang.Activity.ClockPhases)(alloc$91656));
        }
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.Activity.ClockPhases t$96553 = ((x10.lang.Activity.ClockPhases)(clockPhases));
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        return t$96553;
    }
    
    
    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    public x10.lang.FinishState finishState() {
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.FinishState t$96554 = ((x10.lang.FinishState)(finishState));
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        return t$96554;
    }
    
    
    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    public x10.lang.FinishState swapFinish(final x10.lang.FinishState f) {
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.FinishState old = ((x10.lang.FinishState)(finishState));
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        this.finishState = ((x10.lang.FinishState)(f));
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        return old;
    }
    
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    public void pushAtomic() {
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final int t$96555 = this.atomicDepth;
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final int t$96556 = ((t$96555) + (((int)(1))));
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        this.atomicDepth = t$96556;
    }
    
    
    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    public void popAtomic() {
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final int t$96557 = this.atomicDepth;
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final int t$96558 = ((t$96557) - (((int)(1))));
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        this.atomicDepth = t$96558;
    }
    
    
    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    public void ensureNotInAtomic() {
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final int t$96559 = atomicDepth;
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final long t$96560 = ((long)(((int)(t$96559))));
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final boolean t$96562 = ((t$96560) > (((long)(0L))));
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        if (t$96562) {
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.IllegalOperationException t$96561 = ((x10.lang.IllegalOperationException)(new x10.lang.IllegalOperationException()));
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            throw t$96561;
        }
    }
    
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    public void run() {
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final boolean t$96572 = confirmed;
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        if (t$96572) {
            
            //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            try {{
                
                //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final x10.core.fun.VoidFun_0_0 t$96563 = ((x10.core.fun.VoidFun_0_0)(body));
                
                //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                ((x10.core.fun.VoidFun_0_0)t$96563).$apply();
            }}catch (final java.lang.Error t) {
                
                //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final x10.lang.FinishState t$96564 = ((x10.lang.FinishState)(finishState));
                
                //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final x10.lang.WrappedThrowable t$96565 = ((x10.lang.WrappedThrowable)(new x10.lang.WrappedThrowable(((java.lang.Throwable)(t)))));
                
                //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                t$96564.pushException(((java.lang.RuntimeException)(t$96565)));
            }catch (final java.lang.RuntimeException t) {
                
                //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final x10.lang.FinishState t$96566 = ((x10.lang.FinishState)(finishState));
                
                //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                t$96566.pushException(((java.lang.RuntimeException)(t)));
            }
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Activity.ClockPhases t$96567 = ((x10.lang.Activity.ClockPhases)(clockPhases));
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final boolean t$96569 = ((null) != (t$96567));
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            if (t$96569) {
                
                //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final x10.lang.Activity.ClockPhases t$96568 = ((x10.lang.Activity.ClockPhases)(clockPhases));
                
                //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                t$96568.drop();
            }
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final boolean t$96571 = shouldNotifyTermination;
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            if (t$96571) {
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                final x10.lang.FinishState t$96570 = ((x10.lang.FinishState)(finishState));
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                t$96570.notifyActivityTermination();
            }
        }
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final boolean t$96573 = x10.lang.Activity.get$DEALLOC_BODY();
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        if (t$96573) {
            
            //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
            final x10.core.fun.VoidFun_0_0 o$96520 = ((x10.core.fun.VoidFun_0_0)(body));
        }
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    final public x10.lang.Activity x10$lang$Activity$$this$x10$lang$Activity() {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        return x10.lang.Activity.this;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
    final public void __fieldInitializers_x10_lang_Activity() {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        this.finishState = null;
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        this.clockPhases = null;
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        this.atomicDepth = 0;
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$DEALLOC_BODY = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$DEALLOC_BODY;
    
    public static boolean get$DEALLOC_BODY() {
        if (((int) x10.lang.Activity.initStatus$DEALLOC_BODY.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Activity.DEALLOC_BODY;
        }
        if (((int) x10.lang.Activity.initStatus$DEALLOC_BODY.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Activity.exception$DEALLOC_BODY;
        }
        if (x10.lang.Activity.initStatus$DEALLOC_BODY.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Activity.DEALLOC_BODY = x10.lang.Activity.canDealloc$O();
            }}catch (java.lang.Throwable exc$96608) {
                x10.lang.Activity.exception$DEALLOC_BODY = new x10.lang.ExceptionInInitializer(exc$96608);
                x10.lang.Activity.initStatus$DEALLOC_BODY.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Activity.exception$DEALLOC_BODY;
            }
            x10.lang.Activity.initStatus$DEALLOC_BODY.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Activity.initStatus$DEALLOC_BODY.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Activity.initStatus$DEALLOC_BODY.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Activity.initStatus$DEALLOC_BODY.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Activity.exception$DEALLOC_BODY;
                }
            }
        }
        return x10.lang.Activity.DEALLOC_BODY;
    }
}

