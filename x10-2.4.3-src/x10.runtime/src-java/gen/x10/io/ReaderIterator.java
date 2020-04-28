package x10.io;


@x10.runtime.impl.java.X10Generated
public class ReaderIterator<$T> extends x10.core.Ref implements x10.lang.Iterator, x10.lang.Iterable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ReaderIterator> $RTT = 
        x10.rtt.NamedType.<ReaderIterator> make("x10.io.ReaderIterator",
                                                ReaderIterator.class,
                                                1,
                                                new x10.rtt.Type[] {
                                                    x10.rtt.ParameterizedType.make(x10.lang.Iterator.$RTT, x10.rtt.UnresolvedType.PARAM(0)),
                                                    x10.rtt.ParameterizedType.make(x10.lang.Iterable.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                                });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.ReaderIterator<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.r = $deserializer.readObject();
        $_obj.m = $deserializer.readObject();
        $_obj.next = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.ReaderIterator $_obj = new x10.io.ReaderIterator((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.r);
        $serializer.write(this.m);
        $serializer.write(this.next);
        
    }
    
    // constructor just for allocation
    public ReaderIterator(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.io.ReaderIterator.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final ReaderIterator $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __0$1x10$io$ReaderIterator$$T$2 {}
    

    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    public x10.io.Reader r;
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    public x10.io.Marshal<$T> m;
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    public $T next;
    
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    // creation method for java code (1-phase java constructor)
    public ReaderIterator(final x10.rtt.Type $T, final x10.io.Marshal<$T> m, final x10.io.Reader r, __0$1x10$io$ReaderIterator$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$io$ReaderIterator$$init$S(m, r, (x10.io.ReaderIterator.__0$1x10$io$ReaderIterator$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.io.ReaderIterator<$T> x10$io$ReaderIterator$$init$S(final x10.io.Marshal<$T> m, final x10.io.Reader r, __0$1x10$io$ReaderIterator$$T$2 $dummy) {
         {
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
            
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
            final x10.io.ReaderIterator this$91379 = this;
            
            //#line 32 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
            final $T t$91378 = (($T)(($T) x10.rtt.Types.zeroValue($T)));
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
            ((x10.io.ReaderIterator<$T>)this$91379).next = (($T)(t$91378));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
            ((x10.io.ReaderIterator<$T>)this).m = ((x10.io.Marshal)(m));
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
            ((x10.io.ReaderIterator<$T>)this).r = ((x10.io.Reader)(r));
        }
        return this;
    }
    
    
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    public x10.lang.Iterator iterator() {
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        return this;
    }
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    public $T next$G() {
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final boolean t$91369 = this.hasNext$O();
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final boolean t$91371 = !(t$91369);
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        if (t$91371) {
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
            final java.util.NoSuchElementException t$91370 = ((java.util.NoSuchElementException)(new java.util.NoSuchElementException()));
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
            throw t$91370;
        }
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final $T x = (($T)(next));
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final $T t$91372 = (($T)(($T) x10.rtt.Types.zeroValue($T)));
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        ((x10.io.ReaderIterator<$T>)this).next = (($T)(t$91372));
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        return x;
    }
    
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    public boolean hasNext$O() {
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final $T t$91373 = (($T)(next));
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final $T t$91374 = (($T)(($T) x10.rtt.Types.zeroValue($T)));
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final boolean t$91376 = x10.rtt.Equality.equalsequals((t$91373),(t$91374));
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        if (t$91376) {
            
            //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
            try {{
                
                //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
                final x10.io.Reader this$91367 = ((x10.io.Reader)(r));
                
                //#line 129 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
                final x10.io.Marshal m$91366 = ((x10.io.Marshal)(m));
                
                //#line 129 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
                final $T t$91375 = (($T)(((x10.io.Marshal<$T>)m$91366).read$G(((x10.io.Reader)(this$91367)))));
                
                //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
                ((x10.io.ReaderIterator<$T>)this).next = (($T)(t$91375));
            }}catch (final x10.io.IOException id$68) {
                
                //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
                return false;
            }
        }
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        return true;
    }
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    final public x10.io.ReaderIterator x10$io$ReaderIterator$$this$x10$io$ReaderIterator() {
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        return x10.io.ReaderIterator.this;
    }
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    final public void __fieldInitializers_x10_io_ReaderIterator() {
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final $T t$91377 = (($T)(($T) x10.rtt.Types.zeroValue($T)));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        ((x10.io.ReaderIterator<$T>)this).next = (($T)(t$91377));
    }
}

