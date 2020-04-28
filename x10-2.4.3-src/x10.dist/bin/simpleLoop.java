
@x10.runtime.impl.java.X10Generated
public class simpleLoop extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<simpleLoop> $RTT = 
        x10.rtt.NamedType.<simpleLoop> make("simpleLoop",
                                            simpleLoop.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(simpleLoop $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + simpleLoop.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        simpleLoop $_obj = new simpleLoop((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public simpleLoop(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 7 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
    public static class $Main extends x10.runtime.impl.java.Runtime
    {
        // java main method
        public static void main(java.lang.String[] args) {
            // start native runtime
            new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.core.Rail<java.lang.String> args) {
            // call the original app-main method
            simpleLoop.main(args);
        }
    }
    
    // the original app-main method
    public static void main(final x10.core.Rail<java.lang.String> args) {
        final int nthreads$246 = 2;
        final int ksize$247 = 2;
        int i$516 = 0;
        {
            final java.lang.String[] args$value$539 = ((java.lang.String[])args.value);
            for (;
                 true;
                 ) {
                final int t$517 = i$516;
                final long t$518 = ((long)(((int)(t$517))));
                final long t$519 = ((x10.core.Rail<java.lang.String>)args).size;
                final boolean t$520 = ((t$518) < (((long)(t$519))));
                if (!(t$520)) {
                    break;
                }
                final java.lang.String t$497 = ((java.lang.String)args$value$539[(int)0L]);
                x10.runtime.impl.java.EvalUtils.eval(java.lang.Long.parseLong(t$497));
                final int t$498 = i$516;
                final int t$499 = ((t$498) + (((int)(1))));
                i$516 = t$499;
            }
        }
        long chunkStart$521 = 0;
        long chunkEnd$522 = 10L;
        final int nthreads$523 = 4;
        final long nIterations$524 = 10L;
        
        //#line 11 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
        long i$525 = 0L;
        final long chunkSize$526 = 1;
        {
            
            //#line 11 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 11 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
            final x10.lang.FinishState x10$__var0 = x10.lang.Runtime.startFinish();
            {
                
                //#line 11 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                final long[] $chunkStart$521$537 = new long[1];
                
                //#line 11 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                $chunkStart$521$537[(int)0]=chunkStart$521;
                
                //#line 11 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                final long[] $chunkEnd$522$538 = new long[1];
                
                //#line 11 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                $chunkEnd$522$538[(int)0]=chunkEnd$522;
                
                //#line 11 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                try {{
                    {
                        long ii$527 = 0;
                        for (;
                             true;
                             ) {
                            final long t$528 = ii$527;
                            final long t$529 = ((long)(((int)(nthreads$523))));
                            final boolean t$530 = ((t$528) < (((long)(t$529))));
                            if (!(t$530)) {
                                break;
                            }
                            final long ni$508 = ii$527;
                            x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new simpleLoop.$Closure$0($chunkStart$521$537, $chunkEnd$522$538))));
                            final long t$513 = ii$527;
                            final long t$514 = ((long)(((int)(1))));
                            final long t$515 = ((t$513) + (((long)(t$514))));
                            ii$527 = t$515;
                        }
                    }
                }}catch (java.lang.Throwable __lowerer__var__0__) {
                    
                    //#line 11 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                    x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                    
                    //#line 11 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                    throw new java.lang.RuntimeException();
                }finally {{
                     
                     //#line 11 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                     x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var0)));
                 }}
                
                //#line 11 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                chunkStart$521 = ((long)$chunkStart$521$537[(int)0]);
                
                //#line 11 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                chunkEnd$522 = ((long)$chunkEnd$522$538[(int)0]);
                }
            }
        
        //#line 25 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
        final x10.io.Printer t$495 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        long t$490 =  0;
        if (true) {
            t$490 = 10L;
        } else {
            t$490 = 0L;
        }
        final long t$491 = t$490;
        final long t$492 = 10L;
        final long t$493 = 200L;
        final long t$494 = 200L;
        final long t$496 = 200L;
        
        //#line 25 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
        t$495.println(x10.core.Long.$box(t$496));
        }
    
    
    //#line 6 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
    final public simpleLoop simpleLoop$$this$simpleLoop() {
        
        //#line 6 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
        return simpleLoop.this;
    }
    
    
    //#line 6 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
    // creation method for java code (1-phase java constructor)
    public simpleLoop() {
        this((java.lang.System[]) null);
        simpleLoop$$init$S();
    }
    
    // constructor for non-virtual call
    final public simpleLoop simpleLoop$$init$S() {
         {
            
            //#line 6 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
            
            
            //#line 6 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
            this.__fieldInitializers_simpleLoop();
        }
        return this;
    }
    
    
    
    //#line 6 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
    final public void __fieldInitializers_simpleLoop() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$0 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$0> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$0> make($Closure$0.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(simpleLoop.$Closure$0 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$0.class + " calling"); } 
            $_obj.$chunkStart$521$537 = $deserializer.readObject();
            $_obj.$chunkEnd$522$538 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            simpleLoop.$Closure$0 $_obj = new simpleLoop.$Closure$0((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$chunkStart$521$537);
            $serializer.write(this.$chunkEnd$522$538);
            
        }
        
        // constructor just for allocation
        public $Closure$0(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            try {{
                long kk$509 = ((long)this.$chunkStart$521$537[(int)0]);
                for (;
                     true;
                     ) {
                    final long t$510 = kk$509;
                    final long t$511 = ((long)this.$chunkEnd$522$538[(int)0]);
                    final boolean t$512 = ((t$510) < (((long)(t$511))));
                    if (!(t$512)) {
                        break;
                    }
                    
                    //#line 16 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                    long j$502 = 0L;
                    
                    //#line 16 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 16 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                        final long t$503 = j$502;
                        
                        //#line 16 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                        final boolean t$504 = ((t$503) < (((long)(20L))));
                        
                        //#line 16 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                        if (!(t$504)) {
                            
                            //#line 16 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                            break;
                        }
                        
                        //#line 18 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                        if (true) {
                            
                        }
                        
                        //#line 16 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                        final long t$500 = j$502;
                        
                        //#line 16 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                        final long t$501 = ((t$500) + (((long)(1L))));
                        
                        //#line 16 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                        j$502 = t$501;
                    }
                    final long t$505 = kk$509;
                    final long t$506 = ((long)(((int)(1))));
                    final long t$507 = ((t$505) + (((long)(t$506))));
                    kk$509 = t$507;
                }
            }}catch (java.lang.Error __lowerer__var__0__) {
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public long[] $chunkStart$521$537;
        public long[] $chunkEnd$522$538;
        
        public $Closure$0(final long[] $chunkStart$521$537, final long[] $chunkEnd$522$538) {
             {
                this.$chunkStart$521$537 = $chunkStart$521$537;
                this.$chunkEnd$522$538 = $chunkEnd$522$538;
            }
        }
        
    }
    
    }
    
    