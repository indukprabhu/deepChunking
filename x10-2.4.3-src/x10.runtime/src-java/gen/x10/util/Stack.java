package x10.util;

@x10.runtime.impl.java.X10Generated
public class Stack<$T> extends x10.util.ArrayList<$T> implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Stack> $RTT = 
        x10.rtt.NamedType.<Stack> make("x10.util.Stack",
                                       Stack.class,
                                       1,
                                       new x10.rtt.Type[] {
                                           x10.rtt.ParameterizedType.make(x10.util.ArrayList.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                       });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.Stack<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.ArrayList.$_deserialize_body($_obj, $deserializer);
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.Stack $_obj = new x10.util.Stack((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.$T);
        
    }
    
    // constructor just for allocation
    public Stack(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        super($dummy, $T);
        x10.util.Stack.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final Stack $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    

    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
    // creation method for java code (1-phase java constructor)
    public Stack(final x10.rtt.Type $T) {
        this((java.lang.System[]) null, $T);
        x10$util$Stack$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.util.Stack<$T> x10$util$Stack$$init$S() {
         {
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
            /*super.*/x10$util$ArrayList$$init$S();
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
            final x10.util.Stack this$142554 = this;
        }
        return this;
    }
    
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
    public boolean push__0x10$util$Stack$$T$O(final $T v) {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
        final boolean t$142544 = this.add__0x10$util$ArrayList$$T$O((($T)(v)));
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
        return t$142544;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
    public $T pop$G() {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
        final $T t$142545 = (($T)(this.removeLast$G()));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
        return t$142545;
    }
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
    public x10.core.Rail pop(final long k) {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
        final long n = this.size$O();
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
        final boolean t$142546 = ((n) < (((long)(k))));
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
        if (t$142546) {
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
            return null;
        }
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
        final long t$142547 = ((n) - (((long)(k))));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
        final long t$142548 = ((n) - (((long)(1L))));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
        final x10.core.Rail t$142549 = ((x10.core.Rail<$T>)
                                         this.moveSectionToRail((long)(t$142547), (long)(t$142548)));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
        return t$142549;
    }
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
    public $T peek$G() {
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
        final $T t$142550 = (($T)(this.getLast$G()));
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
        return t$142550;
    }
    
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
    public long search__0x10$util$Stack$$T$O(final $T v) {
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
        final long i = this.lastIndexOf__0x10$util$ArrayList$$T$O((($T)(v)));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
        final boolean t$142553 = ((i) >= (((long)(0L))));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
        if (t$142553) {
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
            final long t$142551 = this.size$O();
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
            final long t$142552 = ((t$142551) - (((long)(i))));
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
            return t$142552;
        } else {
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
            return -1L;
        }
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
    final public x10.util.Stack x10$util$Stack$$this$x10$util$Stack() {
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
        return x10.util.Stack.this;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Stack.x10"
    final public void __fieldInitializers_x10_util_Stack() {
        
    }
}

