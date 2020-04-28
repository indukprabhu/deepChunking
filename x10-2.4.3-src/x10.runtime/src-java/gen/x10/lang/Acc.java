package x10.lang;

@x10.runtime.impl.java.X10Generated
abstract public class Acc extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Acc> $RTT = 
        x10.rtt.NamedType.<Acc> make("x10.lang.Acc",
                                     Acc.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Acc $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Acc(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Acc.x10"
    abstract public void supply(final java.lang.Object t);
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Acc.x10"
    abstract public void reset(final java.lang.Object t);
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Acc.x10"
    abstract public java.lang.Object result();
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Acc.x10"
    abstract public java.lang.Object calcResult();
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Acc.x10"
    abstract public void acceptResult(final java.lang.Object a);
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Acc.x10"
    abstract public x10.core.GlobalRef getRoot();
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Acc.x10"
    abstract public x10.lang.Place home();
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Acc.x10"
    final public x10.lang.Acc x10$lang$Acc$$this$x10$lang$Acc() {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Acc.x10"
        return x10.lang.Acc.this;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Acc.x10"
    
    // constructor for non-virtual call
    final public x10.lang.Acc x10$lang$Acc$$init$S() {
         {
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Acc.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Acc.x10"
            final x10.lang.Acc this$91461 = this;
        }
        return this;
    }
    
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Acc.x10"
    final public void __fieldInitializers_x10_lang_Acc() {
        
    }
}

