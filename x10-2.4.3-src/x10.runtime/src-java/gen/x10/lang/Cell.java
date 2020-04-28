package x10.lang;

@x10.runtime.impl.java.X10Generated
final public class Cell<$T> extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Cell> $RTT = 
        x10.rtt.NamedType.<Cell> make("x10.lang.Cell",
                                      Cell.class,
                                      1);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Cell<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.value = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.Cell $_obj = new x10.lang.Cell((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.value);
        
    }
    
    // constructor just for allocation
    public Cell(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.lang.Cell.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final Cell $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __0x10$lang$Cell$$T {}
    

    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    /**
     * The value stored in this cell.
     */
    public $T value;
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    // creation method for java code (1-phase java constructor)
    public Cell(final x10.rtt.Type $T, final $T x, __0x10$lang$Cell$$T $dummy) {
        this((java.lang.System[]) null, $T);
        x10$lang$Cell$$init$S(x, (x10.lang.Cell.__0x10$lang$Cell$$T) null);
    }
    
    // constructor for non-virtual call
    final public x10.lang.Cell<$T> x10$lang$Cell$$init$S(final $T x, __0x10$lang$Cell$$T $dummy) {
         {
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            final x10.lang.Cell this$96840 = this;
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            ((x10.lang.Cell<$T>)this).value = (($T)(x));
        }
        return this;
    }
    
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    public java.lang.String toString() {
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final $T t$96832 = (($T)(value));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final boolean t$96834 = ((t$96832) == (null));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        java.lang.String t$96835 =  null;
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        if (t$96834) {
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            t$96835 = "null";
        } else {
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            final $T t$96833 = (($T)(this.value));
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            t$96835 = x10.rtt.Types.toString(((java.lang.Object)(t$96833)));
        }
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final java.lang.String t$96836 = t$96835;
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final java.lang.String t$96837 = (("Cell(") + (t$96836));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final java.lang.String t$96838 = ((t$96837) + (")"));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        return t$96838;
    }
    
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    public $T $apply$G() {
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final $T t$96839 = (($T)(value));
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        return t$96839;
    }
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    public void $apply__0x10$lang$Cell$$T(final $T x) {
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ((x10.lang.Cell<$T>)this).value = (($T)(x));
    }
    
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    public void $set__0x10$lang$Cell$$T(final $T x) {
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final x10.lang.Cell this$96819 = ((x10.lang.Cell)(this));
        
        //#line 64 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final $T x$96818 = (($T)(x));
        
        //#line 64 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        $T ret$96820 =  null;
        
        //#line 64 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ((x10.lang.Cell<$T>)this$96819).value = (($T)(x$96818));
        
        //#line 64 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ret$96820 = (($T)(x$96818));
    }
    
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    public $T set__0x10$lang$Cell$$T$G(final $T x) {
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ((x10.lang.Cell<$T>)this).value = (($T)(x));
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        return x;
    }
    
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    public static <$T>x10.lang.Cell make__0x10$lang$Cell$$T(final x10.rtt.Type $T, final $T x) {
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final x10.lang.Cell alloc$96814 = ((x10.lang.Cell)(new x10.lang.Cell<$T>((java.lang.System[]) null, $T)));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final $T x$96822 = (($T)(x));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ((x10.lang.Cell<$T>)alloc$96814).value = (($T)(x$96822));
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        return alloc$96814;
    }
    
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    public static <$W>x10.lang.Cell $implicit_convert__0x10$lang$Cell$$W(final x10.rtt.Type $W, final $W x) {
        
        //#line 74 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final $W x$96826 = (($W)(x));
        
        //#line 74 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final x10.lang.Cell alloc$96827 = ((x10.lang.Cell)(new x10.lang.Cell<$W>((java.lang.System[]) null, $W)));
        
        //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final $W x$96828 = (($W)(x$96826));
        
        //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ((x10.lang.Cell<$W>)alloc$96827).value = (($W)(x$96828));
        
        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        return alloc$96827;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    final public x10.lang.Cell x10$lang$Cell$$this$x10$lang$Cell() {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        return x10.lang.Cell.this;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    final public void __fieldInitializers_x10_lang_Cell() {
        
    }
}

