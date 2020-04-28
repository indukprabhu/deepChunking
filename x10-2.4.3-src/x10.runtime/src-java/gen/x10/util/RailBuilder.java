package x10.util;

@x10.runtime.impl.java.X10Generated
public class RailBuilder<$T> extends x10.core.Ref implements x10.util.Builder, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<RailBuilder> $RTT = 
        x10.rtt.NamedType.<RailBuilder> make("x10.util.RailBuilder",
                                             RailBuilder.class,
                                             1,
                                             new x10.rtt.Type[] {
                                                 x10.rtt.ParameterizedType.make(x10.util.Builder.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                             });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.RailBuilder<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.buf = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.RailBuilder $_obj = new x10.util.RailBuilder((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.buf);
        
    }
    
    // constructor just for allocation
    public RailBuilder(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.util.RailBuilder.$initParams(this, $T);
        
    }
    
    // dispatcher for method abstract public x10.util.Builder[T, U].add(e:T){}:x10.util.Builder[T, U]
    public java.lang.Object add(final java.lang.Object a1, final x10.rtt.Type t1) {
        return add__0x10$util$RailBuilder$$T(($T)a1);
        
    }
    
    // bridge for method abstract public x10.util.Builder[T, U].result(){}:U
    public x10.core.Rail result$G() {
        return result();
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final RailBuilder $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    

    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
    public x10.util.GrowableRail<$T> buf;
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
    // creation method for java code (1-phase java constructor)
    public RailBuilder(final x10.rtt.Type $T) {
        this((java.lang.System[]) null, $T);
        x10$util$RailBuilder$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.util.RailBuilder<$T> x10$util$RailBuilder$$init$S() {
         {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
            final x10.util.RailBuilder this$141728 = this;
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
            final x10.util.GrowableRail alloc$140399 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<$T>((java.lang.System[]) null, $T)));
            
            //#line 50 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            alloc$140399.x10$util$GrowableRail$$init$S(((long)(0L)));
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
            ((x10.util.RailBuilder<$T>)this).buf = ((x10.util.GrowableRail)(alloc$140399));
        }
        return this;
    }
    
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
    // creation method for java code (1-phase java constructor)
    public RailBuilder(final x10.rtt.Type $T, final long size) {
        this((java.lang.System[]) null, $T);
        x10$util$RailBuilder$$init$S(size);
    }
    
    // constructor for non-virtual call
    final public x10.util.RailBuilder<$T> x10$util$RailBuilder$$init$S(final long size) {
         {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
            final x10.util.RailBuilder this$141729 = this;
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
            final x10.util.GrowableRail alloc$140400 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<$T>((java.lang.System[]) null, $T)));
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
            alloc$140400.x10$util$GrowableRail$$init$S(((long)(size)));
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
            ((x10.util.RailBuilder<$T>)this).buf = ((x10.util.GrowableRail)(alloc$140400));
        }
        return this;
    }
    
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
    public x10.util.RailBuilder add__0x10$util$RailBuilder$$T(final $T x) {
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
        final x10.util.GrowableRail t$141723 = ((x10.util.GrowableRail)(buf));
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
        ((x10.util.GrowableRail<$T>)t$141723).add__0x10$util$GrowableRail$$T((($T)(x)));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
        return this;
    }
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
    public x10.util.RailBuilder insert__1$1x10$util$RailBuilder$$T$2(final long loc, final x10.core.Rail items) {
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
        final x10.util.GrowableRail t$141724 = ((x10.util.GrowableRail)(buf));
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
        ((x10.util.GrowableRail<$T>)t$141724).insert__1$1x10$util$GrowableRail$$T$2((long)(loc), ((x10.core.Rail)(items)));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
        return this;
    }
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
    public long length() {
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
        final x10.util.GrowableRail this$141722 = ((x10.util.GrowableRail)(buf));
        
        //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$141725 = ((x10.util.GrowableRail<$T>)this$141722).size;
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
        return t$141725;
    }
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
    public x10.core.Rail result() {
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
        final x10.util.GrowableRail t$141726 = ((x10.util.GrowableRail)(buf));
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
        final x10.core.Rail t$141727 = ((x10.core.Rail<$T>)
                                         ((x10.util.GrowableRail<$T>)t$141726).toRail());
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
        return t$141727;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
    final public x10.util.RailBuilder x10$util$RailBuilder$$this$x10$util$RailBuilder() {
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
        return x10.util.RailBuilder.this;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailBuilder.x10"
    final public void __fieldInitializers_x10_util_RailBuilder() {
        
    }
}

