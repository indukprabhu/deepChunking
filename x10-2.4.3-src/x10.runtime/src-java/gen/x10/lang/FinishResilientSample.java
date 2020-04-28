package x10.lang;


@x10.runtime.impl.java.X10Generated
public class FinishResilientSample extends x10.lang.FinishResilient implements x10.lang.Runtime.Mortal, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<FinishResilientSample> $RTT = 
        x10.rtt.NamedType.<FinishResilientSample> make("x10.lang.FinishResilientSample",
                                                       FinishResilientSample.class,
                                                       new x10.rtt.Type[] {
                                                           x10.lang.Runtime.Mortal.$RTT,
                                                           x10.lang.FinishResilient.$RTT
                                                       });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilientSample $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.FinishResilient.$_deserialize_body($_obj, $deserializer);
        $_obj.id = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.FinishResilientSample $_obj = new x10.lang.FinishResilientSample((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.id);
        
    }
    
    // constructor just for allocation
    public FinishResilientSample(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    private static long verbose = 0L;
    
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    private static x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State> RS;
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    @x10.runtime.impl.java.X10Generated
    public static class State extends x10.core.Ref implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<State> $RTT = 
            x10.rtt.NamedType.<State> make("x10.lang.FinishResilientSample.State",
                                           State.class);
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilientSample.State $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.transit = $deserializer.readObject();
            $_obj.transitAdopted = $deserializer.readObject();
            $_obj.live = $deserializer.readObject();
            $_obj.liveAdopted = $deserializer.readObject();
            $_obj.excs = $deserializer.readObject();
            $_obj.children = $deserializer.readObject();
            $_obj.adopterId = $deserializer.readObject();
            $_obj.numDead = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilientSample.State $_obj = new x10.lang.FinishResilientSample.State((java.lang.System[]) null);
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
            
        }
        
        // constructor just for allocation
        public State(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        public x10.core.Rail<x10.core.Int> transit;
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        public x10.core.Rail<x10.core.Int> transitAdopted;
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        public x10.core.Rail<x10.core.Int> live;
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        public x10.core.Rail<x10.core.Int> liveAdopted;
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        public x10.util.GrowableRail<java.lang.RuntimeException> excs;
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        public x10.util.GrowableRail<x10.core.GlobalRef<x10.lang.FinishResilientSample>> children;
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        public x10.core.GlobalRef<x10.lang.FinishResilientSample> adopterId;
        
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        public boolean isAdopted$O() {
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106501 = ((x10.core.GlobalRef)(adopterId));
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final boolean t$106502 = (((x10.core.GlobalRef<x10.lang.FinishResilientSample>)(t$106501))).isNull();
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final boolean t$106503 = !(t$106502);
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            return t$106503;
        }
        
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        public long numDead;
        
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        public void dump(final java.lang.Object msg) {
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.util.StringBuilder s = ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null)));
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            s.x10$util$StringBuilder$$init$S();
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            s.add(((java.lang.Object)(msg)));
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            s.add((char)('\n'));
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            s.add(((java.lang.String)("           live:")));
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.Rail rail$106950 = ((x10.core.Rail)(live));
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long size$106951 = ((x10.core.Rail<x10.core.Int>)rail$106950).size;
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            long idx$106923 = 0L;
            {
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final int[] rail$106950$value$107136 = ((int[])rail$106950.value);
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$106924 = idx$106923;
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final boolean t$106925 = ((t$106924) < (((long)(size$106951))));
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    if (!(t$106925)) {
                        
                        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        break;
                    }
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$106919 = idx$106923;
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final int v$106920 = ((int)rail$106950$value$107136[(int)t$106919]);
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final java.lang.String t$106918 = ((" ") + ((x10.core.Int.$box(v$106920))));
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    s.add(((java.lang.String)(t$106918)));
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$106921 = idx$106923;
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$106922 = ((t$106921) + (((long)(1L))));
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    idx$106923 = t$106922;
                }
            }
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            s.add((char)('\n'));
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            s.add(((java.lang.String)("    liveAdopted:")));
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.Rail rail$106952 = ((x10.core.Rail)(liveAdopted));
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long size$106953 = ((x10.core.Rail<x10.core.Int>)rail$106952).size;
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            long idx$106931 = 0L;
            {
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final int[] rail$106952$value$107137 = ((int[])rail$106952.value);
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$106932 = idx$106931;
                    
                    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final boolean t$106933 = ((t$106932) < (((long)(size$106953))));
                    
                    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    if (!(t$106933)) {
                        
                        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        break;
                    }
                    
                    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$106927 = idx$106931;
                    
                    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final int v$106928 = ((int)rail$106952$value$107137[(int)t$106927]);
                    
                    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final java.lang.String t$106926 = ((" ") + ((x10.core.Int.$box(v$106928))));
                    
                    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    s.add(((java.lang.String)(t$106926)));
                    
                    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$106929 = idx$106931;
                    
                    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$106930 = ((t$106929) + (((long)(1L))));
                    
                    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    idx$106931 = t$106930;
                }
            }
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            s.add((char)('\n'));
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            s.add(((java.lang.String)("        transit:")));
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.Rail rail$106954 = ((x10.core.Rail)(transit));
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long size$106955 = ((x10.core.Rail<x10.core.Int>)rail$106954).size;
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            long idx$106939 = 0L;
            {
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final int[] rail$106954$value$107138 = ((int[])rail$106954.value);
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$106940 = idx$106939;
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final boolean t$106941 = ((t$106940) < (((long)(size$106955))));
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    if (!(t$106941)) {
                        
                        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        break;
                    }
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$106935 = idx$106939;
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final int v$106936 = ((int)rail$106954$value$107138[(int)t$106935]);
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final java.lang.String t$106934 = ((" ") + ((x10.core.Int.$box(v$106936))));
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    s.add(((java.lang.String)(t$106934)));
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$106937 = idx$106939;
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$106938 = ((t$106937) + (((long)(1L))));
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    idx$106939 = t$106938;
                }
            }
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            s.add((char)('\n'));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            s.add(((java.lang.String)(" transitAdopted:")));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.Rail rail$106956 = ((x10.core.Rail)(transitAdopted));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long size$106957 = ((x10.core.Rail<x10.core.Int>)rail$106956).size;
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            long idx$106947 = 0L;
            {
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final int[] rail$106956$value$107139 = ((int[])rail$106956.value);
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$106948 = idx$106947;
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final boolean t$106949 = ((t$106948) < (((long)(size$106957))));
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    if (!(t$106949)) {
                        
                        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        break;
                    }
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$106943 = idx$106947;
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final int v$106944 = ((int)rail$106956$value$107139[(int)t$106943]);
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final java.lang.String t$106942 = ((" ") + ((x10.core.Int.$box(v$106944))));
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    s.add(((java.lang.String)(t$106942)));
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$106945 = idx$106947;
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$106946 = ((t$106945) + (((long)(1L))));
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    idx$106947 = t$106946;
                }
            }
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            s.add((char)('\n'));
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.util.GrowableRail this$106443 = ((x10.util.GrowableRail)(children));
            
            //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$106532 = ((x10.util.GrowableRail<x10.core.GlobalRef<x10.lang.FinishResilientSample>>)this$106443).size;
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106533 = (("  children.size: ") + ((x10.core.Long.$box(t$106532))));
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            s.add(((java.lang.String)(t$106533)));
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            s.add((char)('\n'));
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106534 = ((x10.core.GlobalRef)(adopterId));
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106535 = (("      adopterId: ") + (t$106534));
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            s.add(((java.lang.String)(t$106535)));
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106536 = s.toString();
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106536)));
        }
        
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final public x10.lang.FinishResilientSample.State x10$lang$FinishResilientSample$State$$this$x10$lang$FinishResilientSample$State() {
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            return x10.lang.FinishResilientSample.State.this;
        }
        
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        // creation method for java code (1-phase java constructor)
        public State() {
            this((java.lang.System[]) null);
            x10$lang$FinishResilientSample$State$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.lang.FinishResilientSample.State x10$lang$FinishResilientSample$State$$init$S() {
             {
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                this.__fieldInitializers_x10_lang_FinishResilientSample_State();
            }
            return this;
        }
        
        
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final public void __fieldInitializers_x10_lang_FinishResilientSample_State() {
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$106537 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$106538 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$106539 = ((t$106537) * (((long)(t$106538))));
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.Rail t$106540 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, t$106539, (x10.core.Int.$box(0)), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            this.transit = ((x10.core.Rail)(t$106540));
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$106541 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$106542 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$106543 = ((t$106541) * (((long)(t$106542))));
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.Rail t$106544 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, t$106543, (x10.core.Int.$box(0)), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            this.transitAdopted = ((x10.core.Rail)(t$106544));
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$106545 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.Rail t$106546 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, ((long)(t$106545)), (x10.core.Int.$box(0)), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            this.live = ((x10.core.Rail)(t$106546));
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$106547 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.Rail t$106548 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, ((long)(t$106547)), (x10.core.Int.$box(0)), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            this.liveAdopted = ((x10.core.Rail)(t$106548));
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.util.GrowableRail alloc$100680 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<java.lang.RuntimeException>((java.lang.System[]) null, x10.rtt.Types.EXCEPTION)));
            
            //#line 50 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            alloc$100680.x10$util$GrowableRail$$init$S(((long)(0L)));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            this.excs = ((x10.util.GrowableRail)(alloc$100680));
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.util.GrowableRail alloc$100681 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<x10.core.GlobalRef<x10.lang.FinishResilientSample>>((java.lang.System[]) null, x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.lang.FinishResilientSample.$RTT))));
            
            //#line 50 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            alloc$100681.x10$util$GrowableRail$$init$S(((long)(0L)));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            this.children = ((x10.util.GrowableRail)(alloc$100681));
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106549 = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.lang.FinishResilientSample>(x10.lang.FinishResilientSample.$RTT, ((x10.lang.FinishResilientSample)(null)), (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            this.adopterId = t$106549;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            this.numDead = 0L;
        }
    }
    
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    private static x10.util.HashSet<x10.lang.FinishResilientSample> ALL;
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    public x10.core.GlobalRef<x10.lang.FinishResilientSample> id;
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    public transient x10.util.concurrent.SimpleLatch latch;
    
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    public java.lang.String toString() {
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final java.lang.String t$106550 = x10.lang.System.identityToString(((java.lang.Object)(this)));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final java.lang.String t$106551 = ((t$106550) + ("(id="));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.core.GlobalRef t$106552 = ((x10.core.GlobalRef)(id));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final java.lang.String t$106553 = ((t$106551) + (t$106552));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final java.lang.String t$106554 = ((t$106553) + (")"));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        return t$106554;
    }
    
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    // creation method for java code (1-phase java constructor)
    public FinishResilientSample(final x10.lang.FinishState parent, final x10.util.concurrent.SimpleLatch latch) {
        this((java.lang.System[]) null);
        x10$lang$FinishResilientSample$$init$S(parent, latch);
    }
    
    // constructor for non-virtual call
    final public x10.lang.FinishResilientSample x10$lang$FinishResilientSample$$init$S(final x10.lang.FinishState parent, final x10.util.concurrent.SimpleLatch latch) {
         {
            
            //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            /*super.*/x10$lang$FinishResilient$$init$S();
            
            //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.FinishResilientSample this$106958 = this;
            
            //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            this.latch = ((x10.util.concurrent.SimpleLatch)(latch));
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106555 = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.lang.FinishResilientSample>(x10.lang.FinishResilientSample.$RTT, ((x10.lang.FinishResilientSample)(this)), (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            this.id = ((x10.core.GlobalRef)(t$106555));
        }
        return this;
    }
    
    
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    public static x10.lang.FinishResilientSample make(final x10.lang.FinishState parent, final x10.util.concurrent.SimpleLatch latch) {
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106556 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106560 = ((t$106556) >= (((long)(1L))));
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106560) {
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106557 = ((">>>> make called, parent=") + (parent));
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106558 = ((t$106557) + (" latch="));
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106559 = ((t$106558) + (latch));
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106559)));
        }
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.FinishResilientSample fs = ((x10.lang.FinishResilientSample)(new x10.lang.FinishResilientSample((java.lang.System[]) null)));
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        fs.x10$lang$FinishResilientSample$$init$S(((x10.lang.FinishState)(parent)), ((x10.util.concurrent.SimpleLatch)(latch)));
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.core.GlobalRef id = ((x10.core.GlobalRef)(fs.id));
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.FinishResilientSample.State state = ((x10.lang.FinishResilientSample.State)(new x10.lang.FinishResilientSample.State((java.lang.System[]) null)));
        
        //#line 54 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        state.__fieldInitializers_x10_lang_FinishResilientSample_State();
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.core.Rail t$106561 = ((x10.core.Rail)(state.live));
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106562 = x10.lang.Place.place(x10.x10rt.X10RT.here()).id;
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ((int[])t$106561.value)[(int)t$106562] = 1;
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106563 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106563).lock();
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106564 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106564).create__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V(((x10.core.GlobalRef)(id)), ((x10.lang.FinishResilientSample.State)(state)));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106569 = x10.lang.FinishResilientSample.$RTT.isInstance(parent);
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106569) {
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.FinishResilientSample t$106565 = ((x10.lang.FinishResilientSample)(x10.rtt.Types.<x10.lang.FinishResilientSample> cast(parent,x10.lang.FinishResilientSample.$RTT)));
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef parentId = ((x10.core.GlobalRef)(t$106565.id));
            
            //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.ResilientStore t$106566 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
            
            //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.FinishResilientSample.State parentState = ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106566).getOrElse__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V$G(((x10.core.GlobalRef)(parentId)), ((x10.lang.FinishResilientSample.State)(null)));
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.util.GrowableRail t$106567 = ((x10.util.GrowableRail)(parentState.children));
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((x10.util.GrowableRail<x10.core.GlobalRef<x10.lang.FinishResilientSample>>)t$106567).add__0x10$util$GrowableRail$$T(((x10.core.GlobalRef)(id)));
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.ResilientStore t$106568 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106568).put__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V(((x10.core.GlobalRef)(parentId)), ((x10.lang.FinishResilientSample.State)(parentState)));
        }
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        try {{
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.Runtime.enterAtomic();
            {
                
                //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final x10.util.HashSet t$106570 = ((x10.util.HashSet)(x10.lang.FinishResilientSample.get$ALL()));
                
                //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                ((x10.util.MapSet<x10.lang.FinishResilientSample>)t$106570).add__0x10$util$MapSet$$T$O(((x10.lang.FinishResilientSample)(fs)));
            }
        }}finally {{
              
              //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
              x10.lang.Runtime.exitAtomic();
          }}
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106571 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106571).unlock();
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106572 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106574 = ((t$106572) >= (((long)(1L))));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106574) {
            
            //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106573 = (("<<<< make returning fs=") + (fs));
            
            //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106573)));
        }
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        return fs;
        }
    
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    public static void notifyPlaceDeath() {
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106575 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106576 = ((t$106575) >= (((long)(1L))));
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106576) {
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(">>>> notifyPlaceDeath called")));
        }
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.util.HashSet t$106963 = ((x10.util.HashSet)(x10.lang.FinishResilientSample.get$ALL()));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.Iterator fs$106964 = ((x10.lang.Iterator<x10.lang.FinishResilientSample>)
                                              ((x10.util.MapSet<x10.lang.FinishResilientSample>)t$106963).iterator());
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        for (;
             true;
             ) {
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final boolean t$106965 = ((x10.lang.Iterator<x10.lang.FinishResilientSample>)fs$106964).hasNext$O();
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            if (!(t$106965)) {
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                break;
            }
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.FinishResilientSample fs$106959 = ((x10.lang.FinishResilientSample)(((x10.lang.Iterator<x10.lang.FinishResilientSample>)fs$106964).next$G()));
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.ResilientStore t$106960 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106960).lock();
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final boolean t$106961 = fs$106959.quiescent$O();
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            if (t$106961) {
                
                //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                fs$106959.releaseLatch();
            }
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.ResilientStore t$106962 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106962).unlock();
        }
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106583 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106584 = ((t$106583) >= (((long)(1L))));
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106584) {
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)("<<<< notifyPlaceDeath returning")));
        }
    }
    
    
    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    private void releaseLatch() {
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106585 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106589 = ((t$106585) >= (((long)(2L))));
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106589) {
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106586 = ((x10.core.GlobalRef)(id));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106587 = (("releaseLatch(id=") + (t$106586));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106588 = ((t$106587) + (") called"));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106588)));
        }
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.core.GlobalRef t$106590 = ((x10.core.GlobalRef)(id));
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.Place t$106597 = ((x10.lang.Place)((t$106590).home));
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.core.fun.VoidFun_0_0 t$106598 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.FinishResilientSample.$Closure$82(this, this.id, (x10.lang.FinishResilientSample.$Closure$82.__1$1x10$lang$FinishResilientSample$2) null)));
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        x10.lang.FinishResilient.lowLevelSend$O(((x10.lang.Place)(t$106597)), ((x10.core.fun.VoidFun_0_0)(t$106598)));
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106599 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106603 = ((t$106599) >= (((long)(2L))));
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106603) {
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106600 = ((x10.core.GlobalRef)(id));
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106601 = (("releaseLatch(id=") + (t$106600));
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106602 = ((t$106601) + (") returning"));
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106602)));
        }
    }
    
    public static void releaseLatch$P(final x10.lang.FinishResilientSample FinishResilientSample) {
        FinishResilientSample.releaseLatch();
    }
    
    
    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    private x10.core.GlobalRef getCurrentAdopterId() {
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        x10.core.GlobalRef currentId = id;
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        while (true) {
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.ResilientStore t$106604 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106605 = ((x10.core.GlobalRef)(currentId));
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.FinishResilientSample.State state = ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106604).getOrElse__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V$G(((x10.core.GlobalRef)(t$106605)), ((x10.lang.FinishResilientSample.State)(null)));
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final boolean t$106606 = state.isAdopted$O();
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final boolean t$106607 = !(t$106606);
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            if (t$106607) {
                
                //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                break;
            }
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106608 = ((x10.core.GlobalRef)(state.adopterId));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            currentId = ((x10.core.GlobalRef)(t$106608));
        }
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.core.GlobalRef t$106609 = ((x10.core.GlobalRef)(currentId));
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        return t$106609;
    }
    
    public static x10.core.GlobalRef getCurrentAdopterId$P(final x10.lang.FinishResilientSample FinishResilientSample) {
        return FinishResilientSample.getCurrentAdopterId();
    }
    
    
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    public void notifySubActivitySpawn(final x10.lang.Place place) {
        
        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long srcId = x10.lang.Place.place(x10.x10rt.X10RT.here()).id;
        
        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long dstId = place.id;
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106610 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106617 = ((t$106610) >= (((long)(1L))));
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106617) {
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106611 = ((x10.core.GlobalRef)(id));
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106612 = ((">>>> notifySubActivitySpawn(id=") + (t$106611));
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106613 = ((t$106612) + (") called, srcId="));
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106614 = ((t$106613) + ((x10.core.Long.$box(srcId))));
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106615 = ((t$106614) + (" dstId="));
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106616 = ((t$106615) + ((x10.core.Long.$box(dstId))));
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106616)));
        }
        
        //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106618 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106618).lock();
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106619 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.core.GlobalRef t$106620 = ((x10.core.GlobalRef)(id));
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.FinishResilientSample.State state = ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106619).getOrElse__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V$G(((x10.core.GlobalRef)(t$106620)), ((x10.lang.FinishResilientSample.State)(null)));
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106621 = state.isAdopted$O();
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106632 = !(t$106621);
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106632) {
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.Rail a$99409 = ((x10.core.Rail)(state.transit));
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$106622 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$106623 = ((srcId) * (((long)(t$106622))));
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long i0$99410 = ((t$106623) + (((long)(dstId))));
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final int t$106624 = ((int[])a$99409.value)[(int)i0$99410];
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final int r$99418 = ((t$106624) + (((int)(1))));
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((int[])a$99409.value)[(int)i0$99410] = r$99418;
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.ResilientStore t$106625 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106626 = ((x10.core.GlobalRef)(id));
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106625).put__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V(((x10.core.GlobalRef)(t$106626)), ((x10.lang.FinishResilientSample.State)(state)));
        } else {
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef adopterId = this.getCurrentAdopterId();
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.ResilientStore t$106627 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.FinishResilientSample.State adopterState = ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106627).getOrElse__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V$G(((x10.core.GlobalRef)(adopterId)), ((x10.lang.FinishResilientSample.State)(null)));
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.Rail a$99435 = ((x10.core.Rail)(adopterState.transitAdopted));
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$106628 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$106629 = ((srcId) * (((long)(t$106628))));
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long i0$99436 = ((t$106629) + (((long)(dstId))));
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final int t$106630 = ((int[])a$99435.value)[(int)i0$99436];
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final int r$99444 = ((t$106630) + (((int)(1))));
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((int[])a$99435.value)[(int)i0$99436] = r$99444;
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.ResilientStore t$106631 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106631).put__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V(((x10.core.GlobalRef)(adopterId)), ((x10.lang.FinishResilientSample.State)(adopterState)));
        }
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106633 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106636 = ((t$106633) >= (((long)(3L))));
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106636) {
            
            //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106634 = ((x10.core.GlobalRef)(id));
            
            //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106635 = (("DUMP id=") + (t$106634));
            
            //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            state.dump(((java.lang.Object)(t$106635)));
        }
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106637 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106637).unlock();
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106638 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106642 = ((t$106638) >= (((long)(1L))));
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106642) {
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106639 = ((x10.core.GlobalRef)(id));
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106640 = (("<<<< notifySubActivitySpawn(id=") + (t$106639));
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106641 = ((t$106640) + (") returning"));
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106641)));
        }
    }
    
    
    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    public boolean notifyActivityCreation$O(final x10.lang.Place srcPlace) {
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long srcId = srcPlace.id;
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long dstId = x10.lang.Place.place(x10.x10rt.X10RT.here()).id;
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106643 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106650 = ((t$106643) >= (((long)(1L))));
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106650) {
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106644 = ((x10.core.GlobalRef)(id));
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106645 = ((">>>> notifyActivityCreation(id=") + (t$106644));
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106646 = ((t$106645) + (") called, srcId="));
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106647 = ((t$106646) + ((x10.core.Long.$box(srcId))));
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106648 = ((t$106647) + (" dstId="));
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106649 = ((t$106648) + ((x10.core.Long.$box(dstId))));
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106649)));
        }
        
        //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$106651 = srcPlace.id;
        
        //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final boolean t$106657 = x10.x10rt.X10RT.isPlaceDead((int)((long)(t$106651)));
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106657) {
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$106652 = x10.lang.FinishResilientSample.get$verbose();
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final boolean t$106656 = ((t$106652) >= (((long)(1L))));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            if (t$106656) {
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final x10.core.GlobalRef t$106653 = ((x10.core.GlobalRef)(id));
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final java.lang.String t$106654 = (("<<<< notifyActivityCreation(id=") + (t$106653));
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final java.lang.String t$106655 = ((t$106654) + (") returning false"));
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)(t$106655)));
            }
            
            //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            return false;
        }
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106658 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106658).lock();
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106659 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.core.GlobalRef t$106660 = ((x10.core.GlobalRef)(id));
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.FinishResilientSample.State state = ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106659).getOrElse__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V$G(((x10.core.GlobalRef)(t$106660)), ((x10.lang.FinishResilientSample.State)(null)));
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106661 = state.isAdopted$O();
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106674 = !(t$106661);
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106674) {
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.Rail a$99669 = ((x10.core.Rail)(state.live));
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long i0$99670 = dstId;
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final int t$106662 = ((int[])a$99669.value)[(int)i0$99670];
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final int r$99678 = ((t$106662) + (((int)(1))));
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((int[])a$99669.value)[(int)i0$99670] = r$99678;
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.Rail a$99695 = ((x10.core.Rail)(state.transit));
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$106663 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$106664 = ((srcId) * (((long)(t$106663))));
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long i0$99696 = ((t$106664) + (((long)(dstId))));
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final int t$106665 = ((int[])a$99695.value)[(int)i0$99696];
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final int r$99704 = ((t$106665) - (((int)(1))));
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((int[])a$99695.value)[(int)i0$99696] = r$99704;
            
            //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.ResilientStore t$106666 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
            
            //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106667 = ((x10.core.GlobalRef)(id));
            
            //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106666).put__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V(((x10.core.GlobalRef)(t$106667)), ((x10.lang.FinishResilientSample.State)(state)));
        } else {
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef adopterId = this.getCurrentAdopterId();
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.ResilientStore t$106668 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.FinishResilientSample.State adopterState = ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106668).getOrElse__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V$G(((x10.core.GlobalRef)(adopterId)), ((x10.lang.FinishResilientSample.State)(null)));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.Rail a$99707 = ((x10.core.Rail)(adopterState.liveAdopted));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long i0$99708 = dstId;
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final int t$106669 = ((int[])a$99707.value)[(int)i0$99708];
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final int r$99716 = ((t$106669) + (((int)(1))));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((int[])a$99707.value)[(int)i0$99708] = r$99716;
            
            //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.Rail a$99733 = ((x10.core.Rail)(adopterState.transitAdopted));
            
            //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$106670 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$106671 = ((srcId) * (((long)(t$106670))));
            
            //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long i0$99734 = ((t$106671) + (((long)(dstId))));
            
            //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final int t$106672 = ((int[])a$99733.value)[(int)i0$99734];
            
            //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final int r$99742 = ((t$106672) - (((int)(1))));
            
            //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((int[])a$99733.value)[(int)i0$99734] = r$99742;
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.ResilientStore t$106673 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106673).put__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V(((x10.core.GlobalRef)(adopterId)), ((x10.lang.FinishResilientSample.State)(adopterState)));
        }
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106675 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106678 = ((t$106675) >= (((long)(3L))));
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106678) {
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106676 = ((x10.core.GlobalRef)(id));
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106677 = (("DUMP id=") + (t$106676));
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            state.dump(((java.lang.Object)(t$106677)));
        }
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106679 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106679).unlock();
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106680 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106684 = ((t$106680) >= (((long)(1L))));
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106684) {
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106681 = ((x10.core.GlobalRef)(id));
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106682 = (("<<<< notifyActivityCreation(id=") + (t$106681));
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106683 = ((t$106682) + (") returning true"));
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106683)));
        }
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        return true;
    }
    
    
    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    public void notifyActivityTermination() {
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long dstId = x10.lang.Place.place(x10.x10rt.X10RT.here()).id;
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106685 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106690 = ((t$106685) >= (((long)(1L))));
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106690) {
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106686 = ((x10.core.GlobalRef)(id));
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106687 = ((">>>> notifyActivityTermination(id=") + (t$106686));
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106688 = ((t$106687) + (") called, dstId="));
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106689 = ((t$106688) + ((x10.core.Long.$box(dstId))));
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106689)));
        }
        
        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106691 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106691).lock();
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106692 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.core.GlobalRef t$106693 = ((x10.core.GlobalRef)(id));
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.FinishResilientSample.State state = ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106692).getOrElse__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V$G(((x10.core.GlobalRef)(t$106693)), ((x10.lang.FinishResilientSample.State)(null)));
        
        //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106694 = state.isAdopted$O();
        
        //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106701 = !(t$106694);
        
        //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106701) {
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.Rail a$99868 = ((x10.core.Rail)(state.live));
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long i0$99869 = dstId;
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final int t$106695 = ((int[])a$99868.value)[(int)i0$99869];
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final int r$99877 = ((t$106695) - (((int)(1))));
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((int[])a$99868.value)[(int)i0$99869] = r$99877;
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.ResilientStore t$106696 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106697 = ((x10.core.GlobalRef)(id));
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106696).put__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V(((x10.core.GlobalRef)(t$106697)), ((x10.lang.FinishResilientSample.State)(state)));
        } else {
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef adopterId = this.getCurrentAdopterId();
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.ResilientStore t$106698 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.FinishResilientSample.State adopterState = ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106698).getOrElse__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V$G(((x10.core.GlobalRef)(adopterId)), ((x10.lang.FinishResilientSample.State)(null)));
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.Rail a$99880 = ((x10.core.Rail)(adopterState.liveAdopted));
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long i0$99881 = dstId;
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final int t$106699 = ((int[])a$99880.value)[(int)i0$99881];
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final int r$99889 = ((t$106699) - (((int)(1))));
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((int[])a$99880.value)[(int)i0$99881] = r$99889;
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.ResilientStore t$106700 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106700).put__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V(((x10.core.GlobalRef)(adopterId)), ((x10.lang.FinishResilientSample.State)(adopterState)));
        }
        
        //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106702 = this.quiescent$O();
        
        //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106702) {
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            this.releaseLatch();
        }
        
        //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106703 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106703).unlock();
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106704 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106708 = ((t$106704) >= (((long)(1L))));
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106708) {
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106705 = ((x10.core.GlobalRef)(id));
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106706 = (("<<<< notifyActivityTermination(id=") + (t$106705));
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106707 = ((t$106706) + (") returning"));
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106707)));
        }
    }
    
    
    //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    public void pushException(final java.lang.RuntimeException t) {
        
        //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106709 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106714 = ((t$106709) >= (((long)(1L))));
        
        //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106714) {
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106710 = ((x10.core.GlobalRef)(id));
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106711 = ((">>>> pushException(id=") + (t$106710));
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106712 = ((t$106711) + (") called, t="));
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106713 = ((t$106712) + (t));
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106713)));
        }
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106715 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106715).lock();
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106716 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.core.GlobalRef t$106717 = ((x10.core.GlobalRef)(id));
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.FinishResilientSample.State state = ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106716).getOrElse__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V$G(((x10.core.GlobalRef)(t$106717)), ((x10.lang.FinishResilientSample.State)(null)));
        
        //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.util.GrowableRail t$106718 = ((x10.util.GrowableRail)(state.excs));
        
        //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ((x10.util.GrowableRail<java.lang.RuntimeException>)t$106718).add__0x10$util$GrowableRail$$T(((java.lang.RuntimeException)(t)));
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106719 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.core.GlobalRef t$106720 = ((x10.core.GlobalRef)(id));
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106719).put__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V(((x10.core.GlobalRef)(t$106720)), ((x10.lang.FinishResilientSample.State)(state)));
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106721 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106721).unlock();
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106722 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106726 = ((t$106722) >= (((long)(1L))));
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106726) {
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106723 = ((x10.core.GlobalRef)(id));
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106724 = (("<<<< pushException(id=") + (t$106723));
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106725 = ((t$106724) + (") returning"));
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106725)));
        }
    }
    
    
    //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    public void waitForFinish() {
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        assert x10.rtt.Equality.equalsequals(((id).home),(x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106727 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106731 = ((t$106727) >= (((long)(1L))));
        
        //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106731) {
            
            //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106728 = ((x10.core.GlobalRef)(id));
            
            //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106729 = ((">>>> waitForFinish(id=") + (t$106728));
            
            //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106730 = ((t$106729) + (") called"));
            
            //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106730)));
        }
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        this.notifyActivityTermination();
        
        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106732 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106735 = ((t$106732) >= (((long)(2L))));
        
        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106735) {
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106733 = ((x10.core.GlobalRef)(id));
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106734 = (("calling latch.await for id=") + (t$106733));
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106734)));
        }
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.util.concurrent.SimpleLatch t$106736 = ((x10.util.concurrent.SimpleLatch)(latch));
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        t$106736.await();
        
        //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106737 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106740 = ((t$106737) >= (((long)(2L))));
        
        //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106740) {
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106738 = ((x10.core.GlobalRef)(id));
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106739 = (("returned from latch.await for id=") + (t$106738));
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106739)));
        }
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        x10.lang.MultipleExceptions e = null;
        
        //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106741 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106741).lock();
        
        //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106742 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.core.GlobalRef t$106743 = ((x10.core.GlobalRef)(id));
        
        //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.FinishResilientSample.State state = ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106742).getOrElse__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V$G(((x10.core.GlobalRef)(t$106743)), ((x10.lang.FinishResilientSample.State)(null)));
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106744 = state.isAdopted$O();
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106749 = !(t$106744);
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106749) {
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.util.GrowableRail t$106745 = ((x10.util.GrowableRail)(state.excs));
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.MultipleExceptions t$106746 = x10.lang.MultipleExceptions.make__0$1x10$lang$Exception$2(((x10.util.GrowableRail)(t$106745)));
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            e = ((x10.lang.MultipleExceptions)(t$106746));
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.ResilientStore t$106747 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106748 = ((x10.core.GlobalRef)(id));
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106747).remove__0x10$lang$ResilientStore$$K(((x10.core.GlobalRef)(t$106748)));
        } else {
            
        }
        
        //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        try {{
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.Runtime.enterAtomic();
            {
                
                //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final x10.util.HashSet t$106750 = ((x10.util.HashSet)(x10.lang.FinishResilientSample.get$ALL()));
                
                //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                ((x10.util.MapSet<x10.lang.FinishResilientSample>)t$106750).remove__0x10$util$MapSet$$T$O(((x10.lang.FinishResilientSample)(this)));
            }
        }}finally {{
              
              //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
              x10.lang.Runtime.exitAtomic();
          }}
        
        //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106751 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106751).unlock();
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106752 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106758 = ((t$106752) >= (((long)(1L))));
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106758) {
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106753 = ((x10.core.GlobalRef)(id));
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106754 = (("<<<< waitForFinish(id=") + (t$106753));
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106755 = ((t$106754) + (") returning, exc="));
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.MultipleExceptions t$106756 = ((x10.lang.MultipleExceptions)(e));
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106757 = ((t$106755) + (t$106756));
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106757)));
        }
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.MultipleExceptions t$106759 = ((x10.lang.MultipleExceptions)(e));
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106761 = ((t$106759) != (null));
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106761) {
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.MultipleExceptions t$106760 = ((x10.lang.MultipleExceptions)(e));
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            throw t$106760;
        }
        }
    
    
    //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    private boolean quiescent$O() {
        
        //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106762 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106766 = ((t$106762) >= (((long)(2L))));
        
        //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106766) {
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106763 = ((x10.core.GlobalRef)(id));
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106764 = (("quiescent(id=") + (t$106763));
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106765 = ((t$106764) + (") called"));
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106765)));
        }
        
        //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106767 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.core.GlobalRef t$106768 = ((x10.core.GlobalRef)(id));
        
        //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.FinishResilientSample.State state = ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106767).getOrElse__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V$G(((x10.core.GlobalRef)(t$106768)), ((x10.lang.FinishResilientSample.State)(null)));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long nd = ((long)x10.x10rt.X10RT.numDead());
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106769 = state.numDead;
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106823 = ((long) nd) != ((long) t$106769);
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106823) {
            
            //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            state.numDead = nd;
            
            //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.util.GrowableRail children = ((x10.util.GrowableRail)(state.children));
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            long chIndex$107010 = 0L;
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            for (;
                 true;
                 ) {
                
                //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final long t$107011 = chIndex$107010;
                
                //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long t$107012 = ((x10.util.GrowableRail<x10.core.GlobalRef<x10.lang.FinishResilientSample>>)children).size;
                
                //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final boolean t$107013 = ((t$107011) < (((long)(t$107012))));
                
                //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                if (!(t$107013)) {
                    
                    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    break;
                }
                
                //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                L$107014: {
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final long idx$107015 = chIndex$107010;
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    x10.core.GlobalRef ret$107016 =  null;
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.core.Rail t$107004 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.core.GlobalRef<x10.lang.FinishResilientSample>>)children).data));
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.core.GlobalRef t$107005 = ((x10.core.GlobalRef[])t$107004.value)[(int)idx$107015];
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    ret$107016 = t$107005;
                    //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final x10.core.GlobalRef childId$107017 = ret$107016;
                    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final x10.lang.Place this$107018 = ((x10.lang.Place)((childId$107017).home));
                    //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
                    final long t$107019 = this$107018.id;
                    //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
                    final boolean t$107020 = x10.x10rt.X10RT.isPlaceDead((int)((long)(t$107019)));
                    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final boolean t$107021 = !(t$107020);
                    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    if (t$107021) {
                        
                        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        break L$107014;
                    }
                    //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final x10.core.GlobalRef lastChildId$107022 = ((x10.util.GrowableRail<x10.core.GlobalRef<x10.lang.FinishResilientSample>>)children).removeLast$G();
                    //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$107023 = chIndex$107010;
                    //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final long t$107024 = ((x10.util.GrowableRail<x10.core.GlobalRef<x10.lang.FinishResilientSample>>)children).size;
                    //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final boolean t$107025 = ((t$107023) < (((long)(t$107024))));
                    //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    if (t$107025) {
                        
                        //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final long idx$107026 = chIndex$107010;
                        
                        //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final x10.core.GlobalRef v$107027 = ((x10.core.GlobalRef)(lastChildId$107022));
                        
                        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final long t$106966 = ((x10.util.GrowableRail<x10.core.GlobalRef<x10.lang.FinishResilientSample>>)children).size;
                        
                        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final boolean t$106967 = ((long) idx$107026) == ((long) t$106966);
                        
                        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        if (t$106967) {
                            
                            //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            ((x10.util.GrowableRail<x10.core.GlobalRef<x10.lang.FinishResilientSample>>)children).add__0x10$util$GrowableRail$$T(((x10.core.GlobalRef)(v$107027)));
                        } else {
                            
                            //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            final x10.core.Rail t$106968 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.core.GlobalRef<x10.lang.FinishResilientSample>>)children).data));
                            
                            //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            ((x10.core.GlobalRef[])t$106968.value)[(int)idx$107026] = v$107027;
                        }
                    }
                    //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$107028 = chIndex$107010;
                    //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$107029 = ((t$107028) - (((long)(1L))));
                    //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    chIndex$107010 = t$107029;
                    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$107030 = x10.lang.FinishResilientSample.get$verbose();
                    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final boolean t$107031 = ((t$107030) >= (((long)(3L))));
                    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    if (t$107031) {
                        
                        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final java.lang.String t$107032 = (("adopting childId=") + (childId$107017));
                        
                        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        x10.lang.FinishResilient.debug(((java.lang.String)(t$107032)));
                    }
                    //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final x10.lang.ResilientStore t$107033 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
                    //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final x10.lang.FinishResilientSample.State childState$107034 = ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$107033).getOrElse__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V$G(((x10.core.GlobalRef)(childId$107017)), ((x10.lang.FinishResilientSample.State)(null)));
                    //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    assert !(childState$107034.isAdopted$O());
                    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final x10.core.GlobalRef t$107035 = ((x10.core.GlobalRef)(id));
                    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    childState$107034.adopterId = ((x10.core.GlobalRef)(t$107035));
                    //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final x10.lang.ResilientStore t$107036 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
                    //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$107036).put__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V(((x10.core.GlobalRef)(childId$107017)), ((x10.lang.FinishResilientSample.State)(childState$107034)));
                    //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final x10.util.GrowableRail t$107037 = ((x10.util.GrowableRail)(state.children));
                    //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final x10.util.GrowableRail t$107038 = ((x10.util.GrowableRail)(childState$107034.children));
                    //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    ((x10.util.GrowableRail<x10.core.GlobalRef<x10.lang.FinishResilientSample>>)t$107037).addAll__0$1x10$util$GrowableRail$$T$2(((x10.util.GrowableRail)(t$107038)));
                    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$107006 = x10.lang.Place.get$MAX_PLACES();
                    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long i$100804max$107007 = ((t$107006) - (((long)(1L))));
                    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    long i$107001 = 0L;
                    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final long t$107002 = i$107001;
                        
                        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final boolean t$107003 = ((t$107002) <= (((long)(i$100804max$107007))));
                        
                        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        if (!(t$107003)) {
                            
                            //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            break;
                        }
                        
                        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final long i$106998 = i$107001;
                        
                        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final x10.core.Rail a$106989 = ((x10.core.Rail)(state.liveAdopted));
                        
                        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final long i$106990 = i$106998;
                        
                        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final int t$106991 = ((int[])a$106989.value)[(int)i$106990];
                        
                        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final x10.core.Rail t$106992 = ((x10.core.Rail)(childState$107034.live));
                        
                        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final int t$106993 = ((int[])t$106992.value)[(int)i$106998];
                        
                        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final x10.core.Rail t$106994 = ((x10.core.Rail)(childState$107034.liveAdopted));
                        
                        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final int t$106995 = ((int[])t$106994.value)[(int)i$106998];
                        
                        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final int t$106996 = ((t$106993) + (((int)(t$106995))));
                        
                        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final int r$106997 = ((t$106991) + (((int)(t$106996))));
                        
                        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        ((int[])a$106989.value)[(int)i$106990] = r$106997;
                        
                        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final long t$106987 = x10.lang.Place.get$MAX_PLACES();
                        
                        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final long i$100786max$106988 = ((t$106987) - (((long)(1L))));
                        
                        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        long i$106984 = 0L;
                        
                        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final long t$106985 = i$106984;
                            
                            //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final boolean t$106986 = ((t$106985) <= (((long)(i$100786max$106988))));
                            
                            //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            if (!(t$106986)) {
                                
                                //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                                break;
                            }
                            
                            //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final long j$106981 = i$106984;
                            
                            //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final long t$106969 = x10.lang.Place.get$MAX_PLACES();
                            
                            //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final long t$106970 = ((i$106998) * (((long)(t$106969))));
                            
                            //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final long idx$106971 = ((t$106970) + (((long)(j$106981))));
                            
                            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final x10.core.Rail a$106972 = ((x10.core.Rail)(state.transitAdopted));
                            
                            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final long i$106973 = idx$106971;
                            
                            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final int t$106974 = ((int[])a$106972.value)[(int)i$106973];
                            
                            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final x10.core.Rail t$106975 = ((x10.core.Rail)(childState$107034.transit));
                            
                            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final int t$106976 = ((int[])t$106975.value)[(int)idx$106971];
                            
                            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final x10.core.Rail t$106977 = ((x10.core.Rail)(childState$107034.transitAdopted));
                            
                            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final int t$106978 = ((int[])t$106977.value)[(int)idx$106971];
                            
                            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final int t$106979 = ((t$106976) + (((int)(t$106978))));
                            
                            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final int r$106980 = ((t$106974) + (((int)(t$106979))));
                            
                            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            ((int[])a$106972.value)[(int)i$106973] = r$106980;
                            
                            //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final long t$106982 = i$106984;
                            
                            //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final long t$106983 = ((t$106982) + (((long)(1L))));
                            
                            //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            i$106984 = t$106983;
                        }
                        
                        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final long t$106999 = i$107001;
                        
                        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final long t$107000 = ((t$106999) + (((long)(1L))));
                        
                        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        i$107001 = t$107000;
                    }
                }
                
                //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final long t$107008 = chIndex$107010;
                
                //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final long t$107009 = ((t$107008) + (((long)(1L))));
                
                //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                chIndex$107010 = t$107009;
            }
        }
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$107129 = x10.lang.Place.get$MAX_PLACES();
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long i$100876max$107130 = ((t$107129) - (((long)(1L))));
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        long i$107091 = 0L;
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        for (;
             true;
             ) {
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$107092 = i$107091;
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final boolean t$107093 = ((t$107092) <= (((long)(i$100876max$107130))));
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            if (!(t$107093)) {
                
                //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                break;
            }
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long i$107088 = i$107091;
            
            //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final boolean t$107085 = x10.x10rt.X10RT.isPlaceDead((int)((long)(i$107088)));
            
            //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            if (t$107085) {
                
                //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final x10.core.Rail t$107080 = ((x10.core.Rail)(state.live));
                
                //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final int t$107081 = ((int[])t$107080.value)[(int)i$107088];
                
                //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final long i$100822max$107082 = ((long)(((int)(t$107081))));
                
                //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                long i$107046 = 1L;
                
                //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$107047 = i$107046;
                    
                    //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final boolean t$107048 = ((t$107047) <= (((long)(i$100822max$107082))));
                    
                    //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    if (!(t$107048)) {
                        
                        //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        break;
                    }
                    
                    //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long unused$107043 = i$107046;
                    
                    //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$107039 = x10.lang.FinishResilientSample.get$verbose();
                    
                    //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final boolean t$107040 = ((t$107039) >= (((long)(3L))));
                    
                    //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    if (t$107040) {
                        
                        //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final java.lang.String t$107041 = (("adding DPE for live(") + ((x10.core.Long.$box(i$107088))));
                        
                        //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final java.lang.String t$107042 = ((t$107041) + (")"));
                        
                        //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        x10.lang.FinishResilient.debug(((java.lang.String)(t$107042)));
                    }
                    
                    //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    this.addDeadPlaceException(((x10.lang.FinishResilientSample.State)(state)), (long)(i$107088));
                    
                    //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$107044 = i$107046;
                    
                    //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$107045 = ((t$107044) + (((long)(1L))));
                    
                    //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    i$107046 = t$107045;
                }
                
                //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final x10.core.Rail t$107086 = ((x10.core.Rail)(state.live));
                
                //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                ((int[])t$107086.value)[(int)i$107088] = 0;
                
                //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final x10.core.Rail t$107087 = ((x10.core.Rail)(state.liveAdopted));
                
                //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                ((int[])t$107087.value)[(int)i$107088] = 0;
                
                //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final long t$107083 = x10.lang.Place.get$MAX_PLACES();
                
                //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final long i$100858max$107084 = ((t$107083) - (((long)(1L))));
                
                //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                long i$107077 = 0L;
                
                //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$107078 = i$107077;
                    
                    //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final boolean t$107079 = ((t$107078) <= (((long)(i$100858max$107084))));
                    
                    //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    if (!(t$107079)) {
                        
                        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        break;
                    }
                    
                    //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long j$107074 = i$107077;
                    
                    //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$107064 = x10.lang.Place.get$MAX_PLACES();
                    
                    //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$107065 = ((i$107088) * (((long)(t$107064))));
                    
                    //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long idx$107066 = ((t$107065) + (((long)(j$107074))));
                    
                    //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final x10.core.Rail t$107067 = ((x10.core.Rail)(state.transit));
                    
                    //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    ((int[])t$107067.value)[(int)idx$107066] = 0;
                    
                    //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final x10.core.Rail t$107068 = ((x10.core.Rail)(state.transitAdopted));
                    
                    //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    ((int[])t$107068.value)[(int)idx$107066] = 0;
                    
                    //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$107069 = x10.lang.Place.get$MAX_PLACES();
                    
                    //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$107070 = ((j$107074) * (((long)(t$107069))));
                    
                    //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long idx$107071 = ((t$107070) + (((long)(i$107088))));
                    
                    //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final x10.core.Rail t$107061 = ((x10.core.Rail)(state.transit));
                    
                    //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final int t$107062 = ((int[])t$107061.value)[(int)idx$107071];
                    
                    //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long i$100840max$107063 = ((long)(((int)(t$107062))));
                    
                    //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    long i$107058 = 1L;
                    
                    //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final long t$107059 = i$107058;
                        
                        //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final boolean t$107060 = ((t$107059) <= (((long)(i$100840max$107063))));
                        
                        //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        if (!(t$107060)) {
                            
                            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            break;
                        }
                        
                        //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final long unused$107055 = i$107058;
                        
                        //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final long t$107049 = x10.lang.FinishResilientSample.get$verbose();
                        
                        //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final boolean t$107050 = ((t$107049) >= (((long)(3L))));
                        
                        //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        if (t$107050) {
                            
                            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final java.lang.String t$107051 = (("adding DPE for transit(") + ((x10.core.Long.$box(j$107074))));
                            
                            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final java.lang.String t$107052 = ((t$107051) + (","));
                            
                            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final java.lang.String t$107053 = ((t$107052) + ((x10.core.Long.$box(i$107088))));
                            
                            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            final java.lang.String t$107054 = ((t$107053) + (")"));
                            
                            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                            x10.lang.FinishResilient.debug(((java.lang.String)(t$107054)));
                        }
                        
                        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        this.addDeadPlaceException(((x10.lang.FinishResilientSample.State)(state)), (long)(i$107088));
                        
                        //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final long t$107056 = i$107058;
                        
                        //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        final long t$107057 = ((t$107056) + (((long)(1L))));
                        
                        //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                        i$107058 = t$107057;
                    }
                    
                    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final x10.core.Rail t$107072 = ((x10.core.Rail)(state.transit));
                    
                    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    ((int[])t$107072.value)[(int)idx$107071] = 0;
                    
                    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final x10.core.Rail t$107073 = ((x10.core.Rail)(state.transitAdopted));
                    
                    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    ((int[])t$107073.value)[(int)idx$107071] = 0;
                    
                    //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$107075 = i$107077;
                    
                    //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    final long t$107076 = ((t$107075) + (((long)(1L))));
                    
                    //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    i$107077 = t$107076;
                }
            }
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$107089 = i$107091;
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$107090 = ((t$107089) + (((long)(1L))));
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            i$107091 = t$107090;
        }
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.ResilientStore t$106871 = ((x10.lang.ResilientStore)(x10.lang.FinishResilientSample.get$RS()));
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.core.GlobalRef t$106872 = ((x10.core.GlobalRef)(id));
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ((x10.lang.ResilientStore<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State>)t$106871).put__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V(((x10.core.GlobalRef)(t$106872)), ((x10.lang.FinishResilientSample.State)(state)));
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106873 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106876 = ((t$106873) >= (((long)(3L))));
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106876) {
            
            //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106874 = ((x10.core.GlobalRef)(id));
            
            //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106875 = (("DUMP id=") + (t$106874));
            
            //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            state.dump(((java.lang.Object)(t$106875)));
        }
        
        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        boolean quiet = true;
        
        //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$107131 = x10.lang.Place.get$MAX_PLACES();
        
        //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long i$100912max$107132 = ((t$107131) - (((long)(1L))));
        
        //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        long i$107126 = 0L;
        
        //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        for (;
             true;
             ) {
            
            //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$107127 = i$107126;
            
            //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final boolean t$107128 = ((t$107127) <= (((long)(i$100912max$107132))));
            
            //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            if (!(t$107128)) {
                
                //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                break;
            }
            
            //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long i$107123 = i$107126;
            
            //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.Rail t$107113 = ((x10.core.Rail)(state.live));
            
            //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final int t$107114 = ((int[])t$107113.value)[(int)i$107123];
            
            //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$107115 = ((long)(((int)(t$107114))));
            
            //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final boolean t$107116 = ((t$107115) > (((long)(0L))));
            
            //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            if (t$107116) {
                
                //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                quiet = false;
                
                //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                break;
            }
            
            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.Rail t$107117 = ((x10.core.Rail)(state.liveAdopted));
            
            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final int t$107118 = ((int[])t$107117.value)[(int)i$107123];
            
            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$107119 = ((long)(((int)(t$107118))));
            
            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final boolean t$107120 = ((t$107119) > (((long)(0L))));
            
            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            if (t$107120) {
                
                //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                quiet = false;
                
                //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                break;
            }
            
            //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$107111 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long i$100894max$107112 = ((t$107111) - (((long)(1L))));
            
            //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            long i$107108 = 0L;
            
            //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            for (;
                 true;
                 ) {
                
                //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final long t$107109 = i$107108;
                
                //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final boolean t$107110 = ((t$107109) <= (((long)(i$100894max$107112))));
                
                //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                if (!(t$107110)) {
                    
                    //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    break;
                }
                
                //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final long j$107105 = i$107108;
                
                //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final long t$107094 = x10.lang.Place.get$MAX_PLACES();
                
                //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final long t$107095 = ((i$107123) * (((long)(t$107094))));
                
                //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final long idx$107096 = ((t$107095) + (((long)(j$107105))));
                
                //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final x10.core.Rail t$107097 = ((x10.core.Rail)(state.transit));
                
                //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final int t$107098 = ((int[])t$107097.value)[(int)idx$107096];
                
                //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final long t$107099 = ((long)(((int)(t$107098))));
                
                //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final boolean t$107100 = ((t$107099) > (((long)(0L))));
                
                //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                if (t$107100) {
                    
                    //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    quiet = false;
                    
                    //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    break;
                }
                
                //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final x10.core.Rail t$107101 = ((x10.core.Rail)(state.transitAdopted));
                
                //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final int t$107102 = ((int[])t$107101.value)[(int)idx$107096];
                
                //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final long t$107103 = ((long)(((int)(t$107102))));
                
                //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final boolean t$107104 = ((t$107103) > (((long)(0L))));
                
                //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                if (t$107104) {
                    
                    //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    quiet = false;
                    
                    //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                    break;
                }
                
                //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final long t$107106 = i$107108;
                
                //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final long t$107107 = ((t$107106) + (((long)(1L))));
                
                //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                i$107108 = t$107107;
            }
            
            //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final boolean t$107121 = quiet;
            
            //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final boolean t$107122 = !(t$107121);
            
            //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            if (t$107122) {
                
                //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                break;
            }
            
            //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$107124 = i$107126;
            
            //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$107125 = ((t$107124) + (((long)(1L))));
            
            //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            i$107126 = t$107125;
        }
        
        //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final long t$106909 = x10.lang.FinishResilientSample.get$verbose();
        
        //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106915 = ((t$106909) >= (((long)(2L))));
        
        //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        if (t$106915) {
            
            //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106910 = ((x10.core.GlobalRef)(id));
            
            //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106911 = (("quiescent(id=") + (t$106910));
            
            //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106912 = ((t$106911) + (") returning "));
            
            //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final boolean t$106913 = quiet;
            
            //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final java.lang.String t$106914 = ((t$106912) + ((x10.core.Boolean.$box(t$106913))));
            
            //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(t$106914)));
        }
        
        //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final boolean t$106916 = quiet;
        
        //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        return t$106916;
    }
    
    public static boolean quiescent$P$O(final x10.lang.FinishResilientSample FinishResilientSample) {
        return FinishResilientSample.quiescent$O();
    }
    
    
    //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    private void addDeadPlaceException(final x10.lang.FinishResilientSample.State state, final long placeId) {
        
        //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.Place alloc$100682 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
        
        //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        alloc$100682.x10$lang$Place$$init$S(((long)(placeId)));
        
        //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.lang.DeadPlaceException e = ((x10.lang.DeadPlaceException)(new x10.lang.DeadPlaceException(((x10.lang.Place)(alloc$100682)))));
        
        //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        x10.runtime.impl.java.EvalUtils.eval(e.fillInStackTrace());
        
        //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        final x10.util.GrowableRail t$106917 = ((x10.util.GrowableRail)(state.excs));
        
        //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        ((x10.util.GrowableRail<java.lang.RuntimeException>)t$106917).add__0x10$util$GrowableRail$$T(((java.lang.RuntimeException)(e)));
    }
    
    public static void addDeadPlaceException$P(final x10.lang.FinishResilientSample.State state, final long placeId, final x10.lang.FinishResilientSample FinishResilientSample) {
        FinishResilientSample.addDeadPlaceException(((x10.lang.FinishResilientSample.State)(state)), (long)(placeId));
    }
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    final public x10.lang.FinishResilientSample x10$lang$FinishResilientSample$$this$x10$lang$FinishResilientSample() {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
        return x10.lang.FinishResilientSample.this;
    }
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
    final public void __fieldInitializers_x10_lang_FinishResilientSample() {
        
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$ALL = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$ALL;
    final private static x10.core.concurrent.AtomicInteger initStatus$RS = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$RS;
    final private static x10.core.concurrent.AtomicInteger initStatus$verbose = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$verbose;
    
    public static long get$verbose() {
        if (((int) x10.lang.FinishResilientSample.initStatus$verbose.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.FinishResilientSample.verbose;
        }
        if (((int) x10.lang.FinishResilientSample.initStatus$verbose.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.FinishResilientSample.exception$verbose;
        }
        if (x10.lang.FinishResilientSample.initStatus$verbose.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.FinishResilientSample.verbose = x10.lang.FinishResilient.get$verbose();
            }}catch (java.lang.Throwable exc$107133) {
                x10.lang.FinishResilientSample.exception$verbose = new x10.lang.ExceptionInInitializer(exc$107133);
                x10.lang.FinishResilientSample.initStatus$verbose.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.FinishResilientSample.exception$verbose;
            }
            x10.lang.FinishResilientSample.initStatus$verbose.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.FinishResilientSample.initStatus$verbose.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.FinishResilientSample.initStatus$verbose.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.FinishResilientSample.initStatus$verbose.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.FinishResilientSample.exception$verbose;
                }
            }
        }
        return x10.lang.FinishResilientSample.verbose;
    }
    
    public static x10.lang.ResilientStore get$RS() {
        if (((int) x10.lang.FinishResilientSample.initStatus$RS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.FinishResilientSample.RS;
        }
        if (((int) x10.lang.FinishResilientSample.initStatus$RS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.FinishResilientSample.exception$RS;
        }
        if (x10.lang.FinishResilientSample.initStatus$RS.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.FinishResilientSample.RS = x10.lang.ResilientStore.<x10.core.GlobalRef<x10.lang.FinishResilientSample>, x10.lang.FinishResilientSample.State> make(x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.lang.FinishResilientSample.$RTT), x10.lang.FinishResilientSample.State.$RTT, ((java.lang.Object)("FinishResilientSample")));
            }}catch (java.lang.Throwable exc$107134) {
                x10.lang.FinishResilientSample.exception$RS = new x10.lang.ExceptionInInitializer(exc$107134);
                x10.lang.FinishResilientSample.initStatus$RS.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.FinishResilientSample.exception$RS;
            }
            x10.lang.FinishResilientSample.initStatus$RS.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.FinishResilientSample.initStatus$RS.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.FinishResilientSample.initStatus$RS.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.FinishResilientSample.initStatus$RS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.FinishResilientSample.exception$RS;
                }
            }
        }
        return x10.lang.FinishResilientSample.RS;
    }
    
    public static x10.util.HashSet get$ALL() {
        if (((int) x10.lang.FinishResilientSample.initStatus$ALL.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.FinishResilientSample.ALL;
        }
        if (((int) x10.lang.FinishResilientSample.initStatus$ALL.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.FinishResilientSample.exception$ALL;
        }
        if (x10.lang.FinishResilientSample.initStatus$ALL.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.FinishResilientSample.ALL = ((x10.util.HashSet)(new x10.util.HashSet<x10.lang.FinishResilientSample>((java.lang.System[]) null, x10.lang.FinishResilientSample.$RTT).x10$util$HashSet$$init$S()));
            }}catch (java.lang.Throwable exc$107135) {
                x10.lang.FinishResilientSample.exception$ALL = new x10.lang.ExceptionInInitializer(exc$107135);
                x10.lang.FinishResilientSample.initStatus$ALL.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.FinishResilientSample.exception$ALL;
            }
            x10.lang.FinishResilientSample.initStatus$ALL.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.FinishResilientSample.initStatus$ALL.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.FinishResilientSample.initStatus$ALL.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.FinishResilientSample.initStatus$ALL.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.FinishResilientSample.exception$ALL;
                }
            }
        }
        return x10.lang.FinishResilientSample.ALL;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$82 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$82> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$82> make($Closure$82.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishResilientSample.$Closure$82 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.id = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.FinishResilientSample.$Closure$82 $_obj = new x10.lang.FinishResilientSample.$Closure$82((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.id);
            
        }
        
        // constructor just for allocation
        public $Closure$82(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$lang$FinishResilientSample$2 {}
        
    
        
        public void $apply() {
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.core.GlobalRef t$106591 = ((x10.core.GlobalRef)(this.id));
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.lang.FinishResilientSample fs = x10.core.GlobalRef.LocalEval.<x10.lang.FinishResilientSample>getLocalOrCopy(x10.lang.FinishResilientSample.$RTT,((x10.core.GlobalRef<x10.lang.FinishResilientSample>)(t$106591)));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final long t$106592 = x10.lang.FinishResilientSample.get$verbose();
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final boolean t$106595 = ((t$106592) >= (((long)(2L))));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            if (t$106595) {
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final x10.core.GlobalRef t$106593 = ((x10.core.GlobalRef)(this.id));
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                final java.lang.String t$106594 = (("calling latch.release for id=") + (t$106593));
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)(t$106594)));
            }
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            final x10.util.concurrent.SimpleLatch t$106596 = ((x10.util.concurrent.SimpleLatch)(fs.latch));
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilientSample.x10"
            t$106596.release();
        }
        
        public x10.lang.FinishResilientSample out$$;
        public x10.core.GlobalRef<x10.lang.FinishResilientSample> id;
        
        public $Closure$82(final x10.lang.FinishResilientSample out$$, final x10.core.GlobalRef<x10.lang.FinishResilientSample> id, __1$1x10$lang$FinishResilientSample$2 $dummy) {
             {
                this.out$$ = out$$;
                this.id = ((x10.core.GlobalRef)(id));
            }
        }
        
    }
    
    }
    
    