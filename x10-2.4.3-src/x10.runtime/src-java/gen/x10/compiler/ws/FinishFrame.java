package x10.compiler.ws;


@x10.runtime.impl.java.X10Generated
abstract public class FinishFrame extends x10.compiler.ws.Frame implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<FinishFrame> $RTT = 
        x10.rtt.NamedType.<FinishFrame> make("x10.compiler.ws.FinishFrame",
                                             FinishFrame.class,
                                             new x10.rtt.Type[] {
                                                 x10.compiler.ws.Frame.$RTT
                                             });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.FinishFrame $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.compiler.ws.Frame.$_deserialize_body($_obj, $deserializer);
        $_obj.asyncs = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.asyncs);
        
    }
    
    // constructor just for allocation
    public FinishFrame(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    public int asyncs;
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    public transient x10.util.GrowableRail<java.lang.RuntimeException> exceptions;
    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    
    // constructor for non-virtual call
    final public x10.compiler.ws.FinishFrame x10$compiler$ws$FinishFrame$$init$S(final x10.compiler.ws.Frame up) {
         {
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            final x10.compiler.ws.Frame this$77830 = this;
            
            //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
            final x10.compiler.ws.Frame up$77829 = ((x10.compiler.ws.Frame)(up));
            
            //#line 30 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
            this$77830.up = ((x10.compiler.ws.Frame)(up$77829));
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            final x10.compiler.ws.FinishFrame this$79431 = this;
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            this.exceptions = null;
            {
                
                //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                this.asyncs = 1;
            }
        }
        return this;
    }
    
    
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    public void wrapBack(final x10.compiler.ws.Worker worker, final x10.compiler.ws.Frame frame) {
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final java.lang.RuntimeException t$79379 = ((java.lang.RuntimeException)(worker.throwable));
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final boolean t$79381 = ((null) != (t$79379));
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        if (t$79381) {
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            final java.lang.RuntimeException t$79380 = ((java.lang.RuntimeException)(worker.throwable));
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            this.caught(((java.lang.RuntimeException)(t$79380)));
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            worker.throwable = null;
        }
    }
    
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    public void wrapResume(final x10.compiler.ws.Worker worker) {
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        int n =  0;
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final x10.util.concurrent.Monitor t$79382 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        t$79382.lock();
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final int t$79383 = this.asyncs;
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final int t$79384 = ((t$79383) - (((int)(1))));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final int t$79385 = this.asyncs = t$79384;
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        n = t$79385;
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final x10.util.concurrent.Monitor t$79386 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        t$79386.unlock();
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final int t$79387 = n;
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final boolean t$79389 = ((int) 0) != ((int) t$79387);
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        if (t$79389) {
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            final x10.compiler.Abort t$79388 = ((x10.compiler.Abort)(x10.compiler.Abort.get$ABORT()));
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            throw t$79388;
        }
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final x10.util.GrowableRail t$79390 = ((x10.util.GrowableRail)(exceptions));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final x10.lang.MultipleExceptions t$79391 = x10.lang.MultipleExceptions.make__0$1x10$lang$Exception$2(((x10.util.GrowableRail)(t$79390)));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        worker.throwable = ((java.lang.RuntimeException)(t$79391));
    }
    
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    final public void append__0$1x10$lang$Exception$2(final x10.util.GrowableRail s) {
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final boolean t$79401 = ((null) != (s));
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        if (t$79401) {
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            final x10.util.concurrent.Monitor t$79392 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            t$79392.lock();
            
            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            final x10.util.GrowableRail t$79393 = ((x10.util.GrowableRail)(exceptions));
            
            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            final boolean t$79394 = ((null) == (t$79393));
            
            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            if (t$79394) {
                
                //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                final x10.util.GrowableRail alloc$77561 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<java.lang.RuntimeException>((java.lang.System[]) null, x10.rtt.Types.EXCEPTION)));
                
                //#line 50 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                alloc$77561.x10$util$GrowableRail$$init$S(((long)(0L)));
                
                //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                this.exceptions = ((x10.util.GrowableRail)(alloc$77561));
            }
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            while (true) {
                
                //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long t$79395 = ((x10.util.GrowableRail<java.lang.RuntimeException>)s).size;
                
                //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final boolean t$79396 = ((long) t$79395) == ((long) 0L);
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                final boolean t$79399 = !(t$79396);
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                if (!(t$79399)) {
                    
                    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                    break;
                }
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                final x10.util.GrowableRail t$79432 = ((x10.util.GrowableRail)(exceptions));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                final java.lang.RuntimeException t$79433 = ((x10.util.GrowableRail<java.lang.RuntimeException>)s).removeLast$G();
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                ((x10.util.GrowableRail<java.lang.RuntimeException>)t$79432).add__0x10$util$GrowableRail$$T(((java.lang.RuntimeException)(t$79433)));
            }
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            final x10.util.concurrent.Monitor t$79400 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            t$79400.unlock();
        }
    }
    
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    final public void append(final x10.compiler.ws.FinishFrame ff) {
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final x10.compiler.ws.FinishFrame this$78457 = ((x10.compiler.ws.FinishFrame)(this));
        
        //#line 85 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final x10.util.GrowableRail s$78455 = ((x10.util.GrowableRail)(ff.exceptions));
        
        //#line 86 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final boolean t$79436 = ((null) != (s$78455));
        
        //#line 86 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        if (t$79436) {
            
            //#line 87 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            final x10.util.concurrent.Monitor t$79437 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
            
            //#line 87 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            t$79437.lock();
            
            //#line 88 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            final x10.util.GrowableRail t$79438 = ((x10.util.GrowableRail)(this$78457.exceptions));
            
            //#line 88 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            final boolean t$79439 = ((null) == (t$79438));
            
            //#line 88 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            if (t$79439) {
                
                //#line 88 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                final x10.util.GrowableRail alloc$79440 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<java.lang.RuntimeException>((java.lang.System[]) null, x10.rtt.Types.EXCEPTION)));
                
                //#line 50 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                alloc$79440.x10$util$GrowableRail$$init$S(((long)(0L)));
                
                //#line 88 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                this$78457.exceptions = ((x10.util.GrowableRail)(alloc$79440));
            }
            
            //#line 89 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            while (true) {
                
                //#line 153 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long t$79441 = ((x10.util.GrowableRail<java.lang.RuntimeException>)s$78455).size;
                
                //#line 153 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final boolean t$79442 = ((long) t$79441) == ((long) 0L);
                
                //#line 89 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                final boolean t$79443 = !(t$79442);
                
                //#line 89 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                if (!(t$79443)) {
                    
                    //#line 89 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                    break;
                }
                
                //#line 89 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                final x10.util.GrowableRail t$79434 = ((x10.util.GrowableRail)(this$78457.exceptions));
                
                //#line 89 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                final java.lang.RuntimeException t$79435 = ((x10.util.GrowableRail<java.lang.RuntimeException>)s$78455).removeLast$G();
                
                //#line 89 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                ((x10.util.GrowableRail<java.lang.RuntimeException>)t$79434).add__0x10$util$GrowableRail$$T(((java.lang.RuntimeException)(t$79435)));
            }
            
            //#line 90 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            final x10.util.concurrent.Monitor t$79444 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
            
            //#line 90 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            t$79444.unlock();
        }
    }
    
    
    //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    final public void caught(final java.lang.RuntimeException t) {
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final x10.compiler.Abort t$79412 = ((x10.compiler.Abort)(x10.compiler.Abort.get$ABORT()));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final boolean t$79414 = x10.rtt.Equality.equalsequals((t),(t$79412));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        if (t$79414) {
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            final x10.compiler.Abort t$79413 = ((x10.compiler.Abort)(x10.compiler.Abort.get$ABORT()));
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            throw t$79413;
        }
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final x10.util.concurrent.Monitor t$79415 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        t$79415.lock();
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final x10.util.GrowableRail t$79416 = ((x10.util.GrowableRail)(exceptions));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final boolean t$79417 = ((null) == (t$79416));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        if (t$79417) {
            
            //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            final x10.util.GrowableRail alloc$77562 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<java.lang.RuntimeException>((java.lang.System[]) null, x10.rtt.Types.EXCEPTION)));
            
            //#line 50 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            alloc$77562.x10$util$GrowableRail$$init$S(((long)(0L)));
            
            //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            this.exceptions = ((x10.util.GrowableRail)(alloc$77562));
        }
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final x10.util.GrowableRail t$79418 = ((x10.util.GrowableRail)(exceptions));
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        ((x10.util.GrowableRail<java.lang.RuntimeException>)t$79418).add__0x10$util$GrowableRail$$T(((java.lang.RuntimeException)(t)));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final x10.util.concurrent.Monitor t$79419 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        t$79419.unlock();
    }
    
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    final public void rethrow() {
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final x10.util.GrowableRail t$79420 = ((x10.util.GrowableRail)(exceptions));
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final boolean t$79421 = ((null) != (t$79420));
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        if (t$79421) {
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            this.rethrowSlow();
        }
    }
    
    
    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    final public void rethrowSlow() {
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final x10.util.GrowableRail t$79422 = ((x10.util.GrowableRail)(exceptions));
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final x10.lang.MultipleExceptions t$79423 = ((x10.lang.MultipleExceptions)(new x10.lang.MultipleExceptions(t$79422, (x10.lang.MultipleExceptions.__0$1x10$lang$Exception$2) null)));
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        throw t$79423;
    }
    
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    final public void check() {
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final x10.util.GrowableRail t$79424 = ((x10.util.GrowableRail)(exceptions));
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final boolean t$79430 = ((null) != (t$79424));
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        if (t$79430) {
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            while (true) {
                
                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                final x10.util.GrowableRail this$78462 = ((x10.util.GrowableRail)(exceptions));
                
                //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long t$79425 = ((x10.util.GrowableRail<java.lang.RuntimeException>)this$78462).size;
                
                //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final boolean t$79426 = ((long) t$79425) == ((long) 0L);
                
                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                final boolean t$79429 = !(t$79426);
                
                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                if (!(t$79429)) {
                    
                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                    break;
                }
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                final x10.util.GrowableRail t$79445 = ((x10.util.GrowableRail)(exceptions));
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                final java.lang.RuntimeException t$79446 = ((x10.util.GrowableRail<java.lang.RuntimeException>)t$79445).removeLast$G();
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(t$79446)));
            }
        }
    }
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    final public x10.compiler.ws.FinishFrame x10$compiler$ws$FinishFrame$$this$x10$compiler$ws$FinishFrame() {
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        return x10.compiler.ws.FinishFrame.this;
    }
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    final public void __fieldInitializers_x10_compiler_ws_FinishFrame() {
        
    }
}

