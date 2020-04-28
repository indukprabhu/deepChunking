package x10.lang;

@x10.runtime.impl.java.X10Generated
public class StringHelper extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<StringHelper> $RTT = 
        x10.rtt.NamedType.<StringHelper> make("x10.lang.StringHelper",
                                              StringHelper.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.StringHelper $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.StringHelper $_obj = new x10.lang.StringHelper((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public StringHelper(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
    public static x10.core.Rail split(final java.lang.String delim, final java.lang.String str) {
        
        //#line 572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        final boolean t$114595 = (delim).equals("");
        
        //#line 572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        if (t$114595) {
            
            //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final int t$114587 = (str).length();
            
            //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final long t$114592 = ((long)(((int)(t$114587))));
            
            //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final x10.core.fun.Fun_0_1 t$114593 = ((x10.core.fun.Fun_0_1)(new x10.lang.StringHelper.$Closure$190(str)));
            
            //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final x10.core.Rail t$114594 = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, t$114592, ((x10.core.fun.Fun_0_1)(t$114593)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            return t$114594;
        }
        
        //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        final x10.util.GrowableRail ans = ((x10.util.GrowableRail)(new x10.util.GrowableRail<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING)));
        
        //#line 50 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ans.x10$util$GrowableRail$$init$S(((long)(0L)));
        
        //#line 576 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        int pos = 0;
        
        //#line 577 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        final int t$114596 = pos;
        
        //#line 577 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        int nextMatch = (str).indexOf(delim, ((int)(t$114596)));
        
        //#line 578 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        while (true) {
            
            //#line 578 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final int t$114597 = nextMatch;
            
            //#line 578 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final boolean t$114606 = ((int) t$114597) != ((int) -1);
            
            //#line 578 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            if (!(t$114606)) {
                
                //#line 578 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
                break;
            }
            
            //#line 579 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final int t$114614 = pos;
            
            //#line 579 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final int t$114615 = nextMatch;
            
            //#line 579 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final java.lang.String t$114616 = (str).substring(((int)(t$114614)), ((int)(t$114615)));
            
            //#line 579 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            ((x10.util.GrowableRail<java.lang.String>)ans).add__0x10$util$GrowableRail$$T(((java.lang.String)(t$114616)));
            
            //#line 580 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final int t$114617 = nextMatch;
            
            //#line 580 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final int t$114618 = (delim).length();
            
            //#line 580 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final int t$114619 = ((t$114617) + (((int)(t$114618))));
            
            //#line 580 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            pos = t$114619;
            
            //#line 581 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final int t$114620 = pos;
            
            //#line 581 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final int t$114621 = (str).indexOf(delim, ((int)(t$114620)));
            
            //#line 581 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            nextMatch = t$114621;
        }
        
        //#line 583 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        final int t$114607 = pos;
        
        //#line 583 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        final int t$114608 = (str).length();
        
        //#line 583 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        final boolean t$114612 = ((t$114607) < (((int)(t$114608))));
        
        //#line 583 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        if (t$114612) {
            
            //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final int t$114609 = pos;
            
            //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final int t$114610 = (str).length();
            
            //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final java.lang.String t$114611 = (str).substring(((int)(t$114609)), ((int)(t$114610)));
            
            //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            ((x10.util.GrowableRail<java.lang.String>)ans).add__0x10$util$GrowableRail$$T(((java.lang.String)(t$114611)));
        }
        
        //#line 586 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        final x10.core.Rail t$114613 = ((x10.core.Rail<java.lang.String>)
                                         ((x10.util.GrowableRail<java.lang.String>)ans).toRail());
        
        //#line 586 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        return t$114613;
    }
    
    
    //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
    final public x10.lang.StringHelper x10$lang$StringHelper$$this$x10$lang$StringHelper() {
        
        //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
        return x10.lang.StringHelper.this;
    }
    
    
    //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
    // creation method for java code (1-phase java constructor)
    public StringHelper() {
        this((java.lang.System[]) null);
        x10$lang$StringHelper$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.lang.StringHelper x10$lang$StringHelper$$init$S() {
         {
            
            //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            
            
            //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final x10.lang.StringHelper this$114584 = this;
        }
        return this;
    }
    
    
    
    //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
    final public void __fieldInitializers_x10_lang_StringHelper() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$190 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$190> $RTT = 
            x10.rtt.StaticFunType.<$Closure$190> make($Closure$190.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.STRING)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.StringHelper.$Closure$190 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.str = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.StringHelper.$Closure$190 $_obj = new x10.lang.StringHelper.$Closure$190((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.str);
            
        }
        
        // constructor just for allocation
        public $Closure$190(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public java.lang.String $apply(final long i) {
            
            //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final int t$114589 = ((int)(long)(((long)(i))));
            
            //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final long t$114588 = ((i) + (((long)(1L))));
            
            //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final int t$114590 = ((int)(long)(((long)(t$114588))));
            
            //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            final java.lang.String t$114591 = (this.str).substring(((int)(t$114589)), ((int)(t$114590)));
            
            //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/String.x10"
            return t$114591;
        }
        
        public java.lang.String str;
        
        public $Closure$190(final java.lang.String str) {
             {
                this.str = ((java.lang.String)(str));
            }
        }
        
    }
    
}

