package x10.compiler.ws;


@x10.runtime.impl.java.X10Generated
abstract public class CollectingFinish<$T> extends x10.compiler.ws.FinishFrame implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<CollectingFinish> $RTT = 
        x10.rtt.NamedType.<CollectingFinish> make("x10.compiler.ws.CollectingFinish",
                                                  CollectingFinish.class,
                                                  1,
                                                  new x10.rtt.Type[] {
                                                      x10.compiler.ws.FinishFrame.$RTT
                                                  });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.CollectingFinish<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.compiler.ws.FinishFrame.$_deserialize_body($_obj, $deserializer);
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.reducer = $deserializer.readObject();
        $_obj.resultRail = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.$T);
        $serializer.write(this.reducer);
        $serializer.write(this.resultRail);
        
    }
    
    // constructor just for allocation
    public CollectingFinish(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        super($dummy);
        x10.compiler.ws.CollectingFinish.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final CollectingFinish $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __1$1x10$compiler$ws$CollectingFinish$$T$2 {}
    

    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    public x10.lang.Reducible<$T> reducer;
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    public x10.core.Rail<$T> resultRail;
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    
    // constructor for non-virtual call
    final public x10.compiler.ws.CollectingFinish<$T> x10$compiler$ws$CollectingFinish$$init$S(final x10.compiler.ws.Frame up, final x10.lang.Reducible<$T> rd, __1$1x10$compiler$ws$CollectingFinish$$T$2 $dummy) {
         {
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            /*super.*/x10$compiler$ws$FinishFrame$$init$S(((x10.compiler.ws.Frame)(up)));
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            final x10.compiler.ws.CollectingFinish this$77819 = this;
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            ((x10.compiler.ws.CollectingFinish<$T>)this).reducer = ((x10.lang.Reducible)(rd));
            {
                
                //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                final int size = x10.lang.Runtime.get$NTHREADS();
                
                //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                final long t$77776 = ((long)(((int)(size))));
                
                //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                final x10.core.Rail t$77777 = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(t$77776)), false)));
                
                //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                ((x10.compiler.ws.CollectingFinish<$T>)this).resultRail = ((x10.core.Rail)(t$77777));
                {
                    
                    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                    int i = 0;
                    
                    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                        final int t$77779 = i;
                        
                        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                        final boolean t$77787 = ((t$77779) < (((int)(size))));
                        
                        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                        if (!(t$77787)) {
                            
                            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                            break;
                        }
                        
                        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                        final x10.core.Rail t$77812 = ((x10.core.Rail)(resultRail));
                        
                        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                        final int t$77813 = i;
                        
                        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                        final long t$77814 = ((long)(((int)(t$77813))));
                        
                        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                        final x10.lang.Reducible t$77815 = ((x10.lang.Reducible)(reducer));
                        
                        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                        final $T t$77816 = (($T)(((x10.lang.Reducible<$T>)t$77815).zero$G()));
                        
                        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                        ((x10.core.Rail<$T>)t$77812).$set__1x10$lang$Rail$$T$G((long)(t$77814), (($T)(t$77816)));
                        
                        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                        final int t$77817 = i;
                        
                        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                        final int t$77818 = ((t$77817) + (((int)(1))));
                        
                        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                        i = t$77818;
                    }
                }
            }
        }
        return this;
    }
    
    
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    final public void accept__0x10$compiler$ws$CollectingFinish$$T(final $T t, final x10.compiler.ws.Worker worker) {
        {
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            final int id = worker.id;
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            final x10.core.Rail t$77792 = ((x10.core.Rail)(resultRail));
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            final long t$77793 = ((long)(((int)(id))));
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            final x10.lang.Reducible t$77790 = ((x10.lang.Reducible)(reducer));
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            final x10.core.Rail t$77788 = ((x10.core.Rail)(resultRail));
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            final long t$77789 = ((long)(((int)(id))));
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            final $T t$77791 = (($T)(((x10.core.Rail<$T>)t$77788).$apply$G((long)(t$77789))));
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            final $T t$77794 = (($T)((($T)
                                       ((x10.lang.Reducible<$T>)t$77790).$apply((($T)(t$77791)), $T, (($T)(t)), $T))));
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            ((x10.core.Rail<$T>)t$77792).$set__1x10$lang$Rail$$T$G((long)(t$77793), (($T)(t$77794)));
        }
    }
    
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    final public $T fastResult$G(final x10.compiler.ws.Worker worker) {
        {
            
            //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            final x10.core.Rail t$77796 = ((x10.core.Rail)(resultRail));
            
            //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            final int t$77795 = worker.id;
            
            //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            final long t$77797 = ((long)(((int)(t$77795))));
            
            //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            final $T result = (($T)(((x10.core.Rail<$T>)t$77796).$apply$G((long)(t$77797))));
            
            //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
            final x10.core.Rail o$77770 = ((x10.core.Rail)(resultRail));
            {
                
            }
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            return result;
        }
    }
    
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    final public $T result$G() {
        {
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            final x10.core.Rail t$77798 = ((x10.core.Rail)(resultRail));
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            $T result = (($T)(((x10.core.Rail<$T>)t$77798).$apply$G((long)(0L))));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            final int size = x10.lang.Runtime.get$NTHREADS();
            {
                
                //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                int i = 1;
                
                //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                    final int t$77800 = i;
                    
                    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                    final boolean t$77810 = ((t$77800) < (((int)(size))));
                    
                    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                    if (!(t$77810)) {
                        
                        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                        break;
                    }
                    
                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                    final x10.lang.Reducible t$77820 = ((x10.lang.Reducible)(reducer));
                    
                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                    final $T t$77821 = (($T)(result));
                    
                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                    final x10.core.Rail t$77822 = ((x10.core.Rail)(resultRail));
                    
                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                    final int t$77823 = i;
                    
                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                    final long t$77824 = ((long)(((int)(t$77823))));
                    
                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                    final $T t$77825 = (($T)(((x10.core.Rail<$T>)t$77822).$apply$G((long)(t$77824))));
                    
                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                    final $T t$77826 = (($T)((($T)
                                               ((x10.lang.Reducible<$T>)t$77820).$apply((($T)(t$77821)), $T, (($T)(t$77825)), $T))));
                    
                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                    result = (($T)(t$77826));
                    
                    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                    final int t$77827 = i;
                    
                    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                    final int t$77828 = ((t$77827) + (((int)(1))));
                    
                    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
                    i = t$77828;
                }
            }
            
            //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
            final x10.core.Rail o$77773 = ((x10.core.Rail)(resultRail));
            {
                
            }
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            final $T t$77811 = (($T)(result));
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
            return t$77811;
        }
    }
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    final public x10.compiler.ws.CollectingFinish x10$compiler$ws$CollectingFinish$$this$x10$compiler$ws$CollectingFinish() {
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
        return x10.compiler.ws.CollectingFinish.this;
    }
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/CollectingFinish.x10"
    final public void __fieldInitializers_x10_compiler_ws_CollectingFinish() {
        
    }
}

