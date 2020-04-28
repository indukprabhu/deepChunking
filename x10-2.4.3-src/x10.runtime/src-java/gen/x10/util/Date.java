package x10.util;


@x10.runtime.impl.java.X10Generated
public class Date extends x10.core.Ref implements java.lang.Comparable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Date> $RTT = 
        x10.rtt.NamedType.<Date> make("x10.util.Date",
                                      Date.class,
                                      new x10.rtt.Type[] {
                                          x10.rtt.ParameterizedType.make(x10.rtt.Types.COMPARABLE, x10.rtt.UnresolvedType.THIS)
                                      });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.Date $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.millis = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.Date $_obj = new x10.util.Date((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.millis);
        
    }
    
    // constructor just for allocation
    public Date(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    public long millis;
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    // creation method for java code (1-phase java constructor)
    public Date() {
        this((java.lang.System[]) null);
        x10$util$Date$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.util.Date x10$util$Date$$init$S() {
         {
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
            final x10.util.Date this$136197 = this;
            
            //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
            final long millis$136196 = java.lang.System.currentTimeMillis();
            
            //#line 18 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
            this$136197.millis = 0L;
            
            //#line 34 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
            this$136197.millis = millis$136196;
        }
        return this;
    }
    
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    // creation method for java code (1-phase java constructor)
    public Date(final long millis) {
        this((java.lang.System[]) null);
        x10$util$Date$$init$S(millis);
    }
    
    // constructor for non-virtual call
    final public x10.util.Date x10$util$Date$$init$S(final long millis) {
         {
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
            final x10.util.Date this$136217 = this;
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
            this$136217.millis = 0L;
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
            this.millis = millis;
        }
        return this;
    }
    
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    public long getTime$O() {
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        final long t$136204 = millis;
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        return t$136204;
    }
    
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    public void setTime(final long millis) {
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        this.millis = millis;
    }
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    public int compareTo(final java.lang.Object x) {
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        final long t$136205 = this.millis;
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        final long t$136206 = ((x10.util.Date)x).millis;
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        final int t$136207 = x10.rtt.Equality.compareTo(t$136205, ((long)(t$136206)));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        return t$136207;
    }
    
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    public boolean equals$O(final x10.util.Date x) {
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        final long t$136208 = this.millis;
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        final long t$136209 = x.millis;
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        final boolean t$136210 = ((long) t$136208) == ((long) t$136209);
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        return t$136210;
    }
    
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    public boolean before$O(final x10.util.Date x) {
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        final int t$136211 = this.compareTo(((x10.util.Date)(x)));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        final long t$136212 = ((long)(((int)(t$136211))));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        final boolean t$136213 = ((t$136212) < (((long)(0L))));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        return t$136213;
    }
    
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    public boolean after$O(final x10.util.Date x) {
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        final int t$136214 = this.compareTo(((x10.util.Date)(x)));
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        final long t$136215 = ((long)(((int)(t$136214))));
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        final boolean t$136216 = ((t$136215) > (((long)(0L))));
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        return t$136216;
    }
    
    
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    public java.lang.String toString() {
        try {
            return new java.util.Date(this.millis).toString();
        }
        catch (java.lang.Throwable exc$146446) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146446);
        }
        
    }
    
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    final public x10.util.Date x10$util$Date$$this$x10$util$Date() {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        return x10.util.Date.this;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    final public void __fieldInitializers_x10_util_Date() {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
        this.millis = 0L;
    }
}

