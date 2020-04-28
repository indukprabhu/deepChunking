package x10.glb;


@x10.runtime.impl.java.X10Generated
public class Context<$Queue, $R> extends x10.core.Ref implements x10.glb.ContextI, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Context> $RTT = 
        x10.rtt.NamedType.<Context> make("x10.glb.Context",
                                         Context.class,
                                         2,
                                         new x10.rtt.Type[] {
                                             x10.glb.ContextI.$RTT
                                         });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
    
    public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Context<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
        $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
        $_obj.st = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.glb.Context $_obj = new x10.glb.Context((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$Queue);
        $serializer.write(this.$R);
        $serializer.write(this.st);
        
    }
    
    // constructor just for allocation
    public Context(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
        x10.glb.Context.$initParams(this, $Queue, $R);
        
    }
    
    private x10.rtt.Type $Queue;
    private x10.rtt.Type $R;
    
    // initializer of type parameters
    public static void $initParams(final Context $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
        $this.$Queue = $Queue;
        $this.$R = $R;
        
    }
    // synthetic type for parameter mangling
    public static final class __0$1x10$glb$Worker$1x10$glb$Context$$Queue$3x10$glb$Context$$R$2$2 {}
    

    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
    /**
	 * PlaceLocalHandle of {@link Worker}
	 */
    public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
    // creation method for java code (1-phase java constructor)
    public Context(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, __0$1x10$glb$Worker$1x10$glb$Context$$Queue$3x10$glb$Context$$R$2$2 $dummy) {
        this((java.lang.System[]) null, $Queue, $R);
        x10$glb$Context$$init$S(st, (x10.glb.Context.__0$1x10$glb$Worker$1x10$glb$Context$$Queue$3x10$glb$Context$$R$2$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.glb.Context<$Queue, $R> x10$glb$Context$$init$S(final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, __0$1x10$glb$Worker$1x10$glb$Context$$Queue$3x10$glb$Context$$R$2$2 $dummy) {
         {
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
            
            
            //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
            final x10.glb.Context this$81841 = this;
            
            //#line 14 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
            final x10.lang.PlaceLocalHandle t$81840 = (x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>) x10.rtt.Types.zeroValue(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, x10.rtt.ParameterizedType.make(x10.glb.Worker.$RTT, $Queue, $R)));
            
            //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
            ((x10.glb.Context<$Queue, $R>)this$81841).st = t$81840;
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
            ((x10.glb.Context<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
        }
        return this;
    }
    
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
    public void yield() {
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
        final x10.lang.PlaceLocalHandle t$81785 = ((x10.lang.PlaceLocalHandle)(this.st));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
        final x10.glb.Worker this$81727 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)t$81785).$apply$G();
        
        //#line 439 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final x10.core.fun.VoidFun_0_1 t$81837 = ((x10.core.fun.VoidFun_0_1)(new x10.glb.Context.$Closure$23<$Queue, $R>($Queue, $R, this$81727, (x10.glb.Context.$Closure$23.__0$1x10$glb$Context$$Closure$23$$Queue$3x10$glb$Context$$Closure$23$$R$2) null)));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
        final x10.lang.PlaceLocalHandle t$81838 = ((x10.lang.PlaceLocalHandle)(this.st));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
        ((x10.core.fun.VoidFun_0_1<x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>>)t$81837).$apply(t$81838, x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, x10.rtt.ParameterizedType.make(x10.glb.Worker.$RTT, $Queue, $R)));
    }
    
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
    public void yielding() {
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
        this.yield();
    }
    
    
    //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
    final public x10.glb.Context x10$glb$Context$$this$x10$glb$Context() {
        
        //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
        return x10.glb.Context.this;
    }
    
    
    //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
    final public void __fieldInitializers_x10_glb_Context() {
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
        final x10.lang.PlaceLocalHandle t$81839 = (x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>) x10.rtt.Types.zeroValue(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, x10.rtt.ParameterizedType.make(x10.glb.Worker.$RTT, $Queue, $R)));
        
        //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
        ((x10.glb.Context<$Queue, $R>)this).st = t$81839;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$18<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$18> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$18> make($Closure$18.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Context.$Closure$18<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$81882 = $deserializer.readObject();
            $_obj.loot$81883 = $deserializer.readObject();
            $_obj.victim$81844 = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Context.$Closure$18 $_obj = new x10.glb.Context.$Closure$18((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$81882);
            $serializer.write(this.loot$81883);
            $serializer.write(this.victim$81844);
            
        }
        
        // constructor just for allocation
        public $Closure$18(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Context.$Closure$18.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$18 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Context$$Closure$18$$Queue$3x10$glb$Context$$Closure$18$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 155 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$81863 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$81882).$apply$G();
            
            //#line 155 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$81863).deal__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st$81882)), ((x10.glb.TaskBag)(this.loot$81883)), (long)(this.victim$81844));
            
            //#line 155 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$81864 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$81882).$apply$G();
            
            //#line 155 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$81864).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$81882;
        public x10.glb.TaskBag loot$81883;
        public long victim$81844;
        
        public $Closure$18(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$81882, final x10.glb.TaskBag loot$81883, final long victim$81844, __0$1x10$glb$Worker$1x10$glb$Context$$Closure$18$$Queue$3x10$glb$Context$$Closure$18$$R$2$2 $dummy) {
            x10.glb.Context.$Closure$18.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Context.$Closure$18<$Queue, $R>)this).st$81882 = ((x10.lang.PlaceLocalHandle)(st$81882));
                ((x10.glb.Context.$Closure$18<$Queue, $R>)this).loot$81883 = ((x10.glb.TaskBag)(loot$81883));
                ((x10.glb.Context.$Closure$18<$Queue, $R>)this).victim$81844 = victim$81844;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$19<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$19> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$19> make($Closure$19.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Context.$Closure$19<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$81882 = $deserializer.readObject();
            $_obj.loot$81883 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Context.$Closure$19 $_obj = new x10.glb.Context.$Closure$19((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$81882);
            $serializer.write(this.loot$81883);
            
        }
        
        // constructor just for allocation
        public $Closure$19(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Context.$Closure$19.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$19 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Context$$Closure$19$$Queue$3x10$glb$Context$$Closure$19$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 158 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$81869 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$81882).$apply$G();
            
            //#line 158 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$81869).deal__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st$81882)), ((x10.glb.TaskBag)(this.loot$81883)), (long)(-1L));
            
            //#line 158 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$81870 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$81882).$apply$G();
            
            //#line 158 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$81870).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$81882;
        public x10.glb.TaskBag loot$81883;
        
        public $Closure$19(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$81882, final x10.glb.TaskBag loot$81883, __0$1x10$glb$Worker$1x10$glb$Context$$Closure$19$$Queue$3x10$glb$Context$$Closure$19$$R$2$2 $dummy) {
            x10.glb.Context.$Closure$19.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Context.$Closure$19<$Queue, $R>)this).st$81882 = ((x10.lang.PlaceLocalHandle)(st$81882));
                ((x10.glb.Context.$Closure$19<$Queue, $R>)this).loot$81883 = ((x10.glb.TaskBag)(loot$81883));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$20<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$20> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$20> make($Closure$20.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Context.$Closure$20<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$81882 = $deserializer.readObject();
            $_obj.loot$81883 = $deserializer.readObject();
            $_obj.victim$81844 = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Context.$Closure$20 $_obj = new x10.glb.Context.$Closure$20((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$81882);
            $serializer.write(this.loot$81883);
            $serializer.write(this.victim$81844);
            
        }
        
        // constructor just for allocation
        public $Closure$20(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Context.$Closure$20.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$20 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Context$$Closure$20$$Queue$3x10$glb$Context$$Closure$20$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 163 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            try {{
                
                //#line 163 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Worker t$81881 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$81882).$apply$G();
                
                //#line 163 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ((x10.glb.Worker<$Queue, $R>)t$81881).deal__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st$81882)), ((x10.glb.TaskBag)(this.loot$81883)), (long)(this.victim$81844));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 163 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 163 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$81882;
        public x10.glb.TaskBag loot$81883;
        public long victim$81844;
        
        public $Closure$20(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$81882, final x10.glb.TaskBag loot$81883, final long victim$81844, __0$1x10$glb$Worker$1x10$glb$Context$$Closure$20$$Queue$3x10$glb$Context$$Closure$20$$R$2$2 $dummy) {
            x10.glb.Context.$Closure$20.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Context.$Closure$20<$Queue, $R>)this).st$81882 = ((x10.lang.PlaceLocalHandle)(st$81882));
                ((x10.glb.Context.$Closure$20<$Queue, $R>)this).loot$81883 = ((x10.glb.TaskBag)(loot$81883));
                ((x10.glb.Context.$Closure$20<$Queue, $R>)this).victim$81844 = victim$81844;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$21<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$21> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$21> make($Closure$21.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Context.$Closure$21<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$81772 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Context.$Closure$21 $_obj = new x10.glb.Context.$Closure$21((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$81772);
            
        }
        
        // constructor just for allocation
        public $Closure$21(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Context.$Closure$21.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$21 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Context$$Closure$21$$Queue$3x10$glb$Context$$Closure$21$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 189 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$81901 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$81772).$apply$G();
            
            //#line 189 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$81901).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$81772;
        
        public $Closure$21(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$81772, __0$1x10$glb$Worker$1x10$glb$Context$$Closure$21$$Queue$3x10$glb$Context$$Closure$21$$R$2$2 $dummy) {
            x10.glb.Context.$Closure$21.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Context.$Closure$21<$Queue, $R>)this).st$81772 = ((x10.lang.PlaceLocalHandle)(st$81772));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$22<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$22> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$22> make($Closure$22.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Context.$Closure$22<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$81772 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Context.$Closure$22 $_obj = new x10.glb.Context.$Closure$22((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$81772);
            
        }
        
        // constructor just for allocation
        public $Closure$22(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Context.$Closure$22.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$22 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Context$$Closure$22$$Queue$3x10$glb$Context$$Closure$22$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 191 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$81903 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$81772).$apply$G();
            
            //#line 191 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$81903).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$81772;
        
        public $Closure$22(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$81772, __0$1x10$glb$Worker$1x10$glb$Context$$Closure$22$$Queue$3x10$glb$Context$$Closure$22$$R$2$2 $dummy) {
            x10.glb.Context.$Closure$22.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Context.$Closure$22<$Queue, $R>)this).st$81772 = ((x10.lang.PlaceLocalHandle)(st$81772));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$23<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$23> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$23> make($Closure$23.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.rtt.ParameterizedType.make(x10.core.fun.VoidFun_0_1.$RTT, x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, x10.rtt.ParameterizedType.make(x10.glb.Worker.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(1))))
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Context.$Closure$23<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.this$81727 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Context.$Closure$23 $_obj = new x10.glb.Context.$Closure$23((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.this$81727);
            
        }
        
        // constructor just for allocation
        public $Closure$23(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Context.$Closure$23.$initParams(this, $Queue, $R);
            
        }
        
        // dispatcher for method abstract public (Z1)=>void.operator()(a1:Z1):void
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            $apply__0$1x10$glb$Worker$1x10$glb$Context$$Closure$23$$Queue$3x10$glb$Context$$Closure$23$$R$2$2((x10.lang.PlaceLocalHandle)a1); return null;
            
        }
        
        // dispatcher for method abstract public (Z1)=>void.operator()(a1:Z1):void
        public void $apply$V(final java.lang.Object a1, final x10.rtt.Type t1) {
            $apply__0$1x10$glb$Worker$1x10$glb$Context$$Closure$23$$Queue$3x10$glb$Context$$Closure$23$$R$2$2((x10.lang.PlaceLocalHandle)a1);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$23 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Context$$Closure$23$$Queue$3x10$glb$Context$$Closure$23$$R$2 {}
        
    
        
        public void $apply__0$1x10$glb$Worker$1x10$glb$Context$$Closure$23$$Queue$3x10$glb$Context$$Closure$23$$R$2$2(final x10.lang.PlaceLocalHandle st$81726) {
            
            //#line 439 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10.lang.Runtime.probe();
            
            //#line 172 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.lang.PlaceLocalHandle st$81728 = ((x10.lang.PlaceLocalHandle)(st$81726));
            
            //#line 173 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10.glb.TaskBag loot$81904 =  null;
            
            //#line 174 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            while (true) {
                
                //#line 174 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.FixedSizeStack this$81905 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this.this$81727).thieves));
                
                //#line 44 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$81906 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$81905).size;
                
                //#line 174 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                boolean t$81907 = ((t$81906) > (((long)(0L))));
                
                //#line 174 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (!(t$81907)) {
                    
                    //#line 174 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$81908 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this.this$81727).lifelineThieves));
                    
                    //#line 44 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$81909 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$81908).size;
                    
                    //#line 174 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    t$81907 = ((t$81909) > (((long)(0L))));
                }
                
                //#line 174 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                boolean t$81910 = t$81907;
                
                //#line 174 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (t$81910) {
                    
                    //#line 174 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final $Queue t$81911 = (($Queue)(((x10.glb.Worker<$Queue, $R>)this.this$81727).queue));
                    
                    //#line 174 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.TaskBag t$81912 = ((x10.glb.TaskQueue<$Queue, $R>)x10.rtt.Types.conversion(x10.rtt.ParameterizedType.make(x10.glb.TaskQueue.$RTT, $Queue, $R),t$81911)).split();
                    
                    //#line 174 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.TaskBag t$81913 = loot$81904 = ((x10.glb.TaskBag)(t$81912));
                    
                    //#line 174 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    t$81910 = ((t$81913) != (null));
                }
                
                //#line 174 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean t$81914 = t$81910;
                
                //#line 174 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (!(t$81914)) {
                    
                    //#line 174 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    break;
                }
                
                //#line 148 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.lang.PlaceLocalHandle st$81882 = ((x10.lang.PlaceLocalHandle)(st$81728));
                
                //#line 148 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.TaskBag loot$81883 = ((x10.glb.TaskBag)(loot$81904));
                
                //#line 149 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long victim$81844 = ((long)x10.x10rt.X10RT.here());
                
                //#line 150 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Logger obj$81845 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this.this$81727).logger));
                
                //#line 150 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$81846 = obj$81845.nodesGiven;
                
                //#line 150 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$81847 = loot$81883.size$O();
                
                //#line 150 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$81848 = ((t$81846) + (((long)(t$81847))));
                
                //#line 150 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                obj$81845.nodesGiven = t$81848;
                
                //#line 151 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.FixedSizeStack this$81849 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this.this$81727).thieves));
                
                //#line 44 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$81850 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$81849).size;
                
                //#line 151 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean t$81851 = ((t$81850) > (((long)(0L))));
                
                //#line 151 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (t$81851) {
                    
                    //#line 152 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$81852 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this.this$81727).thieves));
                    
                    //#line 33 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final x10.core.Rail t$81853 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$81852).data));
                    
                    //#line 33 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$81854 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$81852).size;
                    
                    //#line 33 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$81855 = ((t$81854) - (((long)(1L))));
                    
                    //#line 33 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$81856 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$81852).size = t$81855;
                    
                    //#line 152 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long thief$81857 = ((long[])t$81853.value)[(int)t$81856];
                    
                    //#line 153 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final boolean t$81858 = ((thief$81857) >= (((long)(0L))));
                    
                    //#line 153 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    if (t$81858) {
                        
                        //#line 154 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.glb.Logger obj$81859 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this.this$81727).logger));
                        
                        //#line 154 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$81860 = obj$81859.lifelineStealsSuffered;
                        
                        //#line 154 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$81861 = ((t$81860) + (((long)(1L))));
                        
                        //#line 154 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        obj$81859.lifelineStealsSuffered = t$81861;
                        
                        //#line 155 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.lang.Place alloc$81862 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                        
                        //#line 155 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        alloc$81862.x10$lang$Place$$init$S(((long)(thief$81857)));
                        
                        //#line 155 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$81862)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Context.$Closure$18<$Queue, $R>($Queue, $R, st$81882, loot$81883, victim$81844, (x10.glb.Context.$Closure$18.__0$1x10$glb$Worker$1x10$glb$Context$$Closure$18$$Queue$3x10$glb$Context$$Closure$18$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                    } else {
                        
                        //#line 157 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.glb.Logger obj$81865 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this.this$81727).logger));
                        
                        //#line 157 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$81866 = obj$81865.stealsSuffered;
                        
                        //#line 157 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$81867 = ((t$81866) + (((long)(1L))));
                        
                        //#line 157 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        obj$81865.stealsSuffered = t$81867;
                        
                        //#line 158 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.lang.Place alloc$81868 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                        
                        //#line 158 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$81842 = (-(thief$81857));
                        
                        //#line 158 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$81843 = ((t$81842) - (((long)(1L))));
                        
                        //#line 158 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        alloc$81868.x10$lang$Place$$init$S(t$81843);
                        
                        //#line 158 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$81868)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Context.$Closure$19<$Queue, $R>($Queue, $R, st$81882, loot$81883, (x10.glb.Context.$Closure$19.__0$1x10$glb$Worker$1x10$glb$Context$$Closure$19$$Queue$3x10$glb$Context$$Closure$19$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                    }
                } else {
                    
                    //#line 161 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.Logger obj$81871 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this.this$81727).logger));
                    
                    //#line 161 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$81872 = obj$81871.lifelineStealsSuffered;
                    
                    //#line 161 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$81873 = ((t$81872) + (((long)(1L))));
                    
                    //#line 161 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    obj$81871.lifelineStealsSuffered = t$81873;
                    
                    //#line 162 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$81874 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this.this$81727).lifelineThieves));
                    
                    //#line 33 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final x10.core.Rail t$81875 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$81874).data));
                    
                    //#line 33 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$81876 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$81874).size;
                    
                    //#line 33 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$81877 = ((t$81876) - (((long)(1L))));
                    
                    //#line 33 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$81878 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$81874).size = t$81877;
                    
                    //#line 162 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long thief$81879 = ((long[])t$81875.value)[(int)t$81878];
                    
                    //#line 163 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.lang.Place alloc$81880 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                    
                    //#line 163 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    alloc$81880.x10$lang$Place$$init$S(((long)(thief$81879)));
                    
                    //#line 163 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    x10.lang.Runtime.runAsync(((x10.lang.Place)(alloc$81880)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Context.$Closure$20<$Queue, $R>($Queue, $R, st$81882, loot$81883, victim$81844, (x10.glb.Context.$Closure$20.__0$1x10$glb$Worker$1x10$glb$Context$$Closure$20$$Queue$3x10$glb$Context$$Closure$20$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                }
            }
            
            //#line 184 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.lang.PlaceLocalHandle st$81772 = ((x10.lang.PlaceLocalHandle)(st$81726));
            
            //#line 185 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            while (true) {
                
                //#line 185 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.FixedSizeStack this$81915 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this.this$81727).thieves));
                
                //#line 44 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$81916 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$81915).size;
                
                //#line 185 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean t$81917 = ((t$81916) > (((long)(0L))));
                
                //#line 185 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (!(t$81917)) {
                    
                    //#line 185 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    break;
                }
                
                //#line 186 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.FixedSizeStack this$81891 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this.this$81727).thieves));
                
                //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final x10.core.Rail t$81892 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$81891).data));
                
                //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$81893 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$81891).size;
                
                //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$81894 = ((t$81893) - (((long)(1L))));
                
                //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$81895 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$81891).size = t$81894;
                
                //#line 186 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long thief$81896 = ((long[])t$81892.value)[(int)t$81895];
                
                //#line 187 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean t$81897 = ((thief$81896) >= (((long)(0L))));
                
                //#line 187 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (t$81897) {
                    
                    //#line 188 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$81898 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this.this$81727).lifelineThieves));
                    
                    //#line 38 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$81899 = thief$81896;
                    
                    //#line 38 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final x10.core.Rail t$81884 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$81898).data));
                    
                    //#line 38 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$81885 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$81898).size;
                    
                    //#line 38 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$81886 = ((t$81885) + (((long)(1L))));
                    
                    //#line 38 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$81887 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$81898).size = t$81886;
                    
                    //#line 38 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$81888 = ((t$81887) - (((long)(1L))));
                    
                    //#line 38 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    ((long[])t$81884.value)[(int)t$81888] = t$81899;
                    
                    //#line 189 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.lang.Place alloc$81900 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                    
                    //#line 189 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    alloc$81900.x10$lang$Place$$init$S(((long)(thief$81896)));
                    
                    //#line 189 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$81900)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Context.$Closure$21<$Queue, $R>($Queue, $R, st$81772, (x10.glb.Context.$Closure$21.__0$1x10$glb$Worker$1x10$glb$Context$$Closure$21$$Queue$3x10$glb$Context$$Closure$21$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                } else {
                    
                    //#line 191 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.lang.Place alloc$81902 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                    
                    //#line 191 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$81889 = (-(thief$81896));
                    
                    //#line 191 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$81890 = ((t$81889) - (((long)(1L))));
                    
                    //#line 191 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    alloc$81902.x10$lang$Place$$init$S(t$81890);
                    
                    //#line 191 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$81902)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Context.$Closure$22<$Queue, $R>($Queue, $R, st$81772, (x10.glb.Context.$Closure$22.__0$1x10$glb$Worker$1x10$glb$Context$$Closure$22$$Queue$3x10$glb$Context$$Closure$22$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                }
            }
        }
        
        public x10.glb.Worker<$Queue, $R> this$81727;
        
        public $Closure$23(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.glb.Worker<$Queue, $R> this$81727, __0$1x10$glb$Context$$Closure$23$$Queue$3x10$glb$Context$$Closure$23$$R$2 $dummy) {
            x10.glb.Context.$Closure$23.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Context.$Closure$23<$Queue, $R>)this).this$81727 = this$81727;
            }
        }
        
    }
    
}

