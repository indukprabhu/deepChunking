package x10.util;

@x10.runtime.impl.java.X10Generated
public class Triple<$T, $U, $V> extends x10.core.Struct implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Triple> $RTT = 
        x10.rtt.NamedStructType.<Triple> make("x10.util.Triple",
                                              Triple.class,
                                              3,
                                              new x10.rtt.Type[] {
                                                  x10.rtt.Types.STRUCT
                                              });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $U; if (i == 2) return $V; return null; }
    
    public static <$T, $U, $V> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.Triple<$T, $U, $V> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
        $_obj.$V = (x10.rtt.Type) $deserializer.readObject();
        $_obj.first = $deserializer.readObject();
        $_obj.second = $deserializer.readObject();
        $_obj.third = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.Triple $_obj = new x10.util.Triple((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.$U);
        $serializer.write(this.$V);
        $serializer.write(this.first);
        $serializer.write(this.second);
        $serializer.write(this.third);
        
    }
    
    // zero value constructor
    public Triple(final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.rtt.Type $V, final java.lang.System $dummy) { this.$T = $T; this.$U = $U; this.$V = $V; this.first = ($T) x10.rtt.Types.zeroValue($T); this.second = ($U) x10.rtt.Types.zeroValue($U); this.third = ($V) x10.rtt.Types.zeroValue($V); }
    
    // constructor just for allocation
    public Triple(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.rtt.Type $V) {
        x10.util.Triple.$initParams(this, $T, $U, $V);
        
    }
    
    private x10.rtt.Type $T;
    private x10.rtt.Type $U;
    private x10.rtt.Type $V;
    
    // initializer of type parameters
    public static void $initParams(final Triple $this, final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.rtt.Type $V) {
        $this.$T = $T;
        $this.$U = $U;
        $this.$V = $V;
        
    }
    // synthetic type for parameter mangling
    public static final class __0x10$util$Triple$$T__1x10$util$Triple$$U__2x10$util$Triple$$V {}
    

    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
    public $T first;
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
    public $U second;
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
    public $V third;
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
    // creation method for java code (1-phase java constructor)
    public Triple(final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.rtt.Type $V, final $T first, final $U second, final $V third, __0x10$util$Triple$$T__1x10$util$Triple$$U__2x10$util$Triple$$V $dummy) {
        this((java.lang.System[]) null, $T, $U, $V);
        x10$util$Triple$$init$S(first, second, third, (x10.util.Triple.__0x10$util$Triple$$T__1x10$util$Triple$$U__2x10$util$Triple$$V) null);
    }
    
    // constructor for non-virtual call
    final public x10.util.Triple<$T, $U, $V> x10$util$Triple$$init$S(final $T first, final $U second, final $V third, __0x10$util$Triple$$T__1x10$util$Triple$$U__2x10$util$Triple$$V $dummy) {
         {
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            final x10.util.Triple this$145053 = this;
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            ((x10.util.Triple<$T, $U, $V>)this).first = (($T)(first));
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            ((x10.util.Triple<$T, $U, $V>)this).second = (($U)(second));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            ((x10.util.Triple<$T, $U, $V>)this).third = (($V)(third));
        }
        return this;
    }
    
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
    final public java.lang.String toString() {
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final $T t$144992 = (($T)(first));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final java.lang.String t$144993 = (("(") + (t$144992));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final java.lang.String t$144994 = ((t$144993) + (", "));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final $U t$144995 = (($U)(second));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final java.lang.String t$144996 = ((t$144994) + (t$144995));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final java.lang.String t$144997 = ((t$144996) + (", "));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final $V t$144998 = (($V)(third));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final java.lang.String t$144999 = ((t$144997) + (t$144998));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final java.lang.String t$145000 = ((t$144999) + (")"));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        return t$145000;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
    final public java.lang.String typeName() {
        try {
            return x10.rtt.Types.typeName(this);
        }
        catch (java.lang.Throwable exc$146470) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146470);
        }
        
    }
    
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
    final public int hashCode() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        int result = 1;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final int t$145001 = result;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final int t$145003 = ((8191) * (((int)(t$145001))));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final $T t$145002 = (($T)(this.first));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final int t$145004 = x10.rtt.Types.hashCode(((java.lang.Object)(t$145002)));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final int t$145005 = ((t$145003) + (((int)(t$145004))));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        result = t$145005;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final int t$145006 = result;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final int t$145008 = ((8191) * (((int)(t$145006))));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final $U t$145007 = (($U)(this.second));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final int t$145009 = x10.rtt.Types.hashCode(((java.lang.Object)(t$145007)));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final int t$145010 = ((t$145008) + (((int)(t$145009))));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        result = t$145010;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final int t$145011 = result;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final int t$145013 = ((8191) * (((int)(t$145011))));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final $V t$145012 = (($V)(this.third));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final int t$145014 = x10.rtt.Types.hashCode(((java.lang.Object)(t$145012)));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final int t$145015 = ((t$145013) + (((int)(t$145014))));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        result = t$145015;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final int t$145016 = result;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        return t$145016;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
    final public boolean equals(java.lang.Object other) {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final java.lang.Object t$145017 = ((java.lang.Object)(other));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final boolean t$145018 = x10.util.Triple.$RTT.isInstance(t$145017, $T, $U, $V);
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final boolean t$145019 = !(t$145018);
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        if (t$145019) {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            return false;
        }
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final java.lang.Object t$145020 = ((java.lang.Object)(other));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final x10.util.Triple t$145021 = ((x10.util.Triple)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.util.Triple.$RTT, $T, $U, $V),t$145020));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final boolean t$145022 = this.equals__0$1x10$util$Triple$$T$3x10$util$Triple$$U$3x10$util$Triple$$V$2$O(((x10.util.Triple)(t$145021)));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        return t$145022;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
    final public boolean equals__0$1x10$util$Triple$$T$3x10$util$Triple$$U$3x10$util$Triple$$V$2$O(x10.util.Triple other) {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final $T t$145024 = (($T)(this.first));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final x10.util.Triple t$145023 = ((x10.util.Triple)(other));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final $T t$145025 = (($T)(((x10.util.Triple<$T, $U, $V>)t$145023).first));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        boolean t$145029 = x10.rtt.Equality.equalsequals((t$145024),(t$145025));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        if (t$145029) {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            final $U t$145027 = (($U)(this.second));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            final x10.util.Triple t$145026 = ((x10.util.Triple)(other));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            final $U t$145028 = (($U)(((x10.util.Triple<$T, $U, $V>)t$145026).second));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            t$145029 = x10.rtt.Equality.equalsequals((t$145027),(t$145028));
        }
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        boolean t$145033 = t$145029;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        if (t$145033) {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            final $V t$145031 = (($V)(this.third));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            final x10.util.Triple t$145030 = ((x10.util.Triple)(other));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            final $V t$145032 = (($V)(((x10.util.Triple<$T, $U, $V>)t$145030).third));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            t$145033 = x10.rtt.Equality.equalsequals((t$145031),(t$145032));
        }
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final boolean t$145034 = t$145033;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        return t$145034;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
    final public boolean _struct_equals$O(java.lang.Object other) {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final java.lang.Object t$145035 = ((java.lang.Object)(other));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final boolean t$145036 = x10.util.Triple.$RTT.isInstance(t$145035, $T, $U, $V);
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final boolean t$145037 = !(t$145036);
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        if (t$145037) {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            return false;
        }
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final java.lang.Object t$145038 = ((java.lang.Object)(other));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final x10.util.Triple t$145039 = ((x10.util.Triple)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.util.Triple.$RTT, $T, $U, $V),t$145038));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final boolean t$145040 = this._struct_equals__0$1x10$util$Triple$$T$3x10$util$Triple$$U$3x10$util$Triple$$V$2$O(((x10.util.Triple)(t$145039)));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        return t$145040;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
    final public boolean _struct_equals__0$1x10$util$Triple$$T$3x10$util$Triple$$U$3x10$util$Triple$$V$2$O(x10.util.Triple other) {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final $T t$145042 = (($T)(this.first));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final x10.util.Triple t$145041 = ((x10.util.Triple)(other));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final $T t$145043 = (($T)(((x10.util.Triple<$T, $U, $V>)t$145041).first));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        boolean t$145047 = x10.rtt.Equality.equalsequals((t$145042),(t$145043));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        if (t$145047) {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            final $U t$145045 = (($U)(this.second));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            final x10.util.Triple t$145044 = ((x10.util.Triple)(other));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            final $U t$145046 = (($U)(((x10.util.Triple<$T, $U, $V>)t$145044).second));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            t$145047 = x10.rtt.Equality.equalsequals((t$145045),(t$145046));
        }
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        boolean t$145051 = t$145047;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        if (t$145051) {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            final $V t$145049 = (($V)(this.third));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            final x10.util.Triple t$145048 = ((x10.util.Triple)(other));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            final $V t$145050 = (($V)(((x10.util.Triple<$T, $U, $V>)t$145048).third));
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
            t$145051 = x10.rtt.Equality.equalsequals((t$145049),(t$145050));
        }
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        final boolean t$145052 = t$145051;
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        return t$145052;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
    final public x10.util.Triple x10$util$Triple$$this$x10$util$Triple() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
        return x10.util.Triple.this;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Triple.x10"
    final public void __fieldInitializers_x10_util_Triple() {
        
    }
}

