package x10.lang;


@x10.runtime.impl.java.X10Generated
public class CUDAConstantRail<$T> extends x10.core.Struct implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<CUDAConstantRail> $RTT = 
        x10.rtt.NamedStructType.<CUDAConstantRail> make("x10.lang.CUDAConstantRail",
                                                        CUDAConstantRail.class,
                                                        1,
                                                        new x10.rtt.Type[] {
                                                            x10.rtt.Types.STRUCT
                                                        });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.CUDAConstantRail<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.backing = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.CUDAConstantRail $_obj = new x10.lang.CUDAConstantRail((java.lang.System[]) null, (x10.rtt.Type) null);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.backing);
        
    }
    
    // zero value constructor
    public CUDAConstantRail(final x10.rtt.Type $T, final java.lang.System $dummy) { this.$T = $T; this.backing = null; }
    
    // constructor just for allocation
    public CUDAConstantRail(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.lang.CUDAConstantRail.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final CUDAConstantRail $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __0$1x10$lang$CUDAConstantRail$$T$2 {}
    

    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
    /** Backing rail. */
    public x10.core.Rail<$T> backing;
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
    // creation method for java code (1-phase java constructor)
    public CUDAConstantRail(final x10.rtt.Type $T, final x10.core.Rail<$T> backing, __0$1x10$lang$CUDAConstantRail$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$lang$CUDAConstantRail$$init$S(backing, (x10.lang.CUDAConstantRail.__0$1x10$lang$CUDAConstantRail$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.lang.CUDAConstantRail<$T> x10$lang$CUDAConstantRail$$init$S(final x10.core.Rail<$T> backing, __0$1x10$lang$CUDAConstantRail$$T$2 $dummy) {
         {
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
            final x10.lang.CUDAConstantRail this$96731 = this;
            
            //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
            ((x10.lang.CUDAConstantRail<$T>)this).backing = ((x10.core.Rail)(backing));
        }
        return this;
    }
    
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
    final public $T $apply$G(final long i) {
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final x10.core.Rail t$96696 = ((x10.core.Rail)(backing));
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final $T t$96697 = (($T)(((x10.core.Rail<$T>)t$96696).$apply$G((long)(i))));
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        return t$96697;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
    final public java.lang.String typeName() {
        try {
            return x10.rtt.Types.typeName(this);
        }
        catch (java.lang.Throwable exc$146349) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146349);
        }
        
    }
    
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
    final public java.lang.String toString() {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final java.lang.String t$96698 = "struct x10.lang.CUDAConstantRail: backing=";
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final x10.core.Rail t$96699 = ((x10.core.Rail)(this.backing));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final java.lang.String t$96700 = ((t$96698) + (t$96699));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        return t$96700;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
    final public int hashCode() {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        int result = 1;
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final int t$96701 = result;
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final int t$96703 = ((8191) * (((int)(t$96701))));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final x10.core.Rail t$96702 = ((x10.core.Rail)(this.backing));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final int t$96704 = x10.rtt.Types.hashCode(((java.lang.Object)(t$96702)));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final int t$96705 = ((t$96703) + (((int)(t$96704))));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        result = t$96705;
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final int t$96706 = result;
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        return t$96706;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
    final public boolean equals(java.lang.Object other) {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final java.lang.Object t$96707 = ((java.lang.Object)(other));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final boolean t$96708 = x10.lang.CUDAConstantRail.$RTT.isInstance(t$96707, $T);
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final boolean t$96709 = !(t$96708);
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        if (t$96709) {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
            return false;
        }
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final x10.lang.CUDAConstantRail this$96693 = ((x10.lang.CUDAConstantRail)(this));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final java.lang.Object t$96710 = ((java.lang.Object)(other));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        x10.lang.CUDAConstantRail other$96692 = ((x10.lang.CUDAConstantRail)(((x10.lang.CUDAConstantRail)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.lang.CUDAConstantRail.$RTT, $T),t$96710))));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final x10.core.Rail t$96712 = ((x10.core.Rail)(((x10.lang.CUDAConstantRail<$T>)this$96693).backing));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final x10.lang.CUDAConstantRail t$96711 = ((x10.lang.CUDAConstantRail)(other$96692));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final x10.core.Rail t$96713 = ((x10.core.Rail)(((x10.lang.CUDAConstantRail<$T>)t$96711).backing));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final boolean t$96714 = x10.rtt.Equality.equalsequals((t$96712),(t$96713));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        return t$96714;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
    final public boolean equals__0$1x10$lang$CUDAConstantRail$$T$2$O(x10.lang.CUDAConstantRail other) {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final x10.core.Rail t$96716 = ((x10.core.Rail)(this.backing));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final x10.lang.CUDAConstantRail t$96715 = ((x10.lang.CUDAConstantRail)(other));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final x10.core.Rail t$96717 = ((x10.core.Rail)(((x10.lang.CUDAConstantRail<$T>)t$96715).backing));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final boolean t$96718 = x10.rtt.Equality.equalsequals((t$96716),(t$96717));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        return t$96718;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
    final public boolean _struct_equals$O(java.lang.Object other) {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final java.lang.Object t$96719 = ((java.lang.Object)(other));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final boolean t$96720 = x10.lang.CUDAConstantRail.$RTT.isInstance(t$96719, $T);
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final boolean t$96721 = !(t$96720);
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        if (t$96721) {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
            return false;
        }
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final x10.lang.CUDAConstantRail this$96695 = ((x10.lang.CUDAConstantRail)(this));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final java.lang.Object t$96722 = ((java.lang.Object)(other));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        x10.lang.CUDAConstantRail other$96694 = ((x10.lang.CUDAConstantRail)(((x10.lang.CUDAConstantRail)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.lang.CUDAConstantRail.$RTT, $T),t$96722))));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final x10.core.Rail t$96724 = ((x10.core.Rail)(((x10.lang.CUDAConstantRail<$T>)this$96695).backing));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final x10.lang.CUDAConstantRail t$96723 = ((x10.lang.CUDAConstantRail)(other$96694));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final x10.core.Rail t$96725 = ((x10.core.Rail)(((x10.lang.CUDAConstantRail<$T>)t$96723).backing));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final boolean t$96726 = x10.rtt.Equality.equalsequals((t$96724),(t$96725));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        return t$96726;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
    final public boolean _struct_equals__0$1x10$lang$CUDAConstantRail$$T$2$O(x10.lang.CUDAConstantRail other) {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final x10.core.Rail t$96728 = ((x10.core.Rail)(this.backing));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final x10.lang.CUDAConstantRail t$96727 = ((x10.lang.CUDAConstantRail)(other));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final x10.core.Rail t$96729 = ((x10.core.Rail)(((x10.lang.CUDAConstantRail<$T>)t$96727).backing));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        final boolean t$96730 = x10.rtt.Equality.equalsequals((t$96728),(t$96729));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        return t$96730;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
    final public x10.lang.CUDAConstantRail x10$lang$CUDAConstantRail$$this$x10$lang$CUDAConstantRail() {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
        return x10.lang.CUDAConstantRail.this;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CUDAConstantRail.x10"
    final public void __fieldInitializers_x10_lang_CUDAConstantRail() {
        
    }
}

