package x10.glb;

@x10.runtime.impl.java.X10Generated
final public class Logger extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Logger> $RTT = 
        x10.rtt.NamedType.<Logger> make("x10.glb.Logger",
                                        Logger.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Logger $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.nodesCount = $deserializer.readLong();
        $_obj.nodesGiven = $deserializer.readLong();
        $_obj.lifelineNodesReceived = $deserializer.readLong();
        $_obj.stealsAttempted = $deserializer.readLong();
        $_obj.stealsPerpetrated = $deserializer.readLong();
        $_obj.stealsReceived = $deserializer.readLong();
        $_obj.stealsSuffered = $deserializer.readLong();
        $_obj.nodesReceived = $deserializer.readLong();
        $_obj.lifelineStealsAttempted = $deserializer.readLong();
        $_obj.lifelineStealsPerpetrated = $deserializer.readLong();
        $_obj.lifelineStealsReceived = $deserializer.readLong();
        $_obj.lifelineStealsSuffered = $deserializer.readLong();
        $_obj.lastStartStopLiveTimeStamp = $deserializer.readLong();
        $_obj.timeAlive = $deserializer.readLong();
        $_obj.timeDead = $deserializer.readLong();
        $_obj.startTime = $deserializer.readLong();
        $_obj.timeReference = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.glb.Logger $_obj = new x10.glb.Logger((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.nodesCount);
        $serializer.write(this.nodesGiven);
        $serializer.write(this.lifelineNodesReceived);
        $serializer.write(this.stealsAttempted);
        $serializer.write(this.stealsPerpetrated);
        $serializer.write(this.stealsReceived);
        $serializer.write(this.stealsSuffered);
        $serializer.write(this.nodesReceived);
        $serializer.write(this.lifelineStealsAttempted);
        $serializer.write(this.lifelineStealsPerpetrated);
        $serializer.write(this.lifelineStealsReceived);
        $serializer.write(this.lifelineStealsSuffered);
        $serializer.write(this.lastStartStopLiveTimeStamp);
        $serializer.write(this.timeAlive);
        $serializer.write(this.timeDead);
        $serializer.write(this.startTime);
        $serializer.write(this.timeReference);
        
    }
    
    // constructor just for allocation
    public Logger(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public long nodesCount;
    
    //#line 10 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public long nodesGiven;
    
    //#line 11 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public long lifelineNodesReceived;
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public long stealsAttempted;
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public long stealsPerpetrated;
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public long stealsReceived;
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public long stealsSuffered;
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public long nodesReceived;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public long lifelineStealsAttempted;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public long lifelineStealsPerpetrated;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public long lifelineStealsReceived;
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public long lifelineStealsSuffered;
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public long lastStartStopLiveTimeStamp;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public long timeAlive;
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public long timeDead;
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public long startTime;
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public long timeReference;
    
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    // creation method for java code (1-phase java constructor)
    public Logger(final boolean b) {
        this((java.lang.System[]) null);
        x10$glb$Logger$$init$S(b);
    }
    
    // constructor for non-virtual call
    final public x10.glb.Logger x10$glb$Logger$$init$S(final boolean b) {
         {
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            
            
            //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            this.__fieldInitializers_x10_glb_Logger();
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            if (b) {
                
                //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
                final x10.util.Team t$88590 = ((x10.util.Team)(x10.util.Team.get$WORLD()));
                
                //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
                t$88590.barrier();
            }
            
            //#line 39 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
            final long t$88591 = java.lang.System.nanoTime();
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            this.timeReference = t$88591;
        }
        return this;
    }
    
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public void startLive() {
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long time = java.lang.System.nanoTime();
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88592 = startTime;
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final boolean t$88593 = ((long) t$88592) == ((long) 0L);
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        if (t$88593) {
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            this.startTime = time;
        }
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88594 = lastStartStopLiveTimeStamp;
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final boolean t$88599 = ((t$88594) >= (((long)(0L))));
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        if (t$88599) {
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88596 = this.timeDead;
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88595 = lastStartStopLiveTimeStamp;
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88597 = ((time) - (((long)(t$88595))));
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88598 = ((t$88596) + (((long)(t$88597))));
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            this.timeDead = t$88598;
        }
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.lastStartStopLiveTimeStamp = time;
    }
    
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public void stopLive() {
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long time = java.lang.System.nanoTime();
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88601 = this.timeAlive;
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88600 = lastStartStopLiveTimeStamp;
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88602 = ((time) - (((long)(t$88600))));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88603 = ((t$88601) + (((long)(t$88602))));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.timeAlive = t$88603;
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.lastStartStopLiveTimeStamp = time;
    }
    
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public void collect__0$1x10$glb$Logger$2(final x10.core.Rail logs) {
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final x10.core.Rail rail$83710 = ((x10.core.Rail)(logs));
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long size$83711 = ((x10.core.Rail<x10.glb.Logger>)rail$83710).size;
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        long idx$88747 = 0L;
        {
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final x10.glb.Logger[] rail$83710$value$88750 = ((x10.glb.Logger[])rail$83710.value);
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            for (;
                 true;
                 ) {
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
                final long t$88748 = idx$88747;
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
                final boolean t$88749 = ((t$88748) < (((long)(size$83711))));
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
                if (!(t$88749)) {
                    
                    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
                    break;
                }
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
                final long t$88743 = idx$88747;
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
                final x10.glb.Logger l$88744 = ((x10.glb.Logger)(((x10.glb.Logger)rail$83710$value$88750[(int)t$88743])));
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
                this.add(((x10.glb.Logger)(l$88744)));
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
                final long t$88745 = idx$88747;
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
                final long t$88746 = ((t$88745) + (((long)(1L))));
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
                idx$88747 = t$88746;
            }
        }
    }
    
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public void stats() {
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final x10.io.Printer t$88617 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88610 = nodesGiven;
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final java.lang.String t$88611 = (((x10.core.Long.$box(t$88610))) + (" Task items stolen = "));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88612 = nodesReceived;
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final java.lang.String t$88613 = ((t$88611) + ((x10.core.Long.$box(t$88612))));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final java.lang.String t$88614 = ((t$88613) + (" (direct) + "));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88615 = lifelineNodesReceived;
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final java.lang.String t$88616 = ((t$88614) + ((x10.core.Long.$box(t$88615))));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final java.lang.String t$88618 = ((t$88616) + (" (lifeline)."));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        t$88617.println(((java.lang.Object)(t$88618)));
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final x10.io.Printer t$88620 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88619 = stealsPerpetrated;
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final java.lang.String t$88621 = (((x10.core.Long.$box(t$88619))) + (" successful direct steals."));
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        t$88620.println(((java.lang.Object)(t$88621)));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final x10.io.Printer t$88623 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88622 = lifelineStealsPerpetrated;
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final java.lang.String t$88624 = (((x10.core.Long.$box(t$88622))) + (" successful lifeline steals."));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        t$88623.println(((java.lang.Object)(t$88624)));
    }
    
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public static java.lang.String sub(final java.lang.String str, final int start, final int end) {
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final int t$88625 = (str).length();
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final int t$88626 = java.lang.Math.min(((int)(end)),((int)(t$88625)));
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final java.lang.String t$88627 = (str).substring(((int)(start)), ((int)(t$88626)));
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        return t$88627;
    }
    
    
    //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public void add(final x10.glb.Logger other) {
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88628 = this.nodesCount;
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88629 = other.nodesCount;
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88630 = ((t$88628) + (((long)(t$88629))));
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.nodesCount = t$88630;
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88631 = this.nodesGiven;
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88632 = other.nodesGiven;
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88633 = ((t$88631) + (((long)(t$88632))));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.nodesGiven = t$88633;
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88634 = this.nodesReceived;
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88635 = other.nodesReceived;
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88636 = ((t$88634) + (((long)(t$88635))));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.nodesReceived = t$88636;
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88637 = this.stealsPerpetrated;
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88638 = other.stealsPerpetrated;
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88639 = ((t$88637) + (((long)(t$88638))));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.stealsPerpetrated = t$88639;
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88640 = this.lifelineNodesReceived;
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88641 = other.lifelineNodesReceived;
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88642 = ((t$88640) + (((long)(t$88641))));
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.lifelineNodesReceived = t$88642;
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88643 = this.lifelineStealsPerpetrated;
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88644 = other.lifelineStealsPerpetrated;
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        final long t$88645 = ((t$88643) + (((long)(t$88644))));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.lifelineStealsPerpetrated = t$88645;
    }
    
    
    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    public x10.glb.Logger get(final boolean verbose) {
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        if (verbose) {
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final x10.io.Printer t$88741 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88646 = ((long)x10.x10rt.X10RT.here());
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88647 = (("") + ((x10.core.Long.$box(t$88646))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88652 = ((t$88647) + (" -> "));
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88648 = timeAlive;
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final double t$88649 = ((double)(long)(((long)(t$88648))));
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final double t$88650 = ((t$88649) / (((double)(1.0E9))));
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88651 = (("") + ((x10.core.Double.$box(t$88650))));
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88653 = x10.glb.Logger.sub(((java.lang.String)(t$88651)), (int)(0), (int)(6));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88654 = ((t$88652) + (t$88653));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88659 = ((t$88654) + (" : "));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88655 = timeDead;
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final double t$88656 = ((double)(long)(((long)(t$88655))));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final double t$88657 = ((t$88656) / (((double)(1.0E9))));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88658 = (("") + ((x10.core.Double.$box(t$88657))));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88660 = x10.glb.Logger.sub(((java.lang.String)(t$88658)), (int)(0), (int)(6));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88661 = ((t$88659) + (t$88660));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88668 = ((t$88661) + (" : "));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88662 = timeAlive;
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88663 = timeDead;
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88664 = ((t$88662) + (((long)(t$88663))));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final double t$88665 = ((double)(long)(((long)(t$88664))));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final double t$88666 = ((t$88665) / (((double)(1.0E9))));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88667 = (("") + ((x10.core.Double.$box(t$88666))));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88669 = x10.glb.Logger.sub(((java.lang.String)(t$88667)), (int)(0), (int)(6));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88670 = ((t$88668) + (t$88669));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88680 = ((t$88670) + (" : "));
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88671 = timeAlive;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final double t$88672 = ((double)(long)(((long)(t$88671))));
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final double t$88676 = ((100.0) * (((double)(t$88672))));
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88673 = timeAlive;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88674 = timeDead;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88675 = ((t$88673) + (((long)(t$88674))));
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final double t$88677 = ((double)(long)(((long)(t$88675))));
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final double t$88678 = ((t$88676) / (((double)(t$88677))));
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88679 = (("") + ((x10.core.Double.$box(t$88678))));
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88681 = x10.glb.Logger.sub(((java.lang.String)(t$88679)), (int)(0), (int)(6));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88682 = ((t$88680) + (t$88681));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88683 = ((t$88682) + ("%"));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88690 = ((t$88683) + (" :: "));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88684 = startTime;
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88685 = timeReference;
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88686 = ((t$88684) - (((long)(t$88685))));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final double t$88687 = ((double)(long)(((long)(t$88686))));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final double t$88688 = ((t$88687) / (((double)(1.0E9))));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88689 = (("") + ((x10.core.Double.$box(t$88688))));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88691 = x10.glb.Logger.sub(((java.lang.String)(t$88689)), (int)(0), (int)(6));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88692 = ((t$88690) + (t$88691));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88699 = ((t$88692) + (" : "));
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88693 = lastStartStopLiveTimeStamp;
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88694 = timeReference;
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88695 = ((t$88693) - (((long)(t$88694))));
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final double t$88696 = ((double)(long)(((long)(t$88695))));
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final double t$88697 = ((t$88696) / (((double)(1.0E9))));
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88698 = (("") + ((x10.core.Double.$box(t$88697))));
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88700 = x10.glb.Logger.sub(((java.lang.String)(t$88698)), (int)(0), (int)(6));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88701 = ((t$88699) + (t$88700));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88702 = ((t$88701) + (" :: "));
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88703 = nodesCount;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88704 = ((t$88702) + ((x10.core.Long.$box(t$88703))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88705 = ((t$88704) + (" :: "));
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88706 = nodesGiven;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88707 = ((t$88705) + ((x10.core.Long.$box(t$88706))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88708 = ((t$88707) + (" : "));
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88709 = nodesReceived;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88710 = ((t$88708) + ((x10.core.Long.$box(t$88709))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88711 = ((t$88710) + (" : "));
            
            //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88712 = lifelineNodesReceived;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88713 = ((t$88711) + ((x10.core.Long.$box(t$88712))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88714 = ((t$88713) + (" :: "));
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88715 = stealsReceived;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88716 = ((t$88714) + ((x10.core.Long.$box(t$88715))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88717 = ((t$88716) + (" : "));
            
            //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88718 = lifelineStealsReceived;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88719 = ((t$88717) + ((x10.core.Long.$box(t$88718))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88720 = ((t$88719) + (" :: "));
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88721 = stealsSuffered;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88722 = ((t$88720) + ((x10.core.Long.$box(t$88721))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88723 = ((t$88722) + (" : "));
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88724 = lifelineStealsSuffered;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88725 = ((t$88723) + ((x10.core.Long.$box(t$88724))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88726 = ((t$88725) + (" :: "));
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88727 = stealsAttempted;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88728 = ((t$88726) + ((x10.core.Long.$box(t$88727))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88731 = ((t$88728) + (" : "));
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88729 = stealsAttempted;
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88730 = stealsPerpetrated;
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88732 = ((t$88729) - (((long)(t$88730))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88733 = ((t$88731) + ((x10.core.Long.$box(t$88732))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88734 = ((t$88733) + (" :: "));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88735 = lifelineStealsAttempted;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88736 = ((t$88734) + ((x10.core.Long.$box(t$88735))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88739 = ((t$88736) + (" : "));
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88737 = lifelineStealsAttempted;
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88738 = lifelineStealsPerpetrated;
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final long t$88740 = ((t$88737) - (((long)(t$88738))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            final java.lang.String t$88742 = ((t$88739) + ((x10.core.Long.$box(t$88740))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
            t$88741.println(((java.lang.Object)(t$88742)));
        }
        
        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        return this;
    }
    
    
    //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    final public x10.glb.Logger x10$glb$Logger$$this$x10$glb$Logger() {
        
        //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        return x10.glb.Logger.this;
    }
    
    
    //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    final public void __fieldInitializers_x10_glb_Logger() {
        
        //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.nodesCount = 0L;
        
        //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.nodesGiven = 0L;
        
        //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.lifelineNodesReceived = 0L;
        
        //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.stealsAttempted = 0L;
        
        //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.stealsPerpetrated = 0L;
        
        //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.stealsReceived = 0L;
        
        //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.stealsSuffered = 0L;
        
        //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.nodesReceived = 0L;
        
        //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.lifelineStealsAttempted = 0L;
        
        //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.lifelineStealsPerpetrated = 0L;
        
        //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.lifelineStealsReceived = 0L;
        
        //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.lifelineStealsSuffered = 0L;
        
        //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.lastStartStopLiveTimeStamp = -1L;
        
        //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.timeAlive = 0L;
        
        //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.timeDead = 0L;
        
        //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this.startTime = 0L;
    }
}

