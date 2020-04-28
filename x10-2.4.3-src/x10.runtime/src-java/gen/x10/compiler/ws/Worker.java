package x10.compiler.ws;


@x10.runtime.impl.java.X10Generated
final public class Worker extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Worker> $RTT = 
        x10.rtt.NamedType.<Worker> make("x10.compiler.ws.Worker",
                                        Worker.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.Worker $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.workers = $deserializer.readObject();
        $_obj.random = $deserializer.readObject();
        $_obj.id = $deserializer.readInt();
        $_obj.deque = $deserializer.readObject();
        $_obj.fifo = $deserializer.readObject();
        $_obj.lock = $deserializer.readObject();
        $_obj.throwable = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.compiler.ws.Worker $_obj = new x10.compiler.ws.Worker((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.workers);
        $serializer.write(this.random);
        $serializer.write(this.id);
        $serializer.write(this.deque);
        $serializer.write(this.fifo);
        $serializer.write(this.lock);
        $serializer.write(this.throwable);
        
    }
    
    // constructor just for allocation
    public Worker(final java.lang.System[] $dummy) {
        
    }
    
    // synthetic type for parameter mangling
    public static final class __1$1x10$compiler$ws$Worker$2 {}
    

    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public x10.core.Rail<x10.compiler.ws.Worker> workers;
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public x10.util.Random random;
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public int id;
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public x10.core.Deque deque;
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public x10.core.Deque fifo;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public x10.util.concurrent.Lock lock;
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public java.lang.RuntimeException throwable;
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    // creation method for java code (1-phase java constructor)
    public Worker(final int i, final x10.core.Rail<x10.compiler.ws.Worker> workers, __1$1x10$compiler$ws$Worker$2 $dummy) {
        this((java.lang.System[]) null);
        x10$compiler$ws$Worker$$init$S(i, workers, (x10.compiler.ws.Worker.__1$1x10$compiler$ws$Worker$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.compiler.ws.Worker x10$compiler$ws$Worker$$init$S(final int i, final x10.core.Rail<x10.compiler.ws.Worker> workers, __1$1x10$compiler$ws$Worker$2 $dummy) {
         {
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            this.__fieldInitializers_x10_compiler_ws_Worker();
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.util.Random alloc$77551 = ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null)));
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final long t$80493 = ((long)(((int)(8))));
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final int t$80494 = ((i) << (int)(((long)(t$80493))));
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final int t$80495 = ((i) + (((int)(t$80494))));
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final long t$80496 = ((long)(((int)(16))));
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final int t$80497 = ((i) << (int)(((long)(t$80496))));
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final int t$80498 = ((t$80495) + (((int)(t$80497))));
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final long t$80499 = ((long)(((int)(24))));
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final int t$80500 = ((i) << (int)(((long)(t$80499))));
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final int t$80501 = ((t$80498) + (((int)(t$80500))));
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final long t$80502 = ((long)(((int)(t$80501))));
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            alloc$77551.x10$util$Random$$init$S(t$80502);
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            this.random = ((x10.util.Random)(alloc$77551));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            this.id = i;
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            this.workers = ((x10.core.Rail)(workers));
        }
        return this;
    }
    
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public void migrate() {
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        x10.compiler.ws.RegularFrame k =  null;
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final x10.util.concurrent.Lock t$80369 = ((x10.util.concurrent.Lock)(lock));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        t$80369.lock();
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        while (true) {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.core.Deque t$80370 = ((x10.core.Deque)(deque));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final java.lang.Object t$80371 = t$80370.steal();
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.compiler.ws.RegularFrame t$80372 = ((x10.compiler.ws.RegularFrame) t$80371);
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.compiler.ws.RegularFrame t$80373 = k = ((x10.compiler.ws.RegularFrame)(t$80372));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final boolean t$80381 = ((null) != (t$80373));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            if (!(t$80381)) {
                
                //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                break;
            }
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.util.concurrent.Monitor t$80503 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            t$80503.lock();
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.compiler.ws.RegularFrame t$80504 = ((x10.compiler.ws.RegularFrame)(k));
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.compiler.ws.FinishFrame obj$80505 = ((x10.compiler.ws.FinishFrame)(t$80504.ff));
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final int t$80506 = obj$80505.asyncs;
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final int t$80507 = ((t$80506) + (((int)(1))));
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            obj$80505.asyncs = t$80507;
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.util.concurrent.Monitor t$80508 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            t$80508.unlock();
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.core.Deque t$80509 = ((x10.core.Deque)(fifo));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.compiler.ws.RegularFrame t$80510 = ((x10.compiler.ws.RegularFrame)(k));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            t$80509.push(((java.lang.Object)(t$80510)));
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final x10.util.concurrent.Lock t$80382 = ((x10.util.concurrent.Lock)(lock));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        t$80382.unlock();
    }
    
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public void run() {
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        try {{
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            while (true) {
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final java.lang.Object k = this.find();
                
                //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final boolean t$80383 = ((null) == (k));
                
                //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                if (t$80383) {
                    
                    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                    return;
                }
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                try {{
                    
                    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                    final x10.compiler.ws.Frame t$80384 = ((x10.compiler.ws.Frame) k);
                    
                    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                    this.unroll(((x10.compiler.ws.Frame)(t$80384)));
                }}catch (final x10.compiler.Abort id$53) {
                    
                }
            }
        }}catch (final java.lang.RuntimeException t) {
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final java.lang.String t$80385 = (("Uncaught exception at place ") + (x10.lang.Place.place(x10.x10rt.X10RT.here())));
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final java.lang.String t$80386 = ((t$80385) + (" in WS worker: "));
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final java.lang.String t$80387 = ((t$80386) + (t));
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            java.lang.System.err.println(t$80387);
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            t.printStackTrace();
        }
    }
    
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public java.lang.Object find() {
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        java.lang.Object k =  null;
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final x10.core.Deque t$80388 = ((x10.core.Deque)(fifo));
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final java.lang.Object t$80389 = t$80388.steal();
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        k = ((java.lang.Object)(t$80389));
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        while (true) {
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final java.lang.Object t$80390 = ((java.lang.Object)(k));
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final boolean t$80418 = ((null) == (t$80390));
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            if (!(t$80418)) {
                
                //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                break;
            }
            
            //#line 296 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Pool t$80511 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
            
            //#line 296 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$80512 = t$80511.wsEnd;
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            if (t$80512) {
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                return null;
            }
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.util.Random t$80513 = ((x10.util.Random)(random));
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final int t$80514 = x10.lang.Runtime.get$NTHREADS();
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final int rand$80515 = t$80513.nextInt$O((int)(t$80514));
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.core.Rail t$80516 = ((x10.core.Rail)(workers));
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final long t$80517 = ((long)(((int)(rand$80515))));
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.compiler.ws.Worker victim$80518 = ((x10.compiler.ws.Worker[])t$80516.value)[(int)t$80517];
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.core.Deque t$80519 = ((x10.core.Deque)(victim$80518.fifo));
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final java.lang.Object t$80520 = t$80519.steal();
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            k = ((java.lang.Object)(t$80520));
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final java.lang.Object t$80521 = ((java.lang.Object)(k));
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final boolean t$80522 = ((null) != (t$80521));
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            if (t$80522) {
                
                //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                break;
            }
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.util.concurrent.Lock t$80523 = ((x10.util.concurrent.Lock)(victim$80518.lock));
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final boolean t$80524 = t$80523.tryLock();
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            if (t$80524) {
                
                //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final x10.core.Deque t$80525 = ((x10.core.Deque)(victim$80518.deque));
                
                //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final java.lang.Object t$80526 = t$80525.steal();
                
                //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                k = ((java.lang.Object)(t$80526));
                
                //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final java.lang.Object t$80527 = ((java.lang.Object)(k));
                
                //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final boolean t$80528 = ((null) != (t$80527));
                
                //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                if (t$80528) {
                    
                    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                    final java.lang.Object t$80529 = ((java.lang.Object)(k));
                    
                    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                    x10.compiler.ws.RegularFrame r$80530 = ((x10.compiler.ws.RegularFrame) t$80529);
                    
                    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                    final x10.util.concurrent.Monitor t$80531 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
                    
                    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                    t$80531.lock();
                    
                    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                    final x10.compiler.ws.RegularFrame t$80532 = ((x10.compiler.ws.RegularFrame)(r$80530));
                    
                    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                    final x10.compiler.ws.FinishFrame obj$80533 = ((x10.compiler.ws.FinishFrame)(t$80532.ff));
                    
                    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                    final int t$80534 = obj$80533.asyncs;
                    
                    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                    final int t$80535 = ((t$80534) + (((int)(1))));
                    
                    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                    obj$80533.asyncs = t$80535;
                    
                    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                    final x10.util.concurrent.Monitor t$80536 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
                    
                    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                    t$80536.unlock();
                }
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final x10.util.concurrent.Lock t$80537 = ((x10.util.concurrent.Lock)(victim$80518.lock));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                t$80537.unlock();
            }
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final java.lang.Object t$80538 = ((java.lang.Object)(k));
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final boolean t$80539 = ((null) != (t$80538));
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            if (t$80539) {
                
                //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                break;
            }
            
            //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            x10.runtime.impl.java.Runtime.eventProbe();
            
            //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.core.Deque t$80540 = ((x10.core.Deque)(fifo));
            
            //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final java.lang.Object t$80541 = t$80540.steal();
            
            //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            k = ((java.lang.Object)(t$80541));
        }
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final java.lang.Object t$80419 = ((java.lang.Object)(k));
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        return t$80419;
    }
    
    
    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public void unroll(x10.compiler.ws.Frame frame) {
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        x10.compiler.ws.Frame up =  null;
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        while (true) {
            
            //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.compiler.ws.Frame t$80420 = ((x10.compiler.ws.Frame)(frame));
            
            //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            t$80420.wrapResume(((x10.compiler.ws.Worker)(this)));
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.compiler.ws.Frame t$80421 = ((x10.compiler.ws.Frame)(frame));
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.compiler.ws.Frame t$80422 = ((x10.compiler.ws.Frame)(t$80421.up));
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            up = ((x10.compiler.ws.Frame)(t$80422));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.compiler.ws.Frame t$80423 = ((x10.compiler.ws.Frame)(up));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.compiler.ws.Frame t$80424 = ((x10.compiler.ws.Frame)(frame));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            t$80423.wrapBack(((x10.compiler.ws.Worker)(this)), ((x10.compiler.ws.Frame)(t$80424)));
            
            //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
            final x10.compiler.ws.Frame o$80220 = ((x10.compiler.ws.Frame)(frame));
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.compiler.ws.Frame t$80425 = ((x10.compiler.ws.Frame)(up));
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            frame = ((x10.compiler.ws.Frame)(t$80425));
        }
    }
    
    
    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public static void wsRunAsync(final long id, final x10.core.fun.VoidFun_0_0 body) {
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final long t$80426 = ((long)x10.x10rt.X10RT.here());
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final boolean t$80427 = ((long) id) == ((long) t$80426);
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        if (t$80427) {
            
            //#line 156 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 o$80223 = ((x10.core.fun.VoidFun_0_0)(body));
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.core.fun.VoidFun_0_0 copy = ((x10.core.fun.VoidFun_0_0)(x10.lang.Runtime.<x10.core.fun.VoidFun_0_0> deepCopy__0x10$lang$Runtime$$T$G(x10.core.fun.VoidFun_0_0.$RTT, ((x10.core.fun.VoidFun_0_0)(o$80223)), ((x10.lang.Runtime.Profile)(null)))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            ((x10.core.fun.VoidFun_0_0)copy).$apply();
            
            //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
            final x10.core.fun.VoidFun_0_0 o$80224 = ((x10.core.fun.VoidFun_0_0)(copy));
        } else {
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long id$80227 = id;
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 msgBody$80228 = ((x10.core.fun.VoidFun_0_0)(body));
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Profile prof$80229 = ((x10.lang.Runtime.Profile)(((x10.lang.Runtime.Profile)
                                                                                      (null))));
            
            //#line 77 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(id$80227))), msgBody$80228, ((x10.lang.Runtime.Profile)(null)), null);
        }
        
        //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.fun.VoidFun_0_0 o$80232 = ((x10.core.fun.VoidFun_0_0)(body));
    }
    
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public static void runAsyncAt(final x10.lang.Place place, final x10.compiler.ws.RegularFrame frame) {
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final x10.core.fun.VoidFun_0_0 body = ((x10.core.fun.VoidFun_0_0)(new x10.compiler.ws.Worker.$Closure_runAsyncAt(frame)));
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final long t$80429 = place.id;
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        x10.compiler.ws.Worker.wsRunAsync((long)(t$80429), ((x10.core.fun.VoidFun_0_0)(body)));
    }
    
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public static void runAt(final x10.lang.Place place, final x10.compiler.ws.RegularFrame frame) {
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final x10.core.fun.VoidFun_0_0 body = ((x10.core.fun.VoidFun_0_0)(new x10.compiler.ws.Worker.$Closure_runAt(frame)));
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final long t$80431 = place.id;
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        x10.compiler.ws.Worker.wsRunAsync((long)(t$80431), ((x10.core.fun.VoidFun_0_0)(body)));
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final x10.compiler.Abort t$80432 = ((x10.compiler.Abort)(x10.compiler.Abort.get$ABORT()));
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        throw t$80432;
    }
    
    
    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public static void stop() {
        
        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final x10.core.fun.VoidFun_0_0 body = ((x10.core.fun.VoidFun_0_0)(new x10.compiler.ws.Worker.$Closure_stop()));
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        int i$80548 = 1;
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        for (;
             true;
             ) {
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final int t$80549 = i$80548;
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final long t$80550 = ((long)(((int)(t$80549))));
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final long t$80551 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final boolean t$80552 = ((t$80550) < (((long)(t$80551))));
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            if (!(t$80552)) {
                
                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                break;
            }
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final int t$80542 = i$80548;
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long id$80543 = ((long)(((int)(t$80542))));
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 msgBody$80544 = ((x10.core.fun.VoidFun_0_0)(body));
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Profile prof$80545 = ((x10.lang.Runtime.Profile)(((x10.lang.Runtime.Profile)
                                                                                      (null))));
            
            //#line 77 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(id$80543))), msgBody$80544, ((x10.lang.Runtime.Profile)(null)), null);
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final int t$80546 = i$80548;
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final int t$80547 = ((t$80546) + (((int)(1))));
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            i$80548 = t$80547;
        }
        
        //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.fun.VoidFun_0_0 o$80240 = ((x10.core.fun.VoidFun_0_0)(body));
        
        //#line 293 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$80553 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 293 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$80553.wsEnd = true;
    }
    
    
    //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public static x10.compiler.ws.Worker startHere() {
        
        //#line 274 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$80568 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 274 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Deque t$80569 = ((x10.core.Deque)(new x10.core.Deque()));
        
        //#line 274 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$80568.wsBlockedContinuations = ((x10.core.Deque)(t$80569));
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final int t$80444 = x10.lang.Runtime.get$NTHREADS();
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final long t$80445 = ((long)(((int)(t$80444))));
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final x10.core.Rail workers = ((x10.core.Rail)(new x10.core.Rail<x10.compiler.ws.Worker>(x10.compiler.ws.Worker.$RTT, t$80445)));
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        int i$80570 = 0;
        {
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.compiler.ws.Worker[] workers$value$80604 = ((x10.compiler.ws.Worker[])workers.value);
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            for (;
                 true;
                 ) {
                
                //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final int t$80571 = i$80570;
                
                //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final int t$80572 = x10.lang.Runtime.get$NTHREADS();
                
                //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final boolean t$80573 = ((t$80571) < (((int)(t$80572))));
                
                //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                if (!(t$80573)) {
                    
                    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                    break;
                }
                
                //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final int t$80555 = i$80570;
                
                //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final long t$80556 = ((long)(((int)(t$80555))));
                
                //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final x10.compiler.ws.Worker alloc$80557 = ((x10.compiler.ws.Worker)(new x10.compiler.ws.Worker((java.lang.System[]) null)));
                
                //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final int t$80554 = i$80570;
                
                //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                alloc$80557.x10$compiler$ws$Worker$$init$S(t$80554, ((x10.core.Rail)(workers)), (x10.compiler.ws.Worker.__1$1x10$compiler$ws$Worker$2) null);
                
                //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                workers$value$80604[(int)t$80556]=alloc$80557;
                
                //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final int t$80558 = i$80570;
                
                //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final int t$80559 = ((t$80558) + (((int)(1))));
                
                //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                i$80570 = t$80559;
            }
        }
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final x10.compiler.ws.Worker t$80457 = ((x10.compiler.ws.Worker[])workers.value)[(int)0L];
        
        //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$80455 = x10.core.Thread.currentThread();
        
        //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$80456 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$80455,x10.lang.Runtime.Worker.$RTT);
        
        //#line 278 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Deque t$80458 = ((x10.core.Deque)(t$80456.wsfifo));
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        t$80457.fifo = ((x10.core.Deque)(t$80458));
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        int i$80574 = 1;
        {
            
            //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.compiler.ws.Worker[] workers$value$80605 = ((x10.compiler.ws.Worker[])workers.value);
            
            //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            for (;
                 true;
                 ) {
                
                //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final int t$80575 = i$80574;
                
                //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final int t$80576 = x10.lang.Runtime.get$NTHREADS();
                
                //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final boolean t$80577 = ((t$80575) < (((int)(t$80576))));
                
                //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                if (!(t$80577)) {
                    
                    //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                    break;
                }
                
                //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final int t$80560 = i$80574;
                
                //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final long t$80561 = ((long)(((int)(t$80560))));
                
                //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final x10.compiler.ws.Worker worker$80562 = ((x10.compiler.ws.Worker)workers$value$80605[(int)t$80561]);
                
                //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new x10.compiler.ws.Worker.$Closure$16(worker$80562))));
                
                //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final int t$80566 = i$80574;
                
                //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final int t$80567 = ((t$80566) + (((int)(1))));
                
                //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                i$80574 = t$80567;
            }
        }
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final x10.compiler.ws.Worker t$80470 = ((x10.compiler.ws.Worker[])workers.value)[(int)0L];
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        return t$80470;
    }
    
    
    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public static x10.compiler.ws.Worker start() {
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final x10.compiler.ws.Worker worker = x10.compiler.ws.Worker.startHere();
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        int i$80585 = 1;
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        for (;
             true;
             ) {
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final int t$80586 = i$80585;
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final long t$80587 = ((long)(((int)(t$80586))));
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final long t$80588 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final boolean t$80589 = ((t$80587) < (((long)(t$80588))));
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            if (!(t$80589)) {
                
                //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                break;
            }
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final int t$80578 = i$80585;
            
            //#line 143 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final long id$80579 = ((long)(((int)(t$80578))));
            
            //#line 143 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final x10.lang.Place alloc$80580 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
            
            //#line 143 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            alloc$80580.x10$lang$Place$$init$S(((long)(id$80579)));
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.lang.Place p$80581 = ((x10.lang.Place)(alloc$80580));
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            x10.lang.Runtime.runAsync(((x10.lang.Place)(p$80581)), ((x10.core.fun.VoidFun_0_0)(new x10.compiler.ws.Worker.$Closure$17())), ((x10.lang.Runtime.Profile)(null)));
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final int t$80583 = i$80585;
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final int t$80584 = ((t$80583) + (((int)(1))));
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            i$80585 = t$80584;
        }
        
        //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        return worker;
    }
    
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public static void main(final x10.compiler.ws.MainFrame frame) {
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final x10.compiler.ws.Worker worker = ((x10.compiler.ws.Worker)(x10.compiler.ws.Worker.start()));
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final x10.compiler.ws.FinishFrame ff = ((x10.compiler.ws.FinishFrame)(frame.ff));
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        boolean finalize = true;
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        try {{
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            frame.fast(((x10.compiler.ws.Worker)(worker)));
        }}catch (final x10.compiler.Abort t) {
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            finalize = false;
            
            //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            worker.run();
        }catch (final java.lang.RuntimeException t) {
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            ff.caught(((java.lang.RuntimeException)(t)));
        }finally {{
             
             //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
             final boolean t$80480 = finalize;
             
             //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
             if (t$80480) {
                 
                 //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                 x10.compiler.ws.Worker.stop();
             }
         }}
        
        //#line 116 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final x10.util.GrowableRail t$80592 = ((x10.util.GrowableRail)(ff.exceptions));
        
        //#line 116 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        final boolean t$80593 = ((null) != (t$80592));
        
        //#line 116 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        if (t$80593) {
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            while (true) {
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                final x10.util.GrowableRail this$80594 = ((x10.util.GrowableRail)(ff.exceptions));
                
                //#line 153 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long t$80595 = ((x10.util.GrowableRail<java.lang.RuntimeException>)this$80594).size;
                
                //#line 153 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final boolean t$80596 = ((long) t$80595) == ((long) 0L);
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                final boolean t$80597 = !(t$80596);
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                if (!(t$80597)) {
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                    break;
                }
                
                //#line 118 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                final x10.util.GrowableRail t$80590 = ((x10.util.GrowableRail)(ff.exceptions));
                
                //#line 118 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                final java.lang.RuntimeException t$80591 = ((x10.util.GrowableRail<java.lang.RuntimeException>)t$80590).removeLast$G();
                
                //#line 118 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(t$80591)));
            }
        }
        }
    
    
    //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    public void rethrow() {
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final java.lang.RuntimeException t$80488 = ((java.lang.RuntimeException)(throwable));
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final boolean t$80489 = ((null) != (t$80488));
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        if (t$80489) {
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final java.lang.RuntimeException t = ((java.lang.RuntimeException)(throwable));
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            this.throwable = null;
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            throw t;
        }
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    final public x10.compiler.ws.Worker x10$compiler$ws$Worker$$this$x10$compiler$ws$Worker() {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        return x10.compiler.ws.Worker.this;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    final public void __fieldInitializers_x10_compiler_ws_Worker() {
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final x10.core.Deque t$80490 = ((x10.core.Deque)(new x10.core.Deque()));
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        this.deque = ((x10.core.Deque)(t$80490));
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final x10.core.Deque t$80491 = ((x10.core.Deque)(deque));
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        this.fifo = t$80491;
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        final x10.util.concurrent.Lock t$80492 = ((x10.util.concurrent.Lock)(new x10.util.concurrent.Lock()));
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        this.lock = ((x10.util.concurrent.Lock)(t$80492));
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        this.throwable = null;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure_runAsyncAt extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure_runAsyncAt> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure_runAsyncAt> make($Closure_runAsyncAt.class,
                                                                 new x10.rtt.Type[] {
                                                                     x10.core.fun.VoidFun_0_0.$RTT
                                                                 });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.Worker.$Closure_runAsyncAt $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.frame = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.compiler.ws.Worker.$Closure_runAsyncAt $_obj = new x10.compiler.ws.Worker.$Closure_runAsyncAt((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.frame);
            
        }
        
        // constructor just for allocation
        public $Closure_runAsyncAt(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.core.Deque t$80428 = x10.lang.Runtime.wsFIFO();
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            t$80428.push(((java.lang.Object)(this.frame)));
        }
        
        public x10.compiler.ws.RegularFrame frame;
        
        public $Closure_runAsyncAt(final x10.compiler.ws.RegularFrame frame) {
             {
                this.frame = ((x10.compiler.ws.RegularFrame)(frame));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure_runAt extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure_runAt> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure_runAt> make($Closure_runAt.class,
                                                            new x10.rtt.Type[] {
                                                                x10.core.fun.VoidFun_0_0.$RTT
                                                            });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.Worker.$Closure_runAt $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.frame = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.compiler.ws.Worker.$Closure_runAt $_obj = new x10.compiler.ws.Worker.$Closure_runAt((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.frame);
            
        }
        
        // constructor just for allocation
        public $Closure_runAt(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            final x10.core.Deque t$80430 = x10.lang.Runtime.wsFIFO();
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            t$80430.push(((java.lang.Object)(this.frame)));
        }
        
        public x10.compiler.ws.RegularFrame frame;
        
        public $Closure_runAt(final x10.compiler.ws.RegularFrame frame) {
             {
                this.frame = ((x10.compiler.ws.RegularFrame)(frame));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure_stop extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure_stop> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure_stop> make($Closure_stop.class,
                                                           new x10.rtt.Type[] {
                                                               x10.core.fun.VoidFun_0_0.$RTT
                                                           });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.Worker.$Closure_stop $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.compiler.ws.Worker.$Closure_stop $_obj = new x10.compiler.ws.Worker.$Closure_stop((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure_stop(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            x10.lang.Runtime.wsEnd();
        }
        
        public $Closure_stop() {
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$16 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$16> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$16> make($Closure$16.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.Worker.$Closure$16 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.worker$80562 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.compiler.ws.Worker.$Closure$16 $_obj = new x10.compiler.ws.Worker.$Closure$16((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.worker$80562);
            
        }
        
        // constructor just for allocation
        public $Closure$16(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            try {{
                
                //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.core.Thread t$80563 = x10.core.Thread.currentThread();
                
                //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Worker t$80564 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$80563,x10.lang.Runtime.Worker.$RTT);
                
                //#line 278 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.core.Deque t$80565 = ((x10.core.Deque)(t$80564.wsfifo));
                
                //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                this.worker$80562.fifo = ((x10.core.Deque)(t$80565));
                
                //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                this.worker$80562.run();
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.compiler.ws.Worker worker$80562;
        
        public $Closure$16(final x10.compiler.ws.Worker worker$80562) {
             {
                this.worker$80562 = ((x10.compiler.ws.Worker)(worker$80562));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$17 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$17> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$17> make($Closure$17.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.Worker.$Closure$17 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.compiler.ws.Worker.$Closure$17 $_obj = new x10.compiler.ws.Worker.$Closure$17((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$17(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            try {{
                
                //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                final x10.compiler.ws.Worker t$80582 = x10.compiler.ws.Worker.startHere();
                
                //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                t$80582.run();
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public $Closure$17() {
             {
                
            }
        }
        
    }
    
    }
    
    