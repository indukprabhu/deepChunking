package x10.lang;


@x10.runtime.impl.java.X10Generated
final public class Runtime extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Runtime> $RTT = 
        x10.rtt.NamedType.<Runtime> make("x10.lang.Runtime",
                                         Runtime.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.Runtime $_obj = new x10.lang.Runtime((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Runtime(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void println(final java.lang.Object any) {
        try {
            java.lang.System.err.println(any);
        }
        catch (java.lang.Throwable exc$21470) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21470);
        }
        
    }
    
    
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void println() {
        try {
            java.lang.System.err.println();
        }
        catch (java.lang.Throwable exc$21471) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21471);
        }
        
    }
    
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static <$T>void printf__1x10$lang$Runtime$$T(final x10.rtt.Type $T, final java.lang.String fmt, final $T t) {
        try {
            java.lang.System.err.printf(fmt, t);
        }
        catch (java.lang.Throwable exc$21472) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21472);
        }
        
    }
    
    
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static java.lang.String getName() {
        try {
            return java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
        }
        catch (java.lang.Throwable exc$21473) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21473);
        }
        
    }
    
    
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void x10rtSendMessage(final long id, final x10.core.fun.VoidFun_0_0 msgBody, final x10.lang.Runtime.Profile prof) {
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(id))), msgBody, prof, null);
    }
    
    
    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void x10rtSendMessage(final long id, final x10.core.fun.VoidFun_0_0 msgBody, final x10.lang.Runtime.Profile prof, final x10.core.fun.VoidFun_0_0 preSendAction) {
        try {
            x10.runtime.impl.java.Runtime.runClosureAt((int)(id), msgBody, prof, preSendAction);
        }
        catch (java.lang.Throwable exc$21474) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21474);
        }
        
    }
    
    
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void x10rtSendAsync(final long id, final x10.core.fun.VoidFun_0_0 body, final x10.lang.FinishState finishState, final x10.lang.Runtime.Profile prof, final x10.core.fun.VoidFun_0_0 preSendAction) {
        try {
            x10.runtime.impl.java.Runtime.runAsyncAt((int)(id), body, finishState, prof, preSendAction);
        }
        catch (java.lang.Throwable exc$21475) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21475);
        }
        
    }
    
    
    
    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void x10rtProbe() {
        try {
            x10.runtime.impl.java.Runtime.eventProbe();
        }
        catch (java.lang.Throwable exc$21476) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21476);
        }
        
    }
    
    
    
    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    private static boolean x10rtBlockingProbeSupport$O() {
        try {
            return x10.x10rt.X10RT.blockingProbeSupport();
        }
        catch (java.lang.Throwable exc$21477) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21477);
        }
        
    }
    
    
    public static boolean x10rtBlockingProbeSupport$P$O() {
        return x10.x10rt.X10RT.blockingProbeSupport();
    }
    
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void x10rtBlockingProbe() {
        try {
            x10.runtime.impl.java.Runtime.blockingProbe();
        }
        catch (java.lang.Throwable exc$21478) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21478);
        }
        
    }
    
    
    
    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void x10rtUnblockProbe() {
        try {
            x10.runtime.impl.java.Runtime.unblockProbe();
        }
        catch (java.lang.Throwable exc$21479) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21479);
        }
        
    }
    
    
    
    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void wsProcessEvents() {
        try {
            x10.runtime.impl.java.Runtime.eventProbe();
        }
        catch (java.lang.Throwable exc$21480) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21480);
        }
        
    }
    
    
    
    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static <$T>$T deepCopy__0x10$lang$Runtime$$T$G(final x10.rtt.Type $T, final $T o, final x10.lang.Runtime.Profile prof) {
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$20483 = ((prof) != (null));
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        long t$20484 =  0;
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$20483) {
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20484 = java.lang.System.nanoTime();
        } else {
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20484 = 0L;
        }
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long start = t$20484;
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.io.Serializer ser = ((x10.io.Serializer)(new x10.io.Serializer()));
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ser.writeAny(((java.lang.Object)(o)));
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.io.Deserializer deser = ((x10.io.Deserializer)(new x10.io.Deserializer(((x10.io.Serializer)(ser)))));
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final java.lang.Object t$20485 = deser.readAny();
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final $T copy = (($T)(x10.rtt.Types.<$T> cast(t$20485,$T)));
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$20493 = ((prof) != (null));
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$20493) {
            
            //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long end = java.lang.System.nanoTime();
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$20486 = prof.serializationNanos;
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$20487 = ((end) - (((long)(start))));
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$20488 = ((t$20486) + (((long)(t$20487))));
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            prof.serializationNanos = t$20488;
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$20490 = prof.bytes;
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20489 = ser.dataBytesWritten$O();
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$20491 = ((long)(((int)(t$20489))));
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$20492 = ((t$20490) + (((long)(t$20491))));
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            prof.bytes = t$20492;
        }
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return copy;
    }
    
    
    //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static <$T>$T deepCopy__0x10$lang$Runtime$$T$G(final x10.rtt.Type $T, final $T o) {
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final $T t$20494 = (($T)(x10.lang.Runtime.<$T> deepCopy__0x10$lang$Runtime$$T$G($T, (($T)(o)), ((x10.lang.Runtime.Profile)(null)))));
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$20494;
    }
    
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    @x10.runtime.impl.java.X10Generated
    public static class MemoryAllocator extends x10.core.Ref implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<MemoryAllocator> $RTT = 
            x10.rtt.NamedType.<MemoryAllocator> make("x10.lang.Runtime.MemoryAllocator",
                                                     MemoryAllocator.class);
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.MemoryAllocator $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.hugePages = $deserializer.readBoolean();
            $_obj.congruent = $deserializer.readBoolean();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Runtime.MemoryAllocator $_obj = new x10.lang.Runtime.MemoryAllocator((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.hugePages);
            $serializer.write(this.congruent);
            
        }
        
        // constructor just for allocation
        public MemoryAllocator(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        private static x10.lang.Runtime.MemoryAllocator DEFAULT_ALLOCATOR;
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        private static x10.lang.Runtime.MemoryAllocator ALLOC_HC;
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        private static x10.lang.Runtime.MemoryAllocator ALLOC_H;
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        private static x10.lang.Runtime.MemoryAllocator ALLOC_C;
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public boolean hugePages;
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public boolean congruent;
        
        
        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        // creation method for java code (1-phase java constructor)
        public MemoryAllocator(final boolean h, final boolean c) {
            this((java.lang.System[]) null);
            x10$lang$Runtime$MemoryAllocator$$init$S(h, c);
        }
        
        // constructor for non-virtual call
        final public x10.lang.Runtime.MemoryAllocator x10$lang$Runtime$MemoryAllocator$$init$S(final boolean h, final boolean c) {
             {
                
                //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                
                
                //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.MemoryAllocator this$21207 = this;
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.hugePages = h;
                
                //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.congruent = c;
            }
            return this;
        }
        
        
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public static boolean hugePagesAvailable$O() {
            try {
                return false;
            }
            catch (java.lang.Throwable exc$21481) {
                throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21481);
            }
            
        }
        
        
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public static boolean congruentAvailable$O() {
            try {
                return false;
            }
            catch (java.lang.Throwable exc$21482) {
                throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21482);
            }
            
        }
        
        
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public static x10.lang.Runtime.MemoryAllocator requestAllocator(final boolean hugePages, final boolean congruent) {
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            boolean t$20495 = congruent;
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20495) {
                
                //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20495 = hugePages;
            }
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            boolean t$20497 = t$20495;
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20497) {
                
                //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.MemoryAllocator t$20496 = ((x10.lang.Runtime.MemoryAllocator)(x10.lang.Runtime.MemoryAllocator.get$ALLOC_HC()));
                
                //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20497 = ((t$20496) != (null));
            }
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20499 = t$20497;
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20499) {
                
                //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.MemoryAllocator t$20498 = ((x10.lang.Runtime.MemoryAllocator)(x10.lang.Runtime.MemoryAllocator.get$ALLOC_HC()));
                
                //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return t$20498;
            }
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            boolean t$20501 = congruent;
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20501) {
                
                //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.MemoryAllocator t$20500 = ((x10.lang.Runtime.MemoryAllocator)(x10.lang.Runtime.MemoryAllocator.get$ALLOC_C()));
                
                //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20501 = ((t$20500) != (null));
            }
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20503 = t$20501;
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20503) {
                
                //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.MemoryAllocator t$20502 = ((x10.lang.Runtime.MemoryAllocator)(x10.lang.Runtime.MemoryAllocator.get$ALLOC_C()));
                
                //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return t$20502;
            }
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            boolean t$20505 = hugePages;
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20505) {
                
                //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.MemoryAllocator t$20504 = ((x10.lang.Runtime.MemoryAllocator)(x10.lang.Runtime.MemoryAllocator.get$ALLOC_H()));
                
                //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20505 = ((t$20504) != (null));
            }
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20507 = t$20505;
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20507) {
                
                //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.MemoryAllocator t$20506 = ((x10.lang.Runtime.MemoryAllocator)(x10.lang.Runtime.MemoryAllocator.get$ALLOC_H()));
                
                //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return t$20506;
            }
            
            //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.MemoryAllocator t$20508 = ((x10.lang.Runtime.MemoryAllocator)(x10.lang.Runtime.MemoryAllocator.get$DEFAULT_ALLOCATOR()));
            
            //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return t$20508;
        }
        
        
        //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public static x10.lang.Runtime.MemoryAllocator requireAllocator(final boolean hugePages, final boolean congruent) {
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            boolean t$20509 = congruent;
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20509) {
                
                //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20509 = hugePages;
            }
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20514 = t$20509;
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20514) {
                
                //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.MemoryAllocator t$20510 = ((x10.lang.Runtime.MemoryAllocator)(x10.lang.Runtime.MemoryAllocator.get$ALLOC_HC()));
                
                //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$20512 = ((t$20510) == (null));
                
                //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$20512) {
                    
                    //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final java.lang.OutOfMemoryError t$20511 = ((java.lang.OutOfMemoryError)(new java.lang.OutOfMemoryError("Required Memory Allocator unavailable")));
                    
                    //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    throw t$20511;
                }
                
                //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.MemoryAllocator t$20513 = ((x10.lang.Runtime.MemoryAllocator)(x10.lang.Runtime.MemoryAllocator.get$ALLOC_HC()));
                
                //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return t$20513;
            }
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (congruent) {
                
                //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.MemoryAllocator t$20515 = ((x10.lang.Runtime.MemoryAllocator)(x10.lang.Runtime.MemoryAllocator.get$ALLOC_C()));
                
                //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$20517 = ((t$20515) == (null));
                
                //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$20517) {
                    
                    //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final java.lang.OutOfMemoryError t$20516 = ((java.lang.OutOfMemoryError)(new java.lang.OutOfMemoryError("Required Memory Allocator unavailable")));
                    
                    //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    throw t$20516;
                }
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.MemoryAllocator t$20518 = ((x10.lang.Runtime.MemoryAllocator)(x10.lang.Runtime.MemoryAllocator.get$ALLOC_C()));
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return t$20518;
            }
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (hugePages) {
                
                //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.MemoryAllocator t$20519 = ((x10.lang.Runtime.MemoryAllocator)(x10.lang.Runtime.MemoryAllocator.get$ALLOC_H()));
                
                //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$20521 = ((t$20519) == (null));
                
                //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$20521) {
                    
                    //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final java.lang.OutOfMemoryError t$20520 = ((java.lang.OutOfMemoryError)(new java.lang.OutOfMemoryError("Required Memory Allocator unavailable")));
                    
                    //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    throw t$20520;
                }
                
                //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.MemoryAllocator t$20522 = ((x10.lang.Runtime.MemoryAllocator)(x10.lang.Runtime.MemoryAllocator.get$ALLOC_H()));
                
                //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return t$20522;
            }
            
            //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.MemoryAllocator t$20523 = ((x10.lang.Runtime.MemoryAllocator)(x10.lang.Runtime.MemoryAllocator.get$DEFAULT_ALLOCATOR()));
            
            //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return t$20523;
        }
        
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final public x10.lang.Runtime.MemoryAllocator x10$lang$Runtime$MemoryAllocator$$this$x10$lang$Runtime$MemoryAllocator() {
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return x10.lang.Runtime.MemoryAllocator.this;
        }
        
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final public void __fieldInitializers_x10_lang_Runtime_MemoryAllocator() {
            
        }
        
        final private static x10.core.concurrent.AtomicInteger initStatus$ALLOC_C = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        private static x10.lang.ExceptionInInitializer exception$ALLOC_C;
        final private static x10.core.concurrent.AtomicInteger initStatus$ALLOC_H = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        private static x10.lang.ExceptionInInitializer exception$ALLOC_H;
        final private static x10.core.concurrent.AtomicInteger initStatus$ALLOC_HC = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        private static x10.lang.ExceptionInInitializer exception$ALLOC_HC;
        final private static x10.core.concurrent.AtomicInteger initStatus$DEFAULT_ALLOCATOR = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        private static x10.lang.ExceptionInInitializer exception$DEFAULT_ALLOCATOR;
        
        public static x10.lang.Runtime.MemoryAllocator get$DEFAULT_ALLOCATOR() {
            if (((int) x10.lang.Runtime.MemoryAllocator.initStatus$DEFAULT_ALLOCATOR.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                return x10.lang.Runtime.MemoryAllocator.DEFAULT_ALLOCATOR;
            }
            if (((int) x10.lang.Runtime.MemoryAllocator.initStatus$DEFAULT_ALLOCATOR.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                throw x10.lang.Runtime.MemoryAllocator.exception$DEFAULT_ALLOCATOR;
            }
            if (x10.lang.Runtime.MemoryAllocator.initStatus$DEFAULT_ALLOCATOR.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                try {{
                    x10.lang.Runtime.MemoryAllocator.DEFAULT_ALLOCATOR = ((x10.lang.Runtime.MemoryAllocator)(new x10.lang.Runtime.MemoryAllocator((java.lang.System[]) null).x10$lang$Runtime$MemoryAllocator$$init$S(((boolean)(false)), ((boolean)(false)))));
                }}catch (java.lang.Throwable exc$21449) {
                    x10.lang.Runtime.MemoryAllocator.exception$DEFAULT_ALLOCATOR = new x10.lang.ExceptionInInitializer(exc$21449);
                    x10.lang.Runtime.MemoryAllocator.initStatus$DEFAULT_ALLOCATOR.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    throw x10.lang.Runtime.MemoryAllocator.exception$DEFAULT_ALLOCATOR;
                }
                x10.lang.Runtime.MemoryAllocator.initStatus$DEFAULT_ALLOCATOR.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            } else {
                if (x10.lang.Runtime.MemoryAllocator.initStatus$DEFAULT_ALLOCATOR.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (x10.lang.Runtime.MemoryAllocator.initStatus$DEFAULT_ALLOCATOR.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    if (((int) x10.lang.Runtime.MemoryAllocator.initStatus$DEFAULT_ALLOCATOR.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                        throw x10.lang.Runtime.MemoryAllocator.exception$DEFAULT_ALLOCATOR;
                    }
                }
            }
            return x10.lang.Runtime.MemoryAllocator.DEFAULT_ALLOCATOR;
        }
        
        public static x10.lang.Runtime.MemoryAllocator get$ALLOC_HC() {
            if (((int) x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_HC.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                return x10.lang.Runtime.MemoryAllocator.ALLOC_HC;
            }
            if (((int) x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_HC.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                throw x10.lang.Runtime.MemoryAllocator.exception$ALLOC_HC;
            }
            if (x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_HC.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                try {{
                    x10.lang.Runtime.MemoryAllocator.ALLOC_HC = false && false
                      ? new x10.lang.Runtime.MemoryAllocator((java.lang.System[]) null).x10$lang$Runtime$MemoryAllocator$$init$S(((boolean)(true)), ((boolean)(true)))
                      : null;
                }}catch (java.lang.Throwable exc$21450) {
                    x10.lang.Runtime.MemoryAllocator.exception$ALLOC_HC = new x10.lang.ExceptionInInitializer(exc$21450);
                    x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_HC.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    throw x10.lang.Runtime.MemoryAllocator.exception$ALLOC_HC;
                }
                x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_HC.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            } else {
                if (x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_HC.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_HC.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    if (((int) x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_HC.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                        throw x10.lang.Runtime.MemoryAllocator.exception$ALLOC_HC;
                    }
                }
            }
            return x10.lang.Runtime.MemoryAllocator.ALLOC_HC;
        }
        
        public static x10.lang.Runtime.MemoryAllocator get$ALLOC_H() {
            if (((int) x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_H.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                return x10.lang.Runtime.MemoryAllocator.ALLOC_H;
            }
            if (((int) x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_H.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                throw x10.lang.Runtime.MemoryAllocator.exception$ALLOC_H;
            }
            if (x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_H.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                try {{
                    x10.lang.Runtime.MemoryAllocator.ALLOC_H = false
                      ? new x10.lang.Runtime.MemoryAllocator((java.lang.System[]) null).x10$lang$Runtime$MemoryAllocator$$init$S(((boolean)(true)), ((boolean)(false)))
                      : null;
                }}catch (java.lang.Throwable exc$21451) {
                    x10.lang.Runtime.MemoryAllocator.exception$ALLOC_H = new x10.lang.ExceptionInInitializer(exc$21451);
                    x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_H.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    throw x10.lang.Runtime.MemoryAllocator.exception$ALLOC_H;
                }
                x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_H.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            } else {
                if (x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_H.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_H.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    if (((int) x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_H.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                        throw x10.lang.Runtime.MemoryAllocator.exception$ALLOC_H;
                    }
                }
            }
            return x10.lang.Runtime.MemoryAllocator.ALLOC_H;
        }
        
        public static x10.lang.Runtime.MemoryAllocator get$ALLOC_C() {
            if (((int) x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_C.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                return x10.lang.Runtime.MemoryAllocator.ALLOC_C;
            }
            if (((int) x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_C.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                throw x10.lang.Runtime.MemoryAllocator.exception$ALLOC_C;
            }
            if (x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_C.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                try {{
                    x10.lang.Runtime.MemoryAllocator.ALLOC_C = false
                      ? new x10.lang.Runtime.MemoryAllocator((java.lang.System[]) null).x10$lang$Runtime$MemoryAllocator$$init$S(((boolean)(false)), ((boolean)(true)))
                      : null;
                }}catch (java.lang.Throwable exc$21452) {
                    x10.lang.Runtime.MemoryAllocator.exception$ALLOC_C = new x10.lang.ExceptionInInitializer(exc$21452);
                    x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_C.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    throw x10.lang.Runtime.MemoryAllocator.exception$ALLOC_C;
                }
                x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_C.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            } else {
                if (x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_C.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_C.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    if (((int) x10.lang.Runtime.MemoryAllocator.initStatus$ALLOC_C.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                        throw x10.lang.Runtime.MemoryAllocator.exception$ALLOC_C;
                    }
                }
            }
            return x10.lang.Runtime.MemoryAllocator.ALLOC_C;
        }
    }
    
    
    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    private static x10.util.HashMap<java.lang.String, java.lang.String> env;
    
    //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    private static boolean STRICT_FINISH = false;
    
    //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    private static int NTHREADS = 0;
    
    //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    private static int MAX_THREADS = 0;
    
    //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    private static boolean STATIC_THREADS = false;
    
    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    private static boolean WARN_ON_THREAD_CREATION = false;
    
    //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    private static boolean BUSY_WAITING = false;
    
    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    private static int RESILIENT_MODE = 0;
    
    //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    private static double CHUNK_DELTA = 0.0;
    
    
    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static x10.io.Reader execForRead(final java.lang.String command) {
        try {
            return x10.runtime.impl.java.Runtime.execForRead(command);
        }
        catch (java.lang.Throwable exc$21483) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21483);
        }
        
    }
    
    
    
    //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static x10.io.Writer execForWrite(final java.lang.String command) {
        try {
            return x10.runtime.impl.java.Runtime.execForWrite(command);
        }
        catch (java.lang.Throwable exc$21484) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21484);
        }
        
    }
    
    
    
    //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    private static x10.util.concurrent.Monitor staticMonitor;
    
    //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    private static x10.util.concurrent.Monitor atomicMonitor;
    
    //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    private static x10.lang.Runtime.Pool pool;
    
    //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    private static x10.lang.FinishState.FinishStates finishStates;
    
    //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    private static x10.lang.Runtime.Workers workerInstance;
    
    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    private static int IdleWorkers = 0;
    
    
    //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static int retNthreads$O() {
        
        //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final int t$20524 = x10.lang.Runtime.get$NTHREADS();
        
        //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$20524;
    }
    
    
    //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static int retIdleWorkers$O() {
        
        //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$20525 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Workers t$20526 = ((x10.lang.Runtime.Workers)(t$20525.workers));
        
        //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final int t$20527 = t$20526.idleCount;
        
        //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$20527;
    }
    
    
    //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static int retTotalWorkers$O() {
        
        //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$20528 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Workers t$20529 = ((x10.lang.Runtime.Workers)(t$20528.workers));
        
        //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final int t$20530 = t$20529.count;
        
        //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$20530;
    }
    
    
    //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void wsInit() {
        
        //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$20531 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Deque t$20532 = ((x10.core.Deque)(new x10.core.Deque()));
        
        //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$20531.wsBlockedContinuations = ((x10.core.Deque)(t$20532));
    }
    
    
    //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static x10.core.Deque wsFIFO() {
        
        //#line 765 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$20533 = x10.core.Thread.currentThread();
        
        //#line 765 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$20534 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$20533,x10.lang.Runtime.Worker.$RTT);
        
        //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Deque t$20535 = ((x10.core.Deque)(t$20534.wsfifo));
        
        //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$20535;
    }
    
    
    //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void wsBlock(final java.lang.Object k) {
        
        //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$20536 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Deque t$20537 = ((x10.core.Deque)(t$20536.wsBlockedContinuations));
        
        //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$20537.push(((java.lang.Object)(k)));
    }
    
    
    //#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void wsUnblock() {
        
        //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$20538 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Deque src = ((x10.core.Deque)(t$20538.wsBlockedContinuations));
        
        //#line 765 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$20539 = x10.core.Thread.currentThread();
        
        //#line 765 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$20540 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$20539,x10.lang.Runtime.Worker.$RTT);
        
        //#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Deque dst = t$20540.wsfifo;
        
        //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        java.lang.Object k =  null;
        
        //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        while (true) {
            
            //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final java.lang.Object t$20541 = src.poll();
            
            //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final java.lang.Object t$20542 = k = ((java.lang.Object)(t$20541));
            
            //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20544 = ((t$20542) != (null));
            
            //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (!(t$20544)) {
                
                //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                break;
            }
            
            //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final java.lang.Object t$21208 = ((java.lang.Object)(k));
            
            //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            dst.push(((java.lang.Object)(t$21208)));
        }
    }
    
    
    //#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void wsEnd() {
        
        //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$20545 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$20545.wsEnd = true;
    }
    
    
    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static boolean wsEnded$O() {
        
        //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$20546 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$20547 = t$20546.wsEnd;
        
        //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$20547;
    }
    
    
    //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    @x10.runtime.impl.java.X10Generated
    public static interface Mortal extends x10.core.Any
    {
        public static final x10.rtt.RuntimeType<Mortal> $RTT = 
            x10.rtt.NamedType.<Mortal> make("x10.lang.Runtime.Mortal",
                                            Mortal.class);
        
        
    }
    
    
    //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class Workers extends x10.core.Ref implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<Workers> $RTT = 
            x10.rtt.NamedType.<Workers> make("x10.lang.Runtime.Workers",
                                             Workers.class);
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.Workers $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.lock = $deserializer.readObject();
            $_obj.workers = $deserializer.readObject();
            $_obj.parkedWorkers = $deserializer.readObject();
            $_obj.count = $deserializer.readInt();
            $_obj.spareCount = $deserializer.readInt();
            $_obj.idleCount = $deserializer.readInt();
            $_obj.deadCount = $deserializer.readInt();
            $_obj.spareNeeded = $deserializer.readInt();
            $_obj.multiplace = $deserializer.readBoolean();
            $_obj.busyWaiting = $deserializer.readBoolean();
            $_obj.probing = $deserializer.readBoolean();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Runtime.Workers $_obj = new x10.lang.Runtime.Workers((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.lock);
            $serializer.write(this.workers);
            $serializer.write(this.parkedWorkers);
            $serializer.write(this.count);
            $serializer.write(this.spareCount);
            $serializer.write(this.idleCount);
            $serializer.write(this.deadCount);
            $serializer.write(this.spareNeeded);
            $serializer.write(this.multiplace);
            $serializer.write(this.busyWaiting);
            $serializer.write(this.probing);
            
        }
        
        // constructor just for allocation
        public Workers(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.util.concurrent.Lock lock;
        
        //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.core.Rail<x10.lang.Runtime.Worker> workers;
        
        //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.core.Rail<x10.lang.Runtime.Worker> parkedWorkers;
        
        //#line 331 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public int count;
        
        //#line 332 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public int spareCount;
        
        //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public int idleCount;
        
        //#line 334 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public int deadCount;
        
        //#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public int spareNeeded;
        
        //#line 336 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public boolean multiplace;
        
        //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public boolean busyWaiting;
        
        //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public boolean probing;
        
        
        //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void reduce(final int n) {
            
            //#line 342 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.Lock t$20548 = ((x10.util.concurrent.Lock)(lock));
            
            //#line 342 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20548.lock();
            
            //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20549 = this.spareNeeded;
            
            //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20550 = ((t$20549) + (((int)(n))));
            
            //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.spareNeeded = t$20550;
            
            //#line 344 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.Lock t$20551 = ((x10.util.concurrent.Lock)(lock));
            
            //#line 344 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20551.unlock();
        }
        
        
        //#line 349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public int increase$O() {
            
            //#line 350 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.Lock t$20552 = ((x10.util.concurrent.Lock)(lock));
            
            //#line 350 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20552.lock();
            
            //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20553 = spareNeeded;
            
            //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20575 = ((t$20553) > (((int)(0))));
            
            //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20575) {
                
                //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$20554 = this.spareNeeded;
                
                //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$20555 = ((t$20554) - (((int)(1))));
                
                //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.spareNeeded = t$20555;
                
                //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.util.concurrent.Lock t$20556 = ((x10.util.concurrent.Lock)(lock));
                
                //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20556.unlock();
                
                //#line 354 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return 0;
            } else {
                
                //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$20557 = spareCount;
                
                //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$20574 = ((t$20557) > (((int)(0))));
                
                //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$20574) {
                    
                    //#line 357 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int t$20558 = this.spareCount;
                    
                    //#line 357 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int t$20559 = ((t$20558) - (((int)(1))));
                    
                    //#line 357 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int t$20560 = this.spareCount = t$20559;
                    
                    //#line 357 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int t$20561 = idleCount;
                    
                    //#line 357 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int i = ((t$20560) + (((int)(t$20561))));
                    
                    //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.core.Rail t$20562 = ((x10.core.Rail)(parkedWorkers));
                    
                    //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final long t$20563 = ((long)(((int)(i))));
                    
                    //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Runtime.Worker worker = ((x10.lang.Runtime.Worker[])t$20562.value)[(int)t$20563];
                    
                    //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.core.Rail t$20564 = ((x10.core.Rail)(parkedWorkers));
                    
                    //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final long t$20565 = ((long)(((int)(i))));
                    
                    //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ((x10.lang.Runtime.Worker[])t$20564.value)[(int)t$20565] = null;
                    
                    //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.util.concurrent.Lock t$20566 = ((x10.util.concurrent.Lock)(lock));
                    
                    //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    t$20566.unlock();
                    {
                        
                        //#line 644 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final boolean t$20567 = x10.lang.Runtime.get$STATIC_THREADS();
                        
                        //#line 644 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final boolean t$20568 = !(t$20567);
                        
                        //#line 644 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        if (t$20568) {
                            
                            //#line 645 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            worker./*non-virtual*/x10$lang$Thread$unpark$S();
                        }
                    }
                    
                    //#line 362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    return 0;
                } else {
                    
                    //#line 365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int t$20569 = this.count;
                    
                    //#line 365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int t$20570 = ((t$20569) + (((int)(1))));
                    
                    //#line 365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int t$20571 = this.count = t$20570;
                    
                    //#line 365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int i = ((t$20571) - (((int)(1))));
                    
                    //#line 366 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.util.concurrent.Lock t$20572 = ((x10.util.concurrent.Lock)(lock));
                    
                    //#line 366 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    t$20572.unlock();
                    
                    //#line 367 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int t$20573 = ((i) + (((int)(1))));
                    
                    //#line 367 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    this.check((int)(t$20573));
                    
                    //#line 368 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    return i;
                }
            }
        }
        
        
        //#line 374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public int promote$O() {
            
            //#line 375 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.Lock t$20576 = ((x10.util.concurrent.Lock)(lock));
            
            //#line 375 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20576.lock();
            
            //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20577 = this.count;
            
            //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20578 = ((t$20577) + (((int)(1))));
            
            //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20579 = this.count = t$20578;
            
            //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int i = ((t$20579) - (((int)(1))));
            
            //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20580 = this.deadCount;
            
            //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20581 = ((t$20580) + (((int)(1))));
            
            //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.deadCount = t$20581;
            
            //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.Lock t$20582 = ((x10.util.concurrent.Lock)(lock));
            
            //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20582.unlock();
            
            //#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20583 = ((i) + (((int)(1))));
            
            //#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.check((int)(t$20583));
            
            //#line 380 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return i;
        }
        
        
        //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void check(final int new_count) {
            
            //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20584 = x10.lang.Runtime.get$MAX_THREADS();
            
            //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20592 = ((new_count) > (((int)(t$20584))));
            
            //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20592) {
                
                //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final java.lang.String t$20585 = ((x10.lang.Place.place(x10.x10rt.X10RT.here())) + (": TOO MANY THREADS (there are now "));
                
                //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final java.lang.String t$20586 = ((t$20585) + ((x10.core.Int.$box(new_count))));
                
                //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final java.lang.String t$20587 = ((t$20586) + (" threads)."));
                
                //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                java.lang.System.err.println(t$20587);
                
                //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final java.lang.String t$20588 = ((x10.lang.Place.place(x10.x10rt.X10RT.here())) + (": TOO MANY THREADS (there are now "));
                
                //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final java.lang.String t$20589 = ((t$20588) + ((x10.core.Int.$box(new_count))));
                
                //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final java.lang.String t$20590 = ((t$20589) + (" threads)."));
                
                //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final java.lang.InternalError t$20591 = ((java.lang.InternalError)(new java.lang.InternalError(t$20590)));
                
                //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                throw t$20591;
            }
            
            //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20597 = x10.lang.Runtime.get$WARN_ON_THREAD_CREATION();
            
            //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20597) {
                
                //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final java.lang.String t$20593 = ((x10.lang.Place.place(x10.x10rt.X10RT.here())) + (": WARNING: A new OS-level thread was discovered (there are now "));
                
                //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final java.lang.String t$20594 = ((t$20593) + ((x10.core.Int.$box(new_count))));
                
                //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final java.lang.String t$20595 = ((t$20594) + (" threads)."));
                
                //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                java.lang.System.err.println(t$20595);
                
                //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                java.lang.System.err.println("NOTE: The following stack trace is not an error, but to help identify the origin of the new OS-level thread.");
                
                //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                try {{
                    
                    //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final java.lang.RuntimeException t$20596 = ((java.lang.RuntimeException)(new java.lang.RuntimeException()));
                    
                    //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    throw t$20596;
                }}catch (final java.lang.RuntimeException e) {
                    
                    //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    e.printStackTrace();
                }
            }
        }
        
        
        //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void convert() {
            
            //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            while (true) {
                
                //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$20598 = spareNeeded;
                
                //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                boolean t$20600 = ((t$20598) > (((int)(0))));
                
                //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$20600) {
                    
                    //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int t$20599 = idleCount;
                    
                    //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    t$20600 = ((t$20599) > (((int)(0))));
                }
                
                //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$20607 = t$20600;
                
                //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(t$20607)) {
                    
                    //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    break;
                }
                
                //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21209 = this.spareNeeded;
                
                //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21210 = ((t$21209) - (((int)(1))));
                
                //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.spareNeeded = t$21210;
                
                //#line 400 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21211 = this.idleCount;
                
                //#line 400 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21212 = ((t$21211) - (((int)(1))));
                
                //#line 400 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.idleCount = t$21212;
                
                //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21213 = this.spareCount;
                
                //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21214 = ((t$21213) + (((int)(1))));
                
                //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.spareCount = t$21214;
            }
        }
        
        
        //#line 406 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.lang.Activity yield(final x10.lang.Runtime.Worker worker) {
            
            //#line 407 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20608 = spareNeeded;
            
            //#line 407 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20609 = ((t$20608) <= (((int)(0))));
            
            //#line 407 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20609) {
                
                //#line 407 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return null;
            }
            
            //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.Lock t$20610 = ((x10.util.concurrent.Lock)(lock));
            
            //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20610.lock();
            
            //#line 409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.convert();
            
            //#line 410 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20611 = spareNeeded;
            
            //#line 410 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20613 = ((t$20611) <= (((int)(0))));
            
            //#line 410 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20613) {
                
                //#line 411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.util.concurrent.Lock t$20612 = ((x10.util.concurrent.Lock)(lock));
                
                //#line 411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20612.unlock();
                
                //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return null;
            }
            
            //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20614 = this.spareNeeded;
            
            //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20615 = ((t$20614) - (((int)(1))));
            
            //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.spareNeeded = t$20615;
            
            //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20616 = this.spareCount;
            
            //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20617 = ((t$20616) + (((int)(1))));
            
            //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20618 = this.spareCount = t$20617;
            
            //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20619 = ((t$20618) - (((int)(1))));
            
            //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20620 = idleCount;
            
            //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int i = ((t$20619) + (((int)(t$20620))));
            
            //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Rail t$20621 = ((x10.core.Rail)(parkedWorkers));
            
            //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$20622 = ((long)(((int)(i))));
            
            //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ((x10.lang.Runtime.Worker[])t$20621.value)[(int)t$20622] = worker;
            
            //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            while (true) {
                
                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.core.Rail t$20623 = ((x10.core.Rail)(parkedWorkers));
                
                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$20624 = ((long)(((int)(i))));
                
                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Worker t$20625 = ((x10.lang.Runtime.Worker[])t$20623.value)[(int)t$20624];
                
                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$20628 = x10.rtt.Equality.equalsequals((t$20625),(worker));
                
                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(t$20628)) {
                    
                    //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    break;
                }
                
                //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.util.concurrent.Lock t$21215 = ((x10.util.concurrent.Lock)(lock));
                
                //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21215.unlock();
                
                //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                x10.lang.Runtime.Worker.park();
                
                //#line 420 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.util.concurrent.Lock t$21216 = ((x10.util.concurrent.Lock)(lock));
                
                //#line 420 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21216.lock();
            }
            
            //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.Lock t$20629 = ((x10.util.concurrent.Lock)(lock));
            
            //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20629.unlock();
            
            //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Activity t$20630 = ((x10.lang.Activity)(worker.activity));
            
            //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return t$20630;
        }
        
        
        //#line 427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.lang.Activity take(final x10.lang.Runtime.Worker worker) {
            
            //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            boolean t$20631 = multiplace;
            
            //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20631) {
                
                //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20631 = busyWaiting;
            }
            
            //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            boolean t$20639 = t$20631;
            
            //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20639) {
                
                //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$20632 = idleCount;
                
                //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$20633 = spareNeeded;
                
                //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$20634 = ((t$20632) - (((int)(t$20633))));
                
                //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$20637 = ((long)(((int)(t$20634))));
                
                //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$20635 = x10.lang.Runtime.get$NTHREADS();
                
                //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$20636 = ((long)(((int)(t$20635))));
                
                //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$20638 = ((t$20636) - (((long)(1L))));
                
                //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20639 = ((t$20637) >= (((long)(t$20638))));
            }
            
            //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20640 = t$20639;
            
            //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20640) {
                
                //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return null;
            }
            
            //#line 429 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.Lock t$20641 = ((x10.util.concurrent.Lock)(lock));
            
            //#line 429 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20641.lock();
            
            //#line 430 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.convert();
            
            //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            boolean t$20642 = multiplace;
            
            //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20642) {
                
                //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20642 = busyWaiting;
            }
            
            //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            boolean t$20648 = t$20642;
            
            //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20648) {
                
                //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$20643 = idleCount;
                
                //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$20646 = ((long)(((int)(t$20643))));
                
                //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$20644 = x10.lang.Runtime.get$NTHREADS();
                
                //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$20645 = ((long)(((int)(t$20644))));
                
                //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$20647 = ((t$20645) - (((long)(1L))));
                
                //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20648 = ((t$20646) >= (((long)(t$20647))));
            }
            
            //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20650 = t$20648;
            
            //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20650) {
                
                //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.util.concurrent.Lock t$20649 = ((x10.util.concurrent.Lock)(lock));
                
                //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20649.unlock();
                
                //#line 433 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return null;
            }
            
            //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            boolean t$20652 = multiplace;
            
            //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20652) {
                
                //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$20651 = busyWaiting;
                
                //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20652 = !(t$20651);
            }
            
            //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            boolean t$20654 = t$20652;
            
            //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20654) {
                
                //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$20653 = probing;
                
                //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20654 = !(t$20653);
            }
            
            //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20661 = t$20654;
            
            //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20661) {
                
                //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.probing = true;
                
                //#line 437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.util.concurrent.Lock t$20655 = ((x10.util.concurrent.Lock)(lock));
                
                //#line 437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20655.unlock();
                
                //#line 438 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                x10.runtime.impl.java.Runtime.blockingProbe();
                
                //#line 439 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.util.concurrent.Lock t$20656 = ((x10.util.concurrent.Lock)(lock));
                
                //#line 439 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20656.lock();
                
                //#line 440 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.probing = false;
                
                //#line 441 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.util.concurrent.Lock t$20657 = ((x10.util.concurrent.Lock)(lock));
                
                //#line 441 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20657.unlock();
                
                //#line 561 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.core.Deque t$20658 = ((x10.core.Deque)(worker.queue));
                
                //#line 561 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final java.lang.Object t$20659 = t$20658.poll();
                
                //#line 561 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Activity t$20660 = x10.rtt.Types.<x10.lang.Activity> cast(t$20659,x10.lang.Activity.$RTT);
                
                //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return t$20660;
            }
            
            //#line 444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20665 = spareCount;
            
            //#line 444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20662 = this.idleCount;
            
            //#line 444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20663 = ((t$20662) + (((int)(1))));
            
            //#line 444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20664 = this.idleCount = t$20663;
            
            //#line 444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20666 = ((t$20664) - (((int)(1))));
            
            //#line 444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int i = ((t$20665) + (((int)(t$20666))));
            
            //#line 445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Rail t$20667 = ((x10.core.Rail)(parkedWorkers));
            
            //#line 445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$20668 = ((long)(((int)(i))));
            
            //#line 445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ((x10.lang.Runtime.Worker[])t$20667.value)[(int)t$20668] = worker;
            
            //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            while (true) {
                
                //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.core.Rail t$20669 = ((x10.core.Rail)(parkedWorkers));
                
                //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$20670 = ((long)(((int)(i))));
                
                //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Worker t$20671 = ((x10.lang.Runtime.Worker[])t$20669.value)[(int)t$20670];
                
                //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$20674 = x10.rtt.Equality.equalsequals((t$20671),(worker));
                
                //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(t$20674)) {
                    
                    //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    break;
                }
                
                //#line 447 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.util.concurrent.Lock t$21217 = ((x10.util.concurrent.Lock)(lock));
                
                //#line 447 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21217.unlock();
                
                //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                x10.lang.Runtime.Worker.park();
                
                //#line 449 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.util.concurrent.Lock t$21218 = ((x10.util.concurrent.Lock)(lock));
                
                //#line 449 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21218.lock();
            }
            
            //#line 451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.Lock t$20675 = ((x10.util.concurrent.Lock)(lock));
            
            //#line 451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20675.unlock();
            
            //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Activity t$20676 = ((x10.lang.Activity)(worker.activity));
            
            //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return t$20676;
        }
        
        
        //#line 455 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void wakeup() {
            
            //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20677 = idleCount;
            
            //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20678 = spareNeeded;
            
            //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20679 = ((t$20677) - (((int)(t$20678))));
            
            //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            boolean t$20681 = ((t$20679) <= (((int)(0))));
            
            //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20681) {
                
                //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$20680 = probing;
                
                //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20681 = !(t$20680);
            }
            
            //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20682 = t$20681;
            
            //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20682) {
                
                //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return;
            }
            
            //#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.Lock t$20683 = ((x10.util.concurrent.Lock)(lock));
            
            //#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20683.lock();
            
            //#line 458 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.convert();
            
            //#line 459 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20684 = idleCount;
            
            //#line 459 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20688 = ((t$20684) <= (((int)(0))));
            
            //#line 459 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20688) {
                
                //#line 460 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean p = probing;
                
                //#line 461 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.util.concurrent.Lock t$20685 = ((x10.util.concurrent.Lock)(lock));
                
                //#line 461 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20685.unlock();
                
                //#line 462 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                boolean t$20686 = p;
                
                //#line 462 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$20686) {
                    
                    //#line 462 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    t$20686 = multiplace;
                }
                
                //#line 462 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$20687 = t$20686;
                
                //#line 462 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$20687) {
                    
                    //#line 462 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    x10.runtime.impl.java.Runtime.unblockProbe();
                }
                
                //#line 463 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return;
            }
            
            //#line 465 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20691 = spareCount;
            
            //#line 465 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20689 = this.idleCount;
            
            //#line 465 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20690 = ((t$20689) - (((int)(1))));
            
            //#line 465 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20692 = this.idleCount = t$20690;
            
            //#line 465 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int i = ((t$20691) + (((int)(t$20692))));
            
            //#line 466 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Rail t$20693 = ((x10.core.Rail)(parkedWorkers));
            
            //#line 466 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$20694 = ((long)(((int)(i))));
            
            //#line 466 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Worker worker = ((x10.lang.Runtime.Worker[])t$20693.value)[(int)t$20694];
            
            //#line 467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Rail t$20695 = ((x10.core.Rail)(parkedWorkers));
            
            //#line 467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$20696 = ((long)(((int)(i))));
            
            //#line 467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ((x10.lang.Runtime.Worker[])t$20695.value)[(int)t$20696] = null;
            
            //#line 468 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.Lock t$20697 = ((x10.util.concurrent.Lock)(lock));
            
            //#line 468 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20697.unlock();
            
            //#line 644 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$21219 = x10.lang.Runtime.get$STATIC_THREADS();
            
            //#line 644 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$21220 = !(t$21219);
            
            //#line 644 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$21220) {
                
                //#line 645 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                worker./*non-virtual*/x10$lang$Thread$unpark$S();
            }
        }
        
        
        //#line 474 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public boolean give$O(final x10.lang.Activity activity) {
            
            //#line 475 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20700 = idleCount;
            
            //#line 475 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20701 = spareNeeded;
            
            //#line 475 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20702 = ((t$20700) - (((int)(t$20701))));
            
            //#line 475 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            boolean t$20704 = ((t$20702) <= (((int)(0))));
            
            //#line 475 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20704) {
                
                //#line 475 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$20703 = probing;
                
                //#line 475 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20704 = !(t$20703);
            }
            
            //#line 475 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20705 = t$20704;
            
            //#line 475 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20705) {
                
                //#line 475 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return false;
            }
            
            //#line 476 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.Lock t$20706 = ((x10.util.concurrent.Lock)(lock));
            
            //#line 476 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20706.lock();
            
            //#line 477 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.convert();
            
            //#line 478 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20707 = idleCount;
            
            //#line 478 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20711 = ((t$20707) <= (((int)(0))));
            
            //#line 478 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20711) {
                
                //#line 479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean p = probing;
                
                //#line 480 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.util.concurrent.Lock t$20708 = ((x10.util.concurrent.Lock)(lock));
                
                //#line 480 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20708.unlock();
                
                //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                boolean t$20709 = p;
                
                //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$20709) {
                    
                    //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    t$20709 = multiplace;
                }
                
                //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$20710 = t$20709;
                
                //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$20710) {
                    
                    //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    x10.runtime.impl.java.Runtime.unblockProbe();
                }
                
                //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return false;
            }
            
            //#line 484 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20714 = spareCount;
            
            //#line 484 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20712 = this.idleCount;
            
            //#line 484 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20713 = ((t$20712) - (((int)(1))));
            
            //#line 484 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20715 = this.idleCount = t$20713;
            
            //#line 484 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int i = ((t$20714) + (((int)(t$20715))));
            
            //#line 485 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Rail t$20716 = ((x10.core.Rail)(parkedWorkers));
            
            //#line 485 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$20717 = ((long)(((int)(i))));
            
            //#line 485 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Worker worker = ((x10.lang.Runtime.Worker[])t$20716.value)[(int)t$20717];
            
            //#line 486 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            worker.activity = ((x10.lang.Activity)(activity));
            
            //#line 487 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Rail t$20718 = ((x10.core.Rail)(parkedWorkers));
            
            //#line 487 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$20719 = ((long)(((int)(i))));
            
            //#line 487 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ((x10.lang.Runtime.Worker[])t$20718.value)[(int)t$20719] = null;
            
            //#line 488 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.Lock t$20720 = ((x10.util.concurrent.Lock)(lock));
            
            //#line 488 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20720.unlock();
            
            //#line 644 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$21221 = x10.lang.Runtime.get$STATIC_THREADS();
            
            //#line 644 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$21222 = !(t$21221);
            
            //#line 644 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$21222) {
                
                //#line 645 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                worker./*non-virtual*/x10$lang$Thread$unpark$S();
            }
            
            //#line 490 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return true;
        }
        
        
        //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void reclaim() {
            
            //#line 495 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.Lock t$20723 = ((x10.util.concurrent.Lock)(lock));
            
            //#line 495 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20723.lock();
            
            //#line 496 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20724 = this.deadCount;
            
            //#line 496 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20725 = ((t$20724) + (((int)(1))));
            
            //#line 496 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.deadCount = t$20725;
            
            //#line 497 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            while (true) {
                
                //#line 497 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$20726 = idleCount;
                
                //#line 497 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$20737 = ((t$20726) > (((int)(0))));
                
                //#line 497 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(t$20737)) {
                    
                    //#line 497 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    break;
                }
                
                //#line 498 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21223 = spareCount;
                
                //#line 498 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21224 = this.idleCount;
                
                //#line 498 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21225 = ((t$21224) - (((int)(1))));
                
                //#line 498 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21226 = this.idleCount = t$21225;
                
                //#line 498 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int i$21227 = ((t$21223) + (((int)(t$21226))));
                
                //#line 499 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.core.Rail t$21228 = ((x10.core.Rail)(parkedWorkers));
                
                //#line 499 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21229 = ((long)(((int)(i$21227))));
                
                //#line 499 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Worker worker$21230 = ((x10.lang.Runtime.Worker[])t$21228.value)[(int)t$21229];
                
                //#line 500 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.core.Rail t$21231 = ((x10.core.Rail)(parkedWorkers));
                
                //#line 500 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21232 = ((long)(((int)(i$21227))));
                
                //#line 500 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ((x10.lang.Runtime.Worker[])t$21231.value)[(int)t$21232] = null;
                {
                    
                    //#line 644 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final boolean t$21233 = x10.lang.Runtime.get$STATIC_THREADS();
                    
                    //#line 644 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final boolean t$21234 = !(t$21233);
                    
                    //#line 644 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (t$21234) {
                        
                        //#line 645 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        worker$21230./*non-virtual*/x10$lang$Thread$unpark$S();
                    }
                }
            }
            
            //#line 503 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20738 = spareCount;
            
            //#line 503 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20749 = ((t$20738) > (((int)(0))));
            
            //#line 503 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20749) {
                
                //#line 504 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.core.Rail t$20742 = ((x10.core.Rail)(parkedWorkers));
                
                //#line 504 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$20739 = this.spareCount;
                
                //#line 504 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$20740 = ((t$20739) - (((int)(1))));
                
                //#line 504 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$20741 = this.spareCount = t$20740;
                
                //#line 504 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$20743 = ((long)(((int)(t$20741))));
                
                //#line 504 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Worker worker = ((x10.lang.Runtime.Worker[])t$20742.value)[(int)t$20743];
                
                //#line 505 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.core.Rail t$20745 = ((x10.core.Rail)(parkedWorkers));
                
                //#line 505 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$20744 = spareCount;
                
                //#line 505 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$20746 = ((long)(((int)(t$20744))));
                
                //#line 505 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ((x10.lang.Runtime.Worker[])t$20745.value)[(int)t$20746] = null;
                {
                    
                    //#line 644 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final boolean t$20747 = x10.lang.Runtime.get$STATIC_THREADS();
                    
                    //#line 644 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final boolean t$20748 = !(t$20747);
                    
                    //#line 644 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (t$20748) {
                        
                        //#line 645 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        worker./*non-virtual*/x10$lang$Thread$unpark$S();
                    }
                }
            }
            
            //#line 508 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean p = probing;
            
            //#line 509 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.Lock t$20750 = ((x10.util.concurrent.Lock)(lock));
            
            //#line 509 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20750.unlock();
            
            //#line 510 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            boolean t$20751 = p;
            
            //#line 510 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20751) {
                
                //#line 510 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20751 = multiplace;
            }
            
            //#line 510 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20752 = t$20751;
            
            //#line 510 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20752) {
                
                //#line 510 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                x10.runtime.impl.java.Runtime.unblockProbe();
            }
        }
        
        
        //#line 513 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.lang.Runtime.Worker $apply(final int i) {
            
            //#line 513 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Rail t$20753 = ((x10.core.Rail)(workers));
            
            //#line 513 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$20754 = ((long)(((int)(i))));
            
            //#line 513 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Worker t$20755 = ((x10.lang.Runtime.Worker[])t$20753.value)[(int)t$20754];
            
            //#line 513 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return t$20755;
        }
        
        
        //#line 514 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void $set(final int i, final x10.lang.Runtime.Worker worker) {
            
            //#line 514 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Rail t$20756 = ((x10.core.Rail)(workers));
            
            //#line 514 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$20757 = ((long)(((int)(i))));
            
            //#line 514 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ((x10.lang.Runtime.Worker[])t$20756.value)[(int)t$20757] = worker;
        }
        
        
        //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final public x10.lang.Runtime.Workers x10$lang$Runtime$Workers$$this$x10$lang$Runtime$Workers() {
            
            //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return x10.lang.Runtime.Workers.this;
        }
        
        
        //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        // creation method for java code (1-phase java constructor)
        public Workers() {
            this((java.lang.System[]) null);
            x10$lang$Runtime$Workers$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.lang.Runtime.Workers x10$lang$Runtime$Workers$$init$S() {
             {
                
                //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                
                
                //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.__fieldInitializers_x10_lang_Runtime_Workers();
            }
            return this;
        }
        
        
        
        //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final public void __fieldInitializers_x10_lang_Runtime_Workers() {
            
            //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.Lock t$20758 = ((x10.util.concurrent.Lock)(new x10.util.concurrent.Lock()));
            
            //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.lock = ((x10.util.concurrent.Lock)(t$20758));
            
            //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20759 = x10.lang.Runtime.get$MAX_THREADS();
            
            //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$20760 = ((long)(((int)(t$20759))));
            
            //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Rail t$20761 = ((x10.core.Rail)(new x10.core.Rail<x10.lang.Runtime.Worker>(x10.lang.Runtime.Worker.$RTT, t$20760)));
            
            //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.workers = ((x10.core.Rail)(t$20761));
            
            //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20762 = x10.lang.Runtime.get$MAX_THREADS();
            
            //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$20763 = ((long)(((int)(t$20762))));
            
            //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Rail t$20764 = ((x10.core.Rail)(new x10.core.Rail<x10.lang.Runtime.Worker>(x10.lang.Runtime.Worker.$RTT, t$20763)));
            
            //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.parkedWorkers = ((x10.core.Rail)(t$20764));
            
            //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.count = 0;
            
            //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.spareCount = 0;
            
            //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.idleCount = 0;
            
            //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.deadCount = 0;
            
            //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.spareNeeded = 0;
            
            //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.multiplace = true;
            
            //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.busyWaiting = true;
            
            //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.probing = false;
        }
    }
    
    
    //#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class Worker extends x10.core.Thread implements x10.io.Unserializable, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<Worker> $RTT = 
            x10.rtt.NamedType.<Worker> make("x10.lang.Runtime.Worker",
                                            Worker.class,
                                            new x10.rtt.Type[] {
                                                x10.io.Unserializable.$RTT,
                                                x10.core.Thread.$RTT
                                            });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            throw new x10.io.NotSerializableException("Can't serialize x10.lang.Runtime.Worker");
        }
        
        // constructor just for allocation
        public Worker(final java.lang.System[] $dummy) {
            super($dummy);
            
        }
        
        
    
        
        //#line 519 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final private static int BOUND = 100;
        
        //#line 522 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.lang.Activity activity;
        
        //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.core.Deque queue;
        
        //#line 528 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.util.Random random;
        
        //#line 531 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public int workerId;
        
        //#line 534 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.core.Deque wsfifo;
        
        
        //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public Worker(final int workerId) {
            super((("X10 worker thread-") + ((x10.core.Int.$box(workerId)))));
             {
                
                //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                
                
                //#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.__fieldInitializers_x10_lang_Runtime_Worker();
                
                //#line 538 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.workerId = workerId;
                
                //#line 539 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.random = ((x10.util.Random)((new java.io.Serializable() { x10.util.Random eval() {
                    
                    //#line 539 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.util.Random alloc$2786 = ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null)));
                    
                    //#line 539 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    alloc$2786.x10$util$Random$$init$S(((long)(((int)(((((((workerId) + (((int)(((workerId) << (int)(((long)(((long)(((int)(8))))))))))))) + (((int)(((workerId) << (int)(((long)(((long)(((int)(16))))))))))))) + (((int)(((workerId) << (int)(((long)(((long)(((int)(24)))))))))))))))));
                    return alloc$2786;
                } }.eval())));
            }
        }
        
        
        
        //#line 542 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public Worker(final int workerId, final boolean dummy) {
            super();
             {
                
                //#line 542 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                
                
                //#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.__fieldInitializers_x10_lang_Runtime_Worker();
                
                //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.workerId = workerId;
                
                //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.random = ((x10.util.Random)((new java.io.Serializable() { x10.util.Random eval() {
                    
                    //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.util.Random alloc$2787 = ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null)));
                    
                    //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    alloc$2787.x10$util$Random$$init$S(((long)(((int)(((((((workerId) + (((int)(((workerId) << (int)(((long)(((long)(((int)(8))))))))))))) + (((int)(((workerId) << (int)(((long)(((long)(((int)(16))))))))))))) + (((int)(((workerId) << (int)(((long)(((long)(((int)(24)))))))))))))))));
                    return alloc$2787;
                } }.eval())));
                
                //#line 551 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.activity = ((x10.lang.Activity)((new java.io.Serializable() { x10.lang.Activity eval() {
                    
                    //#line 551 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Activity alloc$2789 = ((x10.lang.Activity)(new x10.lang.Activity((java.lang.System[]) null)));
                    
                    //#line 551 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    alloc$2789.x10$lang$Activity$$init$S(((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.Worker.$Closure$0())), ((x10.lang.Place)((new java.io.Serializable() { x10.lang.Place eval() {
                                                             
                                                             //#line 551 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                                             final x10.lang.Place alloc$2788 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                                                             
                                                             //#line 551 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                                             alloc$2788.x10$lang$Place$$init$S(((long)(0L)));
                                                             return alloc$2788;
                                                         } }.eval()))), ((x10.lang.FinishState)(x10.lang.FinishState.get$UNCOUNTED_FINISH())));
                    return alloc$2789;
                } }.eval())));
            }
        }
        
        
        
        //#line 555 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public int size$O() {
            
            //#line 555 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Deque t$20765 = ((x10.core.Deque)(queue));
            
            //#line 555 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20766 = t$20765.size$O();
            
            //#line 555 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return t$20766;
        }
        
        
        //#line 558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.lang.Activity activity() {
            
            //#line 558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Activity t$20767 = ((x10.lang.Activity)(activity));
            
            //#line 558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return t$20767;
        }
        
        
        //#line 561 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.lang.Activity poll() {
            
            //#line 561 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Deque t$20768 = ((x10.core.Deque)(queue));
            
            //#line 561 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final java.lang.Object t$20769 = t$20768.poll();
            
            //#line 561 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Activity t$20770 = x10.rtt.Types.<x10.lang.Activity> cast(t$20769,x10.lang.Activity.$RTT);
            
            //#line 561 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return t$20770;
        }
        
        
        //#line 564 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.lang.Activity steal() {
            
            //#line 564 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Deque t$20771 = ((x10.core.Deque)(queue));
            
            //#line 564 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final java.lang.Object t$20772 = t$20771.steal();
            
            //#line 564 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Activity t$20773 = x10.rtt.Types.<x10.lang.Activity> cast(t$20772,x10.lang.Activity.$RTT);
            
            //#line 564 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return t$20773;
        }
        
        
        //#line 567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void push(final x10.lang.Activity activity) {
            
            //#line 567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Deque t$20774 = ((x10.core.Deque)(queue));
            
            //#line 567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20774.push(((java.lang.Object)(activity)));
        }
        
        
        //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void $apply() {
            
            //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            try {{
                
                //#line 572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                while (true) {
                    
                    //#line 572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final boolean t$20775 = this.loop$O();
                    
                    //#line 572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (!(t$20775)) {
                        
                        //#line 572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        break;
                    }
                }
            }}catch (final java.lang.Throwable t) {
                
                //#line 574 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                java.lang.System.err.println("Uncaught exception in worker thread");
                
                //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t.printStackTrace();
            }finally {{
                 
                 //#line 577 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                 final x10.lang.Runtime.Pool t$20776 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                 
                 //#line 577 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                 t$20776.release();
             }}
            }
        
        
        //#line 582 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        private boolean loop$O() {
            
            //#line 583 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            int i$21256 = 0;
            
            //#line 583 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            for (;
                 true;
                 ) {
                
                //#line 583 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21257 = i$21256;
                
                //#line 583 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$21258 = ((t$21257) < (((int)(100))));
                
                //#line 583 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(t$21258)) {
                    
                    //#line 583 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    break;
                }
                
                //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                boolean t$21239 = false;
                
                //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                do  {
                    
                    //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Runtime.Worker this$21235 = ((x10.lang.Runtime.Worker)(this));
                    
                    //#line 561 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.core.Deque t$21236 = ((x10.core.Deque)(this$21235.queue));
                    
                    //#line 561 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final java.lang.Object t$21237 = t$21236.poll();
                    
                    //#line 561 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Activity t$21238 = x10.rtt.Types.<x10.lang.Activity> cast(t$21237,x10.lang.Activity.$RTT);
                    
                    //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    this.activity = ((x10.lang.Activity)(t$21238));
                    
                    //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Activity t$21240 = ((x10.lang.Activity)(activity));
                    
                    //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    boolean t$21241 = ((t$21240) != (null));
                    
                    //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (t$21241) {
                        
                        //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Runtime.Pool t$21242 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                        
                        //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Activity t$21243 = ((x10.lang.Activity)(activity));
                        
                        //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        t$21241 = t$21242.deal$O(((x10.lang.Activity)(t$21243)));
                    }
                    
                    //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final boolean t$21244 = t$21241;
                    
                    //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    t$21239 = t$21244;
                }while(t$21239); 
                
                //#line 585 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Activity t$21245 = ((x10.lang.Activity)(activity));
                
                //#line 585 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$21246 = ((t$21245) == (null));
                
                //#line 585 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$21246) {
                    
                    //#line 586 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Runtime.Pool t$21247 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                    
                    //#line 586 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.util.Random t$21248 = ((x10.util.Random)(random));
                    
                    //#line 586 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Activity t$21249 = t$21247.scan(((x10.util.Random)(t$21248)), ((x10.lang.Runtime.Worker)(this)));
                    
                    //#line 586 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    this.activity = ((x10.lang.Activity)(t$21249));
                    
                    //#line 587 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Activity t$21250 = ((x10.lang.Activity)(activity));
                    
                    //#line 587 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final boolean t$21251 = ((t$21250) == (null));
                    
                    //#line 587 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (t$21251) {
                        
                        //#line 587 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        return false;
                    }
                }
                
                //#line 589 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Activity t$21252 = ((x10.lang.Activity)(activity));
                
                //#line 589 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21252.run();
                
                //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
                final x10.lang.Activity o$21253 = ((x10.lang.Activity)(activity));
                
                //#line 583 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21254 = i$21256;
                
                //#line 583 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21255 = ((t$21254) + (((int)(1))));
                
                //#line 583 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                i$21256 = t$21255;
            }
            
            //#line 592 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return true;
        }
        
        public static boolean loop$P$O(final x10.lang.Runtime.Worker Worker) {
            return Worker.loop$O();
        }
        
        
        //#line 595 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void probe() {
            
            //#line 597 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Activity tmp = ((x10.lang.Activity)(activity));
            
            //#line 598 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.runtime.impl.java.Runtime.eventProbe();
            
            //#line 599 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            for (;
                 ;
                 ) {
                
                //#line 600 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Worker this$21259 = ((x10.lang.Runtime.Worker)(this));
                
                //#line 561 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.core.Deque t$21260 = ((x10.core.Deque)(this$21259.queue));
                
                //#line 561 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final java.lang.Object t$21261 = t$21260.poll();
                
                //#line 561 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Activity t$21262 = x10.rtt.Types.<x10.lang.Activity> cast(t$21261,x10.lang.Activity.$RTT);
                
                //#line 600 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.activity = ((x10.lang.Activity)(t$21262));
                
                //#line 601 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Activity t$21263 = ((x10.lang.Activity)(activity));
                
                //#line 601 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$21264 = ((t$21263) == (null));
                
                //#line 601 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$21264) {
                    
                    //#line 602 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    this.activity = ((x10.lang.Activity)(tmp));
                    
                    //#line 603 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    return;
                }
                
                //#line 605 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Activity t$21265 = ((x10.lang.Activity)(activity));
                
                //#line 605 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21265.run();
                
                //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
                final x10.lang.Activity o$21266 = ((x10.lang.Activity)(activity));
            }
        }
        
        
        //#line 611 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void join(final x10.util.concurrent.SimpleLatch latch) {
            
            //#line 612 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Activity tmp = ((x10.lang.Activity)(activity));
            
            //#line 613 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            while (true) {
                
                //#line 613 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$20806 = this.loop2$O(((x10.util.concurrent.SimpleLatch)(latch)));
                
                //#line 613 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(t$20806)) {
                    
                    //#line 613 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    break;
                }
            }
            
            //#line 614 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.activity = ((x10.lang.Activity)(tmp));
        }
        
        
        //#line 618 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        private boolean loop2$O(final x10.util.concurrent.SimpleLatch latch) {
            
            //#line 619 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            int i$21284 = 0;
            
            //#line 619 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            for (;
                 true;
                 ) {
                
                //#line 619 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21285 = i$21284;
                
                //#line 619 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$21286 = ((t$21285) < (((int)(100))));
                
                //#line 619 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(t$21286)) {
                    
                    //#line 619 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    break;
                }
                
                //#line 620 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$21277 = latch.$apply$O();
                
                //#line 620 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$21277) {
                    
                    //#line 620 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    return false;
                }
                
                //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                boolean t$21271 = false;
                
                //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                do  {
                    
                    //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Runtime.Worker this$21267 = ((x10.lang.Runtime.Worker)(this));
                    
                    //#line 561 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.core.Deque t$21268 = ((x10.core.Deque)(this$21267.queue));
                    
                    //#line 561 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final java.lang.Object t$21269 = t$21268.poll();
                    
                    //#line 561 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Activity t$21270 = x10.rtt.Types.<x10.lang.Activity> cast(t$21269,x10.lang.Activity.$RTT);
                    
                    //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    this.activity = ((x10.lang.Activity)(t$21270));
                    
                    //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Activity t$21272 = ((x10.lang.Activity)(activity));
                    
                    //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    boolean t$21273 = ((t$21272) != (null));
                    
                    //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (t$21273) {
                        
                        //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Runtime.Pool t$21274 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                        
                        //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Activity t$21275 = ((x10.lang.Activity)(activity));
                        
                        //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        t$21273 = t$21274.deal$O(((x10.lang.Activity)(t$21275)));
                    }
                    
                    //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final boolean t$21276 = t$21273;
                    
                    //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    t$21271 = t$21276;
                }while(t$21271); 
                
                //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Activity t$21278 = ((x10.lang.Activity)(activity));
                
                //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$21279 = ((t$21278) == (null));
                
                //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$21279) {
                    
                    //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    return false;
                }
                
                //#line 627 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Activity t$21280 = ((x10.lang.Activity)(activity));
                
                //#line 627 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21280.run();
                
                //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
                final x10.lang.Activity o$21281 = ((x10.lang.Activity)(activity));
                
                //#line 619 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21282 = i$21284;
                
                //#line 619 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21283 = ((t$21282) + (((int)(1))));
                
                //#line 619 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                i$21284 = t$21283;
            }
            
            //#line 630 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return true;
        }
        
        public static boolean loop2$P$O(final x10.util.concurrent.SimpleLatch latch, final x10.lang.Runtime.Worker Worker) {
            return Worker.loop2$O(((x10.util.concurrent.SimpleLatch)(latch)));
        }
        
        
        //#line 634 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public static void park() {
            
            //#line 635 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20825 = x10.lang.Runtime.get$STATIC_THREADS();
            
            //#line 635 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20826 = !(t$20825);
            
            //#line 635 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20826) {
                
                //#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                x10.core.Thread.park();
            } else {
                
                //#line 638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                x10.lang.Runtime.probe();
            }
        }
        
        
        //#line 643 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void unpark() {
            
            //#line 644 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20827 = x10.lang.Runtime.get$STATIC_THREADS();
            
            //#line 644 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20828 = !(t$20827);
            
            //#line 644 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20828) {
                
                //#line 645 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                super.unpark();
            }
        }
        
        
        //#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final public x10.lang.Runtime.Worker x10$lang$Runtime$Worker$$this$x10$lang$Runtime$Worker() {
            
            //#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return x10.lang.Runtime.Worker.this;
        }
        
        
        //#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final public void __fieldInitializers_x10_lang_Runtime_Worker() {
            
            //#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.activity = null;
            
            //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Deque t$20829 = ((x10.core.Deque)(new x10.core.Deque()));
            
            //#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.queue = ((x10.core.Deque)(t$20829));
            
            //#line 534 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Deque t$20830 = ((x10.core.Deque)(new x10.core.Deque()));
            
            //#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.wsfifo = ((x10.core.Deque)(t$20830));
        }
        
        public static int get$BOUND() {
            return x10.lang.Runtime.Worker.BOUND;
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$0 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$0> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$0> make($Closure$0.class,
                                                            new x10.rtt.Type[] {
                                                                x10.core.fun.VoidFun_0_0.$RTT
                                                            });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.Worker.$Closure$0 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                x10.lang.Runtime.Worker.$Closure$0 $_obj = new x10.lang.Runtime.Worker.$Closure$0((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                
            }
            
            // constructor just for allocation
            public $Closure$0(final java.lang.System[] $dummy) {
                
            }
            
            
        
            
            public void $apply() {
                
            }
            
            public $Closure$0() {
                 {
                    
                }
            }
            
        }
        
        
        public void x10$lang$Thread$unpark$S() {
            super.unpark();
        }
        }
        
    
    //#line 650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    @x10.runtime.impl.java.X10Generated
    public static class Pool extends x10.core.Ref implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<Pool> $RTT = 
            x10.rtt.NamedType.<Pool> make("x10.lang.Runtime.Pool",
                                          Pool.class);
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.Pool $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.latch = $deserializer.readObject();
            $_obj.watcher = $deserializer.readObject();
            $_obj.wsEnd = $deserializer.readBoolean();
            $_obj.workers = $deserializer.readObject();
            $_obj.wsBlockedContinuations = $deserializer.readObject();
            $_obj.numDead = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Runtime.Pool $_obj = new x10.lang.Runtime.Pool((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.latch);
            $serializer.write(this.watcher);
            $serializer.write(this.wsEnd);
            $serializer.write(this.workers);
            $serializer.write(this.wsBlockedContinuations);
            $serializer.write(this.numDead);
            
        }
        
        // constructor just for allocation
        public Pool(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        //#line 651 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.util.concurrent.SimpleLatch latch;
        
        //#line 652 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.lang.Runtime.Watcher watcher;
        
        //#line 654 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public boolean wsEnd;
        
        //#line 656 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.lang.Runtime.Workers workers;
        
        //#line 658 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.core.Deque wsBlockedContinuations;
        
        
        //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.lang.Runtime.Workers getWorkers() {
            
            //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Workers t$20831 = ((x10.lang.Runtime.Workers)(workers));
            
            //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return t$20831;
        }
        
        
        //#line 661 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public long numDead;
        
        
        //#line 663 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void removeThreadLocalContexts() {
            
            //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            int i = 0;
            
            //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            for (;
                 true;
                 ) {
                
                //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$20834 = i;
                
                //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Workers t$20833 = ((x10.lang.Runtime.Workers)(workers));
                
                //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$20835 = t$20833.count;
                
                //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$20843 = ((t$20834) < (((int)(t$20835))));
                
                //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(t$20843)) {
                    
                    //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    break;
                }
                
                //#line 665 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Workers t$21287 = ((x10.lang.Runtime.Workers)(workers));
                
                //#line 665 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.core.Rail t$21288 = ((x10.core.Rail)(t$21287.workers));
                
                //#line 665 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21289 = i;
                
                //#line 665 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21290 = ((long)(((int)(t$21289))));
                
                //#line 665 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Worker t$21291 = ((x10.lang.Runtime.Worker[])t$21288.value)[(int)t$21290];
                
                //#line 665 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21291.removeWorkerContext();
                
                //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21292 = i;
                
                //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21293 = ((t$21292) + (((int)(1))));
                
                //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                i = t$21293;
            }
        }
        
        
        //#line 668 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void $apply(final int n) {
            
            //#line 669 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Workers t$20845 = ((x10.lang.Runtime.Workers)(workers));
            
            //#line 669 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$20844 = x10.lang.Place.get$ALL_PLACES();
            
            //#line 669 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20846 = ((t$20844) > (((long)(1L))));
            
            //#line 669 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20845.multiplace = t$20846;
            
            //#line 671 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Workers t$20851 = ((x10.lang.Runtime.Workers)(workers));
            
            //#line 671 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            boolean t$20848 = x10.lang.Runtime.get$BUSY_WAITING();
            
            //#line 671 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (!(t$20848)) {
                
                //#line 671 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$20847 = x10.x10rt.X10RT.blockingProbeSupport();
                
                //#line 671 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20848 = !(t$20847);
            }
            
            //#line 671 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            boolean t$20850 = t$20848;
            
            //#line 671 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (!(t$20850)) {
                
                //#line 671 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$20849 = x10.lang.Runtime.get$RESILIENT_MODE();
                
                //#line 671 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20850 = ((int) t$20849) != ((int) 0);
            }
            
            //#line 671 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20852 = t$20850;
            
            //#line 671 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20851.busyWaiting = t$20852;
            
            //#line 672 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Workers t$20853 = ((x10.lang.Runtime.Workers)(workers));
            
            //#line 672 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20853.count = n;
            
            //#line 673 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Workers t$20855 = ((x10.lang.Runtime.Workers)(workers));
            
            //#line 765 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Thread t$20854 = x10.core.Thread.currentThread();
            
            //#line 765 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Worker t$20856 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$20854,x10.lang.Runtime.Worker.$RTT);
            
            //#line 673 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20855.$set((int)(0), ((x10.lang.Runtime.Worker)(t$20856)));
            
            //#line 674 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            int i$21305 = 1;
            
            //#line 674 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            for (;
                 true;
                 ) {
                
                //#line 674 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21306 = i$21305;
                
                //#line 674 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$21307 = ((t$21306) < (((int)(n))));
                
                //#line 674 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(t$21307)) {
                    
                    //#line 674 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    break;
                }
                
                //#line 675 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Workers t$21294 = ((x10.lang.Runtime.Workers)(workers));
                
                //#line 675 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21295 = i$21305;
                
                //#line 675 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21296 = i$21305;
                
                //#line 675 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Worker t$21297 = ((x10.lang.Runtime.Worker)(new x10.lang.Runtime.Worker(t$21296)));
                
                //#line 675 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21294.$set((int)(t$21295), ((x10.lang.Runtime.Worker)(t$21297)));
                
                //#line 674 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21298 = i$21305;
                
                //#line 674 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21299 = ((t$21298) + (((int)(1))));
                
                //#line 674 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                i$21305 = t$21299;
            }
            
            //#line 677 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            int i$21308 = 1;
            
            //#line 677 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            for (;
                 true;
                 ) {
                
                //#line 677 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21309 = i$21308;
                
                //#line 677 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$21310 = ((t$21309) < (((int)(n))));
                
                //#line 677 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(t$21310)) {
                    
                    //#line 677 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    break;
                }
                
                //#line 678 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Workers t$21300 = ((x10.lang.Runtime.Workers)(workers));
                
                //#line 678 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21301 = i$21308;
                
                //#line 678 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Worker t$21302 = t$21300.$apply((int)(t$21301));
                
                //#line 678 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21302.start();
                
                //#line 677 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21303 = i$21308;
                
                //#line 677 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21304 = ((t$21303) + (((int)(1))));
                
                //#line 677 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                i$21308 = t$21304;
            }
        }
        
        
        //#line 682 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void run() {
            
            //#line 683 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Workers t$20874 = ((x10.lang.Runtime.Workers)(workers));
            
            //#line 683 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Worker t$20875 = t$20874.$apply((int)(0));
            
            //#line 683 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20875.$apply();
            {
                
                //#line 882 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Pool t$20876 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                
                //#line 882 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Watcher t$20877 = ((x10.lang.Runtime.Watcher)(t$20876.watcher));
                
                //#line 882 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20877.await();
            }
        }
        
        
        //#line 688 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void increase() {
            
            //#line 689 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Workers t$20878 = ((x10.lang.Runtime.Workers)(workers));
            
            //#line 689 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int i = t$20878.increase$O();
            
            //#line 690 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20880 = ((i) > (((int)(0))));
            
            //#line 690 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20880) {
                
                //#line 692 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Worker worker = ((x10.lang.Runtime.Worker)(new x10.lang.Runtime.Worker(((int)(i)))));
                
                //#line 693 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Workers t$20879 = ((x10.lang.Runtime.Workers)(workers));
                
                //#line 693 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20879.$set((int)(i), ((x10.lang.Runtime.Worker)(worker)));
                
                //#line 694 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                worker.start();
            }
        }
        
        
        //#line 699 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.lang.Runtime.Worker wrapNativeThread() {
            
            //#line 700 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Workers t$20881 = ((x10.lang.Runtime.Workers)(workers));
            
            //#line 700 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int i = t$20881.promote$O();
            
            //#line 701 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Worker worker = ((x10.lang.Runtime.Worker)(new x10.lang.Runtime.Worker(((int)(i)), ((boolean)(false)))));
            
            //#line 702 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Workers t$20882 = ((x10.lang.Runtime.Workers)(workers));
            
            //#line 702 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20882.$set((int)(i), ((x10.lang.Runtime.Worker)(worker)));
            
            //#line 703 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return worker;
        }
        
        
        //#line 707 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void decrease(final int n) {
            
            //#line 708 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Workers t$20883 = ((x10.lang.Runtime.Workers)(workers));
            
            //#line 708 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20883.reduce((int)(n));
        }
        
        
        //#line 712 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public boolean deal$O(final x10.lang.Activity activity) {
            
            //#line 712 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Workers t$20884 = ((x10.lang.Runtime.Workers)(workers));
            
            //#line 712 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20885 = t$20884.give$O(((x10.lang.Activity)(activity)));
            
            //#line 712 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return t$20885;
        }
        
        
        //#line 715 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void release() {
            
            //#line 716 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Workers t$20886 = ((x10.lang.Runtime.Workers)(workers));
            
            //#line 716 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$20886.reclaim();
            
            //#line 717 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Workers t$20887 = ((x10.lang.Runtime.Workers)(workers));
            
            //#line 717 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20889 = t$20887.count;
            
            //#line 717 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Workers t$20888 = ((x10.lang.Runtime.Workers)(workers));
            
            //#line 717 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20890 = t$20888.deadCount;
            
            //#line 717 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20893 = ((int) t$20889) == ((int) t$20890);
            
            //#line 717 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20893) {
                
                //#line 717 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Pool t$20891 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                
                //#line 717 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Watcher t$20892 = ((x10.lang.Runtime.Watcher)(t$20891.watcher));
                
                //#line 717 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$20892.release();
            }
        }
        
        
        //#line 721 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.lang.Activity scan(final x10.util.Random random, final x10.lang.Runtime.Worker worker) {
            
            //#line 722 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.lang.Activity activity = null;
            
            //#line 723 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Workers t$20894 = ((x10.lang.Runtime.Workers)(workers));
            
            //#line 723 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20895 = t$20894.count;
            
            //#line 723 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            int next = random.nextInt$O((int)(t$20895));
            
            //#line 724 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int init = next;
            
            //#line 725 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            for (;
                 ;
                 ) {
                
                //#line 726 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Activity t$21338 = ((x10.lang.Activity)(activity));
                
                //#line 726 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                boolean t$21339 = ((null) != (t$21338));
                
                //#line 726 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(t$21339)) {
                    
                    //#line 726 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.util.concurrent.SimpleLatch t$21340 = ((x10.util.concurrent.SimpleLatch)(latch));
                    
                    //#line 726 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    t$21339 = t$21340.$apply$O();
                }
                
                //#line 726 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$21341 = t$21339;
                
                //#line 726 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$21341) {
                    
                    //#line 726 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Activity t$21342 = ((x10.lang.Activity)(activity));
                    
                    //#line 726 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    return t$21342;
                }
                
                //#line 728 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Workers t$21343 = ((x10.lang.Runtime.Workers)(workers));
                
                //#line 728 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Activity t$21344 = t$21343.yield(((x10.lang.Runtime.Worker)(worker)));
                
                //#line 728 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                activity = ((x10.lang.Activity)(t$21344));
                
                //#line 729 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Activity t$21345 = ((x10.lang.Activity)(activity));
                
                //#line 729 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                boolean t$21346 = ((null) != (t$21345));
                
                //#line 729 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(t$21346)) {
                    
                    //#line 729 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.util.concurrent.SimpleLatch t$21347 = ((x10.util.concurrent.SimpleLatch)(latch));
                    
                    //#line 729 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    t$21346 = t$21347.$apply$O();
                }
                
                //#line 729 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$21348 = t$21346;
                
                //#line 729 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$21348) {
                    
                    //#line 729 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Activity t$21349 = ((x10.lang.Activity)(activity));
                    
                    //#line 729 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    return t$21349;
                }
                
                //#line 731 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                x10.runtime.impl.java.Runtime.eventProbe();
                
                //#line 732 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21350 = ((long)x10.x10rt.X10RT.numDead());
                
                //#line 732 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21351 = numDead;
                
                //#line 732 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$21352 = ((long) t$21350) != ((long) t$21351);
                
                //#line 732 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$21352) {
                    
                    //#line 733 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    try {{
                        
                        //#line 733 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        x10.lang.Runtime.enterAtomic();
                        {
                            
                            //#line 734 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            final long t$21353 = ((long)x10.x10rt.X10RT.numDead());
                            
                            //#line 734 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            this.numDead = t$21353;
                        }
                    }}finally {{
                          
                          //#line 733 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                          x10.lang.Runtime.exitAtomic();
                      }}
                    {
                        
                        //#line 1910 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        final int t$21354 = x10.lang.Runtime.get$RESILIENT_MODE();
                        
                        //#line 1910 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        final boolean t$21355 = ((int) t$21354) == ((int) 0);
                        
                        //#line 1910 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        if (t$21355) {
                            
                        } else {
                            
                            //#line 1915 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                            x10.lang.FinishResilient.notifyPlaceDeath();
                        }
                    }
                    }
                
                //#line 561 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.core.Deque t$21356 = ((x10.core.Deque)(worker.queue));
                
                //#line 561 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final java.lang.Object t$21357 = t$21356.poll();
                
                //#line 561 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Activity t$21358 = x10.rtt.Types.<x10.lang.Activity> cast(t$21357,x10.lang.Activity.$RTT);
                
                //#line 743 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                activity = ((x10.lang.Activity)(t$21358));
                
                //#line 744 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Activity t$21359 = ((x10.lang.Activity)(activity));
                
                //#line 744 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                boolean t$21360 = ((null) != (t$21359));
                
                //#line 744 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(t$21360)) {
                    
                    //#line 744 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.util.concurrent.SimpleLatch t$21361 = ((x10.util.concurrent.SimpleLatch)(latch));
                    
                    //#line 744 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    t$21360 = t$21361.$apply$O();
                }
                
                //#line 744 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$21362 = t$21360;
                
                //#line 744 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$21362) {
                    
                    //#line 744 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Activity t$21363 = ((x10.lang.Activity)(activity));
                    
                    //#line 744 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    return t$21363;
                }
                
                //#line 745 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                boolean t$21335 = false;
                
                //#line 745 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                do  {
                    
                    //#line 747 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int t$21311 = next;
                    
                    //#line 747 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int t$21312 = x10.lang.Runtime.get$MAX_THREADS();
                    
                    //#line 747 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    boolean t$21313 = ((t$21311) < (((int)(t$21312))));
                    
                    //#line 747 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (t$21313) {
                        
                        //#line 747 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Runtime.Workers t$21314 = ((x10.lang.Runtime.Workers)(workers));
                        
                        //#line 747 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final int t$21315 = next;
                        
                        //#line 747 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Runtime.Worker t$21316 = t$21314.$apply((int)(t$21315));
                        
                        //#line 747 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        t$21313 = ((null) != (t$21316));
                    }
                    
                    //#line 747 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final boolean t$21317 = t$21313;
                    
                    //#line 747 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (t$21317) {
                        
                        //#line 748 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Runtime.Workers t$21318 = ((x10.lang.Runtime.Workers)(workers));
                        
                        //#line 748 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final int t$21319 = next;
                        
                        //#line 748 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Runtime.Worker this$21320 = t$21318.$apply((int)(t$21319));
                        
                        //#line 564 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.core.Deque t$21321 = ((x10.core.Deque)(this$21320.queue));
                        
                        //#line 564 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final java.lang.Object t$21322 = t$21321.steal();
                        
                        //#line 564 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Activity t$21323 = x10.rtt.Types.<x10.lang.Activity> cast(t$21322,x10.lang.Activity.$RTT);
                        
                        //#line 748 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        activity = ((x10.lang.Activity)(t$21323));
                    }
                    
                    //#line 750 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Activity t$21324 = ((x10.lang.Activity)(activity));
                    
                    //#line 750 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    boolean t$21325 = ((null) != (t$21324));
                    
                    //#line 750 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (!(t$21325)) {
                        
                        //#line 750 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.util.concurrent.SimpleLatch t$21326 = ((x10.util.concurrent.SimpleLatch)(latch));
                        
                        //#line 750 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        t$21325 = t$21326.$apply$O();
                    }
                    
                    //#line 750 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final boolean t$21327 = t$21325;
                    
                    //#line 750 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (t$21327) {
                        
                        //#line 750 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Activity t$21328 = ((x10.lang.Activity)(activity));
                        
                        //#line 750 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        return t$21328;
                    }
                    
                    //#line 751 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int t$21329 = next;
                    
                    //#line 751 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int t$21330 = ((t$21329) + (((int)(1))));
                    
                    //#line 751 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int t$21331 = next = t$21330;
                    
                    //#line 751 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Runtime.Workers t$21332 = ((x10.lang.Runtime.Workers)(workers));
                    
                    //#line 751 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int t$21333 = t$21332.count;
                    
                    //#line 751 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final boolean t$21334 = ((int) t$21331) == ((int) t$21333);
                    
                    //#line 751 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (t$21334) {
                        
                        //#line 751 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        next = 0;
                    }
                    
                    //#line 752 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int t$21336 = next;
                    
                    //#line 752 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final boolean t$21337 = ((int) t$21336) != ((int) init);
                    
                    //#line 745 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    t$21335 = t$21337;
                }while(t$21335); 
                
                //#line 754 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Workers t$21364 = ((x10.lang.Runtime.Workers)(workers));
                
                //#line 754 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Activity t$21365 = t$21364.take(((x10.lang.Runtime.Worker)(worker)));
                
                //#line 754 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                activity = ((x10.lang.Activity)(t$21365));
                }
            }
        
        
        //#line 758 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public int size$O() {
            
            //#line 758 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Workers t$20951 = ((x10.lang.Runtime.Workers)(workers));
            
            //#line 758 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$20952 = t$20951.count;
            
            //#line 758 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return t$20952;
        }
        
        
        //#line 650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final public x10.lang.Runtime.Pool x10$lang$Runtime$Pool$$this$x10$lang$Runtime$Pool() {
            
            //#line 650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return x10.lang.Runtime.Pool.this;
        }
        
        
        //#line 650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        // creation method for java code (1-phase java constructor)
        public Pool() {
            this((java.lang.System[]) null);
            x10$lang$Runtime$Pool$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.lang.Runtime.Pool x10$lang$Runtime$Pool$$init$S() {
             {
                
                //#line 650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                
                
                //#line 650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.__fieldInitializers_x10_lang_Runtime_Pool();
            }
            return this;
        }
        
        
        
        //#line 650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final public void __fieldInitializers_x10_lang_Runtime_Pool() {
            
            //#line 651 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.SimpleLatch t$20953 = ((x10.util.concurrent.SimpleLatch)(new x10.util.concurrent.SimpleLatch()));
            
            //#line 650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.latch = ((x10.util.concurrent.SimpleLatch)(t$20953));
            
            //#line 652 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Watcher t$20954 = ((x10.lang.Runtime.Watcher)(new x10.lang.Runtime.Watcher()));
            
            //#line 650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.watcher = ((x10.lang.Runtime.Watcher)(t$20954));
            
            //#line 650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.wsEnd = false;
            
            //#line 656 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Workers alloc$2790 = ((x10.lang.Runtime.Workers)(new x10.lang.Runtime.Workers((java.lang.System[]) null)));
            
            //#line 322 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            alloc$2790.__fieldInitializers_x10_lang_Runtime_Workers();
            
            //#line 650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.workers = ((x10.lang.Runtime.Workers)(alloc$2790));
            
            //#line 650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.wsBlockedContinuations = null;
            
            //#line 650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.numDead = 0L;
        }
        }
        
    
    
    //#line 765 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static x10.lang.Runtime.Worker worker() {
        
        //#line 765 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$20955 = x10.core.Thread.currentThread();
        
        //#line 765 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$20956 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$20955,x10.lang.Runtime.Worker.$RTT);
        
        //#line 765 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$20956;
    }
    
    
    //#line 770 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static int workerId$O() {
        
        //#line 765 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$20957 = x10.core.Thread.currentThread();
        
        //#line 765 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$20958 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$20957,x10.lang.Runtime.Worker.$RTT);
        
        //#line 770 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final int t$20959 = t$20958.workerId;
        
        //#line 770 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$20959;
    }
    
    
    //#line 776 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static int poolSize$O() {
        
        //#line 776 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$20960 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 776 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final int t$20961 = t$20960.size$O();
        
        //#line 776 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$20961;
    }
    
    
    //#line 781 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static x10.lang.Activity activity() {
        
        //#line 765 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$20962 = x10.core.Thread.currentThread();
        
        //#line 781 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker this$20030 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$20962,x10.lang.Runtime.Worker.$RTT);
        
        //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity t$20963 = ((x10.lang.Activity)(this$20030.activity));
        
        //#line 781 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$20963;
    }
    
    
    //#line 786 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static x10.lang.Place home() {
        try {
            return x10.lang.Place.place(x10.x10rt.X10RT.here());
        }
        catch (java.lang.Throwable exc$21485) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21485);
        }
        
    }
    
    
    
    //#line 794 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static int hereInt$O() {
        try {
            return x10.x10rt.X10RT.here();
        }
        catch (java.lang.Throwable exc$21486) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21486);
        }
        
    }
    
    
    
    //#line 798 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static long hereLong$O() {
        try {
            return ((long)x10.x10rt.X10RT.here());
        }
        catch (java.lang.Throwable exc$21487) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21487);
        }
        
    }
    
    
    
    //#line 808 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static int surplusActivityCount$O() {
        
        //#line 765 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$20967 = x10.core.Thread.currentThread();
        
        //#line 808 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker this$20031 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$20967,x10.lang.Runtime.Worker.$RTT);
        
        //#line 555 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Deque t$20968 = ((x10.core.Deque)(this$20031.queue));
        
        //#line 555 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final int t$20969 = t$20968.size$O();
        
        //#line 808 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$20969;
    }
    
    
    //#line 811 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    private static x10.lang.FinishState rootFinish;
    
    //#line 813 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    private static x10.lang.Cell<x10.core.Long> processStartNanos_;
    
    
    //#line 814 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static long processStartNanos$O() {
        
        //#line 814 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Cell this$20200 = ((x10.lang.Cell)(x10.lang.Runtime.get$processStartNanos_()));
        
        //#line 48 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final long t$20970 = x10.core.Long.$unbox(((x10.lang.Cell<x10.core.Long>)this$20200).value);
        
        //#line 814 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$20970;
    }
    
    
    //#line 816 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class Watcher extends x10.util.concurrent.Condition implements x10.io.Unserializable, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<Watcher> $RTT = 
            x10.rtt.NamedType.<Watcher> make("x10.lang.Runtime.Watcher",
                                             Watcher.class,
                                             new x10.rtt.Type[] {
                                                 x10.io.Unserializable.$RTT,
                                                 x10.util.concurrent.Condition.$RTT
                                             });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            throw new x10.io.NotSerializableException("Can't serialize x10.lang.Runtime.Watcher");
        }
        
        // constructor just for allocation
        public Watcher(final java.lang.System[] $dummy) {
            super($dummy);
            
        }
        
        
    
        
        //#line 817 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.lang.MultipleExceptions t;
        
        
        //#line 819 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void raise(final x10.lang.MultipleExceptions t) {
            
            //#line 819 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.t = ((x10.lang.MultipleExceptions)(t));
        }
        
        
        //#line 827 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void await() {
            
            //#line 828 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            super.await();
            
            //#line 829 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.MultipleExceptions t$20971 = ((x10.lang.MultipleExceptions)(t));
            
            //#line 829 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$20973 = ((null) != (t$20971));
            
            //#line 829 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$20973) {
                
                //#line 829 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.MultipleExceptions t$20972 = ((x10.lang.MultipleExceptions)(t));
                
                //#line 829 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                throw t$20972;
            }
        }
        
        
        //#line 837 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void cancel() {
            
        }
        
        
        //#line 816 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final public x10.lang.Runtime.Watcher x10$lang$Runtime$Watcher$$this$x10$lang$Runtime$Watcher() {
            
            //#line 816 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return x10.lang.Runtime.Watcher.this;
        }
        
        
        //#line 816 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public Watcher() {
            super();
             {
                
                //#line 816 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                
                
                //#line 816 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.__fieldInitializers_x10_lang_Runtime_Watcher();
            }
        }
        
        
        
        //#line 816 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final public void __fieldInitializers_x10_lang_Runtime_Watcher() {
            
            //#line 816 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.t = null;
        }
        
        public void x10$util$concurrent$Condition$await$S() {
            super.await();
        }
    }
    
    
    
    //#line 845 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void submitUncounted(final x10.core.fun.VoidFun_0_0 job) {
        
        //#line 846 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$20974 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 846 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Workers t$20975 = ((x10.lang.Runtime.Workers)(t$20974.workers));
        
        //#line 846 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker this$20211 = t$20975.$apply((int)(0));
        
        //#line 846 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity alloc$2791 = ((x10.lang.Activity)(new x10.lang.Activity((java.lang.System[]) null)));
        
        //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.core.fun.VoidFun_0_0 body$20201 = ((x10.core.fun.VoidFun_0_0)(job));
        
        //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.Place srcPlace$20202 = ((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 846 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState.UncountedFinish t$20976 = ((x10.lang.FinishState.UncountedFinish)(x10.lang.FinishState.get$UNCOUNTED_FINISH()));
        
        //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.FinishState finishState$20203 = ((x10.lang.FinishState)(((x10.lang.FinishState)
                                                                                 t$20976)));
        
        //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.core.fun.VoidFun_0_0 body$21366 = ((x10.core.fun.VoidFun_0_0)(body$20201));
        
        //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.Place srcPlace$21367 = ((x10.lang.Place)(srcPlace$20202));
        
        //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.FinishState finishState$21368 = ((x10.lang.FinishState)(finishState$20203));
        
        //#line 105 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        alloc$2791.x10$lang$Activity$$init$S(((x10.core.fun.VoidFun_0_0)(body$21366)), ((x10.lang.Place)(srcPlace$21367)), ((x10.lang.FinishState)(finishState$21368)), ((boolean)(true)), ((boolean)(true)));
        
        //#line 567 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity activity$20210 = ((x10.lang.Activity)(alloc$2791));
        
        //#line 567 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Deque t$21369 = ((x10.core.Deque)(this$20211.queue));
        
        //#line 567 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$21369.push(((java.lang.Object)(activity$20210)));
        
        //#line 847 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$20978 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 847 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Workers t$20979 = ((x10.lang.Runtime.Workers)(t$20978.workers));
        
        //#line 847 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$20979.wakeup();
    }
    
    
    //#line 856 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static x10.lang.Runtime.Watcher submit(final x10.core.fun.VoidFun_0_0 job) {
        
        //#line 857 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Watcher watcher = ((x10.lang.Runtime.Watcher)(new x10.lang.Runtime.Watcher()));
        
        //#line 858 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.fun.VoidFun_0_0 t$20980 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure$1(job, watcher)));
        
        //#line 859 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10.lang.Runtime.submitUncounted(((x10.core.fun.VoidFun_0_0)(t$20980)));
        
        //#line 860 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return watcher;
    }
    
    
    //#line 868 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void start(final int n) {
        
        //#line 869 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Cell this$20218 = ((x10.lang.Cell)(x10.lang.Runtime.get$processStartNanos_()));
        
        //#line 55 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final long x$20217 = java.lang.System.nanoTime();
        
        //#line 55 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ((x10.lang.Cell<x10.core.Long>)this$20218).value = x10.core.Long.$box(x$20217);
        
        //#line 870 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$20981 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 870 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final int t$20982 = ((n) + (((int)(1))));
        
        //#line 870 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$20981.$apply((int)(t$20982));
    }
    
    
    //#line 881 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void join() {
        
        //#line 882 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$20983 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 882 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Watcher t$20984 = ((x10.lang.Runtime.Watcher)(t$20983.watcher));
        
        //#line 882 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$20984.await();
    }
    
    
    //#line 895 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void start(final x10.core.fun.VoidFun_0_0 job) {
        
        //#line 896 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final int t$20985 = x10.lang.Runtime.get$NTHREADS();
        
        //#line 896 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final int t$20986 = ((t$20985) - (((int)(1))));
        
        //#line 896 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10.lang.Runtime.start((int)(t$20986));
        
        //#line 897 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long t$20987 = ((long)x10.x10rt.X10RT.here());
        
        //#line 897 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$20990 = ((long) t$20987) == ((long) 0L);
        
        //#line 897 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$20990) {
            
            //#line 898 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 t$20989 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure$2(job)));
            
            //#line 899 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.lang.Runtime.submitUncounted(((x10.core.fun.VoidFun_0_0)(t$20989)));
        }
        
        //#line 901 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$20991 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 901 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$20991.run();
    }
    
    
    //#line 911 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void terminate() {
        
        //#line 912 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$20992 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 912 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.util.concurrent.SimpleLatch t$20993 = ((x10.util.concurrent.SimpleLatch)(t$20992.latch));
        
        //#line 912 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$20993.release();
    }
    
    
    //#line 921 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void terminateAll() {
        
        //#line 922 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long t$20994 = x10.lang.Place.get$MAX_PLACES();
        
        //#line 922 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21015 = ((t$20994) >= (((long)(1024L))));
        
        //#line 922 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21015) {
            
            //#line 923 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 cl1 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure_start_1()));
            
            //#line 931 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$21379 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 931 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            long i$21380 = ((t$21379) - (((long)(1L))));
            
            //#line 931 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            for (;
                 true;
                 ) {
                
                //#line 931 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21381 = i$21380;
                
                //#line 931 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$21382 = ((t$21381) > (((long)(0L))));
                
                //#line 931 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(t$21382)) {
                    
                    //#line 931 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    break;
                }
                
                //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long id$21374 = i$21380;
                
                //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.core.fun.VoidFun_0_0 msgBody$21375 = ((x10.core.fun.VoidFun_0_0)(cl1));
                
                //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Profile prof$21376 = ((x10.lang.Runtime.Profile)(((x10.lang.Runtime.Profile)
                                                                                          (null))));
                
                //#line 77 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(id$21374))), msgBody$21375, ((x10.lang.Runtime.Profile)(null)), null);
                
                //#line 931 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21377 = i$21380;
                
                //#line 931 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21378 = ((t$21377) - (((long)(32L))));
                
                //#line 931 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                i$21380 = t$21378;
            }
        } else {
            
            //#line 935 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 cl = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure_start_3()));
            
            //#line 936 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$21388 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 936 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            long i$21389 = ((t$21388) - (((long)(1L))));
            
            //#line 936 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            for (;
                 true;
                 ) {
                
                //#line 936 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21390 = i$21389;
                
                //#line 936 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$21391 = ((t$21390) > (((long)(0L))));
                
                //#line 936 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(t$21391)) {
                    
                    //#line 936 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    break;
                }
                
                //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long id$21383 = i$21389;
                
                //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.core.fun.VoidFun_0_0 msgBody$21384 = ((x10.core.fun.VoidFun_0_0)(cl));
                
                //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Profile prof$21385 = ((x10.lang.Runtime.Profile)(((x10.lang.Runtime.Profile)
                                                                                          (null))));
                
                //#line 77 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(id$21383))), msgBody$21384, ((x10.lang.Runtime.Profile)(null)), null);
                
                //#line 936 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21386 = i$21389;
                
                //#line 936 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21387 = ((t$21386) - (((long)(1L))));
                
                //#line 936 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                i$21389 = t$21387;
            }
        }
        
        //#line 912 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$21392 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 912 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.util.concurrent.SimpleLatch t$21393 = ((x10.util.concurrent.SimpleLatch)(t$21392.latch));
        
        //#line 912 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$21393.release();
    }
    
    
    //#line 949 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void startDeprecated(final x10.core.fun.VoidFun_0_0 body) {
        
        //#line 953 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Cell this$20238 = ((x10.lang.Cell)(x10.lang.Runtime.get$processStartNanos_()));
        
        //#line 55 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final long x$20237 = java.lang.System.nanoTime();
        
        //#line 55 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ((x10.lang.Cell<x10.core.Long>)this$20238).value = x10.core.Long.$box(x$20237);
        
        //#line 955 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final int t$21018 = x10.x10rt.X10RT.here();
        
        //#line 955 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21026 = ((int) t$21018) == ((int) 0);
        
        //#line 955 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21026) {
            
            //#line 959 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Pool t$21019 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
            
            //#line 959 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int t$21020 = x10.lang.Runtime.get$NTHREADS();
            
            //#line 959 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$21019.$apply((int)(t$21020));
            
            //#line 960 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Activity alloc$2792 = ((x10.lang.Activity)(new x10.lang.Activity((java.lang.System[]) null)));
            
            //#line 104 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.core.fun.VoidFun_0_0 body$20241 = ((x10.core.fun.VoidFun_0_0)(body));
            
            //#line 104 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Place srcPlace$20242 = ((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here())));
            
            //#line 104 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.FinishState finishState$20243 = ((x10.lang.FinishState)(x10.lang.Runtime.get$rootFinish()));
            
            //#line 105 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            alloc$2792.x10$lang$Activity$$init$S(((x10.core.fun.VoidFun_0_0)(body$20241)), ((x10.lang.Place)(srcPlace$20242)), ((x10.lang.FinishState)(finishState$20243)), ((boolean)(false)), ((boolean)(true)));
            
            //#line 960 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.lang.Runtime.executeLocal(((x10.lang.Activity)(alloc$2792)));
            
            //#line 961 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Pool t$21021 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
            
            //#line 961 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$21021.run();
            
            //#line 971 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            try {{
                
                //#line 972 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.FinishState t$21022 = ((x10.lang.FinishState)(x10.lang.Runtime.get$rootFinish()));
                
                //#line 972 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21022.waitForFinish();
            }}finally {{
                  
                  //#line 976 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                  x10.lang.Runtime.terminateAll();
              }}
            } else {
                
                //#line 981 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Pool t$21023 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                
                //#line 981 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21024 = x10.lang.Runtime.get$NTHREADS();
                
                //#line 981 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21023.$apply((int)(t$21024));
                
                //#line 982 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Pool t$21025 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                
                //#line 982 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21025.run();
            }
        }
    
    
    //#line 995 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void runAsync__1$1x10$lang$Clock$2(final x10.lang.Place place, final x10.core.Rail<x10.lang.Clock> clocks, final x10.core.fun.VoidFun_0_0 body, final x10.lang.Runtime.Profile prof) {
        
        //#line 997 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity a = x10.lang.Runtime.activity();
        
        //#line 998 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        a.ensureNotInAtomic();
        
        //#line 1000 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState state = a.finishState();
        
        //#line 1001 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity.ClockPhases t$21027 = a.clockPhases();
        
        //#line 1001 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity.ClockPhases clockPhases = ((x10.lang.Activity.ClockPhases)(t$21027.make__0$1x10$lang$Clock$2(((x10.core.Rail)(clocks)))));
        
        //#line 1002 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long t$21028 = place.id;
        
        //#line 1002 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long t$21029 = ((long)x10.x10rt.X10RT.here());
        
        //#line 1002 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21044 = ((long) t$21028) == ((long) t$21029);
        
        //#line 1002 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21044) {
            
            //#line 1004 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$21030 = ((prof) != (null));
            
            //#line 1004 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            long t$21031 =  0;
            
            //#line 1004 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$21030) {
                
                //#line 1004 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21031 = java.lang.System.nanoTime();
            } else {
                
                //#line 1004 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21031 = 0L;
            }
            
            //#line 1004 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long start = t$21031;
            
            //#line 1005 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.io.Serializer ser = ((x10.io.Serializer)(new x10.io.Serializer()));
            
            //#line 1006 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ser.writeAny(((java.lang.Object)(body)));
            
            //#line 1007 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$21039 = ((prof) != (null));
            
            //#line 1007 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$21039) {
                
                //#line 1008 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long end = java.lang.System.nanoTime();
                
                //#line 1009 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21032 = prof.serializationNanos;
                
                //#line 1009 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21033 = ((end) - (((long)(start))));
                
                //#line 1009 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21034 = ((t$21032) + (((long)(t$21033))));
                
                //#line 1009 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                prof.serializationNanos = t$21034;
                
                //#line 1010 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21036 = prof.bytes;
                
                //#line 1010 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21035 = ser.dataBytesWritten$O();
                
                //#line 1010 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21037 = ((long)(((int)(t$21035))));
                
                //#line 1010 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21038 = ((t$21036) + (((long)(t$21037))));
                
                //#line 1010 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                prof.bytes = t$21038;
            }
            
            //#line 1014 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            state.notifySubActivitySpawn(((x10.lang.Place)(place)));
            
            //#line 1020 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Activity alloc$2793 = ((x10.lang.Activity)(new x10.lang.Activity((java.lang.System[]) null)));
            
            //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Place srcPlace$20247 = ((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here())));
            
            //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.FinishState finishState$20248 = ((x10.lang.FinishState)(state));
            
            //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Activity.ClockPhases clockPhases$20249 = ((x10.lang.Activity.ClockPhases)(clockPhases));
            
            //#line 101 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Place srcPlace$21400 = ((x10.lang.Place)(srcPlace$20247));
            
            //#line 101 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.FinishState finishState$21401 = ((x10.lang.FinishState)(finishState$20248));
            
            //#line 104 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Place srcPlace$21398 = ((x10.lang.Place)(srcPlace$21400));
            
            //#line 104 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.FinishState finishState$21399 = ((x10.lang.FinishState)(finishState$21401));
            
            //#line 1015 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 t$21394 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure$3(ser)));
            
            //#line 105 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            alloc$2793.x10$lang$Activity$$init$S(((x10.core.fun.VoidFun_0_0)(t$21394)), ((x10.lang.Place)(srcPlace$21398)), ((x10.lang.FinishState)(finishState$21399)), ((boolean)(true)), ((boolean)(true)));
            
            //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            alloc$2793.clockPhases = ((x10.lang.Activity.ClockPhases)(clockPhases$20249));
            
            //#line 1020 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.lang.Runtime.executeLocal(((x10.lang.Activity)(alloc$2793)));
        } else {
            
            //#line 1022 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Place src = ((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here())));
            
            //#line 1023 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 closure = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure_runAsync(body, src, state, clockPhases)));
            
            //#line 1025 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$21042 = place.id;
            
            //#line 1024 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 t$21043 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure$4(state, place)));
            
            //#line 1025 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(t$21042))), closure, prof, t$21043);
            
            //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
            final x10.core.fun.VoidFun_0_0 o$20260 = ((x10.core.fun.VoidFun_0_0)(closure));
        }
        
        //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.fun.VoidFun_0_0 o$20263 = ((x10.core.fun.VoidFun_0_0)(body));
    }
    
    
    //#line 1031 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void runAsync(final x10.lang.Place place, final x10.core.fun.VoidFun_0_0 body, final x10.lang.Runtime.Profile prof) {
        
        //#line 1033 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity a = x10.lang.Runtime.activity();
        
        //#line 1034 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        a.ensureNotInAtomic();
        
        //#line 1036 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState state = a.finishState();
        
        //#line 1037 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long t$21045 = place.id;
        
        //#line 1037 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long t$21046 = ((long)x10.x10rt.X10RT.here());
        
        //#line 1037 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21061 = ((long) t$21045) == ((long) t$21046);
        
        //#line 1037 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21061) {
            
            //#line 1039 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$21047 = ((prof) != (null));
            
            //#line 1039 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            long t$21048 =  0;
            
            //#line 1039 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$21047) {
                
                //#line 1039 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21048 = java.lang.System.nanoTime();
            } else {
                
                //#line 1039 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21048 = 0L;
            }
            
            //#line 1039 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long start = t$21048;
            
            //#line 1040 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.io.Serializer ser = ((x10.io.Serializer)(new x10.io.Serializer()));
            
            //#line 1041 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ser.writeAny(((java.lang.Object)(body)));
            
            //#line 1042 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$21056 = ((prof) != (null));
            
            //#line 1042 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$21056) {
                
                //#line 1043 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long end = java.lang.System.nanoTime();
                
                //#line 1044 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21049 = prof.serializationNanos;
                
                //#line 1044 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21050 = ((end) - (((long)(start))));
                
                //#line 1044 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21051 = ((t$21049) + (((long)(t$21050))));
                
                //#line 1044 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                prof.serializationNanos = t$21051;
                
                //#line 1045 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21053 = prof.bytes;
                
                //#line 1045 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21052 = ser.dataBytesWritten$O();
                
                //#line 1045 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21054 = ((long)(((int)(t$21052))));
                
                //#line 1045 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21055 = ((t$21053) + (((long)(t$21054))));
                
                //#line 1045 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                prof.bytes = t$21055;
            }
            
            //#line 1049 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            state.notifySubActivitySpawn(((x10.lang.Place)(place)));
            
            //#line 1055 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Activity alloc$2795 = ((x10.lang.Activity)(new x10.lang.Activity((java.lang.System[]) null)));
            
            //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Place srcPlace$20267 = ((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here())));
            
            //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.FinishState finishState$20268 = ((x10.lang.FinishState)(state));
            
            //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Place srcPlace$21406 = ((x10.lang.Place)(srcPlace$20267));
            
            //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.FinishState finishState$21407 = ((x10.lang.FinishState)(finishState$20268));
            
            //#line 1050 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 t$21402 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure$5(ser)));
            
            //#line 105 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            alloc$2795.x10$lang$Activity$$init$S(((x10.core.fun.VoidFun_0_0)(t$21402)), ((x10.lang.Place)(srcPlace$21406)), ((x10.lang.FinishState)(finishState$21407)), ((boolean)(true)), ((boolean)(true)));
            
            //#line 1055 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.lang.Runtime.executeLocal(((x10.lang.Activity)(alloc$2795)));
        } else {
            
            //#line 1058 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long t$21059 = place.id;
            
            //#line 1057 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 t$21060 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure$6(state, place)));
            
            //#line 1058 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.runtime.impl.java.Runtime.runAsyncAt((int)(((long)(t$21059))), body, state, prof, t$21060);
        }
        
        //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.fun.VoidFun_0_0 o$20275 = ((x10.core.fun.VoidFun_0_0)(body));
    }
    
    
    //#line 1066 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void runAsync__0$1x10$lang$Clock$2(final x10.core.Rail<x10.lang.Clock> clocks, final x10.core.fun.VoidFun_0_0 body) {
        
        //#line 1068 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity a = x10.lang.Runtime.activity();
        
        //#line 1069 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        a.ensureNotInAtomic();
        
        //#line 1071 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState state = a.finishState();
        
        //#line 1072 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity.ClockPhases t$21062 = a.clockPhases();
        
        //#line 1072 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity.ClockPhases clockPhases = ((x10.lang.Activity.ClockPhases)(t$21062.make__0$1x10$lang$Clock$2(((x10.core.Rail)(clocks)))));
        
        //#line 1073 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        state.notifySubActivitySpawn(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))));
        
        //#line 1074 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity alloc$2796 = ((x10.lang.Activity)(new x10.lang.Activity((java.lang.System[]) null)));
        
        //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.core.fun.VoidFun_0_0 body$20278 = ((x10.core.fun.VoidFun_0_0)(body));
        
        //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.Place srcPlace$20279 = ((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.FinishState finishState$20280 = ((x10.lang.FinishState)(state));
        
        //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.Activity.ClockPhases clockPhases$20281 = ((x10.lang.Activity.ClockPhases)(clockPhases));
        
        //#line 101 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.core.fun.VoidFun_0_0 body$21411 = ((x10.core.fun.VoidFun_0_0)(body$20278));
        
        //#line 101 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.Place srcPlace$21412 = ((x10.lang.Place)(srcPlace$20279));
        
        //#line 101 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.FinishState finishState$21413 = ((x10.lang.FinishState)(finishState$20280));
        
        //#line 104 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.core.fun.VoidFun_0_0 body$21408 = ((x10.core.fun.VoidFun_0_0)(body$21411));
        
        //#line 104 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.Place srcPlace$21409 = ((x10.lang.Place)(srcPlace$21412));
        
        //#line 104 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.FinishState finishState$21410 = ((x10.lang.FinishState)(finishState$21413));
        
        //#line 105 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        alloc$2796.x10$lang$Activity$$init$S(((x10.core.fun.VoidFun_0_0)(body$21408)), ((x10.lang.Place)(srcPlace$21409)), ((x10.lang.FinishState)(finishState$21410)), ((boolean)(true)), ((boolean)(true)));
        
        //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        alloc$2796.clockPhases = ((x10.lang.Activity.ClockPhases)(clockPhases$20281));
        
        //#line 1074 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10.lang.Runtime.executeLocal(((x10.lang.Activity)(alloc$2796)));
    }
    
    
    //#line 1077 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void runAsync(final x10.core.fun.VoidFun_0_0 body) {
        
        //#line 1079 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity a = x10.lang.Runtime.activity();
        
        //#line 1080 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        a.ensureNotInAtomic();
        
        //#line 1082 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState state = a.finishState();
        
        //#line 1083 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        state.notifySubActivitySpawn(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))));
        
        //#line 1084 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity alloc$2797 = ((x10.lang.Activity)(new x10.lang.Activity((java.lang.System[]) null)));
        
        //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.core.fun.VoidFun_0_0 body$20292 = ((x10.core.fun.VoidFun_0_0)(body));
        
        //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.Place srcPlace$20293 = ((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.FinishState finishState$20294 = ((x10.lang.FinishState)(state));
        
        //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.core.fun.VoidFun_0_0 body$21414 = ((x10.core.fun.VoidFun_0_0)(body$20292));
        
        //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.Place srcPlace$21415 = ((x10.lang.Place)(srcPlace$20293));
        
        //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.FinishState finishState$21416 = ((x10.lang.FinishState)(finishState$20294));
        
        //#line 105 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        alloc$2797.x10$lang$Activity$$init$S(((x10.core.fun.VoidFun_0_0)(body$21414)), ((x10.lang.Place)(srcPlace$21415)), ((x10.lang.FinishState)(finishState$21416)), ((boolean)(true)), ((boolean)(true)));
        
        //#line 1084 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10.lang.Runtime.executeLocal(((x10.lang.Activity)(alloc$2797)));
    }
    
    
    //#line 1087 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void runFinish(final x10.core.fun.VoidFun_0_0 body) {
        {
            
            //#line 1088 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 1088 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.FinishState x10$__var2 = x10.lang.Runtime.startFinish();
            
            //#line 1088 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            try {{
                {
                    
                    //#line 1088 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ((x10.core.fun.VoidFun_0_0)body).$apply();
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 1088 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                
                //#line 1088 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 1088 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var2)));
             }}
            }
        }
    
    
    //#line 1094 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void runUncountedAsync(final x10.lang.Place place, final x10.core.fun.VoidFun_0_0 body, final x10.lang.Runtime.Profile prof) {
        
        //#line 1096 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity a = x10.lang.Runtime.activity();
        
        //#line 1097 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        a.ensureNotInAtomic();
        
        //#line 1099 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long t$21063 = place.id;
        
        //#line 1099 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long t$21064 = ((long)x10.x10rt.X10RT.here());
        
        //#line 1099 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21080 = ((long) t$21063) == ((long) t$21064);
        
        //#line 1099 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21080) {
            
            //#line 1101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$21065 = ((prof) != (null));
            
            //#line 1101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            long t$21066 =  0;
            
            //#line 1101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$21065) {
                
                //#line 1101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21066 = java.lang.System.nanoTime();
            } else {
                
                //#line 1101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$21066 = 0L;
            }
            
            //#line 1101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long start = t$21066;
            
            //#line 1102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.io.Serializer ser = ((x10.io.Serializer)(new x10.io.Serializer()));
            
            //#line 1103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ser.writeAny(((java.lang.Object)(body)));
            
            //#line 1104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$21074 = ((prof) != (null));
            
            //#line 1104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$21074) {
                
                //#line 1105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long end = java.lang.System.nanoTime();
                
                //#line 1106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21067 = prof.serializationNanos;
                
                //#line 1106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21068 = ((end) - (((long)(start))));
                
                //#line 1106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21069 = ((t$21067) + (((long)(t$21068))));
                
                //#line 1106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                prof.serializationNanos = t$21069;
                
                //#line 1107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21071 = prof.bytes;
                
                //#line 1107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final int t$21070 = ser.dataBytesWritten$O();
                
                //#line 1107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21072 = ((long)(((int)(t$21070))));
                
                //#line 1107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final long t$21073 = ((t$21071) + (((long)(t$21072))));
                
                //#line 1107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                prof.bytes = t$21073;
            }
            
            //#line 1116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Activity alloc$2798 = ((x10.lang.Activity)(new x10.lang.Activity((java.lang.System[]) null)));
            
            //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Place srcPlace$20302 = ((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here())));
            
            //#line 1116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.FinishState.UncountedFinish t$21075 = ((x10.lang.FinishState.UncountedFinish)(x10.lang.FinishState.get$UNCOUNTED_FINISH()));
            
            //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.FinishState finishState$20303 = ((x10.lang.FinishState)(((x10.lang.FinishState)
                                                                                     t$21075)));
            
            //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.Place srcPlace$21421 = ((x10.lang.Place)(srcPlace$20302));
            
            //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            final x10.lang.FinishState finishState$21422 = ((x10.lang.FinishState)(finishState$20303));
            
            //#line 1111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 t$21417 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure$7(ser)));
            
            //#line 105 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
            alloc$2798.x10$lang$Activity$$init$S(((x10.core.fun.VoidFun_0_0)(t$21417)), ((x10.lang.Place)(srcPlace$21421)), ((x10.lang.FinishState)(finishState$21422)), ((boolean)(true)), ((boolean)(true)));
            
            //#line 1116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.lang.Runtime.executeLocal(((x10.lang.Activity)(alloc$2798)));
        } else {
            
            //#line 1120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 closure = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure_runUncountedAsync(body)));
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long id$20310 = place.id;
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 msgBody$20311 = ((x10.core.fun.VoidFun_0_0)(closure));
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Profile prof$20312 = ((x10.lang.Runtime.Profile)(prof));
            
            //#line 77 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(id$20310))), msgBody$20311, prof$20312, null);
            
            //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
            final x10.core.fun.VoidFun_0_0 o$20315 = ((x10.core.fun.VoidFun_0_0)(closure));
        }
        
        //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.fun.VoidFun_0_0 o$20318 = ((x10.core.fun.VoidFun_0_0)(body));
    }
    
    
    //#line 1130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void runUncountedAsync(final x10.core.fun.VoidFun_0_0 body) {
        
        //#line 1132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity a = x10.lang.Runtime.activity();
        
        //#line 1133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        a.ensureNotInAtomic();
        
        //#line 1135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity alloc$2801 = ((x10.lang.Activity)(new x10.lang.Activity((java.lang.System[]) null)));
        
        //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.core.fun.VoidFun_0_0 body$20321 = ((x10.core.fun.VoidFun_0_0)(body));
        
        //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.Place srcPlace$20322 = ((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 1135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState.UncountedFinish alloc$2800 = ((x10.lang.FinishState.UncountedFinish)(new x10.lang.FinishState.UncountedFinish((java.lang.System[]) null)));
        
        //#line 1135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        alloc$2800.x10$lang$FinishState$UncountedFinish$$init$S();
        
        //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.FinishState finishState$20323 = ((x10.lang.FinishState)(((x10.lang.FinishState)
                                                                                 alloc$2800)));
        
        //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.core.fun.VoidFun_0_0 body$21423 = ((x10.core.fun.VoidFun_0_0)(body$20321));
        
        //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.Place srcPlace$21424 = ((x10.lang.Place)(srcPlace$20322));
        
        //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.FinishState finishState$21425 = ((x10.lang.FinishState)(finishState$20323));
        
        //#line 105 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        alloc$2801.x10$lang$Activity$$init$S(((x10.core.fun.VoidFun_0_0)(body$21423)), ((x10.lang.Place)(srcPlace$21424)), ((x10.lang.FinishState)(finishState$21425)), ((boolean)(true)), ((boolean)(true)));
        
        //#line 1135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10.lang.Runtime.executeLocal(((x10.lang.Activity)(alloc$2801)));
    }
    
    
    //#line 1141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    @x10.runtime.impl.java.X10Generated
    public static class RemoteControl extends x10.util.concurrent.SimpleLatch implements x10.lang.Runtime.Mortal, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<RemoteControl> $RTT = 
            x10.rtt.NamedType.<RemoteControl> make("x10.lang.Runtime.RemoteControl",
                                                   RemoteControl.class,
                                                   new x10.rtt.Type[] {
                                                       x10.lang.Runtime.Mortal.$RTT,
                                                       x10.util.concurrent.SimpleLatch.$RTT
                                                   });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            throw new x10.io.NotSerializableException("Can't serialize x10.lang.Runtime.RemoteControl");
        }
        
        // constructor just for allocation
        public RemoteControl(final java.lang.System[] $dummy) {
            super($dummy);
            
        }
        
        
    
        
        
        //#line 1142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public RemoteControl() {
            super();
             {
                
                //#line 1142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                
                
                //#line 1141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.__fieldInitializers_x10_lang_Runtime_RemoteControl();
            }
        }
        
        
        
        //#line 1143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public java.lang.Throwable e;
        
        //#line 1144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.lang.Activity.ClockPhases clockPhases;
        
        
        //#line 1141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final public x10.lang.Runtime.RemoteControl x10$lang$Runtime$RemoteControl$$this$x10$lang$Runtime$RemoteControl() {
            
            //#line 1141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return x10.lang.Runtime.RemoteControl.this;
        }
        
        
        //#line 1141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final public void __fieldInitializers_x10_lang_Runtime_RemoteControl() {
            
            //#line 1141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.e = null;
            
            //#line 1141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.clockPhases = null;
        }
    }
    
    
    
    //#line 1149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void throwCheckedWithoutThrows(final java.lang.Throwable e) {
        try {
            java.lang.Thread.currentThread().stop(e);
        }
        catch (java.lang.Throwable exc$21488) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$21488);
        }
        
    }
    
    
    
    //#line 1156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    @x10.runtime.impl.java.X10Generated
    public static class AtCheckedWrapper extends java.lang.RuntimeException implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<AtCheckedWrapper> $RTT = 
            x10.rtt.NamedType.<AtCheckedWrapper> make("x10.lang.Runtime.AtCheckedWrapper",
                                                      AtCheckedWrapper.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.Types.EXCEPTION
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.AtCheckedWrapper $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $deserializer.deserializeFieldsStartingFromClass(java.lang.RuntimeException.class, $_obj, 0);
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Runtime.AtCheckedWrapper $_obj = new x10.lang.Runtime.AtCheckedWrapper((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.serializeFieldsStartingFromClass(this, java.lang.RuntimeException.class);
            
        }
        
        // constructor just for allocation
        public AtCheckedWrapper(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        
        //#line 1157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public AtCheckedWrapper(final java.lang.Throwable cause) {
            super(((java.lang.Throwable)(cause)));
             {
                
                //#line 1157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                
                
                //#line 1156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.__fieldInitializers_x10_lang_Runtime_AtCheckedWrapper();
            }
        }
        
        
        
        //#line 1156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final public x10.lang.Runtime.AtCheckedWrapper x10$lang$Runtime$AtCheckedWrapper$$this$x10$lang$Runtime$AtCheckedWrapper() {
            
            //#line 1156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return x10.lang.Runtime.AtCheckedWrapper.this;
        }
        
        
        //#line 1156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final public void __fieldInitializers_x10_lang_Runtime_AtCheckedWrapper() {
            
        }
    }
    
    
    
    //#line 1166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static <$T>$T wrapAtChecked$G(final x10.rtt.Type $T, final java.lang.Throwable caught) {
        
        //#line 1168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21082 = x10.rtt.Types.EXCEPTION.isInstance(caught);
        
        //#line 1168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21082) {
            
            //#line 1168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final java.lang.RuntimeException t$21081 = ((java.lang.RuntimeException)(x10.rtt.Types.<java.lang.RuntimeException> cast(caught,x10.rtt.Types.EXCEPTION)));
            
            //#line 1168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            throw t$21081;
        }
        
        //#line 1169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21084 = x10.rtt.Types.ERROR.isInstance(caught);
        
        //#line 1169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21084) {
            
            //#line 1169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final java.lang.Error t$21083 = ((java.lang.Error)(x10.rtt.Types.<java.lang.Error> cast(caught,x10.rtt.Types.ERROR)));
            
            //#line 1169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            throw t$21083;
        }
        
        //#line 1170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.AtCheckedWrapper t$21085 = ((x10.lang.Runtime.AtCheckedWrapper)(new x10.lang.Runtime.AtCheckedWrapper(((java.lang.Throwable)(caught)))));
        
        //#line 1170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        throw t$21085;
    }
    
    
    //#line 1182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void runAtNonResilient(final x10.lang.Place place, final x10.core.fun.VoidFun_0_0 body, final x10.lang.Runtime.Profile prof) {
        
        //#line 1183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10.lang.Runtime.ensureNotInAtomic();
        
        //#line 1184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long t$21086 = place.id;
        
        //#line 1184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long t$21087 = ((long)x10.x10rt.X10RT.here());
        
        //#line 1184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21091 = ((long) t$21086) == ((long) t$21087);
        
        //#line 1184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21091) {
            
            //#line 1185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            try {{
                
                //#line 1186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                try {{
                    
                    //#line 1187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.core.fun.VoidFun_0_0 t$21088 = ((x10.core.fun.VoidFun_0_0)(x10.lang.Runtime.<x10.core.fun.VoidFun_0_0> deepCopy__0x10$lang$Runtime$$T$G(x10.core.fun.VoidFun_0_0.$RTT, ((x10.core.fun.VoidFun_0_0)(body)), ((x10.lang.Runtime.Profile)(prof)))));
                    
                    //#line 1187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ((x10.core.fun.VoidFun_0_0)t$21088).$apply();
                    
                    //#line 1188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    return;
                }}catch (final x10.lang.Runtime.AtCheckedWrapper t) {
                    
                    //#line 1190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final java.lang.Throwable t$21089 = t.getCause();
                    
                    //#line 1190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    throw t$21089;
                }
            }}catch (final java.lang.Throwable t) {
                
                //#line 1193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final java.lang.Throwable t$21090 = ((java.lang.Throwable)(x10.lang.Runtime.<java.lang.Throwable> deepCopy__0x10$lang$Runtime$$T$G(x10.rtt.Types.CHECKED_THROWABLE, ((java.lang.Throwable)(t)), ((x10.lang.Runtime.Profile)(null)))));
                
                //#line 1193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                java.lang.Thread.currentThread().stop(t$21090);
            }
        }
        
        //#line 1196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.RemoteControl me = ((x10.lang.Runtime.RemoteControl)(new x10.lang.Runtime.RemoteControl()));
        
        //#line 1197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.RemoteControl t$21092 = ((x10.lang.Runtime.RemoteControl)
                                                         me);
        
        //#line 1197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.GlobalRef box = new x10.core.GlobalRef<x10.lang.Runtime.RemoteControl>(x10.lang.Runtime.RemoteControl.$RTT, t$21092, (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null);
        
        //#line 1198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity t$21093 = x10.lang.Runtime.activity();
        
        //#line 1198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity.ClockPhases clockPhases = ((x10.lang.Activity.ClockPhases)(t$21093.clockPhases));
        
        //#line 1199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.io.Serializer ser = ((x10.io.Serializer)(new x10.io.Serializer()));
        
        //#line 1200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ser.writeAny(((java.lang.Object)(body)));
        
        //#line 1201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Rail bytes = ser.toRail();
        
        //#line 1202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10.lang.Runtime.runAsync(((x10.lang.Place)(place)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure$8(clockPhases, bytes, box, (x10.lang.Runtime.$Closure$8.__1$1x10$lang$Byte$2__2$1x10$lang$Runtime$RemoteControl$2) null))), ((x10.lang.Runtime.Profile)(prof)));
        
        //#line 1232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        me.await();
        
        //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.fun.VoidFun_0_0 o$20346 = ((x10.core.fun.VoidFun_0_0)(body));
        
        //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail o$20349 = ((x10.core.Rail)(bytes));
        
        //#line 1235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity t$21102 = x10.lang.Runtime.activity();
        
        //#line 1235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity.ClockPhases t$21103 = ((x10.lang.Activity.ClockPhases)(me.clockPhases));
        
        //#line 1235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$21102.clockPhases = ((x10.lang.Activity.ClockPhases)(t$21103));
        
        //#line 1236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final java.lang.Throwable t$21104 = ((java.lang.Throwable)(me.e));
        
        //#line 1236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21106 = ((null) != (t$21104));
        
        //#line 1236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21106) {
            
            //#line 1237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final java.lang.Throwable t$21105 = ((java.lang.Throwable)(me.e));
            
            //#line 1237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            java.lang.Thread.currentThread().stop(t$21105);
        }
    }
    
    
    //#line 1244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void runAt(final x10.lang.Place place, final x10.core.fun.VoidFun_0_0 body, final x10.lang.Runtime.Profile prof) {
        
        //#line 1245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity t$21107 = x10.lang.Runtime.activity();
        
        //#line 1245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState t$21108 = t$21107.finishState();
        
        //#line 1245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$21108.runAt(((x10.lang.Place)(place)), ((x10.core.fun.VoidFun_0_0)(body)), ((x10.lang.Runtime.Profile)(prof)));
    }
    
    
    //#line 1253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void runAtSimple(final x10.lang.Place place, final x10.core.fun.VoidFun_0_0 body, final boolean toWait) {
        
        //#line 1255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long t$21109 = place.id;
        
        //#line 1255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long t$21110 = ((long)x10.x10rt.X10RT.here());
        
        //#line 1255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21112 = ((long) t$21109) == ((long) t$21110);
        
        //#line 1255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21112) {
            
            //#line 1256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 t$21111 = ((x10.core.fun.VoidFun_0_0)(x10.lang.Runtime.<x10.core.fun.VoidFun_0_0> deepCopy__0x10$lang$Runtime$$T$G(x10.core.fun.VoidFun_0_0.$RTT, ((x10.core.fun.VoidFun_0_0)(body)), ((x10.lang.Runtime.Profile)(null)))));
            
            //#line 1256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ((x10.core.fun.VoidFun_0_0)t$21111).$apply();
            
            //#line 1257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return;
        }
        
        //#line 1259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (toWait) {
            
            //#line 1260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.RemoteControl me = ((x10.lang.Runtime.RemoteControl)(new x10.lang.Runtime.RemoteControl()));
            
            //#line 1261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.RemoteControl t$21113 = ((x10.lang.Runtime.RemoteControl)
                                                             me);
            
            //#line 1261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.GlobalRef box = new x10.core.GlobalRef<x10.lang.Runtime.RemoteControl>(x10.lang.Runtime.RemoteControl.$RTT, t$21113, (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null);
            
            //#line 1262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 latchedBody = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure_runAtSimple_1(body, box, (x10.lang.Runtime.$Closure_runAtSimple_1.__1$1x10$lang$Runtime$RemoteControl$2) null)));
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long id$20352 = place.id;
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 msgBody$20353 = ((x10.core.fun.VoidFun_0_0)(latchedBody));
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Profile prof$20354 = ((x10.lang.Runtime.Profile)(((x10.lang.Runtime.Profile)
                                                                                      (null))));
            
            //#line 77 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(id$20352))), msgBody$20353, ((x10.lang.Runtime.Profile)(null)), null);
            
            //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
            final x10.core.fun.VoidFun_0_0 o$20357 = ((x10.core.fun.VoidFun_0_0)(latchedBody));
            
            //#line 1273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            me.await();
        } else {
            
            //#line 1275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 simpleBody = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure_runAtSimple_3(body)));
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final long id$20360 = place.id;
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 msgBody$20361 = ((x10.core.fun.VoidFun_0_0)(simpleBody));
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Profile prof$20362 = ((x10.lang.Runtime.Profile)(((x10.lang.Runtime.Profile)
                                                                                      (null))));
            
            //#line 77 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(id$20360))), msgBody$20361, ((x10.lang.Runtime.Profile)(null)), null);
            
            //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
            final x10.core.fun.VoidFun_0_0 o$20365 = ((x10.core.fun.VoidFun_0_0)(simpleBody));
        }
        
        //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.fun.VoidFun_0_0 o$20368 = ((x10.core.fun.VoidFun_0_0)(body));
    }
    
    
    //#line 1286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    @x10.runtime.impl.java.X10Generated
    public static class Remote<$T> extends x10.lang.Runtime.RemoteControl implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<Remote> $RTT = 
            x10.rtt.NamedType.<Remote> make("x10.lang.Runtime.Remote",
                                            Remote.class,
                                            1,
                                            new x10.rtt.Type[] {
                                                x10.lang.Runtime.RemoteControl.$RTT
                                            });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            throw new x10.io.NotSerializableException("Can't serialize x10.lang.Runtime.Remote");
        }
        
        // constructor just for allocation
        public Remote(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            super($dummy);
            x10.lang.Runtime.Remote.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final Remote $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        
        //#line 1287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public Remote(final x10.rtt.Type $T) {
            super();
            x10.lang.Runtime.Remote.$initParams(this, $T);
             {
                
                //#line 1287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                
                
                //#line 1286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this.__fieldInitializers_x10_lang_Runtime_Remote();
            }
        }
        
        
        
        //#line 1288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public x10.util.Box<$T> t;
        
        
        //#line 1286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final public x10.lang.Runtime.Remote x10$lang$Runtime$Remote$$this$x10$lang$Runtime$Remote() {
            
            //#line 1286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return x10.lang.Runtime.Remote.this;
        }
        
        
        //#line 1286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final public void __fieldInitializers_x10_lang_Runtime_Remote() {
            
            //#line 1286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ((x10.lang.Runtime.Remote<$T>)this).t = null;
        }
    }
    
    
    //#line 1297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    @x10.runtime.impl.java.X10Generated
    public static class Profile extends x10.core.Ref implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<Profile> $RTT = 
            x10.rtt.NamedType.<Profile> make("x10.lang.Runtime.Profile",
                                             Profile.class);
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.Profile $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.bytes = $deserializer.readLong();
            $_obj.serializationNanos = $deserializer.readLong();
            $_obj.communicationNanos = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Runtime.Profile $_obj = new x10.lang.Runtime.Profile((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.bytes);
            $serializer.write(this.serializationNanos);
            $serializer.write(this.communicationNanos);
            
        }
        
        // constructor just for allocation
        public Profile(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        //#line 1299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        /** Number of bytes that were serialized. */
        public long bytes;
        
        //#line 1301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        /** Time spent serializing. */
        public long serializationNanos;
        
        //#line 1303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        /** Time spent sending the message (does not include time spent waiting for the completion notification). */
        public long communicationNanos;
        
        
        //#line 1305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        public void reset() {
            
            //#line 1305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.bytes = 0L;
            
            //#line 1305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.serializationNanos = 0L;
            
            //#line 1305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.communicationNanos = 0L;
        }
        
        
        //#line 1297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final public x10.lang.Runtime.Profile x10$lang$Runtime$Profile$$this$x10$lang$Runtime$Profile() {
            
            //#line 1297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return x10.lang.Runtime.Profile.this;
        }
        
        
        //#line 1297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        // creation method for java code (1-phase java constructor)
        public Profile() {
            this((java.lang.System[]) null);
            x10$lang$Runtime$Profile$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.lang.Runtime.Profile x10$lang$Runtime$Profile$$init$S() {
             {
                
                //#line 1297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                
                
                //#line 1297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Profile this$20371 = this;
                
                //#line 1297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this$20371.bytes = 0L;
                
                //#line 1297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this$20371.serializationNanos = 0L;
                
                //#line 1297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this$20371.communicationNanos = 0L;
            }
            return this;
        }
        
        
        
        //#line 1297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final public void __fieldInitializers_x10_lang_Runtime_Profile() {
            
            //#line 1297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.bytes = 0L;
            
            //#line 1297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.serializationNanos = 0L;
            
            //#line 1297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this.communicationNanos = 0L;
        }
    }
    
    
    
    //#line 1311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static java.lang.Object evalAtNonResilient__1$1x10$lang$Any$2(final x10.lang.Place place, final x10.core.fun.Fun_0_0<java.lang.Object> eval, final x10.lang.Runtime.Profile prof) {
        
        //#line 1312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10.lang.Runtime.ensureNotInAtomic();
        
        //#line 1313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long t$21117 = place.id;
        
        //#line 1313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final long t$21118 = ((long)x10.x10rt.X10RT.here());
        
        //#line 1313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21123 = ((long) t$21117) == ((long) t$21118);
        
        //#line 1313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21123) {
            
            //#line 1314 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            try {{
                
                //#line 1315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                try {{
                    
                    //#line 1316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.core.fun.Fun_0_0 t$21119 = ((x10.core.fun.Fun_0_0)(x10.lang.Runtime.<x10.core.fun.Fun_0_0<java.lang.Object>> deepCopy__0x10$lang$Runtime$$T$G(x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT,x10.rtt.Types.ANY), ((x10.core.fun.Fun_0_0)(eval)), ((x10.lang.Runtime.Profile)(prof)))));
                    
                    //#line 1316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final java.lang.Object result = ((x10.core.fun.Fun_0_0<java.lang.Object>)t$21119).$apply$G();
                    
                    //#line 1317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final java.lang.Object t$21120 = ((java.lang.Object)(x10.lang.Runtime.<java.lang.Object> deepCopy__0x10$lang$Runtime$$T$G(x10.rtt.Types.ANY, ((java.lang.Object)(result)), ((x10.lang.Runtime.Profile)(prof)))));
                    
                    //#line 1317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    return t$21120;
                }}catch (final x10.lang.Runtime.AtCheckedWrapper t) {
                    
                    //#line 1319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final java.lang.Throwable t$21121 = t.getCause();
                    
                    //#line 1319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    throw t$21121;
                }
            }}catch (final java.lang.Throwable t) {
                
                //#line 1322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final java.lang.Throwable t$21122 = ((java.lang.Throwable)(x10.lang.Runtime.<java.lang.Throwable> deepCopy__0x10$lang$Runtime$$T$G(x10.rtt.Types.CHECKED_THROWABLE, ((java.lang.Throwable)(t)), ((x10.lang.Runtime.Profile)(null)))));
                
                //#line 1322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                java.lang.Thread.currentThread().stop(t$21122);
            }
        }
        
        //#line 1325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Remote me = ((x10.lang.Runtime.Remote)(new x10.lang.Runtime.Remote<java.lang.Object>(x10.rtt.Types.ANY)));
        
        //#line 1326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Remote t$21124 = ((x10.lang.Runtime.Remote<java.lang.Object>)
                                                  me);
        
        //#line 1326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.GlobalRef box = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.lang.Runtime.Remote<java.lang.Object>>(x10.rtt.ParameterizedType.make(x10.lang.Runtime.Remote.$RTT, x10.rtt.Types.ANY), t$21124, (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
        
        //#line 1327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity t$21125 = x10.lang.Runtime.activity();
        
        //#line 1327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity.ClockPhases clockPhases = ((x10.lang.Activity.ClockPhases)(t$21125.clockPhases));
        
        //#line 1328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.io.Serializer ser = ((x10.io.Serializer)(new x10.io.Serializer()));
        
        //#line 1329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ser.writeAny(((java.lang.Object)(eval)));
        
        //#line 1330 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Rail bytes = ser.toRail();
        
        //#line 1331 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10.lang.Runtime.runAsync(((x10.lang.Place)(place)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure$9(clockPhases, bytes, box, (x10.lang.Runtime.$Closure$9.__1$1x10$lang$Byte$2__2$1x10$lang$Runtime$Remote$1x10$lang$Any$2$2) null))), ((x10.lang.Runtime.Profile)(prof)));
        
        //#line 1372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        me.await();
        
        //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.fun.Fun_0_0 o$20390 = ((x10.core.fun.Fun_0_0)(eval));
        
        //#line 1374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity t$21135 = x10.lang.Runtime.activity();
        
        //#line 1374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity.ClockPhases t$21136 = ((x10.lang.Activity.ClockPhases)(me.clockPhases));
        
        //#line 1374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$21135.clockPhases = ((x10.lang.Activity.ClockPhases)(t$21136));
        
        //#line 1375 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final java.lang.Throwable t$21137 = ((java.lang.Throwable)(me.e));
        
        //#line 1375 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21139 = ((null) != (t$21137));
        
        //#line 1375 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21139) {
            
            //#line 1376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final java.lang.Throwable t$21138 = ((java.lang.Throwable)(me.e));
            
            //#line 1376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            java.lang.Thread.currentThread().stop(t$21138);
        }
        
        //#line 1378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.util.Box t$21140 = ((x10.util.Box)(((x10.lang.Runtime.Remote<java.lang.Object>)me).t));
        
        //#line 1378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final java.lang.Object t$21141 = ((java.lang.Object)(((x10.util.Box<java.lang.Object>)t$21140).value));
        
        //#line 1378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$21141;
    }
    
    
    //#line 1384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static <$T>$T evalAt__1$1x10$lang$Runtime$$T$2$G(final x10.rtt.Type $T, final x10.lang.Place place, final x10.core.fun.Fun_0_0<$T> body, final x10.lang.Runtime.Profile prof) {
        
        //#line 1386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity t$21142 = x10.lang.Runtime.activity();
        
        //#line 1386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState t$21143 = t$21142.finishState();
        
        //#line 1386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final java.lang.Object t$21144 = t$21143.evalAt__1$1x10$lang$Any$2(((x10.lang.Place)(place)), ((x10.core.fun.Fun_0_0)(body)), ((x10.lang.Runtime.Profile)(prof)));
        
        //#line 1386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final $T r = (($T)(x10.rtt.Types.<$T> cast(t$21144,$T)));
        
        //#line 1388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return r;
    }
    
    
    //#line 1393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void StaticInitBroadcastDispatcherLock() {
        
        //#line 1394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.util.concurrent.Monitor t$21145 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$staticMonitor()));
        
        //#line 1394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$21145.lock();
    }
    
    
    //#line 1397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void StaticInitBroadcastDispatcherAwait() {
        
        //#line 1398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.util.concurrent.Monitor t$21146 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$staticMonitor()));
        
        //#line 1398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$21146.await();
    }
    
    
    //#line 1401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void StaticInitBroadcastDispatcherUnlock() {
        
        //#line 1402 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.util.concurrent.Monitor t$21147 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$staticMonitor()));
        
        //#line 1402 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$21147.unlock();
    }
    
    
    //#line 1405 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void StaticInitBroadcastDispatcherNotify() {
        
        //#line 1406 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.util.concurrent.Monitor t$21148 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$staticMonitor()));
        
        //#line 1406 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$21148.release();
    }
    
    
    //#line 1411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void enterAtomic() {
        
        //#line 1412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.util.concurrent.Monitor t$21149 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
        
        //#line 1412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$21149.lock();
        
        //#line 1413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity a = x10.lang.Runtime.activity();
        
        //#line 1414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21150 = ((a) != (null));
        
        //#line 1414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21150) {
            
            //#line 1415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            a.pushAtomic();
        }
    }
    
    
    //#line 1418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void ensureNotInAtomic() {
        
        //#line 1419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity a = x10.lang.Runtime.activity();
        
        //#line 1420 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21151 = ((a) != (null));
        
        //#line 1420 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21151) {
            
            //#line 1421 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            a.ensureNotInAtomic();
        }
    }
    
    
    //#line 1424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void exitAtomic() {
        
        //#line 1425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity a = x10.lang.Runtime.activity();
        
        //#line 1426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21152 = ((a) != (null));
        
        //#line 1426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21152) {
            
            //#line 1427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            a.popAtomic();
        }
        
        //#line 1428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$21153 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 1428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Deque t$21154 = ((x10.core.Deque)(t$21153.wsBlockedContinuations));
        
        //#line 1428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21155 = ((null) != (t$21154));
        
        //#line 1428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21155) {
            
            //#line 1428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.lang.Runtime.wsUnblock();
        }
        
        //#line 1429 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.util.concurrent.Monitor t$21156 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
        
        //#line 1429 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$21156.release();
    }
    
    
    //#line 1432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void exitWSWhen(final boolean b) {
        
        //#line 1433 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity a = x10.lang.Runtime.activity();
        
        //#line 1434 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21157 = ((a) != (null));
        
        //#line 1434 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21157) {
            
            //#line 1435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            a.popAtomic();
        }
        
        //#line 1436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (b) {
            
            //#line 1437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.lang.Runtime.wsUnblock();
            
            //#line 1438 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.Monitor t$21158 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
            
            //#line 1438 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$21158.release();
        } else {
            
            //#line 1440 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.util.concurrent.Monitor t$21159 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
            
            //#line 1440 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$21159.unlock();
        }
    }
    
    
    //#line 1444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void awaitAtomic() {
        
        //#line 1445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.util.concurrent.Monitor t$21160 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
        
        //#line 1445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$21160.await();
    }
    
    
    //#line 1449 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static x10.lang.FinishState makeDefaultFinish() {
        
        //#line 1450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final int t$21161 = x10.lang.Runtime.get$RESILIENT_MODE();
        
        //#line 1450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21163 = ((int) t$21161) == ((int) 0);
        
        //#line 1450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21163) {
            
            //#line 1451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.FinishState.Finish alloc$2803 = ((x10.lang.FinishState.Finish)(new x10.lang.FinishState.Finish((java.lang.System[]) null)));
            
            //#line 364 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            final x10.lang.FinishState.RootFinish alloc$21427 = ((x10.lang.FinishState.RootFinish)(new x10.lang.FinishState.RootFinish((java.lang.System[]) null)));
            
            //#line 364 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            alloc$21427.x10$lang$FinishState$RootFinish$$init$S();
            
            //#line 364 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            alloc$2803.x10$lang$FinishState$Finish$$init$S(((x10.lang.FinishState.RootFinish)(alloc$21427)));
            
            //#line 1451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return alloc$2803;
        } else {
            
            //#line 1453 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.FinishState t$21162 = x10.lang.FinishResilient.make(((x10.lang.FinishState)(null)), ((x10.util.concurrent.SimpleLatch)(null)));
            
            //#line 1453 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return t$21162;
        }
    }
    
    
    //#line 1455 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static x10.lang.FinishState makeDefaultFinish(final x10.util.concurrent.SimpleLatch latch) {
        
        //#line 1456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final int t$21164 = x10.lang.Runtime.get$RESILIENT_MODE();
        
        //#line 1456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21166 = ((int) t$21164) == ((int) 0);
        
        //#line 1456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21166) {
            
            //#line 1457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.FinishState.Finish alloc$2804 = ((x10.lang.FinishState.Finish)(new x10.lang.FinishState.Finish((java.lang.System[]) null)));
            
            //#line 360 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            final x10.util.concurrent.SimpleLatch latch$20448 = ((x10.util.concurrent.SimpleLatch)(latch));
            
            //#line 361 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            final x10.lang.FinishState.RootFinish alloc$21428 = ((x10.lang.FinishState.RootFinish)(new x10.lang.FinishState.RootFinish((java.lang.System[]) null)));
            
            //#line 361 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            alloc$21428.x10$lang$FinishState$RootFinish$$init$S(((x10.util.concurrent.SimpleLatch)(latch$20448)));
            
            //#line 361 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            alloc$2804.x10$lang$FinishState$Finish$$init$S(((x10.lang.FinishState.RootFinish)(alloc$21428)));
            
            //#line 1457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return alloc$2804;
        } else {
            
            //#line 1459 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.FinishState t$21165 = x10.lang.FinishResilient.make(((x10.lang.FinishState)(null)), ((x10.util.concurrent.SimpleLatch)(latch)));
            
            //#line 1459 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            return t$21165;
        }
    }
    
    
    //#line 1466 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static x10.lang.FinishState startFinish() {
        
        //#line 1467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity t$21167 = x10.lang.Runtime.activity();
        
        //#line 1467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState t$21168 = x10.lang.Runtime.makeDefaultFinish();
        
        //#line 1467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState t$21169 = ((x10.lang.FinishState)(t$21167.swapFinish(((x10.lang.FinishState)(t$21168)))));
        
        //#line 1467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$21169;
    }
    
    
    //#line 1470 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static x10.lang.FinishState startFinish(final int pragma) {
        
        //#line 1471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState f;
        
        //#line 1472 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        switch (pragma) {
            
            //#line 1473 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            case 1:
                
                //#line 1474 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.FinishState.FinishAsync alloc$2805 = ((x10.lang.FinishState.FinishAsync)(new x10.lang.FinishState.FinishAsync((java.lang.System[]) null)));
                {
                    
                    //#line 1474 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    alloc$2805.x10$lang$FinishState$FinishAsync$$init$S();
                }
                
                //#line 1474 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                f = ((x10.lang.FinishState)(alloc$2805));
                
                //#line 1474 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                break;
            
            //#line 1475 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            case 2:
                
                //#line 1476 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.FinishState.FinishHere alloc$2806 = ((x10.lang.FinishState.FinishHere)(new x10.lang.FinishState.FinishHere((java.lang.System[]) null)));
                {
                    
                    //#line 1476 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    alloc$2806.x10$lang$FinishState$FinishHere$$init$S();
                }
                
                //#line 1476 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                f = ((x10.lang.FinishState)(alloc$2806));
                
                //#line 1476 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                break;
            
            //#line 1477 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            case 3:
                
                //#line 1478 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.FinishState.FinishSPMD alloc$2807 = ((x10.lang.FinishState.FinishSPMD)(new x10.lang.FinishState.FinishSPMD((java.lang.System[]) null)));
                {
                    
                    //#line 1478 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    alloc$2807.x10$lang$FinishState$FinishSPMD$$init$S();
                }
                
                //#line 1478 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                f = ((x10.lang.FinishState)(alloc$2807));
                
                //#line 1478 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                break;
            
            //#line 1479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            case 4:
                
                //#line 1480 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.FinishState.LocalFinish alloc$2808 = ((x10.lang.FinishState.LocalFinish)(new x10.lang.FinishState.LocalFinish((java.lang.System[]) null)));
                {
                    
                    //#line 1480 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    alloc$2808.x10$lang$FinishState$LocalFinish$$init$S();
                }
                
                //#line 1480 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                f = ((x10.lang.FinishState)(alloc$2808));
                
                //#line 1480 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                break;
            
            //#line 1481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            case 5:
                
                //#line 1482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.FinishState.DenseFinish alloc$2809 = ((x10.lang.FinishState.DenseFinish)(new x10.lang.FinishState.DenseFinish((java.lang.System[]) null)));
                {
                    
                    //#line 608 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    final x10.lang.FinishState.RootFinish alloc$20451 = ((x10.lang.FinishState.RootFinish)(new x10.lang.FinishState.RootFinish((java.lang.System[]) null)));
                    
                    //#line 608 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    alloc$20451.x10$lang$FinishState$RootFinish$$init$S();
                    
                    //#line 608 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    alloc$2809.x10$lang$FinishState$DenseFinish$$init$S(((x10.lang.FinishState.RootFinish)(alloc$20451)));
                }
                
                //#line 1482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                f = ((x10.lang.FinishState)(alloc$2809));
                
                //#line 1482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                break;
            
            //#line 1483 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            case 100:
                
                //#line 1484 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.FinishState.FinishResilientPlaceZero alloc$2810 = ((x10.lang.FinishState.FinishResilientPlaceZero)(new x10.lang.FinishState.FinishResilientPlaceZero((java.lang.System[]) null)));
                {
                    
                    //#line 1484 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    alloc$2810.x10$lang$FinishState$FinishResilientPlaceZero$$init$S(((x10.util.concurrent.SimpleLatch)(null)));
                }
                
                //#line 1484 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                f = ((x10.lang.FinishState)(alloc$2810));
                
                //#line 1484 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                break;
            
            //#line 1485 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            case 101:
                
                //#line 1486 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.FinishState.FinishResilientZooKeeper alloc$2811 = ((x10.lang.FinishState.FinishResilientZooKeeper)(new x10.lang.FinishState.FinishResilientZooKeeper((java.lang.System[]) null)));
                {
                    
                    //#line 1486 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    alloc$2811.x10$lang$FinishState$FinishResilientZooKeeper$$init$S(((x10.util.concurrent.SimpleLatch)(null)));
                }
                
                //#line 1486 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                f = ((x10.lang.FinishState)(alloc$2811));
                
                //#line 1486 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                break;
            
            //#line 1487 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            case 102:
                
                //#line 1488 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.FinishState.FinishResilientDistributed alloc$2812 = ((x10.lang.FinishState.FinishResilientDistributed)(new x10.lang.FinishState.FinishResilientDistributed((java.lang.System[]) null)));
                {
                    
                    //#line 1488 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    alloc$2812.x10$lang$FinishState$FinishResilientDistributed$$init$S(((x10.util.concurrent.SimpleLatch)(null)));
                }
                
                //#line 1488 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                f = ((x10.lang.FinishState)(alloc$2812));
                
                //#line 1488 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                break;
            
            //#line 1489 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            default:
                
                //#line 1490 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.FinishState t$21170 = x10.lang.Runtime.makeDefaultFinish();
                
                //#line 1490 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                f = ((x10.lang.FinishState)(t$21170));
        }
        
        //#line 1492 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity t$21171 = x10.lang.Runtime.activity();
        
        //#line 1492 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState t$21172 = ((x10.lang.FinishState)(t$21171.swapFinish(((x10.lang.FinishState)(f)))));
        
        //#line 1492 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$21172;
    }
    
    
    //#line 1495 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static x10.lang.FinishState startLocalFinish() {
        
        //#line 1496 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity t$21173 = x10.lang.Runtime.activity();
        
        //#line 1496 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState.LocalFinish alloc$2813 = ((x10.lang.FinishState.LocalFinish)(new x10.lang.FinishState.LocalFinish((java.lang.System[]) null)));
        
        //#line 1496 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        alloc$2813.x10$lang$FinishState$LocalFinish$$init$S();
        
        //#line 1496 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState t$21174 = ((x10.lang.FinishState)(t$21173.swapFinish(((x10.lang.FinishState)(alloc$2813)))));
        
        //#line 1496 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$21174;
    }
    
    
    //#line 1499 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static x10.lang.FinishState startSimpleFinish() {
        
        //#line 1500 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity t$21175 = x10.lang.Runtime.activity();
        
        //#line 1500 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState.Finish alloc$2814 = ((x10.lang.FinishState.Finish)(new x10.lang.FinishState.Finish((java.lang.System[]) null)));
        
        //#line 364 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        final x10.lang.FinishState.RootFinish alloc$21429 = ((x10.lang.FinishState.RootFinish)(new x10.lang.FinishState.RootFinish((java.lang.System[]) null)));
        
        //#line 364 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        alloc$21429.x10$lang$FinishState$RootFinish$$init$S();
        
        //#line 364 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        alloc$2814.x10$lang$FinishState$Finish$$init$S(((x10.lang.FinishState.RootFinish)(alloc$21429)));
        
        //#line 1500 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState t$21176 = ((x10.lang.FinishState)(t$21175.swapFinish(((x10.lang.FinishState)(alloc$2814)))));
        
        //#line 1500 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$21176;
    }
    
    
    //#line 1509 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void stopFinish(final x10.lang.FinishState f) {
        
        //#line 1510 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity a = x10.lang.Runtime.activity();
        
        //#line 1511 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState finishState = ((x10.lang.FinishState)(a.swapFinish(((x10.lang.FinishState)(f)))));
        
        //#line 1512 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        finishState.waitForFinish();
        
        //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.lang.FinishState o$20455 = ((x10.lang.FinishState)(finishState));
    }
    
    
    //#line 1520 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void pushException(final java.lang.Throwable t) {
        
        //#line 1521 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final java.lang.RuntimeException e = x10.rtt.Types.EXCEPTION.isInstance(t) ? (java.lang.RuntimeException)(t) : new x10.lang.WrappedThrowable(t);
        
        //#line 1522 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity t$21177 = x10.lang.Runtime.activity();
        
        //#line 1522 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState t$21178 = t$21177.finishState();
        
        //#line 1522 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$21178.pushException(((java.lang.RuntimeException)(e)));
    }
    
    
    //#line 1524 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static <$T>x10.lang.FinishState startCollectingFinish__0$1x10$lang$Runtime$$T$2(final x10.rtt.Type $T, final x10.lang.Reducible<$T> r) {
        
        //#line 1525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity t$21179 = x10.lang.Runtime.activity();
        
        //#line 1525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState.CollectingFinish alloc$2815 = ((x10.lang.FinishState.CollectingFinish)(new x10.lang.FinishState.CollectingFinish<$T>((java.lang.System[]) null, $T)));
        
        //#line 1525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        alloc$2815.x10$lang$FinishState$CollectingFinish$$init$S(((x10.lang.Reducible<$T>)(r)), (x10.lang.FinishState.CollectingFinish.__0$1x10$lang$FinishState$CollectingFinish$$T$2) null);
        
        //#line 1525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState t$21180 = ((x10.lang.FinishState)(t$21179.swapFinish(((x10.lang.FinishState)(alloc$2815)))));
        
        //#line 1525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$21180;
    }
    
    
    //#line 1528 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static <$T>void makeOffer__0x10$lang$Runtime$$T(final x10.rtt.Type $T, final $T t) {
        
        //#line 1529 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity t$21181 = x10.lang.Runtime.activity();
        
        //#line 1529 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState state = t$21181.finishState();
        
        //#line 1531 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState.CollectingFinish t$21184 = ((x10.lang.FinishState.CollectingFinish)(x10.rtt.Types.<x10.lang.FinishState.CollectingFinish<$T>> cast(state,x10.rtt.ParameterizedType.make(x10.lang.FinishState.CollectingFinish.$RTT, $T))));
        
        //#line 765 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$21182 = x10.core.Thread.currentThread();
        
        //#line 765 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$21183 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$21182,x10.lang.Runtime.Worker.$RTT);
        
        //#line 770 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final int t$21185 = t$21183.workerId;
        
        //#line 1531 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ((x10.lang.FinishState.CollectingFinish<$T>)t$21184).accept__0x10$lang$FinishState$CollectingFinish$$T((($T)(t)), (int)(t$21185));
    }
    
    
    //#line 1534 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static <$T>$T stopCollectingFinish$G(final x10.rtt.Type $T, final x10.lang.FinishState f) {
        
        //#line 1535 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity t$21186 = x10.lang.Runtime.activity();
        
        //#line 1535 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState state = ((x10.lang.FinishState)(t$21186.swapFinish(((x10.lang.FinishState)(f)))));
        
        //#line 1536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.FinishState.CollectingFinish t$21187 = ((x10.lang.FinishState.CollectingFinish)(x10.rtt.Types.<x10.lang.FinishState.CollectingFinish<$T>> cast(state,x10.rtt.ParameterizedType.make(x10.lang.FinishState.CollectingFinish.$RTT, $T))));
        
        //#line 1536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final $T t$21188 = (($T)(((x10.lang.FinishState.CollectingFinish<$T>)t$21187).waitForFinishExpr$G()));
        
        //#line 1536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$21188;
    }
    
    
    //#line 1540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void execute(final x10.lang.Activity activity) {
        
        //#line 765 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$21189 = x10.core.Thread.currentThread();
        
        //#line 1541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker this$20464 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$21189,x10.lang.Runtime.Worker.$RTT);
        
        //#line 567 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity activity$20463 = ((x10.lang.Activity)(activity));
        
        //#line 567 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Deque t$21430 = ((x10.core.Deque)(this$20464.queue));
        
        //#line 567 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$21430.push(((java.lang.Object)(activity$20463)));
    }
    
    
    //#line 1544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void executeLocal(final x10.lang.Activity activity) {
        
        //#line 1545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$21191 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 1545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21192 = t$21191.deal$O(((x10.lang.Activity)(activity)));
        
        //#line 1545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21195 = !(t$21192);
        
        //#line 1545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21195) {
            
            //#line 765 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Thread t$21193 = x10.core.Thread.currentThread();
            
            //#line 1545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Worker this$20468 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$21193,x10.lang.Runtime.Worker.$RTT);
            
            //#line 567 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Activity activity$20467 = ((x10.lang.Activity)(activity));
            
            //#line 567 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.Deque t$21431 = ((x10.core.Deque)(this$20468.queue));
            
            //#line 567 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$21431.push(((java.lang.Object)(activity$20467)));
        }
    }
    
    
    //#line 1549 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void execute(final x10.core.fun.VoidFun_0_0 body, final x10.lang.Place src, final x10.lang.FinishState finishState) {
        
        //#line 1550 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Activity alloc$2816 = ((x10.lang.Activity)(new x10.lang.Activity((java.lang.System[]) null)));
        
        //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.core.fun.VoidFun_0_0 body$20471 = ((x10.core.fun.VoidFun_0_0)(body));
        
        //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.Place srcPlace$20472 = ((x10.lang.Place)(src));
        
        //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.FinishState finishState$20473 = ((x10.lang.FinishState)(finishState));
        
        //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.core.fun.VoidFun_0_0 body$21432 = ((x10.core.fun.VoidFun_0_0)(body$20471));
        
        //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.Place srcPlace$21433 = ((x10.lang.Place)(srcPlace$20472));
        
        //#line 104 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        final x10.lang.FinishState finishState$21434 = ((x10.lang.FinishState)(finishState$20473));
        
        //#line 105 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        alloc$2816.x10$lang$Activity$$init$S(((x10.core.fun.VoidFun_0_0)(body$21432)), ((x10.lang.Place)(srcPlace$21433)), ((x10.lang.FinishState)(finishState$21434)), ((boolean)(true)), ((boolean)(true)));
        
        //#line 1550 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10.lang.Runtime.execute(((x10.lang.Activity)(alloc$2816)));
    }
    
    
    //#line 1553 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void probe() {
        
        //#line 765 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$21196 = x10.core.Thread.currentThread();
        
        //#line 765 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$21197 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$21196,x10.lang.Runtime.Worker.$RTT);
        
        //#line 1554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$21197.probe();
    }
    
    
    //#line 1558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void increaseParallelism() {
        
        //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21198 = x10.lang.Runtime.get$STATIC_THREADS();
        
        //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21200 = !(t$21198);
        
        //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21200) {
            
            //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Pool t$21199 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
            
            //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$21199.increase();
        }
    }
    
    
    //#line 1565 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void decreaseParallelism(final int n) {
        
        //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21201 = x10.lang.Runtime.get$STATIC_THREADS();
        
        //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$21203 = !(t$21201);
        
        //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$21203) {
            
            //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Pool t$21202 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
            
            //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$21202.decrease((int)(n));
        }
    }
    
    
    //#line 1571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static void removeThreadLocalContexts() {
        
        //#line 1572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$21204 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 1572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$21204.removeThreadLocalContexts();
    }
    
    
    //#line 1575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    public static x10.lang.Runtime.Worker wrapNativeThread() {
        
        //#line 1576 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$21205 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 1576 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$21206 = t$21205.wrapNativeThread();
        
        //#line 1576 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return t$21206;
    }
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    final public x10.lang.Runtime x10$lang$Runtime$$this$x10$lang$Runtime() {
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return x10.lang.Runtime.this;
    }
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    // creation method for java code (1-phase java constructor)
    public Runtime() {
        this((java.lang.System[]) null);
        x10$lang$Runtime$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.lang.Runtime x10$lang$Runtime$$init$S() {
         {
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime this$20480 = this;
        }
        return this;
    }
    
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    final public void __fieldInitializers_x10_lang_Runtime() {
        
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$processStartNanos_ = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$processStartNanos_;
    final private static x10.core.concurrent.AtomicInteger initStatus$rootFinish = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$rootFinish;
    final private static x10.core.concurrent.AtomicInteger initStatus$IdleWorkers = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$IdleWorkers;
    final private static x10.core.concurrent.AtomicInteger initStatus$workerInstance = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$workerInstance;
    final private static x10.core.concurrent.AtomicInteger initStatus$finishStates = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$finishStates;
    final private static x10.core.concurrent.AtomicInteger initStatus$pool = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$pool;
    final private static x10.core.concurrent.AtomicInteger initStatus$atomicMonitor = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$atomicMonitor;
    final private static x10.core.concurrent.AtomicInteger initStatus$staticMonitor = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$staticMonitor;
    final private static x10.core.concurrent.AtomicInteger initStatus$CHUNK_DELTA = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$CHUNK_DELTA;
    final private static x10.core.concurrent.AtomicInteger initStatus$RESILIENT_MODE = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$RESILIENT_MODE;
    final private static x10.core.concurrent.AtomicInteger initStatus$BUSY_WAITING = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$BUSY_WAITING;
    final private static x10.core.concurrent.AtomicInteger initStatus$WARN_ON_THREAD_CREATION = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$WARN_ON_THREAD_CREATION;
    final private static x10.core.concurrent.AtomicInteger initStatus$STATIC_THREADS = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$STATIC_THREADS;
    final private static x10.core.concurrent.AtomicInteger initStatus$MAX_THREADS = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$MAX_THREADS;
    final private static x10.core.concurrent.AtomicInteger initStatus$NTHREADS = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$NTHREADS;
    final private static x10.core.concurrent.AtomicInteger initStatus$STRICT_FINISH = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$STRICT_FINISH;
    final private static x10.core.concurrent.AtomicInteger initStatus$env = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$env;
    
    public static x10.util.HashMap get$env() {
        if (((int) x10.lang.Runtime.initStatus$env.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Runtime.env;
        }
        if (((int) x10.lang.Runtime.initStatus$env.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Runtime.exception$env;
        }
        if (x10.lang.Runtime.initStatus$env.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Runtime.env = x10.runtime.impl.java.Runtime.loadenv();
            }}catch (java.lang.Throwable exc$21453) {
                x10.lang.Runtime.exception$env = new x10.lang.ExceptionInInitializer(exc$21453);
                x10.lang.Runtime.initStatus$env.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Runtime.exception$env;
            }
            x10.lang.Runtime.initStatus$env.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Runtime.initStatus$env.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Runtime.initStatus$env.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Runtime.initStatus$env.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Runtime.exception$env;
                }
            }
        }
        return x10.lang.Runtime.env;
    }
    
    public static boolean get$STRICT_FINISH() {
        if (((int) x10.lang.Runtime.initStatus$STRICT_FINISH.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Runtime.STRICT_FINISH;
        }
        if (((int) x10.lang.Runtime.initStatus$STRICT_FINISH.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Runtime.exception$STRICT_FINISH;
        }
        if (x10.lang.Runtime.initStatus$STRICT_FINISH.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Runtime.STRICT_FINISH = x10.lang.Configuration.strict_finish$O();
            }}catch (java.lang.Throwable exc$21454) {
                x10.lang.Runtime.exception$STRICT_FINISH = new x10.lang.ExceptionInInitializer(exc$21454);
                x10.lang.Runtime.initStatus$STRICT_FINISH.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Runtime.exception$STRICT_FINISH;
            }
            x10.lang.Runtime.initStatus$STRICT_FINISH.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Runtime.initStatus$STRICT_FINISH.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Runtime.initStatus$STRICT_FINISH.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Runtime.initStatus$STRICT_FINISH.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Runtime.exception$STRICT_FINISH;
                }
            }
        }
        return x10.lang.Runtime.STRICT_FINISH;
    }
    
    public static int get$NTHREADS() {
        if (((int) x10.lang.Runtime.initStatus$NTHREADS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Runtime.NTHREADS;
        }
        if (((int) x10.lang.Runtime.initStatus$NTHREADS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Runtime.exception$NTHREADS;
        }
        if (x10.lang.Runtime.initStatus$NTHREADS.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Runtime.NTHREADS = x10.lang.Configuration.nthreads$O();
            }}catch (java.lang.Throwable exc$21455) {
                x10.lang.Runtime.exception$NTHREADS = new x10.lang.ExceptionInInitializer(exc$21455);
                x10.lang.Runtime.initStatus$NTHREADS.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Runtime.exception$NTHREADS;
            }
            x10.lang.Runtime.initStatus$NTHREADS.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Runtime.initStatus$NTHREADS.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Runtime.initStatus$NTHREADS.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Runtime.initStatus$NTHREADS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Runtime.exception$NTHREADS;
                }
            }
        }
        return x10.lang.Runtime.NTHREADS;
    }
    
    public static int get$MAX_THREADS() {
        if (((int) x10.lang.Runtime.initStatus$MAX_THREADS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Runtime.MAX_THREADS;
        }
        if (((int) x10.lang.Runtime.initStatus$MAX_THREADS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Runtime.exception$MAX_THREADS;
        }
        if (x10.lang.Runtime.initStatus$MAX_THREADS.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Runtime.MAX_THREADS = x10.lang.Configuration.max_threads$O();
            }}catch (java.lang.Throwable exc$21456) {
                x10.lang.Runtime.exception$MAX_THREADS = new x10.lang.ExceptionInInitializer(exc$21456);
                x10.lang.Runtime.initStatus$MAX_THREADS.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Runtime.exception$MAX_THREADS;
            }
            x10.lang.Runtime.initStatus$MAX_THREADS.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Runtime.initStatus$MAX_THREADS.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Runtime.initStatus$MAX_THREADS.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Runtime.initStatus$MAX_THREADS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Runtime.exception$MAX_THREADS;
                }
            }
        }
        return x10.lang.Runtime.MAX_THREADS;
    }
    
    public static boolean get$STATIC_THREADS() {
        if (((int) x10.lang.Runtime.initStatus$STATIC_THREADS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Runtime.STATIC_THREADS;
        }
        if (((int) x10.lang.Runtime.initStatus$STATIC_THREADS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Runtime.exception$STATIC_THREADS;
        }
        if (x10.lang.Runtime.initStatus$STATIC_THREADS.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Runtime.STATIC_THREADS = x10.lang.Configuration.static_threads$O();
            }}catch (java.lang.Throwable exc$21457) {
                x10.lang.Runtime.exception$STATIC_THREADS = new x10.lang.ExceptionInInitializer(exc$21457);
                x10.lang.Runtime.initStatus$STATIC_THREADS.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Runtime.exception$STATIC_THREADS;
            }
            x10.lang.Runtime.initStatus$STATIC_THREADS.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Runtime.initStatus$STATIC_THREADS.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Runtime.initStatus$STATIC_THREADS.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Runtime.initStatus$STATIC_THREADS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Runtime.exception$STATIC_THREADS;
                }
            }
        }
        return x10.lang.Runtime.STATIC_THREADS;
    }
    
    public static boolean get$WARN_ON_THREAD_CREATION() {
        if (((int) x10.lang.Runtime.initStatus$WARN_ON_THREAD_CREATION.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Runtime.WARN_ON_THREAD_CREATION;
        }
        if (((int) x10.lang.Runtime.initStatus$WARN_ON_THREAD_CREATION.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Runtime.exception$WARN_ON_THREAD_CREATION;
        }
        if (x10.lang.Runtime.initStatus$WARN_ON_THREAD_CREATION.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Runtime.WARN_ON_THREAD_CREATION = x10.lang.Configuration.warn_on_thread_creation$O();
            }}catch (java.lang.Throwable exc$21458) {
                x10.lang.Runtime.exception$WARN_ON_THREAD_CREATION = new x10.lang.ExceptionInInitializer(exc$21458);
                x10.lang.Runtime.initStatus$WARN_ON_THREAD_CREATION.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Runtime.exception$WARN_ON_THREAD_CREATION;
            }
            x10.lang.Runtime.initStatus$WARN_ON_THREAD_CREATION.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Runtime.initStatus$WARN_ON_THREAD_CREATION.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Runtime.initStatus$WARN_ON_THREAD_CREATION.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Runtime.initStatus$WARN_ON_THREAD_CREATION.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Runtime.exception$WARN_ON_THREAD_CREATION;
                }
            }
        }
        return x10.lang.Runtime.WARN_ON_THREAD_CREATION;
    }
    
    public static boolean get$BUSY_WAITING() {
        if (((int) x10.lang.Runtime.initStatus$BUSY_WAITING.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Runtime.BUSY_WAITING;
        }
        if (((int) x10.lang.Runtime.initStatus$BUSY_WAITING.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Runtime.exception$BUSY_WAITING;
        }
        if (x10.lang.Runtime.initStatus$BUSY_WAITING.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Runtime.BUSY_WAITING = x10.lang.Configuration.busy_waiting$O();
            }}catch (java.lang.Throwable exc$21459) {
                x10.lang.Runtime.exception$BUSY_WAITING = new x10.lang.ExceptionInInitializer(exc$21459);
                x10.lang.Runtime.initStatus$BUSY_WAITING.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Runtime.exception$BUSY_WAITING;
            }
            x10.lang.Runtime.initStatus$BUSY_WAITING.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Runtime.initStatus$BUSY_WAITING.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Runtime.initStatus$BUSY_WAITING.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Runtime.initStatus$BUSY_WAITING.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Runtime.exception$BUSY_WAITING;
                }
            }
        }
        return x10.lang.Runtime.BUSY_WAITING;
    }
    
    public static int get$RESILIENT_MODE() {
        if (((int) x10.lang.Runtime.initStatus$RESILIENT_MODE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Runtime.RESILIENT_MODE;
        }
        if (((int) x10.lang.Runtime.initStatus$RESILIENT_MODE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Runtime.exception$RESILIENT_MODE;
        }
        if (x10.lang.Runtime.initStatus$RESILIENT_MODE.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Runtime.RESILIENT_MODE = x10.lang.Configuration.resilient_mode$O();
            }}catch (java.lang.Throwable exc$21460) {
                x10.lang.Runtime.exception$RESILIENT_MODE = new x10.lang.ExceptionInInitializer(exc$21460);
                x10.lang.Runtime.initStatus$RESILIENT_MODE.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Runtime.exception$RESILIENT_MODE;
            }
            x10.lang.Runtime.initStatus$RESILIENT_MODE.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Runtime.initStatus$RESILIENT_MODE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Runtime.initStatus$RESILIENT_MODE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Runtime.initStatus$RESILIENT_MODE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Runtime.exception$RESILIENT_MODE;
                }
            }
        }
        return x10.lang.Runtime.RESILIENT_MODE;
    }
    
    public static double get$CHUNK_DELTA() {
        if (((int) x10.lang.Runtime.initStatus$CHUNK_DELTA.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Runtime.CHUNK_DELTA;
        }
        if (((int) x10.lang.Runtime.initStatus$CHUNK_DELTA.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Runtime.exception$CHUNK_DELTA;
        }
        if (x10.lang.Runtime.initStatus$CHUNK_DELTA.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Runtime.CHUNK_DELTA = x10.lang.Configuration.deltaCustom$O();
            }}catch (java.lang.Throwable exc$21461) {
                x10.lang.Runtime.exception$CHUNK_DELTA = new x10.lang.ExceptionInInitializer(exc$21461);
                x10.lang.Runtime.initStatus$CHUNK_DELTA.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Runtime.exception$CHUNK_DELTA;
            }
            x10.lang.Runtime.initStatus$CHUNK_DELTA.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Runtime.initStatus$CHUNK_DELTA.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Runtime.initStatus$CHUNK_DELTA.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Runtime.initStatus$CHUNK_DELTA.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Runtime.exception$CHUNK_DELTA;
                }
            }
        }
        return x10.lang.Runtime.CHUNK_DELTA;
    }
    
    public static x10.util.concurrent.Monitor get$staticMonitor() {
        if (((int) x10.lang.Runtime.initStatus$staticMonitor.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Runtime.staticMonitor;
        }
        if (((int) x10.lang.Runtime.initStatus$staticMonitor.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Runtime.exception$staticMonitor;
        }
        if (x10.lang.Runtime.initStatus$staticMonitor.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Runtime.staticMonitor = ((x10.util.concurrent.Monitor)(new x10.util.concurrent.Monitor()));
            }}catch (java.lang.Throwable exc$21462) {
                x10.lang.Runtime.exception$staticMonitor = new x10.lang.ExceptionInInitializer(exc$21462);
                x10.lang.Runtime.initStatus$staticMonitor.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Runtime.exception$staticMonitor;
            }
            x10.lang.Runtime.initStatus$staticMonitor.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Runtime.initStatus$staticMonitor.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Runtime.initStatus$staticMonitor.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Runtime.initStatus$staticMonitor.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Runtime.exception$staticMonitor;
                }
            }
        }
        return x10.lang.Runtime.staticMonitor;
    }
    
    public static x10.util.concurrent.Monitor get$atomicMonitor() {
        if (((int) x10.lang.Runtime.initStatus$atomicMonitor.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Runtime.atomicMonitor;
        }
        if (((int) x10.lang.Runtime.initStatus$atomicMonitor.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Runtime.exception$atomicMonitor;
        }
        if (x10.lang.Runtime.initStatus$atomicMonitor.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Runtime.atomicMonitor = ((x10.util.concurrent.Monitor)(new x10.util.concurrent.Monitor()));
            }}catch (java.lang.Throwable exc$21463) {
                x10.lang.Runtime.exception$atomicMonitor = new x10.lang.ExceptionInInitializer(exc$21463);
                x10.lang.Runtime.initStatus$atomicMonitor.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Runtime.exception$atomicMonitor;
            }
            x10.lang.Runtime.initStatus$atomicMonitor.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Runtime.initStatus$atomicMonitor.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Runtime.initStatus$atomicMonitor.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Runtime.initStatus$atomicMonitor.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Runtime.exception$atomicMonitor;
                }
            }
        }
        return x10.lang.Runtime.atomicMonitor;
    }
    
    public static x10.lang.Runtime.Pool get$pool() {
        if (((int) x10.lang.Runtime.initStatus$pool.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Runtime.pool;
        }
        if (((int) x10.lang.Runtime.initStatus$pool.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Runtime.exception$pool;
        }
        if (x10.lang.Runtime.initStatus$pool.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Runtime.pool = ((x10.lang.Runtime.Pool)(new x10.lang.Runtime.Pool((java.lang.System[]) null).x10$lang$Runtime$Pool$$init$S()));
            }}catch (java.lang.Throwable exc$21464) {
                x10.lang.Runtime.exception$pool = new x10.lang.ExceptionInInitializer(exc$21464);
                x10.lang.Runtime.initStatus$pool.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Runtime.exception$pool;
            }
            x10.lang.Runtime.initStatus$pool.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Runtime.initStatus$pool.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Runtime.initStatus$pool.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Runtime.initStatus$pool.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Runtime.exception$pool;
                }
            }
        }
        return x10.lang.Runtime.pool;
    }
    
    public static x10.lang.FinishState.FinishStates get$finishStates() {
        if (((int) x10.lang.Runtime.initStatus$finishStates.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Runtime.finishStates;
        }
        if (((int) x10.lang.Runtime.initStatus$finishStates.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Runtime.exception$finishStates;
        }
        if (x10.lang.Runtime.initStatus$finishStates.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Runtime.finishStates = ((x10.lang.FinishState.FinishStates)(new x10.lang.FinishState.FinishStates((java.lang.System[]) null).x10$lang$FinishState$FinishStates$$init$S()));
            }}catch (java.lang.Throwable exc$21465) {
                x10.lang.Runtime.exception$finishStates = new x10.lang.ExceptionInInitializer(exc$21465);
                x10.lang.Runtime.initStatus$finishStates.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Runtime.exception$finishStates;
            }
            x10.lang.Runtime.initStatus$finishStates.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Runtime.initStatus$finishStates.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Runtime.initStatus$finishStates.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Runtime.initStatus$finishStates.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Runtime.exception$finishStates;
                }
            }
        }
        return x10.lang.Runtime.finishStates;
    }
    
    public static x10.lang.Runtime.Workers get$workerInstance() {
        if (((int) x10.lang.Runtime.initStatus$workerInstance.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Runtime.workerInstance;
        }
        if (((int) x10.lang.Runtime.initStatus$workerInstance.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Runtime.exception$workerInstance;
        }
        if (x10.lang.Runtime.initStatus$workerInstance.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Runtime.workerInstance = x10.lang.Runtime.get$pool().getWorkers();
            }}catch (java.lang.Throwable exc$21466) {
                x10.lang.Runtime.exception$workerInstance = new x10.lang.ExceptionInInitializer(exc$21466);
                x10.lang.Runtime.initStatus$workerInstance.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Runtime.exception$workerInstance;
            }
            x10.lang.Runtime.initStatus$workerInstance.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Runtime.initStatus$workerInstance.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Runtime.initStatus$workerInstance.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Runtime.initStatus$workerInstance.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Runtime.exception$workerInstance;
                }
            }
        }
        return x10.lang.Runtime.workerInstance;
    }
    
    public static int get$IdleWorkers() {
        if (((int) x10.lang.Runtime.initStatus$IdleWorkers.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Runtime.IdleWorkers;
        }
        if (((int) x10.lang.Runtime.initStatus$IdleWorkers.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Runtime.exception$IdleWorkers;
        }
        if (x10.lang.Runtime.initStatus$IdleWorkers.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Runtime.IdleWorkers = x10.lang.Runtime.get$workerInstance().idleCount;
            }}catch (java.lang.Throwable exc$21467) {
                x10.lang.Runtime.exception$IdleWorkers = new x10.lang.ExceptionInInitializer(exc$21467);
                x10.lang.Runtime.initStatus$IdleWorkers.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Runtime.exception$IdleWorkers;
            }
            x10.lang.Runtime.initStatus$IdleWorkers.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Runtime.initStatus$IdleWorkers.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Runtime.initStatus$IdleWorkers.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Runtime.initStatus$IdleWorkers.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Runtime.exception$IdleWorkers;
                }
            }
        }
        return x10.lang.Runtime.IdleWorkers;
    }
    
    public static x10.lang.FinishState get$rootFinish() {
        if (((int) x10.lang.Runtime.initStatus$rootFinish.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Runtime.rootFinish;
        }
        if (((int) x10.lang.Runtime.initStatus$rootFinish.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Runtime.exception$rootFinish;
        }
        if (x10.lang.Runtime.initStatus$rootFinish.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Runtime.rootFinish = x10.lang.Runtime.makeDefaultFinish(((x10.util.concurrent.SimpleLatch)(x10.lang.Runtime.get$pool().latch)));
            }}catch (java.lang.Throwable exc$21468) {
                x10.lang.Runtime.exception$rootFinish = new x10.lang.ExceptionInInitializer(exc$21468);
                x10.lang.Runtime.initStatus$rootFinish.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Runtime.exception$rootFinish;
            }
            x10.lang.Runtime.initStatus$rootFinish.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Runtime.initStatus$rootFinish.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Runtime.initStatus$rootFinish.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Runtime.initStatus$rootFinish.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Runtime.exception$rootFinish;
                }
            }
        }
        return x10.lang.Runtime.rootFinish;
    }
    
    public static x10.lang.Cell get$processStartNanos_() {
        if (((int) x10.lang.Runtime.initStatus$processStartNanos_.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Runtime.processStartNanos_;
        }
        if (((int) x10.lang.Runtime.initStatus$processStartNanos_.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Runtime.exception$processStartNanos_;
        }
        if (x10.lang.Runtime.initStatus$processStartNanos_.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Runtime.processStartNanos_ = ((x10.lang.Cell)(new x10.lang.Cell<x10.core.Long>((java.lang.System[]) null, x10.rtt.Types.LONG).x10$lang$Cell$$init$S((x10.core.Long.$box(0L)), (x10.lang.Cell.__0x10$lang$Cell$$T) null)));
            }}catch (java.lang.Throwable exc$21469) {
                x10.lang.Runtime.exception$processStartNanos_ = new x10.lang.ExceptionInInitializer(exc$21469);
                x10.lang.Runtime.initStatus$processStartNanos_.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Runtime.exception$processStartNanos_;
            }
            x10.lang.Runtime.initStatus$processStartNanos_.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Runtime.initStatus$processStartNanos_.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Runtime.initStatus$processStartNanos_.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Runtime.initStatus$processStartNanos_.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Runtime.exception$processStartNanos_;
                }
            }
        }
        return x10.lang.Runtime.processStartNanos_;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$1 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$1> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$1> make($Closure$1.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure$1 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.job = $deserializer.readObject();
            $_obj.watcher = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Runtime.$Closure$1 $_obj = new x10.lang.Runtime.$Closure$1((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.job);
            $serializer.write(this.watcher);
            
        }
        
        // constructor just for allocation
        public $Closure$1(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 858 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            try {{
                {
                    
                    //#line 858 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    x10.lang.Runtime.ensureNotInAtomic();
                    
                    //#line 858 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.FinishState x10$__var0 = x10.lang.Runtime.startFinish();
                    
                    //#line 858 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    try {{
                        {
                            
                            //#line 858 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            ((x10.core.fun.VoidFun_0_0)this.job).$apply();
                        }
                    }}catch (java.lang.Throwable __lowerer__var__0__) {
                        
                        //#line 858 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                        
                        //#line 858 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        throw new java.lang.RuntimeException();
                    }finally {{
                         
                         //#line 858 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                         x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var0)));
                     }}
                    }
                }}catch (final x10.lang.MultipleExceptions t) {
                    
                    //#line 819 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.MultipleExceptions t$20214 = ((x10.lang.MultipleExceptions)(t));
                    
                    //#line 819 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    this.watcher.t = ((x10.lang.MultipleExceptions)(t$20214));
                }finally {{
                     
                     //#line 858 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                     this.watcher.release();
                 }}
            }
            
            public x10.core.fun.VoidFun_0_0 job;
            public x10.lang.Runtime.Watcher watcher;
            
            public $Closure$1(final x10.core.fun.VoidFun_0_0 job, final x10.lang.Runtime.Watcher watcher) {
                 {
                    this.job = ((x10.core.fun.VoidFun_0_0)(job));
                    this.watcher = ((x10.lang.Runtime.Watcher)(watcher));
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$2 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$2> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$2> make($Closure$2.class,
                                                            new x10.rtt.Type[] {
                                                                x10.core.fun.VoidFun_0_0.$RTT
                                                            });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure$2 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                $_obj.job = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                x10.lang.Runtime.$Closure$2 $_obj = new x10.lang.Runtime.$Closure$2((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.job);
                
            }
            
            // constructor just for allocation
            public $Closure$2(final java.lang.System[] $dummy) {
                
            }
            
            
        
            
            public void $apply() {
                
                //#line 898 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                try {{
                    {
                        
                        //#line 898 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        x10.lang.Runtime.ensureNotInAtomic();
                        
                        //#line 898 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.FinishState x10$__var1 = x10.lang.Runtime.startFinish();
                        
                        //#line 898 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        try {{
                            {
                                
                                //#line 898 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                ((x10.core.fun.VoidFun_0_0)this.job).$apply();
                            }
                        }}catch (java.lang.Throwable __lowerer__var__0__) {
                            
                            //#line 898 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                            
                            //#line 898 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            throw new java.lang.RuntimeException();
                        }finally {{
                             
                             //#line 898 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                             x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var1)));
                         }}
                        }
                    }}catch (final x10.lang.MultipleExceptions t) {
                        
                        //#line 898 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Runtime.Pool t$20988 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                        
                        //#line 898 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Runtime.Watcher this$20222 = ((x10.lang.Runtime.Watcher)(t$20988.watcher));
                        
                        //#line 819 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.MultipleExceptions t$20221 = ((x10.lang.MultipleExceptions)(t));
                        
                        //#line 819 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        this$20222.t = ((x10.lang.MultipleExceptions)(t$20221));
                    }finally {{
                         
                         //#line 898 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                         x10.lang.Runtime.terminateAll();
                     }}
                }
                
                public x10.core.fun.VoidFun_0_0 job;
                
                public $Closure$2(final x10.core.fun.VoidFun_0_0 job) {
                     {
                        this.job = ((x10.core.fun.VoidFun_0_0)(job));
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure_start_2 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure_start_2> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure_start_2> make($Closure_start_2.class,
                                                                      new x10.rtt.Type[] {
                                                                          x10.core.fun.VoidFun_0_0.$RTT
                                                                      });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure_start_2 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure_start_2 $_obj = new x10.lang.Runtime.$Closure_start_2((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                }
                
                // constructor just for allocation
                public $Closure_start_2(final java.lang.System[] $dummy) {
                    
                }
                
                
            
                
                public void $apply() {
                    
                    //#line 925 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    x10.lang.Runtime.terminate();
                }
                
                public $Closure_start_2() {
                     {
                        
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure_start_1 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure_start_1> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure_start_1> make($Closure_start_1.class,
                                                                      new x10.rtt.Type[] {
                                                                          x10.core.fun.VoidFun_0_0.$RTT
                                                                      });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure_start_1 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure_start_1 $_obj = new x10.lang.Runtime.$Closure_start_1((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                }
                
                // constructor just for allocation
                public $Closure_start_1(final java.lang.System[] $dummy) {
                    
                }
                
                
            
                
                public void $apply() {
                    
                    //#line 924 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final int h = x10.x10rt.X10RT.here();
                    
                    //#line 925 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.core.fun.VoidFun_0_0 cl = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure_start_2()));
                    {
                        
                        //#line 926 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final int t$20996 = ((h) - (((int)(31))));
                        
                        //#line 926 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        int j = java.lang.Math.max(((int)(1)),((int)(t$20996)));
                        
                        //#line 926 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 926 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            final int t$20997 = j;
                            
                            //#line 926 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            final boolean t$21002 = ((t$20997) < (((int)(h))));
                            
                            //#line 926 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            if (!(t$21002)) {
                                
                                //#line 926 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                break;
                            }
                            
                            //#line 927 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            final int t$21370 = j;
                            
                            //#line 927 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            final long t$21371 = ((long)(((int)(t$21370))));
                            
                            //#line 927 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            x10.lang.Runtime.x10rtSendMessage((long)(t$21371), ((x10.core.fun.VoidFun_0_0)(cl)), ((x10.lang.Runtime.Profile)(null)));
                            
                            //#line 926 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            final int t$21372 = j;
                            
                            //#line 926 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            final int t$21373 = ((t$21372) + (((int)(1))));
                            
                            //#line 926 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            j = t$21373;
                        }
                    }
                    
                    //#line 929 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    x10.lang.Runtime.terminate();
                }
                
                public $Closure_start_1() {
                     {
                        
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure_start_3 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure_start_3> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure_start_3> make($Closure_start_3.class,
                                                                      new x10.rtt.Type[] {
                                                                          x10.core.fun.VoidFun_0_0.$RTT
                                                                      });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure_start_3 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure_start_3 $_obj = new x10.lang.Runtime.$Closure_start_3((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                }
                
                // constructor just for allocation
                public $Closure_start_3(final java.lang.System[] $dummy) {
                    
                }
                
                
            
                
                public void $apply() {
                    
                    //#line 935 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    x10.lang.Runtime.terminate();
                }
                
                public $Closure_start_3() {
                     {
                        
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$3 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$3> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure$3> make($Closure$3.class,
                                                                new x10.rtt.Type[] {
                                                                    x10.core.fun.VoidFun_0_0.$RTT
                                                                });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure$3 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    $_obj.ser = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure$3 $_obj = new x10.lang.Runtime.$Closure$3((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.ser);
                    
                }
                
                // constructor just for allocation
                public $Closure$3(final java.lang.System[] $dummy) {
                    
                }
                
                
            
                
                public void $apply() {
                    
                    //#line 1016 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.io.Deserializer deser$21395 = ((x10.io.Deserializer)(new x10.io.Deserializer(((x10.io.Serializer)(this.ser)))));
                    
                    //#line 1017 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final java.lang.Object t$21396 = deser$21395.readAny();
                    
                    //#line 1017 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.core.fun.VoidFun_0_0 bodyCopy$21397 = x10.rtt.Types.<x10.core.fun.VoidFun_0_0> cast(t$21396,x10.core.fun.VoidFun_0_0.$RTT);
                    
                    //#line 1018 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ((x10.core.fun.VoidFun_0_0)bodyCopy$21397).$apply();
                }
                
                public x10.io.Serializer ser;
                
                public $Closure$3(final x10.io.Serializer ser) {
                     {
                        this.ser = ((x10.io.Serializer)(ser));
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure_runAsync extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure_runAsync> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure_runAsync> make($Closure_runAsync.class,
                                                                       new x10.rtt.Type[] {
                                                                           x10.core.fun.VoidFun_0_0.$RTT
                                                                       });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure_runAsync $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    $_obj.body = $deserializer.readObject();
                    $_obj.src = $deserializer.readObject();
                    $_obj.state = $deserializer.readObject();
                    $_obj.clockPhases = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure_runAsync $_obj = new x10.lang.Runtime.$Closure_runAsync((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.body);
                    $serializer.write(this.src);
                    $serializer.write(this.state);
                    $serializer.write(this.clockPhases);
                    
                }
                
                // constructor just for allocation
                public $Closure_runAsync(final java.lang.System[] $dummy) {
                    
                }
                
                
            
                
                public void $apply() {
                    
                    //#line 1023 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Activity alloc$2794 = ((x10.lang.Activity)(new x10.lang.Activity((java.lang.System[]) null)));
                    {
                        
                        //#line 1023 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        alloc$2794.x10$lang$Activity$$init$S(this.body, ((x10.lang.Place)(this.src)), this.state, ((x10.lang.Activity.ClockPhases)(this.clockPhases)));
                    }
                    
                    //#line 1023 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    x10.lang.Runtime.execute(((x10.lang.Activity)(alloc$2794)));
                }
                
                public x10.core.fun.VoidFun_0_0 body;
                public x10.lang.Place src;
                public x10.lang.FinishState state;
                public x10.lang.Activity.ClockPhases clockPhases;
                
                public $Closure_runAsync(final x10.core.fun.VoidFun_0_0 body, final x10.lang.Place src, final x10.lang.FinishState state, final x10.lang.Activity.ClockPhases clockPhases) {
                     {
                        this.body = ((x10.core.fun.VoidFun_0_0)(body));
                        this.src = ((x10.lang.Place)(src));
                        this.state = ((x10.lang.FinishState)(state));
                        this.clockPhases = ((x10.lang.Activity.ClockPhases)(clockPhases));
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$4 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$4> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure$4> make($Closure$4.class,
                                                                new x10.rtt.Type[] {
                                                                    x10.core.fun.VoidFun_0_0.$RTT
                                                                });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure$4 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    $_obj.state = $deserializer.readObject();
                    $_obj.place = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure$4 $_obj = new x10.lang.Runtime.$Closure$4((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.state);
                    $serializer.write(this.place);
                    
                }
                
                // constructor just for allocation
                public $Closure$4(final java.lang.System[] $dummy) {
                    
                }
                
                
            
                
                public void $apply() {
                    
                    //#line 1024 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    this.state.notifySubActivitySpawn(((x10.lang.Place)(this.place)));
                }
                
                public x10.lang.FinishState state;
                public x10.lang.Place place;
                
                public $Closure$4(final x10.lang.FinishState state, final x10.lang.Place place) {
                     {
                        this.state = ((x10.lang.FinishState)(state));
                        this.place = ((x10.lang.Place)(place));
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$5 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$5> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure$5> make($Closure$5.class,
                                                                new x10.rtt.Type[] {
                                                                    x10.core.fun.VoidFun_0_0.$RTT
                                                                });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure$5 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    $_obj.ser = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure$5 $_obj = new x10.lang.Runtime.$Closure$5((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.ser);
                    
                }
                
                // constructor just for allocation
                public $Closure$5(final java.lang.System[] $dummy) {
                    
                }
                
                
            
                
                public void $apply() {
                    
                    //#line 1051 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.io.Deserializer deser$21403 = ((x10.io.Deserializer)(new x10.io.Deserializer(((x10.io.Serializer)(this.ser)))));
                    
                    //#line 1052 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final java.lang.Object t$21404 = deser$21403.readAny();
                    
                    //#line 1052 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.core.fun.VoidFun_0_0 bodyCopy$21405 = x10.rtt.Types.<x10.core.fun.VoidFun_0_0> cast(t$21404,x10.core.fun.VoidFun_0_0.$RTT);
                    
                    //#line 1053 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ((x10.core.fun.VoidFun_0_0)bodyCopy$21405).$apply();
                }
                
                public x10.io.Serializer ser;
                
                public $Closure$5(final x10.io.Serializer ser) {
                     {
                        this.ser = ((x10.io.Serializer)(ser));
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$6 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$6> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure$6> make($Closure$6.class,
                                                                new x10.rtt.Type[] {
                                                                    x10.core.fun.VoidFun_0_0.$RTT
                                                                });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure$6 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    $_obj.state = $deserializer.readObject();
                    $_obj.place = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure$6 $_obj = new x10.lang.Runtime.$Closure$6((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.state);
                    $serializer.write(this.place);
                    
                }
                
                // constructor just for allocation
                public $Closure$6(final java.lang.System[] $dummy) {
                    
                }
                
                
            
                
                public void $apply() {
                    
                    //#line 1057 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    this.state.notifySubActivitySpawn(((x10.lang.Place)(this.place)));
                }
                
                public x10.lang.FinishState state;
                public x10.lang.Place place;
                
                public $Closure$6(final x10.lang.FinishState state, final x10.lang.Place place) {
                     {
                        this.state = ((x10.lang.FinishState)(state));
                        this.place = ((x10.lang.Place)(place));
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$7 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$7> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure$7> make($Closure$7.class,
                                                                new x10.rtt.Type[] {
                                                                    x10.core.fun.VoidFun_0_0.$RTT
                                                                });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure$7 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    $_obj.ser = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure$7 $_obj = new x10.lang.Runtime.$Closure$7((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.ser);
                    
                }
                
                // constructor just for allocation
                public $Closure$7(final java.lang.System[] $dummy) {
                    
                }
                
                
            
                
                public void $apply() {
                    
                    //#line 1112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.io.Deserializer deser$21418 = ((x10.io.Deserializer)(new x10.io.Deserializer(((x10.io.Serializer)(this.ser)))));
                    
                    //#line 1113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final java.lang.Object t$21419 = deser$21418.readAny();
                    
                    //#line 1113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.core.fun.VoidFun_0_0 bodyCopy$21420 = x10.rtt.Types.<x10.core.fun.VoidFun_0_0> cast(t$21419,x10.core.fun.VoidFun_0_0.$RTT);
                    
                    //#line 1114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ((x10.core.fun.VoidFun_0_0)bodyCopy$21420).$apply();
                }
                
                public x10.io.Serializer ser;
                
                public $Closure$7(final x10.io.Serializer ser) {
                     {
                        this.ser = ((x10.io.Serializer)(ser));
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure_runUncountedAsync extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure_runUncountedAsync> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure_runUncountedAsync> make($Closure_runUncountedAsync.class,
                                                                                new x10.rtt.Type[] {
                                                                                    x10.core.fun.VoidFun_0_0.$RTT
                                                                                });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure_runUncountedAsync $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    $_obj.body = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure_runUncountedAsync $_obj = new x10.lang.Runtime.$Closure_runUncountedAsync((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.body);
                    
                }
                
                // constructor just for allocation
                public $Closure_runUncountedAsync(final java.lang.System[] $dummy) {
                    
                }
                
                
            
                
                public void $apply() {
                    
                    //#line 1120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Activity alloc$2799 = ((x10.lang.Activity)(new x10.lang.Activity((java.lang.System[]) null)));
                    {
                        
                        //#line 1120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Place t$21078 = ((x10.lang.Place)(x10.lang.Place.get$FIRST_PLACE()));
                        
                        //#line 1120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.FinishState.UncountedFinish t$21079 = ((x10.lang.FinishState.UncountedFinish)(x10.lang.FinishState.get$UNCOUNTED_FINISH()));
                        
                        //#line 1120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        alloc$2799.x10$lang$Activity$$init$S(this.body, ((x10.lang.Place)(t$21078)), ((x10.lang.FinishState)(t$21079)));
                    }
                    
                    //#line 1120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    x10.lang.Runtime.execute(((x10.lang.Activity)(alloc$2799)));
                }
                
                public x10.core.fun.VoidFun_0_0 body;
                
                public $Closure_runUncountedAsync(final x10.core.fun.VoidFun_0_0 body) {
                     {
                        this.body = ((x10.core.fun.VoidFun_0_0)(body));
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure_runAt_1 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure_runAt_1> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure_runAt_1> make($Closure_runAt_1.class,
                                                                      new x10.rtt.Type[] {
                                                                          x10.core.fun.VoidFun_0_0.$RTT
                                                                      });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure_runAt_1 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    $_obj.box = $deserializer.readObject();
                    $_obj.clockPhases = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure_runAt_1 $_obj = new x10.lang.Runtime.$Closure_runAt_1((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.box);
                    $serializer.write(this.clockPhases);
                    
                }
                
                // constructor just for allocation
                public $Closure_runAt_1(final java.lang.System[] $dummy) {
                    
                }
                
                // synthetic type for parameter mangling
                public static final class __0$1x10$lang$Runtime$RemoteControl$2 {}
                
            
                
                public void $apply() {
                    
                    //#line 1211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.core.GlobalRef t$21096 = ((x10.core.GlobalRef)(((x10.core.GlobalRef)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.lang.Runtime.RemoteControl.$RTT),this.box))));
                    
                    //#line 1211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Runtime.RemoteControl me2 = (((x10.core.GlobalRef<x10.lang.Runtime.RemoteControl>)(t$21096))).$apply$G();
                    
                    //#line 1212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    me2.clockPhases = ((x10.lang.Activity.ClockPhases)(this.clockPhases));
                    
                    //#line 1213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    me2.release();
                }
                
                public x10.core.GlobalRef<x10.lang.Runtime.RemoteControl> box;
                public x10.lang.Activity.ClockPhases clockPhases;
                
                public $Closure_runAt_1(final x10.core.GlobalRef<x10.lang.Runtime.RemoteControl> box, final x10.lang.Activity.ClockPhases clockPhases, __0$1x10$lang$Runtime$RemoteControl$2 $dummy) {
                     {
                        this.box = ((x10.core.GlobalRef)(box));
                        this.clockPhases = ((x10.lang.Activity.ClockPhases)(clockPhases));
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure_runAt_2 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure_runAt_2> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure_runAt_2> make($Closure_runAt_2.class,
                                                                      new x10.rtt.Type[] {
                                                                          x10.core.fun.VoidFun_0_0.$RTT
                                                                      });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure_runAt_2 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    $_obj.box = $deserializer.readObject();
                    $_obj.e = $deserializer.readObject();
                    $_obj.clockPhases = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure_runAt_2 $_obj = new x10.lang.Runtime.$Closure_runAt_2((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.box);
                    $serializer.write(this.e);
                    $serializer.write(this.clockPhases);
                    
                }
                
                // constructor just for allocation
                public $Closure_runAt_2(final java.lang.System[] $dummy) {
                    
                }
                
                // synthetic type for parameter mangling
                public static final class __0$1x10$lang$Runtime$RemoteControl$2 {}
                
            
                
                public void $apply() {
                    
                    //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.core.GlobalRef t$21099 = ((x10.core.GlobalRef)(((x10.core.GlobalRef)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.lang.Runtime.RemoteControl.$RTT),this.box))));
                    
                    //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Runtime.RemoteControl me2 = (((x10.core.GlobalRef<x10.lang.Runtime.RemoteControl>)(t$21099))).$apply$G();
                    
                    //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    me2.e = ((java.lang.Throwable)(this.e));
                    
                    //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    me2.clockPhases = ((x10.lang.Activity.ClockPhases)(this.clockPhases));
                    
                    //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    me2.release();
                }
                
                public x10.core.GlobalRef<x10.lang.Runtime.RemoteControl> box;
                public java.lang.Throwable e;
                public x10.lang.Activity.ClockPhases clockPhases;
                
                public $Closure_runAt_2(final x10.core.GlobalRef<x10.lang.Runtime.RemoteControl> box, final java.lang.Throwable e, final x10.lang.Activity.ClockPhases clockPhases, __0$1x10$lang$Runtime$RemoteControl$2 $dummy) {
                     {
                        this.box = ((x10.core.GlobalRef)(box));
                        this.e = ((java.lang.Throwable)(e));
                        this.clockPhases = ((x10.lang.Activity.ClockPhases)(clockPhases));
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$8 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$8> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure$8> make($Closure$8.class,
                                                                new x10.rtt.Type[] {
                                                                    x10.core.fun.VoidFun_0_0.$RTT
                                                                });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure$8 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    $_obj.clockPhases = $deserializer.readObject();
                    $_obj.bytes = $deserializer.readObject();
                    $_obj.box = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure$8 $_obj = new x10.lang.Runtime.$Closure$8((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.clockPhases);
                    $serializer.write(this.bytes);
                    $serializer.write(this.box);
                    
                }
                
                // constructor just for allocation
                public $Closure$8(final java.lang.System[] $dummy) {
                    
                }
                
                // synthetic type for parameter mangling
                public static final class __1$1x10$lang$Byte$2__2$1x10$lang$Runtime$RemoteControl$2 {}
                
            
                
                public void $apply() {
                    
                    //#line 1202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    try {{
                        
                        //#line 1203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Activity t$21094 = x10.lang.Runtime.activity();
                        
                        //#line 1203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        t$21094.clockPhases = ((x10.lang.Activity.ClockPhases)(this.clockPhases));
                        
                        //#line 1204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        try {{
                            
                            //#line 1205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            try {{
                                
                                //#line 1207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final x10.io.Deserializer deser = ((x10.io.Deserializer)(new x10.io.Deserializer(this.bytes, (x10.io.Deserializer.__0$1x10$lang$Byte$2) null)));
                                
                                //#line 1208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final java.lang.Object t$21095 = deser.readAny();
                                
                                //#line 1208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final x10.core.fun.VoidFun_0_0 bodyPrime = x10.rtt.Types.<x10.core.fun.VoidFun_0_0> cast(t$21095,x10.core.fun.VoidFun_0_0.$RTT);
                                
                                //#line 1209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                ((x10.core.fun.VoidFun_0_0)bodyPrime).$apply();
                                
                                //#line 1210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final x10.core.fun.VoidFun_0_0 closure = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure_runAt_1(((x10.core.GlobalRef<x10.lang.Runtime.RemoteControl>)(this.box)), ((x10.lang.Activity.ClockPhases)(this.clockPhases)), (x10.lang.Runtime.$Closure_runAt_1.__0$1x10$lang$Runtime$RemoteControl$2) null)));
                                
                                //#line 1215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final x10.lang.Place t$21097 = ((x10.lang.Place)((this.box).home));
                                
                                //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final long id$20330 = t$21097.id;
                                
                                //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final x10.core.fun.VoidFun_0_0 msgBody$20331 = ((x10.core.fun.VoidFun_0_0)(closure));
                                
                                //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final x10.lang.Runtime.Profile prof$20332 = ((x10.lang.Runtime.Profile)(((x10.lang.Runtime.Profile)
                                                                                                          (null))));
                                
                                //#line 77 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(id$20330))), msgBody$20331, ((x10.lang.Runtime.Profile)(null)), null);
                                
                                //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
                                final x10.core.fun.VoidFun_0_0 o$20335 = ((x10.core.fun.VoidFun_0_0)(closure));
                            }}catch (final x10.lang.Runtime.AtCheckedWrapper e) {
                                
                                //#line 1218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final java.lang.Throwable t$21098 = e.getCause();
                                
                                //#line 1218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                throw t$21098;
                            }
                        }}catch (final java.lang.Throwable e) {
                            
                            //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            final x10.core.fun.VoidFun_0_0 closure = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure_runAt_2(((x10.core.GlobalRef<x10.lang.Runtime.RemoteControl>)(this.box)), e, ((x10.lang.Activity.ClockPhases)(this.clockPhases)), (x10.lang.Runtime.$Closure_runAt_2.__0$1x10$lang$Runtime$RemoteControl$2) null)));
                            
                            //#line 1227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            final x10.lang.Place t$21100 = ((x10.lang.Place)((this.box).home));
                            
                            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            final long id$20338 = t$21100.id;
                            
                            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            final x10.core.fun.VoidFun_0_0 msgBody$20339 = ((x10.core.fun.VoidFun_0_0)(closure));
                            
                            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            final x10.lang.Runtime.Profile prof$20340 = ((x10.lang.Runtime.Profile)(((x10.lang.Runtime.Profile)
                                                                                                      (null))));
                            
                            //#line 77 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(id$20338))), msgBody$20339, ((x10.lang.Runtime.Profile)(null)), null);
                            
                            //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
                            final x10.core.fun.VoidFun_0_0 o$20343 = ((x10.core.fun.VoidFun_0_0)(closure));
                        }
                        
                        //#line 1230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Activity t$21101 = x10.lang.Runtime.activity();
                        
                        //#line 1230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        t$21101.clockPhases = null;
                    }}catch (java.lang.Error __lowerer__var__0__) {
                        
                        //#line 1202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        throw __lowerer__var__0__;
                    }catch (java.lang.Throwable __lowerer__var__1__) {
                        
                        //#line 1202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                    }
                }
                
                public x10.lang.Activity.ClockPhases clockPhases;
                public x10.core.Rail<x10.core.Byte> bytes;
                public x10.core.GlobalRef<x10.lang.Runtime.RemoteControl> box;
                
                public $Closure$8(final x10.lang.Activity.ClockPhases clockPhases, final x10.core.Rail<x10.core.Byte> bytes, final x10.core.GlobalRef<x10.lang.Runtime.RemoteControl> box, __1$1x10$lang$Byte$2__2$1x10$lang$Runtime$RemoteControl$2 $dummy) {
                     {
                        this.clockPhases = ((x10.lang.Activity.ClockPhases)(clockPhases));
                        this.bytes = ((x10.core.Rail)(bytes));
                        this.box = ((x10.core.GlobalRef)(box));
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure_runAtSimple_2 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure_runAtSimple_2> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure_runAtSimple_2> make($Closure_runAtSimple_2.class,
                                                                            new x10.rtt.Type[] {
                                                                                x10.core.fun.VoidFun_0_0.$RTT
                                                                            });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure_runAtSimple_2 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    $_obj.box = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure_runAtSimple_2 $_obj = new x10.lang.Runtime.$Closure_runAtSimple_2((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.box);
                    
                }
                
                // constructor just for allocation
                public $Closure_runAtSimple_2(final java.lang.System[] $dummy) {
                    
                }
                
                // synthetic type for parameter mangling
                public static final class __0$1x10$lang$Runtime$RemoteControl$2 {}
                
            
                
                public void $apply() {
                    
                    //#line 1265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.core.GlobalRef t$21114 = ((x10.core.GlobalRef)(((x10.core.GlobalRef)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.lang.Runtime.RemoteControl.$RTT),this.box))));
                    
                    //#line 1265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Runtime.RemoteControl me2 = (((x10.core.GlobalRef<x10.lang.Runtime.RemoteControl>)(t$21114))).$apply$G();
                    
                    //#line 1266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    me2.release();
                }
                
                public x10.core.GlobalRef<x10.lang.Runtime.RemoteControl> box;
                
                public $Closure_runAtSimple_2(final x10.core.GlobalRef<x10.lang.Runtime.RemoteControl> box, __0$1x10$lang$Runtime$RemoteControl$2 $dummy) {
                     {
                        this.box = ((x10.core.GlobalRef)(box));
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure_runAtSimple_1 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure_runAtSimple_1> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure_runAtSimple_1> make($Closure_runAtSimple_1.class,
                                                                            new x10.rtt.Type[] {
                                                                                x10.core.fun.VoidFun_0_0.$RTT
                                                                            });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure_runAtSimple_1 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    $_obj.body = $deserializer.readObject();
                    $_obj.box = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure_runAtSimple_1 $_obj = new x10.lang.Runtime.$Closure_runAtSimple_1((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.body);
                    $serializer.write(this.box);
                    
                }
                
                // constructor just for allocation
                public $Closure_runAtSimple_1(final java.lang.System[] $dummy) {
                    
                }
                
                // synthetic type for parameter mangling
                public static final class __1$1x10$lang$Runtime$RemoteControl$2 {}
                
            
                
                public void $apply() {
                    
                    //#line 1263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ((x10.core.fun.VoidFun_0_0)this.body).$apply();
                    
                    //#line 1264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.core.fun.VoidFun_0_0 closure = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure_runAtSimple_2(((x10.core.GlobalRef<x10.lang.Runtime.RemoteControl>)(this.box)), (x10.lang.Runtime.$Closure_runAtSimple_2.__0$1x10$lang$Runtime$RemoteControl$2) null)));
                    
                    //#line 1268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Place t$21115 = ((x10.lang.Place)((this.box).home));
                    
                    //#line 1268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final long t$21116 = t$21115.id;
                    
                    //#line 1268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    x10.lang.Runtime.x10rtSendMessage((long)(t$21116), ((x10.core.fun.VoidFun_0_0)(closure)), ((x10.lang.Runtime.Profile)(null)));
                    
                    //#line 1269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    x10.lang.Unsafe.<x10.core.fun.VoidFun_0_0> dealloc__0x10$lang$Unsafe$$T(x10.core.fun.VoidFun_0_0.$RTT, ((x10.core.fun.VoidFun_0_0)(closure)));
                }
                
                public x10.core.fun.VoidFun_0_0 body;
                public x10.core.GlobalRef<x10.lang.Runtime.RemoteControl> box;
                
                public $Closure_runAtSimple_1(final x10.core.fun.VoidFun_0_0 body, final x10.core.GlobalRef<x10.lang.Runtime.RemoteControl> box, __1$1x10$lang$Runtime$RemoteControl$2 $dummy) {
                     {
                        this.body = ((x10.core.fun.VoidFun_0_0)(body));
                        this.box = ((x10.core.GlobalRef)(box));
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure_runAtSimple_3 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure_runAtSimple_3> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure_runAtSimple_3> make($Closure_runAtSimple_3.class,
                                                                            new x10.rtt.Type[] {
                                                                                x10.core.fun.VoidFun_0_0.$RTT
                                                                            });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure_runAtSimple_3 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    $_obj.body = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure_runAtSimple_3 $_obj = new x10.lang.Runtime.$Closure_runAtSimple_3((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.body);
                    
                }
                
                // constructor just for allocation
                public $Closure_runAtSimple_3(final java.lang.System[] $dummy) {
                    
                }
                
                
            
                
                public void $apply() {
                    
                    //#line 1275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ((x10.core.fun.VoidFun_0_0)this.body).$apply();
                }
                
                public x10.core.fun.VoidFun_0_0 body;
                
                public $Closure_runAtSimple_3(final x10.core.fun.VoidFun_0_0 body) {
                     {
                        this.body = ((x10.core.fun.VoidFun_0_0)(body));
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure_evalAt_1 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure_evalAt_1> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure_evalAt_1> make($Closure_evalAt_1.class,
                                                                       new x10.rtt.Type[] {
                                                                           x10.core.fun.VoidFun_0_0.$RTT
                                                                       });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure_evalAt_1 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    $_obj.box = $deserializer.readObject();
                    $_obj.clockPhases = $deserializer.readObject();
                    $_obj.bytes2 = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure_evalAt_1 $_obj = new x10.lang.Runtime.$Closure_evalAt_1((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.box);
                    $serializer.write(this.clockPhases);
                    $serializer.write(this.bytes2);
                    
                }
                
                // constructor just for allocation
                public $Closure_evalAt_1(final java.lang.System[] $dummy) {
                    
                }
                
                // synthetic type for parameter mangling
                public static final class __0$1x10$lang$Runtime$Remote$1x10$lang$Any$2$2__2$1x10$lang$Byte$2 {}
                
            
                
                public void $apply() {
                    
                    //#line 1343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.core.GlobalRef t$21128 = ((x10.core.GlobalRef)(((x10.core.GlobalRef)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.rtt.ParameterizedType.make(x10.lang.Runtime.Remote.$RTT, x10.rtt.Types.ANY)),this.box))));
                    
                    //#line 1343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Runtime.Remote me2 = (((x10.core.GlobalRef<x10.lang.Runtime.Remote<java.lang.Object>>)(t$21128))).$apply$G();
                    
                    //#line 1345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    me2.clockPhases = ((x10.lang.Activity.ClockPhases)(this.clockPhases));
                    
                    //#line 1346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.io.Deserializer deser2 = ((x10.io.Deserializer)(new x10.io.Deserializer(this.bytes2, (x10.io.Deserializer.__0$1x10$lang$Byte$2) null)));
                    
                    //#line 1347 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    try {{
                        
                        //#line 1348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final java.lang.Object resultPrime = deser2.readAny();
                        
                        //#line 1349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.util.Box alloc$2802 = ((x10.util.Box)(new x10.util.Box<java.lang.Object>((java.lang.System[]) null, x10.rtt.Types.ANY)));
                        
                        //#line 1349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final java.lang.Object t$21426 = ((java.lang.Object)
                                                           resultPrime);
                        
                        //#line 1349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        alloc$2802.x10$util$Box$$init$S(t$21426, (x10.util.Box.__0x10$util$Box$$T) null);
                        
                        //#line 1349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        ((x10.lang.Runtime.Remote<java.lang.Object>)me2).t = ((x10.util.Box)(alloc$2802));
                    }}catch (final java.lang.Throwable e) {
                        
                        //#line 1351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        me2.e = ((java.lang.Throwable)(e));
                    }
                    
                    //#line 1353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    me2.release();
                }
                
                public x10.core.GlobalRef<x10.lang.Runtime.Remote<java.lang.Object>> box;
                public x10.lang.Activity.ClockPhases clockPhases;
                public x10.core.Rail<x10.core.Byte> bytes2;
                
                public $Closure_evalAt_1(final x10.core.GlobalRef<x10.lang.Runtime.Remote<java.lang.Object>> box, final x10.lang.Activity.ClockPhases clockPhases, final x10.core.Rail<x10.core.Byte> bytes2, __0$1x10$lang$Runtime$Remote$1x10$lang$Any$2$2__2$1x10$lang$Byte$2 $dummy) {
                     {
                        this.box = ((x10.core.GlobalRef)(box));
                        this.clockPhases = ((x10.lang.Activity.ClockPhases)(clockPhases));
                        this.bytes2 = ((x10.core.Rail)(bytes2));
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure_evalAt_2 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure_evalAt_2> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure_evalAt_2> make($Closure_evalAt_2.class,
                                                                       new x10.rtt.Type[] {
                                                                           x10.core.fun.VoidFun_0_0.$RTT
                                                                       });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure_evalAt_2 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    $_obj.box = $deserializer.readObject();
                    $_obj.e = $deserializer.readObject();
                    $_obj.clockPhases = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure_evalAt_2 $_obj = new x10.lang.Runtime.$Closure_evalAt_2((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.box);
                    $serializer.write(this.e);
                    $serializer.write(this.clockPhases);
                    
                }
                
                // constructor just for allocation
                public $Closure_evalAt_2(final java.lang.System[] $dummy) {
                    
                }
                
                // synthetic type for parameter mangling
                public static final class __0$1x10$lang$Runtime$Remote$1x10$lang$Any$2$2 {}
                
            
                
                public void $apply() {
                    
                    //#line 1362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.core.GlobalRef t$21132 = ((x10.core.GlobalRef)(((x10.core.GlobalRef)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.rtt.ParameterizedType.make(x10.lang.Runtime.Remote.$RTT, x10.rtt.Types.ANY)),this.box))));
                    
                    //#line 1362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Runtime.Remote me2 = (((x10.core.GlobalRef<x10.lang.Runtime.Remote<java.lang.Object>>)(t$21132))).$apply$G();
                    
                    //#line 1363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    me2.e = ((java.lang.Throwable)(this.e));
                    
                    //#line 1364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    me2.clockPhases = ((x10.lang.Activity.ClockPhases)(this.clockPhases));
                    
                    //#line 1365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    me2.release();
                }
                
                public x10.core.GlobalRef<x10.lang.Runtime.Remote<java.lang.Object>> box;
                public java.lang.Throwable e;
                public x10.lang.Activity.ClockPhases clockPhases;
                
                public $Closure_evalAt_2(final x10.core.GlobalRef<x10.lang.Runtime.Remote<java.lang.Object>> box, final java.lang.Throwable e, final x10.lang.Activity.ClockPhases clockPhases, __0$1x10$lang$Runtime$Remote$1x10$lang$Any$2$2 $dummy) {
                     {
                        this.box = ((x10.core.GlobalRef)(box));
                        this.e = ((java.lang.Throwable)(e));
                        this.clockPhases = ((x10.lang.Activity.ClockPhases)(clockPhases));
                    }
                }
                
            }
            
            @x10.runtime.impl.java.X10Generated
            final public static class $Closure$9 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
            {
                public static final x10.rtt.RuntimeType<$Closure$9> $RTT = 
                    x10.rtt.StaticVoidFunType.<$Closure$9> make($Closure$9.class,
                                                                new x10.rtt.Type[] {
                                                                    x10.core.fun.VoidFun_0_0.$RTT
                                                                });
                
                public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
                
                public x10.rtt.Type<?> $getParam(int i) { return null; }
                
                public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Runtime.$Closure$9 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    $_obj.clockPhases = $deserializer.readObject();
                    $_obj.bytes = $deserializer.readObject();
                    $_obj.box = $deserializer.readObject();
                    return $_obj;
                }
                
                public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                    x10.lang.Runtime.$Closure$9 $_obj = new x10.lang.Runtime.$Closure$9((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                }
                
                public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                    $serializer.write(this.clockPhases);
                    $serializer.write(this.bytes);
                    $serializer.write(this.box);
                    
                }
                
                // constructor just for allocation
                public $Closure$9(final java.lang.System[] $dummy) {
                    
                }
                
                // synthetic type for parameter mangling
                public static final class __1$1x10$lang$Byte$2__2$1x10$lang$Runtime$Remote$1x10$lang$Any$2$2 {}
                
            
                
                public void $apply() {
                    
                    //#line 1331 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    try {{
                        
                        //#line 1332 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Activity t$21126 = x10.lang.Runtime.activity();
                        
                        //#line 1332 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        t$21126.clockPhases = ((x10.lang.Activity.ClockPhases)(this.clockPhases));
                        
                        //#line 1333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        try {{
                            
                            //#line 1334 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            try {{
                                
                                //#line 1336 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final x10.io.Deserializer deser = ((x10.io.Deserializer)(new x10.io.Deserializer(this.bytes, (x10.io.Deserializer.__0$1x10$lang$Byte$2) null)));
                                
                                //#line 1337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final java.lang.Object t$21127 = deser.readAny();
                                
                                //#line 1337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final x10.core.fun.Fun_0_0 evalPrime = x10.rtt.Types.<x10.core.fun.Fun_0_0<java.lang.Object>> cast(t$21127,x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT,x10.rtt.Types.ANY));
                                
                                //#line 1338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final java.lang.Object result = ((x10.core.fun.Fun_0_0<java.lang.Object>)evalPrime).$apply$G();
                                
                                //#line 1339 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final x10.io.Serializer ser2 = ((x10.io.Serializer)(new x10.io.Serializer()));
                                
                                //#line 1340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                ser2.writeAny(((java.lang.Object)(result)));
                                
                                //#line 1341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final x10.core.Rail bytes2 = ser2.toRail();
                                
                                //#line 1342 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final x10.core.fun.VoidFun_0_0 closure = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure_evalAt_1(((x10.core.GlobalRef<x10.lang.Runtime.Remote<java.lang.Object>>)(this.box)), ((x10.lang.Activity.ClockPhases)(this.clockPhases)), bytes2, (x10.lang.Runtime.$Closure_evalAt_1.__0$1x10$lang$Runtime$Remote$1x10$lang$Any$2$2__2$1x10$lang$Byte$2) null)));
                                
                                //#line 1355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final x10.lang.Place t$21130 = ((x10.lang.Place)((this.box).home));
                                
                                //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final long id$20374 = t$21130.id;
                                
                                //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final x10.core.fun.VoidFun_0_0 msgBody$20375 = ((x10.core.fun.VoidFun_0_0)(closure));
                                
                                //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final x10.lang.Runtime.Profile prof$20376 = ((x10.lang.Runtime.Profile)(((x10.lang.Runtime.Profile)
                                                                                                          (null))));
                                
                                //#line 77 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(id$20374))), msgBody$20375, ((x10.lang.Runtime.Profile)(null)), null);
                                
                                //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
                                final x10.core.fun.VoidFun_0_0 o$20379 = ((x10.core.fun.VoidFun_0_0)(closure));
                            }}catch (final x10.lang.Runtime.AtCheckedWrapper t) {
                                
                                //#line 1358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                final java.lang.Throwable t$21131 = t.getCause();
                                
                                //#line 1358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                throw t$21131;
                            }
                        }}catch (final java.lang.Throwable e) {
                            
                            //#line 1361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            final x10.core.fun.VoidFun_0_0 closure = ((x10.core.fun.VoidFun_0_0)(new x10.lang.Runtime.$Closure_evalAt_2(((x10.core.GlobalRef<x10.lang.Runtime.Remote<java.lang.Object>>)(this.box)), e, ((x10.lang.Activity.ClockPhases)(this.clockPhases)), (x10.lang.Runtime.$Closure_evalAt_2.__0$1x10$lang$Runtime$Remote$1x10$lang$Any$2$2) null)));
                            
                            //#line 1367 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            final x10.lang.Place t$21133 = ((x10.lang.Place)((this.box).home));
                            
                            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            final long id$20382 = t$21133.id;
                            
                            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            final x10.core.fun.VoidFun_0_0 msgBody$20383 = ((x10.core.fun.VoidFun_0_0)(closure));
                            
                            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            final x10.lang.Runtime.Profile prof$20384 = ((x10.lang.Runtime.Profile)(((x10.lang.Runtime.Profile)
                                                                                                      (null))));
                            
                            //#line 77 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(id$20382))), msgBody$20383, ((x10.lang.Runtime.Profile)(null)), null);
                            
                            //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
                            final x10.core.fun.VoidFun_0_0 o$20387 = ((x10.core.fun.VoidFun_0_0)(closure));
                        }
                        
                        //#line 1370 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        final x10.lang.Activity t$21134 = x10.lang.Runtime.activity();
                        
                        //#line 1370 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        t$21134.clockPhases = null;
                    }}catch (java.lang.Error __lowerer__var__0__) {
                        
                        //#line 1331 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        throw __lowerer__var__0__;
                    }catch (java.lang.Throwable __lowerer__var__1__) {
                        
                        //#line 1331 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                    }
                }
                
                public x10.lang.Activity.ClockPhases clockPhases;
                public x10.core.Rail<x10.core.Byte> bytes;
                public x10.core.GlobalRef<x10.lang.Runtime.Remote<java.lang.Object>> box;
                
                public $Closure$9(final x10.lang.Activity.ClockPhases clockPhases, final x10.core.Rail<x10.core.Byte> bytes, final x10.core.GlobalRef<x10.lang.Runtime.Remote<java.lang.Object>> box, __1$1x10$lang$Byte$2__2$1x10$lang$Runtime$Remote$1x10$lang$Any$2$2 $dummy) {
                     {
                        this.clockPhases = ((x10.lang.Activity.ClockPhases)(clockPhases));
                        this.bytes = ((x10.core.Rail)(bytes));
                        this.box = ((x10.core.GlobalRef)(box));
                    }
                }
                
            }
            
        }
        
        