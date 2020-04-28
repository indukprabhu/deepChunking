package x10.regionarray;


@x10.runtime.impl.java.X10Generated
final public class PeriodicDist extends x10.regionarray.Dist implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<PeriodicDist> $RTT = 
        x10.rtt.NamedType.<PeriodicDist> make("x10.regionarray.PeriodicDist",
                                              PeriodicDist.class,
                                              new x10.rtt.Type[] {
                                                  x10.regionarray.Dist.$RTT
                                              });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PeriodicDist $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.Dist.$_deserialize_body($_obj, $deserializer);
        $_obj.baseDist = $deserializer.readObject();
        $_obj.min = $deserializer.readObject();
        $_obj.min0 = $deserializer.readLong();
        $_obj.min1 = $deserializer.readLong();
        $_obj.min2 = $deserializer.readLong();
        $_obj.min3 = $deserializer.readLong();
        $_obj.delta = $deserializer.readObject();
        $_obj.delta0 = $deserializer.readLong();
        $_obj.delta1 = $deserializer.readLong();
        $_obj.delta2 = $deserializer.readLong();
        $_obj.delta3 = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.PeriodicDist $_obj = new x10.regionarray.PeriodicDist((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.baseDist);
        $serializer.write(this.min);
        $serializer.write(this.min0);
        $serializer.write(this.min1);
        $serializer.write(this.min2);
        $serializer.write(this.min3);
        $serializer.write(this.delta);
        $serializer.write(this.delta0);
        $serializer.write(this.delta1);
        $serializer.write(this.delta2);
        $serializer.write(this.delta3);
        
    }
    
    // constructor just for allocation
    public PeriodicDist(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public x10.regionarray.Dist baseDist;
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public x10.core.Rail<x10.core.Long> min;
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public long min0;
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public long min1;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public long min2;
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public long min3;
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public x10.core.Rail<x10.core.Long> delta;
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public long delta0;
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public long delta1;
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public long delta2;
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public long delta3;
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    // creation method for java code (1-phase java constructor)
    public PeriodicDist(final x10.regionarray.Dist base) {
        this((java.lang.System[]) null);
        x10$regionarray$PeriodicDist$$init$S(base);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.PeriodicDist x10$regionarray$PeriodicDist$$init$S(final x10.regionarray.Dist base) {
         {
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final x10.regionarray.Dist this$127653 = ((x10.regionarray.Dist)(this));
            
            //#line 659 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region region$127652 = ((x10.regionarray.Region)(base.region));
            
            //#line 660 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            this$127653.region = region$127652;
            {
                
            }
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final x10.regionarray.PeriodicDist this$128273 = this;
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            this.baseDist = ((x10.regionarray.Dist)(base));
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final x10.regionarray.Region reg = ((x10.regionarray.Region)(base.region));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127770 = reg.isEmpty$O();
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (t$127770) {
                
                //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$127699 = this.min3 = 0L;
                
                //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$127700 = this.min2 = t$127699;
                
                //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$127701 = this.min1 = t$127700;
                
                //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                this.min0 = t$127701;
                
                //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$127702 = this.delta3 = 0L;
                
                //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$127703 = this.delta2 = t$127702;
                
                //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$127704 = this.delta1 = t$127703;
                
                //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                this.delta0 = t$127704;
                
                //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final x10.regionarray.Dist this$127660 = ((x10.regionarray.Dist)
                                                           this);
                
                //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                final x10.regionarray.Region t$127705 = ((x10.regionarray.Region)(this$127660.region));
                
                //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                final long t$127706 = t$127705.rank;
                
                //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final boolean t$127714 = ((t$127706) > (((long)(4L))));
                
                //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                if (t$127714) {
                    
                    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final x10.regionarray.Dist this$127661 = ((x10.regionarray.Dist)
                                                               this);
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                    final x10.regionarray.Region t$127707 = ((x10.regionarray.Region)(this$127661.region));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                    final long t$127708 = t$127707.rank;
                    
                    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final x10.core.Rail t$127709 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$127708)))));
                    
                    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    this.min = ((x10.core.Rail)(t$127709));
                    
                    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final x10.regionarray.Dist this$127662 = ((x10.regionarray.Dist)
                                                               this);
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                    final x10.regionarray.Region t$127710 = ((x10.regionarray.Region)(this$127662.region));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                    final long t$127711 = t$127710.rank;
                    
                    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final x10.core.Rail t$127712 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$127711)))));
                    
                    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    this.delta = ((x10.core.Rail)(t$127712));
                } else {
                    
                    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final x10.core.Rail t$127713 = ((x10.core.Rail)(this.delta = null));
                    
                    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    this.min = ((x10.core.Rail)(t$127713));
                }
            } else {
                
                //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final x10.regionarray.Dist this$127663 = ((x10.regionarray.Dist)
                                                           this);
                
                //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                final x10.regionarray.Region t$127715 = ((x10.regionarray.Region)(this$127663.region));
                
                //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                final long t$127716 = t$127715.rank;
                
                //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final boolean t$127729 = ((t$127716) > (((long)(4L))));
                
                //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                if (t$127729) {
                    
                    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final x10.regionarray.Dist this$127664 = ((x10.regionarray.Dist)
                                                               this);
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                    final x10.regionarray.Region t$127717 = ((x10.regionarray.Region)(this$127664.region));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                    final long t$127719 = t$127717.rank;
                    
                    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final x10.core.fun.Fun_0_1 t$127720 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.PeriodicDist.$Closure$217(reg)));
                    
                    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final x10.core.Rail tmpMin = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$127719)), ((x10.core.fun.Fun_0_1)(t$127720)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                    
                    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    this.min = ((x10.core.Rail)(tmpMin));
                    
                    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final x10.regionarray.Dist this$127665 = ((x10.regionarray.Dist)
                                                               this);
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                    final x10.regionarray.Region t$127721 = ((x10.regionarray.Region)(this$127665.region));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                    final long t$127726 = t$127721.rank;
                    
                    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final x10.core.fun.Fun_0_1 t$127727 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.PeriodicDist.$Closure$218(reg, tmpMin, (x10.regionarray.PeriodicDist.$Closure$218.__1$1x10$lang$Long$2) null)));
                    
                    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final x10.core.Rail t$127728 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$127726)), ((x10.core.fun.Fun_0_1)(t$127727)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                    
                    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    this.delta = ((x10.core.Rail)(t$127728));
                } else {
                    
                    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    this.min = null;
                    
                    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    this.delta = null;
                }
                
                //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$127730 = ((long)(((int)(0))));
                
                //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$127731 = reg.min$O((long)(t$127730));
                
                //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                this.min0 = t$127731;
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$127732 = ((long)(((int)(0))));
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$127733 = reg.max$O((long)(t$127732));
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$127734 = min0;
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$127735 = ((t$127733) - (((long)(t$127734))));
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$127736 = ((t$127735) + (((long)(1L))));
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                this.delta0 = t$127736;
                
                //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final x10.regionarray.Dist this$127666 = ((x10.regionarray.Dist)
                                                           this);
                
                //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                final x10.regionarray.Region t$127737 = ((x10.regionarray.Region)(this$127666.region));
                
                //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                final long t$127738 = t$127737.rank;
                
                //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final boolean t$127747 = ((t$127738) > (((long)(1L))));
                
                //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                if (t$127747) {
                    
                    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127739 = ((long)(((int)(1))));
                    
                    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127740 = reg.min$O((long)(t$127739));
                    
                    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    this.min1 = t$127740;
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127741 = ((long)(((int)(1))));
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127742 = reg.max$O((long)(t$127741));
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127743 = min1;
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127744 = ((t$127742) - (((long)(t$127743))));
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127745 = ((t$127744) + (((long)(1L))));
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    this.delta1 = t$127745;
                } else {
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127746 = this.delta1 = 0L;
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    this.min1 = t$127746;
                }
                
                //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final x10.regionarray.Dist this$127667 = ((x10.regionarray.Dist)
                                                           this);
                
                //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                final x10.regionarray.Region t$127748 = ((x10.regionarray.Region)(this$127667.region));
                
                //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                final long t$127749 = t$127748.rank;
                
                //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final boolean t$127758 = ((t$127749) > (((long)(2L))));
                
                //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                if (t$127758) {
                    
                    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127750 = ((long)(((int)(2))));
                    
                    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127751 = reg.min$O((long)(t$127750));
                    
                    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    this.min2 = t$127751;
                    
                    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127752 = ((long)(((int)(2))));
                    
                    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127753 = reg.max$O((long)(t$127752));
                    
                    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127754 = min2;
                    
                    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127755 = ((t$127753) - (((long)(t$127754))));
                    
                    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127756 = ((t$127755) + (((long)(1L))));
                    
                    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    this.delta2 = t$127756;
                } else {
                    
                    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127757 = this.delta2 = 0L;
                    
                    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    this.min2 = t$127757;
                }
                
                //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final x10.regionarray.Dist this$127668 = ((x10.regionarray.Dist)
                                                           this);
                
                //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                final x10.regionarray.Region t$127759 = ((x10.regionarray.Region)(this$127668.region));
                
                //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                final long t$127760 = t$127759.rank;
                
                //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final boolean t$127769 = ((t$127760) > (((long)(3L))));
                
                //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                if (t$127769) {
                    
                    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127761 = ((long)(((int)(3))));
                    
                    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127762 = reg.min$O((long)(t$127761));
                    
                    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    this.min3 = t$127762;
                    
                    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127763 = ((long)(((int)(3))));
                    
                    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127764 = reg.max$O((long)(t$127763));
                    
                    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127765 = min3;
                    
                    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127766 = ((t$127764) - (((long)(t$127765))));
                    
                    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127767 = ((t$127766) + (((long)(1L))));
                    
                    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    this.delta3 = t$127767;
                } else {
                    
                    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127768 = this.delta3 = 0L;
                    
                    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    this.min3 = t$127768;
                }
            }
        }
        return this;
    }
    
    
    
    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    private long getPeriodicIndex$O(final long index, final long dim) {
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long regionMin = 0L;
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist this$127669 = ((x10.regionarray.Dist)
                                                   this);
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Region t$127771 = ((x10.regionarray.Region)(this$127669.region));
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final long t$127772 = t$127771.rank;
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$127773 = ((long)(((int)(5))));
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final boolean t$127785 = ((t$127772) < (((long)(t$127773))));
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if (t$127785) {
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127782 = ((long) dim) == ((long) 0L);
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (t$127782) {
                
                //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$127774 = min0;
                
                //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionMin = t$127774;
            } else {
                
                //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final boolean t$127781 = ((long) dim) == ((long) 1L);
                
                //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                if (t$127781) {
                    
                    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127775 = min1;
                    
                    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    regionMin = t$127775;
                } else {
                    
                    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final boolean t$127780 = ((long) dim) == ((long) 2L);
                    
                    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    if (t$127780) {
                        
                        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        final long t$127776 = min2;
                        
                        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        regionMin = t$127776;
                    } else {
                        
                        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        final boolean t$127779 = ((long) dim) == ((long) 3L);
                        
                        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        if (t$127779) {
                            
                            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            final long t$127777 = min3;
                            
                            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            regionMin = t$127777;
                        } else {
                            
                            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            final java.lang.UnsupportedOperationException t$127778 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
                            
                            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            throw t$127778;
                        }
                    }
                }
            }
        } else {
            
            //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final x10.core.Rail t$127783 = ((x10.core.Rail)(min));
            
            //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127784 = ((long[])t$127783.value)[(int)dim];
            
            //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            regionMin = t$127784;
        }
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long regionDelta = 0L;
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist this$127670 = ((x10.regionarray.Dist)
                                                   this);
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Region t$127786 = ((x10.regionarray.Region)(this$127670.region));
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final long t$127787 = t$127786.rank;
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$127788 = ((long)(((int)(5))));
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final boolean t$127800 = ((t$127787) < (((long)(t$127788))));
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if (t$127800) {
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127797 = ((long) dim) == ((long) 0L);
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (t$127797) {
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$127789 = delta0;
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionDelta = t$127789;
            } else {
                
                //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final boolean t$127796 = ((long) dim) == ((long) 1L);
                
                //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                if (t$127796) {
                    
                    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$127790 = delta1;
                    
                    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    regionDelta = t$127790;
                } else {
                    
                    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final boolean t$127795 = ((long) dim) == ((long) 2L);
                    
                    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    if (t$127795) {
                        
                        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        final long t$127791 = delta2;
                        
                        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        regionDelta = t$127791;
                    } else {
                        
                        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        final boolean t$127794 = ((long) dim) == ((long) 3L);
                        
                        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        if (t$127794) {
                            
                            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            final long t$127792 = delta3;
                            
                            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            regionDelta = t$127792;
                        } else {
                            
                            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            final java.lang.UnsupportedOperationException t$127793 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
                            
                            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            throw t$127793;
                        }
                    }
                }
            }
        } else {
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final x10.core.Rail t$127798 = ((x10.core.Rail)(delta));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127799 = ((long[])t$127798.value)[(int)dim];
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            regionDelta = t$127799;
        }
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long actualIndex = index;
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127801 = actualIndex;
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127802 = regionMin;
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127806 = ((t$127801) < (((long)(t$127802))));
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$127806)) {
                
                //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128274 = actualIndex;
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128275 = regionDelta;
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128276 = ((t$128274) + (((long)(t$128275))));
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            actualIndex = t$128276;
        }
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127809 = actualIndex;
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127807 = regionMin;
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127808 = regionDelta;
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127810 = ((t$127807) + (((long)(t$127808))));
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127814 = ((t$127809) >= (((long)(t$127810))));
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$127814)) {
                
                //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128277 = actualIndex;
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128278 = regionDelta;
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128279 = ((t$128277) - (((long)(t$128278))));
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            actualIndex = t$128279;
        }
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$127815 = actualIndex;
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return t$127815;
    }
    
    public static long getPeriodicIndex$P$O(final long index, final long dim, final x10.regionarray.PeriodicDist PeriodicDist) {
        return PeriodicDist.getPeriodicIndex$O((long)(index), (long)(dim));
    }
    
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public x10.lang.PlaceGroup places() {
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$127816 = ((x10.regionarray.Dist)(baseDist));
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.lang.PlaceGroup t$127817 = t$127816.places();
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return t$127817;
    }
    
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public long numPlaces$O() {
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$127818 = ((x10.regionarray.Dist)(baseDist));
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$127819 = t$127818.numPlaces$O();
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return t$127819;
    }
    
    
    //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public x10.lang.Iterable regions() {
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$127820 = ((x10.regionarray.Dist)(baseDist));
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.lang.Iterable t$127821 = t$127820.regions();
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return t$127821;
    }
    
    
    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public x10.regionarray.Region get(final x10.lang.Place p) {
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$127822 = ((x10.regionarray.Dist)(baseDist));
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Region t$127823 = ((x10.regionarray.Region)(t$127822.get(((x10.lang.Place)(p)))));
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return t$127823;
    }
    
    
    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public x10.regionarray.Region $apply(final x10.lang.Place p) {
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.PeriodicDist this$127672 = ((x10.regionarray.PeriodicDist)(this));
        
        //#line 129 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.lang.Place p$127671 = ((x10.lang.Place)(p));
        
        //#line 129 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$127824 = ((x10.regionarray.Dist)(this$127672.baseDist));
        
        //#line 129 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Region t$127825 = ((x10.regionarray.Region)(t$127824.get(((x10.lang.Place)(p$127671)))));
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return t$127825;
    }
    
    
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public x10.lang.Place $apply(final x10.lang.Point pt) {
        
        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist this$127673 = ((x10.regionarray.Dist)
                                                   this);
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Region t$127826 = ((x10.regionarray.Region)(this$127673.region));
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final long t$127875 = t$127826.rank;
        
        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.core.fun.Fun_0_1 t$127876 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.PeriodicDist.$Closure$219(this, pt)));
        
        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.lang.Point actualPt = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(t$127875), ((x10.core.fun.Fun_0_1)(t$127876)))));
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$127877 = ((x10.regionarray.Dist)(baseDist));
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.lang.Place t$127878 = t$127877.$apply(((x10.lang.Point)(actualPt)));
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return t$127878;
    }
    
    
    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public x10.lang.Place $apply(final long i0) {
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a0 = i0;
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127881 = a0;
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127882 = min0;
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127886 = ((t$127881) < (((long)(t$127882))));
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$127886)) {
                
                //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128330 = a0;
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128331 = delta0;
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128332 = ((t$128330) + (((long)(t$128331))));
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a0 = t$128332;
        }
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127889 = a0;
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127887 = min0;
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127888 = delta0;
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127890 = ((t$127887) + (((long)(t$127888))));
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127894 = ((t$127889) >= (((long)(t$127890))));
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$127894)) {
                
                //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128333 = a0;
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128334 = delta0;
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128335 = ((t$128333) - (((long)(t$128334))));
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a0 = t$128335;
        }
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$127895 = ((x10.regionarray.Dist)(baseDist));
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$127896 = a0;
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.lang.Place t$127897 = t$127895.$apply((long)(t$127896));
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return t$127897;
    }
    
    
    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public x10.lang.Place $apply(final long i0, final long i1) {
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a0 = i0;
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127900 = a0;
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127901 = min0;
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127905 = ((t$127900) < (((long)(t$127901))));
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$127905)) {
                
                //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128336 = a0;
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128337 = delta0;
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128338 = ((t$128336) + (((long)(t$128337))));
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a0 = t$128338;
        }
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127908 = a0;
            
            //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127906 = min0;
            
            //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127907 = delta0;
            
            //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127909 = ((t$127906) + (((long)(t$127907))));
            
            //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127913 = ((t$127908) >= (((long)(t$127909))));
            
            //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$127913)) {
                
                //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128339 = a0;
            
            //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128340 = delta0;
            
            //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128341 = ((t$128339) - (((long)(t$128340))));
            
            //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a0 = t$128341;
        }
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a1 = i1;
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127914 = a1;
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127915 = min1;
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127919 = ((t$127914) < (((long)(t$127915))));
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$127919)) {
                
                //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128342 = a1;
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128343 = delta1;
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128344 = ((t$128342) + (((long)(t$128343))));
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a1 = t$128344;
        }
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127922 = a1;
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127920 = min1;
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127921 = delta1;
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127923 = ((t$127920) + (((long)(t$127921))));
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127927 = ((t$127922) >= (((long)(t$127923))));
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$127927)) {
                
                //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128345 = a1;
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128346 = delta1;
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128347 = ((t$128345) - (((long)(t$128346))));
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a1 = t$128347;
        }
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$127928 = ((x10.regionarray.Dist)(baseDist));
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$127929 = a0;
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$127930 = a1;
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.lang.Place t$127931 = t$127928.$apply((long)(t$127929), (long)(t$127930));
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return t$127931;
    }
    
    
    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public x10.lang.Place $apply(final long i0, final long i1, final long i2) {
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a0 = i0;
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127934 = a0;
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127935 = min0;
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127939 = ((t$127934) < (((long)(t$127935))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$127939)) {
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128348 = a0;
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128349 = delta0;
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128350 = ((t$128348) + (((long)(t$128349))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a0 = t$128350;
        }
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127942 = a0;
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127940 = min0;
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127941 = delta0;
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127943 = ((t$127940) + (((long)(t$127941))));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127947 = ((t$127942) >= (((long)(t$127943))));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$127947)) {
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128351 = a0;
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128352 = delta0;
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128353 = ((t$128351) - (((long)(t$128352))));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a0 = t$128353;
        }
        
        //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a1 = i1;
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127948 = a1;
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127949 = min1;
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127953 = ((t$127948) < (((long)(t$127949))));
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$127953)) {
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128354 = a1;
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128355 = delta1;
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128356 = ((t$128354) + (((long)(t$128355))));
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a1 = t$128356;
        }
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127956 = a1;
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127954 = min1;
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127955 = delta1;
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127957 = ((t$127954) + (((long)(t$127955))));
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127961 = ((t$127956) >= (((long)(t$127957))));
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$127961)) {
                
                //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128357 = a1;
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128358 = delta1;
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128359 = ((t$128357) - (((long)(t$128358))));
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a1 = t$128359;
        }
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a2 = i2;
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127962 = a2;
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127963 = min2;
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127967 = ((t$127962) < (((long)(t$127963))));
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$127967)) {
                
                //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128360 = a2;
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128361 = delta2;
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128362 = ((t$128360) + (((long)(t$128361))));
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a2 = t$128362;
        }
        
        //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127970 = a2;
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127968 = min2;
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127969 = delta2;
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127971 = ((t$127968) + (((long)(t$127969))));
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127975 = ((t$127970) >= (((long)(t$127971))));
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$127975)) {
                
                //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128363 = a2;
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128364 = delta2;
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128365 = ((t$128363) - (((long)(t$128364))));
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a2 = t$128365;
        }
        
        //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$127976 = ((x10.regionarray.Dist)(baseDist));
        
        //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$127977 = a0;
        
        //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$127978 = a1;
        
        //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$127979 = a2;
        
        //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.lang.Place t$127980 = t$127976.$apply((long)(t$127977), (long)(t$127978), (long)(t$127979));
        
        //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return t$127980;
    }
    
    
    //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public x10.lang.Place $apply(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a0 = i0;
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127983 = a0;
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127984 = min0;
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127988 = ((t$127983) < (((long)(t$127984))));
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$127988)) {
                
                //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128366 = a0;
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128367 = delta0;
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128368 = ((t$128366) + (((long)(t$128367))));
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a0 = t$128368;
        }
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127991 = a0;
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127989 = min0;
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127990 = delta0;
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127992 = ((t$127989) + (((long)(t$127990))));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$127996 = ((t$127991) >= (((long)(t$127992))));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$127996)) {
                
                //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128369 = a0;
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128370 = delta0;
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128371 = ((t$128369) - (((long)(t$128370))));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a0 = t$128371;
        }
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a1 = i1;
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127997 = a1;
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127998 = min1;
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128002 = ((t$127997) < (((long)(t$127998))));
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128002)) {
                
                //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128372 = a1;
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128373 = delta1;
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128374 = ((t$128372) + (((long)(t$128373))));
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a1 = t$128374;
        }
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128005 = a1;
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128003 = min1;
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128004 = delta1;
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128006 = ((t$128003) + (((long)(t$128004))));
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128010 = ((t$128005) >= (((long)(t$128006))));
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128010)) {
                
                //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128375 = a1;
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128376 = delta1;
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128377 = ((t$128375) - (((long)(t$128376))));
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a1 = t$128377;
        }
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a2 = i2;
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128011 = a2;
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128012 = min2;
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128016 = ((t$128011) < (((long)(t$128012))));
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128016)) {
                
                //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128378 = a2;
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128379 = delta2;
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128380 = ((t$128378) + (((long)(t$128379))));
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a2 = t$128380;
        }
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128019 = a2;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128017 = min2;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128018 = delta2;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128020 = ((t$128017) + (((long)(t$128018))));
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128024 = ((t$128019) >= (((long)(t$128020))));
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128024)) {
                
                //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128381 = a2;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128382 = delta2;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128383 = ((t$128381) - (((long)(t$128382))));
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a2 = t$128383;
        }
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a3 = i3;
        
        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128025 = a3;
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128026 = min3;
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128030 = ((t$128025) < (((long)(t$128026))));
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128030)) {
                
                //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128384 = a3;
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128385 = delta3;
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128386 = ((t$128384) + (((long)(t$128385))));
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a3 = t$128386;
        }
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128033 = a3;
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128031 = min3;
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128032 = delta3;
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128034 = ((t$128031) + (((long)(t$128032))));
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128038 = ((t$128033) >= (((long)(t$128034))));
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128038)) {
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128387 = a3;
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128388 = delta3;
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128389 = ((t$128387) - (((long)(t$128388))));
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a3 = t$128389;
        }
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$128039 = ((x10.regionarray.Dist)(baseDist));
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128040 = a0;
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128041 = a1;
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128042 = a2;
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128043 = a3;
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.lang.Place t$128044 = t$128039.$apply((long)(t$128040), (long)(t$128041), (long)(t$128042), (long)(t$128043));
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return t$128044;
    }
    
    
    //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public long offset$O(final x10.lang.Point pt) {
        
        //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist this$127686 = ((x10.regionarray.Dist)
                                                   this);
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Region t$128045 = ((x10.regionarray.Region)(this$127686.region));
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final long t$128094 = t$128045.rank;
        
        //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.core.fun.Fun_0_1 t$128095 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.PeriodicDist.$Closure$220(this, pt)));
        
        //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.lang.Point actualPt = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(t$128094), ((x10.core.fun.Fun_0_1)(t$128095)))));
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$128096 = ((x10.regionarray.Dist)(baseDist));
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128097 = t$128096.offset$O(((x10.lang.Point)(actualPt)));
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return t$128097;
    }
    
    
    //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public long offset$O(final long i0) {
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a0 = i0;
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128100 = a0;
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128101 = min0;
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128105 = ((t$128100) < (((long)(t$128101))));
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128105)) {
                
                //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128440 = a0;
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128441 = delta0;
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128442 = ((t$128440) + (((long)(t$128441))));
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a0 = t$128442;
        }
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128108 = a0;
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128106 = min0;
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128107 = delta0;
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128109 = ((t$128106) + (((long)(t$128107))));
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128113 = ((t$128108) >= (((long)(t$128109))));
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128113)) {
                
                //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128443 = a0;
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128444 = delta0;
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128445 = ((t$128443) - (((long)(t$128444))));
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a0 = t$128445;
        }
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$128114 = ((x10.regionarray.Dist)(baseDist));
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128115 = a0;
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128116 = t$128114.offset$O((long)(t$128115));
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return t$128116;
    }
    
    
    //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public long offset$O(final long i0, final long i1) {
        
        //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a0 = i0;
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128119 = a0;
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128120 = min0;
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128124 = ((t$128119) < (((long)(t$128120))));
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128124)) {
                
                //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128446 = a0;
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128447 = delta0;
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128448 = ((t$128446) + (((long)(t$128447))));
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a0 = t$128448;
        }
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128127 = a0;
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128125 = min0;
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128126 = delta0;
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128128 = ((t$128125) + (((long)(t$128126))));
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128132 = ((t$128127) >= (((long)(t$128128))));
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128132)) {
                
                //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128449 = a0;
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128450 = delta0;
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128451 = ((t$128449) - (((long)(t$128450))));
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a0 = t$128451;
        }
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a1 = i1;
        
        //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128133 = a1;
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128134 = min1;
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128138 = ((t$128133) < (((long)(t$128134))));
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128138)) {
                
                //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128452 = a1;
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128453 = delta1;
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128454 = ((t$128452) + (((long)(t$128453))));
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a1 = t$128454;
        }
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128141 = a1;
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128139 = min1;
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128140 = delta1;
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128142 = ((t$128139) + (((long)(t$128140))));
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128146 = ((t$128141) >= (((long)(t$128142))));
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128146)) {
                
                //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128455 = a1;
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128456 = delta1;
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128457 = ((t$128455) - (((long)(t$128456))));
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a1 = t$128457;
        }
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$128147 = ((x10.regionarray.Dist)(baseDist));
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128148 = a0;
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128149 = a1;
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128150 = t$128147.offset$O((long)(t$128148), (long)(t$128149));
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return t$128150;
    }
    
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public long offset$O(final long i0, final long i1, final long i2) {
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a0 = i0;
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128153 = a0;
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128154 = min0;
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128158 = ((t$128153) < (((long)(t$128154))));
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128158)) {
                
                //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128458 = a0;
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128459 = delta0;
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128460 = ((t$128458) + (((long)(t$128459))));
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a0 = t$128460;
        }
        
        //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128161 = a0;
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128159 = min0;
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128160 = delta0;
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128162 = ((t$128159) + (((long)(t$128160))));
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128166 = ((t$128161) >= (((long)(t$128162))));
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128166)) {
                
                //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128461 = a0;
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128462 = delta0;
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128463 = ((t$128461) - (((long)(t$128462))));
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a0 = t$128463;
        }
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a1 = i1;
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128167 = a1;
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128168 = min1;
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128172 = ((t$128167) < (((long)(t$128168))));
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128172)) {
                
                //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128464 = a1;
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128465 = delta1;
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128466 = ((t$128464) + (((long)(t$128465))));
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a1 = t$128466;
        }
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128175 = a1;
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128173 = min1;
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128174 = delta1;
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128176 = ((t$128173) + (((long)(t$128174))));
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128180 = ((t$128175) >= (((long)(t$128176))));
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128180)) {
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128467 = a1;
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128468 = delta1;
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128469 = ((t$128467) - (((long)(t$128468))));
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a1 = t$128469;
        }
        
        //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a2 = i2;
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128181 = a2;
            
            //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128182 = min2;
            
            //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128186 = ((t$128181) < (((long)(t$128182))));
            
            //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128186)) {
                
                //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128470 = a2;
            
            //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128471 = delta2;
            
            //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128472 = ((t$128470) + (((long)(t$128471))));
            
            //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a2 = t$128472;
        }
        
        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128189 = a2;
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128187 = min2;
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128188 = delta2;
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128190 = ((t$128187) + (((long)(t$128188))));
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128194 = ((t$128189) >= (((long)(t$128190))));
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128194)) {
                
                //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128473 = a2;
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128474 = delta2;
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128475 = ((t$128473) - (((long)(t$128474))));
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a2 = t$128475;
        }
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$128195 = ((x10.regionarray.Dist)(baseDist));
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128196 = a0;
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128197 = a1;
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128198 = a2;
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128199 = t$128195.offset$O((long)(t$128196), (long)(t$128197), (long)(t$128198));
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return t$128199;
    }
    
    
    //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public long offset$O(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a0 = i0;
        
        //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128202 = a0;
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128203 = min0;
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128207 = ((t$128202) < (((long)(t$128203))));
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128207)) {
                
                //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128476 = a0;
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128477 = delta0;
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128478 = ((t$128476) + (((long)(t$128477))));
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a0 = t$128478;
        }
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128210 = a0;
            
            //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128208 = min0;
            
            //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128209 = delta0;
            
            //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128211 = ((t$128208) + (((long)(t$128209))));
            
            //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128215 = ((t$128210) >= (((long)(t$128211))));
            
            //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128215)) {
                
                //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128479 = a0;
            
            //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128480 = delta0;
            
            //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128481 = ((t$128479) - (((long)(t$128480))));
            
            //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a0 = t$128481;
        }
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a1 = i1;
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128216 = a1;
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128217 = min1;
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128221 = ((t$128216) < (((long)(t$128217))));
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128221)) {
                
                //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128482 = a1;
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128483 = delta1;
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128484 = ((t$128482) + (((long)(t$128483))));
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a1 = t$128484;
        }
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128224 = a1;
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128222 = min1;
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128223 = delta1;
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128225 = ((t$128222) + (((long)(t$128223))));
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128229 = ((t$128224) >= (((long)(t$128225))));
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128229)) {
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128485 = a1;
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128486 = delta1;
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128487 = ((t$128485) - (((long)(t$128486))));
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a1 = t$128487;
        }
        
        //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a2 = i2;
        
        //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128230 = a2;
            
            //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128231 = min2;
            
            //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128235 = ((t$128230) < (((long)(t$128231))));
            
            //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128235)) {
                
                //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128488 = a2;
            
            //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128489 = delta2;
            
            //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128490 = ((t$128488) + (((long)(t$128489))));
            
            //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a2 = t$128490;
        }
        
        //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128238 = a2;
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128236 = min2;
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128237 = delta2;
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128239 = ((t$128236) + (((long)(t$128237))));
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128243 = ((t$128238) >= (((long)(t$128239))));
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128243)) {
                
                //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128491 = a2;
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128492 = delta2;
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128493 = ((t$128491) - (((long)(t$128492))));
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a2 = t$128493;
        }
        
        //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        long a3 = i3;
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128244 = a3;
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128245 = min3;
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128249 = ((t$128244) < (((long)(t$128245))));
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128249)) {
                
                //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128494 = a3;
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128495 = delta3;
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128496 = ((t$128494) + (((long)(t$128495))));
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a3 = t$128496;
        }
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (true) {
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128252 = a3;
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128250 = min3;
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128251 = delta3;
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128253 = ((t$128250) + (((long)(t$128251))));
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128257 = ((t$128252) >= (((long)(t$128253))));
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (!(t$128257)) {
                
                //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                break;
            }
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128497 = a3;
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128498 = delta3;
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128499 = ((t$128497) - (((long)(t$128498))));
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            a3 = t$128499;
        }
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$128258 = ((x10.regionarray.Dist)(baseDist));
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128259 = a0;
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128260 = a1;
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128261 = a2;
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128262 = a3;
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128263 = t$128258.offset$O((long)(t$128259), (long)(t$128260), (long)(t$128261), (long)(t$128262));
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return t$128263;
    }
    
    
    //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public long maxOffset$O() {
        
        //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$128264 = ((x10.regionarray.Dist)(baseDist));
        
        //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final long t$128265 = t$128264.maxOffset$O();
        
        //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return t$128265;
    }
    
    
    //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public x10.regionarray.Dist restriction(final x10.regionarray.Region r) {
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.PeriodicDist alloc$127650 = ((x10.regionarray.PeriodicDist)(new x10.regionarray.PeriodicDist((java.lang.System[]) null)));
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$128500 = ((x10.regionarray.Dist)(baseDist));
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$128501 = ((x10.regionarray.Dist)(t$128500.restriction(((x10.regionarray.Region)(r)))));
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        alloc$127650.x10$regionarray$PeriodicDist$$init$S(((x10.regionarray.Dist)(t$128501)));
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return alloc$127650;
    }
    
    
    //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public x10.regionarray.Dist restriction(final x10.lang.Place p) {
        
        //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.PeriodicDist alloc$127651 = ((x10.regionarray.PeriodicDist)(new x10.regionarray.PeriodicDist((java.lang.System[]) null)));
        
        //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$128502 = ((x10.regionarray.Dist)(baseDist));
        
        //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$128503 = ((x10.regionarray.Dist)(t$128502.restriction(((x10.lang.Place)(p)))));
        
        //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        alloc$127651.x10$regionarray$PeriodicDist$$init$S(((x10.regionarray.Dist)(t$128503)));
        
        //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return alloc$127651;
    }
    
    
    //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    public java.lang.String toString() {
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final x10.regionarray.Dist t$128270 = ((x10.regionarray.Dist)(baseDist));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final java.lang.String t$128271 = t$128270.toString();
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        final java.lang.String t$128272 = (("Periodic: ") + (t$128271));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return t$128272;
    }
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    final public x10.regionarray.PeriodicDist x10$regionarray$PeriodicDist$$this$x10$regionarray$PeriodicDist() {
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return x10.regionarray.PeriodicDist.this;
    }
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    final public void __fieldInitializers_x10_regionarray_PeriodicDist() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$217 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$217> $RTT = 
            x10.rtt.StaticFunType.<$Closure$217> make($Closure$217.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PeriodicDist.$Closure$217 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.reg = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.PeriodicDist.$Closure$217 $_obj = new x10.regionarray.PeriodicDist.$Closure$217((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.reg);
            
        }
        
        // constructor just for allocation
        public $Closure$217(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127718 = this.reg.min$O((long)(i));
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            return t$127718;
        }
        
        public x10.regionarray.Region reg;
        
        public $Closure$217(final x10.regionarray.Region reg) {
             {
                this.reg = ((x10.regionarray.Region)(reg));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$218 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$218> $RTT = 
            x10.rtt.StaticFunType.<$Closure$218> make($Closure$218.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PeriodicDist.$Closure$218 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.reg = $deserializer.readObject();
            $_obj.tmpMin = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.PeriodicDist.$Closure$218 $_obj = new x10.regionarray.PeriodicDist.$Closure$218((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.reg);
            $serializer.write(this.tmpMin);
            
        }
        
        // constructor just for allocation
        public $Closure$218(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$lang$Long$2 {}
        
    
        
        public long $apply$O(final long i) {
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127722 = this.reg.max$O((long)(i));
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127723 = ((long[])this.tmpMin.value)[(int)i];
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127724 = ((t$127722) - (((long)(t$127723))));
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127725 = ((t$127724) + (((long)(1L))));
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            return t$127725;
        }
        
        public x10.regionarray.Region reg;
        public x10.core.Rail<x10.core.Long> tmpMin;
        
        public $Closure$218(final x10.regionarray.Region reg, final x10.core.Rail<x10.core.Long> tmpMin, __1$1x10$lang$Long$2 $dummy) {
             {
                this.reg = ((x10.regionarray.Region)(reg));
                this.tmpMin = ((x10.core.Rail)(tmpMin));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$219 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$219> $RTT = 
            x10.rtt.StaticFunType.<$Closure$219> make($Closure$219.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PeriodicDist.$Closure$219 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.pt = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.PeriodicDist.$Closure$219 $_obj = new x10.regionarray.PeriodicDist.$Closure$219((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.pt);
            
        }
        
        // constructor just for allocation
        public $Closure$219(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final x10.regionarray.PeriodicDist this$127679 = ((x10.regionarray.PeriodicDist)(this.out$$));
            
            //#line 87 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long index$127674 = this.pt.$apply$O((long)(i));
            
            //#line 87 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long dim$127675 = i;
            
            //#line 87 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            long ret$127680 =  0;
            
            //#line 88 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            long regionMin$128286 = 0L;
            
            //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region t$128287 = ((x10.regionarray.Region)(this$127679.region));
            
            //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final long t$128288 = t$128287.rank;
            
            //#line 89 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128289 = ((long)(((int)(5))));
            
            //#line 89 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128290 = ((t$128288) < (((long)(t$128289))));
            
            //#line 89 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (t$128290) {
                
                //#line 90 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final boolean t$128291 = ((long) dim$127675) == ((long) 0L);
                
                //#line 90 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                if (t$128291) {
                    
                    //#line 91 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$128292 = this$127679.min0;
                    
                    //#line 91 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    regionMin$128286 = t$128292;
                } else {
                    
                    //#line 92 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final boolean t$128293 = ((long) dim$127675) == ((long) 1L);
                    
                    //#line 92 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    if (t$128293) {
                        
                        //#line 93 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        final long t$128294 = this$127679.min1;
                        
                        //#line 93 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        regionMin$128286 = t$128294;
                    } else {
                        
                        //#line 94 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        final boolean t$128295 = ((long) dim$127675) == ((long) 2L);
                        
                        //#line 94 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        if (t$128295) {
                            
                            //#line 95 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            final long t$128296 = this$127679.min2;
                            
                            //#line 95 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            regionMin$128286 = t$128296;
                        } else {
                            
                            //#line 96 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            final boolean t$128297 = ((long) dim$127675) == ((long) 3L);
                            
                            //#line 96 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            if (t$128297) {
                                
                                //#line 97 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                final long t$128298 = this$127679.min3;
                                
                                //#line 97 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                regionMin$128286 = t$128298;
                            } else {
                                
                                //#line 99 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                final boolean t$128299 = true;
                                
                                //#line 99 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                if (t$128299) {
                                    
                                    //#line 99 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                    final java.lang.UnsupportedOperationException t$128300 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
                                    
                                    //#line 99 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                    throw t$128300;
                                }
                            }
                        }
                    }
                }
            } else {
                
                //#line 102 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final x10.core.Rail t$128301 = ((x10.core.Rail)(this$127679.min));
                
                //#line 102 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128302 = ((long[])t$128301.value)[(int)dim$127675];
                
                //#line 102 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionMin$128286 = t$128302;
            }
            
            //#line 104 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            long regionDelta$128303 = 0L;
            
            //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region t$128304 = ((x10.regionarray.Region)(this$127679.region));
            
            //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final long t$128305 = t$128304.rank;
            
            //#line 105 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128306 = ((long)(((int)(5))));
            
            //#line 105 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128307 = ((t$128305) < (((long)(t$128306))));
            
            //#line 105 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (t$128307) {
                
                //#line 106 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final boolean t$128308 = ((long) dim$127675) == ((long) 0L);
                
                //#line 106 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                if (t$128308) {
                    
                    //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$128309 = this$127679.delta0;
                    
                    //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    regionDelta$128303 = t$128309;
                } else {
                    
                    //#line 108 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final boolean t$128310 = ((long) dim$127675) == ((long) 1L);
                    
                    //#line 108 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    if (t$128310) {
                        
                        //#line 109 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        final long t$128311 = this$127679.delta1;
                        
                        //#line 109 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        regionDelta$128303 = t$128311;
                    } else {
                        
                        //#line 110 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        final boolean t$128312 = ((long) dim$127675) == ((long) 2L);
                        
                        //#line 110 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        if (t$128312) {
                            
                            //#line 111 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            final long t$128313 = this$127679.delta2;
                            
                            //#line 111 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            regionDelta$128303 = t$128313;
                        } else {
                            
                            //#line 112 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            final boolean t$128314 = ((long) dim$127675) == ((long) 3L);
                            
                            //#line 112 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            if (t$128314) {
                                
                                //#line 113 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                final long t$128315 = this$127679.delta3;
                                
                                //#line 113 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                regionDelta$128303 = t$128315;
                            } else {
                                
                                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                final boolean t$128316 = true;
                                
                                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                if (t$128316) {
                                    
                                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                    final java.lang.UnsupportedOperationException t$128317 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
                                    
                                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                    throw t$128317;
                                }
                            }
                        }
                    }
                }
            } else {
                
                //#line 118 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final x10.core.Rail t$128318 = ((x10.core.Rail)(this$127679.delta));
                
                //#line 118 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128319 = ((long[])t$128318.value)[(int)dim$127675];
                
                //#line 118 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionDelta$128303 = t$128319;
            }
            
            //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            long actualIndex$128320 = index$127674;
            
            //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            while (true) {
                
                //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128321 = actualIndex$128320;
                
                //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128322 = regionMin$128286;
                
                //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final boolean t$128323 = ((t$128321) < (((long)(t$128322))));
                
                //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                if (!(t$128323)) {
                    
                    //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    break;
                }
                
                //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128280 = actualIndex$128320;
                
                //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128281 = regionDelta$128303;
                
                //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128282 = ((t$128280) + (((long)(t$128281))));
                
                //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                actualIndex$128320 = t$128282;
            }
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            while (true) {
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128324 = actualIndex$128320;
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128325 = regionMin$128286;
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128326 = regionDelta$128303;
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128327 = ((t$128325) + (((long)(t$128326))));
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final boolean t$128328 = ((t$128324) >= (((long)(t$128327))));
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                if (!(t$128328)) {
                    
                    //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    break;
                }
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128283 = actualIndex$128320;
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128284 = regionDelta$128303;
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128285 = ((t$128283) - (((long)(t$128284))));
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                actualIndex$128320 = t$128285;
            }
            
            //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128329 = actualIndex$128320;
            
            //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            ret$127680 = t$128329;
            
            //#line 87 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$127874 = ret$127680;
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            return t$127874;
        }
        
        public x10.regionarray.PeriodicDist out$$;
        public x10.lang.Point pt;
        
        public $Closure$219(final x10.regionarray.PeriodicDist out$$, final x10.lang.Point pt) {
             {
                this.out$$ = out$$;
                this.pt = ((x10.lang.Point)(pt));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$220 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$220> $RTT = 
            x10.rtt.StaticFunType.<$Closure$220> make($Closure$220.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PeriodicDist.$Closure$220 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.pt = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.PeriodicDist.$Closure$220 $_obj = new x10.regionarray.PeriodicDist.$Closure$220((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.pt);
            
        }
        
        // constructor just for allocation
        public $Closure$220(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final x10.regionarray.PeriodicDist this$127692 = ((x10.regionarray.PeriodicDist)(this.out$$));
            
            //#line 87 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long index$127687 = this.pt.$apply$O((long)(i));
            
            //#line 87 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long dim$127688 = i;
            
            //#line 87 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            long ret$127693 =  0;
            
            //#line 88 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            long regionMin$128396 = 0L;
            
            //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region t$128397 = ((x10.regionarray.Region)(this$127692.region));
            
            //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final long t$128398 = t$128397.rank;
            
            //#line 89 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128399 = ((long)(((int)(5))));
            
            //#line 89 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128400 = ((t$128398) < (((long)(t$128399))));
            
            //#line 89 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (t$128400) {
                
                //#line 90 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final boolean t$128401 = ((long) dim$127688) == ((long) 0L);
                
                //#line 90 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                if (t$128401) {
                    
                    //#line 91 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$128402 = this$127692.min0;
                    
                    //#line 91 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    regionMin$128396 = t$128402;
                } else {
                    
                    //#line 92 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final boolean t$128403 = ((long) dim$127688) == ((long) 1L);
                    
                    //#line 92 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    if (t$128403) {
                        
                        //#line 93 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        final long t$128404 = this$127692.min1;
                        
                        //#line 93 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        regionMin$128396 = t$128404;
                    } else {
                        
                        //#line 94 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        final boolean t$128405 = ((long) dim$127688) == ((long) 2L);
                        
                        //#line 94 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        if (t$128405) {
                            
                            //#line 95 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            final long t$128406 = this$127692.min2;
                            
                            //#line 95 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            regionMin$128396 = t$128406;
                        } else {
                            
                            //#line 96 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            final boolean t$128407 = ((long) dim$127688) == ((long) 3L);
                            
                            //#line 96 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            if (t$128407) {
                                
                                //#line 97 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                final long t$128408 = this$127692.min3;
                                
                                //#line 97 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                regionMin$128396 = t$128408;
                            } else {
                                
                                //#line 99 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                final boolean t$128409 = true;
                                
                                //#line 99 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                if (t$128409) {
                                    
                                    //#line 99 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                    final java.lang.UnsupportedOperationException t$128410 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
                                    
                                    //#line 99 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                    throw t$128410;
                                }
                            }
                        }
                    }
                }
            } else {
                
                //#line 102 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final x10.core.Rail t$128411 = ((x10.core.Rail)(this$127692.min));
                
                //#line 102 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128412 = ((long[])t$128411.value)[(int)dim$127688];
                
                //#line 102 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionMin$128396 = t$128412;
            }
            
            //#line 104 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            long regionDelta$128413 = 0L;
            
            //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region t$128414 = ((x10.regionarray.Region)(this$127692.region));
            
            //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final long t$128415 = t$128414.rank;
            
            //#line 105 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128416 = ((long)(((int)(5))));
            
            //#line 105 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final boolean t$128417 = ((t$128415) < (((long)(t$128416))));
            
            //#line 105 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (t$128417) {
                
                //#line 106 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final boolean t$128418 = ((long) dim$127688) == ((long) 0L);
                
                //#line 106 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                if (t$128418) {
                    
                    //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final long t$128419 = this$127692.delta0;
                    
                    //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    regionDelta$128413 = t$128419;
                } else {
                    
                    //#line 108 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    final boolean t$128420 = ((long) dim$127688) == ((long) 1L);
                    
                    //#line 108 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    if (t$128420) {
                        
                        //#line 109 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        final long t$128421 = this$127692.delta1;
                        
                        //#line 109 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        regionDelta$128413 = t$128421;
                    } else {
                        
                        //#line 110 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        final boolean t$128422 = ((long) dim$127688) == ((long) 2L);
                        
                        //#line 110 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                        if (t$128422) {
                            
                            //#line 111 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            final long t$128423 = this$127692.delta2;
                            
                            //#line 111 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            regionDelta$128413 = t$128423;
                        } else {
                            
                            //#line 112 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            final boolean t$128424 = ((long) dim$127688) == ((long) 3L);
                            
                            //#line 112 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                            if (t$128424) {
                                
                                //#line 113 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                final long t$128425 = this$127692.delta3;
                                
                                //#line 113 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                regionDelta$128413 = t$128425;
                            } else {
                                
                                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                final boolean t$128426 = true;
                                
                                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                if (t$128426) {
                                    
                                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                    final java.lang.UnsupportedOperationException t$128427 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
                                    
                                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                                    throw t$128427;
                                }
                            }
                        }
                    }
                }
            } else {
                
                //#line 118 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final x10.core.Rail t$128428 = ((x10.core.Rail)(this$127692.delta));
                
                //#line 118 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128429 = ((long[])t$128428.value)[(int)dim$127688];
                
                //#line 118 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionDelta$128413 = t$128429;
            }
            
            //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            long actualIndex$128430 = index$127687;
            
            //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            while (true) {
                
                //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128431 = actualIndex$128430;
                
                //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128432 = regionMin$128396;
                
                //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final boolean t$128433 = ((t$128431) < (((long)(t$128432))));
                
                //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                if (!(t$128433)) {
                    
                    //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    break;
                }
                
                //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128390 = actualIndex$128430;
                
                //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128391 = regionDelta$128413;
                
                //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128392 = ((t$128390) + (((long)(t$128391))));
                
                //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                actualIndex$128430 = t$128392;
            }
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            while (true) {
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128434 = actualIndex$128430;
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128435 = regionMin$128396;
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128436 = regionDelta$128413;
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128437 = ((t$128435) + (((long)(t$128436))));
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final boolean t$128438 = ((t$128434) >= (((long)(t$128437))));
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                if (!(t$128438)) {
                    
                    //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                    break;
                }
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128393 = actualIndex$128430;
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128394 = regionDelta$128413;
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                final long t$128395 = ((t$128393) - (((long)(t$128394))));
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                actualIndex$128430 = t$128395;
            }
            
            //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128439 = actualIndex$128430;
            
            //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            ret$127693 = t$128439;
            
            //#line 87 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            final long t$128093 = ret$127693;
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            return t$128093;
        }
        
        public x10.regionarray.PeriodicDist out$$;
        public x10.lang.Point pt;
        
        public $Closure$220(final x10.regionarray.PeriodicDist out$$, final x10.lang.Point pt) {
             {
                this.out$$ = out$$;
                this.pt = ((x10.lang.Point)(pt));
            }
        }
        
    }
    
}

