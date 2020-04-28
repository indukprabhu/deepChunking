package x10.io;


@x10.runtime.impl.java.X10Generated
public class Printer extends x10.io.FilterWriter implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Printer> $RTT = 
        x10.rtt.NamedType.<Printer> make("x10.io.Printer",
                                         Printer.class,
                                         new x10.rtt.Type[] {
                                             x10.io.FilterWriter.$RTT
                                         });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.Printer $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.FilterWriter.$_deserialize_body($_obj, $deserializer);
        $_obj.lock = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.Printer $_obj = new x10.io.Printer((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.lock);
        
    }
    
    // constructor just for allocation
    public Printer(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    // creation method for java code (1-phase java constructor)
    public Printer(final x10.io.Writer w) {
        this((java.lang.System[]) null);
        x10$io$Printer$$init$S(w);
    }
    
    // constructor for non-virtual call
    final public x10.io.Printer x10$io$Printer$$init$S(final x10.io.Writer w) {
         {
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            /*super.*/x10$io$FilterWriter$$init$S(((x10.io.Writer)(w)));
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            final x10.io.Printer this$91161 = this;
            
            //#line 36 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            final x10.util.concurrent.Lock t$91160 = ((x10.util.concurrent.Lock)(new x10.util.concurrent.Lock()));
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            this$91161.lock = ((x10.util.concurrent.Lock)(t$91160));
        }
        return this;
    }
    
    
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    final private static char NEWLINE = '\n';
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    public x10.util.concurrent.Lock lock;
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    public void println() {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        this.print(x10.core.Char.$box('\n'));
    }
    
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    final public void println(final java.lang.Object o) {
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final boolean t$91129 = ((o) == (null));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        java.lang.String t$91130 =  null;
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        if (t$91129) {
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            t$91130 = "null\n";
        } else {
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            final java.lang.String t$91128 = x10.rtt.Types.toString(o);
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            t$91130 = ((t$91128) + ("\n"));
        }
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final java.lang.String t$91131 = t$91130;
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        this.print(((java.lang.String)(t$91131)));
    }
    
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    final public void println(final java.lang.Throwable e) {
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final boolean t$91133 = ((e) == (null));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        java.lang.String t$91134 =  null;
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        if (t$91133) {
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            t$91134 = "null\n";
        } else {
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            final java.lang.String t$91132 = x10.runtime.impl.java.ThrowableUtils.toString(e);
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            t$91134 = ((t$91132) + ("\n"));
        }
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final java.lang.String t$91135 = t$91134;
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        this.print(((java.lang.String)(t$91135)));
    }
    
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    final public void print(final java.lang.Object o) {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final boolean t$91136 = ((o) == (null));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        java.lang.String t$91137 =  null;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        if (t$91136) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            t$91137 = "null";
        } else {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            t$91137 = x10.rtt.Types.toString(o);
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final java.lang.String t$91138 = t$91137;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        this.print(((java.lang.String)(t$91138)));
    }
    
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    public void print(final java.lang.String s) {
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final x10.util.concurrent.Lock t$91139 = ((x10.util.concurrent.Lock)(lock));
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        t$91139.lock();
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        try {{
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            final boolean t$91140 = ((s) == (null));
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            if (t$91140) {
                
                //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
                this.write(((java.lang.String)("null")));
            } else {
                
                //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
                this.write(((java.lang.String)(s)));
            }
        }}finally {{
              
              //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
              final x10.util.concurrent.Lock t$91141 = ((x10.util.concurrent.Lock)(lock));
              
              //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
              t$91141.unlock();
          }}
        }
    
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    final public void print(final java.lang.Throwable e) {
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final boolean t$91142 = ((e) == (null));
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        java.lang.String t$91143 =  null;
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        if (t$91142) {
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            t$91143 = "null";
        } else {
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            t$91143 = x10.runtime.impl.java.ThrowableUtils.toString(e);
        }
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final java.lang.String t$91144 = t$91143;
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        this.print(((java.lang.String)(t$91144)));
    }
    
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    public void printf(final java.lang.String fmt) {
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final x10.core.Rail t$91145 = ((x10.core.Rail)(new x10.core.Rail<java.lang.Object>(x10.rtt.Types.ANY, ((long)(0L)))));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        this.printfRail__1$1x10$lang$Any$2(((java.lang.String)(fmt)), ((x10.core.Rail)(t$91145)));
    }
    
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    public void printf(final java.lang.String fmt, final java.lang.Object o1) {
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final java.lang.Object t$91146 = ((java.lang.Object)
                                           o1);
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final x10.core.Rail t$91147 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<java.lang.Object> makeRailFromJavaArray(x10.rtt.Types.ANY, new java.lang.Object[] {t$91146})));
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        this.printfRail__1$1x10$lang$Any$2(((java.lang.String)(fmt)), ((x10.core.Rail)(t$91147)));
    }
    
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    public void printf(final java.lang.String fmt, final java.lang.Object o1, final java.lang.Object o2) {
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final java.lang.Object t$91148 = ((java.lang.Object)
                                           o1);
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final x10.core.Rail t$91149 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<java.lang.Object> makeRailFromJavaArray(x10.rtt.Types.ANY, new java.lang.Object[] {t$91148, o2})));
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        this.printfRail__1$1x10$lang$Any$2(((java.lang.String)(fmt)), ((x10.core.Rail)(t$91149)));
    }
    
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    public void printf(final java.lang.String fmt, final java.lang.Object o1, final java.lang.Object o2, final java.lang.Object o3) {
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final java.lang.Object t$91150 = ((java.lang.Object)
                                           o1);
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final x10.core.Rail t$91151 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<java.lang.Object> makeRailFromJavaArray(x10.rtt.Types.ANY, new java.lang.Object[] {t$91150, o2, o3})));
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        this.printfRail__1$1x10$lang$Any$2(((java.lang.String)(fmt)), ((x10.core.Rail)(t$91151)));
    }
    
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    public void printf(final java.lang.String fmt, final java.lang.Object o1, final java.lang.Object o2, final java.lang.Object o3, final java.lang.Object o4) {
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final java.lang.Object t$91152 = ((java.lang.Object)
                                           o1);
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final x10.core.Rail t$91153 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<java.lang.Object> makeRailFromJavaArray(x10.rtt.Types.ANY, new java.lang.Object[] {t$91152, o2, o3, o4})));
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        this.printfRail__1$1x10$lang$Any$2(((java.lang.String)(fmt)), ((x10.core.Rail)(t$91153)));
    }
    
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    public void printf(final java.lang.String fmt, final java.lang.Object o1, final java.lang.Object o2, final java.lang.Object o3, final java.lang.Object o4, final java.lang.Object o5) {
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final java.lang.Object t$91154 = ((java.lang.Object)
                                           o1);
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final x10.core.Rail t$91155 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<java.lang.Object> makeRailFromJavaArray(x10.rtt.Types.ANY, new java.lang.Object[] {t$91154, o2, o3, o4, o5})));
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        this.printfRail__1$1x10$lang$Any$2(((java.lang.String)(fmt)), ((x10.core.Rail)(t$91155)));
    }
    
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    public void printf(final java.lang.String fmt, final java.lang.Object o1, final java.lang.Object o2, final java.lang.Object o3, final java.lang.Object o4, final java.lang.Object o5, final java.lang.Object o6) {
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final java.lang.Object t$91156 = ((java.lang.Object)
                                           o1);
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final x10.core.Rail t$91157 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<java.lang.Object> makeRailFromJavaArray(x10.rtt.Types.ANY, new java.lang.Object[] {t$91156, o2, o3, o4, o5, o6})));
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        this.printfRail__1$1x10$lang$Any$2(((java.lang.String)(fmt)), ((x10.core.Rail)(t$91157)));
    }
    
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    public void printf__1$1x10$lang$Any$2(final java.lang.String fmt, final x10.core.Rail args) {
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        this.printfRail__1$1x10$lang$Any$2(((java.lang.String)(fmt)), ((x10.core.Rail)(args)));
    }
    
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    public void printfRail__1$1x10$lang$Any$2(final java.lang.String fmt, final x10.core.Rail args) {
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final java.lang.String t$91158 = x10.runtime.impl.java.StringUtils.format(fmt,(java.lang.Object[]) (args).value);
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        this.print(((java.lang.String)(t$91158)));
    }
    
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    public void flush() {
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        try {{
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            super.flush();
        }}catch (final x10.io.IOException id$66) {
            
        }
    }
    
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    public void close() {
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        try {{
            
            //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
            super.close();
        }}catch (final x10.io.IOException id$67) {
            
        }
    }
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    final public x10.io.Printer x10$io$Printer$$this$x10$io$Printer() {
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        return x10.io.Printer.this;
    }
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
    final public void __fieldInitializers_x10_io_Printer() {
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        final x10.util.concurrent.Lock t$91159 = ((x10.util.concurrent.Lock)(new x10.util.concurrent.Lock()));
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Printer.x10"
        this.lock = ((x10.util.concurrent.Lock)(t$91159));
    }
    
    public static char get$NEWLINE() {
        return x10.io.Printer.NEWLINE;
    }
    
    public void x10$io$FilterWriter$flush$S() {
        super.flush();
    }
    
    public void x10$io$FilterWriter$close$S() {
        super.close();
    }
    }
    
    