package x10.lang;


@x10.runtime.impl.java.X10Generated
final public class GlobalRail<$T> extends x10.core.Struct implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<GlobalRail> $RTT = 
        x10.rtt.NamedStructType.<GlobalRail> make("x10.lang.GlobalRail",
                                                  GlobalRail.class,
                                                  1,
                                                  new x10.rtt.Type[] {
                                                      x10.rtt.Types.STRUCT
                                                  });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.GlobalRail<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.size = $deserializer.readLong();
        $_obj.rail = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.GlobalRail $_obj = new x10.lang.GlobalRail((java.lang.System[]) null, (x10.rtt.Type) null);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.size);
        $serializer.write(this.rail);
        
    }
    
    // zero value constructor
    public GlobalRail(final x10.rtt.Type $T, final java.lang.System $dummy) { this.$T = $T; this.size = 0L; this.rail = new x10.core.GlobalRef<x10.core.Rail<$T>>(x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, $T), $dummy); }
    
    // constructor just for allocation
    public GlobalRail(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.lang.GlobalRail.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final GlobalRail $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __0$1x10$lang$GlobalRail$$T$2 {}
    // synthetic type for parameter mangling
    public static final class __1$1x10$lang$Rail$1x10$lang$GlobalRail$$T$2$2 {}
    
    // properties
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    public long size;
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    public x10.core.GlobalRef<x10.core.Rail<$T>> rail;
    

    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public x10.lang.Place home() {
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.core.GlobalRef t$110001 = ((x10.core.GlobalRef)(rail));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.lang.Place t$110002 = ((x10.lang.Place)((t$110001).home));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        return t$110002;
    }
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    // creation method for java code (1-phase java constructor)
    public GlobalRail(final x10.rtt.Type $T, final x10.core.Rail<$T> a, __0$1x10$lang$GlobalRail$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$lang$GlobalRail$$init$S(a, (x10.lang.GlobalRail.__0$1x10$lang$GlobalRail$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.lang.GlobalRail<$T> x10$lang$GlobalRail$$init$S(final x10.core.Rail<$T> a, __0$1x10$lang$GlobalRail$$T$2 $dummy) {
         {
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            final long t$110086 = ((x10.core.Rail<$T>)a).size;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            final x10.core.GlobalRef t$110087 = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.core.Rail<$T>>(x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, $T), ((x10.core.Rail)(a)), (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            this.size = t$110086;
            this.rail = t$110087;
            
            
            //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            final x10.lang.GlobalRail this$109995 = this;
        }
        return this;
    }
    
    
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    // creation method for java code (1-phase java constructor)
    public GlobalRail(final x10.rtt.Type $T, final long size, final x10.core.GlobalRef<x10.core.Rail<$T>> raw, __1$1x10$lang$Rail$1x10$lang$GlobalRail$$T$2$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$lang$GlobalRail$$init$S(size, raw, (x10.lang.GlobalRail.__1$1x10$lang$Rail$1x10$lang$GlobalRail$$T$2$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.lang.GlobalRail<$T> x10$lang$GlobalRail$$init$S(final long size, final x10.core.GlobalRef<x10.core.Rail<$T>> raw, __1$1x10$lang$Rail$1x10$lang$GlobalRail$$T$2$2 $dummy) {
         {
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            this.size = size;
            this.rail = raw;
            
            
            //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            final x10.lang.GlobalRail this$109998 = this;
        }
        return this;
    }
    
    
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public $T $apply$G(final long index) {
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.core.Rail t$110007 = ((x10.core.Rail)(((x10.core.Rail<$T>)
                                                          this.$apply())));
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final $T t$110008 = (($T)(((x10.core.Rail<$T>)t$110007).$apply$G((long)(index))));
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        return t$110008;
    }
    
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public $T $set__1x10$lang$GlobalRail$$T$G(final long index, final $T v) {
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.core.Rail t$110011 = ((x10.core.Rail)(((x10.core.Rail<$T>)
                                                          this.$apply())));
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final $T t$110012 = (($T)(((x10.core.Rail<$T>)t$110011).$set__1x10$lang$Rail$$T$G((long)(index), (($T)(v)))));
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        return t$110012;
    }
    
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public x10.core.Rail $apply() {
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.core.GlobalRef t$110015 = ((x10.core.GlobalRef)(rail));
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.core.Rail t$110016 = ((x10.core.Rail)((((x10.core.GlobalRef<x10.core.Rail<$T>>)(t$110015))).$apply$G()));
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        return t$110016;
    }
    
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public static void remoteAdd__0$1x10$lang$ULong$2__2$u(final x10.lang.GlobalRail<x10.core.ULong> target, final long idx, final long v) {
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.core.GlobalRef t$110017 = ((x10.core.GlobalRef)(((x10.lang.GlobalRail<x10.core.ULong>)target).rail));
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.lang.Place t$110019 = ((x10.lang.Place)((t$110017).home));
        {
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            x10.lang.Runtime.runAt(((x10.lang.Place)(t$110019)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.GlobalRail.$Closure$115(target, idx, v, (x10.lang.GlobalRail.$Closure$115.__0$1x10$lang$ULong$2__2$u) null))), ((x10.lang.Runtime.Profile)(null)));
        }
    }
    
    
    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public static void remoteAdd__0$1x10$lang$Long$2(final x10.lang.GlobalRail<x10.core.Long> target, final long idx, final long v) {
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.core.GlobalRef t$110020 = ((x10.core.GlobalRef)(((x10.lang.GlobalRail<x10.core.Long>)target).rail));
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.lang.Place t$110022 = ((x10.lang.Place)((t$110020).home));
        {
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            x10.lang.Runtime.runAt(((x10.lang.Place)(t$110022)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.GlobalRail.$Closure$116(target, idx, v, (x10.lang.GlobalRail.$Closure$116.__0$1x10$lang$Long$2) null))), ((x10.lang.Runtime.Profile)(null)));
        }
    }
    
    
    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public static void remoteAnd__0$1x10$lang$ULong$2__2$u(final x10.lang.GlobalRail<x10.core.ULong> target, final long idx, final long v) {
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.core.GlobalRef t$110023 = ((x10.core.GlobalRef)(((x10.lang.GlobalRail<x10.core.ULong>)target).rail));
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.lang.Place t$110025 = ((x10.lang.Place)((t$110023).home));
        {
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            x10.lang.Runtime.runAt(((x10.lang.Place)(t$110025)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.GlobalRail.$Closure$117(target, idx, v, (x10.lang.GlobalRail.$Closure$117.__0$1x10$lang$ULong$2__2$u) null))), ((x10.lang.Runtime.Profile)(null)));
        }
    }
    
    
    //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public static void remoteAnd__0$1x10$lang$Long$2(final x10.lang.GlobalRail<x10.core.Long> target, final long idx, final long v) {
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.core.GlobalRef t$110026 = ((x10.core.GlobalRef)(((x10.lang.GlobalRail<x10.core.Long>)target).rail));
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.lang.Place t$110028 = ((x10.lang.Place)((t$110026).home));
        {
            
            //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            x10.lang.Runtime.runAt(((x10.lang.Place)(t$110028)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.GlobalRail.$Closure$118(target, idx, v, (x10.lang.GlobalRail.$Closure$118.__0$1x10$lang$Long$2) null))), ((x10.lang.Runtime.Profile)(null)));
        }
    }
    
    
    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public static void remoteOr__0$1x10$lang$ULong$2__2$u(final x10.lang.GlobalRail<x10.core.ULong> target, final long idx, final long v) {
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.core.GlobalRef t$110029 = ((x10.core.GlobalRef)(((x10.lang.GlobalRail<x10.core.ULong>)target).rail));
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.lang.Place t$110031 = ((x10.lang.Place)((t$110029).home));
        {
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            x10.lang.Runtime.runAt(((x10.lang.Place)(t$110031)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.GlobalRail.$Closure$119(target, idx, v, (x10.lang.GlobalRail.$Closure$119.__0$1x10$lang$ULong$2__2$u) null))), ((x10.lang.Runtime.Profile)(null)));
        }
    }
    
    
    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public static void remoteOr__0$1x10$lang$Long$2(final x10.lang.GlobalRail<x10.core.Long> target, final long idx, final long v) {
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.core.GlobalRef t$110032 = ((x10.core.GlobalRef)(((x10.lang.GlobalRail<x10.core.Long>)target).rail));
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.lang.Place t$110034 = ((x10.lang.Place)((t$110032).home));
        {
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            x10.lang.Runtime.runAt(((x10.lang.Place)(t$110034)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.GlobalRail.$Closure$120(target, idx, v, (x10.lang.GlobalRail.$Closure$120.__0$1x10$lang$Long$2) null))), ((x10.lang.Runtime.Profile)(null)));
        }
    }
    
    
    //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public static void remoteXor__0$1x10$lang$ULong$2__2$u(final x10.lang.GlobalRail<x10.core.ULong> target, final long idx, final long v) {
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.core.GlobalRef t$110035 = ((x10.core.GlobalRef)(((x10.lang.GlobalRail<x10.core.ULong>)target).rail));
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.lang.Place t$110037 = ((x10.lang.Place)((t$110035).home));
        {
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            x10.lang.Runtime.runAt(((x10.lang.Place)(t$110037)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.GlobalRail.$Closure$121(target, idx, v, (x10.lang.GlobalRail.$Closure$121.__0$1x10$lang$ULong$2__2$u) null))), ((x10.lang.Runtime.Profile)(null)));
        }
    }
    
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public static void remoteXor__0$1x10$lang$Long$2(final x10.lang.GlobalRail<x10.core.Long> target, final long idx, final long v) {
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.core.GlobalRef t$110038 = ((x10.core.GlobalRef)(((x10.lang.GlobalRail<x10.core.Long>)target).rail));
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.lang.Place t$110040 = ((x10.lang.Place)((t$110038).home));
        {
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            x10.lang.Runtime.runAt(((x10.lang.Place)(t$110040)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.GlobalRail.$Closure$122(target, idx, v, (x10.lang.GlobalRail.$Closure$122.__0$1x10$lang$Long$2) null))), ((x10.lang.Runtime.Profile)(null)));
        }
    }
    
    
    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public static void flushRemoteOps() {
        try {
            ;
        }
        catch (java.lang.Throwable exc$146352) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146352);
        }
        
    }
    
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public java.lang.String typeName() {
        try {
            return x10.rtt.Types.typeName(this);
        }
        catch (java.lang.Throwable exc$146353) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146353);
        }
        
    }
    
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public java.lang.String toString() {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final java.lang.String t$110041 = "struct x10.lang.GlobalRail: size=";
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final long t$110042 = this.size;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final java.lang.String t$110043 = ((t$110041) + ((x10.core.Long.$box(t$110042))));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final java.lang.String t$110044 = ((t$110043) + (" rail="));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.core.GlobalRef t$110045 = ((x10.core.GlobalRef)(this.rail));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final java.lang.String t$110046 = ((t$110044) + (t$110045));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        return t$110046;
    }
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public int hashCode() {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        int result = 1;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final int t$110047 = result;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final int t$110049 = ((8191) * (((int)(t$110047))));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final long t$110048 = this.size;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final int t$110050 = x10.rtt.Types.hashCode(t$110048);
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final int t$110051 = ((t$110049) + (((int)(t$110050))));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        result = t$110051;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final int t$110052 = result;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final int t$110054 = ((8191) * (((int)(t$110052))));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.core.GlobalRef t$110053 = ((x10.core.GlobalRef)(this.rail));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final int t$110055 = (((x10.core.GlobalRef<x10.core.Rail<$T>>)(t$110053))).hashCode();
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final int t$110056 = ((t$110054) + (((int)(t$110055))));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        result = t$110056;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final int t$110057 = result;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        return t$110057;
    }
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public boolean equals(java.lang.Object other) {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final java.lang.Object t$110058 = ((java.lang.Object)(other));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final boolean t$110059 = x10.lang.GlobalRail.$RTT.isInstance(t$110058, $T);
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final boolean t$110060 = !(t$110059);
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        if (t$110060) {
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            return false;
        }
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final java.lang.Object t$110061 = ((java.lang.Object)(other));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.lang.GlobalRail t$110062 = ((x10.lang.GlobalRail)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.lang.GlobalRail.$RTT, $T),t$110061));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final boolean t$110063 = this.equals__0$1x10$lang$GlobalRail$$T$2$O(((x10.lang.GlobalRail)(t$110062)));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        return t$110063;
    }
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public boolean equals__0$1x10$lang$GlobalRail$$T$2$O(x10.lang.GlobalRail other) {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final long t$110065 = this.size;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.lang.GlobalRail t$110064 = ((x10.lang.GlobalRail)(other));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final long t$110066 = ((x10.lang.GlobalRail<$T>)t$110064).size;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        boolean t$110070 = ((long) t$110065) == ((long) t$110066);
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        if (t$110070) {
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            final x10.core.GlobalRef t$110068 = ((x10.core.GlobalRef)(this.rail));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            final x10.lang.GlobalRail t$110067 = ((x10.lang.GlobalRail)(other));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            final x10.core.GlobalRef t$110069 = ((x10.core.GlobalRef)(((x10.lang.GlobalRail<$T>)t$110067).rail));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            t$110070 = x10.rtt.Equality.equalsequals((t$110068),(t$110069));
        }
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final boolean t$110071 = t$110070;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        return t$110071;
    }
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public boolean _struct_equals$O(java.lang.Object other) {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final java.lang.Object t$110072 = ((java.lang.Object)(other));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final boolean t$110073 = x10.lang.GlobalRail.$RTT.isInstance(t$110072, $T);
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final boolean t$110074 = !(t$110073);
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        if (t$110074) {
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            return false;
        }
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final java.lang.Object t$110075 = ((java.lang.Object)(other));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.lang.GlobalRail t$110076 = ((x10.lang.GlobalRail)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.lang.GlobalRail.$RTT, $T),t$110075));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final boolean t$110077 = this._struct_equals__0$1x10$lang$GlobalRail$$T$2$O(((x10.lang.GlobalRail)(t$110076)));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        return t$110077;
    }
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public boolean _struct_equals__0$1x10$lang$GlobalRail$$T$2$O(x10.lang.GlobalRail other) {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final long t$110079 = this.size;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final x10.lang.GlobalRail t$110078 = ((x10.lang.GlobalRail)(other));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final long t$110080 = ((x10.lang.GlobalRail<$T>)t$110078).size;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        boolean t$110084 = ((long) t$110079) == ((long) t$110080);
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        if (t$110084) {
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            final x10.core.GlobalRef t$110082 = ((x10.core.GlobalRef)(this.rail));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            final x10.lang.GlobalRail t$110081 = ((x10.lang.GlobalRail)(other));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            final x10.core.GlobalRef t$110083 = ((x10.core.GlobalRef)(((x10.lang.GlobalRail<$T>)t$110081).rail));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            t$110084 = x10.rtt.Equality.equalsequals((t$110082),(t$110083));
        }
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        final boolean t$110085 = t$110084;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        return t$110085;
    }
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public x10.lang.GlobalRail x10$lang$GlobalRail$$this$x10$lang$GlobalRail() {
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        return x10.lang.GlobalRail.this;
    }
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    final public void __fieldInitializers_x10_lang_GlobalRail() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$115 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$115> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$115> make($Closure$115.class,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.GlobalRail.$Closure$115 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.target = $deserializer.readObject();
            $_obj.idx = $deserializer.readLong();
            $_obj.v = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.GlobalRail.$Closure$115 $_obj = new x10.lang.GlobalRail.$Closure$115((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.target);
            $serializer.write(this.idx);
            $serializer.write(this.v);
            
        }
        
        // constructor just for allocation
        public $Closure$115(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$ULong$2__2$u {}
        
    
        
        public void $apply() {
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            try {{
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final x10.lang.GlobalRail a$109792 = ((x10.lang.GlobalRail)(this.target));
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long i0$109793 = this.idx;
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long t$110018 = x10.core.ULong.$unbox(((x10.lang.GlobalRail<x10.core.ULong>)a$109792).$apply$G((long)(i0$109793)));
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long r$109801 = ((t$110018) + (((long)(this.v))));
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                ((x10.lang.GlobalRail<x10.core.ULong>)a$109792).$set__1x10$lang$GlobalRail$$T$G((long)(i0$109793), x10.core.ULong.$box(r$109801));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.lang.GlobalRail<x10.core.ULong> target;
        public long idx;
        public long v;
        
        public $Closure$115(final x10.lang.GlobalRail<x10.core.ULong> target, final long idx, final long v, __0$1x10$lang$ULong$2__2$u $dummy) {
             {
                this.target = ((x10.lang.GlobalRail)(target));
                this.idx = idx;
                this.v = v;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$116 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$116> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$116> make($Closure$116.class,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.GlobalRail.$Closure$116 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.target = $deserializer.readObject();
            $_obj.idx = $deserializer.readLong();
            $_obj.v = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.GlobalRail.$Closure$116 $_obj = new x10.lang.GlobalRail.$Closure$116((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.target);
            $serializer.write(this.idx);
            $serializer.write(this.v);
            
        }
        
        // constructor just for allocation
        public $Closure$116(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Long$2 {}
        
    
        
        public void $apply() {
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            try {{
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final x10.lang.GlobalRail a$109802 = ((x10.lang.GlobalRail)(this.target));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long i0$109803 = this.idx;
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long t$110021 = x10.core.Long.$unbox(((x10.lang.GlobalRail<x10.core.Long>)a$109802).$apply$G((long)(i0$109803)));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long r$109811 = ((t$110021) + (((long)(this.v))));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                ((x10.lang.GlobalRail<x10.core.Long>)a$109802).$set__1x10$lang$GlobalRail$$T$G((long)(i0$109803), x10.core.Long.$box(r$109811));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.lang.GlobalRail<x10.core.Long> target;
        public long idx;
        public long v;
        
        public $Closure$116(final x10.lang.GlobalRail<x10.core.Long> target, final long idx, final long v, __0$1x10$lang$Long$2 $dummy) {
             {
                this.target = ((x10.lang.GlobalRail)(target));
                this.idx = idx;
                this.v = v;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$117 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$117> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$117> make($Closure$117.class,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.GlobalRail.$Closure$117 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.target = $deserializer.readObject();
            $_obj.idx = $deserializer.readLong();
            $_obj.v = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.GlobalRail.$Closure$117 $_obj = new x10.lang.GlobalRail.$Closure$117((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.target);
            $serializer.write(this.idx);
            $serializer.write(this.v);
            
        }
        
        // constructor just for allocation
        public $Closure$117(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$ULong$2__2$u {}
        
    
        
        public void $apply() {
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            try {{
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final x10.lang.GlobalRail a$109812 = ((x10.lang.GlobalRail)(this.target));
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long i0$109813 = this.idx;
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long t$110024 = x10.core.ULong.$unbox(((x10.lang.GlobalRail<x10.core.ULong>)a$109812).$apply$G((long)(i0$109813)));
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long r$109822 = ((t$110024) & (((long)(this.v))));
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                ((x10.lang.GlobalRail<x10.core.ULong>)a$109812).$set__1x10$lang$GlobalRail$$T$G((long)(i0$109813), x10.core.ULong.$box(r$109822));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.lang.GlobalRail<x10.core.ULong> target;
        public long idx;
        public long v;
        
        public $Closure$117(final x10.lang.GlobalRail<x10.core.ULong> target, final long idx, final long v, __0$1x10$lang$ULong$2__2$u $dummy) {
             {
                this.target = ((x10.lang.GlobalRail)(target));
                this.idx = idx;
                this.v = v;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$118 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$118> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$118> make($Closure$118.class,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.GlobalRail.$Closure$118 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.target = $deserializer.readObject();
            $_obj.idx = $deserializer.readLong();
            $_obj.v = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.GlobalRail.$Closure$118 $_obj = new x10.lang.GlobalRail.$Closure$118((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.target);
            $serializer.write(this.idx);
            $serializer.write(this.v);
            
        }
        
        // constructor just for allocation
        public $Closure$118(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Long$2 {}
        
    
        
        public void $apply() {
            
            //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            try {{
                
                //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final x10.lang.GlobalRail a$109823 = ((x10.lang.GlobalRail)(this.target));
                
                //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long i0$109824 = this.idx;
                
                //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long t$110027 = x10.core.Long.$unbox(((x10.lang.GlobalRail<x10.core.Long>)a$109823).$apply$G((long)(i0$109824)));
                
                //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long r$109832 = ((t$110027) & (((long)(this.v))));
                
                //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                ((x10.lang.GlobalRail<x10.core.Long>)a$109823).$set__1x10$lang$GlobalRail$$T$G((long)(i0$109824), x10.core.Long.$box(r$109832));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.lang.GlobalRail<x10.core.Long> target;
        public long idx;
        public long v;
        
        public $Closure$118(final x10.lang.GlobalRail<x10.core.Long> target, final long idx, final long v, __0$1x10$lang$Long$2 $dummy) {
             {
                this.target = ((x10.lang.GlobalRail)(target));
                this.idx = idx;
                this.v = v;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$119 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$119> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$119> make($Closure$119.class,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.GlobalRail.$Closure$119 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.target = $deserializer.readObject();
            $_obj.idx = $deserializer.readLong();
            $_obj.v = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.GlobalRail.$Closure$119 $_obj = new x10.lang.GlobalRail.$Closure$119((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.target);
            $serializer.write(this.idx);
            $serializer.write(this.v);
            
        }
        
        // constructor just for allocation
        public $Closure$119(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$ULong$2__2$u {}
        
    
        
        public void $apply() {
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            try {{
                
                //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final x10.lang.GlobalRail a$109833 = ((x10.lang.GlobalRail)(this.target));
                
                //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long i0$109834 = this.idx;
                
                //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long t$110030 = x10.core.ULong.$unbox(((x10.lang.GlobalRail<x10.core.ULong>)a$109833).$apply$G((long)(i0$109834)));
                
                //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long r$109843 = ((t$110030) | (((long)(this.v))));
                
                //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                ((x10.lang.GlobalRail<x10.core.ULong>)a$109833).$set__1x10$lang$GlobalRail$$T$G((long)(i0$109834), x10.core.ULong.$box(r$109843));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.lang.GlobalRail<x10.core.ULong> target;
        public long idx;
        public long v;
        
        public $Closure$119(final x10.lang.GlobalRail<x10.core.ULong> target, final long idx, final long v, __0$1x10$lang$ULong$2__2$u $dummy) {
             {
                this.target = ((x10.lang.GlobalRail)(target));
                this.idx = idx;
                this.v = v;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$120 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$120> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$120> make($Closure$120.class,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.GlobalRail.$Closure$120 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.target = $deserializer.readObject();
            $_obj.idx = $deserializer.readLong();
            $_obj.v = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.GlobalRail.$Closure$120 $_obj = new x10.lang.GlobalRail.$Closure$120((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.target);
            $serializer.write(this.idx);
            $serializer.write(this.v);
            
        }
        
        // constructor just for allocation
        public $Closure$120(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Long$2 {}
        
    
        
        public void $apply() {
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            try {{
                
                //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final x10.lang.GlobalRail a$109844 = ((x10.lang.GlobalRail)(this.target));
                
                //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long i0$109845 = this.idx;
                
                //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long t$110033 = x10.core.Long.$unbox(((x10.lang.GlobalRail<x10.core.Long>)a$109844).$apply$G((long)(i0$109845)));
                
                //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long r$109853 = ((t$110033) | (((long)(this.v))));
                
                //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                ((x10.lang.GlobalRail<x10.core.Long>)a$109844).$set__1x10$lang$GlobalRail$$T$G((long)(i0$109845), x10.core.Long.$box(r$109853));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.lang.GlobalRail<x10.core.Long> target;
        public long idx;
        public long v;
        
        public $Closure$120(final x10.lang.GlobalRail<x10.core.Long> target, final long idx, final long v, __0$1x10$lang$Long$2 $dummy) {
             {
                this.target = ((x10.lang.GlobalRail)(target));
                this.idx = idx;
                this.v = v;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$121 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$121> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$121> make($Closure$121.class,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.GlobalRail.$Closure$121 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.target = $deserializer.readObject();
            $_obj.idx = $deserializer.readLong();
            $_obj.v = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.GlobalRail.$Closure$121 $_obj = new x10.lang.GlobalRail.$Closure$121((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.target);
            $serializer.write(this.idx);
            $serializer.write(this.v);
            
        }
        
        // constructor just for allocation
        public $Closure$121(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$ULong$2__2$u {}
        
    
        
        public void $apply() {
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            try {{
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final x10.lang.GlobalRail a$109854 = ((x10.lang.GlobalRail)(this.target));
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long i0$109855 = this.idx;
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long t$110036 = x10.core.ULong.$unbox(((x10.lang.GlobalRail<x10.core.ULong>)a$109854).$apply$G((long)(i0$109855)));
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long r$109864 = ((t$110036) ^ (((long)(this.v))));
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                ((x10.lang.GlobalRail<x10.core.ULong>)a$109854).$set__1x10$lang$GlobalRail$$T$G((long)(i0$109855), x10.core.ULong.$box(r$109864));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.lang.GlobalRail<x10.core.ULong> target;
        public long idx;
        public long v;
        
        public $Closure$121(final x10.lang.GlobalRail<x10.core.ULong> target, final long idx, final long v, __0$1x10$lang$ULong$2__2$u $dummy) {
             {
                this.target = ((x10.lang.GlobalRail)(target));
                this.idx = idx;
                this.v = v;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$122 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$122> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$122> make($Closure$122.class,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.GlobalRail.$Closure$122 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.target = $deserializer.readObject();
            $_obj.idx = $deserializer.readLong();
            $_obj.v = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.GlobalRail.$Closure$122 $_obj = new x10.lang.GlobalRail.$Closure$122((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.target);
            $serializer.write(this.idx);
            $serializer.write(this.v);
            
        }
        
        // constructor just for allocation
        public $Closure$122(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Long$2 {}
        
    
        
        public void $apply() {
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
            try {{
                
                //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final x10.lang.GlobalRail a$109865 = ((x10.lang.GlobalRail)(this.target));
                
                //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long i0$109866 = this.idx;
                
                //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long t$110039 = x10.core.Long.$unbox(((x10.lang.GlobalRail<x10.core.Long>)a$109865).$apply$G((long)(i0$109866)));
                
                //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                final long r$109874 = ((t$110039) ^ (((long)(this.v))));
                
                //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                ((x10.lang.GlobalRail<x10.core.Long>)a$109865).$set__1x10$lang$GlobalRail$$T$G((long)(i0$109866), x10.core.Long.$box(r$109874));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.lang.GlobalRail<x10.core.Long> target;
        public long idx;
        public long v;
        
        public $Closure$122(final x10.lang.GlobalRail<x10.core.Long> target, final long idx, final long v, __0$1x10$lang$Long$2 $dummy) {
             {
                this.target = ((x10.lang.GlobalRail)(target));
                this.idx = idx;
                this.v = v;
            }
        }
        
    }
    
}

