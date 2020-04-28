package x10.util;

@x10.runtime.impl.java.X10Generated
final public class Box<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Box> $RTT = 
        x10.rtt.NamedType.<Box> make("x10.util.Box",
                                     Box.class,
                                     1,
                                     new x10.rtt.Type[] {
                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                     });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.Box<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.value = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.Box $_obj = new x10.util.Box((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.value);
        
    }
    
    // constructor just for allocation
    public Box(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.util.Box.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final Box $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __0x10$util$Box$$T {}
    

    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
    public $T value;
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
    // creation method for java code (1-phase java constructor)
    public Box(final x10.rtt.Type $T, final $T x, __0x10$util$Box$$T $dummy) {
        this((java.lang.System[]) null, $T);
        x10$util$Box$$init$S(x, (x10.util.Box.__0x10$util$Box$$T) null);
    }
    
    // constructor for non-virtual call
    final public x10.util.Box<$T> x10$util$Box$$init$S(final $T x, __0x10$util$Box$$T $dummy) {
         {
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
            final x10.util.Box this$136123 = this;
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
            ((x10.util.Box<$T>)this).value = (($T)(x));
        }
        return this;
    }
    
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
    public $T $apply$G() {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        final $T t$136110 = (($T)(value));
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        return t$136110;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
    public int hashCode() {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        final $T t$136111 = (($T)(value));
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        final int t$136112 = x10.rtt.Types.hashCode(((java.lang.Object)(t$136111)));
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        return t$136112;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
    public java.lang.String toString() {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        final $T t$136113 = (($T)(value));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        final java.lang.String t$136114 = x10.rtt.Types.toString(((java.lang.Object)(t$136113)));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        return t$136114;
    }
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
    public boolean equals(final java.lang.Object x) {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        final boolean t$136115 = ((x) == (null));
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        if (t$136115) {
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
            return false;
        }
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        final boolean t$136118 = $T.isInstance(x);
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        if (t$136118) {
            
            //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
            final $T y = (($T)(x10.rtt.Types.<$T> cast(x,$T)));
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
            final $T t$136116 = (($T)(value));
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
            final boolean t$136117 = ((java.lang.Object)(((java.lang.Object)(t$136116)))).equals(y);
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
            return t$136117;
        }
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        final boolean t$136122 = x10.util.Box.$RTT.isInstance(x, $T);
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        if (t$136122) {
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
            final x10.util.Box t$136119 = ((x10.util.Box)(x10.rtt.Types.<x10.util.Box<$T>> cast(x,x10.rtt.ParameterizedType.make(x10.util.Box.$RTT, $T))));
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
            final $T y = (($T)(((x10.util.Box<$T>)t$136119).value));
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
            final $T t$136120 = (($T)(value));
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
            final boolean t$136121 = ((java.lang.Object)(((java.lang.Object)(t$136120)))).equals(y);
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
            return t$136121;
        }
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        return false;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
    final public x10.util.Box x10$util$Box$$this$x10$util$Box() {
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        return x10.util.Box.this;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
    final public void __fieldInitializers_x10_util_Box() {
        
    }
}

