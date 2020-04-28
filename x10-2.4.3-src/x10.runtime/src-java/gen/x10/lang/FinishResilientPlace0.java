package x10.lang;


@x10.runtime.impl.java.X10Generated
public class FinishResilientPlace0 extends x10.lang.FinishResilient implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<FinishResilientPlace0> $RTT = 
        x10.rtt.NamedType.<FinishResilientPlace0> make("x10.lang.FinishResilientPlace0",
                                                       FinishResilientPlace0.class,
                                                       new x10.rtt.Type[] {
                                                           x10.lang.FinishResilient.$RTT
                                                       });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilientPlace0 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.FinishResilient.$_deserialize_body($_obj, $deserializer);
        $_obj.id = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.FinishResilientPlace0 $_obj = new x10.lang.FinishResilientPlace0((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.id);
        
    }
    
    // constructor just for allocation
    public FinishResilientPlace0(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    private static long verbose = 0L;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    private static x10.lang.Place place0;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    @x10.runtime.impl.java.X10Generated
    public static class State extends x10.core.Ref implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<State> $RTT = 
            x10.rtt.NamedType.<State> make("x10.lang.FinishResilientPlace0.State",
                                           State.class);
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilientPlace0.State $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.transit = $deserializer.readObject();
            $_obj.transitAdopted = $deserializer.readObject();
            $_obj.live = $deserializer.readObject();
            $_obj.liveAdopted = $deserializer.readObject();
            $_obj.excs = $deserializer.readObject();
            $_obj.children = $deserializer.readObject();
            $_obj.adopterId = $deserializer.readLong();
            $_obj.numDead = $deserializer.readLong();
            $_obj.parentId = $deserializer.readLong();
            $_obj.gLatch = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilientPlace0.State $_obj = new x10.lang.FinishResilientPlace0.State((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.transit);
            $serializer.write(this.transitAdopted);
            $serializer.write(this.live);
            $serializer.write(this.liveAdopted);
            $serializer.write(this.excs);
            $serializer.write(this.children);
            $serializer.write(this.adopterId);
            $serializer.write(this.numDead);
            $serializer.write(this.parentId);
            $serializer.write(this.gLatch);
            
        }
        
        // constructor just for allocation
        public State(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$util$concurrent$SimpleLatch$2 {}
        
    
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        public x10.core.Rail<x10.core.Int> transit;
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        public x10.core.Rail<x10.core.Int> transitAdopted;
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        public x10.core.Rail<x10.core.Int> live;
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        public x10.core.Rail<x10.core.Int> liveAdopted;
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        public x10.util.GrowableRail<java.lang.RuntimeException> excs;
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        public x10.util.GrowableRail<x10.core.Long> children;
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        public long adopterId;
        
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        public boolean isAdopted$O() {
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105771 = adopterId;
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final boolean t$105772 = ((long) t$105771) != ((long) -1L);
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            return t$105772;
        }
        
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        public long numDead;
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        public long parentId;
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        public x10.core.GlobalRef<x10.util.concurrent.SimpleLatch> gLatch;
        
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        // creation method for java code (1-phase java constructor)
        public State(final long parentId, final x10.core.GlobalRef<x10.util.concurrent.SimpleLatch> gLatch, __1$1x10$util$concurrent$SimpleLatch$2 $dummy) {
            this((java.lang.System[]) null);
            x10$lang$FinishResilientPlace0$State$$init$S(parentId, gLatch, (x10.lang.FinishResilientPlace0.State.__1$1x10$util$concurrent$SimpleLatch$2) null);
        }
        
        // constructor for non-virtual call
        final public x10.lang.FinishResilientPlace0.State x10$lang$FinishResilientPlace0$State$$init$S(final long parentId, final x10.core.GlobalRef<x10.util.concurrent.SimpleLatch> gLatch, __1$1x10$util$concurrent$SimpleLatch$2 $dummy) {
             {
                
                //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                
                
                //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                this.__fieldInitializers_x10_lang_FinishResilientPlace0_State();
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                this.parentId = parentId;
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                this.gLatch = ((x10.core.GlobalRef)(gLatch));
            }
            return this;
        }
        
        
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        public void dump(final java.lang.Object msg) {
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.util.StringBuilder s = ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null)));
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            s.x10$util$StringBuilder$$init$S();
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            s.add(((java.lang.Object)(msg)));
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            s.add((char)('\n'));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            s.add(((java.lang.String)("           live:")));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.core.Rail rail$106220 = ((x10.core.Rail)(live));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long size$106221 = ((x10.core.Rail<x10.core.Int>)rail$106220).size;
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            long idx$106193 = 0L;
            {
                
                //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final int[] rail$106220$value$106439 = ((int[])rail$106220.value);
                
                //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106194 = idx$106193;
                    
                    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$106195 = ((t$106194) < (((long)(size$106221))));
                    
                    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (!(t$106195)) {
                        
                        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        break;
                    }
                    
                    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106189 = idx$106193;
                    
                    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final int v$106190 = ((int)rail$106220$value$106439[(int)t$106189]);
                    
                    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final java.lang.String t$106188 = ((" ") + ((x10.core.Int.$box(v$106190))));
                    
                    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    s.add(((java.lang.String)(t$106188)));
                    
                    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106191 = idx$106193;
                    
                    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106192 = ((t$106191) + (((long)(1L))));
                    
                    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    idx$106193 = t$106192;
                }
            }
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            s.add((char)('\n'));
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            s.add(((java.lang.String)("    liveAdopted:")));
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.core.Rail rail$106222 = ((x10.core.Rail)(liveAdopted));
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long size$106223 = ((x10.core.Rail<x10.core.Int>)rail$106222).size;
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            long idx$106201 = 0L;
            {
                
                //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final int[] rail$106222$value$106440 = ((int[])rail$106222.value);
                
                //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106202 = idx$106201;
                    
                    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$106203 = ((t$106202) < (((long)(size$106223))));
                    
                    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (!(t$106203)) {
                        
                        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        break;
                    }
                    
                    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106197 = idx$106201;
                    
                    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final int v$106198 = ((int)rail$106222$value$106440[(int)t$106197]);
                    
                    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final java.lang.String t$106196 = ((" ") + ((x10.core.Int.$box(v$106198))));
                    
                    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    s.add(((java.lang.String)(t$106196)));
                    
                    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106199 = idx$106201;
                    
                    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106200 = ((t$106199) + (((long)(1L))));
                    
                    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    idx$106201 = t$106200;
                }
            }
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            s.add((char)('\n'));
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            s.add(((java.lang.String)("        transit:")));
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.core.Rail rail$106224 = ((x10.core.Rail)(transit));
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long size$106225 = ((x10.core.Rail<x10.core.Int>)rail$106224).size;
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            long idx$106209 = 0L;
            {
                
                //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final int[] rail$106224$value$106441 = ((int[])rail$106224.value);
                
                //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106210 = idx$106209;
                    
                    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$106211 = ((t$106210) < (((long)(size$106225))));
                    
                    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (!(t$106211)) {
                        
                        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        break;
                    }
                    
                    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106205 = idx$106209;
                    
                    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final int v$106206 = ((int)rail$106224$value$106441[(int)t$106205]);
                    
                    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final java.lang.String t$106204 = ((" ") + ((x10.core.Int.$box(v$106206))));
                    
                    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    s.add(((java.lang.String)(t$106204)));
                    
                    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106207 = idx$106209;
                    
                    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106208 = ((t$106207) + (((long)(1L))));
                    
                    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    idx$106209 = t$106208;
                }
            }
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            s.add((char)('\n'));
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            s.add(((java.lang.String)(" transitAdopted:")));
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.core.Rail rail$106226 = ((x10.core.Rail)(transitAdopted));
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long size$106227 = ((x10.core.Rail<x10.core.Int>)rail$106226).size;
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            long idx$106217 = 0L;
            {
                
                //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final int[] rail$106226$value$106442 = ((int[])rail$106226.value);
                
                //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106218 = idx$106217;
                    
                    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$106219 = ((t$106218) < (((long)(size$106227))));
                    
                    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (!(t$106219)) {
                        
                        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        break;
                    }
                    
                    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106213 = idx$106217;
                    
                    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final int v$106214 = ((int)rail$106226$value$106442[(int)t$106213]);
                    
                    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final java.lang.String t$106212 = ((" ") + ((x10.core.Int.$box(v$106214))));
                    
                    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    s.add(((java.lang.String)(t$106212)));
                    
                    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106215 = idx$106217;
                    
                    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106216 = ((t$106215) + (((long)(1L))));
                    
                    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    idx$106217 = t$106216;
                }
            }
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            s.add((char)('\n'));
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.util.GrowableRail this$105679 = ((x10.util.GrowableRail)(children));
            
            //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$105801 = ((x10.util.GrowableRail<x10.core.Long>)this$105679).size;
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105802 = (("  children.size: ") + ((x10.core.Long.$box(t$105801))));
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            s.add(((java.lang.String)(t$105802)));
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            s.add((char)('\n'));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105803 = adopterId;
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105804 = (("      adopterId: ") + ((x10.core.Long.$box(t$105803))));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            s.add(((java.lang.String)(t$105804)));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            s.add((char)('\n'));
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105805 = parentId;
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105806 = (("       parentId: ") + ((x10.core.Long.$box(t$105805))));
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            s.add(((java.lang.String)(t$105806)));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105807 = s.toString();
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105807)));
        }
        
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final public x10.lang.FinishResilientPlace0.State x10$lang$FinishResilientPlace0$State$$this$x10$lang$FinishResilientPlace0$State() {
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            return x10.lang.FinishResilientPlace0.State.this;
        }
        
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final public void __fieldInitializers_x10_lang_FinishResilientPlace0_State() {
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105808 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105809 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105810 = ((t$105808) * (((long)(t$105809))));
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.core.Rail t$105811 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, t$105810, (x10.core.Int.$box(0)), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            this.transit = ((x10.core.Rail)(t$105811));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105812 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105813 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105814 = ((t$105812) * (((long)(t$105813))));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.core.Rail t$105815 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, t$105814, (x10.core.Int.$box(0)), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            this.transitAdopted = ((x10.core.Rail)(t$105815));
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105816 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.core.Rail t$105817 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, ((long)(t$105816)), (x10.core.Int.$box(0)), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            this.live = ((x10.core.Rail)(t$105817));
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105818 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.core.Rail t$105819 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, ((long)(t$105818)), (x10.core.Int.$box(0)), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            this.liveAdopted = ((x10.core.Rail)(t$105819));
            
            //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.util.GrowableRail alloc$102633 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<java.lang.RuntimeException>((java.lang.System[]) null, x10.rtt.Types.EXCEPTION)));
            
            //#line 50 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            alloc$102633.x10$util$GrowableRail$$init$S(((long)(0L)));
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            this.excs = ((x10.util.GrowableRail)(alloc$102633));
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.util.GrowableRail alloc$102634 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<x10.core.Long>((java.lang.System[]) null, x10.rtt.Types.LONG)));
            
            //#line 50 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            alloc$102634.x10$util$GrowableRail$$init$S(((long)(0L)));
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            this.children = ((x10.util.GrowableRail)(alloc$102634));
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            this.adopterId = -1L;
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            this.numDead = 0L;
        }
    }
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    private static x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State> states;
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    public long id;
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    public java.lang.String toString() {
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$105820 = id;
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final java.lang.String t$105821 = (("FinishResilientPlace0(id=") + ((x10.core.Long.$box(t$105820))));
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final java.lang.String t$105822 = ((t$105821) + (")"));
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        return t$105822;
    }
    
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    // creation method for java code (1-phase java constructor)
    public FinishResilientPlace0(final long id) {
        this((java.lang.System[]) null);
        x10$lang$FinishResilientPlace0$$init$S(id);
    }
    
    // constructor for non-virtual call
    final public x10.lang.FinishResilientPlace0 x10$lang$FinishResilientPlace0$$init$S(final long id) {
         {
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            /*super.*/x10$lang$FinishResilient$$init$S();
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.lang.FinishResilientPlace0 this$106228 = this;
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            this.id = id;
        }
        return this;
    }
    
    
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    public static x10.lang.FinishResilient make(final x10.lang.FinishState parent, final x10.util.concurrent.SimpleLatch latch) {
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$105823 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$105827 = ((t$105823) >= (((long)(1L))));
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$105827) {
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105824 = ((">>>> make called, parent=") + (parent));
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105825 = ((t$105824) + (" latch="));
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105826 = ((t$105825) + (latch));
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105826)));
        }
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$105829 = x10.lang.FinishResilientPlace0.$RTT.isInstance(parent);
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        long t$105830 =  0;
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$105829) {
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.lang.FinishResilientPlace0 t$105828 = ((x10.lang.FinishResilientPlace0)(x10.rtt.Types.<x10.lang.FinishResilientPlace0> cast(parent,x10.lang.FinishResilientPlace0.$RTT)));
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            t$105830 = t$105828.id;
        } else {
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            t$105830 = -1L;
        }
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long parentId = t$105830;
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.core.GlobalRef gLatch = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.util.concurrent.SimpleLatch>(x10.util.concurrent.SimpleLatch.$RTT, ((x10.util.concurrent.SimpleLatch)(latch)), (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.lang.Cell idCell = ((x10.lang.Cell)(new x10.lang.Cell<x10.core.Long>((java.lang.System[]) null, x10.rtt.Types.LONG)));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ((x10.lang.Cell<x10.core.Long>)idCell).value = x10.core.Long.$box(-1L);
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.lang.Place t$105840 = ((x10.lang.Place)(x10.lang.FinishResilientPlace0.get$place0()));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.core.fun.Fun_0_0 t$105841 = ((x10.core.fun.Fun_0_0)(new x10.lang.FinishResilientPlace0.$Closure$74(parentId, gLatch, (x10.lang.FinishResilientPlace0.$Closure$74.__1$1x10$util$concurrent$SimpleLatch$2) null)));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        x10.lang.FinishResilient.<x10.core.Long> lowLevelFetch__1$1x10$lang$FinishResilient$$T$2__2$1x10$lang$FinishResilient$$T$2$O(x10.rtt.Types.LONG, ((x10.lang.Place)(t$105840)), ((x10.lang.Cell)(idCell)), ((x10.core.fun.Fun_0_0)(t$105841)));
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long id = x10.core.Long.$unbox(((x10.lang.Cell<x10.core.Long>)idCell).value);
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.lang.FinishResilientPlace0 fs = ((x10.lang.FinishResilientPlace0)(new x10.lang.FinishResilientPlace0((java.lang.System[]) null)));
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        fs.x10$lang$FinishResilientPlace0$$init$S(((long)(id)));
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$105842 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$105844 = ((t$105842) >= (((long)(1L))));
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$105844) {
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105843 = (("<<<< make returning fs=") + (fs));
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105843)));
        }
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        return fs;
    }
    
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    public static void notifyPlaceDeath() {
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$105845 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$105846 = ((t$105845) >= (((long)(1L))));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$105846) {
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(">>>> notifyPlaceDeath called")));
        }
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.lang.Place t$105847 = ((x10.lang.Place)(x10.lang.FinishResilientPlace0.get$place0()));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$105850 = (!x10.rtt.Equality.equalsequals((x10.lang.Place.place(x10.x10rt.X10RT.here())),(t$105847)));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$105850) {
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105848 = x10.lang.FinishResilientPlace0.get$verbose();
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final boolean t$105849 = ((t$105848) >= (((long)(2L))));
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            if (t$105849) {
                
                //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)("not place0, returning")));
            }
            
            //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            return;
        }
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        try {{
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.Runtime.enterAtomic();
            {
                
                //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final x10.util.GrowableRail this$105697 = ((x10.util.GrowableRail)(x10.lang.FinishResilientPlace0.get$states()));
                
                //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long t$105851 = ((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$105697).size;
                
                //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final long i$102737max$102739 = ((t$105851) - (((long)(1L))));
                
                //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                long i$106235 = 0L;
                
                //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106236 = i$106235;
                    
                    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$106237 = ((t$106236) <= (((long)(i$102737max$102739))));
                    
                    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (!(t$106237)) {
                        
                        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        break;
                    }
                    
                    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long id$106232 = i$106235;
                    
                    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$106231 = x10.lang.FinishResilientPlace0.quiescent$O((long)(id$106232));
                    
                    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (t$106231) {
                        
                        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        x10.lang.FinishResilientPlace0.releaseLatch((long)(id$106232));
                    }
                    
                    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106233 = i$106235;
                    
                    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106234 = ((t$106233) + (((long)(1L))));
                    
                    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    i$106235 = t$106234;
                }
            }
        }}finally {{
              
              //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
              x10.lang.Runtime.exitAtomic();
          }}
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$105858 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$105859 = ((t$105858) >= (((long)(1L))));
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$105859) {
            
            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)("<<<< notifyPlaceDeath returning")));
        }
        }
    
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    public void notifySubActivitySpawn(final x10.lang.Place place) {
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long srcId = x10.lang.Place.place(x10.x10rt.X10RT.here()).id;
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long dstId = place.id;
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$105860 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$105867 = ((t$105860) >= (((long)(1L))));
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$105867) {
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105861 = id;
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105862 = ((">>>> notifySubActivitySpawn(id=") + ((x10.core.Long.$box(t$105861))));
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105863 = ((t$105862) + (") called, srcId="));
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105864 = ((t$105863) + ((x10.core.Long.$box(srcId))));
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105865 = ((t$105864) + (" dstId="));
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105866 = ((t$105865) + ((x10.core.Long.$box(dstId))));
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105866)));
        }
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.lang.Place t$105885 = ((x10.lang.Place)(x10.lang.FinishResilientPlace0.get$place0()));
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.core.fun.VoidFun_0_0 t$105886 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.FinishResilientPlace0.$Closure$75(this, this.id, srcId, dstId)));
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        x10.lang.FinishResilient.lowLevelAt$O(((x10.lang.Place)(t$105885)), ((x10.core.fun.VoidFun_0_0)(t$105886)));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$105887 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$105891 = ((t$105887) >= (((long)(1L))));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$105891) {
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105888 = id;
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105889 = (("<<<< notifySubActivitySpawn(id=") + ((x10.core.Long.$box(t$105888))));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105890 = ((t$105889) + (") returning"));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105890)));
        }
    }
    
    
    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    public boolean notifyActivityCreation$O(final x10.lang.Place srcPlace) {
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long srcId = srcPlace.id;
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long dstId = x10.lang.Place.place(x10.x10rt.X10RT.here()).id;
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$105892 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$105899 = ((t$105892) >= (((long)(1L))));
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$105899) {
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105893 = id;
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105894 = ((">>>> notifyActivityCreation(id=") + ((x10.core.Long.$box(t$105893))));
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105895 = ((t$105894) + (") called, srcId="));
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105896 = ((t$105895) + ((x10.core.Long.$box(srcId))));
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105897 = ((t$105896) + (" dstId="));
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105898 = ((t$105897) + ((x10.core.Long.$box(dstId))));
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105898)));
        }
        
        //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$105900 = srcPlace.id;
        
        //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final boolean t$105906 = x10.x10rt.X10RT.isPlaceDead((int)((long)(t$105900)));
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$105906) {
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105901 = x10.lang.FinishResilientPlace0.get$verbose();
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final boolean t$105905 = ((t$105901) >= (((long)(1L))));
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            if (t$105905) {
                
                //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final long t$105902 = id;
                
                //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final java.lang.String t$105903 = (("<<<< notifyActivityCreation(id=") + ((x10.core.Long.$box(t$105902))));
                
                //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final java.lang.String t$105904 = ((t$105903) + (") returning false"));
                
                //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)(t$105904)));
            }
            
            //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            return false;
        }
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.lang.Place t$105926 = ((x10.lang.Place)(x10.lang.FinishResilientPlace0.get$place0()));
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.core.fun.VoidFun_0_0 t$105927 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.FinishResilientPlace0.$Closure$76(this, this.id, dstId, srcId)));
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        x10.lang.FinishResilient.lowLevelAt$O(((x10.lang.Place)(t$105926)), ((x10.core.fun.VoidFun_0_0)(t$105927)));
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$105928 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$105932 = ((t$105928) >= (((long)(1L))));
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$105932) {
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105929 = id;
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105930 = (("<<<< notifyActivityCreation(id=") + ((x10.core.Long.$box(t$105929))));
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105931 = ((t$105930) + (") returning true"));
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105931)));
        }
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        return true;
    }
    
    
    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    public void notifyActivityTermination() {
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long dstId = x10.lang.Place.place(x10.x10rt.X10RT.here()).id;
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$105933 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$105938 = ((t$105933) >= (((long)(1L))));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$105938) {
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105934 = id;
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105935 = ((">>>> notifyActivityTermination(id=") + ((x10.core.Long.$box(t$105934))));
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105936 = ((t$105935) + (") called, dstId="));
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105937 = ((t$105936) + ((x10.core.Long.$box(dstId))));
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105937)));
        }
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.lang.Place t$105951 = ((x10.lang.Place)(x10.lang.FinishResilientPlace0.get$place0()));
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.core.fun.VoidFun_0_0 t$105952 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.FinishResilientPlace0.$Closure$77(this, this.id, dstId)));
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        x10.lang.FinishResilient.lowLevelAt$O(((x10.lang.Place)(t$105951)), ((x10.core.fun.VoidFun_0_0)(t$105952)));
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$105953 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$105957 = ((t$105953) >= (((long)(1L))));
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$105957) {
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105954 = id;
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105955 = (("<<<< notifyActivityTermination(id=") + ((x10.core.Long.$box(t$105954))));
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105956 = ((t$105955) + (") returning"));
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105956)));
        }
    }
    
    
    //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    public void pushException(final java.lang.RuntimeException t) {
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$105958 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$105963 = ((t$105958) >= (((long)(1L))));
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$105963) {
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105959 = id;
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105960 = ((">>>> pushException(id=") + ((x10.core.Long.$box(t$105959))));
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105961 = ((t$105960) + (") called, t="));
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105962 = ((t$105961) + (t));
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105962)));
        }
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.lang.Place t$105967 = ((x10.lang.Place)(x10.lang.FinishResilientPlace0.get$place0()));
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.core.fun.VoidFun_0_0 t$105968 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.FinishResilientPlace0.$Closure$78(this, this.id, t)));
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        x10.lang.FinishResilient.lowLevelAt$O(((x10.lang.Place)(t$105967)), ((x10.core.fun.VoidFun_0_0)(t$105968)));
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$105969 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$105973 = ((t$105969) >= (((long)(1L))));
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$105973) {
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105970 = id;
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105971 = (("<<<< pushException(id=") + ((x10.core.Long.$box(t$105970))));
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105972 = ((t$105971) + (") returning"));
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105972)));
        }
    }
    
    
    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    public void waitForFinish() {
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$105974 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$105978 = ((t$105974) >= (((long)(1L))));
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$105978) {
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105975 = id;
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105976 = ((">>>> waitForFinish(id=") + ((x10.core.Long.$box(t$105975))));
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105977 = ((t$105976) + (") called"));
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105977)));
        }
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        this.notifyActivityTermination();
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.lang.Cell gLatchCell = ((x10.lang.Cell)(new x10.lang.Cell<x10.core.GlobalRef<x10.util.concurrent.SimpleLatch>>((java.lang.System[]) null, x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.util.concurrent.SimpleLatch.$RTT))));
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.util.concurrent.SimpleLatch t$105979 = ((x10.util.concurrent.SimpleLatch)
                                                           (null));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final x10.core.GlobalRef x$105726 = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.util.concurrent.SimpleLatch>(x10.util.concurrent.SimpleLatch.$RTT, ((x10.util.concurrent.SimpleLatch)(null)), (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ((x10.lang.Cell<x10.core.GlobalRef<x10.util.concurrent.SimpleLatch>>)gLatchCell).value = ((x10.core.GlobalRef)(x$105726));
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.lang.Place t$105983 = ((x10.lang.Place)(x10.lang.FinishResilientPlace0.get$place0()));
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.core.fun.Fun_0_0 t$105984 = ((x10.core.fun.Fun_0_0)(new x10.lang.FinishResilientPlace0.$Closure$79(this, this.id)));
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        x10.lang.FinishResilient.<x10.core.GlobalRef<x10.util.concurrent.SimpleLatch>> lowLevelFetch__1$1x10$lang$FinishResilient$$T$2__2$1x10$lang$FinishResilient$$T$2$O(x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.util.concurrent.SimpleLatch.$RTT), ((x10.lang.Place)(t$105983)), ((x10.lang.Cell)(gLatchCell)), ((x10.core.fun.Fun_0_0)(t$105984)));
        
        //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.core.GlobalRef gLatch = ((x10.core.GlobalRef)(((x10.lang.Cell<x10.core.GlobalRef<x10.util.concurrent.SimpleLatch>>)gLatchCell).value));
        
        //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        assert x10.rtt.Equality.equalsequals(((gLatch).home),(x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$105985 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$105988 = ((t$105985) >= (((long)(2L))));
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$105988) {
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105986 = id;
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105987 = (("calling latch.await for id=") + ((x10.core.Long.$box(t$105986))));
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105987)));
        }
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.util.concurrent.SimpleLatch t$105989 = x10.core.GlobalRef.LocalEval.<x10.util.concurrent.SimpleLatch>getLocalOrCopy(x10.util.concurrent.SimpleLatch.$RTT,((x10.core.GlobalRef<x10.util.concurrent.SimpleLatch>)(gLatch)));
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        t$105989.await();
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$105990 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$105993 = ((t$105990) >= (((long)(2L))));
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$105993) {
            
            //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$105991 = id;
            
            //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$105992 = (("returned from latch.await for id=") + ((x10.core.Long.$box(t$105991))));
            
            //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$105992)));
        }
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.lang.Cell excCell = ((x10.lang.Cell)(new x10.lang.Cell<x10.lang.MultipleExceptions>((java.lang.System[]) null, x10.lang.MultipleExceptions.$RTT)));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final x10.lang.MultipleExceptions x$105734 = ((x10.lang.MultipleExceptions)(((x10.lang.MultipleExceptions)
                                                                                      (null))));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ((x10.lang.Cell<x10.lang.MultipleExceptions>)excCell).value = ((x10.lang.MultipleExceptions)(((x10.lang.MultipleExceptions)(null))));
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.lang.Place t$106004 = ((x10.lang.Place)(x10.lang.FinishResilientPlace0.get$place0()));
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.core.fun.Fun_0_0 t$106005 = ((x10.core.fun.Fun_0_0)(new x10.lang.FinishResilientPlace0.$Closure$80(this, this.id)));
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        x10.lang.FinishResilient.<x10.lang.MultipleExceptions> lowLevelFetch__1$1x10$lang$FinishResilient$$T$2__2$1x10$lang$FinishResilient$$T$2$O(x10.lang.MultipleExceptions.$RTT, ((x10.lang.Place)(t$106004)), ((x10.lang.Cell)(excCell)), ((x10.core.fun.Fun_0_0)(t$106005)));
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.lang.MultipleExceptions e = ((x10.lang.MultipleExceptions)(((x10.lang.Cell<x10.lang.MultipleExceptions>)excCell).value));
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$106006 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$106011 = ((t$106006) >= (((long)(1L))));
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$106011) {
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$106007 = id;
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$106008 = (("<<<< waitForFinish(id=") + ((x10.core.Long.$box(t$106007))));
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$106009 = ((t$106008) + (") returning, exc="));
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$106010 = ((t$106009) + (e));
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106010)));
        }
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$106012 = ((e) != (null));
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$106012) {
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            throw e;
        }
    }
    
    
    //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    private static long getCurrentAdopterId$O(final long id) {
        
        //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        assert x10.rtt.Equality.equalsequals((x10.lang.Place.place(x10.x10rt.X10RT.here())),(x10.lang.FinishResilientPlace0.get$place0()));
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        long currentId = id;
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        while (true) {
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            assert ((long) currentId) != ((long) -1L);
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.util.GrowableRail this$105748 = ((x10.util.GrowableRail)(x10.lang.FinishResilientPlace0.get$states()));
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long idx$105747 = currentId;
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10.lang.FinishResilientPlace0.State ret$105749 =  null;
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$106259 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$105748).data));
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.lang.FinishResilientPlace0.State t$106260 = ((x10.lang.FinishResilientPlace0.State[])t$106259.value)[(int)idx$105747];
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret$105749 = t$106260;
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.lang.FinishResilientPlace0.State state = ret$105749;
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final boolean t$106015 = state.isAdopted$O();
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final boolean t$106016 = !(t$106015);
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            if (t$106016) {
                
                //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                break;
            }
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$106017 = state.adopterId;
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            currentId = t$106017;
        }
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$106018 = currentId;
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        return t$106018;
    }
    
    public static long getCurrentAdopterId$P$O(final long id) {
        return x10.lang.FinishResilientPlace0.getCurrentAdopterId$O((long)(id));
    }
    
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    private static void releaseLatch(final long id) {
        
        //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        assert x10.rtt.Equality.equalsequals((x10.lang.Place.place(x10.x10rt.X10RT.here())),(x10.lang.FinishResilientPlace0.get$place0()));
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$106019 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$106022 = ((t$106019) >= (((long)(2L))));
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$106022) {
            
            //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$106020 = (("releaseLatch(id=") + ((x10.core.Long.$box(id))));
            
            //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$106021 = ((t$106020) + (") called"));
            
            //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106021)));
        }
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.util.GrowableRail this$105752 = ((x10.util.GrowableRail)(x10.lang.FinishResilientPlace0.get$states()));
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long idx$105751 = id;
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10.lang.FinishResilientPlace0.State ret$105753 =  null;
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$106261 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$105752).data));
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.lang.FinishResilientPlace0.State t$106262 = ((x10.lang.FinishResilientPlace0.State[])t$106261.value)[(int)idx$105751];
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ret$105753 = t$106262;
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.lang.FinishResilientPlace0.State state = ret$105753;
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.core.GlobalRef gLatch = ((x10.core.GlobalRef)(state.gLatch));
        
        //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.lang.Place t$106029 = ((x10.lang.Place)((gLatch).home));
        
        //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.core.fun.VoidFun_0_0 t$106030 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.FinishResilientPlace0.$Closure$81(id, gLatch, (x10.lang.FinishResilientPlace0.$Closure$81.__1$1x10$util$concurrent$SimpleLatch$2) null)));
        
        //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        x10.lang.FinishResilient.lowLevelSend$O(((x10.lang.Place)(t$106029)), ((x10.core.fun.VoidFun_0_0)(t$106030)));
        
        //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$106031 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$106034 = ((t$106031) >= (((long)(2L))));
        
        //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$106034) {
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$106032 = (("releaseLatch(id=") + ((x10.core.Long.$box(id))));
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$106033 = ((t$106032) + (") returning"));
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106033)));
        }
    }
    
    public static void releaseLatch$P(final long id) {
        x10.lang.FinishResilientPlace0.releaseLatch((long)(id));
    }
    
    
    //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    private static boolean quiescent$O(final long id) {
        
        //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        assert x10.rtt.Equality.equalsequals((x10.lang.Place.place(x10.x10rt.X10RT.here())),(x10.lang.FinishResilientPlace0.get$place0()));
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$106035 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$106038 = ((t$106035) >= (((long)(2L))));
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$106038) {
            
            //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$106036 = (("quiescent(id=") + ((x10.core.Long.$box(id))));
            
            //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$106037 = ((t$106036) + (") called"));
            
            //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106037)));
        }
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.util.GrowableRail this$105756 = ((x10.util.GrowableRail)(x10.lang.FinishResilientPlace0.get$states()));
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long idx$105755 = id;
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10.lang.FinishResilientPlace0.State ret$105757 =  null;
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$106430 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$105756).data));
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.lang.FinishResilientPlace0.State t$106431 = ((x10.lang.FinishResilientPlace0.State[])t$106430.value)[(int)idx$105755];
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ret$105757 = t$106431;
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.lang.FinishResilientPlace0.State state = ret$105757;
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$106041 = ((state) == (null));
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$106041) {
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            return false;
        }
        
        //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long nd = ((long)x10.x10rt.X10RT.numDead());
        
        //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$106042 = state.numDead;
        
        //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$106097 = ((long) nd) != ((long) t$106042);
        
        //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$106097) {
            
            //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            state.numDead = nd;
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.util.GrowableRail children = ((x10.util.GrowableRail)(state.children));
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            long chIndex$106309 = 0L;
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            for (;
                 true;
                 ) {
                
                //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final long t$106310 = chIndex$106309;
                
                //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long t$106311 = ((x10.util.GrowableRail<x10.core.Long>)children).size;
                
                //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final boolean t$106312 = ((t$106310) < (((long)(t$106311))));
                
                //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                if (!(t$106312)) {
                    
                    //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    break;
                }
                
                //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                L$106313: {
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final long idx$106314 = chIndex$106309;
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    long ret$106315 =  0;
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.core.Rail t$106301 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.core.Long>)children).data));
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final long t$106302 = ((long[])t$106301.value)[(int)idx$106314];
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    ret$106315 = t$106302;
                    //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long childId$106316 = ret$106315;
                    //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.util.GrowableRail this$106317 = ((x10.util.GrowableRail)(x10.lang.FinishResilientPlace0.get$states()));
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final long idx$106318 = childId$106316;
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    x10.lang.FinishResilientPlace0.State ret$106319 =  null;
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.core.Rail t$106303 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$106317).data));
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.lang.FinishResilientPlace0.State t$106304 = ((x10.lang.FinishResilientPlace0.State[])t$106303.value)[(int)idx$106318];
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    ret$106319 = t$106304;
                    //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.lang.FinishResilientPlace0.State childState$106320 = ret$106319;
                    //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$106321 = ((childState$106320) == (null));
                    //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (t$106321) {
                        
                        //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        break L$106313;
                    }
                    //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.core.GlobalRef t$106322 = ((x10.core.GlobalRef)(childState$106320.gLatch));
                    //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.lang.Place this$106323 = ((x10.lang.Place)((t$106322).home));
                    //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
                    final long t$106324 = this$106323.id;
                    //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
                    final boolean t$106325 = x10.x10rt.X10RT.isPlaceDead((int)((long)(t$106324)));
                    //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$106326 = !(t$106325);
                    //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (t$106326) {
                        
                        //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        break L$106313;
                    }
                    //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long lastChildId$106327 = x10.core.Long.$unbox(((x10.util.GrowableRail<x10.core.Long>)children).removeLast$G());
                    //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106328 = chIndex$106309;
                    //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final long t$106329 = ((x10.util.GrowableRail<x10.core.Long>)children).size;
                    //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$106330 = ((t$106328) < (((long)(t$106329))));
                    //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (t$106330) {
                        
                        //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final long idx$106331 = chIndex$106309;
                        
                        //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final long v$106332 = lastChildId$106327;
                        
                        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final long t$106263 = ((x10.util.GrowableRail<x10.core.Long>)children).size;
                        
                        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final boolean t$106264 = ((long) idx$106331) == ((long) t$106263);
                        
                        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        if (t$106264) {
                            
                            //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            ((x10.util.GrowableRail<x10.core.Long>)children).add__0x10$util$GrowableRail$$T(x10.core.Long.$box(v$106332));
                        } else {
                            
                            //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            final x10.core.Rail t$106265 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.core.Long>)children).data));
                            
                            //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            ((long[])t$106265.value)[(int)idx$106331] = v$106332;
                        }
                    }
                    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106333 = chIndex$106309;
                    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106334 = ((t$106333) - (((long)(1L))));
                    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    chIndex$106309 = t$106334;
                    //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106335 = x10.lang.FinishResilientPlace0.get$verbose();
                    //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$106336 = ((t$106335) >= (((long)(3L))));
                    //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (t$106336) {
                        
                        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final java.lang.String t$106337 = (("adopting childId=") + ((x10.core.Long.$box(childId$106316))));
                        
                        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        x10.lang.FinishResilient.debug(((java.lang.String)(t$106337)));
                    }
                    //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    assert !(childState$106320.isAdopted$O());
                    //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    childState$106320.adopterId = id;
                    //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.util.GrowableRail t$106338 = ((x10.util.GrowableRail)(state.children));
                    //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.util.GrowableRail t$106339 = ((x10.util.GrowableRail)(childState$106320.children));
                    //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    ((x10.util.GrowableRail<x10.core.Long>)t$106338).addAll__0$1x10$util$GrowableRail$$T$2(((x10.util.GrowableRail)(t$106339)));
                    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106305 = x10.lang.Place.get$MAX_PLACES();
                    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long i$102773max$106306 = ((t$106305) - (((long)(1L))));
                    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    long i$106298 = 0L;
                    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$106299 = i$106298;
                        
                        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final boolean t$106300 = ((t$106299) <= (((long)(i$102773max$106306))));
                        
                        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        if (!(t$106300)) {
                            
                            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            break;
                        }
                        
                        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long i$106295 = i$106298;
                        
                        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.core.Rail a$106286 = ((x10.core.Rail)(state.liveAdopted));
                        
                        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long i$106287 = i$106295;
                        
                        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int t$106288 = ((int[])a$106286.value)[(int)i$106287];
                        
                        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.core.Rail t$106289 = ((x10.core.Rail)(childState$106320.live));
                        
                        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int t$106290 = ((int[])t$106289.value)[(int)i$106295];
                        
                        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.core.Rail t$106291 = ((x10.core.Rail)(childState$106320.liveAdopted));
                        
                        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int t$106292 = ((int[])t$106291.value)[(int)i$106295];
                        
                        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int t$106293 = ((t$106290) + (((int)(t$106292))));
                        
                        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int r$106294 = ((t$106288) + (((int)(t$106293))));
                        
                        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ((int[])a$106286.value)[(int)i$106287] = r$106294;
                        
                        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$106284 = x10.lang.Place.get$MAX_PLACES();
                        
                        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long i$102755max$106285 = ((t$106284) - (((long)(1L))));
                        
                        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        long i$106281 = 0L;
                        
                        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final long t$106282 = i$106281;
                            
                            //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final boolean t$106283 = ((t$106282) <= (((long)(i$102755max$106285))));
                            
                            //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            if (!(t$106283)) {
                                
                                //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                                break;
                            }
                            
                            //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final long j$106278 = i$106281;
                            
                            //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final long t$106266 = x10.lang.Place.get$MAX_PLACES();
                            
                            //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final long t$106267 = ((i$106295) * (((long)(t$106266))));
                            
                            //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final long idx$106268 = ((t$106267) + (((long)(j$106278))));
                            
                            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final x10.core.Rail a$106269 = ((x10.core.Rail)(state.transitAdopted));
                            
                            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final long i$106270 = idx$106268;
                            
                            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final int t$106271 = ((int[])a$106269.value)[(int)i$106270];
                            
                            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final x10.core.Rail t$106272 = ((x10.core.Rail)(childState$106320.transit));
                            
                            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final int t$106273 = ((int[])t$106272.value)[(int)idx$106268];
                            
                            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final x10.core.Rail t$106274 = ((x10.core.Rail)(childState$106320.transitAdopted));
                            
                            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final int t$106275 = ((int[])t$106274.value)[(int)idx$106268];
                            
                            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final int t$106276 = ((t$106273) + (((int)(t$106275))));
                            
                            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final int r$106277 = ((t$106271) + (((int)(t$106276))));
                            
                            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            ((int[])a$106269.value)[(int)i$106270] = r$106277;
                            
                            //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final long t$106279 = i$106281;
                            
                            //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final long t$106280 = ((t$106279) + (((long)(1L))));
                            
                            //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            i$106281 = t$106280;
                        }
                        
                        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$106296 = i$106298;
                        
                        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$106297 = ((t$106296) + (((long)(1L))));
                        
                        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        i$106298 = t$106297;
                    }
                }
                
                //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final long t$106307 = chIndex$106309;
                
                //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final long t$106308 = ((t$106307) + (((long)(1L))));
                
                //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                chIndex$106309 = t$106308;
            }
        }
        
        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$106432 = x10.lang.Place.get$MAX_PLACES();
        
        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long i$102845max$106433 = ((t$106432) - (((long)(1L))));
        
        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        long i$106392 = 0L;
        
        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        for (;
             true;
             ) {
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$106393 = i$106392;
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final boolean t$106394 = ((t$106393) <= (((long)(i$102845max$106433))));
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            if (!(t$106394)) {
                
                //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                break;
            }
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long i$106389 = i$106392;
            
            //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final boolean t$106386 = x10.x10rt.X10RT.isPlaceDead((int)((long)(i$106389)));
            
            //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            if (t$106386) {
                
                //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final x10.core.Rail t$106381 = ((x10.core.Rail)(state.live));
                
                //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final int t$106382 = ((int[])t$106381.value)[(int)i$106389];
                
                //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final long i$102791max$106383 = ((long)(((int)(t$106382))));
                
                //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                long i$106347 = 1L;
                
                //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106348 = i$106347;
                    
                    //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$106349 = ((t$106348) <= (((long)(i$102791max$106383))));
                    
                    //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (!(t$106349)) {
                        
                        //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        break;
                    }
                    
                    //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long unused$106344 = i$106347;
                    
                    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106340 = x10.lang.FinishResilientPlace0.get$verbose();
                    
                    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$106341 = ((t$106340) >= (((long)(3L))));
                    
                    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (t$106341) {
                        
                        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final java.lang.String t$106342 = (("adding DPE for live(") + ((x10.core.Long.$box(i$106389))));
                        
                        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final java.lang.String t$106343 = ((t$106342) + (")"));
                        
                        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        x10.lang.FinishResilient.debug(((java.lang.String)(t$106343)));
                    }
                    
                    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    x10.lang.FinishResilientPlace0.addDeadPlaceException(((x10.lang.FinishResilientPlace0.State)(state)), (long)(i$106389));
                    
                    //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106345 = i$106347;
                    
                    //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106346 = ((t$106345) + (((long)(1L))));
                    
                    //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    i$106347 = t$106346;
                }
                
                //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final x10.core.Rail t$106387 = ((x10.core.Rail)(state.live));
                
                //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                ((int[])t$106387.value)[(int)i$106389] = 0;
                
                //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final x10.core.Rail t$106388 = ((x10.core.Rail)(state.liveAdopted));
                
                //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                ((int[])t$106388.value)[(int)i$106389] = 0;
                
                //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final long t$106384 = x10.lang.Place.get$MAX_PLACES();
                
                //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final long i$102827max$106385 = ((t$106384) - (((long)(1L))));
                
                //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                long i$106378 = 0L;
                
                //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106379 = i$106378;
                    
                    //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$106380 = ((t$106379) <= (((long)(i$102827max$106385))));
                    
                    //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (!(t$106380)) {
                        
                        //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        break;
                    }
                    
                    //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long j$106375 = i$106378;
                    
                    //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106365 = x10.lang.Place.get$MAX_PLACES();
                    
                    //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106366 = ((i$106389) * (((long)(t$106365))));
                    
                    //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long idx$106367 = ((t$106366) + (((long)(j$106375))));
                    
                    //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.core.Rail t$106368 = ((x10.core.Rail)(state.transit));
                    
                    //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    ((int[])t$106368.value)[(int)idx$106367] = 0;
                    
                    //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.core.Rail t$106369 = ((x10.core.Rail)(state.transitAdopted));
                    
                    //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    ((int[])t$106369.value)[(int)idx$106367] = 0;
                    
                    //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106370 = x10.lang.Place.get$MAX_PLACES();
                    
                    //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106371 = ((j$106375) * (((long)(t$106370))));
                    
                    //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long idx$106372 = ((t$106371) + (((long)(i$106389))));
                    
                    //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.core.Rail t$106362 = ((x10.core.Rail)(state.transit));
                    
                    //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final int t$106363 = ((int[])t$106362.value)[(int)idx$106372];
                    
                    //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long i$102809max$106364 = ((long)(((int)(t$106363))));
                    
                    //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    long i$106359 = 1L;
                    
                    //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$106360 = i$106359;
                        
                        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final boolean t$106361 = ((t$106360) <= (((long)(i$102809max$106364))));
                        
                        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        if (!(t$106361)) {
                            
                            //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            break;
                        }
                        
                        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long unused$106356 = i$106359;
                        
                        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$106350 = x10.lang.FinishResilientPlace0.get$verbose();
                        
                        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final boolean t$106351 = ((t$106350) >= (((long)(3L))));
                        
                        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        if (t$106351) {
                            
                            //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final java.lang.String t$106352 = (("adding DPE for transit(") + ((x10.core.Long.$box(j$106375))));
                            
                            //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final java.lang.String t$106353 = ((t$106352) + (","));
                            
                            //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final java.lang.String t$106354 = ((t$106353) + ((x10.core.Long.$box(i$106389))));
                            
                            //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            final java.lang.String t$106355 = ((t$106354) + (")"));
                            
                            //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                            x10.lang.FinishResilient.debug(((java.lang.String)(t$106355)));
                        }
                        
                        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        x10.lang.FinishResilientPlace0.addDeadPlaceException(((x10.lang.FinishResilientPlace0.State)(state)), (long)(i$106389));
                        
                        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$106357 = i$106359;
                        
                        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$106358 = ((t$106357) + (((long)(1L))));
                        
                        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        i$106359 = t$106358;
                    }
                    
                    //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.core.Rail t$106373 = ((x10.core.Rail)(state.transit));
                    
                    //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    ((int[])t$106373.value)[(int)idx$106372] = 0;
                    
                    //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.core.Rail t$106374 = ((x10.core.Rail)(state.transitAdopted));
                    
                    //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    ((int[])t$106374.value)[(int)idx$106372] = 0;
                    
                    //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106376 = i$106378;
                    
                    //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$106377 = ((t$106376) + (((long)(1L))));
                    
                    //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    i$106378 = t$106377;
                }
            }
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$106390 = i$106392;
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$106391 = ((t$106390) + (((long)(1L))));
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            i$106392 = t$106391;
        }
        
        //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$106145 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$106147 = ((t$106145) >= (((long)(3L))));
        
        //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$106147) {
            
            //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$106146 = (("DUMP id=") + ((x10.core.Long.$box(id))));
            
            //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            state.dump(((java.lang.Object)(t$106146)));
        }
        
        //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        boolean quiet = true;
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$106434 = x10.lang.Place.get$MAX_PLACES();
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long i$102881max$106435 = ((t$106434) - (((long)(1L))));
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        long i$106427 = 0L;
        
        //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        for (;
             true;
             ) {
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$106428 = i$106427;
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final boolean t$106429 = ((t$106428) <= (((long)(i$102881max$106435))));
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            if (!(t$106429)) {
                
                //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                break;
            }
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long i$106424 = i$106427;
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.core.Rail t$106414 = ((x10.core.Rail)(state.live));
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final int t$106415 = ((int[])t$106414.value)[(int)i$106424];
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$106416 = ((long)(((int)(t$106415))));
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final boolean t$106417 = ((t$106416) > (((long)(0L))));
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            if (t$106417) {
                
                //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                quiet = false;
                
                //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                break;
            }
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.core.Rail t$106418 = ((x10.core.Rail)(state.liveAdopted));
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final int t$106419 = ((int[])t$106418.value)[(int)i$106424];
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$106420 = ((long)(((int)(t$106419))));
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final boolean t$106421 = ((t$106420) > (((long)(0L))));
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            if (t$106421) {
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                quiet = false;
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                break;
            }
            
            //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$106412 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long i$102863max$106413 = ((t$106412) - (((long)(1L))));
            
            //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            long i$106409 = 0L;
            
            //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            for (;
                 true;
                 ) {
                
                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final long t$106410 = i$106409;
                
                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final boolean t$106411 = ((t$106410) <= (((long)(i$102863max$106413))));
                
                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                if (!(t$106411)) {
                    
                    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    break;
                }
                
                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final long j$106406 = i$106409;
                
                //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final long t$106395 = x10.lang.Place.get$MAX_PLACES();
                
                //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final long t$106396 = ((i$106424) * (((long)(t$106395))));
                
                //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final long idx$106397 = ((t$106396) + (((long)(j$106406))));
                
                //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final x10.core.Rail t$106398 = ((x10.core.Rail)(state.transit));
                
                //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final int t$106399 = ((int[])t$106398.value)[(int)idx$106397];
                
                //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final long t$106400 = ((long)(((int)(t$106399))));
                
                //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final boolean t$106401 = ((t$106400) > (((long)(0L))));
                
                //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                if (t$106401) {
                    
                    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    quiet = false;
                    
                    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    break;
                }
                
                //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final x10.core.Rail t$106402 = ((x10.core.Rail)(state.transitAdopted));
                
                //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final int t$106403 = ((int[])t$106402.value)[(int)idx$106397];
                
                //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final long t$106404 = ((long)(((int)(t$106403))));
                
                //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final boolean t$106405 = ((t$106404) > (((long)(0L))));
                
                //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                if (t$106405) {
                    
                    //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    quiet = false;
                    
                    //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    break;
                }
                
                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final long t$106407 = i$106409;
                
                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final long t$106408 = ((t$106407) + (((long)(1L))));
                
                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                i$106409 = t$106408;
            }
            
            //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final boolean t$106422 = quiet;
            
            //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final boolean t$106423 = !(t$106422);
            
            //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            if (t$106423) {
                
                //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                break;
            }
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$106425 = i$106427;
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$106426 = ((t$106425) + (((long)(1L))));
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            i$106427 = t$106426;
        }
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final long t$106180 = x10.lang.FinishResilientPlace0.get$verbose();
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$106185 = ((t$106180) >= (((long)(2L))));
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        if (t$106185) {
            
            //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$106181 = (("quiescent(id=") + ((x10.core.Long.$box(id))));
            
            //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$106182 = ((t$106181) + (") returning "));
            
            //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final boolean t$106183 = quiet;
            
            //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final java.lang.String t$106184 = ((t$106182) + ((x10.core.Boolean.$box(t$106183))));
            
            //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106184)));
        }
        
        //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final boolean t$106186 = quiet;
        
        //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        return t$106186;
    }
    
    public static boolean quiescent$P$O(final long id) {
        return x10.lang.FinishResilientPlace0.quiescent$O((long)(id));
    }
    
    
    //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    private static void addDeadPlaceException(final x10.lang.FinishResilientPlace0.State state, final long placeId) {
        
        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.lang.Place alloc$102635 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
        
        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        alloc$102635.x10$lang$Place$$init$S(((long)(placeId)));
        
        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.lang.DeadPlaceException e = ((x10.lang.DeadPlaceException)(new x10.lang.DeadPlaceException(((x10.lang.Place)(alloc$102635)))));
        
        //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        x10.runtime.impl.java.EvalUtils.eval(e.fillInStackTrace());
        
        //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        final x10.util.GrowableRail t$106187 = ((x10.util.GrowableRail)(state.excs));
        
        //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        ((x10.util.GrowableRail<java.lang.RuntimeException>)t$106187).add__0x10$util$GrowableRail$$T(((java.lang.RuntimeException)(e)));
    }
    
    public static void addDeadPlaceException$P(final x10.lang.FinishResilientPlace0.State state, final long placeId) {
        x10.lang.FinishResilientPlace0.addDeadPlaceException(((x10.lang.FinishResilientPlace0.State)(state)), (long)(placeId));
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    final public x10.lang.FinishResilientPlace0 x10$lang$FinishResilientPlace0$$this$x10$lang$FinishResilientPlace0() {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
        return x10.lang.FinishResilientPlace0.this;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
    final public void __fieldInitializers_x10_lang_FinishResilientPlace0() {
        
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$states = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$states;
    final private static x10.core.concurrent.AtomicInteger initStatus$place0 = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$place0;
    final private static x10.core.concurrent.AtomicInteger initStatus$verbose = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$verbose;
    
    public static long get$verbose() {
        if (((int) x10.lang.FinishResilientPlace0.initStatus$verbose.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.FinishResilientPlace0.verbose;
        }
        if (((int) x10.lang.FinishResilientPlace0.initStatus$verbose.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.FinishResilientPlace0.exception$verbose;
        }
        if (x10.lang.FinishResilientPlace0.initStatus$verbose.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.FinishResilientPlace0.verbose = x10.lang.FinishResilient.get$verbose();
            }}catch (java.lang.Throwable exc$106436) {
                x10.lang.FinishResilientPlace0.exception$verbose = new x10.lang.ExceptionInInitializer(exc$106436);
                x10.lang.FinishResilientPlace0.initStatus$verbose.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.FinishResilientPlace0.exception$verbose;
            }
            x10.lang.FinishResilientPlace0.initStatus$verbose.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.FinishResilientPlace0.initStatus$verbose.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.FinishResilientPlace0.initStatus$verbose.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.FinishResilientPlace0.initStatus$verbose.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.FinishResilientPlace0.exception$verbose;
                }
            }
        }
        return x10.lang.FinishResilientPlace0.verbose;
    }
    
    public static x10.lang.Place get$place0() {
        if (((int) x10.lang.FinishResilientPlace0.initStatus$place0.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.FinishResilientPlace0.place0;
        }
        if (((int) x10.lang.FinishResilientPlace0.initStatus$place0.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.FinishResilientPlace0.exception$place0;
        }
        if (x10.lang.FinishResilientPlace0.initStatus$place0.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.FinishResilientPlace0.place0 = ((x10.lang.Place)(x10.lang.Place.get$FIRST_PLACE()));
            }}catch (java.lang.Throwable exc$106437) {
                x10.lang.FinishResilientPlace0.exception$place0 = new x10.lang.ExceptionInInitializer(exc$106437);
                x10.lang.FinishResilientPlace0.initStatus$place0.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.FinishResilientPlace0.exception$place0;
            }
            x10.lang.FinishResilientPlace0.initStatus$place0.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.FinishResilientPlace0.initStatus$place0.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.FinishResilientPlace0.initStatus$place0.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.FinishResilientPlace0.initStatus$place0.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.FinishResilientPlace0.exception$place0;
                }
            }
        }
        return x10.lang.FinishResilientPlace0.place0;
    }
    
    public static x10.util.GrowableRail get$states() {
        if (((int) x10.lang.FinishResilientPlace0.initStatus$states.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.FinishResilientPlace0.states;
        }
        if (((int) x10.lang.FinishResilientPlace0.initStatus$states.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.FinishResilientPlace0.exception$states;
        }
        if (x10.lang.FinishResilientPlace0.initStatus$states.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.FinishResilientPlace0.states = ((long) x10.lang.Place.place(x10.x10rt.X10RT.here()).id) == ((long) 0L)
                  ? new x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>((java.lang.System[]) null, x10.lang.FinishResilientPlace0.State.$RTT).x10$util$GrowableRail$$init$S()
                  : null;
            }}catch (java.lang.Throwable exc$106438) {
                x10.lang.FinishResilientPlace0.exception$states = new x10.lang.ExceptionInInitializer(exc$106438);
                x10.lang.FinishResilientPlace0.initStatus$states.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.FinishResilientPlace0.exception$states;
            }
            x10.lang.FinishResilientPlace0.initStatus$states.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.FinishResilientPlace0.initStatus$states.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.FinishResilientPlace0.initStatus$states.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.FinishResilientPlace0.initStatus$states.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.FinishResilientPlace0.exception$states;
                }
            }
        }
        return x10.lang.FinishResilientPlace0.states;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$74 extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$74> $RTT = 
            x10.rtt.StaticFunType.<$Closure$74> make($Closure$74.class,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.Types.LONG)
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilientPlace0.$Closure$74 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.parentId = $deserializer.readLong();
            $_obj.gLatch = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilientPlace0.$Closure$74 $_obj = new x10.lang.FinishResilientPlace0.$Closure$74((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.parentId);
            $serializer.write(this.gLatch);
            
        }
        
        // constructor just for allocation
        public $Closure$74(final java.lang.System[] $dummy) {
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.core.Long $apply$G() {
            return x10.core.Long.$box($apply$O());
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$util$concurrent$SimpleLatch$2 {}
        
    
        
        public long $apply$O() {
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            try {{
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.util.GrowableRail this$105689 = ((x10.util.GrowableRail)(x10.lang.FinishResilientPlace0.get$states()));
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long id = ((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$105689).size;
                    
                    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.lang.FinishResilientPlace0.State state = ((x10.lang.FinishResilientPlace0.State)(new x10.lang.FinishResilientPlace0.State((java.lang.System[]) null)));
                    
                    //#line 36 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long parentId$105690 = this.parentId;
                    
                    //#line 36 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.core.GlobalRef gLatch$105691 = ((x10.core.GlobalRef)(this.gLatch));
                    
                    //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    state.__fieldInitializers_x10_lang_FinishResilientPlace0_State();
                    
                    //#line 37 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    state.parentId = parentId$105690;
                    
                    //#line 37 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    state.gLatch = ((x10.core.GlobalRef)(gLatch$105691));
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.util.GrowableRail t$105831 = ((x10.util.GrowableRail)(x10.lang.FinishResilientPlace0.get$states()));
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    ((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)t$105831).add__0x10$util$GrowableRail$$T(((x10.lang.FinishResilientPlace0.State)(state)));
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.core.Rail t$105833 = ((x10.core.Rail)(state.live));
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.lang.Place t$105832 = ((x10.lang.Place)((this.gLatch).home));
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$105834 = t$105832.id;
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    ((int[])t$105833.value)[(int)t$105834] = 1;
                    
                    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$105839 = ((long) this.parentId) != ((long) -1L);
                    
                    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (t$105839) {
                        
                        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.util.GrowableRail this$105694 = ((x10.util.GrowableRail)(x10.lang.FinishResilientPlace0.get$states()));
                        
                        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final long idx$105693 = this.parentId;
                        
                        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        x10.lang.FinishResilientPlace0.State ret$105695 =  null;
                        
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final x10.core.Rail t$106229 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$105694).data));
                        
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final x10.lang.FinishResilientPlace0.State t$106230 = ((x10.lang.FinishResilientPlace0.State[])t$106229.value)[(int)idx$105693];
                        
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        ret$105695 = t$106230;
                        
                        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final x10.lang.FinishResilientPlace0.State t$105837 = ret$105695;
                        
                        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.util.GrowableRail t$105838 = ((x10.util.GrowableRail)(t$105837.children));
                        
                        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ((x10.util.GrowableRail<x10.core.Long>)t$105838).add__0x10$util$GrowableRail$$T(x10.core.Long.$box(id));
                    }
                    
                    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    return id;
                }
            }}finally {{
                  
                  //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            }
        
        public long parentId;
        public x10.core.GlobalRef<x10.util.concurrent.SimpleLatch> gLatch;
        
        public $Closure$74(final long parentId, final x10.core.GlobalRef<x10.util.concurrent.SimpleLatch> gLatch, __1$1x10$util$concurrent$SimpleLatch$2 $dummy) {
             {
                this.parentId = parentId;
                this.gLatch = ((x10.core.GlobalRef)(gLatch));
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$75 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$75> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$75> make($Closure$75.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilientPlace0.$Closure$75 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.id = $deserializer.readLong();
            $_obj.srcId = $deserializer.readLong();
            $_obj.dstId = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilientPlace0.$Closure$75 $_obj = new x10.lang.FinishResilientPlace0.$Closure$75((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.id);
            $serializer.write(this.srcId);
            $serializer.write(this.dstId);
            
        }
        
        // constructor just for allocation
        public $Closure$75(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            try {{
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.util.GrowableRail this$105699 = ((x10.util.GrowableRail)(x10.lang.FinishResilientPlace0.get$states()));
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final long idx$105698 = this.id;
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    x10.lang.FinishResilientPlace0.State ret$105700 =  null;
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.core.Rail t$106240 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$105699).data));
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.lang.FinishResilientPlace0.State t$106241 = ((x10.lang.FinishResilientPlace0.State[])t$106240.value)[(int)idx$105698];
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    ret$105700 = t$106241;
                    
                    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.lang.FinishResilientPlace0.State state = ret$105700;
                    
                    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$105870 = state.isAdopted$O();
                    
                    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$105880 = !(t$105870);
                    
                    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (t$105880) {
                        
                        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.core.Rail a$101244 = ((x10.core.Rail)(state.transit));
                        
                        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$105871 = x10.lang.Place.get$MAX_PLACES();
                        
                        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$105872 = ((this.srcId) * (((long)(t$105871))));
                        
                        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long i0$101245 = ((t$105872) + (((long)(this.dstId))));
                        
                        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int t$105873 = ((int[])a$101244.value)[(int)i0$101245];
                        
                        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int r$101253 = ((t$105873) + (((int)(1))));
                        
                        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ((int[])a$101244.value)[(int)i0$101245] = r$101253;
                    } else {
                        
                        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$105874 = this.id;
                        
                        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long adopterId = x10.lang.FinishResilientPlace0.getCurrentAdopterId$O((long)(t$105874));
                        
                        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.util.GrowableRail this$105703 = ((x10.util.GrowableRail)(x10.lang.FinishResilientPlace0.get$states()));
                        
                        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final long idx$105702 = adopterId;
                        
                        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        x10.lang.FinishResilientPlace0.State ret$105704 =  null;
                        
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final x10.core.Rail t$106238 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$105703).data));
                        
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final x10.lang.FinishResilientPlace0.State t$106239 = ((x10.lang.FinishResilientPlace0.State[])t$106238.value)[(int)idx$105702];
                        
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        ret$105704 = t$106239;
                        
                        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.lang.FinishResilientPlace0.State adopterState = ret$105704;
                        
                        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.core.Rail a$101270 = ((x10.core.Rail)(adopterState.transitAdopted));
                        
                        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$105877 = x10.lang.Place.get$MAX_PLACES();
                        
                        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$105878 = ((this.srcId) * (((long)(t$105877))));
                        
                        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long i0$101271 = ((t$105878) + (((long)(this.dstId))));
                        
                        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int t$105879 = ((int[])a$101270.value)[(int)i0$101271];
                        
                        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int r$101279 = ((t$105879) + (((int)(1))));
                        
                        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ((int[])a$101270.value)[(int)i0$101271] = r$101279;
                    }
                    
                    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$105881 = x10.lang.FinishResilientPlace0.get$verbose();
                    
                    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$105884 = ((t$105881) >= (((long)(3L))));
                    
                    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (t$105884) {
                        
                        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$105882 = this.id;
                        
                        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final java.lang.String t$105883 = (("DUMP id=") + ((x10.core.Long.$box(t$105882))));
                        
                        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        state.dump(((java.lang.Object)(t$105883)));
                    }
                }
            }}finally {{
                  
                  //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            }
        
        public x10.lang.FinishResilientPlace0 out$$;
        public long id;
        public long srcId;
        public long dstId;
        
        public $Closure$75(final x10.lang.FinishResilientPlace0 out$$, final long id, final long srcId, final long dstId) {
             {
                this.out$$ = out$$;
                this.id = id;
                this.srcId = srcId;
                this.dstId = dstId;
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$76 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$76> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$76> make($Closure$76.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilientPlace0.$Closure$76 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.id = $deserializer.readLong();
            $_obj.dstId = $deserializer.readLong();
            $_obj.srcId = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilientPlace0.$Closure$76 $_obj = new x10.lang.FinishResilientPlace0.$Closure$76((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.id);
            $serializer.write(this.dstId);
            $serializer.write(this.srcId);
            
        }
        
        // constructor just for allocation
        public $Closure$76(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            try {{
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.util.GrowableRail this$105707 = ((x10.util.GrowableRail)(x10.lang.FinishResilientPlace0.get$states()));
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final long idx$105706 = this.id;
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    x10.lang.FinishResilientPlace0.State ret$105708 =  null;
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.core.Rail t$106244 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$105707).data));
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.lang.FinishResilientPlace0.State t$106245 = ((x10.lang.FinishResilientPlace0.State[])t$106244.value)[(int)idx$105706];
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    ret$105708 = t$106245;
                    
                    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.lang.FinishResilientPlace0.State state = ret$105708;
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$105909 = state.isAdopted$O();
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$105921 = !(t$105909);
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (t$105921) {
                        
                        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.core.Rail a$101504 = ((x10.core.Rail)(state.live));
                        
                        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long i0$101505 = this.dstId;
                        
                        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int t$105910 = ((int[])a$101504.value)[(int)i0$101505];
                        
                        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int r$101513 = ((t$105910) + (((int)(1))));
                        
                        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ((int[])a$101504.value)[(int)i0$101505] = r$101513;
                        
                        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.core.Rail a$101530 = ((x10.core.Rail)(state.transit));
                        
                        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$105911 = x10.lang.Place.get$MAX_PLACES();
                        
                        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$105912 = ((this.srcId) * (((long)(t$105911))));
                        
                        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long i0$101531 = ((t$105912) + (((long)(this.dstId))));
                        
                        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int t$105913 = ((int[])a$101530.value)[(int)i0$101531];
                        
                        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int r$101539 = ((t$105913) - (((int)(1))));
                        
                        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ((int[])a$101530.value)[(int)i0$101531] = r$101539;
                    } else {
                        
                        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$105914 = this.id;
                        
                        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long adopterId = x10.lang.FinishResilientPlace0.getCurrentAdopterId$O((long)(t$105914));
                        
                        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.util.GrowableRail this$105711 = ((x10.util.GrowableRail)(x10.lang.FinishResilientPlace0.get$states()));
                        
                        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final long idx$105710 = adopterId;
                        
                        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        x10.lang.FinishResilientPlace0.State ret$105712 =  null;
                        
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final x10.core.Rail t$106242 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$105711).data));
                        
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final x10.lang.FinishResilientPlace0.State t$106243 = ((x10.lang.FinishResilientPlace0.State[])t$106242.value)[(int)idx$105710];
                        
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        ret$105712 = t$106243;
                        
                        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.lang.FinishResilientPlace0.State adopterState = ret$105712;
                        
                        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.core.Rail a$101542 = ((x10.core.Rail)(adopterState.liveAdopted));
                        
                        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long i0$101543 = this.dstId;
                        
                        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int t$105917 = ((int[])a$101542.value)[(int)i0$101543];
                        
                        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int r$101551 = ((t$105917) + (((int)(1))));
                        
                        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ((int[])a$101542.value)[(int)i0$101543] = r$101551;
                        
                        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.core.Rail a$101568 = ((x10.core.Rail)(adopterState.transitAdopted));
                        
                        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$105918 = x10.lang.Place.get$MAX_PLACES();
                        
                        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$105919 = ((this.srcId) * (((long)(t$105918))));
                        
                        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long i0$101569 = ((t$105919) + (((long)(this.dstId))));
                        
                        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int t$105920 = ((int[])a$101568.value)[(int)i0$101569];
                        
                        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int r$101577 = ((t$105920) - (((int)(1))));
                        
                        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ((int[])a$101568.value)[(int)i0$101569] = r$101577;
                    }
                    
                    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$105922 = x10.lang.FinishResilientPlace0.get$verbose();
                    
                    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$105925 = ((t$105922) >= (((long)(3L))));
                    
                    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (t$105925) {
                        
                        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$105923 = this.id;
                        
                        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final java.lang.String t$105924 = (("DUMP id=") + ((x10.core.Long.$box(t$105923))));
                        
                        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        state.dump(((java.lang.Object)(t$105924)));
                    }
                }
            }}finally {{
                  
                  //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            }
        
        public x10.lang.FinishResilientPlace0 out$$;
        public long id;
        public long dstId;
        public long srcId;
        
        public $Closure$76(final x10.lang.FinishResilientPlace0 out$$, final long id, final long dstId, final long srcId) {
             {
                this.out$$ = out$$;
                this.id = id;
                this.dstId = dstId;
                this.srcId = srcId;
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$77 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$77> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$77> make($Closure$77.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilientPlace0.$Closure$77 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.id = $deserializer.readLong();
            $_obj.dstId = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilientPlace0.$Closure$77 $_obj = new x10.lang.FinishResilientPlace0.$Closure$77((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.id);
            $serializer.write(this.dstId);
            
        }
        
        // constructor just for allocation
        public $Closure$77(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            try {{
                
                //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.util.GrowableRail this$105715 = ((x10.util.GrowableRail)(x10.lang.FinishResilientPlace0.get$states()));
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final long idx$105714 = this.id;
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    x10.lang.FinishResilientPlace0.State ret$105716 =  null;
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.core.Rail t$106248 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$105715).data));
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.lang.FinishResilientPlace0.State t$106249 = ((x10.lang.FinishResilientPlace0.State[])t$106248.value)[(int)idx$105714];
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    ret$105716 = t$106249;
                    
                    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.lang.FinishResilientPlace0.State state = ret$105716;
                    
                    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$105941 = state.isAdopted$O();
                    
                    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$105947 = !(t$105941);
                    
                    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (t$105947) {
                        
                        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.core.Rail a$101703 = ((x10.core.Rail)(state.live));
                        
                        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long i0$101704 = this.dstId;
                        
                        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int t$105942 = ((int[])a$101703.value)[(int)i0$101704];
                        
                        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int r$101712 = ((t$105942) - (((int)(1))));
                        
                        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ((int[])a$101703.value)[(int)i0$101704] = r$101712;
                    } else {
                        
                        //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$105943 = this.id;
                        
                        //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long adopterId = x10.lang.FinishResilientPlace0.getCurrentAdopterId$O((long)(t$105943));
                        
                        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.util.GrowableRail this$105719 = ((x10.util.GrowableRail)(x10.lang.FinishResilientPlace0.get$states()));
                        
                        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final long idx$105718 = adopterId;
                        
                        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        x10.lang.FinishResilientPlace0.State ret$105720 =  null;
                        
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final x10.core.Rail t$106246 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$105719).data));
                        
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final x10.lang.FinishResilientPlace0.State t$106247 = ((x10.lang.FinishResilientPlace0.State[])t$106246.value)[(int)idx$105718];
                        
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        ret$105720 = t$106247;
                        
                        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.lang.FinishResilientPlace0.State adopterState = ret$105720;
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.core.Rail a$101715 = ((x10.core.Rail)(adopterState.liveAdopted));
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long i0$101716 = this.dstId;
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int t$105946 = ((int[])a$101715.value)[(int)i0$101716];
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final int r$101724 = ((t$105946) - (((int)(1))));
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        ((int[])a$101715.value)[(int)i0$101716] = r$101724;
                    }
                    
                    //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final long t$105948 = this.id;
                    
                    //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$105950 = x10.lang.FinishResilientPlace0.quiescent$O((long)(t$105948));
                    
                    //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (t$105950) {
                        
                        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final long t$105949 = this.id;
                        
                        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        x10.lang.FinishResilientPlace0.releaseLatch((long)(t$105949));
                    }
                }
            }}finally {{
                  
                  //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            }
        
        public x10.lang.FinishResilientPlace0 out$$;
        public long id;
        public long dstId;
        
        public $Closure$77(final x10.lang.FinishResilientPlace0 out$$, final long id, final long dstId) {
             {
                this.out$$ = out$$;
                this.id = id;
                this.dstId = dstId;
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$78 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$78> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$78> make($Closure$78.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilientPlace0.$Closure$78 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.id = $deserializer.readLong();
            $_obj.t = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilientPlace0.$Closure$78 $_obj = new x10.lang.FinishResilientPlace0.$Closure$78((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.id);
            $serializer.write(this.t);
            
        }
        
        // constructor just for allocation
        public $Closure$78(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            try {{
                
                //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.util.GrowableRail this$105723 = ((x10.util.GrowableRail)(x10.lang.FinishResilientPlace0.get$states()));
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final long idx$105722 = this.id;
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    x10.lang.FinishResilientPlace0.State ret$105724 =  null;
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.core.Rail t$106250 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$105723).data));
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.lang.FinishResilientPlace0.State t$106251 = ((x10.lang.FinishResilientPlace0.State[])t$106250.value)[(int)idx$105722];
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    ret$105724 = t$106251;
                    
                    //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.lang.FinishResilientPlace0.State state = ret$105724;
                    
                    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.util.GrowableRail t$105966 = ((x10.util.GrowableRail)(state.excs));
                    
                    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    ((x10.util.GrowableRail<java.lang.RuntimeException>)t$105966).add__0x10$util$GrowableRail$$T(((java.lang.RuntimeException)(this.t)));
                }
            }}finally {{
                  
                  //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            }
        
        public x10.lang.FinishResilientPlace0 out$$;
        public long id;
        public java.lang.RuntimeException t;
        
        public $Closure$78(final x10.lang.FinishResilientPlace0 out$$, final long id, final java.lang.RuntimeException t) {
             {
                this.out$$ = out$$;
                this.id = id;
                this.t = ((java.lang.RuntimeException)(t));
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$79 extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$79> $RTT = 
            x10.rtt.StaticFunType.<$Closure$79> make($Closure$79.class,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.util.concurrent.SimpleLatch.$RTT))
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilientPlace0.$Closure$79 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.id = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilientPlace0.$Closure$79 $_obj = new x10.lang.FinishResilientPlace0.$Closure$79((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.id);
            
        }
        
        // constructor just for allocation
        public $Closure$79(final java.lang.System[] $dummy) {
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.core.GlobalRef $apply$G() {
            return $apply();
        }
        
        
    
        
        public x10.core.GlobalRef $apply() {
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            try {{
                
                //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.util.GrowableRail this$105731 = ((x10.util.GrowableRail)(x10.lang.FinishResilientPlace0.get$states()));
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final long idx$105730 = this.id;
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    x10.lang.FinishResilientPlace0.State ret$105732 =  null;
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.core.Rail t$106252 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$105731).data));
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.lang.FinishResilientPlace0.State t$106253 = ((x10.lang.FinishResilientPlace0.State[])t$106252.value)[(int)idx$105730];
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    ret$105732 = t$106253;
                    
                    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.lang.FinishResilientPlace0.State state = ret$105732;
                    
                    //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.core.GlobalRef t$105982 = ((x10.core.GlobalRef)(state.gLatch));
                    
                    //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    return t$105982;
                }
            }}finally {{
                  
                  //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            }
        
        public x10.lang.FinishResilientPlace0 out$$;
        public long id;
        
        public $Closure$79(final x10.lang.FinishResilientPlace0 out$$, final long id) {
             {
                this.out$$ = out$$;
                this.id = id;
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$80 extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$80> $RTT = 
            x10.rtt.StaticFunType.<$Closure$80> make($Closure$80.class,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.lang.MultipleExceptions.$RTT)
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilientPlace0.$Closure$80 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.id = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilientPlace0.$Closure$80 $_obj = new x10.lang.FinishResilientPlace0.$Closure$80((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.id);
            
        }
        
        // constructor just for allocation
        public $Closure$80(final java.lang.System[] $dummy) {
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.lang.MultipleExceptions $apply$G() {
            return $apply();
        }
        
        
    
        
        public x10.lang.MultipleExceptions $apply() {
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            try {{
                
                //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.util.GrowableRail this$105739 = ((x10.util.GrowableRail)(x10.lang.FinishResilientPlace0.get$states()));
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final long idx$105738 = this.id;
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    x10.lang.FinishResilientPlace0.State ret$105740 =  null;
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.core.Rail t$106257 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$105739).data));
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.lang.FinishResilientPlace0.State t$106258 = ((x10.lang.FinishResilientPlace0.State[])t$106257.value)[(int)idx$105738];
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    ret$105740 = t$106258;
                    
                    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final x10.lang.FinishResilientPlace0.State state = ret$105740;
                    
                    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$105996 = state.isAdopted$O();
                    
                    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    final boolean t$106003 = !(t$105996);
                    
                    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                    if (t$106003) {
                        
                        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.util.GrowableRail this$105744 = ((x10.util.GrowableRail)(x10.lang.FinishResilientPlace0.get$states()));
                        
                        //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final long idx$105742 = this.id;
                        
                        //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final x10.lang.FinishResilientPlace0.State v$105743 = ((x10.lang.FinishResilientPlace0.State)(((x10.lang.FinishResilientPlace0.State)
                                                                                                                        (null))));
                        
                        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final long t$106254 = ((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$105744).size;
                        
                        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final boolean t$106255 = ((long) idx$105742) == ((long) t$106254);
                        
                        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        if (t$106255) {
                            
                            //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            ((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$105744).add__0x10$util$GrowableRail$$T(((x10.lang.FinishResilientPlace0.State)(null)));
                        } else {
                            
                            //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            final x10.core.Rail t$106256 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.FinishResilientPlace0.State>)this$105744).data));
                            
                            //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            ((x10.lang.FinishResilientPlace0.State[])t$106256.value)[(int)idx$105742] = null;
                        }
                        
                        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.util.GrowableRail t$106000 = ((x10.util.GrowableRail)(state.excs));
                        
                        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.lang.MultipleExceptions t$106001 = x10.lang.MultipleExceptions.make__0$1x10$lang$Exception$2(((x10.util.GrowableRail)(t$106000)));
                        
                        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        return t$106001;
                    } else {
                        
                        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        final x10.lang.MultipleExceptions t$106002 = ((x10.lang.MultipleExceptions)
                                                                       (null));
                        
                        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                        return null;
                    }
                }
            }}finally {{
                  
                  //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            }
        
        public x10.lang.FinishResilientPlace0 out$$;
        public long id;
        
        public $Closure$80(final x10.lang.FinishResilientPlace0 out$$, final long id) {
             {
                this.out$$ = out$$;
                this.id = id;
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$81 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$81> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$81> make($Closure$81.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilientPlace0.$Closure$81 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.id = $deserializer.readLong();
            $_obj.gLatch = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilientPlace0.$Closure$81 $_obj = new x10.lang.FinishResilientPlace0.$Closure$81((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.id);
            $serializer.write(this.gLatch);
            
        }
        
        // constructor just for allocation
        public $Closure$81(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$util$concurrent$SimpleLatch$2 {}
        
    
        
        public void $apply() {
            
            //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final long t$106025 = x10.lang.FinishResilientPlace0.get$verbose();
            
            //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final boolean t$106027 = ((t$106025) >= (((long)(2L))));
            
            //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            if (t$106027) {
                
                //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                final java.lang.String t$106026 = (("calling latch.release for id=") + ((x10.core.Long.$box(this.id))));
                
                //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)(t$106026)));
            }
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            final x10.util.concurrent.SimpleLatch t$106028 = x10.core.GlobalRef.LocalEval.<x10.util.concurrent.SimpleLatch>getLocalOrCopy(x10.util.concurrent.SimpleLatch.$RTT,((x10.core.GlobalRef<x10.util.concurrent.SimpleLatch>)(this.gLatch)));
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientPlace0.x10"
            t$106028.release();
        }
        
        public long id;
        public x10.core.GlobalRef<x10.util.concurrent.SimpleLatch> gLatch;
        
        public $Closure$81(final long id, final x10.core.GlobalRef<x10.util.concurrent.SimpleLatch> gLatch, __1$1x10$util$concurrent$SimpleLatch$2 $dummy) {
             {
                this.id = id;
                this.gLatch = ((x10.core.GlobalRef)(gLatch));
            }
        }
        
    }
    
    }
    
    