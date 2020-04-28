package x10.util;

@x10.runtime.impl.java.X10Generated
public class WorkerLocalHandle<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.core.fun.VoidFun_0_1, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<WorkerLocalHandle> $RTT = 
        x10.rtt.NamedType.<WorkerLocalHandle> make("x10.util.WorkerLocalHandle",
                                                   WorkerLocalHandle.class,
                                                   1,
                                                   new x10.rtt.Type[] {
                                                       x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.UnresolvedType.PARAM(0)),
                                                       x10.rtt.ParameterizedType.make(x10.core.fun.VoidFun_0_1.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                                   });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.WorkerLocalHandle<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.state = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.WorkerLocalHandle $_obj = new x10.util.WorkerLocalHandle((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.state);
        
    }
    
    // constructor just for allocation
    public WorkerLocalHandle(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.util.WorkerLocalHandle.$initParams(this, $T);
        
    }
    
    // dispatcher for method abstract public (Z1)=>void.operator()(a1:Z1){}:void
    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
        $apply__0x10$util$WorkerLocalHandle$$T(($T)a1); return null;
        
    }
    
    // dispatcher for method abstract public (Z1)=>void.operator()(a1:Z1){}:void
    public void $apply$V(final java.lang.Object a1, final x10.rtt.Type t1) {
        $apply__0x10$util$WorkerLocalHandle$$T(($T)a1);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final WorkerLocalHandle $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __0$1x10$util$WorkerLocalHandle$$T$2 {}
    

    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    @x10.runtime.impl.java.X10Generated
    public static class State<$U> extends x10.core.Ref implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<State> $RTT = 
            x10.rtt.NamedType.<State> make("x10.util.WorkerLocalHandle.State",
                                           State.class,
                                           1);
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $U; return null; }
        
        public static <$U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.WorkerLocalHandle.State<$U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            $_obj.store = $deserializer.readObject();
            $_obj.init = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.WorkerLocalHandle.State $_obj = new x10.util.WorkerLocalHandle.State((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$U);
            $serializer.write(this.store);
            $serializer.write(this.init);
            
        }
        
        // constructor just for allocation
        public State(final java.lang.System[] $dummy, final x10.rtt.Type $U) {
            x10.util.WorkerLocalHandle.State.$initParams(this, $U);
            
        }
        
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final State $this, final x10.rtt.Type $U) {
            $this.$U = $U;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$util$WorkerLocalHandle$State$$U$2 {}
        
    
        
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        // creation method for java code (1-phase java constructor)
        public State(final x10.rtt.Type $U, final x10.core.fun.Fun_0_0<$U> init, __0$1x10$util$WorkerLocalHandle$State$$U$2 $dummy) {
            this((java.lang.System[]) null, $U);
            x10$util$WorkerLocalHandle$State$$init$S(init, (x10.util.WorkerLocalHandle.State.__0$1x10$util$WorkerLocalHandle$State$$U$2) null);
        }
        
        // constructor for non-virtual call
        final public x10.util.WorkerLocalHandle.State<$U> x10$util$WorkerLocalHandle$State$$init$S(final x10.core.fun.Fun_0_0<$U> init, __0$1x10$util$WorkerLocalHandle$State$$U$2 $dummy) {
             {
                
                //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                
                
                //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                final x10.util.WorkerLocalHandle.State this$145204 = this;
                
                //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                ((x10.util.WorkerLocalHandle.State<$U>)this$145204).init = null;
                
                //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                final int t$145142 = x10.lang.Runtime.get$MAX_THREADS();
                
                //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                final long t$145143 = ((long)(((int)(t$145142))));
                
                //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                final x10.core.Rail t$145144 = ((x10.core.Rail)(new x10.core.Rail<$U>($U, t$145143)));
                
                //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                ((x10.util.WorkerLocalHandle.State<$U>)this).store = ((x10.core.Rail)(t$145144));
                
                //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                ((x10.util.WorkerLocalHandle.State<$U>)this).init = ((x10.core.fun.Fun_0_0)(init));
            }
            return this;
        }
        
        
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        public x10.core.Rail<$U> store;
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        public x10.core.fun.Fun_0_0<$U> init;
        
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final public x10.util.WorkerLocalHandle.State x10$util$WorkerLocalHandle$State$$this$x10$util$WorkerLocalHandle$State() {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            return x10.util.WorkerLocalHandle.State.this;
        }
        
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final public void __fieldInitializers_x10_util_WorkerLocalHandle_State() {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            ((x10.util.WorkerLocalHandle.State<$U>)this).init = null;
        }
    }
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    public x10.lang.PlaceLocalHandle<x10.util.WorkerLocalHandle.State<$T>> state;
    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    // creation method for java code (1-phase java constructor)
    public WorkerLocalHandle(final x10.rtt.Type $T) {
        this((java.lang.System[]) null, $T);
        x10$util$WorkerLocalHandle$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.util.WorkerLocalHandle<$T> x10$util$WorkerLocalHandle$$init$S() {
         {
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            /*this.*/x10$util$WorkerLocalHandle$$init$S(((x10.core.fun.Fun_0_0)(null)), (x10.util.WorkerLocalHandle.__0$1x10$util$WorkerLocalHandle$$T$2) null);
        }
        return this;
    }
    
    
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    // creation method for java code (1-phase java constructor)
    public WorkerLocalHandle(final x10.rtt.Type $T, final x10.core.fun.Fun_0_0<$T> init, __0$1x10$util$WorkerLocalHandle$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$util$WorkerLocalHandle$$init$S(init, (x10.util.WorkerLocalHandle.__0$1x10$util$WorkerLocalHandle$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.util.WorkerLocalHandle<$T> x10$util$WorkerLocalHandle$$init$S(final x10.core.fun.Fun_0_0<$T> init, __0$1x10$util$WorkerLocalHandle$$T$2 $dummy) {
         {
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final x10.util.WorkerLocalHandle this$145205 = this;
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final x10.lang.PlaceGroup.SimplePlaceGroup t$145145 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final x10.core.fun.Fun_0_0 t$145146 = ((x10.core.fun.Fun_0_0)(new x10.util.WorkerLocalHandle.$Closure$326<$T>($T, init, (x10.util.WorkerLocalHandle.$Closure$326.__0$1x10$util$WorkerLocalHandle$$Closure$326$$T$2) null)));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final x10.lang.PlaceLocalHandle state = x10.lang.PlaceLocalHandle.<x10.util.WorkerLocalHandle.State<$T>> make__1$1x10$lang$PlaceLocalHandle$$T$2(x10.rtt.ParameterizedType.make(x10.util.WorkerLocalHandle.State.$RTT, $T), ((x10.lang.PlaceGroup)(t$145145)), ((x10.core.fun.Fun_0_0)(t$145146)));
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            ((x10.util.WorkerLocalHandle<$T>)this).state = ((x10.lang.PlaceLocalHandle)(state));
        }
        return this;
    }
    
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    public $T $apply$G() {
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.lang.PlaceLocalHandle t$145147 = ((x10.lang.PlaceLocalHandle)(state));
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.util.WorkerLocalHandle.State localState = ((x10.lang.PlaceLocalHandle<x10.util.WorkerLocalHandle.State<$T>>)t$145147).$apply$G();
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.core.Rail t$145151 = ((x10.core.Rail)(((x10.util.WorkerLocalHandle.State<$T>)localState).store));
        
        //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$145148 = x10.core.Thread.currentThread();
        
        //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$145149 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$145148,x10.lang.Runtime.Worker.$RTT);
        
        //#line 750 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final int t$145150 = t$145149.workerId;
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final long t$145152 = ((long)(((int)(t$145150))));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        $T t = (($T)(((x10.core.Rail<$T>)t$145151).$apply$G((long)(t$145152))));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final $T t$145153 = (($T)(t));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final boolean t$145162 = ((t$145153) == (null));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        if (t$145162) {
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final x10.core.fun.Fun_0_0 t$145154 = ((x10.core.fun.Fun_0_0)(((x10.util.WorkerLocalHandle.State<$T>)localState).init));
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final $T t$145155 = (($T)(((x10.core.fun.Fun_0_0<$T>)t$145154).$apply$G()));
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            t = (($T)(t$145155));
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final x10.core.Rail t$145159 = ((x10.core.Rail)(((x10.util.WorkerLocalHandle.State<$T>)localState).store));
            
            //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Thread t$145156 = x10.core.Thread.currentThread();
            
            //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Worker t$145157 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$145156,x10.lang.Runtime.Worker.$RTT);
            
            //#line 750 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$145158 = t$145157.workerId;
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final long t$145160 = ((long)(((int)(t$145158))));
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final $T t$145161 = (($T)(t));
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            ((x10.core.Rail<$T>)t$145159).$set__1x10$lang$Rail$$T$G((long)(t$145160), (($T)(t$145161)));
        }
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final $T t$145163 = (($T)(t));
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        return t$145163;
    }
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    public void $apply__0x10$util$WorkerLocalHandle$$T(final $T t) {
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.lang.PlaceLocalHandle t$145164 = ((x10.lang.PlaceLocalHandle)(state));
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.util.WorkerLocalHandle.State t$145165 = ((x10.lang.PlaceLocalHandle<x10.util.WorkerLocalHandle.State<$T>>)t$145164).$apply$G();
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.core.Rail t$145169 = ((x10.core.Rail)(((x10.util.WorkerLocalHandle.State<$T>)t$145165).store));
        
        //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$145166 = x10.core.Thread.currentThread();
        
        //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$145167 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$145166,x10.lang.Runtime.Worker.$RTT);
        
        //#line 750 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final int t$145168 = t$145167.workerId;
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final long t$145170 = ((long)(((int)(t$145168))));
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        ((x10.core.Rail<$T>)t$145169).$set__1x10$lang$Rail$$T$G((long)(t$145170), (($T)(t)));
    }
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    public void initLocal__0$1x10$util$WorkerLocalHandle$$T$2(final x10.core.fun.Fun_0_0 init) {
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.lang.PlaceLocalHandle t$145171 = ((x10.lang.PlaceLocalHandle)(state));
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.util.WorkerLocalHandle.State localState = ((x10.lang.PlaceLocalHandle<x10.util.WorkerLocalHandle.State<$T>>)t$145171).$apply$G();
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.core.Rail localStore = ((x10.core.Rail)(((x10.util.WorkerLocalHandle.State<$T>)localState).store));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        ((x10.core.Rail<$T>)localStore).clear();
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        ((x10.util.WorkerLocalHandle.State<$T>)localState).init = ((x10.core.fun.Fun_0_0)(init));
    }
    
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    public void applyLocal__0$1x10$util$WorkerLocalHandle$$T$2(final x10.core.fun.VoidFun_0_1 op) {
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.lang.PlaceLocalHandle t$145172 = ((x10.lang.PlaceLocalHandle)(state));
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.util.WorkerLocalHandle.State t$145173 = ((x10.lang.PlaceLocalHandle<x10.util.WorkerLocalHandle.State<$T>>)t$145172).$apply$G();
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.core.Rail localStore = ((x10.core.Rail)(((x10.util.WorkerLocalHandle.State<$T>)t$145173).store));
        {
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final x10.lang.FinishState x10$__var63 = x10.lang.Runtime.startFinish();
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            try {{
                {
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                    final long t$145174 = ((x10.core.Rail<$T>)localStore).size;
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                    final long i$145083max$145085 = ((t$145174) - (((long)(1L))));
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                    long i$145211 = 0L;
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                        final long t$145212 = i$145211;
                        
                        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                        final boolean t$145213 = ((t$145212) <= (((long)(i$145083max$145085))));
                        
                        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                        if (!(t$145213)) {
                            
                            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                            break;
                        }
                        
                        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                        final long i$145208 = i$145211;
                        
                        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                        final $T t$145206 = (($T)(((x10.core.Rail<$T>)localStore).$apply$G((long)(i$145208))));
                        
                        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                        final boolean t$145207 = ((t$145206) != (null));
                        
                        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                        if (t$145207) {
                            
                            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                            x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new x10.util.WorkerLocalHandle.$Closure$327<$T>($T, op, t$145206, (x10.util.WorkerLocalHandle.$Closure$327.__0$1x10$util$WorkerLocalHandle$$Closure$327$$T$2__1x10$util$WorkerLocalHandle$$Closure$327$$T) null))));
                        }
                        
                        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                        final long t$145209 = i$145211;
                        
                        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                        final long t$145210 = ((t$145209) + (((long)(1L))));
                        
                        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                        i$145211 = t$145210;
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var63)));
             }}
            }
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        return;
        }
    
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    public $T reduceLocal__0$1x10$util$WorkerLocalHandle$$T$3x10$util$WorkerLocalHandle$$T$3x10$util$WorkerLocalHandle$$T$2$G(final x10.core.fun.Fun_0_2 op) {
        
        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.lang.PlaceLocalHandle t$145181 = ((x10.lang.PlaceLocalHandle)(state));
        
        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.util.WorkerLocalHandle.State localState = ((x10.lang.PlaceLocalHandle<x10.util.WorkerLocalHandle.State<$T>>)t$145181).$apply$G();
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.core.Rail localStore = ((x10.core.Rail)(((x10.util.WorkerLocalHandle.State<$T>)localState).store));
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.core.fun.Fun_0_0 t$145182 = ((x10.core.fun.Fun_0_0)(((x10.util.WorkerLocalHandle.State<$T>)localState).init));
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        $T result = (($T)(((x10.core.fun.Fun_0_0<$T>)t$145182).$apply$G()));
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final long t$145224 = ((x10.core.Rail<$T>)localStore).size;
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final long i$145101max$145225 = ((t$145224) - (((long)(1L))));
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        long i$145221 = 0L;
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        for (;
             true;
             ) {
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final long t$145222 = i$145221;
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final boolean t$145223 = ((t$145222) <= (((long)(i$145101max$145225))));
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            if (!(t$145223)) {
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                break;
            }
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final long i$145218 = i$145221;
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final $T t$145214 = (($T)(((x10.core.Rail<$T>)localStore).$apply$G((long)(i$145218))));
            
            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final boolean t$145215 = ((t$145214) != (null));
            
            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            if (t$145215) {
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                final $T t$145216 = (($T)(result));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                final $T t$145217 = (($T)((($T)
                                            ((x10.core.fun.Fun_0_2<$T,$T,$T>)op).$apply(t$145216, $T, t$145214, $T))));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                result = (($T)(t$145217));
            }
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final long t$145219 = i$145221;
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final long t$145220 = ((t$145219) + (((long)(1L))));
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            i$145221 = t$145220;
        }
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final $T t$145192 = (($T)(result));
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        return t$145192;
    }
    
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    public $T reduceLocal__0x10$util$WorkerLocalHandle$$T__1$1x10$util$WorkerLocalHandle$$T$3x10$util$WorkerLocalHandle$$T$3x10$util$WorkerLocalHandle$$T$2$G($T result, final x10.core.fun.Fun_0_2 op) {
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.lang.PlaceLocalHandle t$145193 = ((x10.lang.PlaceLocalHandle)(state));
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.util.WorkerLocalHandle.State localState = ((x10.lang.PlaceLocalHandle<x10.util.WorkerLocalHandle.State<$T>>)t$145193).$apply$G();
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final x10.core.Rail localStore = ((x10.core.Rail)(((x10.util.WorkerLocalHandle.State<$T>)localState).store));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final long t$145236 = ((x10.core.Rail<$T>)localStore).size;
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final long i$145119max$145237 = ((t$145236) - (((long)(1L))));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        long i$145233 = 0L;
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        for (;
             true;
             ) {
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final long t$145234 = i$145233;
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final boolean t$145235 = ((t$145234) <= (((long)(i$145119max$145237))));
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            if (!(t$145235)) {
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                break;
            }
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final long i$145230 = i$145233;
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final $T t$145226 = (($T)(((x10.core.Rail<$T>)localStore).$apply$G((long)(i$145230))));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final boolean t$145227 = ((t$145226) != (null));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            if (t$145227) {
                
                //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                final $T t$145228 = (($T)(result));
                
                //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                final $T t$145229 = (($T)((($T)
                                            ((x10.core.fun.Fun_0_2<$T,$T,$T>)op).$apply(t$145228, $T, t$145226, $T))));
                
                //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                result = (($T)(t$145229));
            }
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final long t$145231 = i$145233;
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final long t$145232 = ((t$145231) + (((long)(1L))));
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            i$145233 = t$145232;
        }
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        final $T t$145203 = (($T)(result));
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        return t$145203;
    }
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    final public x10.util.WorkerLocalHandle x10$util$WorkerLocalHandle$$this$x10$util$WorkerLocalHandle() {
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        return x10.util.WorkerLocalHandle.this;
    }
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    final public void __fieldInitializers_x10_util_WorkerLocalHandle() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$326<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$326> $RTT = 
            x10.rtt.StaticFunType.<$Closure$326> make($Closure$326.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.util.WorkerLocalHandle.State.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.WorkerLocalHandle.$Closure$326<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.init = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.WorkerLocalHandle.$Closure$326 $_obj = new x10.util.WorkerLocalHandle.$Closure$326((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.init);
            
        }
        
        // constructor just for allocation
        public $Closure$326(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.WorkerLocalHandle.$Closure$326.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.util.WorkerLocalHandle.State $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$326 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$util$WorkerLocalHandle$$Closure$326$$T$2 {}
        
    
        
        public x10.util.WorkerLocalHandle.State $apply() {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            final x10.util.WorkerLocalHandle.State alloc$145081 = ((x10.util.WorkerLocalHandle.State)(new x10.util.WorkerLocalHandle.State<$T>((java.lang.System[]) null, $T)));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            alloc$145081.x10$util$WorkerLocalHandle$State$$init$S(this.init, (x10.util.WorkerLocalHandle.State.__0$1x10$util$WorkerLocalHandle$State$$U$2) null);
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            return alloc$145081;
        }
        
        public x10.core.fun.Fun_0_0<$T> init;
        
        public $Closure$326(final x10.rtt.Type $T, final x10.core.fun.Fun_0_0<$T> init, __0$1x10$util$WorkerLocalHandle$$Closure$326$$T$2 $dummy) {
            x10.util.WorkerLocalHandle.$Closure$326.$initParams(this, $T);
             {
                ((x10.util.WorkerLocalHandle.$Closure$326<$T>)this).init = ((x10.core.fun.Fun_0_0)(init));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$327<$T> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$327> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$327> make($Closure$327.class,
                                                          1,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.WorkerLocalHandle.$Closure$327<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.op = $deserializer.readObject();
            $_obj.t$145206 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.WorkerLocalHandle.$Closure$327 $_obj = new x10.util.WorkerLocalHandle.$Closure$327((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.op);
            $serializer.write(this.t$145206);
            
        }
        
        // constructor just for allocation
        public $Closure$327(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.WorkerLocalHandle.$Closure$327.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$327 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$util$WorkerLocalHandle$$Closure$327$$T$2__1x10$util$WorkerLocalHandle$$Closure$327$$T {}
        
    
        
        public void $apply() {
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            try {{
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                ((x10.core.fun.VoidFun_0_1<$T>)this.op).$apply(this.t$145206, $T);
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.core.fun.VoidFun_0_1<$T> op;
        public $T t$145206;
        
        public $Closure$327(final x10.rtt.Type $T, final x10.core.fun.VoidFun_0_1<$T> op, final $T t$145206, __0$1x10$util$WorkerLocalHandle$$Closure$327$$T$2__1x10$util$WorkerLocalHandle$$Closure$327$$T $dummy) {
            x10.util.WorkerLocalHandle.$Closure$327.$initParams(this, $T);
             {
                ((x10.util.WorkerLocalHandle.$Closure$327<$T>)this).op = ((x10.core.fun.VoidFun_0_1)(op));
                ((x10.util.WorkerLocalHandle.$Closure$327<$T>)this).t$145206 = (($T)(t$145206));
            }
        }
        
    }
    
    }
    
    