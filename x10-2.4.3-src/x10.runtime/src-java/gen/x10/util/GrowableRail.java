package x10.util;


@x10.runtime.impl.java.X10Generated
final public class GrowableRail<$T> extends x10.core.Ref implements x10.io.CustomSerialization
{
    public static final x10.rtt.RuntimeType<GrowableRail> $RTT = 
        x10.rtt.NamedType.<GrowableRail> make("x10.util.GrowableRail",
                                              GrowableRail.class,
                                              1,
                                              new x10.rtt.Type[] {
                                                  x10.io.CustomSerialization.$RTT
                                              });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    // custom serialization support
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.GrowableRail<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.Deserializer $ds = new x10.io.Deserializer($deserializer);
        $_obj.x10$util$GrowableRail$$init$S($ds);
        short $marker = $deserializer.readSerializationId();
        if ($marker != x10.serialization.SerializationConstants.CUSTOM_SERIALIZATION_END) { x10.serialization.X10JavaDeserializer.raiseSerializationProtocolError(); }
        return $_obj;
        
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        int $obj_id = $deserializer.record_reference(null); /* Get id eagerly so that ordering in object map is stable (needed for repeated reference mechanism) */
        x10.rtt.Type $T = (x10.rtt.Type) $deserializer.readObject();
        GrowableRail $_obj = new GrowableRail((java.lang.System[]) null, (x10.rtt.Type) $T);
        $deserializer.update_reference($obj_id, $_obj); /* Update entry in object map with the actual object before deserializing body */
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
    
        $serializer.write($T);
        serialize(new x10.io.Serializer($serializer)); 
        $serializer.writeSerializationId(x10.serialization.SerializationConstants.CUSTOM_SERIALIZATION_END);
        
    }
    
    // constructor just for allocation
    public GrowableRail(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.util.GrowableRail.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final GrowableRail $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    

    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public x10.core.Rail<$T> data;
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public x10.core.Rail rail() {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136244 = ((x10.core.Rail)(data));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        return t$136244;
    }
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    /**
    * Elements 0..size-1 have valid entries of type T.
    * Elements size..data.size-1 may not be valid values of type T.  
    * It is an invariant of this class, that such elements
    * will never be accessed.
    */
    public long size;
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    // creation method for java code (1-phase java constructor)
    public GrowableRail(final x10.rtt.Type $T) {
        this((java.lang.System[]) null, $T);
        x10$util$GrowableRail$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.util.GrowableRail<$T> x10$util$GrowableRail$$init$S() {
         {
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            /*this.*/x10$util$GrowableRail$$init$S(((long)(0L)));
        }
        return this;
    }
    
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    // creation method for java code (1-phase java constructor)
    public GrowableRail(final x10.rtt.Type $T, final long cap) {
        this((java.lang.System[]) null, $T);
        x10$util$GrowableRail$$init$S(cap);
    }
    
    // constructor for non-virtual call
    final public x10.util.GrowableRail<$T> x10$util$GrowableRail$$init$S(final long cap) {
         {
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.util.GrowableRail this$136426 = this;
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ((x10.util.GrowableRail<$T>)this$136426).data = null;
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ((x10.util.GrowableRail<$T>)this$136426).size = 0L;
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$136245 = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(cap)), true)));
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ((x10.util.GrowableRail<$T>)this).data = ((x10.core.Rail)(t$136245));
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ((x10.util.GrowableRail<$T>)this).size = 0L;
        }
        return this;
    }
    
    
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    // creation method for java code (1-phase java constructor)
    public GrowableRail(final x10.rtt.Type $T, final x10.io.Deserializer ds) {
        this((java.lang.System[]) null, $T);
        x10$util$GrowableRail$$init$S(ds);
    }
    
    // constructor for non-virtual call
    final public x10.util.GrowableRail<$T> x10$util$GrowableRail$$init$S(final x10.io.Deserializer ds) {
        x10$util$GrowableRail$$initForReflection(ds);
        
        return this;
    }
    
    public void x10$util$GrowableRail$$initForReflection(x10.io.Deserializer ds) {
         {
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.util.GrowableRail this$136427 = this;
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ((x10.util.GrowableRail<$T>)this$136427).data = null;
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ((x10.util.GrowableRail<$T>)this$136427).size = 0L;
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final java.lang.Object t$136246 = ds.readAny();
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail src = x10.rtt.Types.<x10.core.Rail<$T>> cast(t$136246,x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, $T));
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136247 = ((x10.core.Rail<$T>)src).size;
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$136248 = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(t$136247)), false)));
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ((x10.util.GrowableRail<$T>)this).data = ((x10.core.Rail)(t$136248));
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$136249 = ((x10.core.Rail)(data));
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136250 = ((x10.core.Rail<$T>)src).size;
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10.core.Rail.<$T> copy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(src)), (long)(0L), ((x10.core.Rail)(t$136249)), (long)(0L), (long)(t$136250));
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136251 = ((x10.core.Rail<$T>)src).size;
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ((x10.util.GrowableRail<$T>)this).size = t$136251;
        }
    }
    
    
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public void serialize(final x10.io.Serializer s) {
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136252 = size;
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail tmp = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(t$136252)), false)));
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136253 = ((x10.core.Rail)(data));
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136254 = size;
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10.core.Rail.<$T> copy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(t$136253)), (long)(0L), ((x10.core.Rail)(tmp)), (long)(0L), (long)(t$136254));
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        s.writeAny(((java.lang.Object)(tmp)));
    }
    
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public void add__0x10$util$GrowableRail$$T(final $T v) {
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136255 = size;
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136257 = ((t$136255) + (((long)(1L))));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.util.GrowableRail this$136224 = ((x10.util.GrowableRail)(this));
        
        //#line 164 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136256 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$136224).data));
        
        //#line 164 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136258 = ((x10.core.Rail<$T>)t$136256).size;
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final boolean t$136261 = ((t$136257) > (((long)(t$136258))));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if (t$136261) {
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136259 = size;
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136260 = ((t$136259) + (((long)(1L))));
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            this.grow((long)(t$136260));
        }
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136265 = ((x10.core.Rail)(data));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136262 = this.size;
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136263 = ((t$136262) + (((long)(1L))));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136264 = ((x10.util.GrowableRail<$T>)this).size = t$136263;
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136266 = ((t$136264) - (((long)(1L))));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ((x10.core.Rail<$T>)t$136265).$set__1x10$lang$Rail$$T$G((long)(t$136266), (($T)(v)));
    }
    
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public void addAll__0$1x10$util$GrowableRail$$T$2(final x10.util.GrowableRail x) {
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136267 = size;
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136268 = ((x10.util.GrowableRail<$T>)x).size;
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136270 = ((t$136267) + (((long)(t$136268))));
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.util.GrowableRail this$136225 = ((x10.util.GrowableRail)(this));
        
        //#line 164 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136269 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$136225).data));
        
        //#line 164 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136271 = ((x10.core.Rail<$T>)t$136269).size;
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final boolean t$136275 = ((t$136270) > (((long)(t$136271))));
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if (t$136275) {
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136272 = size;
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136273 = ((x10.util.GrowableRail<$T>)x).size;
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136274 = ((t$136272) + (((long)(t$136273))));
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            this.grow((long)(t$136274));
        }
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136444 = ((x10.util.GrowableRail<$T>)x).size;
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long i$78401max$136445 = ((t$136444) - (((long)(1L))));
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        long i$136441 = 0L;
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        for (;
             true;
             ) {
            
            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136442 = i$136441;
            
            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final boolean t$136443 = ((t$136442) <= (((long)(i$78401max$136445))));
            
            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            if (!(t$136443)) {
                
                //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                break;
            }
            
            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long i$136438 = i$136441;
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$136430 = ((x10.core.Rail)(data));
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136431 = this.size;
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136432 = ((t$136431) + (((long)(1L))));
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136433 = ((x10.util.GrowableRail<$T>)this).size = t$136432;
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136434 = ((t$136433) - (((long)(1L))));
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long idx$136435 = i$136438;
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            $T ret$136436 =  null;
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$136428 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)x).data));
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final $T t$136429 = (($T)(((x10.core.Rail<$T>)t$136428).$apply$G((long)(idx$136435))));
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret$136436 = (($T)(t$136429));
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final $T t$136437 = (($T)(ret$136436));
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ((x10.core.Rail<$T>)t$136430).$set__1x10$lang$Rail$$T$G((long)(t$136434), (($T)(t$136437)));
            
            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136439 = i$136441;
            
            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136440 = ((t$136439) + (((long)(1L))));
            
            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            i$136441 = t$136440;
        }
    }
    
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public void insert__1$1x10$util$GrowableRail$$T$2(final long p, final x10.core.Rail items) {
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long addLen = ((x10.core.Rail<$T>)items).size;
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136290 = size;
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long newLen = ((t$136290) + (((long)(addLen))));
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136291 = size;
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long movLen = ((t$136291) - (((long)(p))));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.util.GrowableRail this$136229 = ((x10.util.GrowableRail)(this));
        
        //#line 164 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136292 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$136229).data));
        
        //#line 164 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136293 = ((x10.core.Rail<$T>)t$136292).size;
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final boolean t$136294 = ((newLen) > (((long)(t$136293))));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if (t$136294) {
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            this.grow((long)(newLen));
        }
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final boolean t$136298 = ((movLen) > (((long)(0L))));
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if (t$136298) {
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$136295 = ((x10.core.Rail)(data));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$136296 = ((x10.core.Rail)(data));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136297 = ((p) + (((long)(addLen))));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10.core.Rail.<$T> copy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(t$136295)), (long)(p), ((x10.core.Rail)(t$136296)), (long)(t$136297), (long)(movLen));
        }
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136299 = ((x10.core.Rail)(data));
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136300 = ((x10.core.Rail<$T>)items).size;
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10.core.Rail.<$T> copy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(items)), (long)(0L), ((x10.core.Rail)(t$136299)), (long)(p), (long)(t$136300));
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ((x10.util.GrowableRail<$T>)this).size = newLen;
    }
    
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public $T $apply$G(final long idx) {
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136301 = ((x10.core.Rail)(data));
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final $T t$136302 = (($T)(((x10.core.Rail<$T>)t$136301).$apply$G((long)(idx))));
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        return t$136302;
    }
    
    
    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public void $set__1x10$util$GrowableRail$$T(final long idx, final $T v) {
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136303 = size;
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final boolean t$136305 = ((long) idx) == ((long) t$136303);
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if (t$136305) {
            
            //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            this.add__0x10$util$GrowableRail$$T((($T)(v)));
        } else {
            
            //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$136304 = ((x10.core.Rail)(data));
            
            //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ((x10.core.Rail<$T>)t$136304).$set__1x10$lang$Rail$$T$G((long)(idx), (($T)(v)));
        }
    }
    
    
    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public boolean contains__0x10$util$GrowableRail$$T$O(final $T v) {
        
        //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final boolean t$136324 = ((v) == (null));
        
        //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if (t$136324) {
            
            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.util.GrowableRail this$136230 = ((x10.util.GrowableRail)(this));
            
            //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136306 = ((x10.util.GrowableRail<$T>)this$136230).size;
            
            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long i$78419max$78421 = ((t$136306) - (((long)(1L))));
            
            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            long i$136452 = 0L;
            
            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            for (;
                 true;
                 ) {
                
                //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long t$136453 = i$136452;
                
                //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final boolean t$136454 = ((t$136453) <= (((long)(i$78419max$78421))));
                
                //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                if (!(t$136454)) {
                    
                    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    break;
                }
                
                //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long i$136449 = i$136452;
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final x10.core.Rail t$136446 = ((x10.core.Rail)(data));
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final $T t$136447 = (($T)(((x10.core.Rail<$T>)t$136446).$apply$G((long)(i$136449))));
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final boolean t$136448 = ((t$136447) == (null));
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                if (t$136448) {
                    
                    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    return true;
                }
                
                //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long t$136450 = i$136452;
                
                //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long t$136451 = ((t$136450) + (((long)(1L))));
                
                //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                i$136452 = t$136451;
            }
        } else {
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.util.GrowableRail this$136231 = ((x10.util.GrowableRail)(this));
            
            //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136315 = ((x10.util.GrowableRail<$T>)this$136231).size;
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long i$78437max$78439 = ((t$136315) - (((long)(1L))));
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            long i$136461 = 0L;
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            for (;
                 true;
                 ) {
                
                //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long t$136462 = i$136461;
                
                //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final boolean t$136463 = ((t$136462) <= (((long)(i$78437max$78439))));
                
                //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                if (!(t$136463)) {
                    
                    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    break;
                }
                
                //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long i$136458 = i$136461;
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final x10.core.Rail t$136455 = ((x10.core.Rail)(data));
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final $T t$136456 = (($T)(((x10.core.Rail<$T>)t$136455).$apply$G((long)(i$136458))));
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final boolean t$136457 = ((java.lang.Object)(((java.lang.Object)(v)))).equals(t$136456);
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                if (t$136457) {
                    
                    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    return true;
                }
                
                //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long t$136459 = i$136461;
                
                //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long t$136460 = ((t$136459) + (((long)(1L))));
                
                //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                i$136461 = t$136460;
            }
        }
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        return false;
    }
    
    
    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public boolean isEmpty$O() {
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136325 = size;
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final boolean t$136326 = ((long) t$136325) == ((long) 0L);
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        return t$136326;
    }
    
    
    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public long size$O() {
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136327 = size;
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        return t$136327;
    }
    
    
    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public long capacity$O() {
        
        //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136328 = ((x10.core.Rail)(data));
        
        //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136329 = ((x10.core.Rail<$T>)t$136328).size;
        
        //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        return t$136329;
    }
    
    
    //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public $T removeLast$G() {
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.util.GrowableRail this$136233 = ((x10.util.GrowableRail)(this));
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136330 = size;
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long idx$136232 = ((t$136330) - (((long)(1L))));
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        $T ret$136234 =  null;
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136464 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$136233).data));
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final $T t$136465 = (($T)(((x10.core.Rail<$T>)t$136464).$apply$G((long)(idx$136232))));
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ret$136234 = (($T)(t$136465));
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final $T res = (($T)(ret$136234));
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136334 = ((x10.core.Rail)(data));
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136333 = size;
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136335 = ((t$136333) - (((long)(1L))));
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (t$136334).clear(((long)(t$136335)), ((long)(1L)));
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136336 = size;
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136337 = ((t$136336) - (((long)(1L))));
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ((x10.util.GrowableRail<$T>)this).size = t$136337;
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136338 = size;
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136339 = ((t$136338) + (((long)(1L))));
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        this.shrink((long)(t$136339));
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        return res;
    }
    
    
    //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public void clear() {
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136340 = ((x10.core.Rail)(data));
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (t$136340).clear();
        
        //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ((x10.util.GrowableRail<$T>)this).size = 0L;
    }
    
    
    //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public x10.core.Rail moveSectionToRail(final long i, final long j) {
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136341 = ((j) - (((long)(i))));
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long len = ((t$136341) + (((long)(1L))));
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final boolean t$136343 = ((len) < (((long)(1L))));
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if (t$136343) {
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$136342 = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(0L)), false)));
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            return t$136342;
        }
        
        //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail tmp = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(len)), false)));
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136344 = ((x10.core.Rail)(data));
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10.core.Rail.<$T> copy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(t$136344)), (long)(i), ((x10.core.Rail)(tmp)), (long)(0L), (long)(len));
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136347 = ((x10.core.Rail)(data));
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136348 = ((j) + (((long)(1L))));
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136349 = ((x10.core.Rail)(data));
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136345 = size;
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136346 = ((t$136345) - (((long)(j))));
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136350 = ((t$136346) - (((long)(1L))));
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10.core.Rail.<$T> copy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(t$136347)), (long)(t$136348), ((x10.core.Rail)(t$136349)), (long)(i), (long)(t$136350));
        
        //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136352 = ((x10.core.Rail)(data));
        
        //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136351 = size;
        
        //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136353 = ((t$136351) - (((long)(len))));
        
        //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (t$136352).clear(((long)(t$136353)), ((long)(len)));
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136354 = this.size;
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136355 = ((t$136354) - (((long)(len))));
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ((x10.util.GrowableRail<$T>)this).size = t$136355;
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136356 = size;
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136357 = ((t$136356) + (((long)(1L))));
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        this.shrink((long)(t$136357));
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        return tmp;
    }
    
    
    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public x10.core.Rail toRail() {
        
        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136358 = size;
        
        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail ans = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(t$136358)), false)));
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136359 = ((x10.core.Rail)(data));
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136360 = size;
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10.core.Rail.<$T> copy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(t$136359)), (long)(0L), ((x10.core.Rail)(ans)), (long)(0L), (long)(t$136360));
        
        //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        return ans;
    }
    
    
    //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public void grow(long newCapacity) {
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.util.GrowableRail this$136236 = ((x10.util.GrowableRail)(this));
        
        //#line 164 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136361 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$136236).data));
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        long oldCapacity = ((x10.core.Rail<$T>)t$136361).size;
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136363 = newCapacity;
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136362 = oldCapacity;
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136364 = ((t$136362) * (((long)(2L))));
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final boolean t$136367 = ((t$136363) < (((long)(t$136364))));
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if (t$136367) {
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136365 = oldCapacity;
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136366 = ((t$136365) * (((long)(2L))));
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            newCapacity = t$136366;
        }
        
        //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136368 = newCapacity;
        
        //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final boolean t$136369 = ((t$136368) < (((long)(8L))));
        
        //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if (t$136369) {
            
            //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            newCapacity = 8L;
        }
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136370 = newCapacity;
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail tmp = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(t$136370)), false)));
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136371 = ((x10.core.Rail)(data));
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136372 = size;
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10.core.Rail.<$T> copy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(t$136371)), (long)(0L), ((x10.core.Rail)(tmp)), (long)(0L), (long)(t$136372));
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136375 = size;
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136373 = newCapacity;
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136374 = size;
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136376 = ((t$136373) - (((long)(t$136374))));
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (tmp).clear(((long)(t$136375)), ((long)(t$136376)));
        
        //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail o$136237 = ((x10.core.Rail)(data));
        
        //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ((x10.util.GrowableRail<$T>)this).data = ((x10.core.Rail)(tmp));
    }
    
    
    //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public void shrink(long newCapacity) {
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136379 = newCapacity;
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.util.GrowableRail this$136240 = ((x10.util.GrowableRail)(this));
        
        //#line 164 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136377 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$136240).data));
        
        //#line 164 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136378 = ((x10.core.Rail<$T>)t$136377).size;
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136380 = ((t$136378) / (((long)(4L))));
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        boolean t$136382 = ((t$136379) > (((long)(t$136380))));
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if (!(t$136382)) {
            
            //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136381 = newCapacity;
            
            //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            t$136382 = ((t$136381) < (((long)(8L))));
        }
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final boolean t$136383 = t$136382;
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if (t$136383) {
            
            //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            return;
        }
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136384 = newCapacity;
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136385 = size;
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136386 = java.lang.Math.max(((long)(t$136384)),((long)(t$136385)));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        newCapacity = t$136386;
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136387 = newCapacity;
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136388 = java.lang.Math.max(((long)(t$136387)),((long)(8L)));
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        newCapacity = t$136388;
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136389 = newCapacity;
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail tmp = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(t$136389)), false)));
        
        //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136390 = ((x10.core.Rail)(data));
        
        //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136391 = size;
        
        //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10.core.Rail.<$T> copy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(t$136390)), (long)(0L), ((x10.core.Rail)(tmp)), (long)(0L), (long)(t$136391));
        
        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136394 = size;
        
        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136392 = newCapacity;
        
        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136393 = size;
        
        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136395 = ((t$136392) - (((long)(t$136393))));
        
        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (tmp).clear(((long)(t$136394)), ((long)(t$136395)));
        
        //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail o$136241 = ((x10.core.Rail)(data));
        
        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ((x10.util.GrowableRail<$T>)this).data = ((x10.core.Rail)(tmp));
    }
    
    
    //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    private static void raiseIndexOutOfBounds(final long idx, final long size) {
        
        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final java.lang.String t$136396 = (("Index is ") + ((x10.core.Long.$box(idx))));
        
        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final java.lang.String t$136397 = ((t$136396) + ("; size is "));
        
        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final java.lang.String t$136398 = ((t$136397) + ((x10.core.Long.$box(size))));
        
        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final java.lang.ArrayIndexOutOfBoundsException t$136399 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$136398)));
        
        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        throw t$136399;
    }
    
    public static void raiseIndexOutOfBounds$P(final long idx, final long size) {
        x10.util.GrowableRail.raiseIndexOutOfBounds((long)(idx), (long)(size));
    }
    
    
    //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    private static void illegalGap(final long idx, final long size) {
        
        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final java.lang.String t$136400 = (("Insert at ") + ((x10.core.Long.$box(idx))));
        
        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final java.lang.String t$136401 = ((t$136400) + (" would have created gap (size = "));
        
        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final java.lang.String t$136402 = ((t$136401) + ((x10.core.Long.$box(size))));
        
        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final java.lang.String t$136403 = ((t$136402) + (")"));
        
        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final java.lang.UnsupportedOperationException t$136404 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException(t$136403)));
        
        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        throw t$136404;
    }
    
    public static void illegalGap$P(final long idx, final long size) {
        x10.util.GrowableRail.illegalGap((long)(idx), (long)(size));
    }
    
    
    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    public java.lang.String toString() {
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.util.StringBuilder sb = ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null)));
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        sb.x10$util$StringBuilder$$init$S();
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        sb.add(((java.lang.String)("[")));
        
        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136405 = size;
        
        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final boolean t$136406 = ((t$136405) > (((long)(10L))));
        
        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        long t$136407 =  0;
        
        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if (t$136406) {
            
            //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            t$136407 = 10L;
        } else {
            
            //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            t$136407 = size;
        }
        
        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long sz = t$136407;
        
        //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        long i$136474 = 0L;
        
        //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        for (;
             true;
             ) {
            
            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136475 = i$136474;
            
            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final boolean t$136476 = ((t$136475) < (((long)(sz))));
            
            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            if (!(t$136476)) {
                
                //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                break;
            }
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136466 = i$136474;
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final boolean t$136467 = ((t$136466) > (((long)(0L))));
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            if (t$136467) {
                
                //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                sb.add(((java.lang.String)(",")));
            }
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$136468 = ((x10.core.Rail)(data));
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136469 = i$136474;
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final $T t$136470 = (($T)(((x10.core.Rail<$T>)t$136468).$apply$G((long)(t$136469))));
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final java.lang.String t$136471 = x10.rtt.Types.toString(((java.lang.Object)(t$136470)));
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            sb.add(((java.lang.String)(t$136471)));
            
            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136472 = i$136474;
            
            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136473 = ((t$136472) + (((long)(1L))));
            
            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            i$136474 = t$136473;
        }
        
        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136419 = size;
        
        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final boolean t$136424 = ((sz) < (((long)(t$136419))));
        
        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if (t$136424) {
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136420 = size;
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136421 = ((t$136420) - (((long)(sz))));
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final java.lang.String t$136422 = (("...(omitted ") + ((x10.core.Long.$box(t$136421))));
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final java.lang.String t$136423 = ((t$136422) + (" elements)"));
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            sb.add(((java.lang.String)(t$136423)));
        }
        
        //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        sb.add(((java.lang.String)("]")));
        
        //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final java.lang.String t$136425 = sb.toString();
        
        //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        return t$136425;
    }
    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    final public x10.util.GrowableRail x10$util$GrowableRail$$this$x10$util$GrowableRail() {
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        return x10.util.GrowableRail.this;
    }
    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    final public void __fieldInitializers_x10_util_GrowableRail() {
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ((x10.util.GrowableRail<$T>)this).data = null;
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ((x10.util.GrowableRail<$T>)this).size = 0L;
    }
}

