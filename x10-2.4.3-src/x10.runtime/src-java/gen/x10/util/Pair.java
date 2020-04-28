package x10.util;

@x10.runtime.impl.java.X10Generated
public class Pair<$T, $U> extends x10.core.Struct implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Pair> $RTT = 
        x10.rtt.NamedStructType.<Pair> make("x10.util.Pair",
                                            Pair.class,
                                            2,
                                            new x10.rtt.Type[] {
                                                x10.rtt.Types.STRUCT
                                            });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $U; return null; }
    
    public static <$T, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.Pair<$T, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
        $_obj.first = $deserializer.readObject();
        $_obj.second = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.Pair $_obj = new x10.util.Pair((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.$U);
        $serializer.write(this.first);
        $serializer.write(this.second);
        
    }
    
    // zero value constructor
    public Pair(final x10.rtt.Type $T, final x10.rtt.Type $U, final java.lang.System $dummy) { this.$T = $T; this.$U = $U; this.first = ($T) x10.rtt.Types.zeroValue($T); this.second = ($U) x10.rtt.Types.zeroValue($U); }
    
    // constructor just for allocation
    public Pair(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $U) {
        x10.util.Pair.$initParams(this, $T, $U);
        
    }
    
    private x10.rtt.Type $T;
    private x10.rtt.Type $U;
    
    // initializer of type parameters
    public static void $initParams(final Pair $this, final x10.rtt.Type $T, final x10.rtt.Type $U) {
        $this.$T = $T;
        $this.$U = $U;
        
    }
    // synthetic type for parameter mangling
    public static final class __0x10$util$Pair$$T__1x10$util$Pair$$U {}
    

    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    public $T first;
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    public $U second;
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    // creation method for java code (1-phase java constructor)
    public Pair(final x10.rtt.Type $T, final x10.rtt.Type $U, final $T first, final $U second, __0x10$util$Pair$$T__1x10$util$Pair$$U $dummy) {
        this((java.lang.System[]) null, $T, $U);
        x10$util$Pair$$init$S(first, second, (x10.util.Pair.__0x10$util$Pair$$T__1x10$util$Pair$$U) null);
    }
    
    // constructor for non-virtual call
    final public x10.util.Pair<$T, $U> x10$util$Pair$$init$S(final $T first, final $U second, __0x10$util$Pair$$T__1x10$util$Pair$$U $dummy) {
         {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final x10.util.Pair this$141714 = this;
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ((x10.util.Pair<$T, $U>)this).first = (($T)(first));
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ((x10.util.Pair<$T, $U>)this).second = (($U)(second));
        }
        return this;
    }
    
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    final public java.lang.String toString() {
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final $T t$141669 = (($T)(first));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final java.lang.String t$141670 = (("(") + (t$141669));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final java.lang.String t$141671 = ((t$141670) + (", "));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final $U t$141672 = (($U)(second));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final java.lang.String t$141673 = ((t$141671) + (t$141672));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final java.lang.String t$141674 = ((t$141673) + (")"));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        return t$141674;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    final public java.lang.String typeName() {
        try {
            return x10.rtt.Types.typeName(this);
        }
        catch (java.lang.Throwable exc$146448) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146448);
        }
        
    }
    
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    final public int hashCode() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        int result = 1;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final int t$141675 = result;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final int t$141677 = ((8191) * (((int)(t$141675))));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final $T t$141676 = (($T)(this.first));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final int t$141678 = x10.rtt.Types.hashCode(((java.lang.Object)(t$141676)));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final int t$141679 = ((t$141677) + (((int)(t$141678))));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        result = t$141679;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final int t$141680 = result;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final int t$141682 = ((8191) * (((int)(t$141680))));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final $U t$141681 = (($U)(this.second));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final int t$141683 = x10.rtt.Types.hashCode(((java.lang.Object)(t$141681)));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final int t$141684 = ((t$141682) + (((int)(t$141683))));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        result = t$141684;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final int t$141685 = result;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        return t$141685;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    final public boolean equals(java.lang.Object other) {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final java.lang.Object t$141686 = ((java.lang.Object)(other));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final boolean t$141687 = x10.util.Pair.$RTT.isInstance(t$141686, $T, $U);
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final boolean t$141688 = !(t$141687);
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        if (t$141688) {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            return false;
        }
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final java.lang.Object t$141689 = ((java.lang.Object)(other));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final x10.util.Pair t$141690 = ((x10.util.Pair)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.util.Pair.$RTT, $T, $U),t$141689));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final boolean t$141691 = this.equals__0$1x10$util$Pair$$T$3x10$util$Pair$$U$2$O(((x10.util.Pair)(t$141690)));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        return t$141691;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    final public boolean equals__0$1x10$util$Pair$$T$3x10$util$Pair$$U$2$O(x10.util.Pair other) {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final $T t$141693 = (($T)(this.first));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final x10.util.Pair t$141692 = ((x10.util.Pair)(other));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final $T t$141694 = (($T)(((x10.util.Pair<$T, $U>)t$141692).first));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        boolean t$141698 = x10.rtt.Equality.equalsequals((t$141693),(t$141694));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        if (t$141698) {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final $U t$141696 = (($U)(this.second));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final x10.util.Pair t$141695 = ((x10.util.Pair)(other));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final $U t$141697 = (($U)(((x10.util.Pair<$T, $U>)t$141695).second));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            t$141698 = x10.rtt.Equality.equalsequals((t$141696),(t$141697));
        }
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final boolean t$141699 = t$141698;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        return t$141699;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    final public boolean _struct_equals$O(java.lang.Object other) {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final java.lang.Object t$141700 = ((java.lang.Object)(other));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final boolean t$141701 = x10.util.Pair.$RTT.isInstance(t$141700, $T, $U);
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final boolean t$141702 = !(t$141701);
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        if (t$141702) {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            return false;
        }
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final java.lang.Object t$141703 = ((java.lang.Object)(other));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final x10.util.Pair t$141704 = ((x10.util.Pair)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.util.Pair.$RTT, $T, $U),t$141703));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final boolean t$141705 = this._struct_equals__0$1x10$util$Pair$$T$3x10$util$Pair$$U$2$O(((x10.util.Pair)(t$141704)));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        return t$141705;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    final public boolean _struct_equals__0$1x10$util$Pair$$T$3x10$util$Pair$$U$2$O(x10.util.Pair other) {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final $T t$141707 = (($T)(this.first));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final x10.util.Pair t$141706 = ((x10.util.Pair)(other));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final $T t$141708 = (($T)(((x10.util.Pair<$T, $U>)t$141706).first));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        boolean t$141712 = x10.rtt.Equality.equalsequals((t$141707),(t$141708));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        if (t$141712) {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final $U t$141710 = (($U)(this.second));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final x10.util.Pair t$141709 = ((x10.util.Pair)(other));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final $U t$141711 = (($U)(((x10.util.Pair<$T, $U>)t$141709).second));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            t$141712 = x10.rtt.Equality.equalsequals((t$141710),(t$141711));
        }
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final boolean t$141713 = t$141712;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        return t$141713;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    final public x10.util.Pair x10$util$Pair$$this$x10$util$Pair() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        return x10.util.Pair.this;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    final public void __fieldInitializers_x10_util_Pair() {
        
    }
}

