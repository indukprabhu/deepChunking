package x10.util;

@x10.runtime.impl.java.X10Generated
public class StringBuilder extends x10.core.Ref implements x10.util.Builder, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<StringBuilder> $RTT = 
        x10.rtt.NamedType.<StringBuilder> make("x10.util.StringBuilder",
                                               StringBuilder.class,
                                               new x10.rtt.Type[] {
                                                   x10.rtt.ParameterizedType.make(x10.util.Builder.$RTT, x10.rtt.Types.ANY, x10.rtt.Types.STRING)
                                               });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.StringBuilder $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.buf = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.StringBuilder $_obj = new x10.util.StringBuilder((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.buf);
        
    }
    
    // constructor just for allocation
    public StringBuilder(final java.lang.System[] $dummy) {
        
    }
    
    // dispatcher for method abstract public x10.util.Builder[T, U].add(e:T){}:x10.util.Builder[T, U]
    public java.lang.Object add(final java.lang.Object a1, final x10.rtt.Type t1) {
        return add((java.lang.Object)a1);
        
    }
    
    // bridge for method abstract public x10.util.Builder[T, U].result(){}:U
    public java.lang.String result$G() {
        return result();
    }
    
    

    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.GrowableRail<x10.core.Char> buf;
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    // creation method for java code (1-phase java constructor)
    public StringBuilder() {
        this((java.lang.System[]) null);
        x10$util$StringBuilder$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.util.StringBuilder x10$util$StringBuilder$$init$S() {
         {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final x10.util.StringBuilder this$142647 = this;
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final x10.util.GrowableRail alloc$72210 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<x10.core.Char>((java.lang.System[]) null, x10.rtt.Types.CHAR)));
            
            //#line 50 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            alloc$72210.x10$util$GrowableRail$$init$S(((long)(0L)));
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            this.buf = ((x10.util.GrowableRail)(alloc$72210));
        }
        return this;
    }
    
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public java.lang.String toString() {
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final java.lang.String t$142566 = this.result();
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142566;
    }
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder add(final java.lang.Object o) {
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final boolean t$142570 = ((o) == (null));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        if (t$142570) {
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final x10.util.StringBuilder t$142567 = this.addString(((java.lang.String)("null")));
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            return t$142567;
        } else {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final java.lang.String t$142568 = x10.rtt.Types.toString(o);
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final x10.util.StringBuilder t$142569 = this.addString(((java.lang.String)(t$142568)));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            return t$142569;
        }
    }
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder insert(final int p, final java.lang.Object o) {
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final boolean t$142574 = ((o) == (null));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        if (t$142574) {
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final x10.util.StringBuilder t$142571 = this.insertString((int)(p), ((java.lang.String)("null")));
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            return t$142571;
        } else {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final java.lang.String t$142572 = x10.rtt.Types.toString(o);
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final x10.util.StringBuilder t$142573 = this.insertString((int)(p), ((java.lang.String)(t$142572)));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            return t$142573;
        }
    }
    
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder add(final char x) {
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.GrowableRail t$142575 = ((x10.util.GrowableRail)(buf));
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        ((x10.util.GrowableRail<x10.core.Char>)t$142575).add__0x10$util$GrowableRail$$T(x10.core.Char.$box(x));
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return this;
    }
    
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder add(final boolean x) {
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final java.lang.String t$142576 = java.lang.Boolean.toString(x);
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.StringBuilder t$142577 = this.addString(((java.lang.String)(t$142576)));
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142577;
    }
    
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder add(final byte x) {
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final java.lang.String t$142578 = java.lang.Byte.toString((byte)x);
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.StringBuilder t$142579 = this.addString(((java.lang.String)(t$142578)));
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142579;
    }
    
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder add(final short x) {
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final java.lang.String t$142580 = java.lang.Short.toString((short)x);
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.StringBuilder t$142581 = this.addString(((java.lang.String)(t$142580)));
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142581;
    }
    
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder add(final int x) {
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final java.lang.String t$142582 = java.lang.Integer.toString(x);
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.StringBuilder t$142583 = this.addString(((java.lang.String)(t$142582)));
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142583;
    }
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder add(final long x) {
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final java.lang.String t$142584 = java.lang.Long.toString(x);
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.StringBuilder t$142585 = this.addString(((java.lang.String)(t$142584)));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142585;
    }
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder add(final float x) {
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final java.lang.String t$142586 = java.lang.Float.toString(x);
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.StringBuilder t$142587 = this.addString(((java.lang.String)(t$142586)));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142587;
    }
    
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder add(final double x) {
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final java.lang.String t$142588 = java.lang.Double.toString(x);
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.StringBuilder t$142589 = this.addString(((java.lang.String)(t$142588)));
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142589;
    }
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder add(final java.lang.String x) {
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final boolean t$142590 = ((x) == (null));
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        x10.util.StringBuilder t$142591 =  null;
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        if (t$142590) {
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            t$142591 = this.addString(((java.lang.String)("null")));
        } else {
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            t$142591 = this.addString(((java.lang.String)(x)));
        }
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.StringBuilder t$142592 = t$142591;
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142592;
    }
    
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder insert(final int p, final boolean x) {
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final java.lang.String t$142593 = java.lang.Boolean.toString(x);
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.StringBuilder t$142594 = this.insertString((int)(p), ((java.lang.String)(t$142593)));
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142594;
    }
    
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder insert(final int p, final byte x) {
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final java.lang.String t$142595 = java.lang.Byte.toString((byte)x);
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.StringBuilder t$142596 = this.insertString((int)(p), ((java.lang.String)(t$142595)));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142596;
    }
    
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder insert(final int p, final char x) {
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final java.lang.String t$142597 = java.lang.Character.toString(x);
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.StringBuilder t$142598 = this.insertString((int)(p), ((java.lang.String)(t$142597)));
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142598;
    }
    
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder insert(final int p, final short x) {
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final java.lang.String t$142599 = java.lang.Short.toString((short)x);
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.StringBuilder t$142600 = this.insertString((int)(p), ((java.lang.String)(t$142599)));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142600;
    }
    
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder insert(final int p, final int x) {
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final java.lang.String t$142601 = java.lang.Integer.toString(x);
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.StringBuilder t$142602 = this.insertString((int)(p), ((java.lang.String)(t$142601)));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142602;
    }
    
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder insert(final int p, final long x) {
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final java.lang.String t$142603 = java.lang.Long.toString(x);
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.StringBuilder t$142604 = this.insertString((int)(p), ((java.lang.String)(t$142603)));
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142604;
    }
    
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder insert(final int p, final float x) {
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final java.lang.String t$142605 = java.lang.Float.toString(x);
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.StringBuilder t$142606 = this.insertString((int)(p), ((java.lang.String)(t$142605)));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142606;
    }
    
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder insert(final int p, final double x) {
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final java.lang.String t$142607 = java.lang.Double.toString(x);
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.StringBuilder t$142608 = this.insertString((int)(p), ((java.lang.String)(t$142607)));
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142608;
    }
    
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder insert(final int p, final java.lang.String x) {
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final boolean t$142609 = ((x) == (null));
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        x10.util.StringBuilder t$142610 =  null;
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        if (t$142609) {
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            t$142610 = this.insertString((int)(p), ((java.lang.String)("null")));
        } else {
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            t$142610 = this.insertString((int)(p), ((java.lang.String)(x)));
        }
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.StringBuilder t$142611 = t$142610;
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142611;
    }
    
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder addString(final java.lang.String s) {
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        int i$142653 = 0;
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        for (;
             true;
             ) {
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final int t$142654 = i$142653;
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final int t$142655 = (s).length();
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final boolean t$142656 = ((t$142654) < (((int)(t$142655))));
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            if (!(t$142656)) {
                
                //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
                break;
            }
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final int t$142648 = i$142653;
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final char ch$142649 = (s).charAt(((int)(t$142648)));
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final x10.util.GrowableRail t$142650 = ((x10.util.GrowableRail)(buf));
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            ((x10.util.GrowableRail<x10.core.Char>)t$142650).add__0x10$util$GrowableRail$$T(x10.core.Char.$box(ch$142649));
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final int t$142651 = i$142653;
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final int t$142652 = ((t$142651) + (((int)(1))));
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            i$142653 = t$142652;
        }
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return this;
    }
    
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public x10.util.StringBuilder insertString(final int pos, final java.lang.String s) {
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        int loc = pos;
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final int t$142620 = (s).length();
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final boolean t$142621 = ((int) t$142620) == ((int) 0);
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        if (t$142621) {
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            return this;
        }
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final int t$142622 = loc;
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final long t$142623 = ((long)(((int)(t$142622))));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.GrowableRail this$142559 = ((x10.util.GrowableRail)(buf));
        
        //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$142624 = ((x10.util.GrowableRail<x10.core.Char>)this$142559).size;
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final boolean t$142626 = ((t$142623) > (((long)(t$142624))));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        if (t$142626) {
            
            //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final x10.util.StringBuilder t$142625 = this.addString(((java.lang.String)(s)));
            
            //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            return t$142625;
        }
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final int t$142627 = loc;
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final boolean t$142628 = ((t$142627) < (((int)(0))));
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        if (t$142628) {
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            loc = 0;
        }
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        int i$142670 = 0;
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        for (;
             true;
             ) {
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final int t$142671 = i$142670;
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final int t$142672 = (s).length();
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final boolean t$142673 = ((t$142671) < (((int)(t$142672))));
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            if (!(t$142673)) {
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
                break;
            }
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final int t$142660 = i$142670;
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final char ch$142661 = (s).charAt(((int)(t$142660)));
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final x10.util.GrowableRail this$142662 = ((x10.util.GrowableRail)(buf));
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final int t$142663 = loc;
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final int t$142664 = i$142670;
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final int t$142665 = ((t$142663) + (((int)(t$142664))));
            
            //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long idx$142666 = ((long)(((int)(t$142665))));
            
            //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final char v$142667 = ch$142661;
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$142657 = ((x10.util.GrowableRail<x10.core.Char>)this$142662).size;
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final boolean t$142658 = ((long) idx$142666) == ((long) t$142657);
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            if (t$142658) {
                
                //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ((x10.util.GrowableRail<x10.core.Char>)this$142662).add__0x10$util$GrowableRail$$T(x10.core.Char.$box(v$142667));
            } else {
                
                //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final x10.core.Rail t$142659 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.core.Char>)this$142662).data));
                
                //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ((char[])t$142659.value)[(int)idx$142666] = v$142667;
            }
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final int t$142668 = i$142670;
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            final int t$142669 = ((t$142668) + (((int)(1))));
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
            i$142670 = t$142669;
        }
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return this;
    }
    
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public long length() {
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.GrowableRail this$142565 = ((x10.util.GrowableRail)(buf));
        
        //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$142642 = ((x10.util.GrowableRail<x10.core.Char>)this$142565).size;
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142642;
    }
    
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    public java.lang.String result() {
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.util.GrowableRail t$142643 = ((x10.util.GrowableRail)(buf));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final x10.core.Rail rail = ((x10.core.Rail<x10.core.Char>)
                                     ((x10.util.GrowableRail<x10.core.Char>)t$142643).toRail());
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final long t$142644 = ((long)(((int)(0))));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final long t$142645 = ((x10.core.Rail<x10.core.Char>)rail).size;
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        final java.lang.String t$142646 = ((java.lang.String)(new java.lang.String((rail).getCharArray(),(int)((long)(t$142644)),(int)((long)(t$142645)))));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return t$142646;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    final public x10.util.StringBuilder x10$util$StringBuilder$$this$x10$util$StringBuilder() {
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
        return x10.util.StringBuilder.this;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringBuilder.x10"
    final public void __fieldInitializers_x10_util_StringBuilder() {
        
    }
}

