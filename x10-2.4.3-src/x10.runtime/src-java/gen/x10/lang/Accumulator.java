package x10.lang;


@x10.runtime.impl.java.X10Generated
public class Accumulator<$T> extends x10.lang.Acc implements x10.io.CustomSerialization
{
    public static final x10.rtt.RuntimeType<Accumulator> $RTT = 
        x10.rtt.NamedType.<Accumulator> make("x10.lang.Accumulator",
                                             Accumulator.class,
                                             1,
                                             new x10.rtt.Type[] {
                                                 x10.io.CustomSerialization.$RTT,
                                                 x10.lang.Acc.$RTT
                                             });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    // custom serialization support
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Accumulator<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.Deserializer $ds = new x10.io.Deserializer($deserializer);
        $_obj.x10$lang$Accumulator$$init$S($ds);
        short $marker = $deserializer.readSerializationId();
        if ($marker != x10.serialization.SerializationConstants.CUSTOM_SERIALIZATION_END) { x10.serialization.X10JavaDeserializer.raiseSerializationProtocolError(); }
        return $_obj;
        
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        int $obj_id = $deserializer.record_reference(null); /* Get id eagerly so that ordering in object map is stable (needed for repeated reference mechanism) */
        x10.rtt.Type $T = (x10.rtt.Type) $deserializer.readObject();
        Accumulator $_obj = new Accumulator((java.lang.System[]) null, (x10.rtt.Type) $T);
        $deserializer.update_reference($obj_id, $_obj); /* Update entry in object map with the actual object before deserializing body */
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
    
        $serializer.write($T);
        serialize(new x10.io.Serializer($serializer)); 
        $serializer.writeSerializationId(x10.serialization.SerializationConstants.CUSTOM_SERIALIZATION_END);
        
    }
    
    // constructor just for allocation
    public Accumulator(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        super($dummy);
        x10.lang.Accumulator.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final Accumulator $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __0$1x10$lang$Accumulator$$T$2 {}
    

    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    public x10.core.GlobalRef<x10.lang.Acc> root;
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    public $T curr;
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    public x10.lang.Reducible<$T> red;
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    public static void MYPRINT(final java.lang.String msg) {
        
        //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$91571 = x10.core.Thread.currentThread();
        
        //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$91572 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$91571,x10.lang.Runtime.Worker.$RTT);
        
        //#line 750 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final int t$91573 = t$91572.workerId;
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final java.lang.String t$91574 = (("Worker=") + ((x10.core.Int.$box(t$91573))));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final java.lang.String t$91575 = ((t$91574) + (" "));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final java.lang.String t$91576 = ((t$91575) + (msg));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        java.lang.System.err.println(t$91576);
    }
    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    // creation method for java code (1-phase java constructor)
    public Accumulator(final x10.rtt.Type $T, final x10.lang.Reducible<$T> red, __0$1x10$lang$Accumulator$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$lang$Accumulator$$init$S(red, (x10.lang.Accumulator.__0$1x10$lang$Accumulator$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.lang.Accumulator<$T> x10$lang$Accumulator$$init$S(final x10.lang.Reducible<$T> red, __0$1x10$lang$Accumulator$$T$2 $dummy) {
         {
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            final x10.lang.Acc this$91557 = this;
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            final x10.lang.Accumulator this$91607 = this;
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            ((x10.lang.Accumulator<$T>)this).red = ((x10.lang.Reducible)(red));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            final x10.core.GlobalRef t$91577 = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.lang.Acc>(x10.lang.Acc.$RTT, ((x10.lang.Acc)(this)), (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            ((x10.lang.Accumulator<$T>)this).root = ((x10.core.GlobalRef)(t$91577));
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            final $T t$91578 = (($T)(((x10.lang.Reducible<$T>)red).zero$G()));
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            ((x10.lang.Accumulator<$T>)this).curr = (($T)(t$91578));
        }
        return this;
    }
    
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    // creation method for java code (1-phase java constructor)
    public Accumulator(final x10.rtt.Type $T, final x10.io.Deserializer ds) {
        this((java.lang.System[]) null, $T);
        x10$lang$Accumulator$$init$S(ds);
    }
    
    // constructor for non-virtual call
    final public x10.lang.Accumulator<$T> x10$lang$Accumulator$$init$S(final x10.io.Deserializer ds) {
        x10$lang$Accumulator$$initForReflection(ds);
        
        return this;
    }
    
    public void x10$lang$Accumulator$$initForReflection(x10.io.Deserializer ds) {
         {
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            final x10.lang.Acc this$91564 = this;
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            final x10.lang.Accumulator this$91608 = this;
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            final java.lang.Object t$91579 = ds.readAny();
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            final x10.lang.Reducible t$91580 = x10.rtt.Types.<x10.lang.Reducible<$T>> cast(t$91579,x10.rtt.ParameterizedType.make(x10.lang.Reducible.$RTT, $T));
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            ((x10.lang.Accumulator<$T>)this).red = ((x10.lang.Reducible)(t$91580));
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            final java.lang.Object t$91581 = ds.readAny();
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            final x10.core.GlobalRef t$91582 = ((x10.core.GlobalRef)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.lang.Acc.$RTT),t$91581));
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            ((x10.lang.Accumulator<$T>)this).root = ((x10.core.GlobalRef)(t$91582));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            final x10.lang.Reducible t$91583 = ((x10.lang.Reducible)(red));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            final $T t$91584 = (($T)(((x10.lang.Reducible<$T>)t$91583).zero$G()));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            ((x10.lang.Accumulator<$T>)this).curr = (($T)(t$91584));
        }
    }
    
    
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    public void serialize(final x10.io.Serializer s) {
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final x10.lang.Reducible t$91585 = ((x10.lang.Reducible)(red));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        s.writeAny(((java.lang.Object)(t$91585)));
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final x10.core.GlobalRef t$91586 = ((x10.core.GlobalRef)(root));
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        s.writeAny(((java.lang.Object)(t$91586)));
    }
    
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    public x10.lang.Accumulator me() {
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final x10.core.GlobalRef t$91587 = ((x10.core.GlobalRef)(root));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final x10.core.GlobalRef t$91588 = ((x10.core.GlobalRef)(((x10.core.GlobalRef)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.lang.Acc.$RTT),t$91587))));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final x10.lang.Acc t$91589 = (((x10.core.GlobalRef<x10.lang.Acc>)(t$91588))).$apply$G();
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final x10.lang.Accumulator t$91590 = x10.rtt.Types.<x10.lang.Accumulator<$T>> cast(t$91589,x10.rtt.ParameterizedType.make(x10.lang.Accumulator.$RTT, $T));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        return t$91590;
    }
    
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    public void $larrow__0x10$lang$Accumulator$$T(final $T t) {
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final x10.core.GlobalRef t$91591 = ((x10.core.GlobalRef)(root));
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final x10.lang.Place t$91595 = ((x10.lang.Place)((t$91591).home));
        {
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            x10.lang.Runtime.runAt(((x10.lang.Place)(t$91595)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.Accumulator.$Closure$63<$T>($T, ((x10.lang.Accumulator<$T>)(this)), t, (x10.lang.Accumulator.$Closure$63.__0$1x10$lang$Accumulator$$Closure$63$$T$2__1x10$lang$Accumulator$$Closure$63$$T) null))), ((x10.lang.Runtime.Profile)(null)));
        }
    }
    
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    public void $set__0x10$lang$Accumulator$$T(final $T t) {
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final x10.core.GlobalRef t$91596 = ((x10.core.GlobalRef)(root));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final x10.lang.Place t$91597 = ((x10.lang.Place)((t$91596).home));
        {
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            x10.lang.Runtime.runAt(((x10.lang.Place)(t$91597)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.Accumulator.$Closure$64<$T>($T, ((x10.lang.Accumulator<$T>)(this)), t, (x10.lang.Accumulator.$Closure$64.__0$1x10$lang$Accumulator$$Closure$64$$T$2__1x10$lang$Accumulator$$Closure$64$$T) null))), ((x10.lang.Runtime.Profile)(null)));
        }
    }
    
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    private $T localGetResult$G() {
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final $T t$91598 = (($T)(curr));
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        return t$91598;
    }
    
    public static <$T>$T localGetResult$P__0$1x10$lang$Accumulator$$T$2$G(final x10.rtt.Type $T, final x10.lang.Accumulator<$T> Accumulator) {
        return ((x10.lang.Accumulator<$T>)Accumulator).localGetResult$G();
    }
    
    
    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    public $T $apply$G() {
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final x10.core.GlobalRef t$91464 = ((x10.core.GlobalRef)(root));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final x10.lang.Place t$91467 = ((x10.lang.Place)((t$91464).home));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final $T t$91468 = (($T)(x10.lang.Runtime.<$T> evalAt__1$1x10$lang$Runtime$$T$2$G($T, ((x10.lang.Place)(t$91467)), ((x10.core.fun.Fun_0_0)(new x10.lang.Accumulator.$Closure$65<$T>($T, ((x10.lang.Accumulator<$T>)(this)), (x10.lang.Accumulator.$Closure$65.__0$1x10$lang$Accumulator$$Closure$65$$T$2) null))), ((x10.lang.Runtime.Profile)(null)))));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        return t$91468;
    }
    
    
    //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    public void supply(final java.lang.Object t) {
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final $T t$91599 = (($T)(x10.rtt.Types.<$T> cast(t,$T)));
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        this.$larrow__0x10$lang$Accumulator$$T((($T)(t$91599)));
    }
    
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    public void reset(final java.lang.Object t) {
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final $T t$91600 = (($T)(x10.rtt.Types.<$T> cast(t,$T)));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        this.$set__0x10$lang$Accumulator$$T((($T)(t$91600)));
    }
    
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    public java.lang.Object result() {
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final $T t$91601 = (($T)(this.$apply$G()));
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        return ((java.lang.Object)
                 t$91601);
    }
    
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    public java.lang.Object calcResult() {
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final x10.lang.IllegalOperationException t$91602 = ((x10.lang.IllegalOperationException)(new x10.lang.IllegalOperationException()));
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        throw t$91602;
    }
    
    
    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    public void acceptResult(final java.lang.Object a) {
        
        //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final x10.lang.IllegalOperationException t$91603 = ((x10.lang.IllegalOperationException)(new x10.lang.IllegalOperationException()));
        
        //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        throw t$91603;
    }
    
    
    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    public x10.core.GlobalRef getRoot() {
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final x10.core.GlobalRef t$91604 = ((x10.core.GlobalRef)(root));
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        return t$91604;
    }
    
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    public x10.lang.Place home() {
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final x10.core.GlobalRef t$91605 = ((x10.core.GlobalRef)(root));
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        final x10.lang.Place t$91606 = ((x10.lang.Place)((t$91605).home));
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        return t$91606;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    final public x10.lang.Accumulator x10$lang$Accumulator$$this$x10$lang$Accumulator() {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        return x10.lang.Accumulator.this;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    final public void __fieldInitializers_x10_lang_Accumulator() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$63<$T> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$63> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$63> make($Closure$63.class,
                                                         1,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Accumulator.$Closure$63<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.t = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Accumulator.$Closure$63 $_obj = new x10.lang.Accumulator.$Closure$63((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.out$$);
            $serializer.write(this.t);
            
        }
        
        // constructor just for allocation
        public $Closure$63(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.Accumulator.$Closure$63.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$63 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Accumulator$$Closure$63$$T$2__1x10$lang$Accumulator$$Closure$63$$T {}
        
    
        
        public void $apply() {
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            try {{
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                final x10.lang.Accumulator me = ((x10.lang.Accumulator<$T>)
                                                  ((x10.lang.Accumulator<$T>)this.out$$).me());
                
                //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                try {{
                    
                    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                    x10.lang.Runtime.enterAtomic();
                    {
                        
                        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                        final x10.lang.Reducible t$91592 = ((x10.lang.Reducible)(((x10.lang.Accumulator<$T>)me).red));
                        
                        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                        final $T t$91593 = (($T)(((x10.lang.Accumulator<$T>)me).curr));
                        
                        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                        final $T t$91594 = (($T)((($T)
                                                   ((x10.lang.Reducible<$T>)t$91592).$apply((($T)(t$91593)), $T, (($T)(this.t)), $T))));
                        
                        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                        ((x10.lang.Accumulator<$T>)me).curr = (($T)(t$91594));
                    }
                }}finally {{
                      
                      //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                      x10.lang.Runtime.exitAtomic();
                  }}
                }}catch (java.lang.Throwable __lowerer__var__0__) {
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                    int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
                }
            }
        
        public x10.lang.Accumulator<$T> out$$;
        public $T t;
        
        public $Closure$63(final x10.rtt.Type $T, final x10.lang.Accumulator<$T> out$$, final $T t, __0$1x10$lang$Accumulator$$Closure$63$$T$2__1x10$lang$Accumulator$$Closure$63$$T $dummy) {
            x10.lang.Accumulator.$Closure$63.$initParams(this, $T);
             {
                ((x10.lang.Accumulator.$Closure$63<$T>)this).out$$ = out$$;
                ((x10.lang.Accumulator.$Closure$63<$T>)this).t = (($T)(t));
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$64<$T> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$64> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$64> make($Closure$64.class,
                                                         1,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Accumulator.$Closure$64<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.t = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Accumulator.$Closure$64 $_obj = new x10.lang.Accumulator.$Closure$64((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.out$$);
            $serializer.write(this.t);
            
        }
        
        // constructor just for allocation
        public $Closure$64(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.Accumulator.$Closure$64.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$64 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Accumulator$$Closure$64$$T$2__1x10$lang$Accumulator$$Closure$64$$T {}
        
    
        
        public void $apply() {
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            try {{
                
                //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                final x10.lang.Accumulator me = ((x10.lang.Accumulator<$T>)
                                                  ((x10.lang.Accumulator<$T>)this.out$$).me());
                
                //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                try {{
                    
                    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                    x10.lang.Runtime.enterAtomic();
                    {
                        
                        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                        ((x10.lang.Accumulator<$T>)me).curr = (($T)(this.t));
                    }
                }}finally {{
                      
                      //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                      x10.lang.Runtime.exitAtomic();
                  }}
                }}catch (java.lang.Throwable __lowerer__var__0__) {
                    
                    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                    int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
                }
            }
        
        public x10.lang.Accumulator<$T> out$$;
        public $T t;
        
        public $Closure$64(final x10.rtt.Type $T, final x10.lang.Accumulator<$T> out$$, final $T t, __0$1x10$lang$Accumulator$$Closure$64$$T$2__1x10$lang$Accumulator$$Closure$64$$T $dummy) {
            x10.lang.Accumulator.$Closure$64.$initParams(this, $T);
             {
                ((x10.lang.Accumulator.$Closure$64<$T>)this).out$$ = out$$;
                ((x10.lang.Accumulator.$Closure$64<$T>)this).t = (($T)(t));
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$65<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$65> $RTT = 
            x10.rtt.StaticFunType.<$Closure$65> make($Closure$65.class,
                                                     1,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Accumulator.$Closure$65<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Accumulator.$Closure$65 $_obj = new x10.lang.Accumulator.$Closure$65((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.out$$);
            
        }
        
        // constructor just for allocation
        public $Closure$65(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.Accumulator.$Closure$65.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$65 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Accumulator$$Closure$65$$T$2 {}
        
    
        
        public $T $apply$G() {
            
            //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            try {{
                
                //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                final x10.lang.Accumulator t$91465 = ((x10.lang.Accumulator<$T>)
                                                       ((x10.lang.Accumulator<$T>)this.out$$).me());
                
                //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                final $T t$91466 = (($T)(((x10.lang.Accumulator<$T>)t$91465).curr));
                
                //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                return t$91466;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                $T __lowerer__var__1__ = (($T)(x10.lang.Runtime.<$T> wrapAtChecked$G($T, ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                return __lowerer__var__1__;
            }
        }
        
        public x10.lang.Accumulator<$T> out$$;
        
        public $Closure$65(final x10.rtt.Type $T, final x10.lang.Accumulator<$T> out$$, __0$1x10$lang$Accumulator$$Closure$65$$T$2 $dummy) {
            x10.lang.Accumulator.$Closure$65.$initParams(this, $T);
             {
                ((x10.lang.Accumulator.$Closure$65<$T>)this).out$$ = out$$;
            }
        }
        
    }
    
    }
    
    