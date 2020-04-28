package x10.array;

@x10.runtime.impl.java.X10Generated
abstract public class IterationSpace extends x10.core.Ref implements x10.lang.Iterable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<IterationSpace> $RTT = 
        x10.rtt.NamedType.<IterationSpace> make("x10.array.IterationSpace",
                                                IterationSpace.class,
                                                new x10.rtt.Type[] {
                                                    x10.rtt.ParameterizedType.make(x10.lang.Iterable.$RTT, x10.lang.Point.$RTT)
                                                });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.IterationSpace $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.rank = $deserializer.readLong();
        $_obj.rect = $deserializer.readBoolean();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.rank);
        $serializer.write(this.rect);
        
    }
    
    // constructor just for allocation
    public IterationSpace(final java.lang.System[] $dummy) {
        
    }
    
    
    // properties
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    public long rank;
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    public boolean rect;
    

    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    
    // constructor for non-virtual call
    final public x10.array.IterationSpace x10$array$IterationSpace$$init$S(final long rank, final boolean rect) {
         {
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            this.rank = rank;
            this.rect = rect;
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            final x10.array.IterationSpace this$77337 = this;
        }
        return this;
    }
    
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    abstract public x10.lang.Iterator iterator();
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    abstract public long min$O(final long i);
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    abstract public long max$O(final long i);
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    abstract public boolean isEmpty$O();
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    public java.lang.String toString() {
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
        final x10.util.StringBuilder sb = ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null)));
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
        sb.x10$util$StringBuilder$$init$S();
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
        final x10.lang.Iterator it = this.iterator();
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
        sb.add(((java.lang.String)("{")));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
        int c$77354 = 0;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
        for (;
             true;
             ) {
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            final int t$77355 = c$77354;
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            boolean t$77356 = ((t$77355) < (((int)(10))));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            if (t$77356) {
                
                //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
                t$77356 = ((x10.lang.Iterator<x10.lang.Point>)it).hasNext$O();
            }
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            final boolean t$77357 = t$77356;
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            if (!(t$77357)) {
                
                //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
                break;
            }
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            final x10.lang.Point t$77350 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)it).next$G()));
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            sb.add(((java.lang.Object)(t$77350)));
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            final boolean t$77351 = ((x10.lang.Iterator<x10.lang.Point>)it).hasNext$O();
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            if (t$77351) {
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
                sb.add(((java.lang.String)(", ")));
            }
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            final int t$77352 = c$77354;
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            final int t$77353 = ((t$77352) + (((int)(1))));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            c$77354 = t$77353;
        }
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
        final boolean t$77348 = ((x10.lang.Iterator<x10.lang.Point>)it).hasNext$O();
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
        if (t$77348) {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            sb.add(((java.lang.String)("...")));
        }
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
        sb.add(((java.lang.String)("}")));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
        final java.lang.String t$77349 = sb.toString();
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
        return t$77349;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    final public x10.array.IterationSpace x10$array$IterationSpace$$this$x10$array$IterationSpace() {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
        return x10.array.IterationSpace.this;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    final public void __fieldInitializers_x10_array_IterationSpace() {
        
    }
}


