package x10.lang;


@x10.runtime.impl.java.X10Generated
final public class Clock extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Clock> $RTT = 
        x10.rtt.NamedType.<Clock> make("x10.lang.Clock",
                                       Clock.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Clock $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.root = $deserializer.readObject();
        $_obj.name = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.Clock $_obj = new x10.lang.Clock((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.root);
        $serializer.write(this.name);
        
    }
    
    // constructor just for allocation
    public Clock(final java.lang.System[] $dummy) {
        
    }
    
    
    // properties
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public java.lang.String name;
    

    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public x10.core.GlobalRef<x10.lang.Clock> root;
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public boolean equals(final java.lang.Object a) {
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        boolean t$96856 = ((a) == (null));
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        if (!(t$96856)) {
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            final boolean t$96855 = x10.lang.Clock.$RTT.isInstance(a);
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            t$96856 = !(t$96855);
        }
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96857 = t$96856;
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        if (t$96857) {
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            return false;
        }
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Clock t$96858 = ((x10.lang.Clock)(x10.rtt.Types.<x10.lang.Clock> cast(a,x10.lang.Clock.$RTT)));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.core.GlobalRef t$96859 = ((x10.core.GlobalRef)(t$96858.root));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.core.GlobalRef t$96860 = ((x10.core.GlobalRef)(this.root));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96861 = x10.rtt.Equality.equalsequals((t$96859),(t$96860));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        return t$96861;
    }
    
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public int hashCode() {
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.core.GlobalRef t$96862 = ((x10.core.GlobalRef)(root));
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final int t$96863 = (((x10.core.GlobalRef<x10.lang.Clock>)(t$96862))).hashCode();
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        return t$96863;
    }
    
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public static x10.lang.Clock make() {
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Clock t$96864 = x10.lang.Clock.make(((java.lang.String)("")));
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        return t$96864;
    }
    
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public static x10.lang.Clock make(final java.lang.String name) {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96866 = x10.lang.Runtime.get$STATIC_THREADS();
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        if (t$96866) {
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            final x10.lang.ClockUseException t$96865 = ((x10.lang.ClockUseException)(new x10.lang.ClockUseException(((java.lang.String)("Clocks are not compatible with static threads.")))));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            throw t$96865;
        }
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Clock clock = ((x10.lang.Clock)(new x10.lang.Clock((java.lang.System[]) null)));
        
        //#line 51 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final java.lang.String name$96847 = ((java.lang.String)(name));
        
        //#line 52 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        clock.name = name$96847;
        
        //#line 26 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        clock.__fieldInitializers_x10_lang_Clock();
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Activity t$96867 = x10.lang.Runtime.activity();
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Activity.ClockPhases t$96868 = t$96867.clockPhases();
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        ((x10.util.HashMap<x10.lang.Clock, x10.core.Int>)t$96868).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((x10.lang.Clock)(clock)), x10.core.Int.$box(1));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        return clock;
    }
    
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    final public static int FIRST_PHASE = 1;
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public transient int count;
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public transient int alive;
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public transient int phase;
    
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    // creation method for java code (1-phase java constructor)
    public Clock(final java.lang.String name) {
        this((java.lang.System[]) null);
        x10$lang$Clock$$init$S(name);
    }
    
    // constructor for non-virtual call
    final public x10.lang.Clock x10$lang$Clock$$init$S(final java.lang.String name) {
         {
            
            //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            this.name = name;
            
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            this.__fieldInitializers_x10_lang_Clock();
        }
        return this;
    }
    
    
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    private void resumeLocal() {
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        try {{
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            x10.lang.Runtime.enterAtomic();
            {
                
                //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final int t$96869 = this.alive;
                
                //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final int t$96870 = ((t$96869) - (((int)(1))));
                
                //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final int t$96871 = this.alive = t$96870;
                
                //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final boolean t$96875 = ((int) t$96871) == ((int) 0);
                
                //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                if (t$96875) {
                    
                    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    final int t$96872 = count;
                    
                    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    this.alive = t$96872;
                    
                    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    final int t$96873 = this.phase;
                    
                    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    final int t$96874 = ((t$96873) + (((int)(1))));
                    
                    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    this.phase = t$96874;
                }
            }
        }}finally {{
              
              //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
              x10.lang.Runtime.exitAtomic();
          }}
        }
    
    public static void resumeLocal$P(final x10.lang.Clock Clock) {
        Clock.resumeLocal();
    }
    
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    private void dropLocal(final int ph) {
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        try {{
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            x10.lang.Runtime.enterAtomic();
            {
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final int t$96876 = this.count;
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final int t$96877 = ((t$96876) - (((int)(1))));
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                this.count = t$96877;
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final int t$96878 = (-(ph));
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final int t$96879 = phase;
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final boolean t$96887 = ((int) t$96878) != ((int) t$96879);
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                if (t$96887) {
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    final int t$96880 = this.alive;
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    final int t$96881 = ((t$96880) - (((int)(1))));
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    final int t$96882 = this.alive = t$96881;
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    final boolean t$96886 = ((int) t$96882) == ((int) 0);
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    if (t$96886) {
                        
                        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                        final int t$96883 = count;
                        
                        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                        this.alive = t$96883;
                        
                        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                        final int t$96884 = this.phase;
                        
                        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                        final int t$96885 = ((t$96884) + (((int)(1))));
                        
                        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                        this.phase = t$96885;
                    }
                }
            }
        }}finally {{
              
              //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
              x10.lang.Runtime.exitAtomic();
          }}
        }
    
    public static void dropLocal$P(final int ph, final x10.lang.Clock Clock) {
        Clock.dropLocal((int)(ph));
    }
    
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    private int get$O() {
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Activity t$96888 = x10.lang.Runtime.activity();
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Activity.ClockPhases t$96889 = t$96888.clockPhases();
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.util.Box t$96890 = ((x10.util.HashMap<x10.lang.Clock, x10.core.Int>)t$96889).get__0x10$util$HashMap$$K(((x10.lang.Clock)(this)));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final int t$96891 = x10.core.Int.$unbox(((x10.util.Box<x10.core.Int>)t$96890).value);
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        return t$96891;
    }
    
    public static int get$P(final x10.lang.Clock Clock) {
        return Clock.get$O();
    }
    
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    private x10.util.Box put(final int ph) {
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Activity t$96892 = x10.lang.Runtime.activity();
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Activity.ClockPhases t$96893 = t$96892.clockPhases();
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.util.Box t$96894 = ((x10.util.HashMap<x10.lang.Clock, x10.core.Int>)t$96893).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((x10.lang.Clock)(this)), x10.core.Int.$box(ph));
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        return t$96894;
    }
    
    public static x10.util.Box put$P(final int ph, final x10.lang.Clock Clock) {
        return Clock.put((int)(ph));
    }
    
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    private int remove$O() {
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Activity t$96895 = x10.lang.Runtime.activity();
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Activity.ClockPhases t$96896 = t$96895.clockPhases();
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.util.Box t$96897 = ((x10.util.HashMap<x10.lang.Clock, x10.core.Int>)t$96896).remove__0x10$util$HashMap$$K(((x10.lang.Clock)(this)));
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final int t$96898 = x10.core.Int.$unbox(((x10.util.Box<x10.core.Int>)t$96897).value);
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        return t$96898;
    }
    
    public static int remove$P$O(final x10.lang.Clock Clock) {
        return Clock.remove$O();
    }
    
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public int register$O() {
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Clock this$96849 = ((x10.lang.Clock)(this));
        
        //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96899 = this$96849.registered$O();
        
        //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96900 = !(t$96899);
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        if (t$96900) {
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            this.clockUseException(((java.lang.String)("async clocked")));
        }
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final int ph = this.get$O();
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.core.GlobalRef t$96901 = ((x10.core.GlobalRef)(root));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Place t$96910 = ((x10.lang.Place)((t$96901).home));
        {
            
            //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            x10.lang.Runtime.runAt(((x10.lang.Place)(t$96910)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.Clock.$Closure$66(this, root, ph, (x10.lang.Clock.$Closure$66.__1$1x10$lang$Clock$2) null))), ((x10.lang.Runtime.Profile)(null)));
        }
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        return ph;
    }
    
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public void resumeUnsafe() {
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        x10.lang.Runtime.ensureNotInAtomic();
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final int ph = this.get$O();
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final long t$96911 = ((long)(((int)(ph))));
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96912 = ((t$96911) < (((long)(0L))));
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        if (t$96912) {
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            return;
        }
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.core.GlobalRef t$96913 = ((x10.core.GlobalRef)(root));
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Place t$96915 = ((x10.lang.Place)((t$96913).home));
        {
            
            //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            x10.lang.Runtime.runAt(((x10.lang.Place)(t$96915)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.Clock.$Closure$67(this, root, (x10.lang.Clock.$Closure$67.__1$1x10$lang$Clock$2) null))), ((x10.lang.Runtime.Profile)(null)));
        }
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final int t$96916 = (-(ph));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        this.put((int)(t$96916));
    }
    
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public void advanceUnsafe() {
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        x10.lang.Runtime.ensureNotInAtomic();
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final int ph = this.get$O();
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final int abs = java.lang.Math.abs(((int)(ph)));
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.core.GlobalRef t$96917 = ((x10.core.GlobalRef)(root));
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Place t$96921 = ((x10.lang.Place)((t$96917).home));
        {
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            x10.lang.Runtime.runAt(((x10.lang.Place)(t$96921)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.Clock.$Closure$68(this, root, ph, abs, (x10.lang.Clock.$Closure$68.__1$1x10$lang$Clock$2) null))), ((x10.lang.Runtime.Profile)(null)));
        }
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final int t$96922 = ((abs) + (((int)(1))));
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        this.put((int)(t$96922));
    }
    
    
    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public void dropUnsafe() {
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final int ph = this.remove$O();
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.core.GlobalRef t$96923 = ((x10.core.GlobalRef)(root));
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Place t$96925 = ((x10.lang.Place)((t$96923).home));
        {
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            x10.lang.Runtime.runAt(((x10.lang.Place)(t$96925)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.Clock.$Closure$69(this, root, ph, (x10.lang.Clock.$Closure$69.__1$1x10$lang$Clock$2) null))), ((x10.lang.Runtime.Profile)(null)));
        }
    }
    
    
    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public void dropInternal() {
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final int ph = this.get$O();
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.core.GlobalRef t$96926 = ((x10.core.GlobalRef)(root));
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Place t$96928 = ((x10.lang.Place)((t$96926).home));
        {
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            x10.lang.Runtime.runAt(((x10.lang.Place)(t$96928)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.Clock.$Closure$70(this, root, ph, (x10.lang.Clock.$Closure$70.__1$1x10$lang$Clock$2) null))), ((x10.lang.Runtime.Profile)(null)));
        }
    }
    
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public boolean registered$O() {
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Activity t$96929 = x10.lang.Runtime.activity();
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Activity.ClockPhases t$96930 = t$96929.clockPhases();
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96931 = ((x10.util.HashMap<x10.lang.Clock, x10.core.Int>)t$96930).containsKey__0x10$util$HashMap$$K$O(((x10.lang.Clock)(this)));
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        return t$96931;
    }
    
    
    //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public boolean dropped$O() {
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96932 = this.registered$O();
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96933 = !(t$96932);
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        return t$96933;
    }
    
    
    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public int phase$O() {
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Clock this$96850 = ((x10.lang.Clock)(this));
        
        //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96934 = this$96850.registered$O();
        
        //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96935 = !(t$96934);
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        if (t$96935) {
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            this.clockUseException(((java.lang.String)("phase")));
        }
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final int t$96936 = this.get$O();
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final int t$96937 = java.lang.Math.abs(((int)(t$96936)));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        return t$96937;
    }
    
    
    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public void resume() {
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Clock this$96851 = ((x10.lang.Clock)(this));
        
        //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96938 = this$96851.registered$O();
        
        //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96939 = !(t$96938);
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        if (t$96939) {
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            this.clockUseException(((java.lang.String)("resume")));
        }
        
        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        this.resumeUnsafe();
    }
    
    
    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public void advance() {
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Clock this$96852 = ((x10.lang.Clock)(this));
        
        //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96940 = this$96852.registered$O();
        
        //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96941 = !(t$96940);
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        if (t$96941) {
            
            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            this.clockUseException(((java.lang.String)("advance")));
        }
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        this.advanceUnsafe();
    }
    
    
    //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public void drop() {
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Clock this$96853 = ((x10.lang.Clock)(this));
        
        //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96942 = this$96853.registered$O();
        
        //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96943 = !(t$96942);
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        if (t$96943) {
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            this.clockUseException(((java.lang.String)("drop")));
        }
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        this.dropUnsafe();
    }
    
    
    //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public java.lang.String toString() {
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final java.lang.String t$96944 = ((java.lang.String)(name));
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96945 = (t$96944).equals("");
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        java.lang.String t$96946 =  null;
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        if (t$96945) {
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            t$96946 = x10.lang.System.identityToString(((java.lang.Object)(this)));
        } else {
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            t$96946 = name;
        }
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final java.lang.String t$96947 = t$96946;
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        return t$96947;
    }
    
    
    //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    private void clockUseException(final java.lang.String method) {
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Clock this$96854 = ((x10.lang.Clock)(this));
        
        //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96948 = this$96854.registered$O();
        
        //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final boolean t$96955 = !(t$96948);
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        if (t$96955) {
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            final java.lang.String t$96949 = (("invalid invocation of ") + (method));
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            final java.lang.String t$96950 = ((t$96949) + ("() on clock "));
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            final java.lang.String t$96951 = this.toString();
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            final java.lang.String t$96952 = ((t$96950) + (t$96951));
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            final java.lang.String t$96953 = ((t$96952) + ("; calling activity is not clocked on this clock"));
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            final x10.lang.ClockUseException t$96954 = ((x10.lang.ClockUseException)(new x10.lang.ClockUseException(t$96953)));
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            throw t$96954;
        }
    }
    
    public static void clockUseException$P(final java.lang.String method, final x10.lang.Clock Clock) {
        Clock.clockUseException(((java.lang.String)(method)));
    }
    
    
    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public static void advanceAll() {
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        x10.lang.Runtime.ensureNotInAtomic();
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Activity t$96956 = x10.lang.Runtime.activity();
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Activity.ClockPhases t$96957 = t$96956.clockPhases();
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        t$96957.advanceAll();
    }
    
    
    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    public static void resumeAll() {
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Activity t$96958 = x10.lang.Runtime.activity();
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.lang.Activity.ClockPhases t$96959 = t$96958.clockPhases();
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        t$96959.resumeAll();
    }
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    final public x10.lang.Clock x10$lang$Clock$$this$x10$lang$Clock() {
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        return x10.lang.Clock.this;
    }
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    final public void __fieldInitializers_x10_lang_Clock() {
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        final x10.core.GlobalRef t$96960 = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.lang.Clock>(x10.lang.Clock.$RTT, ((x10.lang.Clock)(this)), (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        this.root = ((x10.core.GlobalRef)(t$96960));
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        this.count = 1;
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        this.alive = 1;
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        this.phase = 1;
    }
    
    public static int get$FIRST_PHASE() {
        return x10.lang.Clock.FIRST_PHASE;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$66 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$66> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$66> make($Closure$66.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Clock.$Closure$66 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.root = $deserializer.readObject();
            $_obj.ph = $deserializer.readInt();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Clock.$Closure$66 $_obj = new x10.lang.Clock.$Closure$66((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.root);
            $serializer.write(this.ph);
            
        }
        
        // constructor just for allocation
        public $Closure$66(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$lang$Clock$2 {}
        
    
        
        public void $apply() {
            
            //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            try {{
                
                //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final x10.core.GlobalRef t$96902 = ((x10.core.GlobalRef)(this.root));
                
                //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final x10.lang.Clock me = (((x10.core.GlobalRef<x10.lang.Clock>)(t$96902))).$apply$G();
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                try {{
                    
                    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    x10.lang.Runtime.enterAtomic();
                    {
                        
                        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                        final int t$96903 = me.count;
                        
                        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                        final int t$96904 = ((t$96903) + (((int)(1))));
                        
                        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                        me.count = t$96904;
                        
                        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                        final int t$96905 = (-(this.ph));
                        
                        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                        final int t$96906 = me.phase;
                        
                        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                        final boolean t$96909 = ((int) t$96905) != ((int) t$96906);
                        
                        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                        if (t$96909) {
                            
                            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                            final int t$96907 = me.alive;
                            
                            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                            final int t$96908 = ((t$96907) + (((int)(1))));
                            
                            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                            me.alive = t$96908;
                        }
                    }
                }}finally {{
                      
                      //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                      x10.lang.Runtime.exitAtomic();
                  }}
                }}catch (java.lang.Throwable __lowerer__var__0__) {
                    
                    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
                }
            }
        
        public x10.lang.Clock out$$;
        public x10.core.GlobalRef<x10.lang.Clock> root;
        public int ph;
        
        public $Closure$66(final x10.lang.Clock out$$, final x10.core.GlobalRef<x10.lang.Clock> root, final int ph, __1$1x10$lang$Clock$2 $dummy) {
             {
                this.out$$ = out$$;
                this.root = ((x10.core.GlobalRef)(root));
                this.ph = ph;
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$67 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$67> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$67> make($Closure$67.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Clock.$Closure$67 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.root = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Clock.$Closure$67 $_obj = new x10.lang.Clock.$Closure$67((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.root);
            
        }
        
        // constructor just for allocation
        public $Closure$67(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$lang$Clock$2 {}
        
    
        
        public void $apply() {
            
            //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            try {{
                
                //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final x10.core.GlobalRef t$96914 = ((x10.core.GlobalRef)(this.root));
                
                //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final x10.lang.Clock me = (((x10.core.GlobalRef<x10.lang.Clock>)(t$96914))).$apply$G();
                
                //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                me.resumeLocal();
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.lang.Clock out$$;
        public x10.core.GlobalRef<x10.lang.Clock> root;
        
        public $Closure$67(final x10.lang.Clock out$$, final x10.core.GlobalRef<x10.lang.Clock> root, __1$1x10$lang$Clock$2 $dummy) {
             {
                this.out$$ = out$$;
                this.root = ((x10.core.GlobalRef)(root));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$68 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$68> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$68> make($Closure$68.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Clock.$Closure$68 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.root = $deserializer.readObject();
            $_obj.ph = $deserializer.readInt();
            $_obj.abs = $deserializer.readInt();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Clock.$Closure$68 $_obj = new x10.lang.Clock.$Closure$68((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.root);
            $serializer.write(this.ph);
            $serializer.write(this.abs);
            
        }
        
        // constructor just for allocation
        public $Closure$68(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$lang$Clock$2 {}
        
    
        
        public void $apply() {
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            try {{
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final x10.core.GlobalRef t$96918 = ((x10.core.GlobalRef)(this.root));
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final x10.lang.Clock me = (((x10.core.GlobalRef<x10.lang.Clock>)(t$96918))).$apply$G();
                
                //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final long t$96919 = ((long)(((int)(this.ph))));
                
                //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final boolean t$96920 = ((t$96919) > (((long)(0L))));
                
                //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                if (t$96920) {
                    
                    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    me.resumeLocal();
                }
                {
                    
                    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    x10.lang.Runtime.ensureNotInAtomic();
                    
                    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    try {{
                        
                        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                        x10.lang.Runtime.enterAtomic();
                        
                        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                        while (true) {
                            
                            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                            if (((this.abs) < (((int)(me.phase))))) {
                                {
                                    
                                }
                                
                                //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                                break;
                            }
                            
                            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                            x10.lang.Runtime.awaitAtomic();
                        }
                    }}finally {{
                          
                          //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                          x10.lang.Runtime.exitAtomic();
                      }}
                    }
                }}catch (java.lang.Throwable __lowerer__var__0__) {
                    
                    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
                }
            }
        
        public x10.lang.Clock out$$;
        public x10.core.GlobalRef<x10.lang.Clock> root;
        public int ph;
        public int abs;
        
        public $Closure$68(final x10.lang.Clock out$$, final x10.core.GlobalRef<x10.lang.Clock> root, final int ph, final int abs, __1$1x10$lang$Clock$2 $dummy) {
             {
                this.out$$ = out$$;
                this.root = ((x10.core.GlobalRef)(root));
                this.ph = ph;
                this.abs = abs;
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$69 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$69> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$69> make($Closure$69.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Clock.$Closure$69 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.root = $deserializer.readObject();
            $_obj.ph = $deserializer.readInt();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Clock.$Closure$69 $_obj = new x10.lang.Clock.$Closure$69((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.root);
            $serializer.write(this.ph);
            
        }
        
        // constructor just for allocation
        public $Closure$69(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$lang$Clock$2 {}
        
    
        
        public void $apply() {
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            try {{
                
                //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final x10.core.GlobalRef t$96924 = ((x10.core.GlobalRef)(this.root));
                
                //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final x10.lang.Clock me = (((x10.core.GlobalRef<x10.lang.Clock>)(t$96924))).$apply$G();
                
                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                me.dropLocal((int)(this.ph));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.lang.Clock out$$;
        public x10.core.GlobalRef<x10.lang.Clock> root;
        public int ph;
        
        public $Closure$69(final x10.lang.Clock out$$, final x10.core.GlobalRef<x10.lang.Clock> root, final int ph, __1$1x10$lang$Clock$2 $dummy) {
             {
                this.out$$ = out$$;
                this.root = ((x10.core.GlobalRef)(root));
                this.ph = ph;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$70 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$70> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$70> make($Closure$70.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Clock.$Closure$70 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.root = $deserializer.readObject();
            $_obj.ph = $deserializer.readInt();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Clock.$Closure$70 $_obj = new x10.lang.Clock.$Closure$70((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.root);
            $serializer.write(this.ph);
            
        }
        
        // constructor just for allocation
        public $Closure$70(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$lang$Clock$2 {}
        
    
        
        public void $apply() {
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            try {{
                
                //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final x10.core.GlobalRef t$96927 = ((x10.core.GlobalRef)(this.root));
                
                //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                final x10.lang.Clock me = (((x10.core.GlobalRef<x10.lang.Clock>)(t$96927))).$apply$G();
                
                //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                me.dropLocal((int)(this.ph));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.lang.Clock out$$;
        public x10.core.GlobalRef<x10.lang.Clock> root;
        public int ph;
        
        public $Closure$70(final x10.lang.Clock out$$, final x10.core.GlobalRef<x10.lang.Clock> root, final int ph, __1$1x10$lang$Clock$2 $dummy) {
             {
                this.out$$ = out$$;
                this.root = ((x10.core.GlobalRef)(root));
                this.ph = ph;
            }
        }
        
    }
    
    }
    
    