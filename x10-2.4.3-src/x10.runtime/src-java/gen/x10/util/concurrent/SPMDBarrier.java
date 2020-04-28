package x10.util.concurrent;

@x10.runtime.impl.java.X10Generated
final public class SPMDBarrier extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<SPMDBarrier> $RTT = 
        x10.rtt.NamedType.<SPMDBarrier> make("x10.util.concurrent.SPMDBarrier",
                                             SPMDBarrier.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.concurrent.SPMDBarrier $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.alive = $deserializer.readObject();
        $_obj.workers = $deserializer.readObject();
        $_obj.index = $deserializer.readObject();
        $_obj.count = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.concurrent.SPMDBarrier $_obj = new x10.util.concurrent.SPMDBarrier((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.alive);
        $serializer.write(this.workers);
        $serializer.write(this.index);
        $serializer.write(this.count);
        
    }
    
    // constructor just for allocation
    public SPMDBarrier(final java.lang.System[] $dummy) {
        
    }
    
    
    // properties
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
    public int count;
    

    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
    public x10.core.concurrent.AtomicInteger alive;
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
    public x10.core.Rail<x10.lang.Runtime.Worker> workers;
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
    public x10.core.concurrent.AtomicInteger index;
    
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
    // creation method for java code (1-phase java constructor)
    public SPMDBarrier(final int count) {
        this((java.lang.System[]) null);
        x10$util$concurrent$SPMDBarrier$$init$S(count);
    }
    
    // constructor for non-virtual call
    final public x10.util.concurrent.SPMDBarrier x10$util$concurrent$SPMDBarrier$$init$S(final int count) {
         {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
            this.count = count;
            
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
            this.__fieldInitializers_x10_util_concurrent_SPMDBarrier();
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
            assert ((x10.lang.Runtime.get$NTHREADS()) >= (((int)(count)))): "SPMDBarrier constructor invoked with task count greater than Runtime.NTHREADS";
        }
        return this;
    }
    
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
    public void register() {
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        final x10.core.concurrent.AtomicInteger t$145697 = ((x10.core.concurrent.AtomicInteger)(index));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        final int i = t$145697.getAndIncrement();
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        assert ((i) < (((int)(count)))): "SPMDBarrier register invoked too many times";
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        final x10.core.Rail t$145699 = ((x10.core.Rail)(workers));
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        final long t$145700 = ((long)(((int)(i))));
        
        //#line 745 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$145698 = x10.core.Thread.currentThread();
        
        //#line 745 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$145701 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$145698,x10.lang.Runtime.Worker.$RTT);
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        ((x10.lang.Runtime.Worker[])t$145699.value)[(int)t$145700] = t$145701;
    }
    
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
    public void advance() {
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        final x10.core.concurrent.AtomicInteger t$145702 = ((x10.core.concurrent.AtomicInteger)(alive));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        final int t$145703 = t$145702.decrementAndGet();
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        final boolean t$145723 = ((int) t$145703) == ((int) 0);
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        if (t$145723) {
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
            final x10.core.concurrent.AtomicInteger t$145704 = ((x10.core.concurrent.AtomicInteger)(alive));
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
            final int t$145705 = count;
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
            t$145704.set(((int)(t$145705)));
            
            //#line 745 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Thread t$145706 = x10.core.Thread.currentThread();
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
            final x10.lang.Runtime.Worker me = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$145706,x10.lang.Runtime.Worker.$RTT);
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
            int i$145743 = 0;
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
            for (;
                 true;
                 ) {
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                final int t$145744 = i$145743;
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                final int t$145745 = count;
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                final boolean t$145746 = ((t$145744) < (((int)(t$145745))));
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                if (!(t$145746)) {
                    
                    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                    break;
                }
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                final x10.core.Rail t$145732 = ((x10.core.Rail)(workers));
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                final int t$145733 = i$145743;
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                final long t$145734 = ((long)(((int)(t$145733))));
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                final x10.lang.Runtime.Worker t$145735 = ((x10.lang.Runtime.Worker[])t$145732.value)[(int)t$145734];
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                final boolean t$145736 = (!x10.rtt.Equality.equalsequals((t$145735),(me)));
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                if (t$145736) {
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                    final x10.core.Rail t$145737 = ((x10.core.Rail)(workers));
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                    final int t$145738 = i$145743;
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                    final long t$145739 = ((long)(((int)(t$145738))));
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                    final x10.lang.Runtime.Worker this$145740 = ((x10.lang.Runtime.Worker[])t$145737.value)[(int)t$145739];
                    
                    //#line 625 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final boolean t$145730 = x10.lang.Runtime.get$STATIC_THREADS();
                    
                    //#line 625 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final boolean t$145731 = !(t$145730);
                    
                    //#line 625 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (t$145731) {
                        
                        //#line 626 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        this$145740./*non-virtual*/x10$lang$Thread$unpark$S();
                    }
                }
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                final int t$145741 = i$145743;
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                final int t$145742 = ((t$145741) + (((int)(1))));
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                i$145743 = t$145742;
            }
        } else {
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
            x10.lang.Runtime.Worker.park();
        }
    }
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
    final public x10.util.concurrent.SPMDBarrier x10$util$concurrent$SPMDBarrier$$this$x10$util$concurrent$SPMDBarrier() {
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        return x10.util.concurrent.SPMDBarrier.this;
    }
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
    final public void __fieldInitializers_x10_util_concurrent_SPMDBarrier() {
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        final int t$145724 = count;
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        final x10.core.concurrent.AtomicInteger t$145725 = ((x10.core.concurrent.AtomicInteger)(new x10.core.concurrent.AtomicInteger(((int)(t$145724)))));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        this.alive = ((x10.core.concurrent.AtomicInteger)(t$145725));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        final int t$145726 = count;
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        final long t$145727 = ((long)(((int)(t$145726))));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        final x10.core.Rail t$145728 = ((x10.core.Rail)(new x10.core.Rail<x10.lang.Runtime.Worker>(x10.lang.Runtime.Worker.$RTT, t$145727)));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        this.workers = ((x10.core.Rail)(t$145728));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        final x10.core.concurrent.AtomicInteger t$145729 = ((x10.core.concurrent.AtomicInteger)(new x10.core.concurrent.AtomicInteger(((int)(0)))));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        this.index = ((x10.core.concurrent.AtomicInteger)(t$145729));
    }
}

