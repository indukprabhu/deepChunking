package x10.util;


@x10.runtime.impl.java.X10Generated
public class Random extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Random> $RTT = 
        x10.rtt.NamedType.<Random> make("x10.util.Random",
                                        Random.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.Random $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.index = $deserializer.readLong();
        $_obj.mt = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.Random $_obj = new x10.util.Random((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.index);
        $serializer.write(this.mt);
        
    }
    
    // constructor just for allocation
    public Random(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    final private static long N = 624L;
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    final private static long M = 397L;
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    public long index;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    public x10.core.Rail<x10.core.Int> mt;
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    // creation method for java code (1-phase java constructor)
    public Random() {
        this((java.lang.System[]) null);
        x10$util$Random$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.util.Random x10$util$Random$$init$S() {
         {
            
            //#line 39 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
            final long t$141886 = java.lang.System.nanoTime();
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            /*this.*/x10$util$Random$$init$S(t$141886);
        }
        return this;
    }
    
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    // creation method for java code (1-phase java constructor)
    public Random(final long seed) {
        this((java.lang.System[]) null);
        x10$util$Random$$init$S(seed);
    }
    
    // constructor for non-virtual call
    final public x10.util.Random x10$util$Random$$init$S(final long seed) {
         {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final x10.util.Random this$142115 = this;
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            this$142115.index = 0L;
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final x10.core.Rail t$141887 = ((x10.core.Rail)(x10.core.Rail.<x10.core.Int>makeUnsafe(x10.rtt.Types.INT, ((long)(624L)), false)));
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            this.mt = ((x10.core.Rail)(t$141887));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            this.init((long)(seed));
        }
        return this;
    }
    
    
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    final public void setSeed(final long seed) {
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        this.init((long)(seed));
    }
    
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    public int nextInt$O() {
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$141888 = this.random$O();
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        return t$141888;
    }
    
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    public int nextInt$O(final int maxPlus1) {
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final boolean t$141889 = ((maxPlus1) <= (((int)(0))));
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        if (t$141889) {
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            return 0;
        }
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        int n = maxPlus1;
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$141891 = n;
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$141890 = n;
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$141892 = (-(t$141890));
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$141893 = ((t$141891) & (((int)(t$141892))));
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$141894 = n;
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final boolean t$141899 = ((int) t$141893) == ((int) t$141894);
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        if (t$141899) {
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$141896 = this.nextInt$O();
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$141895 = n;
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$141897 = ((t$141895) - (((int)(1))));
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$141898 = ((t$141896) & (((int)(t$141897))));
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            return t$141898;
        }
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        int mask = 1;
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        while (true) {
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$141901 = n;
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$141900 = mask;
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$141902 = (~(t$141900));
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$141903 = ((t$141901) & (((int)(t$141902))));
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final boolean t$141909 = ((int) t$141903) != ((int) 0);
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            if (!(t$141909)) {
                
                //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                break;
            }
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142116 = mask;
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142117 = ((long)(((int)(1))));
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142118 = ((t$142116) << (int)(((long)(t$142117))));
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            mask = t$142118;
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142119 = mask;
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142120 = ((t$142119) | (((int)(1))));
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            mask = t$142120;
        }
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        int x =  0;
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        boolean t$142124 = false;
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        do  {
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142121 = this.nextInt$O();
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142122 = mask;
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142123 = ((t$142121) & (((int)(t$142122))));
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            x = t$142123;
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142125 = x;
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142126 = n;
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final boolean t$142127 = ((t$142125) >= (((int)(t$142126))));
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            t$142124 = t$142127;
        }while(t$142124); 
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$141917 = x;
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        return t$141917;
    }
    
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    public void nextBytes__0$1x10$lang$Byte$2(final x10.core.Rail buf) {
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        int i = 0;
        {
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final byte[] buf$value$142228 = ((byte[])buf.value);
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            while (true) {
                
                //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                int x = this.nextInt$O();
                
                //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                int j$142145 = 0;
                {
                    
                    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final int t$142146 = j$142145;
                        
                        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final boolean t$142147 = ((t$142146) < (((int)(4))));
                        
                        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        if (!(t$142147)) {
                            
                            //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                            break;
                        }
                        
                        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final int t$142128 = i;
                        
                        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final long t$142129 = ((long)(((int)(t$142128))));
                        
                        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final long t$142130 = ((x10.core.Rail<x10.core.Byte>)buf).size;
                        
                        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final boolean t$142131 = ((t$142129) >= (((long)(t$142130))));
                        
                        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        if (t$142131) {
                            
                            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                            return;
                        }
                        
                        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final int t$142132 = i;
                        
                        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final long t$142133 = ((long)(((int)(t$142132))));
                        
                        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final int t$142134 = x;
                        
                        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final long t$142135 = ((long)(((int)(t$142134))));
                        
                        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final long t$142136 = ((t$142135) & (((long)(255L))));
                        
                        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final byte t$142137 = ((byte)(long)(((long)(t$142136))));
                        
                        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        buf$value$142228[(int)t$142133]=t$142137;
                        
                        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final int t$142138 = i;
                        
                        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final int t$142139 = ((t$142138) + (((int)(1))));
                        
                        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        i = t$142139;
                        
                        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final int t$142140 = x;
                        
                        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final long t$142141 = ((long)(((int)(8))));
                        
                        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final int t$142142 = ((t$142140) >> (int)(((long)(t$142141))));
                        
                        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        x = t$142142;
                        
                        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final int t$142143 = j$142145;
                        
                        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        final int t$142144 = ((t$142143) + (((int)(1))));
                        
                        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                        j$142145 = t$142144;
                    }
                }
            }
        }
    }
    
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    public long nextLong$O() {
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$141938 = this.nextInt$O();
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141939 = ((long)(((int)(t$141938))));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141940 = ((long)(((int)(32))));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141943 = ((t$141939) << (int)(((long)(t$141940))));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$141941 = this.nextInt$O();
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141942 = ((long)(((int)(t$141941))));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141944 = ((t$141942) & (((long)(4294967295L))));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141945 = ((t$141943) | (((long)(t$141944))));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        return t$141945;
    }
    
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    public long nextLong$O(final long maxPlus1) {
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141946 = ((long)(((int)(0))));
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final boolean t$141947 = ((maxPlus1) <= (((long)(t$141946))));
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        if (t$141947) {
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            return 0L;
        }
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        long n = maxPlus1;
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141949 = n;
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141948 = n;
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141950 = (-(t$141948));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141951 = ((t$141949) & (((long)(t$141950))));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141952 = n;
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final boolean t$141957 = ((long) t$141951) == ((long) t$141952);
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        if (t$141957) {
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$141954 = this.nextLong$O();
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$141953 = n;
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$141955 = ((t$141953) - (((long)(1L))));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$141956 = ((t$141954) & (((long)(t$141955))));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            return t$141956;
        }
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        long mask = 1L;
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        while (true) {
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$141959 = n;
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$141958 = mask;
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$141960 = ((long) ~(t$141958));
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$141961 = ((t$141959) & (((long)(t$141960))));
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final boolean t$141967 = ((long) t$141961) != ((long) 0L);
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            if (!(t$141967)) {
                
                //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                break;
            }
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142148 = mask;
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142149 = ((long)(((int)(1))));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142150 = ((t$142148) << (int)(((long)(t$142149))));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            mask = t$142150;
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142151 = mask;
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142152 = ((t$142151) | (((long)(1L))));
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            mask = t$142152;
        }
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        long x =  0;
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        boolean t$142156 = false;
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        do  {
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142153 = this.nextLong$O();
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142154 = mask;
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142155 = ((t$142153) & (((long)(t$142154))));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            x = t$142155;
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142157 = x;
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142158 = n;
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final boolean t$142159 = ((t$142157) >= (((long)(t$142158))));
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            t$142156 = t$142159;
        }while(t$142156); 
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141975 = x;
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        return t$141975;
    }
    
    
    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    public boolean nextBoolean$O() {
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$141976 = this.nextInt$O();
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final boolean t$141977 = ((t$141976) < (((int)(0))));
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        return t$141977;
    }
    
    
    //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    public float nextFloat$O() {
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$141978 = this.nextInt$O();
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141979 = ((long)(((int)(8))));
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$141980 = ((t$141978) >>> (int)(((long)(t$141979))));
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final float t$141983 = ((float)(int)(((int)(t$141980))));
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141981 = ((long)(((int)(24))));
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141982 = ((1L) << (int)(((long)(t$141981))));
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final float t$141984 = ((float)(long)(((long)(t$141982))));
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final float t$141985 = ((t$141983) / (((float)(t$141984))));
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        return t$141985;
    }
    
    
    //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    public double nextDouble$O() {
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141986 = this.nextLong$O();
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141987 = ((long)(((int)(11))));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141988 = ((t$141986) >>> (int)(((long)(t$141987))));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final double t$141991 = ((double)(long)(((long)(t$141988))));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141989 = ((long)(((int)(53))));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$141990 = ((1L) << (int)(((long)(t$141989))));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final double t$141992 = ((double)(long)(((long)(t$141990))));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final double t$141993 = ((t$141991) / (((double)(t$141992))));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        return t$141993;
    }
    
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    final public void init(final long seed) {
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final x10.core.Rail t$141996 = ((x10.core.Rail)(mt));
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final boolean t$141994 = ((long) seed) == ((long) 0L);
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        int t$141995 =  0;
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        if (t$141994) {
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            t$141995 = 4357;
        } else {
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            t$141995 = ((int)(long)(((long)(seed))));
        }
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$141997 = t$141995;
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        ((int[])t$141996.value)[(int)0L] = t$141997;
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        long i$142169 = 1L;
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        for (;
             true;
             ) {
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142170 = i$142169;
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final boolean t$142171 = ((t$142170) <= (((long)(623L))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            if (!(t$142171)) {
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                break;
            }
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long i$142166 = i$142169;
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final x10.core.Rail t$142160 = ((x10.core.Rail)(mt));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final x10.core.Rail t$142161 = ((x10.core.Rail)(mt));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142162 = ((i$142166) - (((long)(1L))));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142163 = ((int[])t$142161.value)[(int)t$142162];
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142164 = ((69069) * (((int)(t$142163))));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142165 = ((t$142164) + (((int)(1))));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            ((int[])t$142160.value)[(int)i$142166] = t$142165;
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142167 = i$142169;
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142168 = ((t$142167) + (((long)(1L))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            i$142169 = t$142168;
        }
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        this.index = 0L;
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        this.twist();
    }
    
    
    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    public int random$O() {
        
        //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$142009 = index;
        
        //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final boolean t$142010 = ((long) t$142009) == ((long) 624L);
        
        //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        if (t$142010) {
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            this.index = 0L;
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            this.twist();
        }
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final x10.core.Rail t$142014 = ((x10.core.Rail)(mt));
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$142011 = this.index;
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$142012 = ((t$142011) + (((long)(1L))));
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$142013 = this.index = t$142012;
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$142015 = ((t$142013) - (((long)(1L))));
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        int y = ((int[])t$142014.value)[(int)t$142015];
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142018 = y;
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142016 = y;
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$142017 = ((long)(((int)(11))));
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142019 = ((t$142016) >>> (int)(((long)(t$142017))));
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142020 = ((t$142018) ^ (((int)(t$142019))));
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        y = t$142020;
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142024 = y;
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142021 = y;
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$142022 = ((long)(((int)(7))));
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142023 = ((t$142021) << (int)(((long)(t$142022))));
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142025 = ((t$142023) & (((int)(-1658038656))));
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142026 = ((t$142024) ^ (((int)(t$142025))));
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        y = t$142026;
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142030 = y;
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142027 = y;
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$142028 = ((long)(((int)(15))));
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142029 = ((t$142027) << (int)(((long)(t$142028))));
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142031 = ((t$142029) & (((int)(-272236544))));
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142032 = ((t$142030) ^ (((int)(t$142031))));
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        y = t$142032;
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142035 = y;
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142033 = y;
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$142034 = ((long)(((int)(18))));
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142036 = ((t$142033) >>> (int)(((long)(t$142034))));
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142037 = ((t$142035) ^ (((int)(t$142036))));
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        y = t$142037;
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142038 = y;
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        return t$142038;
    }
    
    
    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    private void twist() {
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        long i = 0L;
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        int s =  0;
        
        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        for (;
             true;
             ) {
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142224 = i;
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final boolean t$142225 = ((t$142224) < (((long)(227L))));
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            if (!(t$142225)) {
                
                //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                break;
            }
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final x10.core.Rail t$142172 = ((x10.core.Rail)(mt));
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142173 = i;
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142174 = ((int[])t$142172.value)[(int)t$142173];
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142175 = ((t$142174) & (((int)(-2147483648))));
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final x10.core.Rail t$142176 = ((x10.core.Rail)(mt));
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142177 = i;
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142178 = ((t$142177) + (((long)(1L))));
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142179 = ((int[])t$142176.value)[(int)t$142178];
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142180 = ((t$142179) & (((int)(2147483647))));
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142181 = ((t$142175) | (((int)(t$142180))));
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            s = t$142181;
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final x10.core.Rail t$142182 = ((x10.core.Rail)(mt));
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142183 = i;
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final x10.core.Rail t$142184 = ((x10.core.Rail)(mt));
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142185 = i;
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142186 = ((t$142185) + (((long)(397L))));
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142187 = ((int[])t$142184.value)[(int)t$142186];
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142188 = s;
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142189 = ((long)(((int)(1))));
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142190 = ((t$142188) >>> (int)(((long)(t$142189))));
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142191 = ((t$142187) ^ (((int)(t$142190))));
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142192 = s;
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142193 = ((t$142192) & (((int)(1))));
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142194 = ((t$142193) * (((int)(-1727483681))));
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142195 = ((t$142191) ^ (((int)(t$142194))));
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            ((int[])t$142182.value)[(int)t$142183] = t$142195;
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142196 = i;
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142197 = ((t$142196) + (((long)(1L))));
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            i = t$142197;
        }
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        for (;
             true;
             ) {
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142226 = i;
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final boolean t$142227 = ((t$142226) < (((long)(623L))));
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            if (!(t$142227)) {
                
                //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
                break;
            }
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final x10.core.Rail t$142198 = ((x10.core.Rail)(mt));
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142199 = i;
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142200 = ((int[])t$142198.value)[(int)t$142199];
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142201 = ((t$142200) & (((int)(-2147483648))));
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final x10.core.Rail t$142202 = ((x10.core.Rail)(mt));
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142203 = i;
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142204 = ((t$142203) + (((long)(1L))));
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142205 = ((int[])t$142202.value)[(int)t$142204];
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142206 = ((t$142205) & (((int)(2147483647))));
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142207 = ((t$142201) | (((int)(t$142206))));
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            s = t$142207;
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final x10.core.Rail t$142208 = ((x10.core.Rail)(mt));
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142209 = i;
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final x10.core.Rail t$142210 = ((x10.core.Rail)(mt));
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142211 = i;
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142212 = ((t$142211) - (((long)(227L))));
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142213 = ((int[])t$142210.value)[(int)t$142212];
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142214 = s;
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142215 = ((long)(((int)(1))));
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142216 = ((t$142214) >>> (int)(((long)(t$142215))));
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142217 = ((t$142213) ^ (((int)(t$142216))));
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142218 = s;
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142219 = ((t$142218) & (((int)(1))));
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142220 = ((t$142219) * (((int)(-1727483681))));
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final int t$142221 = ((t$142217) ^ (((int)(t$142220))));
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            ((int[])t$142208.value)[(int)t$142209] = t$142221;
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142222 = i;
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            final long t$142223 = ((t$142222) + (((long)(1L))));
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
            i = t$142223;
        }
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final x10.core.Rail t$142097 = ((x10.core.Rail)(mt));
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142098 = ((int[])t$142097.value)[(int)623L];
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142101 = ((t$142098) & (((int)(-2147483648))));
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final x10.core.Rail t$142099 = ((x10.core.Rail)(mt));
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142100 = ((int[])t$142099.value)[(int)0L];
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142102 = ((t$142100) & (((int)(2147483647))));
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142103 = ((t$142101) | (((int)(t$142102))));
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        s = t$142103;
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final x10.core.Rail t$142113 = ((x10.core.Rail)(mt));
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final x10.core.Rail t$142104 = ((x10.core.Rail)(mt));
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142107 = ((int[])t$142104.value)[(int)396L];
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142105 = s;
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final long t$142106 = ((long)(((int)(1))));
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142108 = ((t$142105) >>> (int)(((long)(t$142106))));
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142111 = ((t$142107) ^ (((int)(t$142108))));
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142109 = s;
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142110 = ((t$142109) & (((int)(1))));
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142112 = ((t$142110) * (((int)(-1727483681))));
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        final int t$142114 = ((t$142111) ^ (((int)(t$142112))));
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        ((int[])t$142113.value)[(int)623L] = t$142114;
    }
    
    public static void twist$P(final x10.util.Random Random) {
        Random.twist();
    }
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    final public x10.util.Random x10$util$Random$$this$x10$util$Random() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        return x10.util.Random.this;
    }
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
    final public void __fieldInitializers_x10_util_Random() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Random.x10"
        this.index = 0L;
    }
    
    public static long get$N() {
        return x10.util.Random.N;
    }
    
    public static long get$M() {
        return x10.util.Random.M;
    }
}

