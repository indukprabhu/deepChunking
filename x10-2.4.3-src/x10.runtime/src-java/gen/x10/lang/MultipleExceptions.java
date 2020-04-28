package x10.lang;


@x10.runtime.impl.java.X10Generated
public class MultipleExceptions extends java.lang.RuntimeException implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<MultipleExceptions> $RTT = 
        x10.rtt.NamedType.<MultipleExceptions> make("x10.lang.MultipleExceptions",
                                                    MultipleExceptions.class,
                                                    new x10.rtt.Type[] {
                                                        x10.rtt.Types.EXCEPTION
                                                    });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.MultipleExceptions $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $deserializer.deserializeFieldsStartingFromClass(java.lang.RuntimeException.class, $_obj, 0);
        $_obj.exceptions = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.MultipleExceptions $_obj = new x10.lang.MultipleExceptions((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.serializeFieldsStartingFromClass(this, java.lang.RuntimeException.class);
        $serializer.write(this.exceptions);
        
    }
    
    // constructor just for allocation
    public MultipleExceptions(final java.lang.System[] $dummy) {
        
    }
    
    // synthetic type for parameter mangling
    public static final class __0$1x10$lang$Exception$2 {}
    
    // properties
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    public x10.core.Rail<java.lang.RuntimeException> exceptions;
    

    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    final public x10.core.Rail exceptions() {
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
        final x10.core.Rail t$110682 = ((x10.core.Rail)(exceptions));
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
        return t$110682;
    }
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    public MultipleExceptions(final x10.util.GrowableRail<java.lang.RuntimeException> es, __0$1x10$lang$Exception$2 $dummy) {
        super();
         {
            
            //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
            this.exceptions = ((x10.core.Rail<java.lang.RuntimeException>)
                                ((x10.util.GrowableRail<java.lang.RuntimeException>)es).toRail());
            
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
            this.__fieldInitializers_x10_lang_MultipleExceptions();
        }
    }
    
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    public MultipleExceptions() {
        super();
         {
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
            this.exceptions = null;
            
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
            this.__fieldInitializers_x10_lang_MultipleExceptions();
        }
    }
    
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    public MultipleExceptions(final java.lang.RuntimeException t) {
        super();
         {
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
            this.exceptions = new x10.core.Rail<java.lang.RuntimeException>(x10.rtt.Types.EXCEPTION, ((long)(1L)), ((java.lang.RuntimeException)(t)), (x10.core.Rail.__1x10$lang$Rail$$T) null);
            
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
            this.__fieldInitializers_x10_lang_MultipleExceptions();
        }
    }
    
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    public void printStackTrace() {
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
        final x10.core.Rail rail$77839 = ((x10.core.Rail)(exceptions));
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
        final long size$77840 = ((x10.core.Rail<java.lang.RuntimeException>)rail$77839).size;
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
        long idx$110699 = 0L;
        {
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
            final java.lang.RuntimeException[] rail$77839$value$110702 = ((java.lang.RuntimeException[])rail$77839.value);
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
            for (;
                 true;
                 ) {
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
                final long t$110700 = idx$110699;
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
                final boolean t$110701 = ((t$110700) < (((long)(size$77840))));
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
                if (!(t$110701)) {
                    
                    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
                    break;
                }
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
                final long t$110695 = idx$110699;
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
                final java.lang.RuntimeException t$110696 = ((java.lang.RuntimeException)(((java.lang.RuntimeException)rail$77839$value$110702[(int)t$110695])));
                
                //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
                t$110696.printStackTrace();
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
                final long t$110697 = idx$110699;
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
                final long t$110698 = ((t$110697) + (((long)(1L))));
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
                idx$110699 = t$110698;
            }
        }
    }
    
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    public static x10.lang.MultipleExceptions make__0$1x10$lang$Exception$2(final x10.util.GrowableRail<java.lang.RuntimeException> es) {
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
        boolean t$110690 = ((null) == (es));
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
        if (!(t$110690)) {
            
            //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$110689 = ((x10.util.GrowableRail<java.lang.RuntimeException>)es).size;
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
            t$110690 = ((long) t$110689) == ((long) 0L);
        }
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
        final boolean t$110691 = t$110690;
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
        if (t$110691) {
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
            return null;
        }
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
        final x10.lang.MultipleExceptions t$110692 = ((x10.lang.MultipleExceptions)(new x10.lang.MultipleExceptions(((x10.util.GrowableRail<java.lang.RuntimeException>)(es)), (x10.lang.MultipleExceptions.__0$1x10$lang$Exception$2) null)));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
        return t$110692;
    }
    
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    public static x10.lang.MultipleExceptions make(final java.lang.RuntimeException t) {
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
        final boolean t$110693 = ((null) == (t));
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
        if (t$110693) {
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
            return null;
        }
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
        final x10.lang.MultipleExceptions t$110694 = ((x10.lang.MultipleExceptions)(new x10.lang.MultipleExceptions(((java.lang.RuntimeException)(t)))));
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
        return t$110694;
    }
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    final public x10.lang.MultipleExceptions x10$lang$MultipleExceptions$$this$x10$lang$MultipleExceptions() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
        return x10.lang.MultipleExceptions.this;
    }
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
    final public void __fieldInitializers_x10_lang_MultipleExceptions() {
        
    }
}

